/*
 * Political Map Project
 * Name: Saurav Chatterjee
 * Block: 7
 * 
 * Program Purpose:
 * To create a method that can be called when the user wants to see an individual state.
 * Algorithm:
 * 
 * Future/possible improvements:
 * Complete the method that can be called properly. 
 */
package map;
import edu.princeton.cs.introcs.*;
import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * 
 */
@SuppressWarnings("empty-statement")
public class akMap { throws FileNotFoundException {
        File file = new File("C:\\Users\\hcps-chatterjs\\Documents\\FIFA II\\New FOrk\\PurpleAmerica1\\src\\data\\AK.txt");
        Scanner scan = null;
        
        try {
            scan = new Scanner(file);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(map.class.getName()).log(Level.SEVERE, null, ex);
        }
        
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
        int pointNum = 0;
        
        public void akMap(double[] xVal, []pointNum, double[] yVal){
        for(int i = 0; i < regionNum; i++){
            if(scan.hasNextInt() == true){
                pointNum = scan.nextInt();
                xVal = new double[pointNum];
                yVal = new double[pointNum];
                for(int j = 0; j < pointNum; j++){
                   xVal[j] = scan.nextDouble();
                   yVal[j] = scan.nextDouble();
                }
                StdDraw.polygon(xVal, yVal);
            }
            else{
                i = i - 1;
                scan.next();
            }
        }
 }
}
        
       
        
    

