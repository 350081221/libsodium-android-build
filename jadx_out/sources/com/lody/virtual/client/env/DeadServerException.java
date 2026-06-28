package com.lody.virtual.client.env;

/* loaded from: classes3.dex */
public class DeadServerException extends RuntimeException {
    public DeadServerException() {
    }

    public DeadServerException(String str) {
        super(str);
    }

    public DeadServerException(String str, Throwable th) {
        super(str, th);
    }

    public DeadServerException(Throwable th) {
        super(th);
    }

    public DeadServerException(String str, Throwable th, boolean z4, boolean z5) {
        super(str, th, z4, z5);
    }
}
