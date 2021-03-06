package com.company.designpatternsexamples.structural.proxy.example1;

import java.io.IOException;

/**
 * @author eugenia
 */
class CommandExecutorImpl implements CommandExecutor {

    public void runCommand(String cmd) throws IOException {
        //some heavy implementation
        Runtime.getRuntime().exec(cmd);
        System.out.println("'" + cmd + "' command executed.");
    }
}
