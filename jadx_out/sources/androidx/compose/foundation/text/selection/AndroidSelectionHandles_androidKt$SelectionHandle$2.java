package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidSelectionHandles_androidKt$SelectionHandle$2 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ ResolvedTextDirection $direction;
    final /* synthetic */ boolean $handlesCrossed;
    final /* synthetic */ boolean $isStartHandle;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ OffsetProvider $offsetProvider;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidSelectionHandles_androidKt$SelectionHandle$2(OffsetProvider offsetProvider, boolean z4, ResolvedTextDirection resolvedTextDirection, boolean z5, Modifier modifier, int i5) {
        super(2);
        this.$offsetProvider = offsetProvider;
        this.$isStartHandle = z4;
        this.$direction = resolvedTextDirection;
        this.$handlesCrossed = z5;
        this.$modifier = modifier;
        this.$$changed = i5;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@m Composer composer, int i5) {
        AndroidSelectionHandles_androidKt.SelectionHandle(this.$offsetProvider, this.$isStartHandle, this.$direction, this.$handlesCrossed, this.$modifier, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
