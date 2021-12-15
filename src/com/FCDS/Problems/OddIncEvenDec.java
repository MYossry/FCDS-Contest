package com.FCDS.Problems;

public class OddIncEvenDec extends Problem{
    @Override
    public void run() {
        // write your code
        // to take input use inputScanner Variable which already declared in Problem class
        int n = inputScanner.nextInt();
        for(int i=1,j=(n%2==0)?n:n-1,c=1;c<=n;c++)
        {
            if(c%2==1){
                System.out.print(i);
                i+=2;
            }
            else {
                System.out.print(j);
                j -= 2;
            }
            if(c!=n)
                System.out.print(" ");
        }
    }
    public static void main(String[] args)
    {
        Problem problem = new OddIncEvenDec();
        problem.run();
    }
}
