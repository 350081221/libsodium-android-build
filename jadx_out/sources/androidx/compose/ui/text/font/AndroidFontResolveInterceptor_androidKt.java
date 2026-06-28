package androidx.compose.ui.text.font;

import android.content.Context;
import android.os.Build;
import com.umeng.analytics.pro.d;
import kotlin.i0;
import p4.l;

@i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"AndroidFontResolveInterceptor", "Landroidx/compose/ui/text/font/AndroidFontResolveInterceptor;", d.X, "Landroid/content/Context;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidFontResolveInterceptor_androidKt {
    @l
    public static final AndroidFontResolveInterceptor AndroidFontResolveInterceptor(@l Context context) {
        int i5;
        if (Build.VERSION.SDK_INT >= 31) {
            i5 = context.getResources().getConfiguration().fontWeightAdjustment;
        } else {
            i5 = 0;
        }
        return new AndroidFontResolveInterceptor(i5);
    }
}
