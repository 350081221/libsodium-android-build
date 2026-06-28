package androidx.compose.material3;

import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.unit.Density;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ExposedDropdownMenu_androidKt$SoftKeyboardListener$2 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Density $density;
    final /* synthetic */ v3.a<r2> $onKeyboardVisibilityChange;
    final /* synthetic */ View $view;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenu_androidKt$SoftKeyboardListener$2(View view, Density density, v3.a<r2> aVar, int i5) {
        super(2);
        this.$view = view;
        this.$density = density;
        this.$onKeyboardVisibilityChange = aVar;
        this.$$changed = i5;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        ExposedDropdownMenu_androidKt.SoftKeyboardListener(this.$view, this.$density, this.$onKeyboardVisibilityChange, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
