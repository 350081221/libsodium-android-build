package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.AnnotatedString;
import java.util.ArrayList;
import kotlin.collections.w;
import kotlin.i0;
import kotlin.j0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import p4.l;
import p4.m;
import v3.p;

@i0(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "Landroidx/compose/ui/text/AnnotatedString$Range;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SaversKt$AnnotationRangeSaver$1 extends n0 implements p<SaverScope, AnnotatedString.Range<? extends Object>, Object> {
    public static final SaversKt$AnnotationRangeSaver$1 INSTANCE = new SaversKt$AnnotationRangeSaver$1();

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

    SaversKt$AnnotationRangeSaver$1() {
        super(2);
    }

    @Override // v3.p
    @m
    public final Object invoke(@l SaverScope saverScope, @l AnnotatedString.Range<? extends Object> range) {
        AnnotationType annotationType;
        Object save;
        ArrayList r5;
        Saver saver;
        Saver saver2;
        Object item = range.getItem();
        if (item instanceof ParagraphStyle) {
            annotationType = AnnotationType.Paragraph;
        } else if (item instanceof SpanStyle) {
            annotationType = AnnotationType.Span;
        } else if (item instanceof VerbatimTtsAnnotation) {
            annotationType = AnnotationType.VerbatimTts;
        } else {
            annotationType = item instanceof UrlAnnotation ? AnnotationType.Url : AnnotationType.String;
        }
        int i5 = WhenMappings.$EnumSwitchMapping$0[annotationType.ordinal()];
        if (i5 == 1) {
            Object item2 = range.getItem();
            l0.n(item2, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
            save = SaversKt.save((ParagraphStyle) item2, SaversKt.getParagraphStyleSaver(), saverScope);
        } else if (i5 == 2) {
            Object item3 = range.getItem();
            l0.n(item3, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
            save = SaversKt.save((SpanStyle) item3, SaversKt.getSpanStyleSaver(), saverScope);
        } else if (i5 == 3) {
            Object item4 = range.getItem();
            l0.n(item4, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
            saver = SaversKt.VerbatimTtsAnnotationSaver;
            save = SaversKt.save((VerbatimTtsAnnotation) item4, saver, saverScope);
        } else if (i5 == 4) {
            Object item5 = range.getItem();
            l0.n(item5, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
            saver2 = SaversKt.UrlAnnotationSaver;
            save = SaversKt.save((UrlAnnotation) item5, saver2, saverScope);
        } else {
            if (i5 != 5) {
                throw new j0();
            }
            save = SaversKt.save(range.getItem());
        }
        r5 = w.r(SaversKt.save(annotationType), save, SaversKt.save(Integer.valueOf(range.getStart())), SaversKt.save(Integer.valueOf(range.getEnd())), SaversKt.save(range.getTag()));
        return r5;
    }
}
