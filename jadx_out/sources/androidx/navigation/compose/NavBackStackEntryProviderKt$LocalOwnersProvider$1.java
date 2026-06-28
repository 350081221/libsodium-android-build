package androidx.navigation.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class NavBackStackEntryProviderKt$LocalOwnersProvider$1 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ p<Composer, Integer, r2> $content;
    final /* synthetic */ SaveableStateHolder $saveableStateHolder;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavBackStackEntryProviderKt$LocalOwnersProvider$1(SaveableStateHolder saveableStateHolder, p<? super Composer, ? super Integer, r2> pVar, int i5) {
        super(2);
        this.$saveableStateHolder = saveableStateHolder;
        this.$content = pVar;
        this.$$dirty = i5;
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
            ComposerKt.traceEventStart(-52928304, i5, -1, "androidx.navigation.compose.LocalOwnersProvider.<anonymous> (NavBackStackEntryProvider.kt:51)");
        }
        NavBackStackEntryProviderKt.SaveableStateProvider(this.$saveableStateHolder, this.$content, composer, ((this.$$dirty >> 3) & 112) | 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
