package w0;

import android.text.TextUtils;

/* loaded from: classes2.dex */
public enum a {
    None("none"),
    WapPay("js://wappay"),
    Update("js://update"),
    OpenWeb("loc:openweb"),
    SetResult("loc:setResult"),
    Exit("loc:exit");


    /* renamed from: a, reason: collision with root package name */
    public String f22608a;

    a(String str) {
        this.f22608a = str;
    }

    public static a a(String str) {
        if (TextUtils.isEmpty(str)) {
            return None;
        }
        a aVar = None;
        for (a aVar2 : values()) {
            if (str.startsWith(aVar2.f22608a)) {
                return aVar2;
            }
        }
        return aVar;
    }
}
