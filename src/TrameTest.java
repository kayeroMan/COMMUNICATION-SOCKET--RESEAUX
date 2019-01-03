import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrameTest {



    Trame trame = new Trame(TYPE.I);
    @Test
    void introBitStuffing1() {

        assertEquals(trame.introBitStuffing("101001001"),"101001001"); ;
        assertEquals(trame.introBitStuffing("101001111111"),"1010011111011");
        assertEquals(trame.introBitStuffing("1010010010010001111001010010100100101000111111111111100100010010010010010010100101010001000000100001"),"101001001001000111100101001010010010100011111011111011100100010010010010010010100101010001000000100001"); ;
        assertNotEquals(trame.introBitStuffing("101001001001000111100101001010011111111110010100111111010010001001001111110000000101111111111110010010010100101010001000000100001"),"101001001001000111100101001010010010100011111011111011100100010010010010010010100101010001000000100001"); ;
        assertNotEquals(trame.introBitStuffing("1010010010010001111001010010100100101000100111111110000000100100100101111110100100101001010111000100110001000000100001"),"101001001001000111100101001010011111011111000101001111101010010001001001111101000000010111110111110110010010010100101010001000000100001"); ;
        assertNotEquals(trame.introBitStuffing("10100100100100011110011111101010001111111100100100100110001000000100001"),"101001001001000111100101001010011111011111000101001111101010010001001001111101000000010111110111110110010010010100101010001000000100001"); ;
        assertNotEquals(trame.introBitStuffing("1010000010010010010010010100101010001000111111001010100101010101000100001"),"101001001001000111100101001010011111011111000101001111101010010001001001111101000000010111110111110110010010010100101010001000000100001"); ;
        assertNotEquals(trame.introBitStuffing("10100100100100011110010100101001001111111110100010010001001001001001001010010100001000000100001"),"0100000100100100100100101001010100010001111101001010100101010101000100001");;
        assertNotEquals(trame.introBitStuffing("101001001001000111100101001010010010100010010101010010101010101010101010101010001001001001001001010010101111111111001000000100001"),"101001001001000111100101001010010011111011110100010010001001001001001001010010100001000000100001");;
        assertNotEquals(trame.introBitStuffing("101001001001000111100101111111100101001001010001001000101001111111111110010101010101010101010100111111110010010010010010100101111111001000000100001"),"001010010010100010010001010011111011111011001010101010101010101010011111011100100100100100101001011111011001000000100001"); ;
        assertNotEquals(trame.introBitStuffing("")," "); ;


    }

    @Test
    void deleteBitStuffing() {
        assertEquals(trame.deleteBitStuffing("101001001"),"101001001"); ;
        assertEquals(trame.deleteBitStuffing("1010011111011"),"101001111111");
        assertEquals(trame.deleteBitStuffing("101001001001000111100101001010010010100011111011111011100100010010010010010010100101010001000000100001"),"1010010010010001111001010010100100101000111111111111100100010010010010010010100101010001000000100001"); ;
        assertNotEquals(trame.deleteBitStuffing("101001001001000111100101001010010010100011111011111011100100010010010010010010100101010001000000100001"),"101001001001000111100101001010011111111110010100111111010010001001001111110000000101111111111110010010010100101010001000000100001"); ;
        assertNotEquals(trame.deleteBitStuffing("101001001001000111100101001010011111011111000101001111101010010001001001111101000000010111110111110110010010010100101010001000000100001"),"1010010010010001111001010010100100101000100111111110000000100100100101111110100100101001010111000100110001000000100001"); ;
        assertNotEquals(trame.deleteBitStuffing("10100100100100011110011111101010001111111100100100100110001000000100001"),"101001001001000111100101001010011111011111000101001111101010010001001001111101000000010111110111110110010010010100101010001000000100001"); ;
        assertNotEquals(trame.deleteBitStuffing("1010000010010010010010010100101010001000111111001010100101010101000100001"),"101001001001000111100101001010011111011111000101001111101010010001001001111101000000010111110111110110010010010100101010001000000100001"); ;
        assertNotEquals(trame.deleteBitStuffing("10100100100100011110010100101001001111111110100010010001001001001001001010010100001000000100001"),"0100000100100100100100101001010100010001111101001010100101010101000100001");;
        assertNotEquals(trame.deleteBitStuffing("101001001001000111100101001010010011111011110100010010001001001001001001010010100001000000100001"),"101001001001000111100101001010010010100010010101010010101010101010101010101010001001001001001001010010101111111111001000000100001");;
        assertNotEquals(trame.deleteBitStuffing("001010010010100010010001010011111011111011001010101010101010101010011111011100100100100100101001011111011001000000100001"),"101001001001000111100101111111100101001001010001001000101001111111111110010101010101010101010100111111110010010010010010100101111111001000000100001"); ;
        assertNotEquals(trame.deleteBitStuffing("")," "); ;


    }
}