package androidx.compose.foundation.text.modifiers;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import java.util.List;
import java.util.Map;
import kotlin.collections.a1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.math.d;
import kotlin.q1;
import kotlin.r2;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001pB¯\u0001\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0016\b\u0002\u0010'\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\r\u0018\u00010%\u0012\b\b\u0002\u0010!\u001a\u00020 \u0012\b\b\u0002\u0010\u001d\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u0016\u0012\u001e\b\u0002\u0010)\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010(0\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010%\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\bn\u0010oJ\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0002J\u0018\u0010\u0013\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\tJV\u0010$\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0014\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u00162\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 ø\u0001\u0000¢\u0006\u0004\b\"\u0010#JD\u0010,\u001a\u00020\u000b2\u0014\u0010'\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\r\u0018\u00010%2\u001c\u0010)\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010(0\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010%2\b\u0010+\u001a\u0004\u0018\u00010*J&\u00101\u001a\u00020\r2\u0006\u0010-\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u000bJ\f\u00103\u001a\u00020\r*\u000202H\u0016J(\u0010=\u001a\u00020:2\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208ø\u0001\u0000¢\u0006\u0004\b;\u0010<J&\u0010?\u001a\u00020:*\u0002042\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208H\u0016ø\u0001\u0000¢\u0006\u0004\b>\u0010<J\u001e\u0010D\u001a\u00020\u001a2\u0006\u0010A\u001a\u00020@2\u0006\u00107\u001a\u00020B2\u0006\u0010C\u001a\u00020\u001aJ\u001c\u0010E\u001a\u00020\u001a*\u00020@2\u0006\u00107\u001a\u00020B2\u0006\u0010C\u001a\u00020\u001aH\u0016J\u001e\u0010G\u001a\u00020\u001a2\u0006\u0010A\u001a\u00020@2\u0006\u00107\u001a\u00020B2\u0006\u0010F\u001a\u00020\u001aJ\u001c\u0010H\u001a\u00020\u001a*\u00020@2\u0006\u00107\u001a\u00020B2\u0006\u0010F\u001a\u00020\u001aH\u0016J\u001e\u0010I\u001a\u00020\u001a2\u0006\u0010A\u001a\u00020@2\u0006\u00107\u001a\u00020B2\u0006\u0010C\u001a\u00020\u001aJ\u001c\u0010J\u001a\u00020\u001a*\u00020@2\u0006\u00107\u001a\u00020B2\u0006\u0010C\u001a\u00020\u001aH\u0016J\u001e\u0010K\u001a\u00020\u001a2\u0006\u0010A\u001a\u00020@2\u0006\u00107\u001a\u00020B2\u0006\u0010F\u001a\u00020\u001aJ\u001c\u0010L\u001a\u00020\u001a*\u00020@2\u0006\u00107\u001a\u00020B2\u0006\u0010F\u001a\u00020\u001aH\u0016J\u000e\u0010O\u001a\u00020\r2\u0006\u0010N\u001a\u00020MJ\f\u0010P\u001a\u00020\r*\u00020MH\u0016R\u0016\u0010\u0014\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010QR\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010RR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010SR$\u0010'\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\r\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010TR\u001c\u0010!\u001a\u00020 8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b!\u0010UR\u0016\u0010\u001d\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010VR\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010UR\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010UR$\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010WR,\u0010)\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010(0\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010TR\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010XR\u0018\u0010Y\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR$\u0010]\u001a\u0010\u0012\u0004\u0012\u00020\\\u0012\u0004\u0012\u00020\u001a\u0018\u00010[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0018\u0010_\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R*\u0010b\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0a\u0012\u0004\u0012\u00020\u000b\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010TR/\u0010k\u001a\u0004\u0018\u00010c2\b\u0010d\u001a\u0004\u0018\u00010c8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\u0014\u0010m\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010l\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006q"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;", "getLayoutCache", "Landroidx/compose/ui/text/AnnotatedString;", "updatedText", "", "setSubstitution", "Lkotlin/r2;", "clearSubstitution", "Landroidx/compose/ui/graphics/ColorProducer;", TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/text/TextStyle;", "style", "updateDraw", "text", "updateText", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "", "minLines", "maxLines", "softWrap", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "updateLayoutRelatedArgs-MPT68mk", "(Landroidx/compose/ui/text/TextStyle;Ljava/util/List;IIZLandroidx/compose/ui/text/font/FontFamily$Resolver;I)Z", "updateLayoutRelatedArgs", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "onTextLayout", "Landroidx/compose/ui/geometry/Rect;", "onPlaceholderLayout", "Landroidx/compose/foundation/text/modifiers/SelectionController;", "selectionController", "updateCallbacks", "drawChanged", "textChanged", "layoutChanged", "callbacksChanged", "doInvalidations", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "applySemantics", "Landroidx/compose/ui/layout/MeasureScope;", "measureScope", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measureNonExtension-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measureNonExtension", "measure-3p2s80s", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "intrinsicMeasureScope", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "height", "minIntrinsicWidthNonExtension", "minIntrinsicWidth", "width", "minIntrinsicHeightNonExtension", "minIntrinsicHeight", "maxIntrinsicWidthNonExtension", "maxIntrinsicWidth", "maxIntrinsicHeightNonExtension", "maxIntrinsicHeight", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "contentDrawScope", "drawNonExtension", MediationConstant.RIT_TYPE_DRAW, "Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/text/TextStyle;", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "Lv3/l;", "I", "Z", "Ljava/util/List;", "Landroidx/compose/foundation/text/modifiers/SelectionController;", "overrideColor", "Landroidx/compose/ui/graphics/ColorProducer;", "", "Landroidx/compose/ui/layout/AlignmentLine;", "baselineCache", "Ljava/util/Map;", "_layoutCache", "Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;", "", "semanticsTextLayoutResult", "Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode$TextSubstitutionValue;", "<set-?>", "textSubstitution$delegate", "Landroidx/compose/runtime/MutableState;", "getTextSubstitution", "()Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode$TextSubstitutionValue;", "setTextSubstitution", "(Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode$TextSubstitutionValue;)V", "textSubstitution", "()Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;", "layoutCache", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;Lv3/l;IZIILjava/util/List;Lv3/l;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/internal/w;)V", "TextSubstitutionValue", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nTextAnnotatedStringNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextAnnotatedStringNode.kt\nandroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 5 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,541:1\n1#2:542\n81#3:543\n107#3,2:544\n246#4:546\n646#5:547\n646#5:548\n*S KotlinDebug\n*F\n+ 1 TextAnnotatedStringNode.kt\nandroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode\n*L\n263#1:543\n263#1:544,2\n486#1:546\n515#1:547\n517#1:548\n*E\n"})
/* loaded from: classes.dex */
public final class TextAnnotatedStringNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode, SemanticsModifierNode {
    public static final int $stable = 8;

    @m
    private MultiParagraphLayoutCache _layoutCache;

    @m
    private Map<AlignmentLine, Integer> baselineCache;

    @l
    private FontFamily.Resolver fontFamilyResolver;
    private int maxLines;
    private int minLines;

    @m
    private v3.l<? super List<Rect>, r2> onPlaceholderLayout;

    @m
    private v3.l<? super TextLayoutResult, r2> onTextLayout;
    private int overflow;

    @m
    private ColorProducer overrideColor;

    @m
    private List<AnnotatedString.Range<Placeholder>> placeholders;

    @m
    private SelectionController selectionController;

    @m
    private v3.l<? super List<TextLayoutResult>, Boolean> semanticsTextLayoutResult;
    private boolean softWrap;

    @l
    private TextStyle style;

    @l
    private AnnotatedString text;

    @l
    private final MutableState textSubstitution$delegate;

    public /* synthetic */ TextAnnotatedStringNode(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, v3.l lVar, int i5, boolean z4, int i6, int i7, List list, v3.l lVar2, SelectionController selectionController, ColorProducer colorProducer, int i8, w wVar) {
        this(annotatedString, textStyle, resolver, (i8 & 8) != 0 ? null : lVar, (i8 & 16) != 0 ? TextOverflow.Companion.m5985getClipgIe3tQ8() : i5, (i8 & 32) != 0 ? true : z4, (i8 & 64) != 0 ? Integer.MAX_VALUE : i6, (i8 & 128) != 0 ? 1 : i7, (i8 & 256) != 0 ? null : list, (i8 & 512) != 0 ? null : lVar2, (i8 & 1024) != 0 ? null : selectionController, (i8 & 2048) != 0 ? null : colorProducer, null);
    }

    public /* synthetic */ TextAnnotatedStringNode(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, v3.l lVar, int i5, boolean z4, int i6, int i7, List list, v3.l lVar2, SelectionController selectionController, ColorProducer colorProducer, w wVar) {
        this(annotatedString, textStyle, resolver, lVar, i5, z4, i6, i7, list, lVar2, selectionController, colorProducer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearSubstitution() {
        setTextSubstitution(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MultiParagraphLayoutCache getLayoutCache() {
        if (this._layoutCache == null) {
            this._layoutCache = new MultiParagraphLayoutCache(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, null);
        }
        MultiParagraphLayoutCache multiParagraphLayoutCache = this._layoutCache;
        l0.m(multiParagraphLayoutCache);
        return multiParagraphLayoutCache;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final TextSubstitutionValue getTextSubstitution() {
        return (TextSubstitutionValue) this.textSubstitution$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean setSubstitution(AnnotatedString annotatedString) {
        r2 r2Var;
        TextSubstitutionValue textSubstitution = getTextSubstitution();
        if (textSubstitution != null) {
            if (l0.g(annotatedString, textSubstitution.getSubstitution())) {
                return false;
            }
            textSubstitution.setSubstitution(annotatedString);
            MultiParagraphLayoutCache layoutCache = textSubstitution.getLayoutCache();
            if (layoutCache != null) {
                layoutCache.m957updateZNqEYIc(annotatedString, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders);
                r2Var = r2.f19517a;
            } else {
                r2Var = null;
            }
            if (r2Var == null) {
                return false;
            }
            return true;
        }
        TextSubstitutionValue textSubstitutionValue = new TextSubstitutionValue(this.text, annotatedString, false, null, 12, null);
        MultiParagraphLayoutCache multiParagraphLayoutCache = new MultiParagraphLayoutCache(annotatedString, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, null);
        multiParagraphLayoutCache.setDensity$foundation_release(getLayoutCache().getDensity$foundation_release());
        textSubstitutionValue.setLayoutCache(multiParagraphLayoutCache);
        setTextSubstitution(textSubstitutionValue);
        return true;
    }

    private final void setTextSubstitution(TextSubstitutionValue textSubstitutionValue) {
        this.textSubstitution$delegate.setValue(textSubstitutionValue);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(@l SemanticsPropertyReceiver semanticsPropertyReceiver) {
        v3.l lVar = this.semanticsTextLayoutResult;
        if (lVar == null) {
            lVar = new TextAnnotatedStringNode$applySemantics$1(this);
            this.semanticsTextLayoutResult = lVar;
        }
        SemanticsPropertiesKt.setText(semanticsPropertyReceiver, this.text);
        TextSubstitutionValue textSubstitution = getTextSubstitution();
        if (textSubstitution != null) {
            SemanticsPropertiesKt.setTextSubstitution(semanticsPropertyReceiver, textSubstitution.getSubstitution());
            SemanticsPropertiesKt.setShowingTextSubstitution(semanticsPropertyReceiver, textSubstitution.isShowingSubstitution());
        }
        SemanticsPropertiesKt.setTextSubstitution$default(semanticsPropertyReceiver, null, new TextAnnotatedStringNode$applySemantics$2(this), 1, null);
        SemanticsPropertiesKt.showTextSubstitution$default(semanticsPropertyReceiver, null, new TextAnnotatedStringNode$applySemantics$3(this), 1, null);
        SemanticsPropertiesKt.clearTextSubstitution$default(semanticsPropertyReceiver, null, new TextAnnotatedStringNode$applySemantics$4(this), 1, null);
        SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, lVar, 1, null);
    }

    public final void doInvalidations(boolean z4, boolean z5, boolean z6, boolean z7) {
        if (!isAttached()) {
            return;
        }
        if (z5 || (z4 && this.semanticsTextLayoutResult != null)) {
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        if (z5 || z6 || z7) {
            getLayoutCache().m957updateZNqEYIc(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders);
            LayoutModifierNodeKt.invalidateMeasurement(this);
            DrawModifierNodeKt.invalidateDraw(this);
        }
        if (z4) {
            DrawModifierNodeKt.invalidateDraw(this);
        }
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(@l ContentDrawScope contentDrawScope) {
        boolean z4;
        long m3770getUnspecified0d7_KjU;
        boolean z5;
        boolean z6;
        if (!isAttached()) {
            return;
        }
        SelectionController selectionController = this.selectionController;
        if (selectionController != null) {
            selectionController.draw(contentDrawScope);
        }
        Canvas canvas = contentDrawScope.getDrawContext().getCanvas();
        TextLayoutResult textLayoutResult = getLayoutCache(contentDrawScope).getTextLayoutResult();
        MultiParagraph multiParagraph = textLayoutResult.getMultiParagraph();
        boolean z7 = true;
        if (textLayoutResult.getHasVisualOverflow() && !TextOverflow.m5978equalsimpl0(this.overflow, TextOverflow.Companion.m5987getVisiblegIe3tQ8())) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            Rect m3533Recttz77jQw = RectKt.m3533Recttz77jQw(Offset.Companion.m3509getZeroF1C5BW0(), SizeKt.Size(IntSize.m6214getWidthimpl(textLayoutResult.m5518getSizeYbymL2g()), IntSize.m6213getHeightimpl(textLayoutResult.m5518getSizeYbymL2g())));
            canvas.save();
            Canvas.m3707clipRectmtrdDE$default(canvas, m3533Recttz77jQw, 0, 2, null);
        }
        try {
            TextDecoration textDecoration = this.style.getTextDecoration();
            if (textDecoration == null) {
                textDecoration = TextDecoration.Companion.getNone();
            }
            TextDecoration textDecoration2 = textDecoration;
            Shadow shadow = this.style.getShadow();
            if (shadow == null) {
                shadow = Shadow.Companion.getNone();
            }
            Shadow shadow2 = shadow;
            DrawStyle drawStyle = this.style.getDrawStyle();
            if (drawStyle == null) {
                drawStyle = Fill.INSTANCE;
            }
            DrawStyle drawStyle2 = drawStyle;
            Brush brush = this.style.getBrush();
            if (brush != null) {
                MultiParagraph.m5420painthn5TExg$default(multiParagraph, canvas, brush, this.style.getAlpha(), shadow2, textDecoration2, drawStyle2, 0, 64, null);
            } else {
                ColorProducer colorProducer = this.overrideColor;
                if (colorProducer != null) {
                    m3770getUnspecified0d7_KjU = colorProducer.mo1517invoke0d7_KjU();
                } else {
                    m3770getUnspecified0d7_KjU = Color.Companion.m3770getUnspecified0d7_KjU();
                }
                Color.Companion companion = Color.Companion;
                if (m3770getUnspecified0d7_KjU != companion.m3770getUnspecified0d7_KjU()) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (!z5) {
                    if (this.style.m5575getColor0d7_KjU() != companion.m3770getUnspecified0d7_KjU()) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (z6) {
                        m3770getUnspecified0d7_KjU = this.style.m5575getColor0d7_KjU();
                    } else {
                        m3770getUnspecified0d7_KjU = companion.m3760getBlack0d7_KjU();
                    }
                }
                MultiParagraph.m5418paintLG529CI$default(multiParagraph, canvas, m3770getUnspecified0d7_KjU, shadow2, textDecoration2, drawStyle2, 0, 32, null);
            }
            List<AnnotatedString.Range<Placeholder>> list = this.placeholders;
            if (list != null && !list.isEmpty()) {
                z7 = false;
            }
            if (!z7) {
                contentDrawScope.drawContent();
            }
        } finally {
            if (z4) {
                canvas.restore();
            }
        }
    }

    public final void drawNonExtension(@l ContentDrawScope contentDrawScope) {
        draw(contentDrawScope);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(@l IntrinsicMeasureScope intrinsicMeasureScope, @l IntrinsicMeasurable intrinsicMeasurable, int i5) {
        return getLayoutCache(intrinsicMeasureScope).intrinsicHeight(i5, intrinsicMeasureScope.getLayoutDirection());
    }

    public final int maxIntrinsicHeightNonExtension(@l IntrinsicMeasureScope intrinsicMeasureScope, @l IntrinsicMeasurable intrinsicMeasurable, int i5) {
        return maxIntrinsicHeight(intrinsicMeasureScope, intrinsicMeasurable, i5);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(@l IntrinsicMeasureScope intrinsicMeasureScope, @l IntrinsicMeasurable intrinsicMeasurable, int i5) {
        return getLayoutCache(intrinsicMeasureScope).maxIntrinsicWidth(intrinsicMeasureScope.getLayoutDirection());
    }

    public final int maxIntrinsicWidthNonExtension(@l IntrinsicMeasureScope intrinsicMeasureScope, @l IntrinsicMeasurable intrinsicMeasurable, int i5) {
        return maxIntrinsicWidth(intrinsicMeasureScope, intrinsicMeasurable, i5);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @l
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo82measure3p2s80s(@l MeasureScope measureScope, @l Measurable measurable, long j5) {
        int L0;
        int L02;
        Map<AlignmentLine, Integer> W;
        MultiParagraphLayoutCache layoutCache = getLayoutCache(measureScope);
        boolean m956layoutWithConstraintsK40F9xA = layoutCache.m956layoutWithConstraintsK40F9xA(j5, measureScope.getLayoutDirection());
        TextLayoutResult textLayoutResult = layoutCache.getTextLayoutResult();
        textLayoutResult.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts();
        if (m956layoutWithConstraintsK40F9xA) {
            LayoutModifierNodeKt.invalidateLayer(this);
            v3.l<? super TextLayoutResult, r2> lVar = this.onTextLayout;
            if (lVar != null) {
                lVar.invoke(textLayoutResult);
            }
            SelectionController selectionController = this.selectionController;
            if (selectionController != null) {
                selectionController.updateTextLayout(textLayoutResult);
            }
            HorizontalAlignmentLine firstBaseline = AlignmentLineKt.getFirstBaseline();
            L0 = d.L0(textLayoutResult.getFirstBaseline());
            HorizontalAlignmentLine lastBaseline = AlignmentLineKt.getLastBaseline();
            L02 = d.L0(textLayoutResult.getLastBaseline());
            W = a1.W(q1.a(firstBaseline, Integer.valueOf(L0)), q1.a(lastBaseline, Integer.valueOf(L02)));
            this.baselineCache = W;
        }
        v3.l<? super List<Rect>, r2> lVar2 = this.onPlaceholderLayout;
        if (lVar2 != null) {
            lVar2.invoke(textLayoutResult.getPlaceholderRects());
        }
        Placeable mo4998measureBRTryo0 = measurable.mo4998measureBRTryo0(LayoutUtilsKt.fixedCoerceHeightAndWidthForBits(Constraints.Companion, IntSize.m6214getWidthimpl(textLayoutResult.m5518getSizeYbymL2g()), IntSize.m6213getHeightimpl(textLayoutResult.m5518getSizeYbymL2g())));
        int m6214getWidthimpl = IntSize.m6214getWidthimpl(textLayoutResult.m5518getSizeYbymL2g());
        int m6213getHeightimpl = IntSize.m6213getHeightimpl(textLayoutResult.m5518getSizeYbymL2g());
        Map<AlignmentLine, Integer> map = this.baselineCache;
        l0.m(map);
        return measureScope.layout(m6214getWidthimpl, m6213getHeightimpl, map, new TextAnnotatedStringNode$measure$1(mo4998measureBRTryo0));
    }

    @l
    /* renamed from: measureNonExtension-3p2s80s, reason: not valid java name */
    public final MeasureResult m972measureNonExtension3p2s80s(@l MeasureScope measureScope, @l Measurable measurable, long j5) {
        return mo82measure3p2s80s(measureScope, measurable, j5);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(@l IntrinsicMeasureScope intrinsicMeasureScope, @l IntrinsicMeasurable intrinsicMeasurable, int i5) {
        return getLayoutCache(intrinsicMeasureScope).intrinsicHeight(i5, intrinsicMeasureScope.getLayoutDirection());
    }

    public final int minIntrinsicHeightNonExtension(@l IntrinsicMeasureScope intrinsicMeasureScope, @l IntrinsicMeasurable intrinsicMeasurable, int i5) {
        return minIntrinsicHeight(intrinsicMeasureScope, intrinsicMeasurable, i5);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(@l IntrinsicMeasureScope intrinsicMeasureScope, @l IntrinsicMeasurable intrinsicMeasurable, int i5) {
        return getLayoutCache(intrinsicMeasureScope).minIntrinsicWidth(intrinsicMeasureScope.getLayoutDirection());
    }

    public final int minIntrinsicWidthNonExtension(@l IntrinsicMeasureScope intrinsicMeasureScope, @l IntrinsicMeasurable intrinsicMeasurable, int i5) {
        return minIntrinsicWidth(intrinsicMeasureScope, intrinsicMeasurable, i5);
    }

    public final boolean updateCallbacks(@m v3.l<? super TextLayoutResult, r2> lVar, @m v3.l<? super List<Rect>, r2> lVar2, @m SelectionController selectionController) {
        boolean z4;
        if (!l0.g(this.onTextLayout, lVar)) {
            this.onTextLayout = lVar;
            z4 = true;
        } else {
            z4 = false;
        }
        if (!l0.g(this.onPlaceholderLayout, lVar2)) {
            this.onPlaceholderLayout = lVar2;
            z4 = true;
        }
        if (!l0.g(this.selectionController, selectionController)) {
            this.selectionController = selectionController;
            return true;
        }
        return z4;
    }

    public final boolean updateDraw(@m ColorProducer colorProducer, @l TextStyle textStyle) {
        boolean z4 = !l0.g(colorProducer, this.overrideColor);
        this.overrideColor = colorProducer;
        if (z4 || !textStyle.hasSameDrawAffectingAttributes(this.style)) {
            return true;
        }
        return false;
    }

    /* renamed from: updateLayoutRelatedArgs-MPT68mk, reason: not valid java name */
    public final boolean m973updateLayoutRelatedArgsMPT68mk(@l TextStyle textStyle, @m List<AnnotatedString.Range<Placeholder>> list, int i5, int i6, boolean z4, @l FontFamily.Resolver resolver, int i7) {
        boolean z5 = !this.style.hasSameLayoutAffectingAttributes(textStyle);
        this.style = textStyle;
        if (!l0.g(this.placeholders, list)) {
            this.placeholders = list;
            z5 = true;
        }
        if (this.minLines != i5) {
            this.minLines = i5;
            z5 = true;
        }
        if (this.maxLines != i6) {
            this.maxLines = i6;
            z5 = true;
        }
        if (this.softWrap != z4) {
            this.softWrap = z4;
            z5 = true;
        }
        if (!l0.g(this.fontFamilyResolver, resolver)) {
            this.fontFamilyResolver = resolver;
            z5 = true;
        }
        if (!TextOverflow.m5978equalsimpl0(this.overflow, i7)) {
            this.overflow = i7;
            return true;
        }
        return z5;
    }

    public final boolean updateText(@l AnnotatedString annotatedString) {
        if (l0.g(this.text, annotatedString)) {
            return false;
        }
        this.text = annotatedString;
        clearSubstitution();
        return true;
    }

    private TextAnnotatedStringNode(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, v3.l<? super TextLayoutResult, r2> lVar, int i5, boolean z4, int i6, int i7, List<AnnotatedString.Range<Placeholder>> list, v3.l<? super List<Rect>, r2> lVar2, SelectionController selectionController, ColorProducer colorProducer) {
        MutableState mutableStateOf$default;
        this.text = annotatedString;
        this.style = textStyle;
        this.fontFamilyResolver = resolver;
        this.onTextLayout = lVar;
        this.overflow = i5;
        this.softWrap = z4;
        this.maxLines = i6;
        this.minLines = i7;
        this.placeholders = list;
        this.onPlaceholderLayout = lVar2;
        this.selectionController = selectionController;
        this.overrideColor = colorProducer;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.textSubstitution$delegate = mutableStateOf$default;
    }

    @StabilityInferred(parameters = 0)
    @i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0012\"\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode$TextSubstitutionValue;", "", "original", "Landroidx/compose/ui/text/AnnotatedString;", "substitution", "isShowingSubstitution", "", "layoutCache", "Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/AnnotatedString;ZLandroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;)V", "()Z", "setShowingSubstitution", "(Z)V", "getLayoutCache", "()Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;", "setLayoutCache", "(Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;)V", "getOriginal", "()Landroidx/compose/ui/text/AnnotatedString;", "getSubstitution", "setSubstitution", "(Landroidx/compose/ui/text/AnnotatedString;)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", TTDownloadField.TT_HASHCODE, "", "toString", "", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class TextSubstitutionValue {
        public static final int $stable = 8;
        private boolean isShowingSubstitution;

        @m
        private MultiParagraphLayoutCache layoutCache;

        @l
        private final AnnotatedString original;

        @l
        private AnnotatedString substitution;

        public TextSubstitutionValue(@l AnnotatedString annotatedString, @l AnnotatedString annotatedString2, boolean z4, @m MultiParagraphLayoutCache multiParagraphLayoutCache) {
            this.original = annotatedString;
            this.substitution = annotatedString2;
            this.isShowingSubstitution = z4;
            this.layoutCache = multiParagraphLayoutCache;
        }

        public static /* synthetic */ TextSubstitutionValue copy$default(TextSubstitutionValue textSubstitutionValue, AnnotatedString annotatedString, AnnotatedString annotatedString2, boolean z4, MultiParagraphLayoutCache multiParagraphLayoutCache, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                annotatedString = textSubstitutionValue.original;
            }
            if ((i5 & 2) != 0) {
                annotatedString2 = textSubstitutionValue.substitution;
            }
            if ((i5 & 4) != 0) {
                z4 = textSubstitutionValue.isShowingSubstitution;
            }
            if ((i5 & 8) != 0) {
                multiParagraphLayoutCache = textSubstitutionValue.layoutCache;
            }
            return textSubstitutionValue.copy(annotatedString, annotatedString2, z4, multiParagraphLayoutCache);
        }

        @l
        public final AnnotatedString component1() {
            return this.original;
        }

        @l
        public final AnnotatedString component2() {
            return this.substitution;
        }

        public final boolean component3() {
            return this.isShowingSubstitution;
        }

        @m
        public final MultiParagraphLayoutCache component4() {
            return this.layoutCache;
        }

        @l
        public final TextSubstitutionValue copy(@l AnnotatedString annotatedString, @l AnnotatedString annotatedString2, boolean z4, @m MultiParagraphLayoutCache multiParagraphLayoutCache) {
            return new TextSubstitutionValue(annotatedString, annotatedString2, z4, multiParagraphLayoutCache);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TextSubstitutionValue)) {
                return false;
            }
            TextSubstitutionValue textSubstitutionValue = (TextSubstitutionValue) obj;
            return l0.g(this.original, textSubstitutionValue.original) && l0.g(this.substitution, textSubstitutionValue.substitution) && this.isShowingSubstitution == textSubstitutionValue.isShowingSubstitution && l0.g(this.layoutCache, textSubstitutionValue.layoutCache);
        }

        @m
        public final MultiParagraphLayoutCache getLayoutCache() {
            return this.layoutCache;
        }

        @l
        public final AnnotatedString getOriginal() {
            return this.original;
        }

        @l
        public final AnnotatedString getSubstitution() {
            return this.substitution;
        }

        public int hashCode() {
            int hashCode = ((((this.original.hashCode() * 31) + this.substitution.hashCode()) * 31) + Boolean.hashCode(this.isShowingSubstitution)) * 31;
            MultiParagraphLayoutCache multiParagraphLayoutCache = this.layoutCache;
            return hashCode + (multiParagraphLayoutCache == null ? 0 : multiParagraphLayoutCache.hashCode());
        }

        public final boolean isShowingSubstitution() {
            return this.isShowingSubstitution;
        }

        public final void setLayoutCache(@m MultiParagraphLayoutCache multiParagraphLayoutCache) {
            this.layoutCache = multiParagraphLayoutCache;
        }

        public final void setShowingSubstitution(boolean z4) {
            this.isShowingSubstitution = z4;
        }

        public final void setSubstitution(@l AnnotatedString annotatedString) {
            this.substitution = annotatedString;
        }

        @l
        public String toString() {
            return "TextSubstitutionValue(original=" + ((Object) this.original) + ", substitution=" + ((Object) this.substitution) + ", isShowingSubstitution=" + this.isShowingSubstitution + ", layoutCache=" + this.layoutCache + ')';
        }

        public /* synthetic */ TextSubstitutionValue(AnnotatedString annotatedString, AnnotatedString annotatedString2, boolean z4, MultiParagraphLayoutCache multiParagraphLayoutCache, int i5, w wVar) {
            this(annotatedString, annotatedString2, (i5 & 4) != 0 ? false : z4, (i5 & 8) != 0 ? null : multiParagraphLayoutCache);
        }
    }

    private final MultiParagraphLayoutCache getLayoutCache(Density density) {
        MultiParagraphLayoutCache layoutCache;
        TextSubstitutionValue textSubstitution = getTextSubstitution();
        if (textSubstitution != null && textSubstitution.isShowingSubstitution() && (layoutCache = textSubstitution.getLayoutCache()) != null) {
            layoutCache.setDensity$foundation_release(density);
            return layoutCache;
        }
        MultiParagraphLayoutCache layoutCache2 = getLayoutCache();
        layoutCache2.setDensity$foundation_release(density);
        return layoutCache2;
    }
}
