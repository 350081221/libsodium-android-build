package androidx.compose.ui.text.android;

import android.text.Layout;
import androidx.annotation.IntRange;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.w;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.text.f0;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0018\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\f\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001*B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0015\u001a\u00020\rJ\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u001e\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001aJ\u000e\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\rJ\u0010\u0010 \u001a\u00020\r2\b\b\u0001\u0010\u0015\u001a\u00020\rJ\u001a\u0010!\u001a\u00020\r2\b\b\u0001\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u001d\u001a\u00020\u001aJ\u0010\u0010\"\u001a\u00020\r2\b\b\u0001\u0010\u0015\u001a\u00020\rJ\u000e\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020%J\u0010\u0010&\u001a\u00020\u001a2\b\b\u0001\u0010\u0015\u001a\u00020\rJ\u0018\u0010'\u001a\u00020\r2\u0006\u0010(\u001a\u00020\r2\u0006\u0010)\u001a\u00020\rH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Landroidx/compose/ui/text/android/LayoutHelper;", "", "layout", "Landroid/text/Layout;", "(Landroid/text/Layout;)V", "bidiProcessedParagraphs", "", "getLayout", "()Landroid/text/Layout;", "paragraphBidi", "", "Ljava/text/Bidi;", "paragraphCount", "", "getParagraphCount", "()I", "paragraphEnds", "", "tmpBuffer", "", "analyzeBidi", "paragraphIndex", "getDownstreamHorizontal", "", TypedValues.CycleType.S_WAVE_OFFSET, "primary", "", "getHorizontalPosition", "usePrimaryDirection", "upstream", "getLineVisibleEnd", "lineIndex", "getParagraphEnd", "getParagraphForOffset", "getParagraphStart", "isLineEndSpace", "c", "", "isRtlParagraph", "lineEndToVisibleEnd", "lineEnd", "lineStart", "BidiRun", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLayoutHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutHelper.kt\nandroidx/compose/ui/text/android/LayoutHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,401:1\n1#2:402\n1627#3,6:403\n1627#3,6:409\n*S KotlinDebug\n*F\n+ 1 LayoutHelper.kt\nandroidx/compose/ui/text/android/LayoutHelper\n*L\n281#1:403,6\n320#1:409,6\n*E\n"})
/* loaded from: classes.dex */
public final class LayoutHelper {
    public static final int $stable = 8;

    @p4.l
    private final boolean[] bidiProcessedParagraphs;

    @p4.l
    private final Layout layout;

    @p4.l
    private final List<Bidi> paragraphBidi;
    private final int paragraphCount;

    @p4.l
    private final List<Integer> paragraphEnds;

    @p4.m
    private char[] tmpBuffer;

    @i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/text/android/LayoutHelper$BidiRun;", "", "start", "", "end", "isRtl", "", "(IIZ)V", "getEnd", "()I", "()Z", "getStart", "component1", "component2", "component3", "copy", "equals", "other", TTDownloadField.TT_HASHCODE, "toString", "", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    private static final class BidiRun {
        private final int end;
        private final boolean isRtl;
        private final int start;

        public BidiRun(int i5, int i6, boolean z4) {
            this.start = i5;
            this.end = i6;
            this.isRtl = z4;
        }

        public static /* synthetic */ BidiRun copy$default(BidiRun bidiRun, int i5, int i6, boolean z4, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                i5 = bidiRun.start;
            }
            if ((i7 & 2) != 0) {
                i6 = bidiRun.end;
            }
            if ((i7 & 4) != 0) {
                z4 = bidiRun.isRtl;
            }
            return bidiRun.copy(i5, i6, z4);
        }

        public final int component1() {
            return this.start;
        }

        public final int component2() {
            return this.end;
        }

        public final boolean component3() {
            return this.isRtl;
        }

        @p4.l
        public final BidiRun copy(int i5, int i6, boolean z4) {
            return new BidiRun(i5, i6, z4);
        }

        public boolean equals(@p4.m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BidiRun)) {
                return false;
            }
            BidiRun bidiRun = (BidiRun) obj;
            return this.start == bidiRun.start && this.end == bidiRun.end && this.isRtl == bidiRun.isRtl;
        }

        public final int getEnd() {
            return this.end;
        }

        public final int getStart() {
            return this.start;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.start) * 31) + Integer.hashCode(this.end)) * 31) + Boolean.hashCode(this.isRtl);
        }

        public final boolean isRtl() {
            return this.isRtl;
        }

        @p4.l
        public String toString() {
            return "BidiRun(start=" + this.start + ", end=" + this.end + ", isRtl=" + this.isRtl + ')';
        }
    }

    public LayoutHelper(@p4.l Layout layout) {
        int o32;
        int i5;
        this.layout = layout;
        ArrayList arrayList = new ArrayList();
        int i6 = 0;
        do {
            o32 = f0.o3(this.layout.getText(), '\n', i6, false, 4, null);
            if (o32 < 0) {
                i5 = this.layout.getText().length();
            } else {
                i5 = o32 + 1;
            }
            i6 = i5;
            arrayList.add(Integer.valueOf(i6));
        } while (i6 < this.layout.getText().length());
        this.paragraphEnds = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i7 = 0; i7 < size; i7++) {
            arrayList2.add(null);
        }
        this.paragraphBidi = arrayList2;
        this.bidiProcessedParagraphs = new boolean[this.paragraphEnds.size()];
        this.paragraphCount = this.paragraphEnds.size();
    }

    private final float getDownstreamHorizontal(int i5, boolean z4) {
        int B;
        B = kotlin.ranges.u.B(i5, this.layout.getLineEnd(this.layout.getLineForOffset(i5)));
        if (z4) {
            return this.layout.getPrimaryHorizontal(B);
        }
        return this.layout.getSecondaryHorizontal(B);
    }

    public static /* synthetic */ int getParagraphForOffset$default(LayoutHelper layoutHelper, int i5, boolean z4, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            z4 = false;
        }
        return layoutHelper.getParagraphForOffset(i5, z4);
    }

    private final int lineEndToVisibleEnd(int i5, int i6) {
        while (i5 > i6 && isLineEndSpace(this.layout.getText().charAt(i5 - 1))) {
            i5--;
        }
        return i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        if (r0.getRunCount() == 1) goto L19;
     */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.text.Bidi analyzeBidi(int r12) {
        /*
            r11 = this;
            boolean[] r0 = r11.bidiProcessedParagraphs
            boolean r0 = r0[r12]
            if (r0 == 0) goto Lf
            java.util.List<java.text.Bidi> r0 = r11.paragraphBidi
            java.lang.Object r12 = r0.get(r12)
            java.text.Bidi r12 = (java.text.Bidi) r12
            return r12
        Lf:
            r0 = 0
            if (r12 != 0) goto L14
            r1 = r0
            goto L22
        L14:
            java.util.List<java.lang.Integer> r1 = r11.paragraphEnds
            int r2 = r12 + (-1)
            java.lang.Object r1 = r1.get(r2)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
        L22:
            java.util.List<java.lang.Integer> r2 = r11.paragraphEnds
            java.lang.Object r2 = r2.get(r12)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            int r8 = r2 - r1
            char[] r3 = r11.tmpBuffer
            if (r3 == 0) goto L37
            int r4 = r3.length
            if (r4 >= r8) goto L39
        L37:
            char[] r3 = new char[r8]
        L39:
            r10 = r3
            android.text.Layout r3 = r11.layout
            java.lang.CharSequence r3 = r3.getText()
            android.text.TextUtils.getChars(r3, r1, r2, r10, r0)
            boolean r0 = java.text.Bidi.requiresBidi(r10, r0, r8)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L5f
            boolean r9 = r11.isRtlParagraph(r12)
            java.text.Bidi r0 = new java.text.Bidi
            r5 = 0
            r6 = 0
            r7 = 0
            r3 = r0
            r4 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9)
            int r3 = r0.getRunCount()
            if (r3 != r2) goto L60
        L5f:
            r0 = r1
        L60:
            java.util.List<java.text.Bidi> r3 = r11.paragraphBidi
            r3.set(r12, r0)
            boolean[] r3 = r11.bidiProcessedParagraphs
            r3[r12] = r2
            if (r0 == 0) goto L72
            char[] r12 = r11.tmpBuffer
            if (r10 != r12) goto L71
            r10 = r1
            goto L72
        L71:
            r10 = r12
        L72:
            r11.tmpBuffer = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.android.LayoutHelper.analyzeBidi(int):java.text.Bidi");
    }

    public final float getHorizontalPosition(int i5, boolean z4, boolean z5) {
        Bidi bidi;
        int we;
        boolean z6;
        int we2;
        boolean z7;
        boolean z8;
        int i6 = i5;
        if (!z5) {
            return getDownstreamHorizontal(i5, z4);
        }
        int lineForOffset = LayoutCompatKt.getLineForOffset(this.layout, i6, z5);
        int lineStart = this.layout.getLineStart(lineForOffset);
        int lineEnd = this.layout.getLineEnd(lineForOffset);
        if (i6 != lineStart && i6 != lineEnd) {
            return getDownstreamHorizontal(i5, z4);
        }
        if (i6 != 0 && i6 != this.layout.getText().length()) {
            int paragraphForOffset = getParagraphForOffset(i6, z5);
            boolean isRtlParagraph = isRtlParagraph(paragraphForOffset);
            int lineEndToVisibleEnd = lineEndToVisibleEnd(lineEnd, lineStart);
            int paragraphStart = getParagraphStart(paragraphForOffset);
            int i7 = lineStart - paragraphStart;
            int i8 = lineEndToVisibleEnd - paragraphStart;
            Bidi analyzeBidi = analyzeBidi(paragraphForOffset);
            if (analyzeBidi != null) {
                bidi = analyzeBidi.createLineBidi(i7, i8);
            } else {
                bidi = null;
            }
            boolean z9 = false;
            if (bidi != null && bidi.getRunCount() != 1) {
                int runCount = bidi.getRunCount();
                BidiRun[] bidiRunArr = new BidiRun[runCount];
                for (int i9 = 0; i9 < runCount; i9++) {
                    int runStart = bidi.getRunStart(i9) + lineStart;
                    int runLimit = bidi.getRunLimit(i9) + lineStart;
                    if (bidi.getRunLevel(i9) % 2 == 1) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    bidiRunArr[i9] = new BidiRun(runStart, runLimit, z8);
                }
                int runCount2 = bidi.getRunCount();
                byte[] bArr = new byte[runCount2];
                for (int i10 = 0; i10 < runCount2; i10++) {
                    bArr[i10] = (byte) bidi.getRunLevel(i10);
                }
                Bidi.reorderVisually(bArr, 0, bidiRunArr, 0, runCount);
                int i11 = -1;
                if (i6 == lineStart) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= runCount) {
                            break;
                        }
                        if (bidiRunArr[i12].getStart() == i6) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (z7) {
                            i11 = i12;
                            break;
                        }
                        i12++;
                    }
                    BidiRun bidiRun = bidiRunArr[i11];
                    if (z4 || isRtlParagraph == bidiRun.isRtl()) {
                        if (!isRtlParagraph) {
                            isRtlParagraph = true;
                        } else {
                            isRtlParagraph = false;
                        }
                    }
                    if (i11 == 0 && isRtlParagraph) {
                        return this.layout.getLineLeft(lineForOffset);
                    }
                    we2 = kotlin.collections.p.we(bidiRunArr);
                    if (i11 == we2 && !isRtlParagraph) {
                        return this.layout.getLineRight(lineForOffset);
                    }
                    if (isRtlParagraph) {
                        return this.layout.getPrimaryHorizontal(bidiRunArr[i11 - 1].getStart());
                    }
                    return this.layout.getPrimaryHorizontal(bidiRunArr[i11 + 1].getStart());
                }
                if (i6 > lineEndToVisibleEnd) {
                    i6 = lineEndToVisibleEnd(i6, lineStart);
                }
                int i13 = 0;
                while (true) {
                    if (i13 >= runCount) {
                        break;
                    }
                    if (bidiRunArr[i13].getEnd() == i6) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (z6) {
                        i11 = i13;
                        break;
                    }
                    i13++;
                }
                BidiRun bidiRun2 = bidiRunArr[i11];
                if (!z4 && isRtlParagraph != bidiRun2.isRtl()) {
                    isRtlParagraph = !isRtlParagraph;
                }
                if (i11 == 0 && isRtlParagraph) {
                    return this.layout.getLineLeft(lineForOffset);
                }
                we = kotlin.collections.p.we(bidiRunArr);
                if (i11 == we && !isRtlParagraph) {
                    return this.layout.getLineRight(lineForOffset);
                }
                if (isRtlParagraph) {
                    return this.layout.getPrimaryHorizontal(bidiRunArr[i11 - 1].getEnd());
                }
                return this.layout.getPrimaryHorizontal(bidiRunArr[i11 + 1].getEnd());
            }
            boolean isRtlCharAt = this.layout.isRtlCharAt(lineStart);
            if (z4 || isRtlParagraph == isRtlCharAt) {
                if (!isRtlParagraph) {
                    isRtlParagraph = true;
                } else {
                    isRtlParagraph = false;
                }
            }
            if (i6 == lineStart) {
                z9 = isRtlParagraph;
            } else if (!isRtlParagraph) {
                z9 = true;
            }
            Layout layout = this.layout;
            if (z9) {
                return layout.getLineLeft(lineForOffset);
            }
            return layout.getLineRight(lineForOffset);
        }
        return getDownstreamHorizontal(i5, z4);
    }

    @p4.l
    public final Layout getLayout() {
        return this.layout;
    }

    public final int getLineVisibleEnd(int i5) {
        return lineEndToVisibleEnd(this.layout.getLineEnd(i5), this.layout.getLineStart(i5));
    }

    public final int getParagraphCount() {
        return this.paragraphCount;
    }

    public final int getParagraphEnd(@IntRange(from = 0) int i5) {
        return this.paragraphEnds.get(i5).intValue();
    }

    public final int getParagraphForOffset(@IntRange(from = 0) int i5, boolean z4) {
        int x4;
        int i6;
        x4 = w.x(this.paragraphEnds, Integer.valueOf(i5), 0, 0, 6, null);
        if (x4 < 0) {
            i6 = -(x4 + 1);
        } else {
            i6 = x4 + 1;
        }
        if (z4 && i6 > 0) {
            int i7 = i6 - 1;
            if (i5 == this.paragraphEnds.get(i7).intValue()) {
                return i7;
            }
        }
        return i6;
    }

    public final int getParagraphStart(@IntRange(from = 0) int i5) {
        if (i5 == 0) {
            return 0;
        }
        return this.paragraphEnds.get(i5 - 1).intValue();
    }

    public final boolean isLineEndSpace(char c5) {
        return c5 == ' ' || c5 == '\n' || c5 == 5760 || (l0.t(c5, 8192) >= 0 && l0.t(c5, 8202) <= 0 && c5 != 8199) || c5 == 8287 || c5 == 12288;
    }

    public final boolean isRtlParagraph(@IntRange(from = 0) int i5) {
        if (this.layout.getParagraphDirection(this.layout.getLineForOffset(getParagraphStart(i5))) == -1) {
            return true;
        }
        return false;
    }
}
