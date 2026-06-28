package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;
import v3.p;
import v3.q;

@i0(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a.\u0010\u0006\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a.\u0010\u0007\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a.\u0010\b\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a.\u0010\t\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001at\u0010\u0013\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u001d\u0010\r\u001a\u0019\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\u0002\b\f2\u001d\u0010\u000e\u001a\u0019\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\u0002\b\f2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0000H\u0002\u001aE\u0010\u0015\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u001d\u0010\u0014\u001a\u0019\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\u0002\b\f2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005H\u0002\u001ad\u0010\u0018\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u001d\u0010\u0014\u001a\u0019\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\u0002\b\f2\u001d\u0010\u0016\u001a\u0019\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\u0002\b\f2\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005H\u0002\"\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u0019*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\"\u001a\u0010 \u001a\u00020\u001d*\u0004\u0018\u00010\u00198@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\"\u001a\u0010$\u001a\u00020!*\u0004\u0018\u00010\u00198@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#\"\u001c\u0010(\u001a\u0004\u0018\u00010%*\u0004\u0018\u00010\u00198@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'\"\u001a\u0010)\u001a\u00020!*\u0004\u0018\u00010\u00198@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b)\u0010#¨\u0006*"}, d2 = {"Landroidx/compose/foundation/layout/LayoutOrientation;", "orientation", "Lkotlin/Function3;", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "MinIntrinsicWidthMeasureBlock", "MinIntrinsicHeightMeasureBlock", "MaxIntrinsicWidthMeasureBlock", "MaxIntrinsicHeightMeasureBlock", "children", "Lkotlin/Function2;", "Lkotlin/u;", "intrinsicMainSize", "intrinsicCrossSize", "crossAxisAvailable", "mainAxisSpacing", "layoutOrientation", "intrinsicOrientation", "intrinsicSize", "mainAxisSize", "intrinsicMainAxisSize", "crossAxisSize", "mainAxisAvailable", "intrinsicCrossAxisSize", "Landroidx/compose/foundation/layout/RowColumnParentData;", "getRowColumnParentData", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Landroidx/compose/foundation/layout/RowColumnParentData;", "rowColumnParentData", "", "getWeight", "(Landroidx/compose/foundation/layout/RowColumnParentData;)F", "weight", "", "getFill", "(Landroidx/compose/foundation/layout/RowColumnParentData;)Z", "fill", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "getCrossAxisAlignment", "(Landroidx/compose/foundation/layout/RowColumnParentData;)Landroidx/compose/foundation/layout/CrossAxisAlignment;", "crossAxisAlignment", "isRelative", "foundation-layout_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nRowColumnImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/RowColumnImplKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,871:1\n33#2,6:872\n33#2,6:878\n33#2,6:884\n*S KotlinDebug\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/RowColumnImplKt\n*L\n565#1:872,6\n590#1:878,6\n616#1:884,6\n*E\n"})
/* loaded from: classes.dex */
public final class RowColumnImplKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> MaxIntrinsicHeightMeasureBlock(LayoutOrientation layoutOrientation) {
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            return IntrinsicMeasureBlocks.INSTANCE.getHorizontalMaxHeight();
        }
        return IntrinsicMeasureBlocks.INSTANCE.getVerticalMaxHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> MaxIntrinsicWidthMeasureBlock(LayoutOrientation layoutOrientation) {
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            return IntrinsicMeasureBlocks.INSTANCE.getHorizontalMaxWidth();
        }
        return IntrinsicMeasureBlocks.INSTANCE.getVerticalMaxWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> MinIntrinsicHeightMeasureBlock(LayoutOrientation layoutOrientation) {
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            return IntrinsicMeasureBlocks.INSTANCE.getHorizontalMinHeight();
        }
        return IntrinsicMeasureBlocks.INSTANCE.getVerticalMinHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> MinIntrinsicWidthMeasureBlock(LayoutOrientation layoutOrientation) {
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            return IntrinsicMeasureBlocks.INSTANCE.getHorizontalMinWidth();
        }
        return IntrinsicMeasureBlocks.INSTANCE.getVerticalMinWidth();
    }

    @m
    public static final CrossAxisAlignment getCrossAxisAlignment(@m RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData != null) {
            return rowColumnParentData.getCrossAxisAlignment();
        }
        return null;
    }

    public static final boolean getFill(@m RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData != null) {
            return rowColumnParentData.getFill();
        }
        return true;
    }

    @m
    public static final RowColumnParentData getRowColumnParentData(@l IntrinsicMeasurable intrinsicMeasurable) {
        Object parentData = intrinsicMeasurable.getParentData();
        if (parentData instanceof RowColumnParentData) {
            return (RowColumnParentData) parentData;
        }
        return null;
    }

    public static final float getWeight(@m RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData != null) {
            return rowColumnParentData.getWeight();
        }
        return 0.0f;
    }

    private static final int intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> list, p<? super IntrinsicMeasurable, ? super Integer, Integer> pVar, p<? super IntrinsicMeasurable, ? super Integer, Integer> pVar2, int i5, int i6) {
        int L0;
        int i7;
        boolean z4;
        if (list.isEmpty()) {
            return 0;
        }
        boolean z5 = true;
        int min = Math.min((list.size() - 1) * i6, i5);
        int size = list.size();
        int i8 = 0;
        float f5 = 0.0f;
        for (int i9 = 0; i9 < size; i9++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i9);
            float weight = getWeight(getRowColumnParentData(intrinsicMeasurable));
            if (weight == 0.0f) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                int min2 = Math.min(pVar.invoke(intrinsicMeasurable, Integer.MAX_VALUE).intValue(), i5 - min);
                min += min2;
                i8 = Math.max(i8, pVar2.invoke(intrinsicMeasurable, Integer.valueOf(min2)).intValue());
            } else if (weight > 0.0f) {
                f5 += weight;
            }
        }
        if (f5 != 0.0f) {
            z5 = false;
        }
        if (z5) {
            L0 = 0;
        } else if (i5 == Integer.MAX_VALUE) {
            L0 = Integer.MAX_VALUE;
        } else {
            L0 = kotlin.math.d.L0(Math.max(i5 - min, 0) / f5);
        }
        int size2 = list.size();
        for (int i10 = 0; i10 < size2; i10++) {
            IntrinsicMeasurable intrinsicMeasurable2 = list.get(i10);
            float weight2 = getWeight(getRowColumnParentData(intrinsicMeasurable2));
            if (weight2 > 0.0f) {
                if (L0 != Integer.MAX_VALUE) {
                    i7 = kotlin.math.d.L0(L0 * weight2);
                } else {
                    i7 = Integer.MAX_VALUE;
                }
                i8 = Math.max(i8, pVar2.invoke(intrinsicMeasurable2, Integer.valueOf(i7)).intValue());
            }
        }
        return i8;
    }

    private static final int intrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, p<? super IntrinsicMeasurable, ? super Integer, Integer> pVar, int i5, int i6) {
        int L0;
        int L02;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        float f5 = 0.0f;
        while (true) {
            boolean z4 = true;
            if (i7 < size) {
                IntrinsicMeasurable intrinsicMeasurable = list.get(i7);
                float weight = getWeight(getRowColumnParentData(intrinsicMeasurable));
                int intValue = pVar.invoke(intrinsicMeasurable, Integer.valueOf(i5)).intValue();
                if (weight != 0.0f) {
                    z4 = false;
                }
                if (z4) {
                    i9 += intValue;
                } else if (weight > 0.0f) {
                    f5 += weight;
                    L02 = kotlin.math.d.L0(intValue / weight);
                    i8 = Math.max(i8, L02);
                }
                i7++;
            } else {
                L0 = kotlin.math.d.L0(i8 * f5);
                return L0 + i9 + ((list.size() - 1) * i6);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int intrinsicSize(List<? extends IntrinsicMeasurable> list, p<? super IntrinsicMeasurable, ? super Integer, Integer> pVar, p<? super IntrinsicMeasurable, ? super Integer, Integer> pVar2, int i5, int i6, LayoutOrientation layoutOrientation, LayoutOrientation layoutOrientation2) {
        if (layoutOrientation == layoutOrientation2) {
            return intrinsicMainAxisSize(list, pVar, i5, i6);
        }
        return intrinsicCrossAxisSize(list, pVar2, pVar, i5, i6);
    }

    public static final boolean isRelative(@m RowColumnParentData rowColumnParentData) {
        CrossAxisAlignment crossAxisAlignment = getCrossAxisAlignment(rowColumnParentData);
        if (crossAxisAlignment != null) {
            return crossAxisAlignment.isRelative$foundation_layout_release();
        }
        return false;
    }
}
