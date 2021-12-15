package com.FCDS.Problems;

public class Steps extends Problem{
    @Override
    public void run() {
        // write your code
        // to take input use inputScanner Variable which already declared in Problem class
        int a = inputScanner.nextInt();
        System.out.println(a/2 + a%2);
    }
    public static void main(String[] args)
    {
        Problem problem = new Steps();
        problem.run();
    }
}
