package dmitrypimenov;

import java.util.Random;

public class Times {
    public static void execute() {

        Random mRandom = new Random();
        TimePoint[] mPoints = new TimePoint[3];

        for (int i = 0; i < mPoints.length; ++i) {
            mPoints[i] = new TimePoint();
            mPoints[i].setT(mRandom.nextInt(24*7));
        }

        int minRadius = mPoints[0].getTime();
        int maxRadius = mPoints[0].getTime();
        int minIdx = 0, maxIdx = 0;

        for (int i = 0; i < mPoints.length; ++i) {
            int rad = mPoints[i].getTime();

            if (minRadius > rad) {
                minRadius = rad;
                minIdx = i;
            }

            if (maxRadius < rad) {
                maxRadius = rad;
                maxIdx = i;
            }
        }

        TimePoint mStartPoint = mPoints[minIdx];
        TimePoint mEndPoint = mPoints[maxIdx];
        TimePoint[] mMidPoints = new TimePoint[mPoints.length - 2];
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
    }
}
