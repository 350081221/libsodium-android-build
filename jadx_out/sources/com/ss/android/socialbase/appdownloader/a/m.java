package com.ss.android.socialbase.appdownloader.a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import com.umeng.analytics.pro.bi;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class m extends a {
    public m(Context context, com.ss.android.socialbase.downloader.g.a aVar, String str) {
        super(context, aVar, str);
    }

    public static String a(Map<String, String> map) {
        if (map == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            stringBuffer.append(entry.getKey());
            stringBuffer.append(ContainerUtils.KEY_VALUE_DELIMITER);
            stringBuffer.append(URLEncoder.encode(entry.getValue()));
            stringBuffer.append("&");
        }
        String stringBuffer2 = stringBuffer.toString();
        if (stringBuffer2.endsWith("&")) {
            return stringBuffer2.substring(0, stringBuffer2.length() - 1);
        }
        return stringBuffer2;
    }

    @Override // com.ss.android.socialbase.appdownloader.a.e
    public Intent b() {
        String c5 = this.f10188b.c(bi.aE);
        String a5 = com.ss.android.socialbase.appdownloader.f.c.a(this.f10188b.c("bb"), c5);
        if (!TextUtils.isEmpty(a5) && a5.split(",").length == 2) {
            String a6 = com.ss.android.socialbase.appdownloader.f.c.a(this.f10188b.c("bc"), c5);
            if (!TextUtils.isEmpty(a6) && a6.split(",").length == 2) {
                String[] split = a5.split(",");
                String[] split2 = a6.split(",");
                String a7 = com.ss.android.socialbase.appdownloader.f.c.a(this.f10188b.c("bd"), c5);
                String a8 = com.ss.android.socialbase.appdownloader.f.c.a(this.f10188b.c("be"), c5);
                String a9 = com.ss.android.socialbase.appdownloader.f.c.a(this.f10188b.c("bf"), c5);
                HashMap hashMap = new HashMap();
                hashMap.put(split[0], split[1]);
                hashMap.put(split2[0], split2[1]);
                hashMap.put(a7, this.f10189c);
                Intent intent = new Intent();
                intent.setAction(a9);
                intent.setData(Uri.parse(a8 + a(hashMap)));
                intent.addFlags(268468224);
                return intent;
            }
        }
        return null;
    }
}
