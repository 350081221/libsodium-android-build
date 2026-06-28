package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.AnnotatedString;
import java.util.ArrayList;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;
import v3.p;

@i0(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00050\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$AnnotationRangeListSaver$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,454:1\n151#2,3:455\n33#2,4:458\n154#2,2:462\n38#2:464\n156#2:465\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$AnnotationRangeListSaver$1\n*L\n121#1:455,3\n121#1:458,4\n121#1:462,2\n121#1:464\n121#1:465\n*E\n"})
/* loaded from: classes.dex */
final class SaversKt$AnnotationRangeListSaver$1 extends n0 implements p<SaverScope, List<? extends AnnotatedString.Range<? extends Object>>, Object> {
    public static final SaversKt$AnnotationRangeListSaver$1 INSTANCE = new SaversKt$AnnotationRangeListSaver$1();

    SaversKt$AnnotationRangeListSaver$1() {
        super(2);
    }

    @Override // v3.p
    @m
    public final Object invoke(@l SaverScope saverScope, @l List<? extends AnnotatedString.Range<? extends Object>> list) {
        Saver saver;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            AnnotatedString.Range<? extends Object> range = list.get(i5);
            saver = SaversKt.AnnotationRangeSaver;
            arrayList.add(SaversKt.save(range, saver, saverScope));
        }
        return arrayList;
    }
}
