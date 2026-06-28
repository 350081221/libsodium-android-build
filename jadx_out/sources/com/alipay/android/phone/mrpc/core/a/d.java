package com.alipay.android.phone.mrpc.core.a;

import a1.l;
import com.alipay.android.phone.mrpc.core.RpcException;
import java.lang.reflect.Type;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class d extends a {
    public d(Type type, byte[] bArr) {
        super(type, bArr);
    }

    @Override // com.alipay.android.phone.mrpc.core.a.c
    public final Object a() {
        try {
            String str = new String(this.f2697b);
            Thread.currentThread().getId();
            JSONObject jSONObject = new JSONObject(str);
            int i5 = jSONObject.getInt(l.f146a);
            if (i5 == 1000) {
                return this.f2696a == String.class ? jSONObject.optString("result") : w.e.b(jSONObject.optString("result"), this.f2696a);
            }
            throw new RpcException(Integer.valueOf(i5), jSONObject.optString("tips"));
        } catch (Exception e5) {
            StringBuilder sb = new StringBuilder("response  =");
            sb.append(new String(this.f2697b));
            sb.append(":");
            sb.append(e5);
            throw new RpcException((Integer) 10, sb.toString() == null ? "" : e5.getMessage());
        }
    }
}
