package com.huawei.agconnect.apms;

import android.text.TextUtils;

/* loaded from: classes3.dex */
public class s0 {
    public String abc;
    public String bcd;
    public String cde;

    public void abc(String str, String str2) {
        this.bcd = str;
        this.cde = str2;
        if (!TextUtils.isEmpty(str) && str.equals(str2)) {
            this.abc = str;
        }
    }

    public boolean bcd() {
        boolean z4;
        String str = this.bcd;
        String str2 = this.cde;
        if (!TextUtils.isEmpty(str) && str.equals(str2)) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 || TextUtils.isEmpty(this.abc)) {
            return true;
        }
        return false;
    }

    public void abc() {
        this.abc = "";
        this.bcd = "";
        this.cde = "";
    }
}
