package androidx.compose.ui.text.font;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.ParcelFileDescriptor;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.text.ExperimentalTextApi;
import androidx.compose.ui.text.font.FontVariation;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import com.umeng.analytics.pro.d;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import org.apache.http.cookie.ClientCookie;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J$\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J$\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J!\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014*\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0003¢\u0006\u0002\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/text/font/TypefaceBuilderCompat;", "", "()V", "createFromAssets", "Landroid/graphics/Typeface;", "assetManager", "Landroid/content/res/AssetManager;", ClientCookie.PATH_ATTR, "", d.X, "Landroid/content/Context;", "variationSettings", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "createFromFile", "file", "Ljava/io/File;", "createFromFileDescriptor", "fileDescriptor", "Landroid/os/ParcelFileDescriptor;", "toVariationSettings", "", "Landroid/graphics/fonts/FontVariationAxis;", "(Landroidx/compose/ui/text/font/FontVariation$Settings;Landroid/content/Context;)[Landroid/graphics/fonts/FontVariationAxis;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RequiresApi(api = 26)
@r1({"SMAP\nAndroidPreloadedFont.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPreloadedFont.android.kt\nandroidx/compose/ui/text/font/TypefaceBuilderCompat\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,234:1\n151#2,3:235\n33#2,4:238\n154#2,2:242\n38#2:244\n156#2:245\n37#3,2:246\n*S KotlinDebug\n*F\n+ 1 AndroidPreloadedFont.android.kt\nandroidx/compose/ui/text/font/TypefaceBuilderCompat\n*L\n229#1:235,3\n229#1:238,4\n229#1:242,2\n229#1:244\n229#1:245\n231#1:246,2\n*E\n"})
/* loaded from: classes.dex */
final class TypefaceBuilderCompat {

    @l
    public static final TypefaceBuilderCompat INSTANCE = new TypefaceBuilderCompat();

    private TypefaceBuilderCompat() {
    }

    @ExperimentalTextApi
    @RequiresApi(26)
    private final FontVariationAxis[] toVariationSettings(FontVariation.Settings settings, Context context) {
        Density Density;
        if (context != null) {
            Density = AndroidDensity_androidKt.Density(context);
        } else if (!settings.getNeedsDensity$ui_text_release()) {
            Density = DensityKt.Density(1.0f, 1.0f);
        } else {
            throw new IllegalStateException("Required density, but not provided");
        }
        List<FontVariation.Setting> settings2 = settings.getSettings();
        ArrayList arrayList = new ArrayList(settings2.size());
        int size = settings2.size();
        for (int i5 = 0; i5 < size; i5++) {
            FontVariation.Setting setting = settings2.get(i5);
            arrayList.add(new FontVariationAxis(setting.getAxisName(), setting.toVariationValue(Density)));
        }
        return (FontVariationAxis[]) arrayList.toArray(new FontVariationAxis[0]);
    }

    @ExperimentalTextApi
    @DoNotInline
    @m
    public final android.graphics.Typeface createFromAssets(@l AssetManager assetManager, @l String str, @m Context context, @l FontVariation.Settings settings) {
        Typeface.Builder fontVariationSettings;
        android.graphics.Typeface build;
        if (context == null) {
            return null;
        }
        fontVariationSettings = new Typeface.Builder(assetManager, str).setFontVariationSettings(toVariationSettings(settings, context));
        build = fontVariationSettings.build();
        return build;
    }

    @ExperimentalTextApi
    @DoNotInline
    @m
    public final android.graphics.Typeface createFromFile(@l File file, @m Context context, @l FontVariation.Settings settings) {
        Typeface.Builder fontVariationSettings;
        android.graphics.Typeface build;
        if (context == null) {
            return null;
        }
        fontVariationSettings = new Typeface.Builder(file).setFontVariationSettings(toVariationSettings(settings, context));
        build = fontVariationSettings.build();
        return build;
    }

    @ExperimentalTextApi
    @DoNotInline
    @m
    public final android.graphics.Typeface createFromFileDescriptor(@l ParcelFileDescriptor parcelFileDescriptor, @m Context context, @l FontVariation.Settings settings) {
        Typeface.Builder fontVariationSettings;
        android.graphics.Typeface build;
        if (context == null) {
            return null;
        }
        fontVariationSettings = new Typeface.Builder(parcelFileDescriptor.getFileDescriptor()).setFontVariationSettings(toVariationSettings(settings, context));
        build = fontVariationSettings.build();
        return build;
    }
}
