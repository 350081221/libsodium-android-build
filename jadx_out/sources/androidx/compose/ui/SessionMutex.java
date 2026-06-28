package androidx.compose.ui;

import androidx.annotation.RestrictTo;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.lody.virtual.client.ipc.ServiceManagerNative;
import com.umeng.analytics.pro.d;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.l2;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import p4.l;
import p4.m;
import t0.b;
import u3.f;
import v3.p;

@f
@InternalComposeUiApi
@i0(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001(B\t\b\u0016¢\u0006\u0004\b%\u0010&B1\b\u0002\u0012&\u0010 \u001a\"\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001e0\u001dj\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001e`\u001f¢\u0006\u0004\b%\u0010'J]\u0010\u000f\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u000421\u0010\f\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0007H\u0086@¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0013\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0017\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001c\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR4\u0010 \u001a\"\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001e0\u001dj\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001e`\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0013\u0010$\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\"\u0010#\u0088\u0001 \u0092\u0001\"\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001e0\u001dj\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001e`\u001f¨\u0006)"}, d2 = {"Landroidx/compose/ui/SessionMutex;", "T", "", "R", "Lkotlin/Function1;", "Lkotlinx/coroutines/s0;", "sessionInitializer", "Lkotlin/Function2;", "Lkotlin/v0;", "name", "data", "Lkotlin/coroutines/d;", d.aC, "withSessionCancellingPrevious-impl", "(Ljava/util/concurrent/atomic/AtomicReference;Lv3/l;Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "withSessionCancellingPrevious", "", "toString-impl", "(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Ljava/util/concurrent/atomic/AtomicReference;)I", TTDownloadField.TT_HASHCODE, "other", "", "equals-impl", "(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;)Z", "equals", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/ui/SessionMutex$Session;", "Landroidx/compose/ui/AtomicReference;", "currentSessionHolder", "Ljava/util/concurrent/atomic/AtomicReference;", "getCurrentSession-impl", "(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Object;", "currentSession", "constructor-impl", "()Ljava/util/concurrent/atomic/AtomicReference;", "(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/concurrent/atomic/AtomicReference;", "Session", "ui_release"}, k = 1, mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class SessionMutex<T> {

    @l
    private final AtomicReference<Session<T>> currentSessionHolder;

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00028\u0001¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/SessionMutex$Session;", "T", "", "Lkotlinx/coroutines/l2;", ServiceManagerNative.JOB, "Lkotlinx/coroutines/l2;", "getJob", "()Lkotlinx/coroutines/l2;", b.f22420d, "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "<init>", "(Lkotlinx/coroutines/l2;Ljava/lang/Object;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class Session<T> {

        @l
        private final l2 job;
        private final T value;

        public Session(@l l2 l2Var, T t5) {
            this.job = l2Var;
            this.value = t5;
        }

        @l
        public final l2 getJob() {
            return this.job;
        }

        public final T getValue() {
            return this.value;
        }
    }

    private /* synthetic */ SessionMutex(AtomicReference atomicReference) {
        this.currentSessionHolder = atomicReference;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SessionMutex m3372boximpl(AtomicReference atomicReference) {
        return new SessionMutex(atomicReference);
    }

    @l
    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> AtomicReference<Session<T>> m3373constructorimpl() {
        return m3374constructorimpl(new AtomicReference(null));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static <T> AtomicReference<Session<T>> m3374constructorimpl(AtomicReference<Session<T>> atomicReference) {
        return atomicReference;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3375equalsimpl(AtomicReference<Session<T>> atomicReference, Object obj) {
        return (obj instanceof SessionMutex) && l0.g(atomicReference, ((SessionMutex) obj).m3381unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3376equalsimpl0(AtomicReference<Session<T>> atomicReference, AtomicReference<Session<T>> atomicReference2) {
        return l0.g(atomicReference, atomicReference2);
    }

    @m
    /* renamed from: getCurrentSession-impl, reason: not valid java name */
    public static final T m3377getCurrentSessionimpl(AtomicReference<Session<T>> atomicReference) {
        Session<T> session = atomicReference.get();
        if (session != null) {
            return session.getValue();
        }
        return null;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3378hashCodeimpl(AtomicReference<Session<T>> atomicReference) {
        return atomicReference.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3379toStringimpl(AtomicReference<Session<T>> atomicReference) {
        return "SessionMutex(currentSessionHolder=" + atomicReference + ')';
    }

    @m
    /* renamed from: withSessionCancellingPrevious-impl, reason: not valid java name */
    public static final <R> Object m3380withSessionCancellingPreviousimpl(AtomicReference<Session<T>> atomicReference, @l v3.l<? super s0, ? extends T> lVar, @l p<? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar, @l kotlin.coroutines.d<? super R> dVar) {
        return t0.g(new SessionMutex$withSessionCancellingPrevious$2(lVar, atomicReference, pVar, null), dVar);
    }

    public boolean equals(Object obj) {
        return m3375equalsimpl(this.currentSessionHolder, obj);
    }

    public int hashCode() {
        return m3378hashCodeimpl(this.currentSessionHolder);
    }

    public String toString() {
        return m3379toStringimpl(this.currentSessionHolder);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ AtomicReference m3381unboximpl() {
        return this.currentSessionHolder;
    }
}
