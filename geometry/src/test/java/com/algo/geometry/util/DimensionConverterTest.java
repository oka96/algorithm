package com.algo.geometry.util;

import com.algo.geometry.Line;
import com.algo.geometry.Point;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author oka
 * @date 05/03/2024
 */
public class DimensionConverterTest {
    @DisplayName("Point to Line")
    @ParameterizedTest(name="({0},{1}) to ({2},{3}), {4}x + {5}y + {6} = 0")
    @CsvSource({
            "5, 0, 5, 1,  1, 0, -5",
            "0, 5, 1, 5,  0, 1, -5",
            "1, 1, 2, 2, -1, 1,  0"
    })

    void pointToLine(double x1, double y1, double x2, double y2, double a, double b, double c){
        Point p1 = new Point(x1,y1);
        Point p2 = new Point(x2,y2);
        Line actual = DimensionConverter.pointsToLine(p1,p2);
        Line expected = new Line(a,b,c);
        Assertions.assertEquals(expected, actual);
    }
}
