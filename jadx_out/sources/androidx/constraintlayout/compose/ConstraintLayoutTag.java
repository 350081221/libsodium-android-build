package androidx.constraintlayout.compose;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Density;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;

@i0(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B0\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\r\u0012\u0017\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015¢\u0006\u0002\b\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u0005*\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0096\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016R\u001a\u0010\u000f\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u001c"}, d2 = {"Landroidx/constraintlayout/compose/ConstraintLayoutTag;", "Landroidx/compose/ui/layout/ParentDataModifier;", "Landroidx/constraintlayout/compose/ConstraintLayoutTagParentData;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Landroidx/compose/ui/unit/Density;", "", "parentData", "modifyParentData", "", TTDownloadField.TT_HASHCODE, "other", "", "equals", "", "toString", "constraintLayoutTag", "Ljava/lang/String;", "getConstraintLayoutTag", "()Ljava/lang/String;", "constraintLayoutId", "getConstraintLayoutId", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "Lkotlin/r2;", "Lkotlin/u;", "inspectorInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lv3/l;)V", "compose_release"}, k = 1, mv = {1, 5, 1})
@Immutable
/* loaded from: classes2.dex */
final class ConstraintLayoutTag extends InspectorValueInfo implements ParentDataModifier, ConstraintLayoutTagParentData {

    @l
    private final String constraintLayoutId;

    @l
    private final String constraintLayoutTag;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintLayoutTag(@l String constraintLayoutTag, @l String constraintLayoutId, @l v3.l<? super InspectorInfo, r2> inspectorInfo) {
        super(inspectorInfo);
        l0.p(constraintLayoutTag, "constraintLayoutTag");
        l0.p(constraintLayoutId, "constraintLayoutId");
        l0.p(inspectorInfo, "inspectorInfo");
        this.constraintLayoutTag = constraintLayoutTag;
        this.constraintLayoutId = constraintLayoutId;
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public boolean all(@l v3.l<? super Modifier.Element, Boolean> lVar) {
        return ParentDataModifier.DefaultImpls.all(this, lVar);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public boolean any(@l v3.l<? super Modifier.Element, Boolean> lVar) {
        return ParentDataModifier.DefaultImpls.any(this, lVar);
    }

    public boolean equals(@m Object obj) {
        ConstraintLayoutTag constraintLayoutTag;
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConstraintLayoutTag) {
            constraintLayoutTag = (ConstraintLayoutTag) obj;
        } else {
            constraintLayoutTag = null;
        }
        if (constraintLayoutTag == null) {
            return false;
        }
        return l0.g(getConstraintLayoutTag(), constraintLayoutTag.getConstraintLayoutTag());
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public <R> R foldIn(R r5, @l p<? super R, ? super Modifier.Element, ? extends R> pVar) {
        return (R) ParentDataModifier.DefaultImpls.foldIn(this, r5, pVar);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public <R> R foldOut(R r5, @l p<? super Modifier.Element, ? super R, ? extends R> pVar) {
        return (R) ParentDataModifier.DefaultImpls.foldOut(this, r5, pVar);
    }

    @Override // androidx.constraintlayout.compose.ConstraintLayoutTagParentData
    @l
    public String getConstraintLayoutId() {
        return this.constraintLayoutId;
    }

    @Override // androidx.constraintlayout.compose.ConstraintLayoutTagParentData
    @l
    public String getConstraintLayoutTag() {
        return this.constraintLayoutTag;
    }

    public int hashCode() {
        return getConstraintLayoutTag().hashCode();
    }

    @Override // androidx.compose.ui.layout.ParentDataModifier
    @m
    public Object modifyParentData(@l Density density, @m Object obj) {
        l0.p(density, "<this>");
        return this;
    }

    @Override // androidx.compose.ui.Modifier
    @l
    public Modifier then(@l Modifier modifier) {
        return ParentDataModifier.DefaultImpls.then(this, modifier);
    }

    @l
    public String toString() {
        return "ConstraintLayoutTag(id=" + getConstraintLayoutTag() + ')';
    }
}
