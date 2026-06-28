package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.commonsdk.config.FieldManager;

/* loaded from: classes3.dex */
public class j extends a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f13338a = "utdid";

    /* renamed from: b, reason: collision with root package name */
    private Context f13339b;

    public j(Context context) {
        super("utdid");
        this.f13339b = context;
    }

    private String g() {
        try {
            return this.f13339b.getSharedPreferences("Alvin2", 0).getString("UTDID2", null);
        } catch (Throwable unused) {
            return null;
        }
    }

    private String h() {
        try {
            return this.f13339b.getSharedPreferences("um_push_ut", 0).getString("d_id", null);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.a
    public String f() {
        try {
            if (FieldManager.allow(com.umeng.commonsdk.utils.d.f13505u)) {
                String h5 = h();
                if (TextUtils.isEmpty(h5)) {
                    return g();
                }
                return h5;
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
