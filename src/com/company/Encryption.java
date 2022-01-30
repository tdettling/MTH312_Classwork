package com.company;

import java.util.ArrayList;

public class Encryption {
    int encryptionKey, encryptionRemainder;
    final String alphabet = "abcdefghijklmnopqrstuvwxyz";
    ArrayList<Character> phraseNotEncrypted;


    /*
    Creates an Encryption,
    key = 3, remainder = 2
    Parses string into ArrayList
     */
    public Encryption() {
        this.encryptionKey = 3;
        this.encryptionRemainder = 2;
        phraseNotEncrypted = new ArrayList<Character>();
        this.phraseNotEncrypted = parsePhrase("why cant we be a vast quilt of grim jokes and oxidized copper");
    }

    public Encryption(int key, int remainder,String phrase){
        this.encryptionKey = 3;
        this.encryptionRemainder = remainder;
        phraseNotEncrypted = new ArrayList<Character>();
        //checking for a valid phrase, NOT VALID if:
            // there are numbers
            // there are symbols and things that are not letters

        this.phraseNotEncrypted = parsePhrase(phrase);
    }
    public boolean isValidPhrase(String phrase){
        boolean isPhrase = true;
        ArrayList<Character> containsNumbers = new ArrayList<Character>();
        for (int i = 0; i < 11 ; i++ ){
            char iCount = (char)i;
            for (int k = 0; k < phrase.length() ; k++ ){
                if(phrase.charAt(k) == iCount){
                    isPhrase = false;
                    containsNumbers.add(phrase.charAt(k));
                }
            }
        }
        System.out.println("Your phrase was not a valid input. It contained the following numbers: ");
        for (Character c : containsNumbers) {
            System.out.print(" " + c);
        }
        return isPhrase;
    }

    public ArrayList<Character> parsePhrase(String phrase) {
        //maybe add logic to allow users to use punctuation, and then remove it here???
        ArrayList<Character> parsedPhrase = new ArrayList<Character>();
        phrase = phrase.toLowerCase();

        //1. Take phrase and remove all non-letters out of it
        //fixme
        //2. Parse

        // Take each character of the given string and save it as an entry inside a
        // temporary ArrayList, which will contain our parsed pangram phrase for the constructor.
            for (int i = 0; i < phrase.length(); i++) {
                // Adding each character of phrase into ArrayList
                parsedPhrase.add(phrase.charAt(i));
            }
            return parsedPhrase;
    }
}
