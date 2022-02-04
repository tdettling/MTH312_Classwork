package com.company;

public class Main {

    public static void main(String[] args) {
	Encryption testPass = new Encryption();
    testPass.printEncryption();

    Encryption testFail = new Encryption(6, 4, "this should fail");
    testFail.printEncryption();

    Encryption testFail2 = new Encryption(5, 3, "this shou4ld fail");
    testFail2.printEncryption();
    }
}
