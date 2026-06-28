package kotlinx.coroutines.flow.internal;

import com.umeng.analytics.pro.bi;
import java.util.Arrays;
import kotlin.d1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.flow.internal.d;
import kotlinx.coroutines.flow.t0;

@i0(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u00060\u0003j\u0002`\u0004B\u0007¢\u0006\u0004\b(\u0010)J\u000f\u0010\u0005\u001a\u00028\u0000H$¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\t2\u0006\u0010\b\u001a\u00020\u0007H$¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\f\u0010\u0006J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\u0011H\u0084\bR8\u0010\u0019\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\t2\u0010\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\t8\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00078\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00070%8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010&¨\u0006*"}, d2 = {"Lkotlinx/coroutines/flow/internal/b;", "Lkotlinx/coroutines/flow/internal/d;", "S", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "i", "()Lkotlinx/coroutines/flow/internal/d;", "", "size", "", "j", "(I)[Lkotlinx/coroutines/flow/internal/d;", bi.aJ, "slot", "Lkotlin/r2;", "l", "(Lkotlinx/coroutines/flow/internal/d;)V", "Lkotlin/Function1;", "block", "k", "<set-?>", bi.ay, "[Lkotlinx/coroutines/flow/internal/d;", "n", "()[Lkotlinx/coroutines/flow/internal/d;", "slots", "b", "I", "m", "()I", "nCollectors", "c", "nextIndex", "Lkotlinx/coroutines/flow/internal/a0;", "d", "Lkotlinx/coroutines/flow/internal/a0;", "_subscriptionCount", "Lkotlinx/coroutines/flow/t0;", "()Lkotlinx/coroutines/flow/t0;", "subscriptionCount", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nAbstractSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/AbstractSharedFlow\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,132:1\n28#2,4:133\n28#2,4:138\n28#2,4:144\n20#3:137\n20#3:142\n20#3:148\n1#4:143\n13579#5,2:149\n*S KotlinDebug\n*F\n+ 1 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/AbstractSharedFlow\n*L\n30#1:133,4\n45#1:138,4\n76#1:144,4\n30#1:137\n45#1:142\n76#1:148\n95#1:149,2\n*E\n"})
/* loaded from: classes4.dex */
public abstract class b<S extends d<?>> {

    /* renamed from: a, reason: collision with root package name */
    @p4.m
    private S[] f20102a;

    /* renamed from: b, reason: collision with root package name */
    private int f20103b;

    /* renamed from: c, reason: collision with root package name */
    private int f20104c;

    /* renamed from: d, reason: collision with root package name */
    @p4.m
    private a0 f20105d;

    public static final /* synthetic */ int e(b bVar) {
        return bVar.f20103b;
    }

    public static final /* synthetic */ d[] g(b bVar) {
        return bVar.f20102a;
    }

    @p4.l
    public final t0<Integer> c() {
        a0 a0Var;
        synchronized (this) {
            a0Var = this.f20105d;
            if (a0Var == null) {
                a0Var = new a0(this.f20103b);
                this.f20105d = a0Var;
            }
        }
        return a0Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @p4.l
    public final S h() {
        S s5;
        a0 a0Var;
        synchronized (this) {
            S[] sArr = this.f20102a;
            if (sArr == null) {
                sArr = j(2);
                this.f20102a = sArr;
            } else if (this.f20103b >= sArr.length) {
                Object[] copyOf = Arrays.copyOf(sArr, sArr.length * 2);
                l0.o(copyOf, "copyOf(this, newSize)");
                this.f20102a = (S[]) ((d[]) copyOf);
                sArr = (S[]) ((d[]) copyOf);
            }
            int i5 = this.f20104c;
            do {
                s5 = sArr[i5];
                if (s5 == null) {
                    s5 = i();
                    sArr[i5] = s5;
                }
                i5++;
                if (i5 >= sArr.length) {
                    i5 = 0;
                }
                l0.n(s5, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
            } while (!s5.a(this));
            this.f20104c = i5;
            this.f20103b++;
            a0Var = this.f20105d;
        }
        if (a0Var != null) {
            a0Var.d0(1);
        }
        return s5;
    }

    @p4.l
    protected abstract S i();

    @p4.l
    protected abstract S[] j(int i5);

    protected final void k(@p4.l v3.l<? super S, r2> lVar) {
        d[] dVarArr;
        if (this.f20103b != 0 && (dVarArr = this.f20102a) != null) {
            for (d dVar : dVarArr) {
                if (dVar != null) {
                    lVar.invoke(dVar);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void l(@p4.l S s5) {
        a0 a0Var;
        int i5;
        kotlin.coroutines.d<r2>[] b5;
        synchronized (this) {
            int i6 = this.f20103b - 1;
            this.f20103b = i6;
            a0Var = this.f20105d;
            if (i6 == 0) {
                this.f20104c = 0;
            }
            l0.n(s5, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
            b5 = s5.b(this);
        }
        for (kotlin.coroutines.d<r2> dVar : b5) {
            if (dVar != null) {
                d1.a aVar = d1.Companion;
                dVar.resumeWith(d1.m6444constructorimpl(r2.f19517a));
            }
        }
        if (a0Var != null) {
            a0Var.d0(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int m() {
        return this.f20103b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @p4.m
    public final S[] n() {
        return this.f20102a;
    }
}
