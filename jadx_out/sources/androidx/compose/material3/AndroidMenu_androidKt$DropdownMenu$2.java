package androidx.compose.material3;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.window.PopupProperties;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidMenu_androidKt$DropdownMenu$2 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ v3.q<ColumnScope, Composer, Integer, r2> $content;
    final /* synthetic */ boolean $expanded;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ long $offset;
    final /* synthetic */ v3.a<r2> $onDismissRequest;
    final /* synthetic */ PopupProperties $properties;
    final /* synthetic */ ScrollState $scrollState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AndroidMenu_androidKt$DropdownMenu$2(boolean z4, v3.a<r2> aVar, Modifier modifier, long j5, ScrollState scrollState, PopupProperties popupProperties, v3.q<? super ColumnScope, ? super Composer, ? super Integer, r2> qVar, int i5, int i6) {
        super(2);
        this.$expanded = z4;
        this.$onDismissRequest = aVar;
        this.$modifier = modifier;
        this.$offset = j5;
        this.$scrollState = scrollState;
        this.$properties = popupProperties;
        this.$content = qVar;
        this.$$changed = i5;
        this.$$default = i6;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        AndroidMenu_androidKt.m1553DropdownMenu4kj_NE(this.$expanded, this.$onDismissRequest, this.$modifier, this.$offset, this.$scrollState, this.$properties, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
