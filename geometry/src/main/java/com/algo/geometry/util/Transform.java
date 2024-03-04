package com.algo.geometry.util;

import com.algo.geometry.Point;

/**
 * @author oka
 * @date 05/03/2024
 */
public class Transform {
    /**
     * rotate p around the origin (0,0) by theta degree (anticlockwise)
     */
    public static Point rotate(Point p, double theta){
        double radian = Math.toRadians(theta);

        double x = p.getX()*Math.cos(radian) - p.getY()*Math.sin(radian);
        double y = p.getX()*Math.sin(radian) + p.getY()*Math.cos(radian);

        return new Point(x,y);
    }
}
