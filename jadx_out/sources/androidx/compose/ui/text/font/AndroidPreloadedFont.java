package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.FontVariation;
import com.umeng.analytics.pro.d;
import kotlin.i0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001B\u001f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH ¢\u0006\u0002\b\u001dJ\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001b\u001a\u00020\u001cH\u0000¢\u0006\u0002\b\u001fR\u0014\u0010\t\u001a\u0004\u0018\u00010\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0019\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u0082\u0001\u0003 !\"\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Landroidx/compose/ui/text/font/AndroidPreloadedFont;", "Landroidx/compose/ui/text/font/AndroidFont;", "weight", "Landroidx/compose/ui/text/font/FontWeight;", "style", "Landroidx/compose/ui/text/font/FontStyle;", "variationSettings", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "(Landroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;)V", "cacheKey", "", "getCacheKey", "()Ljava/lang/String;", "didInitWithContext", "", "getStyle-_-LCdwA", "()I", "I", "typeface", "Landroid/graphics/Typeface;", "getTypeface$ui_text_release", "()Landroid/graphics/Typeface;", "setTypeface$ui_text_release", "(Landroid/graphics/Typeface;)V", "getWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "doLoad", d.X, "Landroid/content/Context;", "doLoad$ui_text_release", "loadCached", "loadCached$ui_text_release", "Landroidx/compose/ui/text/font/AndroidAssetFont;", "Landroidx/compose/ui/text/font/AndroidFileDescriptorFont;", "Landroidx/compose/ui/text/font/AndroidFileFont;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class AndroidPreloadedFont extends AndroidFont {
    public static final int $stable = 0;
    private boolean didInitWithContext;
    private final int style;

    @m
    private android.graphics.Typeface typeface;

    @l
    private final FontWeight weight;

    private AndroidPreloadedFont(FontWeight fontWeight, int i5, FontVariation.Settings settings) {
        super(FontLoadingStrategy.Companion.m5646getBlockingPKNRLFQ(), AndroidPreloadedFontTypefaceLoader.INSTANCE, settings, null);
        this.weight = fontWeight;
        this.style = i5;
    }

    public /* synthetic */ AndroidPreloadedFont(FontWeight fontWeight, int i5, FontVariation.Settings settings, w wVar) {
        this(fontWeight, i5, settings);
    }

    @m
    public abstract android.graphics.Typeface doLoad$ui_text_release(@m Context context);

    @m
    public abstract String getCacheKey();

    @Override // androidx.compose.ui.text.font.Font
    /* renamed from: getStyle-_-LCdwA, reason: not valid java name */
    public final int mo5609getStyle_LCdwA() {
        return this.style;
    }

    @m
    public final android.graphics.Typeface getTypeface$ui_text_release() {
        return this.typeface;
    }

    @Override // androidx.compose.ui.text.font.Font
    @l
    public final FontWeight getWeight() {
        return this.weight;
    }

    @m
    public final android.graphics.Typeface loadCached$ui_text_release(@l Context context) {
        if (!this.didInitWithContext && this.typeface == null) {
            this.typeface = doLoad$ui_text_release(context);
        }
        this.didInitWithContext = true;
        return this.typeface;
    }

    public final void setTypeface$ui_text_release(@m android.graphics.Typeface typeface) {
        this.typeface = typeface;
    }
}
