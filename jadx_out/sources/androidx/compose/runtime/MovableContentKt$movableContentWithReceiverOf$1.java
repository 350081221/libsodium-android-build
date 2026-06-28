package androidx.compose.runtime;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.q;

/* JADX INFO: Add missing generic type declarations: [R] */
@i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u00028\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"R", "Lkotlin/r2;", "invoke", "(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class MovableContentKt$movableContentWithReceiverOf$1<R> extends n0 implements q<R, Composer, Integer, r2> {
    final /* synthetic */ MovableContent<R> $movableContent;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovableContentKt$movableContentWithReceiverOf$1(MovableContent<R> movableContent) {
        super(3);
        this.$movableContent = movableContent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v3.q
    public /* bridge */ /* synthetic */ r2 invoke(Object obj, Composer composer, Integer num) {
        invoke((MovableContentKt$movableContentWithReceiverOf$1<R>) obj, composer, num.intValue());
        return r2.f19517a;
    }

    @Composable
    public final void invoke(R r5, @m Composer composer, int i5) {
        if ((i5 & 14) == 0) {
            i5 |= composer.changed(r5) ? 4 : 2;
        }
        if ((i5 & 91) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(506997506, i5, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:172)");
        }
        composer.insertMovableContent(this.$movableContent, r5);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
