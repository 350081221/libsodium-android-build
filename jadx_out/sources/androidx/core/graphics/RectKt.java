package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import com.umeng.analytics.pro.bi;
import kotlin.jvm.internal.r1;

@kotlin.i0(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\u0015\u0010\u0000\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\u0087\f\u001a\r\u0010\u0004\u001a\u00020\u0005*\u00020\u0001H\u0086\n\u001a\r\u0010\u0004\u001a\u00020\u0006*\u00020\u0003H\u0086\n\u001a\r\u0010\u0007\u001a\u00020\u0005*\u00020\u0001H\u0086\n\u001a\r\u0010\u0007\u001a\u00020\u0006*\u00020\u0003H\u0086\n\u001a\r\u0010\b\u001a\u00020\u0005*\u00020\u0001H\u0086\n\u001a\r\u0010\b\u001a\u00020\u0006*\u00020\u0003H\u0086\n\u001a\r\u0010\t\u001a\u00020\u0005*\u00020\u0001H\u0086\n\u001a\r\u0010\t\u001a\u00020\u0006*\u00020\u0003H\u0086\n\u001a\u0015\u0010\n\u001a\u00020\u000b*\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0086\n\u001a\u0015\u0010\n\u001a\u00020\u000b*\u00020\u00032\u0006\u0010\f\u001a\u00020\u000eH\u0086\n\u001a\u0015\u0010\u000f\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\rH\u0086\n\u001a\u0015\u0010\u000f\u001a\u00020\u0011*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\u000f\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0005H\u0086\n\u001a\u0015\u0010\u000f\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000eH\u0086\n\u001a\u0015\u0010\u000f\u001a\u00020\u0011*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\n\u001a\u0015\u0010\u000f\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0006H\u0086\n\u001a\u0015\u0010\u0012\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\f\u001a\u0015\u0010\u0012\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\f\u001a\u0015\u0010\u0013\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\rH\u0086\n\u001a\u0015\u0010\u0013\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\u0013\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0005H\u0086\n\u001a\u0015\u0010\u0013\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000eH\u0086\n\u001a\u0015\u0010\u0013\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\n\u001a\u0015\u0010\u0013\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0006H\u0086\n\u001a\u0015\u0010\u0014\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0005H\u0086\n\u001a\u0015\u0010\u0014\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0006H\u0086\n\u001a\u0015\u0010\u0014\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0005H\u0086\n\u001a\r\u0010\u0016\u001a\u00020\u0001*\u00020\u0003H\u0086\b\u001a\r\u0010\u0017\u001a\u00020\u0003*\u00020\u0001H\u0086\b\u001a\r\u0010\u0018\u001a\u00020\u0011*\u00020\u0001H\u0086\b\u001a\r\u0010\u0018\u001a\u00020\u0011*\u00020\u0003H\u0086\b\u001a\u0015\u0010\u0019\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001bH\u0086\b\u001a\u0015\u0010\u001c\u001a\u00020\u0011*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\f\u001a\u0015\u0010\u001c\u001a\u00020\u0011*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\f¨\u0006\u001d"}, d2 = {"and", "Landroid/graphics/Rect;", "r", "Landroid/graphics/RectF;", "component1", "", "", "component2", "component3", "component4", "contains", "", bi.aA, "Landroid/graphics/Point;", "Landroid/graphics/PointF;", "minus", "xy", "Landroid/graphics/Region;", "or", "plus", "times", "factor", "toRect", "toRectF", "toRegion", "transform", "m", "Landroid/graphics/Matrix;", "xor", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nRect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rect.kt\nandroidx/core/graphics/RectKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,365:1\n344#1,3:366\n344#1,3:369\n257#1,6:372\n122#1,3:378\n132#1,3:381\n344#1,3:384\n344#1,3:387\n344#1,3:390\n1#2:393\n*S KotlinDebug\n*F\n+ 1 Rect.kt\nandroidx/core/graphics/RectKt\n*L\n191#1:366,3\n192#1:369,3\n251#1:372,6\n268#1:378,3\n273#1:381,3\n313#1:384,3\n314#1:387,3\n358#1:390,3\n*E\n"})
/* loaded from: classes2.dex */
public final class RectKt {
    @p4.l
    @SuppressLint({"CheckResult"})
    public static final Rect and(@p4.l Rect rect, @p4.l Rect rect2) {
        Rect rect3 = new Rect(rect);
        rect3.intersect(rect2);
        return rect3;
    }

    public static final int component1(@p4.l Rect rect) {
        return rect.left;
    }

    public static final int component2(@p4.l Rect rect) {
        return rect.top;
    }

    public static final int component3(@p4.l Rect rect) {
        return rect.right;
    }

    public static final int component4(@p4.l Rect rect) {
        return rect.bottom;
    }

    public static final boolean contains(@p4.l Rect rect, @p4.l Point point) {
        return rect.contains(point.x, point.y);
    }

    @p4.l
    public static final Region minus(@p4.l Rect rect, @p4.l Rect rect2) {
        Region region = new Region(rect);
        region.op(rect2, Region.Op.DIFFERENCE);
        return region;
    }

    @p4.l
    public static final Rect or(@p4.l Rect rect, @p4.l Rect rect2) {
        Rect rect3 = new Rect(rect);
        rect3.union(rect2);
        return rect3;
    }

    @p4.l
    public static final Rect plus(@p4.l Rect rect, @p4.l Rect rect2) {
        Rect rect3 = new Rect(rect);
        rect3.union(rect2);
        return rect3;
    }

    @p4.l
    public static final Rect times(@p4.l Rect rect, int i5) {
        Rect rect2 = new Rect(rect);
        rect2.top *= i5;
        rect2.left *= i5;
        rect2.right *= i5;
        rect2.bottom *= i5;
        return rect2;
    }

    @p4.l
    public static final Rect toRect(@p4.l RectF rectF) {
        Rect rect = new Rect();
        rectF.roundOut(rect);
        return rect;
    }

    @p4.l
    public static final RectF toRectF(@p4.l Rect rect) {
        return new RectF(rect);
    }

    @p4.l
    public static final Region toRegion(@p4.l Rect rect) {
        return new Region(rect);
    }

    @p4.l
    public static final RectF transform(@p4.l RectF rectF, @p4.l Matrix matrix) {
        matrix.mapRect(rectF);
        return rectF;
    }

    @p4.l
    public static final Region xor(@p4.l Rect rect, @p4.l Rect rect2) {
        Region region = new Region(rect);
        region.op(rect2, Region.Op.XOR);
        return region;
    }

    public static final float component1(@p4.l RectF rectF) {
        return rectF.left;
    }

    public static final float component2(@p4.l RectF rectF) {
        return rectF.top;
    }

    public static final float component3(@p4.l RectF rectF) {
        return rectF.right;
    }

    public static final float component4(@p4.l RectF rectF) {
        return rectF.bottom;
    }

    public static final boolean contains(@p4.l RectF rectF, @p4.l PointF pointF) {
        return rectF.contains(pointF.x, pointF.y);
    }

    @p4.l
    public static final Region toRegion(@p4.l RectF rectF) {
        Rect rect = new Rect();
        rectF.roundOut(rect);
        return new Region(rect);
    }

    @p4.l
    @SuppressLint({"CheckResult"})
    public static final RectF and(@p4.l RectF rectF, @p4.l RectF rectF2) {
        RectF rectF3 = new RectF(rectF);
        rectF3.intersect(rectF2);
        return rectF3;
    }

    @p4.l
    public static final Region minus(@p4.l RectF rectF, @p4.l RectF rectF2) {
        Rect rect = new Rect();
        rectF.roundOut(rect);
        Region region = new Region(rect);
        Rect rect2 = new Rect();
        rectF2.roundOut(rect2);
        region.op(rect2, Region.Op.DIFFERENCE);
        return region;
    }

    @p4.l
    public static final RectF or(@p4.l RectF rectF, @p4.l RectF rectF2) {
        RectF rectF3 = new RectF(rectF);
        rectF3.union(rectF2);
        return rectF3;
    }

    @p4.l
    public static final RectF plus(@p4.l RectF rectF, @p4.l RectF rectF2) {
        RectF rectF3 = new RectF(rectF);
        rectF3.union(rectF2);
        return rectF3;
    }

    @p4.l
    public static final Region xor(@p4.l RectF rectF, @p4.l RectF rectF2) {
        Rect rect = new Rect();
        rectF.roundOut(rect);
        Region region = new Region(rect);
        Rect rect2 = new Rect();
        rectF2.roundOut(rect2);
        region.op(rect2, Region.Op.XOR);
        return region;
    }

    @p4.l
    public static final Rect plus(@p4.l Rect rect, int i5) {
        Rect rect2 = new Rect(rect);
        rect2.offset(i5, i5);
        return rect2;
    }

    @p4.l
    public static final RectF times(@p4.l RectF rectF, float f5) {
        RectF rectF2 = new RectF(rectF);
        rectF2.top *= f5;
        rectF2.left *= f5;
        rectF2.right *= f5;
        rectF2.bottom *= f5;
        return rectF2;
    }

    @p4.l
    public static final RectF plus(@p4.l RectF rectF, float f5) {
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(f5, f5);
        return rectF2;
    }

    @p4.l
    public static final Rect plus(@p4.l Rect rect, @p4.l Point point) {
        Rect rect2 = new Rect(rect);
        rect2.offset(point.x, point.y);
        return rect2;
    }

    @p4.l
    public static final Rect minus(@p4.l Rect rect, int i5) {
        Rect rect2 = new Rect(rect);
        int i6 = -i5;
        rect2.offset(i6, i6);
        return rect2;
    }

    @p4.l
    public static final RectF plus(@p4.l RectF rectF, @p4.l PointF pointF) {
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(pointF.x, pointF.y);
        return rectF2;
    }

    @p4.l
    public static final RectF times(@p4.l RectF rectF, int i5) {
        float f5 = i5;
        RectF rectF2 = new RectF(rectF);
        rectF2.top *= f5;
        rectF2.left *= f5;
        rectF2.right *= f5;
        rectF2.bottom *= f5;
        return rectF2;
    }

    @p4.l
    public static final RectF minus(@p4.l RectF rectF, float f5) {
        RectF rectF2 = new RectF(rectF);
        float f6 = -f5;
        rectF2.offset(f6, f6);
        return rectF2;
    }

    @p4.l
    public static final Rect minus(@p4.l Rect rect, @p4.l Point point) {
        Rect rect2 = new Rect(rect);
        rect2.offset(-point.x, -point.y);
        return rect2;
    }

    @p4.l
    public static final RectF minus(@p4.l RectF rectF, @p4.l PointF pointF) {
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(-pointF.x, -pointF.y);
        return rectF2;
    }
}
