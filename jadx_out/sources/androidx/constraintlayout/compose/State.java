package androidx.constraintlayout.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.Reference;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.HelperWidget;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;
import t0.b;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\b\u0005\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b5\u00106J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR+\u0010\u001e\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010%\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R \u0010,\u001a\b\u0012\u0004\u0012\u00020\u00030+8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\r028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00067"}, d2 = {"Landroidx/constraintlayout/compose/State;", "Landroidx/constraintlayout/core/state/State;", "Landroidx/constraintlayout/compose/SolverState;", "", b.f22420d, "", "convertDimension", "Lkotlin/r2;", "reset", "id", "baselineNeededFor$compose_release", "(Ljava/lang/Object;)V", "baselineNeededFor", "Landroidx/constraintlayout/core/widgets/ConstraintWidget;", "constraintWidget", "", "isBaselineNeeded$compose_release", "(Landroidx/constraintlayout/core/widgets/ConstraintWidget;)Z", "isBaselineNeeded", "Landroidx/constraintlayout/core/widgets/HelperWidget;", "helperWidget", "getKeyId$compose_release", "(Landroidx/constraintlayout/core/widgets/HelperWidget;)Ljava/lang/Object;", "getKeyId", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/Constraints;", "rootIncomingConstraints", "J", "getRootIncomingConstraints-msEJaDk", "()J", "setRootIncomingConstraints-BRTryo0", "(J)V", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "", "baselineNeeded", "Ljava/util/List;", "getBaselineNeeded$compose_release", "()Ljava/util/List;", "dirtyBaselineNeededWidgets", "Z", "", "baselineNeededWidgets", "Ljava/util/Set;", "<init>", "(Landroidx/compose/ui/unit/Density;)V", "compose_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class State extends androidx.constraintlayout.core.state.State {
    public static final int $stable = 8;

    @l
    private final List<Object> baselineNeeded;

    @l
    private final Set<ConstraintWidget> baselineNeededWidgets;

    @l
    private final Density density;
    private boolean dirtyBaselineNeededWidgets;
    public LayoutDirection layoutDirection;
    private long rootIncomingConstraints;

    public State(@l Density density) {
        l0.p(density, "density");
        this.density = density;
        this.rootIncomingConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
        this.baselineNeeded = new ArrayList();
        this.dirtyBaselineNeededWidgets = true;
        this.baselineNeededWidgets = new LinkedHashSet();
    }

    public final void baselineNeededFor$compose_release(@l Object id) {
        l0.p(id, "id");
        this.baselineNeeded.add(id);
        this.dirtyBaselineNeededWidgets = true;
    }

    @Override // androidx.constraintlayout.core.state.State
    public int convertDimension(@m Object obj) {
        if (obj instanceof Dp) {
            return this.density.mo298roundToPx0680j_4(((Dp) obj).m6058unboximpl());
        }
        return super.convertDimension(obj);
    }

    @l
    public final List<Object> getBaselineNeeded$compose_release() {
        return this.baselineNeeded;
    }

    @l
    public final Density getDensity() {
        return this.density;
    }

    @m
    public final Object getKeyId$compose_release(@l HelperWidget helperWidget) {
        Object obj;
        l0.p(helperWidget, "helperWidget");
        Set<Map.Entry<Object, HelperReference>> entrySet = this.mHelperReferences.entrySet();
        l0.o(entrySet, "mHelperReferences.entries");
        Iterator<T> it = entrySet.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (l0.g(((HelperReference) ((Map.Entry) obj).getValue()).getHelperWidget(), helperWidget)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    @l
    public final LayoutDirection getLayoutDirection() {
        LayoutDirection layoutDirection = this.layoutDirection;
        if (layoutDirection != null) {
            return layoutDirection;
        }
        l0.S("layoutDirection");
        throw null;
    }

    /* renamed from: getRootIncomingConstraints-msEJaDk, reason: not valid java name */
    public final long m6392getRootIncomingConstraintsmsEJaDk() {
        return this.rootIncomingConstraints;
    }

    public final boolean isBaselineNeeded$compose_release(@l ConstraintWidget constraintWidget) {
        ConstraintWidget constraintWidget2;
        l0.p(constraintWidget, "constraintWidget");
        if (this.dirtyBaselineNeededWidgets) {
            this.baselineNeededWidgets.clear();
            Iterator<T> it = this.baselineNeeded.iterator();
            while (it.hasNext()) {
                Reference reference = this.mReferences.get(it.next());
                if (reference == null) {
                    constraintWidget2 = null;
                } else {
                    constraintWidget2 = reference.getConstraintWidget();
                }
                if (constraintWidget2 != null) {
                    this.baselineNeededWidgets.add(constraintWidget2);
                }
            }
            this.dirtyBaselineNeededWidgets = false;
        }
        return this.baselineNeededWidgets.contains(constraintWidget);
    }

    @Override // androidx.constraintlayout.core.state.State
    public void reset() {
        ConstraintWidget constraintWidget;
        HashMap<Object, Reference> mReferences = this.mReferences;
        l0.o(mReferences, "mReferences");
        Iterator<Map.Entry<Object, Reference>> it = mReferences.entrySet().iterator();
        while (it.hasNext()) {
            Reference value = it.next().getValue();
            if (value != null && (constraintWidget = value.getConstraintWidget()) != null) {
                constraintWidget.reset();
            }
        }
        this.mReferences.clear();
        HashMap<Object, Reference> mReferences2 = this.mReferences;
        l0.o(mReferences2, "mReferences");
        mReferences2.put(androidx.constraintlayout.core.state.State.PARENT, this.mParent);
        this.baselineNeeded.clear();
        this.dirtyBaselineNeededWidgets = true;
        super.reset();
    }

    public final void setLayoutDirection(@l LayoutDirection layoutDirection) {
        l0.p(layoutDirection, "<set-?>");
        this.layoutDirection = layoutDirection;
    }

    /* renamed from: setRootIncomingConstraints-BRTryo0, reason: not valid java name */
    public final void m6393setRootIncomingConstraintsBRTryo0(long j5) {
        this.rootIncomingConstraints = j5;
    }
}
