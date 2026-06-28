package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.r;
import v3.s;

@i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "", "it", "Lkotlin/r2;", "invoke", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;ILandroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$5\n*L\n1#1,563:1\n*E\n"})
/* loaded from: classes.dex */
public final class LazyGridDslKt$itemsIndexed$5 extends n0 implements r<LazyGridItemScope, Integer, Composer, Integer, r2> {
    final /* synthetic */ s<LazyGridItemScope, Integer, T, Composer, Integer, r2> $itemContent;
    final /* synthetic */ List<T> $items;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyGridDslKt$itemsIndexed$5(s<? super LazyGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, r2> sVar, List<? extends T> list) {
        super(4);
        this.$itemContent = sVar;
        this.$items = list;
    }

    @Override // v3.r
    public /* bridge */ /* synthetic */ r2 invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
        invoke(lazyGridItemScope, num.intValue(), composer, num2.intValue());
        return r2.f19517a;
    }

    @Composable
    public final void invoke(@l LazyGridItemScope lazyGridItemScope, int i5, @m Composer composer, int i6) {
        int i7;
        if ((i6 & 14) == 0) {
            i7 = (composer.changed(lazyGridItemScope) ? 4 : 2) | i6;
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
            ComposerKt.traceEventStart(1229287273, i7, -1, "androidx.compose.foundation.lazy.grid.itemsIndexed.<anonymous> (LazyGridDsl.kt:494)");
        }
        this.$itemContent.invoke(lazyGridItemScope, Integer.valueOf(i5), this.$items.get(i5), composer, Integer.valueOf((i7 & 14) | (i7 & 112)));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
