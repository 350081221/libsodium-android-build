package kotlinx.coroutines.selects;

import com.umeng.analytics.pro.bi;
import kotlin.i0;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.u1;
import kotlin.r2;
import kotlinx.coroutines.d1;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0006\u001a\u00020\u00052\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0002R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0017\u0010\u0010\u001a\u00020\u000b8F¢\u0006\f\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/selects/a;", "", "Lkotlinx/coroutines/selects/m;", "select", "ignoredParam", "Lkotlin/r2;", "d", "", bi.ay, "J", "timeMillis", "Lkotlinx/coroutines/selects/e;", "b", "()Lkotlinx/coroutines/selects/e;", "getSelectClause$annotations", "()V", "selectClause", "<init>", "(J)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nOnTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnTimeout.kt\nkotlinx/coroutines/selects/OnTimeout\n+ 2 Runnable.kt\nkotlinx/coroutines/RunnableKt\n*L\n1#1,66:1\n17#2:67\n*S KotlinDebug\n*F\n+ 1 OnTimeout.kt\nkotlinx/coroutines/selects/OnTimeout\n*L\n56#1:67\n*E\n"})
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final long f20559a;

    @i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/r2;", "run", "()V", "kotlinx/coroutines/h3$a", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nRunnable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Runnable.kt\nkotlinx/coroutines/RunnableKt$Runnable$1\n+ 2 OnTimeout.kt\nkotlinx/coroutines/selects/OnTimeout\n*L\n1#1,18:1\n57#2,2:19\n*E\n"})
    /* renamed from: kotlinx.coroutines.selects.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class RunnableC0613a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ m f20560a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f20561b;

        public RunnableC0613a(m mVar, a aVar) {
            this.f20560a = mVar;
            this.f20561b = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f20560a.i(this.f20561b, r2.f19517a);
        }
    }

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    /* synthetic */ class b extends h0 implements v3.q<a, m<?>, Object, r2> {
        public static final b INSTANCE = new b();

        b() {
            super(3, a.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        @Override // v3.q
        public /* bridge */ /* synthetic */ r2 invoke(a aVar, m<?> mVar, Object obj) {
            invoke2(aVar, mVar, obj);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l a aVar, @p4.l m<?> mVar, @p4.m Object obj) {
            aVar.d(mVar, obj);
        }
    }

    public a(long j5) {
        this.f20559a = j5;
    }

    public static /* synthetic */ void c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(m<?> mVar, Object obj) {
        if (this.f20559a <= 0) {
            mVar.e(r2.f19517a);
            return;
        }
        RunnableC0613a runnableC0613a = new RunnableC0613a(mVar, this);
        l0.n(mVar, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        kotlin.coroutines.g context = mVar.getContext();
        mVar.f(d1.d(context).I(this.f20559a, runnableC0613a, context));
    }

    @p4.l
    public final e b() {
        b bVar = b.INSTANCE;
        l0.n(bVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        return new f(this, (v3.q) u1.q(bVar, 3), null, 4, null);
    }
}
