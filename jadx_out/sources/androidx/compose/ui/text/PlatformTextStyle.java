package androidx.compose.ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0013\u0010\u0014B\u0013\b\u0016\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0005¢\u0006\u0004\b\u0013\u0010\u0016B\u0011\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0013\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/text/PlatformTextStyle;", "", "", TTDownloadField.TT_HASHCODE, "other", "", "equals", "", "toString", "Landroidx/compose/ui/text/PlatformSpanStyle;", "spanStyle", "Landroidx/compose/ui/text/PlatformSpanStyle;", "getSpanStyle", "()Landroidx/compose/ui/text/PlatformSpanStyle;", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "paragraphStyle", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "getParagraphStyle", "()Landroidx/compose/ui/text/PlatformParagraphStyle;", "<init>", "(Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/text/PlatformParagraphStyle;)V", "includeFontPadding", "(Z)V", "Landroidx/compose/ui/text/EmojiSupportMatch;", "emojiSupportMatch", "(ILkotlin/jvm/internal/w;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class PlatformTextStyle {
    public static final int $stable = 0;

    @m
    private final PlatformParagraphStyle paragraphStyle;

    @m
    private final PlatformSpanStyle spanStyle;

    public /* synthetic */ PlatformTextStyle(int i5, w wVar) {
        this(i5);
    }

    public PlatformTextStyle(@m PlatformSpanStyle platformSpanStyle, @m PlatformParagraphStyle platformParagraphStyle) {
        this.spanStyle = platformSpanStyle;
        this.paragraphStyle = platformParagraphStyle;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformTextStyle)) {
            return false;
        }
        PlatformTextStyle platformTextStyle = (PlatformTextStyle) obj;
        if (l0.g(this.paragraphStyle, platformTextStyle.paragraphStyle) && l0.g(this.spanStyle, platformTextStyle.spanStyle)) {
            return true;
        }
        return false;
    }

    @m
    public final PlatformParagraphStyle getParagraphStyle() {
        return this.paragraphStyle;
    }

    @m
    public final PlatformSpanStyle getSpanStyle() {
        return this.spanStyle;
    }

    public int hashCode() {
        int i5;
        PlatformSpanStyle platformSpanStyle = this.spanStyle;
        int i6 = 0;
        if (platformSpanStyle != null) {
            i5 = platformSpanStyle.hashCode();
        } else {
            i5 = 0;
        }
        int i7 = i5 * 31;
        PlatformParagraphStyle platformParagraphStyle = this.paragraphStyle;
        if (platformParagraphStyle != null) {
            i6 = platformParagraphStyle.hashCode();
        }
        return i7 + i6;
    }

    @l
    public String toString() {
        return "PlatformTextStyle(spanStyle=" + this.spanStyle + ", paragraphSyle=" + this.paragraphStyle + ')';
    }

    public /* synthetic */ PlatformTextStyle(boolean z4, int i5, w wVar) {
        this((i5 & 1) != 0 ? false : z4);
    }

    public PlatformTextStyle(boolean z4) {
        this((PlatformSpanStyle) null, new PlatformParagraphStyle(z4));
    }

    private PlatformTextStyle(int i5) {
        this((PlatformSpanStyle) null, new PlatformParagraphStyle(i5, (w) null));
    }
}
