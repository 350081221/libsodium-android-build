package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@kotlin.i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/AndroidFontResourceLoaderHelper;", "", "()V", "create", "Landroid/graphics/Typeface;", com.umeng.analytics.pro.d.X, "Landroid/content/Context;", "resourceId", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RequiresApi(26)
/* loaded from: classes.dex */
final class AndroidFontResourceLoaderHelper {

    @p4.l
    public static final AndroidFontResourceLoaderHelper INSTANCE = new AndroidFontResourceLoaderHelper();

    private AndroidFontResourceLoaderHelper() {
    }

    @p4.l
    @DoNotInline
    @RequiresApi(26)
    public final Typeface create(@p4.l Context context, int i5) {
        Typeface font;
        font = context.getResources().getFont(i5);
        return font;
    }
}
