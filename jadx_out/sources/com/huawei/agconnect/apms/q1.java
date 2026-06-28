package com.huawei.agconnect.apms;

import android.os.Process;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public class q1 {
    public static final AtomicInteger abc = new AtomicInteger(0);
    public static final String bcd;
    public static final String cde;

    static {
        String abc2 = x1.abc(Process.myPid(), 6, '0');
        bcd = abc2;
        StringBuilder abc3 = abc.abc(UUID.randomUUID().toString().substring(0, 8));
        abc3.append(abc2);
        abc3.append("d");
        cde = abc3.toString();
    }

    public static String abc() {
        StringBuilder sb = new StringBuilder(32);
        int incrementAndGet = (abc.incrementAndGet() & 8191) + 1000;
        sb.append(cde);
        sb.append(System.currentTimeMillis());
        sb.append(incrementAndGet);
        return sb.toString();
    }
}
