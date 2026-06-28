package androidx.constraintlayout.compose;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.layout.LayoutIdParentData;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@Stable
@i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B(\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR(\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Landroidx/constraintlayout/compose/ConstraintLayoutParentData;", "Landroidx/compose/ui/layout/LayoutIdParentData;", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "ref", "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "getRef", "()Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "Lkotlin/Function1;", "Landroidx/constraintlayout/compose/ConstrainScope;", "Lkotlin/r2;", "Lkotlin/u;", "constrain", "Lv3/l;", "getConstrain", "()Lv3/l;", "layoutId", "Ljava/lang/Object;", "getLayoutId", "()Ljava/lang/Object;", "<init>", "(Landroidx/constraintlayout/compose/ConstrainedLayoutReference;Lv3/l;)V", "compose_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class ConstraintLayoutParentData implements LayoutIdParentData {

    @l
    private final v3.l<ConstrainScope, r2> constrain;

    @l
    private final Object layoutId;

    @l
    private final ConstrainedLayoutReference ref;

    /* JADX WARN: Multi-variable type inference failed */
    public ConstraintLayoutParentData(@l ConstrainedLayoutReference ref, @l v3.l<? super ConstrainScope, r2> constrain) {
        l0.p(ref, "ref");
        l0.p(constrain, "constrain");
        this.ref = ref;
        this.constrain = constrain;
        this.layoutId = ref.getId();
    }

    public boolean equals(@m Object obj) {
        if (obj instanceof ConstraintLayoutParentData) {
            ConstraintLayoutParentData constraintLayoutParentData = (ConstraintLayoutParentData) obj;
            if (l0.g(this.ref.getId(), constraintLayoutParentData.ref.getId()) && l0.g(this.constrain, constraintLayoutParentData.constrain)) {
                return true;
            }
        }
        return false;
    }

    @l
    public final v3.l<ConstrainScope, r2> getConstrain() {
        return this.constrain;
    }

    @Override // androidx.compose.ui.layout.LayoutIdParentData
    @l
    public Object getLayoutId() {
        return this.layoutId;
    }

    @l
    public final ConstrainedLayoutReference getRef() {
        return this.ref;
    }

    public int hashCode() {
        return (this.ref.getId().hashCode() * 31) + this.constrain.hashCode();
    }
}
