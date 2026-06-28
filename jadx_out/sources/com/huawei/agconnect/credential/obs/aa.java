package com.huawei.agconnect.credential.obs;

import com.bytedance.sdk.openadsdk.api.plugin.PluginConstants;
import com.huawei.agconnect.https.annotation.Result;

/* loaded from: classes3.dex */
public class aa {

    @Result(PluginConstants.KEY_ERROR_CODE)
    private int code;

    @Result("msg")
    private String msg;

    public int getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setCode(int i5) {
        this.code = i5;
    }

    public void setMsg(String str) {
        this.msg = str;
    }
}
