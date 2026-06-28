package com.huawei.agconnect.config.impl;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.agconnect.config.AesDecrypt;
import java.io.UnsupportedEncodingException;

/* loaded from: classes3.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private final AesDecrypt f7784a;

    public k(Context context, String str) {
        this.f7784a = (TextUtils.isEmpty(a(context, str)) || Build.VERSION.SDK_INT < 26) ? new g(context, str) : new h(context, str);
    }

    private String a(Context context, String str) {
        String a5 = l.a(context, str, "agc_plugin_", "crypto");
        if (a5 == null) {
            return null;
        }
        try {
            return new String(Hex.decodeHexString(a5), "utf-8");
        } catch (UnsupportedEncodingException | IllegalArgumentException e5) {
            Log.e("ReaderStrategy", "UnsupportedEncodingException" + e5.getMessage());
            return null;
        }
    }

    public String a(String str, String str2) {
        return this.f7784a.decrypt(str, str2);
    }
}
