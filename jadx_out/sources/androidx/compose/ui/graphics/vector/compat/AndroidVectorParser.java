package androidx.compose.ui.graphics.vector.compat;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.StyleableRes;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ComplexColorCompat;
import androidx.core.content.res.TypedArrayUtils;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import org.xmlpull.v1.XmlPullParser;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010'\u001a\u00020$\u0012\b\b\u0002\u0010(\u001a\u00020\u0002¢\u0006\u0004\b6\u00107J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J,\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0018\u00010\bR\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fJ(\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0002J(\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0016J(\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0018J\u001e\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0016J\u001e\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0002J\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0002J\u001e\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0016J8\u0010!\u001a\u00020 2\u0006\u0010\u0010\u001a\u00020\u000e2\f\u0010\t\u001a\b\u0018\u00010\bR\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0013\u001a\u00020\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u0002J0\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010\u0010\u001a\u00020\u000e2\f\u0010\t\u001a\b\u0018\u00010\bR\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0013\u001a\u00020\u0002J\t\u0010%\u001a\u00020$HÆ\u0003J\t\u0010&\u001a\u00020\u0002HÆ\u0003J\u001d\u0010)\u001a\u00020\u00002\b\b\u0002\u0010'\u001a\u00020$2\b\b\u0002\u0010(\u001a\u00020\u0002HÆ\u0001J\t\u0010*\u001a\u00020\u0011HÖ\u0001J\t\u0010+\u001a\u00020\u0002HÖ\u0001J\u0013\u0010-\u001a\u00020\u00182\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010'\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b'\u0010.\u001a\u0004\b/\u00100R\"\u0010(\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105¨\u00068"}, d2 = {"Landroidx/compose/ui/graphics/vector/compat/AndroidVectorParser;", "", "", "resConfig", "Lkotlin/r2;", "updateConfig", "Landroid/content/res/Resources;", "res", "Landroid/content/res/Resources$Theme;", "theme", "Landroid/util/AttributeSet;", "set", "", "attrs", "Landroid/content/res/TypedArray;", "obtainAttributes", "typedArray", "", "attrName", "resId", "defaultValue", "getNamedInt", "", "getNamedFloat", "", "getNamedBoolean", "index", "getFloat", "getInt", "getString", "defValue", "getDimension", "Landroidx/core/content/res/ComplexColorCompat;", "getNamedComplexColor", "Landroid/content/res/ColorStateList;", "getNamedColorStateList", "Lorg/xmlpull/v1/XmlPullParser;", "component1", "component2", "xmlParser", "config", "copy", "toString", TTDownloadField.TT_HASHCODE, "other", "equals", "Lorg/xmlpull/v1/XmlPullParser;", "getXmlParser", "()Lorg/xmlpull/v1/XmlPullParser;", "I", "getConfig", "()I", "setConfig", "(I)V", "<init>", "(Lorg/xmlpull/v1/XmlPullParser;I)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AndroidVectorParser {
    public static final int $stable = 8;
    private int config;

    @l
    private final XmlPullParser xmlParser;

    public AndroidVectorParser(@l XmlPullParser xmlPullParser, int i5) {
        this.xmlParser = xmlPullParser;
        this.config = i5;
    }

    public static /* synthetic */ AndroidVectorParser copy$default(AndroidVectorParser androidVectorParser, XmlPullParser xmlPullParser, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            xmlPullParser = androidVectorParser.xmlParser;
        }
        if ((i6 & 2) != 0) {
            i5 = androidVectorParser.config;
        }
        return androidVectorParser.copy(xmlPullParser, i5);
    }

    private final void updateConfig(int i5) {
        this.config = i5 | this.config;
    }

    @l
    public final XmlPullParser component1() {
        return this.xmlParser;
    }

    public final int component2() {
        return this.config;
    }

    @l
    public final AndroidVectorParser copy(@l XmlPullParser xmlPullParser, int i5) {
        return new AndroidVectorParser(xmlPullParser, i5);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidVectorParser)) {
            return false;
        }
        AndroidVectorParser androidVectorParser = (AndroidVectorParser) obj;
        return l0.g(this.xmlParser, androidVectorParser.xmlParser) && this.config == androidVectorParser.config;
    }

    public final int getConfig() {
        return this.config;
    }

    public final float getDimension(@l TypedArray typedArray, int i5, float f5) {
        float dimension = typedArray.getDimension(i5, f5);
        updateConfig(typedArray.getChangingConfigurations());
        return dimension;
    }

    public final float getFloat(@l TypedArray typedArray, int i5, float f5) {
        float f6 = typedArray.getFloat(i5, f5);
        updateConfig(typedArray.getChangingConfigurations());
        return f6;
    }

    public final int getInt(@l TypedArray typedArray, int i5, int i6) {
        int i7 = typedArray.getInt(i5, i6);
        updateConfig(typedArray.getChangingConfigurations());
        return i7;
    }

    public final boolean getNamedBoolean(@l TypedArray typedArray, @l String str, @StyleableRes int i5, boolean z4) {
        boolean namedBoolean = TypedArrayUtils.getNamedBoolean(typedArray, this.xmlParser, str, i5, z4);
        updateConfig(typedArray.getChangingConfigurations());
        return namedBoolean;
    }

    @m
    public final ColorStateList getNamedColorStateList(@l TypedArray typedArray, @m Resources.Theme theme, @l String str, @StyleableRes int i5) {
        ColorStateList namedColorStateList = TypedArrayUtils.getNamedColorStateList(typedArray, this.xmlParser, theme, str, i5);
        updateConfig(typedArray.getChangingConfigurations());
        return namedColorStateList;
    }

    @l
    public final ComplexColorCompat getNamedComplexColor(@l TypedArray typedArray, @m Resources.Theme theme, @l String str, @StyleableRes int i5, @ColorInt int i6) {
        ComplexColorCompat namedComplexColor = TypedArrayUtils.getNamedComplexColor(typedArray, this.xmlParser, theme, str, i5, i6);
        updateConfig(typedArray.getChangingConfigurations());
        return namedComplexColor;
    }

    public final float getNamedFloat(@l TypedArray typedArray, @l String str, @StyleableRes int i5, float f5) {
        float namedFloat = TypedArrayUtils.getNamedFloat(typedArray, this.xmlParser, str, i5, f5);
        updateConfig(typedArray.getChangingConfigurations());
        return namedFloat;
    }

    public final int getNamedInt(@l TypedArray typedArray, @l String str, @StyleableRes int i5, int i6) {
        int namedInt = TypedArrayUtils.getNamedInt(typedArray, this.xmlParser, str, i5, i6);
        updateConfig(typedArray.getChangingConfigurations());
        return namedInt;
    }

    @m
    public final String getString(@l TypedArray typedArray, int i5) {
        String string = typedArray.getString(i5);
        updateConfig(typedArray.getChangingConfigurations());
        return string;
    }

    @l
    public final XmlPullParser getXmlParser() {
        return this.xmlParser;
    }

    public int hashCode() {
        return (this.xmlParser.hashCode() * 31) + Integer.hashCode(this.config);
    }

    @l
    public final TypedArray obtainAttributes(@l Resources resources, @m Resources.Theme theme, @l AttributeSet attributeSet, @l int[] iArr) {
        TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, iArr);
        updateConfig(obtainAttributes.getChangingConfigurations());
        return obtainAttributes;
    }

    public final void setConfig(int i5) {
        this.config = i5;
    }

    @l
    public String toString() {
        return "AndroidVectorParser(xmlParser=" + this.xmlParser + ", config=" + this.config + ')';
    }

    public /* synthetic */ AndroidVectorParser(XmlPullParser xmlPullParser, int i5, int i6, w wVar) {
        this(xmlPullParser, (i6 & 2) != 0 ? 0 : i5);
    }
}
