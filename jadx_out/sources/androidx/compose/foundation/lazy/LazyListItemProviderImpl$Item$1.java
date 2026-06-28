package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nLazyListItemProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListItemProvider.kt\nandroidx/compose/foundation/lazy/LazyListItemProviderImpl$Item$1\n+ 2 LazyLayoutIntervalContent.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent\n*L\n1#1,106:1\n60#2,3:107\n*S KotlinDebug\n*F\n+ 1 LazyListItemProvider.kt\nandroidx/compose/foundation/lazy/LazyListItemProviderImpl$Item$1\n*L\n78#1:107,3\n*E\n"})
/* loaded from: classes.dex */
public final class LazyListItemProviderImpl$Item$1 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $index;
    final /* synthetic */ LazyListItemProviderImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyListItemProviderImpl$Item$1(LazyListItemProviderImpl lazyListItemProviderImpl, int i5) {
        super(2);
        this.this$0 = lazyListItemProviderImpl;
        this.$index = i5;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    @Composable
    public final void invoke(@m Composer composer, int i5) {
        LazyListIntervalContent lazyListIntervalContent;
        if ((i5 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-824725566, i5, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item.<anonymous> (LazyListItemProvider.kt:77)");
        }
        lazyListIntervalContent = this.this$0.intervalContent;
        int i6 = this.$index;
        LazyListItemProviderImpl lazyListItemProviderImpl = this.this$0;
        IntervalList.Interval<LazyListInterval> interval = lazyListIntervalContent.getIntervals().get(i6);
        interval.getValue().getItem().invoke(lazyListItemProviderImpl.getItemScope(), Integer.valueOf(i6 - interval.getStartIndex()), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
