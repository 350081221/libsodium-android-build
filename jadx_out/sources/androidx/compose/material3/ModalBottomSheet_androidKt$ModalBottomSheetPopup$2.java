package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ModalBottomSheet_androidKt$ModalBottomSheetPopup$2 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ v3.p<Composer, Integer, r2> $content;
    final /* synthetic */ v3.a<r2> $onDismissRequest;
    final /* synthetic */ ModalBottomSheetProperties $properties;
    final /* synthetic */ WindowInsets $windowInsets;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ModalBottomSheet_androidKt$ModalBottomSheetPopup$2(ModalBottomSheetProperties modalBottomSheetProperties, v3.a<r2> aVar, WindowInsets windowInsets, v3.p<? super Composer, ? super Integer, r2> pVar, int i5) {
        super(2);
        this.$properties = modalBottomSheetProperties;
        this.$onDismissRequest = aVar;
        this.$windowInsets = windowInsets;
        this.$content = pVar;
        this.$$changed = i5;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        ModalBottomSheet_androidKt.ModalBottomSheetPopup(this.$properties, this.$onDismissRequest, this.$windowInsets, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
