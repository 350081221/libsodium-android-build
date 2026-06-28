package androidx.compose.foundation.text2.input.internal;

import com.tendcloud.tenddata.cq;
import kotlin.collections.o;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

@i0(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\f\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010 \u001a\u00020\u001b\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\u0006\u0010\"\u001a\u00020\u0002¢\u0006\u0004\b#\u0010$J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0002J\u0011\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0086\u0002J2\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u0002J\u0012\u0010\u0015\u001a\u00020\u00052\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013J\u0006\u0010\u0016\u001a\u00020\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0016R\u0016\u0010\u0019\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001a¨\u0006%"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/GapBuffer;", "", "", "gapLength", "requestSize", "Lkotlin/r2;", "makeSureAvailableSpace", "start", "end", "delete", "index", "", "get", "", "text", "textStart", "textEnd", "replace", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "append", cq.a.LENGTH, "", "toString", "capacity", "I", "", "buffer", "[C", "gapStart", "gapEnd", "initBuffer", "initGapStart", "initGapEnd", "<init>", "([CII)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nGapBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GapBuffer.kt\nandroidx/compose/foundation/text2/input/internal/GapBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,334:1\n1#2:335\n*E\n"})
/* loaded from: classes.dex */
final class GapBuffer {

    @l
    private char[] buffer;
    private int capacity;
    private int gapEnd;
    private int gapStart;

    public GapBuffer(@l char[] cArr, int i5, int i6) {
        this.capacity = cArr.length;
        this.buffer = cArr;
        this.gapStart = i5;
        this.gapEnd = i6;
    }

    private final void delete(int i5, int i6) {
        int i7 = this.gapStart;
        if (i5 < i7 && i6 <= i7) {
            int i8 = i7 - i6;
            char[] cArr = this.buffer;
            o.w0(cArr, cArr, this.gapEnd - i8, i6, i7);
            this.gapStart = i5;
            this.gapEnd -= i8;
            return;
        }
        if (i5 < i7 && i6 >= i7) {
            this.gapEnd = i6 + gapLength();
            this.gapStart = i5;
            return;
        }
        int gapLength = i5 + gapLength();
        int gapLength2 = i6 + gapLength();
        int i9 = this.gapEnd;
        int i10 = gapLength - i9;
        char[] cArr2 = this.buffer;
        o.w0(cArr2, cArr2, this.gapStart, i9, gapLength);
        this.gapStart += i10;
        this.gapEnd = gapLength2;
    }

    private final int gapLength() {
        return this.gapEnd - this.gapStart;
    }

    private final void makeSureAvailableSpace(int i5) {
        if (i5 <= gapLength()) {
            return;
        }
        int gapLength = i5 - gapLength();
        int i6 = this.capacity;
        do {
            i6 *= 2;
        } while (i6 - this.capacity < gapLength);
        char[] cArr = new char[i6];
        o.w0(this.buffer, cArr, 0, 0, this.gapStart);
        int i7 = this.capacity;
        int i8 = this.gapEnd;
        int i9 = i7 - i8;
        int i10 = i6 - i9;
        o.w0(this.buffer, cArr, i10, i8, i9 + i8);
        this.buffer = cArr;
        this.capacity = i6;
        this.gapEnd = i10;
    }

    public static /* synthetic */ void replace$default(GapBuffer gapBuffer, int i5, int i6, CharSequence charSequence, int i7, int i8, int i9, Object obj) {
        if ((i9 & 8) != 0) {
            i7 = 0;
        }
        int i10 = i7;
        if ((i9 & 16) != 0) {
            i8 = charSequence.length();
        }
        gapBuffer.replace(i5, i6, charSequence, i10, i8);
    }

    public final void append(@l StringBuilder sb) {
        sb.append(this.buffer, 0, this.gapStart);
        char[] cArr = this.buffer;
        int i5 = this.gapEnd;
        sb.append(cArr, i5, this.capacity - i5);
    }

    public final char get(int i5) {
        int i6 = this.gapStart;
        if (i5 < i6) {
            return this.buffer[i5];
        }
        return this.buffer[(i5 - i6) + this.gapEnd];
    }

    public final int length() {
        return this.capacity - gapLength();
    }

    public final void replace(int i5, int i6, @l CharSequence charSequence, int i7, int i8) {
        int i9 = i8 - i7;
        makeSureAvailableSpace(i9 - (i6 - i5));
        delete(i5, i6);
        ToCharArray_androidKt.toCharArray(charSequence, this.buffer, this.gapStart, i7, i8);
        this.gapStart += i9;
    }

    @l
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) sb);
        return sb.toString();
    }
}
