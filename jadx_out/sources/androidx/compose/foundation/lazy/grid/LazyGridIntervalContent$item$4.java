package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.q;
import v3.r;

@i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "", "it", "Lkotlin/r2;", "invoke", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;ILandroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class LazyGridIntervalContent$item$4 extends n0 implements r<LazyGridItemScope, Integer, Composer, Integer, r2> {
    final /* synthetic */ q<LazyGridItemScope, Composer, Integer, r2> $content;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyGridIntervalContent$item$4(q<? super LazyGridItemScope, ? super Composer, ? super Integer, r2> qVar) {
        super(4);
        this.$content = qVar;
    }

    @Override // v3.r
    public /* bridge */ /* synthetic */ r2 invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
        invoke(lazyGridItemScope, num.intValue(), composer, num2.intValue());
        return r2.f19517a;
    }

    @Composable
    public final void invoke(@l LazyGridItemScope lazyGridItemScope, int i5, @m Composer composer, int i6) {
        if ((i6 & 14) == 0) {
            i6 |= composer.changed(lazyGridItemScope) ? 4 : 2;
        }
        if ((i6 & 651) == 130 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-34608120, i6, -1, "androidx.compose.foundation.lazy.grid.LazyGridIntervalContent.item.<anonymous> (LazyGridIntervalContent.kt:49)");
        }
        this.$content.invoke(lazyGridItemScope, composer, Integer.valueOf(i6 & 14));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
