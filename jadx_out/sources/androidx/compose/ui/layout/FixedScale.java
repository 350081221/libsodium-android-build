package androidx.compose.ui.layout;

import androidx.compose.runtime.Immutable;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import p4.l;
import p4.m;
import t0.b;

@i0(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\"\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/layout/FixedScale;", "Landroidx/compose/ui/layout/ContentScale;", b.f22420d, "", "(F)V", "getValue", "()F", "component1", "computeScaleFactor", "Landroidx/compose/ui/layout/ScaleFactor;", "srcSize", "Landroidx/compose/ui/geometry/Size;", "dstSize", "computeScaleFactor-H7hwNQA", "(JJ)J", "copy", "equals", "", "other", "", TTDownloadField.TT_HASHCODE, "", "toString", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Immutable
/* loaded from: classes.dex */
public final class FixedScale implements ContentScale {
    public static final int $stable = 0;
    private final float value;

    public FixedScale(float f5) {
        this.value = f5;
    }

    public static /* synthetic */ FixedScale copy$default(FixedScale fixedScale, float f5, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = fixedScale.value;
        }
        return fixedScale.copy(f5);
    }

    public final float component1() {
        return this.value;
    }

    @Override // androidx.compose.ui.layout.ContentScale
    /* renamed from: computeScaleFactor-H7hwNQA */
    public long mo4989computeScaleFactorH7hwNQA(long j5, long j6) {
        float f5 = this.value;
        return ScaleFactorKt.ScaleFactor(f5, f5);
    }

    @l
    public final FixedScale copy(float f5) {
        return new FixedScale(f5);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FixedScale) && Float.compare(this.value, ((FixedScale) obj).value) == 0;
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        return Float.hashCode(this.value);
    }

    @l
    public String toString() {
        return "FixedScale(value=" + this.value + ')';
    }
}
