package net.bounceme.dur.skype;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SkypeEchoTest {

    public static void main(String args[]) throws IOException {
        String dial = "18008793355";
        String echo = "echo123";
        String s = null;
        Process p = Runtime.getRuntime().exec("skype --callto " + echo);
        BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
        System.out.println("Here is the standard output of the command:\n");
        while ((s = stdInput.readLine()) != null) {
            System.out.println(s);
        }
        System.exit(0);
    }
}
