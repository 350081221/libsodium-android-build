package androidx.compose.runtime;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import kotlin.u0;
import p4.l;
import p4.m;
import v3.q;
import v3.s;

/* JADX INFO: Add missing generic type declarations: [P1, P2, P3] */
@i0(d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u001e\u0010\u0004\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0004\u0012\u00028\u00020\u0003H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"P1", "P2", "P3", "Lkotlin/u0;", "it", "Lkotlin/r2;", "invoke", "(Lkotlin/u0;Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class MovableContentKt$movableContentOf$movableContent$3<P1, P2, P3> extends n0 implements q<u0<? extends u0<? extends P1, ? extends P2>, ? extends P3>, Composer, Integer, r2> {
    final /* synthetic */ s<P1, P2, P3, Composer, Integer, r2> $content;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MovableContentKt$movableContentOf$movableContent$3(s<? super P1, ? super P2, ? super P3, ? super Composer, ? super Integer, r2> sVar) {
        super(3);
        this.$content = sVar;
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ r2 invoke(Object obj, Composer composer, Integer num) {
        invoke((u0) obj, composer, num.intValue());
        return r2.f19517a;
    }

    @Composable
    public final void invoke(@l u0<? extends u0<? extends P1, ? extends P2>, ? extends P3> u0Var, @m Composer composer, int i5) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-284417101, i5, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:115)");
        }
        this.$content.invoke(u0Var.getFirst().getFirst(), u0Var.getFirst().getSecond(), u0Var.getSecond(), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
