package kotlin.sequences;

import java.util.HashSet;
import java.util.Iterator;
import kotlin.i0;
import kotlin.jvm.internal.l0;

@i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010\f\u001a\u00020\rH\u0014R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00028\u00010\nj\b\u0012\u0004\u0012\u00028\u0001`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlin/sequences/DistinctIterator;", "T", "K", "Lkotlin/collections/AbstractIterator;", "source", "", "keySelector", "Lkotlin/Function1;", "(Ljava/util/Iterator;Lkotlin/jvm/functions/Function1;)V", "observed", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "computeNext", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class b<T, K> extends kotlin.collections.b<T> {

    /* renamed from: c, reason: collision with root package name */
    @p4.l
    private final Iterator<T> f19602c;

    /* renamed from: d, reason: collision with root package name */
    @p4.l
    private final v3.l<T, K> f19603d;

    /* renamed from: e, reason: collision with root package name */
    @p4.l
    private final HashSet<K> f19604e;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@p4.l Iterator<? extends T> source, @p4.l v3.l<? super T, ? extends K> keySelector) {
        l0.p(source, "source");
        l0.p(keySelector, "keySelector");
        this.f19602c = source;
        this.f19603d = keySelector;
        this.f19604e = new HashSet<>();
    }

    @Override // kotlin.collections.b
    protected void a() {
        while (this.f19602c.hasNext()) {
            T next = this.f19602c.next();
            if (this.f19604e.add(this.f19603d.invoke(next))) {
                c(next);
                return;
            }
        }
        b();
    }
}
