package com.tendcloud.tenddata;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.provider.Settings;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class cb {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11581a = "oaid_limit_state";

    /* renamed from: b, reason: collision with root package name */
    private static final String f11582b = "oaid";

    /* loaded from: classes3.dex */
    public static final class a {
        public String id;
        public boolean isLimit;
    }

    public static boolean a(Context context) {
        if (!bx.c()) {
            h.iForInternal("not honor");
            return false;
        }
        return b(context);
    }

    public static boolean b(Context context) {
        boolean z4;
        try {
            PackageManager packageManager = context.getPackageManager();
            packageManager.getPackageInfo("com.hihonor.id", 0);
            Intent intent = new Intent("com.hihonor.id.HnOaIdService");
            intent.setPackage("com.hihonor.id");
            if (!packageManager.queryIntentServices(intent, 0).isEmpty()) {
                z4 = true;
            } else {
                z4 = false;
            }
            h.iForInternal("honor id service is exist:" + z4);
            return z4;
        } catch (Exception e5) {
            e5.printStackTrace();
            return false;
        }
    }

    public static void bindHonorServiceGetOAID(Context context) {
        h.iForInternal("try to get id from cache");
        String c5 = c(context);
        h.iForInternal("get id from cache:", c5);
        if (TextUtils.isEmpty(c5)) {
            c5 = a(context, new cc());
            h.iForInternal("get id from service:", c5);
        }
        if (TextUtils.isEmpty(c5)) {
            ca.bindHWServiceGetOAID(context);
        } else {
            df.a().setOAID(c5);
        }
    }

    private static String c(Context context) {
        try {
            ContentResolver contentResolver = context.getContentResolver();
            String string = Settings.Global.getString(contentResolver, f11582b);
            String string2 = Settings.Global.getString(contentResolver, f11581a);
            if (!TextUtils.isEmpty(string)) {
                if (!TextUtils.isEmpty(string2)) {
                    return string;
                }
                return null;
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    static String a(Context context, cc ccVar) {
        h.iForInternal("get Honor id from service");
        try {
            Intent intent = new Intent();
            intent.setAction("com.hihonor.id.HnOaIdService");
            intent.setPackage("com.hihonor.id");
            context.bindService(intent, ccVar, 1);
            h.iForInternal("bind honor id serice");
            long currentTimeMillis = System.currentTimeMillis();
            ccVar.f11584b.await(2000L, TimeUnit.MILLISECONDS);
            h.iForInternal("countDown end:" + (System.currentTimeMillis() - currentTimeMillis));
            ccVar.unbind(context);
            a aVar = ccVar.f11583a;
            if (aVar != null) {
                return aVar.id;
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
