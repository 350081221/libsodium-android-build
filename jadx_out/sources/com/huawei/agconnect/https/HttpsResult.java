package com.huawei.agconnect.https;

import com.huawei.agconnect.https.Adapter;
import com.huawei.agconnect.https.adapter.StringAdapterFactory;
import java.io.IOException;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes3.dex */
public class HttpsResult {
    Response rawResponse;

    /* JADX INFO: Access modifiers changed from: package-private */
    public HttpsResult(boolean z4, int i5, Response response) {
        this.rawResponse = response;
    }

    public int code() {
        Response response = this.rawResponse;
        if (response != null) {
            return response.code();
        }
        return -1;
    }

    public String getErrorMsg() {
        if (isSuccess()) {
            return null;
        }
        Response response = this.rawResponse;
        return response == null ? "rawResponse is null" : response.message();
    }

    public <T> T getResponse(Class<T> cls, Adapter.Factory factory) {
        Adapter<ResponseBody, T> responseBodyAdapter = factory == null ? new StringAdapterFactory().responseBodyAdapter(cls) : factory.responseBodyAdapter(cls);
        try {
            if (responseBodyAdapter == null) {
                throw new IllegalArgumentException("ResponseBodyAdapter should not be null.");
            }
            try {
                T adapter = responseBodyAdapter.adapter(this.rawResponse.body());
                if (adapter != null) {
                    return adapter;
                }
                try {
                    return cls.newInstance();
                } catch (IllegalAccessException e5) {
                    throw new RuntimeException(e5);
                } catch (InstantiationException e6) {
                    throw new RuntimeException(e6);
                }
            } catch (IOException e7) {
                throw new RuntimeException(e7);
            }
        } catch (Throwable th) {
            try {
                cls.newInstance();
                throw th;
            } catch (IllegalAccessException e8) {
                throw new RuntimeException(e8);
            } catch (InstantiationException e9) {
                throw new RuntimeException(e9);
            }
        }
    }

    public String getResponse() {
        try {
            Response response = this.rawResponse;
            return (response == null || response.body() == null) ? "" : this.rawResponse.body().string();
        } catch (IOException unused) {
            return "";
        }
    }

    public boolean isSuccess() {
        Response response = this.rawResponse;
        return response != null && response.isSuccessful();
    }
}
