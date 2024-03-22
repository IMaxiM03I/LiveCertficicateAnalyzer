package com.maxim03.commands;

import com.maxim03.CertStreamConnection;

import picocli.CommandLine.Command;

@Command(name = "start", description = "Establish connection to CaliDog's CertStream server")
public class StartCommand implements Runnable {

    @Override
    public void run() {
        CertStreamConnection.connect();
    }

}
