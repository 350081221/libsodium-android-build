package com.github.promeg.tinypinyin.lexicons.android.cncity;

import android.content.Context;

/* loaded from: classes2.dex */
public final class b extends com.github.promeg.tinypinyin.android.asset.lexicons.a {

    /* renamed from: c, reason: collision with root package name */
    static volatile b f6940c;

    public b(Context context) {
        super(context);
    }

    public static b f(Context context) {
        if (context != null) {
            if (f6940c == null) {
                synchronized (b.class) {
                    if (f6940c == null) {
                        f6940c = new b(context);
                    }
                }
            }
            return f6940c;
        }
        throw new IllegalArgumentException("context == null");
    }

    @Override // com.github.promeg.tinypinyin.android.asset.lexicons.a
    protected String d() {
        return "cncity.txt";
    }
}
