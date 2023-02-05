package lang.print.gaps.task4;

import java.util.Scanner;

public class FormulaCreator {
    public static void main(String[] args) {
        Scanner kiritish= new Scanner(System.in);
        int a,b;
        double c;
        a= kiritish.nextInt();
        b= kiritish.nextInt();
        c=(9*a*a-5*b+2+a-7)*((a+b-4*a*b)/2);
        System.out.println(c);
    }
}
