package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int number,i,count = 0;
        System.out.println("20 first primed number:");
        for(number=2;count <= 19;number++){
            boolean check = true;
            for(i=2;i<=Math.sqrt(number);i++){
                if(number%i==0) check = false;
            }
            if(check) {
                count++;
                System.out.print("\t" + number);
            }
        }
    }
}
