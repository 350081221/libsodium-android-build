package kotlin.collections;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

@kotlin.i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b'\u0018\u0000 \u000b*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u000bB\u0007\b\u0004¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\t\u001a\u00020\nH\u0016¨\u0006\f"}, d2 = {"Lkotlin/collections/AbstractSet;", "E", "Lkotlin/collections/AbstractCollection;", "", "()V", "equals", "", "other", "", TTDownloadField.TT_HASHCODE, "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.g1(version = "1.1")
/* loaded from: classes3.dex */
public abstract class i<E> extends kotlin.collections.a<E> implements Set<E>, w3.a {

    @p4.l
    public static final a Companion = new a(null);

    @kotlin.i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u001e\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0000¢\u0006\u0002\b\bJ\u0019\u0010\t\u001a\u00020\n2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0000¢\u0006\u0002\b\f¨\u0006\r"}, d2 = {"Lkotlin/collections/AbstractSet$Companion;", "", "()V", "setEquals", "", "c", "", "other", "setEquals$kotlin_stdlib", "unorderedHashCode", "", "", "unorderedHashCode$kotlin_stdlib", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.w wVar) {
            this();
        }

        public final boolean a(@p4.l Set<?> c5, @p4.l Set<?> other) {
            kotlin.jvm.internal.l0.p(c5, "c");
            kotlin.jvm.internal.l0.p(other, "other");
            if (c5.size() != other.size()) {
                return false;
            }
            return c5.containsAll(other);
        }

        public final int b(@p4.l Collection<?> c5) {
            int i5;
            kotlin.jvm.internal.l0.p(c5, "c");
            int i6 = 0;
            for (Object obj : c5) {
                if (obj != null) {
                    i5 = obj.hashCode();
                } else {
                    i5 = 0;
                }
                i6 += i5;
            }
            return i6;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@p4.m Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        return Companion.a(this, (Set) obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return Companion.b(this);
    }

    @Override // kotlin.collections.a, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
