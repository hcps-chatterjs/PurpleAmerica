/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package map;

import edu.princeton.cs.introcs.StdDraw;
import java.io.File;
import java.io.FileNotFoundException;
import edu.princeton.cs.introcs.*;
import java.util.Scanner;
import java.awt.Graphics;
import java.awt.*;
/**
 *
 * @author hcps-larkinch
 */
public class FillStates {
    
    public FillStates(){
        
    }
    
    public static java.awt.Color colorStates(int[] data) throws FileNotFoundException{
        double data1 = data[0];
        double data2 = data[1];
        double data3 = data[2];
        double total = data1+data2+data3;
       
       
        
        double red = (data1/total);
        double blue = (data2/total);
        double green = (data3/total);
        
        
        java.awt.Color stateColor = new java.awt.Color((float)red, (float)green, (float)blue);
        
        return stateColor;
        
        
        
            
    }
    
    
    
}
