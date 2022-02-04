package com.company;

import java.util.ArrayList;

public class Encryption {
    int encryptionMultiplier, encryptionRemainder;
    final String alphabet = "abcdefghijklmnopqrstuvwxyz";
    ArrayList<Character> phraseNotEncrypted;


    /*
    Creates an Encryption,
    key = 3, remainder = 2
    Parses string into ArrayList
     */
    public Encryption() {
        this.encryptionMultiplier = 3;
        this.encryptionRemainder = 2;
        phraseNotEncrypted = new ArrayList<Character>();
        this.phraseNotEncrypted = parsePhrase("why cant we be a vast quilt of grim jokes and oxidized copper");

    }

    public Encryption(int key, int remainder,String phrase){
        int gcf = GCF(key, remainder);
        if(gcf != 1){
            System.out.println("Your Cipher inputs were invalid, because the GCF is "+gcf);
            System.out.println("Your multiplier will be 5 and remainder will be 3.");
            this.encryptionMultiplier = 3;
            this.encryptionRemainder = 2;
        }else {
            this.encryptionMultiplier = key;
            this.encryptionRemainder = remainder;
        }
        phraseNotEncrypted = new ArrayList<Character>();
        //checking for a valid phrase, NOT VALID if:
            // there are numbers
            // there are symbols and things that are not letters
        if(isValidPhrase(phrase)) {
            this.phraseNotEncrypted = parsePhrase(phrase);
        }else{
            System.out.println("Your input was invalid. Phrase is: ");
            System.out.println("why cant we be a vast quilt of grim jokes and oxidized copper");
            this.phraseNotEncrypted = parsePhrase("why cant we be a vast quilt of grim jokes and oxidized copper");
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
        System.out.println("Your phrase to encrypt was not a valid input. It contained the following numbers: ");
        for (Character c : containsNumbers) {
            System.out.print(" " + c);
        }
        return isPhrase;
    }

    public ArrayList<Character> parsePhrase(String phrase) {
        //maybe add logic to allow users to use punctuation, and then remove it here???
        ArrayList<Character> parsedPhrase = new ArrayList<Character>();
        String phraseTemp = phrase.toLowerCase();
        phrase = phraseTemp.replaceAll("\\s", "");


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

    public int GCF(int a, int b){
        //if gcf(26,encryptionMultiplier) > 1, then NOT valid.
        if(a%b == 0){
            return b;
        }
        else{
            int q = (int)(a/b);
            int r = a - (b*q);
            return GCF(b, r);
        }
    }
    public ArrayList<Character> encryptPhrase(ArrayList<Character> notEncrypted){
        ArrayList<Character> encrypted = new ArrayList<Character>();

        for(int i = 0; i< notEncrypted.size(); i++){
            int clearIndex = alphabet.indexOf(phraseNotEncrypted.get(i));
            int encryptedIndex = (encryptionMultiplier*clearIndex+encryptionRemainder)%26;
            encrypted.add(i, alphabet.charAt(encryptedIndex));
        }
        return encrypted;
    }

    public void printEncryptData(){
        System.out.println("Multiplier: "+ encryptionMultiplier);
        System.out.println("Remainder: "+encryptionRemainder);
        System.out.println("Given phrase: ");
        for (Character character : phraseNotEncrypted) {
            System.out.print(" " + character);
        }
    }

    public void printEncryption(){
        ArrayList<Character> encryptedPhrase = new ArrayList<Character>();
        encryptedPhrase = encryptPhrase(phraseNotEncrypted);
        System.out.println("Before encryption: ");
        for( Character a: phraseNotEncrypted){
            System.out.print(" "+ a);
        }

        System.out.println("After encryption: ");
        for( Character c: encryptedPhrase){
            System.out.print(" "+ c);
        }
    }
}
