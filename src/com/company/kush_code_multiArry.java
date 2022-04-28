package com.company;

public class kush_code_multiArry {
    public static void main(String[] args) {
        int [][] flates;
        flates = new int [2][3];
        flates[0][0]=101;
        flates[0][1]=102;
        flates[0][2]=103;
        flates[1][0]=201;
        flates[1][1]=202;
        flates[1][2]=203;
//        System.out.println(flates[0].length);

        for(int i=0;i<flates.length;i++){
            for(int j=0;j<flates[1].length;j++){
            System.out.print(flates[i][j]);
            System.out.println(" ");
            }
            System.out.println(" ");
        }
    }
}
