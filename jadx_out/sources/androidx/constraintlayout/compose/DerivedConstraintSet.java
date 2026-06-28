package androidx.constraintlayout.compose;

import androidx.compose.ui.layout.Measurable;
import androidx.constraintlayout.compose.ConstraintSet;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&R\u0016\u0010\f\u001a\u0004\u0018\u00010\u00018&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/constraintlayout/compose/DerivedConstraintSet;", "Landroidx/constraintlayout/compose/ConstraintSet;", "Landroidx/constraintlayout/compose/State;", "state", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "Lkotlin/r2;", "applyTo", "applyToState", "getExtendFrom", "()Landroidx/constraintlayout/compose/ConstraintSet;", "extendFrom", "compose_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public interface DerivedConstraintSet extends ConstraintSet {

    @i0(k = 3, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static void applyTo(@l DerivedConstraintSet derivedConstraintSet, @l androidx.constraintlayout.core.state.Transition transition, int i5) {
            l0.p(derivedConstraintSet, "this");
            l0.p(transition, "transition");
            ConstraintSet.DefaultImpls.applyTo(derivedConstraintSet, transition, i5);
        }

        public static boolean isDirty(@l DerivedConstraintSet derivedConstraintSet, @l List<? extends Measurable> measurables) {
            l0.p(derivedConstraintSet, "this");
            l0.p(measurables, "measurables");
            return ConstraintSet.DefaultImpls.isDirty(derivedConstraintSet, measurables);
        }

        @l
        public static ConstraintSet override(@l DerivedConstraintSet derivedConstraintSet, @l String name, float f5) {
            l0.p(derivedConstraintSet, "this");
            l0.p(name, "name");
            return ConstraintSet.DefaultImpls.override(derivedConstraintSet, name, f5);
        }

        public static void applyTo(@l DerivedConstraintSet derivedConstraintSet, @l State state, @l List<? extends Measurable> measurables) {
            l0.p(derivedConstraintSet, "this");
            l0.p(state, "state");
            l0.p(measurables, "measurables");
            ConstraintLayoutKt.buildMapping(state, measurables);
            ConstraintSet extendFrom = derivedConstraintSet.getExtendFrom();
            DerivedConstraintSet derivedConstraintSet2 = extendFrom instanceof DerivedConstraintSet ? (DerivedConstraintSet) extendFrom : null;
            if (derivedConstraintSet2 != null) {
                derivedConstraintSet2.applyTo(state, measurables);
            }
            derivedConstraintSet.applyToState(state);
        }
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    void applyTo(@l State state, @l List<? extends Measurable> list);

    void applyToState(@l State state);

    @m
    ConstraintSet getExtendFrom();
}
