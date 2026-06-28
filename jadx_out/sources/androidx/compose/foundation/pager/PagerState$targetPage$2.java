package androidx.compose.foundation.pager;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.math.d;
import p4.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PagerState$targetPage$2 extends n0 implements v3.a<Integer> {
    final /* synthetic */ PagerState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerState$targetPage$2(PagerState pagerState) {
        super(0);
        this.this$0 = pagerState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.a
    @l
    public final Integer invoke() {
        int programmaticScrollTargetPage;
        int L0;
        int i5;
        boolean isScrollingForward;
        int coerceInPageRange;
        if (!this.this$0.isScrollInProgress()) {
            i5 = this.this$0.getCurrentPage();
        } else {
            programmaticScrollTargetPage = this.this$0.getProgrammaticScrollTargetPage();
            if (programmaticScrollTargetPage != -1) {
                i5 = this.this$0.getProgrammaticScrollTargetPage();
            } else {
                if (!(this.this$0.getSnapRemainingScrollOffset$foundation_release() == 0.0f)) {
                    float snapRemainingScrollOffset$foundation_release = this.this$0.getSnapRemainingScrollOffset$foundation_release() / this.this$0.getPageSizeWithSpacing$foundation_release();
                    int currentPage = this.this$0.getCurrentPage();
                    L0 = d.L0(snapRemainingScrollOffset$foundation_release);
                    i5 = L0 + currentPage;
                } else if (Math.abs(this.this$0.getCurrentPageOffsetFraction()) >= Math.abs(this.this$0.getPositionThresholdFraction$foundation_release())) {
                    isScrollingForward = this.this$0.isScrollingForward();
                    if (isScrollingForward) {
                        i5 = this.this$0.getFirstVisiblePage$foundation_release() + 1;
                    } else {
                        i5 = this.this$0.getFirstVisiblePage$foundation_release();
                    }
                } else {
                    i5 = this.this$0.getCurrentPage();
                }
            }
        }
        coerceInPageRange = this.this$0.coerceInPageRange(i5);
        return Integer.valueOf(coerceInPageRange);
    }
}
