package org.greenrobot.greendao.async;

import java.util.concurrent.Callable;
import org.greenrobot.greendao.async.b;
import org.greenrobot.greendao.query.j;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final org.greenrobot.greendao.c f21339a;

    /* renamed from: b, reason: collision with root package name */
    private final c f21340b = new c();

    /* renamed from: c, reason: collision with root package name */
    private int f21341c;

    public e(org.greenrobot.greendao.c cVar) {
        this.f21339a = cVar;
    }

    private <E> b o(b.a aVar, Class<E> cls, Object obj, int i5) {
        b bVar = new b(aVar, this.f21339a.getDao(cls), null, obj, i5 | this.f21341c);
        this.f21340b.a(bVar);
        return bVar;
    }

    private b p(b.a aVar, Object obj, int i5) {
        b bVar = new b(aVar, null, this.f21339a.getDatabase(), obj, i5 | this.f21341c);
        this.f21340b.a(bVar);
        return bVar;
    }

    private b q(b.a aVar, Object obj, int i5) {
        return o(aVar, obj.getClass(), obj, i5);
    }

    public <E> b A(Class<E> cls, Iterable<E> iterable, int i5) {
        return o(b.a.InsertInTxIterable, cls, iterable, i5);
    }

    public <E> b B(Class<E> cls, E... eArr) {
        return y(cls, 0, eArr);
    }

    public b C(Object obj) {
        return D(obj, 0);
    }

    public b D(Object obj, int i5) {
        return q(b.a.InsertOrReplace, obj, i5);
    }

    public <E> b E(Class<E> cls, int i5, E... eArr) {
        return o(b.a.InsertOrReplaceInTxArray, cls, eArr, i5);
    }

    public <E> b F(Class<E> cls, Iterable<E> iterable) {
        return G(cls, iterable, 0);
    }

    public <E> b G(Class<E> cls, Iterable<E> iterable, int i5) {
        return o(b.a.InsertOrReplaceInTxIterable, cls, iterable, i5);
    }

    public <E> b H(Class<E> cls, E... eArr) {
        return E(cls, 0, eArr);
    }

    public boolean I() {
        return this.f21340b.k();
    }

    public b J(Class<?> cls, Object obj) {
        return K(cls, obj, 0);
    }

    public b K(Class<?> cls, Object obj, int i5) {
        return o(b.a.Load, cls, obj, i5);
    }

    public b L(Class<?> cls) {
        return M(cls, 0);
    }

    public b M(Class<?> cls, int i5) {
        return o(b.a.LoadAll, cls, null, i5);
    }

    public b N(j<?> jVar) {
        return O(jVar, 0);
    }

    public b O(j<?> jVar, int i5) {
        return p(b.a.QueryList, jVar, i5);
    }

    public b P(j<?> jVar) {
        return Q(jVar, 0);
    }

    public b Q(j<?> jVar, int i5) {
        return p(b.a.QueryUnique, jVar, i5);
    }

    public b R(Object obj) {
        return S(obj, 0);
    }

    public b S(Object obj, int i5) {
        return q(b.a.Refresh, obj, i5);
    }

    public b T(Runnable runnable) {
        return U(runnable, 0);
    }

    public b U(Runnable runnable, int i5) {
        return p(b.a.TransactionRunnable, runnable, i5);
    }

    public void V(d dVar) {
        this.f21340b.m(dVar);
    }

    public void W(d dVar) {
        this.f21340b.n(dVar);
    }

    public void X(int i5) {
        this.f21340b.o(i5);
    }

    public void Y(int i5) {
        this.f21341c = i5;
    }

    public void Z(int i5) {
        this.f21340b.p(i5);
    }

    public b a(Callable<?> callable) {
        return b(callable, 0);
    }

    public b a0(Object obj) {
        return b0(obj, 0);
    }

    public b b(Callable<?> callable, int i5) {
        return p(b.a.TransactionCallable, callable, i5);
    }

    public b b0(Object obj, int i5) {
        return q(b.a.Update, obj, i5);
    }

    public b c(Class<?> cls) {
        return d(cls, 0);
    }

    public <E> b c0(Class<E> cls, int i5, E... eArr) {
        return o(b.a.UpdateInTxArray, cls, eArr, i5);
    }

    public b d(Class<?> cls, int i5) {
        return o(b.a.Count, cls, null, i5);
    }

    public <E> b d0(Class<E> cls, Iterable<E> iterable) {
        return e0(cls, iterable, 0);
    }

    public b e(Object obj) {
        return f(obj, 0);
    }

    public <E> b e0(Class<E> cls, Iterable<E> iterable, int i5) {
        return o(b.a.UpdateInTxIterable, cls, iterable, i5);
    }

    public b f(Object obj, int i5) {
        return q(b.a.Delete, obj, i5);
    }

    public <E> b f0(Class<E> cls, E... eArr) {
        return c0(cls, 0, eArr);
    }

    public <E> b g(Class<E> cls) {
        return h(cls, 0);
    }

    public void g0() {
        this.f21340b.q();
    }

    public <E> b h(Class<E> cls, int i5) {
        return o(b.a.DeleteAll, cls, null, i5);
    }

    public boolean h0(int i5) {
        return this.f21340b.r(i5);
    }

    public b i(Object obj) {
        return j(obj, 0);
    }

    public b j(Object obj, int i5) {
        return q(b.a.DeleteByKey, obj, i5);
    }

    public <E> b k(Class<E> cls, int i5, E... eArr) {
        return o(b.a.DeleteInTxArray, cls, eArr, i5);
    }

    public <E> b l(Class<E> cls, Iterable<E> iterable) {
        return m(cls, iterable, 0);
    }

    public <E> b m(Class<E> cls, Iterable<E> iterable, int i5) {
        return o(b.a.DeleteInTxIterable, cls, iterable, i5);
    }

    public <E> b n(Class<E> cls, E... eArr) {
        return k(cls, 0, eArr);
    }

    public d r() {
        return this.f21340b.f();
    }

    public d s() {
        return this.f21340b.g();
    }

    public int t() {
        return this.f21340b.h();
    }

    public int u() {
        return this.f21341c;
    }

    public int v() {
        return this.f21340b.i();
    }

    public b w(Object obj) {
        return x(obj, 0);
    }

    public b x(Object obj, int i5) {
        return q(b.a.Insert, obj, i5);
    }

    public <E> b y(Class<E> cls, int i5, E... eArr) {
        return o(b.a.InsertInTxArray, cls, eArr, i5);
    }

    public <E> b z(Class<E> cls, Iterable<E> iterable) {
        return A(cls, iterable, 0);
    }
}
