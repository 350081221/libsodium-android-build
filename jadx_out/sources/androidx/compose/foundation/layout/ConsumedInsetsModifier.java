package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@Stable
@i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\f¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/layout/ConsumedInsetsModifier;", "Landroidx/compose/ui/modifier/ModifierLocalConsumer;", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "scope", "Lkotlin/r2;", "onModifierLocalsUpdated", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/WindowInsets;", "block", "Lv3/l;", "oldWindowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "<init>", "(Lv3/l;)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ConsumedInsetsModifier implements ModifierLocalConsumer {

    @l
    private final v3.l<WindowInsets, r2> block;

    @m
    private WindowInsets oldWindowInsets;

    /* JADX WARN: Multi-variable type inference failed */
    public ConsumedInsetsModifier(@l v3.l<? super WindowInsets, r2> lVar) {
        this.block = lVar;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConsumedInsetsModifier)) {
            return false;
        }
        return l0.g(((ConsumedInsetsModifier) obj).block, this.block);
    }

    public int hashCode() {
        return this.block.hashCode();
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
    public void onModifierLocalsUpdated(@l ModifierLocalReadScope modifierLocalReadScope) {
        WindowInsets windowInsets = (WindowInsets) modifierLocalReadScope.getCurrent(WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets());
        if (!l0.g(windowInsets, this.oldWindowInsets)) {
            this.oldWindowInsets = windowInsets;
            this.block.invoke(windowInsets);
        }
    }
}
