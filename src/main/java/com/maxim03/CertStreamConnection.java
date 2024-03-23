package com.maxim03;

import io.calidog.certstream.CertStream;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class CertStreamConnection {


    private static final ArrayList<String> stringCertificates = new ArrayList<>();

    private CertStreamConnection() {

    }

    public static void connect() {

        // string version of the message
        try {
            CertStream.onMessageString(CertStreamConnection.stringCertificates::add);
        } catch (Exception ignored) {}
    }

    public static String getLatestMsg() {
        return getLatestMsg(true);
    }

    public static String getLatestMsg(boolean removeFromStack) {
        try {
            if (removeFromStack) return CertStreamConnection.stringCertificates.removeLast();
            else return CertStreamConnection.stringCertificates.getLast();
        } catch (NoSuchElementException e) {
            return "";
        }
    }

}
