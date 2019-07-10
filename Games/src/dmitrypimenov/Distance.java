package dmitrypimenov;

import java.util.Random;

public class Distance {
    public static void execute() {

        Random mRandom = new Random();
        Point[] mPoints = new Point[3];

        for (int i = 0; i < mPoints.length; ++i) {
            mPoints[i] = new Point();
            mPoints[i].setX(mRandom.nextInt(1000));
            mPoints[i].setY(mRandom.nextInt(1000));
        }

        int minRadius = mPoints[0].getRadiusVector();
        int maxRadius = mPoints[0].getRadiusVector();
        int minIdx = 0, maxIdx = 0;

        for (int i = 0; i < mPoints.length; ++i) {
            int rad = mPoints[i].getRadiusVector();

            if (minRadius > rad) {
                minRadius = rad;
                minIdx = i;
            }

            if (maxRadius < rad) {
                maxRadius = rad;
                maxIdx = i;
            }
        }

        Point mStartPoint = mPoints[minIdx];
        Point mEndPoint = mPoints[maxIdx];
        Point[] mMidPoints = new Point[mPoints.length - 2];
        int midPointIdx = 0;
        for (int i = 0; i < mPoints.length; ++i) {
            if (i == minIdx || i == maxIdx) {
                // skip start and end points of route
                continue;
            }

            mMidPoints[midPointIdx++] = mPoints[i];
        }
        System.out.println("nearest point is [" + minIdx + "] = " + mPoints[minIdx].toString());
        System.out.println("furthest point is [" + maxIdx + "] = " + mPoints[maxIdx].toString());
        for (int i = 0; i < mMidPoints.length; ++i) {
            System.out.println("mMidPoints[" + i + "] = " + mMidPoints[i].toString());
        }

        int minRouteDistance = 10 * mStartPoint.getDistanceTo(mEndPoint);
        // find all possible routes with 2 points between start and end,
        // and get the shortest one
        for (int i = 0; i < mMidPoints.length; ++i) {
            for (int j = 0; j < mMidPoints.length; ++j) {
                if (i == j) {
                    // skip same items
                    continue;
                }

                int minVariant1Distance = mStartPoint.getDistanceTo(mMidPoints[i])
                        + mMidPoints[i].getDistanceTo(mMidPoints[j])
                        + mMidPoints[j].getDistanceTo(mEndPoint);

                int minVariant2Distance = mStartPoint.getDistanceTo(mMidPoints[j])
                        + mMidPoints[j].getDistanceTo(mMidPoints[i])
                        + mMidPoints[i].getDistanceTo(mEndPoint);

                int newMin = (minVariant1Distance < minVariant2Distance)
                        ? minVariant1Distance
                        : minVariant2Distance;

                if (minRouteDistance > newMin) {
                    System.out.println("New min distance is " + newMin + "   was " + minRouteDistance);
                    minRouteDistance = newMin;
                }
            }
        }
    }
}
