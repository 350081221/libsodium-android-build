package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.ui.text.font.FontVariation;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.umeng.analytics.pro.d;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u001a\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/text/font/DeviceFontFamilyNameFont;", "Landroidx/compose/ui/text/font/AndroidFont;", "Landroid/content/Context;", d.X, "Landroid/graphics/Typeface;", "loadCached", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "", "toString", "Landroidx/compose/ui/text/font/DeviceFontFamilyName;", "familyName", "Ljava/lang/String;", "Landroidx/compose/ui/text/font/FontWeight;", "weight", "Landroidx/compose/ui/text/font/FontWeight;", "getWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "style", "I", "getStyle-_-LCdwA", "()I", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "variationSettings", "<init>", "(Ljava/lang/String;Landroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;Lkotlin/jvm/internal/w;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class DeviceFontFamilyNameFont extends AndroidFont {

    @l
    private final String familyName;
    private final int style;

    @l
    private final FontWeight weight;

    private DeviceFontFamilyNameFont(String str, FontWeight fontWeight, int i5, FontVariation.Settings settings) {
        super(FontLoadingStrategy.Companion.m5647getOptionalLocalPKNRLFQ(), NamedFontLoader.INSTANCE, settings, null);
        this.familyName = str;
        this.weight = fontWeight;
        this.style = i5;
    }

    public /* synthetic */ DeviceFontFamilyNameFont(String str, FontWeight fontWeight, int i5, FontVariation.Settings settings, w wVar) {
        this(str, fontWeight, i5, settings);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceFontFamilyNameFont)) {
            return false;
        }
        DeviceFontFamilyNameFont deviceFontFamilyNameFont = (DeviceFontFamilyNameFont) obj;
        if (DeviceFontFamilyName.m5622equalsimpl0(this.familyName, deviceFontFamilyNameFont.familyName) && l0.g(getWeight(), deviceFontFamilyNameFont.getWeight()) && FontStyle.m5654equalsimpl0(mo5609getStyle_LCdwA(), deviceFontFamilyNameFont.mo5609getStyle_LCdwA()) && l0.g(getVariationSettings(), deviceFontFamilyNameFont.getVariationSettings())) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.text.font.Font
    /* renamed from: getStyle-_-LCdwA */
    public int mo5609getStyle_LCdwA() {
        return this.style;
    }

    @Override // androidx.compose.ui.text.font.Font
    @l
    public FontWeight getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return (((((DeviceFontFamilyName.m5623hashCodeimpl(this.familyName) * 31) + getWeight().hashCode()) * 31) + FontStyle.m5655hashCodeimpl(mo5609getStyle_LCdwA())) * 31) + getVariationSettings().hashCode();
    }

    @m
    public final android.graphics.Typeface loadCached(@l Context context) {
        return PlatformTypefaces_androidKt.PlatformTypefaces().mo5683optionalOnDeviceFontFamilyByName78DK7lM(this.familyName, getWeight(), mo5609getStyle_LCdwA(), getVariationSettings(), context);
    }

    @l
    public String toString() {
        return "Font(familyName=\"" + ((Object) DeviceFontFamilyName.m5624toStringimpl(this.familyName)) + "\", weight=" + getWeight() + ", style=" + ((Object) FontStyle.m5656toStringimpl(mo5609getStyle_LCdwA())) + ')';
    }
}
