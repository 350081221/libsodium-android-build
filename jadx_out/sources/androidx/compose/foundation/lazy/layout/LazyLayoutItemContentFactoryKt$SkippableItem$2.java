package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyLayoutItemContentFactoryKt$SkippableItem$2 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $index;
    final /* synthetic */ LazyLayoutItemProvider $itemProvider;
    final /* synthetic */ Object $key;
    final /* synthetic */ Object $saveableStateHolder;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutItemContentFactoryKt$SkippableItem$2(LazyLayoutItemProvider lazyLayoutItemProvider, Object obj, int i5, Object obj2, int i6) {
        super(2);
        this.$itemProvider = lazyLayoutItemProvider;
        this.$saveableStateHolder = obj;
        this.$index = i5;
        this.$key = obj2;
        this.$$changed = i6;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@m Composer composer, int i5) {
        LazyLayoutItemContentFactoryKt.m714SkippableItemJVlU9Rs(this.$itemProvider, this.$saveableStateHolder, this.$index, this.$key, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
