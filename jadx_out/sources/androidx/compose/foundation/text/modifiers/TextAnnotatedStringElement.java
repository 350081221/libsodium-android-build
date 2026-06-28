package androidx.compose.foundation.text.modifiers;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.r2;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B¯\u0001\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u001f\u001a\u00020\t\u0012\b\b\u0002\u0010!\u001a\u00020\u000b\u0012\b\b\u0002\u0010\"\u001a\u00020\u000b\u0012\u0016\b\u0002\u0010&\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$\u0018\u00010#\u0012\u001e\b\u0002\u0010)\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010(0#\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0018\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b0\u00101J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\f\u0010\u000e\u001a\u00020\u0005*\u00020\rH\u0016R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\"\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001eR\u0014\u0010\"\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001eR\"\u0010&\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$\u0018\u00010#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R*\u0010)\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010(0#\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u001bR\u0016\u0010+\u001a\u0004\u0018\u00010*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010.\u001a\u0004\u0018\u00010-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00062"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode;", "create", "node", "Lkotlin/r2;", "update", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/text/TextStyle;", "style", "Landroidx/compose/ui/text/TextStyle;", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "onTextLayout", "Lv3/l;", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "I", "softWrap", "Z", "maxLines", "minLines", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "Ljava/util/List;", "Landroidx/compose/ui/geometry/Rect;", "onPlaceholderLayout", "Landroidx/compose/foundation/text/modifiers/SelectionController;", "selectionController", "Landroidx/compose/foundation/text/modifiers/SelectionController;", "Landroidx/compose/ui/graphics/ColorProducer;", TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/graphics/ColorProducer;", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;Lv3/l;IZIILjava/util/List;Lv3/l;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TextAnnotatedStringElement extends ModifierNodeElement<TextAnnotatedStringNode> {
    public static final int $stable = 0;

    @m
    private final ColorProducer color;

    @l
    private final FontFamily.Resolver fontFamilyResolver;
    private final int maxLines;
    private final int minLines;

    @m
    private final v3.l<List<Rect>, r2> onPlaceholderLayout;

    @m
    private final v3.l<TextLayoutResult, r2> onTextLayout;
    private final int overflow;

    @m
    private final List<AnnotatedString.Range<Placeholder>> placeholders;

    @m
    private final SelectionController selectionController;
    private final boolean softWrap;

    @l
    private final TextStyle style;

    @l
    private final AnnotatedString text;

    public /* synthetic */ TextAnnotatedStringElement(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, v3.l lVar, int i5, boolean z4, int i6, int i7, List list, v3.l lVar2, SelectionController selectionController, ColorProducer colorProducer, int i8, w wVar) {
        this(annotatedString, textStyle, resolver, (i8 & 8) != 0 ? null : lVar, (i8 & 16) != 0 ? TextOverflow.Companion.m5985getClipgIe3tQ8() : i5, (i8 & 32) != 0 ? true : z4, (i8 & 64) != 0 ? Integer.MAX_VALUE : i6, (i8 & 128) != 0 ? 1 : i7, (i8 & 256) != 0 ? null : list, (i8 & 512) != 0 ? null : lVar2, (i8 & 1024) != 0 ? null : selectionController, (i8 & 2048) != 0 ? null : colorProducer, null);
    }

    public /* synthetic */ TextAnnotatedStringElement(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, v3.l lVar, int i5, boolean z4, int i6, int i7, List list, v3.l lVar2, SelectionController selectionController, ColorProducer colorProducer, w wVar) {
        this(annotatedString, textStyle, resolver, lVar, i5, z4, i6, i7, list, lVar2, selectionController, colorProducer);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) obj;
        if (l0.g(this.color, textAnnotatedStringElement.color) && l0.g(this.text, textAnnotatedStringElement.text) && l0.g(this.style, textAnnotatedStringElement.style) && l0.g(this.placeholders, textAnnotatedStringElement.placeholders) && l0.g(this.fontFamilyResolver, textAnnotatedStringElement.fontFamilyResolver) && l0.g(this.onTextLayout, textAnnotatedStringElement.onTextLayout) && TextOverflow.m5978equalsimpl0(this.overflow, textAnnotatedStringElement.overflow) && this.softWrap == textAnnotatedStringElement.softWrap && this.maxLines == textAnnotatedStringElement.maxLines && this.minLines == textAnnotatedStringElement.minLines && l0.g(this.onPlaceholderLayout, textAnnotatedStringElement.onPlaceholderLayout) && l0.g(this.selectionController, textAnnotatedStringElement.selectionController)) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int i5;
        int i6;
        int i7;
        int i8;
        int hashCode = ((((this.text.hashCode() * 31) + this.style.hashCode()) * 31) + this.fontFamilyResolver.hashCode()) * 31;
        v3.l<TextLayoutResult, r2> lVar = this.onTextLayout;
        int i9 = 0;
        if (lVar != null) {
            i5 = lVar.hashCode();
        } else {
            i5 = 0;
        }
        int m5979hashCodeimpl = (((((((((hashCode + i5) * 31) + TextOverflow.m5979hashCodeimpl(this.overflow)) * 31) + Boolean.hashCode(this.softWrap)) * 31) + this.maxLines) * 31) + this.minLines) * 31;
        List<AnnotatedString.Range<Placeholder>> list = this.placeholders;
        if (list != null) {
            i6 = list.hashCode();
        } else {
            i6 = 0;
        }
        int i10 = (m5979hashCodeimpl + i6) * 31;
        v3.l<List<Rect>, r2> lVar2 = this.onPlaceholderLayout;
        if (lVar2 != null) {
            i7 = lVar2.hashCode();
        } else {
            i7 = 0;
        }
        int i11 = (i10 + i7) * 31;
        SelectionController selectionController = this.selectionController;
        if (selectionController != null) {
            i8 = selectionController.hashCode();
        } else {
            i8 = 0;
        }
        int i12 = (i11 + i8) * 31;
        ColorProducer colorProducer = this.color;
        if (colorProducer != null) {
            i9 = colorProducer.hashCode();
        }
        return i12 + i9;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@l InspectorInfo inspectorInfo) {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @l
    public TextAnnotatedStringNode create() {
        return new TextAnnotatedStringNode(this.text, this.style, this.fontFamilyResolver, this.onTextLayout, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, this.onPlaceholderLayout, this.selectionController, this.color, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@l TextAnnotatedStringNode textAnnotatedStringNode) {
        textAnnotatedStringNode.doInvalidations(textAnnotatedStringNode.updateDraw(this.color, this.style), textAnnotatedStringNode.updateText(this.text), textAnnotatedStringNode.m973updateLayoutRelatedArgsMPT68mk(this.style, this.placeholders, this.minLines, this.maxLines, this.softWrap, this.fontFamilyResolver, this.overflow), textAnnotatedStringNode.updateCallbacks(this.onTextLayout, this.onPlaceholderLayout, this.selectionController));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TextAnnotatedStringElement(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, v3.l<? super TextLayoutResult, r2> lVar, int i5, boolean z4, int i6, int i7, List<AnnotatedString.Range<Placeholder>> list, v3.l<? super List<Rect>, r2> lVar2, SelectionController selectionController, ColorProducer colorProducer) {
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
        this.color = colorProducer;
    }
}
