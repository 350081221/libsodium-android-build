package androidx.compose.ui.node;

import kotlin.i0;
import p4.l;

@i0(d1 = {"\u00004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\u001a \u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0002\u001a \u0010\u000b\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0003H\u0000\u001aR\u0010\u0018\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001aZ\u0010\u0011\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001aZ\u0010\u0012\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001b\u001a8\u0010#\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u0013H\u0000\u001a\u001c\u0010&\u001a\u00020\t*\u00020\u00132\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0000H\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006'"}, d2 = {"", "oldSize", "newSize", "Landroidx/compose/ui/node/DiffCallback;", "cb", "Landroidx/compose/ui/node/IntStack;", "calculateDiff", "diagonals", "callback", "Lkotlin/r2;", "applyDiff", "executeDiff", "oldStart", "oldEnd", "newStart", "newEnd", "Landroidx/compose/ui/node/CenteredArray;", "forward", "backward", "", "snake", "", "midPoint-q5eDKzI", "(IIIILandroidx/compose/ui/node/DiffCallback;[I[I[I)Z", "midPoint", "d", "forward-4l5_RBY", "(IIIILandroidx/compose/ui/node/DiffCallback;[I[II[I)Z", "backward-4l5_RBY", "startX", "startY", "endX", "endY", "reverse", "data", "fillSnake", "i", "j", "swap", "ui_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class MyersDiffKt {
    public static final /* synthetic */ void access$swap(int[] iArr, int i5, int i6) {
        swap(iArr, i5, i6);
    }

    private static final void applyDiff(IntStack intStack, DiffCallback diffCallback) {
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i5 < intStack.getSize()) {
            int i8 = i5 + 2;
            int i9 = intStack.get(i5) - intStack.get(i8);
            int i10 = intStack.get(i5 + 1) - intStack.get(i8);
            int i11 = intStack.get(i8);
            i5 += 3;
            while (i6 < i9) {
                diffCallback.remove(i7, i6);
                i6++;
            }
            while (i7 < i10) {
                diffCallback.insert(i7);
                i7++;
            }
            while (true) {
                int i12 = i11 - 1;
                if (i11 > 0) {
                    diffCallback.same(i6, i7);
                    i6++;
                    i7++;
                    i11 = i12;
                }
            }
        }
    }

    /* renamed from: backward-4l5_RBY, reason: not valid java name */
    private static final boolean m5163backward4l5_RBY(int i5, int i6, int i7, int i8, DiffCallback diffCallback, int[] iArr, int[] iArr2, int i9, int[] iArr3) {
        boolean z4;
        int m5091getimpl;
        int i10;
        int i11;
        int i12;
        int i13 = (i6 - i5) - (i8 - i7);
        if (i13 % 2 == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        int i14 = -i9;
        for (int i15 = i14; i15 <= i9; i15 += 2) {
            if (i15 != i14 && (i15 == i9 || CenteredArray.m5091getimpl(iArr2, i15 + 1) >= CenteredArray.m5091getimpl(iArr2, i15 - 1))) {
                m5091getimpl = CenteredArray.m5091getimpl(iArr2, i15 - 1);
                i10 = m5091getimpl - 1;
            } else {
                m5091getimpl = CenteredArray.m5091getimpl(iArr2, i15 + 1);
                i10 = m5091getimpl;
            }
            int i16 = i8 - ((i6 - i10) - i15);
            if (i9 != 0 && i10 == m5091getimpl) {
                i11 = i16 + 1;
            } else {
                i11 = i16;
            }
            while (i10 > i5 && i16 > i7) {
                if (!diffCallback.areItemsTheSame(i10 - 1, i16 - 1)) {
                    break;
                }
                i10--;
                i16--;
            }
            CenteredArray.m5094setimpl(iArr2, i15, i10);
            if (z4 && (i12 = i13 - i15) >= i14 && i12 <= i9) {
                if (CenteredArray.m5091getimpl(iArr, i12) >= i10) {
                    fillSnake(i10, i16, m5091getimpl, i11, true, iArr3);
                    return true;
                }
            }
        }
        return false;
    }

    private static final IntStack calculateDiff(int i5, int i6, DiffCallback diffCallback) {
        int i7 = ((i5 + i6) + 1) / 2;
        IntStack intStack = new IntStack(i7 * 3);
        IntStack intStack2 = new IntStack(i7 * 4);
        intStack2.pushRange(0, i5, 0, i6);
        int i8 = (i7 * 2) + 1;
        int[] m5088constructorimpl = CenteredArray.m5088constructorimpl(new int[i8]);
        int[] m5088constructorimpl2 = CenteredArray.m5088constructorimpl(new int[i8]);
        int[] m5264constructorimpl = Snake.m5264constructorimpl(new int[5]);
        while (intStack2.isNotEmpty()) {
            int pop = intStack2.pop();
            int pop2 = intStack2.pop();
            int pop3 = intStack2.pop();
            int pop4 = intStack2.pop();
            int[] iArr = m5088constructorimpl;
            int[] iArr2 = m5088constructorimpl2;
            if (m5165midPointq5eDKzI(pop4, pop3, pop2, pop, diffCallback, m5088constructorimpl, m5088constructorimpl2, m5264constructorimpl)) {
                if (Snake.m5267getDiagonalSizeimpl(m5264constructorimpl) > 0) {
                    Snake.m5262addDiagonalToStackimpl(m5264constructorimpl, intStack);
                }
                intStack2.pushRange(pop4, Snake.m5272getStartXimpl(m5264constructorimpl), pop2, Snake.m5273getStartYimpl(m5264constructorimpl));
                intStack2.pushRange(Snake.m5268getEndXimpl(m5264constructorimpl), pop3, Snake.m5269getEndYimpl(m5264constructorimpl), pop);
            }
            m5088constructorimpl = iArr;
            m5088constructorimpl2 = iArr2;
        }
        intStack.sortDiagonals();
        intStack.pushDiagonal(i5, i6, 0);
        return intStack;
    }

    public static final void executeDiff(int i5, int i6, @l DiffCallback diffCallback) {
        applyDiff(calculateDiff(i5, i6, diffCallback), diffCallback);
    }

    public static final void fillSnake(int i5, int i6, int i7, int i8, boolean z4, @l int[] iArr) {
        iArr[0] = i5;
        iArr[1] = i6;
        iArr[2] = i7;
        iArr[3] = i8;
        iArr[4] = z4 ? 1 : 0;
    }

    /* renamed from: forward-4l5_RBY, reason: not valid java name */
    private static final boolean m5164forward4l5_RBY(int i5, int i6, int i7, int i8, DiffCallback diffCallback, int[] iArr, int[] iArr2, int i9, int[] iArr3) {
        boolean z4;
        int m5091getimpl;
        int i10;
        int i11;
        int i12 = (i6 - i5) - (i8 - i7);
        if (Math.abs(i12) % 2 == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        int i13 = -i9;
        for (int i14 = i13; i14 <= i9; i14 += 2) {
            if (i14 != i13 && (i14 == i9 || CenteredArray.m5091getimpl(iArr, i14 + 1) <= CenteredArray.m5091getimpl(iArr, i14 - 1))) {
                m5091getimpl = CenteredArray.m5091getimpl(iArr, i14 - 1);
                i10 = m5091getimpl + 1;
            } else {
                m5091getimpl = CenteredArray.m5091getimpl(iArr, i14 + 1);
                i10 = m5091getimpl;
            }
            int i15 = (i7 + (i10 - i5)) - i14;
            int i16 = (i9 != 0 && i10 == m5091getimpl) ? i15 - 1 : i15;
            while (i10 < i6 && i15 < i8) {
                if (!diffCallback.areItemsTheSame(i10, i15)) {
                    break;
                }
                i10++;
                i15++;
            }
            CenteredArray.m5094setimpl(iArr, i14, i10);
            if (z4 && (i11 = i12 - i14) >= i13 + 1 && i11 <= i9 - 1) {
                if (CenteredArray.m5091getimpl(iArr2, i11) <= i10) {
                    fillSnake(m5091getimpl, i16, i10, i15, false, iArr3);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: midPoint-q5eDKzI, reason: not valid java name */
    private static final boolean m5165midPointq5eDKzI(int i5, int i6, int i7, int i8, DiffCallback diffCallback, int[] iArr, int[] iArr2, int[] iArr3) {
        int i9 = i6 - i5;
        int i10 = i8 - i7;
        if (i9 >= 1 && i10 >= 1) {
            int i11 = ((i9 + i10) + 1) / 2;
            CenteredArray.m5094setimpl(iArr, 1, i5);
            CenteredArray.m5094setimpl(iArr2, 1, i6);
            int i12 = 0;
            while (i12 < i11) {
                int i13 = i12;
                if (m5164forward4l5_RBY(i5, i6, i7, i8, diffCallback, iArr, iArr2, i12, iArr3) || m5163backward4l5_RBY(i5, i6, i7, i8, diffCallback, iArr, iArr2, i13, iArr3)) {
                    return true;
                }
                i12 = i13 + 1;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void swap(int[] iArr, int i5, int i6) {
        int i7 = iArr[i5];
        iArr[i5] = iArr[i6];
        iArr[i6] = i7;
    }
}
