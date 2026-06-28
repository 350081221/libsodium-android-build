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
@i0(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B¯\u0001\u0012\u0006\u0010)\u001a\u00020\u0003\u0012\u0006\u0010*\u001a\u00020\u0005\u0012\u0006\u0010+\u001a\u00020\u0007\u0012\u0016\b\u0002\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\b\b\u0002\u0010-\u001a\u00020\r\u0012\b\b\u0002\u0010.\u001a\u00020\u0011\u0012\b\b\u0002\u0010/\u001a\u00020\u0013\u0012\b\b\u0002\u00100\u001a\u00020\u0013\u0012\u0016\b\u0002\u00101\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u0016\u0012\u001e\b\u0002\u00102\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\bC\u0010DJ\t\u0010\u0004\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÂ\u0003J\t\u0010\b\u001a\u00020\u0007HÂ\u0003J\u0017\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÂ\u0003J\u0016\u0010\u0010\u001a\u00020\rHÂ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0012\u001a\u00020\u0011HÂ\u0003J\t\u0010\u0014\u001a\u00020\u0013HÂ\u0003J\t\u0010\u0015\u001a\u00020\u0013HÂ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u0016HÂ\u0003J\u001f\u0010\u001b\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÂ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÂ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÂ\u0003J\b\u0010 \u001a\u00020\u0002H\u0016J\u0010\u0010\"\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u0002H\u0016J\u0013\u0010%\u001a\u00020\u00112\b\u0010$\u001a\u0004\u0018\u00010#H\u0096\u0002J\b\u0010&\u001a\u00020\u0013H\u0016J\f\u0010(\u001a\u00020\u000b*\u00020'H\u0016JÁ\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010)\u001a\u00020\u00032\b\b\u0002\u0010*\u001a\u00020\u00052\b\b\u0002\u0010+\u001a\u00020\u00072\u0016\b\u0002\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\b\b\u0002\u0010-\u001a\u00020\r2\b\b\u0002\u0010.\u001a\u00020\u00112\b\b\u0002\u0010/\u001a\u00020\u00132\b\b\u0002\u00100\u001a\u00020\u00132\u0016\b\u0002\u00101\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u00162\u001e\b\u0002\u00102\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u001eHÆ\u0001ø\u0001\u0001¢\u0006\u0004\b5\u00106J\t\u00109\u001a\u000208HÖ\u0001R\u0014\u0010)\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010:R\u0014\u0010*\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010;R\u0014\u0010+\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010<R\"\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010=R\u001a\u0010-\u001a\u00020\r8\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b-\u0010>R\u0014\u0010.\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010?R\u0014\u0010/\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010>R\u0014\u00100\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010>R\"\u00101\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010@R*\u00102\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010=R\u0016\u00103\u001a\u0004\u0018\u00010\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010AR\u0016\u00104\u001a\u0004\u0018\u00010\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010B\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006E"}, d2 = {"Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringNode;", "Landroidx/compose/ui/text/AnnotatedString;", "component1", "Landroidx/compose/ui/text/TextStyle;", "component2", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "component3", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "Lkotlin/r2;", "component4", "Landroidx/compose/ui/text/style/TextOverflow;", "component5-gIe3tQ8", "()I", "component5", "", "component6", "", "component7", "component8", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "component9", "Landroidx/compose/ui/geometry/Rect;", "component10", "Landroidx/compose/foundation/text/modifiers/SelectionController;", "component11", "Landroidx/compose/ui/graphics/ColorProducer;", "component12", "create", "node", "update", "", "other", "equals", TTDownloadField.TT_HASHCODE, "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "text", "style", "fontFamilyResolver", "onTextLayout", "overflow", "softWrap", "maxLines", "minLines", "placeholders", "onPlaceholderLayout", "selectionController", TypedValues.Custom.S_COLOR, "copy-VhcvRP8", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;Lv3/l;IZIILjava/util/List;Lv3/l;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;)Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;", "copy", "", "toString", "Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/text/TextStyle;", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "Lv3/l;", "I", "Z", "Ljava/util/List;", "Landroidx/compose/foundation/text/modifiers/SelectionController;", "Landroidx/compose/ui/graphics/ColorProducer;", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;Lv3/l;IZIILjava/util/List;Lv3/l;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SelectableTextAnnotatedStringElement extends ModifierNodeElement<SelectableTextAnnotatedStringNode> {
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

    public /* synthetic */ SelectableTextAnnotatedStringElement(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, v3.l lVar, int i5, boolean z4, int i6, int i7, List list, v3.l lVar2, SelectionController selectionController, ColorProducer colorProducer, int i8, w wVar) {
        this(annotatedString, textStyle, resolver, (i8 & 8) != 0 ? null : lVar, (i8 & 16) != 0 ? TextOverflow.Companion.m5985getClipgIe3tQ8() : i5, (i8 & 32) != 0 ? true : z4, (i8 & 64) != 0 ? Integer.MAX_VALUE : i6, (i8 & 128) != 0 ? 1 : i7, (i8 & 256) != 0 ? null : list, (i8 & 512) != 0 ? null : lVar2, (i8 & 1024) != 0 ? null : selectionController, (i8 & 2048) != 0 ? null : colorProducer, null);
    }

    public /* synthetic */ SelectableTextAnnotatedStringElement(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, v3.l lVar, int i5, boolean z4, int i6, int i7, List list, v3.l lVar2, SelectionController selectionController, ColorProducer colorProducer, w wVar) {
        this(annotatedString, textStyle, resolver, lVar, i5, z4, i6, i7, list, lVar2, selectionController, colorProducer);
    }

    private final AnnotatedString component1() {
        return this.text;
    }

    private final v3.l<List<Rect>, r2> component10() {
        return this.onPlaceholderLayout;
    }

    private final SelectionController component11() {
        return this.selectionController;
    }

    private final ColorProducer component12() {
        return this.color;
    }

    private final TextStyle component2() {
        return this.style;
    }

    private final FontFamily.Resolver component3() {
        return this.fontFamilyResolver;
    }

    private final v3.l<TextLayoutResult, r2> component4() {
        return this.onTextLayout;
    }

    /* renamed from: component5-gIe3tQ8, reason: not valid java name */
    private final int m964component5gIe3tQ8() {
        return this.overflow;
    }

    private final boolean component6() {
        return this.softWrap;
    }

    private final int component7() {
        return this.maxLines;
    }

    private final int component8() {
        return this.minLines;
    }

    private final List<AnnotatedString.Range<Placeholder>> component9() {
        return this.placeholders;
    }

    @l
    /* renamed from: copy-VhcvRP8, reason: not valid java name */
    public final SelectableTextAnnotatedStringElement m966copyVhcvRP8(@l AnnotatedString annotatedString, @l TextStyle textStyle, @l FontFamily.Resolver resolver, @m v3.l<? super TextLayoutResult, r2> lVar, int i5, boolean z4, int i6, int i7, @m List<AnnotatedString.Range<Placeholder>> list, @m v3.l<? super List<Rect>, r2> lVar2, @m SelectionController selectionController, @m ColorProducer colorProducer) {
        return new SelectableTextAnnotatedStringElement(annotatedString, textStyle, resolver, lVar, i5, z4, i6, i7, list, lVar2, selectionController, colorProducer, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectableTextAnnotatedStringElement)) {
            return false;
        }
        SelectableTextAnnotatedStringElement selectableTextAnnotatedStringElement = (SelectableTextAnnotatedStringElement) obj;
        if (l0.g(this.color, selectableTextAnnotatedStringElement.color) && l0.g(this.text, selectableTextAnnotatedStringElement.text) && l0.g(this.style, selectableTextAnnotatedStringElement.style) && l0.g(this.placeholders, selectableTextAnnotatedStringElement.placeholders) && l0.g(this.fontFamilyResolver, selectableTextAnnotatedStringElement.fontFamilyResolver) && l0.g(this.onTextLayout, selectableTextAnnotatedStringElement.onTextLayout) && TextOverflow.m5978equalsimpl0(this.overflow, selectableTextAnnotatedStringElement.overflow) && this.softWrap == selectableTextAnnotatedStringElement.softWrap && this.maxLines == selectableTextAnnotatedStringElement.maxLines && this.minLines == selectableTextAnnotatedStringElement.minLines && l0.g(this.onPlaceholderLayout, selectableTextAnnotatedStringElement.onPlaceholderLayout) && l0.g(this.selectionController, selectableTextAnnotatedStringElement.selectionController)) {
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

    @l
    public String toString() {
        return "SelectableTextAnnotatedStringElement(text=" + ((Object) this.text) + ", style=" + this.style + ", fontFamilyResolver=" + this.fontFamilyResolver + ", onTextLayout=" + this.onTextLayout + ", overflow=" + ((Object) TextOverflow.m5980toStringimpl(this.overflow)) + ", softWrap=" + this.softWrap + ", maxLines=" + this.maxLines + ", minLines=" + this.minLines + ", placeholders=" + this.placeholders + ", onPlaceholderLayout=" + this.onPlaceholderLayout + ", selectionController=" + this.selectionController + ", color=" + this.color + ')';
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @l
    public SelectableTextAnnotatedStringNode create() {
        return new SelectableTextAnnotatedStringNode(this.text, this.style, this.fontFamilyResolver, this.onTextLayout, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, this.onPlaceholderLayout, this.selectionController, this.color, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@l SelectableTextAnnotatedStringNode selectableTextAnnotatedStringNode) {
        selectableTextAnnotatedStringNode.m967updateL09Iy8E(this.text, this.style, this.placeholders, this.minLines, this.maxLines, this.softWrap, this.fontFamilyResolver, this.overflow, this.onTextLayout, this.onPlaceholderLayout, this.selectionController, this.color);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SelectableTextAnnotatedStringElement(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, v3.l<? super TextLayoutResult, r2> lVar, int i5, boolean z4, int i6, int i7, List<AnnotatedString.Range<Placeholder>> list, v3.l<? super List<Rect>, r2> lVar2, SelectionController selectionController, ColorProducer colorProducer) {
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
