package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;

@kotlin.i0(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B%\b\u0000\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u0015¢\u0006\u0004\b\u0017\u0010\u0018B\u0019\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0019J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u001d\u0010\u000b\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0010\u001a\u00020\u000f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/graphics/BlendModeColorFilter;", "Landroidx/compose/ui/graphics/ColorFilter;", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "", "toString", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "J", "getColor-0d7_KjU", "()J", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "I", "getBlendMode-0nO6VwU", "()I", "Landroid/graphics/ColorFilter;", "Landroidx/compose/ui/graphics/NativeColorFilter;", "nativeColorFilter", "<init>", "(JILandroid/graphics/ColorFilter;Lkotlin/jvm/internal/w;)V", "(JILkotlin/jvm/internal/w;)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
@Immutable
/* loaded from: classes.dex */
public final class BlendModeColorFilter extends ColorFilter {
    private final int blendMode;
    private final long color;

    private BlendModeColorFilter(long j5, int i5, android.graphics.ColorFilter colorFilter) {
        super(colorFilter);
        this.color = j5;
        this.blendMode = i5;
    }

    public /* synthetic */ BlendModeColorFilter(long j5, int i5, android.graphics.ColorFilter colorFilter, kotlin.jvm.internal.w wVar) {
        this(j5, i5, colorFilter);
    }

    public /* synthetic */ BlendModeColorFilter(long j5, int i5, kotlin.jvm.internal.w wVar) {
        this(j5, i5);
    }

    public boolean equals(@p4.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlendModeColorFilter)) {
            return false;
        }
        BlendModeColorFilter blendModeColorFilter = (BlendModeColorFilter) obj;
        if (Color.m3735equalsimpl0(this.color, blendModeColorFilter.color) && BlendMode.m3645equalsimpl0(this.blendMode, blendModeColorFilter.blendMode)) {
            return true;
        }
        return false;
    }

    /* renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    public final int m3678getBlendMode0nO6VwU() {
        return this.blendMode;
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m3679getColor0d7_KjU() {
        return this.color;
    }

    public int hashCode() {
        return (Color.m3741hashCodeimpl(this.color) * 31) + BlendMode.m3646hashCodeimpl(this.blendMode);
    }

    @p4.l
    public String toString() {
        return "BlendModeColorFilter(color=" + ((Object) Color.m3742toStringimpl(this.color)) + ", blendMode=" + ((Object) BlendMode.m3647toStringimpl(this.blendMode)) + ')';
    }

    private BlendModeColorFilter(long j5, int i5) {
        this(j5, i5, AndroidColorFilter_androidKt.m3600actualTintColorFilterxETnrds(j5, i5), null);
    }
}
