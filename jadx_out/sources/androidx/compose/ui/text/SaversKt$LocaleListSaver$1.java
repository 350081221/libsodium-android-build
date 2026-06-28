package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import java.util.ArrayList;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;
import v3.p;

@i0(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "Landroidx/compose/ui/text/intl/LocaleList;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$LocaleListSaver$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,454:1\n151#2,3:455\n33#2,4:458\n154#2,2:462\n38#2:464\n156#2:465\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$LocaleListSaver$1\n*L\n436#1:455,3\n436#1:458,4\n436#1:462,2\n436#1:464\n436#1:465\n*E\n"})
/* loaded from: classes.dex */
final class SaversKt$LocaleListSaver$1 extends n0 implements p<SaverScope, LocaleList, Object> {
    public static final SaversKt$LocaleListSaver$1 INSTANCE = new SaversKt$LocaleListSaver$1();

    SaversKt$LocaleListSaver$1() {
        super(2);
    }

    @Override // v3.p
    @m
    public final Object invoke(@l SaverScope saverScope, @l LocaleList localeList) {
        List<Locale> localeList2 = localeList.getLocaleList();
        ArrayList arrayList = new ArrayList(localeList2.size());
        int size = localeList2.size();
        for (int i5 = 0; i5 < size; i5++) {
            arrayList.add(SaversKt.save(localeList2.get(i5), SaversKt.getSaver(Locale.Companion), saverScope));
        }
        return arrayList;
    }
}
