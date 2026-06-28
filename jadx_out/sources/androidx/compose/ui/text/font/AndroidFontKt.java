package androidx.compose.ui.text.font;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.text.font.FontVariation;
import java.io.File;
import kotlin.i0;
import org.apache.http.cookie.ClientCookie;
import p4.l;
import u3.h;

@i0(d1 = {"\u0000>\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a@\u0010\r\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a8\u0010\r\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a8\u0010\r\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0014\u001a\b\u0010\u0016\u001a\u00020\u0015H\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"", ClientCookie.PATH_ATTR, "Landroid/content/res/AssetManager;", "assetManager", "Landroidx/compose/ui/text/font/FontWeight;", "weight", "Landroidx/compose/ui/text/font/FontStyle;", "style", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "variationSettings", "Landroidx/compose/ui/text/font/Font;", "Font-MuC2MFs", "(Ljava/lang/String;Landroid/content/res/AssetManager;Landroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;)Landroidx/compose/ui/text/font/Font;", "Font", "Ljava/io/File;", "file", "Font-Ej4NQ78", "(Ljava/io/File;Landroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;)Landroidx/compose/ui/text/font/Font;", "Landroid/os/ParcelFileDescriptor;", "fileDescriptor", "(Landroid/os/ParcelFileDescriptor;Landroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;)Landroidx/compose/ui/text/font/Font;", "Lkotlin/r2;", "generateAndroidFontKtForApiCompatibility", "ui-text_release"}, k = 2, mv = {1, 8, 0})
@h(name = "AndroidFontKt")
/* loaded from: classes.dex */
public final class AndroidFontKt {
    @Stable
    @l
    /* renamed from: Font-Ej4NQ78, reason: not valid java name */
    public static final Font m5603FontEj4NQ78(@l File file, @l FontWeight fontWeight, int i5, @l FontVariation.Settings settings) {
        return new AndroidFileFont(file, fontWeight, i5, settings, null);
    }

    /* renamed from: Font-Ej4NQ78$default, reason: not valid java name */
    public static /* synthetic */ Font m5605FontEj4NQ78$default(File file, FontWeight fontWeight, int i5, FontVariation.Settings settings, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i6 & 4) != 0) {
            i5 = FontStyle.Companion.m5661getNormal_LCdwA();
        }
        if ((i6 & 8) != 0) {
            settings = FontVariation.INSTANCE.m5676Settings6EWAqTQ(fontWeight, i5, new FontVariation.Setting[0]);
        }
        return m5603FontEj4NQ78(file, fontWeight, i5, settings);
    }

    @Stable
    @l
    /* renamed from: Font-MuC2MFs, reason: not valid java name */
    public static final Font m5606FontMuC2MFs(@l String str, @l AssetManager assetManager, @l FontWeight fontWeight, int i5, @l FontVariation.Settings settings) {
        return new AndroidAssetFont(assetManager, str, fontWeight, i5, settings, null);
    }

    /* renamed from: Font-MuC2MFs$default, reason: not valid java name */
    public static /* synthetic */ Font m5607FontMuC2MFs$default(String str, AssetManager assetManager, FontWeight fontWeight, int i5, FontVariation.Settings settings, int i6, Object obj) {
        if ((i6 & 4) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i6 & 8) != 0) {
            i5 = FontStyle.Companion.m5661getNormal_LCdwA();
        }
        if ((i6 & 16) != 0) {
            settings = FontVariation.INSTANCE.m5676Settings6EWAqTQ(fontWeight, i5, new FontVariation.Setting[0]);
        }
        return m5606FontMuC2MFs(str, assetManager, fontWeight, i5, settings);
    }

    private static final void generateAndroidFontKtForApiCompatibility() {
    }

    @Stable
    @l
    @RequiresApi(26)
    /* renamed from: Font-Ej4NQ78, reason: not valid java name */
    public static final Font m5602FontEj4NQ78(@l ParcelFileDescriptor parcelFileDescriptor, @l FontWeight fontWeight, int i5, @l FontVariation.Settings settings) {
        return new AndroidFileDescriptorFont(parcelFileDescriptor, fontWeight, i5, settings, null);
    }

    /* renamed from: Font-Ej4NQ78$default, reason: not valid java name */
    public static /* synthetic */ Font m5604FontEj4NQ78$default(ParcelFileDescriptor parcelFileDescriptor, FontWeight fontWeight, int i5, FontVariation.Settings settings, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i6 & 4) != 0) {
            i5 = FontStyle.Companion.m5661getNormal_LCdwA();
        }
        if ((i6 & 8) != 0) {
            settings = FontVariation.INSTANCE.m5676Settings6EWAqTQ(fontWeight, i5, new FontVariation.Setting[0]);
        }
        return m5602FontEj4NQ78(parcelFileDescriptor, fontWeight, i5, settings);
    }
}
