package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.AnnotatedString;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.w;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import p4.l;
import p4.m;
import v3.p;

@i0(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "Landroidx/compose/ui/text/AnnotatedString;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SaversKt$AnnotatedStringSaver$1 extends n0 implements p<SaverScope, AnnotatedString, Object> {
    public static final SaversKt$AnnotatedStringSaver$1 INSTANCE = new SaversKt$AnnotatedStringSaver$1();

    SaversKt$AnnotatedStringSaver$1() {
        super(2);
    }

    @Override // v3.p
    @m
    public final Object invoke(@l SaverScope saverScope, @l AnnotatedString annotatedString) {
        Saver saver;
        Saver saver2;
        Saver saver3;
        ArrayList r5;
        List<AnnotatedString.Range<SpanStyle>> spanStyles = annotatedString.getSpanStyles();
        saver = SaversKt.AnnotationRangeListSaver;
        List<AnnotatedString.Range<ParagraphStyle>> paragraphStyles = annotatedString.getParagraphStyles();
        saver2 = SaversKt.AnnotationRangeListSaver;
        List<AnnotatedString.Range<? extends Object>> annotations$ui_text_release = annotatedString.getAnnotations$ui_text_release();
        saver3 = SaversKt.AnnotationRangeListSaver;
        r5 = w.r(SaversKt.save(annotatedString.getText()), SaversKt.save(spanStyles, saver, saverScope), SaversKt.save(paragraphStyles, saver2, saverScope), SaversKt.save(annotations$ui_text_release, saver3, saverScope));
        return r5;
    }
}
