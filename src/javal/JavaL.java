/*
 * this class tells how to take input from terminal
 * using scanner class
 */
package javal;

import java.util.Scanner;

/**
 *
 * @author vinnu
 */
public class JavaL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JavaL j1=new JavaL();
        j1.tInput();
    }
    void tInput(){
        Scanner s1=new Scanner(System.in);
        System.out.println("start giving input");
        int[] Ar=new int[3];
        for(int i=0;i<3;i++){
            Ar[i]=s1.nextInt();
            
        }
        Display(Ar);
    }
    void Display(int[] Arr){
        for(int trk=0;trk<Arr.length;trk++){
         
         System.out.println(Arr[trk]+ " ");
        }
    }
}
