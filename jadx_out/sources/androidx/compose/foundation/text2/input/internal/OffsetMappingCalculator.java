package androidx.compose.foundation.text2.input.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001f\u0010 J%\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ=\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002J\u001b\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0016R\u001c\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;", "", "", TypedValues.CycleType.S_WAVE_OFFSET, "", "fromSource", "Landroidx/compose/ui/text/TextRange;", "map-fzxv0v0", "(IZ)J", "map", "opOffset", "untransformedLen", "transformedLen", "mapStep-C6u-MEY", "(IIIIZ)J", "mapStep", "sourceStart", "sourceEnd", "newLength", "Lkotlin/r2;", "recordEditOperation", "mapFromSource--jx7JFs", "(I)J", "mapFromSource", "mapFromDest--jx7JFs", "mapFromDest", "Landroidx/compose/foundation/text2/input/internal/OpArray;", "ops", "[I", "opsSize", "I", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nOffsetMappingCalculator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OffsetMappingCalculator.kt\nandroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 OffsetMappingCalculator.kt\nandroidx/compose/foundation/text2/input/internal/OpArray\n*L\n1#1,416:1\n1#2:417\n390#3,21:418\n*S KotlinDebug\n*F\n+ 1 OffsetMappingCalculator.kt\nandroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator\n*L\n298#1:418,21\n*E\n"})
/* loaded from: classes.dex */
public final class OffsetMappingCalculator {
    public static final int $stable = 8;

    @l
    private int[] ops = OpArray.m1102constructorimpl(10);
    private int opsSize;

    /* renamed from: map-fzxv0v0, reason: not valid java name */
    private final long m1097mapfzxv0v0(int i5, boolean z4) {
        int i6;
        int[] iArr = this.ops;
        int i7 = this.opsSize;
        boolean z5 = !z4;
        if (i7 >= 0) {
            if (z5) {
                int i8 = i7 - 1;
                int i9 = i5;
                while (-1 < i8) {
                    int i10 = i8 * 3;
                    int i11 = iArr[i10];
                    int i12 = iArr[i10 + 1];
                    int i13 = iArr[i10 + 2];
                    long m1098mapStepC6uMEY = m1098mapStepC6uMEY(i9, i11, i12, i13, z4);
                    long m1098mapStepC6uMEY2 = m1098mapStepC6uMEY(i5, i11, i12, i13, z4);
                    i8--;
                    i9 = Math.min(TextRange.m5545getStartimpl(m1098mapStepC6uMEY), TextRange.m5545getStartimpl(m1098mapStepC6uMEY2));
                    i5 = Math.max(TextRange.m5540getEndimpl(m1098mapStepC6uMEY), TextRange.m5540getEndimpl(m1098mapStepC6uMEY2));
                }
                i6 = i5;
                i5 = i9;
            } else {
                int i14 = 0;
                int i15 = i5;
                while (i14 < i7) {
                    int i16 = i14 * 3;
                    int i17 = iArr[i16];
                    int i18 = iArr[i16 + 1];
                    int i19 = iArr[i16 + 2];
                    long m1098mapStepC6uMEY3 = m1098mapStepC6uMEY(i15, i17, i18, i19, z4);
                    long m1098mapStepC6uMEY4 = m1098mapStepC6uMEY(i5, i17, i18, i19, z4);
                    i14++;
                    i15 = Math.min(TextRange.m5545getStartimpl(m1098mapStepC6uMEY3), TextRange.m5545getStartimpl(m1098mapStepC6uMEY4));
                    i5 = Math.max(TextRange.m5540getEndimpl(m1098mapStepC6uMEY3), TextRange.m5540getEndimpl(m1098mapStepC6uMEY4));
                }
                i6 = i5;
                i5 = i15;
            }
        } else {
            i6 = i5;
        }
        return TextRangeKt.TextRange(i5, i6);
    }

    /* renamed from: mapStep-C6u-MEY, reason: not valid java name */
    private final long m1098mapStepC6uMEY(int i5, int i6, int i7, int i8, boolean z4) {
        int i9;
        if (z4) {
            i9 = i7;
        } else {
            i9 = i8;
        }
        if (z4) {
            i7 = i8;
        }
        if (i5 < i6) {
            return TextRangeKt.TextRange(i5);
        }
        if (i5 == i6) {
            if (i9 == 0) {
                return TextRangeKt.TextRange(i6, i7 + i6);
            }
            return TextRangeKt.TextRange(i6);
        }
        if (i5 < i6 + i9) {
            if (i7 == 0) {
                return TextRangeKt.TextRange(i6);
            }
            return TextRangeKt.TextRange(i6, i7 + i6);
        }
        return TextRangeKt.TextRange((i5 - i9) + i7);
    }

    /* renamed from: mapFromDest--jx7JFs, reason: not valid java name */
    public final long m1099mapFromDestjx7JFs(int i5) {
        return m1097mapfzxv0v0(i5, false);
    }

    /* renamed from: mapFromSource--jx7JFs, reason: not valid java name */
    public final long m1100mapFromSourcejx7JFs(int i5) {
        return m1097mapfzxv0v0(i5, true);
    }

    public final void recordEditOperation(int i5, int i6, int i7) {
        boolean z4;
        if (i7 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            int min = Math.min(i5, i6);
            int max = Math.max(min, i6) - min;
            if (max < 2 && max == i7) {
                return;
            }
            int i8 = this.opsSize + 1;
            if (i8 > OpArray.m1109getSizeimpl(this.ops)) {
                this.ops = OpArray.m1104copyOfS4kM8k(this.ops, Math.max(i8 * 2, OpArray.m1109getSizeimpl(this.ops) * 2));
            }
            OpArray.m1111setimpl(this.ops, this.opsSize, min, max, i7);
            this.opsSize = i8;
            return;
        }
        throw new IllegalArgumentException(("Expected newLen to be ≥ 0, was " + i7).toString());
    }
}
