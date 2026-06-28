package androidx.constraintlayout.compose;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.layout.Measurable;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import t0.b;

@i0(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J\u0018\u0010\r\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0016\u0010\u0013\u001a\u00020\u00122\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¨\u0006\u0014"}, d2 = {"Landroidx/constraintlayout/compose/ConstraintSet;", "", "Landroidx/constraintlayout/compose/State;", "state", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "Lkotlin/r2;", "applyTo", "", "name", "", b.f22420d, "override", "Landroidx/constraintlayout/core/state/Transition;", "transition", "", "type", "", "isDirty", "compose_release"}, k = 1, mv = {1, 5, 1})
@Immutable
/* loaded from: classes2.dex */
public interface ConstraintSet {

    @i0(k = 3, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static void applyTo(@l ConstraintSet constraintSet, @l androidx.constraintlayout.core.state.Transition transition, int i5) {
            l0.p(constraintSet, "this");
            l0.p(transition, "transition");
        }

        public static boolean isDirty(@l ConstraintSet constraintSet, @l List<? extends Measurable> measurables) {
            l0.p(constraintSet, "this");
            l0.p(measurables, "measurables");
            return true;
        }

        @l
        public static ConstraintSet override(@l ConstraintSet constraintSet, @l String name, float f5) {
            l0.p(constraintSet, "this");
            l0.p(name, "name");
            return constraintSet;
        }
    }

    void applyTo(@l State state, @l List<? extends Measurable> list);

    void applyTo(@l androidx.constraintlayout.core.state.Transition transition, int i5);

    boolean isDirty(@l List<? extends Measurable> list);

    @l
    ConstraintSet override(@l String str, float f5);
}
