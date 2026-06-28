package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import p4.m;
import v3.l;

@i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/SpanStyle;", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$SpanStyleSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,454:1\n60#2,2:455\n60#2,2:458\n60#2,2:461\n91#2:464\n91#2:466\n91#2:468\n60#2,2:470\n60#2,2:473\n60#2,2:476\n60#2,2:479\n60#2,2:482\n60#2,2:485\n60#2,2:488\n1#3:457\n1#3:460\n1#3:463\n1#3:465\n1#3:467\n1#3:469\n1#3:472\n1#3:475\n1#3:478\n1#3:481\n1#3:484\n1#3:487\n1#3:490\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$SpanStyleSaver$2\n*L\n264#1:455,2\n265#1:458,2\n266#1:461,2\n267#1:464\n268#1:466\n270#1:468\n271#1:470,2\n272#1:473,2\n273#1:476,2\n274#1:479,2\n275#1:482,2\n276#1:485,2\n277#1:488,2\n264#1:457\n265#1:460\n266#1:463\n267#1:465\n268#1:467\n270#1:469\n271#1:472\n272#1:475\n273#1:478\n274#1:481\n275#1:484\n276#1:487\n277#1:490\n*E\n"})
/* loaded from: classes.dex */
final class SaversKt$SpanStyleSaver$2 extends n0 implements l<Object, SpanStyle> {
    public static final SaversKt$SpanStyleSaver$2 INSTANCE = new SaversKt$SpanStyleSaver$2();

    SaversKt$SpanStyleSaver$2() {
        super(1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.l
    @m
    public final SpanStyle invoke(@p4.l Object obj) {
        l0.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        Color.Companion companion = Color.Companion;
        Saver<Color, Object> saver = SaversKt.getSaver(companion);
        Boolean bool = Boolean.FALSE;
        Color restore = ((!l0.g(obj2, bool) || (saver instanceof NonNullValueClassSaver)) && obj2 != null) ? saver.restore(obj2) : null;
        l0.m(restore);
        long m3744unboximpl = restore.m3744unboximpl();
        Object obj3 = list.get(1);
        TextUnit.Companion companion2 = TextUnit.Companion;
        Saver<TextUnit, Object> saver2 = SaversKt.getSaver(companion2);
        TextUnit restore2 = ((!l0.g(obj3, bool) || (saver2 instanceof NonNullValueClassSaver)) && obj3 != null) ? saver2.restore(obj3) : null;
        l0.m(restore2);
        long m6244unboximpl = restore2.m6244unboximpl();
        Object obj4 = list.get(2);
        Saver<FontWeight, Object> saver3 = SaversKt.getSaver(FontWeight.Companion);
        FontWeight restore3 = ((!l0.g(obj4, bool) || (saver3 instanceof NonNullValueClassSaver)) && obj4 != null) ? saver3.restore(obj4) : null;
        Object obj5 = list.get(3);
        FontStyle fontStyle = obj5 != null ? (FontStyle) obj5 : null;
        Object obj6 = list.get(4);
        FontSynthesis fontSynthesis = obj6 != null ? (FontSynthesis) obj6 : null;
        Object obj7 = list.get(6);
        String str = obj7 != null ? (String) obj7 : null;
        Object obj8 = list.get(7);
        Saver<TextUnit, Object> saver4 = SaversKt.getSaver(companion2);
        TextUnit restore4 = ((!l0.g(obj8, bool) || (saver4 instanceof NonNullValueClassSaver)) && obj8 != null) ? saver4.restore(obj8) : null;
        l0.m(restore4);
        long m6244unboximpl2 = restore4.m6244unboximpl();
        Object obj9 = list.get(8);
        Saver<BaselineShift, Object> saver5 = SaversKt.getSaver(BaselineShift.Companion);
        BaselineShift restore5 = ((!l0.g(obj9, bool) || (saver5 instanceof NonNullValueClassSaver)) && obj9 != null) ? saver5.restore(obj9) : null;
        Object obj10 = list.get(9);
        Saver<TextGeometricTransform, Object> saver6 = SaversKt.getSaver(TextGeometricTransform.Companion);
        TextGeometricTransform restore6 = ((!l0.g(obj10, bool) || (saver6 instanceof NonNullValueClassSaver)) && obj10 != null) ? saver6.restore(obj10) : null;
        Object obj11 = list.get(10);
        Saver<LocaleList, Object> saver7 = SaversKt.getSaver(LocaleList.Companion);
        LocaleList restore7 = ((!l0.g(obj11, bool) || (saver7 instanceof NonNullValueClassSaver)) && obj11 != null) ? saver7.restore(obj11) : null;
        Object obj12 = list.get(11);
        Saver<Color, Object> saver8 = SaversKt.getSaver(companion);
        Color restore8 = ((!l0.g(obj12, bool) || (saver8 instanceof NonNullValueClassSaver)) && obj12 != null) ? saver8.restore(obj12) : null;
        l0.m(restore8);
        long m3744unboximpl2 = restore8.m3744unboximpl();
        Object obj13 = list.get(12);
        Saver<TextDecoration, Object> saver9 = SaversKt.getSaver(TextDecoration.Companion);
        TextDecoration restore9 = ((!l0.g(obj13, bool) || (saver9 instanceof NonNullValueClassSaver)) && obj13 != null) ? saver9.restore(obj13) : null;
        Object obj14 = list.get(13);
        Saver<Shadow, Object> saver10 = SaversKt.getSaver(Shadow.Companion);
        return new SpanStyle(m3744unboximpl, m6244unboximpl, restore3, fontStyle, fontSynthesis, (FontFamily) null, str, m6244unboximpl2, restore5, restore6, restore7, m3744unboximpl2, restore9, ((!l0.g(obj14, bool) || (saver10 instanceof NonNullValueClassSaver)) && obj14 != null) ? saver10.restore(obj14) : null, (PlatformSpanStyle) null, (DrawStyle) null, 49184, (w) null);
    }
}
