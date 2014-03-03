/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javal;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author sampath
 */
public class JavaByteIO {
    
    
    public static void main(String args[]) throws FileNotFoundException, IOException{
        FileInputStream is = null;
        FileOutputStream os = null;
        try{
            is = new FileInputStream("xanadu.txt");
            os = new FileOutputStream("output.txt");
            int c;
            while((c=is.read())!= -1)
            {
                os.write(c);
            }
        }
        finally{
            if(is != null){
                is.close();
            }
            if(os != null){
                os.close();
            }
        }
    }
    
}
