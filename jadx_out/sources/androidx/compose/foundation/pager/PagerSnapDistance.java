package androidx.compose.foundation.pager;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Stable;
import com.umeng.analytics.pro.d;
import kotlin.i0;
import p4.l;

@Stable
@i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\bg\u0018\u0000 \n2\u00020\u0001:\u0001\nJ0\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/pager/PagerSnapDistance;", "", "calculateTargetPage", "", "startPage", "suggestedTargetPage", "velocity", "", "pageSize", "pageSpacing", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public interface PagerSnapDistance {

    @l
    public static final Companion Companion = Companion.$$INSTANCE;

    @i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/pager/PagerSnapDistance$Companion;", "", "()V", "atMost", "Landroidx/compose/foundation/pager/PagerSnapDistance;", d.f12498t, "", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @l
        public final PagerSnapDistance atMost(int i5) {
            boolean z4;
            if (i5 >= 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                return new PagerSnapDistanceMaxPages(i5);
            }
            throw new IllegalArgumentException(("pages should be greater than or equal to 0. You have used " + i5 + external.org.apache.commons.lang3.d.f15957a).toString());
        }
    }

    int calculateTargetPage(int i5, int i6, float f5, int i7, int i8);
}
