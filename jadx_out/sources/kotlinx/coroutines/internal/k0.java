package kotlinx.coroutines.internal;

import com.umeng.analytics.pro.bi;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\u001aE\u0010\u0007\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u0000*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00032\u0006\u0010\u0004\u001a\u00028\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a?\u0010\u000b\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001aK\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000e\u0010\u000f**\b\u0000\u0010\u0010\u001a\u0004\b\u0000\u0010\u0000\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0011"}, d2 = {"E", "Lkotlin/Function1;", "Lkotlin/r2;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "element", "Lkotlinx/coroutines/internal/g1;", "undeliveredElementException", "c", "(Lv3/l;Ljava/lang/Object;Lkotlinx/coroutines/internal/g1;)Lkotlinx/coroutines/internal/g1;", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "b", "(Lv3/l;Ljava/lang/Object;Lkotlin/coroutines/g;)V", "", bi.ay, "(Lv3/l;Ljava/lang/Object;Lkotlin/coroutines/g;)Lv3/l;", "OnUndeliveredElement", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nOnUndeliveredElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnUndeliveredElement.kt\nkotlinx/coroutines/internal/OnUndeliveredElementKt\n+ 2 Exceptions.kt\nkotlinx/coroutines/ExceptionsKt\n*L\n1#1,44:1\n75#2:45\n*S KotlinDebug\n*F\n+ 1 OnUndeliveredElement.kt\nkotlinx/coroutines/internal/OnUndeliveredElementKt\n*L\n22#1:45\n*E\n"})
/* loaded from: classes4.dex */
public final class k0 {

    @kotlin.i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"E", "", "<anonymous parameter 0>", "Lkotlin/r2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.jvm.internal.n0 implements v3.l<Throwable, r2> {
        final /* synthetic */ kotlin.coroutines.g $context;
        final /* synthetic */ E $element;
        final /* synthetic */ v3.l<E, r2> $this_bindCancellationFun;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(v3.l<? super E, r2> lVar, E e5, kotlin.coroutines.g gVar) {
            super(1);
            this.$this_bindCancellationFun = lVar;
            this.$element = e5;
            this.$context = gVar;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(Throwable th) {
            invoke2(th);
            return r2.f19517a;
        }

        /* renamed from: invoke */
        public final void invoke2(@p4.l Throwable th) {
            k0.b(this.$this_bindCancellationFun, this.$element, this.$context);
        }
    }

    @p4.l
    public static final <E> v3.l<Throwable, r2> a(@p4.l v3.l<? super E, r2> lVar, E e5, @p4.l kotlin.coroutines.g gVar) {
        return new a(lVar, e5, gVar);
    }

    public static final <E> void b(@p4.l v3.l<? super E, r2> lVar, E e5, @p4.l kotlin.coroutines.g gVar) {
        g1 c5 = c(lVar, e5, null);
        if (c5 != null) {
            kotlinx.coroutines.p0.b(gVar, c5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @p4.m
    public static final <E> g1 c(@p4.l v3.l<? super E, r2> lVar, E e5, @p4.m g1 g1Var) {
        try {
            lVar.invoke(e5);
        } catch (Throwable th) {
            if (g1Var != null && g1Var.getCause() != th) {
                kotlin.p.a(g1Var, th);
            } else {
                return new g1("Exception in undelivered element handler for " + e5, th);
            }
        }
        return g1Var;
    }

    public static /* synthetic */ g1 d(v3.l lVar, Object obj, g1 g1Var, int i5, Object obj2) {
        if ((i5 & 2) != 0) {
            g1Var = null;
        }
        return c(lVar, obj, g1Var);
    }
}
