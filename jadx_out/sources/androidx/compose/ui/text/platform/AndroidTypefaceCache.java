package androidx.compose.ui.text.platform;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.util.TypedValue;
import androidx.collection.LruCache;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.AndroidFont;
import androidx.compose.ui.text.font.AndroidPreloadedFont;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.ResourceFont;
import androidx.core.content.res.ResourcesCompat;
import com.umeng.analytics.pro.d;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.k;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@k(message = "Duplicate cache")
@i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidTypefaceCache;", "", "()V", "cache", "Landroidx/collection/LruCache;", "", "Landroid/graphics/Typeface;", "getKey", d.X, "Landroid/content/Context;", "font", "Landroidx/compose/ui/text/font/Font;", "getOrCreate", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nAndroidFontListTypeface.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidFontListTypeface.android.kt\nandroidx/compose/ui/text/platform/AndroidTypefaceCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,174:1\n1#2:175\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidTypefaceCache {

    @l
    public static final AndroidTypefaceCache INSTANCE = new AndroidTypefaceCache();

    @l
    private static final LruCache<String, Typeface> cache = new LruCache<>(16);
    public static final int $stable = 8;

    private AndroidTypefaceCache() {
    }

    @m
    public final String getKey(@l Context context, @l Font font) {
        String str;
        if (font instanceof ResourceFont) {
            TypedValue typedValue = new TypedValue();
            context.getResources().getValue(((ResourceFont) font).getResId(), typedValue, true);
            StringBuilder sb = new StringBuilder();
            sb.append("res:");
            CharSequence charSequence = typedValue.string;
            if (charSequence != null) {
                str = charSequence.toString();
            } else {
                str = null;
            }
            l0.m(str);
            sb.append(str);
            return sb.toString();
        }
        if (font instanceof AndroidPreloadedFont) {
            return ((AndroidPreloadedFont) font).getCacheKey();
        }
        throw new IllegalArgumentException("Unknown font type: " + font);
    }

    @l
    public final Typeface getOrCreate(@l Context context, @l Font font) {
        Typeface loadBlocking;
        Typeface typeface;
        String key = getKey(context, font);
        if (key != null && (typeface = cache.get(key)) != null) {
            return typeface;
        }
        if (font instanceof ResourceFont) {
            if (Build.VERSION.SDK_INT >= 26) {
                loadBlocking = AndroidResourceFontLoaderHelper.INSTANCE.create(context, ((ResourceFont) font).getResId());
            } else {
                loadBlocking = ResourcesCompat.getFont(context, ((ResourceFont) font).getResId());
                l0.m(loadBlocking);
            }
        } else if (font instanceof AndroidFont) {
            AndroidFont androidFont = (AndroidFont) font;
            loadBlocking = androidFont.getTypefaceLoader().loadBlocking(context, androidFont);
        } else {
            throw new IllegalArgumentException("Unknown font type: " + font);
        }
        if (loadBlocking != null) {
            if (key != null) {
                cache.put(key, loadBlocking);
            }
            return loadBlocking;
        }
        throw new IllegalArgumentException("Unable to load font " + font);
    }
}
