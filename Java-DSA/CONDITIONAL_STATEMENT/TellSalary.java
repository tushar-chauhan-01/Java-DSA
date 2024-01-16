/*
Problem statement
Write a program to calculate the total salary of a person. 
The user has to enter the basic salary (an integer) and the grade (an uppercase character), 
and depending upon which the total salary is calculated as -

totalSalary = basic + hra + da + allow – pf
where :
hra   = 20% of basic
da    = 50% of basic
allow = 1700 if grade = ‘A’
allow = 1500 if grade = ‘B’
allow = 1300 if grade = ‘C' or any other character
pf    = 11% of basic.
Round off the total salary and then print the integral part only.

int ans = round(yourFinalValue);
*/

import java.util.Scanner;

public class TellSalary {
    public static void main(String[] args) {
        //Write your code here. 
        Scanner sc = new Scanner(System.in);
        int basic = sc.nextInt();
        char grade = sc.next().charAt(0);
        sc.close();

        float hra = (float) 0.2*basic;
        float da = (float) 0.5*basic;
        int allow = 1300;

        if (grade == 'A'){
            allow = 1700;
        }
        else if (grade == 'B'){
            allow = 1500;
        }
        else{
            allow = 1300;
        }

        float pf = (float) 0.11*basic ;

        float total = basic+hra+da+allow-pf ;

        int ans = Math.round(total);
        System.out.println(ans);
    }

}
