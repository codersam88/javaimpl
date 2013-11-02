/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vinnu
 */
public class Arryti {
    int[][] tA=new int[4][4];
    public static void main(String[] args){
        Arryti ar=new Arryti();
        ar.filAr();
        ar.tpose(ar.tA);
        ar.mirr(ar.tA);
        
    }
    void filAr(){
        for(int rt=0;rt<4;rt++){
            for(int ct=0;ct<4;ct++){
                tA[rt][ct]=ct;
            }
        }
        //Display(tA);
    }
    void Display(int[][] Arr){
        for(int trk=0;trk<4;trk++){
         for(int trk1=0;trk1<4;trk1++)   {
             System.out.print(Arr[trk][trk1]+" ");
         }
         System.out.println();
        }
    }
    void tpose(int[][] Arr){
        int[][]cp=cpAr(Arr);
       // System.out.println("displaying temp");
        //Display(tempArr);
        for(int trk=0;trk<4;trk++){
         for(int trk1=0;trk1<4;trk1++)   {
             cp[trk1][trk]=Arr[trk][trk1];
             //Display(Arr);
             //System.out.println("trk "+trk+" trk1 "+trk1);
             //Display(tempArr);
             //System.out.println("temp now");
         }
         
        }
        //System.out.println("displaying tpose");
        Display(cp);
    }
    
    int[][] cpAr(int[][] Arr){
        int[][] cp=new int[4][4];
        for(int rt=0;rt<4;rt++){
            for(int ct=0;ct<4;ct++){
                cp[rt][ct]=Arr[rt][ct];
            }
        }
        return cp;
    }
    
    void mirr(int[][] Arr){
        int[][]cp=cpAr(Arr);
        for(int rt=0;rt<4;rt++){
            for(int ct=0;ct<4;ct++){
                cp[rt][ct]=Arr[rt][3-ct];
            }
        }
        Display(cp);
    }
}
