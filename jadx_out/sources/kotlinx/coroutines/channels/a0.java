package kotlinx.coroutines.channels;

import com.umeng.analytics.pro.bi;
import kotlin.b1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.u1;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BO\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!\u0012-\u0010&\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00050#¢\u0006\u0002\b%ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u001e\u0010\b\u001a\u00020\u00072\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010\t\u001a\u00020\u0007H\u0014J\u001b\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00028\u0000H\u0017¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f2\u0006\u0010\u0006\u001a\u00028\u0000H\u0016ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0001\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R,\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00190\u00188VX\u0096\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006)"}, d2 = {"Lkotlinx/coroutines/channels/a0;", "E", "Lkotlinx/coroutines/channels/a;", "Lkotlinx/coroutines/selects/m;", "select", "", "element", "Lkotlin/r2;", "A1", "c1", "F", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "offer", "(Ljava/lang/Object;)Z", "Lkotlinx/coroutines/channels/p;", bi.aA, "(Ljava/lang/Object;)Ljava/lang/Object;", "", "cause", "Lkotlin/coroutines/d;", "e", "Lkotlin/coroutines/d;", "continuation", "Lkotlinx/coroutines/selects/i;", "Lkotlinx/coroutines/channels/h0;", "l", "()Lkotlinx/coroutines/selects/i;", "getOnSend$annotations", "()V", "onSend", "Lkotlin/coroutines/g;", "parentContext", "Lkotlinx/coroutines/channels/l;", "channel", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/c;", "Lkotlin/u;", "block", "<init>", "(Lkotlin/coroutines/g;Lkotlinx/coroutines/channels/l;Lv3/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class a0<E> extends kotlinx.coroutines.channels.a<E> {

    /* renamed from: e, reason: collision with root package name */
    @p4.l
    private kotlin.coroutines.d<? super r2> f19868e;

    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    /* synthetic */ class a extends kotlin.jvm.internal.h0 implements v3.q<a0<?>, kotlinx.coroutines.selects.m<?>, Object, r2> {
        public static final a INSTANCE = new a();

        a() {
            super(3, a0.class, "onSendRegFunction", "onSendRegFunction(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        @Override // v3.q
        public /* bridge */ /* synthetic */ r2 invoke(a0<?> a0Var, kotlinx.coroutines.selects.m<?> mVar, Object obj) {
            invoke2(a0Var, mVar, obj);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l a0<?> a0Var, @p4.l kotlinx.coroutines.selects.m<?> mVar, @p4.m Object obj) {
            a0Var.A1(mVar, obj);
        }
    }

    public a0(@p4.l kotlin.coroutines.g gVar, @p4.l l<E> lVar, @p4.l v3.p<? super c<E>, ? super kotlin.coroutines.d<? super r2>, ? extends Object> pVar) {
        super(gVar, lVar, false);
        kotlin.coroutines.d<? super r2> c5;
        c5 = kotlin.coroutines.intrinsics.c.c(pVar, this, this);
        this.f19868e = c5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A1(kotlinx.coroutines.selects.m<?> mVar, Object obj) {
        c1();
        super.l().a().invoke(this, mVar, obj);
    }

    public static /* synthetic */ void z1() {
    }

    @Override // kotlinx.coroutines.channels.m, kotlinx.coroutines.channels.h0
    public boolean E(@p4.m Throwable th) {
        boolean E = super.E(th);
        start();
        return E;
    }

    @Override // kotlinx.coroutines.channels.m, kotlinx.coroutines.channels.h0
    @p4.m
    public Object F(E e5, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        start();
        Object F = super.F(e5, dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (F == l5) {
            return F;
        }
        return r2.f19517a;
    }

    @Override // kotlinx.coroutines.t2
    protected void c1() {
        h4.a.c(this.f19868e, this);
    }

    @Override // kotlinx.coroutines.channels.m, kotlinx.coroutines.channels.h0
    @p4.l
    public kotlinx.coroutines.selects.i<E, h0<E>> l() {
        a aVar = a.INSTANCE;
        l0.n(aVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        return new kotlinx.coroutines.selects.j(this, (v3.q) u1.q(aVar, 3), super.l().c(), null, 8, null);
    }

    @Override // kotlinx.coroutines.channels.m, kotlinx.coroutines.channels.h0
    @kotlin.k(level = kotlin.m.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @b1(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E e5) {
        start();
        return super.offer(e5);
    }

    @Override // kotlinx.coroutines.channels.m, kotlinx.coroutines.channels.h0
    @p4.l
    public Object p(E e5) {
        start();
        return super.p(e5);
    }
}
