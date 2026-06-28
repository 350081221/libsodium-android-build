package androidx.compose.runtime;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.q1;
import kotlin.r2;
import kotlin.u0;
import p4.m;
import v3.t;

/* JADX INFO: Add missing generic type declarations: [P1, R, P2, P3] */
@i0(d1 = {"\u0000\f\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003*\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u00022\u0006\u0010\u0006\u001a\u00028\u0003H\u000b¢\u0006\u0004\b\b\u0010\t"}, d2 = {"R", "P1", "P2", "P3", "p1", "p2", "p3", "Lkotlin/r2;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class MovableContentKt$movableContentWithReceiverOf$4<P1, P2, P3, R> extends n0 implements t<R, P1, P2, P3, Composer, Integer, r2> {
    final /* synthetic */ MovableContent<u0<u0<R, P1>, u0<P2, P3>>> $movableContent;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovableContentKt$movableContentWithReceiverOf$4(MovableContent<u0<u0<R, P1>, u0<P2, P3>>> movableContent) {
        super(6);
        this.$movableContent = movableContent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v3.t
    public /* bridge */ /* synthetic */ r2 invoke(Object obj, Object obj2, Object obj3, Object obj4, Composer composer, Integer num) {
        invoke((MovableContentKt$movableContentWithReceiverOf$4<P1, P2, P3, R>) obj, obj2, obj3, obj4, composer, num.intValue());
        return r2.f19517a;
    }

    @Composable
    public final void invoke(R r5, P1 p12, P2 p22, P3 p32, @m Composer composer, int i5) {
        int i6;
        if ((i5 & 14) == 0) {
            i6 = (composer.changed(r5) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 112) == 0) {
            i6 |= composer.changed(p12) ? 32 : 16;
        }
        if ((i5 & 896) == 0) {
            i6 |= composer.changed(p22) ? 256 : 128;
        }
        if ((i5 & 7168) == 0) {
            i6 |= composer.changed(p32) ? 2048 : 1024;
        }
        if ((46811 & i6) == 9362 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1468683306, i6, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:257)");
        }
        composer.insertMovableContent(this.$movableContent, q1.a(q1.a(r5, p12), q1.a(p22, p32)));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
