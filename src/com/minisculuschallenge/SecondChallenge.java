package com.minisculuschallenge;

import java.io.IOException;
import java.net.URL;

public class SecondChallenge {

    private URL answerUrl;

    private final char [] lookuptable = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
        'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
        'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
        'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
        '.', ',', '?', '!', '\'', '"', ' '
    };

    public void getQuestion() throws IOException {
        URL questionUrl = new URL("http://minisculuschallenge.com/start");

        answerUrl = new Questions().getQuestion(questionUrl);
    }

    public String encode(String unencode) {
        return "";

    }

    public void answerQuestion() throws IOException {

        String answer = encodeString("The Desert Fox will move 30 tanks to Calais at dawn");
        System.out.println("answer: " + answer + " url:" +answerUrl);
        new Questions().answerQuestion(answerUrl, answer);
    }

    public char encodeCharacter(char c) {
        for (char i = 0; i < lookuptable.length; i++) {
            if (lookuptable[i] == c) {
                return lookuptable[(i+3) % lookuptable.length];
            }
        }
        throw new RuntimeException("Oh noes");
    }

    public String encodeString(String s) {
        int length = s.length();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < length; i++) {
            char newChar = encodeCharacter(s.charAt(i));
            stringBuffer.append(newChar);
        }
        return stringBuffer.toString();
    }
}
