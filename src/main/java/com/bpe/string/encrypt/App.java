package com.bpe.string.encrypt;

import org.jasypt.util.text.StrongTextEncryptor;

import static java.lang.System.out;

/**
 * Created by polinchw on 6/18/17.
 */
public class App {

    public final static void main(String args[]) {
        if(args.length != 2) {
            out.println("Usage:  <string to encrypt> <super secret key>");
            return;
        }
        StrongTextEncryptor textEncryptor = new StrongTextEncryptor();
        textEncryptor.setPassword(args[1]);

        String myEncryptedText = textEncryptor.encrypt(args[0]);
        out.println("Encrypted text: "+myEncryptedText);

        String plainText = textEncryptor.decrypt(myEncryptedText);
        out.println("Plain (unencrypted) text: "+plainText);
    }
}
