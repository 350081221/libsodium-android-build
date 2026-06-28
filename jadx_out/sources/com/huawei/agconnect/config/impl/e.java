package com.huawei.agconnect.config.impl;

import android.text.TextUtils;
import android.util.Log;
import com.huawei.agconnect.config.ConfigReader;
import com.huawei.agconnect.config.IDecrypt;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.SecretKey;

/* loaded from: classes3.dex */
public class e implements IDecrypt {

    /* renamed from: a, reason: collision with root package name */
    private final ConfigReader f7771a;

    /* renamed from: b, reason: collision with root package name */
    private SecretKey f7772b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f7773c = false;

    public e(ConfigReader configReader) {
        this.f7771a = configReader;
    }

    private void a() {
        try {
            this.f7772b = j.a(new d(this.f7771a.getString("/code/code1", null), this.f7771a.getString("/code/code2", null), this.f7771a.getString("/code/code3", null), this.f7771a.getString("/code/code4", null), "PBKDF2WithHmacSHA1", 10000));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException unused) {
            Log.e("AGC_Mark", "Exception when reading the 'K&I' for 'Config'.");
            this.f7772b = null;
        }
        this.f7773c = true;
    }

    public static boolean a(String str) {
        return !TextUtils.isEmpty(str) && Pattern.matches("^\\[!([A-Fa-f0-9]*)]", str);
    }

    private String b(String str) {
        try {
            Matcher matcher = Pattern.compile("^\\[!([A-Fa-f0-9]*)]").matcher(str);
            return matcher.find() ? matcher.group(1) : "";
        } catch (IllegalStateException | IndexOutOfBoundsException unused) {
            Log.e("AGC_Mark", "getRawString exception");
            return "";
        }
    }

    @Override // com.huawei.agconnect.config.IDecrypt
    public String decrypt(String str, String str2) {
        String str3;
        if (!this.f7773c) {
            a();
        }
        if (this.f7772b == null) {
            str3 = "mKey is null, return default value";
        } else {
            if (!a(str)) {
                return str2;
            }
            try {
                return new String(j.a(this.f7772b, Hex.decodeHexString(b(str))), "UTF-8");
            } catch (UnsupportedEncodingException | IllegalArgumentException | GeneralSecurityException unused) {
                str3 = "UnsupportedEncodingException||GeneralSecurityException||IllegalArgumentException";
            }
        }
        Log.e("AGC_Mark", str3);
        return str2;
    }
}
