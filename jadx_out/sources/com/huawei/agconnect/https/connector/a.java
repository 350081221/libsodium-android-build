package com.huawei.agconnect.https.connector;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;

/* loaded from: classes3.dex */
public class a implements Connector {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f7994a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static a f7995b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f7996c;

    private a(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f7996c = applicationContext != null ? applicationContext : context;
    }

    public static a a(Context context) {
        a aVar;
        synchronized (f7994a) {
            if (f7995b == null) {
                f7995b = new a(context);
            }
            aVar = f7995b;
        }
        return aVar;
    }

    @Override // com.huawei.agconnect.https.connector.Connector
    public boolean hasActiveNetwork() {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        Context context = this.f7996c;
        return (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) ? false : true;
    }

    @Override // com.huawei.agconnect.https.connector.Connector
    public void logger(String str, String str2) {
        Log.d(str, str2);
    }
}
