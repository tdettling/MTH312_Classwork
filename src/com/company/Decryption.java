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
            encryptedPhrase.add(tempPhrase.charAt(i));
        }
    }

    public Decryption(int multiplier, int addedNum, String phrase) {
        this.decryptionMultiplier = multiplier;
        this.decryptionAddedNumber = addedNum;
    }

    public boolean isValidPhrase(String phrase) {
        boolean isPhrase = true;

        return isPhrase;
    }


    /*public boolean isValidPangram(String phrase) {
        boolean isPangram = true;
        ArrayList<Character> doesNotContainLetters = new ArrayList<Character>();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            // Check if the string does not
            // contain all the letters
            if (!phrase.contains(String.valueOf(ch))) {
                isPangram = false;
                doesNotContainLetters.add(ch);
            }
        }


        System.out.println("Your phrase was not a valid input. it did not have the following letters: ");
        //loop through list to print off missing characters
        for (Character c : doesNotContainLetters) {
            System.out.print(" " + c);
        }
        return isPangram;
    }
*/

}
