package androidx.compose.foundation.text;

import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.unit.Constraints;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;
import v3.a;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0082\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\r\u0012\u0006\u0010\u0016\u001a\u00020\u000f\u0012\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011¢\u0006\u0004\b,\u0010-J&\u0010\n\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\u000e\u001a\u00020\rHÆ\u0003J\t\u0010\u0010\u001a\u00020\u000fHÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011HÆ\u0003J9\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\u000f2\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011HÆ\u0001J\t\u0010\u001a\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001b\u001a\u00020\rHÖ\u0001J\u0013\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003R\u0017\u0010\u0014\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0015\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0015\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0016\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0016\u0010&\u001a\u0004\b'\u0010(R\u001f\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0017\u0010)\u001a\u0004\b*\u0010+\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006."}, d2 = {"Landroidx/compose/foundation/text/HorizontalScrollLayoutModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/foundation/text/TextFieldScrollerPosition;", "component1", "", "component2", "Landroidx/compose/ui/text/input/TransformedText;", "component3", "Lkotlin/Function0;", "Landroidx/compose/foundation/text/TextLayoutResultProxy;", "component4", "scrollerPosition", "cursorOffset", "transformedText", "textLayoutResultProvider", "copy", "", "toString", TTDownloadField.TT_HASHCODE, "", "other", "", "equals", "Landroidx/compose/foundation/text/TextFieldScrollerPosition;", "getScrollerPosition", "()Landroidx/compose/foundation/text/TextFieldScrollerPosition;", "I", "getCursorOffset", "()I", "Landroidx/compose/ui/text/input/TransformedText;", "getTransformedText", "()Landroidx/compose/ui/text/input/TransformedText;", "Lv3/a;", "getTextLayoutResultProvider", "()Lv3/a;", "<init>", "(Landroidx/compose/foundation/text/TextFieldScrollerPosition;ILandroidx/compose/ui/text/input/TransformedText;Lv3/a;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class HorizontalScrollLayoutModifier implements LayoutModifier {
    private final int cursorOffset;

    @l
    private final TextFieldScrollerPosition scrollerPosition;

    @l
    private final a<TextLayoutResultProxy> textLayoutResultProvider;

    @l
    private final TransformedText transformedText;

    public HorizontalScrollLayoutModifier(@l TextFieldScrollerPosition textFieldScrollerPosition, int i5, @l TransformedText transformedText, @l a<TextLayoutResultProxy> aVar) {
        this.scrollerPosition = textFieldScrollerPosition;
        this.cursorOffset = i5;
        this.transformedText = transformedText;
        this.textLayoutResultProvider = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HorizontalScrollLayoutModifier copy$default(HorizontalScrollLayoutModifier horizontalScrollLayoutModifier, TextFieldScrollerPosition textFieldScrollerPosition, int i5, TransformedText transformedText, a aVar, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            textFieldScrollerPosition = horizontalScrollLayoutModifier.scrollerPosition;
        }
        if ((i6 & 2) != 0) {
            i5 = horizontalScrollLayoutModifier.cursorOffset;
        }
        if ((i6 & 4) != 0) {
            transformedText = horizontalScrollLayoutModifier.transformedText;
        }
        if ((i6 & 8) != 0) {
            aVar = horizontalScrollLayoutModifier.textLayoutResultProvider;
        }
        return horizontalScrollLayoutModifier.copy(textFieldScrollerPosition, i5, transformedText, aVar);
    }

    @l
    public final TextFieldScrollerPosition component1() {
        return this.scrollerPosition;
    }

    public final int component2() {
        return this.cursorOffset;
    }

    @l
    public final TransformedText component3() {
        return this.transformedText;
    }

    @l
    public final a<TextLayoutResultProxy> component4() {
        return this.textLayoutResultProvider;
    }

    @l
    public final HorizontalScrollLayoutModifier copy(@l TextFieldScrollerPosition textFieldScrollerPosition, int i5, @l TransformedText transformedText, @l a<TextLayoutResultProxy> aVar) {
        return new HorizontalScrollLayoutModifier(textFieldScrollerPosition, i5, transformedText, aVar);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HorizontalScrollLayoutModifier)) {
            return false;
        }
        HorizontalScrollLayoutModifier horizontalScrollLayoutModifier = (HorizontalScrollLayoutModifier) obj;
        return l0.g(this.scrollerPosition, horizontalScrollLayoutModifier.scrollerPosition) && this.cursorOffset == horizontalScrollLayoutModifier.cursorOffset && l0.g(this.transformedText, horizontalScrollLayoutModifier.transformedText) && l0.g(this.textLayoutResultProvider, horizontalScrollLayoutModifier.textLayoutResultProvider);
    }

    public final int getCursorOffset() {
        return this.cursorOffset;
    }

    @l
    public final TextFieldScrollerPosition getScrollerPosition() {
        return this.scrollerPosition;
    }

    @l
    public final a<TextLayoutResultProxy> getTextLayoutResultProvider() {
        return this.textLayoutResultProvider;
    }

    @l
    public final TransformedText getTransformedText() {
        return this.transformedText;
    }

    public int hashCode() {
        return (((((this.scrollerPosition.hashCode() * 31) + Integer.hashCode(this.cursorOffset)) * 31) + this.transformedText.hashCode()) * 31) + this.textLayoutResultProvider.hashCode();
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    @l
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo56measure3p2s80s(@l MeasureScope measureScope, @l Measurable measurable, long j5) {
        long m5991copyZbe2FdA$default;
        if (measurable.maxIntrinsicWidth(Constraints.m5999getMaxHeightimpl(j5)) < Constraints.m6000getMaxWidthimpl(j5)) {
            m5991copyZbe2FdA$default = j5;
        } else {
            m5991copyZbe2FdA$default = Constraints.m5991copyZbe2FdA$default(j5, 0, Integer.MAX_VALUE, 0, 0, 13, null);
        }
        Placeable mo4998measureBRTryo0 = measurable.mo4998measureBRTryo0(m5991copyZbe2FdA$default);
        int min = Math.min(mo4998measureBRTryo0.getWidth(), Constraints.m6000getMaxWidthimpl(j5));
        return MeasureScope.layout$default(measureScope, min, mo4998measureBRTryo0.getHeight(), null, new HorizontalScrollLayoutModifier$measure$1(measureScope, this, mo4998measureBRTryo0, min), 4, null);
    }

    @l
    public String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.scrollerPosition + ", cursorOffset=" + this.cursorOffset + ", transformedText=" + this.transformedText + ", textLayoutResultProvider=" + this.textLayoutResultProvider + ')';
    }
}
