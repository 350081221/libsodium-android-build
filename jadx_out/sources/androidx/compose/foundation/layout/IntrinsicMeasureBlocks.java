package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import java.util.List;
import kotlin.i0;
import p4.l;
import v3.q;

@i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0015\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019R5\u0010\u0006\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR5\u0010\n\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\tR5\u0010\f\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\tR5\u0010\u000e\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\tR5\u0010\u0010\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0007\u001a\u0004\b\u0011\u0010\tR5\u0010\u0012\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0007\u001a\u0004\b\u0013\u0010\tR5\u0010\u0014\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0007\u001a\u0004\b\u0015\u0010\tR5\u0010\u0016\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0007\u001a\u0004\b\u0017\u0010\t¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/layout/IntrinsicMeasureBlocks;", "", "Lkotlin/Function3;", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "HorizontalMinWidth", "Lv3/q;", "getHorizontalMinWidth", "()Lv3/q;", "VerticalMinWidth", "getVerticalMinWidth", "HorizontalMinHeight", "getHorizontalMinHeight", "VerticalMinHeight", "getVerticalMinHeight", "HorizontalMaxWidth", "getHorizontalMaxWidth", "VerticalMaxWidth", "getVerticalMaxWidth", "HorizontalMaxHeight", "getHorizontalMaxHeight", "VerticalMaxHeight", "getVerticalMaxHeight", "<init>", "()V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class IntrinsicMeasureBlocks {

    @l
    public static final IntrinsicMeasureBlocks INSTANCE = new IntrinsicMeasureBlocks();

    @l
    private static final q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> HorizontalMinWidth = IntrinsicMeasureBlocks$HorizontalMinWidth$1.INSTANCE;

    @l
    private static final q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> VerticalMinWidth = IntrinsicMeasureBlocks$VerticalMinWidth$1.INSTANCE;

    @l
    private static final q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> HorizontalMinHeight = IntrinsicMeasureBlocks$HorizontalMinHeight$1.INSTANCE;

    @l
    private static final q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> VerticalMinHeight = IntrinsicMeasureBlocks$VerticalMinHeight$1.INSTANCE;

    @l
    private static final q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> HorizontalMaxWidth = IntrinsicMeasureBlocks$HorizontalMaxWidth$1.INSTANCE;

    @l
    private static final q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> VerticalMaxWidth = IntrinsicMeasureBlocks$VerticalMaxWidth$1.INSTANCE;

    @l
    private static final q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> HorizontalMaxHeight = IntrinsicMeasureBlocks$HorizontalMaxHeight$1.INSTANCE;

    @l
    private static final q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> VerticalMaxHeight = IntrinsicMeasureBlocks$VerticalMaxHeight$1.INSTANCE;

    private IntrinsicMeasureBlocks() {
    }

    @l
    public final q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> getHorizontalMaxHeight() {
        return HorizontalMaxHeight;
    }

    @l
    public final q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> getHorizontalMaxWidth() {
        return HorizontalMaxWidth;
    }

    @l
    public final q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> getHorizontalMinHeight() {
        return HorizontalMinHeight;
    }

    @l
    public final q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> getHorizontalMinWidth() {
        return HorizontalMinWidth;
    }

    @l
    public final q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> getVerticalMaxHeight() {
        return VerticalMaxHeight;
    }

    @l
    public final q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> getVerticalMaxWidth() {
        return VerticalMaxWidth;
    }

    @l
    public final q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> getVerticalMinHeight() {
        return VerticalMinHeight;
    }

    @l
    public final q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> getVerticalMinWidth() {
        return VerticalMinWidth;
    }
}
