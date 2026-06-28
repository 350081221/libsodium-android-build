package androidx.constraintlayout.compose;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.platform.InspectableValueKt;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u001e\u0010\u0007\u001a\u00020\b*\u00020\b2\u0006\u0010\u0007\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u000b"}, d2 = {"constraintLayoutId", "", "Landroidx/compose/ui/layout/Measurable;", "getConstraintLayoutId", "(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;", "constraintLayoutTag", "getConstraintLayoutTag", "layoutId", "Landroidx/compose/ui/Modifier;", "", TTDownloadField.TT_TAG, "compose_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ConstraintLayoutTagKt {
    @m
    public static final Object getConstraintLayoutId(@l Measurable measurable) {
        ConstraintLayoutTagParentData constraintLayoutTagParentData;
        l0.p(measurable, "<this>");
        Object parentData = measurable.getParentData();
        if (parentData instanceof ConstraintLayoutTagParentData) {
            constraintLayoutTagParentData = (ConstraintLayoutTagParentData) parentData;
        } else {
            constraintLayoutTagParentData = null;
        }
        if (constraintLayoutTagParentData == null) {
            return null;
        }
        return constraintLayoutTagParentData.getConstraintLayoutId();
    }

    @m
    public static final Object getConstraintLayoutTag(@l Measurable measurable) {
        ConstraintLayoutTagParentData constraintLayoutTagParentData;
        l0.p(measurable, "<this>");
        Object parentData = measurable.getParentData();
        if (parentData instanceof ConstraintLayoutTagParentData) {
            constraintLayoutTagParentData = (ConstraintLayoutTagParentData) parentData;
        } else {
            constraintLayoutTagParentData = null;
        }
        if (constraintLayoutTagParentData == null) {
            return null;
        }
        return constraintLayoutTagParentData.getConstraintLayoutTag();
    }

    @l
    public static final Modifier layoutId(@l Modifier modifier, @l String layoutId, @m String str) {
        v3.l noInspectorInfo;
        l0.p(modifier, "<this>");
        l0.p(layoutId, "layoutId");
        if (str == null) {
            return LayoutIdKt.layoutId(modifier, layoutId);
        }
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new ConstraintLayoutTagKt$layoutId$$inlined$debugInspectorInfo$1(layoutId);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new ConstraintLayoutTag(str, layoutId, noInspectorInfo));
    }

    public static /* synthetic */ Modifier layoutId$default(Modifier modifier, String str, String str2, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            str2 = null;
        }
        return layoutId(modifier, str, str2);
    }
}
