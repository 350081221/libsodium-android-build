package androidx.compose.foundation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CanvasKt$Canvas$1 extends n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ v3.l<DrawScope, r2> $onDraw;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CanvasKt$Canvas$1(Modifier modifier, v3.l<? super DrawScope, r2> lVar, int i5) {
        super(2);
        this.$modifier = modifier;
        this.$onDraw = lVar;
        this.$$changed = i5;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        CanvasKt.Canvas(this.$modifier, this.$onDraw, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
