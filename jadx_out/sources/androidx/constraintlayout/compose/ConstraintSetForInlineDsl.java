package androidx.constraintlayout.compose;

import android.os.Handler;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.layout.Measurable;
import androidx.constraintlayout.compose.ConstraintSet;
import java.util.ArrayList;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b'\u0010(J\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0016\u0010\u000b\u001a\u00020\n2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\b\u0010\f\u001a\u00020\bH\u0016J\b\u0010\r\u001a\u00020\bH\u0016J\b\u0010\u000e\u001a\u00020\bH\u0016R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\u001a\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006)"}, d2 = {"Landroidx/constraintlayout/compose/ConstraintSetForInlineDsl;", "Landroidx/constraintlayout/compose/ConstraintSet;", "Landroidx/compose/runtime/RememberObserver;", "Landroidx/constraintlayout/compose/State;", "state", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "Lkotlin/r2;", "applyTo", "", "isDirty", "onRemembered", "onForgotten", "onAbandoned", "Landroidx/constraintlayout/compose/ConstraintLayoutScope;", "scope", "Landroidx/constraintlayout/compose/ConstraintLayoutScope;", "getScope", "()Landroidx/constraintlayout/compose/ConstraintLayoutScope;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "observer", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "knownDirty", "Z", "getKnownDirty", "()Z", "setKnownDirty", "(Z)V", "Lkotlin/Function1;", "onCommitAffectingConstrainLambdas", "Lv3/l;", "", "Landroidx/constraintlayout/compose/ConstraintLayoutParentData;", "previousDatas", "Ljava/util/List;", "<init>", "(Landroidx/constraintlayout/compose/ConstraintLayoutScope;)V", "compose_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class ConstraintSetForInlineDsl implements ConstraintSet, RememberObserver {

    @m
    private Handler handler;
    private boolean knownDirty;

    @l
    private final SnapshotStateObserver observer;

    @l
    private final v3.l<r2, r2> onCommitAffectingConstrainLambdas;

    @l
    private final List<ConstraintLayoutParentData> previousDatas;

    @l
    private final ConstraintLayoutScope scope;

    public ConstraintSetForInlineDsl(@l ConstraintLayoutScope scope) {
        l0.p(scope, "scope");
        this.scope = scope;
        this.observer = new SnapshotStateObserver(new ConstraintSetForInlineDsl$observer$1(this));
        this.knownDirty = true;
        this.onCommitAffectingConstrainLambdas = new ConstraintSetForInlineDsl$onCommitAffectingConstrainLambdas$1(this);
        this.previousDatas = new ArrayList();
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    public void applyTo(@l androidx.constraintlayout.core.state.Transition transition, int i5) {
        ConstraintSet.DefaultImpls.applyTo(this, transition, i5);
    }

    public final boolean getKnownDirty() {
        return this.knownDirty;
    }

    @l
    public final ConstraintLayoutScope getScope() {
        return this.scope;
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    public boolean isDirty(@l List<? extends Measurable> measurables) {
        ConstraintLayoutParentData constraintLayoutParentData;
        l0.p(measurables, "measurables");
        if (this.knownDirty || measurables.size() != this.previousDatas.size()) {
            return true;
        }
        int size = measurables.size() - 1;
        if (size >= 0) {
            int i5 = 0;
            while (true) {
                int i6 = i5 + 1;
                Object parentData = measurables.get(i5).getParentData();
                if (parentData instanceof ConstraintLayoutParentData) {
                    constraintLayoutParentData = (ConstraintLayoutParentData) parentData;
                } else {
                    constraintLayoutParentData = null;
                }
                if (!l0.g(constraintLayoutParentData, this.previousDatas.get(i5))) {
                    return true;
                }
                if (i6 > size) {
                    break;
                }
                i5 = i6;
            }
        }
        return false;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        this.observer.stop();
        this.observer.clear();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        this.observer.start();
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    @l
    public ConstraintSet override(@l String str, float f5) {
        return ConstraintSet.DefaultImpls.override(this, str, f5);
    }

    public final void setKnownDirty(boolean z4) {
        this.knownDirty = z4;
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    public void applyTo(@l State state, @l List<? extends Measurable> measurables) {
        l0.p(state, "state");
        l0.p(measurables, "measurables");
        this.scope.applyTo(state);
        this.previousDatas.clear();
        this.observer.observeReads(r2.f19517a, this.onCommitAffectingConstrainLambdas, new ConstraintSetForInlineDsl$applyTo$1(measurables, state, this));
        this.knownDirty = false;
    }
}
