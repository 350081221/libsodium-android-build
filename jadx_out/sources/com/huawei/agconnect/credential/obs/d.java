package com.huawei.agconnect.credential.obs;

import android.content.Context;
import com.huawei.agconnect.common.api.Logger;
import com.huawei.hms.aaid.HmsInstanceId;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f7853a = "HMSInstanceIdWrapper";

    /* renamed from: b, reason: collision with root package name */
    private Object f7854b;

    public d(Context context) {
        try {
            this.f7854b = HmsInstanceId.class.getDeclaredMethod("getInstance", Context.class).invoke(null, context);
        } catch (Throwable unused) {
            Logger.w(f7853a, "not find package HmsInstanceId");
        }
    }

    public boolean a() {
        return this.f7854b != null;
    }

    public String b() {
        try {
            Logger.d(f7853a, "call hms wrapper : getId");
            return (String) this.f7854b.getClass().getDeclaredMethod("getId", new Class[0]).invoke(this.f7854b, new Object[0]);
        } catch (Throwable unused) {
            Logger.e(f7853a, "get id fail");
            return null;
        }
    }

    public long c() {
        try {
            Logger.d(f7853a, "call hms wrapper : getCreationTime");
            return ((Long) this.f7854b.getClass().getDeclaredMethod("getCreationTime", new Class[0]).invoke(this.f7854b, new Object[0])).longValue();
        } catch (Throwable unused) {
            Logger.e(f7853a, "get create time fail");
            return 0L;
        }
    }

    public void d() {
        try {
            Logger.d(f7853a, "call hms wrapper : deleteAAID");
            this.f7854b.getClass().getDeclaredMethod("deleteAAID", new Class[0]).invoke(this.f7854b, new Object[0]);
        } catch (Throwable unused) {
            Logger.e(f7853a, "delete aaid fail");
        }
    }
}
