package com.FCDS.Problems;

public class Position extends Problem{
    @Override
    public void run() {
        // write your code
        // to take input use inputScanner Variable which already declared in Problem class
        int n = inputScanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++)
            arr[i]= inputScanner.nextInt();

        int ans =0;
        for(int i = 0;i<n;i++)
            ans += arr[i] != i ?1 : 0;
        System.out.println(ans);
    }
    public static void main(String[] args)
    {
        Problem problem = new Position();
        problem.run();
    }
}
