package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.AndroidFontUtils_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.TypefaceHelperMethodsApi28;
import kotlin.i0;
import kotlin.k;
import p4.l;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J*\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidDefaultTypeface;", "Landroidx/compose/ui/text/platform/AndroidTypeface;", "()V", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "getFontFamily", "()Landroidx/compose/ui/text/font/FontFamily;", "getNativeTypeface", "Landroid/graphics/Typeface;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "synthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "getNativeTypeface-PYhJU0U", "(Landroidx/compose/ui/text/font/FontWeight;II)Landroid/graphics/Typeface;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@k(message = "This path for preloading fonts is not supported")
/* loaded from: classes.dex */
public final class AndroidDefaultTypeface implements AndroidTypeface {
    public static final int $stable = 0;

    @l
    private final FontFamily fontFamily = FontFamily.Companion.getDefault();

    @Override // androidx.compose.ui.text.font.Typeface
    @l
    public FontFamily getFontFamily() {
        return this.fontFamily;
    }

    @Override // androidx.compose.ui.text.platform.AndroidTypeface
    @l
    /* renamed from: getNativeTypeface-PYhJU0U, reason: not valid java name */
    public Typeface mo5786getNativeTypefacePYhJU0U(@l FontWeight fontWeight, int i5, int i6) {
        if (Build.VERSION.SDK_INT < 28) {
            return Typeface.defaultFromStyle(AndroidFontUtils_androidKt.m5608getAndroidTypefaceStyleFO1MlWM(fontWeight, i5));
        }
        return TypefaceHelperMethodsApi28.INSTANCE.create(Typeface.DEFAULT, fontWeight.getWeight(), FontStyle.m5654equalsimpl0(i5, FontStyle.Companion.m5660getItalic_LCdwA()));
    }
}
