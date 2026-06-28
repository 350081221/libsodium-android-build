package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DatePickerDefaults$DatePickerHeadline$2 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ DatePickerFormatter $dateFormatter;
    final /* synthetic */ int $displayMode;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Long $selectedDateMillis;
    final /* synthetic */ DatePickerDefaults $tmp9_rcvr;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerDefaults$DatePickerHeadline$2(DatePickerDefaults datePickerDefaults, Long l5, int i5, DatePickerFormatter datePickerFormatter, Modifier modifier, int i6, int i7) {
        super(2);
        this.$tmp9_rcvr = datePickerDefaults;
        this.$selectedDateMillis = l5;
        this.$displayMode = i5;
        this.$dateFormatter = datePickerFormatter;
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
        this.$tmp9_rcvr.m1801DatePickerHeadline3kbWawI(this.$selectedDateMillis, this.$displayMode, this.$dateFormatter, this.$modifier, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
