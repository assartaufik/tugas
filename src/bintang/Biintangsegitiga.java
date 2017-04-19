/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bintang;

/**
 *
 * @author assar taufik
 */
public class Biintangsegitiga {
      public static void main(String[] args) {
        int x=5;
        int j,k,i;
        for (i=1;i<=x;i++){
            for(j=(x -1); j>=i;j--){
                System.out.print(" ");
        }for(k=1; k<=2*i-1; k++){
                System.out.print("*");
           }
        System.out.println("");
        }
      }
}
