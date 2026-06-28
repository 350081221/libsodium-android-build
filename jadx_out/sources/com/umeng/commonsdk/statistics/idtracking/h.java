package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.content.SharedPreferences;
import com.umeng.analytics.pro.au;
import com.umeng.commonsdk.config.FieldManager;

/* loaded from: classes3.dex */
public class h extends a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f13332a = au.b().b(au.f12204l);

    /* renamed from: b, reason: collision with root package name */
    public static final String f13333b = "key_umeng_sp_oaid";

    /* renamed from: c, reason: collision with root package name */
    public static final String f13334c = "key_umeng_sp_oaid_required_time";

    /* renamed from: d, reason: collision with root package name */
    private static final String f13335d = "oaid";

    /* renamed from: e, reason: collision with root package name */
    private Context f13336e;

    public h(Context context) {
        super(f13335d);
        this.f13336e = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.a
    public String f() {
        if (!FieldManager.allow(com.umeng.commonsdk.utils.d.G)) {
            return null;
        }
        try {
            SharedPreferences sharedPreferences = this.f13336e.getSharedPreferences(f13332a, 0);
            if (sharedPreferences == null) {
                return null;
            }
            return sharedPreferences.getString(f13333b, "");
        } catch (Throwable unused) {
            return null;
        }
    }
}
