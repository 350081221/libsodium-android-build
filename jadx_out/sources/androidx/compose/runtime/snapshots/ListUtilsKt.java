package androidx.compose.runtime.snapshots;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.m;
import v3.l;
import v3.p;

@i0(d1 = {"\u0000T\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a8\u0010\u0005\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000\u001a>\u0010\n\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\bH\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001aD\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a8\u0010\u0010\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\u0002H\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a8\u0010\u0011\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\u0002H\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001aP\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u0014\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001ab\u0010\u001d\u001a\u00020\u001c\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00162\b\b\u0002\u0010\u001a\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\u00162\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0002H\u0000\u001a\u007f\u0010\"\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\f\b\u0001\u0010 *\u00060\u001ej\u0002`\u001f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010!\u001a\u00028\u00012\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00162\b\b\u0002\u0010\u001a\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\u00162\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\"\u0010#\u001a;\u0010%\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u00060\u001ej\u0002`\u001f2\u0006\u0010$\u001a\u00028\u00002\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0002H\u0002¢\u0006\u0004\b%\u0010&\u001aF\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0002H\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001aS\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012'\u0010\u000f\u001a#\u0012\u0013\u0012\u00110\t¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\bH\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¨\u0006,"}, d2 = {"T", "", "Lkotlin/Function1;", "Lkotlin/r2;", "action", "fastForEach", "", "fastToSet", "Lkotlin/Function2;", "", "fastForEachIndexed", "R", "transform", "fastMap", "", "predicate", "fastAny", "fastAll", "K", "keySelector", "", "fastGroupBy", "", "separator", "prefix", "postfix", "limit", "truncated", "", "fastJoinToString", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "A", "buffer", "fastJoinTo", "(Ljava/util/List;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lv3/l;)Ljava/lang/Appendable;", "element", "appendElement", "(Ljava/lang/Appendable;Ljava/lang/Object;Lv3/l;)V", "fastMapNotNull", "Lkotlin/v0;", "name", "index", "fastFilterIndexed", "runtime_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nListUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,238:1\n33#1,6:239\n33#1,6:245\n33#1,6:251\n33#1,6:257\n33#1,4:263\n38#1:274\n33#1,4:275\n38#1:280\n64#1,6:281\n361#2,7:267\n1#3:279\n*S KotlinDebug\n*F\n+ 1 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n50#1:239,6\n84#1:245,6\n94#1:251,6\n111#1:257,6\n122#1:263,4\n122#1:274\n213#1:275,4\n213#1:280\n233#1:281,6\n124#1:267,7\n*E\n"})
/* loaded from: classes.dex */
public final class ListUtilsKt {
    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> void appendElement(Appendable appendable, T t5, l<? super T, ? extends CharSequence> lVar) {
        boolean z4;
        if (lVar != null) {
            appendable.append(lVar.invoke(t5));
            return;
        }
        if (t5 == 0) {
            z4 = true;
        } else {
            z4 = t5 instanceof CharSequence;
        }
        if (z4) {
            appendable.append((CharSequence) t5);
        } else if (t5 instanceof Character) {
            appendable.append(((Character) t5).charValue());
        } else {
            appendable.append(String.valueOf(t5));
        }
    }

    public static final <T> boolean fastAll(@p4.l List<? extends T> list, @p4.l l<? super T, Boolean> lVar) {
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (!lVar.invoke(list.get(i5)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> boolean fastAny(@p4.l List<? extends T> list, @p4.l l<? super T, Boolean> lVar) {
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (lVar.invoke(list.get(i5)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @p4.l
    public static final <T> List<T> fastFilterIndexed(@p4.l List<? extends T> list, @p4.l p<? super Integer, ? super T, Boolean> pVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            T t5 = list.get(i5);
            if (pVar.invoke(Integer.valueOf(i5), t5).booleanValue()) {
                arrayList.add(t5);
            }
        }
        return arrayList;
    }

    public static final <T> void fastForEach(@p4.l List<? extends T> list, @p4.l l<? super T, r2> lVar) {
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            lVar.invoke(list.get(i5));
        }
    }

    public static final <T> void fastForEachIndexed(@p4.l List<? extends T> list, @p4.l p<? super Integer, ? super T, r2> pVar) {
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            pVar.invoke(Integer.valueOf(i5), list.get(i5));
        }
    }

    @p4.l
    public static final <T, K> Map<K, List<T>> fastGroupBy(@p4.l List<? extends T> list, @p4.l l<? super T, ? extends K> lVar) {
        HashMap hashMap = new HashMap(list.size());
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            T t5 = list.get(i5);
            K invoke = lVar.invoke(t5);
            Object obj = hashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                hashMap.put(invoke, obj);
            }
            ((ArrayList) obj).add(t5);
        }
        return hashMap;
    }

    private static final <T, A extends Appendable> A fastJoinTo(List<? extends T> list, A a5, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i5, CharSequence charSequence4, l<? super T, ? extends CharSequence> lVar) {
        a5.append(charSequence2);
        int size = list.size();
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            T t5 = list.get(i7);
            i6++;
            if (i6 > 1) {
                a5.append(charSequence);
            }
            if (i5 >= 0 && i6 > i5) {
                break;
            }
            appendElement(a5, t5, lVar);
        }
        if (i5 >= 0 && i6 > i5) {
            a5.append(charSequence4);
        }
        a5.append(charSequence3);
        return a5;
    }

    static /* synthetic */ Appendable fastJoinTo$default(List list, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i5, CharSequence charSequence4, l lVar, int i6, Object obj) {
        CharSequence charSequence5;
        CharSequence charSequence6;
        int i7;
        CharSequence charSequence7;
        l lVar2;
        if ((i6 & 2) != 0) {
            charSequence5 = ", ";
        } else {
            charSequence5 = charSequence;
        }
        CharSequence charSequence8 = "";
        if ((i6 & 4) != 0) {
            charSequence6 = "";
        } else {
            charSequence6 = charSequence2;
        }
        if ((i6 & 8) == 0) {
            charSequence8 = charSequence3;
        }
        if ((i6 & 16) != 0) {
            i7 = -1;
        } else {
            i7 = i5;
        }
        if ((i6 & 32) != 0) {
            charSequence7 = "...";
        } else {
            charSequence7 = charSequence4;
        }
        if ((i6 & 64) != 0) {
            lVar2 = null;
        } else {
            lVar2 = lVar;
        }
        return fastJoinTo(list, appendable, charSequence5, charSequence6, charSequence8, i7, charSequence7, lVar2);
    }

    @p4.l
    public static final <T> String fastJoinToString(@p4.l List<? extends T> list, @p4.l CharSequence charSequence, @p4.l CharSequence charSequence2, @p4.l CharSequence charSequence3, int i5, @p4.l CharSequence charSequence4, @m l<? super T, ? extends CharSequence> lVar) {
        return ((StringBuilder) fastJoinTo(list, new StringBuilder(), charSequence, charSequence2, charSequence3, i5, charSequence4, lVar)).toString();
    }

    public static /* synthetic */ String fastJoinToString$default(List list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i5, CharSequence charSequence4, l lVar, int i6, Object obj) {
        CharSequence charSequence5;
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
        return fastJoinToString(list, charSequence, charSequence5, charSequence6, i7, charSequence7, lVar);
    }

    @p4.l
    public static final <T, R> List<R> fastMap(@p4.l List<? extends T> list, @p4.l l<? super T, ? extends R> lVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            arrayList.add(lVar.invoke(list.get(i5)));
        }
        return arrayList;
    }

    @p4.l
    public static final <T, R> List<R> fastMapNotNull(@p4.l List<? extends T> list, @p4.l l<? super T, ? extends R> lVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            R invoke = lVar.invoke(list.get(i5));
            if (invoke != null) {
                arrayList.add(invoke);
            }
        }
        return arrayList;
    }

    @p4.l
    public static final <T> Set<T> fastToSet(@p4.l List<? extends T> list) {
        HashSet hashSet = new HashSet(list.size());
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            hashSet.add(list.get(i5));
        }
        return hashSet;
    }
}
