package androidx.compose.ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0013\b\u0016\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u0015\u0010\u0016B\t\b\u0016¢\u0006\u0004\b\u0015\u0010\u000fB\u001d\b\u0016\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u0015\u0010\u0017B\u0013\b\u0016\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0018J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000R\u001d\u0010\n\u001a\u00020\u00038F¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0011\u001a\u00020\u00108\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/text/PlatformParagraphStyle;", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "", "toString", "merge", "includeFontPadding", "Z", "getIncludeFontPadding", "()Z", "getIncludeFontPadding$annotations", "()V", "Landroidx/compose/ui/text/EmojiSupportMatch;", "emojiSupportMatch", "I", "getEmojiSupportMatch-_3YsG6Y", "()I", "<init>", "(Z)V", "(IZLkotlin/jvm/internal/w;)V", "(ILkotlin/jvm/internal/w;)V", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class PlatformParagraphStyle {
    public static final int $stable = 0;

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private static final PlatformParagraphStyle Default = new PlatformParagraphStyle();
    private final int emojiSupportMatch;
    private final boolean includeFontPadding;

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/PlatformParagraphStyle$Companion;", "", "()V", "Default", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "getDefault", "()Landroidx/compose/ui/text/PlatformParagraphStyle;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        public final PlatformParagraphStyle getDefault() {
            return PlatformParagraphStyle.Default;
        }
    }

    public /* synthetic */ PlatformParagraphStyle(int i5, w wVar) {
        this(i5);
    }

    public /* synthetic */ PlatformParagraphStyle(int i5, boolean z4, w wVar) {
        this(i5, z4);
    }

    public PlatformParagraphStyle(boolean z4) {
        this.includeFontPadding = z4;
        this.emojiSupportMatch = EmojiSupportMatch.Companion.m5416getDefault_3YsG6Y();
    }

    public static /* synthetic */ void getIncludeFontPadding$annotations() {
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformParagraphStyle)) {
            return false;
        }
        PlatformParagraphStyle platformParagraphStyle = (PlatformParagraphStyle) obj;
        if (this.includeFontPadding == platformParagraphStyle.includeFontPadding && EmojiSupportMatch.m5412equalsimpl0(this.emojiSupportMatch, platformParagraphStyle.emojiSupportMatch)) {
            return true;
        }
        return false;
    }

    /* renamed from: getEmojiSupportMatch-_3YsG6Y, reason: not valid java name */
    public final int m5483getEmojiSupportMatch_3YsG6Y() {
        return this.emojiSupportMatch;
    }

    public final boolean getIncludeFontPadding() {
        return this.includeFontPadding;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.includeFontPadding) * 31) + EmojiSupportMatch.m5413hashCodeimpl(this.emojiSupportMatch);
    }

    @l
    public final PlatformParagraphStyle merge(@m PlatformParagraphStyle platformParagraphStyle) {
        return platformParagraphStyle == null ? this : platformParagraphStyle;
    }

    @l
    public String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.includeFontPadding + ", emojiSupportMatch=" + ((Object) EmojiSupportMatch.m5414toStringimpl(this.emojiSupportMatch)) + ')';
    }

    public /* synthetic */ PlatformParagraphStyle(boolean z4, int i5, w wVar) {
        this((i5 & 1) != 0 ? false : z4);
    }

    public /* synthetic */ PlatformParagraphStyle(int i5, boolean z4, int i6, w wVar) {
        this((i6 & 1) != 0 ? EmojiSupportMatch.Companion.m5416getDefault_3YsG6Y() : i5, (i6 & 2) != 0 ? false : z4, (w) null);
    }

    private PlatformParagraphStyle(int i5, boolean z4) {
        this.includeFontPadding = z4;
        this.emojiSupportMatch = i5;
    }

    private PlatformParagraphStyle(int i5) {
        this.includeFontPadding = false;
        this.emojiSupportMatch = i5;
    }

    public /* synthetic */ PlatformParagraphStyle(int i5, int i6, w wVar) {
        this((i6 & 1) != 0 ? EmojiSupportMatch.Companion.m5416getDefault_3YsG6Y() : i5, (w) null);
    }

    public PlatformParagraphStyle() {
        this(EmojiSupportMatch.Companion.m5416getDefault_3YsG6Y(), false, (w) null);
    }
}
