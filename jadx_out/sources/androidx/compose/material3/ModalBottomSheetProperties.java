package androidx.compose.material3;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.window.SecureFlagPolicy;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;

@StabilityInferred(parameters = 1)
@kotlin.i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0013\u0010\f\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\b¨\u0006\u0010"}, d2 = {"Landroidx/compose/material3/ModalBottomSheetProperties;", "", "securePolicy", "Landroidx/compose/ui/window/SecureFlagPolicy;", "isFocusable", "", "shouldDismissOnBackPress", "(Landroidx/compose/ui/window/SecureFlagPolicy;ZZ)V", "()Z", "getSecurePolicy", "()Landroidx/compose/ui/window/SecureFlagPolicy;", "getShouldDismissOnBackPress", "equals", "other", TTDownloadField.TT_HASHCODE, "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ExperimentalMaterial3Api
/* loaded from: classes.dex */
public final class ModalBottomSheetProperties {
    public static final int $stable = 0;
    private final boolean isFocusable;

    @p4.l
    private final SecureFlagPolicy securePolicy;
    private final boolean shouldDismissOnBackPress;

    public ModalBottomSheetProperties(@p4.l SecureFlagPolicy secureFlagPolicy, boolean z4, boolean z5) {
        this.securePolicy = secureFlagPolicy;
        this.isFocusable = z4;
        this.shouldDismissOnBackPress = z5;
    }

    public boolean equals(@p4.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModalBottomSheetProperties)) {
            return false;
        }
        ModalBottomSheetProperties modalBottomSheetProperties = (ModalBottomSheetProperties) obj;
        if (this.securePolicy == modalBottomSheetProperties.securePolicy && this.isFocusable == modalBottomSheetProperties.isFocusable && this.shouldDismissOnBackPress == modalBottomSheetProperties.shouldDismissOnBackPress) {
            return true;
        }
        return false;
    }

    @p4.l
    public final SecureFlagPolicy getSecurePolicy() {
        return this.securePolicy;
    }

    public final boolean getShouldDismissOnBackPress() {
        return this.shouldDismissOnBackPress;
    }

    public int hashCode() {
        return (((this.securePolicy.hashCode() * 31) + Boolean.hashCode(this.isFocusable)) * 31) + Boolean.hashCode(this.shouldDismissOnBackPress);
    }

    public final boolean isFocusable() {
        return this.isFocusable;
    }
}
