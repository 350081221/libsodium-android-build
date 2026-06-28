package com.huawei.agconnect.apms;

import android.os.MessageQueue;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class r0 {
    public static Map<String, p0> abc = new HashMap();

    public static MessageQueue.IdleHandler abc(String str, q0 q0Var) {
        p0 p0Var = new p0(str);
        p0Var.abc(q0Var);
        abc.put(str, p0Var);
        return p0Var;
    }
}
