package com.minisculuschallenge;

import java.io.IOException;
import java.net.URL;

public class FirstChallenge {

    private URL answerUrl;

    public void getQuestion() throws IOException {
        URL questionUrl = new URL("http://minisculuschallenge.com/start");

        answerUrl = new Questions().getQuestion(questionUrl);
    }

    public void answerQuestion() throws IOException {

        new Questions().answerQuestion(answerUrl, "wrong answer");
    }

}
