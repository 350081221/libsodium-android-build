package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;
import v3.a;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/semantics/CustomAccessibilityAction;", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "", "toString", TTDownloadField.TT_LABEL, "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "Lkotlin/Function0;", "action", "Lv3/a;", "getAction", "()Lv3/a;", "<init>", "(Ljava/lang/String;Lv3/a;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class CustomAccessibilityAction {
    public static final int $stable = 0;

    @l
    private final a<Boolean> action;

    @l
    private final String label;

    public CustomAccessibilityAction(@l String str, @l a<Boolean> aVar) {
        this.label = str;
        this.action = aVar;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomAccessibilityAction)) {
            return false;
        }
        CustomAccessibilityAction customAccessibilityAction = (CustomAccessibilityAction) obj;
        if (l0.g(this.label, customAccessibilityAction.label) && l0.g(this.action, customAccessibilityAction.action)) {
            return true;
        }
        return false;
    }

    @l
    public final a<Boolean> getAction() {
        return this.action;
    }

    @l
    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        return (this.label.hashCode() * 31) + this.action.hashCode();
    }

    @l
    public String toString() {
        return "CustomAccessibilityAction(label=" + this.label + ", action=" + this.action + ')';
    }
}
