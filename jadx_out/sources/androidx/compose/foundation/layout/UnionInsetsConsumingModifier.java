package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;

@Stable
@i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0016J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/layout/UnionInsetsConsumingModifier;", "Landroidx/compose/foundation/layout/InsetsConsumingModifier;", "insets", "Landroidx/compose/foundation/layout/WindowInsets;", "(Landroidx/compose/foundation/layout/WindowInsets;)V", "calculateInsets", "modifierLocalInsets", "equals", "", "other", "", TTDownloadField.TT_HASHCODE, "", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class UnionInsetsConsumingModifier extends InsetsConsumingModifier {

    @l
    private final WindowInsets insets;

    public UnionInsetsConsumingModifier(@l WindowInsets windowInsets) {
        super(null);
        this.insets = windowInsets;
    }

    @Override // androidx.compose.foundation.layout.InsetsConsumingModifier
    @l
    public WindowInsets calculateInsets(@l WindowInsets windowInsets) {
        return WindowInsetsKt.union(this.insets, windowInsets);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnionInsetsConsumingModifier)) {
            return false;
        }
        return l0.g(((UnionInsetsConsumingModifier) obj).insets, this.insets);
    }

    public int hashCode() {
        return this.insets.hashCode();
    }
}
