package androidx.compose.material3;

import android.view.accessibility.AccessibilityManager;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.r1;

@kotlin.i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tR+\u0010\u0014\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R+\u0010\u0018\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u0014\u0010\u001b\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Landroidx/compose/material3/Listener;", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "Landroidx/compose/runtime/State;", "", "it", "Lkotlin/r2;", "onAccessibilityStateChanged", "onTouchExplorationStateChanged", "Landroid/view/accessibility/AccessibilityManager;", "am", "register", "unregister", "<set-?>", "accessibilityEnabled$delegate", "Landroidx/compose/runtime/MutableState;", "getAccessibilityEnabled", "()Z", "setAccessibilityEnabled", "(Z)V", "accessibilityEnabled", "touchExplorationEnabled$delegate", "getTouchExplorationEnabled", "setTouchExplorationEnabled", "touchExplorationEnabled", "getValue", "()Ljava/lang/Boolean;", t0.b.f22420d, "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nTouchExplorationStateProvider.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TouchExplorationStateProvider.android.kt\nandroidx/compose/material3/Listener\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,108:1\n81#2:109\n107#2,2:110\n81#2:112\n107#2,2:113\n*S KotlinDebug\n*F\n+ 1 TouchExplorationStateProvider.android.kt\nandroidx/compose/material3/Listener\n*L\n81#1:109\n81#1:110,2\n82#1:112\n82#1:113,2\n*E\n"})
/* loaded from: classes.dex */
final class Listener implements AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener, State<Boolean> {

    @p4.l
    private final MutableState accessibilityEnabled$delegate;

    @p4.l
    private final MutableState touchExplorationEnabled$delegate;

    public Listener() {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        Boolean bool = Boolean.FALSE;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.accessibilityEnabled$delegate = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.touchExplorationEnabled$delegate = mutableStateOf$default2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getAccessibilityEnabled() {
        return ((Boolean) this.accessibilityEnabled$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getTouchExplorationEnabled() {
        return ((Boolean) this.touchExplorationEnabled$delegate.getValue()).booleanValue();
    }

    private final void setAccessibilityEnabled(boolean z4) {
        this.accessibilityEnabled$delegate.setValue(Boolean.valueOf(z4));
    }

    private final void setTouchExplorationEnabled(boolean z4) {
        this.touchExplorationEnabled$delegate.setValue(Boolean.valueOf(z4));
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public void onAccessibilityStateChanged(boolean z4) {
        setAccessibilityEnabled(z4);
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public void onTouchExplorationStateChanged(boolean z4) {
        setTouchExplorationEnabled(z4);
    }

    public final void register(@p4.l AccessibilityManager accessibilityManager) {
        setAccessibilityEnabled(accessibilityManager.isEnabled());
        setTouchExplorationEnabled(accessibilityManager.isTouchExplorationEnabled());
        accessibilityManager.addTouchExplorationStateChangeListener(this);
        accessibilityManager.addAccessibilityStateChangeListener(this);
    }

    public final void unregister(@p4.l AccessibilityManager accessibilityManager) {
        accessibilityManager.removeTouchExplorationStateChangeListener(this);
        accessibilityManager.removeAccessibilityStateChangeListener(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.State
    @p4.l
    public Boolean getValue() {
        return Boolean.valueOf(getAccessibilityEnabled() && getTouchExplorationEnabled());
    }
}
