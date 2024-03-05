package com.algo.geometry;

import com.algo.geometry.constant.GeometryConstant;
import lombok.Getter;
import lombok.ToString;

/**
 * Line equation : ax + by + c = 0;
 *
 * @author oka
 * @date 05/03/2024
 */
@ToString
@Getter
public class Line {
    private final double a;

    /**
     * to simply : let b = 0 or 1 only
     */
    private final double b;
    private final double c;

    public Line(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public boolean equals(Object o){
        if(!(o instanceof Line)){
            return false;
        }
        double diffA = Math.abs(a-((Line) o).a);
        double diffB = Math.abs(b-((Line) o).b);
        double diffC = Math.abs(c-((Line) o).c);

        return diffA < GeometryConstant.EPS && diffB < GeometryConstant.EPS && diffC < GeometryConstant.EPS;
    }
}
