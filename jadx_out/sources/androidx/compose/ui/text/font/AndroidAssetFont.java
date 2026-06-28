package androidx.compose.ui.text.font;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.FontVariation;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.umeng.analytics.pro.d;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import org.apache.http.cookie.ClientCookie;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0010¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\t\u001a\u00020\bH\u0016J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018¨\u0006#"}, d2 = {"Landroidx/compose/ui/text/font/AndroidAssetFont;", "Landroidx/compose/ui/text/font/AndroidPreloadedFont;", "Landroid/content/Context;", d.X, "Landroid/graphics/Typeface;", "doLoad$ui_text_release", "(Landroid/content/Context;)Landroid/graphics/Typeface;", "doLoad", "", "toString", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "Landroid/content/res/AssetManager;", "assetManager", "Landroid/content/res/AssetManager;", "getAssetManager", "()Landroid/content/res/AssetManager;", ClientCookie.PATH_ATTR, "Ljava/lang/String;", "getPath", "()Ljava/lang/String;", "cacheKey", "getCacheKey", "Landroidx/compose/ui/text/font/FontWeight;", "weight", "Landroidx/compose/ui/text/font/FontStyle;", "style", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "variationSettings", "<init>", "(Landroid/content/res/AssetManager;Ljava/lang/String;Landroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;Lkotlin/jvm/internal/w;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AndroidAssetFont extends AndroidPreloadedFont {
    public static final int $stable = 0;

    @l
    private final AssetManager assetManager;

    @l
    private final String cacheKey;

    @l
    private final String path;

    public /* synthetic */ AndroidAssetFont(AssetManager assetManager, String str, FontWeight fontWeight, int i5, FontVariation.Settings settings, int i6, w wVar) {
        this(assetManager, str, (i6 & 4) != 0 ? FontWeight.Companion.getNormal() : fontWeight, (i6 & 8) != 0 ? FontStyle.Companion.m5661getNormal_LCdwA() : i5, settings, null);
    }

    public /* synthetic */ AndroidAssetFont(AssetManager assetManager, String str, FontWeight fontWeight, int i5, FontVariation.Settings settings, w wVar) {
        this(assetManager, str, fontWeight, i5, settings);
    }

    @Override // androidx.compose.ui.text.font.AndroidPreloadedFont
    @m
    public android.graphics.Typeface doLoad$ui_text_release(@m Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return TypefaceBuilderCompat.INSTANCE.createFromAssets(this.assetManager, this.path, context, getVariationSettings());
        }
        return android.graphics.Typeface.createFromAsset(this.assetManager, this.path);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidAssetFont)) {
            return false;
        }
        AndroidAssetFont androidAssetFont = (AndroidAssetFont) obj;
        if (l0.g(this.path, androidAssetFont.path) && l0.g(getVariationSettings(), androidAssetFont.getVariationSettings())) {
            return true;
        }
        return false;
    }

    @l
    public final AssetManager getAssetManager() {
        return this.assetManager;
    }

    @Override // androidx.compose.ui.text.font.AndroidPreloadedFont
    @l
    public String getCacheKey() {
        return this.cacheKey;
    }

    @l
    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        return (this.path.hashCode() * 31) + getVariationSettings().hashCode();
    }

    @l
    public String toString() {
        return "Font(assetManager, path=" + this.path + ", weight=" + getWeight() + ", style=" + ((Object) FontStyle.m5656toStringimpl(mo5609getStyle_LCdwA())) + ')';
    }

    private AndroidAssetFont(AssetManager assetManager, String str, FontWeight fontWeight, int i5, FontVariation.Settings settings) {
        super(fontWeight, i5, settings, null);
        this.assetManager = assetManager;
        this.path = str;
        setTypeface$ui_text_release(doLoad$ui_text_release(null));
        this.cacheKey = "asset:" + str;
    }
}
