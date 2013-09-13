package com.minisculuschallenge;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class FirstChallengeTest {

    @Test
    public void encodeCharacter_shouldConvert0CharacterToEncodedChar() throws Exception {
        FirstChallenge firstChallenge = new FirstChallenge();
        assertThat(firstChallenge.encodeCharacter('0'), is('6'));

    }

    @Test
    public void encodeCharacter_shouldConvert9CharacterToEncodedChar() throws Exception {
        FirstChallenge firstChallenge = new FirstChallenge();
        assertThat(firstChallenge.encodeCharacter('9'), is('F'));

    }

    @Test
    public void encodeCharacter_shouldConvertSpaceToEncodedChar() throws Exception {
        FirstChallenge firstChallenge = new FirstChallenge();
        assertThat(firstChallenge.encodeCharacter(' '), is('5'));

    }

    @Test
    public void encodeString_shouldDoStuff() throws Exception {
        FirstChallenge firstChallenge = new FirstChallenge();
        assertThat(firstChallenge.encodeString(" "), is("5"));
    }
    @Test
    public void encodeString_shouldDoMoreStuff() throws Exception {
        FirstChallenge firstChallenge = new FirstChallenge();
        assertThat(firstChallenge.encodeString(" 9"), is("5F"));
    }

    @Test
    public void blha() throws Exception {
        FirstChallenge firstChallenge = new FirstChallenge();

        System.out.println(firstChallenge.encodeString("Strong NE Winds!"));
    }
}
