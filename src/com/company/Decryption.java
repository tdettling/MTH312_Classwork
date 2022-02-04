package com.company;

import java.util.ArrayList;

public class Decryption {
    int decryptionMultiplier;
    int decryptionAddedNumber;
    final String alphabet = "abcdefghijklmnopqrstuvwxyz";
    ArrayList<Character> encryptedPhrase;


    public Decryption() {
        this.decryptionMultiplier = 5;
        this.decryptionAddedNumber = 3;
        encryptedPhrase = new ArrayList<>();
        String tempPhrase = "pwv hbog pn en b mbdg xjzig rq tazl crfnd bok rszkzynk hruuna";
        for (int i = 0; i < tempPhrase.length(); i++) {
            this.encryptedPhrase.add(tempPhrase.charAt(i));
        }
    }

    public Decryption(int multiplier, int addedNum, String phrase) {
        if(isValidValue(multiplier)) {
            this.decryptionMultiplier = multiplier;
        }else{
            this.decryptionMultiplier = 5;
        }

        if(isValidValue(addedNum)) {
            this.decryptionAddedNumber = addedNum;
        }else{
            this.decryptionAddedNumber = 3;
        }

        if(isValidPhrase(phrase)){
            encryptedPhrase = parsePhrase(phrase);
        }else{
            String tempPhrase = "pwv hbog pn en b mbdg xjzig rq tazl crfnd bok rszkzynk hruuna";
            this.encryptedPhrase = parsePhrase(tempPhrase);
        }
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
        System.out.println("Your phrase to decrypt was not a valid input. It contained the following numbers: ");
        for (Character c : containsNumbers) {
            System.out.print(" " + c);
        }
        return isPhrase;
    }

    public boolean isValidValue(int value){
        boolean isValidValue = true;
        if(value<0||value>25){
            System.out.println(" Your input of " + value + " was not between 0 and 25. Your input has been set to the default value.");
            isValidValue = false;
        }
        return isValidValue;
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
