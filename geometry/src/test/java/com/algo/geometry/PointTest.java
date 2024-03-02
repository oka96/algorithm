package com.algo.geometry;

import com.algo.geometry.constant.GeometryConstant;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.text.MessageFormat;

/**
 * @author oka
 * @date 03/03/2024
 */
public class PointTest {

    @DisplayName("Euclidean distance")
    @ParameterizedTest(name = "({0},{1}) to ({2},{3}) = {4}")
    @CsvSource({
            "3, 0,  0, 4,  5",
            "0, 5, 12, 0, 13"
    })
    void distance(double x1, double y1, double x2, double y2, double expected) {
        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);

        double actual = Point.distance(p1, p2);

        double diff = Math.abs(actual-expected);
        String errorMsg = MessageFormat.format("({0},{1}) to ({2},{3}) should equal {4}", x1, y1, x2, y2, expected);
        Assertions.assertTrue(diff < GeometryConstant.EPS, errorMsg);
    }
}
