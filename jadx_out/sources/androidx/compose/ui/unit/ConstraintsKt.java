package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.i0;
import kotlin.ranges.u;
import t0.b;

@i0(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\u001a5\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0007\u001a\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0002\u001a\u001c\u0010\u000b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\f\u001a\u00020\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001e\u0010\u000b\u001a\u00020\u000f*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000e\u001a\u001e\u0010\u0012\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001e\u0010\u0016\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0015\u001a\u001e\u0010\u0019\u001a\u00020\u001a*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a*\u0010\u001d\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010!\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {androidx.constraintlayout.widget.Constraints.TAG, "Landroidx/compose/ui/unit/Constraints;", "minWidth", "", "maxWidth", "minHeight", "maxHeight", "(IIII)J", "addMaxWithMinimum", "max", b.f22420d, "constrain", "otherConstraints", "constrain-N9IONVI", "(JJ)J", "Landroidx/compose/ui/unit/IntSize;", "size", "constrain-4WqzIAM", "constrainHeight", "height", "constrainHeight-K40F9xA", "(JI)I", "constrainWidth", "width", "constrainWidth-K40F9xA", "isSatisfiedBy", "", "isSatisfiedBy-4WqzIAM", "(JJ)Z", TypedValues.CycleType.S_WAVE_OFFSET, "horizontal", "vertical", "offset-NN6Ew-U", "(JII)J", "ui-unit_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ConstraintsKt {
    @Stable
    public static final long Constraints(int i5, int i6, int i7, int i8) {
        boolean z4;
        boolean z5;
        boolean z6 = true;
        if (i6 >= i5) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (i8 >= i7) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                if (i5 < 0 || i7 < 0) {
                    z6 = false;
                }
                if (z6) {
                    return Constraints.Companion.m6007createConstraintsZbe2FdA$ui_unit_release(i5, i6, i7, i8);
                }
                throw new IllegalArgumentException(("minWidth(" + i5 + ") and minHeight(" + i7 + ") must be >= 0").toString());
            }
            throw new IllegalArgumentException(("maxHeight(" + i8 + ") must be >= than minHeight(" + i7 + ')').toString());
        }
        throw new IllegalArgumentException(("maxWidth(" + i6 + ") must be >= than minWidth(" + i5 + ')').toString());
    }

    public static /* synthetic */ long Constraints$default(int i5, int i6, int i7, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i5 = 0;
        }
        if ((i9 & 2) != 0) {
            i6 = Integer.MAX_VALUE;
        }
        if ((i9 & 4) != 0) {
            i7 = 0;
        }
        if ((i9 & 8) != 0) {
            i8 = Integer.MAX_VALUE;
        }
        return Constraints(i5, i6, i7, i8);
    }

    private static final int addMaxWithMinimum(int i5, int i6) {
        int u4;
        if (i5 == Integer.MAX_VALUE) {
            return i5;
        }
        u4 = u.u(i5 + i6, 0);
        return u4;
    }

    @Stable
    /* renamed from: constrain-4WqzIAM, reason: not valid java name */
    public static final long m6011constrain4WqzIAM(long j5, long j6) {
        int I;
        int I2;
        I = u.I(IntSize.m6214getWidthimpl(j6), Constraints.m6002getMinWidthimpl(j5), Constraints.m6000getMaxWidthimpl(j5));
        I2 = u.I(IntSize.m6213getHeightimpl(j6), Constraints.m6001getMinHeightimpl(j5), Constraints.m5999getMaxHeightimpl(j5));
        return IntSizeKt.IntSize(I, I2);
    }

    /* renamed from: constrain-N9IONVI, reason: not valid java name */
    public static final long m6012constrainN9IONVI(long j5, long j6) {
        int I;
        int I2;
        int I3;
        int I4;
        I = u.I(Constraints.m6002getMinWidthimpl(j6), Constraints.m6002getMinWidthimpl(j5), Constraints.m6000getMaxWidthimpl(j5));
        I2 = u.I(Constraints.m6000getMaxWidthimpl(j6), Constraints.m6002getMinWidthimpl(j5), Constraints.m6000getMaxWidthimpl(j5));
        I3 = u.I(Constraints.m6001getMinHeightimpl(j6), Constraints.m6001getMinHeightimpl(j5), Constraints.m5999getMaxHeightimpl(j5));
        I4 = u.I(Constraints.m5999getMaxHeightimpl(j6), Constraints.m6001getMinHeightimpl(j5), Constraints.m5999getMaxHeightimpl(j5));
        return Constraints(I, I2, I3, I4);
    }

    @Stable
    /* renamed from: constrainHeight-K40F9xA, reason: not valid java name */
    public static final int m6013constrainHeightK40F9xA(long j5, int i5) {
        int I;
        I = u.I(i5, Constraints.m6001getMinHeightimpl(j5), Constraints.m5999getMaxHeightimpl(j5));
        return I;
    }

    @Stable
    /* renamed from: constrainWidth-K40F9xA, reason: not valid java name */
    public static final int m6014constrainWidthK40F9xA(long j5, int i5) {
        int I;
        I = u.I(i5, Constraints.m6002getMinWidthimpl(j5), Constraints.m6000getMaxWidthimpl(j5));
        return I;
    }

    @Stable
    /* renamed from: isSatisfiedBy-4WqzIAM, reason: not valid java name */
    public static final boolean m6015isSatisfiedBy4WqzIAM(long j5, long j6) {
        int m6002getMinWidthimpl = Constraints.m6002getMinWidthimpl(j5);
        int m6000getMaxWidthimpl = Constraints.m6000getMaxWidthimpl(j5);
        int m6214getWidthimpl = IntSize.m6214getWidthimpl(j6);
        if (m6002getMinWidthimpl <= m6214getWidthimpl && m6214getWidthimpl <= m6000getMaxWidthimpl) {
            int m6001getMinHeightimpl = Constraints.m6001getMinHeightimpl(j5);
            int m5999getMaxHeightimpl = Constraints.m5999getMaxHeightimpl(j5);
            int m6213getHeightimpl = IntSize.m6213getHeightimpl(j6);
            if (m6001getMinHeightimpl <= m6213getHeightimpl && m6213getHeightimpl <= m5999getMaxHeightimpl) {
                return true;
            }
        }
        return false;
    }

    @Stable
    /* renamed from: offset-NN6Ew-U, reason: not valid java name */
    public static final long m6016offsetNN6EwU(long j5, int i5, int i6) {
        int u4;
        int u5;
        u4 = u.u(Constraints.m6002getMinWidthimpl(j5) + i5, 0);
        int addMaxWithMinimum = addMaxWithMinimum(Constraints.m6000getMaxWidthimpl(j5), i5);
        u5 = u.u(Constraints.m6001getMinHeightimpl(j5) + i6, 0);
        return Constraints(u4, addMaxWithMinimum, u5, addMaxWithMinimum(Constraints.m5999getMaxHeightimpl(j5), i6));
    }

    /* renamed from: offset-NN6Ew-U$default, reason: not valid java name */
    public static /* synthetic */ long m6017offsetNN6EwU$default(long j5, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i5 = 0;
        }
        if ((i7 & 2) != 0) {
            i6 = 0;
        }
        return m6016offsetNN6EwU(j5, i5, i6);
    }
}
