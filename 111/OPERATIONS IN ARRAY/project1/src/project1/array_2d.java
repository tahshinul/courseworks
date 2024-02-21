/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

/**
 *
 * @author rayhan.kabir
 */
public class array_2d {
    public static void main(String[] args) {
        int [][] y=new int[5][4];
        for(int r=0;r<y.length;r++){
        for(int c=0;c<y[r].length;c++) System.out.print(y[r][c]+" ");
            System.out.println();
        }
    }
}
