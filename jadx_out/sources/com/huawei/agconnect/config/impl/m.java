package com.huawei.agconnect.config.impl;

import android.content.Context;
import com.huawei.agconnect.config.ConfigReader;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
class m implements ConfigReader {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, String> f7785a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final k f7786b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(Context context, String str) {
        this.f7786b = new k(context, str);
    }

    @Override // com.huawei.agconnect.config.ConfigReader
    public String getString(String str, String str2) {
        String str3 = this.f7785a.get(str);
        if (str3 != null) {
            return str3;
        }
        String a5 = this.f7786b.a(str, str2);
        if (a5 == null) {
            return str2;
        }
        this.f7785a.put(str, a5);
        return a5;
    }

    public String toString() {
        return "SecurityResourcesReader{mKey=, encrypt=true}";
    }
}
