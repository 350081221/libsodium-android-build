package kotlin.sequences;

import java.util.Iterator;
import kotlin.i0;
import kotlin.jvm.internal.l0;

@i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0096\u0002R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lkotlin/sequences/DistinctSequence;", "T", "K", "Lkotlin/sequences/Sequence;", "source", "keySelector", "Lkotlin/Function1;", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)V", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c<T, K> implements m<T> {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final m<T> f19605a;

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private final v3.l<T, K> f19606b;

    /* JADX WARN: Multi-variable type inference failed */
    public c(@p4.l m<? extends T> source, @p4.l v3.l<? super T, ? extends K> keySelector) {
        l0.p(source, "source");
        l0.p(keySelector, "keySelector");
        this.f19605a = source;
        this.f19606b = keySelector;
    }

    @Override // kotlin.sequences.m
    @p4.l
    public Iterator<T> iterator() {
        return new b(this.f19605a.iterator(), this.f19606b);
    }
}
