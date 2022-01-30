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
        this.phraseNotEncrypted = parsePhrase(phrase);
    }

    public ArrayList<Character> parsePhrase(String phrase){
        ArrayList<Character> parsedPhrase = new ArrayList<Character>();
        for(int i=0;i<phrase.length();i++)
        {
            parsedPhrase.add(phrase.charAt(i));
        }
        return parsedPhrase;
    }
}
