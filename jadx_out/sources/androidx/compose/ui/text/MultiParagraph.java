package androidx.compose.ui.text;

import androidx.annotation.IntRange;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.platform.AndroidMultiParagraphDraw_androidKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.List;
import kotlin.b1;
import kotlin.collections.b0;
import kotlin.collections.e0;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.ranges.u;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B-\b\u0017\u0012\u0006\u0010K\u001a\u00020J\u0012\b\b\u0002\u0010O\u001a\u00020\u0002\u0012\b\b\u0002\u0010s\u001a\u000205\u0012\u0006\u0010W\u001a\u00020\u001c¢\u0006\u0004\bt\u0010uB[\b\u0017\u0012\u0006\u0010j\u001a\u00020g\u0012\u0006\u0010w\u001a\u00020v\u0012\u0014\b\u0002\u0010z\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020y0x0_\u0012\b\b\u0002\u0010O\u001a\u00020\u0002\u0012\b\b\u0002\u0010s\u001a\u000205\u0012\u0006\u0010W\u001a\u00020\u001c\u0012\u0006\u0010|\u001a\u00020{\u0012\u0006\u0010~\u001a\u00020}¢\u0006\u0004\bt\u0010\u007fB^\b\u0017\u0012\u0006\u0010j\u001a\u00020g\u0012\u0006\u0010w\u001a\u00020v\u0012\u0006\u0010W\u001a\u00020\u001c\u0012\u0006\u0010|\u001a\u00020{\u0012\b\u0010\u0081\u0001\u001a\u00030\u0080\u0001\u0012\u0014\b\u0002\u0010z\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020y0x0_\u0012\b\b\u0002\u0010O\u001a\u00020\u0002\u0012\b\b\u0002\u0010s\u001a\u000205¢\u0006\u0005\bt\u0010\u0082\u0001B.\u0012\u0006\u0010K\u001a\u00020J\u0012\b\u0010\u0084\u0001\u001a\u00030\u0083\u0001\u0012\b\b\u0002\u0010O\u001a\u00020\u0002\u0012\b\b\u0002\u0010s\u001a\u000205¢\u0006\u0005\bt\u0010\u0085\u0001B`\b\u0016\u0012\u0006\u0010j\u001a\u00020g\u0012\u0006\u0010w\u001a\u00020v\u0012\b\u0010\u0084\u0001\u001a\u00030\u0083\u0001\u0012\u0006\u0010|\u001a\u00020{\u0012\b\u0010\u0081\u0001\u001a\u00030\u0080\u0001\u0012\u0014\b\u0002\u0010z\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020y0x0_\u0012\b\b\u0002\u0010O\u001a\u00020\u0002\u0012\b\b\u0002\u0010s\u001a\u000205¢\u0006\u0005\bt\u0010\u0086\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J<\u0010\u0013\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012JP\u0010\u0013\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019JX\u0010\u0013\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0016ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0002J\u000e\u0010%\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u001cJ\u0018\u0010*\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u000e\u0010,\u001a\u00020+2\u0006\u0010\u0003\u001a\u00020\u0002J*\u00104\u001a\u00020/2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/2\b\b\u0001\u00101\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b2\u00103J\u0016\u00107\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00106\u001a\u000205J\u000e\u00109\u001a\u0002082\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010:\u001a\u0002082\u0006\u0010\u0003\u001a\u00020\u0002J\u001b\u0010=\u001a\u00020-2\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b;\u0010<J\u000e\u0010>\u001a\u00020+2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010?\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010@\u001a\u00020\u001c2\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010A\u001a\u00020\u001c2\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010B\u001a\u00020\u001c2\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010C\u001a\u00020\u001c2\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010D\u001a\u00020\u001c2\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010E\u001a\u00020\u001c2\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010F\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002J\u0018\u0010H\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010G\u001a\u000205J\u000e\u0010I\u001a\u0002052\u0006\u0010\u0007\u001a\u00020\u0002R\u0017\u0010K\u001a\u00020J8\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u0017\u0010O\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u0017\u0010S\u001a\u0002058\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u0017\u0010W\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u0017\u0010[\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b[\u0010X\u001a\u0004\b\\\u0010ZR\u0017\u0010]\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b]\u0010P\u001a\u0004\b^\u0010RR\u001f\u0010`\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0_8\u0006¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010cR \u0010e\u001a\b\u0012\u0004\u0012\u00020d0_8\u0000X\u0080\u0004¢\u0006\f\n\u0004\be\u0010a\u001a\u0004\bf\u0010cR\u0014\u0010j\u001a\u00020g8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bh\u0010iR\u0011\u0010l\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\bk\u0010ZR\u0011\u0010n\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\bm\u0010ZR\u0011\u0010p\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\bo\u0010ZR\u0011\u0010r\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\bq\u0010Z\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0087\u0001"}, d2 = {"Landroidx/compose/ui/text/MultiParagraph;", "", "", TypedValues.CycleType.S_WAVE_OFFSET, "Lkotlin/r2;", "requireIndexInRange", "requireIndexInRangeInclusiveEnd", "lineIndex", "requireLineIndexInRange", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/graphics/Shadow;", "shadow", "Landroidx/compose/ui/text/style/TextDecoration;", "decoration", "paint-RPmYEkk", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;)V", "paint", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "drawStyle", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "paint-LG529CI", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "Landroidx/compose/ui/graphics/Brush;", "brush", "", "alpha", "paint-hn5TExg", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "start", "end", "Landroidx/compose/ui/graphics/Path;", "getPathForRange", "vertical", "getLineForVerticalPosition", "Landroidx/compose/ui/geometry/Offset;", "position", "getOffsetForPosition-k-4lQ0M", "(J)I", "getOffsetForPosition", "Landroidx/compose/ui/geometry/Rect;", "getBoundingBox", "Landroidx/compose/ui/text/TextRange;", "range", "", "array", "arrayStart", "fillBoundingBoxes-8ffj60Q", "(J[FI)[F", "fillBoundingBoxes", "", "usePrimaryDirection", "getHorizontalPosition", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "getParagraphDirection", "getBidiRunDirection", "getWordBoundary--jx7JFs", "(I)J", "getWordBoundary", "getCursorRect", "getLineForOffset", "getLineLeft", "getLineRight", "getLineTop", "getLineBottom", "getLineHeight", "getLineWidth", "getLineStart", "visibleEnd", "getLineEnd", "isLineEllipsized", "Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "intrinsics", "Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "getIntrinsics", "()Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "maxLines", "I", "getMaxLines", "()I", "didExceedMaxLines", "Z", "getDidExceedMaxLines", "()Z", "width", "F", "getWidth", "()F", "height", "getHeight", "lineCount", "getLineCount", "", "placeholderRects", "Ljava/util/List;", "getPlaceholderRects", "()Ljava/util/List;", "Landroidx/compose/ui/text/ParagraphInfo;", "paragraphInfoList", "getParagraphInfoList$ui_text_release", "Landroidx/compose/ui/text/AnnotatedString;", "getAnnotatedString", "()Landroidx/compose/ui/text/AnnotatedString;", "annotatedString", "getMinIntrinsicWidth", "minIntrinsicWidth", "getMaxIntrinsicWidth", "maxIntrinsicWidth", "getFirstBaseline", "firstBaseline", "getLastBaseline", "lastBaseline", "ellipsis", "<init>", "(Landroidx/compose/ui/text/MultiParagraphIntrinsics;IZF)V", "Landroidx/compose/ui/text/TextStyle;", "style", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "resourceLoader", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;IZFLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/Font$ResourceLoader;)V", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;FLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;IZ)V", "Landroidx/compose/ui/unit/Constraints;", "constraints", "(Landroidx/compose/ui/text/MultiParagraphIntrinsics;JIZLkotlin/jvm/internal/w;)V", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;JLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;IZLkotlin/jvm/internal/w;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nMultiParagraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/MultiParagraph\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1055:1\n508#2,3:1056\n33#2,4:1059\n511#2:1063\n151#2,3:1064\n33#2,4:1067\n154#2,2:1071\n38#2:1073\n156#2:1074\n512#2,2:1075\n38#2:1077\n514#2:1078\n33#2,6:1080\n33#2,6:1086\n1#3:1079\n*S KotlinDebug\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/MultiParagraph\n*L\n373#1:1056,3\n373#1:1059,4\n373#1:1063\n375#1:1064,3\n375#1:1067,4\n375#1:1071,2\n375#1:1073\n375#1:1074\n373#1:1075,2\n373#1:1077\n373#1:1078\n401#1:1080,6\n418#1:1086,6\n*E\n"})
/* loaded from: classes.dex */
public final class MultiParagraph {
    public static final int $stable = 8;
    private final boolean didExceedMaxLines;
    private final float height;

    @l
    private final MultiParagraphIntrinsics intrinsics;
    private final int lineCount;
    private final int maxLines;

    @l
    private final List<ParagraphInfo> paragraphInfoList;

    @l
    private final List<Rect> placeholderRects;
    private final float width;

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j5, Density density, FontFamily.Resolver resolver, List list, int i5, boolean z4, w wVar) {
        this(annotatedString, textStyle, j5, density, resolver, (List<AnnotatedString.Range<Placeholder>>) list, i5, z4);
    }

    private MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j5, int i5, boolean z4) {
        boolean z5;
        int m5999getMaxHeightimpl;
        int G;
        this.intrinsics = multiParagraphIntrinsics;
        this.maxLines = i5;
        int i6 = 0;
        if (Constraints.m6002getMinWidthimpl(j5) == 0 && Constraints.m6001getMinHeightimpl(j5) == 0) {
            ArrayList arrayList = new ArrayList();
            List<ParagraphIntrinsicInfo> infoList$ui_text_release = multiParagraphIntrinsics.getInfoList$ui_text_release();
            int size = infoList$ui_text_release.size();
            int i7 = 0;
            float f5 = 0.0f;
            int i8 = 0;
            while (i8 < size) {
                ParagraphIntrinsicInfo paragraphIntrinsicInfo = infoList$ui_text_release.get(i8);
                ParagraphIntrinsics intrinsics = paragraphIntrinsicInfo.getIntrinsics();
                int m6000getMaxWidthimpl = Constraints.m6000getMaxWidthimpl(j5);
                if (Constraints.m5995getHasBoundedHeightimpl(j5)) {
                    m5999getMaxHeightimpl = u.u(Constraints.m5999getMaxHeightimpl(j5) - ParagraphKt.ceilToInt(f5), i6);
                } else {
                    m5999getMaxHeightimpl = Constraints.m5999getMaxHeightimpl(j5);
                }
                Paragraph m5438Paragraph_EkL_Y = ParagraphKt.m5438Paragraph_EkL_Y(intrinsics, ConstraintsKt.Constraints$default(0, m6000getMaxWidthimpl, 0, m5999getMaxHeightimpl, 5, null), this.maxLines - i7, z4);
                float height = f5 + m5438Paragraph_EkL_Y.getHeight();
                int lineCount = i7 + m5438Paragraph_EkL_Y.getLineCount();
                arrayList.add(new ParagraphInfo(m5438Paragraph_EkL_Y, paragraphIntrinsicInfo.getStartIndex(), paragraphIntrinsicInfo.getEndIndex(), i7, lineCount, f5, height));
                if (!m5438Paragraph_EkL_Y.getDidExceedMaxLines()) {
                    if (lineCount == this.maxLines) {
                        G = kotlin.collections.w.G(this.intrinsics.getInfoList$ui_text_release());
                        if (i8 != G) {
                        }
                    }
                    i8++;
                    i7 = lineCount;
                    f5 = height;
                    i6 = 0;
                }
                i7 = lineCount;
                f5 = height;
                z5 = true;
                break;
            }
            z5 = false;
            this.height = f5;
            this.lineCount = i7;
            this.didExceedMaxLines = z5;
            this.paragraphInfoList = arrayList;
            this.width = Constraints.m6000getMaxWidthimpl(j5);
            List<Rect> arrayList2 = new ArrayList<>(arrayList.size());
            int size2 = arrayList.size();
            for (int i9 = 0; i9 < size2; i9++) {
                ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i9);
                List<Rect> placeholderRects = paragraphInfo.getParagraph().getPlaceholderRects();
                ArrayList arrayList3 = new ArrayList(placeholderRects.size());
                int size3 = placeholderRects.size();
                for (int i10 = 0; i10 < size3; i10++) {
                    Rect rect = placeholderRects.get(i10);
                    arrayList3.add(rect != null ? paragraphInfo.toGlobal(rect) : null);
                }
                b0.n0(arrayList2, arrayList3);
            }
            if (arrayList2.size() < this.intrinsics.getPlaceholders().size()) {
                int size4 = this.intrinsics.getPlaceholders().size() - arrayList2.size();
                ArrayList arrayList4 = new ArrayList(size4);
                for (int i11 = 0; i11 < size4; i11++) {
                    arrayList4.add(null);
                }
                arrayList2 = e0.A4(arrayList2, arrayList4);
            }
            this.placeholderRects = arrayList2;
            return;
        }
        throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.".toString());
    }

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j5, int i5, boolean z4, w wVar) {
        this(multiParagraphIntrinsics, j5, i5, z4);
    }

    private final AnnotatedString getAnnotatedString() {
        return this.intrinsics.getAnnotatedString();
    }

    public static /* synthetic */ int getLineEnd$default(MultiParagraph multiParagraph, int i5, boolean z4, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            z4 = false;
        }
        return multiParagraph.getLineEnd(i5, z4);
    }

    /* renamed from: paint-LG529CI$default, reason: not valid java name */
    public static /* synthetic */ void m5418paintLG529CI$default(MultiParagraph multiParagraph, Canvas canvas, long j5, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i5, int i6, Object obj) {
        long j6;
        Shadow shadow2;
        TextDecoration textDecoration2;
        int i7;
        if ((i6 & 2) != 0) {
            j6 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j6 = j5;
        }
        DrawStyle drawStyle2 = null;
        if ((i6 & 4) != 0) {
            shadow2 = null;
        } else {
            shadow2 = shadow;
        }
        if ((i6 & 8) != 0) {
            textDecoration2 = null;
        } else {
            textDecoration2 = textDecoration;
        }
        if ((i6 & 16) == 0) {
            drawStyle2 = drawStyle;
        }
        if ((i6 & 32) != 0) {
            i7 = DrawScope.Companion.m4278getDefaultBlendMode0nO6VwU();
        } else {
            i7 = i5;
        }
        multiParagraph.m5424paintLG529CI(canvas, j6, shadow2, textDecoration2, drawStyle2, i7);
    }

    /* renamed from: paint-RPmYEkk$default, reason: not valid java name */
    public static /* synthetic */ void m5419paintRPmYEkk$default(MultiParagraph multiParagraph, Canvas canvas, long j5, Shadow shadow, TextDecoration textDecoration, int i5, Object obj) {
        Shadow shadow2;
        TextDecoration textDecoration2;
        if ((i5 & 2) != 0) {
            j5 = Color.Companion.m3770getUnspecified0d7_KjU();
        }
        long j6 = j5;
        if ((i5 & 4) != 0) {
            shadow2 = null;
        } else {
            shadow2 = shadow;
        }
        if ((i5 & 8) != 0) {
            textDecoration2 = null;
        } else {
            textDecoration2 = textDecoration;
        }
        multiParagraph.m5425paintRPmYEkk(canvas, j6, shadow2, textDecoration2);
    }

    /* renamed from: paint-hn5TExg$default, reason: not valid java name */
    public static /* synthetic */ void m5420painthn5TExg$default(MultiParagraph multiParagraph, Canvas canvas, Brush brush, float f5, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i5, int i6, Object obj) {
        float f6;
        Shadow shadow2;
        TextDecoration textDecoration2;
        DrawStyle drawStyle2;
        int i7;
        if ((i6 & 4) != 0) {
            f6 = Float.NaN;
        } else {
            f6 = f5;
        }
        if ((i6 & 8) != 0) {
            shadow2 = null;
        } else {
            shadow2 = shadow;
        }
        if ((i6 & 16) != 0) {
            textDecoration2 = null;
        } else {
            textDecoration2 = textDecoration;
        }
        if ((i6 & 32) != 0) {
            drawStyle2 = null;
        } else {
            drawStyle2 = drawStyle;
        }
        if ((i6 & 64) != 0) {
            i7 = DrawScope.Companion.m4278getDefaultBlendMode0nO6VwU();
        } else {
            i7 = i5;
        }
        multiParagraph.m5426painthn5TExg(canvas, brush, f6, shadow2, textDecoration2, drawStyle2, i7);
    }

    private final void requireIndexInRange(int i5) {
        boolean z4 = false;
        if (i5 >= 0 && i5 < getAnnotatedString().getText().length()) {
            z4 = true;
        }
        if (z4) {
            return;
        }
        throw new IllegalArgumentException(("offset(" + i5 + ") is out of bounds [0, " + getAnnotatedString().length() + ')').toString());
    }

    private final void requireIndexInRangeInclusiveEnd(int i5) {
        boolean z4 = false;
        if (i5 >= 0 && i5 <= getAnnotatedString().getText().length()) {
            z4 = true;
        }
        if (z4) {
            return;
        }
        throw new IllegalArgumentException(("offset(" + i5 + ") is out of bounds [0, " + getAnnotatedString().length() + ']').toString());
    }

    private final void requireLineIndexInRange(int i5) {
        boolean z4 = false;
        if (i5 >= 0 && i5 < this.lineCount) {
            z4 = true;
        }
        if (z4) {
            return;
        }
        throw new IllegalArgumentException(("lineIndex(" + i5 + ") is out of bounds [0, " + this.lineCount + ')').toString());
    }

    @l
    /* renamed from: fillBoundingBoxes-8ffj60Q, reason: not valid java name */
    public final float[] m5421fillBoundingBoxes8ffj60Q(long j5, @l float[] fArr, @IntRange(from = 0) int i5) {
        requireIndexInRange(TextRange.m5543getMinimpl(j5));
        requireIndexInRangeInclusiveEnd(TextRange.m5542getMaximpl(j5));
        k1.f fVar = new k1.f();
        fVar.element = i5;
        MultiParagraphKt.m5427findParagraphsByRangeSbBc2M(this.paragraphInfoList, j5, new MultiParagraph$fillBoundingBoxes$1(j5, fArr, fVar, new k1.e()));
        return fArr;
    }

    @l
    public final ResolvedTextDirection getBidiRunDirection(int i5) {
        int findParagraphByIndex;
        requireIndexInRangeInclusiveEnd(i5);
        if (i5 == getAnnotatedString().length()) {
            findParagraphByIndex = kotlin.collections.w.G(this.paragraphInfoList);
        } else {
            findParagraphByIndex = MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i5);
        }
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(findParagraphByIndex);
        return paragraphInfo.getParagraph().getBidiRunDirection(paragraphInfo.toLocalIndex(i5));
    }

    @l
    public final Rect getBoundingBox(int i5) {
        requireIndexInRange(i5);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i5));
        return paragraphInfo.toGlobal(paragraphInfo.getParagraph().getBoundingBox(paragraphInfo.toLocalIndex(i5)));
    }

    @l
    public final Rect getCursorRect(int i5) {
        int findParagraphByIndex;
        requireIndexInRangeInclusiveEnd(i5);
        if (i5 == getAnnotatedString().length()) {
            findParagraphByIndex = kotlin.collections.w.G(this.paragraphInfoList);
        } else {
            findParagraphByIndex = MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i5);
        }
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(findParagraphByIndex);
        return paragraphInfo.toGlobal(paragraphInfo.getParagraph().getCursorRect(paragraphInfo.toLocalIndex(i5)));
    }

    public final boolean getDidExceedMaxLines() {
        return this.didExceedMaxLines;
    }

    public final float getFirstBaseline() {
        if (this.paragraphInfoList.isEmpty()) {
            return 0.0f;
        }
        return this.paragraphInfoList.get(0).getParagraph().getFirstBaseline();
    }

    public final float getHeight() {
        return this.height;
    }

    public final float getHorizontalPosition(int i5, boolean z4) {
        int findParagraphByIndex;
        requireIndexInRangeInclusiveEnd(i5);
        if (i5 == getAnnotatedString().length()) {
            findParagraphByIndex = kotlin.collections.w.G(this.paragraphInfoList);
        } else {
            findParagraphByIndex = MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i5);
        }
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(findParagraphByIndex);
        return paragraphInfo.getParagraph().getHorizontalPosition(paragraphInfo.toLocalIndex(i5), z4);
    }

    @l
    public final MultiParagraphIntrinsics getIntrinsics() {
        return this.intrinsics;
    }

    public final float getLastBaseline() {
        Object m32;
        if (this.paragraphInfoList.isEmpty()) {
            return 0.0f;
        }
        m32 = e0.m3(this.paragraphInfoList);
        ParagraphInfo paragraphInfo = (ParagraphInfo) m32;
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLastBaseline());
    }

    public final float getLineBottom(int i5) {
        requireLineIndexInRange(i5);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i5));
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLineBottom(paragraphInfo.toLocalLineIndex(i5)));
    }

    public final int getLineCount() {
        return this.lineCount;
    }

    public final int getLineEnd(int i5, boolean z4) {
        requireLineIndexInRange(i5);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i5));
        return paragraphInfo.toGlobalIndex(paragraphInfo.getParagraph().getLineEnd(paragraphInfo.toLocalLineIndex(i5), z4));
    }

    public final int getLineForOffset(int i5) {
        int findParagraphByIndex;
        if (i5 >= getAnnotatedString().length()) {
            findParagraphByIndex = kotlin.collections.w.G(this.paragraphInfoList);
        } else if (i5 < 0) {
            findParagraphByIndex = 0;
        } else {
            findParagraphByIndex = MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i5);
        }
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(findParagraphByIndex);
        return paragraphInfo.toGlobalLineIndex(paragraphInfo.getParagraph().getLineForOffset(paragraphInfo.toLocalIndex(i5)));
    }

    public final int getLineForVerticalPosition(float f5) {
        int findParagraphByY;
        if (f5 <= 0.0f) {
            findParagraphByY = 0;
        } else if (f5 >= this.height) {
            findParagraphByY = kotlin.collections.w.G(this.paragraphInfoList);
        } else {
            findParagraphByY = MultiParagraphKt.findParagraphByY(this.paragraphInfoList, f5);
        }
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(findParagraphByY);
        if (paragraphInfo.getLength() == 0) {
            return paragraphInfo.getStartLineIndex();
        }
        return paragraphInfo.toGlobalLineIndex(paragraphInfo.getParagraph().getLineForVerticalPosition(paragraphInfo.toLocalYPosition(f5)));
    }

    public final float getLineHeight(int i5) {
        requireLineIndexInRange(i5);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i5));
        return paragraphInfo.getParagraph().getLineHeight(paragraphInfo.toLocalLineIndex(i5));
    }

    public final float getLineLeft(int i5) {
        requireLineIndexInRange(i5);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i5));
        return paragraphInfo.getParagraph().getLineLeft(paragraphInfo.toLocalLineIndex(i5));
    }

    public final float getLineRight(int i5) {
        requireLineIndexInRange(i5);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i5));
        return paragraphInfo.getParagraph().getLineRight(paragraphInfo.toLocalLineIndex(i5));
    }

    public final int getLineStart(int i5) {
        requireLineIndexInRange(i5);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i5));
        return paragraphInfo.toGlobalIndex(paragraphInfo.getParagraph().getLineStart(paragraphInfo.toLocalLineIndex(i5)));
    }

    public final float getLineTop(int i5) {
        requireLineIndexInRange(i5);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i5));
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLineTop(paragraphInfo.toLocalLineIndex(i5)));
    }

    public final float getLineWidth(int i5) {
        requireLineIndexInRange(i5);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i5));
        return paragraphInfo.getParagraph().getLineWidth(paragraphInfo.toLocalLineIndex(i5));
    }

    public final float getMaxIntrinsicWidth() {
        return this.intrinsics.getMaxIntrinsicWidth();
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    public final float getMinIntrinsicWidth() {
        return this.intrinsics.getMinIntrinsicWidth();
    }

    /* renamed from: getOffsetForPosition-k-4lQ0M, reason: not valid java name */
    public final int m5422getOffsetForPositionk4lQ0M(long j5) {
        int findParagraphByY;
        if (Offset.m3494getYimpl(j5) <= 0.0f) {
            findParagraphByY = 0;
        } else if (Offset.m3494getYimpl(j5) >= this.height) {
            findParagraphByY = kotlin.collections.w.G(this.paragraphInfoList);
        } else {
            findParagraphByY = MultiParagraphKt.findParagraphByY(this.paragraphInfoList, Offset.m3494getYimpl(j5));
        }
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(findParagraphByY);
        if (paragraphInfo.getLength() == 0) {
            return paragraphInfo.getStartIndex();
        }
        return paragraphInfo.toGlobalIndex(paragraphInfo.getParagraph().mo5393getOffsetForPositionk4lQ0M(paragraphInfo.m5435toLocalMKHz9U(j5)));
    }

    @l
    public final ResolvedTextDirection getParagraphDirection(int i5) {
        int findParagraphByIndex;
        requireIndexInRangeInclusiveEnd(i5);
        if (i5 == getAnnotatedString().length()) {
            findParagraphByIndex = kotlin.collections.w.G(this.paragraphInfoList);
        } else {
            findParagraphByIndex = MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i5);
        }
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(findParagraphByIndex);
        return paragraphInfo.getParagraph().getParagraphDirection(paragraphInfo.toLocalIndex(i5));
    }

    @l
    public final List<ParagraphInfo> getParagraphInfoList$ui_text_release() {
        return this.paragraphInfoList;
    }

    @l
    public final Path getPathForRange(int i5, int i6) {
        boolean z4;
        boolean z5 = true;
        if (i5 >= 0 && i5 <= i6) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4 || i6 > getAnnotatedString().getText().length()) {
            z5 = false;
        }
        if (z5) {
            if (i5 == i6) {
                return AndroidPath_androidKt.Path();
            }
            Path Path = AndroidPath_androidKt.Path();
            MultiParagraphKt.m5427findParagraphsByRangeSbBc2M(this.paragraphInfoList, TextRangeKt.TextRange(i5, i6), new MultiParagraph$getPathForRange$2(Path, i5, i6));
            return Path;
        }
        throw new IllegalArgumentException(("Start(" + i5 + ") or End(" + i6 + ") is out of range [0.." + getAnnotatedString().getText().length() + "), or start > end!").toString());
    }

    @l
    public final List<Rect> getPlaceholderRects() {
        return this.placeholderRects;
    }

    public final float getWidth() {
        return this.width;
    }

    /* renamed from: getWordBoundary--jx7JFs, reason: not valid java name */
    public final long m5423getWordBoundaryjx7JFs(int i5) {
        int findParagraphByIndex;
        requireIndexInRangeInclusiveEnd(i5);
        if (i5 == getAnnotatedString().length()) {
            findParagraphByIndex = kotlin.collections.w.G(this.paragraphInfoList);
        } else {
            findParagraphByIndex = MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i5);
        }
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(findParagraphByIndex);
        return paragraphInfo.m5434toGlobalGEjPoXI(paragraphInfo.getParagraph().mo5394getWordBoundaryjx7JFs(paragraphInfo.toLocalIndex(i5)));
    }

    public final boolean isLineEllipsized(int i5) {
        requireLineIndexInRange(i5);
        return this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i5)).getParagraph().isLineEllipsized(i5);
    }

    /* renamed from: paint-LG529CI, reason: not valid java name */
    public final void m5424paintLG529CI(@l Canvas canvas, long j5, @m Shadow shadow, @m TextDecoration textDecoration, @m DrawStyle drawStyle, int i5) {
        canvas.save();
        List<ParagraphInfo> list = this.paragraphInfoList;
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            ParagraphInfo paragraphInfo = list.get(i6);
            paragraphInfo.getParagraph().mo5395paintLG529CI(canvas, j5, shadow, textDecoration, drawStyle, i5);
            canvas.translate(0.0f, paragraphInfo.getParagraph().getHeight());
        }
        canvas.restore();
    }

    @k(level = kotlin.m.HIDDEN, message = "Use the new paint function that takes canvas as the only required parameter.")
    /* renamed from: paint-RPmYEkk, reason: not valid java name */
    public final /* synthetic */ void m5425paintRPmYEkk(Canvas canvas, long j5, Shadow shadow, TextDecoration textDecoration) {
        canvas.save();
        List<ParagraphInfo> list = this.paragraphInfoList;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            ParagraphInfo paragraphInfo = list.get(i5);
            paragraphInfo.getParagraph().mo5396paintRPmYEkk(canvas, j5, shadow, textDecoration);
            canvas.translate(0.0f, paragraphInfo.getParagraph().getHeight());
        }
        canvas.restore();
    }

    /* renamed from: paint-hn5TExg, reason: not valid java name */
    public final void m5426painthn5TExg(@l Canvas canvas, @l Brush brush, float f5, @m Shadow shadow, @m TextDecoration textDecoration, @m DrawStyle drawStyle, int i5) {
        AndroidMultiParagraphDraw_androidKt.m5788drawMultiParagraph7AXcY_I(this, canvas, brush, f5, shadow, textDecoration, drawStyle, i5);
    }

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j5, int i5, boolean z4, int i6, w wVar) {
        this(multiParagraphIntrinsics, j5, (i6 & 4) != 0 ? Integer.MAX_VALUE : i5, (i6 & 8) != 0 ? false : z4, null);
    }

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, int i5, boolean z4, float f5, int i6, w wVar) {
        this(multiParagraphIntrinsics, (i6 & 2) != 0 ? Integer.MAX_VALUE : i5, (i6 & 4) != 0 ? false : z4, f5);
    }

    @k(message = "MultiParagraph that takes maximum allowed width is deprecated, pass constraints instead.", replaceWith = @b1(expression = "MultiParagraph(intrinsics, Constraints(maxWidth = ceil(width).toInt()), maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
    public MultiParagraph(@l MultiParagraphIntrinsics multiParagraphIntrinsics, int i5, boolean z4, float f5) {
        this(multiParagraphIntrinsics, ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(f5), 0, 0, 13, null), i5, z4, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ MultiParagraph(androidx.compose.ui.text.AnnotatedString r11, androidx.compose.ui.text.TextStyle r12, java.util.List r13, int r14, boolean r15, float r16, androidx.compose.ui.unit.Density r17, androidx.compose.ui.text.font.Font.ResourceLoader r18, int r19, kotlin.jvm.internal.w r20) {
        /*
            r10 = this;
            r0 = r19 & 4
            if (r0 == 0) goto La
            java.util.List r0 = kotlin.collections.u.E()
            r4 = r0
            goto Lb
        La:
            r4 = r13
        Lb:
            r0 = r19 & 8
            if (r0 == 0) goto L14
            r0 = 2147483647(0x7fffffff, float:NaN)
            r5 = r0
            goto L15
        L14:
            r5 = r14
        L15:
            r0 = r19 & 16
            if (r0 == 0) goto L1c
            r0 = 0
            r6 = r0
            goto L1d
        L1c:
            r6 = r15
        L1d:
            r1 = r10
            r2 = r11
            r3 = r12
            r7 = r16
            r8 = r17
            r9 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.MultiParagraph.<init>(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.text.TextStyle, java.util.List, int, boolean, float, androidx.compose.ui.unit.Density, androidx.compose.ui.text.font.Font$ResourceLoader, int, kotlin.jvm.internal.w):void");
    }

    @k(message = "Font.ResourceLoader is deprecated, use fontFamilyResolver instead", replaceWith = @b1(expression = "MultiParagraph(annotatedString, style, placeholders, maxLines, ellipsis, width, density, fontFamilyResolver)", imports = {}))
    public MultiParagraph(@l AnnotatedString annotatedString, @l TextStyle textStyle, @l List<AnnotatedString.Range<Placeholder>> list, int i5, boolean z4, float f5, @l Density density, @l Font.ResourceLoader resourceLoader) {
        this(new MultiParagraphIntrinsics(annotatedString, textStyle, list, density, DelegatingFontLoaderForDeprecatedUsage_androidKt.createFontFamilyResolver(resourceLoader)), ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(f5), 0, 0, 13, null), i5, z4, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ MultiParagraph(androidx.compose.ui.text.AnnotatedString r12, androidx.compose.ui.text.TextStyle r13, float r14, androidx.compose.ui.unit.Density r15, androidx.compose.ui.text.font.FontFamily.Resolver r16, java.util.List r17, int r18, boolean r19, int r20, kotlin.jvm.internal.w r21) {
        /*
            r11 = this;
            r0 = r20
            r1 = r0 & 32
            if (r1 == 0) goto Lc
            java.util.List r1 = kotlin.collections.u.E()
            r8 = r1
            goto Le
        Lc:
            r8 = r17
        Le:
            r1 = r0 & 64
            if (r1 == 0) goto L17
            r1 = 2147483647(0x7fffffff, float:NaN)
            r9 = r1
            goto L19
        L17:
            r9 = r18
        L19:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L20
            r0 = 0
            r10 = r0
            goto L22
        L20:
            r10 = r19
        L22:
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.MultiParagraph.<init>(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.text.TextStyle, float, androidx.compose.ui.unit.Density, androidx.compose.ui.text.font.FontFamily$Resolver, java.util.List, int, boolean, int, kotlin.jvm.internal.w):void");
    }

    @k(message = "MultiParagraph that takes maximum allowed width is deprecated, pass constraints instead.", replaceWith = @b1(expression = "MultiParagraph(annotatedString, style, Constraints(maxWidth = ceil(width).toInt()), density, fontFamilyResolver, placeholders, maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
    public MultiParagraph(@l AnnotatedString annotatedString, @l TextStyle textStyle, float f5, @l Density density, @l FontFamily.Resolver resolver, @l List<AnnotatedString.Range<Placeholder>> list, int i5, boolean z4) {
        this(new MultiParagraphIntrinsics(annotatedString, textStyle, list, density, resolver), ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(f5), 0, 0, 13, null), i5, z4, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ MultiParagraph(androidx.compose.ui.text.AnnotatedString r14, androidx.compose.ui.text.TextStyle r15, long r16, androidx.compose.ui.unit.Density r18, androidx.compose.ui.text.font.FontFamily.Resolver r19, java.util.List r20, int r21, boolean r22, int r23, kotlin.jvm.internal.w r24) {
        /*
            r13 = this;
            r0 = r23
            r1 = r0 & 32
            if (r1 == 0) goto Lc
            java.util.List r1 = kotlin.collections.u.E()
            r9 = r1
            goto Le
        Lc:
            r9 = r20
        Le:
            r1 = r0 & 64
            if (r1 == 0) goto L17
            r1 = 2147483647(0x7fffffff, float:NaN)
            r10 = r1
            goto L19
        L17:
            r10 = r21
        L19:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L20
            r0 = 0
            r11 = r0
            goto L22
        L20:
            r11 = r22
        L22:
            r12 = 0
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r7 = r18
            r8 = r19
            r2.<init>(r3, r4, r5, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.MultiParagraph.<init>(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.text.TextStyle, long, androidx.compose.ui.unit.Density, androidx.compose.ui.text.font.FontFamily$Resolver, java.util.List, int, boolean, int, kotlin.jvm.internal.w):void");
    }

    private MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j5, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<Placeholder>> list, int i5, boolean z4) {
        this(new MultiParagraphIntrinsics(annotatedString, textStyle, list, density, resolver), j5, i5, z4, null);
    }
}
