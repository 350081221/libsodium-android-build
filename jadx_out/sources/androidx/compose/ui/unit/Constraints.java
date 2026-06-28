package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.a1;
import kotlin.i0;
import kotlin.jvm.internal.w;
import p4.l;
import t0.b;
import u3.f;

@i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 02\u00020\u0001:\u00010B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J;\u0010#\u001a\u00020\u00002\b\b\u0002\u0010 \u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010&\u001a\u00020\u000b2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b+\u0010\tJ\u000f\u0010,\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/R\u0014\u0010\u0006\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0010\u001a\u00020\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\rR\u001a\u0010\u0014\u001a\u00020\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\rR\u001a\u0010\u0017\u001a\u00020\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\rR\u0011\u0010\u001a\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\tR\u0011\u0010\u001c\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\tR\u0011\u0010\u001e\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\tR\u0011\u0010 \u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b!\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\"\u0010\u0012\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00061"}, d2 = {"Landroidx/compose/ui/unit/Constraints;", "", b.f22420d, "", "constructor-impl", "(J)J", "focusIndex", "", "getFocusIndex-impl", "(J)I", "hasBoundedHeight", "", "getHasBoundedHeight-impl", "(J)Z", "hasBoundedWidth", "getHasBoundedWidth-impl", "hasFixedHeight", "getHasFixedHeight$annotations", "()V", "getHasFixedHeight-impl", "hasFixedWidth", "getHasFixedWidth$annotations", "getHasFixedWidth-impl", "isZero", "isZero$annotations", "isZero-impl", "maxHeight", "getMaxHeight-impl", "maxWidth", "getMaxWidth-impl", "minHeight", "getMinHeight-impl", "minWidth", "getMinWidth-impl", "getValue$annotations", "copy", "copy-Zbe2FdA", "(JIIII)J", "equals", "other", "equals-impl", "(JLjava/lang/Object;)Z", TTDownloadField.TT_HASHCODE, "hashCode-impl", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Immutable
@f
/* loaded from: classes.dex */
public final class Constraints {
    private static final long FocusMask = 3;
    public static final int Infinity = Integer.MAX_VALUE;
    private static final int MaxFocusBits = 18;
    private static final long MaxFocusHeight = 3;
    private static final long MaxFocusWidth = 1;
    private static final int MaxNonFocusBits = 13;
    private static final int MinFocusBits = 16;
    private static final long MinFocusHeight = 2;
    private static final int MinFocusMask = 65535;
    private static final long MinFocusWidth = 0;
    private static final int MinNonFocusBits = 15;
    private static final int MinNonFocusMask = 32767;
    private final long value;

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private static final int[] MinHeightOffsets = {18, 20, 17, 15};
    private static final int MaxFocusMask = 262143;
    private static final int MaxNonFocusMask = 8191;

    @l
    private static final int[] WidthMask = {65535, MaxFocusMask, 32767, MaxNonFocusMask};

    @l
    private static final int[] HeightMask = {32767, MaxNonFocusMask, 65535, MaxFocusMask};

    @i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\bH\u0002J5\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 J%\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%J\u001d\u0010&\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(J\u001d\u0010)\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010(R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006+"}, d2 = {"Landroidx/compose/ui/unit/Constraints$Companion;", "", "()V", "FocusMask", "", "HeightMask", "", "Infinity", "", "MaxFocusBits", "MaxFocusHeight", "MaxFocusMask", "MaxFocusWidth", "MaxNonFocusBits", "MaxNonFocusMask", "MinFocusBits", "MinFocusHeight", "MinFocusMask", "MinFocusWidth", "MinHeightOffsets", "MinNonFocusBits", "MinNonFocusMask", "WidthMask", "bitsNeedForSize", "size", "createConstraints", "Landroidx/compose/ui/unit/Constraints;", "minWidth", "maxWidth", "minHeight", "maxHeight", "createConstraints-Zbe2FdA$ui_unit_release", "(IIII)J", "fixed", "width", "height", "fixed-JhjzzOo", "(II)J", "fixedHeight", "fixedHeight-OenEA2s", "(I)J", "fixedWidth", "fixedWidth-OenEA2s", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        private final int bitsNeedForSize(int i5) {
            if (i5 < Constraints.MaxNonFocusMask) {
                return 13;
            }
            if (i5 < 32767) {
                return 15;
            }
            if (i5 < 65535) {
                return 16;
            }
            if (i5 < Constraints.MaxFocusMask) {
                return 18;
            }
            throw new IllegalArgumentException("Can't represent a size of " + i5 + " in Constraints");
        }

        /* renamed from: createConstraints-Zbe2FdA$ui_unit_release, reason: not valid java name */
        public final long m6007createConstraintsZbe2FdA$ui_unit_release(int i5, int i6, int i7, int i8) {
            int i9;
            int i10;
            long j5;
            int i11;
            if (i8 == Integer.MAX_VALUE) {
                i9 = i7;
            } else {
                i9 = i8;
            }
            int bitsNeedForSize = bitsNeedForSize(i9);
            if (i6 == Integer.MAX_VALUE) {
                i10 = i5;
            } else {
                i10 = i6;
            }
            int bitsNeedForSize2 = bitsNeedForSize(i10);
            if (bitsNeedForSize + bitsNeedForSize2 <= 31) {
                if (bitsNeedForSize2 != 13) {
                    if (bitsNeedForSize2 != 18) {
                        if (bitsNeedForSize2 != 15) {
                            if (bitsNeedForSize2 == 16) {
                                j5 = 0;
                            } else {
                                throw new IllegalStateException("Should only have the provided constants.");
                            }
                        } else {
                            j5 = 2;
                        }
                    } else {
                        j5 = 1;
                    }
                } else {
                    j5 = 3;
                }
                int i12 = 0;
                if (i6 == Integer.MAX_VALUE) {
                    i11 = 0;
                } else {
                    i11 = i6 + 1;
                }
                if (i8 != Integer.MAX_VALUE) {
                    i12 = i8 + 1;
                }
                int i13 = Constraints.MinHeightOffsets[(int) j5];
                return Constraints.m5989constructorimpl((i11 << 33) | j5 | (i5 << 2) | (i7 << i13) | (i12 << (i13 + 31)));
            }
            throw new IllegalArgumentException("Can't represent a width of " + i10 + " and height of " + i9 + " in Constraints");
        }

        @Stable
        /* renamed from: fixed-JhjzzOo, reason: not valid java name */
        public final long m6008fixedJhjzzOo(int i5, int i6) {
            boolean z4;
            if (i5 >= 0 && i6 >= 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                return m6007createConstraintsZbe2FdA$ui_unit_release(i5, i5, i6, i6);
            }
            throw new IllegalArgumentException(("width(" + i5 + ") and height(" + i6 + ") must be >= 0").toString());
        }

        @Stable
        /* renamed from: fixedHeight-OenEA2s, reason: not valid java name */
        public final long m6009fixedHeightOenEA2s(int i5) {
            boolean z4;
            if (i5 >= 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                return m6007createConstraintsZbe2FdA$ui_unit_release(0, Integer.MAX_VALUE, i5, i5);
            }
            throw new IllegalArgumentException(("height(" + i5 + ") must be >= 0").toString());
        }

        @Stable
        /* renamed from: fixedWidth-OenEA2s, reason: not valid java name */
        public final long m6010fixedWidthOenEA2s(int i5) {
            boolean z4;
            if (i5 >= 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                return m6007createConstraintsZbe2FdA$ui_unit_release(i5, i5, 0, Integer.MAX_VALUE);
            }
            throw new IllegalArgumentException(("width(" + i5 + ") must be >= 0").toString());
        }
    }

    private /* synthetic */ Constraints(long j5) {
        this.value = j5;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Constraints m5988boximpl(long j5) {
        return new Constraints(j5);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m5989constructorimpl(long j5) {
        return j5;
    }

    /* renamed from: copy-Zbe2FdA, reason: not valid java name */
    public static final long m5990copyZbe2FdA(long j5, int i5, int i6, int i7, int i8) {
        boolean z4;
        boolean z5;
        boolean z6 = true;
        if (i7 >= 0 && i5 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (i6 < i5 && i6 != Integer.MAX_VALUE) {
                z5 = false;
            } else {
                z5 = true;
            }
            if (z5) {
                if (i8 < i7 && i8 != Integer.MAX_VALUE) {
                    z6 = false;
                }
                if (z6) {
                    return Companion.m6007createConstraintsZbe2FdA$ui_unit_release(i5, i6, i7, i8);
                }
                throw new IllegalArgumentException(("maxHeight(" + i8 + ") must be >= minHeight(" + i7 + ')').toString());
            }
            throw new IllegalArgumentException(("maxWidth(" + i6 + ") must be >= minWidth(" + i5 + ')').toString());
        }
        throw new IllegalArgumentException(("minHeight(" + i7 + ") and minWidth(" + i5 + ") must be >= 0").toString());
    }

    /* renamed from: copy-Zbe2FdA$default, reason: not valid java name */
    public static /* synthetic */ long m5991copyZbe2FdA$default(long j5, int i5, int i6, int i7, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i5 = m6002getMinWidthimpl(j5);
        }
        int i10 = i5;
        if ((i9 & 2) != 0) {
            i6 = m6000getMaxWidthimpl(j5);
        }
        int i11 = i6;
        if ((i9 & 4) != 0) {
            i7 = m6001getMinHeightimpl(j5);
        }
        int i12 = i7;
        if ((i9 & 8) != 0) {
            i8 = m5999getMaxHeightimpl(j5);
        }
        return m5990copyZbe2FdA(j5, i10, i11, i12, i8);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5992equalsimpl(long j5, Object obj) {
        return (obj instanceof Constraints) && j5 == ((Constraints) obj).m6006unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5993equalsimpl0(long j5, long j6) {
        return j5 == j6;
    }

    /* renamed from: getFocusIndex-impl, reason: not valid java name */
    private static final int m5994getFocusIndeximpl(long j5) {
        return (int) (j5 & 3);
    }

    /* renamed from: getHasBoundedHeight-impl, reason: not valid java name */
    public static final boolean m5995getHasBoundedHeightimpl(long j5) {
        int m5994getFocusIndeximpl = m5994getFocusIndeximpl(j5);
        if ((((int) (j5 >> (MinHeightOffsets[m5994getFocusIndeximpl] + 31))) & HeightMask[m5994getFocusIndeximpl]) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: getHasBoundedWidth-impl, reason: not valid java name */
    public static final boolean m5996getHasBoundedWidthimpl(long j5) {
        return (((int) (j5 >> 33)) & WidthMask[m5994getFocusIndeximpl(j5)]) != 0;
    }

    @Stable
    public static /* synthetic */ void getHasFixedHeight$annotations() {
    }

    /* renamed from: getHasFixedHeight-impl, reason: not valid java name */
    public static final boolean m5997getHasFixedHeightimpl(long j5) {
        return m5999getMaxHeightimpl(j5) == m6001getMinHeightimpl(j5);
    }

    @Stable
    public static /* synthetic */ void getHasFixedWidth$annotations() {
    }

    /* renamed from: getHasFixedWidth-impl, reason: not valid java name */
    public static final boolean m5998getHasFixedWidthimpl(long j5) {
        return m6000getMaxWidthimpl(j5) == m6002getMinWidthimpl(j5);
    }

    /* renamed from: getMaxHeight-impl, reason: not valid java name */
    public static final int m5999getMaxHeightimpl(long j5) {
        int m5994getFocusIndeximpl = m5994getFocusIndeximpl(j5);
        int i5 = ((int) (j5 >> (MinHeightOffsets[m5994getFocusIndeximpl] + 31))) & HeightMask[m5994getFocusIndeximpl];
        if (i5 == 0) {
            return Integer.MAX_VALUE;
        }
        return i5 - 1;
    }

    /* renamed from: getMaxWidth-impl, reason: not valid java name */
    public static final int m6000getMaxWidthimpl(long j5) {
        int i5 = ((int) (j5 >> 33)) & WidthMask[m5994getFocusIndeximpl(j5)];
        if (i5 == 0) {
            return Integer.MAX_VALUE;
        }
        return i5 - 1;
    }

    /* renamed from: getMinHeight-impl, reason: not valid java name */
    public static final int m6001getMinHeightimpl(long j5) {
        int m5994getFocusIndeximpl = m5994getFocusIndeximpl(j5);
        return ((int) (j5 >> MinHeightOffsets[m5994getFocusIndeximpl])) & HeightMask[m5994getFocusIndeximpl];
    }

    /* renamed from: getMinWidth-impl, reason: not valid java name */
    public static final int m6002getMinWidthimpl(long j5) {
        return ((int) (j5 >> 2)) & WidthMask[m5994getFocusIndeximpl(j5)];
    }

    @a1
    public static /* synthetic */ void getValue$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6003hashCodeimpl(long j5) {
        return Long.hashCode(j5);
    }

    @Stable
    public static /* synthetic */ void isZero$annotations() {
    }

    /* renamed from: isZero-impl, reason: not valid java name */
    public static final boolean m6004isZeroimpl(long j5) {
        return m6000getMaxWidthimpl(j5) == 0 || m5999getMaxHeightimpl(j5) == 0;
    }

    @l
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6005toStringimpl(long j5) {
        String valueOf;
        int m6000getMaxWidthimpl = m6000getMaxWidthimpl(j5);
        String str = "Infinity";
        if (m6000getMaxWidthimpl == Integer.MAX_VALUE) {
            valueOf = "Infinity";
        } else {
            valueOf = String.valueOf(m6000getMaxWidthimpl);
        }
        int m5999getMaxHeightimpl = m5999getMaxHeightimpl(j5);
        if (m5999getMaxHeightimpl != Integer.MAX_VALUE) {
            str = String.valueOf(m5999getMaxHeightimpl);
        }
        return "Constraints(minWidth = " + m6002getMinWidthimpl(j5) + ", maxWidth = " + valueOf + ", minHeight = " + m6001getMinHeightimpl(j5) + ", maxHeight = " + str + ')';
    }

    public boolean equals(Object obj) {
        return m5992equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m6003hashCodeimpl(this.value);
    }

    @l
    public String toString() {
        return m6005toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m6006unboximpl() {
        return this.value;
    }
}
