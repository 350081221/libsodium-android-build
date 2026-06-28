package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.v;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u0000*\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0004B\u001b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u000f\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/semantics/AccessibilityAction;", "Lkotlin/v;", "", "T", "", "other", "equals", "", TTDownloadField.TT_HASHCODE, "", "toString", TTDownloadField.TT_LABEL, "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "action", "Lkotlin/v;", "getAction", "()Lkotlin/v;", "<init>", "(Ljava/lang/String;Lkotlin/v;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AccessibilityAction<T extends v<? extends Boolean>> {
    public static final int $stable = 0;

    @m
    private final T action;

    @m
    private final String label;

    public AccessibilityAction(@m String str, @m T t5) {
        this.label = str;
        this.action = t5;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessibilityAction)) {
            return false;
        }
        AccessibilityAction accessibilityAction = (AccessibilityAction) obj;
        if (l0.g(this.label, accessibilityAction.label) && l0.g(this.action, accessibilityAction.action)) {
            return true;
        }
        return false;
    }

    @m
    public final T getAction() {
        return this.action;
    }

    @m
    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        int i5;
        String str = this.label;
        int i6 = 0;
        if (str != null) {
            i5 = str.hashCode();
        } else {
            i5 = 0;
        }
        int i7 = i5 * 31;
        T t5 = this.action;
        if (t5 != null) {
            i6 = t5.hashCode();
        }
        return i7 + i6;
    }

    @l
    public String toString() {
        return "AccessibilityAction(label=" + this.label + ", action=" + this.action + ')';
    }
}
