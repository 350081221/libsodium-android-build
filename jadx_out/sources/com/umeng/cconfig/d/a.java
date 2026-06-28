package com.umeng.cconfig.d;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.cconfig.UMRemoteConfig;
import com.umeng.cconfig.a.b;
import com.umeng.cconfig.b.d;

/* loaded from: classes3.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private Context f12958a;

    public a(Context context) {
        this.f12958a = context;
    }

    private boolean a() {
        boolean a5;
        try {
            d e5 = b.a(this.f12958a).e();
            if (!"0".equals(e5.f12949c)) {
                return false;
            }
            String str = e5.f12947a;
            if (TextUtils.isEmpty(str) || !(a5 = b.a(this.f12958a).a(str))) {
                return false;
            }
            b.a(this.f12958a).b(str);
            return a5;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            UMRemoteConfig.getInstance().handlerMessage(3, Boolean.valueOf(a()), null);
        } catch (Exception unused) {
        }
    }
}
