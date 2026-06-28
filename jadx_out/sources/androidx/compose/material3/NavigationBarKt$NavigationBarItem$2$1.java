package androidx.compose.material3;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.ui.unit.IntSize;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/unit/IntSize;", "it", "Lkotlin/r2;", "invoke-ozmzZPI", "(J)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class NavigationBarKt$NavigationBarItem$2$1 extends kotlin.jvm.internal.n0 implements v3.l<IntSize, r2> {
    final /* synthetic */ MutableIntState $itemWidth$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationBarKt$NavigationBarItem$2$1(MutableIntState mutableIntState) {
        super(1);
        this.$itemWidth$delegate = mutableIntState;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(IntSize intSize) {
        m2023invokeozmzZPI(intSize.m6218unboximpl());
        return r2.f19517a;
    }

    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
    public final void m2023invokeozmzZPI(long j5) {
        this.$itemWidth$delegate.setIntValue(IntSize.m6214getWidthimpl(j5));
    }
}
