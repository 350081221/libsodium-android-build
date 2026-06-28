package androidx.compose.foundation;

import android.view.View;
import android.widget.Magnifier;
import androidx.annotation.RequiresApi;
import androidx.compose.foundation.PlatformMagnifierFactoryApi28Impl;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Density;
import kotlin.i0;
import kotlin.jvm.internal.r1;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0018B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JR\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl;", "Landroidx/compose/foundation/PlatformMagnifierFactory;", "()V", "canUpdateZoom", "", "getCanUpdateZoom", "()Z", "create", "Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl$PlatformMagnifierImpl;", "view", "Landroid/view/View;", "useTextDefault", "size", "Landroidx/compose/ui/unit/DpSize;", "cornerRadius", "Landroidx/compose/ui/unit/Dp;", "elevation", "clippingEnabled", "density", "Landroidx/compose/ui/unit/Density;", "initialZoom", "", "create-nHHXs2Y", "(Landroid/view/View;ZJFFZLandroidx/compose/ui/unit/Density;F)Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl$PlatformMagnifierImpl;", "PlatformMagnifierImpl", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RequiresApi(29)
@r1({"SMAP\nPlatformMagnifier.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformMagnifier.android.kt\nandroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,202:1\n152#2:203\n*S KotlinDebug\n*F\n+ 1 PlatformMagnifier.android.kt\nandroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl\n*L\n163#1:203\n*E\n"})
/* loaded from: classes.dex */
public final class PlatformMagnifierFactoryApi29Impl implements PlatformMagnifierFactory {
    public static final int $stable = 0;

    @p4.l
    public static final PlatformMagnifierFactoryApi29Impl INSTANCE = new PlatformMagnifierFactoryApi29Impl();
    private static final boolean canUpdateZoom = true;

    @StabilityInferred(parameters = 1)
    @i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl$PlatformMagnifierImpl;", "Landroidx/compose/foundation/PlatformMagnifierFactoryApi28Impl$PlatformMagnifierImpl;", "Landroidx/compose/ui/geometry/Offset;", "sourceCenter", "magnifierCenter", "", "zoom", "Lkotlin/r2;", "update-Wko1d7g", "(JJF)V", "update", "Landroid/widget/Magnifier;", "magnifier", "<init>", "(Landroid/widget/Magnifier;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
    @RequiresApi(29)
    /* loaded from: classes.dex */
    public static final class PlatformMagnifierImpl extends PlatformMagnifierFactoryApi28Impl.PlatformMagnifierImpl {
        public static final int $stable = 0;

        public PlatformMagnifierImpl(@p4.l Magnifier magnifier) {
            super(magnifier);
        }

        @Override // androidx.compose.foundation.PlatformMagnifierFactoryApi28Impl.PlatformMagnifierImpl, androidx.compose.foundation.PlatformMagnifier
        /* renamed from: update-Wko1d7g */
        public void mo292updateWko1d7g(long j5, long j6, float f5) {
            if (!Float.isNaN(f5)) {
                getMagnifier().setZoom(f5);
            }
            if (OffsetKt.m3512isSpecifiedk4lQ0M(j6)) {
                getMagnifier().show(Offset.m3493getXimpl(j5), Offset.m3494getYimpl(j5), Offset.m3493getXimpl(j6), Offset.m3494getYimpl(j6));
            } else {
                getMagnifier().show(Offset.m3493getXimpl(j5), Offset.m3494getYimpl(j5));
            }
        }
    }

    private PlatformMagnifierFactoryApi29Impl() {
    }

    @Override // androidx.compose.foundation.PlatformMagnifierFactory
    public boolean getCanUpdateZoom() {
        return canUpdateZoom;
    }

    @Override // androidx.compose.foundation.PlatformMagnifierFactory
    @p4.l
    /* renamed from: create-nHHXs2Y */
    public PlatformMagnifierImpl mo293createnHHXs2Y(@p4.l View view, boolean z4, long j5, float f5, float f6, boolean z5, @p4.l Density density, float f7) {
        Magnifier build;
        int L0;
        int L02;
        if (z4) {
            return new PlatformMagnifierImpl(new Magnifier(view));
        }
        long mo305toSizeXkaWNTQ = density.mo305toSizeXkaWNTQ(j5);
        float mo304toPx0680j_4 = density.mo304toPx0680j_4(f5);
        float mo304toPx0680j_42 = density.mo304toPx0680j_4(f6);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (mo305toSizeXkaWNTQ != Size.Companion.m3570getUnspecifiedNHjbRc()) {
            L0 = kotlin.math.d.L0(Size.m3562getWidthimpl(mo305toSizeXkaWNTQ));
            L02 = kotlin.math.d.L0(Size.m3559getHeightimpl(mo305toSizeXkaWNTQ));
            builder.setSize(L0, L02);
        }
        if (!Float.isNaN(mo304toPx0680j_4)) {
            builder.setCornerRadius(mo304toPx0680j_4);
        }
        if (!Float.isNaN(mo304toPx0680j_42)) {
            builder.setElevation(mo304toPx0680j_42);
        }
        if (!Float.isNaN(f7)) {
            builder.setInitialZoom(f7);
        }
        builder.setClippingEnabled(z5);
        build = builder.build();
        return new PlatformMagnifierImpl(build);
    }
}
