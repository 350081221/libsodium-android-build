package com.huawei.hms.analytics.core.log;

/* loaded from: classes3.dex */
public interface LogAdapter {
    void init(int i5, String str);

    boolean isLoggable(int i5);

    void println(int i5, String str, String str2);

    void println(int i5, String str, String str2, String str3);
}
