package androidx.compose.foundation;

import android.os.Build;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@i0(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0094\u0001\u0010\u0014\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\u001b\b\u0002\u0010\u0006\u001a\u0015\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001¢\u0006\u0002\b\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00012\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u0010ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a¬\u0001\u0010\u0014\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\u001b\b\u0002\u0010\u0006\u001a\u0015\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001¢\u0006\u0002\b\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00012\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\u00102\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\u00102\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0012\u0010\u001d\u001a\u00020\u00102\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0001\"&\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001f0\u001e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/u;", "sourceCenter", "magnifierCenter", "Landroidx/compose/ui/unit/DpSize;", "Lkotlin/r2;", "onSizeChanged", "", "zoom", "size", "Landroidx/compose/ui/unit/Dp;", "cornerRadius", "elevation", "", "clip", "magnifier-UpNRX3w", "(Landroidx/compose/ui/Modifier;Lv3/l;Lv3/l;Lv3/l;FJFFZ)Landroidx/compose/ui/Modifier;", "magnifier", "useTextDefault", "clippingEnabled", "Landroidx/compose/foundation/PlatformMagnifierFactory;", "platformMagnifierFactory", "magnifier-jPUL71Q", "(Landroidx/compose/ui/Modifier;Lv3/l;Lv3/l;Lv3/l;FZJFFZLandroidx/compose/foundation/PlatformMagnifierFactory;)Landroidx/compose/ui/Modifier;", "", "sdkVersion", "isPlatformMagnifierSupported", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Lkotlin/Function0;", "MagnifierPositionInRoot", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "getMagnifierPositionInRoot", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "foundation_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nMagnifier.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Magnifier.android.kt\nandroidx/compose/foundation/Magnifier_androidKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,467:1\n135#2:468\n146#2:469\n*S KotlinDebug\n*F\n+ 1 Magnifier.android.kt\nandroidx/compose/foundation/Magnifier_androidKt\n*L\n156#1:468\n154#1:469\n*E\n"})
/* loaded from: classes.dex */
public final class Magnifier_androidKt {

    @p4.l
    private static final SemanticsPropertyKey<v3.a<Offset>> MagnifierPositionInRoot = new SemanticsPropertyKey<>("MagnifierPositionInRoot", null, 2, null);

    @p4.l
    public static final SemanticsPropertyKey<v3.a<Offset>> getMagnifierPositionInRoot() {
        return MagnifierPositionInRoot;
    }

    @ChecksSdkIntAtLeast(api = 28)
    public static final boolean isPlatformMagnifierSupported(int i5) {
        return i5 >= 28;
    }

    public static /* synthetic */ boolean isPlatformMagnifierSupported$default(int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i5 = Build.VERSION.SDK_INT;
        }
        return isPlatformMagnifierSupported(i5);
    }

    @p4.l
    /* renamed from: magnifier-UpNRX3w, reason: not valid java name */
    public static final Modifier m268magnifierUpNRX3w(@p4.l Modifier modifier, @p4.l v3.l<? super Density, Offset> lVar, @p4.m v3.l<? super Density, Offset> lVar2, @p4.m v3.l<? super DpSize, r2> lVar3, float f5, long j5, float f6, float f7, boolean z4) {
        return m271magnifierjPUL71Q$default(modifier, lVar, lVar2, lVar3, f5, false, j5, f6, f7, z4, null, 512, null);
    }

    /* renamed from: magnifier-UpNRX3w$default, reason: not valid java name */
    public static /* synthetic */ Modifier m269magnifierUpNRX3w$default(Modifier modifier, v3.l lVar, v3.l lVar2, v3.l lVar3, float f5, long j5, float f6, float f7, boolean z4, int i5, Object obj) {
        v3.l lVar4;
        float f8;
        long j6;
        float f9;
        float f10;
        boolean z5;
        v3.l lVar5 = null;
        if ((i5 & 2) != 0) {
            lVar4 = null;
        } else {
            lVar4 = lVar2;
        }
        if ((i5 & 4) == 0) {
            lVar5 = lVar3;
        }
        if ((i5 & 8) != 0) {
            f8 = Float.NaN;
        } else {
            f8 = f5;
        }
        if ((i5 & 16) != 0) {
            j6 = DpSize.Companion.m6151getUnspecifiedMYxV2XQ();
        } else {
            j6 = j5;
        }
        if ((i5 & 32) != 0) {
            f9 = Dp.Companion.m6064getUnspecifiedD9Ej5fM();
        } else {
            f9 = f6;
        }
        if ((i5 & 64) != 0) {
            f10 = Dp.Companion.m6064getUnspecifiedD9Ej5fM();
        } else {
            f10 = f7;
        }
        if ((i5 & 128) != 0) {
            z5 = true;
        } else {
            z5 = z4;
        }
        return m268magnifierUpNRX3w(modifier, lVar, lVar4, lVar5, f8, j6, f9, f10, z5);
    }

    @p4.l
    /* renamed from: magnifier-jPUL71Q, reason: not valid java name */
    public static final Modifier m270magnifierjPUL71Q(@p4.l Modifier modifier, @p4.l v3.l<? super Density, Offset> lVar, @p4.m v3.l<? super Density, Offset> lVar2, @p4.m v3.l<? super DpSize, r2> lVar3, float f5, boolean z4, long j5, float f6, float f7, boolean z5, @p4.m PlatformMagnifierFactory platformMagnifierFactory) {
        v3.l noInspectorInfo;
        PlatformMagnifierFactory platformMagnifierFactory2;
        if (isPlatformMagnifierSupported$default(0, 1, null)) {
            if (platformMagnifierFactory == null) {
                platformMagnifierFactory2 = PlatformMagnifierFactory.Companion.getForCurrentPlatform();
            } else {
                platformMagnifierFactory2 = platformMagnifierFactory;
            }
            return modifier.then(new MagnifierElement(lVar, lVar2, lVar3, f5, z4, j5, f6, f7, z5, platformMagnifierFactory2, null));
        }
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new Magnifier_androidKt$magnifierjPUL71Q$$inlined$debugInspectorInfo$1(lVar, lVar2, f5, j5, f6, f7, z5);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return InspectableValueKt.inspectableWrapper(modifier, noInspectorInfo, Modifier.Companion);
    }

    /* renamed from: magnifier-jPUL71Q$default, reason: not valid java name */
    public static /* synthetic */ Modifier m271magnifierjPUL71Q$default(Modifier modifier, v3.l lVar, v3.l lVar2, v3.l lVar3, float f5, boolean z4, long j5, float f6, float f7, boolean z5, PlatformMagnifierFactory platformMagnifierFactory, int i5, Object obj) {
        v3.l lVar4;
        v3.l lVar5;
        float f8;
        boolean z6;
        long j6;
        float f9;
        float f10;
        boolean z7;
        PlatformMagnifierFactory platformMagnifierFactory2 = null;
        if ((i5 & 2) != 0) {
            lVar4 = null;
        } else {
            lVar4 = lVar2;
        }
        if ((i5 & 4) != 0) {
            lVar5 = null;
        } else {
            lVar5 = lVar3;
        }
        if ((i5 & 8) != 0) {
            f8 = Float.NaN;
        } else {
            f8 = f5;
        }
        if ((i5 & 16) != 0) {
            z6 = false;
        } else {
            z6 = z4;
        }
        if ((i5 & 32) != 0) {
            j6 = DpSize.Companion.m6151getUnspecifiedMYxV2XQ();
        } else {
            j6 = j5;
        }
        if ((i5 & 64) != 0) {
            f9 = Dp.Companion.m6064getUnspecifiedD9Ej5fM();
        } else {
            f9 = f6;
        }
        if ((i5 & 128) != 0) {
            f10 = Dp.Companion.m6064getUnspecifiedD9Ej5fM();
        } else {
            f10 = f7;
        }
        if ((i5 & 256) != 0) {
            z7 = true;
        } else {
            z7 = z5;
        }
        if ((i5 & 512) == 0) {
            platformMagnifierFactory2 = platformMagnifierFactory;
        }
        return m270magnifierjPUL71Q(modifier, lVar, lVar4, lVar5, f8, z6, j6, f9, f10, z7, platformMagnifierFactory2);
    }
}
