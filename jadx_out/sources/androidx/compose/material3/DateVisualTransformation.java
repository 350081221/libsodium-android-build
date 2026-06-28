package androidx.compose.material3;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.jvm.internal.r1;

@kotlin.i0(d1 = {"\u0000+\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\b\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Landroidx/compose/material3/DateVisualTransformation;", "Landroidx/compose/ui/text/input/VisualTransformation;", "dateInputFormat", "Landroidx/compose/material3/DateInputFormat;", "(Landroidx/compose/material3/DateInputFormat;)V", "dateFormatLength", "", "dateOffsetTranslator", "androidx/compose/material3/DateVisualTransformation$dateOffsetTranslator$1", "Landroidx/compose/material3/DateVisualTransformation$dateOffsetTranslator$1;", "firstDelimiterOffset", "secondDelimiterOffset", "filter", "Landroidx/compose/ui/text/input/TransformedText;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nDateInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateInput.kt\nandroidx/compose/material3/DateVisualTransformation\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,377:1\n1183#2,3:378\n*S KotlinDebug\n*F\n+ 1 DateInput.kt\nandroidx/compose/material3/DateVisualTransformation\n*L\n358#1:378,3\n*E\n"})
/* loaded from: classes.dex */
final class DateVisualTransformation implements VisualTransformation {
    private final int dateFormatLength;

    @p4.l
    private final DateInputFormat dateInputFormat;

    @p4.l
    private final DateVisualTransformation$dateOffsetTranslator$1 dateOffsetTranslator;
    private final int firstDelimiterOffset;
    private final int secondDelimiterOffset;

    /* JADX WARN: Type inference failed for: r8v3, types: [androidx.compose.material3.DateVisualTransformation$dateOffsetTranslator$1] */
    public DateVisualTransformation(@p4.l DateInputFormat dateInputFormat) {
        int o32;
        int C3;
        this.dateInputFormat = dateInputFormat;
        o32 = kotlin.text.f0.o3(dateInputFormat.getPatternWithDelimiters(), dateInputFormat.getDelimiter(), 0, false, 6, null);
        this.firstDelimiterOffset = o32;
        C3 = kotlin.text.f0.C3(dateInputFormat.getPatternWithDelimiters(), dateInputFormat.getDelimiter(), 0, false, 6, null);
        this.secondDelimiterOffset = C3;
        this.dateFormatLength = dateInputFormat.getPatternWithoutDelimiters().length();
        this.dateOffsetTranslator = new OffsetMapping() { // from class: androidx.compose.material3.DateVisualTransformation$dateOffsetTranslator$1
            @Override // androidx.compose.ui.text.input.OffsetMapping
            public int originalToTransformed(int i5) {
                int i6;
                int i7;
                int i8;
                i6 = DateVisualTransformation.this.firstDelimiterOffset;
                if (i5 >= i6) {
                    i7 = DateVisualTransformation.this.secondDelimiterOffset;
                    if (i5 < i7) {
                        return i5 + 1;
                    }
                    i8 = DateVisualTransformation.this.dateFormatLength;
                    if (i5 > i8) {
                        i5 = DateVisualTransformation.this.dateFormatLength;
                    }
                    return i5 + 2;
                }
                return i5;
            }

            @Override // androidx.compose.ui.text.input.OffsetMapping
            public int transformedToOriginal(int i5) {
                int i6;
                int i7;
                int i8;
                int i9;
                i6 = DateVisualTransformation.this.firstDelimiterOffset;
                if (i5 > i6 - 1) {
                    i7 = DateVisualTransformation.this.secondDelimiterOffset;
                    if (i5 <= i7 - 1) {
                        return i5 - 1;
                    }
                    i8 = DateVisualTransformation.this.dateFormatLength;
                    if (i5 <= i8 + 1) {
                        return i5 - 2;
                    }
                    i9 = DateVisualTransformation.this.dateFormatLength;
                    return i9;
                }
                return i5;
            }
        };
    }

    @Override // androidx.compose.ui.text.input.VisualTransformation
    @p4.l
    public TransformedText filter(@p4.l AnnotatedString annotatedString) {
        String text;
        kotlin.ranges.l W1;
        int i5 = 0;
        if (annotatedString.getText().length() > this.dateFormatLength) {
            String text2 = annotatedString.getText();
            W1 = kotlin.ranges.u.W1(0, this.dateFormatLength);
            text = kotlin.text.f0.i5(text2, W1);
        } else {
            text = annotatedString.getText();
        }
        String str = "";
        int i6 = 0;
        while (i5 < text.length()) {
            int i7 = i6 + 1;
            String str2 = str + text.charAt(i5);
            if (i7 != this.firstDelimiterOffset && i6 + 2 != this.secondDelimiterOffset) {
                str = str2;
            } else {
                str = str2 + this.dateInputFormat.getDelimiter();
            }
            i5++;
            i6 = i7;
        }
        return new TransformedText(new AnnotatedString(str, null, null, 6, null), this.dateOffsetTranslator);
    }
}
