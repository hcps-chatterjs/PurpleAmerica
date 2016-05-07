/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map;
import edu.princeton.cs.introcs.*;
import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author hcps-chatterjs
 */
public class polygonStates { throws FileNotFoundException{;
        File file = new File("C:\\Users\\hcps-chatterjs\\Documents\\FIFA II\\New FOrk\\PurpleAmerica1\\src\\data\\TX.txt");
        Scanner scan = new Scanner(file);
        StdDraw.setPenColor(Color.red);
        StdDraw.setCanvasSize(1200, 650);
        StdDraw.setPenRadius(0.002);
        StdDraw.setPenColor(Color.green);
        double xMin = scan.nextDouble();
        double yMin = scan.nextDouble();
        double xMax = scan.nextDouble();
        double yMax = scan.nextDouble();
        int regionNum = scan.nextInt();
        StdDraw.setXscale(xMin, xMax);
        StdDraw.setYscale(yMin, yMax);
        double[] xVal;
        double[] yVal;
        double mouseXVal;
        double mouseYVal;
        
        int pointNum = 0;
        
        
        for(int i = 0; i < regionNum; i++){
            if(scan.hasNextInt() == true){
                pointNum = scan.nextInt();
                xVal = new double[pointNum];
                yVal = new double[pointNum];
                for(int j = 0; j < pointNum; j++){
                   xVal[j] = scan.nextDouble();
                   yVal[j] = scan.nextDouble();
                }
                
            }
       
    
   }
        
        if(StdDraw.mousePressed()) {
                System.out.println(StdDraw.mouseX() + " " + StdDraw.mouseY());
                StdDraw.point(StdDraw.mouseX() , StdDraw.mouseY());
                 mouseXVal = StdDraw.mouseX();
                 mouseYVal = StdDraw.mouseY();
                 //System.out.println(mouseXVal + " " + mouseYVal);
  } 
       
}
}

