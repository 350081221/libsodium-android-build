package androidx.compose.ui.text.android;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.w;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@i0(d1 = {"\u0000\"\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a8\u0010\u0005\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a_\u0010\u000b\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0006\"\u0010\b\u0002\u0010\b*\n\u0012\u0006\b\u0000\u0012\u00028\u00010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\t\u001a\u00028\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b\u000b\u0010\f\u001aJ\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\rH\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¨\u0006\u000f"}, d2 = {"T", "", "Lkotlin/Function1;", "Lkotlin/r2;", "action", "fastForEach", "R", "", "C", "destination", "transform", "fastMapTo", "(Ljava/util/List;Ljava/util/Collection;Lv3/l;)Ljava/util/Collection;", "Lkotlin/Function2;", "fastZipWithNext", "ui-text_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nListUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListUtils.kt\nandroidx/compose/ui/text/android/ListUtilsKt\n*L\n1#1,86:1\n33#1,6:87\n*S KotlinDebug\n*F\n+ 1 ListUtils.kt\nandroidx/compose/ui/text/android/ListUtilsKt\n*L\n55#1:87,6\n*E\n"})
/* loaded from: classes.dex */
public final class ListUtilsKt {
    public static final <T> void fastForEach(@p4.l List<? extends T> list, @p4.l v3.l<? super T, r2> lVar) {
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            lVar.invoke(list.get(i5));
        }
    }

    @p4.l
    public static final <T, R, C extends Collection<? super R>> C fastMapTo(@p4.l List<? extends T> list, @p4.l C c5, @p4.l v3.l<? super T, ? extends R> lVar) {
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            c5.add(lVar.invoke(list.get(i5)));
        }
        return c5;
    }

    @p4.l
    public static final <T, R> List<R> fastZipWithNext(@p4.l List<? extends T> list, @p4.l v3.p<? super T, ? super T, ? extends R> pVar) {
        List<R> E;
        int G;
        if (list.size() != 0 && list.size() != 1) {
            ArrayList arrayList = new ArrayList();
            int i5 = 0;
            a1.b bVar = list.get(0);
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
