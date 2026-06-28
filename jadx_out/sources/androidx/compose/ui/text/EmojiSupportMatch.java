package androidx.compose.ui.text;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.w;
import p4.l;
import t0.b;
import u3.f;

@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/EmojiSupportMatch;", "", b.f22420d, "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", TTDownloadField.TT_HASHCODE, "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@f
/* loaded from: classes.dex */
public final class EmojiSupportMatch {

    @l
    public static final Companion Companion = new Companion(null);
    private static final int Default = m5410constructorimpl(0);
    private static final int None = m5410constructorimpl(1);
    private final int value;

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/EmojiSupportMatch$Companion;", "", "()V", "Default", "Landroidx/compose/ui/text/EmojiSupportMatch;", "getDefault-_3YsG6Y", "()I", "I", "None", "getNone-_3YsG6Y", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        /* renamed from: getDefault-_3YsG6Y, reason: not valid java name */
        public final int m5416getDefault_3YsG6Y() {
            return EmojiSupportMatch.Default;
        }

        /* renamed from: getNone-_3YsG6Y, reason: not valid java name */
        public final int m5417getNone_3YsG6Y() {
            return EmojiSupportMatch.None;
        }
    }

    private /* synthetic */ EmojiSupportMatch(int i5) {
        this.value = i5;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ EmojiSupportMatch m5409boximpl(int i5) {
        return new EmojiSupportMatch(i5);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m5410constructorimpl(int i5) {
        return i5;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5411equalsimpl(int i5, Object obj) {
        return (obj instanceof EmojiSupportMatch) && i5 == ((EmojiSupportMatch) obj).m5415unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5412equalsimpl0(int i5, int i6) {
        return i5 == i6;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5413hashCodeimpl(int i5) {
        return Integer.hashCode(i5);
    }

    @l
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5414toStringimpl(int i5) {
        if (i5 == Default) {
            return "EmojiSupportMatch.Default";
        }
        if (i5 == None) {
            return "EmojiSupportMatch.None";
        }
        return "Invalid(value=" + i5 + ')';
    }

    public boolean equals(Object obj) {
        return m5411equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m5413hashCodeimpl(this.value);
    }

    @l
    public String toString() {
        return m5414toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5415unboximpl() {
        return this.value;
    }
}
