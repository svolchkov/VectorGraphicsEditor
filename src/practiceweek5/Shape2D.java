/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceweek5;

/**
 *
 * @author sergeyv
 */
public class Shape2D implements java.io.Serializable {
    double x;
    double y;
    double width;
    double height;
    float red;
    float blue;
    float green;
    float alpha;
    
    public Shape2D(double x, double y, double w, double h, float R, float G, float B, float A){
        this.x = x;
        this.y = y;
        this.width = w;
        this.height = h;
        this.red = R;
        this.green = G;
        this.blue = B;
        this.alpha = A;
    }
    
    public void rescale(double scaleFactor){
        x *= scaleFactor;
        y *= scaleFactor;
        width *= scaleFactor;
        height *= scaleFactor;
        
    }
    
}
