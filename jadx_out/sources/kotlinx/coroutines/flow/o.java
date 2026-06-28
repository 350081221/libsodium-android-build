package kotlinx.coroutines.flow;

import com.umeng.analytics.pro.bi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0004\u001a9\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a9\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a=\u0010\r\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0010\b\u0001\u0010\f*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00028\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"T", "Lkotlinx/coroutines/flow/i;", "", "destination", "", "b", "(Lkotlinx/coroutines/flow/i;Ljava/util/List;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "", "d", "(Lkotlinx/coroutines/flow/i;Ljava/util/Set;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "C", bi.ay, "(Lkotlinx/coroutines/flow/i;Ljava/util/Collection;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes4.dex */
public final /* synthetic */ class o {

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__CollectionKt", f = "Collection.kt", i = {0}, l = {26}, m = "toCollection", n = {"destination"}, s = {"L$0"})
    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a<T, C extends Collection<? super T>> extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.X1(null, null, this);
        }
    }

    @kotlin.i0(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u001f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0010\b\u0001\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "", "C", t0.b.f22420d, "Lkotlin/r2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class b<T> implements j {

        /* renamed from: a */
        final /* synthetic */ Collection f20188a;

        b(Collection collection) {
            this.f20188a = collection;
        }

        @Override // kotlinx.coroutines.flow.j
        @p4.m
        public final Object emit(T t5, @p4.l kotlin.coroutines.d<? super r2> dVar) {
            this.f20188a.add(t5);
            return r2.f19517a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T, C extends java.util.Collection<? super T>> java.lang.Object a(@p4.l kotlinx.coroutines.flow.i<? extends T> r4, @p4.l C r5, @p4.l kotlin.coroutines.d<? super C> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.o.a
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.o$a r0 = (kotlinx.coroutines.flow.o.a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.o$a r0 = new kotlinx.coroutines.flow.o$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.L$0
            r5 = r4
            java.util.Collection r5 = (java.util.Collection) r5
            kotlin.e1.n(r6)
            goto L49
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            kotlin.e1.n(r6)
            kotlinx.coroutines.flow.o$b r6 = new kotlinx.coroutines.flow.o$b
            r6.<init>(r5)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r4 = r4.collect(r6, r0)
            if (r4 != r1) goto L49
            return r1
        L49:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.o.a(kotlinx.coroutines.flow.i, java.util.Collection, kotlin.coroutines.d):java.lang.Object");
    }

    @p4.m
    public static final <T> Object b(@p4.l i<? extends T> iVar, @p4.l List<T> list, @p4.l kotlin.coroutines.d<? super List<? extends T>> dVar) {
        return k.X1(iVar, list, dVar);
    }

    public static /* synthetic */ Object c(i iVar, List list, kotlin.coroutines.d dVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            list = new ArrayList();
        }
        return k.Y1(iVar, list, dVar);
    }

    @p4.m
    public static final <T> Object d(@p4.l i<? extends T> iVar, @p4.l Set<T> set, @p4.l kotlin.coroutines.d<? super Set<? extends T>> dVar) {
        return k.X1(iVar, set, dVar);
    }

    public static /* synthetic */ Object e(i iVar, Set set, kotlin.coroutines.d dVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            set = new LinkedHashSet();
        }
        return k.a2(iVar, set, dVar);
    }
}
