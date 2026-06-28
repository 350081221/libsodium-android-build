package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Density;
import kotlin.i0;
import kotlin.j0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;
import v3.a;

@i0(d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a6\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002\u001a4\u0010\f\u001a\u00020\r*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015H\u0000\u001a*\u0010\u0017\u001a\u00020\r*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\nH\u0000¨\u0006\u001b"}, d2 = {"getCursorRectInScroller", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/Density;", "cursorOffset", "", "transformedText", "Landroidx/compose/ui/text/input/TransformedText;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "rtl", "", "textFieldWidth", "textFieldScroll", "Landroidx/compose/ui/Modifier;", "scrollerPosition", "Landroidx/compose/foundation/text/TextFieldScrollerPosition;", "textFieldValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "textLayoutResultProvider", "Lkotlin/Function0;", "Landroidx/compose/foundation/text/TextLayoutResultProxy;", "textFieldScrollable", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "enabled", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTextFieldScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,371:1\n135#2:372\n*S KotlinDebug\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt\n*L\n61#1:372\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldScrollKt {

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[Orientation.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Orientation.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect getCursorRectInScroller(Density density, int i5, TransformedText transformedText, TextLayoutResult textLayoutResult, boolean z4, int i6) {
        Rect zero;
        float left;
        float left2;
        if (textLayoutResult == null || (zero = textLayoutResult.getCursorRect(transformedText.getOffsetMapping().originalToTransformed(i5))) == null) {
            zero = Rect.Companion.getZero();
        }
        Rect rect = zero;
        int mo298roundToPx0680j_4 = density.mo298roundToPx0680j_4(TextFieldCursorKt.getDefaultCursorThickness());
        if (z4) {
            left = (i6 - rect.getLeft()) - mo298roundToPx0680j_4;
        } else {
            left = rect.getLeft();
        }
        float f5 = left;
        if (z4) {
            left2 = i6 - rect.getLeft();
        } else {
            left2 = rect.getLeft() + mo298roundToPx0680j_4;
        }
        return Rect.copy$default(rect, f5, 0.0f, left2, 0.0f, 10, null);
    }

    @l
    public static final Modifier textFieldScroll(@l Modifier modifier, @l TextFieldScrollerPosition textFieldScrollerPosition, @l TextFieldValue textFieldValue, @l VisualTransformation visualTransformation, @l a<TextLayoutResultProxy> aVar) {
        Modifier verticalScrollLayoutModifier;
        Orientation orientation = textFieldScrollerPosition.getOrientation();
        int m916getOffsetToFollow5zctL8 = textFieldScrollerPosition.m916getOffsetToFollow5zctL8(textFieldValue.m5783getSelectiond9O1mEE());
        textFieldScrollerPosition.m918setPreviousSelection5zctL8(textFieldValue.m5783getSelectiond9O1mEE());
        TransformedText filterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation, textFieldValue.getAnnotatedString());
        int i5 = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i5 != 1) {
            if (i5 == 2) {
                verticalScrollLayoutModifier = new HorizontalScrollLayoutModifier(textFieldScrollerPosition, m916getOffsetToFollow5zctL8, filterWithValidation, aVar);
            } else {
                throw new j0();
            }
        } else {
            verticalScrollLayoutModifier = new VerticalScrollLayoutModifier(textFieldScrollerPosition, m916getOffsetToFollow5zctL8, filterWithValidation, aVar);
        }
        return ClipKt.clipToBounds(modifier).then(verticalScrollLayoutModifier);
    }

    @l
    public static final Modifier textFieldScrollable(@l Modifier modifier, @l TextFieldScrollerPosition textFieldScrollerPosition, @m MutableInteractionSource mutableInteractionSource, boolean z4) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new TextFieldScrollKt$textFieldScrollable$$inlined$debugInspectorInfo$1(textFieldScrollerPosition, mutableInteractionSource, z4);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, noInspectorInfo, new TextFieldScrollKt$textFieldScrollable$2(textFieldScrollerPosition, z4, mutableInteractionSource));
    }

    public static /* synthetic */ Modifier textFieldScrollable$default(Modifier modifier, TextFieldScrollerPosition textFieldScrollerPosition, MutableInteractionSource mutableInteractionSource, boolean z4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            mutableInteractionSource = null;
        }
        if ((i5 & 4) != 0) {
            z4 = true;
        }
        return textFieldScrollable(modifier, textFieldScrollerPosition, mutableInteractionSource, z4);
    }
}
