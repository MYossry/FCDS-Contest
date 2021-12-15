package com.FCDS.Problems;

import java.util.Scanner;

public abstract class Problem {
    public Scanner inputScanner = new Scanner(System.in);
    public abstract void run();

    public void setscanner(Scanner inputScanner) {
        this.inputScanner = inputScanner;
    }
}
