package androidx.compose.ui.text.style;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/text/style/TextIndent;", "", "Landroidx/compose/ui/unit/TextUnit;", "firstLine", "restLine", "copy-NB67dxo", "(JJ)Landroidx/compose/ui/text/style/TextIndent;", "copy", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "", "toString", "J", "getFirstLine-XSAIIZE", "()J", "getRestLine-XSAIIZE", "<init>", "(JJLkotlin/jvm/internal/w;)V", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@Immutable
/* loaded from: classes.dex */
public final class TextIndent {
    public static final int $stable = 0;

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private static final TextIndent None = new TextIndent(0, 0, 3, null);
    private final long firstLine;
    private final long restLine;

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/text/style/TextIndent$Companion;", "", "()V", "None", "Landroidx/compose/ui/text/style/TextIndent;", "getNone$annotations", "getNone", "()Landroidx/compose/ui/text/style/TextIndent;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @Stable
        public static /* synthetic */ void getNone$annotations() {
        }

        @l
        public final TextIndent getNone() {
            return TextIndent.None;
        }
    }

    private TextIndent(long j5, long j6) {
        this.firstLine = j5;
        this.restLine = j6;
    }

    public /* synthetic */ TextIndent(long j5, long j6, w wVar) {
        this(j5, j6);
    }

    /* renamed from: copy-NB67dxo$default, reason: not valid java name */
    public static /* synthetic */ TextIndent m5958copyNB67dxo$default(TextIndent textIndent, long j5, long j6, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            j5 = textIndent.firstLine;
        }
        if ((i5 & 2) != 0) {
            j6 = textIndent.restLine;
        }
        return textIndent.m5959copyNB67dxo(j5, j6);
    }

    @l
    /* renamed from: copy-NB67dxo, reason: not valid java name */
    public final TextIndent m5959copyNB67dxo(long j5, long j6) {
        return new TextIndent(j5, j6, null);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextIndent)) {
            return false;
        }
        TextIndent textIndent = (TextIndent) obj;
        if (TextUnit.m6232equalsimpl0(this.firstLine, textIndent.firstLine) && TextUnit.m6232equalsimpl0(this.restLine, textIndent.restLine)) {
            return true;
        }
        return false;
    }

    /* renamed from: getFirstLine-XSAIIZE, reason: not valid java name */
    public final long m5960getFirstLineXSAIIZE() {
        return this.firstLine;
    }

    /* renamed from: getRestLine-XSAIIZE, reason: not valid java name */
    public final long m5961getRestLineXSAIIZE() {
        return this.restLine;
    }

    public int hashCode() {
        return (TextUnit.m6236hashCodeimpl(this.firstLine) * 31) + TextUnit.m6236hashCodeimpl(this.restLine);
    }

    @l
    public String toString() {
        return "TextIndent(firstLine=" + ((Object) TextUnit.m6242toStringimpl(this.firstLine)) + ", restLine=" + ((Object) TextUnit.m6242toStringimpl(this.restLine)) + ')';
    }

    public /* synthetic */ TextIndent(long j5, long j6, int i5, w wVar) {
        this((i5 & 1) != 0 ? TextUnitKt.getSp(0) : j5, (i5 & 2) != 0 ? TextUnitKt.getSp(0) : j6, null);
    }
}
