package androidx.compose.ui.platform;

import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.util.List;

@kotlin.i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityNodeInfoVerificationHelperMethods;", "", "Landroid/view/accessibility/AccessibilityNodeInfo;", "node", "", "", "data", "Lkotlin/r2;", "setAvailableExtraData", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
@RequiresApi(26)
/* loaded from: classes.dex */
final class AccessibilityNodeInfoVerificationHelperMethods {

    @p4.l
    public static final AccessibilityNodeInfoVerificationHelperMethods INSTANCE = new AccessibilityNodeInfoVerificationHelperMethods();

    private AccessibilityNodeInfoVerificationHelperMethods() {
    }

    @DoNotInline
    @RequiresApi(26)
    public final void setAvailableExtraData(@p4.l AccessibilityNodeInfo accessibilityNodeInfo, @p4.l List<String> list) {
        accessibilityNodeInfo.setAvailableExtraData(list);
    }
}
