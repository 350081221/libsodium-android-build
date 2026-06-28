package androidx.compose.ui.res;

import android.content.Context;
import androidx.annotation.GuardedBy;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.AndroidTypeface_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.LoadedFontFamily;
import androidx.compose.ui.text.font.SystemFontFamily;
import androidx.compose.ui.text.font.Typeface;
import com.umeng.analytics.pro.bi;
import com.umeng.analytics.pro.d;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.b1;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.k;
import kotlin.m;
import p4.l;

@i0(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\b\u001a\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001c\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"cacheLock", "Ljava/lang/Object;", "syncLoadedTypefaces", "", "Landroidx/compose/ui/text/font/FontFamily;", "Landroidx/compose/ui/text/font/Typeface;", "fontResource", "fontFamily", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/font/Typeface;", "fontResourceFromContext", d.X, "Landroid/content/Context;", bi.ay, "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nFontResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontResources.android.kt\nandroidx/compose/ui/res/FontResources_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,77:1\n74#2:78\n361#3,7:79\n*S KotlinDebug\n*F\n+ 1 FontResources.android.kt\nandroidx/compose/ui/res/FontResources_androidKt\n*L\n55#1:78\n69#1:79,7\n*E\n"})
/* loaded from: classes.dex */
public final class FontResources_androidKt {

    @l
    private static final Object cacheLock = new Object();

    @l
    @GuardedBy("cacheLock")
    private static final Map<FontFamily, Typeface> syncLoadedTypefaces = new LinkedHashMap();

    @k(level = m.WARNING, message = "Prefer to preload fonts using FontFamily.Resolver.", replaceWith = @b1(expression = "FontFamily.Resolver.preload(fontFamily, Font.AndroidResourceLoader(context))", imports = {}))
    @l
    @Composable
    @ReadOnlyComposable
    public static final Typeface fontResource(@l FontFamily fontFamily, @p4.m Composer composer, int i5) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-190831095, i5, -1, "androidx.compose.ui.res.fontResource (FontResources.android.kt:53)");
        }
        Typeface fontResourceFromContext = fontResourceFromContext((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()), fontFamily);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return fontResourceFromContext;
    }

    @k(level = m.WARNING, message = "Prefer to preload fonts using FontFamily.Resolver.", replaceWith = @b1(expression = "FontFamily.Resolver.preload(fontFamily, Font.AndroidResourceLoader(context))", imports = {}))
    private static final Typeface fontResourceFromContext(Context context, FontFamily fontFamily) {
        Typeface typeface;
        if (!(fontFamily instanceof SystemFontFamily) && !(fontFamily instanceof LoadedFontFamily)) {
            return AndroidTypeface_androidKt.Typeface$default(context, fontFamily, null, 4, null);
        }
        synchronized (cacheLock) {
            Map<FontFamily, Typeface> map = syncLoadedTypefaces;
            Typeface typeface2 = map.get(fontFamily);
            if (typeface2 == null) {
                typeface2 = AndroidTypeface_androidKt.Typeface$default(context, fontFamily, null, 4, null);
                map.put(fontFamily, typeface2);
            }
            typeface = typeface2;
        }
        return typeface;
    }
}
