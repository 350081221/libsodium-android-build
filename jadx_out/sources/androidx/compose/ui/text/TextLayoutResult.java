package androidx.compose.ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.IntSize;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u00107\u001a\u000206\u0012\u0006\u0010*\u001a\u00020)¢\u0006\u0004\bS\u0010TJ\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002J\u000e\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\tJ\u0016\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0005J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u0002J\u000e\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u0002J\u0018\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000e\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\u0002J\u001b\u0010!\u001a\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u000e\u0010\"\u001a\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\u0002J\u0016\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u0002J$\u0010-\u001a\u00020\u00002\b\b\u0002\u0010(\u001a\u00020'2\b\b\u0002\u0010*\u001a\u00020)ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u0013\u0010/\u001a\u00020\u00052\b\u0010.\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u00100\u001a\u00020\u0002H\u0016J\b\u00102\u001a\u000201H\u0016R\u0017\u0010(\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u00103\u001a\u0004\b4\u00105R\u0017\u00107\u001a\u0002068\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001d\u0010*\u001a\u00020)8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b*\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010>\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010B\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bB\u0010?\u001a\u0004\bC\u0010AR\u001f\u0010E\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0D8\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0011\u0010K\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0011\u0010M\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bL\u0010JR\u0011\u0010O\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bN\u0010JR\u0011\u0010R\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bP\u0010Q\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006U"}, d2 = {"Landroidx/compose/ui/text/TextLayoutResult;", "", "", "lineIndex", "getLineStart", "", "visibleEnd", "getLineEnd", "isLineEllipsized", "", "getLineTop", "getLineBottom", "getLineLeft", "getLineRight", TypedValues.CycleType.S_WAVE_OFFSET, "getLineForOffset", "vertical", "getLineForVerticalPosition", "usePrimaryDirection", "getHorizontalPosition", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "getParagraphDirection", "getBidiRunDirection", "Landroidx/compose/ui/geometry/Offset;", "position", "getOffsetForPosition-k-4lQ0M", "(J)I", "getOffsetForPosition", "Landroidx/compose/ui/geometry/Rect;", "getBoundingBox", "Landroidx/compose/ui/text/TextRange;", "getWordBoundary--jx7JFs", "(I)J", "getWordBoundary", "getCursorRect", "start", "end", "Landroidx/compose/ui/graphics/Path;", "getPathForRange", "Landroidx/compose/ui/text/TextLayoutInput;", "layoutInput", "Landroidx/compose/ui/unit/IntSize;", "size", "copy-O0kMr_c", "(Landroidx/compose/ui/text/TextLayoutInput;J)Landroidx/compose/ui/text/TextLayoutResult;", "copy", "other", "equals", TTDownloadField.TT_HASHCODE, "", "toString", "Landroidx/compose/ui/text/TextLayoutInput;", "getLayoutInput", "()Landroidx/compose/ui/text/TextLayoutInput;", "Landroidx/compose/ui/text/MultiParagraph;", "multiParagraph", "Landroidx/compose/ui/text/MultiParagraph;", "getMultiParagraph", "()Landroidx/compose/ui/text/MultiParagraph;", "J", "getSize-YbymL2g", "()J", "firstBaseline", "F", "getFirstBaseline", "()F", "lastBaseline", "getLastBaseline", "", "placeholderRects", "Ljava/util/List;", "getPlaceholderRects", "()Ljava/util/List;", "getDidOverflowHeight", "()Z", "didOverflowHeight", "getDidOverflowWidth", "didOverflowWidth", "getHasVisualOverflow", "hasVisualOverflow", "getLineCount", "()I", "lineCount", "<init>", "(Landroidx/compose/ui/text/TextLayoutInput;Landroidx/compose/ui/text/MultiParagraph;JLkotlin/jvm/internal/w;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TextLayoutResult {
    public static final int $stable = 8;
    private final float firstBaseline;
    private final float lastBaseline;

    @l
    private final TextLayoutInput layoutInput;

    @l
    private final MultiParagraph multiParagraph;

    @l
    private final List<Rect> placeholderRects;
    private final long size;

    private TextLayoutResult(TextLayoutInput textLayoutInput, MultiParagraph multiParagraph, long j5) {
        this.layoutInput = textLayoutInput;
        this.multiParagraph = multiParagraph;
        this.size = j5;
        this.firstBaseline = multiParagraph.getFirstBaseline();
        this.lastBaseline = multiParagraph.getLastBaseline();
        this.placeholderRects = multiParagraph.getPlaceholderRects();
    }

    public /* synthetic */ TextLayoutResult(TextLayoutInput textLayoutInput, MultiParagraph multiParagraph, long j5, w wVar) {
        this(textLayoutInput, multiParagraph, j5);
    }

    /* renamed from: copy-O0kMr_c$default, reason: not valid java name */
    public static /* synthetic */ TextLayoutResult m5515copyO0kMr_c$default(TextLayoutResult textLayoutResult, TextLayoutInput textLayoutInput, long j5, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            textLayoutInput = textLayoutResult.layoutInput;
        }
        if ((i5 & 2) != 0) {
            j5 = textLayoutResult.size;
        }
        return textLayoutResult.m5516copyO0kMr_c(textLayoutInput, j5);
    }

    public static /* synthetic */ int getLineEnd$default(TextLayoutResult textLayoutResult, int i5, boolean z4, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            z4 = false;
        }
        return textLayoutResult.getLineEnd(i5, z4);
    }

    @l
    /* renamed from: copy-O0kMr_c, reason: not valid java name */
    public final TextLayoutResult m5516copyO0kMr_c(@l TextLayoutInput textLayoutInput, long j5) {
        return new TextLayoutResult(textLayoutInput, this.multiParagraph, j5, null);
    }

    public boolean equals(@m Object obj) {
        boolean z4;
        boolean z5;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextLayoutResult)) {
            return false;
        }
        TextLayoutResult textLayoutResult = (TextLayoutResult) obj;
        if (!l0.g(this.layoutInput, textLayoutResult.layoutInput) || !l0.g(this.multiParagraph, textLayoutResult.multiParagraph) || !IntSize.m6212equalsimpl0(this.size, textLayoutResult.size)) {
            return false;
        }
        if (this.firstBaseline == textLayoutResult.firstBaseline) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            return false;
        }
        if (this.lastBaseline == textLayoutResult.lastBaseline) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5 && l0.g(this.placeholderRects, textLayoutResult.placeholderRects)) {
            return true;
        }
        return false;
    }

    @l
    public final ResolvedTextDirection getBidiRunDirection(int i5) {
        return this.multiParagraph.getBidiRunDirection(i5);
    }

    @l
    public final Rect getBoundingBox(int i5) {
        return this.multiParagraph.getBoundingBox(i5);
    }

    @l
    public final Rect getCursorRect(int i5) {
        return this.multiParagraph.getCursorRect(i5);
    }

    public final boolean getDidOverflowHeight() {
        if (!this.multiParagraph.getDidExceedMaxLines() && IntSize.m6213getHeightimpl(this.size) >= this.multiParagraph.getHeight()) {
            return false;
        }
        return true;
    }

    public final boolean getDidOverflowWidth() {
        return ((float) IntSize.m6214getWidthimpl(this.size)) < this.multiParagraph.getWidth();
    }

    public final float getFirstBaseline() {
        return this.firstBaseline;
    }

    public final boolean getHasVisualOverflow() {
        return getDidOverflowWidth() || getDidOverflowHeight();
    }

    public final float getHorizontalPosition(int i5, boolean z4) {
        return this.multiParagraph.getHorizontalPosition(i5, z4);
    }

    public final float getLastBaseline() {
        return this.lastBaseline;
    }

    @l
    public final TextLayoutInput getLayoutInput() {
        return this.layoutInput;
    }

    public final float getLineBottom(int i5) {
        return this.multiParagraph.getLineBottom(i5);
    }

    public final int getLineCount() {
        return this.multiParagraph.getLineCount();
    }

    public final int getLineEnd(int i5, boolean z4) {
        return this.multiParagraph.getLineEnd(i5, z4);
    }

    public final int getLineForOffset(int i5) {
        return this.multiParagraph.getLineForOffset(i5);
    }

    public final int getLineForVerticalPosition(float f5) {
        return this.multiParagraph.getLineForVerticalPosition(f5);
    }

    public final float getLineLeft(int i5) {
        return this.multiParagraph.getLineLeft(i5);
    }

    public final float getLineRight(int i5) {
        return this.multiParagraph.getLineRight(i5);
    }

    public final int getLineStart(int i5) {
        return this.multiParagraph.getLineStart(i5);
    }

    public final float getLineTop(int i5) {
        return this.multiParagraph.getLineTop(i5);
    }

    @l
    public final MultiParagraph getMultiParagraph() {
        return this.multiParagraph;
    }

    /* renamed from: getOffsetForPosition-k-4lQ0M, reason: not valid java name */
    public final int m5517getOffsetForPositionk4lQ0M(long j5) {
        return this.multiParagraph.m5422getOffsetForPositionk4lQ0M(j5);
    }

    @l
    public final ResolvedTextDirection getParagraphDirection(int i5) {
        return this.multiParagraph.getParagraphDirection(i5);
    }

    @l
    public final Path getPathForRange(int i5, int i6) {
        return this.multiParagraph.getPathForRange(i5, i6);
    }

    @l
    public final List<Rect> getPlaceholderRects() {
        return this.placeholderRects;
    }

    /* renamed from: getSize-YbymL2g, reason: not valid java name */
    public final long m5518getSizeYbymL2g() {
        return this.size;
    }

    /* renamed from: getWordBoundary--jx7JFs, reason: not valid java name */
    public final long m5519getWordBoundaryjx7JFs(int i5) {
        return this.multiParagraph.m5423getWordBoundaryjx7JFs(i5);
    }

    public int hashCode() {
        return (((((((((this.layoutInput.hashCode() * 31) + this.multiParagraph.hashCode()) * 31) + IntSize.m6215hashCodeimpl(this.size)) * 31) + Float.hashCode(this.firstBaseline)) * 31) + Float.hashCode(this.lastBaseline)) * 31) + this.placeholderRects.hashCode();
    }

    public final boolean isLineEllipsized(int i5) {
        return this.multiParagraph.isLineEllipsized(i5);
    }

    @l
    public String toString() {
        return "TextLayoutResult(layoutInput=" + this.layoutInput + ", multiParagraph=" + this.multiParagraph + ", size=" + ((Object) IntSize.m6217toStringimpl(this.size)) + ", firstBaseline=" + this.firstBaseline + ", lastBaseline=" + this.lastBaseline + ", placeholderRects=" + this.placeholderRects + ')';
    }
}
