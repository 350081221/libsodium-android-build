package androidx.compose.material3;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.Velocity;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004H\u0000\u001aC\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/compose/material3/SheetState;", "sheetState", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Lkotlin/Function1;", "", "Lkotlin/v0;", "name", "velocity", "Lkotlin/r2;", "onFling", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection", "", "skipPartiallyExpanded", "Landroidx/compose/material3/SheetValue;", "confirmValueChange", "initialValue", "skipHiddenState", "rememberSheetState", "(ZLv3/l;Landroidx/compose/material3/SheetValue;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SheetState;", "Landroidx/compose/ui/unit/Dp;", "DragHandleVerticalPadding", "F", "material3_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nSheetDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SheetDefaults.kt\nandroidx/compose/material3/SheetDefaultsKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,503:1\n74#2:504\n1116#3,6:505\n154#4:511\n*S KotlinDebug\n*F\n+ 1 SheetDefaults.kt\nandroidx/compose/material3/SheetDefaultsKt\n*L\n483#1:504\n491#1:505,6\n502#1:511\n*E\n"})
/* loaded from: classes.dex */
public final class SheetDefaultsKt {
    private static final float DragHandleVerticalPadding = Dp.m6044constructorimpl(22);

    @p4.l
    public static final NestedScrollConnection ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(@p4.l final SheetState sheetState, @p4.l final Orientation orientation, @p4.l final v3.l<? super Float, r2> lVar) {
        return new NestedScrollConnection() { // from class: androidx.compose.material3.SheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1
            @u3.h(name = "offsetToFloat")
            private final float offsetToFloat(long j5) {
                return orientation == Orientation.Horizontal ? Offset.m3493getXimpl(j5) : Offset.m3494getYimpl(j5);
            }

            private final long toOffset(float f5) {
                float f6;
                Orientation orientation2 = orientation;
                if (orientation2 == Orientation.Horizontal) {
                    f6 = f5;
                } else {
                    f6 = 0.0f;
                }
                if (orientation2 != Orientation.Vertical) {
                    f5 = 0.0f;
                }
                return OffsetKt.Offset(f6, f5);
            }

            @u3.h(name = "velocityToFloat")
            private final float velocityToFloat(long j5) {
                return orientation == Orientation.Horizontal ? Velocity.m6279getXimpl(j5) : Velocity.m6280getYimpl(j5);
            }

            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            @p4.m
            /* renamed from: onPostFling-RZ2iAVY */
            public Object mo390onPostFlingRZ2iAVY(long j5, long j6, @p4.l kotlin.coroutines.d<? super Velocity> dVar) {
                lVar.invoke(kotlin.coroutines.jvm.internal.b.e(velocityToFloat(j6)));
                return Velocity.m6270boximpl(j6);
            }

            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPostScroll-DzOQY0M */
            public long mo391onPostScrollDzOQY0M(long j5, long j6, int i5) {
                if (NestedScrollSource.m4761equalsimpl0(i5, NestedScrollSource.Companion.m4766getDragWNlRxjI())) {
                    return toOffset(SheetState.this.getAnchoredDraggableState$material3_release().dispatchRawDelta(offsetToFloat(j6)));
                }
                return Offset.Companion.m3509getZeroF1C5BW0();
            }

            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            @p4.m
            /* renamed from: onPreFling-QWom1Mo */
            public Object mo632onPreFlingQWom1Mo(long j5, @p4.l kotlin.coroutines.d<? super Velocity> dVar) {
                float velocityToFloat = velocityToFloat(j5);
                float requireOffset = SheetState.this.requireOffset();
                float minAnchor = SheetState.this.getAnchoredDraggableState$material3_release().getAnchors().minAnchor();
                if (velocityToFloat < 0.0f && requireOffset > minAnchor) {
                    lVar.invoke(kotlin.coroutines.jvm.internal.b.e(velocityToFloat));
                } else {
                    j5 = Velocity.Companion.m6290getZero9UxMQ8M();
                }
                return Velocity.m6270boximpl(j5);
            }

            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPreScroll-OzD1aCk */
            public long mo392onPreScrollOzD1aCk(long j5, int i5) {
                float offsetToFloat = offsetToFloat(j5);
                if (offsetToFloat < 0.0f && NestedScrollSource.m4761equalsimpl0(i5, NestedScrollSource.Companion.m4766getDragWNlRxjI())) {
                    return toOffset(SheetState.this.getAnchoredDraggableState$material3_release().dispatchRawDelta(offsetToFloat));
                }
                return Offset.Companion.m3509getZeroF1C5BW0();
            }
        };
    }

    @p4.l
    @Composable
    @ExperimentalMaterial3Api
    public static final SheetState rememberSheetState(boolean z4, @p4.m v3.l<? super SheetValue, Boolean> lVar, @p4.m SheetValue sheetValue, boolean z5, @p4.m Composer composer, int i5, int i6) {
        boolean z6;
        v3.l<? super SheetValue, Boolean> lVar2;
        SheetValue sheetValue2;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        composer.startReplaceableGroup(1032784200);
        boolean z11 = false;
        if ((i6 & 1) != 0) {
            z6 = false;
        } else {
            z6 = z4;
        }
        if ((i6 & 2) != 0) {
            lVar2 = SheetDefaultsKt$rememberSheetState$1.INSTANCE;
        } else {
            lVar2 = lVar;
        }
        if ((i6 & 4) != 0) {
            sheetValue2 = SheetValue.Hidden;
        } else {
            sheetValue2 = sheetValue;
        }
        if ((i6 & 8) != 0) {
            z7 = false;
        } else {
            z7 = z5;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1032784200, i5, -1, "androidx.compose.material3.rememberSheetState (SheetDefaults.kt:480)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        Object[] objArr = {Boolean.valueOf(z6), lVar2};
        Saver<SheetState, SheetValue> Saver = SheetState.Companion.Saver(z6, lVar2, density);
        composer.startReplaceableGroup(1097108455);
        if ((((i5 & 14) ^ 6) > 4 && composer.changed(z6)) || (i5 & 6) == 4) {
            z8 = true;
        } else {
            z8 = false;
        }
        boolean changed = z8 | composer.changed(density);
        if ((((i5 & 896) ^ 384) > 256 && composer.changed(sheetValue2)) || (i5 & 384) == 256) {
            z9 = true;
        } else {
            z9 = false;
        }
        boolean z12 = changed | z9;
        if ((((i5 & 112) ^ 48) > 32 && composer.changed(lVar2)) || (i5 & 48) == 32) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z13 = z12 | z10;
        if ((((i5 & 7168) ^ 3072) > 2048 && composer.changed(z7)) || (i5 & 3072) == 2048) {
            z11 = true;
        }
        boolean z14 = z13 | z11;
        Object rememberedValue = composer.rememberedValue();
        if (z14 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new SheetDefaultsKt$rememberSheetState$2$1(z6, density, sheetValue2, lVar2, z7);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        SheetState sheetState = (SheetState) RememberSaveableKt.m3351rememberSaveable(objArr, (Saver) Saver, (String) null, (v3.a) rememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return sheetState;
    }
}
