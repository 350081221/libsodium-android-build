package g3;

import android.text.Html;
import android.text.Spanned;
import android.util.Log;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public class b implements e {

    /* renamed from: b, reason: collision with root package name */
    private static final String f16109b = "Html2SpannedParser";

    /* renamed from: c, reason: collision with root package name */
    private static final String f16110c = "com.zzhoujay.html.Html";

    /* renamed from: d, reason: collision with root package name */
    private static final Method f16111d;

    /* renamed from: a, reason: collision with root package name */
    private Html.TagHandler f16112a;

    static {
        Method method;
        try {
            method = com.zzhoujay.html.b.class.getMethod("fromHtml", String.class, Html.ImageGetter.class, Html.TagHandler.class);
        } catch (Exception unused) {
            method = null;
        }
        f16111d = method;
    }

    public b(Html.TagHandler tagHandler) {
        this.f16112a = tagHandler;
    }

    @Override // g3.e
    public Spanned parse(String str) {
        Method method = f16111d;
        if (method != null) {
            try {
                return (Spanned) method.invoke(null, str, null, this.f16112a);
            } catch (Exception e5) {
                Log.d(f16109b, "Z_FROM_HTML_METHOD invoke failure", e5);
            }
        }
        return Html.fromHtml(str, null, this.f16112a);
    }
}
