package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.text.TextStyle;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ChipKt$ChipContent$2 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ v3.p<Composer, Integer, r2> $avatar;
    final /* synthetic */ v3.p<Composer, Integer, r2> $label;
    final /* synthetic */ long $labelColor;
    final /* synthetic */ TextStyle $labelTextStyle;
    final /* synthetic */ v3.p<Composer, Integer, r2> $leadingIcon;
    final /* synthetic */ long $leadingIconColor;
    final /* synthetic */ float $minHeight;
    final /* synthetic */ PaddingValues $paddingValues;
    final /* synthetic */ v3.p<Composer, Integer, r2> $trailingIcon;
    final /* synthetic */ long $trailingIconColor;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChipKt$ChipContent$2(v3.p<? super Composer, ? super Integer, r2> pVar, TextStyle textStyle, long j5, v3.p<? super Composer, ? super Integer, r2> pVar2, v3.p<? super Composer, ? super Integer, r2> pVar3, v3.p<? super Composer, ? super Integer, r2> pVar4, long j6, long j7, float f5, PaddingValues paddingValues, int i5) {
        super(2);
        this.$label = pVar;
        this.$labelTextStyle = textStyle;
        this.$labelColor = j5;
        this.$leadingIcon = pVar2;
        this.$avatar = pVar3;
        this.$trailingIcon = pVar4;
        this.$leadingIconColor = j6;
        this.$trailingIconColor = j7;
        this.$minHeight = f5;
        this.$paddingValues = paddingValues;
        this.$$changed = i5;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        ChipKt.m1669ChipContentfe0OD_I(this.$label, this.$labelTextStyle, this.$labelColor, this.$leadingIcon, this.$avatar, this.$trailingIcon, this.$leadingIconColor, this.$trailingIconColor, this.$minHeight, this.$paddingValues, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
