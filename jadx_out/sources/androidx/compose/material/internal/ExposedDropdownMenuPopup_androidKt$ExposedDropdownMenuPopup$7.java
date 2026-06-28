package androidx.compose.material.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.window.PopupPositionProvider;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.a;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$7 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ p<Composer, Integer, r2> $content;
    final /* synthetic */ a<r2> $onDismissRequest;
    final /* synthetic */ PopupPositionProvider $popupPositionProvider;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$7(a<r2> aVar, PopupPositionProvider popupPositionProvider, p<? super Composer, ? super Integer, r2> pVar, int i5, int i6) {
        super(2);
        this.$onDismissRequest = aVar;
        this.$popupPositionProvider = popupPositionProvider;
        this.$content = pVar;
        this.$$changed = i5;
        this.$$default = i6;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@m Composer composer, int i5) {
        ExposedDropdownMenuPopup_androidKt.ExposedDropdownMenuPopup(this.$onDismissRequest, this.$popupPositionProvider, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
