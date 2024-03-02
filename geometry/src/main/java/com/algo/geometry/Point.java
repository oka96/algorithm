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

    public static double distance(Point p1, Point p2){
        double dx = Math.abs(p1.x-p2.x);
        double dy = Math.abs(p1.y-p2.y);
        return Math.sqrt(dx*dx + dy*dy);
    }

}
