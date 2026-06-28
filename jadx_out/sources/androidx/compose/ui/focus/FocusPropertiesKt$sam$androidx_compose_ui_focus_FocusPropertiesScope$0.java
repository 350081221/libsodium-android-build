package androidx.compose.ui.focus;

import kotlin.i0;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.l0;
import kotlin.v;
import p4.m;
import v3.l;

@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class FocusPropertiesKt$sam$androidx_compose_ui_focus_FocusPropertiesScope$0 implements FocusPropertiesScope, d0 {
    private final /* synthetic */ l function;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FocusPropertiesKt$sam$androidx_compose_ui_focus_FocusPropertiesScope$0(l lVar) {
        this.function = lVar;
    }

    @Override // androidx.compose.ui.focus.FocusPropertiesScope
    public final /* synthetic */ void apply(FocusProperties focusProperties) {
        this.function.invoke(focusProperties);
    }

    public final boolean equals(@m Object obj) {
        if ((obj instanceof FocusPropertiesScope) && (obj instanceof d0)) {
            return l0.g(getFunctionDelegate(), ((d0) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.d0
    @p4.l
    public final v<?> getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
