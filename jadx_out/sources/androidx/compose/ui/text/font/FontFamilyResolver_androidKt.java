package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.runtime.State;
import androidx.compose.ui.text.InternalTextApi;
import androidx.compose.ui.text.font.FontFamily;
import com.umeng.analytics.pro.d;
import kotlin.coroutines.g;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;

@i0(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0016\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u001aD\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f*\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, d2 = {"Landroid/content/Context;", d.X, "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "createFontFamilyResolver", "Lkotlin/coroutines/g;", "coroutineContext", "emptyCacheFontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily;", "fontFamily", "Landroidx/compose/ui/text/font/FontWeight;", "fontWeight", "Landroidx/compose/ui/text/font/FontStyle;", "fontStyle", "Landroidx/compose/ui/text/font/FontSynthesis;", "fontSynthesis", "Landroidx/compose/runtime/State;", "Landroid/graphics/Typeface;", "resolveAsTypeface-Wqqsr6A", "(Landroidx/compose/ui/text/font/FontFamily$Resolver;Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;II)Landroidx/compose/runtime/State;", "resolveAsTypeface", "ui-text_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class FontFamilyResolver_androidKt {
    @l
    public static final FontFamily.Resolver createFontFamilyResolver(@l Context context) {
        return new FontFamilyResolverImpl(new AndroidFontLoader(context), AndroidFontResolveInterceptor_androidKt.AndroidFontResolveInterceptor(context), null, null, null, 28, null);
    }

    @l
    @InternalTextApi
    public static final FontFamily.Resolver emptyCacheFontFamilyResolver(@l Context context) {
        return new FontFamilyResolverImpl(new AndroidFontLoader(context), null, new TypefaceRequestCache(), new FontListFontFamilyTypefaceAdapter(new AsyncTypefaceCache(), null, 2, null), null, 18, null);
    }

    @l
    /* renamed from: resolveAsTypeface-Wqqsr6A, reason: not valid java name */
    public static final State<android.graphics.Typeface> m5630resolveAsTypefaceWqqsr6A(@l FontFamily.Resolver resolver, @m FontFamily fontFamily, @l FontWeight fontWeight, int i5, int i6) {
        State mo5629resolveDPcqOEQ = resolver.mo5629resolveDPcqOEQ(fontFamily, fontWeight, i5, i6);
        l0.n(mo5629resolveDPcqOEQ, "null cannot be cast to non-null type androidx.compose.runtime.State<android.graphics.Typeface>");
        return mo5629resolveDPcqOEQ;
    }

    /* renamed from: resolveAsTypeface-Wqqsr6A$default, reason: not valid java name */
    public static /* synthetic */ State m5631resolveAsTypefaceWqqsr6A$default(FontFamily.Resolver resolver, FontFamily fontFamily, FontWeight fontWeight, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            fontFamily = null;
        }
        if ((i7 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i7 & 4) != 0) {
            i5 = FontStyle.Companion.m5661getNormal_LCdwA();
        }
        if ((i7 & 8) != 0) {
            i6 = FontSynthesis.Companion.m5671getAllGVVA2EU();
        }
        return m5630resolveAsTypefaceWqqsr6A(resolver, fontFamily, fontWeight, i5, i6);
    }

    @l
    public static final FontFamily.Resolver createFontFamilyResolver(@l Context context, @l g gVar) {
        return new FontFamilyResolverImpl(new AndroidFontLoader(context), AndroidFontResolveInterceptor_androidKt.AndroidFontResolveInterceptor(context), FontFamilyResolverKt.getGlobalTypefaceRequestCache(), new FontListFontFamilyTypefaceAdapter(FontFamilyResolverKt.getGlobalAsyncTypefaceCache(), gVar), null, 16, null);
    }
}
