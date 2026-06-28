package kotlinx.coroutines.flow.internal;

import com.umeng.analytics.pro.bi;
import kotlin.i0;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.u1;
import kotlin.r2;

@i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"D\u0010\t\u001a,\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00008\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lkotlin/Function3;", "Lkotlinx/coroutines/flow/j;", "", "Lkotlin/coroutines/d;", "Lkotlin/r2;", bi.ay, "Lv3/q;", "getEmitFun$annotations", "()V", "emitFun", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private static final v3.q<kotlinx.coroutines.flow.j<Object>, Object, kotlin.coroutines.d<? super r2>, Object> f20146a;

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    /* synthetic */ class a extends h0 implements v3.q<kotlinx.coroutines.flow.j<? super Object>, Object, kotlin.coroutines.d<? super r2>, Object>, kotlin.coroutines.jvm.internal.n {
        public static final a INSTANCE = new a();

        a() {
            super(3, kotlinx.coroutines.flow.j.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // v3.q
        public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.flow.j<? super Object> jVar, Object obj, kotlin.coroutines.d<? super r2> dVar) {
            return invoke2((kotlinx.coroutines.flow.j<Object>) jVar, obj, dVar);
        }

        @p4.m
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@p4.l kotlinx.coroutines.flow.j<Object> jVar, @p4.m Object obj, @p4.l kotlin.coroutines.d<? super r2> dVar) {
            return jVar.emit(obj, dVar);
        }
    }

    static {
        a aVar = a.INSTANCE;
        l0.n(aVar, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        f20146a = (v3.q) u1.q(aVar, 3);
    }

    public static final /* synthetic */ v3.q a() {
        return f20146a;
    }

    private static /* synthetic */ void b() {
    }
}
