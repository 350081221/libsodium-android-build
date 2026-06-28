package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.semantics.CollectionInfo;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"rememberLazyGridSemanticState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;", "state", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "reverseScrolling", "", "(Landroidx/compose/foundation/lazy/grid/LazyGridState;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazySemantics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazySemantics.kt\nandroidx/compose/foundation/lazy/grid/LazySemanticsKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,54:1\n50#2:55\n49#2:56\n1116#3,6:57\n*S KotlinDebug\n*F\n+ 1 LazySemantics.kt\nandroidx/compose/foundation/lazy/grid/LazySemanticsKt\n*L\n32#1:55\n32#1:56\n32#1:57,6\n*E\n"})
/* loaded from: classes.dex */
public final class LazySemanticsKt {
    @l
    @Composable
    public static final LazyLayoutSemanticState rememberLazyGridSemanticState(@l final LazyGridState lazyGridState, boolean z4, @m Composer composer, int i5) {
        composer.startReplaceableGroup(-1247008005);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1247008005, i5, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridSemanticState (LazySemantics.kt:31)");
        }
        Boolean valueOf = Boolean.valueOf(z4);
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(valueOf) | composer.changed(lazyGridState);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LazyLayoutSemanticState() { // from class: androidx.compose.foundation.lazy.grid.LazySemanticsKt$rememberLazyGridSemanticState$1$1
                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                @m
                public Object animateScrollBy(float f5, @l d<? super r2> dVar) {
                    Object l5;
                    Object animateScrollBy$default = ScrollExtensionsKt.animateScrollBy$default(LazyGridState.this, f5, null, dVar, 2, null);
                    l5 = kotlin.coroutines.intrinsics.d.l();
                    return animateScrollBy$default == l5 ? animateScrollBy$default : r2.f19517a;
                }

                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                @l
                public CollectionInfo collectionInfo() {
                    return new CollectionInfo(-1, -1);
                }

                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public boolean getCanScrollForward() {
                    return LazyGridState.this.getCanScrollForward();
                }

                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public int getFirstVisibleItemIndex() {
                    return LazyGridState.this.getFirstVisibleItemIndex();
                }

                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public int getFirstVisibleItemScrollOffset() {
                    return LazyGridState.this.getFirstVisibleItemScrollOffset();
                }

                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                @m
                public Object scrollToItem(int i6, @l d<? super r2> dVar) {
                    Object l5;
                    Object scrollToItem$default = LazyGridState.scrollToItem$default(LazyGridState.this, i6, 0, dVar, 2, null);
                    l5 = kotlin.coroutines.intrinsics.d.l();
                    return scrollToItem$default == l5 ? scrollToItem$default : r2.f19517a;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        LazySemanticsKt$rememberLazyGridSemanticState$1$1 lazySemanticsKt$rememberLazyGridSemanticState$1$1 = (LazySemanticsKt$rememberLazyGridSemanticState$1$1) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return lazySemanticsKt$rememberLazyGridSemanticState$1$1;
    }
}
