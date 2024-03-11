package com.maxim03;

import com.google.gson.Gson;
import io.calidog.certstream.CertStream;


public class CertStreamConnection {

    public static void main(String[] args)
    {
        // string version of the message
        try {
            CertStream.onMessageString(System.out::println);
        } catch (Exception ignored) {}

        // json version of the message
//        try {
//            CertStream.onMessage(msg -> System.out.println(new Gson().toJson(msg)));
//        } catch (Exception ignored) {}
    }

}
