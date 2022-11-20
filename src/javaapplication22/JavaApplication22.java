/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication22;

/**
 *
 * @author ASUS
 */
public class JavaApplication22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //i untuk baris atau row dan j untuk kolom 
        //row digunakan untuk menunjukkan jumlah baris yang ingin dicetak
        int i,j,row=3;
        //loop luar untuk baris
        for(i=0;i<row;i++)
        {
        //lingkaran dalam untuk kolom           
        for(j=0;j<=i;j++)
        {
        // cetak bintang 
            System.out.print("*");
        }
             //melempar kursor ke baris baru setelah mencetak setiap baris 
        System.out.println();
        //pola bintang telah jadi
    }
}
}
         