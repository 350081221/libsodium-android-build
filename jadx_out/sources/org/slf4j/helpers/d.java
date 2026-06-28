package org.slf4j.helpers;

/* loaded from: classes4.dex */
public class d {

    /* renamed from: d, reason: collision with root package name */
    public static d f22240d = new d(null);

    /* renamed from: a, reason: collision with root package name */
    private String f22241a;

    /* renamed from: b, reason: collision with root package name */
    private Throwable f22242b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f22243c;

    public d(String str) {
        this(str, null, null);
    }

    static Object[] d(Object[] objArr) {
        if (objArr != null && objArr.length != 0) {
            int length = objArr.length - 1;
            Object[] objArr2 = new Object[length];
            System.arraycopy(objArr, 0, objArr2, 0, length);
            return objArr2;
        }
        throw new IllegalStateException("non-sensical empty or null argument array");
    }

    public Object[] a() {
        return this.f22243c;
    }

    public String b() {
        return this.f22241a;
    }

    public Throwable c() {
        return this.f22242b;
    }

    public d(String str, Object[] objArr, Throwable th) {
        this.f22241a = str;
        this.f22242b = th;
        if (th == null) {
            this.f22243c = objArr;
        } else {
            this.f22243c = d(objArr);
        }
    }
}
