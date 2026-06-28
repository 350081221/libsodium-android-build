package androidx.compose.runtime;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.q1;
import kotlin.r2;
import kotlin.u0;
import p4.m;
import v3.r;

/* JADX INFO: Add missing generic type declarations: [P, R] */
@i0(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "P", "it", "Lkotlin/r2;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class MovableContentKt$movableContentWithReceiverOf$2<P, R> extends n0 implements r<R, P, Composer, Integer, r2> {
    final /* synthetic */ MovableContent<u0<R, P>> $movableContent;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovableContentKt$movableContentWithReceiverOf$2(MovableContent<u0<R, P>> movableContent) {
        super(4);
        this.$movableContent = movableContent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v3.r
    public /* bridge */ /* synthetic */ r2 invoke(Object obj, Object obj2, Composer composer, Integer num) {
        invoke((MovableContentKt$movableContentWithReceiverOf$2<P, R>) obj, obj2, composer, num.intValue());
        return r2.f19517a;
    }

    @Composable
    public final void invoke(R r5, P p5, @m Composer composer, int i5) {
        int i6;
        if ((i5 & 14) == 0) {
            i6 = (composer.changed(r5) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 112) == 0) {
            i6 |= composer.changed(p5) ? 32 : 16;
        }
        if ((i6 & 731) == 146 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(627354118, i6, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:199)");
        }
        composer.insertMovableContent(this.$movableContent, q1.a(r5, p5));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
