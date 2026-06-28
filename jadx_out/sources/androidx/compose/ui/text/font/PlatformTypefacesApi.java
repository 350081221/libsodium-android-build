package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontVariation;
import com.umeng.analytics.pro.d;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J2\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ*\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J,\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\fJ<\u0010\u001a\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"Landroidx/compose/ui/text/font/PlatformTypefacesApi;", "Landroidx/compose/ui/text/font/PlatformTypefaces;", "()V", "createAndroidTypefaceUsingTypefaceStyle", "Landroid/graphics/Typeface;", "genericFontFamily", "", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "createAndroidTypefaceUsingTypefaceStyle-RetOiIg", "(Ljava/lang/String;Landroidx/compose/ui/text/font/FontWeight;I)Landroid/graphics/Typeface;", "createDefault", "createDefault-FO1MlWM", "(Landroidx/compose/ui/text/font/FontWeight;I)Landroid/graphics/Typeface;", "createNamed", "name", "Landroidx/compose/ui/text/font/GenericFontFamily;", "createNamed-RetOiIg", "(Landroidx/compose/ui/text/font/GenericFontFamily;Landroidx/compose/ui/text/font/FontWeight;I)Landroid/graphics/Typeface;", "loadNamedFromTypefaceCacheOrNull", "familyName", "weight", "style", "loadNamedFromTypefaceCacheOrNull-RetOiIg", "optionalOnDeviceFontFamilyByName", "variationSettings", "Landroidx/compose/ui/text/font/FontVariation$Settings;", d.X, "Landroid/content/Context;", "optionalOnDeviceFontFamilyByName-78DK7lM", "(Ljava/lang/String;Landroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;Landroid/content/Context;)Landroid/graphics/Typeface;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@VisibleForTesting
/* loaded from: classes.dex */
public final class PlatformTypefacesApi implements PlatformTypefaces {
    /* renamed from: createAndroidTypefaceUsingTypefaceStyle-RetOiIg, reason: not valid java name */
    private final android.graphics.Typeface m5684createAndroidTypefaceUsingTypefaceStyleRetOiIg(String str, FontWeight fontWeight, int i5) {
        boolean z4;
        boolean z5 = false;
        if (FontStyle.m5654equalsimpl0(i5, FontStyle.Companion.m5661getNormal_LCdwA()) && l0.g(fontWeight, FontWeight.Companion.getNormal())) {
            if (str != null && str.length() != 0) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (z4) {
                return android.graphics.Typeface.DEFAULT;
            }
        }
        int m5608getAndroidTypefaceStyleFO1MlWM = AndroidFontUtils_androidKt.m5608getAndroidTypefaceStyleFO1MlWM(fontWeight, i5);
        if (str == null || str.length() == 0) {
            z5 = true;
        }
        if (z5) {
            return android.graphics.Typeface.defaultFromStyle(m5608getAndroidTypefaceStyleFO1MlWM);
        }
        return android.graphics.Typeface.create(str, m5608getAndroidTypefaceStyleFO1MlWM);
    }

    /* renamed from: createAndroidTypefaceUsingTypefaceStyle-RetOiIg$default, reason: not valid java name */
    static /* synthetic */ android.graphics.Typeface m5685createAndroidTypefaceUsingTypefaceStyleRetOiIg$default(PlatformTypefacesApi platformTypefacesApi, String str, FontWeight fontWeight, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = null;
        }
        if ((i6 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i6 & 4) != 0) {
            i5 = FontStyle.Companion.m5661getNormal_LCdwA();
        }
        return platformTypefacesApi.m5684createAndroidTypefaceUsingTypefaceStyleRetOiIg(str, fontWeight, i5);
    }

    /* renamed from: loadNamedFromTypefaceCacheOrNull-RetOiIg, reason: not valid java name */
    private final android.graphics.Typeface m5686loadNamedFromTypefaceCacheOrNullRetOiIg(String str, FontWeight fontWeight, int i5) {
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
        android.graphics.Typeface m5684createAndroidTypefaceUsingTypefaceStyleRetOiIg = m5684createAndroidTypefaceUsingTypefaceStyleRetOiIg(str, fontWeight, i5);
        if (l0.g(m5684createAndroidTypefaceUsingTypefaceStyleRetOiIg, android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, AndroidFontUtils_androidKt.m5608getAndroidTypefaceStyleFO1MlWM(fontWeight, i5))) || l0.g(m5684createAndroidTypefaceUsingTypefaceStyleRetOiIg, m5684createAndroidTypefaceUsingTypefaceStyleRetOiIg(null, fontWeight, i5))) {
            z5 = false;
        }
        if (!z5) {
            return null;
        }
        return m5684createAndroidTypefaceUsingTypefaceStyleRetOiIg;
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    @l
    /* renamed from: createDefault-FO1MlWM */
    public android.graphics.Typeface mo5681createDefaultFO1MlWM(@l FontWeight fontWeight, int i5) {
        return m5684createAndroidTypefaceUsingTypefaceStyleRetOiIg(null, fontWeight, i5);
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    @l
    /* renamed from: createNamed-RetOiIg */
    public android.graphics.Typeface mo5682createNamedRetOiIg(@l GenericFontFamily genericFontFamily, @l FontWeight fontWeight, int i5) {
        android.graphics.Typeface m5686loadNamedFromTypefaceCacheOrNullRetOiIg = m5686loadNamedFromTypefaceCacheOrNullRetOiIg(PlatformTypefaces_androidKt.getWeightSuffixForFallbackFamilyName(genericFontFamily.getName(), fontWeight), fontWeight, i5);
        if (m5686loadNamedFromTypefaceCacheOrNullRetOiIg == null) {
            return m5684createAndroidTypefaceUsingTypefaceStyleRetOiIg(genericFontFamily.getName(), fontWeight, i5);
        }
        return m5686loadNamedFromTypefaceCacheOrNullRetOiIg;
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    @m
    /* renamed from: optionalOnDeviceFontFamilyByName-78DK7lM */
    public android.graphics.Typeface mo5683optionalOnDeviceFontFamilyByName78DK7lM(@l String str, @l FontWeight fontWeight, int i5, @l FontVariation.Settings settings, @l Context context) {
        android.graphics.Typeface m5686loadNamedFromTypefaceCacheOrNullRetOiIg;
        FontFamily.Companion companion = FontFamily.Companion;
        if (l0.g(str, companion.getSansSerif().getName())) {
            m5686loadNamedFromTypefaceCacheOrNullRetOiIg = mo5682createNamedRetOiIg(companion.getSansSerif(), fontWeight, i5);
        } else if (l0.g(str, companion.getSerif().getName())) {
            m5686loadNamedFromTypefaceCacheOrNullRetOiIg = mo5682createNamedRetOiIg(companion.getSerif(), fontWeight, i5);
        } else if (l0.g(str, companion.getMonospace().getName())) {
            m5686loadNamedFromTypefaceCacheOrNullRetOiIg = mo5682createNamedRetOiIg(companion.getMonospace(), fontWeight, i5);
        } else if (l0.g(str, companion.getCursive().getName())) {
            m5686loadNamedFromTypefaceCacheOrNullRetOiIg = mo5682createNamedRetOiIg(companion.getCursive(), fontWeight, i5);
        } else {
            m5686loadNamedFromTypefaceCacheOrNullRetOiIg = m5686loadNamedFromTypefaceCacheOrNullRetOiIg(str, fontWeight, i5);
        }
        return PlatformTypefaces_androidKt.setFontVariationSettings(m5686loadNamedFromTypefaceCacheOrNullRetOiIg, settings, context);
    }
}
