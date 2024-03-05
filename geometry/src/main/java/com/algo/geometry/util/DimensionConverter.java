package com.algo.geometry.util;

import com.algo.geometry.Line;
import com.algo.geometry.Point;
import com.algo.geometry.constant.GeometryConstant;

/**
 * @author oka
 * @date 05/03/2024
 */
public class DimensionConverter {
    public static Line pointsToLine(Point p1, Point p2){
        // vertical line
        if(Math.abs(p1.getX()-p2.getX()) < GeometryConstant.EPS){
            return new Line(1,0, -p1.getX());
        } else {
            double diffX = p1.getX()-p2.getX();
            double diffY = p1.getY()-p2.getY();
            double gradient = diffY / diffX;
            return new Line(-gradient, 1, gradient*p1.getX()-p1.getY());
        }
    }
}
