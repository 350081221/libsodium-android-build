package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import java.util.ArrayList;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import p4.m;
import v3.l;

@i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/intl/LocaleList;", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$LocaleListSaver$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,454:1\n151#2,3:455\n33#2,4:458\n154#2:462\n155#2:466\n38#2:467\n156#2:468\n60#3,2:463\n1#4:465\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$LocaleListSaver$2\n*L\n443#1:455,3\n443#1:458,4\n443#1:462\n443#1:466\n443#1:467\n443#1:468\n443#1:463,2\n443#1:465\n*E\n"})
/* loaded from: classes.dex */
final class SaversKt$LocaleListSaver$2 extends n0 implements l<Object, LocaleList> {
    public static final SaversKt$LocaleListSaver$2 INSTANCE = new SaversKt$LocaleListSaver$2();

    SaversKt$LocaleListSaver$2() {
        super(1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.l
    @m
    public final LocaleList invoke(@p4.l Object obj) {
        l0.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            Object obj2 = list.get(i5);
            Saver<Locale, Object> saver = SaversKt.getSaver(Locale.Companion);
            Locale locale = null;
            if ((!l0.g(obj2, Boolean.FALSE) || (saver instanceof NonNullValueClassSaver)) && obj2 != null) {
                locale = saver.restore(obj2);
            }
            l0.m(locale);
            arrayList.add(locale);
        }
        return new LocaleList(arrayList);
    }
}
