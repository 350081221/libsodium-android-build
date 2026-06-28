package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.FontVariation;
import com.umeng.analytics.pro.d;
import kotlin.b1;
import kotlin.i0;
import kotlin.jvm.internal.w;
import kotlin.k;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b'\u0018\u00002\u00020\u0001:\u0001\u0014B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012B\u0019\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0013R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/text/font/AndroidFont;", "Landroidx/compose/ui/text/font/Font;", "Landroidx/compose/ui/text/font/FontLoadingStrategy;", "loadingStrategy", "I", "getLoadingStrategy-PKNRLFQ", "()I", "Landroidx/compose/ui/text/font/AndroidFont$TypefaceLoader;", "typefaceLoader", "Landroidx/compose/ui/text/font/AndroidFont$TypefaceLoader;", "getTypefaceLoader", "()Landroidx/compose/ui/text/font/AndroidFont$TypefaceLoader;", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "variationSettings", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "getVariationSettings", "()Landroidx/compose/ui/text/font/FontVariation$Settings;", "<init>", "(ILandroidx/compose/ui/text/font/AndroidFont$TypefaceLoader;Landroidx/compose/ui/text/font/FontVariation$Settings;Lkotlin/jvm/internal/w;)V", "(ILandroidx/compose/ui/text/font/AndroidFont$TypefaceLoader;Lkotlin/jvm/internal/w;)V", "TypefaceLoader", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public abstract class AndroidFont implements Font {
    public static final int $stable = 0;
    private final int loadingStrategy;

    @l
    private final TypefaceLoader typefaceLoader;

    @l
    private final FontVariation.Settings variationSettings;

    @i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\"\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/font/AndroidFont$TypefaceLoader;", "", "Landroid/content/Context;", d.X, "Landroidx/compose/ui/text/font/AndroidFont;", "font", "Landroid/graphics/Typeface;", "loadBlocking", "awaitLoad", "(Landroid/content/Context;Landroidx/compose/ui/text/font/AndroidFont;Lkotlin/coroutines/d;)Ljava/lang/Object;", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public interface TypefaceLoader {
        @m
        Object awaitLoad(@l Context context, @l AndroidFont androidFont, @l kotlin.coroutines.d<? super android.graphics.Typeface> dVar);

        @m
        android.graphics.Typeface loadBlocking(@l Context context, @l AndroidFont androidFont);
    }

    private AndroidFont(int i5, TypefaceLoader typefaceLoader, FontVariation.Settings settings) {
        this.loadingStrategy = i5;
        this.typefaceLoader = typefaceLoader;
        this.variationSettings = settings;
    }

    public /* synthetic */ AndroidFont(int i5, TypefaceLoader typefaceLoader, FontVariation.Settings settings, w wVar) {
        this(i5, typefaceLoader, settings);
    }

    @k(message = "Replaced with fontVariation constructor", replaceWith = @b1(expression = "AndroidFont(loadingStrategy, typefaceLoader, FontVariation.Settings())", imports = {}))
    public /* synthetic */ AndroidFont(int i5, TypefaceLoader typefaceLoader, w wVar) {
        this(i5, typefaceLoader);
    }

    @Override // androidx.compose.ui.text.font.Font
    /* renamed from: getLoadingStrategy-PKNRLFQ, reason: not valid java name */
    public final int mo5601getLoadingStrategyPKNRLFQ() {
        return this.loadingStrategy;
    }

    @l
    public final TypefaceLoader getTypefaceLoader() {
        return this.typefaceLoader;
    }

    @l
    public final FontVariation.Settings getVariationSettings() {
        return this.variationSettings;
    }

    private AndroidFont(int i5, TypefaceLoader typefaceLoader) {
        this(i5, typefaceLoader, new FontVariation.Settings(new FontVariation.Setting[0]), null);
    }
}
