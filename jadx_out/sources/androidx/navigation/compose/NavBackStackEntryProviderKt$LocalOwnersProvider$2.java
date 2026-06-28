package androidx.navigation.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.navigation.NavBackStackEntry;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NavBackStackEntryProviderKt$LocalOwnersProvider$2 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ p<Composer, Integer, r2> $content;
    final /* synthetic */ SaveableStateHolder $saveableStateHolder;
    final /* synthetic */ NavBackStackEntry $this_LocalOwnersProvider;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavBackStackEntryProviderKt$LocalOwnersProvider$2(NavBackStackEntry navBackStackEntry, SaveableStateHolder saveableStateHolder, p<? super Composer, ? super Integer, r2> pVar, int i5) {
        super(2);
        this.$this_LocalOwnersProvider = navBackStackEntry;
        this.$saveableStateHolder = saveableStateHolder;
        this.$content = pVar;
        this.$$changed = i5;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@m Composer composer, int i5) {
        NavBackStackEntryProviderKt.LocalOwnersProvider(this.$this_LocalOwnersProvider, this.$saveableStateHolder, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
