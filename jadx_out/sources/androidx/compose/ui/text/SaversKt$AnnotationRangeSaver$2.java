package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.text.AnnotatedString;
import java.util.List;
import kotlin.i0;
import kotlin.j0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import p4.m;
import v3.l;

@i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0002\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/AnnotatedString$Range;", "", "it", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$AnnotationRangeSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,454:1\n91#2:455\n91#2:457\n91#2:459\n91#2:461\n60#2,2:463\n60#2,2:466\n60#2,2:469\n60#2,2:472\n91#2:475\n1#3:456\n1#3:458\n1#3:460\n1#3:462\n1#3:465\n1#3:468\n1#3:471\n1#3:474\n1#3:476\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$AnnotationRangeSaver$2\n*L\n181#1:455\n182#1:457\n183#1:459\n184#1:461\n188#1:463,2\n192#1:466,2\n196#1:469,2\n200#1:472,2\n204#1:475\n181#1:456\n182#1:458\n183#1:460\n184#1:462\n188#1:465\n192#1:468\n196#1:471\n200#1:474\n204#1:476\n*E\n"})
/* loaded from: classes.dex */
final class SaversKt$AnnotationRangeSaver$2 extends n0 implements l<Object, AnnotatedString.Range<? extends Object>> {
    public static final SaversKt$AnnotationRangeSaver$2 INSTANCE = new SaversKt$AnnotationRangeSaver$2();

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AnnotationType.values().length];
            try {
                iArr[AnnotationType.Paragraph.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnnotationType.Span.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AnnotationType.VerbatimTts.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AnnotationType.Url.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AnnotationType.String.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    SaversKt$AnnotationRangeSaver$2() {
        super(1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.l
    @m
    public final AnnotatedString.Range<? extends Object> invoke(@p4.l Object obj) {
        Saver saver;
        Saver saver2;
        l0.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        AnnotationType annotationType = obj2 != null ? (AnnotationType) obj2 : null;
        l0.m(annotationType);
        Object obj3 = list.get(2);
        Integer num = obj3 != null ? (Integer) obj3 : null;
        l0.m(num);
        int intValue = num.intValue();
        Object obj4 = list.get(3);
        Integer num2 = obj4 != null ? (Integer) obj4 : null;
        l0.m(num2);
        int intValue2 = num2.intValue();
        Object obj5 = list.get(4);
        String str = obj5 != null ? (String) obj5 : null;
        l0.m(str);
        int i5 = WhenMappings.$EnumSwitchMapping$0[annotationType.ordinal()];
        if (i5 == 1) {
            Object obj6 = list.get(1);
            Saver<ParagraphStyle, Object> paragraphStyleSaver = SaversKt.getParagraphStyleSaver();
            if ((!l0.g(obj6, Boolean.FALSE) || (paragraphStyleSaver instanceof NonNullValueClassSaver)) && obj6 != null) {
                r1 = paragraphStyleSaver.restore(obj6);
            }
            l0.m(r1);
            return new AnnotatedString.Range<>(r1, intValue, intValue2, str);
        }
        if (i5 == 2) {
            Object obj7 = list.get(1);
            Saver<SpanStyle, Object> spanStyleSaver = SaversKt.getSpanStyleSaver();
            if ((!l0.g(obj7, Boolean.FALSE) || (spanStyleSaver instanceof NonNullValueClassSaver)) && obj7 != null) {
                r1 = spanStyleSaver.restore(obj7);
            }
            l0.m(r1);
            return new AnnotatedString.Range<>(r1, intValue, intValue2, str);
        }
        if (i5 == 3) {
            Object obj8 = list.get(1);
            saver = SaversKt.VerbatimTtsAnnotationSaver;
            if ((!l0.g(obj8, Boolean.FALSE) || (saver instanceof NonNullValueClassSaver)) && obj8 != null) {
                r1 = (VerbatimTtsAnnotation) saver.restore(obj8);
            }
            l0.m(r1);
            return new AnnotatedString.Range<>(r1, intValue, intValue2, str);
        }
        if (i5 != 4) {
            if (i5 != 5) {
                throw new j0();
            }
            Object obj9 = list.get(1);
            r1 = obj9 != null ? (String) obj9 : null;
            l0.m(r1);
            return new AnnotatedString.Range<>(r1, intValue, intValue2, str);
        }
        Object obj10 = list.get(1);
        saver2 = SaversKt.UrlAnnotationSaver;
        if ((!l0.g(obj10, Boolean.FALSE) || (saver2 instanceof NonNullValueClassSaver)) && obj10 != null) {
            r1 = (UrlAnnotation) saver2.restore(obj10);
        }
        l0.m(r1);
        return new AnnotatedString.Range<>(r1, intValue, intValue2, str);
    }
}
