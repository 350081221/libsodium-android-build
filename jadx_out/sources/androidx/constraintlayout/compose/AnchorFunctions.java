package androidx.constraintlayout.compose;

import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.state.ConstraintReference;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import v3.p;
import v3.q;

@i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0014\u0010\u0007\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0016\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003R@\u0010\u000e\u001a+\u0012'\u0012%\u0012!\u0012\u001f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00020\f¢\u0006\u0002\b\r0\u000b0\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R:\u0010\u0013\u001a%\u0012!\u0012\u001f\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0012¢\u0006\u0002\b\r0\u000b0\u000b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R.\u0010\u0017\u001a\u0019\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0012¢\u0006\u0002\b\r8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Landroidx/constraintlayout/compose/AnchorFunctions;", "", "Landroidx/constraintlayout/core/state/ConstraintReference;", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Lkotlin/r2;", "clearLeft", "clearRight", "", "index", "verticalAnchorIndexToFunctionIndex", "", "Lkotlin/Function3;", "Lkotlin/u;", "verticalAnchorFunctions", "[[Lv3/q;", "getVerticalAnchorFunctions", "()[[Lv3/q;", "Lkotlin/Function2;", "horizontalAnchorFunctions", "[[Lv3/p;", "getHorizontalAnchorFunctions", "()[[Lv3/p;", "baselineAnchorFunction", "Lv3/p;", "getBaselineAnchorFunction", "()Lv3/p;", "<init>", "()V", "compose_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class AnchorFunctions {

    @l
    public static final AnchorFunctions INSTANCE = new AnchorFunctions();

    @l
    private static final q<ConstraintReference, Object, LayoutDirection, ConstraintReference>[][] verticalAnchorFunctions = {new q[]{AnchorFunctions$verticalAnchorFunctions$1.INSTANCE, AnchorFunctions$verticalAnchorFunctions$2.INSTANCE}, new q[]{AnchorFunctions$verticalAnchorFunctions$3.INSTANCE, AnchorFunctions$verticalAnchorFunctions$4.INSTANCE}};

    @l
    private static final p<ConstraintReference, Object, ConstraintReference>[][] horizontalAnchorFunctions = {new p[]{AnchorFunctions$horizontalAnchorFunctions$1.INSTANCE, AnchorFunctions$horizontalAnchorFunctions$2.INSTANCE}, new p[]{AnchorFunctions$horizontalAnchorFunctions$3.INSTANCE, AnchorFunctions$horizontalAnchorFunctions$4.INSTANCE}};

    @l
    private static final p<ConstraintReference, Object, ConstraintReference> baselineAnchorFunction = AnchorFunctions$baselineAnchorFunction$1.INSTANCE;

    @i0(k = 3, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            iArr[LayoutDirection.Ltr.ordinal()] = 1;
            iArr[LayoutDirection.Rtl.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private AnchorFunctions() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearLeft(ConstraintReference constraintReference, LayoutDirection layoutDirection) {
        constraintReference.leftToLeft(null);
        constraintReference.leftToRight(null);
        int i5 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        if (i5 != 1) {
            if (i5 == 2) {
                constraintReference.endToStart(null);
                constraintReference.endToEnd(null);
                return;
            }
            return;
        }
        constraintReference.startToStart(null);
        constraintReference.startToEnd(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearRight(ConstraintReference constraintReference, LayoutDirection layoutDirection) {
        constraintReference.rightToLeft(null);
        constraintReference.rightToRight(null);
        int i5 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        if (i5 != 1) {
            if (i5 == 2) {
                constraintReference.startToStart(null);
                constraintReference.startToEnd(null);
                return;
            }
            return;
        }
        constraintReference.endToStart(null);
        constraintReference.endToEnd(null);
    }

    @l
    public final p<ConstraintReference, Object, ConstraintReference> getBaselineAnchorFunction() {
        return baselineAnchorFunction;
    }

    @l
    public final p<ConstraintReference, Object, ConstraintReference>[][] getHorizontalAnchorFunctions() {
        return horizontalAnchorFunctions;
    }

    @l
    public final q<ConstraintReference, Object, LayoutDirection, ConstraintReference>[][] getVerticalAnchorFunctions() {
        return verticalAnchorFunctions;
    }

    public final int verticalAnchorIndexToFunctionIndex(int i5, @l LayoutDirection layoutDirection) {
        l0.p(layoutDirection, "layoutDirection");
        if (i5 < 0) {
            if (layoutDirection == LayoutDirection.Ltr) {
                return i5 + 2;
            }
            return (-i5) - 1;
        }
        return i5;
    }
}
