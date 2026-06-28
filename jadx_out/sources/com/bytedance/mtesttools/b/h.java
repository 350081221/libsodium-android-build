package com.bytedance.mtesttools.b;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.mediation.manager.MediationAdEcpmInfo;

/* loaded from: classes2.dex */
public abstract class h {
    public abstract String a();

    public abstract void b(Activity activity, ViewGroup viewGroup);

    public abstract void c(Activity activity, j1.f fVar, int i5, int i6, b bVar);

    public abstract String d();

    public void e(Activity activity, j1.f fVar, int i5, int i6, b bVar) {
        if (k1.a.b()) {
            c(activity, fVar, i5, i6, bVar);
        } else {
            Log.d("TMe", "当前配置不存在，稍后加载");
        }
    }

    public abstract MediationAdEcpmInfo f();

    public abstract String g();

    public Bundle h() {
        return null;
    }

    public boolean i() {
        return true;
    }

    public final String j() {
        MediationAdEcpmInfo f5 = f();
        if (f5 == null) {
            return "";
        }
        return f5.getSdkName();
    }
}
