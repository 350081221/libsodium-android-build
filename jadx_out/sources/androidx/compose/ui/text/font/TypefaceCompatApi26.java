package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Paint;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.text.ExperimentalTextApi;
import androidx.compose.ui.text.font.FontVariation;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.util.ListUtilsKt;
import com.umeng.analytics.pro.d;
import kotlin.i0;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0014\u0010\r\u001a\u00020\u000e*\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0003R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/text/font/TypefaceCompatApi26;", "", "()V", "threadLocalPaint", "Ljava/lang/ThreadLocal;", "Landroid/graphics/Paint;", "setFontVariationSettings", "Landroid/graphics/Typeface;", "typeface", "variationSettings", "Landroidx/compose/ui/text/font/FontVariation$Settings;", d.X, "Landroid/content/Context;", "toAndroidString", "", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RequiresApi(26)
/* loaded from: classes.dex */
public final class TypefaceCompatApi26 {

    @l
    public static final TypefaceCompatApi26 INSTANCE = new TypefaceCompatApi26();

    @l
    private static ThreadLocal<Paint> threadLocalPaint = new ThreadLocal<>();

    private TypefaceCompatApi26() {
    }

    @ExperimentalTextApi
    private final String toAndroidString(FontVariation.Settings settings, Context context) {
        return ListUtilsKt.fastJoinToString$default(settings.getSettings(), null, null, null, 0, null, new TypefaceCompatApi26$toAndroidString$1(AndroidDensity_androidKt.Density(context)), 31, null);
    }

    @ExperimentalTextApi
    @m
    public final android.graphics.Typeface setFontVariationSettings(@m android.graphics.Typeface typeface, @l FontVariation.Settings settings, @l Context context) {
        if (typeface == null) {
            return null;
        }
        if (settings.getSettings().isEmpty()) {
            return typeface;
        }
        Paint paint = threadLocalPaint.get();
        if (paint == null) {
            paint = new Paint();
            threadLocalPaint.set(paint);
        }
        paint.setTypeface(typeface);
        paint.setFontVariationSettings(toAndroidString(settings, context));
        return paint.getTypeface();
    }
}
