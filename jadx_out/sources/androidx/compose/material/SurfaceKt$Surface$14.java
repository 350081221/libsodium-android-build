package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.semantics.Role;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.a;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SurfaceKt$Surface$14 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ BorderStroke $border;
    final /* synthetic */ long $color;
    final /* synthetic */ p<Composer, Integer, r2> $content;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ float $elevation;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Indication $indication;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ a<r2> $onClick;
    final /* synthetic */ String $onClickLabel;
    final /* synthetic */ Role $role;
    final /* synthetic */ Shape $shape;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SurfaceKt$Surface$14(a<r2> aVar, Modifier modifier, Shape shape, long j5, long j6, BorderStroke borderStroke, float f5, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z4, String str, Role role, p<? super Composer, ? super Integer, r2> pVar, int i5, int i6, int i7) {
        super(2);
        this.$onClick = aVar;
        this.$modifier = modifier;
        this.$shape = shape;
        this.$color = j5;
        this.$contentColor = j6;
        this.$border = borderStroke;
        this.$elevation = f5;
        this.$interactionSource = mutableInteractionSource;
        this.$indication = indication;
        this.$enabled = z4;
        this.$onClickLabel = str;
        this.$role = role;
        this.$content = pVar;
        this.$$changed = i5;
        this.$$changed1 = i6;
        this.$$default = i7;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@m Composer composer, int i5) {
        SurfaceKt.m1453Surface9VG74zQ(this.$onClick, this.$modifier, this.$shape, this.$color, this.$contentColor, this.$border, this.$elevation, this.$interactionSource, this.$indication, this.$enabled, this.$onClickLabel, this.$role, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), this.$$default);
    }
}
