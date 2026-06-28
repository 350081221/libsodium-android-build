package s0;

import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f22335a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22336b;

    public b(String str, String str2) {
        this.f22335a = str;
        this.f22336b = str2;
    }

    public String a() {
        return this.f22336b;
    }

    public String b() {
        return this.f22335a;
    }

    public JSONObject c() {
        if (TextUtils.isEmpty(this.f22336b)) {
            return null;
        }
        try {
            return new JSONObject(this.f22336b);
        } catch (Exception e5) {
            a1.e.d(e5);
            return null;
        }
    }

    public String toString() {
        return String.format("<Letter envelop=%s body=%s>", this.f22335a, this.f22336b);
    }
}
