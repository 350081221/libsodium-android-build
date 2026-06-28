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
public final class LazyLayoutPinnableItemKt$LazyLayoutPinnableItem$2 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ p<Composer, Integer, r2> $content;
    final /* synthetic */ int $index;
    final /* synthetic */ Object $key;
    final /* synthetic */ LazyLayoutPinnedItemList $pinnedItemList;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyLayoutPinnableItemKt$LazyLayoutPinnableItem$2(Object obj, int i5, LazyLayoutPinnedItemList lazyLayoutPinnedItemList, p<? super Composer, ? super Integer, r2> pVar, int i6) {
        super(2);
        this.$key = obj;
        this.$index = i5;
        this.$pinnedItemList = lazyLayoutPinnedItemList;
        this.$content = pVar;
        this.$$changed = i6;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@m Composer composer, int i5) {
        LazyLayoutPinnableItemKt.LazyLayoutPinnableItem(this.$key, this.$index, this.$pinnedItemList, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
