package com.efs.sdk.base.core.util.a;

import androidx.annotation.Nullable;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.http.HttpEnv;
import com.efs.sdk.base.http.HttpResponse;
import java.io.File;
import java.util.Map;

/* loaded from: classes2.dex */
public final class b implements com.efs.sdk.base.core.util.concurrent.c<HttpResponse> {

    /* renamed from: a, reason: collision with root package name */
    String f6634a;

    /* renamed from: b, reason: collision with root package name */
    Map<String, String> f6635b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f6636c;

    /* renamed from: d, reason: collision with root package name */
    public File f6637d;

    /* renamed from: e, reason: collision with root package name */
    public String f6638e;

    /* renamed from: f, reason: collision with root package name */
    public Map<String, String> f6639f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6640g = false;

    @Override // com.efs.sdk.base.core.util.concurrent.c
    @Nullable
    public final /* synthetic */ HttpResponse a() {
        String str = this.f6638e;
        str.hashCode();
        if (!str.equals("get")) {
            if (!str.equals("post")) {
                Log.e("efs.util.http", "request not support method '" + this.f6638e + "'");
                return null;
            }
            byte[] bArr = this.f6636c;
            if (bArr != null && bArr.length > 0) {
                if (this.f6640g) {
                    return HttpEnv.getInstance().getHttpUtil().postAsFile(this.f6634a, this.f6635b, this.f6636c);
                }
                return HttpEnv.getInstance().getHttpUtil().post(this.f6634a, this.f6635b, this.f6636c);
            }
            return HttpEnv.getInstance().getHttpUtil().post(this.f6634a, this.f6635b, this.f6637d);
        }
        return HttpEnv.getInstance().getHttpUtil().get(this.f6634a, this.f6635b);
    }
}
