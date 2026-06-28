package androidx.compose.ui.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.compose.ui.unit.DpRect;
import androidx.core.view.ViewCompat;
import java.util.Map;
import kotlin.collections.a1;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;

@i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JG\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u00052\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "", "width", "height", "", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "Lkotlin/u;", "placementBlock", "Landroidx/compose/ui/layout/MeasureResult;", "layout", "ui_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nMeasureScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasureScope.kt\nandroidx/compose/ui/layout/MeasureScope\n+ 2 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegateKt\n*L\n1#1,79:1\n120#2,5:80\n*S KotlinDebug\n*F\n+ 1 MeasureScope.kt\nandroidx/compose/ui/layout/MeasureScope\n*L\n50#1:80,5\n*E\n"})
/* loaded from: classes.dex */
public interface MeasureScope extends IntrinsicMeasureScope {

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean isLookingAhead(@l MeasureScope measureScope) {
            return MeasureScope.super.isLookingAhead();
        }

        @l
        @Deprecated
        public static MeasureResult layout(@l MeasureScope measureScope, int i5, int i6, @l Map<AlignmentLine, Integer> map, @l v3.l<? super Placeable.PlacementScope, r2> lVar) {
            return MeasureScope.super.layout(i5, i6, map, lVar);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m5029roundToPxR2X_6o(@l MeasureScope measureScope, long j5) {
            return MeasureScope.super.mo297roundToPxR2X_6o(j5);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m5030roundToPx0680j_4(@l MeasureScope measureScope, float f5) {
            return MeasureScope.super.mo298roundToPx0680j_4(f5);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m5031toDpGaN1DYA(@l MeasureScope measureScope, long j5) {
            return MeasureScope.super.mo299toDpGaN1DYA(j5);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m5032toDpu2uoSUM(@l MeasureScope measureScope, float f5) {
            return MeasureScope.super.mo300toDpu2uoSUM(f5);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m5034toDpSizekrfVVM(@l MeasureScope measureScope, long j5) {
            return MeasureScope.super.mo302toDpSizekrfVVM(j5);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m5035toPxR2X_6o(@l MeasureScope measureScope, long j5) {
            return MeasureScope.super.mo303toPxR2X_6o(j5);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m5036toPx0680j_4(@l MeasureScope measureScope, float f5) {
            return MeasureScope.super.mo304toPx0680j_4(f5);
        }

        @Stable
        @l
        @Deprecated
        public static Rect toRect(@l MeasureScope measureScope, @l DpRect dpRect) {
            return MeasureScope.super.toRect(dpRect);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m5037toSizeXkaWNTQ(@l MeasureScope measureScope, long j5) {
            return MeasureScope.super.mo305toSizeXkaWNTQ(j5);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m5038toSp0xMU5do(@l MeasureScope measureScope, float f5) {
            return MeasureScope.super.mo306toSp0xMU5do(f5);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m5039toSpkPz2Gy4(@l MeasureScope measureScope, float f5) {
            return MeasureScope.super.mo307toSpkPz2Gy4(f5);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m5033toDpu2uoSUM(@l MeasureScope measureScope, int i5) {
            return MeasureScope.super.mo301toDpu2uoSUM(i5);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m5040toSpkPz2Gy4(@l MeasureScope measureScope, int i5) {
            return MeasureScope.super.mo308toSpkPz2Gy4(i5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ MeasureResult layout$default(MeasureScope measureScope, int i5, int i6, Map map, v3.l lVar, int i7, Object obj) {
        if (obj == null) {
            if ((i7 & 4) != 0) {
                map = a1.z();
            }
            return measureScope.layout(i5, i6, map, lVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
    }

    @l
    default MeasureResult layout(final int i5, final int i6, @l final Map<AlignmentLine, Integer> map, @l final v3.l<? super Placeable.PlacementScope, r2> lVar) {
        boolean z4;
        if ((i5 & ViewCompat.MEASURED_STATE_MASK) == 0 && ((-16777216) & i6) == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return new MeasureResult(i5, i6, map, this, lVar) { // from class: androidx.compose.ui.layout.MeasureScope$layout$1
                final /* synthetic */ v3.l<Placeable.PlacementScope, r2> $placementBlock;
                final /* synthetic */ int $width;

                @l
                private final Map<AlignmentLine, Integer> alignmentLines;
                private final int height;
                final /* synthetic */ MeasureScope this$0;
                private final int width;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.$width = i5;
                    this.this$0 = this;
                    this.$placementBlock = lVar;
                    this.width = i5;
                    this.height = i6;
                    this.alignmentLines = map;
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
                    MeasureScope measureScope = this.this$0;
                    if (measureScope instanceof LookaheadCapablePlaceable) {
                        this.$placementBlock.invoke(((LookaheadCapablePlaceable) measureScope).getPlacementScope());
                    } else {
                        this.$placementBlock.invoke(new SimplePlacementScope(this.$width, this.this$0.getLayoutDirection()));
                    }
                }
            };
        }
        throw new IllegalStateException(("Size(" + i5 + " x " + i6 + ") is out of range. Each dimension must be between 0 and 16777215.").toString());
    }
}
