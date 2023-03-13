package com.example.enigmaapplication;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * This class represents GFA test cases for a CryptoManager object.
 *
 * @author Farnaz Eivazi
 * @version 7/12/2022
 *
 */

class CryptoManagerGFATest {
    CryptoManager cryptoManager;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testStringInBounds() {
        assertTrue(CryptoManager.isStringInBounds("THIS TEST SHOULD SUCCEED"));
    }

    @Test
    public void testEncryptCaesar() {
        assertEquals("IFMMP!XPSME", CryptoManager.caesarEncryption("HELLO WORLD", 1));
    }

    @Test
    public void testDecryptCaesar() {
        assertEquals("HELLO WORLD", CryptoManager.caesarDecryption("IFMMP!XPSME", 1));
    }
}
