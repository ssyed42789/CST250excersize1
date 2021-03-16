/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cst250excersize01;

/**
 *
 * @author ssyed
 */
public class CST250excersize01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String myPlainText = "attack";
        String myEncryptedText = encrypt(myPlainText, 50);
        
        System.out.println("Plain Text:" + myPlainText);
        System.out.println("Encrypted Text" + myEncryptedText);
    
}
    public static String encrypt(String plainText, int key) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        
        char currentChar;
        int currentCharPos;
        int encryptedCharPos;
        char encryptedChar = 0;
        String encryptedText = "";
        for(int i = 0; i<plainText.length(); i++) {
            currentChar = plainText.charAt(1);
            currentCharPos = alphabet.indexOf(currentChar);
            encryptedCharPos = (currentCharPos + key) % 26;
            encryptedCharPos = alphabet.charAt(encryptedCharPos);
            
            encryptedText = encryptedText + encryptedChar;
            
        }
        return encryptedText;
        
    }
}
