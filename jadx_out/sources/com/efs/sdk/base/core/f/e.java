package com.efs.sdk.base.core.f;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.efs.sdk.base.core.f.f;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.http.HttpResponse;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.protocol.HTTP;

/* loaded from: classes2.dex */
public final class e implements com.efs.sdk.base.core.c.c {
    private static void a(HttpResponse httpResponse) {
        if (httpResponse == null || TextUtils.isEmpty(httpResponse.data)) {
            return;
        }
        for (String str : httpResponse.data.split("`")) {
            String[] split = str.split(ContainerUtils.KEY_VALUE_DELIMITER);
            if (split.length >= 2) {
                if (split[0].equalsIgnoreCase("retcode")) {
                    httpResponse.setBizCode(split[1]);
                } else {
                    ((Map) httpResponse.extra).put(split[0], split[1]);
                }
            }
        }
    }

    @Override // com.efs.sdk.base.core.c.c
    @NonNull
    public final HttpResponse a(com.efs.sdk.base.core.d.b bVar, boolean z4) {
        HttpResponse httpResponse;
        f fVar;
        try {
            fVar = f.a.f6622a;
            c cVar = fVar.f6618a;
            String valueOf = String.valueOf(System.currentTimeMillis());
            String a5 = com.efs.sdk.base.core.util.b.b.a(cVar.f6611b + cVar.f6612c + valueOf + "AppChk#2014");
            StringBuilder sb = new StringBuilder();
            String str = cVar.f6610a;
            if (str.startsWith("http")) {
                sb.append(str);
                sb.append("?chk=");
            } else {
                sb.append(str);
                sb.append("?chk=");
            }
            sb.append(a5.substring(a5.length() - 8));
            sb.append("&vno=");
            sb.append(valueOf);
            sb.append("&uuid=");
            sb.append(cVar.f6612c);
            sb.append("&app=");
            sb.append(cVar.f6611b);
            sb.append("&zip=gzip");
            String sb2 = sb.toString();
            int i5 = 0;
            byte[] bArr = new byte[0];
            int i6 = bVar.f6591a.f6586c;
            if (i6 == 0) {
                bArr = bVar.f6593c;
                i5 = bArr.length;
            } else if (1 == i6) {
                bArr = com.efs.sdk.base.core.util.b.a(bVar.f6594d.getPath());
                i5 = bArr.length;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(HTTP.CONTENT_TYPE, URLEncodedUtils.CONTENT_TYPE);
            hashMap.put(HTTP.CONTENT_LEN, String.valueOf(i5));
            com.efs.sdk.base.core.util.a.d a6 = new com.efs.sdk.base.core.util.a.d(sb2).a(hashMap);
            a6.f6642a.f6636c = bArr;
            httpResponse = a6.a().b();
            a(httpResponse);
        } catch (Throwable th) {
            httpResponse = 0 == 0 ? new HttpResponse() : null;
            Log.e("efs.wa.send", "get file size error", th);
        }
        if (httpResponse.succ) {
            Log.i("efs.base", "wa upload succ, " + httpResponse.toString());
            com.efs.sdk.base.core.util.b.b(bVar.f6594d);
            return httpResponse;
        }
        Log.i("efs.base", "wa upload fail, resp is " + httpResponse.toString());
        return httpResponse;
    }
}
