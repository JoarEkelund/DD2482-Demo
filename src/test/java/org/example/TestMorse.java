package org.example;


import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestMorse {
    @BeforeClass
    public static void start() {
        Morse.init();
    }
    @Test
    public void testWordToMorse() {
        assertEquals("... --- ...", Morse.toMorse("SOS"));
    }

    @Test
    public void testMorsetoWord() {
        assertEquals("sos", Morse.fromMorse("... --- ..."));
    }
}
