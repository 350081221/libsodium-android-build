package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/geometry/Offset;", "delta", "invoke-MK-Hz9U", "(J)J"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScrollingLogic$dispatchScroll$performScroll$1 extends n0 implements l<Offset, Offset> {
    final /* synthetic */ int $source;
    final /* synthetic */ ScrollScope $this_dispatchScroll;
    final /* synthetic */ ScrollingLogic this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$dispatchScroll$performScroll$1(ScrollingLogic scrollingLogic, int i5, ScrollScope scrollScope) {
        super(1);
        this.this$0 = scrollingLogic;
        this.$source = i5;
        this.$this_dispatchScroll = scrollScope;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ Offset invoke(Offset offset) {
        return Offset.m3482boximpl(m404invokeMKHz9U(offset.m3503unboximpl()));
    }

    /* renamed from: invoke-MK-Hz9U, reason: not valid java name */
    public final long m404invokeMKHz9U(long j5) {
        NestedScrollDispatcher nestedScrollDispatcher;
        NestedScrollDispatcher nestedScrollDispatcher2;
        nestedScrollDispatcher = this.this$0.nestedScrollDispatcher;
        long m4757dispatchPreScrollOzD1aCk = nestedScrollDispatcher.m4757dispatchPreScrollOzD1aCk(j5, this.$source);
        long m3497minusMKHz9U = Offset.m3497minusMKHz9U(j5, m4757dispatchPreScrollOzD1aCk);
        ScrollingLogic scrollingLogic = this.this$0;
        float m401toFloatk4lQ0M = scrollingLogic.m401toFloatk4lQ0M(scrollingLogic.m397reverseIfNeededMKHz9U(scrollingLogic.m398singleAxisOffsetMKHz9U(m3497minusMKHz9U)));
        ScrollingLogic scrollingLogic2 = this.this$0;
        long m397reverseIfNeededMKHz9U = scrollingLogic2.m397reverseIfNeededMKHz9U(scrollingLogic2.m402toOffsettuRUvjQ(this.$this_dispatchScroll.scrollBy(m401toFloatk4lQ0M)));
        long m3497minusMKHz9U2 = Offset.m3497minusMKHz9U(m3497minusMKHz9U, m397reverseIfNeededMKHz9U);
        nestedScrollDispatcher2 = this.this$0.nestedScrollDispatcher;
        return Offset.m3498plusMKHz9U(Offset.m3498plusMKHz9U(m4757dispatchPreScrollOzD1aCk, m397reverseIfNeededMKHz9U), nestedScrollDispatcher2.m4755dispatchPostScrollDzOQY0M(m397reverseIfNeededMKHz9U, m3497minusMKHz9U2, this.$source));
    }
}
