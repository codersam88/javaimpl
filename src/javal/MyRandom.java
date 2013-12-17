/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javal;

import java.util.Random;

/**
 *
 * @author umaram
 */
public class MyRandom {
    public static void main(String args[]){
        MyRandom mm=new MyRandom();
        mm.justDoIt(8, 12);
    }
    
    int justDoIt(int min,int max){
        Random rad=new Random();
        int random=rad.nextInt(max-min+1)+min;
        System.out.println("the num generated is "+random);
        return random;
    }
}
