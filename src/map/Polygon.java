
package map;
import edu.princeton.cs.introcs.*;
import java.awt.Color;
import java.awt.Polygon;
import java.awt.geom.Rectangle2D;
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
   public Polygon2D(Rectangle2D rec) {
        if (rec == null) {
            throw new IndexOutOfBoundsException("null Rectangle");
        }
    int npoints = 4;
    float[] xpoints = new float[4];
    float[] ypoints = new float[4];
        xpoints[0] = (float)rec.getMinX();
        ypoints[0] = (float)rec.getMinY();
        xpoints[1] = (float)rec.getMaxX();
        ypoints[1] = (float)rec.getMinY();
        xpoints[2] = (float)rec.getMaxX();
        ypoints[2] = (float)rec.getMaxY();
        xpoints[3] = (float)rec.getMinX();
        ypoints[3] = (float)rec.getMaxY();
        
    }
    public Polyline2D getPolyline2D() {

        Polyline2D pol = new Polyline2D( xpoints, ypoints, npoints );

        pol.addPoint( xpoints[0], ypoints[0]);

        return pol;
    }
     public Polygon getPolygon() {
    int npoints;
        int[] _xpoints = new int[npoints];
        int[] _ypoints = new int[npoints];
        for (int i = 0; i < npoints; i++) {
            _xpoints[i] = (int)xpoints[i];    
            _ypoints[i] = (int)ypoints[i];
        }

        return new Polygon(_xpoints, _ypoints, npoints);
    }
}
 }
}

