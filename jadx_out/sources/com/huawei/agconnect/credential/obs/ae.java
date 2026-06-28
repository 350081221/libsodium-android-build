package com.huawei.agconnect.credential.obs;

import com.huawei.agconnect.https.annotation.Result;
import org.apache.http.cookie.ClientCookie;

/* loaded from: classes3.dex */
public class ae {

    @Result(ClientCookie.DOMAIN_ATTR)
    String domain;

    @Result("siteCode")
    String siteCode;

    public String a() {
        return this.siteCode;
    }

    public String b() {
        return this.domain;
    }
}
