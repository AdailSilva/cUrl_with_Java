/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 *
 * @author adailsilva
 */
public class CUrl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BufferedReader reader;
 
        try {
            URL url = new URL("http://www.google.com/");
 
            reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
 
            for (String line; (line = reader.readLine()) != null; ) {
                System.out.println(line);
            }
 
            reader.close();
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
    
}
