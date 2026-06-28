package androidx.compose.foundation.text2.input.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tendcloud.tenddata.cq;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001!B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u001f\u0010 J2\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002J\u0011\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002J\u0018\u0010\u000f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u000e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0001R\u0016\u0010\u0005\u001a\u00020\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\""}, d2 = {"Landroidx/compose/foundation/text2/input/internal/PartialGapBuffer;", "", "", "start", "end", "text", "textStart", "textEnd", "Lkotlin/r2;", "replace", "index", "", "get", "startIndex", "endIndex", "subSequence", "", "toString", "other", "", "contentEquals", "Ljava/lang/CharSequence;", "Landroidx/compose/foundation/text2/input/internal/GapBuffer;", "buffer", "Landroidx/compose/foundation/text2/input/internal/GapBuffer;", "bufStart", "I", "bufEnd", "getLength", "()I", cq.a.LENGTH, "<init>", "(Ljava/lang/CharSequence;)V", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nGapBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GapBuffer.kt\nandroidx/compose/foundation/text2/input/internal/PartialGapBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,334:1\n1#2:335\n*E\n"})
/* loaded from: classes.dex */
public final class PartialGapBuffer implements CharSequence {
    public static final int BUF_SIZE = 255;
    public static final int NOWHERE = -1;
    public static final int SURROUNDING_SIZE = 64;

    @m
    private GapBuffer buffer;

    @l
    private CharSequence text;

    @l
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private int bufStart = -1;
    private int bufEnd = -1;

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/PartialGapBuffer$Companion;", "", "()V", "BUF_SIZE", "", "NOWHERE", "SURROUNDING_SIZE", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }
    }

    public PartialGapBuffer(@l CharSequence charSequence) {
        this.text = charSequence;
    }

    public static /* synthetic */ void replace$default(PartialGapBuffer partialGapBuffer, int i5, int i6, CharSequence charSequence, int i7, int i8, int i9, Object obj) {
        if ((i9 & 8) != 0) {
            i7 = 0;
        }
        int i10 = i7;
        if ((i9 & 16) != 0) {
            i8 = charSequence.length();
        }
        partialGapBuffer.replace(i5, i6, charSequence, i10, i8);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i5) {
        return get(i5);
    }

    public final boolean contentEquals(@l CharSequence charSequence) {
        return l0.g(toString(), charSequence.toString());
    }

    public char get(int i5) {
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

    public int getLength() {
        GapBuffer gapBuffer = this.buffer;
        if (gapBuffer == null) {
            return this.text.length();
        }
        return (this.text.length() - (this.bufEnd - this.bufStart)) + gapBuffer.length();
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return getLength();
    }

    public final void replace(int i5, int i6, @l CharSequence charSequence, int i7, int i8) {
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7 = true;
        if (i5 <= i6) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (i7 <= i8) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                if (i5 >= 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z6) {
                    if (i7 < 0) {
                        z7 = false;
                    }
                    if (z7) {
                        GapBuffer gapBuffer = this.buffer;
                        int i9 = i8 - i7;
                        if (gapBuffer == null) {
                            int max = Math.max(255, i9 + 128);
                            char[] cArr = new char[max];
                            int min = Math.min(i5, 64);
                            int min2 = Math.min(this.text.length() - i6, 64);
                            int i10 = i5 - min;
                            ToCharArray_androidKt.toCharArray(this.text, cArr, 0, i10, i5);
                            int i11 = max - min2;
                            int i12 = min2 + i6;
                            ToCharArray_androidKt.toCharArray(this.text, cArr, i11, i6, i12);
                            ToCharArray_androidKt.toCharArray(charSequence, cArr, min, i7, i8);
                            this.buffer = new GapBuffer(cArr, min + i9, i11);
                            this.bufStart = i10;
                            this.bufEnd = i12;
                            return;
                        }
                        int i13 = this.bufStart;
                        int i14 = i5 - i13;
                        int i15 = i6 - i13;
                        if (i14 >= 0 && i15 <= gapBuffer.length()) {
                            gapBuffer.replace(i14, i15, charSequence, i7, i8);
                            return;
                        }
                        this.text = toString();
                        this.buffer = null;
                        this.bufStart = -1;
                        this.bufEnd = -1;
                        replace(i5, i6, charSequence, i7, i8);
                        return;
                    }
                    throw new IllegalArgumentException(("textStart must be non-negative, but was " + i7).toString());
                }
                throw new IllegalArgumentException(("start must be non-negative, but was " + i5).toString());
            }
            throw new IllegalArgumentException(("textStart=" + i7 + " > textEnd=" + i8).toString());
        }
        throw new IllegalArgumentException(("start=" + i5 + " > end=" + i6).toString());
    }

    @Override // java.lang.CharSequence
    @l
    public CharSequence subSequence(int i5, int i6) {
        return toString().subSequence(i5, i6);
    }

    @Override // java.lang.CharSequence
    @l
    public String toString() {
        GapBuffer gapBuffer = this.buffer;
        if (gapBuffer == null) {
            return this.text.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.text, 0, this.bufStart);
        gapBuffer.append(sb);
        CharSequence charSequence = this.text;
        sb.append(charSequence, this.bufEnd, charSequence.length());
        return sb.toString();
    }
}
