package androidx.collection;

import androidx.annotation.IntRange;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.u;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.w;
import kotlin.ranges.s;
import kotlin.sequences.p;
import p4.l;
import p4.m;
import w3.e;
import w3.f;

@i0(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u000389:B\u0011\u0012\b\b\u0002\u00105\u001a\u00020\u0007¢\u0006\u0004\b6\u00107J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u0005\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\nJ%\u0010\r\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\r\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fJ\u001e\u0010\r\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0014\u0010\r\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0014\u0010\r\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010J\u001b\u0010\r\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\r\u0010\u0011J\u0014\u0010\r\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012J\u0014\u0010\r\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013J\u0014\u0010\r\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014J\u0017\u0010\u0015\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002J\u0017\u0010\u0015\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0086\u0002J\u001e\u0010\u0015\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0015\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0086\u0002J\u0017\u0010\u0015\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0086\u0002J\u0017\u0010\u0015\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0086\u0002J\u0006\u0010\u0017\u001a\u00020\tJ\u0010\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\u0007J\u000e\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0007J\u0018\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b\u0015\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b\u001d\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u001e\u0010\u0006J/\u0010#\u001a\u00020\t2!\u0010\"\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00040\u001fH\u0086\bø\u0001\u0000J\u001b\u0010$\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b$\u0010\u0011J\u0014\u0010$\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0014\u0010$\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010J\u0014\u0010$\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012J\u0014\u0010$\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013J\u0014\u0010$\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014J\u001e\u0010\u001d\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0086\u0002¢\u0006\u0004\b\u001d\u0010\u0016J\u0017\u0010\u001d\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002J\u0017\u0010\u001d\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0086\u0002J\u0017\u0010\u001d\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0086\u0002J\u0017\u0010\u001d\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0086\u0002J\u0017\u0010\u001d\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0086\u0002J\u0017\u0010%\u001a\u00028\u00002\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020\t2\b\b\u0001\u0010'\u001a\u00020\u00072\b\b\u0001\u0010(\u001a\u00020\u0007J\u001b\u0010*\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b*\u0010\u0011J\u0014\u0010*\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0014\u0010*\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fJ\u0014\u0010*\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013J\u0014\u0010*\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014J\"\u0010+\u001a\u00028\u00002\b\b\u0001\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b+\u0010,J\u000e\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016J\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000.R\u001e\u00101\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0012\u0010\u001a\u001a\u00020\u00078Æ\u0002¢\u0006\u0006\u001a\u0004\b3\u00104\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006;"}, d2 = {"Landroidx/collection/MutableObjectList;", "E", "Landroidx/collection/ObjectList;", "element", "", "add", "(Ljava/lang/Object;)Z", "", "index", "Lkotlin/r2;", "(ILjava/lang/Object;)V", "", "elements", "addAll", "(I[Ljava/lang/Object;)Z", "", "Landroidx/collection/ScatterSet;", "([Ljava/lang/Object;)Z", "", "", "Lkotlin/sequences/m;", "plusAssign", "([Ljava/lang/Object;)V", "clear", "minCapacity", "trim", "capacity", "ensureCapacity", "(Ljava/lang/Object;)V", "minusAssign", "remove", "Lkotlin/Function1;", "Lkotlin/v0;", "name", "predicate", "removeIf", "removeAll", "removeAt", "(I)Ljava/lang/Object;", "start", "end", "removeRange", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "asList", "", "asMutableList", "Landroidx/collection/MutableObjectList$ObjectListMutableList;", "list", "Landroidx/collection/MutableObjectList$ObjectListMutableList;", "getCapacity", "()I", "initialCapacity", "<init>", "(I)V", "MutableObjectListIterator", "ObjectListMutableList", "SubList", "collection"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nObjectList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectList.kt\nandroidx/collection/MutableObjectList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 6 ObjectList.kt\nandroidx/collection/ObjectList\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1618:1\n948#1,2:1641\n948#1,2:1652\n948#1,2:1656\n652#1:1659\n955#1,2:1662\n955#1,2:1669\n955#1,2:1691\n955#1,2:1701\n955#1,2:1704\n955#1,2:1708\n1864#2,3:1619\n1855#2:1651\n1856#2:1654\n1855#2:1703\n1856#2:1706\n267#3,4:1622\n237#3,7:1626\n248#3,3:1634\n251#3,2:1638\n272#3:1640\n273#3:1643\n254#3,6:1644\n274#3:1650\n267#3,4:1672\n237#3,7:1676\n248#3,3:1684\n251#3,2:1688\n272#3:1690\n273#3:1693\n254#3,6:1694\n274#3:1700\n1810#4:1633\n1672#4:1637\n1810#4:1683\n1672#4:1687\n1295#5:1655\n1296#5:1658\n1295#5:1707\n1296#5:1710\n80#6:1660\n305#6,4:1665\n310#6:1671\n75#6:1711\n75#6:1712\n75#6:1713\n75#6:1714\n75#6:1715\n75#6:1716\n75#6:1717\n75#6:1718\n13579#7:1661\n13580#7:1664\n*S KotlinDebug\n*F\n+ 1 ObjectList.kt\nandroidx/collection/MutableObjectList\n*L\n864#1:1641,2\n898#1:1652,2\n907#1:1656,2\n927#1:1659\n1050#1:1662,2\n1059#1:1669,2\n1068#1:1691,2\n1077#1:1701,2\n1086#1:1704,2\n1095#1:1708,2\n740#1:1619,3\n897#1:1651\n897#1:1654\n1085#1:1703\n1085#1:1706\n863#1:1622,4\n863#1:1626,7\n863#1:1634,3\n863#1:1638,2\n863#1:1640\n863#1:1643\n863#1:1644,6\n863#1:1650\n1067#1:1672,4\n1067#1:1676,7\n1067#1:1684,3\n1067#1:1688,2\n1067#1:1690\n1067#1:1693\n1067#1:1694,6\n1067#1:1700\n863#1:1633\n863#1:1637\n1067#1:1683\n1067#1:1687\n906#1:1655\n906#1:1658\n1094#1:1707\n1094#1:1710\n979#1:1660\n1058#1:1665,4\n1058#1:1671\n1105#1:1711\n1109#1:1712\n1159#1:1713\n1175#1:1714\n1191#1:1715\n1207#1:1716\n1223#1:1717\n1242#1:1718\n1049#1:1661\n1049#1:1664\n*E\n"})
/* loaded from: classes.dex */
public final class MutableObjectList<E> extends ObjectList<E> {

    @m
    private ObjectListMutableList<E> list;

    @i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001d\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012\u0012\u0006\u0010\u0017\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\u0010\u0010\u0005\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u000f\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\f\u0010\u0006J\b\u0010\r\u001a\u00020\nH\u0016J\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Landroidx/collection/MutableObjectList$MutableObjectListIterator;", "T", "", "", "hasNext", "next", "()Ljava/lang/Object;", "Lkotlin/r2;", "remove", "hasPrevious", "", "nextIndex", "previous", "previousIndex", "element", "add", "(Ljava/lang/Object;)V", "set", "", "list", "Ljava/util/List;", "prevIndex", "I", "index", "<init>", "(Ljava/util/List;I)V", "collection"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    private static final class MutableObjectListIterator<T> implements ListIterator<T>, f {

        @l
        private final List<T> list;
        private int prevIndex;

        public MutableObjectListIterator(@l List<T> list, int i5) {
            l0.p(list, "list");
            this.list = list;
            this.prevIndex = i5 - 1;
        }

        @Override // java.util.ListIterator
        public void add(T t5) {
            List<T> list = this.list;
            int i5 = this.prevIndex + 1;
            this.prevIndex = i5;
            list.add(i5, t5);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.prevIndex < this.list.size() - 1;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.prevIndex >= 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            List<T> list = this.list;
            int i5 = this.prevIndex + 1;
            this.prevIndex = i5;
            return list.get(i5);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.prevIndex + 1;
        }

        @Override // java.util.ListIterator
        public T previous() {
            List<T> list = this.list;
            int i5 = this.prevIndex;
            this.prevIndex = i5 - 1;
            return list.get(i5);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.prevIndex;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            this.list.remove(this.prevIndex);
            this.prevIndex--;
        }

        @Override // java.util.ListIterator
        public void set(T t5) {
            this.list.set(this.prevIndex, t5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010)\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010+\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0015\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00010$¢\u0006\u0004\b*\u0010+J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J\u0018\u0010\f\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011H\u0096\u0002J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0006J\u001f\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0016J\u001e\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J\u0016\u0010\u0017\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0016J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0019H\u0016J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u00192\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u0006J\u0016\u0010\u001c\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J\u0017\u0010\u001d\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001d\u0010\rJ\u0016\u0010\u001e\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J \u0010\u001f\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\nH\u0016R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00010$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006,"}, d2 = {"Landroidx/collection/MutableObjectList$ObjectListMutableList;", "T", "", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "", "iterator", "lastIndexOf", "add", "Lkotlin/r2;", "(ILjava/lang/Object;)V", "addAll", "clear", "", "listIterator", "remove", "removeAll", "removeAt", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "fromIndex", "toIndex", "subList", "Landroidx/collection/MutableObjectList;", "objectList", "Landroidx/collection/MutableObjectList;", "getSize", "()I", "size", "<init>", "(Landroidx/collection/MutableObjectList;)V", "collection"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class ObjectListMutableList<T> implements List<T>, e {

        @l
        private final MutableObjectList<T> objectList;

        public ObjectListMutableList(@l MutableObjectList<T> objectList) {
            l0.p(objectList, "objectList");
            this.objectList = objectList;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t5) {
            return this.objectList.add(t5);
        }

        @Override // java.util.List
        public boolean addAll(int i5, @l Collection<? extends T> elements) {
            l0.p(elements, "elements");
            return this.objectList.addAll(i5, elements);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.objectList.clear();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            return this.objectList.contains(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(@l Collection<? extends Object> elements) {
            l0.p(elements, "elements");
            return this.objectList.containsAll(elements);
        }

        @Override // java.util.List
        public T get(int i5) {
            ObjectListKt.checkIndex(this, i5);
            return this.objectList.get(i5);
        }

        public int getSize() {
            return this.objectList.getSize();
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            return this.objectList.indexOf(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.objectList.isEmpty();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        @l
        public Iterator<T> iterator() {
            return new MutableObjectListIterator(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            return this.objectList.lastIndexOf(obj);
        }

        @Override // java.util.List
        @l
        public ListIterator<T> listIterator() {
            return new MutableObjectListIterator(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i5) {
            return removeAt(i5);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(@l Collection<? extends Object> elements) {
            l0.p(elements, "elements");
            return this.objectList.removeAll(elements);
        }

        public T removeAt(int i5) {
            ObjectListKt.checkIndex(this, i5);
            return this.objectList.removeAt(i5);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(@l Collection<? extends Object> elements) {
            l0.p(elements, "elements");
            return this.objectList.retainAll((Collection<? extends T>) elements);
        }

        @Override // java.util.List
        public T set(int i5, T t5) {
            ObjectListKt.checkIndex(this, i5);
            return this.objectList.set(i5, t5);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.List
        @l
        public List<T> subList(int i5, int i6) {
            ObjectListKt.checkSubIndex(this, i5, i6);
            return new SubList(this, i5, i6);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return v.a(this);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] array) {
            l0.p(array, "array");
            return (T[]) v.b(this, array);
        }

        @Override // java.util.List
        public void add(int i5, T t5) {
            this.objectList.add(i5, t5);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(@l Collection<? extends T> elements) {
            l0.p(elements, "elements");
            return this.objectList.addAll(elements);
        }

        @Override // java.util.List
        @l
        public ListIterator<T> listIterator(int i5) {
            return new MutableObjectListIterator(this, i5);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            return this.objectList.remove(obj);
        }
    }

    @i0(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010)\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010+\n\u0002\b\u0015\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B%\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010&\u001a\u00020\n\u0012\u0006\u0010(\u001a\u00020\n¢\u0006\u0004\b,\u0010-J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J\u0018\u0010\f\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011H\u0096\u0002J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0006J\u001f\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0016J\u001e\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J\u0016\u0010\u0017\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0016J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0019H\u0016J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u00192\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u0006J\u0016\u0010\u001c\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J\u0017\u0010\u001d\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001d\u0010\rJ\u0016\u0010\u001e\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J \u0010\u001f\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\nH\u0016R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010'R\u0014\u0010+\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006."}, d2 = {"Landroidx/collection/MutableObjectList$SubList;", "T", "", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "", "iterator", "lastIndexOf", "add", "Lkotlin/r2;", "(ILjava/lang/Object;)V", "addAll", "clear", "", "listIterator", "remove", "removeAll", "removeAt", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "fromIndex", "toIndex", "subList", "list", "Ljava/util/List;", "start", "I", "end", "getSize", "()I", "size", "<init>", "(Ljava/util/List;II)V", "collection"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nObjectList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectList.kt\nandroidx/collection/MutableObjectList$SubList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1618:1\n1855#2,2:1619\n1855#2,2:1621\n*S KotlinDebug\n*F\n+ 1 ObjectList.kt\nandroidx/collection/MutableObjectList$SubList\n*L\n1395#1:1619,2\n1477#1:1621,2\n*E\n"})
    /* loaded from: classes.dex */
    private static final class SubList<T> implements List<T>, e {
        private int end;

        @l
        private final List<T> list;
        private final int start;

        public SubList(@l List<T> list, int i5, int i6) {
            l0.p(list, "list");
            this.list = list;
            this.start = i5;
            this.end = i6;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t5) {
            List<T> list = this.list;
            int i5 = this.end;
            this.end = i5 + 1;
            list.add(i5, t5);
            return true;
        }

        @Override // java.util.List
        public boolean addAll(int i5, @l Collection<? extends T> elements) {
            l0.p(elements, "elements");
            this.list.addAll(i5 + this.start, elements);
            this.end += elements.size();
            return elements.size() > 0;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            int i5 = this.end - 1;
            int i6 = this.start;
            if (i6 <= i5) {
                while (true) {
                    this.list.remove(i5);
                    if (i5 == i6) {
                        break;
                    } else {
                        i5--;
                    }
                }
            }
            this.end = this.start;
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            int i5 = this.end;
            for (int i6 = this.start; i6 < i5; i6++) {
                if (l0.g(this.list.get(i6), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(@l Collection<? extends Object> elements) {
            l0.p(elements, "elements");
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public T get(int i5) {
            ObjectListKt.checkIndex(this, i5);
            return this.list.get(i5 + this.start);
        }

        public int getSize() {
            return this.end - this.start;
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            int i5 = this.end;
            for (int i6 = this.start; i6 < i5; i6++) {
                if (l0.g(this.list.get(i6), obj)) {
                    return i6 - this.start;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.end == this.start;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        @l
        public Iterator<T> iterator() {
            return new MutableObjectListIterator(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            int i5 = this.end - 1;
            int i6 = this.start;
            if (i6 <= i5) {
                while (!l0.g(this.list.get(i5), obj)) {
                    if (i5 != i6) {
                        i5--;
                    } else {
                        return -1;
                    }
                }
                return i5 - this.start;
            }
            return -1;
        }

        @Override // java.util.List
        @l
        public ListIterator<T> listIterator() {
            return new MutableObjectListIterator(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i5) {
            return removeAt(i5);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(@l Collection<? extends Object> elements) {
            l0.p(elements, "elements");
            int i5 = this.end;
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            if (i5 != this.end) {
                return true;
            }
            return false;
        }

        public T removeAt(int i5) {
            ObjectListKt.checkIndex(this, i5);
            this.end--;
            return this.list.remove(i5 + this.start);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(@l Collection<? extends Object> elements) {
            l0.p(elements, "elements");
            int i5 = this.end;
            int i6 = i5 - 1;
            int i7 = this.start;
            if (i7 <= i6) {
                while (true) {
                    if (!elements.contains(this.list.get(i6))) {
                        this.list.remove(i6);
                        this.end--;
                    }
                    if (i6 == i7) {
                        break;
                    }
                    i6--;
                }
            }
            if (i5 != this.end) {
                return true;
            }
            return false;
        }

        @Override // java.util.List
        public T set(int i5, T t5) {
            ObjectListKt.checkIndex(this, i5);
            return this.list.set(i5 + this.start, t5);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.List
        @l
        public List<T> subList(int i5, int i6) {
            ObjectListKt.checkSubIndex(this, i5, i6);
            return new SubList(this, i5, i6);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return v.a(this);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] array) {
            l0.p(array, "array");
            return (T[]) v.b(this, array);
        }

        @Override // java.util.List
        public void add(int i5, T t5) {
            this.list.add(i5 + this.start, t5);
            this.end++;
        }

        @Override // java.util.List
        @l
        public ListIterator<T> listIterator(int i5) {
            return new MutableObjectListIterator(this, i5);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            int i5 = this.end;
            for (int i6 = this.start; i6 < i5; i6++) {
                if (l0.g(this.list.get(i6), obj)) {
                    this.list.remove(i6);
                    this.end--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(@l Collection<? extends T> elements) {
            l0.p(elements, "elements");
            this.list.addAll(this.end, elements);
            this.end += elements.size();
            return elements.size() > 0;
        }
    }

    public MutableObjectList() {
        this(0, 1, null);
    }

    public /* synthetic */ MutableObjectList(int i5, int i6, w wVar) {
        this((i6 & 1) != 0 ? 16 : i5);
    }

    public static /* synthetic */ void trim$default(MutableObjectList mutableObjectList, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i5 = mutableObjectList._size;
        }
        mutableObjectList.trim(i5);
    }

    public final boolean add(E e5) {
        ensureCapacity(this._size + 1);
        Object[] objArr = this.content;
        int i5 = this._size;
        objArr[i5] = e5;
        this._size = i5 + 1;
        return true;
    }

    public final boolean addAll(@IntRange(from = 0) int i5, @l E[] elements) {
        l0.p(elements, "elements");
        if (i5 >= 0 && i5 <= this._size) {
            if (elements.length == 0) {
                return false;
            }
            ensureCapacity(this._size + elements.length);
            Object[] objArr = this.content;
            int i6 = this._size;
            if (i5 != i6) {
                kotlin.collections.l.B0(objArr, objArr, elements.length + i5, i5, i6);
            }
            kotlin.collections.l.K0(elements, objArr, i5, 0, 0, 12, null);
            this._size += elements.length;
            return true;
        }
        throw new IndexOutOfBoundsException("Index " + i5 + " must be in 0.." + this._size);
    }

    @Override // androidx.collection.ObjectList
    @l
    public List<E> asList() {
        return asMutableList();
    }

    @l
    public final List<E> asMutableList() {
        ObjectListMutableList<E> objectListMutableList = this.list;
        if (objectListMutableList == null) {
            ObjectListMutableList<E> objectListMutableList2 = new ObjectListMutableList<>(this);
            this.list = objectListMutableList2;
            return objectListMutableList2;
        }
        return objectListMutableList;
    }

    public final void clear() {
        kotlin.collections.l.M1(this.content, null, 0, this._size);
        this._size = 0;
    }

    public final void ensureCapacity(int i5) {
        Object[] objArr = this.content;
        if (objArr.length < i5) {
            Object[] copyOf = Arrays.copyOf(objArr, Math.max(i5, (objArr.length * 3) / 2));
            l0.o(copyOf, "copyOf(this, newSize)");
            this.content = copyOf;
        }
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final void minusAssign(E e5) {
        remove(e5);
    }

    public final void plusAssign(@l ObjectList<E> elements) {
        l0.p(elements, "elements");
        if (elements.isEmpty()) {
            return;
        }
        ensureCapacity(this._size + elements._size);
        kotlin.collections.l.B0(elements.content, this.content, this._size, 0, elements._size);
        this._size += elements._size;
    }

    public final boolean remove(E e5) {
        int indexOf = indexOf(e5);
        if (indexOf >= 0) {
            removeAt(indexOf);
            return true;
        }
        return false;
    }

    public final boolean removeAll(@l E[] elements) {
        l0.p(elements, "elements");
        int i5 = this._size;
        for (E e5 : elements) {
            remove(e5);
        }
        return i5 != this._size;
    }

    public final E removeAt(@IntRange(from = 0) int i5) {
        boolean z4 = false;
        if (i5 >= 0 && i5 < this._size) {
            z4 = true;
        }
        if (z4) {
            Object[] objArr = this.content;
            E e5 = (E) objArr[i5];
            int i6 = this._size;
            if (i5 != i6 - 1) {
                kotlin.collections.l.B0(objArr, objArr, i5, i5 + 1, i6);
            }
            int i7 = this._size - 1;
            this._size = i7;
            objArr[i7] = null;
            return e5;
        }
        throw new IndexOutOfBoundsException("Index " + i5 + " must be in 0.." + (this._size - 1));
    }

    public final void removeIf(@l v3.l<? super E, Boolean> predicate) {
        l0.p(predicate, "predicate");
        int i5 = this._size;
        Object[] objArr = this.content;
        int i6 = 0;
        kotlin.ranges.l W1 = s.W1(0, i5);
        int e5 = W1.e();
        int g5 = W1.g();
        if (e5 <= g5) {
            while (true) {
                objArr[e5 - i6] = objArr[e5];
                if (predicate.invoke(objArr[e5]).booleanValue()) {
                    i6++;
                }
                if (e5 == g5) {
                    break;
                } else {
                    e5++;
                }
            }
        }
        kotlin.collections.l.M1(objArr, null, i5 - i6, i5);
        this._size -= i6;
    }

    public final void removeRange(@IntRange(from = 0) int i5, @IntRange(from = 0) int i6) {
        boolean z4;
        boolean z5 = true;
        if (i5 >= 0 && i5 <= this._size) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (i6 < 0 || i6 > this._size) {
                z5 = false;
            }
            if (z5) {
                if (i6 >= i5) {
                    if (i6 != i5) {
                        int i7 = this._size;
                        if (i6 < i7) {
                            Object[] objArr = this.content;
                            kotlin.collections.l.B0(objArr, objArr, i5, i6, i7);
                        }
                        int i8 = this._size;
                        int i9 = i8 - (i6 - i5);
                        kotlin.collections.l.M1(this.content, null, i9, i8);
                        this._size = i9;
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Start (" + i5 + ") is more than end (" + i6 + ')');
            }
        }
        throw new IndexOutOfBoundsException("Start (" + i5 + ") and end (" + i6 + ") must be in 0.." + this._size);
    }

    public final boolean retainAll(@l E[] elements) {
        l0.p(elements, "elements");
        int i5 = this._size;
        Object[] objArr = this.content;
        for (int i6 = i5 - 1; -1 < i6; i6--) {
            if (kotlin.collections.l.If(elements, objArr[i6]) < 0) {
                removeAt(i6);
            }
        }
        return i5 != this._size;
    }

    public final E set(@IntRange(from = 0) int i5, E e5) {
        boolean z4 = false;
        if (i5 >= 0 && i5 < this._size) {
            z4 = true;
        }
        if (z4) {
            Object[] objArr = this.content;
            E e6 = (E) objArr[i5];
            objArr[i5] = e5;
            return e6;
        }
        throw new IndexOutOfBoundsException("set index " + i5 + " must be between 0 .. " + (this._size - 1));
    }

    public final void trim(int i5) {
        int max = Math.max(i5, this._size);
        Object[] objArr = this.content;
        if (objArr.length > max) {
            Object[] copyOf = Arrays.copyOf(objArr, max);
            l0.o(copyOf, "copyOf(this, newSize)");
            this.content = copyOf;
        }
    }

    public MutableObjectList(int i5) {
        super(i5, null);
    }

    public final void minusAssign(@l List<? extends E> elements) {
        l0.p(elements, "elements");
        int size = elements.size();
        for (int i5 = 0; i5 < size; i5++) {
            remove(elements.get(i5));
        }
    }

    public final void add(@IntRange(from = 0) int i5, E e5) {
        boolean z4 = false;
        if (i5 >= 0 && i5 <= this._size) {
            z4 = true;
        }
        if (z4) {
            ensureCapacity(this._size + 1);
            Object[] objArr = this.content;
            int i6 = this._size;
            if (i5 != i6) {
                kotlin.collections.l.B0(objArr, objArr, i5 + 1, i5, i6);
            }
            objArr[i5] = e5;
            this._size++;
            return;
        }
        throw new IndexOutOfBoundsException("Index " + i5 + " must be in 0.." + this._size);
    }

    public final void minusAssign(@l E[] elements) {
        l0.p(elements, "elements");
        for (E e5 : elements) {
            remove(e5);
        }
    }

    public final boolean removeAll(@l ObjectList<E> elements) {
        l0.p(elements, "elements");
        int i5 = this._size;
        minusAssign((ObjectList) elements);
        return i5 != this._size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(@l ObjectList<E> elements) {
        l0.p(elements, "elements");
        Object[] objArr = elements.content;
        int i5 = elements._size;
        for (int i6 = 0; i6 < i5; i6++) {
            remove(objArr[i6]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean retainAll(@l ObjectList<E> elements) {
        l0.p(elements, "elements");
        int i5 = this._size;
        Object[] objArr = this.content;
        for (int i6 = i5 - 1; -1 < i6; i6--) {
            if (!elements.contains(objArr[i6])) {
                removeAt(i6);
            }
        }
        return i5 != this._size;
    }

    public final boolean removeAll(@l ScatterSet<E> elements) {
        l0.p(elements, "elements");
        int i5 = this._size;
        minusAssign((ScatterSet) elements);
        return i5 != this._size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(@l ScatterSet<E> elements) {
        l0.p(elements, "elements");
        if (elements.isEmpty()) {
            return;
        }
        ensureCapacity(this._size + elements.getSize());
        Object[] objArr = elements.elements;
        long[] jArr = elements.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            long j5 = jArr[i5];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i6 = 8 - ((~(i5 - length)) >>> 31);
                for (int i7 = 0; i7 < i6; i7++) {
                    if ((255 & j5) < 128) {
                        add(objArr[(i5 << 3) + i7]);
                    }
                    j5 >>= 8;
                }
                if (i6 != 8) {
                    return;
                }
            }
            if (i5 == length) {
                return;
            } else {
                i5++;
            }
        }
    }

    public final boolean addAll(@IntRange(from = 0) int i5, @l Collection<? extends E> elements) {
        l0.p(elements, "elements");
        int i6 = 0;
        if (i5 >= 0 && i5 <= this._size) {
            if (elements.isEmpty()) {
                return false;
            }
            ensureCapacity(this._size + elements.size());
            Object[] objArr = this.content;
            if (i5 != this._size) {
                kotlin.collections.l.B0(objArr, objArr, elements.size() + i5, i5, this._size);
            }
            for (Object obj : elements) {
                int i7 = i6 + 1;
                if (i6 < 0) {
                    u.W();
                }
                objArr[i6 + i5] = obj;
                i6 = i7;
            }
            this._size += elements.size();
            return true;
        }
        throw new IndexOutOfBoundsException("Index " + i5 + " must be in 0.." + this._size);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(@l ScatterSet<E> elements) {
        l0.p(elements, "elements");
        Object[] objArr = elements.elements;
        long[] jArr = elements.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            long j5 = jArr[i5];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i6 = 8 - ((~(i5 - length)) >>> 31);
                for (int i7 = 0; i7 < i6; i7++) {
                    if ((255 & j5) < 128) {
                        remove(objArr[(i5 << 3) + i7]);
                    }
                    j5 >>= 8;
                }
                if (i6 != 8) {
                    return;
                }
            }
            if (i5 == length) {
                return;
            } else {
                i5++;
            }
        }
    }

    public final boolean removeAll(@l List<? extends E> elements) {
        l0.p(elements, "elements");
        int i5 = this._size;
        minusAssign((List) elements);
        return i5 != this._size;
    }

    public final boolean retainAll(@l Collection<? extends E> elements) {
        l0.p(elements, "elements");
        int i5 = this._size;
        Object[] objArr = this.content;
        for (int i6 = i5 - 1; -1 < i6; i6--) {
            if (!elements.contains(objArr[i6])) {
                removeAt(i6);
            }
        }
        return i5 != this._size;
    }

    public final boolean removeAll(@l Iterable<? extends E> elements) {
        l0.p(elements, "elements");
        int i5 = this._size;
        minusAssign((Iterable) elements);
        return i5 != this._size;
    }

    public final void minusAssign(@l Iterable<? extends E> elements) {
        l0.p(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final void plusAssign(@l E[] elements) {
        l0.p(elements, "elements");
        if (elements.length == 0) {
            return;
        }
        ensureCapacity(this._size + elements.length);
        kotlin.collections.l.K0(elements, this.content, this._size, 0, 0, 12, null);
        this._size += elements.length;
    }

    public final boolean removeAll(@l kotlin.sequences.m<? extends E> elements) {
        l0.p(elements, "elements");
        int i5 = this._size;
        minusAssign((kotlin.sequences.m) elements);
        return i5 != this._size;
    }

    public final void minusAssign(@l kotlin.sequences.m<? extends E> elements) {
        l0.p(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final boolean retainAll(@l Iterable<? extends E> elements) {
        l0.p(elements, "elements");
        int i5 = this._size;
        Object[] objArr = this.content;
        for (int i6 = i5 - 1; -1 < i6; i6--) {
            if (!u.T1(elements, objArr[i6])) {
                removeAt(i6);
            }
        }
        return i5 != this._size;
    }

    public final void plusAssign(@l List<? extends E> elements) {
        l0.p(elements, "elements");
        if (elements.isEmpty()) {
            return;
        }
        int i5 = this._size;
        ensureCapacity(elements.size() + i5);
        Object[] objArr = this.content;
        int size = elements.size();
        for (int i6 = 0; i6 < size; i6++) {
            objArr[i6 + i5] = elements.get(i6);
        }
        this._size += elements.size();
    }

    public final boolean addAll(@IntRange(from = 0) int i5, @l ObjectList<E> elements) {
        l0.p(elements, "elements");
        if (i5 >= 0 && i5 <= this._size) {
            if (elements.isEmpty()) {
                return false;
            }
            ensureCapacity(this._size + elements._size);
            Object[] objArr = this.content;
            int i6 = this._size;
            if (i5 != i6) {
                kotlin.collections.l.B0(objArr, objArr, elements._size + i5, i5, i6);
            }
            kotlin.collections.l.B0(elements.content, objArr, i5, 0, elements._size);
            this._size += elements._size;
            return true;
        }
        throw new IndexOutOfBoundsException("Index " + i5 + " must be in 0.." + this._size);
    }

    public final boolean retainAll(@l kotlin.sequences.m<? extends E> elements) {
        l0.p(elements, "elements");
        int i5 = this._size;
        Object[] objArr = this.content;
        for (int i6 = i5 - 1; -1 < i6; i6--) {
            if (!p.f0(elements, objArr[i6])) {
                removeAt(i6);
            }
        }
        return i5 != this._size;
    }

    public final void plusAssign(E e5) {
        add(e5);
    }

    public final void plusAssign(@l Iterable<? extends E> elements) {
        l0.p(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    public final void plusAssign(@l kotlin.sequences.m<? extends E> elements) {
        l0.p(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    public final boolean addAll(@l ObjectList<E> elements) {
        l0.p(elements, "elements");
        int i5 = this._size;
        plusAssign((ObjectList) elements);
        return i5 != this._size;
    }

    public final boolean addAll(@l ScatterSet<E> elements) {
        l0.p(elements, "elements");
        int i5 = this._size;
        plusAssign((ScatterSet) elements);
        return i5 != this._size;
    }

    public final boolean addAll(@l E[] elements) {
        l0.p(elements, "elements");
        int i5 = this._size;
        plusAssign((Object[]) elements);
        return i5 != this._size;
    }

    public final boolean addAll(@l List<? extends E> elements) {
        l0.p(elements, "elements");
        int i5 = this._size;
        plusAssign((List) elements);
        return i5 != this._size;
    }

    public final boolean addAll(@l Iterable<? extends E> elements) {
        l0.p(elements, "elements");
        int i5 = this._size;
        plusAssign((Iterable) elements);
        return i5 != this._size;
    }

    public final boolean addAll(@l kotlin.sequences.m<? extends E> elements) {
        l0.p(elements, "elements");
        int i5 = this._size;
        plusAssign((kotlin.sequences.m) elements);
        return i5 != this._size;
    }
}
