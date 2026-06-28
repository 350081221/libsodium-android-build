package com.huawei.agconnect.apms;

import android.text.TextUtils;
import com.squareup.okhttp.internal.Version;

/* loaded from: classes3.dex */
public class u {
    public static final String cde;
    public int abc;
    public int bcd;

    static {
        String str;
        try {
            str = Version.userAgent();
        } catch (Throwable unused) {
            str = "";
        }
        cde = str;
    }

    public u() {
        String str = cde;
        if (!TextUtils.isEmpty(str)) {
            try {
                String[] split = str.split("/")[1].split("\\.");
                if (split.length > 2) {
                    this.abc = Integer.parseInt(split[0]);
                    this.bcd = Integer.parseInt(split[1]);
                    Integer.parseInt(split[2]);
                } else {
                    this.abc = 2;
                    this.bcd = 0;
                }
                return;
            } catch (Throwable unused) {
                this.abc = 2;
                this.bcd = 0;
                return;
            }
        }
        this.abc = 2;
        this.bcd = 0;
    }

    public final int abc() {
        return this.abc;
    }

    public final int bcd() {
        return this.bcd;
    }
}
