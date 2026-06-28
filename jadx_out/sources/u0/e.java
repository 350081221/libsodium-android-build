package u0;

import android.content.Context;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.protocol.HTTP;
import org.json.JSONObject;
import q0.a;

/* loaded from: classes2.dex */
public class e extends s0.e {
    @Override // s0.e
    public String c(y0.a aVar, String str, JSONObject jSONObject) {
        return str;
    }

    @Override // s0.e
    public Map<String, String> e(boolean z4, String str) {
        return new HashMap();
    }

    @Override // s0.e
    public JSONObject f() {
        return null;
    }

    @Override // s0.e
    public s0.b i(y0.a aVar, Context context, String str) throws Throwable {
        a1.e.i(k0.a.A, "mdap post");
        byte[] a5 = o0.b.a(str.getBytes(Charset.forName("UTF-8")));
        HashMap hashMap = new HashMap();
        hashMap.put("utdId", y0.b.e().d());
        hashMap.put("logHeader", "RAW");
        hashMap.put("bizCode", a1.e.f95b);
        hashMap.put("productId", "alipaysdk_android");
        hashMap.put(HTTP.CONTENT_ENCODING, "Gzip");
        hashMap.put("productVersion", "15.8.17");
        a.b b5 = q0.a.b(context, new a.C0660a(k0.a.f18998e, hashMap, a5));
        a1.e.i(k0.a.A, "mdap got " + b5);
        if (b5 != null) {
            boolean m5 = s0.e.m(b5);
            try {
                byte[] bArr = b5.f22293c;
                if (m5) {
                    bArr = o0.b.b(bArr);
                }
                return new s0.b("", new String(bArr, Charset.forName("UTF-8")));
            } catch (Exception e5) {
                a1.e.d(e5);
                return null;
            }
        }
        throw new RuntimeException("Response is null");
    }

    @Override // s0.e
    public boolean o() {
        return false;
    }
}
