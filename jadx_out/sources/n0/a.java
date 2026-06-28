package n0;

import android.content.Context;
import android.content.SharedPreferences;
import com.umeng.analytics.pro.bi;
import l0.f;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public String f20807a;

    /* renamed from: b, reason: collision with root package name */
    public SharedPreferences f20808b;

    /* renamed from: c, reason: collision with root package name */
    public SharedPreferences.Editor f20809c = null;

    /* renamed from: d, reason: collision with root package name */
    public Context f20810d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f20811e;

    public a(Context context, String str, String str2, boolean z4, boolean z5) {
        this.f20808b = null;
        this.f20811e = z5;
        this.f20807a = str2;
        this.f20810d = context;
        if (context != null) {
            this.f20808b = context.getSharedPreferences(str2, 0);
        }
    }

    private void d() {
        SharedPreferences sharedPreferences;
        if (this.f20809c == null && (sharedPreferences = this.f20808b) != null) {
            this.f20809c = sharedPreferences.edit();
        }
    }

    public String a(String str) {
        SharedPreferences sharedPreferences = this.f20808b;
        if (sharedPreferences != null) {
            String string = sharedPreferences.getString(str, "");
            if (!f.b(string)) {
                return string;
            }
        }
        return "";
    }

    public void b(String str, String str2) {
        if (!f.b(str) && !str.equals(bi.aL)) {
            d();
            SharedPreferences.Editor editor = this.f20809c;
            if (editor != null) {
                editor.putString(str, str2);
            }
        }
    }

    public boolean c() {
        boolean z4;
        Context context;
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editor = this.f20809c;
        if (editor != null) {
            if (!this.f20811e && this.f20808b != null) {
                editor.putLong(bi.aL, currentTimeMillis);
            }
            if (!this.f20809c.commit()) {
                z4 = false;
                if (this.f20808b != null && (context = this.f20810d) != null) {
                    this.f20808b = context.getSharedPreferences(this.f20807a, 0);
                }
                return z4;
            }
        }
        z4 = true;
        if (this.f20808b != null) {
            this.f20808b = context.getSharedPreferences(this.f20807a, 0);
        }
        return z4;
    }

    public void e(String str) {
        if (!f.b(str) && !str.equals(bi.aL)) {
            d();
            SharedPreferences.Editor editor = this.f20809c;
            if (editor != null) {
                editor.remove(str);
            }
        }
    }
}
