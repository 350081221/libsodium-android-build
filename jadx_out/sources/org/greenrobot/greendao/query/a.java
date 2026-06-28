package org.greenrobot.greendao.query;

import java.util.Date;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class a<T> {

    /* renamed from: a, reason: collision with root package name */
    protected final org.greenrobot.greendao.a<T, ?> f21395a;

    /* renamed from: b, reason: collision with root package name */
    protected final org.greenrobot.greendao.g<T> f21396b;

    /* renamed from: c, reason: collision with root package name */
    protected final String f21397c;

    /* renamed from: d, reason: collision with root package name */
    protected final String[] f21398d;

    /* renamed from: e, reason: collision with root package name */
    protected final Thread f21399e = Thread.currentThread();

    /* JADX INFO: Access modifiers changed from: protected */
    public a(org.greenrobot.greendao.a<T, ?> aVar, String str, String[] strArr) {
        this.f21395a = aVar;
        this.f21396b = new org.greenrobot.greendao.g<>(aVar);
        this.f21397c = str;
        this.f21398d = strArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String[] e(Object[] objArr) {
        int length = objArr.length;
        String[] strArr = new String[length];
        for (int i5 = 0; i5 < length; i5++) {
            Object obj = objArr[i5];
            if (obj != null) {
                strArr[i5] = obj.toString();
            } else {
                strArr[i5] = null;
            }
        }
        return strArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a() {
        if (Thread.currentThread() == this.f21399e) {
        } else {
            throw new org.greenrobot.greendao.d("Method may be called only in owner thread, use forCurrentThread to get an instance for this thread");
        }
    }

    public a<T> b(int i5, Boolean bool) {
        Integer num;
        if (bool != null) {
            num = Integer.valueOf(bool.booleanValue() ? 1 : 0);
        } else {
            num = null;
        }
        return h(i5, num);
    }

    /* renamed from: c */
    public a<T> h(int i5, Object obj) {
        a();
        if (obj != null) {
            this.f21398d[i5] = obj.toString();
        } else {
            this.f21398d[i5] = null;
        }
        return this;
    }

    public a<T> d(int i5, Date date) {
        Long l5;
        if (date != null) {
            l5 = Long.valueOf(date.getTime());
        } else {
            l5 = null;
        }
        return h(i5, l5);
    }
}
