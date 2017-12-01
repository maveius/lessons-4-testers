package lesson.one;

import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Calculator {

    public double distnace(Point a, Point b) {
        double distanceX = abs(a.x() - b.x());
        double distanceY = abs(a.y() - b.y());

        double powerX = pow(distanceX,2);
        double powerY = pow(distanceY,2);

        return sqrt( powerX + powerY );
    }
}
