package com.huawei.hms.aaid.encrypt;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.opendevice.c;
import com.huawei.secure.android.common.encrypt.aes.a;

/* loaded from: classes3.dex */
public class PushEncrypter {
    public static String decrypter(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return a.k(str, c.c(context));
    }

    public static String encrypter(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return a.t(str, c.c(context));
    }

    public static String encrypterOld(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return a.v(str, c.a(context));
    }
}
