/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceweek5;

import java.util.ArrayList;

/**
 *
 * @author sergeyv
 */


public class VectorGraphics implements java.io.Serializable{
    int height, width;
    ArrayList<Shape2D> ellipses = new ArrayList<Shape2D>();
    
    public VectorGraphics(int h, int w, ArrayList<Shape2D> e){
        this.height = h;
        this.width = w;
        this.ellipses = e;
    }
    
}
