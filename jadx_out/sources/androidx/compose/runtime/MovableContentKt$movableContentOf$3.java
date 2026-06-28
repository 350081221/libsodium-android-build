package androidx.compose.runtime;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.q1;
import kotlin.r2;
import kotlin.u0;
import p4.m;
import v3.r;

/* JADX INFO: Add missing generic type declarations: [P1, P2] */
@i0(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"P1", "P2", "p1", "p2", "Lkotlin/r2;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class MovableContentKt$movableContentOf$3<P1, P2> extends n0 implements r<P1, P2, Composer, Integer, r2> {
    final /* synthetic */ MovableContent<u0<P1, P2>> $movableContent;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovableContentKt$movableContentOf$3(MovableContent<u0<P1, P2>> movableContent) {
        super(4);
        this.$movableContent = movableContent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v3.r
    public /* bridge */ /* synthetic */ r2 invoke(Object obj, Object obj2, Composer composer, Integer num) {
        invoke((MovableContentKt$movableContentOf$3<P1, P2>) obj, obj2, composer, num.intValue());
        return r2.f19517a;
    }

    @Composable
    public final void invoke(P1 p12, P2 p22, @m Composer composer, int i5) {
        int i6;
        if ((i5 & 14) == 0) {
            i6 = (composer.changed(p12) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 112) == 0) {
            i6 |= composer.changed(p22) ? 32 : 16;
        }
        if ((i6 & 731) == 146 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1200019734, i6, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:89)");
        }
        composer.insertMovableContent(this.$movableContent, q1.a(p12, p22));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
