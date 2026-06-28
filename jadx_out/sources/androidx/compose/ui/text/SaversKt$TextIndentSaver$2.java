package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.TextUnit;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import p4.m;
import v3.l;

@i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/style/TextIndent;", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$TextIndentSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,454:1\n60#2,2:455\n60#2,2:458\n1#3:457\n1#3:460\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$TextIndentSaver$2\n*L\n316#1:455,2\n317#1:458,2\n316#1:457\n317#1:460\n*E\n"})
/* loaded from: classes.dex */
final class SaversKt$TextIndentSaver$2 extends n0 implements l<Object, TextIndent> {
    public static final SaversKt$TextIndentSaver$2 INSTANCE = new SaversKt$TextIndentSaver$2();

    SaversKt$TextIndentSaver$2() {
        super(1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.l
    @m
    public final TextIndent invoke(@p4.l Object obj) {
        l0.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        TextUnit.Companion companion = TextUnit.Companion;
        Saver<TextUnit, Object> saver = SaversKt.getSaver(companion);
        Boolean bool = Boolean.FALSE;
        TextUnit textUnit = null;
        TextUnit restore = ((!l0.g(obj2, bool) || (saver instanceof NonNullValueClassSaver)) && obj2 != null) ? saver.restore(obj2) : null;
        l0.m(restore);
        long m6244unboximpl = restore.m6244unboximpl();
        Object obj3 = list.get(1);
        Saver<TextUnit, Object> saver2 = SaversKt.getSaver(companion);
        if ((!l0.g(obj3, bool) || (saver2 instanceof NonNullValueClassSaver)) && obj3 != null) {
            textUnit = saver2.restore(obj3);
        }
        l0.m(textUnit);
        return new TextIndent(m6244unboximpl, textUnit.m6244unboximpl(), null);
    }
}
