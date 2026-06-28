package androidx.compose.ui.text.input;

import com.tendcloud.tenddata.cq;
import kotlin.collections.o;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

@i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0019\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u001d\u001a\u00020\u0018\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0002J\u0011\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0086\u0002J\u001e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rJ\u0012\u0010\u0013\u001a\u00020\u00052\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011J\u0006\u0010\u0014\u001a\u00020\u0002J\b\u0010\u0015\u001a\u00020\rH\u0016R\u0016\u0010\u0016\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0017¨\u0006\""}, d2 = {"Landroidx/compose/ui/text/input/GapBuffer;", "", "", "gapLength", "requestSize", "Lkotlin/r2;", "makeSureAvailableSpace", "start", "end", "delete", "index", "", "get", "", "text", "replace", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "append", cq.a.LENGTH, "toString", "capacity", "I", "", "buffer", "[C", "gapStart", "gapEnd", "initBuffer", "initGapStart", "initGapEnd", "<init>", "([CII)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nGapBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GapBuffer.kt\nandroidx/compose/ui/text/input/GapBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,337:1\n1#2:338\n*E\n"})
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

    public final void replace(int i5, int i6, @l String str) {
        makeSureAvailableSpace(str.length() - (i6 - i5));
        delete(i5, i6);
        GapBufferKt.toCharArray(str, this.buffer, this.gapStart);
        this.gapStart += str.length();
    }

    @l
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) sb);
        return sb.toString();
    }
}
