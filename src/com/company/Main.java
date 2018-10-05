package com.company;

public class Main {

    public static void main(String[] args) {
        int a= 1;
        int b = 13;
        if ((a <= 19 && a >= 13) || (b <= 19 && b >= 13)) {
            System.out.println("teen");
        }

        int c;
        a= 1;
        b= 13;
        c= 2;

        int [] tab = {a,b,c};
        int sum=0;

        for (int i=0; i<3; i++) {
            if (tab[i] == 13) break;
            sum+= tab[i];
        }
        System.out.println("sum= " + sum);

        int [] array = {3,2,14,1,2,3,6};
        int [] tmp = {1,2,3};
        boolean p = false;
        for (int i=0; i< array.length; i++) {
            if (array[i] == 1) {
                int t= i;
                for (int j=0; j<tmp.length; j++) {
                    if (array[t] != tmp[j]) {
                        p = false;
                        break;
                    }else {
                        p = true;
                        t++;
                    }
                }
            }
        }
        if (p) System.out.println("true");

    }
}
