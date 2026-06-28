package f0;

import android.text.TextUtils;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public String f16055a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f16056b;

    public void a(boolean z4) {
        this.f16056b = Boolean.valueOf(z4);
    }

    public boolean b() {
        return this.f16056b != null;
    }

    public boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return TextUtils.equals(this.f16055a, str);
    }

    public void d(String str) {
        this.f16055a = str;
    }

    public boolean e() {
        Boolean bool = this.f16056b;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
