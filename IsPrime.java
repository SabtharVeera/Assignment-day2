package Assignments2;

import java.util.Iterator;

public class IsPrime {
    public static void main(String[] args) {
        int n = 13;
        for (int i = 2; i<=n; i++) {
			if (n%i==0) {
			System.out.println("Not a Prime Number");
			}
			else {
				System.out.println("Prime Number");
			}
        }
    }
        
        
}

