package com.huawei.agconnect.apms;

import java.lang.Thread;

/* loaded from: classes3.dex */
public final class jkl implements Thread.UncaughtExceptionHandler {
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        abc.bcd(th, abc.abc("upload ANR info failed. "), klm.cde);
    }
}
