package com.huawei.agconnect.common.api;

import android.content.Context;
import com.huawei.agconnect.credential.obs.c;
import com.huawei.agconnect.credential.obs.d;
import com.huawei.agconnect.credential.obs.e;

/* loaded from: classes3.dex */
public class AGCInstanceID {
    private final e preferences;
    private final d wrapper;

    private AGCInstanceID(Context context) {
        this.wrapper = new d(context);
        this.preferences = new e(context, c.f7851a);
    }

    public static AGCInstanceID getInstance(Context context) {
        return new AGCInstanceID(context);
    }

    public void deleteAAID() {
        if (this.wrapper.a()) {
            this.wrapper.d();
        } else if (this.preferences.e(c.f7851a)) {
            this.preferences.f(c.f7851a);
            this.preferences.f(c.f7852b);
        }
    }

    public long getCreationTime() {
        if (this.wrapper.a()) {
            return this.wrapper.c();
        }
        try {
            if (!this.preferences.e(c.f7852b)) {
                getId();
            }
            return this.preferences.d(c.f7852b);
        } catch (Exception unused) {
            return 0L;
        }
    }

    public String getId() {
        return this.wrapper.a() ? this.wrapper.b() : c.a(this.preferences);
    }
}
