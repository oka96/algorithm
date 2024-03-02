package com.algo.geometry;

import com.algo.geometry.constant.GeometryConstant;

/**
 * @author oka
 * @date 03/03/2024
 */
public class Point implements Comparable<Point> {
    private double x;
    private double y;

    Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point p){
        if(Math.abs(x-p.x) > GeometryConstant.EPS){
            return (x < p.x) ? -1 : 1;
        } else if(Math.abs(y-p.y) > GeometryConstant.EPS){
            return (y < p.y) ? -1 : 1;
        } else {
            return 0;
        }
    }
}
