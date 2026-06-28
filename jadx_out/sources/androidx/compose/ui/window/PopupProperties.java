package androidx.compose.ui.window;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.ExperimentalComposeUiApi;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001BC\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nBM\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/window/PopupProperties;", "", "focusable", "", "dismissOnBackPress", "dismissOnClickOutside", "securePolicy", "Landroidx/compose/ui/window/SecureFlagPolicy;", "excludeFromSystemGesture", "clippingEnabled", "(ZZZLandroidx/compose/ui/window/SecureFlagPolicy;ZZ)V", "usePlatformDefaultWidth", "(ZZZLandroidx/compose/ui/window/SecureFlagPolicy;ZZZ)V", "getClippingEnabled", "()Z", "getDismissOnBackPress", "getDismissOnClickOutside", "getExcludeFromSystemGesture", "getFocusable", "getSecurePolicy", "()Landroidx/compose/ui/window/SecureFlagPolicy;", "getUsePlatformDefaultWidth", "equals", "other", TTDownloadField.TT_HASHCODE, "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Immutable
/* loaded from: classes.dex */
public final class PopupProperties {
    public static final int $stable = 0;
    private final boolean clippingEnabled;
    private final boolean dismissOnBackPress;
    private final boolean dismissOnClickOutside;
    private final boolean excludeFromSystemGesture;
    private final boolean focusable;

    @l
    private final SecureFlagPolicy securePolicy;
    private final boolean usePlatformDefaultWidth;

    @ExperimentalComposeUiApi
    public PopupProperties() {
        this(false, false, false, null, false, false, false, 127, null);
    }

    @ExperimentalComposeUiApi
    public PopupProperties(boolean z4, boolean z5, boolean z6, @l SecureFlagPolicy secureFlagPolicy, boolean z7, boolean z8, boolean z9) {
        this.focusable = z4;
        this.dismissOnBackPress = z5;
        this.dismissOnClickOutside = z6;
        this.securePolicy = secureFlagPolicy;
        this.excludeFromSystemGesture = z7;
        this.clippingEnabled = z8;
        this.usePlatformDefaultWidth = z9;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PopupProperties)) {
            return false;
        }
        PopupProperties popupProperties = (PopupProperties) obj;
        if (this.focusable == popupProperties.focusable && this.dismissOnBackPress == popupProperties.dismissOnBackPress && this.dismissOnClickOutside == popupProperties.dismissOnClickOutside && this.securePolicy == popupProperties.securePolicy && this.excludeFromSystemGesture == popupProperties.excludeFromSystemGesture && this.clippingEnabled == popupProperties.clippingEnabled && this.usePlatformDefaultWidth == popupProperties.usePlatformDefaultWidth) {
            return true;
        }
        return false;
    }

    public final boolean getClippingEnabled() {
        return this.clippingEnabled;
    }

    public final boolean getDismissOnBackPress() {
        return this.dismissOnBackPress;
    }

    public final boolean getDismissOnClickOutside() {
        return this.dismissOnClickOutside;
    }

    public final boolean getExcludeFromSystemGesture() {
        return this.excludeFromSystemGesture;
    }

    public final boolean getFocusable() {
        return this.focusable;
    }

    @l
    public final SecureFlagPolicy getSecurePolicy() {
        return this.securePolicy;
    }

    public final boolean getUsePlatformDefaultWidth() {
        return this.usePlatformDefaultWidth;
    }

    public int hashCode() {
        return (((((((((((((Boolean.hashCode(this.dismissOnBackPress) * 31) + Boolean.hashCode(this.focusable)) * 31) + Boolean.hashCode(this.dismissOnBackPress)) * 31) + Boolean.hashCode(this.dismissOnClickOutside)) * 31) + this.securePolicy.hashCode()) * 31) + Boolean.hashCode(this.excludeFromSystemGesture)) * 31) + Boolean.hashCode(this.clippingEnabled)) * 31) + Boolean.hashCode(this.usePlatformDefaultWidth);
    }

    public /* synthetic */ PopupProperties(boolean z4, boolean z5, boolean z6, SecureFlagPolicy secureFlagPolicy, boolean z7, boolean z8, boolean z9, int i5, w wVar) {
        this((i5 & 1) != 0 ? false : z4, (i5 & 2) != 0 ? true : z5, (i5 & 4) != 0 ? true : z6, (i5 & 8) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy, (i5 & 16) != 0 ? true : z7, (i5 & 32) == 0 ? z8 : true, (i5 & 64) != 0 ? false : z9);
    }

    public /* synthetic */ PopupProperties(boolean z4, boolean z5, boolean z6, SecureFlagPolicy secureFlagPolicy, boolean z7, boolean z8, int i5, w wVar) {
        this((i5 & 1) != 0 ? false : z4, (i5 & 2) != 0 ? true : z5, (i5 & 4) != 0 ? true : z6, (i5 & 8) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy, (i5 & 16) != 0 ? true : z7, (i5 & 32) == 0 ? z8 : true);
    }

    public PopupProperties(boolean z4, boolean z5, boolean z6, @l SecureFlagPolicy secureFlagPolicy, boolean z7, boolean z8) {
        this(z4, z5, z6, secureFlagPolicy, z7, z8, false);
    }
}
