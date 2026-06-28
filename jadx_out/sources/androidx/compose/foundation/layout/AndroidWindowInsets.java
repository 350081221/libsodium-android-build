package androidx.compose.foundation.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;

@Stable
@i0(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\u0006\u0010\u001d\u001a\u00020\u0017¢\u0006\u0004\b-\u0010.J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001f\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0006H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016R\u001a\u0010\u0019\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR+\u0010'\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R+\u0010)\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u00148F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006/"}, d2 = {"Landroidx/compose/foundation/layout/AndroidWindowInsets;", "Landroidx/compose/foundation/layout/WindowInsets;", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "", "getLeft", "getTop", "getRight", "getBottom", "Landroidx/core/view/WindowInsetsCompat;", "windowInsetsCompat", "typeMask", "Lkotlin/r2;", "update$foundation_layout_release", "(Landroidx/core/view/WindowInsetsCompat;I)V", "update", "", "other", "", "equals", TTDownloadField.TT_HASHCODE, "", "toString", "type", "I", "getType$foundation_layout_release", "()I", "name", "Ljava/lang/String;", "Landroidx/core/graphics/Insets;", "<set-?>", "insets$delegate", "Landroidx/compose/runtime/MutableState;", "getInsets$foundation_layout_release", "()Landroidx/core/graphics/Insets;", "setInsets$foundation_layout_release", "(Landroidx/core/graphics/Insets;)V", "insets", "isVisible$delegate", "isVisible", "()Z", "setVisible", "(Z)V", "<init>", "(ILjava/lang/String;)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nWindowInsets.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.android.kt\nandroidx/compose/foundation/layout/AndroidWindowInsets\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,785:1\n81#2:786\n107#2,2:787\n81#2:789\n107#2,2:790\n*S KotlinDebug\n*F\n+ 1 WindowInsets.android.kt\nandroidx/compose/foundation/layout/AndroidWindowInsets\n*L\n59#1:786\n59#1:787,2\n65#1:789\n65#1:790,2\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidWindowInsets implements WindowInsets {
    public static final int $stable = 0;

    @l
    private final MutableState insets$delegate;

    @l
    private final MutableState isVisible$delegate;

    @l
    private final String name;
    private final int type;

    public AndroidWindowInsets(int i5, @l String str) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        this.type = i5;
        this.name = str;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Insets.NONE, null, 2, null);
        this.insets$delegate = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        this.isVisible$delegate = mutableStateOf$default2;
    }

    private final void setVisible(boolean z4) {
        this.isVisible$delegate.setValue(Boolean.valueOf(z4));
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof AndroidWindowInsets) && this.type == ((AndroidWindowInsets) obj).type) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(@l Density density) {
        return getInsets$foundation_layout_release().bottom;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l
    public final Insets getInsets$foundation_layout_release() {
        return (Insets) this.insets$delegate.getValue();
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(@l Density density, @l LayoutDirection layoutDirection) {
        return getInsets$foundation_layout_release().left;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(@l Density density, @l LayoutDirection layoutDirection) {
        return getInsets$foundation_layout_release().right;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(@l Density density) {
        return getInsets$foundation_layout_release().top;
    }

    public final int getType$foundation_layout_release() {
        return this.type;
    }

    public int hashCode() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isVisible() {
        return ((Boolean) this.isVisible$delegate.getValue()).booleanValue();
    }

    public final void setInsets$foundation_layout_release(@l Insets insets) {
        this.insets$delegate.setValue(insets);
    }

    @l
    public String toString() {
        return this.name + '(' + getInsets$foundation_layout_release().left + ", " + getInsets$foundation_layout_release().top + ", " + getInsets$foundation_layout_release().right + ", " + getInsets$foundation_layout_release().bottom + ')';
    }

    public final void update$foundation_layout_release(@l WindowInsetsCompat windowInsetsCompat, int i5) {
        if (i5 == 0 || (i5 & this.type) != 0) {
            setInsets$foundation_layout_release(windowInsetsCompat.getInsets(this.type));
            setVisible(windowInsetsCompat.isVisible(this.type));
        }
    }
}
