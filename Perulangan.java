/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kelompok8algoritma;

/**
 *
 * @author Iis
 */
public class Perulangan {
    public static void main(String[] args) {
        //Kelompok 8 Soal F
        //Perulangan FOR
         for (int i=5; i>0; i--){
            for (int j=0; j<5; j++){
                System.out.print(i < 2 ? "0": "*");
            }
            System.out.println("0");
        }
        System.out.println("Menggunakan Perulangan FOR");
        
        //Perulangan While
        int i=0;
        int j=0;
        int max=5;
        while(i<max){
           while (j<max) {
               if (j == (max-1)){
                   System.out.println("0");
               } else if(i == (max-1)){
                   System.out.print("0");
               }else {
                   System.out.print("*");
               }
               j++;
           }
           j=0;
           i++;
        }
        System.out.println("");
        System.out.println("Menggunakan Perulangan While");
        
         //Perulangan do While
//         int i=0;
//         int j=0;
//         int max=5;
//         do{
//             do{
//                 if (j == (max-1)|| i == (max-1) ){
//                     System.out.print("0");
//                 } else {
//                     System.out.print("*");
//                 }
//                 j++;
//             }while (j<max);
//             System.out.println("");
//             j=0;
//             i++;
//         }while (i<max);
//        System.out.println("Menggunakan Perulangan do While");
    }
}
