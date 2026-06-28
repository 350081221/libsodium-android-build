package androidx.compose.runtime;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.q1;
import kotlin.r2;
import kotlin.u0;
import p4.m;
import v3.t;

/* JADX INFO: Add missing generic type declarations: [P1, P2, P3, P4] */
@i0(d1 = {"\u0000\f\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u000b\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00028\u00022\u0006\u0010\u0007\u001a\u00028\u0003H\u000b¢\u0006\u0004\b\t\u0010\n"}, d2 = {"P1", "P2", "P3", "P4", "p1", "p2", "p3", "p4", "Lkotlin/r2;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class MovableContentKt$movableContentOf$5<P1, P2, P3, P4> extends n0 implements t<P1, P2, P3, P4, Composer, Integer, r2> {
    final /* synthetic */ MovableContent<u0<u0<P1, P2>, u0<P3, P4>>> $movableContent;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovableContentKt$movableContentOf$5(MovableContent<u0<u0<P1, P2>, u0<P3, P4>>> movableContent) {
        super(6);
        this.$movableContent = movableContent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v3.t
    public /* bridge */ /* synthetic */ r2 invoke(Object obj, Object obj2, Object obj3, Object obj4, Composer composer, Integer num) {
        invoke((MovableContentKt$movableContentOf$5<P1, P2, P3, P4>) obj, obj2, obj3, obj4, composer, num.intValue());
        return r2.f19517a;
    }

    @Composable
    public final void invoke(P1 p12, P2 p22, P3 p32, P4 p42, @m Composer composer, int i5) {
        int i6;
        if ((i5 & 14) == 0) {
            i6 = (composer.changed(p12) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 112) == 0) {
            i6 |= composer.changed(p22) ? 32 : 16;
        }
        if ((i5 & 896) == 0) {
            i6 |= composer.changed(p32) ? 256 : 128;
        }
        if ((i5 & 7168) == 0) {
            i6 |= composer.changed(p42) ? 2048 : 1024;
        }
        if ((46811 & i6) == 9362 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1741877681, i6, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:147)");
        }
        composer.insertMovableContent(this.$movableContent, q1.a(q1.a(p12, p22), q1.a(p32, p42)));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
