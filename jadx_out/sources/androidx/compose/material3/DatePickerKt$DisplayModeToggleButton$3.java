package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DatePickerKt$DisplayModeToggleButton$3 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $displayMode;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ v3.l<DisplayMode, r2> $onDisplayModeChange;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DatePickerKt$DisplayModeToggleButton$3(Modifier modifier, int i5, v3.l<? super DisplayMode, r2> lVar, int i6) {
        super(2);
        this.$modifier = modifier;
        this.$displayMode = i5;
        this.$onDisplayModeChange = lVar;
        this.$$changed = i6;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        DatePickerKt.m1810DisplayModeToggleButtontER2X8s(this.$modifier, this.$displayMode, this.$onDisplayModeChange, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
