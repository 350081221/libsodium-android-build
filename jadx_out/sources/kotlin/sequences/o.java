package kotlin.sequences;

import java.util.Collection;
import java.util.Iterator;
import kotlin.g1;
import kotlin.i0;
import kotlin.r2;

@i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002B\u0007\b\u0000¢\u0006\u0002\u0010\u0003J\u0019\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\u001f\u0010\b\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u001f\u0010\b\u001a\u00020\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lkotlin/sequences/SequenceScope;", "T", "", "()V", "yield", "", t0.b.f22420d, "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "yieldAll", "elements", "", "(Ljava/lang/Iterable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "iterator", "", "(Ljava/util/Iterator;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sequence", "Lkotlin/sequences/Sequence;", "(Lkotlin/sequences/Sequence;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.j
@g1(version = "1.3")
/* loaded from: classes4.dex */
public abstract class o<T> {
    @p4.m
    public abstract Object b(T t5, @p4.l kotlin.coroutines.d<? super r2> dVar);

    @p4.m
    public final Object c(@p4.l Iterable<? extends T> iterable, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return r2.f19517a;
        }
        Object j5 = j(iterable.iterator(), dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (j5 == l5) {
            return j5;
        }
        return r2.f19517a;
    }

    @p4.m
    public abstract Object j(@p4.l Iterator<? extends T> it, @p4.l kotlin.coroutines.d<? super r2> dVar);

    @p4.m
    public final Object l(@p4.l m<? extends T> mVar, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        Object j5 = j(mVar.iterator(), dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return j5 == l5 ? j5 : r2.f19517a;
    }
}
