package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextPainter;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.umeng.analytics.pro.d;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.w;
import kotlin.p1;
import kotlin.r2;
import p4.l;
import t0.b;
import u3.m;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/text/TextFieldDelegate;", "", "()V", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldDelegate {
    public static final int $stable = 0;

    @l
    public static final Companion Companion = new Companion(null);

    @i0(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bO\u0010PJH\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0001ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ7\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJG\u0010$\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\"\u0010#J/\u0010)\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020&H\u0001¢\u0006\u0004\b'\u0010(JC\u00104\u001a\u00020\u00182\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010.\u001a\u00020-2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00180/2\b\u00101\u001a\u0004\u0018\u00010\u001eH\u0001¢\u0006\u0004\b2\u00103JF\u00109\u001a\u00020\u00182\u0006\u00106\u001a\u0002052\u0006\u0010\u0015\u001a\u00020&2\u0006\u0010.\u001a\u00020-2\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00180/H\u0001ø\u0001\u0000¢\u0006\u0004\b7\u00108JW\u0010B\u001a\u00020\u001e2\u0006\u0010;\u001a\u00020:2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010.\u001a\u00020-2\u0006\u0010=\u001a\u00020<2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00180/2\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\u00180/H\u0001¢\u0006\u0004\b@\u0010AJW\u0010D\u001a\u00020\u001e2\u0006\u0010;\u001a\u00020:2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010.\u001a\u00020-2\u0006\u0010=\u001a\u00020<2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00180/2\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\u00180/H\u0001¢\u0006\u0004\bC\u0010AJ3\u0010G\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020-2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00180/H\u0001¢\u0006\u0004\bE\u0010FJ \u0010N\u001a\u00020J2\u0006\u0010I\u001a\u00020H2\u0006\u0010K\u001a\u00020Jø\u0001\u0000¢\u0006\u0004\bL\u0010M\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006Q"}, d2 = {"Landroidx/compose/foundation/text/TextFieldDelegate$Companion;", "", "Landroidx/compose/foundation/text/TextDelegate;", "textDelegate", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/text/TextLayoutResult;", "prevResultText", "Lkotlin/p1;", "", "layout-_EkL_-Y$foundation_release", "(Landroidx/compose/foundation/text/TextDelegate;JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/TextLayoutResult;)Lkotlin/p1;", "layout", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "Landroidx/compose/ui/text/input/TextFieldValue;", b.f22420d, "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "textLayoutResult", "Landroidx/compose/ui/graphics/Paint;", "selectionPaint", "Lkotlin/r2;", "draw$foundation_release", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/graphics/Paint;)V", MediationConstant.RIT_TYPE_DRAW, "Landroidx/compose/ui/layout/LayoutCoordinates;", "layoutCoordinates", "Landroidx/compose/ui/text/input/TextInputSession;", "textInputSession", "", "hasFocus", "notifyFocusedRect$foundation_release", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/foundation/text/TextDelegate;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/text/input/TextInputSession;ZLandroidx/compose/ui/text/input/OffsetMapping;)V", "notifyFocusedRect", "textFieldValue", "Landroidx/compose/foundation/text/TextLayoutResultProxy;", "updateTextLayoutResult$foundation_release", "(Landroidx/compose/ui/text/input/TextInputSession;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/TextLayoutResultProxy;)V", "updateTextLayoutResult", "", "Landroidx/compose/ui/text/input/EditCommand;", "ops", "Landroidx/compose/ui/text/input/EditProcessor;", "editProcessor", "Lkotlin/Function1;", "onValueChange", d.aC, "onEditCommand$foundation_release", "(Ljava/util/List;Landroidx/compose/ui/text/input/EditProcessor;Lv3/l;Landroidx/compose/ui/text/input/TextInputSession;)V", "onEditCommand", "Landroidx/compose/ui/geometry/Offset;", "position", "setCursorOffset-ULxng0E$foundation_release", "(JLandroidx/compose/foundation/text/TextLayoutResultProxy;Landroidx/compose/ui/text/input/EditProcessor;Landroidx/compose/ui/text/input/OffsetMapping;Lv3/l;)V", "setCursorOffset", "Landroidx/compose/ui/text/input/TextInputService;", "textInputService", "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "Landroidx/compose/ui/text/input/ImeAction;", "onImeActionPerformed", "restartInput$foundation_release", "(Landroidx/compose/ui/text/input/TextInputService;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/EditProcessor;Landroidx/compose/ui/text/input/ImeOptions;Lv3/l;Lv3/l;)Landroidx/compose/ui/text/input/TextInputSession;", "restartInput", "onFocus$foundation_release", "onFocus", "onBlur$foundation_release", "(Landroidx/compose/ui/text/input/TextInputSession;Landroidx/compose/ui/text/input/EditProcessor;Lv3/l;)V", "onBlur", "Landroidx/compose/ui/text/TextRange;", "compositionRange", "Landroidx/compose/ui/text/input/TransformedText;", "transformed", "applyCompositionDecoration-72CqOWE", "(JLandroidx/compose/ui/text/input/TransformedText;)Landroidx/compose/ui/text/input/TransformedText;", "applyCompositionDecoration", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        /* renamed from: layout-_EkL_-Y$foundation_release$default, reason: not valid java name */
        public static /* synthetic */ p1 m900layout_EkL_Y$foundation_release$default(Companion companion, TextDelegate textDelegate, long j5, LayoutDirection layoutDirection, TextLayoutResult textLayoutResult, int i5, Object obj) {
            if ((i5 & 8) != 0) {
                textLayoutResult = null;
            }
            return companion.m902layout_EkL_Y$foundation_release(textDelegate, j5, layoutDirection, textLayoutResult);
        }

        @l
        /* renamed from: applyCompositionDecoration-72CqOWE, reason: not valid java name */
        public final TransformedText m901applyCompositionDecoration72CqOWE(long j5, @l TransformedText transformedText) {
            int originalToTransformed = transformedText.getOffsetMapping().originalToTransformed(TextRange.m5545getStartimpl(j5));
            int originalToTransformed2 = transformedText.getOffsetMapping().originalToTransformed(TextRange.m5540getEndimpl(j5));
            int min = Math.min(originalToTransformed, originalToTransformed2);
            int max = Math.max(originalToTransformed, originalToTransformed2);
            AnnotatedString.Builder builder = new AnnotatedString.Builder(transformedText.getText());
            builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.Companion.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61439, (w) null), min, max);
            return new TransformedText(builder.toAnnotatedString(), transformedText.getOffsetMapping());
        }

        @m
        public final void draw$foundation_release(@l Canvas canvas, @l TextFieldValue textFieldValue, @l OffsetMapping offsetMapping, @l TextLayoutResult textLayoutResult, @l Paint paint) {
            int originalToTransformed;
            int originalToTransformed2;
            if (!TextRange.m5539getCollapsedimpl(textFieldValue.m5783getSelectiond9O1mEE()) && (originalToTransformed = offsetMapping.originalToTransformed(TextRange.m5543getMinimpl(textFieldValue.m5783getSelectiond9O1mEE()))) != (originalToTransformed2 = offsetMapping.originalToTransformed(TextRange.m5542getMaximpl(textFieldValue.m5783getSelectiond9O1mEE())))) {
                canvas.drawPath(textLayoutResult.getPathForRange(originalToTransformed, originalToTransformed2), paint);
            }
            TextPainter.INSTANCE.paint(canvas, textLayoutResult);
        }

        @l
        @m
        /* renamed from: layout-_EkL_-Y$foundation_release, reason: not valid java name */
        public final p1<Integer, Integer, TextLayoutResult> m902layout_EkL_Y$foundation_release(@l TextDelegate textDelegate, long j5, @l LayoutDirection layoutDirection, @p4.m TextLayoutResult textLayoutResult) {
            TextLayoutResult m892layoutNN6EwU = textDelegate.m892layoutNN6EwU(j5, layoutDirection, textLayoutResult);
            return new p1<>(Integer.valueOf(IntSize.m6214getWidthimpl(m892layoutNN6EwU.m5518getSizeYbymL2g())), Integer.valueOf(IntSize.m6213getHeightimpl(m892layoutNN6EwU.m5518getSizeYbymL2g())), m892layoutNN6EwU);
        }

        @m
        public final void notifyFocusedRect$foundation_release(@l TextFieldValue textFieldValue, @l TextDelegate textDelegate, @l TextLayoutResult textLayoutResult, @l LayoutCoordinates layoutCoordinates, @l TextInputSession textInputSession, boolean z4, @l OffsetMapping offsetMapping) {
            Rect rect;
            if (!z4) {
                return;
            }
            int originalToTransformed = offsetMapping.originalToTransformed(TextRange.m5542getMaximpl(textFieldValue.m5783getSelectiond9O1mEE()));
            if (originalToTransformed < textLayoutResult.getLayoutInput().getText().length()) {
                rect = textLayoutResult.getBoundingBox(originalToTransformed);
            } else if (originalToTransformed != 0) {
                rect = textLayoutResult.getBoundingBox(originalToTransformed - 1);
            } else {
                rect = new Rect(0.0f, 0.0f, 1.0f, IntSize.m6213getHeightimpl(TextFieldDelegateKt.computeSizeForDefaultText$default(textDelegate.getStyle(), textDelegate.getDensity(), textDelegate.getFontFamilyResolver(), null, 0, 24, null)));
            }
            long mo5007localToRootMKHz9U = layoutCoordinates.mo5007localToRootMKHz9U(OffsetKt.Offset(rect.getLeft(), rect.getTop()));
            textInputSession.notifyFocusedRect(RectKt.m3533Recttz77jQw(OffsetKt.Offset(Offset.m3493getXimpl(mo5007localToRootMKHz9U), Offset.m3494getYimpl(mo5007localToRootMKHz9U)), SizeKt.Size(rect.getWidth(), rect.getHeight())));
        }

        @m
        public final void onBlur$foundation_release(@l TextInputSession textInputSession, @l EditProcessor editProcessor, @l v3.l<? super TextFieldValue, r2> lVar) {
            lVar.invoke(TextFieldValue.m5778copy3r_uNRQ$default(editProcessor.toTextFieldValue(), (AnnotatedString) null, 0L, (TextRange) null, 3, (Object) null));
            textInputSession.dispose();
        }

        @m
        public final void onEditCommand$foundation_release(@l List<? extends EditCommand> list, @l EditProcessor editProcessor, @l v3.l<? super TextFieldValue, r2> lVar, @p4.m TextInputSession textInputSession) {
            TextFieldValue apply = editProcessor.apply(list);
            if (textInputSession != null) {
                textInputSession.updateState(null, apply);
            }
            lVar.invoke(apply);
        }

        @l
        @m
        public final TextInputSession onFocus$foundation_release(@l TextInputService textInputService, @l TextFieldValue textFieldValue, @l EditProcessor editProcessor, @l ImeOptions imeOptions, @l v3.l<? super TextFieldValue, r2> lVar, @l v3.l<? super ImeAction, r2> lVar2) {
            return restartInput$foundation_release(textInputService, textFieldValue, editProcessor, imeOptions, lVar, lVar2);
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [T, androidx.compose.ui.text.input.TextInputSession] */
        @l
        @m
        public final TextInputSession restartInput$foundation_release(@l TextInputService textInputService, @l TextFieldValue textFieldValue, @l EditProcessor editProcessor, @l ImeOptions imeOptions, @l v3.l<? super TextFieldValue, r2> lVar, @l v3.l<? super ImeAction, r2> lVar2) {
            k1.h hVar = new k1.h();
            ?? startInput = textInputService.startInput(textFieldValue, imeOptions, new TextFieldDelegate$Companion$restartInput$1(editProcessor, lVar, hVar), lVar2);
            hVar.element = startInput;
            return startInput;
        }

        @m
        /* renamed from: setCursorOffset-ULxng0E$foundation_release, reason: not valid java name */
        public final void m903setCursorOffsetULxng0E$foundation_release(long j5, @l TextLayoutResultProxy textLayoutResultProxy, @l EditProcessor editProcessor, @l OffsetMapping offsetMapping, @l v3.l<? super TextFieldValue, r2> lVar) {
            lVar.invoke(TextFieldValue.m5778copy3r_uNRQ$default(editProcessor.toTextFieldValue(), (AnnotatedString) null, TextRangeKt.TextRange(offsetMapping.transformedToOriginal(TextLayoutResultProxy.m928getOffsetForPosition3MmeM6k$default(textLayoutResultProxy, j5, false, 2, null))), (TextRange) null, 5, (Object) null));
        }

        @m
        public final void updateTextLayoutResult$foundation_release(@l TextInputSession textInputSession, @l TextFieldValue textFieldValue, @l OffsetMapping offsetMapping, @l TextLayoutResultProxy textLayoutResultProxy) {
            LayoutCoordinates decorationBoxCoordinates;
            LayoutCoordinates innerTextFieldCoordinates = textLayoutResultProxy.getInnerTextFieldCoordinates();
            if (innerTextFieldCoordinates != null && innerTextFieldCoordinates.isAttached() && (decorationBoxCoordinates = textLayoutResultProxy.getDecorationBoxCoordinates()) != null) {
                textInputSession.updateTextLayoutResult(textFieldValue, offsetMapping, textLayoutResultProxy.getValue(), new TextFieldDelegate$Companion$updateTextLayoutResult$1$1$1(innerTextFieldCoordinates), SelectionManagerKt.visibleBounds(innerTextFieldCoordinates), innerTextFieldCoordinates.localBoundingBoxOf(decorationBoxCoordinates, false));
            }
        }
    }
}
