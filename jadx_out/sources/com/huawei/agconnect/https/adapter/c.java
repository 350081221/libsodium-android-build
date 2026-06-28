package com.huawei.agconnect.https.adapter;

import com.huawei.agconnect.https.Adapter;
import java.io.IOException;
import okhttp3.ResponseBody;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class c<T> implements Adapter<ResponseBody, T> {

    /* renamed from: a, reason: collision with root package name */
    private final Class<T> f7981a;

    public c(Class<T> cls) {
        this.f7981a = cls;
    }

    @Override // com.huawei.agconnect.https.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public T adapter(ResponseBody responseBody) throws IOException {
        if (responseBody == null) {
            throw new IOException("responseBody is null");
        }
        try {
            return (T) JSONDecodeUtil.getObject(responseBody.string(), this.f7981a);
        } catch (IllegalAccessException e5) {
            throw new IOException("IllegalAccessException:", e5);
        } catch (InstantiationException e6) {
            throw new IOException("InstantiationException", e6);
        } catch (JSONException unused) {
            throw new IOException("the response is not json");
        }
    }
}
