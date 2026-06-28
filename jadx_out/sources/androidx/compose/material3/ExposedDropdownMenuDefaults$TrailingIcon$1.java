package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ExposedDropdownMenuDefaults$TrailingIcon$1 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $expanded;
    final /* synthetic */ ExposedDropdownMenuDefaults $tmp0_rcvr;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuDefaults$TrailingIcon$1(ExposedDropdownMenuDefaults exposedDropdownMenuDefaults, boolean z4, int i5) {
        super(2);
        this.$tmp0_rcvr = exposedDropdownMenuDefaults;
        this.$expanded = z4;
        this.$$changed = i5;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        this.$tmp0_rcvr.TrailingIcon(this.$expanded, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
