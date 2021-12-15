package com.FCDS.Problems;

public class Challenge extends Problem{
    @Override
    public void run() {
        // write your code
        // to take input use inputScanner Variable which already declared in Problem class
        int n = inputScanner.nextInt();
        int [] freq= new int[16];
        for(int i=0;i<n;i++) {
            int x;
            x=inputScanner.nextInt();
            freq[x]++;
        }
        for(int i=10;i<=15;i++)
        {
            while(freq[i]-->0)
                System.out.print(i+" ");
        }
    }
    public static void main(String[] args)
    {
        Problem problem = new Challenge();
        problem.run();
    }
}
