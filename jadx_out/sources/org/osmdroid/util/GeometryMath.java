package org.osmdroid.util;

import android.graphics.Point;
import android.graphics.Rect;

/* loaded from: classes4.dex */
public class GeometryMath {

    @Deprecated
    public static final double DEG2RAD = 0.017453292519943295d;

    @Deprecated
    public static final double RAD2DEG = 57.29577951308232d;

    private static double Max4(double d5, double d6, double d7, double d8) {
        return Math.ceil(Math.max(Math.max(d5, d6), Math.max(d7, d8)));
    }

    private static double Min4(double d5, double d6, double d7, double d8) {
        return Math.floor(Math.min(Math.min(d5, d6), Math.min(d7, d8)));
    }

    public static final Rect getBoundingBoxForRotatatedRectangle(Rect rect, float f5, Rect rect2) {
        return getBoundingBoxForRotatatedRectangle(rect, rect.centerX(), rect.centerY(), f5, rect2);
    }

    public static final Rect getBoundingBoxForRotatatedRectangle(Rect rect, Point point, float f5, Rect rect2) {
        return getBoundingBoxForRotatatedRectangle(rect, point.x, point.y, f5, rect2);
    }

    public static final Rect getBoundingBoxForRotatatedRectangle(Rect rect, int i5, int i6, float f5, Rect rect2) {
        float f6;
        Rect rect3;
        if (rect2 == null) {
            rect3 = new Rect();
            f6 = f5;
        } else {
            f6 = f5;
            rect3 = rect2;
        }
        double d5 = f6 * 0.017453292519943295d;
        double sin = Math.sin(d5);
        double cos = Math.cos(d5);
        int i7 = rect.left;
        double d6 = i7 - i5;
        int i8 = rect.top;
        double d7 = i8 - i6;
        double d8 = i5;
        double d9 = (d8 - (d6 * cos)) + (d7 * sin);
        double d10 = i6;
        double d11 = (d10 - (d6 * sin)) - (d7 * cos);
        int i9 = rect.right;
        double d12 = i9 - i5;
        double d13 = i8 - i6;
        double d14 = (d8 - (d12 * cos)) + (d13 * sin);
        double d15 = (d10 - (d12 * sin)) - (d13 * cos);
        double d16 = i7 - i5;
        int i10 = rect.bottom;
        double d17 = i10 - i6;
        double d18 = (d8 - (d16 * cos)) + (d17 * sin);
        double d19 = (d10 - (d16 * sin)) - (d17 * cos);
        double d20 = i9 - i5;
        double d21 = i10 - i6;
        double d22 = (d8 - (d20 * cos)) + (d21 * sin);
        double d23 = (d10 - (d20 * sin)) - (d21 * cos);
        rect3.left = MyMath.floorToInt(Min4(d9, d14, d18, d22));
        rect3.top = MyMath.floorToInt(Min4(d11, d15, d19, d23));
        rect3.right = MyMath.floorToInt(Max4(d9, d14, d18, d22));
        rect3.bottom = MyMath.floorToInt(Max4(d11, d15, d19, d23));
        return rect3;
    }
}
