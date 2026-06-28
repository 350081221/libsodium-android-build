package androidx.compose.ui.text.font;

import android.content.Context;
import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.FontVariation;
import com.umeng.analytics.pro.d;
import java.io.File;
import kotlin.i0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0010¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\t\u001a\u00020\bH\u0016R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/text/font/AndroidFileFont;", "Landroidx/compose/ui/text/font/AndroidPreloadedFont;", "Landroid/content/Context;", d.X, "Landroid/graphics/Typeface;", "doLoad$ui_text_release", "(Landroid/content/Context;)Landroid/graphics/Typeface;", "doLoad", "", "toString", "Ljava/io/File;", "file", "Ljava/io/File;", "getFile", "()Ljava/io/File;", "cacheKey", "Ljava/lang/String;", "getCacheKey", "()Ljava/lang/String;", "Landroidx/compose/ui/text/font/FontWeight;", "weight", "Landroidx/compose/ui/text/font/FontStyle;", "style", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "variationSettings", "<init>", "(Ljava/io/File;Landroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;Lkotlin/jvm/internal/w;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AndroidFileFont extends AndroidPreloadedFont {
    public static final int $stable = 0;

    @m
    private final String cacheKey;

    @l
    private final File file;

    public /* synthetic */ AndroidFileFont(File file, FontWeight fontWeight, int i5, FontVariation.Settings settings, int i6, w wVar) {
        this(file, (i6 & 2) != 0 ? FontWeight.Companion.getNormal() : fontWeight, (i6 & 4) != 0 ? FontStyle.Companion.m5661getNormal_LCdwA() : i5, settings, null);
    }

    public /* synthetic */ AndroidFileFont(File file, FontWeight fontWeight, int i5, FontVariation.Settings settings, w wVar) {
        this(file, fontWeight, i5, settings);
    }

    @Override // androidx.compose.ui.text.font.AndroidPreloadedFont
    @m
    public android.graphics.Typeface doLoad$ui_text_release(@m Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return TypefaceBuilderCompat.INSTANCE.createFromFile(this.file, context, getVariationSettings());
        }
        return android.graphics.Typeface.createFromFile(this.file);
    }

    @Override // androidx.compose.ui.text.font.AndroidPreloadedFont
    @m
    public String getCacheKey() {
        return this.cacheKey;
    }

    @l
    public final File getFile() {
        return this.file;
    }

    @l
    public String toString() {
        return "Font(file=" + this.file + ", weight=" + getWeight() + ", style=" + ((Object) FontStyle.m5656toStringimpl(mo5609getStyle_LCdwA())) + ')';
    }

    private AndroidFileFont(File file, FontWeight fontWeight, int i5, FontVariation.Settings settings) {
        super(fontWeight, i5, settings, null);
        this.file = file;
        setTypeface$ui_text_release(doLoad$ui_text_release(null));
    }
}
