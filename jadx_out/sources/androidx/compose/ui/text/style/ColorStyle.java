package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;
import t0.b;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010\u0005\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u00028VX\u0096\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0004R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Landroidx/compose/ui/text/style/ColorStyle;", "Landroidx/compose/ui/text/style/TextForegroundStyle;", "Landroidx/compose/ui/graphics/Color;", "component1-0d7_KjU", "()J", "component1", b.f22420d, "copy-8_81llA", "(J)Landroidx/compose/ui/text/style/ColorStyle;", "copy", "", "toString", "", TTDownloadField.TT_HASHCODE, "", "other", "", "equals", "J", "getValue-0d7_KjU", "getColor-0d7_KjU", TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/graphics/Brush;", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "brush", "", "getAlpha", "()F", "alpha", "<init>", "(JLkotlin/jvm/internal/w;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nTextForegroundStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextForegroundStyle.kt\nandroidx/compose/ui/text/style/ColorStyle\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,149:1\n646#2:150\n*S KotlinDebug\n*F\n+ 1 TextForegroundStyle.kt\nandroidx/compose/ui/text/style/ColorStyle\n*L\n94#1:150\n*E\n"})
/* loaded from: classes.dex */
public final class ColorStyle implements TextForegroundStyle {
    private final long value;

    private ColorStyle(long j5) {
        boolean z4;
        this.value = j5;
        if (j5 != Color.Companion.m3770getUnspecified0d7_KjU()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
        } else {
            throw new IllegalArgumentException("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.".toString());
        }
    }

    public /* synthetic */ ColorStyle(long j5, w wVar) {
        this(j5);
    }

    /* renamed from: copy-8_81llA$default, reason: not valid java name */
    public static /* synthetic */ ColorStyle m5835copy8_81llA$default(ColorStyle colorStyle, long j5, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            j5 = colorStyle.value;
        }
        return colorStyle.m5837copy8_81llA(j5);
    }

    /* renamed from: component1-0d7_KjU, reason: not valid java name */
    public final long m5836component10d7_KjU() {
        return this.value;
    }

    @l
    /* renamed from: copy-8_81llA, reason: not valid java name */
    public final ColorStyle m5837copy8_81llA(long j5) {
        return new ColorStyle(j5, null);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ColorStyle) && Color.m3735equalsimpl0(this.value, ((ColorStyle) obj).value);
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    public float getAlpha() {
        return Color.m3736getAlphaimpl(mo5834getColor0d7_KjU());
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    @m
    public Brush getBrush() {
        return null;
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    /* renamed from: getColor-0d7_KjU */
    public long mo5834getColor0d7_KjU() {
        return this.value;
    }

    /* renamed from: getValue-0d7_KjU, reason: not valid java name */
    public final long m5838getValue0d7_KjU() {
        return this.value;
    }

    public int hashCode() {
        return Color.m3741hashCodeimpl(this.value);
    }

    @l
    public String toString() {
        return "ColorStyle(value=" + ((Object) Color.m3742toStringimpl(this.value)) + ')';
    }
}
