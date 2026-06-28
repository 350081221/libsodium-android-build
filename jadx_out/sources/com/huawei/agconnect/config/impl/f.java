package com.huawei.agconnect.config.impl;

import android.text.TextUtils;
import android.util.Log;
import com.huawei.agconnect.config.IDecrypt;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.SecretKey;

/* loaded from: classes3.dex */
public class f implements IDecrypt {

    /* renamed from: a, reason: collision with root package name */
    private SecretKey f7774a;

    /* renamed from: b, reason: collision with root package name */
    private final d f7775b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f7776c = false;

    public f(d dVar) {
        this.f7775b = dVar;
    }

    private void a() {
        try {
            this.f7774a = j.a(this.f7775b);
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e5) {
            Log.e("AGC_LocalResource", "Exception when reading the 'K&I' for 'Config'. error is " + e5.getMessage());
            this.f7774a = null;
        }
        this.f7776c = true;
    }

    @Override // com.huawei.agconnect.config.IDecrypt
    public String decrypt(String str, String str2) {
        StringBuilder sb;
        if (!this.f7776c) {
            a();
        }
        if (this.f7774a == null || TextUtils.isEmpty(str)) {
            sb = new StringBuilder();
            sb.append("decrypt exception: secretKey = ");
            sb.append(this.f7774a);
            sb.append("raw = ");
        } else {
            try {
                return new String(j.a(this.f7774a, Hex.decodeHexString(str)), "UTF-8");
            } catch (UnsupportedEncodingException | IllegalArgumentException | GeneralSecurityException e5) {
                sb = new StringBuilder();
                sb.append("decrypt exception:");
                str = e5.getMessage();
            }
        }
        sb.append(str);
        Log.e("AGC_LocalResource", sb.toString());
        return str2;
    }
}
