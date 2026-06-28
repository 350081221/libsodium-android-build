package androidx.compose.foundation;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

@Stable
@i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u001d\u0010\n\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/OverscrollConfiguration;", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "", "toString", "Landroidx/compose/ui/graphics/Color;", "glowColor", "J", "getGlowColor-0d7_KjU", "()J", "Landroidx/compose/foundation/layout/PaddingValues;", "drawPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getDrawPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "<init>", "(JLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public final class OverscrollConfiguration {
    public static final int $stable = 0;

    @p4.l
    private final PaddingValues drawPadding;
    private final long glowColor;

    private OverscrollConfiguration(long j5, PaddingValues paddingValues) {
        this.glowColor = j5;
        this.drawPadding = paddingValues;
    }

    public /* synthetic */ OverscrollConfiguration(long j5, PaddingValues paddingValues, w wVar) {
        this(j5, paddingValues);
    }

    public boolean equals(@p4.m Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!l0.g(OverscrollConfiguration.class, cls)) {
            return false;
        }
        l0.n(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        OverscrollConfiguration overscrollConfiguration = (OverscrollConfiguration) obj;
        if (Color.m3735equalsimpl0(this.glowColor, overscrollConfiguration.glowColor) && l0.g(this.drawPadding, overscrollConfiguration.drawPadding)) {
            return true;
        }
        return false;
    }

    @p4.l
    public final PaddingValues getDrawPadding() {
        return this.drawPadding;
    }

    /* renamed from: getGlowColor-0d7_KjU, reason: not valid java name */
    public final long m290getGlowColor0d7_KjU() {
        return this.glowColor;
    }

    public int hashCode() {
        return (Color.m3741hashCodeimpl(this.glowColor) * 31) + this.drawPadding.hashCode();
    }

    @p4.l
    public String toString() {
        return "OverscrollConfiguration(glowColor=" + ((Object) Color.m3742toStringimpl(this.glowColor)) + ", drawPadding=" + this.drawPadding + ')';
    }

    public /* synthetic */ OverscrollConfiguration(long j5, PaddingValues paddingValues, int i5, w wVar) {
        this((i5 & 1) != 0 ? ColorKt.Color(4284900966L) : j5, (i5 & 2) != 0 ? PaddingKt.m548PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null) : paddingValues, null);
    }
}
