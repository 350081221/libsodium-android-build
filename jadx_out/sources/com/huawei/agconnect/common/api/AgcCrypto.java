package com.huawei.agconnect.common.api;

import android.text.TextUtils;
import com.huawei.agconnect.credential.obs.h;
import com.huawei.agconnect.datastore.annotation.ICrypto;
import com.huawei.secure.android.common.encrypt.aes.a;
import com.huawei.secure.android.common.util.c;
import javax.crypto.SecretKey;

/* loaded from: classes3.dex */
public class AgcCrypto implements ICrypto {
    private static final AgcCrypto INSTANCE = new AgcCrypto();

    public static ICrypto get() {
        return INSTANCE;
    }

    @Override // com.huawei.agconnect.datastore.annotation.ICrypto
    public String decrypt(String str) {
        String k5 = a.k(str, getKeyV2());
        if (TextUtils.isEmpty(k5)) {
            k5 = a.k(str, getKey());
            if (TextUtils.isEmpty(k5)) {
                return str;
            }
        }
        return k5;
    }

    @Override // com.huawei.agconnect.datastore.annotation.ICrypto
    public String encrypt(String str) {
        return getKeyV2() == null ? str : a.t(str, getKeyV2());
    }

    public String getKey() {
        return h.f7862a.a();
    }

    public String getKeyV2() {
        SecretKey b5 = h.f7862a.b();
        if (b5 == null) {
            return null;
        }
        return c.b(b5.getEncoded());
    }
}
