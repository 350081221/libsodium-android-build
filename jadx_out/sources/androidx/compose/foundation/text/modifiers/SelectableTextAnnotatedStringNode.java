package androidx.compose.foundation.text.modifiers;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.w;
import kotlin.r2;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B¯\u0001\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010*\u001a\u00020)\u0012\u0016\b\u0002\u0010/\u001a\u0010\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u0007\u0018\u00010-\u0012\b\b\u0002\u0010,\u001a\u00020+\u0012\b\b\u0002\u0010(\u001a\u00020'\u0012\b\b\u0002\u0010&\u001a\u00020\u0016\u0012\b\b\u0002\u0010%\u001a\u00020\u0016\u0012\u0016\b\u0002\u0010$\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"\u0018\u00010!\u0012\u001e\b\u0002\u00101\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001000!\u0012\u0004\u0012\u00020\u0007\u0018\u00010-\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000102\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u000104¢\u0006\u0004\b>\u0010?J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\f\u0010\n\u001a\u00020\u0007*\u00020\tH\u0016J&\u0010\u0013\u001a\u00020\u0010*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001c\u0010\u0018\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\r\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u001c\u0010\u001a\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\r\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0016H\u0016J\u001c\u0010\u001b\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\r\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u001c\u0010\u001c\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\r\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0016H\u0016J¦\u0001\u00108\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0014\u0010$\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"\u0018\u00010!2\u0006\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u00162\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0014\u0010/\u001a\u0010\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u0007\u0018\u00010-2\u001c\u00101\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001000!\u0012\u0004\u0012\u00020\u0007\u0018\u00010-2\b\u00103\u001a\u0004\u0018\u0001022\b\u00105\u001a\u0004\u0018\u000104ø\u0001\u0000¢\u0006\u0004\b6\u00107R\u0018\u00103\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006@"}, d2 = {"Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "Lkotlin/r2;", "onGloballyPositioned", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", MediationConstant.RIT_TYPE_DRAW, "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "height", "minIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/text/TextStyle;", "style", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "minLines", "maxLines", "", "softWrap", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "onTextLayout", "Landroidx/compose/ui/geometry/Rect;", "onPlaceholderLayout", "Landroidx/compose/foundation/text/modifiers/SelectionController;", "selectionController", "Landroidx/compose/ui/graphics/ColorProducer;", TypedValues.Custom.S_COLOR, "update-L09Iy8E", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;IIZLandroidx/compose/ui/text/font/FontFamily$Resolver;ILv3/l;Lv3/l;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;)V", "update", "Landroidx/compose/foundation/text/modifiers/SelectionController;", "Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode;", "delegate", "Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode;", "overrideColor", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;Lv3/l;IZIILjava/util/List;Lv3/l;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SelectableTextAnnotatedStringNode extends DelegatingNode implements LayoutModifierNode, DrawModifierNode, GlobalPositionAwareModifierNode {
    public static final int $stable = 8;

    @l
    private final TextAnnotatedStringNode delegate;

    @m
    private SelectionController selectionController;

    public /* synthetic */ SelectableTextAnnotatedStringNode(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, v3.l lVar, int i5, boolean z4, int i6, int i7, List list, v3.l lVar2, SelectionController selectionController, ColorProducer colorProducer, int i8, w wVar) {
        this(annotatedString, textStyle, resolver, (i8 & 8) != 0 ? null : lVar, (i8 & 16) != 0 ? TextOverflow.Companion.m5985getClipgIe3tQ8() : i5, (i8 & 32) != 0 ? true : z4, (i8 & 64) != 0 ? Integer.MAX_VALUE : i6, (i8 & 128) != 0 ? 1 : i7, (i8 & 256) != 0 ? null : list, (i8 & 512) != 0 ? null : lVar2, (i8 & 1024) != 0 ? null : selectionController, (i8 & 2048) != 0 ? null : colorProducer, null);
    }

    public /* synthetic */ SelectableTextAnnotatedStringNode(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, v3.l lVar, int i5, boolean z4, int i6, int i7, List list, v3.l lVar2, SelectionController selectionController, ColorProducer colorProducer, w wVar) {
        this(annotatedString, textStyle, resolver, lVar, i5, z4, i6, i7, list, lVar2, selectionController, colorProducer);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(@l ContentDrawScope contentDrawScope) {
        this.delegate.drawNonExtension(contentDrawScope);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(@l IntrinsicMeasureScope intrinsicMeasureScope, @l IntrinsicMeasurable intrinsicMeasurable, int i5) {
        return this.delegate.maxIntrinsicHeightNonExtension(intrinsicMeasureScope, intrinsicMeasurable, i5);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(@l IntrinsicMeasureScope intrinsicMeasureScope, @l IntrinsicMeasurable intrinsicMeasurable, int i5) {
        return this.delegate.maxIntrinsicWidthNonExtension(intrinsicMeasureScope, intrinsicMeasurable, i5);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @l
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo82measure3p2s80s(@l MeasureScope measureScope, @l Measurable measurable, long j5) {
        return this.delegate.m972measureNonExtension3p2s80s(measureScope, measurable, j5);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(@l IntrinsicMeasureScope intrinsicMeasureScope, @l IntrinsicMeasurable intrinsicMeasurable, int i5) {
        return this.delegate.minIntrinsicHeightNonExtension(intrinsicMeasureScope, intrinsicMeasurable, i5);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(@l IntrinsicMeasureScope intrinsicMeasureScope, @l IntrinsicMeasurable intrinsicMeasurable, int i5) {
        return this.delegate.minIntrinsicWidthNonExtension(intrinsicMeasureScope, intrinsicMeasurable, i5);
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(@l LayoutCoordinates layoutCoordinates) {
        SelectionController selectionController = this.selectionController;
        if (selectionController != null) {
            selectionController.updateGlobalPosition(layoutCoordinates);
        }
    }

    /* renamed from: update-L09Iy8E, reason: not valid java name */
    public final void m967updateL09Iy8E(@l AnnotatedString annotatedString, @l TextStyle textStyle, @m List<AnnotatedString.Range<Placeholder>> list, int i5, int i6, boolean z4, @l FontFamily.Resolver resolver, int i7, @m v3.l<? super TextLayoutResult, r2> lVar, @m v3.l<? super List<Rect>, r2> lVar2, @m SelectionController selectionController, @m ColorProducer colorProducer) {
        TextAnnotatedStringNode textAnnotatedStringNode = this.delegate;
        textAnnotatedStringNode.doInvalidations(textAnnotatedStringNode.updateDraw(colorProducer, textStyle), this.delegate.updateText(annotatedString), this.delegate.m973updateLayoutRelatedArgsMPT68mk(textStyle, list, i5, i6, z4, resolver, i7), this.delegate.updateCallbacks(lVar, lVar2, selectionController));
        this.selectionController = selectionController;
        LayoutModifierNodeKt.invalidateMeasurement(this);
    }

    private SelectableTextAnnotatedStringNode(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, v3.l<? super TextLayoutResult, r2> lVar, int i5, boolean z4, int i6, int i7, List<AnnotatedString.Range<Placeholder>> list, v3.l<? super List<Rect>, r2> lVar2, SelectionController selectionController, ColorProducer colorProducer) {
        this.selectionController = selectionController;
        this.delegate = (TextAnnotatedStringNode) delegate(new TextAnnotatedStringNode(annotatedString, textStyle, resolver, lVar, i5, z4, i6, i7, list, lVar2, this.selectionController, colorProducer, null));
        if (this.selectionController == null) {
            throw new IllegalArgumentException("Do not use SelectionCapableStaticTextModifier unless selectionController != null".toString());
        }
    }
}
