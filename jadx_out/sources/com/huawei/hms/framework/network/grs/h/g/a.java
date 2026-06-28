package com.huawei.hms.framework.network.grs.h.g;

import android.content.Context;
import com.huawei.hms.framework.network.grs.GrsApp;
import com.huawei.secure.android.common.ssl.i;
import com.huawei.secure.android.common.ssl.k;
import i2.b;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final HostnameVerifier f8514a = new b();

    public static HostnameVerifier a() {
        return f8514a;
    }

    public static SSLSocketFactory a(Context context) {
        try {
            return new i(new k(context.getAssets().open(GrsApp.getInstance().getBrand("/") + "grs_sp.bks"), ""));
        } catch (IOException | KeyManagementException | NoSuchAlgorithmException e5) {
            throw new AssertionError(e5);
        }
    }
}
