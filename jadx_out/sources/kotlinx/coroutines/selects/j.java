package kotlinx.coroutines.selects;

import com.umeng.analytics.pro.bi;
import kotlin.i0;
import kotlin.jvm.internal.w;
import kotlin.r2;

@i0(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B¨\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012U\u0010\u0015\u001aQ\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\t\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\r¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\nj\u0002`\u0011\u0012U\u0010\u0019\u001aQ\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00040\nj\u0002`\u0017\u0012i\b\u0002\u0010\u001e\u001ac\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\r¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00100\u001b\u0018\u00010\nj\u0004\u0018\u0001`\u001d¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bRi\u0010\u0015\u001aQ\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\t\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\r¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\nj\u0002`\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0005\u0010\u0014Ri\u0010\u0019\u001aQ\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00040\nj\u0002`\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0018\u0010\u0014R{\u0010\u001e\u001ac\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\r¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00100\u001b\u0018\u00010\nj\u0004\u0018\u0001`\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006!"}, d2 = {"Lkotlinx/coroutines/selects/j;", "P", "Q", "Lkotlinx/coroutines/selects/i;", "", bi.ay, "Ljava/lang/Object;", "d", "()Ljava/lang/Object;", "clauseObject", "Lkotlin/Function3;", "Lkotlin/v0;", "name", "Lkotlinx/coroutines/selects/m;", "select", "param", "Lkotlin/r2;", "Lkotlinx/coroutines/selects/RegistrationFunction;", "b", "Lv3/q;", "()Lv3/q;", "regFunc", "clauseResult", "Lkotlinx/coroutines/selects/ProcessResultFunction;", "c", "processResFunc", "internalResult", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "onCancellationConstructor", "<init>", "(Ljava/lang/Object;Lv3/q;Lv3/q;Lv3/q;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class j<P, Q> implements i<P, Q> {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final Object f20571a;

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private final v3.q<Object, m<?>, Object, r2> f20572b;

    /* renamed from: c, reason: collision with root package name */
    @p4.l
    private final v3.q<Object, Object, Object, Object> f20573c;

    /* renamed from: d, reason: collision with root package name */
    @p4.m
    private final v3.q<m<?>, Object, Object, v3.l<Throwable, r2>> f20574d;

    /* JADX WARN: Multi-variable type inference failed */
    public j(@p4.l Object obj, @p4.l v3.q<Object, ? super m<?>, Object, r2> qVar, @p4.l v3.q<Object, Object, Object, ? extends Object> qVar2, @p4.m v3.q<? super m<?>, Object, Object, ? extends v3.l<? super Throwable, r2>> qVar3) {
        this.f20571a = obj;
        this.f20572b = qVar;
        this.f20573c = qVar2;
        this.f20574d = qVar3;
    }

    @Override // kotlinx.coroutines.selects.k
    @p4.l
    public v3.q<Object, m<?>, Object, r2> a() {
        return this.f20572b;
    }

    @Override // kotlinx.coroutines.selects.k
    @p4.m
    public v3.q<m<?>, Object, Object, v3.l<Throwable, r2>> b() {
        return this.f20574d;
    }

    @Override // kotlinx.coroutines.selects.k
    @p4.l
    public v3.q<Object, Object, Object, Object> c() {
        return this.f20573c;
    }

    @Override // kotlinx.coroutines.selects.k
    @p4.l
    public Object d() {
        return this.f20571a;
    }

    public /* synthetic */ j(Object obj, v3.q qVar, v3.q qVar2, v3.q qVar3, int i5, w wVar) {
        this(obj, qVar, qVar2, (i5 & 8) != 0 ? null : qVar3);
    }
}
