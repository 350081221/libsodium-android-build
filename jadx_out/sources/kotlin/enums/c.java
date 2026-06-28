package kotlin.enums;

import java.io.Serializable;
import java.lang.Enum;
import kotlin.collections.p;
import kotlin.g1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\b\u0003\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u0002H\u00010\u00042\u00060\u0005j\u0002`\u0006B\u0013\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0002\u0010\tJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0012J\u0016\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\fH\u0096\u0002¢\u0006\u0002\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0017J\b\u0010\u0019\u001a\u00020\u001aH\u0002R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lkotlin/enums/EnumEntriesList;", "T", "", "Lkotlin/enums/EnumEntries;", "Lkotlin/collections/AbstractList;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "entries", "", "([Ljava/lang/Enum;)V", "[Ljava/lang/Enum;", "size", "", "getSize", "()I", "contains", "", "element", "(Ljava/lang/Enum;)Z", "get", "index", "(I)Ljava/lang/Enum;", "indexOf", "(Ljava/lang/Enum;)I", "lastIndexOf", "writeReplace", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@g1(version = "1.8")
/* loaded from: classes3.dex */
public final class c<T extends Enum<T>> extends kotlin.collections.c<T> implements a<T>, Serializable {

    @l
    private final T[] entries;

    public c(@l T[] entries) {
        l0.p(entries, "entries");
        this.entries = entries;
    }

    private final Object writeReplace() {
        return new d(this.entries);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return contains((c<T>) obj);
        }
        return false;
    }

    @Override // kotlin.collections.c, kotlin.collections.a
    public int getSize() {
        return this.entries.length;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.c, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return indexOf((c<T>) obj);
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.c, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return lastIndexOf((c<T>) obj);
        }
        return -1;
    }

    public boolean contains(@l T element) {
        Object Pe;
        l0.p(element, "element");
        Pe = p.Pe(this.entries, element.ordinal());
        return ((Enum) Pe) == element;
    }

    @Override // kotlin.collections.c, java.util.List
    @l
    public T get(int i5) {
        kotlin.collections.c.Companion.b(i5, this.entries.length);
        return this.entries[i5];
    }

    public int indexOf(@l T element) {
        Object Pe;
        l0.p(element, "element");
        int ordinal = element.ordinal();
        Pe = p.Pe(this.entries, ordinal);
        if (((Enum) Pe) == element) {
            return ordinal;
        }
        return -1;
    }

    public int lastIndexOf(@l T element) {
        l0.p(element, "element");
        return indexOf((Object) element);
    }
}
