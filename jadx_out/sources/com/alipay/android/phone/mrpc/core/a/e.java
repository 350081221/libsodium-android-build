package com.alipay.android.phone.mrpc.core.a;

import com.alipay.android.phone.mrpc.core.RpcException;
import java.util.ArrayList;
import java.util.Objects;
import okhttp3.HttpUrl;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: classes2.dex */
public final class e extends b {

    /* renamed from: c, reason: collision with root package name */
    public int f2700c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2701d;

    public e(int i5, String str, Object obj) {
        super(str, obj);
        this.f2700c = i5;
    }

    @Override // com.alipay.android.phone.mrpc.core.a.f
    public final void a(Object obj) {
        this.f2701d = obj;
    }

    @Override // com.alipay.android.phone.mrpc.core.a.f
    public final byte[] a() {
        try {
            ArrayList arrayList = new ArrayList();
            if (this.f2701d != null) {
                arrayList.add(new BasicNameValuePair("extParam", w.f.a(this.f2701d)));
            }
            arrayList.add(new BasicNameValuePair("operationType", this.f2698a));
            StringBuilder sb = new StringBuilder();
            sb.append(this.f2700c);
            arrayList.add(new BasicNameValuePair("id", sb.toString()));
            Objects.toString(this.f2699b);
            Object obj = this.f2699b;
            arrayList.add(new BasicNameValuePair("requestData", obj == null ? HttpUrl.PATH_SEGMENT_ENCODE_SET_URI : w.f.a(obj)));
            return URLEncodedUtils.format(arrayList, "utf-8").getBytes();
        } catch (Exception e5) {
            StringBuilder sb2 = new StringBuilder("request  =");
            sb2.append(this.f2699b);
            sb2.append(":");
            sb2.append(e5);
            throw new RpcException(9, sb2.toString() == null ? "" : e5.getMessage(), e5);
        }
    }
}
