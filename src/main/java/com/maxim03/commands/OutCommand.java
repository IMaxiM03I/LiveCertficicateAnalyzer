package com.maxim03.commands;

import com.maxim03.CertStreamConnection;
import org.jboss.logging.Logger;
import picocli.CommandLine.Command;

@Command(name = "out", description = "Print all incoming certificates to the terminal.")
public class OutCommand implements Runnable {

    private final Logger LOG = Logger.getLogger(OutCommand.class);

    @Override
    public void run() {
        LOG.info(CertStreamConnection.getLatestMsg());
    }

}
