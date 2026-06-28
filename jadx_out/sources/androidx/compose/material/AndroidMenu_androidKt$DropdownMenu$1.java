package androidx.compose.material;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.window.PopupProperties;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.a;
import v3.p;
import v3.q;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidMenu_androidKt$DropdownMenu$1 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ q<ColumnScope, Composer, Integer, r2> $content;
    final /* synthetic */ boolean $expanded;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ long $offset;
    final /* synthetic */ a<r2> $onDismissRequest;
    final /* synthetic */ PopupProperties $properties;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AndroidMenu_androidKt$DropdownMenu$1(boolean z4, a<r2> aVar, Modifier modifier, long j5, PopupProperties popupProperties, q<? super ColumnScope, ? super Composer, ? super Integer, r2> qVar, int i5, int i6) {
        super(2);
        this.$expanded = z4;
        this.$onDismissRequest = aVar;
        this.$modifier = modifier;
        this.$offset = j5;
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

    public final void invoke(@m Composer composer, int i5) {
        AndroidMenu_androidKt.m1196DropdownMenuILWXrKs(this.$expanded, this.$onDismissRequest, this.$modifier, this.$offset, this.$properties, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
