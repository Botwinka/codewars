package pl.codewars.kata6;

import org.junit.Test;
import pl.codewars.kata6.morseCode.MorseCodeDecoder;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class MorseCodeDecoderTest {
    @Test
    public void testExampleFromDescription() {
        assertThat(MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. ."), is("HEY JUDE"));
    }

    @Test
    public void testExampleSOS() {
        assertThat(MorseCodeDecoder.decode("- -.-- - .- -. .. -.-     .-- --.. -.-- .-- .-     ... --- ..."), is("TYTANIK WZYWA SOS"));
    }

    @Test
    public void testExampleSosEmpty() {
        assertThat(MorseCodeDecoder.decode(" - -.-- - .- -. .. -.-     .-- --.. -.-- .-- .-     ... --- ... "), is("TYTANIK WZYWA SOS"));
    }

    @Test
    public void testExampleSosEmptyWords() {
        assertThat(MorseCodeDecoder.decode("    - -.-- - .- -. .. -.-     .-- --.. -.-- .-- .-     ... --- ... "), is("TYTANIK WZYWA SOS"));
    }

    @Test
    public void testBasicMorseDecoding() {
        assertThat(MorseCodeDecoder.decode(".-"), is("A"));
        assertThat(MorseCodeDecoder.decode("."), is("E"));
        assertThat(MorseCodeDecoder.decode(".."), is("I"));
        assertThat(MorseCodeDecoder.decode(". ."), is("EE"));
        assertThat(MorseCodeDecoder.decode(".   ."), is("E E"));
        assertThat(MorseCodeDecoder.decode("...---..."), is("SOS"));
        assertThat(MorseCodeDecoder.decode("... --- ..."), is("SOS"));
        assertThat(MorseCodeDecoder.decode("...   ---   ..."), is("S O S"));
    }

    @Test
    public void testMoreComplexTests() {
        assertThat(MorseCodeDecoder.decode(" . "), is("E"));
        assertThat(MorseCodeDecoder.decode("   .   . "), is("E E"));
        assertThat(MorseCodeDecoder.decode("      ...---... -.-.--   - .... .   --.- ..- .. -.-. -.-   -... .-. --- .-- -.   ..-. --- -..-   .--- ..- -- .--. ...   --- ...- . .-.   - .... .   .-.. .- --.. -.--   -.. --- --. .-.-.-  "), is("SOS! THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG."));
    }
}
