package com.algo.geometry.util;

import com.algo.geometry.Point;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author oka
 * @date 05/03/2024
 */
public class TransformTest {
    @DisplayName("Rotate")
    @ParameterizedTest(name = "({0},{1}) with origin (0,0) rotate {2} degree = ({3},{4})")
    @CsvSource({
            "0, 5,  90, -5,  0",
            "0, 5, 180,  0, -5",
            "0, 5, 270,  5,  0",
            "0, 5, 360,  0,  5"
    })
    void transform(double x, double y, double theta, double newX, double newY){
        Point p = new Point(x,y);
        Point actual = Transform.rotate(p, theta);

        Assertions.assertEquals(new Point(newX, newY), actual);
    }
}
