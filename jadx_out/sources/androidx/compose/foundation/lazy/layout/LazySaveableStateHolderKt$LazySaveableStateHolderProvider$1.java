package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateHolderKt;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.p;
import v3.q;

@i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class LazySaveableStateHolderKt$LazySaveableStateHolderProvider$1 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ q<SaveableStateHolder, Composer, Integer, r2> $content;
    final /* synthetic */ LazySaveableStateHolder $holder;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazySaveableStateHolderKt$LazySaveableStateHolderProvider$1(LazySaveableStateHolder lazySaveableStateHolder, q<? super SaveableStateHolder, ? super Composer, ? super Integer, r2> qVar) {
        super(2);
        this.$holder = lazySaveableStateHolder;
        this.$content = qVar;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    @Composable
    public final void invoke(@m Composer composer, int i5) {
        if ((i5 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1863926504, i5, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider.<anonymous> (LazySaveableStateHolder.kt:49)");
        }
        this.$holder.setWrappedHolder(SaveableStateHolderKt.rememberSaveableStateHolder(composer, 0));
        this.$content.invoke(this.$holder, composer, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
