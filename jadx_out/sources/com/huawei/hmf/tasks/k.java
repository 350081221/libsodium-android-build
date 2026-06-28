package com.huawei.hmf.tasks;

/* loaded from: classes3.dex */
public class k<TResult> {

    /* renamed from: a, reason: collision with root package name */
    private final com.huawei.hmf.tasks.a.i<TResult> f8101a = new com.huawei.hmf.tasks.a.i<>();

    /* loaded from: classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            k.this.f8101a.B();
        }
    }

    public k() {
    }

    public k(b bVar) {
        bVar.b(new a());
    }

    public Task<TResult> b() {
        return this.f8101a;
    }

    public void c(Exception exc) {
        this.f8101a.z(exc);
    }

    public void d(TResult tresult) {
        this.f8101a.A(tresult);
    }
}
