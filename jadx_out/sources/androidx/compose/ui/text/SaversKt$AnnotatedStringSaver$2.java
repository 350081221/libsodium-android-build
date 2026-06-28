package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import p4.m;
import v3.l;

@i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/AnnotatedString;", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$AnnotatedStringSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,454:1\n60#2,2:455\n60#2,2:458\n91#2:461\n60#2,2:464\n1#3:457\n1#3:460\n1#3:462\n1#3:463\n1#3:466\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$AnnotatedStringSaver$2\n*L\n107#1:455,2\n109#1:458,2\n111#1:461\n114#1:464,2\n107#1:457\n109#1:460\n111#1:462\n114#1:466\n*E\n"})
/* loaded from: classes.dex */
final class SaversKt$AnnotatedStringSaver$2 extends n0 implements l<Object, AnnotatedString> {
    public static final SaversKt$AnnotatedStringSaver$2 INSTANCE = new SaversKt$AnnotatedStringSaver$2();

    SaversKt$AnnotatedStringSaver$2() {
        super(1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.l
    @m
    public final AnnotatedString invoke(@p4.l Object obj) {
        Saver saver;
        Saver saver2;
        List list;
        List list2;
        Saver saver3;
        l0.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list3 = (List) obj;
        Object obj2 = list3.get(1);
        saver = SaversKt.AnnotationRangeListSaver;
        Boolean bool = Boolean.FALSE;
        List list4 = null;
        List list5 = ((!l0.g(obj2, bool) || (saver instanceof NonNullValueClassSaver)) && obj2 != null) ? (List) saver.restore(obj2) : null;
        Object obj3 = list3.get(2);
        saver2 = SaversKt.AnnotationRangeListSaver;
        List list6 = ((!l0.g(obj3, bool) || (saver2 instanceof NonNullValueClassSaver)) && obj3 != null) ? (List) saver2.restore(obj3) : null;
        Object obj4 = list3.get(0);
        String str = obj4 != null ? (String) obj4 : null;
        l0.m(str);
        if (list5 != null) {
            List list7 = list5;
            if (list7.isEmpty()) {
                list7 = null;
            }
            list = list7;
        } else {
            list = null;
        }
        if (list6 != null) {
            List list8 = list6;
            if (list8.isEmpty()) {
                list8 = null;
            }
            list2 = list8;
        } else {
            list2 = null;
        }
        Object obj5 = list3.get(3);
        saver3 = SaversKt.AnnotationRangeListSaver;
        if ((!l0.g(obj5, bool) || (saver3 instanceof NonNullValueClassSaver)) && obj5 != null) {
            list4 = (List) saver3.restore(obj5);
        }
        return new AnnotatedString(str, list, list2, list4);
    }
}
