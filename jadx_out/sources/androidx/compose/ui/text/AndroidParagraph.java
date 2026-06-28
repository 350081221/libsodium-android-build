package androidx.compose.ui.text;

import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.annotation.IntRange;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.android.selection.WordBoundary;
import androidx.compose.ui.text.android.style.PlaceholderSpan;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.platform.AndroidParagraphHelper_androidKt;
import androidx.compose.ui.text.platform.AndroidParagraphIntrinsics;
import androidx.compose.ui.text.platform.AndroidTextPaint;
import androidx.compose.ui.text.platform.style.ShaderBrushSpan;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.collections.w;
import kotlin.d0;
import kotlin.f0;
import kotlin.h0;
import kotlin.i0;
import kotlin.j0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.ranges.u;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010^\u001a\u00020]\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010e\u001a\u00020@\u0012\u0006\u0010j\u001a\u00020i¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001By\b\u0016\u0012\b\u0010\u009f\u0001\u001a\u00030\u009e\u0001\u0012\b\u0010¡\u0001\u001a\u00030 \u0001\u0012\u0015\u0010¤\u0001\u001a\u0010\u0012\f\u0012\n\u0012\u0005\u0012\u00030£\u00010¢\u00010w\u0012\u0015\u0010¦\u0001\u001a\u0010\u0012\f\u0012\n\u0012\u0005\u0012\u00030¥\u00010¢\u00010w\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010e\u001a\u00020@\u0012\u0006\u0010j\u001a\u00020i\u0012\b\u0010¨\u0001\u001a\u00030§\u0001\u0012\b\u0010ª\u0001\u001a\u00030©\u0001¢\u0006\u0006\b\u009c\u0001\u0010«\u0001J\u0019\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002JJ\u0010\u0015\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0002J\u0010\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u001a\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u000bH\u0016J,\u0010(\u001a\u00020\t2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\b\b\u0001\u0010%\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u0018\u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\u000bH\u0016J\u0010\u0010-\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u000bH\u0016J\u001d\u00100\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u000bH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b.\u0010/J\u0010\u00102\u001a\u00020\u00162\u0006\u00101\u001a\u00020\u000bH\u0016J\u0010\u00103\u001a\u00020\u00162\u0006\u00101\u001a\u00020\u000bH\u0016J\u0010\u00104\u001a\u00020\u00162\u0006\u00101\u001a\u00020\u000bH\u0016J\u0017\u00107\u001a\u00020\u00162\u0006\u00101\u001a\u00020\u000bH\u0000¢\u0006\u0004\b5\u00106J\u0017\u00109\u001a\u00020\u00162\u0006\u00101\u001a\u00020\u000bH\u0000¢\u0006\u0004\b8\u00106J\u0017\u0010;\u001a\u00020\u00162\u0006\u00101\u001a\u00020\u000bH\u0000¢\u0006\u0004\b:\u00106J\u0010\u0010<\u001a\u00020\u00162\u0006\u00101\u001a\u00020\u000bH\u0016J\u0010\u0010=\u001a\u00020\u00162\u0006\u00101\u001a\u00020\u000bH\u0016J\u0010\u0010>\u001a\u00020\u00162\u0006\u00101\u001a\u00020\u000bH\u0016J\u0010\u0010?\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u000bH\u0016J\u0018\u0010B\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u000b2\u0006\u0010A\u001a\u00020@H\u0016J\u0010\u0010C\u001a\u00020@2\u0006\u00101\u001a\u00020\u000bH\u0016J\u0010\u0010D\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000bH\u0016J\u0018\u0010F\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010E\u001a\u00020@H\u0016J\u0010\u0010H\u001a\u00020G2\u0006\u0010\u001e\u001a\u00020\u000bH\u0016J\u0010\u0010I\u001a\u00020G2\u0006\u0010\u001e\u001a\u00020\u000bH\u0016J6\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010K\u001a\u00020J2\b\u0010M\u001a\u0004\u0018\u00010L2\b\u0010O\u001a\u0004\u0018\u00010NH\u0016ø\u0001\u0000¢\u0006\u0004\bP\u0010QJH\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010K\u001a\u00020J2\b\u0010M\u001a\u0004\u0018\u00010L2\b\u0010O\u001a\u0004\u0018\u00010N2\b\u0010S\u001a\u0004\u0018\u00010R2\u0006\u0010U\u001a\u00020TH\u0016ø\u0001\u0000¢\u0006\u0004\bV\u0010WJP\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010Y\u001a\u00020X2\u0006\u0010Z\u001a\u00020\u00162\b\u0010M\u001a\u0004\u0018\u00010L2\b\u0010O\u001a\u0004\u0018\u00010N2\b\u0010S\u001a\u0004\u0018\u00010R2\u0006\u0010U\u001a\u00020TH\u0016ø\u0001\u0000¢\u0006\u0004\b[\u0010\\R\u0017\u0010^\u001a\u00020]8\u0006¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010b\u001a\u0004\bc\u0010dR\u0017\u0010e\u001a\u00020@8\u0006¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR\u001d\u0010j\u001a\u00020i8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010mR\u0014\u0010n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR \u0010q\u001a\u00020p8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bq\u0010r\u0012\u0004\bu\u0010v\u001a\u0004\bs\u0010tR\"\u0010x\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0w8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{R\u001c\u0010\u0080\u0001\u001a\u00020|8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b}\u0010~\u001a\u0004\b0\u0010\u007fR\u0017\u0010\u0083\u0001\u001a\u00020\u00168VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0017\u0010\u0085\u0001\u001a\u00020\u00168VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0084\u0001\u0010\u0082\u0001R\u0017\u0010\u0087\u0001\u001a\u00020\u00168VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0086\u0001\u0010\u0082\u0001R\u0017\u0010\u0089\u0001\u001a\u00020\u00168VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0088\u0001\u0010\u0082\u0001R\u0017\u0010\u008b\u0001\u001a\u00020\u00168VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008a\u0001\u0010\u0082\u0001R\u0017\u0010\u008d\u0001\u001a\u00020\u00168VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008c\u0001\u0010\u0082\u0001R\u0016\u0010\u008f\u0001\u001a\u00020@8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u008e\u0001\u0010hR\u001f\u0010\u0094\u0001\u001a\u00030\u0090\u00018@X\u0081\u0004¢\u0006\u000f\u0012\u0005\b\u0093\u0001\u0010v\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0016\u0010\u0096\u0001\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0095\u0001\u0010dR\u001f\u0010\u009b\u0001\u001a\u00030\u0097\u00018@X\u0081\u0004¢\u0006\u000f\u0012\u0005\b\u009a\u0001\u0010v\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006¬\u0001"}, d2 = {"Landroidx/compose/ui/text/AndroidParagraph;", "Landroidx/compose/ui/text/Paragraph;", "Landroidx/compose/ui/text/android/TextLayout;", "", "Landroidx/compose/ui/text/platform/style/ShaderBrushSpan;", "getShaderBrushSpans", "(Landroidx/compose/ui/text/android/TextLayout;)[Landroidx/compose/ui/text/platform/style/ShaderBrushSpan;", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "Lkotlin/r2;", "paint", "", "alignment", "justificationMode", "Landroid/text/TextUtils$TruncateAt;", "ellipsize", "maxLines", "hyphens", "breakStrategy", "lineBreakStyle", "lineBreakWordStyle", "constructTextLayout", "", "vertical", "getLineForVerticalPosition", "Landroidx/compose/ui/geometry/Offset;", "position", "getOffsetForPosition-k-4lQ0M", "(J)I", "getOffsetForPosition", TypedValues.CycleType.S_WAVE_OFFSET, "Landroidx/compose/ui/geometry/Rect;", "getBoundingBox", "Landroidx/compose/ui/text/TextRange;", "range", "", "array", "arrayStart", "fillBoundingBoxes-8ffj60Q", "(J[FI)V", "fillBoundingBoxes", "start", "end", "Landroidx/compose/ui/graphics/Path;", "getPathForRange", "getCursorRect", "getWordBoundary--jx7JFs", "(I)J", "getWordBoundary", "lineIndex", "getLineLeft", "getLineRight", "getLineTop", "getLineAscent$ui_text_release", "(I)F", "getLineAscent", "getLineBaseline$ui_text_release", "getLineBaseline", "getLineDescent$ui_text_release", "getLineDescent", "getLineBottom", "getLineHeight", "getLineWidth", "getLineStart", "", "visibleEnd", "getLineEnd", "isLineEllipsized", "getLineForOffset", "usePrimaryDirection", "getHorizontalPosition", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "getParagraphDirection", "getBidiRunDirection", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/graphics/Shadow;", "shadow", "Landroidx/compose/ui/text/style/TextDecoration;", "textDecoration", "paint-RPmYEkk", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;)V", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "drawStyle", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "paint-LG529CI", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "Landroidx/compose/ui/graphics/Brush;", "brush", "alpha", "paint-hn5TExg", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;", "paragraphIntrinsics", "Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;", "getParagraphIntrinsics", "()Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;", "I", "getMaxLines", "()I", "ellipsis", "Z", "getEllipsis", "()Z", "Landroidx/compose/ui/unit/Constraints;", "constraints", "J", "getConstraints-msEJaDk", "()J", "layout", "Landroidx/compose/ui/text/android/TextLayout;", "", "charSequence", "Ljava/lang/CharSequence;", "getCharSequence$ui_text_release", "()Ljava/lang/CharSequence;", "getCharSequence$ui_text_release$annotations", "()V", "", "placeholderRects", "Ljava/util/List;", "getPlaceholderRects", "()Ljava/util/List;", "Landroidx/compose/ui/text/android/selection/WordBoundary;", "wordBoundary$delegate", "Lkotlin/d0;", "()Landroidx/compose/ui/text/android/selection/WordBoundary;", "wordBoundary", "getWidth", "()F", "width", "getHeight", "height", "getMaxIntrinsicWidth", "maxIntrinsicWidth", "getMinIntrinsicWidth", "minIntrinsicWidth", "getFirstBaseline", "firstBaseline", "getLastBaseline", "lastBaseline", "getDidExceedMaxLines", "didExceedMaxLines", "Ljava/util/Locale;", "getTextLocale$ui_text_release", "()Ljava/util/Locale;", "getTextLocale$ui_text_release$annotations", "textLocale", "getLineCount", "lineCount", "Landroidx/compose/ui/text/platform/AndroidTextPaint;", "getTextPaint$ui_text_release", "()Landroidx/compose/ui/text/platform/AndroidTextPaint;", "getTextPaint$ui_text_release$annotations", "textPaint", "<init>", "(Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;IZJLkotlin/jvm/internal/w;)V", "", "text", "Landroidx/compose/ui/text/TextStyle;", "style", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "spanStyles", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/unit/Density;", "density", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;Ljava/util/List;IZJLandroidx/compose/ui/text/font/FontFamily$Resolver;Landroidx/compose/ui/unit/Density;Lkotlin/jvm/internal/w;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nAndroidParagraph.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidParagraph.android.kt\nandroidx/compose/ui/text/AndroidParagraph\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,623:1\n1#2:624\n13579#3,2:625\n11335#3:627\n11670#3,3:628\n26#4:631\n26#4:632\n*S KotlinDebug\n*F\n+ 1 AndroidParagraph.android.kt\nandroidx/compose/ui/text/AndroidParagraph\n*L\n205#1:625,2\n245#1:627\n245#1:628,3\n441#1:631\n445#1:632\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidParagraph implements Paragraph {
    public static final int $stable = 8;

    @l
    private final CharSequence charSequence;
    private final long constraints;
    private final boolean ellipsis;

    @l
    private final TextLayout layout;
    private final int maxLines;

    @l
    private final AndroidParagraphIntrinsics paragraphIntrinsics;

    @l
    private final List<Rect> placeholderRects;

    @l
    private final d0 wordBoundary$delegate;

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ResolvedTextDirection.values().length];
            try {
                iArr[ResolvedTextDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ResolvedTextDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:57:0x01b8. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    private AndroidParagraph(AndroidParagraphIntrinsics androidParagraphIntrinsics, int i5, boolean z4, long j5) {
        boolean shouldAttachIndentationFixSpan;
        CharSequence charSequence$ui_text_release;
        int m5403toLayoutAlignaXe7zB0;
        int m5405toLayoutHyphenationFrequency3fSNIE;
        int m5404toLayoutBreakStrategyxImikfE;
        int m5406toLayoutLineBreakStylehpcqdu8;
        int m5407toLayoutLineBreakWordStylewPN0Rpw;
        List<Rect> list;
        Rect rect;
        float horizontalPosition;
        float lineBaseline;
        int heightPx;
        float lineTop;
        float f5;
        float lineBaseline2;
        d0 b5;
        int numberOfLinesThatFitMaxHeight;
        int u4;
        this.paragraphIntrinsics = androidParagraphIntrinsics;
        this.maxLines = i5;
        this.ellipsis = z4;
        this.constraints = j5;
        if ((Constraints.m6001getMinHeightimpl(j5) == 0 && Constraints.m6002getMinWidthimpl(j5) == 0) != true) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.".toString());
        }
        if ((i5 >= 1) != false) {
            TextStyle style = androidParagraphIntrinsics.getStyle();
            shouldAttachIndentationFixSpan = AndroidParagraph_androidKt.shouldAttachIndentationFixSpan(style, z4);
            if (shouldAttachIndentationFixSpan) {
                charSequence$ui_text_release = AndroidParagraph_androidKt.attachIndentationFixSpan(androidParagraphIntrinsics.getCharSequence$ui_text_release());
            } else {
                charSequence$ui_text_release = androidParagraphIntrinsics.getCharSequence$ui_text_release();
            }
            this.charSequence = charSequence$ui_text_release;
            m5403toLayoutAlignaXe7zB0 = AndroidParagraph_androidKt.m5403toLayoutAlignaXe7zB0(style.m5586getTextAligne0LSkKk());
            boolean m5932equalsimpl0 = TextAlign.m5932equalsimpl0(style.m5586getTextAligne0LSkKk(), TextAlign.Companion.m5938getJustifye0LSkKk());
            m5405toLayoutHyphenationFrequency3fSNIE = AndroidParagraph_androidKt.m5405toLayoutHyphenationFrequency3fSNIE(style.getParagraphStyle$ui_text_release().m5455getHyphensvmbZdU8());
            m5404toLayoutBreakStrategyxImikfE = AndroidParagraph_androidKt.m5404toLayoutBreakStrategyxImikfE(LineBreak.m5856getStrategyfcGXIks(style.m5583getLineBreakrAG3T2k()));
            m5406toLayoutLineBreakStylehpcqdu8 = AndroidParagraph_androidKt.m5406toLayoutLineBreakStylehpcqdu8(LineBreak.m5857getStrictnessusljTpc(style.m5583getLineBreakrAG3T2k()));
            m5407toLayoutLineBreakWordStylewPN0Rpw = AndroidParagraph_androidKt.m5407toLayoutLineBreakWordStylewPN0Rpw(LineBreak.m5858getWordBreakjp8hJ3c(style.m5583getLineBreakrAG3T2k()));
            TextUtils.TruncateAt truncateAt = z4 ? TextUtils.TruncateAt.END : null;
            TextLayout constructTextLayout = constructTextLayout(m5403toLayoutAlignaXe7zB0, m5932equalsimpl0 ? 1 : 0, truncateAt, i5, m5405toLayoutHyphenationFrequency3fSNIE, m5404toLayoutBreakStrategyxImikfE, m5406toLayoutLineBreakStylehpcqdu8, m5407toLayoutLineBreakWordStylewPN0Rpw);
            if (z4 && constructTextLayout.getHeight() > Constraints.m5999getMaxHeightimpl(j5) && i5 > 1) {
                numberOfLinesThatFitMaxHeight = AndroidParagraph_androidKt.numberOfLinesThatFitMaxHeight(constructTextLayout, Constraints.m5999getMaxHeightimpl(j5));
                if (numberOfLinesThatFitMaxHeight >= 0 && numberOfLinesThatFitMaxHeight != i5) {
                    u4 = u.u(numberOfLinesThatFitMaxHeight, 1);
                    constructTextLayout = constructTextLayout(m5403toLayoutAlignaXe7zB0, m5932equalsimpl0 ? 1 : 0, truncateAt, u4, m5405toLayoutHyphenationFrequency3fSNIE, m5404toLayoutBreakStrategyxImikfE, m5406toLayoutLineBreakStylehpcqdu8, m5407toLayoutLineBreakWordStylewPN0Rpw);
                }
                this.layout = constructTextLayout;
            } else {
                this.layout = constructTextLayout;
            }
            getTextPaint$ui_text_release().m5800setBrush12SF9DM(style.getBrush(), SizeKt.Size(getWidth(), getHeight()), style.getAlpha());
            for (ShaderBrushSpan shaderBrushSpan : getShaderBrushSpans(this.layout)) {
                shaderBrushSpan.m5819setSizeuvyYCjk(SizeKt.Size(getWidth(), getHeight()));
            }
            CharSequence charSequence = this.charSequence;
            if (charSequence instanceof Spanned) {
                Object[] spans = ((Spanned) charSequence).getSpans(0, charSequence.length(), PlaceholderSpan.class);
                ArrayList arrayList = new ArrayList(spans.length);
                for (Object obj : spans) {
                    PlaceholderSpan placeholderSpan = (PlaceholderSpan) obj;
                    Spanned spanned = (Spanned) charSequence;
                    int spanStart = spanned.getSpanStart(placeholderSpan);
                    int spanEnd = spanned.getSpanEnd(placeholderSpan);
                    int lineForOffset = this.layout.getLineForOffset(spanStart);
                    ?? r10 = lineForOffset >= this.maxLines;
                    ?? r11 = this.layout.getLineEllipsisCount(lineForOffset) > 0 && spanEnd > this.layout.getLineEllipsisOffset(lineForOffset);
                    ?? r6 = spanEnd > this.layout.getLineEnd(lineForOffset);
                    if (r11 == true || r6 == true || r10 == true) {
                        rect = null;
                    } else {
                        int i6 = WhenMappings.$EnumSwitchMapping$0[getBidiRunDirection(spanStart).ordinal()];
                        if (i6 != 1) {
                            if (i6 != 2) {
                                throw new j0();
                            }
                            horizontalPosition = getHorizontalPosition(spanStart, true) - placeholderSpan.getWidthPx();
                        } else {
                            horizontalPosition = getHorizontalPosition(spanStart, true);
                        }
                        float widthPx = placeholderSpan.getWidthPx() + horizontalPosition;
                        TextLayout textLayout = this.layout;
                        switch (placeholderSpan.getVerticalAlign()) {
                            case 0:
                                lineBaseline = textLayout.getLineBaseline(lineForOffset);
                                heightPx = placeholderSpan.getHeightPx();
                                lineTop = lineBaseline - heightPx;
                                rect = new Rect(horizontalPosition, lineTop, widthPx, placeholderSpan.getHeightPx() + lineTop);
                                break;
                            case 1:
                                lineTop = textLayout.getLineTop(lineForOffset);
                                rect = new Rect(horizontalPosition, lineTop, widthPx, placeholderSpan.getHeightPx() + lineTop);
                                break;
                            case 2:
                                lineBaseline = textLayout.getLineBottom(lineForOffset);
                                heightPx = placeholderSpan.getHeightPx();
                                lineTop = lineBaseline - heightPx;
                                rect = new Rect(horizontalPosition, lineTop, widthPx, placeholderSpan.getHeightPx() + lineTop);
                                break;
                            case 3:
                                lineTop = ((textLayout.getLineTop(lineForOffset) + textLayout.getLineBottom(lineForOffset)) - placeholderSpan.getHeightPx()) / 2;
                                rect = new Rect(horizontalPosition, lineTop, widthPx, placeholderSpan.getHeightPx() + lineTop);
                                break;
                            case 4:
                                f5 = placeholderSpan.getFontMetrics().ascent;
                                lineBaseline2 = textLayout.getLineBaseline(lineForOffset);
                                lineTop = f5 + lineBaseline2;
                                rect = new Rect(horizontalPosition, lineTop, widthPx, placeholderSpan.getHeightPx() + lineTop);
                                break;
                            case 5:
                                lineTop = (placeholderSpan.getFontMetrics().descent + textLayout.getLineBaseline(lineForOffset)) - placeholderSpan.getHeightPx();
                                rect = new Rect(horizontalPosition, lineTop, widthPx, placeholderSpan.getHeightPx() + lineTop);
                                break;
                            case 6:
                                Paint.FontMetricsInt fontMetrics = placeholderSpan.getFontMetrics();
                                f5 = ((fontMetrics.ascent + fontMetrics.descent) - placeholderSpan.getHeightPx()) / 2;
                                lineBaseline2 = textLayout.getLineBaseline(lineForOffset);
                                lineTop = f5 + lineBaseline2;
                                rect = new Rect(horizontalPosition, lineTop, widthPx, placeholderSpan.getHeightPx() + lineTop);
                                break;
                            default:
                                throw new IllegalStateException("unexpected verticalAlignment");
                        }
                    }
                    arrayList.add(rect);
                }
                list = arrayList;
            } else {
                list = w.E();
            }
            this.placeholderRects = list;
            b5 = f0.b(h0.NONE, new AndroidParagraph$wordBoundary$2(this));
            this.wordBoundary$delegate = b5;
            return;
        }
        throw new IllegalArgumentException("maxLines should be greater than 0".toString());
    }

    public /* synthetic */ AndroidParagraph(AndroidParagraphIntrinsics androidParagraphIntrinsics, int i5, boolean z4, long j5, kotlin.jvm.internal.w wVar) {
        this(androidParagraphIntrinsics, i5, z4, j5);
    }

    public /* synthetic */ AndroidParagraph(String str, TextStyle textStyle, List list, List list2, int i5, boolean z4, long j5, FontFamily.Resolver resolver, Density density, kotlin.jvm.internal.w wVar) {
        this(str, textStyle, list, list2, i5, z4, j5, resolver, density);
    }

    private final TextLayout constructTextLayout(int i5, int i6, TextUtils.TruncateAt truncateAt, int i7, int i8, int i9, int i10, int i11) {
        return new TextLayout(this.charSequence, getWidth(), getTextPaint$ui_text_release(), i5, truncateAt, this.paragraphIntrinsics.getTextDirectionHeuristic$ui_text_release(), 1.0f, 0.0f, AndroidParagraphHelper_androidKt.isIncludeFontPaddingEnabled(this.paragraphIntrinsics.getStyle()), true, i7, i9, i10, i11, i8, i6, null, null, this.paragraphIntrinsics.getLayoutIntrinsics$ui_text_release(), 196736, null);
    }

    @VisibleForTesting
    public static /* synthetic */ void getCharSequence$ui_text_release$annotations() {
    }

    private final ShaderBrushSpan[] getShaderBrushSpans(TextLayout textLayout) {
        boolean z4;
        if (!(textLayout.getText() instanceof Spanned)) {
            return new ShaderBrushSpan[0];
        }
        CharSequence text = textLayout.getText();
        l0.n(text, "null cannot be cast to non-null type android.text.Spanned");
        ShaderBrushSpan[] shaderBrushSpanArr = (ShaderBrushSpan[]) ((Spanned) text).getSpans(0, textLayout.getText().length(), ShaderBrushSpan.class);
        if (shaderBrushSpanArr.length == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return new ShaderBrushSpan[0];
        }
        return shaderBrushSpanArr;
    }

    @VisibleForTesting
    public static /* synthetic */ void getTextLocale$ui_text_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getTextPaint$ui_text_release$annotations() {
    }

    private final WordBoundary getWordBoundary() {
        return (WordBoundary) this.wordBoundary$delegate.getValue();
    }

    private final void paint(Canvas canvas) {
        android.graphics.Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        if (getDidExceedMaxLines()) {
            nativeCanvas.save();
            nativeCanvas.clipRect(0.0f, 0.0f, getWidth(), getHeight());
        }
        this.layout.paint(nativeCanvas);
        if (getDidExceedMaxLines()) {
            nativeCanvas.restore();
        }
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* renamed from: fillBoundingBoxes-8ffj60Q, reason: not valid java name */
    public void mo5391fillBoundingBoxes8ffj60Q(long j5, @l float[] fArr, @IntRange(from = 0) int i5) {
        this.layout.fillBoundingBoxes(TextRange.m5543getMinimpl(j5), TextRange.m5542getMaximpl(j5), fArr, i5);
    }

    @Override // androidx.compose.ui.text.Paragraph
    @l
    public ResolvedTextDirection getBidiRunDirection(int i5) {
        if (this.layout.isRtlCharAt(i5)) {
            return ResolvedTextDirection.Rtl;
        }
        return ResolvedTextDirection.Ltr;
    }

    @Override // androidx.compose.ui.text.Paragraph
    @l
    public Rect getBoundingBox(int i5) {
        boolean z4 = false;
        if (i5 >= 0 && i5 < this.charSequence.length()) {
            z4 = true;
        }
        if (z4) {
            RectF boundingBox = this.layout.getBoundingBox(i5);
            return new Rect(boundingBox.left, boundingBox.top, boundingBox.right, boundingBox.bottom);
        }
        throw new IllegalArgumentException(("offset(" + i5 + ") is out of bounds [0," + this.charSequence.length() + ')').toString());
    }

    @l
    public final CharSequence getCharSequence$ui_text_release() {
        return this.charSequence;
    }

    /* renamed from: getConstraints-msEJaDk, reason: not valid java name */
    public final long m5392getConstraintsmsEJaDk() {
        return this.constraints;
    }

    @Override // androidx.compose.ui.text.Paragraph
    @l
    public Rect getCursorRect(int i5) {
        boolean z4;
        if (i5 >= 0 && i5 <= this.charSequence.length()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            float primaryHorizontal$default = TextLayout.getPrimaryHorizontal$default(this.layout, i5, false, 2, null);
            int lineForOffset = this.layout.getLineForOffset(i5);
            return new Rect(primaryHorizontal$default, this.layout.getLineTop(lineForOffset), primaryHorizontal$default, this.layout.getLineBottom(lineForOffset));
        }
        throw new IllegalArgumentException(("offset(" + i5 + ") is out of bounds [0," + this.charSequence.length() + ']').toString());
    }

    @Override // androidx.compose.ui.text.Paragraph
    public boolean getDidExceedMaxLines() {
        return this.layout.getDidExceedMaxLines();
    }

    public final boolean getEllipsis() {
        return this.ellipsis;
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getFirstBaseline() {
        return getLineBaseline$ui_text_release(0);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getHeight() {
        return this.layout.getHeight();
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getHorizontalPosition(int i5, boolean z4) {
        if (z4) {
            return TextLayout.getPrimaryHorizontal$default(this.layout, i5, false, 2, null);
        }
        return TextLayout.getSecondaryHorizontal$default(this.layout, i5, false, 2, null);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLastBaseline() {
        return getLineBaseline$ui_text_release(getLineCount() - 1);
    }

    public final float getLineAscent$ui_text_release(int i5) {
        return this.layout.getLineAscent(i5);
    }

    public final float getLineBaseline$ui_text_release(int i5) {
        return this.layout.getLineBaseline(i5);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineBottom(int i5) {
        return this.layout.getLineBottom(i5);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineCount() {
        return this.layout.getLineCount();
    }

    public final float getLineDescent$ui_text_release(int i5) {
        return this.layout.getLineDescent(i5);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineEnd(int i5, boolean z4) {
        if (z4) {
            return this.layout.getLineVisibleEnd(i5);
        }
        return this.layout.getLineEnd(i5);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineForOffset(int i5) {
        return this.layout.getLineForOffset(i5);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineForVerticalPosition(float f5) {
        return this.layout.getLineForVertical((int) f5);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineHeight(int i5) {
        return this.layout.getLineHeight(i5);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineLeft(int i5) {
        return this.layout.getLineLeft(i5);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineRight(int i5) {
        return this.layout.getLineRight(i5);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineStart(int i5) {
        return this.layout.getLineStart(i5);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineTop(int i5) {
        return this.layout.getLineTop(i5);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineWidth(int i5) {
        return this.layout.getLineWidth(i5);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getMaxIntrinsicWidth() {
        return this.paragraphIntrinsics.getMaxIntrinsicWidth();
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getMinIntrinsicWidth() {
        return this.paragraphIntrinsics.getMinIntrinsicWidth();
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* renamed from: getOffsetForPosition-k-4lQ0M, reason: not valid java name */
    public int mo5393getOffsetForPositionk4lQ0M(long j5) {
        return this.layout.getOffsetForHorizontal(this.layout.getLineForVertical((int) Offset.m3494getYimpl(j5)), Offset.m3493getXimpl(j5));
    }

    @Override // androidx.compose.ui.text.Paragraph
    @l
    public ResolvedTextDirection getParagraphDirection(int i5) {
        if (this.layout.getParagraphDirection(this.layout.getLineForOffset(i5)) == 1) {
            return ResolvedTextDirection.Ltr;
        }
        return ResolvedTextDirection.Rtl;
    }

    @l
    public final AndroidParagraphIntrinsics getParagraphIntrinsics() {
        return this.paragraphIntrinsics;
    }

    @Override // androidx.compose.ui.text.Paragraph
    @l
    public Path getPathForRange(int i5, int i6) {
        boolean z4;
        boolean z5 = true;
        if (i5 >= 0 && i5 <= i6) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4 || i6 > this.charSequence.length()) {
            z5 = false;
        }
        if (z5) {
            android.graphics.Path path = new android.graphics.Path();
            this.layout.getSelectionPath(i5, i6, path);
            return AndroidPath_androidKt.asComposePath(path);
        }
        throw new IllegalArgumentException(("start(" + i5 + ") or end(" + i6 + ") is out of range [0.." + this.charSequence.length() + "], or start > end!").toString());
    }

    @Override // androidx.compose.ui.text.Paragraph
    @l
    public List<Rect> getPlaceholderRects() {
        return this.placeholderRects;
    }

    @l
    public final Locale getTextLocale$ui_text_release() {
        return this.paragraphIntrinsics.getTextPaint$ui_text_release().getTextLocale();
    }

    @l
    public final AndroidTextPaint getTextPaint$ui_text_release() {
        return this.paragraphIntrinsics.getTextPaint$ui_text_release();
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getWidth() {
        return Constraints.m6000getMaxWidthimpl(this.constraints);
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* renamed from: getWordBoundary--jx7JFs, reason: not valid java name */
    public long mo5394getWordBoundaryjx7JFs(int i5) {
        return TextRangeKt.TextRange(getWordBoundary().getWordStart(i5), getWordBoundary().getWordEnd(i5));
    }

    @Override // androidx.compose.ui.text.Paragraph
    public boolean isLineEllipsized(int i5) {
        return this.layout.isLineEllipsized(i5);
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* renamed from: paint-LG529CI, reason: not valid java name */
    public void mo5395paintLG529CI(@l Canvas canvas, long j5, @m Shadow shadow, @m TextDecoration textDecoration, @m DrawStyle drawStyle, int i5) {
        int m5798getBlendMode0nO6VwU = getTextPaint$ui_text_release().m5798getBlendMode0nO6VwU();
        AndroidTextPaint textPaint$ui_text_release = getTextPaint$ui_text_release();
        textPaint$ui_text_release.m5801setColor8_81llA(j5);
        textPaint$ui_text_release.setShadow(shadow);
        textPaint$ui_text_release.setTextDecoration(textDecoration);
        textPaint$ui_text_release.setDrawStyle(drawStyle);
        textPaint$ui_text_release.m5799setBlendModes9anfk8(i5);
        paint(canvas);
        getTextPaint$ui_text_release().m5799setBlendModes9anfk8(m5798getBlendMode0nO6VwU);
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* renamed from: paint-RPmYEkk, reason: not valid java name */
    public void mo5396paintRPmYEkk(@l Canvas canvas, long j5, @m Shadow shadow, @m TextDecoration textDecoration) {
        AndroidTextPaint textPaint$ui_text_release = getTextPaint$ui_text_release();
        textPaint$ui_text_release.m5801setColor8_81llA(j5);
        textPaint$ui_text_release.setShadow(shadow);
        textPaint$ui_text_release.setTextDecoration(textDecoration);
        paint(canvas);
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* renamed from: paint-hn5TExg, reason: not valid java name */
    public void mo5397painthn5TExg(@l Canvas canvas, @l Brush brush, float f5, @m Shadow shadow, @m TextDecoration textDecoration, @m DrawStyle drawStyle, int i5) {
        int m5798getBlendMode0nO6VwU = getTextPaint$ui_text_release().m5798getBlendMode0nO6VwU();
        AndroidTextPaint textPaint$ui_text_release = getTextPaint$ui_text_release();
        textPaint$ui_text_release.m5800setBrush12SF9DM(brush, SizeKt.Size(getWidth(), getHeight()), f5);
        textPaint$ui_text_release.setShadow(shadow);
        textPaint$ui_text_release.setTextDecoration(textDecoration);
        textPaint$ui_text_release.setDrawStyle(drawStyle);
        textPaint$ui_text_release.m5799setBlendModes9anfk8(i5);
        paint(canvas);
        getTextPaint$ui_text_release().m5799setBlendModes9anfk8(m5798getBlendMode0nO6VwU);
    }

    private AndroidParagraph(String str, TextStyle textStyle, List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<Placeholder>> list2, int i5, boolean z4, long j5, FontFamily.Resolver resolver, Density density) {
        this(new AndroidParagraphIntrinsics(str, textStyle, list, list2, resolver, density), i5, z4, j5, null);
    }
}
