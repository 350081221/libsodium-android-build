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
import androidx.compose.ui.text.Paragraph;
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
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.math.d;
import kotlin.r2;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001YBS\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\bW\u0010XJ\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0002J\u0018\u0010\u0013\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\tJ@\u0010 \u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001e\u0010$\u001a\u00020\r2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000bJ\f\u0010&\u001a\u00020\r*\u00020%H\u0016J&\u0010/\u001a\u00020,*\u00020'2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*H\u0016ø\u0001\u0000¢\u0006\u0004\b-\u0010.J\u001c\u00103\u001a\u00020\u0016*\u0002002\u0006\u0010)\u001a\u0002012\u0006\u00102\u001a\u00020\u0016H\u0016J\u001c\u00105\u001a\u00020\u0016*\u0002002\u0006\u0010)\u001a\u0002012\u0006\u00104\u001a\u00020\u0016H\u0016J\u001c\u00106\u001a\u00020\u0016*\u0002002\u0006\u0010)\u001a\u0002012\u0006\u00102\u001a\u00020\u0016H\u0016J\u001c\u00107\u001a\u00020\u0016*\u0002002\u0006\u0010)\u001a\u0002012\u0006\u00104\u001a\u00020\u0016H\u0016J\f\u00109\u001a\u00020\r*\u000208H\u0016R\u0016\u0010\u0014\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010:R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010;R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010<R\u001c\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001d\u0010=R\u0016\u0010\u0019\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010>R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010=R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010=R\u0018\u0010?\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R$\u0010C\u001a\u0010\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\u0016\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010E\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR*\u0010J\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020I0H\u0012\u0004\u0012\u00020\u000b\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR/\u0010T\u001a\u0004\u0018\u00010L2\b\u0010M\u001a\u0004\u0018\u00010L8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u0014\u0010V\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010U\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Z"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;", "getLayoutCache", "", "updatedText", "", "setSubstitution", "Lkotlin/r2;", "clearSubstitution", "Landroidx/compose/ui/graphics/ColorProducer;", TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/text/TextStyle;", "style", "updateDraw", "text", "updateText", "", "minLines", "maxLines", "softWrap", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "updateLayoutRelatedArgs-HuAbxIM", "(Landroidx/compose/ui/text/TextStyle;IIZLandroidx/compose/ui/text/font/FontFamily$Resolver;I)Z", "updateLayoutRelatedArgs", "drawChanged", "textChanged", "layoutChanged", "doInvalidations", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "applySemantics", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "height", "minIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", MediationConstant.RIT_TYPE_DRAW, "Ljava/lang/String;", "Landroidx/compose/ui/text/TextStyle;", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "I", "Z", "overrideColor", "Landroidx/compose/ui/graphics/ColorProducer;", "", "Landroidx/compose/ui/layout/AlignmentLine;", "baselineCache", "Ljava/util/Map;", "_layoutCache", "Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;", "Lkotlin/Function1;", "", "Landroidx/compose/ui/text/TextLayoutResult;", "semanticsTextLayoutResult", "Lv3/l;", "Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode$TextSubstitutionValue;", "<set-?>", "textSubstitution$delegate", "Landroidx/compose/runtime/MutableState;", "getTextSubstitution", "()Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode$TextSubstitutionValue;", "setTextSubstitution", "(Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode$TextSubstitutionValue;)V", "textSubstitution", "()Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;", "layoutCache", "<init>", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;IZIILandroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/internal/w;)V", "TextSubstitutionValue", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nTextStringSimpleNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextStringSimpleNode.kt\nandroidx/compose/foundation/text/modifiers/TextStringSimpleNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 5 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,440:1\n1#2:441\n81#3:442\n107#3,2:443\n246#4:445\n646#5:446\n646#5:447\n*S KotlinDebug\n*F\n+ 1 TextStringSimpleNode.kt\nandroidx/compose/foundation/text/modifiers/TextStringSimpleNode\n*L\n222#1:442\n222#1:443,2\n391#1:445\n417#1:446\n419#1:447\n*E\n"})
/* loaded from: classes.dex */
public final class TextStringSimpleNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode, SemanticsModifierNode {
    public static final int $stable = 8;

    @m
    private ParagraphLayoutCache _layoutCache;

    @m
    private Map<AlignmentLine, Integer> baselineCache;

    @l
    private FontFamily.Resolver fontFamilyResolver;
    private int maxLines;
    private int minLines;
    private int overflow;

    @m
    private ColorProducer overrideColor;

    @m
    private v3.l<? super List<TextLayoutResult>, Boolean> semanticsTextLayoutResult;
    private boolean softWrap;

    @l
    private TextStyle style;

    @l
    private String text;

    @l
    private final MutableState textSubstitution$delegate;

    public /* synthetic */ TextStringSimpleNode(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i5, boolean z4, int i6, int i7, ColorProducer colorProducer, int i8, w wVar) {
        this(str, textStyle, resolver, (i8 & 8) != 0 ? TextOverflow.Companion.m5985getClipgIe3tQ8() : i5, (i8 & 16) != 0 ? true : z4, (i8 & 32) != 0 ? Integer.MAX_VALUE : i6, (i8 & 64) != 0 ? 1 : i7, (i8 & 128) != 0 ? null : colorProducer, null);
    }

    public /* synthetic */ TextStringSimpleNode(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i5, boolean z4, int i6, int i7, ColorProducer colorProducer, w wVar) {
        this(str, textStyle, resolver, i5, z4, i6, i7, colorProducer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearSubstitution() {
        setTextSubstitution(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ParagraphLayoutCache getLayoutCache() {
        if (this._layoutCache == null) {
            this._layoutCache = new ParagraphLayoutCache(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, null);
        }
        ParagraphLayoutCache paragraphLayoutCache = this._layoutCache;
        l0.m(paragraphLayoutCache);
        return paragraphLayoutCache;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final TextSubstitutionValue getTextSubstitution() {
        return (TextSubstitutionValue) this.textSubstitution$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean setSubstitution(String str) {
        r2 r2Var;
        TextSubstitutionValue textSubstitution = getTextSubstitution();
        if (textSubstitution != null) {
            if (l0.g(str, textSubstitution.getSubstitution())) {
                return false;
            }
            textSubstitution.setSubstitution(str);
            ParagraphLayoutCache layoutCache = textSubstitution.getLayoutCache();
            if (layoutCache != null) {
                layoutCache.m963updateL6sJoHM(str, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines);
                r2Var = r2.f19517a;
            } else {
                r2Var = null;
            }
            if (r2Var == null) {
                return false;
            }
            return true;
        }
        TextSubstitutionValue textSubstitutionValue = new TextSubstitutionValue(this.text, str, false, null, 12, null);
        ParagraphLayoutCache paragraphLayoutCache = new ParagraphLayoutCache(str, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, null);
        paragraphLayoutCache.setDensity$foundation_release(getLayoutCache().getDensity$foundation_release());
        textSubstitutionValue.setLayoutCache(paragraphLayoutCache);
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
            lVar = new TextStringSimpleNode$applySemantics$1(this);
            this.semanticsTextLayoutResult = lVar;
        }
        SemanticsPropertiesKt.setText(semanticsPropertyReceiver, new AnnotatedString(this.text, null, null, 6, null));
        TextSubstitutionValue textSubstitution = getTextSubstitution();
        if (textSubstitution != null) {
            SemanticsPropertiesKt.setShowingTextSubstitution(semanticsPropertyReceiver, textSubstitution.isShowingSubstitution());
            SemanticsPropertiesKt.setTextSubstitution(semanticsPropertyReceiver, new AnnotatedString(textSubstitution.getSubstitution(), null, null, 6, null));
        }
        SemanticsPropertiesKt.setTextSubstitution$default(semanticsPropertyReceiver, null, new TextStringSimpleNode$applySemantics$2(this), 1, null);
        SemanticsPropertiesKt.showTextSubstitution$default(semanticsPropertyReceiver, null, new TextStringSimpleNode$applySemantics$3(this), 1, null);
        SemanticsPropertiesKt.clearTextSubstitution$default(semanticsPropertyReceiver, null, new TextStringSimpleNode$applySemantics$4(this), 1, null);
        SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, lVar, 1, null);
    }

    public final void doInvalidations(boolean z4, boolean z5, boolean z6) {
        if (!isAttached()) {
            return;
        }
        if (z5 || (z4 && this.semanticsTextLayoutResult != null)) {
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        if (z5 || z6) {
            getLayoutCache().m963updateL6sJoHM(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines);
            LayoutModifierNodeKt.invalidateMeasurement(this);
            DrawModifierNodeKt.invalidateDraw(this);
        }
        if (z4) {
            DrawModifierNodeKt.invalidateDraw(this);
        }
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(@l ContentDrawScope contentDrawScope) {
        long m3770getUnspecified0d7_KjU;
        boolean z4;
        long m3760getBlack0d7_KjU;
        if (!isAttached()) {
            return;
        }
        Paragraph paragraph$foundation_release = getLayoutCache().getParagraph$foundation_release();
        if (paragraph$foundation_release != null) {
            Canvas canvas = contentDrawScope.getDrawContext().getCanvas();
            boolean didOverflow$foundation_release = getLayoutCache().getDidOverflow$foundation_release();
            boolean z5 = false;
            if (didOverflow$foundation_release) {
                Rect m3533Recttz77jQw = RectKt.m3533Recttz77jQw(Offset.Companion.m3509getZeroF1C5BW0(), SizeKt.Size(IntSize.m6214getWidthimpl(getLayoutCache().m960getLayoutSizeYbymL2g$foundation_release()), IntSize.m6213getHeightimpl(getLayoutCache().m960getLayoutSizeYbymL2g$foundation_release())));
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
                    Paragraph.m5430painthn5TExg$default(paragraph$foundation_release, canvas, brush, this.style.getAlpha(), shadow2, textDecoration2, drawStyle2, 0, 64, null);
                } else {
                    ColorProducer colorProducer = this.overrideColor;
                    if (colorProducer != null) {
                        m3770getUnspecified0d7_KjU = colorProducer.mo1517invoke0d7_KjU();
                    } else {
                        m3770getUnspecified0d7_KjU = Color.Companion.m3770getUnspecified0d7_KjU();
                    }
                    Color.Companion companion = Color.Companion;
                    if (m3770getUnspecified0d7_KjU != companion.m3770getUnspecified0d7_KjU()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z4) {
                        if (this.style.m5575getColor0d7_KjU() != companion.m3770getUnspecified0d7_KjU()) {
                            z5 = true;
                        }
                        if (z5) {
                            m3760getBlack0d7_KjU = this.style.m5575getColor0d7_KjU();
                        } else {
                            m3760getBlack0d7_KjU = companion.m3760getBlack0d7_KjU();
                        }
                        m3770getUnspecified0d7_KjU = m3760getBlack0d7_KjU;
                    }
                    Paragraph.m5428paintLG529CI$default(paragraph$foundation_release, canvas, m3770getUnspecified0d7_KjU, shadow2, textDecoration2, drawStyle2, 0, 32, null);
                }
                if (didOverflow$foundation_release) {
                    return;
                } else {
                    return;
                }
            } finally {
                if (didOverflow$foundation_release) {
                    canvas.restore();
                }
            }
        }
        throw new IllegalArgumentException("no paragraph".toString());
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(@l IntrinsicMeasureScope intrinsicMeasureScope, @l IntrinsicMeasurable intrinsicMeasurable, int i5) {
        return getLayoutCache(intrinsicMeasureScope).intrinsicHeight(i5, intrinsicMeasureScope.getLayoutDirection());
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(@l IntrinsicMeasureScope intrinsicMeasureScope, @l IntrinsicMeasurable intrinsicMeasurable, int i5) {
        return getLayoutCache(intrinsicMeasureScope).maxIntrinsicWidth(intrinsicMeasureScope.getLayoutDirection());
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @l
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo82measure3p2s80s(@l MeasureScope measureScope, @l Measurable measurable, long j5) {
        int L0;
        int L02;
        ParagraphLayoutCache layoutCache = getLayoutCache(measureScope);
        boolean m961layoutWithConstraintsK40F9xA = layoutCache.m961layoutWithConstraintsK40F9xA(j5, measureScope.getLayoutDirection());
        layoutCache.getObserveFontChanges$foundation_release();
        Paragraph paragraph$foundation_release = layoutCache.getParagraph$foundation_release();
        l0.m(paragraph$foundation_release);
        long m960getLayoutSizeYbymL2g$foundation_release = layoutCache.m960getLayoutSizeYbymL2g$foundation_release();
        if (m961layoutWithConstraintsK40F9xA) {
            LayoutModifierNodeKt.invalidateLayer(this);
            Map<AlignmentLine, Integer> map = this.baselineCache;
            if (map == null) {
                map = new LinkedHashMap<>(2);
            }
            HorizontalAlignmentLine firstBaseline = AlignmentLineKt.getFirstBaseline();
            L0 = d.L0(paragraph$foundation_release.getFirstBaseline());
            map.put(firstBaseline, Integer.valueOf(L0));
            HorizontalAlignmentLine lastBaseline = AlignmentLineKt.getLastBaseline();
            L02 = d.L0(paragraph$foundation_release.getLastBaseline());
            map.put(lastBaseline, Integer.valueOf(L02));
            this.baselineCache = map;
        }
        Placeable mo4998measureBRTryo0 = measurable.mo4998measureBRTryo0(LayoutUtilsKt.fixedCoerceHeightAndWidthForBits(Constraints.Companion, IntSize.m6214getWidthimpl(m960getLayoutSizeYbymL2g$foundation_release), IntSize.m6213getHeightimpl(m960getLayoutSizeYbymL2g$foundation_release)));
        int m6214getWidthimpl = IntSize.m6214getWidthimpl(m960getLayoutSizeYbymL2g$foundation_release);
        int m6213getHeightimpl = IntSize.m6213getHeightimpl(m960getLayoutSizeYbymL2g$foundation_release);
        Map<AlignmentLine, Integer> map2 = this.baselineCache;
        l0.m(map2);
        return measureScope.layout(m6214getWidthimpl, m6213getHeightimpl, map2, new TextStringSimpleNode$measure$1(mo4998measureBRTryo0));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(@l IntrinsicMeasureScope intrinsicMeasureScope, @l IntrinsicMeasurable intrinsicMeasurable, int i5) {
        return getLayoutCache(intrinsicMeasureScope).intrinsicHeight(i5, intrinsicMeasureScope.getLayoutDirection());
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(@l IntrinsicMeasureScope intrinsicMeasureScope, @l IntrinsicMeasurable intrinsicMeasurable, int i5) {
        return getLayoutCache(intrinsicMeasureScope).minIntrinsicWidth(intrinsicMeasureScope.getLayoutDirection());
    }

    public final boolean updateDraw(@m ColorProducer colorProducer, @l TextStyle textStyle) {
        boolean z4 = !l0.g(colorProducer, this.overrideColor);
        this.overrideColor = colorProducer;
        if (z4 || !textStyle.hasSameDrawAffectingAttributes(this.style)) {
            return true;
        }
        return false;
    }

    /* renamed from: updateLayoutRelatedArgs-HuAbxIM, reason: not valid java name */
    public final boolean m974updateLayoutRelatedArgsHuAbxIM(@l TextStyle textStyle, int i5, int i6, boolean z4, @l FontFamily.Resolver resolver, int i7) {
        boolean z5 = !this.style.hasSameLayoutAffectingAttributes(textStyle);
        this.style = textStyle;
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

    public final boolean updateText(@l String str) {
        if (l0.g(this.text, str)) {
            return false;
        }
        this.text = str;
        clearSubstitution();
        return true;
    }

    private TextStringSimpleNode(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i5, boolean z4, int i6, int i7, ColorProducer colorProducer) {
        MutableState mutableStateOf$default;
        this.text = str;
        this.style = textStyle;
        this.fontFamilyResolver = resolver;
        this.overflow = i5;
        this.softWrap = z4;
        this.maxLines = i6;
        this.minLines = i7;
        this.overrideColor = colorProducer;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.textSubstitution$delegate = mutableStateOf$default;
    }

    @StabilityInferred(parameters = 0)
    @i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0012\"\u0004\b\u0014\u0010\u0015¨\u0006 "}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode$TextSubstitutionValue;", "", "original", "", "substitution", "isShowingSubstitution", "", "layoutCache", "Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;", "(Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;)V", "()Z", "setShowingSubstitution", "(Z)V", "getLayoutCache", "()Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;", "setLayoutCache", "(Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;)V", "getOriginal", "()Ljava/lang/String;", "getSubstitution", "setSubstitution", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", TTDownloadField.TT_HASHCODE, "", "toString", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class TextSubstitutionValue {
        public static final int $stable = 8;
        private boolean isShowingSubstitution;

        @m
        private ParagraphLayoutCache layoutCache;

        @l
        private final String original;

        @l
        private String substitution;

        public TextSubstitutionValue(@l String str, @l String str2, boolean z4, @m ParagraphLayoutCache paragraphLayoutCache) {
            this.original = str;
            this.substitution = str2;
            this.isShowingSubstitution = z4;
            this.layoutCache = paragraphLayoutCache;
        }

        public static /* synthetic */ TextSubstitutionValue copy$default(TextSubstitutionValue textSubstitutionValue, String str, String str2, boolean z4, ParagraphLayoutCache paragraphLayoutCache, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                str = textSubstitutionValue.original;
            }
            if ((i5 & 2) != 0) {
                str2 = textSubstitutionValue.substitution;
            }
            if ((i5 & 4) != 0) {
                z4 = textSubstitutionValue.isShowingSubstitution;
            }
            if ((i5 & 8) != 0) {
                paragraphLayoutCache = textSubstitutionValue.layoutCache;
            }
            return textSubstitutionValue.copy(str, str2, z4, paragraphLayoutCache);
        }

        @l
        public final String component1() {
            return this.original;
        }

        @l
        public final String component2() {
            return this.substitution;
        }

        public final boolean component3() {
            return this.isShowingSubstitution;
        }

        @m
        public final ParagraphLayoutCache component4() {
            return this.layoutCache;
        }

        @l
        public final TextSubstitutionValue copy(@l String str, @l String str2, boolean z4, @m ParagraphLayoutCache paragraphLayoutCache) {
            return new TextSubstitutionValue(str, str2, z4, paragraphLayoutCache);
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
        public final ParagraphLayoutCache getLayoutCache() {
            return this.layoutCache;
        }

        @l
        public final String getOriginal() {
            return this.original;
        }

        @l
        public final String getSubstitution() {
            return this.substitution;
        }

        public int hashCode() {
            int hashCode = ((((this.original.hashCode() * 31) + this.substitution.hashCode()) * 31) + Boolean.hashCode(this.isShowingSubstitution)) * 31;
            ParagraphLayoutCache paragraphLayoutCache = this.layoutCache;
            return hashCode + (paragraphLayoutCache == null ? 0 : paragraphLayoutCache.hashCode());
        }

        public final boolean isShowingSubstitution() {
            return this.isShowingSubstitution;
        }

        public final void setLayoutCache(@m ParagraphLayoutCache paragraphLayoutCache) {
            this.layoutCache = paragraphLayoutCache;
        }

        public final void setShowingSubstitution(boolean z4) {
            this.isShowingSubstitution = z4;
        }

        public final void setSubstitution(@l String str) {
            this.substitution = str;
        }

        @l
        public String toString() {
            return "TextSubstitutionValue(original=" + this.original + ", substitution=" + this.substitution + ", isShowingSubstitution=" + this.isShowingSubstitution + ", layoutCache=" + this.layoutCache + ')';
        }

        public /* synthetic */ TextSubstitutionValue(String str, String str2, boolean z4, ParagraphLayoutCache paragraphLayoutCache, int i5, w wVar) {
            this(str, str2, (i5 & 4) != 0 ? false : z4, (i5 & 8) != 0 ? null : paragraphLayoutCache);
        }
    }

    private final ParagraphLayoutCache getLayoutCache(Density density) {
        ParagraphLayoutCache layoutCache;
        TextSubstitutionValue textSubstitution = getTextSubstitution();
        if (textSubstitution != null && textSubstitution.isShowingSubstitution() && (layoutCache = textSubstitution.getLayoutCache()) != null) {
            layoutCache.setDensity$foundation_release(density);
            return layoutCache;
        }
        ParagraphLayoutCache layoutCache2 = getLayoutCache();
        layoutCache2.setDensity$foundation_release(density);
        return layoutCache2;
    }
}
