package com.swift.sandhook.xcompat;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import u.dont.know.what.i.am.j;

/* loaded from: classes3.dex */
public interface j {
    Method getBackupMethod();

    Method getCallBackupMethod();

    Method getHookMethod();

    void start(Member member, j.b bVar, ClassLoader classLoader, String str) throws Exception;
}
