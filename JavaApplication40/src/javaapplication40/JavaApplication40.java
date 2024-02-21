/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication40;

/**
 *
 * @author tahshin
 */
import java.io.*;

import java.util.*;

public class JavaApplication40 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            File f1 = new File("C:\\input.txt");
            Scanner sc = new Scanner(f1);
            String s = sc.nextLine();
            int vertices = Integer.parseInt(s);
            ArrayList<ArrayList<Object>> list = new ArrayList<ArrayList<Object>>();
            for (int i = 0; i < vertices; ++i) {
                ArrayList<Object> babylist = new ArrayList<Object>();
                list.add(babylist);
                for (int j = 0; j < vertices; ++j) {
                    list.get(i).add(0);
                }
            }
            while (sc.hasNext()) {
                
                String[] array = new String[2];
                String st = sc.nextLine();
                array = st.split(" ");
                int vertex = Integer.parseInt(array[0]);
                int connect = Integer.parseInt(array[1]);
                list.get(vertex).add(connect, 1);
            }
            
            for (int i = 0; i < vertices; i++) {
                System.out.print(i + " ==> ");
                for (int j = 0; j < vertices; j++) {
                    System.out.print(list.get(i).get(j) + " ");
                }
                System.out.println();
            }
            for ( int i = 0 ; i < vertices ; i++ ) {
                
            }
        } catch (Exception e) {
        }

    }
}
