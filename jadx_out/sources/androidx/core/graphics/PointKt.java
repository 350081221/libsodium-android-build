package androidx.core.graphics;

import android.graphics.Point;
import android.graphics.PointF;
import com.umeng.analytics.pro.bi;

@kotlin.i0(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\f\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0086\n\u001a\r\u0010\u0000\u001a\u00020\u0003*\u00020\u0004H\u0086\n\u001a\r\u0010\u0005\u001a\u00020\u0001*\u00020\u0002H\u0086\n\u001a\r\u0010\u0005\u001a\u00020\u0003*\u00020\u0004H\u0086\n\u001a\u0015\u0010\u0006\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0003H\u0086\n\u001a\u0015\u0010\u0006\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0003H\u0086\n\u001a\u0015\u0010\b\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0086\n\u001a\u0015\u0010\b\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\n\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0086\n\u001a\u0015\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\n\u001a\u00020\u0003H\u0086\n\u001a\u0015\u0010\u000b\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0086\n\u001a\u0015\u0010\u000b\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\n\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\u000b\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0086\n\u001a\u0015\u0010\u000b\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\n\u001a\u00020\u0003H\u0086\n\u001a\u0015\u0010\f\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0003H\u0086\n\u001a\u0015\u0010\f\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0003H\u0086\n\u001a\r\u0010\r\u001a\u00020\u0002*\u00020\u0004H\u0086\b\u001a\r\u0010\u000e\u001a\u00020\u0004*\u00020\u0002H\u0086\b\u001a\r\u0010\u000f\u001a\u00020\u0002*\u00020\u0002H\u0086\n\u001a\r\u0010\u000f\u001a\u00020\u0004*\u00020\u0004H\u0086\n¨\u0006\u0010"}, d2 = {"component1", "", "Landroid/graphics/Point;", "", "Landroid/graphics/PointF;", "component2", "div", "scalar", "minus", bi.aA, "xy", "plus", "times", "toPoint", "toPointF", "unaryMinus", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PointKt {
    public static final int component1(@p4.l Point point) {
        return point.x;
    }

    public static final int component2(@p4.l Point point) {
        return point.y;
    }

    @p4.l
    public static final Point div(@p4.l Point point, float f5) {
        return new Point(Math.round(point.x / f5), Math.round(point.y / f5));
    }

    @p4.l
    public static final Point minus(@p4.l Point point, @p4.l Point point2) {
        Point point3 = new Point(point.x, point.y);
        point3.offset(-point2.x, -point2.y);
        return point3;
    }

    @p4.l
    public static final Point plus(@p4.l Point point, @p4.l Point point2) {
        Point point3 = new Point(point.x, point.y);
        point3.offset(point2.x, point2.y);
        return point3;
    }

    @p4.l
    public static final Point times(@p4.l Point point, float f5) {
        return new Point(Math.round(point.x * f5), Math.round(point.y * f5));
    }

    @p4.l
    public static final Point toPoint(@p4.l PointF pointF) {
        return new Point((int) pointF.x, (int) pointF.y);
    }

    @p4.l
    public static final PointF toPointF(@p4.l Point point) {
        return new PointF(point);
    }

    @p4.l
    public static final Point unaryMinus(@p4.l Point point) {
        return new Point(-point.x, -point.y);
    }

    public static final float component1(@p4.l PointF pointF) {
        return pointF.x;
    }

    public static final float component2(@p4.l PointF pointF) {
        return pointF.y;
    }

    @p4.l
    public static final PointF div(@p4.l PointF pointF, float f5) {
        return new PointF(pointF.x / f5, pointF.y / f5);
    }

    @p4.l
    public static final PointF times(@p4.l PointF pointF, float f5) {
        return new PointF(pointF.x * f5, pointF.y * f5);
    }

    @p4.l
    public static final PointF unaryMinus(@p4.l PointF pointF) {
        return new PointF(-pointF.x, -pointF.y);
    }

    @p4.l
    public static final PointF minus(@p4.l PointF pointF, @p4.l PointF pointF2) {
        PointF pointF3 = new PointF(pointF.x, pointF.y);
        pointF3.offset(-pointF2.x, -pointF2.y);
        return pointF3;
    }

    @p4.l
    public static final PointF plus(@p4.l PointF pointF, @p4.l PointF pointF2) {
        PointF pointF3 = new PointF(pointF.x, pointF.y);
        pointF3.offset(pointF2.x, pointF2.y);
        return pointF3;
    }

    @p4.l
    public static final Point minus(@p4.l Point point, int i5) {
        Point point2 = new Point(point.x, point.y);
        int i6 = -i5;
        point2.offset(i6, i6);
        return point2;
    }

    @p4.l
    public static final Point plus(@p4.l Point point, int i5) {
        Point point2 = new Point(point.x, point.y);
        point2.offset(i5, i5);
        return point2;
    }

    @p4.l
    public static final PointF minus(@p4.l PointF pointF, float f5) {
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        float f6 = -f5;
        pointF2.offset(f6, f6);
        return pointF2;
    }

    @p4.l
    public static final PointF plus(@p4.l PointF pointF, float f5) {
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        pointF2.offset(f5, f5);
        return pointF2;
    }
}
