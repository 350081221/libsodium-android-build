package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.collections.a1;
import kotlin.collections.e0;
import kotlin.collections.k1;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.q1;
import p4.l;
import v3.q;

@i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a,\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u001e\u0010\u0004\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00020\u0001H\u0000\u001a*\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0007\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0018\u00010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u0002¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString;", "Lkotlin/Function3;", "", "", "transform", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "ranges", "Ljava/util/SortedSet;", TypedValues.AttributesType.S_TARGET, "Lkotlin/r2;", "collectRangeTransitions", "ui-text_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nJvmAnnotatedString.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmAnnotatedString.jvm.kt\nandroidx/compose/ui/text/JvmAnnotatedString_jvmKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,81:1\n151#2,3:82\n33#2,4:85\n154#2,2:89\n38#2:91\n156#2:92\n151#2,3:93\n33#2,4:96\n154#2,2:100\n38#2:102\n156#2:103\n151#2,3:104\n33#2,4:107\n154#2,2:111\n38#2:113\n156#2:114\n256#2,3:115\n33#2,4:118\n259#2,2:122\n38#2:124\n261#2:125\n*S KotlinDebug\n*F\n+ 1 JvmAnnotatedString.jvm.kt\nandroidx/compose/ui/text/JvmAnnotatedString_jvmKt\n*L\n45#1:82,3\n45#1:85,4\n45#1:89,2\n45#1:91\n45#1:92\n49#1:93,3\n49#1:96,4\n49#1:100,2\n49#1:102\n49#1:103\n52#1:104,3\n52#1:107,4\n52#1:111,2\n52#1:113\n52#1:114\n74#1:115,3\n74#1:118,4\n74#1:122,2\n74#1:124\n74#1:125\n*E\n"})
/* loaded from: classes.dex */
public final class JvmAnnotatedString_jvmKt {
    private static final void collectRangeTransitions(List<? extends AnnotatedString.Range<?>> list, SortedSet<Integer> sortedSet) {
        if (list != null) {
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                AnnotatedString.Range<?> range = list.get(i5);
                sortedSet.add(Integer.valueOf(range.getStart()));
                sortedSet.add(Integer.valueOf(range.getEnd()));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l
    public static final AnnotatedString transform(@l AnnotatedString annotatedString, @l q<? super String, ? super Integer, ? super Integer, String> qVar) {
        TreeSet h5;
        Map j02;
        ArrayList arrayList;
        ArrayList arrayList2;
        h5 = k1.h(0, Integer.valueOf(annotatedString.getText().length()));
        collectRangeTransitions(annotatedString.getSpanStylesOrNull$ui_text_release(), h5);
        collectRangeTransitions(annotatedString.getParagraphStylesOrNull$ui_text_release(), h5);
        collectRangeTransitions(annotatedString.getAnnotations$ui_text_release(), h5);
        k1.h hVar = new k1.h();
        hVar.element = "";
        j02 = a1.j0(q1.a(0, 0));
        e0.d6(h5, 2, 0, false, new JvmAnnotatedString_jvmKt$transform$1(hVar, qVar, annotatedString, j02), 6, null);
        List<AnnotatedString.Range<SpanStyle>> spanStylesOrNull$ui_text_release = annotatedString.getSpanStylesOrNull$ui_text_release();
        ArrayList arrayList3 = null;
        if (spanStylesOrNull$ui_text_release != null) {
            arrayList = new ArrayList(spanStylesOrNull$ui_text_release.size());
            int size = spanStylesOrNull$ui_text_release.size();
            for (int i5 = 0; i5 < size; i5++) {
                AnnotatedString.Range<SpanStyle> range = spanStylesOrNull$ui_text_release.get(i5);
                SpanStyle item = range.getItem();
                Object obj = j02.get(Integer.valueOf(range.getStart()));
                l0.m(obj);
                int intValue = ((Number) obj).intValue();
                Object obj2 = j02.get(Integer.valueOf(range.getEnd()));
                l0.m(obj2);
                arrayList.add(new AnnotatedString.Range(item, intValue, ((Number) obj2).intValue()));
            }
        } else {
            arrayList = null;
        }
        List<AnnotatedString.Range<ParagraphStyle>> paragraphStylesOrNull$ui_text_release = annotatedString.getParagraphStylesOrNull$ui_text_release();
        if (paragraphStylesOrNull$ui_text_release != null) {
            arrayList2 = new ArrayList(paragraphStylesOrNull$ui_text_release.size());
            int size2 = paragraphStylesOrNull$ui_text_release.size();
            for (int i6 = 0; i6 < size2; i6++) {
                AnnotatedString.Range<ParagraphStyle> range2 = paragraphStylesOrNull$ui_text_release.get(i6);
                ParagraphStyle item2 = range2.getItem();
                Object obj3 = j02.get(Integer.valueOf(range2.getStart()));
                l0.m(obj3);
                int intValue2 = ((Number) obj3).intValue();
                Object obj4 = j02.get(Integer.valueOf(range2.getEnd()));
                l0.m(obj4);
                arrayList2.add(new AnnotatedString.Range(item2, intValue2, ((Number) obj4).intValue()));
            }
        } else {
            arrayList2 = null;
        }
        List<AnnotatedString.Range<? extends Object>> annotations$ui_text_release = annotatedString.getAnnotations$ui_text_release();
        if (annotations$ui_text_release != null) {
            arrayList3 = new ArrayList(annotations$ui_text_release.size());
            int size3 = annotations$ui_text_release.size();
            for (int i7 = 0; i7 < size3; i7++) {
                AnnotatedString.Range<? extends Object> range3 = annotations$ui_text_release.get(i7);
                Object item3 = range3.getItem();
                Object obj5 = j02.get(Integer.valueOf(range3.getStart()));
                l0.m(obj5);
                int intValue3 = ((Number) obj5).intValue();
                Object obj6 = j02.get(Integer.valueOf(range3.getEnd()));
                l0.m(obj6);
                arrayList3.add(new AnnotatedString.Range(item3, intValue3, ((Number) obj6).intValue()));
            }
        }
        return new AnnotatedString((String) hVar.element, arrayList, arrayList2, arrayList3);
    }
}
