package com.huawei.hms.base.log;

import android.content.Context;
import android.util.Log;

/* loaded from: classes3.dex */
public class e implements b {

    /* renamed from: a, reason: collision with root package name */
    public b f8361a;

    @Override // com.huawei.hms.base.log.b
    public void a(Context context, String str) {
        b bVar = this.f8361a;
        if (bVar != null) {
            bVar.a(context, str);
        }
    }

    @Override // com.huawei.hms.base.log.b
    public void a(b bVar) {
        this.f8361a = bVar;
    }

    @Override // com.huawei.hms.base.log.b
    public void a(String str, int i5, String str2, String str3) {
        Log.println(i5, "HMSSDK_" + str2, str3);
        b bVar = this.f8361a;
        if (bVar != null) {
            bVar.a(str, i5, str2, str3);
        }
    }
}
