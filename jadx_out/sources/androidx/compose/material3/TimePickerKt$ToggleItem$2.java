package androidx.compose.material3;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.graphics.Shape;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TimePickerKt$ToggleItem$2 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $checked;
    final /* synthetic */ TimePickerColors $colors;
    final /* synthetic */ v3.q<RowScope, Composer, Integer, r2> $content;
    final /* synthetic */ v3.a<r2> $onClick;
    final /* synthetic */ Shape $shape;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TimePickerKt$ToggleItem$2(boolean z4, Shape shape, v3.a<r2> aVar, TimePickerColors timePickerColors, v3.q<? super RowScope, ? super Composer, ? super Integer, r2> qVar, int i5) {
        super(2);
        this.$checked = z4;
        this.$shape = shape;
        this.$onClick = aVar;
        this.$colors = timePickerColors;
        this.$content = qVar;
        this.$$changed = i5;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        TimePickerKt.ToggleItem(this.$checked, this.$shape, this.$onClick, this.$colors, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
