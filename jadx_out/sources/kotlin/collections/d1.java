package kotlin.collections;

import java.util.List;
import java.util.RandomAccess;

@kotlin.i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u0004B\u0013\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\tH\u0096\u0002¢\u0006\u0002\u0010\u0010J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tR\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, d2 = {"Lkotlin/collections/MovingSubList;", "E", "Lkotlin/collections/AbstractList;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "list", "", "(Ljava/util/List;)V", "_size", "", "fromIndex", "size", "getSize", "()I", "get", "index", "(I)Ljava/lang/Object;", "move", "", "toIndex", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d1<E> extends c<E> implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final List<E> f19116a;

    /* renamed from: b, reason: collision with root package name */
    private int f19117b;

    /* renamed from: c, reason: collision with root package name */
    private int f19118c;

    /* JADX WARN: Multi-variable type inference failed */
    public d1(@p4.l List<? extends E> list) {
        kotlin.jvm.internal.l0.p(list, "list");
        this.f19116a = list;
    }

    public final void a(int i5, int i6) {
        c.Companion.d(i5, i6, this.f19116a.size());
        this.f19117b = i5;
        this.f19118c = i6 - i5;
    }

    @Override // kotlin.collections.c, java.util.List
    public E get(int i5) {
        c.Companion.b(i5, this.f19118c);
        return this.f19116a.get(this.f19117b + i5);
    }

    @Override // kotlin.collections.c, kotlin.collections.a
    public int getSize() {
        return this.f19118c;
    }
}
