package com.huawei.hms.analytics;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class cu extends cv {
    private String ijk;
    public String klm;
    public String lmn;

    public cu() {
    }

    public cu(String str) {
        this.ijk = str;
    }

    public cu(String str, String str2) {
        super(str2);
        this.ijk = str;
    }

    @Override // com.huawei.hms.analytics.cv
    public final Bundle lmn() {
        Bundle klm = klm();
        String str = this.lmn;
        if (str == null) {
            str = "";
        }
        klm.putString("$TrackId", str);
        String str2 = this.ijk;
        if (str2 == null) {
            str2 = "";
        }
        klm.putString("$ChannelType", str2);
        String str3 = this.klm;
        klm.putString("$TrackClickTime", str3 != null ? str3 : "");
        return klm;
    }
}
