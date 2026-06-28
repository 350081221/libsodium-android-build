package com.huawei.agconnect.apms;

import java.util.EventObject;

/* loaded from: classes3.dex */
public class k extends EventObject {
    public long abc;
    public Exception bcd;

    public k(Object obj, long j5) {
        super(obj);
        this.abc = j5;
        this.bcd = null;
    }

    public k(Object obj, long j5, Exception exc) {
        super(obj);
        this.abc = j5;
        this.bcd = exc;
    }
}
