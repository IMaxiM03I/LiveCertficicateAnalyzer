package com.maxim03;

import io.calidog.certstream.CertStream;

import java.util.ArrayList;


public class CertStreamConnection {


    private final ArrayList<String> stringCertificates;

    public CertStreamConnection() {
        stringCertificates = new ArrayList<>();
    }

    public static void main(String[] args)
    {

        CertStreamConnection cert = new CertStreamConnection();

        // string version of the message
        try {
            CertStream.onMessageString(cert.stringCertificates::add);
        } catch (Exception ignored) {}
    }

}
