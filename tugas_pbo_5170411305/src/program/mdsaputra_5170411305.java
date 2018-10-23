/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package program;

import java.util.Scanner;


public class mdsaputra_5170411305 
{
    public static void main(String[]args)
    {

        int x;
        Scanner s = new Scanner (System.in);

        for (x=1; x<=3;x++)
        {
            System.out.println("1. Input data ");
            System.out.println("2. Tampil data ");
            System.out.println("3. Keluar ");
            System.out.print("Pilihan: "); x = s.nextInt();
        }
        
    }
}
