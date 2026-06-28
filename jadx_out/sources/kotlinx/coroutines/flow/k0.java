package kotlinx.coroutines.flow;

import com.umeng.analytics.pro.bi;
import kotlin.jvm.internal.r1;

@kotlin.i0(d1 = {"\u0000H\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a0\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u001a%\u0010\f\u001a\u0004\u0018\u00010\t*\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\r\u001a-\u0010\u0010\u001a\u00020\u000f*\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a6\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\"\u0014\u0010\u001a\u001a\u00020\u00188\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019¨\u0006\u001b"}, d2 = {"T", "", "replay", "extraBufferCapacity", "Lkotlinx/coroutines/channels/i;", "onBufferOverflow", "Lkotlinx/coroutines/flow/d0;", bi.ay, "", "", "", "index", "f", "([Ljava/lang/Object;J)Ljava/lang/Object;", "item", "Lkotlin/r2;", socket.g.f22386a, "([Ljava/lang/Object;JLjava/lang/Object;)V", "Lkotlinx/coroutines/flow/i0;", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "capacity", "Lkotlinx/coroutines/flow/i;", "e", "Lkotlinx/coroutines/internal/t0;", "Lkotlinx/coroutines/internal/t0;", "NO_VALUE", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedFlow.kt\nkotlinx/coroutines/flow/SharedFlowKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,731:1\n1#2:732\n*E\n"})
/* loaded from: classes4.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    @u3.e
    public static final kotlinx.coroutines.internal.t0 f20165a = new kotlinx.coroutines.internal.t0("NO_VALUE");

    @p4.l
    public static final <T> d0<T> a(int i5, int i6, @p4.l kotlinx.coroutines.channels.i iVar) {
        boolean z4;
        boolean z5;
        boolean z6 = true;
        if (i5 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (i6 >= 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                if (i5 <= 0 && i6 <= 0 && iVar != kotlinx.coroutines.channels.i.SUSPEND) {
                    z6 = false;
                }
                if (z6) {
                    int i7 = i6 + i5;
                    if (i7 < 0) {
                        i7 = Integer.MAX_VALUE;
                    }
                    return new j0(i5, i7, iVar);
                }
                throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + iVar).toString());
            }
            throw new IllegalArgumentException(("extraBufferCapacity cannot be negative, but was " + i6).toString());
        }
        throw new IllegalArgumentException(("replay cannot be negative, but was " + i5).toString());
    }

    public static /* synthetic */ d0 b(int i5, int i6, kotlinx.coroutines.channels.i iVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i5 = 0;
        }
        if ((i7 & 2) != 0) {
            i6 = 0;
        }
        if ((i7 & 4) != 0) {
            iVar = kotlinx.coroutines.channels.i.SUSPEND;
        }
        return a(i5, i6, iVar);
    }

    @p4.l
    public static final <T> i<T> e(@p4.l i0<? extends T> i0Var, @p4.l kotlin.coroutines.g gVar, int i5, @p4.l kotlinx.coroutines.channels.i iVar) {
        if ((i5 == 0 || i5 == -3) && iVar == kotlinx.coroutines.channels.i.SUSPEND) {
            return i0Var;
        }
        return new kotlinx.coroutines.flow.internal.i(i0Var, gVar, i5, iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object f(Object[] objArr, long j5) {
        return objArr[((int) j5) & (objArr.length - 1)];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(Object[] objArr, long j5, Object obj) {
        objArr[((int) j5) & (objArr.length - 1)] = obj;
    }
}
