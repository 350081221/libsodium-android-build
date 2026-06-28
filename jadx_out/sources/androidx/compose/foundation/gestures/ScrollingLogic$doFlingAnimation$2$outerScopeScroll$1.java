package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import v3.l;

@i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/geometry/Offset;", "delta", "invoke-MK-Hz9U", "(J)J"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ScrollingLogic$doFlingAnimation$2$outerScopeScroll$1 extends n0 implements l<Offset, Offset> {
    final /* synthetic */ ScrollScope $$this$scroll;
    final /* synthetic */ ScrollingLogic this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$doFlingAnimation$2$outerScopeScroll$1(ScrollingLogic scrollingLogic, ScrollScope scrollScope) {
        super(1);
        this.this$0 = scrollingLogic;
        this.$$this$scroll = scrollScope;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ Offset invoke(Offset offset) {
        return Offset.m3482boximpl(m405invokeMKHz9U(offset.m3503unboximpl()));
    }

    /* renamed from: invoke-MK-Hz9U, reason: not valid java name */
    public final long m405invokeMKHz9U(long j5) {
        ScrollingLogic scrollingLogic = this.this$0;
        return scrollingLogic.m397reverseIfNeededMKHz9U(scrollingLogic.m393dispatchScroll3eAAhYA(this.$$this$scroll, scrollingLogic.m397reverseIfNeededMKHz9U(j5), NestedScrollSource.Companion.m4767getFlingWNlRxjI()));
    }
}
