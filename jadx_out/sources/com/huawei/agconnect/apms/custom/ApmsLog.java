package com.huawei.agconnect.apms.custom;

import com.huawei.agconnect.apms.hilog.task.FetchTask;

/* loaded from: classes3.dex */
public interface ApmsLog {
    void d(String str, String str2);

    void deny();

    void e(String str, String str2);

    void fetch(FetchTask.FetchCallback fetchCallback);

    void flush();

    void grant();

    void i(String str, String str2);

    void release();

    void v(String str, String str2);

    void w(String str, String str2);
}
