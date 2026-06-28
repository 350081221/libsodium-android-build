package androidx.core.graphics;

import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.RegionIterator;
import com.umeng.analytics.pro.bi;
import java.util.Iterator;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@kotlin.i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\u001a\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\n\u001a\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\n\u001a\u0015\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\n\u001a\u0015\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\n\u001a\r\u0010\t\u001a\u00020\u0000*\u00020\u0000H\u0086\n\u001a\r\u0010\n\u001a\u00020\u0000*\u00020\u0000H\u0086\n\u001a\u0015\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\f\u001a\u0015\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\f\u001a\u0015\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\f\u001a\u0015\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\f\u001a\u0015\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\f\u001a\u0015\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\f\u001a0\u0010\u0014\u001a\u00020\u0012*\u00020\u00002!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\u000eH\u0086\b\u001a\u0013\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015*\u00020\u0000H\u0086\u0002¨\u0006\u0017"}, d2 = {"Landroid/graphics/Region;", "Landroid/graphics/Point;", bi.aA, "", "contains", "Landroid/graphics/Rect;", "r", "plus", "minus", "unaryMinus", "not", "or", "and", "xor", "Lkotlin/Function1;", "Lkotlin/v0;", "name", "rect", "Lkotlin/r2;", "action", "forEach", "", "iterator", "core-ktx_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nRegion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Region.kt\nandroidx/core/graphics/RegionKt\n*L\n1#1,158:1\n71#1,3:159\n35#1,3:162\n44#1,3:165\n*S KotlinDebug\n*F\n+ 1 Region.kt\nandroidx/core/graphics/RegionKt\n*L\n79#1:159,3\n84#1:162,3\n89#1:165,3\n*E\n"})
/* loaded from: classes2.dex */
public final class RegionKt {
    @p4.l
    public static final Region and(@p4.l Region region, @p4.l Rect rect) {
        Region region2 = new Region(region);
        region2.op(rect, Region.Op.INTERSECT);
        return region2;
    }

    public static final boolean contains(@p4.l Region region, @p4.l Point point) {
        return region.contains(point.x, point.y);
    }

    public static final void forEach(@p4.l Region region, @p4.l v3.l<? super Rect, r2> lVar) {
        RegionIterator regionIterator = new RegionIterator(region);
        while (true) {
            Rect rect = new Rect();
            if (!regionIterator.next(rect)) {
                return;
            } else {
                lVar.invoke(rect);
            }
        }
    }

    @p4.l
    public static final Iterator<Rect> iterator(@p4.l Region region) {
        return new RegionKt$iterator$1(region);
    }

    @p4.l
    public static final Region minus(@p4.l Region region, @p4.l Rect rect) {
        Region region2 = new Region(region);
        region2.op(rect, Region.Op.DIFFERENCE);
        return region2;
    }

    @p4.l
    public static final Region not(@p4.l Region region) {
        Region region2 = new Region(region.getBounds());
        region2.op(region, Region.Op.DIFFERENCE);
        return region2;
    }

    @p4.l
    public static final Region or(@p4.l Region region, @p4.l Rect rect) {
        Region region2 = new Region(region);
        region2.union(rect);
        return region2;
    }

    @p4.l
    public static final Region plus(@p4.l Region region, @p4.l Rect rect) {
        Region region2 = new Region(region);
        region2.union(rect);
        return region2;
    }

    @p4.l
    public static final Region unaryMinus(@p4.l Region region) {
        Region region2 = new Region(region.getBounds());
        region2.op(region, Region.Op.DIFFERENCE);
        return region2;
    }

    @p4.l
    public static final Region xor(@p4.l Region region, @p4.l Rect rect) {
        Region region2 = new Region(region);
        region2.op(rect, Region.Op.XOR);
        return region2;
    }

    @p4.l
    public static final Region and(@p4.l Region region, @p4.l Region region2) {
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.INTERSECT);
        return region3;
    }

    @p4.l
    public static final Region minus(@p4.l Region region, @p4.l Region region2) {
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.DIFFERENCE);
        return region3;
    }

    @p4.l
    public static final Region or(@p4.l Region region, @p4.l Region region2) {
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.UNION);
        return region3;
    }

    @p4.l
    public static final Region plus(@p4.l Region region, @p4.l Region region2) {
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.UNION);
        return region3;
    }

    @p4.l
    public static final Region xor(@p4.l Region region, @p4.l Region region2) {
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.XOR);
        return region3;
    }
}
