package androidx.compose.ui;

import androidx.compose.animation.core.h;
import androidx.compose.ui.SessionMutex;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.r2;
import kotlinx.coroutines.l2;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import p4.m;
import v3.l;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [R] */
@f(c = "androidx.compose.ui.SessionMutex$withSessionCancellingPrevious$2", f = "SessionMutex.kt", i = {0, 1}, l = {66, 68}, m = "invokeSuspend", n = {"newSession", "newSession"}, s = {"L$0", "L$0"})
@i0(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"R", "T", "Lkotlinx/coroutines/s0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SessionMutex$withSessionCancellingPrevious$2<R> extends o implements p<s0, d<? super R>, Object> {
    final /* synthetic */ AtomicReference<SessionMutex.Session<T>> $arg0;
    final /* synthetic */ p<T, d<? super R>, Object> $session;
    final /* synthetic */ l<s0, T> $sessionInitializer;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SessionMutex$withSessionCancellingPrevious$2(l<? super s0, ? extends T> lVar, AtomicReference<SessionMutex.Session<T>> atomicReference, p<? super T, ? super d<? super R>, ? extends Object> pVar, d<? super SessionMutex$withSessionCancellingPrevious$2> dVar) {
        super(2, dVar);
        this.$sessionInitializer = lVar;
        this.$arg0 = atomicReference;
        this.$session = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final d<r2> create(@m Object obj, @p4.l d<?> dVar) {
        SessionMutex$withSessionCancellingPrevious$2 sessionMutex$withSessionCancellingPrevious$2 = new SessionMutex$withSessionCancellingPrevious$2(this.$sessionInitializer, this.$arg0, this.$session, dVar);
        sessionMutex$withSessionCancellingPrevious$2.L$0 = obj;
        return sessionMutex$withSessionCancellingPrevious$2;
    }

    @Override // v3.p
    @m
    public final Object invoke(@p4.l s0 s0Var, @m d<? super R> dVar) {
        return ((SessionMutex$withSessionCancellingPrevious$2) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@p4.l Object obj) {
        Object l5;
        SessionMutex.Session session;
        l2 job;
        SessionMutex.Session session2;
        l5 = kotlin.coroutines.intrinsics.d.l();
        int i5 = this.label;
        try {
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2) {
                        session2 = (SessionMutex.Session) this.L$0;
                        try {
                            e1.n(obj);
                            h.a(this.$arg0, session2, null);
                            return obj;
                        } catch (Throwable th) {
                            th = th;
                            h.a(this.$arg0, session2, null);
                            throw th;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                session = (SessionMutex.Session) this.L$0;
                e1.n(obj);
            } else {
                e1.n(obj);
                s0 s0Var = (s0) this.L$0;
                session = new SessionMutex.Session(p2.B(s0Var.getCoroutineContext()), this.$sessionInitializer.invoke(s0Var));
                SessionMutex.Session session3 = (SessionMutex.Session) this.$arg0.getAndSet(session);
                if (session3 != null && (job = session3.getJob()) != null) {
                    this.L$0 = session;
                    this.label = 1;
                    if (p2.l(job, this) == l5) {
                        return l5;
                    }
                }
            }
            p<T, d<? super R>, Object> pVar = this.$session;
            Object value = session.getValue();
            this.L$0 = session;
            this.label = 2;
            obj = pVar.invoke(value, this);
            if (obj == l5) {
                return l5;
            }
            session2 = session;
            h.a(this.$arg0, session2, null);
            return obj;
        } catch (Throwable th2) {
            th = th2;
            session2 = session;
            h.a(this.$arg0, session2, null);
            throw th;
        }
    }
}
