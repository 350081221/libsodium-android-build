package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.SetSelectionCommand;
import androidx.compose.ui.text.input.TextFieldValue;
import java.util.List;
import kotlin.collections.v;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B-\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0014\u0010\u0005\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J)\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\n2\u0019\u0010\t\u001a\u0015\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\u0002\b\bJ\u0006\u0010\f\u001a\u00020\u0000J\u0006\u0010\r\u001a\u00020\u0000R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0018\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0012¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/text/selection/TextFieldPreparedSelection;", "Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;", "Landroidx/compose/foundation/text/TextLayoutResultProxy;", "", "pagesAmount", "jumpByPagesOffset", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/EditCommand;", "Lkotlin/u;", "or", "", "deleteIfSelectedOr", "moveCursorUpByPage", "moveCursorDownByPage", "Landroidx/compose/ui/text/input/TextFieldValue;", "currentValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "getCurrentValue", "()Landroidx/compose/ui/text/input/TextFieldValue;", "layoutResultProxy", "Landroidx/compose/foundation/text/TextLayoutResultProxy;", "getLayoutResultProxy", "()Landroidx/compose/foundation/text/TextLayoutResultProxy;", "getValue", t0.b.f22420d, "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "state", "<init>", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/TextLayoutResultProxy;Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nTextPreparedSelection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/selection/TextFieldPreparedSelection\n+ 2 TextPreparedSelection.kt\nandroidx/compose/foundation/text/selection/BaseTextPreparedSelection\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,437:1\n74#2,5:438\n80#2:444\n74#2,7:445\n1#3:443\n*S KotlinDebug\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/selection/TextFieldPreparedSelection\n*L\n412#1:438,5\n412#1:444\n416#1:445,7\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldPreparedSelection extends BaseTextPreparedSelection<TextFieldPreparedSelection> {
    public static final int $stable = 8;

    @l
    private final TextFieldValue currentValue;

    @m
    private final TextLayoutResultProxy layoutResultProxy;

    public /* synthetic */ TextFieldPreparedSelection(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResultProxy textLayoutResultProxy, TextPreparedSelectionState textPreparedSelectionState, int i5, w wVar) {
        this(textFieldValue, (i5 & 2) != 0 ? OffsetMapping.Companion.getIdentity() : offsetMapping, textLayoutResultProxy, (i5 & 8) != 0 ? new TextPreparedSelectionState() : textPreparedSelectionState);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r2 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int jumpByPagesOffset(androidx.compose.foundation.text.TextLayoutResultProxy r6, int r7) {
        /*
            r5 = this;
            androidx.compose.ui.layout.LayoutCoordinates r0 = r6.getInnerTextFieldCoordinates()
            if (r0 == 0) goto L15
            androidx.compose.ui.layout.LayoutCoordinates r1 = r6.getDecorationBoxCoordinates()
            r2 = 0
            if (r1 == 0) goto L13
            r3 = 0
            r4 = 2
            androidx.compose.ui.geometry.Rect r2 = androidx.compose.ui.layout.LayoutCoordinates.localBoundingBoxOf$default(r1, r0, r3, r4, r2)
        L13:
            if (r2 != 0) goto L1b
        L15:
            androidx.compose.ui.geometry.Rect$Companion r0 = androidx.compose.ui.geometry.Rect.Companion
            androidx.compose.ui.geometry.Rect r2 = r0.getZero()
        L1b:
            androidx.compose.ui.text.input.OffsetMapping r0 = r5.getOffsetMapping()
            androidx.compose.ui.text.input.TextFieldValue r1 = r5.currentValue
            long r3 = r1.m5783getSelectiond9O1mEE()
            int r1 = androidx.compose.ui.text.TextRange.m5540getEndimpl(r3)
            int r0 = r0.originalToTransformed(r1)
            androidx.compose.ui.text.TextLayoutResult r1 = r6.getValue()
            androidx.compose.ui.geometry.Rect r0 = r1.getCursorRect(r0)
            float r1 = r0.getLeft()
            float r0 = r0.getTop()
            long r2 = r2.m3526getSizeNHjbRc()
            float r2 = androidx.compose.ui.geometry.Size.m3559getHeightimpl(r2)
            float r7 = (float) r7
            float r2 = r2 * r7
            float r0 = r0 + r2
            androidx.compose.ui.text.input.OffsetMapping r7 = r5.getOffsetMapping()
            androidx.compose.ui.text.TextLayoutResult r6 = r6.getValue()
            long r0 = androidx.compose.ui.geometry.OffsetKt.Offset(r1, r0)
            int r6 = r6.m5517getOffsetForPositionk4lQ0M(r0)
            int r6 = r7.transformedToOriginal(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextFieldPreparedSelection.jumpByPagesOffset(androidx.compose.foundation.text.TextLayoutResultProxy, int):int");
    }

    @m
    public final List<EditCommand> deleteIfSelectedOr(@l v3.l<? super TextFieldPreparedSelection, ? extends EditCommand> lVar) {
        List<EditCommand> L;
        List<EditCommand> k5;
        if (TextRange.m5539getCollapsedimpl(m976getSelectiond9O1mEE())) {
            EditCommand invoke = lVar.invoke(this);
            if (invoke != null) {
                k5 = v.k(invoke);
                return k5;
            }
            return null;
        }
        L = kotlin.collections.w.L(new CommitTextCommand("", 0), new SetSelectionCommand(TextRange.m5543getMinimpl(m976getSelectiond9O1mEE()), TextRange.m5543getMinimpl(m976getSelectiond9O1mEE())));
        return L;
    }

    @l
    public final TextFieldValue getCurrentValue() {
        return this.currentValue;
    }

    @m
    public final TextLayoutResultProxy getLayoutResultProxy() {
        return this.layoutResultProxy;
    }

    @l
    public final TextFieldValue getValue() {
        return TextFieldValue.m5778copy3r_uNRQ$default(this.currentValue, getAnnotatedString(), m976getSelectiond9O1mEE(), (TextRange) null, 4, (Object) null);
    }

    @l
    public final TextFieldPreparedSelection moveCursorDownByPage() {
        boolean z4;
        TextLayoutResultProxy textLayoutResultProxy;
        if (getText$foundation_release().length() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 && (textLayoutResultProxy = this.layoutResultProxy) != null) {
            setCursor(jumpByPagesOffset(textLayoutResultProxy, 1));
        }
        l0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @l
    public final TextFieldPreparedSelection moveCursorUpByPage() {
        boolean z4;
        TextLayoutResultProxy textLayoutResultProxy;
        if (getText$foundation_release().length() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 && (textLayoutResultProxy = this.layoutResultProxy) != null) {
            setCursor(jumpByPagesOffset(textLayoutResultProxy, -1));
        }
        l0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public TextFieldPreparedSelection(@l TextFieldValue textFieldValue, @l OffsetMapping offsetMapping, @m TextLayoutResultProxy textLayoutResultProxy, @l TextPreparedSelectionState textPreparedSelectionState) {
        super(textFieldValue.getAnnotatedString(), textFieldValue.m5783getSelectiond9O1mEE(), textLayoutResultProxy != null ? textLayoutResultProxy.getValue() : null, offsetMapping, textPreparedSelectionState, null);
        this.currentValue = textFieldValue;
        this.layoutResultProxy = textLayoutResultProxy;
    }
}
