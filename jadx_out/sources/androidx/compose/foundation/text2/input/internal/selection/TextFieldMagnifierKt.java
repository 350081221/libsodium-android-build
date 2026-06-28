package androidx.compose.foundation.text2.input.internal.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.foundation.text2.input.internal.TextLayoutState;
import androidx.compose.foundation.text2.input.internal.TextLayoutStateKt;
import androidx.compose.foundation.text2.input.internal.TransformedTextFieldState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.unit.IntSize;
import kotlin.i0;
import kotlin.j0;
import kotlin.jvm.internal.r1;
import kotlin.ranges.u;
import p4.l;

@i0(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a2\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0000ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"calculateSelectionMagnifierCenterAndroid", "Landroidx/compose/ui/geometry/Offset;", "textFieldState", "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;", "selectionState", "Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;", "textLayoutState", "Landroidx/compose/foundation/text2/input/internal/TextLayoutState;", "magnifierSize", "Landroidx/compose/ui/unit/IntSize;", "calculateSelectionMagnifierCenterAndroid-hUlJWOE", "(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Landroidx/compose/foundation/text2/input/internal/TextLayoutState;J)J", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTextFieldMagnifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldMagnifier.kt\nandroidx/compose/foundation/text2/input/internal/selection/TextFieldMagnifierKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,118:1\n1#2:119\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldMagnifierKt {

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Handle.values().length];
            try {
                iArr[Handle.Cursor.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Handle.SelectionStart.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Handle.SelectionEnd.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: calculateSelectionMagnifierCenterAndroid-hUlJWOE, reason: not valid java name */
    public static final long m1157calculateSelectionMagnifierCenterAndroidhUlJWOE(@l TransformedTextFieldState transformedTextFieldState, @l TextFieldSelectionState textFieldSelectionState, @l TextLayoutState textLayoutState, long j5) {
        boolean z4;
        int i5;
        int m5545getStartimpl;
        float H;
        long m1179getHandleDragPositionF1C5BW0 = textFieldSelectionState.m1179getHandleDragPositionF1C5BW0();
        if (!OffsetKt.m3514isUnspecifiedk4lQ0M(m1179getHandleDragPositionF1C5BW0)) {
            if (transformedTextFieldState.getText().length() == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                long mo1076getSelectionInCharsd9O1mEE = transformedTextFieldState.getText().mo1076getSelectionInCharsd9O1mEE();
                Handle draggingHandle = textFieldSelectionState.getDraggingHandle();
                if (draggingHandle == null) {
                    i5 = -1;
                } else {
                    i5 = WhenMappings.$EnumSwitchMapping$0[draggingHandle.ordinal()];
                }
                if (i5 != -1) {
                    if (i5 != 1 && i5 != 2) {
                        if (i5 == 3) {
                            m5545getStartimpl = TextRange.m5540getEndimpl(mo1076getSelectionInCharsd9O1mEE);
                        } else {
                            throw new j0();
                        }
                    } else {
                        m5545getStartimpl = TextRange.m5545getStartimpl(mo1076getSelectionInCharsd9O1mEE);
                    }
                    TextLayoutResult layoutResult = textLayoutState.getLayoutResult();
                    if (layoutResult == null) {
                        return Offset.Companion.m3508getUnspecifiedF1C5BW0();
                    }
                    float m3493getXimpl = Offset.m3493getXimpl(m1179getHandleDragPositionF1C5BW0);
                    int lineForOffset = layoutResult.getLineForOffset(m5545getStartimpl);
                    float lineLeft = layoutResult.getLineLeft(lineForOffset);
                    float lineRight = layoutResult.getLineRight(lineForOffset);
                    H = u.H(m3493getXimpl, Math.min(lineLeft, lineRight), Math.max(lineLeft, lineRight));
                    if (Math.abs(m3493getXimpl - H) > IntSize.m6214getWidthimpl(j5) / 2) {
                        return Offset.Companion.m3508getUnspecifiedF1C5BW0();
                    }
                    float lineTop = layoutResult.getLineTop(lineForOffset);
                    long Offset = OffsetKt.Offset(H, ((layoutResult.getLineBottom(lineForOffset) - lineTop) / 2) + lineTop);
                    LayoutCoordinates textLayoutNodeCoordinates = textLayoutState.getTextLayoutNodeCoordinates();
                    if (textLayoutNodeCoordinates != null) {
                        if (!textLayoutNodeCoordinates.isAttached()) {
                            textLayoutNodeCoordinates = null;
                        }
                        if (textLayoutNodeCoordinates != null) {
                            Offset = TextLayoutStateKt.m1136coerceIn3MmeM6k(Offset, SelectionManagerKt.visibleBounds(textLayoutNodeCoordinates));
                        }
                    }
                    return TextLayoutStateKt.m1138fromTextLayoutToCoreUv8p0NA(textLayoutState, Offset);
                }
                return Offset.Companion.m3508getUnspecifiedF1C5BW0();
            }
        }
        return Offset.Companion.m3508getUnspecifiedF1C5BW0();
    }
}
