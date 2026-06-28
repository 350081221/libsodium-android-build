package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.input.OffsetMapping;
import kotlin.i0;
import kotlin.jvm.internal.w;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/foundation/text/selection/TextPreparedSelection;", "Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;", "Landroidx/compose/ui/text/AnnotatedString;", "originalText", "Landroidx/compose/ui/text/TextRange;", "originalSelection", "Landroidx/compose/ui/text/TextLayoutResult;", "layoutResult", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "state", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;JLandroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;Lkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TextPreparedSelection extends BaseTextPreparedSelection<TextPreparedSelection> {
    public static final int $stable = 0;

    public /* synthetic */ TextPreparedSelection(AnnotatedString annotatedString, long j5, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, TextPreparedSelectionState textPreparedSelectionState, int i5, w wVar) {
        this(annotatedString, j5, (i5 & 4) != 0 ? null : textLayoutResult, (i5 & 8) != 0 ? OffsetMapping.Companion.getIdentity() : offsetMapping, (i5 & 16) != 0 ? new TextPreparedSelectionState() : textPreparedSelectionState, null);
    }

    public /* synthetic */ TextPreparedSelection(AnnotatedString annotatedString, long j5, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, TextPreparedSelectionState textPreparedSelectionState, w wVar) {
        this(annotatedString, j5, textLayoutResult, offsetMapping, textPreparedSelectionState);
    }

    private TextPreparedSelection(AnnotatedString annotatedString, long j5, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, TextPreparedSelectionState textPreparedSelectionState) {
        super(annotatedString, j5, textLayoutResult, offsetMapping, textPreparedSelectionState, null);
    }
}
