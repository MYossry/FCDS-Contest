package com.FCDS.Problems;

public class Difference extends Problem{
    @Override
    public void run() {
        // write your code
        // to take input use inputScanner Variable which already declared in Problem class
        // for example int a = inputScanner.nextInt();
        int x = inputScanner.nextInt();
        int y = inputScanner.nextInt();
        System.out.println(Math.abs(x-y));
    }
    public static void main(String[] args)
    {
        Problem problem = new Difference();
        problem.run();
    }
}
