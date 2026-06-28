package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DateRangePickerDefaults$DateRangePickerTitle$1 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ int $displayMode;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ DateRangePickerDefaults $tmp0_rcvr;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateRangePickerDefaults$DateRangePickerTitle$1(DateRangePickerDefaults dateRangePickerDefaults, int i5, Modifier modifier, int i6, int i7) {
        super(2);
        this.$tmp0_rcvr = dateRangePickerDefaults;
        this.$displayMode = i5;
        this.$modifier = modifier;
        this.$$changed = i6;
        this.$$default = i7;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        this.$tmp0_rcvr.m1822DateRangePickerTitlehOD91z4(this.$displayMode, this.$modifier, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
