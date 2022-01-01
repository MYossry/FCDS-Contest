package com.FCDS.Utils;

import java.util.Scanner;

public abstract class Problem {
    public Scanner inputScanner = new Scanner(System.in);
    private double timeLimits;
    public abstract void run();

    public void setscanner(Scanner inputScanner) {
        this.inputScanner = inputScanner;
    }

    public void setTimeLimits(double timeLimits) {
        this.timeLimits = timeLimits;
    }

    public double getTimeLimits() {
        return timeLimits;
    }
}
