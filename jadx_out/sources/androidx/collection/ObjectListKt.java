package androidx.collection;

import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import p4.l;

@i0(d1 = {"\u00002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\u001a\u0018\u0010\u0004\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a \u0010\u0007\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0002\u001a\u0012\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\b\u001a\u0012\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\b\u001a!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\b2\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\r\u001a)\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\b2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\u000f\u001a1\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\b2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\u0011\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\b2\u0012\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0012\"\u00028\u0000¢\u0006\u0004\b\u000b\u0010\u0014\u001a\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\bH\u0086\b\u001a!\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\b2\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a)\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\b2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u0016\u0010\u0018\u001a1\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\b2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u0000¢\u0006\u0004\b\u0016\u0010\u0019\u001a0\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\b2\u0012\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0012\"\u00028\u0000H\u0086\b¢\u0006\u0004\b\u0016\u0010\u001a\"\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\"\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"", "", "index", "Lkotlin/r2;", "checkIndex", "fromIndex", "toIndex", "checkSubIndex", "E", "Landroidx/collection/ObjectList;", "emptyObjectList", "objectListOf", "element1", "(Ljava/lang/Object;)Landroidx/collection/ObjectList;", "element2", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/ObjectList;", "element3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/ObjectList;", "", "elements", "([Ljava/lang/Object;)Landroidx/collection/ObjectList;", "Landroidx/collection/MutableObjectList;", "mutableObjectListOf", "(Ljava/lang/Object;)Landroidx/collection/MutableObjectList;", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/MutableObjectList;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/MutableObjectList;", "([Ljava/lang/Object;)Landroidx/collection/MutableObjectList;", "", "EmptyArray", "[Ljava/lang/Object;", "EmptyObjectList", "Landroidx/collection/ObjectList;", "collection"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nObjectList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectList.kt\nandroidx/collection/ObjectListKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ObjectList.kt\nandroidx/collection/MutableObjectList\n*L\n1#1,1618:1\n1#2:1619\n948#3,2:1620\n948#3,2:1622\n948#3,2:1624\n948#3,2:1626\n948#3,2:1628\n948#3,2:1630\n*S KotlinDebug\n*F\n+ 1 ObjectList.kt\nandroidx/collection/ObjectListKt\n*L\n1587#1:1620,2\n1596#1:1622,2\n1597#1:1624,2\n1607#1:1626,2\n1608#1:1628,2\n1609#1:1630,2\n*E\n"})
/* loaded from: classes.dex */
public final class ObjectListKt {

    @l
    private static final Object[] EmptyArray = new Object[0];

    @l
    private static final ObjectList<Object> EmptyObjectList = new MutableObjectList(0);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkIndex(List<?> list, int i5) {
        int size = list.size();
        if (i5 >= 0 && i5 < size) {
            return;
        }
        throw new IndexOutOfBoundsException("Index " + i5 + " is out of bounds. The list has " + size + " elements.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkSubIndex(List<?> list, int i5, int i6) {
        int size = list.size();
        if (i5 <= i6) {
            if (i5 >= 0) {
                if (i6 <= size) {
                    return;
                }
                throw new IndexOutOfBoundsException("toIndex (" + i6 + ") is more than than the list size (" + size + ')');
            }
            throw new IndexOutOfBoundsException("fromIndex (" + i5 + ") is less than 0.");
        }
        throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i5 + ") is greater than toIndex (" + i6 + ").");
    }

    @l
    public static final <E> ObjectList<E> emptyObjectList() {
        ObjectList<E> objectList = (ObjectList<E>) EmptyObjectList;
        l0.n(objectList, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>");
        return objectList;
    }

    @l
    public static final <E> MutableObjectList<E> mutableObjectListOf() {
        return new MutableObjectList<>(0, 1, null);
    }

    @l
    public static final <E> ObjectList<E> objectListOf() {
        ObjectList<E> objectList = (ObjectList<E>) EmptyObjectList;
        l0.n(objectList, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.objectListOf>");
        return objectList;
    }

    @l
    public static final <E> MutableObjectList<E> mutableObjectListOf(E e5) {
        MutableObjectList<E> mutableObjectList = new MutableObjectList<>(1);
        mutableObjectList.add(e5);
        return mutableObjectList;
    }

    @l
    public static final <E> ObjectList<E> objectListOf(E e5) {
        return mutableObjectListOf(e5);
    }

    @l
    public static final <E> ObjectList<E> objectListOf(E e5, E e6) {
        return mutableObjectListOf(e5, e6);
    }

    @l
    public static final <E> MutableObjectList<E> mutableObjectListOf(E e5, E e6) {
        MutableObjectList<E> mutableObjectList = new MutableObjectList<>(2);
        mutableObjectList.add(e5);
        mutableObjectList.add(e6);
        return mutableObjectList;
    }

    @l
    public static final <E> ObjectList<E> objectListOf(E e5, E e6, E e7) {
        return mutableObjectListOf(e5, e6, e7);
    }

    @l
    public static final <E> ObjectList<E> objectListOf(@l E... elements) {
        l0.p(elements, "elements");
        MutableObjectList mutableObjectList = new MutableObjectList(elements.length);
        mutableObjectList.plusAssign((Object[]) elements);
        return mutableObjectList;
    }

    @l
    public static final <E> MutableObjectList<E> mutableObjectListOf(E e5, E e6, E e7) {
        MutableObjectList<E> mutableObjectList = new MutableObjectList<>(3);
        mutableObjectList.add(e5);
        mutableObjectList.add(e6);
        mutableObjectList.add(e7);
        return mutableObjectList;
    }

    @l
    public static final <E> MutableObjectList<E> mutableObjectListOf(@l E... elements) {
        l0.p(elements, "elements");
        MutableObjectList<E> mutableObjectList = new MutableObjectList<>(elements.length);
        mutableObjectList.plusAssign((Object[]) elements);
        return mutableObjectList;
    }
}
