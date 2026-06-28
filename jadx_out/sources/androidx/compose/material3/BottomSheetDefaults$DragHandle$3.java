package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BottomSheetDefaults$DragHandle$3 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $color;
    final /* synthetic */ float $height;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ BottomSheetDefaults $tmp1_rcvr;
    final /* synthetic */ float $width;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetDefaults$DragHandle$3(BottomSheetDefaults bottomSheetDefaults, Modifier modifier, float f5, float f6, Shape shape, long j5, int i5, int i6) {
        super(2);
        this.$tmp1_rcvr = bottomSheetDefaults;
        this.$modifier = modifier;
        this.$width = f5;
        this.$height = f6;
        this.$shape = shape;
        this.$color = j5;
        this.$$changed = i5;
        this.$$default = i6;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        this.$tmp1_rcvr.m1574DragHandlelgZ2HuY(this.$modifier, this.$width, this.$height, this.$shape, this.$color, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
