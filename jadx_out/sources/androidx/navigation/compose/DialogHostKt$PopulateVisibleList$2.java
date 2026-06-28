package androidx.navigation.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.navigation.NavBackStackEntry;
import java.util.Collection;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DialogHostKt$PopulateVisibleList$2 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Collection<NavBackStackEntry> $backStack;
    final /* synthetic */ List<NavBackStackEntry> $this_PopulateVisibleList;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogHostKt$PopulateVisibleList$2(List<NavBackStackEntry> list, Collection<NavBackStackEntry> collection, int i5) {
        super(2);
        this.$this_PopulateVisibleList = list;
        this.$backStack = collection;
        this.$$changed = i5;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@m Composer composer, int i5) {
        DialogHostKt.PopulateVisibleList(this.$this_PopulateVisibleList, this.$backStack, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
