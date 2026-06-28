package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.a;

@i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0017\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0082\b\u001a\u0014\u0010\t\u001a\u00020\b*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u001a4\u0010\u000e\u001a\u00020\u0003*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0080@¢\u0006\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012\"\u0014\u0010\u0014\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012\"\u0014\u0010\u0015\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lkotlin/Function0;", "", "generateMsg", "Lkotlin/r2;", "debugLog", "Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;", "", "index", "", "isItemVisible", "scrollOffset", "numOfItemsForTeleport", "Landroidx/compose/ui/unit/Density;", "density", "animateScrollToItem", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;IIILandroidx/compose/ui/unit/Density;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/ui/unit/Dp;", "TargetDistance", "F", "BoundDistance", "MinimumDistance", "DEBUG", "Z", "foundation_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nLazyAnimateScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,317:1\n154#2:318\n154#2:319\n154#2:320\n*S KotlinDebug\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt\n*L\n35#1:318\n36#1:319\n37#1:320\n*E\n"})
/* loaded from: classes.dex */
public final class LazyAnimateScrollKt {
    private static final boolean DEBUG = false;
    private static final float TargetDistance = Dp.m6044constructorimpl(2500);
    private static final float BoundDistance = Dp.m6044constructorimpl(TTAdConstant.STYLE_SIZE_RADIO_3_2);
    private static final float MinimumDistance = Dp.m6044constructorimpl(50);

    @m
    public static final Object animateScrollToItem(@l LazyLayoutAnimateScrollScope lazyLayoutAnimateScrollScope, int i5, int i6, int i7, @l Density density, @l d<? super r2> dVar) {
        Object l5;
        Object scroll = lazyLayoutAnimateScrollScope.scroll(new LazyAnimateScrollKt$animateScrollToItem$2(i5, density, lazyLayoutAnimateScrollScope, i6, i7, null), dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return scroll == l5 ? scroll : r2.f19517a;
    }

    private static final void debugLog(a<String> aVar) {
    }

    public static final boolean isItemVisible(@l LazyLayoutAnimateScrollScope lazyLayoutAnimateScrollScope, int i5) {
        return i5 <= lazyLayoutAnimateScrollScope.getLastVisibleItemIndex() && lazyLayoutAnimateScrollScope.getFirstVisibleItemIndex() <= i5;
    }
}
