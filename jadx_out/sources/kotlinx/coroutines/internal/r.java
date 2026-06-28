package kotlinx.coroutines.internal;

import com.umeng.analytics.pro.bi;
import java.util.ArrayList;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@kotlin.i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002ø\u0001\u0002¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0003\u001a\u00028\u0000H\u0086\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\t\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0088\u0001\u0017\u0092\u0001\u0004\u0018\u00010\u0002ø\u0001\u0002\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lkotlinx/coroutines/internal/r;", "E", "", "element", bi.aJ, "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function1;", "Lkotlin/r2;", "action", "f", "(Ljava/lang/Object;Lv3/l;)V", "", "i", "(Ljava/lang/Object;)Ljava/lang/String;", "", socket.g.f22386a, "(Ljava/lang/Object;)I", "other", "", "d", "(Ljava/lang/Object;Ljava/lang/Object;)Z", bi.ay, "Ljava/lang/Object;", "holder", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@u3.f
@r1({"SMAP\nInlineList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InlineList.kt\nkotlinx/coroutines/internal/InlineList\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,49:1\n1#2:50\n*E\n"})
/* loaded from: classes4.dex */
public final class r<E> {

    /* renamed from: a, reason: collision with root package name */
    @p4.m
    private final Object f20384a;

    private /* synthetic */ r(Object obj) {
        this.f20384a = obj;
    }

    public static final /* synthetic */ r a(Object obj) {
        return new r(obj);
    }

    @p4.l
    public static <E> Object b(@p4.m Object obj) {
        return obj;
    }

    public static /* synthetic */ Object c(Object obj, int i5, kotlin.jvm.internal.w wVar) {
        if ((i5 & 1) != 0) {
            obj = null;
        }
        return b(obj);
    }

    public static boolean d(Object obj, Object obj2) {
        return (obj2 instanceof r) && kotlin.jvm.internal.l0.g(obj, ((r) obj2).j());
    }

    public static final boolean e(Object obj, Object obj2) {
        return kotlin.jvm.internal.l0.g(obj, obj2);
    }

    public static final void f(Object obj, @p4.l v3.l<? super E, r2> lVar) {
        if (obj == null) {
            return;
        }
        if (!(obj instanceof ArrayList)) {
            lVar.invoke(obj);
            return;
        }
        kotlin.jvm.internal.l0.n(obj, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
        ArrayList arrayList = (ArrayList) obj;
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 < size) {
                lVar.invoke((Object) arrayList.get(size));
            } else {
                return;
            }
        }
    }

    public static int g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @p4.l
    public static final Object h(Object obj, E e5) {
        if (obj == null) {
            return b(e5);
        }
        if (obj instanceof ArrayList) {
            kotlin.jvm.internal.l0.n(obj, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            ((ArrayList) obj).add(e5);
            return b(obj);
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(e5);
        return b(arrayList);
    }

    public static String i(Object obj) {
        return "InlineList(holder=" + obj + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f20384a, obj);
    }

    public int hashCode() {
        return g(this.f20384a);
    }

    public final /* synthetic */ Object j() {
        return this.f20384a;
    }

    public String toString() {
        return i(this.f20384a);
    }
}
