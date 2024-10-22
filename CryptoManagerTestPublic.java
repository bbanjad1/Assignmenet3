package application;

/*
 * Class: CMSC203 
 * Instructor:
 * Description: (Give a brief description for each Class)
 * Due: 
 * Platform/compiler:
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Bishal Banjade
*/



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * This is a JUnit test class for CryptoManager methods.
 * It tests the functionality of encryption and decryption for both Caesar and Bellaso ciphers.
 */
public class CryptoManagerTestPublic {

    private String plainTextCaesar;
    private String plainTextBellaso;
    private int caesarKey;
    private String bellasoKey;
    
    @BeforeEach
    public void setUp() throws Exception {
        // Initialize test variables
        plainTextCaesar = "HELLO WORLD";
        plainTextBellaso = "CRYPTOGRAPHY";
        caesarKey = 3;
        bellasoKey = "KEY";
    }

    @Test
    public void testCaesarEncryption() {
        // Test Caesar Cipher encryption
        String encryptedText = CryptoManager.caesarEncryption(plainTextCaesar, caesarKey);
        assertEquals("KHOOR#ZRUOG", encryptedText, "Caesar encryption failed.");
    }

    @Test
    public void testCaesarDecryption() {
        // Test Caesar Cipher decryption
        String encryptedText = CryptoManager.caesarEncryption(plainTextCaesar, caesarKey);
        String decryptedText = CryptoManager.caesarDecryption(encryptedText, caesarKey);
        assertEquals(plainTextCaesar, decryptedText, "Caesar decryption failed.");
    }

    @Test
    public void testBellasoEncryption() {
        // Test Bellaso Cipher encryption
        String encryptedText = CryptoManager.bellasoEncryption(plainTextBellaso, bellasoKey);
        assertNotNull(encryptedText, "Bellaso encryption failed.");
        // Test with expected value if you know the output
        // assertEquals("EXPECTED_OUTPUT", encryptedText);
    }

    @Test
    public void testBellasoDecryption() {
        // Test Bellaso Cipher decryption
        String encryptedText = CryptoManager.bellasoEncryption(plainTextBellaso, bellasoKey);
        String decryptedText = CryptoManager.bellasoDecryption(encryptedText, bellasoKey);
        assertEquals(plainTextBellaso, decryptedText, "Bellaso decryption failed.");
    }

    @Test
    public void testIsStringInBoundsTrue() {
        // Test with a string within bounds
        assertTrue(CryptoManager.isStringInBounds("HELLO"), "String should be in bounds.");
    }

    @Test
    public void testIsStringInBoundsFalse() {
        // Test with a string out of bounds
        assertFalse(CryptoManager.isStringInBounds("hello"), "Lowercase characters should be out of bounds.");
    }
}
