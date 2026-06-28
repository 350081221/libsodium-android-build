package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import java.util.Map;
import kotlin.collections.a1;
import kotlin.collections.w;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;
import v3.a;

@i0(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\u000b\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"DeltaThresholdForScrollAnimation", "Landroidx/compose/ui/unit/Dp;", "F", "EmptyLazyListMeasureResult", "Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "NumberOfItemsToTeleport", "", "rememberLazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "initialFirstVisibleItemIndex", "initialFirstVisibleItemScrollOffset", "(IILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/lazy/LazyListState;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazyListState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListState.kt\nandroidx/compose/foundation/lazy/LazyListStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,567:1\n1116#2,6:568\n154#3:574\n*S KotlinDebug\n*F\n+ 1 LazyListState.kt\nandroidx/compose/foundation/lazy/LazyListStateKt\n*L\n79#1:568,6\n540#1:574\n*E\n"})
/* loaded from: classes.dex */
public final class LazyListStateKt {
    private static final float DeltaThresholdForScrollAnimation = Dp.m6044constructorimpl(1);

    @l
    private static final LazyListMeasureResult EmptyLazyListMeasureResult;
    private static final int NumberOfItemsToTeleport = 100;

    static {
        List E;
        MeasureResult measureResult = new MeasureResult() { // from class: androidx.compose.foundation.lazy.LazyListStateKt$EmptyLazyListMeasureResult$1

            @l
            private final Map<AlignmentLine, Integer> alignmentLines;
            private final int height;
            private final int width;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                Map<AlignmentLine, Integer> z4;
                z4 = a1.z();
                this.alignmentLines = z4;
            }

            public static /* synthetic */ void getAlignmentLines$annotations() {
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            @l
            public Map<AlignmentLine, Integer> getAlignmentLines() {
                return this.alignmentLines;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getHeight() {
                return this.height;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getWidth() {
                return this.width;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public void placeChildren() {
            }
        };
        E = w.E();
        EmptyLazyListMeasureResult = new LazyListMeasureResult(null, 0, false, 0.0f, measureResult, 0.0f, false, E, 0, 0, 0, false, Orientation.Vertical, 0, 0);
    }

    @l
    @Composable
    public static final LazyListState rememberLazyListState(int i5, int i6, @m Composer composer, int i7, int i8) {
        composer.startReplaceableGroup(1470655220);
        if ((i8 & 1) != 0) {
            i5 = 0;
        }
        if ((i8 & 2) != 0) {
            i6 = 0;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1470655220, i7, -1, "androidx.compose.foundation.lazy.rememberLazyListState (LazyListState.kt:77)");
        }
        Object[] objArr = new Object[0];
        Saver<LazyListState, ?> saver = LazyListState.Companion.getSaver();
        composer.startReplaceableGroup(-1648357620);
        boolean changed = composer.changed(i5) | composer.changed(i6);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LazyListStateKt$rememberLazyListState$1$1(i5, i6);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        LazyListState lazyListState = (LazyListState) RememberSaveableKt.m3351rememberSaveable(objArr, (Saver) saver, (String) null, (a) rememberedValue, composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return lazyListState;
    }
}
