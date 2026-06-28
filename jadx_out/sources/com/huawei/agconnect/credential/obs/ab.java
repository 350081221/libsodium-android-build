package com.huawei.agconnect.credential.obs;

import com.huawei.agconnect.common.api.AgcCrypto;
import com.huawei.agconnect.core.service.auth.Token;
import com.huawei.agconnect.datastore.annotation.SharedPreference;

/* loaded from: classes3.dex */
public class ab implements Token {

    /* renamed from: a, reason: collision with root package name */
    private static final long f7815a = 120000;

    /* renamed from: b, reason: collision with root package name */
    private static final String f7816b = "com.huawei.agconnect";

    @SharedPreference(crypto = AgcCrypto.class, fileName = f7816b, isDynamic = true, key = "expires")
    long expires;

    @SharedPreference(crypto = AgcCrypto.class, fileName = f7816b, isDynamic = true, key = "tokenString")
    String tokenString;

    @SharedPreference(crypto = AgcCrypto.class, fileName = f7816b, isDynamic = true, key = "validTime")
    long validTime;

    public ab() {
        this.validTime = 0L;
    }

    public ab(Token token) {
        this(token.getTokenString(), token.getExpiration());
    }

    public ab(String str, long j5) {
        this.validTime = 0L;
        a(str, j5);
    }

    private void a(String str, long j5) {
        this.tokenString = str;
        this.expires = j5;
        this.validTime = (System.currentTimeMillis() + (j5 * 1000)) - f7815a;
    }

    public boolean a() {
        return this.tokenString != null && System.currentTimeMillis() <= this.validTime;
    }

    @Override // com.huawei.agconnect.core.service.auth.Token
    public long getExpiration() {
        return this.expires;
    }

    @Override // com.huawei.agconnect.core.service.auth.Token
    public long getIssuedAt() {
        return 0L;
    }

    @Override // com.huawei.agconnect.core.service.auth.Token
    public long getNotBefore() {
        return 0L;
    }

    @Override // com.huawei.agconnect.core.service.auth.Token
    public String getTokenString() {
        return this.tokenString;
    }
}
