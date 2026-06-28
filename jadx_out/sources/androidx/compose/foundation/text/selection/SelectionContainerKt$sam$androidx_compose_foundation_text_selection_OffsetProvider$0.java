package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import kotlin.i0;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.l0;
import kotlin.v;
import p4.l;
import p4.m;

@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SelectionContainerKt$sam$androidx_compose_foundation_text_selection_OffsetProvider$0 implements OffsetProvider, d0 {
    private final /* synthetic */ v3.a function;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SelectionContainerKt$sam$androidx_compose_foundation_text_selection_OffsetProvider$0(v3.a aVar) {
        this.function = aVar;
    }

    public final boolean equals(@m Object obj) {
        if ((obj instanceof OffsetProvider) && (obj instanceof d0)) {
            return l0.g(getFunctionDelegate(), ((d0) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.d0
    @l
    public final v<?> getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.compose.foundation.text.selection.OffsetProvider
    /* renamed from: provide-F1C5BW0 */
    public final /* synthetic */ long mo827provideF1C5BW0() {
        return ((Offset) this.function.invoke()).m3503unboximpl();
    }
}
