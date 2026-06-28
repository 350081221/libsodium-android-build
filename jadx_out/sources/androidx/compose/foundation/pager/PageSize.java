package androidx.compose.foundation.pager;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@Stable
@i0(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001:\u0002\u0007\bJ\u001c\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/pager/PageSize;", "", "calculateMainAxisPageSize", "", "Landroidx/compose/ui/unit/Density;", "availableSpace", "pageSpacing", "Fill", "Fixed", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public interface PageSize {

    @StabilityInferred(parameters = 1)
    @i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/pager/PageSize$Fill;", "Landroidx/compose/foundation/pager/PageSize;", "()V", "calculateMainAxisPageSize", "", "Landroidx/compose/ui/unit/Density;", "availableSpace", "pageSpacing", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @ExperimentalFoundationApi
    /* loaded from: classes.dex */
    public static final class Fill implements PageSize {
        public static final int $stable = 0;

        @l
        public static final Fill INSTANCE = new Fill();

        private Fill() {
        }

        @Override // androidx.compose.foundation.pager.PageSize
        public int calculateMainAxisPageSize(@l Density density, int i5, int i6) {
            return i5;
        }
    }

    @StabilityInferred(parameters = 1)
    @i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u001c\u0010\u0006\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\u000b\u001a\u00020\u0003H\u0016R\u001d\u0010\r\u001a\u00020\f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0013"}, d2 = {"Landroidx/compose/foundation/pager/PageSize$Fixed;", "Landroidx/compose/foundation/pager/PageSize;", "Landroidx/compose/ui/unit/Density;", "", "availableSpace", "pageSpacing", "calculateMainAxisPageSize", "", "other", "", "equals", TTDownloadField.TT_HASHCODE, "Landroidx/compose/ui/unit/Dp;", "pageSize", "F", "getPageSize-D9Ej5fM", "()F", "<init>", "(FLkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
    @ExperimentalFoundationApi
    /* loaded from: classes.dex */
    public static final class Fixed implements PageSize {
        public static final int $stable = 0;
        private final float pageSize;

        private Fixed(float f5) {
            this.pageSize = f5;
        }

        public /* synthetic */ Fixed(float f5, w wVar) {
            this(f5);
        }

        @Override // androidx.compose.foundation.pager.PageSize
        public int calculateMainAxisPageSize(@l Density density, int i5, int i6) {
            return density.mo298roundToPx0680j_4(this.pageSize);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Fixed)) {
                return false;
            }
            return Dp.m6049equalsimpl0(this.pageSize, ((Fixed) obj).pageSize);
        }

        /* renamed from: getPageSize-D9Ej5fM, reason: not valid java name */
        public final float m779getPageSizeD9Ej5fM() {
            return this.pageSize;
        }

        public int hashCode() {
            return Dp.m6050hashCodeimpl(this.pageSize);
        }
    }

    int calculateMainAxisPageSize(@l Density density, int i5, int i6);
}
