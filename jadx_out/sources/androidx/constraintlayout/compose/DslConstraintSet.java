package androidx.constraintlayout.compose;

import androidx.compose.ui.layout.Measurable;
import androidx.constraintlayout.compose.DerivedConstraintSet;
import com.lody.virtual.client.hook.providers.DownloadProviderHook;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.r2;
import p4.l;
import p4.m;
import t0.b;

@i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B,\u0012\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\f¢\u0006\u0002\b\u000e\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016R(\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\f¢\u0006\u0002\b\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Landroidx/constraintlayout/compose/DslConstraintSet;", "Landroidx/constraintlayout/compose/DerivedConstraintSet;", "Landroidx/constraintlayout/compose/State;", "state", "Lkotlin/r2;", "applyToState", "", "name", "", b.f22420d, "Landroidx/constraintlayout/compose/ConstraintSet;", "override", "Lkotlin/Function1;", "Landroidx/constraintlayout/compose/ConstraintSetScope;", "Lkotlin/u;", DownloadProviderHook.COLUMN_DESCRIPTION, "Lv3/l;", "getDescription", "()Lv3/l;", "extendFrom", "Landroidx/constraintlayout/compose/ConstraintSet;", "getExtendFrom", "()Landroidx/constraintlayout/compose/ConstraintSet;", "<init>", "(Lv3/l;Landroidx/constraintlayout/compose/ConstraintSet;)V", "compose_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class DslConstraintSet implements DerivedConstraintSet {

    @l
    private final v3.l<ConstraintSetScope, r2> description;

    @m
    private final ConstraintSet extendFrom;

    /* JADX WARN: Multi-variable type inference failed */
    public DslConstraintSet(@l v3.l<? super ConstraintSetScope, r2> description, @m ConstraintSet constraintSet) {
        l0.p(description, "description");
        this.description = description;
        this.extendFrom = constraintSet;
    }

    @Override // androidx.constraintlayout.compose.DerivedConstraintSet, androidx.constraintlayout.compose.ConstraintSet
    public void applyTo(@l State state, @l List<? extends Measurable> list) {
        DerivedConstraintSet.DefaultImpls.applyTo(this, state, list);
    }

    @Override // androidx.constraintlayout.compose.DerivedConstraintSet
    public void applyToState(@l State state) {
        l0.p(state, "state");
        ConstraintSetScope constraintSetScope = new ConstraintSetScope();
        this.description.invoke(constraintSetScope);
        constraintSetScope.applyTo(state);
    }

    @l
    public final v3.l<ConstraintSetScope, r2> getDescription() {
        return this.description;
    }

    @Override // androidx.constraintlayout.compose.DerivedConstraintSet
    @m
    public ConstraintSet getExtendFrom() {
        return this.extendFrom;
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    public boolean isDirty(@l List<? extends Measurable> list) {
        return DerivedConstraintSet.DefaultImpls.isDirty(this, list);
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    @l
    public ConstraintSet override(@l String name, float f5) {
        l0.p(name, "name");
        return this;
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    public void applyTo(@l androidx.constraintlayout.core.state.Transition transition, int i5) {
        DerivedConstraintSet.DefaultImpls.applyTo(this, transition, i5);
    }

    public /* synthetic */ DslConstraintSet(v3.l lVar, ConstraintSet constraintSet, int i5, w wVar) {
        this(lVar, (i5 & 2) != 0 ? null : constraintSet);
    }
}
