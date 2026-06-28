package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontVariation;
import com.umeng.analytics.pro.d;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ*\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J,\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\fJ<\u0010\u001a\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"Landroidx/compose/ui/text/font/PlatformTypefacesApi28;", "Landroidx/compose/ui/text/font/PlatformTypefaces;", "()V", "createAndroidTypefaceApi28", "Landroid/graphics/Typeface;", "genericFontFamily", "", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "createAndroidTypefaceApi28-RetOiIg", "(Ljava/lang/String;Landroidx/compose/ui/text/font/FontWeight;I)Landroid/graphics/Typeface;", "createDefault", "createDefault-FO1MlWM", "(Landroidx/compose/ui/text/font/FontWeight;I)Landroid/graphics/Typeface;", "createNamed", "name", "Landroidx/compose/ui/text/font/GenericFontFamily;", "createNamed-RetOiIg", "(Landroidx/compose/ui/text/font/GenericFontFamily;Landroidx/compose/ui/text/font/FontWeight;I)Landroid/graphics/Typeface;", "loadNamedFromTypefaceCacheOrNull", "familyName", "weight", "style", "loadNamedFromTypefaceCacheOrNull-RetOiIg", "optionalOnDeviceFontFamilyByName", "variationSettings", "Landroidx/compose/ui/text/font/FontVariation$Settings;", d.X, "Landroid/content/Context;", "optionalOnDeviceFontFamilyByName-78DK7lM", "(Ljava/lang/String;Landroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;Landroid/content/Context;)Landroid/graphics/Typeface;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RequiresApi(28)
@VisibleForTesting
/* loaded from: classes.dex */
public final class PlatformTypefacesApi28 implements PlatformTypefaces {
    /* renamed from: createAndroidTypefaceApi28-RetOiIg, reason: not valid java name */
    private final android.graphics.Typeface m5687createAndroidTypefaceApi28RetOiIg(String str, FontWeight fontWeight, int i5) {
        android.graphics.Typeface create;
        android.graphics.Typeface create2;
        boolean z4;
        FontStyle.Companion companion = FontStyle.Companion;
        if (FontStyle.m5654equalsimpl0(i5, companion.m5661getNormal_LCdwA()) && l0.g(fontWeight, FontWeight.Companion.getNormal())) {
            if (str != null && str.length() != 0) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (z4) {
                return android.graphics.Typeface.DEFAULT;
            }
        }
        if (str == null) {
            create = android.graphics.Typeface.DEFAULT;
        } else {
            create = android.graphics.Typeface.create(str, 0);
        }
        create2 = android.graphics.Typeface.create(create, fontWeight.getWeight(), FontStyle.m5654equalsimpl0(i5, companion.m5660getItalic_LCdwA()));
        return create2;
    }

    /* renamed from: createAndroidTypefaceApi28-RetOiIg$default, reason: not valid java name */
    static /* synthetic */ android.graphics.Typeface m5688createAndroidTypefaceApi28RetOiIg$default(PlatformTypefacesApi28 platformTypefacesApi28, String str, FontWeight fontWeight, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = null;
        }
        return platformTypefacesApi28.m5687createAndroidTypefaceApi28RetOiIg(str, fontWeight, i5);
    }

    /* renamed from: loadNamedFromTypefaceCacheOrNull-RetOiIg, reason: not valid java name */
    private final android.graphics.Typeface m5689loadNamedFromTypefaceCacheOrNullRetOiIg(String str, FontWeight fontWeight, int i5) {
        boolean z4;
        boolean z5 = true;
        if (str.length() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return null;
        }
        android.graphics.Typeface m5687createAndroidTypefaceApi28RetOiIg = m5687createAndroidTypefaceApi28RetOiIg(str, fontWeight, i5);
        if (l0.g(m5687createAndroidTypefaceApi28RetOiIg, TypefaceHelperMethodsApi28.INSTANCE.create(android.graphics.Typeface.DEFAULT, fontWeight.getWeight(), FontStyle.m5654equalsimpl0(i5, FontStyle.Companion.m5660getItalic_LCdwA()))) || l0.g(m5687createAndroidTypefaceApi28RetOiIg, m5687createAndroidTypefaceApi28RetOiIg(null, fontWeight, i5))) {
            z5 = false;
        }
        if (!z5) {
            return null;
        }
        return m5687createAndroidTypefaceApi28RetOiIg;
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    @l
    /* renamed from: createDefault-FO1MlWM */
    public android.graphics.Typeface mo5681createDefaultFO1MlWM(@l FontWeight fontWeight, int i5) {
        return m5687createAndroidTypefaceApi28RetOiIg(null, fontWeight, i5);
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    @l
    /* renamed from: createNamed-RetOiIg */
    public android.graphics.Typeface mo5682createNamedRetOiIg(@l GenericFontFamily genericFontFamily, @l FontWeight fontWeight, int i5) {
        return m5687createAndroidTypefaceApi28RetOiIg(genericFontFamily.getName(), fontWeight, i5);
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    @m
    /* renamed from: optionalOnDeviceFontFamilyByName-78DK7lM */
    public android.graphics.Typeface mo5683optionalOnDeviceFontFamilyByName78DK7lM(@l String str, @l FontWeight fontWeight, int i5, @l FontVariation.Settings settings, @l Context context) {
        android.graphics.Typeface m5689loadNamedFromTypefaceCacheOrNullRetOiIg;
        FontFamily.Companion companion = FontFamily.Companion;
        if (l0.g(str, companion.getSansSerif().getName())) {
            m5689loadNamedFromTypefaceCacheOrNullRetOiIg = mo5682createNamedRetOiIg(companion.getSansSerif(), fontWeight, i5);
        } else if (l0.g(str, companion.getSerif().getName())) {
            m5689loadNamedFromTypefaceCacheOrNullRetOiIg = mo5682createNamedRetOiIg(companion.getSerif(), fontWeight, i5);
        } else if (l0.g(str, companion.getMonospace().getName())) {
            m5689loadNamedFromTypefaceCacheOrNullRetOiIg = mo5682createNamedRetOiIg(companion.getMonospace(), fontWeight, i5);
        } else if (l0.g(str, companion.getCursive().getName())) {
            m5689loadNamedFromTypefaceCacheOrNullRetOiIg = mo5682createNamedRetOiIg(companion.getCursive(), fontWeight, i5);
        } else {
            m5689loadNamedFromTypefaceCacheOrNullRetOiIg = m5689loadNamedFromTypefaceCacheOrNullRetOiIg(str, fontWeight, i5);
        }
        return PlatformTypefaces_androidKt.setFontVariationSettings(m5689loadNamedFromTypefaceCacheOrNullRetOiIg, settings, context);
    }
}
