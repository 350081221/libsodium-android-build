package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.r;
import v3.s;

@i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;", "", "index", "Lkotlin/r2;", "invoke", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;ILandroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$10\n*L\n1#1,463:1\n*E\n"})
/* loaded from: classes.dex */
public final class LazyStaggeredGridDslKt$itemsIndexed$10 extends n0 implements r<LazyStaggeredGridItemScope, Integer, Composer, Integer, r2> {
    final /* synthetic */ s<LazyStaggeredGridItemScope, Integer, T, Composer, Integer, r2> $itemContent;
    final /* synthetic */ T[] $items;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyStaggeredGridDslKt$itemsIndexed$10(s<? super LazyStaggeredGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, r2> sVar, T[] tArr) {
        super(4);
        this.$itemContent = sVar;
        this.$items = tArr;
    }

    @Override // v3.r
    public /* bridge */ /* synthetic */ r2 invoke(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, Integer num, Composer composer, Integer num2) {
        invoke(lazyStaggeredGridItemScope, num.intValue(), composer, num2.intValue());
        return r2.f19517a;
    }

    @Composable
    public final void invoke(@l LazyStaggeredGridItemScope lazyStaggeredGridItemScope, int i5, @m Composer composer, int i6) {
        int i7;
        if ((i6 & 14) == 0) {
            i7 = (composer.changed(lazyStaggeredGridItemScope) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 112) == 0) {
            i7 |= composer.changed(i5) ? 32 : 16;
        }
        if ((i7 & 731) == 146 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-804487775, i7, -1, "androidx.compose.foundation.lazy.staggeredgrid.itemsIndexed.<anonymous> (LazyStaggeredGridDsl.kt:459)");
        }
        this.$itemContent.invoke(lazyStaggeredGridItemScope, Integer.valueOf(i5), this.$items[i5], composer, Integer.valueOf((i7 & 14) | (i7 & 112)));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
