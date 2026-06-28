package androidx.collection;

import androidx.annotation.IntRange;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.a1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import kotlin.ranges.u;
import p4.l;
import p4.m;
import u3.e;
import u3.i;
import v3.p;
import v3.q;

@i0(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0011\b\u0004\u0012\u0006\u0010Z\u001a\u00020\u0014¢\u0006\u0004\b[\u0010\\J\u0006\u0010\u0004\u001a\u00020\u0003J\u0006\u0010\u0005\u001a\u00020\u0003J:\u0010\u0005\u001a\u00020\u00032!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00030\u0006H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J:\u0010\u000b\u001a\u00020\u00032!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00030\u0006H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010\u0010\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012J\u0014\u0010\u0010\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013J\u0014\u0010\u0010\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\u0006\u0010\u0015\u001a\u00020\u0014J:\u0010\u0015\u001a\u00020\u00142!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00030\u0006H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\r\u0010\u0016\u001a\u00028\u0000¢\u0006\u0004\b\u0016\u0010\u0017JA\u0010\u0016\u001a\u00028\u00002!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00030\u0006H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0016\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00018\u0000H\u0086\b¢\u0006\u0004\b\u0019\u0010\u0017JC\u0010\u0019\u001a\u0004\u0018\u00018\u00002!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00030\u0006H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0019\u0010\u0018Jd\u0010\u001f\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u001a2\u0006\u0010\u001b\u001a\u00028\u000126\u0010\u001e\u001a2\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00010\u001cH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b\u001f\u0010 Jy\u0010#\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u001a2\u0006\u0010\u001b\u001a\u00028\u00012K\u0010\u001e\u001aG\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\"\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00010!H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b#\u0010$Jd\u0010%\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u001a2\u0006\u0010\u001b\u001a\u00028\u000126\u0010\u001e\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00028\u00010\u001cH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b%\u0010 Jy\u0010&\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u001a2\u0006\u0010\u001b\u001a\u00028\u00012K\u0010\u001e\u001aG\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\"\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00028\u00010!H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b&\u0010$J:\u0010)\u001a\u00020'2!\u0010(\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020'0\u0006H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001JO\u0010*\u001a\u00020'26\u0010(\u001a2\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\"\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020'0\u001cH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J:\u0010+\u001a\u00020'2!\u0010(\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020'0\u0006H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001JO\u0010,\u001a\u00020'26\u0010(\u001a2\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\"\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020'0\u001cH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u001a\u0010-\u001a\u00028\u00002\b\b\u0001\u0010\"\u001a\u00020\u0014H\u0086\u0002¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00028\u00002\b\b\u0001\u0010\"\u001a\u00020\u0014¢\u0006\u0004\b/\u0010.J@\u00101\u001a\u00028\u00002\b\b\u0001\u0010\"\u001a\u00020\u00142!\u00100\u001a\u001d\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00028\u00000\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b1\u00102J\u0015\u00103\u001a\u00020\u00142\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b3\u00104J:\u00105\u001a\u00020\u00142!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00030\u0006H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J:\u00106\u001a\u00020\u00142!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00030\u0006H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0006\u00107\u001a\u00020\u0003J\u0006\u00108\u001a\u00020\u0003J\r\u00109\u001a\u00028\u0000¢\u0006\u0004\b9\u0010\u0017JA\u00109\u001a\u00028\u00002!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00030\u0006H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b9\u0010\u0018J\u0012\u0010:\u001a\u0004\u0018\u00018\u0000H\u0086\b¢\u0006\u0004\b:\u0010\u0017JC\u0010:\u001a\u0004\u0018\u00018\u00002!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00030\u0006H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b:\u0010\u0018J\u0015\u0010;\u001a\u00020\u00142\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b;\u00104JR\u0010D\u001a\u00020C2\b\b\u0002\u0010=\u001a\u00020<2\b\b\u0002\u0010>\u001a\u00020<2\b\b\u0002\u0010?\u001a\u00020<2\b\b\u0002\u0010@\u001a\u00020\u00142\b\b\u0002\u0010A\u001a\u00020<2\u0016\b\u0002\u0010B\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020<\u0018\u00010\u0006H\u0007J\u000e\u0010E\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H&J\b\u0010F\u001a\u00020\u0014H\u0016J\u0013\u0010H\u001a\u00020\u00032\b\u0010G\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010I\u001a\u00020CH\u0016R$\u0010J\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000e8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bJ\u0010K\u0012\u0004\bL\u0010MR\u001c\u0010N\u001a\u00020\u00148\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bN\u0010O\u0012\u0004\bP\u0010MR\u0011\u0010S\u001a\u00020\u00148G¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0012\u0010U\u001a\u00020\u00148Ç\u0002¢\u0006\u0006\u001a\u0004\bT\u0010RR\u0012\u0010Y\u001a\u00020V8Æ\u0002¢\u0006\u0006\u001a\u0004\bW\u0010X\u0082\u0001\u0001]\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006^"}, d2 = {"Landroidx/collection/ObjectList;", "E", "", "", "none", "any", "Lkotlin/Function1;", "Lkotlin/v0;", "name", "element", "predicate", "reversedAny", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "([Ljava/lang/Object;)Z", "", "", "", "count", "first", "()Ljava/lang/Object;", "(Lv3/l;)Ljava/lang/Object;", "firstOrNull", "R", "initial", "Lkotlin/Function2;", "acc", "operation", "fold", "(Ljava/lang/Object;Lv3/p;)Ljava/lang/Object;", "Lkotlin/Function3;", "index", "foldIndexed", "(Ljava/lang/Object;Lv3/q;)Ljava/lang/Object;", "foldRight", "foldRightIndexed", "Lkotlin/r2;", "block", "forEach", "forEachIndexed", "forEachReversed", "forEachReversedIndexed", "get", "(I)Ljava/lang/Object;", "elementAt", "defaultValue", "elementAtOrElse", "(ILv3/l;)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "indexOfFirst", "indexOfLast", "isEmpty", "isNotEmpty", "last", "lastOrNull", "lastIndexOf", "", "separator", "prefix", "postfix", "limit", "truncated", "transform", "", "joinToString", "asList", TTDownloadField.TT_HASHCODE, "other", "equals", "toString", "content", "[Ljava/lang/Object;", "getContent$annotations", "()V", "_size", "I", "get_size$annotations", "getSize", "()I", "size", "getLastIndex", "lastIndex", "Lkotlin/ranges/l;", "getIndices", "()Lkotlin/ranges/l;", "indices", "initialCapacity", "<init>", "(I)V", "Landroidx/collection/MutableObjectList;", "collection"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nObjectList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectList.kt\nandroidx/collection/ObjectList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1618:1\n305#1,6:1619\n331#1,6:1625\n305#1,6:1633\n305#1,6:1639\n305#1,6:1645\n305#1,6:1651\n305#1,6:1657\n318#1,6:1663\n331#1,6:1669\n345#1,6:1675\n75#1:1681\n75#1:1682\n318#1,6:1683\n318#1,6:1689\n318#1,6:1695\n345#1,6:1701\n75#1:1707\n331#1,6:1708\n75#1:1714\n331#1,6:1715\n345#1,6:1721\n345#1,6:1727\n318#1,6:1733\n305#1,6:1739\n80#1:1745\n1855#2,2:1631\n*S KotlinDebug\n*F\n+ 1 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n101#1:1619,6\n115#1:1625,6\n168#1:1633,6\n186#1:1639,6\n209#1:1645,6\n227#1:1651,6\n244#1:1657,6\n260#1:1663,6\n277#1:1669,6\n293#1:1675,6\n358#1:1681\n369#1:1682\n399#1:1683,6\n405#1:1689,6\n421#1:1695,6\n435#1:1701,6\n461#1:1707\n472#1:1708,6\n483#1:1714\n492#1:1715,6\n509#1:1721,6\n515#1:1727,6\n545#1:1733,6\n576#1:1739,6\n592#1:1745\n157#1:1631,2\n*E\n"})
/* loaded from: classes.dex */
public abstract class ObjectList<E> {

    @e
    public int _size;

    @l
    @e
    public Object[] content;

    private ObjectList(int i5) {
        Object[] objArr;
        if (i5 == 0) {
            objArr = ObjectListKt.EmptyArray;
        } else {
            objArr = new Object[i5];
        }
        this.content = objArr;
    }

    public /* synthetic */ ObjectList(int i5, w wVar) {
        this(i5);
    }

    @a1
    public static /* synthetic */ void getContent$annotations() {
    }

    @a1
    public static /* synthetic */ void get_size$annotations() {
    }

    public static /* synthetic */ String joinToString$default(ObjectList objectList, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i5, CharSequence charSequence4, v3.l lVar, int i6, Object obj) {
        CharSequence charSequence5;
        if (obj == null) {
            if ((i6 & 1) != 0) {
                charSequence = ", ";
            }
            CharSequence charSequence6 = "";
            if ((i6 & 2) != 0) {
                charSequence5 = "";
            } else {
                charSequence5 = charSequence2;
            }
            if ((i6 & 4) == 0) {
                charSequence6 = charSequence3;
            }
            if ((i6 & 8) != 0) {
                i5 = -1;
            }
            int i7 = i5;
            if ((i6 & 16) != 0) {
                charSequence4 = "...";
            }
            CharSequence charSequence7 = charSequence4;
            if ((i6 & 32) != 0) {
                lVar = null;
            }
            return objectList.joinToString(charSequence, charSequence5, charSequence6, i7, charSequence7, lVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final boolean any() {
        return isNotEmpty();
    }

    @l
    public abstract List<E> asList();

    public final boolean contains(E e5) {
        return indexOf(e5) >= 0;
    }

    public final boolean containsAll(@l E[] elements) {
        l0.p(elements, "elements");
        for (E e5 : elements) {
            if (!contains(e5)) {
                return false;
            }
        }
        return true;
    }

    public final int count() {
        return this._size;
    }

    public final E elementAt(@IntRange(from = 0) int i5) {
        boolean z4 = false;
        if (i5 >= 0 && i5 < this._size) {
            z4 = true;
        }
        if (z4) {
            return (E) this.content[i5];
        }
        throw new IndexOutOfBoundsException("Index " + i5 + " must be in 0.." + (this._size - 1));
    }

    public final E elementAtOrElse(@IntRange(from = 0) int i5, @l v3.l<? super Integer, ? extends E> defaultValue) {
        l0.p(defaultValue, "defaultValue");
        boolean z4 = false;
        if (i5 >= 0 && i5 < this._size) {
            z4 = true;
        }
        if (!z4) {
            return defaultValue.invoke(Integer.valueOf(i5));
        }
        return (E) this.content[i5];
    }

    public boolean equals(@m Object obj) {
        kotlin.ranges.l W1;
        if (obj instanceof ObjectList) {
            ObjectList objectList = (ObjectList) obj;
            int i5 = objectList._size;
            int i6 = this._size;
            if (i5 == i6) {
                Object[] objArr = this.content;
                Object[] objArr2 = objectList.content;
                W1 = u.W1(0, i6);
                int e5 = W1.e();
                int g5 = W1.g();
                if (e5 <= g5) {
                    while (l0.g(objArr[e5], objArr2[e5])) {
                        if (e5 != g5) {
                            e5++;
                        } else {
                            return true;
                        }
                    }
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final E first() {
        if (!isEmpty()) {
            return (E) this.content[0];
        }
        throw new NoSuchElementException("ObjectList is empty.");
    }

    @m
    public final E firstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return get(0);
    }

    public final <R> R fold(R r5, @l p<? super R, ? super E, ? extends R> operation) {
        l0.p(operation, "operation");
        Object[] objArr = this.content;
        int i5 = this._size;
        for (int i6 = 0; i6 < i5; i6++) {
            r5 = operation.invoke(r5, objArr[i6]);
        }
        return r5;
    }

    public final <R> R foldIndexed(R r5, @l q<? super Integer, ? super R, ? super E, ? extends R> operation) {
        l0.p(operation, "operation");
        Object[] objArr = this.content;
        int i5 = this._size;
        for (int i6 = 0; i6 < i5; i6++) {
            r5 = operation.invoke(Integer.valueOf(i6), r5, objArr[i6]);
        }
        return r5;
    }

    public final <R> R foldRight(R r5, @l p<? super E, ? super R, ? extends R> operation) {
        l0.p(operation, "operation");
        Object[] objArr = this.content;
        int i5 = this._size;
        while (true) {
            i5--;
            if (-1 >= i5) {
                return r5;
            }
            r5 = operation.invoke(objArr[i5], r5);
        }
    }

    public final <R> R foldRightIndexed(R r5, @l q<? super Integer, ? super E, ? super R, ? extends R> operation) {
        l0.p(operation, "operation");
        Object[] objArr = this.content;
        int i5 = this._size;
        while (true) {
            i5--;
            if (-1 >= i5) {
                return r5;
            }
            r5 = operation.invoke(Integer.valueOf(i5), objArr[i5], r5);
        }
    }

    public final void forEach(@l v3.l<? super E, r2> block) {
        l0.p(block, "block");
        Object[] objArr = this.content;
        int i5 = this._size;
        for (int i6 = 0; i6 < i5; i6++) {
            block.invoke(objArr[i6]);
        }
    }

    public final void forEachIndexed(@l p<? super Integer, ? super E, r2> block) {
        l0.p(block, "block");
        Object[] objArr = this.content;
        int i5 = this._size;
        for (int i6 = 0; i6 < i5; i6++) {
            block.invoke(Integer.valueOf(i6), objArr[i6]);
        }
    }

    public final void forEachReversed(@l v3.l<? super E, r2> block) {
        l0.p(block, "block");
        Object[] objArr = this.content;
        int i5 = this._size;
        while (true) {
            i5--;
            if (-1 < i5) {
                block.invoke(objArr[i5]);
            } else {
                return;
            }
        }
    }

    public final void forEachReversedIndexed(@l p<? super Integer, ? super E, r2> block) {
        l0.p(block, "block");
        Object[] objArr = this.content;
        int i5 = this._size;
        while (true) {
            i5--;
            if (-1 < i5) {
                block.invoke(Integer.valueOf(i5), objArr[i5]);
            } else {
                return;
            }
        }
    }

    public final E get(@IntRange(from = 0) int i5) {
        boolean z4 = false;
        if (i5 >= 0 && i5 < this._size) {
            z4 = true;
        }
        if (z4) {
            return (E) this.content[i5];
        }
        throw new IndexOutOfBoundsException("Index " + i5 + " must be in 0.." + (this._size - 1));
    }

    @l
    public final kotlin.ranges.l getIndices() {
        kotlin.ranges.l W1;
        W1 = u.W1(0, this._size);
        return W1;
    }

    @IntRange(from = -1)
    public final int getLastIndex() {
        return this._size - 1;
    }

    @IntRange(from = 0)
    public final int getSize() {
        return this._size;
    }

    public int hashCode() {
        int i5;
        Object[] objArr = this.content;
        int i6 = this._size;
        int i7 = 0;
        for (int i8 = 0; i8 < i6; i8++) {
            Object obj = objArr[i8];
            if (obj != null) {
                i5 = obj.hashCode();
            } else {
                i5 = 0;
            }
            i7 += i5 * 31;
        }
        return i7;
    }

    public final int indexOf(E e5) {
        int i5 = 0;
        if (e5 == null) {
            Object[] objArr = this.content;
            int i6 = this._size;
            while (i5 < i6) {
                if (objArr[i5] == null) {
                    return i5;
                }
                i5++;
            }
            return -1;
        }
        Object[] objArr2 = this.content;
        int i7 = this._size;
        while (i5 < i7) {
            if (e5.equals(objArr2[i5])) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    public final int indexOfFirst(@l v3.l<? super E, Boolean> predicate) {
        l0.p(predicate, "predicate");
        Object[] objArr = this.content;
        int i5 = this._size;
        for (int i6 = 0; i6 < i5; i6++) {
            if (predicate.invoke(objArr[i6]).booleanValue()) {
                return i6;
            }
        }
        return -1;
    }

    public final int indexOfLast(@l v3.l<? super E, Boolean> predicate) {
        l0.p(predicate, "predicate");
        Object[] objArr = this.content;
        int i5 = this._size;
        do {
            i5--;
            if (-1 >= i5) {
                return -1;
            }
        } while (!predicate.invoke(objArr[i5]).booleanValue());
        return i5;
    }

    public final boolean isEmpty() {
        return this._size == 0;
    }

    public final boolean isNotEmpty() {
        return this._size != 0;
    }

    @l
    @i
    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, null, 63, null);
    }

    @l
    @i
    public final String joinToString(@l CharSequence separator) {
        l0.p(separator, "separator");
        return joinToString$default(this, separator, null, null, 0, null, null, 62, null);
    }

    @l
    @i
    public final String joinToString(@l CharSequence separator, @l CharSequence prefix) {
        l0.p(separator, "separator");
        l0.p(prefix, "prefix");
        return joinToString$default(this, separator, prefix, null, 0, null, null, 60, null);
    }

    @l
    @i
    public final String joinToString(@l CharSequence separator, @l CharSequence prefix, @l CharSequence postfix) {
        l0.p(separator, "separator");
        l0.p(prefix, "prefix");
        l0.p(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, 0, null, null, 56, null);
    }

    @l
    @i
    public final String joinToString(@l CharSequence separator, @l CharSequence prefix, @l CharSequence postfix, int i5) {
        l0.p(separator, "separator");
        l0.p(prefix, "prefix");
        l0.p(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, i5, null, null, 48, null);
    }

    @l
    @i
    public final String joinToString(@l CharSequence separator, @l CharSequence prefix, @l CharSequence postfix, int i5, @l CharSequence truncated) {
        l0.p(separator, "separator");
        l0.p(prefix, "prefix");
        l0.p(postfix, "postfix");
        l0.p(truncated, "truncated");
        return joinToString$default(this, separator, prefix, postfix, i5, truncated, null, 32, null);
    }

    @l
    @i
    public final String joinToString(@l CharSequence separator, @l CharSequence prefix, @l CharSequence postfix, int i5, @l CharSequence truncated, @m v3.l<? super E, ? extends CharSequence> lVar) {
        l0.p(separator, "separator");
        l0.p(prefix, "prefix");
        l0.p(postfix, "postfix");
        l0.p(truncated, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        Object[] objArr = this.content;
        int i6 = this._size;
        int i7 = 0;
        while (true) {
            if (i7 < i6) {
                Object obj = objArr[i7];
                if (i7 == i5) {
                    sb.append(truncated);
                    break;
                }
                if (i7 != 0) {
                    sb.append(separator);
                }
                if (lVar == null) {
                    sb.append(obj);
                } else {
                    sb.append(lVar.invoke(obj));
                }
                i7++;
            } else {
                sb.append(postfix);
                break;
            }
        }
        String sb2 = sb.toString();
        l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final E last() {
        if (!isEmpty()) {
            return (E) this.content[this._size - 1];
        }
        throw new NoSuchElementException("ObjectList is empty.");
    }

    public final int lastIndexOf(E e5) {
        if (e5 == null) {
            Object[] objArr = this.content;
            for (int i5 = this._size - 1; -1 < i5; i5--) {
                if (objArr[i5] == null) {
                    return i5;
                }
            }
        } else {
            Object[] objArr2 = this.content;
            for (int i6 = this._size - 1; -1 < i6; i6--) {
                if (e5.equals(objArr2[i6])) {
                    return i6;
                }
            }
        }
        return -1;
    }

    @m
    public final E lastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.content[this._size - 1];
    }

    public final boolean none() {
        return isEmpty();
    }

    public final boolean reversedAny(@l v3.l<? super E, Boolean> predicate) {
        l0.p(predicate, "predicate");
        Object[] objArr = this.content;
        for (int i5 = this._size - 1; -1 < i5; i5--) {
            if (predicate.invoke(objArr[i5]).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @l
    public String toString() {
        return joinToString$default(this, null, "[", "]", 0, null, new ObjectList$toString$1(this), 25, null);
    }

    public final boolean any(@l v3.l<? super E, Boolean> predicate) {
        l0.p(predicate, "predicate");
        Object[] objArr = this.content;
        int i5 = this._size;
        for (int i6 = 0; i6 < i5; i6++) {
            if (predicate.invoke(objArr[i6]).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final int count(@l v3.l<? super E, Boolean> predicate) {
        l0.p(predicate, "predicate");
        Object[] objArr = this.content;
        int i5 = this._size;
        int i6 = 0;
        for (int i7 = 0; i7 < i5; i7++) {
            if (predicate.invoke(objArr[i7]).booleanValue()) {
                i6++;
            }
        }
        return i6;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [E, java.lang.Object] */
    @m
    public final E firstOrNull(@l v3.l<? super E, Boolean> predicate) {
        l0.p(predicate, "predicate");
        Object[] objArr = this.content;
        int i5 = this._size;
        for (int i6 = 0; i6 < i5; i6++) {
            ?? r32 = (Object) objArr[i6];
            if (predicate.invoke(r32).booleanValue()) {
                return r32;
            }
        }
        return null;
    }

    public final boolean containsAll(@l List<? extends E> elements) {
        l0.p(elements, "elements");
        int size = elements.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (!contains(elements.get(i5))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [E, java.lang.Object] */
    @m
    public final E lastOrNull(@l v3.l<? super E, Boolean> predicate) {
        ?? r22;
        l0.p(predicate, "predicate");
        Object[] objArr = this.content;
        int i5 = this._size;
        do {
            i5--;
            if (-1 >= i5) {
                return null;
            }
            r22 = (Object) objArr[i5];
        } while (!predicate.invoke(r22).booleanValue());
        return r22;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [E, java.lang.Object] */
    public final E first(@l v3.l<? super E, Boolean> predicate) {
        l0.p(predicate, "predicate");
        Object[] objArr = this.content;
        int i5 = this._size;
        for (int i6 = 0; i6 < i5; i6++) {
            ?? r32 = (Object) objArr[i6];
            if (predicate.invoke(r32).booleanValue()) {
                return r32;
            }
        }
        throw new NoSuchElementException("ObjectList contains no element matching the predicate.");
    }

    public final boolean containsAll(@l Iterable<? extends E> elements) {
        l0.p(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [E, java.lang.Object] */
    public final E last(@l v3.l<? super E, Boolean> predicate) {
        ?? r22;
        l0.p(predicate, "predicate");
        Object[] objArr = this.content;
        int i5 = this._size;
        do {
            i5--;
            if (-1 < i5) {
                r22 = (Object) objArr[i5];
            } else {
                throw new NoSuchElementException("ObjectList contains no element matching the predicate.");
            }
        } while (!predicate.invoke(r22).booleanValue());
        return r22;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean containsAll(@l ObjectList<E> elements) {
        l0.p(elements, "elements");
        Object[] objArr = elements.content;
        int i5 = elements._size;
        for (int i6 = 0; i6 < i5; i6++) {
            if (!contains(objArr[i6])) {
                return false;
            }
        }
        return true;
    }
}
