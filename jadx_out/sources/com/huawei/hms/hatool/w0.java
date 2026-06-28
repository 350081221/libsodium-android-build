package com.huawei.hms.hatool;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.UserManager;

/* loaded from: classes3.dex */
public class w0 {

    /* renamed from: c, reason: collision with root package name */
    public static w0 f8687c = new w0();

    /* renamed from: a, reason: collision with root package name */
    public boolean f8688a = false;

    /* renamed from: b, reason: collision with root package name */
    public Context f8689b = b.i();

    public static w0 b() {
        return f8687c;
    }

    @TargetApi(24)
    public boolean a() {
        if (!this.f8688a) {
            Context context = this.f8689b;
            if (context == null) {
                return false;
            }
            UserManager userManager = (UserManager) context.getSystemService("user");
            if (userManager != null) {
                this.f8688a = userManager.isUserUnlocked();
            } else {
                this.f8688a = false;
            }
        }
        return this.f8688a;
    }
}
