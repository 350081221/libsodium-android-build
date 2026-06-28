package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import p4.m;
import v3.l;

@i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/ParagraphStyle;", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$ParagraphStyleSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,454:1\n91#2:455\n91#2:457\n60#2,2:459\n60#2,2:462\n1#3:456\n1#3:458\n1#3:461\n1#3:464\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$ParagraphStyleSaver$2\n*L\n234#1:455\n235#1:457\n236#1:459,2\n237#1:462,2\n234#1:456\n235#1:458\n236#1:461\n237#1:464\n*E\n"})
/* loaded from: classes.dex */
final class SaversKt$ParagraphStyleSaver$2 extends n0 implements l<Object, ParagraphStyle> {
    public static final SaversKt$ParagraphStyleSaver$2 INSTANCE = new SaversKt$ParagraphStyleSaver$2();

    SaversKt$ParagraphStyleSaver$2() {
        super(1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.l
    @m
    public final ParagraphStyle invoke(@p4.l Object obj) {
        l0.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        TextAlign textAlign = obj2 != null ? (TextAlign) obj2 : null;
        l0.m(textAlign);
        int m5935unboximpl = textAlign.m5935unboximpl();
        Object obj3 = list.get(1);
        TextDirection textDirection = obj3 != null ? (TextDirection) obj3 : null;
        l0.m(textDirection);
        int m5949unboximpl = textDirection.m5949unboximpl();
        Object obj4 = list.get(2);
        Saver<TextUnit, Object> saver = SaversKt.getSaver(TextUnit.Companion);
        Boolean bool = Boolean.FALSE;
        TextUnit restore = ((!l0.g(obj4, bool) || (saver instanceof NonNullValueClassSaver)) && obj4 != null) ? saver.restore(obj4) : null;
        l0.m(restore);
        long m6244unboximpl = restore.m6244unboximpl();
        Object obj5 = list.get(3);
        Saver<TextIndent, Object> saver2 = SaversKt.getSaver(TextIndent.Companion);
        return new ParagraphStyle(m5935unboximpl, m5949unboximpl, m6244unboximpl, ((!l0.g(obj5, bool) || (saver2 instanceof NonNullValueClassSaver)) && obj5 != null) ? saver2.restore(obj5) : null, (PlatformParagraphStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 496, (w) null);
    }
}
