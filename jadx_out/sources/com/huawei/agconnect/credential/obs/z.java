package com.huawei.agconnect.credential.obs;

import com.huawei.agconnect.https.annotation.Result;

/* loaded from: classes3.dex */
public class z {

    @Result("access_token")
    private String access_token;

    @Result("expires_in")
    private long expires_in;

    @Result("ret")
    private aa ret;

    public String getAccessToken() {
        return this.access_token;
    }

    public long getExpiresIn() {
        return this.expires_in;
    }

    public aa getRet() {
        return this.ret;
    }
}
