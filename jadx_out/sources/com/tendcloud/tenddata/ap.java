package com.tendcloud.tenddata;

import com.bytedance.android.live.base.api.push.ILivePush;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.protocol.HTTP;

/* loaded from: classes3.dex */
public final class ap {

    /* renamed from: a, reason: collision with root package name */
    private Map<String, String> f11413a = new HashMap();

    public ap a(String str, String str2) {
        this.f11413a.put(str, str2);
        return this;
    }

    public String toString() {
        return this.f11413a.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(HttpURLConnection httpURLConnection) {
        try {
            if (y.a(14) && y.b(19)) {
                this.f11413a.put(HTTP.CONN_DIRECTIVE, ILivePush.ClickType.CLOSE);
            }
            for (String str : this.f11413a.keySet()) {
                httpURLConnection.setRequestProperty(str, this.f11413a.get(str));
            }
        } catch (Throwable unused) {
        }
    }
}
