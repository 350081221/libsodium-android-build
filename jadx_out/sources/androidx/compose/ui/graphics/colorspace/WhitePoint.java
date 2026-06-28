package androidx.compose.ui.graphics.colorspace;

import android.support.v4.media.MediaDescriptionCompat;
import androidx.annotation.Size;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.umeng.analytics.pro.bi;
import kotlin.i0;

@i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006B'\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\r\u0010\u0017\u001a\u00020\u0018H\u0001¢\u0006\u0002\b\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "", "x", "", "y", bi.aG, "(FFF)V", "sum", "(FFFF)V", "(FF)V", "getX", "()F", "getY", "component1", "component2", "copy", "equals", "", "other", TTDownloadField.TT_HASHCODE, "", "toString", "", "toXyz", "", "toXyz$ui_graphics_release", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WhitePoint {

    /* renamed from: x, reason: collision with root package name */
    private final float f273x;

    /* renamed from: y, reason: collision with root package name */
    private final float f274y;

    public WhitePoint(float f5, float f6) {
        this.f273x = f5;
        this.f274y = f6;
    }

    public static /* synthetic */ WhitePoint copy$default(WhitePoint whitePoint, float f5, float f6, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = whitePoint.f273x;
        }
        if ((i5 & 2) != 0) {
            f6 = whitePoint.f274y;
        }
        return whitePoint.copy(f5, f6);
    }

    public final float component1() {
        return this.f273x;
    }

    public final float component2() {
        return this.f274y;
    }

    @p4.l
    public final WhitePoint copy(float f5, float f6) {
        return new WhitePoint(f5, f6);
    }

    public boolean equals(@p4.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WhitePoint)) {
            return false;
        }
        WhitePoint whitePoint = (WhitePoint) obj;
        return Float.compare(this.f273x, whitePoint.f273x) == 0 && Float.compare(this.f274y, whitePoint.f274y) == 0;
    }

    public final float getX() {
        return this.f273x;
    }

    public final float getY() {
        return this.f274y;
    }

    public int hashCode() {
        return (Float.hashCode(this.f273x) * 31) + Float.hashCode(this.f274y);
    }

    @p4.l
    public String toString() {
        return "WhitePoint(x=" + this.f273x + ", y=" + this.f274y + ')';
    }

    @p4.l
    @Size(MediaDescriptionCompat.BT_FOLDER_TYPE_ARTISTS)
    public final float[] toXyz$ui_graphics_release() {
        float f5 = this.f273x;
        float f6 = this.f274y;
        return new float[]{f5 / f6, 1.0f, ((1.0f - f5) - f6) / f6};
    }

    public WhitePoint(float f5, float f6, float f7) {
        this(f5, f6, f7, f5 + f6 + f7);
    }

    private WhitePoint(float f5, float f6, float f7, float f8) {
        this(f5 / f8, f6 / f8);
    }
}
