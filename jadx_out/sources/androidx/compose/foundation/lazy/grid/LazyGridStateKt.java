package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.MeasureResult;
import java.util.List;
import java.util.Map;
import kotlin.collections.a1;
import kotlin.collections.w;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;
import v3.a;

@i0(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a!\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"EmptyLazyGridLayoutInfo", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "rememberLazyGridState", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "initialFirstVisibleItemIndex", "", "initialFirstVisibleItemScrollOffset", "(IILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/lazy/grid/LazyGridState;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazyGridState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridState.kt\nandroidx/compose/foundation/lazy/grid/LazyGridStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,508:1\n1116#2,6:509\n*S KotlinDebug\n*F\n+ 1 LazyGridState.kt\nandroidx/compose/foundation/lazy/grid/LazyGridStateKt\n*L\n69#1:509,6\n*E\n"})
/* loaded from: classes.dex */
public final class LazyGridStateKt {

    @l
    private static final LazyGridMeasureResult EmptyLazyGridLayoutInfo;

    static {
        List E;
        MeasureResult measureResult = new MeasureResult() { // from class: androidx.compose.foundation.lazy.grid.LazyGridStateKt$EmptyLazyGridLayoutInfo$1

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
        EmptyLazyGridLayoutInfo = new LazyGridMeasureResult(null, 0, false, 0.0f, measureResult, false, E, 0, 0, 0, false, Orientation.Vertical, 0, 0);
    }

    @l
    @Composable
    public static final LazyGridState rememberLazyGridState(int i5, int i6, @m Composer composer, int i7, int i8) {
        composer.startReplaceableGroup(29186956);
        if ((i8 & 1) != 0) {
            i5 = 0;
        }
        if ((i8 & 2) != 0) {
            i6 = 0;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(29186956, i7, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridState (LazyGridState.kt:67)");
        }
        Object[] objArr = new Object[0];
        Saver<LazyGridState, ?> saver = LazyGridState.Companion.getSaver();
        composer.startReplaceableGroup(-707393359);
        boolean changed = composer.changed(i5) | composer.changed(i6);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LazyGridStateKt$rememberLazyGridState$1$1(i5, i6);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        LazyGridState lazyGridState = (LazyGridState) RememberSaveableKt.m3351rememberSaveable(objArr, (Saver) saver, (String) null, (a) rememberedValue, composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return lazyGridState;
    }
}
