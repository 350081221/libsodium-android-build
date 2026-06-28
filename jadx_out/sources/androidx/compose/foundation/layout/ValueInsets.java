package androidx.compose.foundation.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;

@Stable
@i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u001e\u001a\u00020\u0016H\u0016J\b\u0010\u001f\u001a\u00020\u0005H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR+\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00038@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006 "}, d2 = {"Landroidx/compose/foundation/layout/ValueInsets;", "Landroidx/compose/foundation/layout/WindowInsets;", "insets", "Landroidx/compose/foundation/layout/InsetsValues;", "name", "", "(Landroidx/compose/foundation/layout/InsetsValues;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "<set-?>", t0.b.f22420d, "getValue$foundation_layout_release", "()Landroidx/compose/foundation/layout/InsetsValues;", "setValue$foundation_layout_release", "(Landroidx/compose/foundation/layout/InsetsValues;)V", "value$delegate", "Landroidx/compose/runtime/MutableState;", "equals", "", "other", "", "getBottom", "", "density", "Landroidx/compose/ui/unit/Density;", "getLeft", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getRight", "getTop", TTDownloadField.TT_HASHCODE, "toString", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nWindowInsets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/ValueInsets\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,748:1\n81#2:749\n107#2,2:750\n*S KotlinDebug\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/ValueInsets\n*L\n367#1:749\n367#1:750,2\n*E\n"})
/* loaded from: classes.dex */
public final class ValueInsets implements WindowInsets {
    public static final int $stable = 0;

    @l
    private final String name;

    @l
    private final MutableState value$delegate;

    public ValueInsets(@l InsetsValues insetsValues, @l String str) {
        MutableState mutableStateOf$default;
        this.name = str;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(insetsValues, null, 2, null);
        this.value$delegate = mutableStateOf$default;
    }

    public boolean equals(@m Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ValueInsets)) {
            return false;
        }
        return l0.g(getValue$foundation_layout_release(), ((ValueInsets) obj).getValue$foundation_layout_release());
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(@l Density density) {
        return getValue$foundation_layout_release().getBottom();
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(@l Density density, @l LayoutDirection layoutDirection) {
        return getValue$foundation_layout_release().getLeft();
    }

    @l
    public final String getName() {
        return this.name;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(@l Density density, @l LayoutDirection layoutDirection) {
        return getValue$foundation_layout_release().getRight();
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(@l Density density) {
        return getValue$foundation_layout_release().getTop();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l
    public final InsetsValues getValue$foundation_layout_release() {
        return (InsetsValues) this.value$delegate.getValue();
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public final void setValue$foundation_layout_release(@l InsetsValues insetsValues) {
        this.value$delegate.setValue(insetsValues);
    }

    @l
    public String toString() {
        return this.name + "(left=" + getValue$foundation_layout_release().getLeft() + ", top=" + getValue$foundation_layout_release().getTop() + ", right=" + getValue$foundation_layout_release().getRight() + ", bottom=" + getValue$foundation_layout_release().getBottom() + ')';
    }
}
