package com.huawei.hms.analytics;

import android.os.Bundle;

/* loaded from: classes3.dex */
public abstract class cv {
    public String ikl;

    public cv() {
    }

    public cv(String str) {
        this.ikl = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Bundle klm() {
        Bundle bundle = new Bundle();
        String str = ar.lmn().lmn.cde;
        if (str == null) {
            str = "";
        }
        bundle.putString("$StartType", str);
        String str2 = this.ikl;
        bundle.putString("$InstallChannel", str2 != null ? str2 : "");
        return bundle;
    }

    public abstract Bundle lmn();
}
