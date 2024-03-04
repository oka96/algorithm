package com.algo.geometry;

import com.algo.geometry.constant.GeometryConstant;
import lombok.Getter;
import lombok.ToString;

/**
 * @author oka
 * @date 03/03/2024
 */
@ToString
@Getter
public class Point implements Comparable<Point> {
    private final double x;
    private final double y;

    public Point(double x, double y){
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

    @Override
    public boolean equals(Object o){
        if(!(o instanceof Point)){
            return false;
        }
        double diffX = Math.abs(x-((Point) o).x);
        double diffY = Math.abs(y-((Point) o).y);

        return diffX < GeometryConstant.EPS && diffY < GeometryConstant.EPS;
    }

    public static double distance(Point p1, Point p2){
        double dx = Math.abs(p1.x-p2.x);
        double dy = Math.abs(p1.y-p2.y);
        return Math.sqrt(dx*dx + dy*dy);
    }
}
