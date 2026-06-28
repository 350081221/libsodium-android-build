package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ModalBottomSheet_androidKt$Scrim$2 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ long $color;
    final /* synthetic */ v3.a<r2> $onDismissRequest;
    final /* synthetic */ boolean $visible;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheet_androidKt$Scrim$2(long j5, v3.a<r2> aVar, boolean z4, int i5) {
        super(2);
        this.$color = j5;
        this.$onDismissRequest = aVar;
        this.$visible = z4;
        this.$$changed = i5;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        ModalBottomSheet_androidKt.m2000Scrim3JVO9M(this.$color, this.$onDismissRequest, this.$visible, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
