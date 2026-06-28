package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.IntrinsicsMeasureScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSizeKt;
import com.umeng.analytics.pro.bi;
import kotlin.i0;
import kotlin.r2;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\bÀ\u0002\u0018\u00002\u00020\u0001:\u0005\u0014\u0015\u0016\u0017\u0018B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J-\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\fJ-\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u000fJ-\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0011J-\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0013¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/node/NodeMeasuringIntrinsics;", "", "()V", "maxHeight", "", "measureBlock", "Landroidx/compose/ui/node/NodeMeasuringIntrinsics$MeasureBlock;", "intrinsicMeasureScope", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "intrinsicMeasurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "w", "maxHeight$ui_release", "maxWidth", bi.aJ, "maxWidth$ui_release", "minHeight", "minHeight$ui_release", "minWidth", "minWidth$ui_release", "DefaultIntrinsicMeasurable", "EmptyPlaceable", "IntrinsicMinMax", "IntrinsicWidthHeight", "MeasureBlock", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NodeMeasuringIntrinsics {
    public static final int $stable = 0;

    @l
    public static final NodeMeasuringIntrinsics INSTANCE = new NodeMeasuringIntrinsics();

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0014H\u0016J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0010\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0014H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Landroidx/compose/ui/node/NodeMeasuringIntrinsics$DefaultIntrinsicMeasurable;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "minMax", "Landroidx/compose/ui/node/NodeMeasuringIntrinsics$IntrinsicMinMax;", "widthHeight", "Landroidx/compose/ui/node/NodeMeasuringIntrinsics$IntrinsicWidthHeight;", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;Landroidx/compose/ui/node/NodeMeasuringIntrinsics$IntrinsicMinMax;Landroidx/compose/ui/node/NodeMeasuringIntrinsics$IntrinsicWidthHeight;)V", "getMeasurable", "()Landroidx/compose/ui/layout/IntrinsicMeasurable;", "getMinMax", "()Landroidx/compose/ui/node/NodeMeasuringIntrinsics$IntrinsicMinMax;", "parentData", "", "getParentData", "()Ljava/lang/Object;", "getWidthHeight", "()Landroidx/compose/ui/node/NodeMeasuringIntrinsics$IntrinsicWidthHeight;", "maxIntrinsicHeight", "", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/Placeable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "minIntrinsicHeight", "minIntrinsicWidth", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultIntrinsicMeasurable implements Measurable {

        @l
        private final IntrinsicMeasurable measurable;

        @l
        private final IntrinsicMinMax minMax;

        @l
        private final IntrinsicWidthHeight widthHeight;

        public DefaultIntrinsicMeasurable(@l IntrinsicMeasurable intrinsicMeasurable, @l IntrinsicMinMax intrinsicMinMax, @l IntrinsicWidthHeight intrinsicWidthHeight) {
            this.measurable = intrinsicMeasurable;
            this.minMax = intrinsicMinMax;
            this.widthHeight = intrinsicWidthHeight;
        }

        @l
        public final IntrinsicMeasurable getMeasurable() {
            return this.measurable;
        }

        @l
        public final IntrinsicMinMax getMinMax() {
            return this.minMax;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        @m
        public Object getParentData() {
            return this.measurable.getParentData();
        }

        @l
        public final IntrinsicWidthHeight getWidthHeight() {
            return this.widthHeight;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicHeight(int i5) {
            return this.measurable.maxIntrinsicHeight(i5);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicWidth(int i5) {
            return this.measurable.maxIntrinsicWidth(i5);
        }

        @Override // androidx.compose.ui.layout.Measurable
        @l
        /* renamed from: measure-BRTryo0 */
        public Placeable mo4998measureBRTryo0(long j5) {
            int minIntrinsicHeight;
            int minIntrinsicWidth;
            IntrinsicWidthHeight intrinsicWidthHeight = this.widthHeight;
            IntrinsicWidthHeight intrinsicWidthHeight2 = IntrinsicWidthHeight.Width;
            int i5 = LayoutKt.LargeDimension;
            if (intrinsicWidthHeight == intrinsicWidthHeight2) {
                if (this.minMax == IntrinsicMinMax.Max) {
                    minIntrinsicWidth = this.measurable.maxIntrinsicWidth(Constraints.m5999getMaxHeightimpl(j5));
                } else {
                    minIntrinsicWidth = this.measurable.minIntrinsicWidth(Constraints.m5999getMaxHeightimpl(j5));
                }
                if (Constraints.m5995getHasBoundedHeightimpl(j5)) {
                    i5 = Constraints.m5999getMaxHeightimpl(j5);
                }
                return new EmptyPlaceable(minIntrinsicWidth, i5);
            }
            if (this.minMax == IntrinsicMinMax.Max) {
                minIntrinsicHeight = this.measurable.maxIntrinsicHeight(Constraints.m6000getMaxWidthimpl(j5));
            } else {
                minIntrinsicHeight = this.measurable.minIntrinsicHeight(Constraints.m6000getMaxWidthimpl(j5));
            }
            if (Constraints.m5996getHasBoundedWidthimpl(j5)) {
                i5 = Constraints.m6000getMaxWidthimpl(j5);
            }
            return new EmptyPlaceable(i5, minIntrinsicHeight);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicHeight(int i5) {
            return this.measurable.minIntrinsicHeight(i5);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicWidth(int i5) {
            return this.measurable.minIntrinsicWidth(i5);
        }
    }

    @i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J=\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0019\u0010\u000e\u001a\u0015\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0002\b\rH\u0014ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/node/NodeMeasuringIntrinsics$EmptyPlaceable;", "Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "", "get", "Landroidx/compose/ui/unit/IntOffset;", "position", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/r2;", "Lkotlin/u;", "layerBlock", "placeAt-f8xVGno", "(JFLv3/l;)V", "placeAt", "width", "height", "<init>", "(II)V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    private static final class EmptyPlaceable extends Placeable {
        public EmptyPlaceable(int i5, int i6) {
            m5047setMeasuredSizeozmzZPI(IntSizeKt.IntSize(i5, i6));
        }

        @Override // androidx.compose.ui.layout.Measured
        public int get(@l AlignmentLine alignmentLine) {
            return Integer.MIN_VALUE;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.compose.ui.layout.Placeable
        /* renamed from: placeAt-f8xVGno */
        public void mo4999placeAtf8xVGno(long j5, float f5, @m v3.l<? super GraphicsLayerScope, r2> lVar) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/node/NodeMeasuringIntrinsics$IntrinsicMinMax;", "", "(Ljava/lang/String;I)V", "Min", "Max", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public enum IntrinsicMinMax {
        Min,
        Max
    }

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/node/NodeMeasuringIntrinsics$IntrinsicWidthHeight;", "", "(Ljava/lang/String;I)V", "Width", "Height", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public enum IntrinsicWidthHeight {
        Width,
        Height
    }

    @i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bà\u0080\u0001\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/NodeMeasuringIntrinsics$MeasureBlock;", "", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public interface MeasureBlock {
        @l
        /* renamed from: measure-3p2s80s */
        MeasureResult mo5003measure3p2s80s(@l MeasureScope measureScope, @l Measurable measurable, long j5);
    }

    private NodeMeasuringIntrinsics() {
    }

    public final int maxHeight$ui_release(@l MeasureBlock measureBlock, @l IntrinsicMeasureScope intrinsicMeasureScope, @l IntrinsicMeasurable intrinsicMeasurable, int i5) {
        return measureBlock.mo5003measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new DefaultIntrinsicMeasurable(intrinsicMeasurable, IntrinsicMinMax.Max, IntrinsicWidthHeight.Height), ConstraintsKt.Constraints$default(0, i5, 0, 0, 13, null)).getHeight();
    }

    public final int maxWidth$ui_release(@l MeasureBlock measureBlock, @l IntrinsicMeasureScope intrinsicMeasureScope, @l IntrinsicMeasurable intrinsicMeasurable, int i5) {
        return measureBlock.mo5003measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new DefaultIntrinsicMeasurable(intrinsicMeasurable, IntrinsicMinMax.Max, IntrinsicWidthHeight.Width), ConstraintsKt.Constraints$default(0, 0, 0, i5, 7, null)).getWidth();
    }

    public final int minHeight$ui_release(@l MeasureBlock measureBlock, @l IntrinsicMeasureScope intrinsicMeasureScope, @l IntrinsicMeasurable intrinsicMeasurable, int i5) {
        return measureBlock.mo5003measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new DefaultIntrinsicMeasurable(intrinsicMeasurable, IntrinsicMinMax.Min, IntrinsicWidthHeight.Height), ConstraintsKt.Constraints$default(0, i5, 0, 0, 13, null)).getHeight();
    }

    public final int minWidth$ui_release(@l MeasureBlock measureBlock, @l IntrinsicMeasureScope intrinsicMeasureScope, @l IntrinsicMeasurable intrinsicMeasurable, int i5) {
        return measureBlock.mo5003measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new DefaultIntrinsicMeasurable(intrinsicMeasurable, IntrinsicMinMax.Min, IntrinsicWidthHeight.Width), ConstraintsKt.Constraints$default(0, 0, 0, i5, 7, null)).getWidth();
    }
}
