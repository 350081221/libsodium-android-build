package kotlinx.coroutines.selects;

import com.umeng.analytics.pro.bi;
import kotlin.i0;
import kotlin.jvm.internal.w;
import kotlin.r2;

@i0(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001BÑ\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012U\u0010\u0013\u001aQ\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0007\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u000b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\bj\u0002`\u000f\u0012i\b\u0002\u0010\u0019\u001ac\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u000b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000e0\u0015\u0018\u00010\bj\u0004\u0018\u0001`\u0017¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006Ri\u0010\u0013\u001aQ\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0007\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u000b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\bj\u0002`\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0003\u0010\u0012R{\u0010\u0019\u001ac\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u000b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000e0\u0015\u0018\u00010\bj\u0004\u0018\u0001`\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012Ri\u0010\u001c\u001aQ\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0007\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u00020\bj\u0002`\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0018\u0010\u0012¨\u0006\u001f"}, d2 = {"Lkotlinx/coroutines/selects/f;", "Lkotlinx/coroutines/selects/e;", "", bi.ay, "Ljava/lang/Object;", "d", "()Ljava/lang/Object;", "clauseObject", "Lkotlin/Function3;", "Lkotlin/v0;", "name", "Lkotlinx/coroutines/selects/m;", "select", "param", "Lkotlin/r2;", "Lkotlinx/coroutines/selects/RegistrationFunction;", "b", "Lv3/q;", "()Lv3/q;", "regFunc", "internalResult", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "c", "onCancellationConstructor", "clauseResult", "Lkotlinx/coroutines/selects/ProcessResultFunction;", "processResFunc", "<init>", "(Ljava/lang/Object;Lv3/q;Lv3/q;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final Object f20563a;

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private final v3.q<Object, m<?>, Object, r2> f20564b;

    /* renamed from: c, reason: collision with root package name */
    @p4.m
    private final v3.q<m<?>, Object, Object, v3.l<Throwable, r2>> f20565c;

    /* renamed from: d, reason: collision with root package name */
    @p4.l
    private final v3.q<Object, Object, Object, Object> f20566d;

    /* JADX WARN: Multi-variable type inference failed */
    public f(@p4.l Object obj, @p4.l v3.q<Object, ? super m<?>, Object, r2> qVar, @p4.m v3.q<? super m<?>, Object, Object, ? extends v3.l<? super Throwable, r2>> qVar2) {
        v3.q<Object, Object, Object, Object> qVar3;
        this.f20563a = obj;
        this.f20564b = qVar;
        this.f20565c = qVar2;
        qVar3 = o.f20590a;
        this.f20566d = qVar3;
    }

    @Override // kotlinx.coroutines.selects.k
    @p4.l
    public v3.q<Object, m<?>, Object, r2> a() {
        return this.f20564b;
    }

    @Override // kotlinx.coroutines.selects.k
    @p4.m
    public v3.q<m<?>, Object, Object, v3.l<Throwable, r2>> b() {
        return this.f20565c;
    }

    @Override // kotlinx.coroutines.selects.k
    @p4.l
    public v3.q<Object, Object, Object, Object> c() {
        return this.f20566d;
    }

    @Override // kotlinx.coroutines.selects.k
    @p4.l
    public Object d() {
        return this.f20563a;
    }

    public /* synthetic */ f(Object obj, v3.q qVar, v3.q qVar2, int i5, w wVar) {
        this(obj, qVar, (i5 & 4) != 0 ? null : qVar2);
    }
}
