package org.demo.example;

import io.pivotal.tomcat.launch.TomcatLauncher;
import org.apache.catalina.LifecycleException;

import java.io.IOException;

public class RunTom {


    public static void main(String[] args) throws IOException, LifecycleException {
            RunTom runTom = new RunTom();
            runTom.run();
    }


    public void run() throws IOException, LifecycleException {
        TomcatLauncher.configure()
                .apply()
                .launch();
    }
}
