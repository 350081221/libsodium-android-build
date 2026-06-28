package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Size;
import kotlin.i0;

@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\"\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0006\u001a\"\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0006\u001a\"\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"computeFillHeight", "", "srcSize", "Landroidx/compose/ui/geometry/Size;", "dstSize", "computeFillHeight-iLBOSCw", "(JJ)F", "computeFillMaxDimension", "computeFillMaxDimension-iLBOSCw", "computeFillMinDimension", "computeFillMinDimension-iLBOSCw", "computeFillWidth", "computeFillWidth-iLBOSCw", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ContentScaleKt {
    /* renamed from: access$computeFillHeight-iLBOSCw, reason: not valid java name */
    public static final /* synthetic */ float m4990access$computeFillHeightiLBOSCw(long j5, long j6) {
        return m4994computeFillHeightiLBOSCw(j5, j6);
    }

    /* renamed from: access$computeFillMaxDimension-iLBOSCw, reason: not valid java name */
    public static final /* synthetic */ float m4991access$computeFillMaxDimensioniLBOSCw(long j5, long j6) {
        return m4995computeFillMaxDimensioniLBOSCw(j5, j6);
    }

    /* renamed from: access$computeFillMinDimension-iLBOSCw, reason: not valid java name */
    public static final /* synthetic */ float m4992access$computeFillMinDimensioniLBOSCw(long j5, long j6) {
        return m4996computeFillMinDimensioniLBOSCw(j5, j6);
    }

    /* renamed from: access$computeFillWidth-iLBOSCw, reason: not valid java name */
    public static final /* synthetic */ float m4993access$computeFillWidthiLBOSCw(long j5, long j6) {
        return m4997computeFillWidthiLBOSCw(j5, j6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: computeFillHeight-iLBOSCw, reason: not valid java name */
    public static final float m4994computeFillHeightiLBOSCw(long j5, long j6) {
        return Size.m3559getHeightimpl(j6) / Size.m3559getHeightimpl(j5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: computeFillMaxDimension-iLBOSCw, reason: not valid java name */
    public static final float m4995computeFillMaxDimensioniLBOSCw(long j5, long j6) {
        return Math.max(m4997computeFillWidthiLBOSCw(j5, j6), m4994computeFillHeightiLBOSCw(j5, j6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: computeFillMinDimension-iLBOSCw, reason: not valid java name */
    public static final float m4996computeFillMinDimensioniLBOSCw(long j5, long j6) {
        return Math.min(m4997computeFillWidthiLBOSCw(j5, j6), m4994computeFillHeightiLBOSCw(j5, j6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: computeFillWidth-iLBOSCw, reason: not valid java name */
    public static final float m4997computeFillWidthiLBOSCw(long j5, long j6) {
        return Size.m3562getWidthimpl(j6) / Size.m3562getWidthimpl(j5);
    }
}
