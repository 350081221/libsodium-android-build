package androidx.compose.material3;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ModalBottomSheet_androidKt$Scrim$1$1 extends kotlin.jvm.internal.n0 implements v3.l<DrawScope, r2> {
    final /* synthetic */ State<Float> $alpha$delegate;
    final /* synthetic */ long $color;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheet_androidKt$Scrim$1$1(long j5, State<Float> state) {
        super(1);
        this.$color = j5;
        this.$alpha$delegate = state;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(DrawScope drawScope) {
        invoke2(drawScope);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l DrawScope drawScope) {
        float Scrim_3J_VO9M$lambda$5;
        long j5 = this.$color;
        Scrim_3J_VO9M$lambda$5 = ModalBottomSheet_androidKt.Scrim_3J_VO9M$lambda$5(this.$alpha$delegate);
        DrawScope.m4272drawRectnJ9OG0$default(drawScope, j5, 0L, 0L, Scrim_3J_VO9M$lambda$5, null, null, 0, 118, null);
    }
}
