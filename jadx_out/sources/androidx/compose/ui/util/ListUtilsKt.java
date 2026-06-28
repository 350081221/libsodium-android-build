package androidx.compose.ui.util;

import a1.b;
import com.umeng.analytics.pro.bi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.b0;
import kotlin.collections.e0;
import kotlin.collections.w;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.m;
import v3.l;
import v3.p;

@i0(d1 = {"\u0000d\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u001f\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a8\u0010\u0005\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a8\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a>\u0010\t\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0007H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a8\u0010\f\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a8\u0010\r\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001aA\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a8\u0010\u0011\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001aD\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001aQ\u0010\u0016\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00010\u0015*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0016\u0010\u000f\u001a_\u0010\u001a\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0012\"\u0010\b\u0002\u0010\u0018*\n\u0012\u0006\b\u0000\u0012\u00028\u00010\u0017*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0019\u001a\u00028\u00022\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001aA\u0010\u001c\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u001c\u0010\u000f\u001a>\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001ab\u0010#\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001e\u001a\u00028\u00012'\u0010\"\u001a#\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b#\u0010$\u001aY\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00000\u00012'\u0010\u0013\u001a#\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(%\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a[\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00000\u00012)\u0010\u0013\u001a%\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(%\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0007H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001aQ\u0010(\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00010\u0015*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b(\u0010)\u001aJ\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a^\u0010,\u001a\u00028\u0000\"\u0004\b\u0000\u0010+\"\b\b\u0001\u0010\u0000*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00010\u00012'\u0010\"\u001a#\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0007H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b,\u0010-\u001a|\u00102\u001a\b\u0012\u0004\u0012\u00028\u00020\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0012\"\u0004\b\u0002\u0010.*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00010\u000126\u0010\u0013\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(0\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(1\u0012\u0004\u0012\u00028\u00020\u0007H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002\u001aF\u00103\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a`\u0010;\u001a\u00020:\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u00105\u001a\u0002042\b\b\u0002\u00106\u001a\u0002042\b\b\u0002\u00107\u001a\u0002042\b\b\u0002\u00108\u001a\u00020\b2\b\b\u0002\u00109\u001a\u0002042\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u000204\u0018\u00010\u0002\u001aD\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010<*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001aQ\u0010>\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00010\u0015*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b>\u0010\u000f\u001aJ\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010?0\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a\"\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0000*\u00020A*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001\u001a?\u0010C\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bC\u0010\u000f\u001a\u007f\u0010H\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\f\b\u0001\u0010F*\u00060Dj\u0002`E*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010G\u001a\u00028\u00012\b\b\u0002\u00105\u001a\u0002042\b\b\u0002\u00106\u001a\u0002042\b\b\u0002\u00107\u001a\u0002042\b\b\u0002\u00108\u001a\u00020\b2\b\b\u0002\u00109\u001a\u0002042\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u000204\u0018\u00010\u0002H\u0002¢\u0006\u0004\bH\u0010I\u001a;\u0010K\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u00060Dj\u0002`E2\u0006\u0010J\u001a\u00028\u00002\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u000204\u0018\u00010\u0002H\u0002¢\u0006\u0004\bK\u0010L¨\u0006M"}, d2 = {"T", "", "Lkotlin/Function1;", "Lkotlin/r2;", "action", "fastForEach", "fastForEachReversed", "Lkotlin/Function2;", "", "fastForEachIndexed", "", "predicate", "fastAll", "fastAny", "fastFirstOrNull", "(Ljava/util/List;Lv3/l;)Ljava/lang/Object;", "selector", "fastSumBy", "R", "transform", "fastMap", "", "fastMaxBy", "", "C", "destination", "fastMapTo", "(Ljava/util/List;Ljava/util/Collection;Lv3/l;)Ljava/util/Collection;", "fastLastOrNull", "fastFilter", "initial", "Lkotlin/v0;", "name", "acc", "operation", "fastFold", "(Ljava/util/List;Ljava/lang/Object;Lv3/p;)Ljava/lang/Object;", "index", "fastMapIndexed", "fastMapIndexedNotNull", "fastMaxOfOrNull", "(Ljava/util/List;Lv3/l;)Ljava/lang/Comparable;", "fastZipWithNext", "S", "fastReduce", "(Ljava/util/List;Lv3/p;)Ljava/lang/Object;", "V", "other", bi.ay, "b", "fastZip", "fastMapNotNull", "", "separator", "prefix", "postfix", "limit", "truncated", "", "fastJoinToString", "K", "fastDistinctBy", "fastMinByOrNull", "", "fastFlatMap", "", "fastFilterNotNull", "fastFirst", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "A", "buffer", "fastJoinTo", "(Ljava/util/List;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lv3/l;)Ljava/lang/Appendable;", "element", "appendElement", "(Ljava/lang/Appendable;Ljava/lang/Object;Lv3/l;)V", "ui-util_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nListUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,595:1\n33#1,6:596\n33#1,6:602\n33#1,6:608\n33#1,6:614\n33#1,6:620\n33#1,6:626\n33#1,6:632\n33#1,6:638\n69#1,6:644\n69#1,4:650\n74#1:655\n33#1,6:656\n33#1,6:662\n33#1,6:668\n33#1,6:674\n33#1,6:680\n1#2:654\n*S KotlinDebug\n*F\n+ 1 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n87#1:596,6\n102#1:602,6\n117#1:608,6\n134#1:614,6\n153#1:620,6\n201#1:626,6\n237#1:632,6\n258#1:638,6\n279#1:644,6\n300#1:650,4\n300#1:655\n418#1:656,6\n464#1:662,6\n510#1:668,6\n526#1:674,6\n545#1:680,6\n*E\n"})
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
    public static final <T, K> List<T> fastDistinctBy(@p4.l List<? extends T> list, @p4.l l<? super T, ? extends K> lVar) {
        HashSet hashSet = new HashSet(list.size());
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            T t5 = list.get(i5);
            if (hashSet.add(lVar.invoke(t5))) {
                arrayList.add(t5);
            }
        }
        return arrayList;
    }

    @p4.l
    public static final <T> List<T> fastFilter(@p4.l List<? extends T> list, @p4.l l<? super T, Boolean> lVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            T t5 = list.get(i5);
            if (lVar.invoke(t5).booleanValue()) {
                arrayList.add(t5);
            }
        }
        return arrayList;
    }

    @p4.l
    public static final <T> List<T> fastFilterNotNull(@p4.l List<? extends T> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            T t5 = list.get(i5);
            if (t5 != null) {
                arrayList.add(t5);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    public static final <T> T fastFirst(@p4.l List<? extends T> list, @p4.l l<? super T, Boolean> lVar) {
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            T t5 = list.get(i5);
            if (lVar.invoke(t5).booleanValue()) {
                return t5;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    @m
    public static final <T> T fastFirstOrNull(@p4.l List<? extends T> list, @p4.l l<? super T, Boolean> lVar) {
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            T t5 = list.get(i5);
            if (lVar.invoke(t5).booleanValue()) {
                return t5;
            }
        }
        return null;
    }

    @p4.l
    public static final <T, R> List<R> fastFlatMap(@p4.l List<? extends T> list, @p4.l l<? super T, ? extends Iterable<? extends R>> lVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            b0.n0(arrayList, lVar.invoke(list.get(i5)));
        }
        return arrayList;
    }

    public static final <T, R> R fastFold(@p4.l List<? extends T> list, R r5, @p4.l p<? super R, ? super T, ? extends R> pVar) {
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            r5 = pVar.invoke(r5, list.get(i5));
        }
        return r5;
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

    public static final <T> void fastForEachReversed(@p4.l List<? extends T> list, @p4.l l<? super T, r2> lVar) {
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i5 = size - 1;
            lVar.invoke(list.get(size));
            if (i5 >= 0) {
                size = i5;
            } else {
                return;
            }
        }
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

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    @m
    public static final <T> T fastLastOrNull(@p4.l List<? extends T> list, @p4.l l<? super T, Boolean> lVar) {
        int size = list.size() - 1;
        if (size < 0) {
            return null;
        }
        while (true) {
            int i5 = size - 1;
            T t5 = list.get(size);
            if (lVar.invoke(t5).booleanValue()) {
                return t5;
            }
            if (i5 >= 0) {
                size = i5;
            } else {
                return null;
            }
        }
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
    public static final <T, R> List<R> fastMapIndexed(@p4.l List<? extends T> list, @p4.l p<? super Integer, ? super T, ? extends R> pVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            arrayList.add(pVar.invoke(Integer.valueOf(i5), list.get(i5)));
        }
        return arrayList;
    }

    @p4.l
    public static final <T, R> List<R> fastMapIndexedNotNull(@p4.l List<? extends T> list, @p4.l p<? super Integer, ? super T, ? extends R> pVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            R invoke = pVar.invoke(Integer.valueOf(i5), list.get(i5));
            if (invoke != null) {
                arrayList.add(invoke);
            }
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
    public static final <T, R, C extends Collection<? super R>> C fastMapTo(@p4.l List<? extends T> list, @p4.l C c5, @p4.l l<? super T, ? extends R> lVar) {
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            c5.add(lVar.invoke(list.get(i5)));
        }
        return c5;
    }

    @m
    public static final <T, R extends Comparable<? super R>> T fastMaxBy(@p4.l List<? extends T> list, @p4.l l<? super T, ? extends R> lVar) {
        int G;
        if (list.isEmpty()) {
            return null;
        }
        T t5 = list.get(0);
        R invoke = lVar.invoke(t5);
        G = w.G(list);
        int i5 = 1;
        if (1 <= G) {
            while (true) {
                T t6 = list.get(i5);
                R invoke2 = lVar.invoke(t6);
                if (invoke.compareTo(invoke2) < 0) {
                    t5 = t6;
                    invoke = invoke2;
                }
                if (i5 == G) {
                    break;
                }
                i5++;
            }
        }
        return (T) t5;
    }

    @m
    public static final <T, R extends Comparable<? super R>> R fastMaxOfOrNull(@p4.l List<? extends T> list, @p4.l l<? super T, ? extends R> lVar) {
        int G;
        if (list.isEmpty()) {
            return null;
        }
        R invoke = lVar.invoke(list.get(0));
        G = w.G(list);
        int i5 = 1;
        if (1 <= G) {
            while (true) {
                R invoke2 = lVar.invoke(list.get(i5));
                if (invoke2.compareTo(invoke) > 0) {
                    invoke = invoke2;
                }
                if (i5 == G) {
                    break;
                }
                i5++;
            }
        }
        return invoke;
    }

    @m
    public static final <T, R extends Comparable<? super R>> T fastMinByOrNull(@p4.l List<? extends T> list, @p4.l l<? super T, ? extends R> lVar) {
        int G;
        if (list.isEmpty()) {
            return null;
        }
        T t5 = list.get(0);
        R invoke = lVar.invoke(t5);
        G = w.G(list);
        int i5 = 1;
        if (1 <= G) {
            while (true) {
                T t6 = list.get(i5);
                R invoke2 = lVar.invoke(t6);
                if (invoke.compareTo(invoke2) > 0) {
                    t5 = t6;
                    invoke = invoke2;
                }
                if (i5 == G) {
                    break;
                }
                i5++;
            }
        }
        return (T) t5;
    }

    public static final <S, T extends S> S fastReduce(@p4.l List<? extends T> list, @p4.l p<? super S, ? super T, ? extends S> pVar) {
        int G;
        Object y22;
        if (!list.isEmpty()) {
            y22 = e0.y2(list);
            S s5 = (Object) y22;
            G = w.G(list);
            int i5 = 1;
            if (1 <= G) {
                while (true) {
                    s5 = pVar.invoke(s5, list.get(i5));
                    if (i5 == G) {
                        break;
                    }
                    i5++;
                }
            }
            return s5;
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }

    public static final <T> int fastSumBy(@p4.l List<? extends T> list, @p4.l l<? super T, Integer> lVar) {
        int size = list.size();
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            i5 += lVar.invoke(list.get(i6)).intValue();
        }
        return i5;
    }

    @p4.l
    public static final <T, R, V> List<V> fastZip(@p4.l List<? extends T> list, @p4.l List<? extends R> list2, @p4.l p<? super T, ? super R, ? extends V> pVar) {
        int min = Math.min(list.size(), list2.size());
        ArrayList arrayList = new ArrayList(min);
        for (int i5 = 0; i5 < min; i5++) {
            arrayList.add(pVar.invoke(list.get(i5), list2.get(i5)));
        }
        return arrayList;
    }

    @p4.l
    public static final <T, R> List<R> fastZipWithNext(@p4.l List<? extends T> list, @p4.l p<? super T, ? super T, ? extends R> pVar) {
        List<R> E;
        int G;
        if (list.size() != 0 && list.size() != 1) {
            ArrayList arrayList = new ArrayList();
            int i5 = 0;
            b bVar = list.get(0);
            G = w.G(list);
            while (i5 < G) {
                i5++;
                T t5 = list.get(i5);
                arrayList.add(pVar.invoke(bVar, t5));
                bVar = t5;
            }
            return arrayList;
        }
        E = w.E();
        return E;
    }
}
