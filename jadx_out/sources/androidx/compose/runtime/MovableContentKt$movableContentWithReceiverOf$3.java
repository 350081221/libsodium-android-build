package androidx.compose.runtime;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.q1;
import kotlin.r2;
import kotlin.u0;
import p4.m;
import v3.s;

/* JADX INFO: Add missing generic type declarations: [P1, R, P2] */
@i0(d1 = {"\u0000\f\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00028\u0002H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "P1", "P2", "p1", "p2", "Lkotlin/r2;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class MovableContentKt$movableContentWithReceiverOf$3<P1, P2, R> extends n0 implements s<R, P1, P2, Composer, Integer, r2> {
    final /* synthetic */ MovableContent<u0<u0<R, P1>, P2>> $movableContent;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovableContentKt$movableContentWithReceiverOf$3(MovableContent<u0<u0<R, P1>, P2>> movableContent) {
        super(5);
        this.$movableContent = movableContent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v3.s
    public /* bridge */ /* synthetic */ r2 invoke(Object obj, Object obj2, Object obj3, Composer composer, Integer num) {
        invoke((MovableContentKt$movableContentWithReceiverOf$3<P1, P2, R>) obj, obj2, obj3, composer, num.intValue());
        return r2.f19517a;
    }

    @Composable
    public final void invoke(R r5, P1 p12, P2 p22, @m Composer composer, int i5) {
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
        if ((i6 & 5851) == 1170 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(583402949, i6, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:228)");
        }
        composer.insertMovableContent(this.$movableContent, q1.a(q1.a(r5, p12), p22));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
