package org.greenrobot.greendao.async;

/* loaded from: classes4.dex */
public class a extends org.greenrobot.greendao.d {
    private static final long serialVersionUID = 5872157552005102382L;
    private final b failedOperation;

    public a(b bVar, Throwable th) {
        super(th);
        this.failedOperation = bVar;
    }

    public b getFailedOperation() {
        return this.failedOperation;
    }
}
