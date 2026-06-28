package androidx.compose.foundation.pager;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.ranges.u;
import p4.m;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J0\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0016J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/pager/PagerSnapDistanceMaxPages;", "Landroidx/compose/foundation/pager/PagerSnapDistance;", "pagesLimit", "", "(I)V", "calculateTargetPage", "startPage", "suggestedTargetPage", "velocity", "", "pageSize", "pageSpacing", "equals", "", "other", "", TTDownloadField.TT_HASHCODE, "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/PagerSnapDistanceMaxPages\n+ 2 Pager.kt\nandroidx/compose/foundation/pager/PagerKt\n*L\n1#1,970:1\n956#2,4:971\n*S KotlinDebug\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/PagerSnapDistanceMaxPages\n*L\n559#1:971,4\n*E\n"})
/* loaded from: classes.dex */
public final class PagerSnapDistanceMaxPages implements PagerSnapDistance {
    public static final int $stable = 0;
    private final int pagesLimit;

    public PagerSnapDistanceMaxPages(int i5) {
        this.pagesLimit = i5;
    }

    @Override // androidx.compose.foundation.pager.PagerSnapDistance
    public int calculateTargetPage(int i5, int i6, float f5, int i7, int i8) {
        int I;
        int i9 = this.pagesLimit;
        I = u.I(i6, i5 - i9, i5 + i9);
        return I;
    }

    public boolean equals(@m Object obj) {
        if (!(obj instanceof PagerSnapDistanceMaxPages) || this.pagesLimit != ((PagerSnapDistanceMaxPages) obj).pagesLimit) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Integer.hashCode(this.pagesLimit);
    }
}
