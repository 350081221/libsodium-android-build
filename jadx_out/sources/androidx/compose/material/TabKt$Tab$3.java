package androidx.compose.material;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.a;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TabKt$Tab$3 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ p<Composer, Integer, r2> $icon;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ a<r2> $onClick;
    final /* synthetic */ boolean $selected;
    final /* synthetic */ long $selectedContentColor;
    final /* synthetic */ p<Composer, Integer, r2> $text;
    final /* synthetic */ long $unselectedContentColor;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TabKt$Tab$3(boolean z4, a<r2> aVar, Modifier modifier, boolean z5, p<? super Composer, ? super Integer, r2> pVar, p<? super Composer, ? super Integer, r2> pVar2, MutableInteractionSource mutableInteractionSource, long j5, long j6, int i5, int i6) {
        super(2);
        this.$selected = z4;
        this.$onClick = aVar;
        this.$modifier = modifier;
        this.$enabled = z5;
        this.$text = pVar;
        this.$icon = pVar2;
        this.$interactionSource = mutableInteractionSource;
        this.$selectedContentColor = j5;
        this.$unselectedContentColor = j6;
        this.$$changed = i5;
        this.$$default = i6;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@m Composer composer, int i5) {
        TabKt.m1471Tab0nDMI0(this.$selected, this.$onClick, this.$modifier, this.$enabled, this.$text, this.$icon, this.$interactionSource, this.$selectedContentColor, this.$unselectedContentColor, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
