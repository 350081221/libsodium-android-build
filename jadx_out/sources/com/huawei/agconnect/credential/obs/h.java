package com.huawei.agconnect.credential.obs;

import android.text.TextUtils;
import com.huawei.agconnect.common.api.Logger;
import com.huawei.agconnect.common.api.RandomWrapper;
import com.huawei.agconnect.datastore.annotation.SharedPreference;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;

/* loaded from: classes3.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f7862a = new h();

    /* renamed from: b, reason: collision with root package name */
    public static final int f7863b = 16;

    /* renamed from: c, reason: collision with root package name */
    private static final String f7864c = "KeyManager";

    /* renamed from: d, reason: collision with root package name */
    private static final int f7865d = 16;

    /* renamed from: e, reason: collision with root package name */
    private static final int f7866e = 32;

    /* renamed from: f, reason: collision with root package name */
    private static final int f7867f = 5000;

    @SharedPreference(fileName = "com.huawei.appgallery.datastore", key = "fish")
    String fish;

    /* renamed from: g, reason: collision with root package name */
    private String f7868g = null;

    /* renamed from: h, reason: collision with root package name */
    private SecretKey f7869h;

    @SharedPreference(fileName = "com.huawei.agconnect.internal", key = "jerry")
    String jerry;

    @SharedPreference(fileName = "com.huawei.appgallery.datastore", key = DatabaseFileArchive.COLUMN_KEY)
    String randmonKey;

    private h() {
    }

    private String a(int i5) {
        return com.huawei.secure.android.common.util.c.b(RandomWrapper.generateSecureRandom(i5 / 2));
    }

    private static String a(String str, int i5) {
        byte[] c5 = com.huawei.secure.android.common.util.c.c(str);
        if (c5 == null || c5.length == 0) {
            return null;
        }
        for (int i6 = 0; i6 < c5.length; i6++) {
            if (i5 < 0) {
                c5[i6] = (byte) (c5[i6] << (-i5));
            } else {
                c5[i6] = (byte) (c5[i6] >> i5);
            }
        }
        return com.huawei.secure.android.common.util.c.b(c5);
    }

    private static String a(String str, String str2) {
        byte[] c5 = com.huawei.secure.android.common.util.c.c(str);
        byte[] c6 = com.huawei.secure.android.common.util.c.c(str2);
        if (c5 == null || c6 == null || c5.length != c6.length) {
            return null;
        }
        int length = c5.length;
        byte[] bArr = new byte[length];
        for (int i5 = 0; i5 < length; i5++) {
            bArr[i5] = (byte) (c5[i5] ^ c6[i5]);
        }
        return com.huawei.secure.android.common.util.c.b(bArr);
    }

    private static String a(String str, String str2, String str3) {
        return a(a(a(a(str, -4), str2), 6), str3);
    }

    private static SecretKey a(String str, String str2, String str3, String str4) {
        if (str.length() != 32 || str2.length() != 32 || str3.length() != 32) {
            throw new IllegalArgumentException("invalid data for generating the key.");
        }
        return new SecretKeySpec(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(new PBEKeySpec(a(str, str2, str3).toCharArray(), com.huawei.secure.android.common.util.c.c(str4), 5000, 128)).getEncoded(), "AES");
    }

    private boolean a(String str) {
        return TextUtils.isEmpty(str) || str.length() != 32;
    }

    private String c() {
        i.a().f(this);
        if (TextUtils.isEmpty(this.randmonKey) || this.randmonKey.length() != 16) {
            this.randmonKey = a(16);
            i.a().b(this);
        }
        return this.randmonKey;
    }

    private void d() {
        i.a().h(this);
        i.a().g(this);
        if (a(this.jerry) || a(this.fish)) {
            this.jerry = a(32);
            this.fish = a(32);
            i.a().c(this);
            i.a().d(this);
        }
        try {
            this.f7869h = a(x.d(), this.jerry, "767d9b01105c2acd25fb7955a5394f78", this.fish);
        } catch (NoSuchAlgorithmException | InvalidKeySpecException unused) {
            Logger.e(f7864c, "Exception when reading the 'T&J&C&F' for 'KeyManager'.");
            this.f7869h = null;
        }
    }

    public synchronized String a() {
        if (TextUtils.isEmpty(this.f7868g)) {
            this.f7868g = a(a(x.c(), 6), g.a()) + a(a("AE6D8285", -4), x.f7965a) + c();
        }
        return this.f7868g;
    }

    public synchronized SecretKey b() {
        if (this.f7869h == null) {
            d();
        }
        return this.f7869h;
    }
}
