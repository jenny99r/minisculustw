package com.minisculuschallenge;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class Questions {

    public URL getQuestion(URL questionUrl) throws IOException {

        HttpURLConnection con = (HttpURLConnection) questionUrl.openConnection();

        con.setRequestMethod("GET");

        if (con.getResponseCode() == 200) {
            System.out.println(IOUtils.toString(con.getInputStream()));
            return con.getURL();

        }
        throw new RuntimeException("Wrong question URL");
    }

    public void answerQuestion(URL answerUrl, String answer) throws IOException {
        HttpURLConnection con = (HttpURLConnection) answerUrl.openConnection();
        con.setDoOutput(true);
        con.setRequestMethod("PUT");

        OutputStreamWriter out = new OutputStreamWriter(con.getOutputStream());
        out.write("{\"answer\": \"" + answer + "\"}");
        out.close();

        if (con.getResponseCode() != 200) {
            System.out.println("Wrong answer! code: " + con.getResponseCode());
            System.out.println(IOUtils.toString(con.getInputStream()));

        } else {
            System.out.println(IOUtils.toString(con.getInputStream()));
        }
    }
}
