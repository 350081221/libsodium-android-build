package com.huawei.agconnect.credential.obs;

import com.huawei.agconnect.https.annotation.Result;
import java.util.List;

/* loaded from: classes3.dex */
public class ah {

    @Result("backDomain")
    private List<ae> backDomain;

    @Result("mainDomain")
    private List<ae> mainDomain;

    @Result("ret")
    private aa ret;

    @Result("ttl")
    String ttl;

    public aa a() {
        return this.ret;
    }

    public List<ae> b() {
        return this.mainDomain;
    }

    public List<ae> c() {
        return this.backDomain;
    }

    public String d() {
        return this.ttl;
    }
}
