package androidx.compose.ui.text;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.k;
import p4.l;
import p4.m;
import u3.h;

@i0(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b.\b\u0007\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\bN\u0010OBs\b\u0017\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\bN\u0010PB7\b\u0017\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\bN\u0010QBO\b\u0017\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\bN\u0010RBg\b\u0017\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\bN\u0010SJ\u0014\u0010\u0003\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\u0007J\u0011\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0087\u0002J@\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJX\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015Jp\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ|\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJr\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001cø\u0001\u0000¢\u0006\u0004\b \u0010!J\u0013\u0010#\u001a\u00020\"2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010%\u001a\u00020$H\u0016J\b\u0010'\u001a\u00020&H\u0016R\u001d\u0010\u0006\u001a\u00020\u00058\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b+\u0010*R\u001d\u0010\n\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00105\u001a\u0004\b6\u00107R\u001d\u0010\u0017\u001a\u00020\u00168\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010(\u001a\u0004\b8\u0010*R\u001d\u0010\u0019\u001a\u00020\u00188\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0019\u0010(\u001a\u0004\b9\u0010*R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010:\u001a\u0004\b;\u0010<R\"\u0010A\u001a\u0004\u0018\u00010\u00058GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b?\u0010@\u001a\u0004\b=\u0010>R\"\u0010E\u001a\u0004\u0018\u00010\u00078GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\bD\u0010@\u001a\u0004\bB\u0010CR\"\u0010I\u001a\u0004\u0018\u00010\u00188GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\bH\u0010@\u001a\u0004\bF\u0010GR\"\u0010M\u001a\u0004\u0018\u00010\u00168GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\bL\u0010@\u001a\u0004\bJ\u0010K\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006T"}, d2 = {"Landroidx/compose/ui/text/ParagraphStyle;", "", "other", "merge", "plus", "Landroidx/compose/ui/text/style/TextAlign;", "textAlign", "Landroidx/compose/ui/text/style/TextDirection;", "textDirection", "Landroidx/compose/ui/unit/TextUnit;", "lineHeight", "Landroidx/compose/ui/text/style/TextIndent;", "textIndent", "copy-Elsmlbk", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;)Landroidx/compose/ui/text/ParagraphStyle;", "copy", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "platformStyle", "Landroidx/compose/ui/text/style/LineHeightStyle;", "lineHeightStyle", "copy-xPh5V4g", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;)Landroidx/compose/ui/text/ParagraphStyle;", "Landroidx/compose/ui/text/style/LineBreak;", "lineBreak", "Landroidx/compose/ui/text/style/Hyphens;", "hyphens", "copy-ciSxzs0", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;)Landroidx/compose/ui/text/ParagraphStyle;", "Landroidx/compose/ui/text/style/TextMotion;", "textMotion", "copy-NH1kkwU", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Landroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/ParagraphStyle;", "copy-ykzQM6k", "(IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/ParagraphStyle;", "", "equals", "", TTDownloadField.TT_HASHCODE, "", "toString", "I", "getTextAlign-e0LSkKk", "()I", "getTextDirection-s_7X-co", "J", "getLineHeight-XSAIIZE", "()J", "Landroidx/compose/ui/text/style/TextIndent;", "getTextIndent", "()Landroidx/compose/ui/text/style/TextIndent;", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "getPlatformStyle", "()Landroidx/compose/ui/text/PlatformParagraphStyle;", "Landroidx/compose/ui/text/style/LineHeightStyle;", "getLineHeightStyle", "()Landroidx/compose/ui/text/style/LineHeightStyle;", "getLineBreak-rAG3T2k", "getHyphens-vmbZdU8", "Landroidx/compose/ui/text/style/TextMotion;", "getTextMotion", "()Landroidx/compose/ui/text/style/TextMotion;", "getTextAlign-buA522U", "()Landroidx/compose/ui/text/style/TextAlign;", "getTextAlign-buA522U$annotations", "()V", "deprecated_boxing_textAlign", "getTextDirection-mmuk1to", "()Landroidx/compose/ui/text/style/TextDirection;", "getTextDirection-mmuk1to$annotations", "deprecated_boxing_textDirection", "getHyphens-EaSxIns", "()Landroidx/compose/ui/text/style/Hyphens;", "getHyphens-EaSxIns$annotations", "deprecated_boxing_hyphens", "getLineBreak-LgCVezo", "()Landroidx/compose/ui/text/style/LineBreak;", "getLineBreak-LgCVezo$annotations", "deprecated_boxing_lineBreak", "<init>", "(IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;Lkotlin/jvm/internal/w;)V", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Landroidx/compose/ui/text/style/TextMotion;Lkotlin/jvm/internal/w;)V", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Lkotlin/jvm/internal/w;)V", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Lkotlin/jvm/internal/w;)V", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Lkotlin/jvm/internal/w;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@Immutable
/* loaded from: classes.dex */
public final class ParagraphStyle {
    public static final int $stable = 0;
    private final int hyphens;
    private final int lineBreak;
    private final long lineHeight;

    @m
    private final LineHeightStyle lineHeightStyle;

    @m
    private final PlatformParagraphStyle platformStyle;
    private final int textAlign;
    private final int textDirection;

    @m
    private final TextIndent textIndent;

    @m
    private final TextMotion textMotion;

    private ParagraphStyle(int i5, int i6, long j5, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i7, int i8, TextMotion textMotion) {
        this.textAlign = i5;
        this.textDirection = i6;
        this.lineHeight = j5;
        this.textIndent = textIndent;
        this.platformStyle = platformParagraphStyle;
        this.lineHeightStyle = lineHeightStyle;
        this.lineBreak = i7;
        this.hyphens = i8;
        this.textMotion = textMotion;
        if (TextUnit.m6232equalsimpl0(j5, TextUnit.Companion.m6246getUnspecifiedXSAIIZE())) {
            return;
        }
        if (TextUnit.m6235getValueimpl(j5) >= 0.0f) {
            return;
        }
        throw new IllegalStateException(("lineHeight can't be negative (" + TextUnit.m6235getValueimpl(j5) + ')').toString());
    }

    public /* synthetic */ ParagraphStyle(int i5, int i6, long j5, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i7, int i8, TextMotion textMotion, w wVar) {
        this(i5, i6, j5, textIndent, platformParagraphStyle, lineHeightStyle, i7, i8, textMotion);
    }

    @k(level = kotlin.m.HIDDEN, message = "ParagraphStyle constructors that take nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, w wVar) {
        this(textAlign, textDirection, j5, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak, hyphens, textMotion);
    }

    @k(level = kotlin.m.HIDDEN, message = "ParagraphStyle constructors that do not take new stable parameters like LineBreak, Hyphens, TextMotion are deprecated. Please use the new stable constructors.")
    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, w wVar) {
        this(textAlign, textDirection, j5, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak, hyphens);
    }

    @k(level = kotlin.m.HIDDEN, message = "ParagraphStyle constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable constructors.")
    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, w wVar) {
        this(textAlign, textDirection, j5, textIndent, platformParagraphStyle, lineHeightStyle);
    }

    @k(level = kotlin.m.HIDDEN, message = "ParagraphStyle constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable constructor.")
    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, w wVar) {
        this(textAlign, textDirection, j5, textIndent);
    }

    /* renamed from: copy-Elsmlbk$default, reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m5440copyElsmlbk$default(ParagraphStyle paragraphStyle, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            textAlign = TextAlign.m5929boximpl(paragraphStyle.textAlign);
        }
        if ((i5 & 2) != 0) {
            textDirection = TextDirection.m5943boximpl(paragraphStyle.textDirection);
        }
        TextDirection textDirection2 = textDirection;
        if ((i5 & 4) != 0) {
            j5 = paragraphStyle.lineHeight;
        }
        long j6 = j5;
        if ((i5 & 8) != 0) {
            textIndent = paragraphStyle.textIndent;
        }
        return paragraphStyle.m5449copyElsmlbk(textAlign, textDirection2, j6, textIndent);
    }

    /* renamed from: copy-NH1kkwU$default, reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m5441copyNH1kkwU$default(ParagraphStyle paragraphStyle, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i5, Object obj) {
        TextAlign textAlign2;
        TextDirection textDirection2;
        long j6;
        TextIndent textIndent2;
        PlatformParagraphStyle platformParagraphStyle2;
        LineHeightStyle lineHeightStyle2;
        LineBreak lineBreak2;
        Hyphens hyphens2;
        TextMotion textMotion2;
        if ((i5 & 1) != 0) {
            textAlign2 = TextAlign.m5929boximpl(paragraphStyle.textAlign);
        } else {
            textAlign2 = textAlign;
        }
        if ((i5 & 2) != 0) {
            textDirection2 = TextDirection.m5943boximpl(paragraphStyle.textDirection);
        } else {
            textDirection2 = textDirection;
        }
        if ((i5 & 4) != 0) {
            j6 = paragraphStyle.lineHeight;
        } else {
            j6 = j5;
        }
        if ((i5 & 8) != 0) {
            textIndent2 = paragraphStyle.textIndent;
        } else {
            textIndent2 = textIndent;
        }
        if ((i5 & 16) != 0) {
            platformParagraphStyle2 = paragraphStyle.platformStyle;
        } else {
            platformParagraphStyle2 = platformParagraphStyle;
        }
        if ((i5 & 32) != 0) {
            lineHeightStyle2 = paragraphStyle.lineHeightStyle;
        } else {
            lineHeightStyle2 = lineHeightStyle;
        }
        if ((i5 & 64) != 0) {
            lineBreak2 = LineBreak.m5849boximpl(paragraphStyle.lineBreak);
        } else {
            lineBreak2 = lineBreak;
        }
        if ((i5 & 128) != 0) {
            hyphens2 = Hyphens.m5839boximpl(paragraphStyle.hyphens);
        } else {
            hyphens2 = hyphens;
        }
        if ((i5 & 256) != 0) {
            textMotion2 = paragraphStyle.textMotion;
        } else {
            textMotion2 = textMotion;
        }
        return paragraphStyle.m5450copyNH1kkwU(textAlign2, textDirection2, j6, textIndent2, platformParagraphStyle2, lineHeightStyle2, lineBreak2, hyphens2, textMotion2);
    }

    /* renamed from: copy-ciSxzs0$default, reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m5442copyciSxzs0$default(ParagraphStyle paragraphStyle, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, int i5, Object obj) {
        TextAlign textAlign2;
        TextDirection textDirection2;
        long j6;
        TextIndent textIndent2;
        PlatformParagraphStyle platformParagraphStyle2;
        LineHeightStyle lineHeightStyle2;
        LineBreak lineBreak2;
        Hyphens hyphens2;
        if ((i5 & 1) != 0) {
            textAlign2 = TextAlign.m5929boximpl(paragraphStyle.textAlign);
        } else {
            textAlign2 = textAlign;
        }
        if ((i5 & 2) != 0) {
            textDirection2 = TextDirection.m5943boximpl(paragraphStyle.textDirection);
        } else {
            textDirection2 = textDirection;
        }
        if ((i5 & 4) != 0) {
            j6 = paragraphStyle.lineHeight;
        } else {
            j6 = j5;
        }
        if ((i5 & 8) != 0) {
            textIndent2 = paragraphStyle.textIndent;
        } else {
            textIndent2 = textIndent;
        }
        if ((i5 & 16) != 0) {
            platformParagraphStyle2 = paragraphStyle.platformStyle;
        } else {
            platformParagraphStyle2 = platformParagraphStyle;
        }
        if ((i5 & 32) != 0) {
            lineHeightStyle2 = paragraphStyle.lineHeightStyle;
        } else {
            lineHeightStyle2 = lineHeightStyle;
        }
        if ((i5 & 64) != 0) {
            lineBreak2 = LineBreak.m5849boximpl(paragraphStyle.lineBreak);
        } else {
            lineBreak2 = lineBreak;
        }
        if ((i5 & 128) != 0) {
            hyphens2 = Hyphens.m5839boximpl(paragraphStyle.hyphens);
        } else {
            hyphens2 = hyphens;
        }
        return paragraphStyle.m5451copyciSxzs0(textAlign2, textDirection2, j6, textIndent2, platformParagraphStyle2, lineHeightStyle2, lineBreak2, hyphens2);
    }

    /* renamed from: copy-xPh5V4g$default, reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m5443copyxPh5V4g$default(ParagraphStyle paragraphStyle, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            textAlign = TextAlign.m5929boximpl(paragraphStyle.textAlign);
        }
        if ((i5 & 2) != 0) {
            textDirection = TextDirection.m5943boximpl(paragraphStyle.textDirection);
        }
        TextDirection textDirection2 = textDirection;
        if ((i5 & 4) != 0) {
            j5 = paragraphStyle.lineHeight;
        }
        long j6 = j5;
        if ((i5 & 8) != 0) {
            textIndent = paragraphStyle.textIndent;
        }
        TextIndent textIndent2 = textIndent;
        if ((i5 & 16) != 0) {
            platformParagraphStyle = paragraphStyle.platformStyle;
        }
        PlatformParagraphStyle platformParagraphStyle2 = platformParagraphStyle;
        if ((i5 & 32) != 0) {
            lineHeightStyle = paragraphStyle.lineHeightStyle;
        }
        return paragraphStyle.m5452copyxPh5V4g(textAlign, textDirection2, j6, textIndent2, platformParagraphStyle2, lineHeightStyle);
    }

    /* renamed from: copy-ykzQM6k$default, reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m5444copyykzQM6k$default(ParagraphStyle paragraphStyle, int i5, int i6, long j5, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i7, int i8, TextMotion textMotion, int i9, Object obj) {
        int i10;
        int i11;
        long j6;
        TextIndent textIndent2;
        PlatformParagraphStyle platformParagraphStyle2;
        LineHeightStyle lineHeightStyle2;
        int i12;
        int i13;
        TextMotion textMotion2;
        if ((i9 & 1) != 0) {
            i10 = paragraphStyle.textAlign;
        } else {
            i10 = i5;
        }
        if ((i9 & 2) != 0) {
            i11 = paragraphStyle.textDirection;
        } else {
            i11 = i6;
        }
        if ((i9 & 4) != 0) {
            j6 = paragraphStyle.lineHeight;
        } else {
            j6 = j5;
        }
        if ((i9 & 8) != 0) {
            textIndent2 = paragraphStyle.textIndent;
        } else {
            textIndent2 = textIndent;
        }
        if ((i9 & 16) != 0) {
            platformParagraphStyle2 = paragraphStyle.platformStyle;
        } else {
            platformParagraphStyle2 = platformParagraphStyle;
        }
        if ((i9 & 32) != 0) {
            lineHeightStyle2 = paragraphStyle.lineHeightStyle;
        } else {
            lineHeightStyle2 = lineHeightStyle;
        }
        if ((i9 & 64) != 0) {
            i12 = paragraphStyle.lineBreak;
        } else {
            i12 = i7;
        }
        if ((i9 & 128) != 0) {
            i13 = paragraphStyle.hyphens;
        } else {
            i13 = i8;
        }
        if ((i9 & 256) != 0) {
            textMotion2 = paragraphStyle.textMotion;
        } else {
            textMotion2 = textMotion;
        }
        return paragraphStyle.m5453copyykzQM6k(i10, i11, j6, textIndent2, platformParagraphStyle2, lineHeightStyle2, i12, i13, textMotion2);
    }

    @k(level = kotlin.m.WARNING, message = "Kept for backwards compatibility.")
    /* renamed from: getHyphens-EaSxIns$annotations, reason: not valid java name */
    public static /* synthetic */ void m5445getHyphensEaSxIns$annotations() {
    }

    @k(level = kotlin.m.WARNING, message = "Kept for backwards compatibility.")
    /* renamed from: getLineBreak-LgCVezo$annotations, reason: not valid java name */
    public static /* synthetic */ void m5446getLineBreakLgCVezo$annotations() {
    }

    @k(level = kotlin.m.WARNING, message = "Kept for backwards compatibility.")
    /* renamed from: getTextAlign-buA522U$annotations, reason: not valid java name */
    public static /* synthetic */ void m5447getTextAlignbuA522U$annotations() {
    }

    @k(level = kotlin.m.WARNING, message = "Kept for backwards compatibility.")
    /* renamed from: getTextDirection-mmuk1to$annotations, reason: not valid java name */
    public static /* synthetic */ void m5448getTextDirectionmmuk1to$annotations() {
    }

    public static /* synthetic */ ParagraphStyle merge$default(ParagraphStyle paragraphStyle, ParagraphStyle paragraphStyle2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            paragraphStyle2 = null;
        }
        return paragraphStyle.merge(paragraphStyle2);
    }

    @k(level = kotlin.m.HIDDEN, message = "ParagraphStyle copy constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable copy constructor.")
    /* renamed from: copy-Elsmlbk, reason: not valid java name */
    public final /* synthetic */ ParagraphStyle m5449copyElsmlbk(TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent) {
        int m5942getUnspecifiede0LSkKk;
        int m5955getUnspecifieds_7Xco;
        if (textAlign != null) {
            m5942getUnspecifiede0LSkKk = textAlign.m5935unboximpl();
        } else {
            m5942getUnspecifiede0LSkKk = TextAlign.Companion.m5942getUnspecifiede0LSkKk();
        }
        int i5 = m5942getUnspecifiede0LSkKk;
        if (textDirection != null) {
            m5955getUnspecifieds_7Xco = textDirection.m5949unboximpl();
        } else {
            m5955getUnspecifieds_7Xco = TextDirection.Companion.m5955getUnspecifieds_7Xco();
        }
        return new ParagraphStyle(i5, m5955getUnspecifieds_7Xco, j5, textIndent, this.platformStyle, this.lineHeightStyle, this.lineBreak, this.hyphens, this.textMotion, (w) null);
    }

    @k(level = kotlin.m.HIDDEN, message = "ParagraphStyle copy constructors that take nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    /* renamed from: copy-NH1kkwU, reason: not valid java name */
    public final /* synthetic */ ParagraphStyle m5450copyNH1kkwU(TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        int m5942getUnspecifiede0LSkKk;
        int m5955getUnspecifieds_7Xco;
        int m5869getUnspecifiedrAG3T2k;
        int m5848getUnspecifiedvmbZdU8;
        if (textAlign != null) {
            m5942getUnspecifiede0LSkKk = textAlign.m5935unboximpl();
        } else {
            m5942getUnspecifiede0LSkKk = TextAlign.Companion.m5942getUnspecifiede0LSkKk();
        }
        int i5 = m5942getUnspecifiede0LSkKk;
        if (textDirection != null) {
            m5955getUnspecifieds_7Xco = textDirection.m5949unboximpl();
        } else {
            m5955getUnspecifieds_7Xco = TextDirection.Companion.m5955getUnspecifieds_7Xco();
        }
        int i6 = m5955getUnspecifieds_7Xco;
        if (lineBreak != null) {
            m5869getUnspecifiedrAG3T2k = lineBreak.m5861unboximpl();
        } else {
            m5869getUnspecifiedrAG3T2k = LineBreak.Companion.m5869getUnspecifiedrAG3T2k();
        }
        int i7 = m5869getUnspecifiedrAG3T2k;
        if (hyphens != null) {
            m5848getUnspecifiedvmbZdU8 = hyphens.m5845unboximpl();
        } else {
            m5848getUnspecifiedvmbZdU8 = Hyphens.Companion.m5848getUnspecifiedvmbZdU8();
        }
        return new ParagraphStyle(i5, i6, j5, textIndent, platformParagraphStyle, lineHeightStyle, i7, m5848getUnspecifiedvmbZdU8, textMotion, (w) null);
    }

    @k(level = kotlin.m.HIDDEN, message = "ParagraphStyle copy constructors that do not take new stable parameters like LineBreak, Hyphens, TextMotion are deprecated. Please use the new stable copy constructor.")
    /* renamed from: copy-ciSxzs0, reason: not valid java name */
    public final /* synthetic */ ParagraphStyle m5451copyciSxzs0(TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens) {
        int m5942getUnspecifiede0LSkKk;
        int m5955getUnspecifieds_7Xco;
        int m5869getUnspecifiedrAG3T2k;
        int m5848getUnspecifiedvmbZdU8;
        if (textAlign != null) {
            m5942getUnspecifiede0LSkKk = textAlign.m5935unboximpl();
        } else {
            m5942getUnspecifiede0LSkKk = TextAlign.Companion.m5942getUnspecifiede0LSkKk();
        }
        int i5 = m5942getUnspecifiede0LSkKk;
        if (textDirection != null) {
            m5955getUnspecifieds_7Xco = textDirection.m5949unboximpl();
        } else {
            m5955getUnspecifieds_7Xco = TextDirection.Companion.m5955getUnspecifieds_7Xco();
        }
        int i6 = m5955getUnspecifieds_7Xco;
        if (lineBreak != null) {
            m5869getUnspecifiedrAG3T2k = lineBreak.m5861unboximpl();
        } else {
            m5869getUnspecifiedrAG3T2k = LineBreak.Companion.m5869getUnspecifiedrAG3T2k();
        }
        int i7 = m5869getUnspecifiedrAG3T2k;
        if (hyphens != null) {
            m5848getUnspecifiedvmbZdU8 = hyphens.m5845unboximpl();
        } else {
            m5848getUnspecifiedvmbZdU8 = Hyphens.Companion.m5848getUnspecifiedvmbZdU8();
        }
        return new ParagraphStyle(i5, i6, j5, textIndent, platformParagraphStyle, lineHeightStyle, i7, m5848getUnspecifiedvmbZdU8, this.textMotion, (w) null);
    }

    @k(level = kotlin.m.HIDDEN, message = "ParagraphStyle copy constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable copy constructor.")
    /* renamed from: copy-xPh5V4g, reason: not valid java name */
    public final /* synthetic */ ParagraphStyle m5452copyxPh5V4g(TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle) {
        int m5942getUnspecifiede0LSkKk;
        int m5955getUnspecifieds_7Xco;
        if (textAlign != null) {
            m5942getUnspecifiede0LSkKk = textAlign.m5935unboximpl();
        } else {
            m5942getUnspecifiede0LSkKk = TextAlign.Companion.m5942getUnspecifiede0LSkKk();
        }
        int i5 = m5942getUnspecifiede0LSkKk;
        if (textDirection != null) {
            m5955getUnspecifieds_7Xco = textDirection.m5949unboximpl();
        } else {
            m5955getUnspecifieds_7Xco = TextDirection.Companion.m5955getUnspecifieds_7Xco();
        }
        return new ParagraphStyle(i5, m5955getUnspecifieds_7Xco, j5, textIndent, platformParagraphStyle, lineHeightStyle, this.lineBreak, this.hyphens, this.textMotion, (w) null);
    }

    @l
    /* renamed from: copy-ykzQM6k, reason: not valid java name */
    public final ParagraphStyle m5453copyykzQM6k(int i5, int i6, long j5, @m TextIndent textIndent, @m PlatformParagraphStyle platformParagraphStyle, @m LineHeightStyle lineHeightStyle, int i7, int i8, @m TextMotion textMotion) {
        return new ParagraphStyle(i5, i6, j5, textIndent, platformParagraphStyle, lineHeightStyle, i7, i8, textMotion, (w) null);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParagraphStyle)) {
            return false;
        }
        ParagraphStyle paragraphStyle = (ParagraphStyle) obj;
        if (TextAlign.m5932equalsimpl0(this.textAlign, paragraphStyle.textAlign) && TextDirection.m5946equalsimpl0(this.textDirection, paragraphStyle.textDirection) && TextUnit.m6232equalsimpl0(this.lineHeight, paragraphStyle.lineHeight) && l0.g(this.textIndent, paragraphStyle.textIndent) && l0.g(this.platformStyle, paragraphStyle.platformStyle) && l0.g(this.lineHeightStyle, paragraphStyle.lineHeightStyle) && LineBreak.m5855equalsimpl0(this.lineBreak, paragraphStyle.lineBreak) && Hyphens.m5842equalsimpl0(this.hyphens, paragraphStyle.hyphens) && l0.g(this.textMotion, paragraphStyle.textMotion)) {
            return true;
        }
        return false;
    }

    @h(name = "getHyphens-EaSxIns")
    @m
    /* renamed from: getHyphens-EaSxIns, reason: not valid java name */
    public final Hyphens m5454getHyphensEaSxIns() {
        return Hyphens.m5839boximpl(this.hyphens);
    }

    /* renamed from: getHyphens-vmbZdU8, reason: not valid java name */
    public final int m5455getHyphensvmbZdU8() {
        return this.hyphens;
    }

    @h(name = "getLineBreak-LgCVezo")
    @m
    /* renamed from: getLineBreak-LgCVezo, reason: not valid java name */
    public final LineBreak m5456getLineBreakLgCVezo() {
        return LineBreak.m5849boximpl(this.lineBreak);
    }

    /* renamed from: getLineBreak-rAG3T2k, reason: not valid java name */
    public final int m5457getLineBreakrAG3T2k() {
        return this.lineBreak;
    }

    /* renamed from: getLineHeight-XSAIIZE, reason: not valid java name */
    public final long m5458getLineHeightXSAIIZE() {
        return this.lineHeight;
    }

    @m
    public final LineHeightStyle getLineHeightStyle() {
        return this.lineHeightStyle;
    }

    @m
    public final PlatformParagraphStyle getPlatformStyle() {
        return this.platformStyle;
    }

    @h(name = "getTextAlign-buA522U")
    @m
    /* renamed from: getTextAlign-buA522U, reason: not valid java name */
    public final TextAlign m5459getTextAlignbuA522U() {
        return TextAlign.m5929boximpl(this.textAlign);
    }

    /* renamed from: getTextAlign-e0LSkKk, reason: not valid java name */
    public final int m5460getTextAligne0LSkKk() {
        return this.textAlign;
    }

    @h(name = "getTextDirection-mmuk1to")
    @m
    /* renamed from: getTextDirection-mmuk1to, reason: not valid java name */
    public final TextDirection m5461getTextDirectionmmuk1to() {
        return TextDirection.m5943boximpl(this.textDirection);
    }

    /* renamed from: getTextDirection-s_7X-co, reason: not valid java name */
    public final int m5462getTextDirections_7Xco() {
        return this.textDirection;
    }

    @m
    public final TextIndent getTextIndent() {
        return this.textIndent;
    }

    @m
    public final TextMotion getTextMotion() {
        return this.textMotion;
    }

    public int hashCode() {
        int i5;
        int i6;
        int i7;
        int m5933hashCodeimpl = ((((TextAlign.m5933hashCodeimpl(this.textAlign) * 31) + TextDirection.m5947hashCodeimpl(this.textDirection)) * 31) + TextUnit.m6236hashCodeimpl(this.lineHeight)) * 31;
        TextIndent textIndent = this.textIndent;
        int i8 = 0;
        if (textIndent != null) {
            i5 = textIndent.hashCode();
        } else {
            i5 = 0;
        }
        int i9 = (m5933hashCodeimpl + i5) * 31;
        PlatformParagraphStyle platformParagraphStyle = this.platformStyle;
        if (platformParagraphStyle != null) {
            i6 = platformParagraphStyle.hashCode();
        } else {
            i6 = 0;
        }
        int i10 = (i9 + i6) * 31;
        LineHeightStyle lineHeightStyle = this.lineHeightStyle;
        if (lineHeightStyle != null) {
            i7 = lineHeightStyle.hashCode();
        } else {
            i7 = 0;
        }
        int m5859hashCodeimpl = (((((i10 + i7) * 31) + LineBreak.m5859hashCodeimpl(this.lineBreak)) * 31) + Hyphens.m5843hashCodeimpl(this.hyphens)) * 31;
        TextMotion textMotion = this.textMotion;
        if (textMotion != null) {
            i8 = textMotion.hashCode();
        }
        return m5859hashCodeimpl + i8;
    }

    @Stable
    @l
    public final ParagraphStyle merge(@m ParagraphStyle paragraphStyle) {
        if (paragraphStyle == null) {
            return this;
        }
        return ParagraphStyleKt.m5463fastMergej5T8yCg(this, paragraphStyle.textAlign, paragraphStyle.textDirection, paragraphStyle.lineHeight, paragraphStyle.textIndent, paragraphStyle.platformStyle, paragraphStyle.lineHeightStyle, paragraphStyle.lineBreak, paragraphStyle.hyphens, paragraphStyle.textMotion);
    }

    @Stable
    @l
    public final ParagraphStyle plus(@l ParagraphStyle paragraphStyle) {
        return merge(paragraphStyle);
    }

    @l
    public String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) TextAlign.m5934toStringimpl(this.textAlign)) + ", textDirection=" + ((Object) TextDirection.m5948toStringimpl(this.textDirection)) + ", lineHeight=" + ((Object) TextUnit.m6242toStringimpl(this.lineHeight)) + ", textIndent=" + this.textIndent + ", platformStyle=" + this.platformStyle + ", lineHeightStyle=" + this.lineHeightStyle + ", lineBreak=" + ((Object) LineBreak.m5860toStringimpl(this.lineBreak)) + ", hyphens=" + ((Object) Hyphens.m5844toStringimpl(this.hyphens)) + ", textMotion=" + this.textMotion + ')';
    }

    public /* synthetic */ ParagraphStyle(int i5, int i6, long j5, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i7, int i8, TextMotion textMotion, int i9, w wVar) {
        this((i9 & 1) != 0 ? TextAlign.Companion.m5942getUnspecifiede0LSkKk() : i5, (i9 & 2) != 0 ? TextDirection.Companion.m5955getUnspecifieds_7Xco() : i6, (i9 & 4) != 0 ? TextUnit.Companion.m6246getUnspecifiedXSAIIZE() : j5, (i9 & 8) != 0 ? null : textIndent, (i9 & 16) != 0 ? null : platformParagraphStyle, (i9 & 32) != 0 ? null : lineHeightStyle, (i9 & 64) != 0 ? LineBreak.Companion.m5869getUnspecifiedrAG3T2k() : i7, (i9 & 128) != 0 ? Hyphens.Companion.m5848getUnspecifiedvmbZdU8() : i8, (i9 & 256) == 0 ? textMotion : null, (w) null);
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i5, w wVar) {
        this((i5 & 1) != 0 ? null : textAlign, (i5 & 2) != 0 ? null : textDirection, (i5 & 4) != 0 ? TextUnit.Companion.m6246getUnspecifiedXSAIIZE() : j5, (i5 & 8) != 0 ? null : textIndent, (i5 & 16) != 0 ? null : platformParagraphStyle, (i5 & 32) != 0 ? null : lineHeightStyle, (i5 & 64) != 0 ? null : lineBreak, (i5 & 128) != 0 ? null : hyphens, (i5 & 256) == 0 ? textMotion : null, (w) null);
    }

    private ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        this(textAlign != null ? textAlign.m5935unboximpl() : TextAlign.Companion.m5942getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m5949unboximpl() : TextDirection.Companion.m5955getUnspecifieds_7Xco(), j5, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak != null ? lineBreak.m5861unboximpl() : LineBreak.Companion.m5869getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m5845unboximpl() : Hyphens.Companion.m5848getUnspecifiedvmbZdU8(), textMotion, (w) null);
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, int i5, w wVar) {
        this((i5 & 1) != 0 ? null : textAlign, (i5 & 2) != 0 ? null : textDirection, (i5 & 4) != 0 ? TextUnit.Companion.m6246getUnspecifiedXSAIIZE() : j5, (i5 & 8) != 0 ? null : textIndent, null);
    }

    private ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent) {
        this(textAlign != null ? textAlign.m5935unboximpl() : TextAlign.Companion.m5942getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m5949unboximpl() : TextDirection.Companion.m5955getUnspecifieds_7Xco(), j5, textIndent, (PlatformParagraphStyle) null, (LineHeightStyle) null, LineBreak.Companion.m5869getUnspecifiedrAG3T2k(), Hyphens.Companion.m5848getUnspecifiedvmbZdU8(), (TextMotion) null, (w) null);
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i5, w wVar) {
        this((i5 & 1) != 0 ? null : textAlign, (i5 & 2) != 0 ? null : textDirection, (i5 & 4) != 0 ? TextUnit.Companion.m6246getUnspecifiedXSAIIZE() : j5, (i5 & 8) != 0 ? null : textIndent, (i5 & 16) != 0 ? null : platformParagraphStyle, (i5 & 32) == 0 ? lineHeightStyle : null, null);
    }

    private ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle) {
        this(textAlign != null ? textAlign.m5935unboximpl() : TextAlign.Companion.m5942getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m5949unboximpl() : TextDirection.Companion.m5955getUnspecifieds_7Xco(), j5, textIndent, platformParagraphStyle, lineHeightStyle, LineBreak.Companion.m5869getUnspecifiedrAG3T2k(), Hyphens.Companion.m5848getUnspecifiedvmbZdU8(), (TextMotion) null, (w) null);
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, int i5, w wVar) {
        this((i5 & 1) != 0 ? null : textAlign, (i5 & 2) != 0 ? null : textDirection, (i5 & 4) != 0 ? TextUnit.Companion.m6246getUnspecifiedXSAIIZE() : j5, (i5 & 8) != 0 ? null : textIndent, (i5 & 16) != 0 ? null : platformParagraphStyle, (i5 & 32) != 0 ? null : lineHeightStyle, (i5 & 64) != 0 ? null : lineBreak, (i5 & 128) == 0 ? hyphens : null, (w) null);
    }

    private ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens) {
        this(textAlign != null ? textAlign.m5935unboximpl() : TextAlign.Companion.m5942getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m5949unboximpl() : TextDirection.Companion.m5955getUnspecifieds_7Xco(), j5, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak != null ? lineBreak.m5861unboximpl() : LineBreak.Companion.m5869getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m5845unboximpl() : Hyphens.Companion.m5848getUnspecifiedvmbZdU8(), (TextMotion) null, (w) null);
    }
}
