package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;

@kotlin.i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B%\b\u0000\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012¢\u0006\u0004\b\u0014\u0010\u0015B\u0019\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0016J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u001d\u0010\u000b\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u000f\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/graphics/LightingColorFilter;", "Landroidx/compose/ui/graphics/ColorFilter;", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "", "toString", "Landroidx/compose/ui/graphics/Color;", "multiply", "J", "getMultiply-0d7_KjU", "()J", "add", "getAdd-0d7_KjU", "Landroid/graphics/ColorFilter;", "Landroidx/compose/ui/graphics/NativeColorFilter;", "nativeColorFilter", "<init>", "(JJLandroid/graphics/ColorFilter;Lkotlin/jvm/internal/w;)V", "(JJLkotlin/jvm/internal/w;)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
@Immutable
/* loaded from: classes.dex */
public final class LightingColorFilter extends ColorFilter {
    private final long add;
    private final long multiply;

    private LightingColorFilter(long j5, long j6, android.graphics.ColorFilter colorFilter) {
        super(colorFilter);
        this.multiply = j5;
        this.add = j6;
    }

    public /* synthetic */ LightingColorFilter(long j5, long j6, android.graphics.ColorFilter colorFilter, kotlin.jvm.internal.w wVar) {
        this(j5, j6, colorFilter);
    }

    public /* synthetic */ LightingColorFilter(long j5, long j6, kotlin.jvm.internal.w wVar) {
        this(j5, j6);
    }

    public boolean equals(@p4.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LightingColorFilter)) {
            return false;
        }
        LightingColorFilter lightingColorFilter = (LightingColorFilter) obj;
        if (Color.m3735equalsimpl0(this.multiply, lightingColorFilter.multiply) && Color.m3735equalsimpl0(this.add, lightingColorFilter.add)) {
            return true;
        }
        return false;
    }

    /* renamed from: getAdd-0d7_KjU, reason: not valid java name */
    public final long m3960getAdd0d7_KjU() {
        return this.add;
    }

    /* renamed from: getMultiply-0d7_KjU, reason: not valid java name */
    public final long m3961getMultiply0d7_KjU() {
        return this.multiply;
    }

    public int hashCode() {
        return (Color.m3741hashCodeimpl(this.multiply) * 31) + Color.m3741hashCodeimpl(this.add);
    }

    @p4.l
    public String toString() {
        return "LightingColorFilter(multiply=" + ((Object) Color.m3742toStringimpl(this.multiply)) + ", add=" + ((Object) Color.m3742toStringimpl(this.add)) + ')';
    }

    private LightingColorFilter(long j5, long j6) {
        this(j5, j6, AndroidColorFilter_androidKt.m3599actualLightingColorFilterOWjLjI(j5, j6), null);
    }
}
