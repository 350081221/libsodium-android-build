package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.InternalTextApi;
import com.tendcloud.tenddata.cq;
import kotlin.i0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u001b\u0010\u0011J\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u0011\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0086\u0002J\b\u0010\f\u001a\u00020\u0005H\u0016R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0011\u0010\u001a\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/text/input/PartialGapBuffer;", "", "", "start", "end", "", "text", "Lkotlin/r2;", "replace", "index", "", "get", "toString", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "Landroidx/compose/ui/text/input/GapBuffer;", "buffer", "Landroidx/compose/ui/text/input/GapBuffer;", "bufStart", "I", "bufEnd", "getLength", "()I", cq.a.LENGTH, "<init>", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@InternalTextApi
/* loaded from: classes.dex */
public final class PartialGapBuffer {
    public static final int BUF_SIZE = 255;
    public static final int NOWHERE = -1;
    public static final int SURROUNDING_SIZE = 64;

    @m
    private GapBuffer buffer;

    @l
    private String text;

    @l
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private int bufStart = -1;
    private int bufEnd = -1;

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/input/PartialGapBuffer$Companion;", "", "()V", "BUF_SIZE", "", "NOWHERE", "SURROUNDING_SIZE", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }
    }

    public PartialGapBuffer(@l String str) {
        this.text = str;
    }

    public final char get(int i5) {
        GapBuffer gapBuffer = this.buffer;
        if (gapBuffer == null) {
            return this.text.charAt(i5);
        }
        if (i5 < this.bufStart) {
            return this.text.charAt(i5);
        }
        int length = gapBuffer.length();
        int i6 = this.bufStart;
        if (i5 < length + i6) {
            return gapBuffer.get(i5 - i6);
        }
        return this.text.charAt(i5 - ((length - this.bufEnd) + i6));
    }

    public final int getLength() {
        GapBuffer gapBuffer = this.buffer;
        if (gapBuffer == null) {
            return this.text.length();
        }
        return (this.text.length() - (this.bufEnd - this.bufStart)) + gapBuffer.length();
    }

    @l
    public final String getText() {
        return this.text;
    }

    public final void replace(int i5, int i6, @l String str) {
        boolean z4;
        boolean z5 = true;
        if (i5 <= i6) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (i5 < 0) {
                z5 = false;
            }
            if (z5) {
                GapBuffer gapBuffer = this.buffer;
                if (gapBuffer == null) {
                    int max = Math.max(255, str.length() + 128);
                    char[] cArr = new char[max];
                    int min = Math.min(i5, 64);
                    int min2 = Math.min(this.text.length() - i6, 64);
                    int i7 = i5 - min;
                    GapBuffer_jvmKt.toCharArray(this.text, cArr, 0, i7, i5);
                    int i8 = max - min2;
                    int i9 = min2 + i6;
                    GapBuffer_jvmKt.toCharArray(this.text, cArr, i8, i6, i9);
                    GapBufferKt.toCharArray(str, cArr, min);
                    this.buffer = new GapBuffer(cArr, min + str.length(), i8);
                    this.bufStart = i7;
                    this.bufEnd = i9;
                    return;
                }
                int i10 = this.bufStart;
                int i11 = i5 - i10;
                int i12 = i6 - i10;
                if (i11 >= 0 && i12 <= gapBuffer.length()) {
                    gapBuffer.replace(i11, i12, str);
                    return;
                }
                this.text = toString();
                this.buffer = null;
                this.bufStart = -1;
                this.bufEnd = -1;
                replace(i5, i6, str);
                return;
            }
            throw new IllegalArgumentException(("start must be non-negative, but was " + i5).toString());
        }
        throw new IllegalArgumentException(("start index must be less than or equal to end index: " + i5 + " > " + i6).toString());
    }

    public final void setText(@l String str) {
        this.text = str;
    }

    @l
    public String toString() {
        GapBuffer gapBuffer = this.buffer;
        if (gapBuffer == null) {
            return this.text;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) this.text, 0, this.bufStart);
        gapBuffer.append(sb);
        String str = this.text;
        sb.append((CharSequence) str, this.bufEnd, str.length());
        return sb.toString();
    }
}
