package androidx.compose.foundation.text2.input;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@Stable
@i0(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text2/input/TextFieldLineLimits;", "", "Companion", "MultiLine", "SingleLine", "Landroidx/compose/foundation/text2/input/TextFieldLineLimits$MultiLine;", "Landroidx/compose/foundation/text2/input/TextFieldLineLimits$SingleLine;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public interface TextFieldLineLimits {

    @l
    public static final Companion Companion = Companion.$$INSTANCE;

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/text2/input/TextFieldLineLimits$Companion;", "", "()V", "Default", "Landroidx/compose/foundation/text2/input/TextFieldLineLimits;", "getDefault", "()Landroidx/compose/foundation/text2/input/TextFieldLineLimits;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @l
        private static final TextFieldLineLimits Default;

        static {
            int i5 = 0;
            Default = new MultiLine(i5, i5, 3, null);
        }

        private Companion() {
        }

        @l
        public final TextFieldLineLimits getDefault() {
            return Default;
        }
    }

    @StabilityInferred(parameters = 1)
    @i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text2/input/TextFieldLineLimits$SingleLine;", "Landroidx/compose/foundation/text2/input/TextFieldLineLimits;", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class SingleLine implements TextFieldLineLimits {
        public static final int $stable = 0;

        @l
        public static final SingleLine INSTANCE = new SingleLine();

        private SingleLine() {
        }
    }

    @i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0096\u0002J\b\u0010\r\u001a\u00020\u0003H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0010"}, d2 = {"Landroidx/compose/foundation/text2/input/TextFieldLineLimits$MultiLine;", "Landroidx/compose/foundation/text2/input/TextFieldLineLimits;", "minHeightInLines", "", "maxHeightInLines", "(II)V", "getMaxHeightInLines", "()I", "getMinHeightInLines", "equals", "", "other", "", TTDownloadField.TT_HASHCODE, "toString", "", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Immutable
    /* loaded from: classes.dex */
    public static final class MultiLine implements TextFieldLineLimits {
        public static final int $stable = 0;
        private final int maxHeightInLines;
        private final int minHeightInLines;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public MultiLine() {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text2.input.TextFieldLineLimits.MultiLine.<init>():void");
        }

        public MultiLine(int i5, int i6) {
            this.minHeightInLines = i5;
            this.maxHeightInLines = i6;
            boolean z4 = false;
            if (1 <= i5 && i5 <= i6) {
                z4 = true;
            }
            if (z4) {
                return;
            }
            throw new IllegalArgumentException(("Expected 1 ≤ minHeightInLines ≤ maxHeightInLines, were " + i5 + ", " + i6).toString());
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || MultiLine.class != obj.getClass()) {
                return false;
            }
            MultiLine multiLine = (MultiLine) obj;
            if (this.minHeightInLines == multiLine.minHeightInLines && this.maxHeightInLines == multiLine.maxHeightInLines) {
                return true;
            }
            return false;
        }

        public final int getMaxHeightInLines() {
            return this.maxHeightInLines;
        }

        public final int getMinHeightInLines() {
            return this.minHeightInLines;
        }

        public int hashCode() {
            return (this.minHeightInLines * 31) + this.maxHeightInLines;
        }

        @l
        public String toString() {
            return "MultiLine(minHeightInLines=" + this.minHeightInLines + ", maxHeightInLines=" + this.maxHeightInLines + ')';
        }

        public /* synthetic */ MultiLine(int i5, int i6, int i7, w wVar) {
            this((i7 & 1) != 0 ? 1 : i5, (i7 & 2) != 0 ? Integer.MAX_VALUE : i6);
        }
    }
}
