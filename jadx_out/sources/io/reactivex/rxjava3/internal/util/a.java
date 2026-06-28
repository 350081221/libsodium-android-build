package io.reactivex.rxjava3.internal.util;

/* loaded from: classes3.dex */
public class a<T> {

    /* renamed from: a, reason: collision with root package name */
    final int f18682a;

    /* renamed from: b, reason: collision with root package name */
    final Object[] f18683b;

    /* renamed from: c, reason: collision with root package name */
    Object[] f18684c;

    /* renamed from: d, reason: collision with root package name */
    int f18685d;

    /* renamed from: io.reactivex.rxjava3.internal.util.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0531a<T> extends m3.r<T> {
        @Override // m3.r
        boolean test(T t5);
    }

    public a(int i5) {
        this.f18682a = i5;
        Object[] objArr = new Object[i5 + 1];
        this.f18683b = objArr;
        this.f18684c = objArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0019, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <U> boolean a(io.reactivex.rxjava3.core.p0<? super U> r5) {
        /*
            r4 = this;
            java.lang.Object[] r0 = r4.f18683b
            int r1 = r4.f18682a
        L4:
            r2 = 0
            if (r0 == 0) goto L1e
        L7:
            if (r2 >= r1) goto L19
            r3 = r0[r2]
            if (r3 != 0) goto Le
            goto L19
        Le:
            boolean r3 = io.reactivex.rxjava3.internal.util.q.acceptFull(r3, r5)
            if (r3 == 0) goto L16
            r5 = 1
            return r5
        L16:
            int r2 = r2 + 1
            goto L7
        L19:
            r0 = r0[r1]
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            goto L4
        L1e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.internal.util.a.a(io.reactivex.rxjava3.core.p0):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0019, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <U> boolean b(org.reactivestreams.p<? super U> r5) {
        /*
            r4 = this;
            java.lang.Object[] r0 = r4.f18683b
            int r1 = r4.f18682a
        L4:
            r2 = 0
            if (r0 == 0) goto L1e
        L7:
            if (r2 >= r1) goto L19
            r3 = r0[r2]
            if (r3 != 0) goto Le
            goto L19
        Le:
            boolean r3 = io.reactivex.rxjava3.internal.util.q.acceptFull(r3, r5)
            if (r3 == 0) goto L16
            r5 = 1
            return r5
        L16:
            int r2 = r2 + 1
            goto L7
        L19:
            r0 = r0[r1]
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            goto L4
        L1e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.internal.util.a.b(org.reactivestreams.p):boolean");
    }

    public void c(T t5) {
        int i5 = this.f18682a;
        int i6 = this.f18685d;
        if (i6 == i5) {
            Object[] objArr = new Object[i5 + 1];
            this.f18684c[i5] = objArr;
            this.f18684c = objArr;
            i6 = 0;
        }
        this.f18684c[i6] = t5;
        this.f18685d = i6 + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0018, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(io.reactivex.rxjava3.internal.util.a.InterfaceC0531a<? super T> r5) {
        /*
            r4 = this;
            java.lang.Object[] r0 = r4.f18683b
            int r1 = r4.f18682a
        L4:
            if (r0 == 0) goto L1d
            r2 = 0
        L7:
            if (r2 >= r1) goto L18
            r3 = r0[r2]
            if (r3 != 0) goto Le
            goto L18
        Le:
            boolean r3 = r5.test(r3)
            if (r3 == 0) goto L15
            return
        L15:
            int r2 = r2 + 1
            goto L7
        L18:
            r0 = r0[r1]
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            goto L4
        L1d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.internal.util.a.d(io.reactivex.rxjava3.internal.util.a$a):void");
    }

    public <S> void e(S s5, m3.d<? super S, ? super T> dVar) throws Throwable {
        Object[] objArr = this.f18683b;
        int i5 = this.f18682a;
        while (true) {
            for (int i6 = 0; i6 < i5; i6++) {
                Object obj = objArr[i6];
                if (obj == null || dVar.a(s5, obj)) {
                    return;
                }
            }
            objArr = (Object[]) objArr[i5];
        }
    }

    public void f(T t5) {
        this.f18683b[0] = t5;
    }
}
