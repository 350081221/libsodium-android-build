package kotlinx.coroutines.flow;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.umeng.analytics.pro.bi;
import java.util.List;
import kotlin.e1;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u000e\u001a\u00020\u0003H\u0017R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011¨\u0006\u0017"}, d2 = {"Lkotlinx/coroutines/flow/s0;", "Lkotlinx/coroutines/flow/o0;", "Lkotlinx/coroutines/flow/t0;", "", "subscriptionCount", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/m0;", bi.ay, "", "toString", "", "other", "", "equals", TTDownloadField.TT_HASHCODE, "", "b", "J", "stopTimeout", "c", "replayExpiration", "<init>", "(JJ)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nSharingStarted.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharingStarted.kt\nkotlinx/coroutines/flow/StartedWhileSubscribed\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,209:1\n1#2:210\n*E\n"})
/* loaded from: classes4.dex */
public final class s0 implements o0 {

    /* renamed from: b, reason: collision with root package name */
    private final long f20202b;

    /* renamed from: c, reason: collision with root package name */
    private final long f20203c;

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", f = "SharingStarted.kt", i = {1, 2, 3}, l = {178, 180, 182, 183, 185}, m = "invokeSuspend", n = {"$this$transformLatest", "$this$transformLatest", "$this$transformLatest"}, s = {"L$0", "L$0", "L$0"})
    @kotlin.i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lkotlinx/coroutines/flow/m0;", "", "count", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.o implements v3.q<j<? super m0>, Integer, kotlin.coroutines.d<? super r2>, Object> {
        /* synthetic */ int I$0;
        private /* synthetic */ Object L$0;
        int label;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(3, dVar);
        }

        @Override // v3.q
        public /* bridge */ /* synthetic */ Object invoke(j<? super m0> jVar, Integer num, kotlin.coroutines.d<? super r2> dVar) {
            return invoke(jVar, num.intValue(), dVar);
        }

        @p4.m
        public final Object invoke(@p4.l j<? super m0> jVar, int i5, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            a aVar = new a(dVar);
            aVar.L$0 = jVar;
            aVar.I$0 = i5;
            return aVar.invokeSuspend(r2.f19517a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x009b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x008d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r9.label
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L3c
                if (r1 == r6) goto L38
                if (r1 == r5) goto L30
                if (r1 == r4) goto L28
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                goto L38
            L18:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L20:
                java.lang.Object r1 = r9.L$0
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                kotlin.e1.n(r10)
                goto L8e
            L28:
                java.lang.Object r1 = r9.L$0
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                kotlin.e1.n(r10)
                goto L7d
            L30:
                java.lang.Object r1 = r9.L$0
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                kotlin.e1.n(r10)
                goto L64
            L38:
                kotlin.e1.n(r10)
                goto L9c
            L3c:
                kotlin.e1.n(r10)
                java.lang.Object r10 = r9.L$0
                r1 = r10
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                int r10 = r9.I$0
                if (r10 <= 0) goto L53
                kotlinx.coroutines.flow.m0 r10 = kotlinx.coroutines.flow.m0.START
                r9.label = r6
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L9c
                return r0
            L53:
                kotlinx.coroutines.flow.s0 r10 = kotlinx.coroutines.flow.s0.this
                long r6 = kotlinx.coroutines.flow.s0.c(r10)
                r9.L$0 = r1
                r9.label = r5
                java.lang.Object r10 = kotlinx.coroutines.d1.b(r6, r9)
                if (r10 != r0) goto L64
                return r0
            L64:
                kotlinx.coroutines.flow.s0 r10 = kotlinx.coroutines.flow.s0.this
                long r5 = kotlinx.coroutines.flow.s0.b(r10)
                r7 = 0
                int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r10 <= 0) goto L8e
                kotlinx.coroutines.flow.m0 r10 = kotlinx.coroutines.flow.m0.STOP
                r9.L$0 = r1
                r9.label = r4
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L7d
                return r0
            L7d:
                kotlinx.coroutines.flow.s0 r10 = kotlinx.coroutines.flow.s0.this
                long r4 = kotlinx.coroutines.flow.s0.b(r10)
                r9.L$0 = r1
                r9.label = r3
                java.lang.Object r10 = kotlinx.coroutines.d1.b(r4, r9)
                if (r10 != r0) goto L8e
                return r0
            L8e:
                kotlinx.coroutines.flow.m0 r10 = kotlinx.coroutines.flow.m0.STOP_AND_RESET_REPLAY_CACHE
                r3 = 0
                r9.L$0 = r3
                r9.label = r2
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L9c
                return r0
            L9c:
                kotlin.r2 r10 = kotlin.r2.f19517a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.s0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2", f = "SharingStarted.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/m0;", "it", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.o implements v3.p<m0, kotlin.coroutines.d<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        int label;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.L$0 = obj;
            return bVar;
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l m0 m0Var, @p4.m kotlin.coroutines.d<? super Boolean> dVar) {
            return ((b) create(m0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            boolean z4;
            kotlin.coroutines.intrinsics.d.l();
            if (this.label == 0) {
                e1.n(obj);
                if (((m0) this.L$0) != m0.START) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                return kotlin.coroutines.jvm.internal.b.a(z4);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public s0(long j5, long j6) {
        boolean z4;
        this.f20202b = j5;
        this.f20203c = j6;
        if (j5 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (j6 >= 0) {
                return;
            }
            throw new IllegalArgumentException(("replayExpiration(" + j6 + " ms) cannot be negative").toString());
        }
        throw new IllegalArgumentException(("stopTimeout(" + j5 + " ms) cannot be negative").toString());
    }

    @Override // kotlinx.coroutines.flow.o0
    @p4.l
    public i<m0> a(@p4.l t0<Integer> t0Var) {
        return k.g0(k.k0(k.d2(t0Var, new a(null)), new b(null)));
    }

    public boolean equals(@p4.m Object obj) {
        if (obj instanceof s0) {
            s0 s0Var = (s0) obj;
            if (this.f20202b == s0Var.f20202b && this.f20203c == s0Var.f20203c) {
                return true;
            }
        }
        return false;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return (Long.hashCode(this.f20202b) * 31) + Long.hashCode(this.f20203c);
    }

    @p4.l
    public String toString() {
        List j5;
        List a5;
        String j32;
        j5 = kotlin.collections.v.j(2);
        if (this.f20202b > 0) {
            j5.add("stopTimeout=" + this.f20202b + "ms");
        }
        if (this.f20203c < Long.MAX_VALUE) {
            j5.add("replayExpiration=" + this.f20203c + "ms");
        }
        a5 = kotlin.collections.v.a(j5);
        StringBuilder sb = new StringBuilder();
        sb.append("SharingStarted.WhileSubscribed(");
        j32 = kotlin.collections.e0.j3(a5, null, null, null, 0, null, null, 63, null);
        sb.append(j32);
        sb.append(')');
        return sb.toString();
    }
}
