package androidx.compose.ui.text.font;

import android.content.Context;
import android.os.Build;
import androidx.annotation.VisibleForTesting;
import androidx.compose.ui.text.ExperimentalTextApi;
import androidx.compose.ui.text.font.FontVariation;
import com.umeng.analytics.pro.d;
import kotlin.i0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0000\u001a\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u001a \u0010\u0007\u001a\u0004\u0018\u00010\b*\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0001¨\u0006\r"}, d2 = {"PlatformTypefaces", "Landroidx/compose/ui/text/font/PlatformTypefaces;", "getWeightSuffixForFallbackFamilyName", "", "name", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "setFontVariationSettings", "Landroid/graphics/Typeface;", "variationSettings", "Landroidx/compose/ui/text/font/FontVariation$Settings;", d.X, "Landroid/content/Context;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PlatformTypefaces_androidKt {
    @l
    public static final PlatformTypefaces PlatformTypefaces() {
        if (Build.VERSION.SDK_INT >= 28) {
            return new PlatformTypefacesApi28();
        }
        return new PlatformTypefacesApi();
    }

    @l
    @VisibleForTesting
    public static final String getWeightSuffixForFallbackFamilyName(@l String str, @l FontWeight fontWeight) {
        boolean z4;
        boolean z5;
        boolean z6;
        int weight = fontWeight.getWeight() / 100;
        boolean z7 = true;
        if (weight >= 0 && weight < 2) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return str + "-thin";
        }
        if (2 <= weight && weight < 4) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            return str + "-light";
        }
        if (weight != 4) {
            if (weight == 5) {
                return str + "-medium";
            }
            if (6 <= weight && weight < 8) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!z6) {
                if (8 > weight || weight >= 11) {
                    z7 = false;
                }
                if (z7) {
                    return str + "-black";
                }
                return str;
            }
            return str;
        }
        return str;
    }

    @ExperimentalTextApi
    @m
    public static final android.graphics.Typeface setFontVariationSettings(@m android.graphics.Typeface typeface, @l FontVariation.Settings settings, @l Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return TypefaceCompatApi26.INSTANCE.setFontVariationSettings(typeface, settings, context);
        }
        return typeface;
    }
}
