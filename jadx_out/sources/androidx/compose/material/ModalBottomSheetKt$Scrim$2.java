package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.a;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ModalBottomSheetKt$Scrim$2 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ long $color;
    final /* synthetic */ a<r2> $onDismiss;
    final /* synthetic */ boolean $visible;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetKt$Scrim$2(long j5, a<r2> aVar, boolean z4, int i5) {
        super(2);
        this.$color = j5;
        this.$onDismiss = aVar;
        this.$visible = z4;
        this.$$changed = i5;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@m Composer composer, int i5) {
        ModalBottomSheetKt.m1377Scrim3JVO9M(this.$color, this.$onDismiss, this.$visible, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
