package g3;

import android.text.Spanned;
import android.widget.TextView;

/* loaded from: classes3.dex */
public class d implements e {

    /* renamed from: a, reason: collision with root package name */
    private TextView f16113a;

    public d(TextView textView) {
        this.f16113a = textView;
    }

    @Override // g3.e
    public Spanned parse(String str) {
        return com.zzhoujay.markdown.b.c(str, null, this.f16113a);
    }
}
