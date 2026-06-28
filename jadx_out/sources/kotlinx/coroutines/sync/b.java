package kotlinx.coroutines.sync;

import com.umeng.analytics.pro.bi;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.h;
import kotlin.i0;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.u1;
import kotlin.r2;
import kotlinx.coroutines.a2;
import kotlinx.coroutines.g2;
import kotlinx.coroutines.internal.q0;
import kotlinx.coroutines.internal.t0;
import kotlinx.coroutines.n1;
import kotlinx.coroutines.p;
import kotlinx.coroutines.s;
import kotlinx.coroutines.selects.i;
import kotlinx.coroutines.selects.j;
import kotlinx.coroutines.selects.m;
import kotlinx.coroutines.selects.n;
import kotlinx.coroutines.x0;
import kotlinx.coroutines.z3;
import p4.l;
import u3.w;
import v3.q;

@i0(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002:\u0002-.B\u000f\u0012\u0006\u0010*\u001a\u00020\n¢\u0006\u0004\b+\u0010,J\u001d\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001d\u0010\f\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0007J\u0012\u0010\r\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010\u000e\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u001e\u0010\u0011\u001a\u00020\u00052\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u0014J\b\u0010\u0015\u001a\u00020\u0014H\u0016Rq\u0010\u001f\u001a_\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u000f¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0010\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00050\u001b0\u0016j\u0002`\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001eR\u0014\u0010\"\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R(\u0010(\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00020#8VX\u0096\u0004¢\u0006\f\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%R\u0013\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030)8\u0002X\u0082\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006/"}, d2 = {"Lkotlinx/coroutines/sync/b;", "Lkotlinx/coroutines/sync/e;", "Lkotlinx/coroutines/sync/a;", "", "owner", "Lkotlin/r2;", bi.aG, "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "C", "", bi.aJ, "f", "c", socket.g.f22386a, "Lkotlinx/coroutines/selects/m;", "select", "B", "result", "A", "", "toString", "Lkotlin/Function3;", "Lkotlin/v0;", "name", "param", "internalResult", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "Lv3/q;", "onSelectCancellationUnlockConstructor", "d", "()Z", "isLocked", "Lkotlinx/coroutines/selects/i;", "i", "()Lkotlinx/coroutines/selects/i;", "getOnLock$annotations", "()V", "onLock", "Lkotlinx/atomicfu/AtomicRef;", "locked", "<init>", "(Z)V", bi.ay, "b", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,300:1\n332#2,12:301\n1#3:313\n*S KotlinDebug\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl\n*L\n168#1:301,12\n*E\n"})
/* loaded from: classes4.dex */
public class b extends kotlinx.coroutines.sync.e implements kotlinx.coroutines.sync.a {

    /* renamed from: i, reason: collision with root package name */
    @l
    private static final AtomicReferenceFieldUpdater f20604i = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "owner");

    /* renamed from: h, reason: collision with root package name */
    @l
    private final q<m<?>, Object, Object, v3.l<Throwable, r2>> f20605h;

    @w
    @p4.m
    private volatile Object owner;

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001f\u0012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020*\u0012\b\u0010.\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b8\u00109J\u0015\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0001J\u0011\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0097\u0001J\t\u0010\u000b\u001a\u00020\u0002H\u0097\u0001J2\u0010\u0011\u001a\u00020\u00022'\u0010\u0010\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00020\fj\u0002`\u000fH\u0096\u0001J!\u0010\u0014\u001a\u00020\u00022\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J&\u0010\u0018\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0016\u001a\u00020\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\bH\u0097\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001a\u001a\u00020\u0004H\u0097\u0001J\u001c\u0010\u001d\u001a\u00020\u0002*\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u0002H\u0097\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\u0002*\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u0004H\u0097\u0001J\u001d\u0010$\u001a\u00020\u00022\n\u0010!\u001a\u0006\u0012\u0002\b\u00030 2\u0006\u0010#\u001a\u00020\"H\u0096\u0001JH\u0010&\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\b2#\u0010%\u001a\u001f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u0002\u0018\u00010\fH\u0016¢\u0006\u0004\b&\u0010'J<\u0010(\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022#\u0010%\u001a\u001f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u0002\u0018\u00010\fH\u0016¢\u0006\u0004\b(\u0010)R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020*8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010+R\u0016\u0010.\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010-R\u0014\u00102\u001a\u00020/8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00103\u001a\u00020\u00068\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00105\u001a\u00020\u00068\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b5\u00104R\u0014\u00107\u001a\u00020\u00068\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b6\u00104\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006:"}, d2 = {"Lkotlinx/coroutines/sync/b$a;", "Lkotlinx/coroutines/p;", "Lkotlin/r2;", "Lkotlinx/coroutines/z3;", "", "cause", "", bi.ay, "", "token", "K", "B", "Lkotlin/Function1;", "Lkotlin/v0;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", socket.g.f22386a, "Lkotlin/d1;", "result", "resumeWith", "(Ljava/lang/Object;)V", t0.b.f22420d, "idempotent", bi.aJ, "(Lkotlin/r2;Ljava/lang/Object;)Ljava/lang/Object;", "exception", "i", "Lkotlinx/coroutines/n0;", "f", "(Lkotlinx/coroutines/n0;Lkotlin/r2;)V", "k", "Lkotlinx/coroutines/internal/q0;", "segment", "", "index", "b", "onCancellation", "j", "(Lkotlin/r2;Ljava/lang/Object;Lv3/l;)Ljava/lang/Object;", "c", "(Lkotlin/r2;Lv3/l;)V", "Lkotlinx/coroutines/q;", "Lkotlinx/coroutines/q;", "cont", "Ljava/lang/Object;", "owner", "Lkotlin/coroutines/g;", "getContext", "()Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "isActive", "()Z", "isCancelled", "d", "isCompleted", "<init>", "(Lkotlinx/coroutines/sync/b;Lkotlinx/coroutines/q;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl$CancellableContinuationWithOwner\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,300:1\n1#2:301\n*E\n"})
    /* loaded from: classes4.dex */
    public final class a implements p<r2>, z3 {

        /* renamed from: a, reason: collision with root package name */
        @l
        @u3.e
        public final kotlinx.coroutines.q<r2> f20606a;

        /* renamed from: b, reason: collision with root package name */
        @p4.m
        @u3.e
        public final Object f20607b;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/r2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: kotlinx.coroutines.sync.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0616a extends n0 implements v3.l<Throwable, r2> {
            final /* synthetic */ b this$0;
            final /* synthetic */ a this$1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0616a(b bVar, a aVar) {
                super(1);
                this.this$0 = bVar;
                this.this$1 = aVar;
            }

            @Override // v3.l
            public /* bridge */ /* synthetic */ r2 invoke(Throwable th) {
                invoke2(th);
                return r2.f19517a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@l Throwable th) {
                this.this$0.g(this.this$1.f20607b);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/r2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl$CancellableContinuationWithOwner$tryResume$token$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,300:1\n1#2:301\n*E\n"})
        /* renamed from: kotlinx.coroutines.sync.b$a$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0617b extends n0 implements v3.l<Throwable, r2> {
            final /* synthetic */ b this$0;
            final /* synthetic */ a this$1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0617b(b bVar, a aVar) {
                super(1);
                this.this$0 = bVar;
                this.this$1 = aVar;
            }

            @Override // v3.l
            public /* bridge */ /* synthetic */ r2 invoke(Throwable th) {
                invoke2(th);
                return r2.f19517a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@l Throwable th) {
                b.f20604i.set(this.this$0, this.this$1.f20607b);
                this.this$0.g(this.this$1.f20607b);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(@l kotlinx.coroutines.q<? super r2> qVar, @p4.m Object obj) {
            this.f20606a = qVar;
            this.f20607b = obj;
        }

        @Override // kotlinx.coroutines.p
        @g2
        public void B() {
            this.f20606a.B();
        }

        @Override // kotlinx.coroutines.p
        @g2
        public void K(@l Object obj) {
            this.f20606a.K(obj);
        }

        @Override // kotlinx.coroutines.p
        public boolean a(@p4.m Throwable th) {
            return this.f20606a.a(th);
        }

        @Override // kotlinx.coroutines.z3
        public void b(@l q0<?> q0Var, int i5) {
            this.f20606a.b(q0Var, i5);
        }

        @Override // kotlinx.coroutines.p
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void C(@l r2 r2Var, @p4.m v3.l<? super Throwable, r2> lVar) {
            b.f20604i.set(b.this, this.f20607b);
            this.f20606a.C(r2Var, new C0616a(b.this, this));
        }

        @Override // kotlinx.coroutines.p
        public boolean d() {
            return this.f20606a.d();
        }

        @Override // kotlinx.coroutines.p
        @a2
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void z(@l kotlinx.coroutines.n0 n0Var, @l r2 r2Var) {
            this.f20606a.z(n0Var, r2Var);
        }

        @Override // kotlinx.coroutines.p
        public void g(@l v3.l<? super Throwable, r2> lVar) {
            this.f20606a.g(lVar);
        }

        @Override // kotlin.coroutines.d
        @l
        public kotlin.coroutines.g getContext() {
            return this.f20606a.getContext();
        }

        @Override // kotlinx.coroutines.p
        @g2
        @p4.m
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Object e(@l r2 r2Var, @p4.m Object obj) {
            return this.f20606a.e(r2Var, obj);
        }

        @Override // kotlinx.coroutines.p
        @g2
        @p4.m
        public Object i(@l Throwable th) {
            return this.f20606a.i(th);
        }

        @Override // kotlinx.coroutines.p
        public boolean isActive() {
            return this.f20606a.isActive();
        }

        @Override // kotlinx.coroutines.p
        public boolean isCancelled() {
            return this.f20606a.isCancelled();
        }

        @Override // kotlinx.coroutines.p
        @p4.m
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Object u(@l r2 r2Var, @p4.m Object obj, @p4.m v3.l<? super Throwable, r2> lVar) {
            Object u4 = this.f20606a.u(r2Var, obj, new C0617b(b.this, this));
            if (u4 != null) {
                b.f20604i.set(b.this, this.f20607b);
            }
            return u4;
        }

        @Override // kotlinx.coroutines.p
        @a2
        public void k(@l kotlinx.coroutines.n0 n0Var, @l Throwable th) {
            this.f20606a.k(n0Var, th);
        }

        @Override // kotlin.coroutines.d
        public void resumeWith(@l Object obj) {
            this.f20606a.resumeWith(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u001c\u0010\u001dJ\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0001J\u001d\u0010\u000b\u001a\u00020\u00052\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\n\u001a\u00020\tH\u0096\u0001J\u001a\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\fH\u0016R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lkotlinx/coroutines/sync/b$b;", "Q", "Lkotlinx/coroutines/selects/n;", "Lkotlinx/coroutines/n1;", "disposableHandle", "Lkotlin/r2;", "f", "Lkotlinx/coroutines/internal/q0;", "segment", "", "index", "b", "", "clauseObject", "result", "", "i", "internalResult", "e", bi.ay, "Lkotlinx/coroutines/selects/n;", "select", "Ljava/lang/Object;", "owner", "Lkotlin/coroutines/g;", "getContext", "()Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "<init>", "(Lkotlinx/coroutines/sync/b;Lkotlinx/coroutines/selects/n;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl$SelectInstanceWithOwner\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,300:1\n1#2:301\n*E\n"})
    /* renamed from: kotlinx.coroutines.sync.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public final class C0618b<Q> implements n<Q> {

        /* renamed from: a, reason: collision with root package name */
        @l
        @u3.e
        public final n<Q> f20609a;

        /* renamed from: b, reason: collision with root package name */
        @p4.m
        @u3.e
        public final Object f20610b;

        public C0618b(@l n<Q> nVar, @p4.m Object obj) {
            this.f20609a = nVar;
            this.f20610b = obj;
        }

        @Override // kotlinx.coroutines.z3
        public void b(@l q0<?> q0Var, int i5) {
            this.f20609a.b(q0Var, i5);
        }

        @Override // kotlinx.coroutines.selects.m
        public void e(@p4.m Object obj) {
            b.f20604i.set(b.this, this.f20610b);
            this.f20609a.e(obj);
        }

        @Override // kotlinx.coroutines.selects.m
        public void f(@l n1 n1Var) {
            this.f20609a.f(n1Var);
        }

        @Override // kotlinx.coroutines.selects.m
        @l
        public kotlin.coroutines.g getContext() {
            return this.f20609a.getContext();
        }

        @Override // kotlinx.coroutines.selects.m
        public boolean i(@l Object obj, @p4.m Object obj2) {
            boolean i5 = this.f20609a.i(obj, obj2);
            b bVar = b.this;
            if (i5) {
                b.f20604i.set(bVar, this.f20610b);
            }
            return i5;
        }
    }

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    /* synthetic */ class c extends h0 implements q<b, m<?>, Object, r2> {
        public static final c INSTANCE = new c();

        c() {
            super(3, b.class, "onLockRegFunction", "onLockRegFunction(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        @Override // v3.q
        public /* bridge */ /* synthetic */ r2 invoke(b bVar, m<?> mVar, Object obj) {
            invoke2(bVar, mVar, obj);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@l b bVar, @l m<?> mVar, @p4.m Object obj) {
            bVar.B(mVar, obj);
        }
    }

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    /* synthetic */ class d extends h0 implements q<b, Object, Object, Object> {
        public static final d INSTANCE = new d();

        d() {
            super(3, b.class, "onLockProcessResult", "onLockProcessResult(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // v3.q
        @p4.m
        public final Object invoke(@l b bVar, @p4.m Object obj, @p4.m Object obj2) {
            return bVar.A(obj, obj2);
        }
    }

    @i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lkotlinx/coroutines/selects/m;", "<anonymous parameter 0>", "", "owner", "<anonymous parameter 2>", "Lkotlin/Function1;", "", "Lkotlin/r2;", "invoke", "(Lkotlinx/coroutines/selects/m;Ljava/lang/Object;Ljava/lang/Object;)Lv3/l;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    static final class e extends n0 implements q<m<?>, Object, Object, v3.l<? super Throwable, ? extends r2>> {

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/r2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* loaded from: classes4.dex */
        public static final class a extends n0 implements v3.l<Throwable, r2> {
            final /* synthetic */ Object $owner;
            final /* synthetic */ b this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, Object obj) {
                super(1);
                this.this$0 = bVar;
                this.$owner = obj;
            }

            @Override // v3.l
            public /* bridge */ /* synthetic */ r2 invoke(Throwable th) {
                invoke2(th);
                return r2.f19517a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@l Throwable th) {
                this.this$0.g(this.$owner);
            }
        }

        e() {
            super(3);
        }

        @Override // v3.q
        @l
        public final v3.l<Throwable, r2> invoke(@l m<?> mVar, @p4.m Object obj, @p4.m Object obj2) {
            return new a(b.this, obj);
        }
    }

    public b(boolean z4) {
        super(1, z4 ? 1 : 0);
        t0 t0Var;
        if (z4) {
            t0Var = null;
        } else {
            t0Var = kotlinx.coroutines.sync.c.f20612a;
        }
        this.owner = t0Var;
        this.f20605h = new e();
    }

    private final int C(Object obj) {
        while (!b()) {
            if (obj != null) {
                if (h(obj)) {
                    return 2;
                }
                if (d()) {
                    return 1;
                }
            } else {
                return 1;
            }
        }
        f20604i.set(this, obj);
        return 0;
    }

    public static /* synthetic */ void x() {
    }

    static /* synthetic */ Object y(b bVar, Object obj, kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        if (bVar.c(obj)) {
            return r2.f19517a;
        }
        Object z4 = bVar.z(obj, dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (z4 == l5) {
            return z4;
        }
        return r2.f19517a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object z(Object obj, kotlin.coroutines.d<? super r2> dVar) {
        kotlin.coroutines.d e5;
        Object l5;
        Object l6;
        e5 = kotlin.coroutines.intrinsics.c.e(dVar);
        kotlinx.coroutines.q b5 = s.b(e5);
        try {
            m(new a(b5, obj));
            Object E = b5.E();
            l5 = kotlin.coroutines.intrinsics.d.l();
            if (E == l5) {
                h.c(dVar);
            }
            l6 = kotlin.coroutines.intrinsics.d.l();
            if (E == l6) {
                return E;
            }
            return r2.f19517a;
        } catch (Throwable th) {
            b5.R();
            throw th;
        }
    }

    @p4.m
    protected Object A(@p4.m Object obj, @p4.m Object obj2) {
        t0 t0Var;
        t0Var = kotlinx.coroutines.sync.c.f20613b;
        if (!l0.g(obj2, t0Var)) {
            return this;
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    protected void B(@l m<?> mVar, @p4.m Object obj) {
        t0 t0Var;
        if (obj != null && h(obj)) {
            t0Var = kotlinx.coroutines.sync.c.f20613b;
            mVar.e(t0Var);
        } else {
            l0.n(mVar, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectInstanceInternal<*>");
            s(new C0618b((n) mVar, obj), obj);
        }
    }

    @Override // kotlinx.coroutines.sync.a
    public boolean c(@p4.m Object obj) {
        int C = C(obj);
        if (C == 0) {
            return true;
        }
        if (C != 1) {
            if (C != 2) {
                throw new IllegalStateException("unexpected".toString());
            }
            throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
        }
        return false;
    }

    @Override // kotlinx.coroutines.sync.a
    public boolean d() {
        return a() == 0;
    }

    @Override // kotlinx.coroutines.sync.a
    @p4.m
    public Object f(@p4.m Object obj, @l kotlin.coroutines.d<? super r2> dVar) {
        return y(this, obj, dVar);
    }

    @Override // kotlinx.coroutines.sync.a
    public void g(@p4.m Object obj) {
        t0 t0Var;
        boolean z4;
        t0 t0Var2;
        while (d()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20604i;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            t0Var = kotlinx.coroutines.sync.c.f20612a;
            if (obj2 != t0Var) {
                if (obj2 != obj && obj != null) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (z4) {
                    t0Var2 = kotlinx.coroutines.sync.c.f20612a;
                    if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, obj2, t0Var2)) {
                        release();
                        return;
                    }
                } else {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked".toString());
    }

    @Override // kotlinx.coroutines.sync.a
    public boolean h(@l Object obj) {
        t0 t0Var;
        while (d()) {
            Object obj2 = f20604i.get(this);
            t0Var = kotlinx.coroutines.sync.c.f20612a;
            if (obj2 != t0Var) {
                if (obj2 != obj) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    @Override // kotlinx.coroutines.sync.a
    @l
    public i<Object, kotlinx.coroutines.sync.a> i() {
        c cVar = c.INSTANCE;
        l0.n(cVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        q qVar = (q) u1.q(cVar, 3);
        d dVar = d.INSTANCE;
        l0.n(dVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new j(this, qVar, (q) u1.q(dVar, 3), this.f20605h);
    }

    @l
    public String toString() {
        return "Mutex@" + x0.b(this) + "[isLocked=" + d() + ",owner=" + f20604i.get(this) + ']';
    }
}
