package org.osmdroid.util;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public class PointReducer {
    private static void douglasPeuckerReduction(ArrayList<GeoPoint> arrayList, boolean[] zArr, double d5, int i5, int i6) {
        int i7 = i5 + 1;
        if (i6 <= i7) {
            return;
        }
        GeoPoint geoPoint = arrayList.get(i5);
        GeoPoint geoPoint2 = arrayList.get(i6);
        double d6 = 0.0d;
        int i8 = 0;
        while (i7 < i6) {
            double orthogonalDistance = orthogonalDistance(arrayList.get(i7), geoPoint, geoPoint2);
            if (orthogonalDistance > d6) {
                i8 = i7;
                d6 = orthogonalDistance;
            }
            i7++;
        }
        if (d6 > d5) {
            zArr[i8] = true;
            douglasPeuckerReduction(arrayList, zArr, d5, i5, i8);
            douglasPeuckerReduction(arrayList, zArr, d5, i8, i6);
        }
    }

    public static double orthogonalDistance(GeoPoint geoPoint, GeoPoint geoPoint2, GeoPoint geoPoint3) {
        return (Math.abs(((((((geoPoint2.getLatitude() * geoPoint3.getLongitude()) + (geoPoint3.getLatitude() * geoPoint.getLongitude())) + (geoPoint.getLatitude() * geoPoint2.getLongitude())) - (geoPoint3.getLatitude() * geoPoint2.getLongitude())) - (geoPoint.getLatitude() * geoPoint3.getLongitude())) - (geoPoint2.getLatitude() * geoPoint.getLongitude())) / 2.0d) / Math.hypot(geoPoint2.getLatitude() - geoPoint3.getLatitude(), geoPoint2.getLongitude() - geoPoint3.getLongitude())) * 2.0d;
    }

    public static ArrayList<GeoPoint> reduceWithTolerance(ArrayList<GeoPoint> arrayList, double d5) {
        int i5;
        int i6;
        int size = arrayList.size();
        if (d5 > 0.0d && size >= 3) {
            boolean[] zArr = new boolean[size];
            int i7 = 1;
            while (true) {
                i5 = size - 1;
                if (i7 >= i5) {
                    break;
                }
                zArr[i7] = false;
                i7++;
            }
            zArr[i5] = true;
            zArr[0] = true;
            douglasPeuckerReduction(arrayList, zArr, d5, 0, i5);
            ArrayList<GeoPoint> arrayList2 = new ArrayList<>(size);
            for (i6 = 0; i6 < size; i6++) {
                if (zArr[i6]) {
                    arrayList2.add(arrayList.get(i6));
                }
            }
            return arrayList2;
        }
        return arrayList;
    }
}
