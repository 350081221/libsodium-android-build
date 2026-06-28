package okio.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.collections.o;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import okio.i1;
import okio.k1;
import okio.n;
import v3.q;

@i0(d1 = {"\u0000T\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a-\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0080\b\u001a\u0017\u0010\u000e\u001a\u00020\u000f*\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0080\b\u001a\r\u0010\u0012\u001a\u00020\u0001*\u00020\bH\u0080\b\u001a\r\u0010\u0013\u001a\u00020\u0001*\u00020\bH\u0080\b\u001a\u0015\u0010\u0014\u001a\u00020\u0015*\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0001H\u0080\b\u001a-\u0010\u0017\u001a\u00020\u000f*\u00020\b2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0080\b\u001a-\u0010\u0017\u001a\u00020\u000f*\u00020\b2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0080\b\u001a\u001d\u0010\u001a\u001a\u00020\u0019*\u00020\b2\u0006\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u0001H\u0080\b\u001a\r\u0010\u001d\u001a\u00020\u000b*\u00020\bH\u0080\b\u001a%\u0010\u001e\u001a\u00020\u0007*\u00020\b2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0080\b\u001a]\u0010!\u001a\u00020\u0007*\u00020\b2K\u0010\"\u001aG\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00070#H\u0080\bø\u0001\u0000\u001aj\u0010!\u001a\u00020\u0007*\u00020\b2\u0006\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00012K\u0010\"\u001aG\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00070#H\u0082\b\u001a\u0014\u0010'\u001a\u00020\u0001*\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0001H\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006("}, d2 = {"binarySearch", "", "", t0.b.f22420d, "fromIndex", "toIndex", "commonCopyInto", "", "Lokio/SegmentedByteString;", TypedValues.CycleType.S_WAVE_OFFSET, TypedValues.AttributesType.S_TARGET, "", "targetOffset", "byteCount", "commonEquals", "", "other", "", "commonGetSize", "commonHashCode", "commonInternalGet", "", "pos", "commonRangeEquals", "otherOffset", "Lokio/ByteString;", "commonSubstring", "beginIndex", "endIndex", "commonToByteArray", "commonWrite", "buffer", "Lokio/Buffer;", "forEachSegment", "action", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "data", "segment", "okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
@u3.h(name = "-SegmentedByteString")
@r1({"SMAP\nSegmentedByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentedByteString.kt\nokio/internal/-SegmentedByteString\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,250:1\n63#1,12:252\n85#1,14:264\n85#1,14:278\n85#1,14:292\n85#1,14:306\n63#1,12:320\n1#2:251\n*S KotlinDebug\n*F\n+ 1 SegmentedByteString.kt\nokio/internal/-SegmentedByteString\n*L\n147#1:252,12\n160#1:264,14\n182#1:278,14\n202#1:292,14\n219#1:306,14\n239#1:320,12\n*E\n"})
/* loaded from: classes4.dex */
public final class g {
    public static final int a(@p4.l int[] iArr, int i5, int i6, int i7) {
        l0.p(iArr, "<this>");
        int i8 = i7 - 1;
        while (i6 <= i8) {
            int i9 = (i6 + i8) >>> 1;
            int i10 = iArr[i9];
            if (i10 < i5) {
                i6 = i9 + 1;
            } else if (i10 > i5) {
                i8 = i9 - 1;
            } else {
                return i9;
            }
        }
        return (-i6) - 1;
    }

    public static final void b(@p4.l k1 k1Var, int i5, @p4.l byte[] target, int i6, int i7) {
        int i8;
        l0.p(k1Var, "<this>");
        l0.p(target, "target");
        long j5 = i7;
        okio.i.e(k1Var.size(), i5, j5);
        okio.i.e(target.length, i6, j5);
        int i9 = i7 + i5;
        int n5 = n(k1Var, i5);
        while (i5 < i9) {
            if (n5 == 0) {
                i8 = 0;
            } else {
                i8 = k1Var.getDirectory$okio()[n5 - 1];
            }
            int i10 = k1Var.getDirectory$okio()[n5] - i8;
            int i11 = k1Var.getDirectory$okio()[k1Var.getSegments$okio().length + n5];
            int min = Math.min(i9, i10 + i8) - i5;
            int i12 = i11 + (i5 - i8);
            o.v0(k1Var.getSegments$okio()[n5], target, i6, i12, i12 + min);
            i6 += min;
            i5 += min;
            n5++;
        }
    }

    public static final boolean c(@p4.l k1 k1Var, @p4.m Object obj) {
        l0.p(k1Var, "<this>");
        if (obj == k1Var) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (nVar.size() == k1Var.size() && k1Var.rangeEquals(0, nVar, 0, k1Var.size())) {
                return true;
            }
        }
        return false;
    }

    public static final int d(@p4.l k1 k1Var) {
        l0.p(k1Var, "<this>");
        return k1Var.getDirectory$okio()[k1Var.getSegments$okio().length - 1];
    }

    public static final int e(@p4.l k1 k1Var) {
        l0.p(k1Var, "<this>");
        int hashCode$okio = k1Var.getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int length = k1Var.getSegments$okio().length;
        int i5 = 0;
        int i6 = 1;
        int i7 = 0;
        while (i5 < length) {
            int i8 = k1Var.getDirectory$okio()[length + i5];
            int i9 = k1Var.getDirectory$okio()[i5];
            byte[] bArr = k1Var.getSegments$okio()[i5];
            int i10 = (i9 - i7) + i8;
            while (i8 < i10) {
                i6 = (i6 * 31) + bArr[i8];
                i8++;
            }
            i5++;
            i7 = i9;
        }
        k1Var.setHashCode$okio(i6);
        return i6;
    }

    public static final byte f(@p4.l k1 k1Var, int i5) {
        int i6;
        l0.p(k1Var, "<this>");
        okio.i.e(k1Var.getDirectory$okio()[k1Var.getSegments$okio().length - 1], i5, 1L);
        int n5 = n(k1Var, i5);
        if (n5 == 0) {
            i6 = 0;
        } else {
            i6 = k1Var.getDirectory$okio()[n5 - 1];
        }
        return k1Var.getSegments$okio()[n5][(i5 - i6) + k1Var.getDirectory$okio()[k1Var.getSegments$okio().length + n5]];
    }

    public static final boolean g(@p4.l k1 k1Var, int i5, @p4.l n other, int i6, int i7) {
        int i8;
        l0.p(k1Var, "<this>");
        l0.p(other, "other");
        if (i5 < 0 || i5 > k1Var.size() - i7) {
            return false;
        }
        int i9 = i7 + i5;
        int n5 = n(k1Var, i5);
        while (i5 < i9) {
            if (n5 == 0) {
                i8 = 0;
            } else {
                i8 = k1Var.getDirectory$okio()[n5 - 1];
            }
            int i10 = k1Var.getDirectory$okio()[n5] - i8;
            int i11 = k1Var.getDirectory$okio()[k1Var.getSegments$okio().length + n5];
            int min = Math.min(i9, i10 + i8) - i5;
            if (!other.rangeEquals(i6, k1Var.getSegments$okio()[n5], i11 + (i5 - i8), min)) {
                return false;
            }
            i6 += min;
            i5 += min;
            n5++;
        }
        return true;
    }

    public static final boolean h(@p4.l k1 k1Var, int i5, @p4.l byte[] other, int i6, int i7) {
        int i8;
        l0.p(k1Var, "<this>");
        l0.p(other, "other");
        if (i5 < 0 || i5 > k1Var.size() - i7 || i6 < 0 || i6 > other.length - i7) {
            return false;
        }
        int i9 = i7 + i5;
        int n5 = n(k1Var, i5);
        while (i5 < i9) {
            if (n5 == 0) {
                i8 = 0;
            } else {
                i8 = k1Var.getDirectory$okio()[n5 - 1];
            }
            int i10 = k1Var.getDirectory$okio()[n5] - i8;
            int i11 = k1Var.getDirectory$okio()[k1Var.getSegments$okio().length + n5];
            int min = Math.min(i9, i10 + i8) - i5;
            if (!okio.i.d(k1Var.getSegments$okio()[n5], i11 + (i5 - i8), other, i6, min)) {
                return false;
            }
            i6 += min;
            i5 += min;
            n5++;
        }
        return true;
    }

    @p4.l
    public static final n i(@p4.l k1 k1Var, int i5, int i6) {
        boolean z4;
        boolean z5;
        boolean z6;
        Object[] l12;
        l0.p(k1Var, "<this>");
        int l5 = okio.i.l(k1Var, i6);
        int i7 = 0;
        if (i5 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (l5 <= k1Var.size()) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                int i8 = l5 - i5;
                if (i8 >= 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z6) {
                    if (i5 == 0 && l5 == k1Var.size()) {
                        return k1Var;
                    }
                    if (i5 == l5) {
                        return n.EMPTY;
                    }
                    int n5 = n(k1Var, i5);
                    int n6 = n(k1Var, l5 - 1);
                    l12 = o.l1(k1Var.getSegments$okio(), n5, n6 + 1);
                    byte[][] bArr = (byte[][]) l12;
                    int[] iArr = new int[bArr.length * 2];
                    if (n5 <= n6) {
                        int i9 = 0;
                        int i10 = n5;
                        while (true) {
                            iArr[i9] = Math.min(k1Var.getDirectory$okio()[i10] - i5, i8);
                            int i11 = i9 + 1;
                            iArr[i9 + bArr.length] = k1Var.getDirectory$okio()[k1Var.getSegments$okio().length + i10];
                            if (i10 == n6) {
                                break;
                            }
                            i10++;
                            i9 = i11;
                        }
                    }
                    if (n5 != 0) {
                        i7 = k1Var.getDirectory$okio()[n5 - 1];
                    }
                    int length = bArr.length;
                    iArr[length] = iArr[length] + (i5 - i7);
                    return new k1(bArr, iArr);
                }
                throw new IllegalArgumentException(("endIndex=" + l5 + " < beginIndex=" + i5).toString());
            }
            throw new IllegalArgumentException(("endIndex=" + l5 + " > length(" + k1Var.size() + ')').toString());
        }
        throw new IllegalArgumentException(("beginIndex=" + i5 + " < 0").toString());
    }

    @p4.l
    public static final byte[] j(@p4.l k1 k1Var) {
        l0.p(k1Var, "<this>");
        byte[] bArr = new byte[k1Var.size()];
        int length = k1Var.getSegments$okio().length;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i5 < length) {
            int i8 = k1Var.getDirectory$okio()[length + i5];
            int i9 = k1Var.getDirectory$okio()[i5];
            int i10 = i9 - i6;
            o.v0(k1Var.getSegments$okio()[i5], bArr, i7, i8, i8 + i10);
            i7 += i10;
            i5++;
            i6 = i9;
        }
        return bArr;
    }

    public static final void k(@p4.l k1 k1Var, @p4.l okio.l buffer, int i5, int i6) {
        int i7;
        l0.p(k1Var, "<this>");
        l0.p(buffer, "buffer");
        int i8 = i5 + i6;
        int n5 = n(k1Var, i5);
        while (i5 < i8) {
            if (n5 == 0) {
                i7 = 0;
            } else {
                i7 = k1Var.getDirectory$okio()[n5 - 1];
            }
            int i9 = k1Var.getDirectory$okio()[n5] - i7;
            int i10 = k1Var.getDirectory$okio()[k1Var.getSegments$okio().length + n5];
            int min = Math.min(i8, i9 + i7) - i5;
            int i11 = i10 + (i5 - i7);
            i1 i1Var = new i1(k1Var.getSegments$okio()[n5], i11, i11 + min, true, false);
            i1 i1Var2 = buffer.f20987a;
            if (i1Var2 == null) {
                i1Var.f20934g = i1Var;
                i1Var.f20933f = i1Var;
                buffer.f20987a = i1Var;
            } else {
                l0.m(i1Var2);
                i1 i1Var3 = i1Var2.f20934g;
                l0.m(i1Var3);
                i1Var3.c(i1Var);
            }
            i5 += min;
            n5++;
        }
        buffer.I0(buffer.M0() + i6);
    }

    private static final void l(k1 k1Var, int i5, int i6, q<? super byte[], ? super Integer, ? super Integer, r2> qVar) {
        int i7;
        int n5 = n(k1Var, i5);
        while (i5 < i6) {
            if (n5 == 0) {
                i7 = 0;
            } else {
                i7 = k1Var.getDirectory$okio()[n5 - 1];
            }
            int i8 = k1Var.getDirectory$okio()[n5] - i7;
            int i9 = k1Var.getDirectory$okio()[k1Var.getSegments$okio().length + n5];
            int min = Math.min(i6, i8 + i7) - i5;
            qVar.invoke(k1Var.getSegments$okio()[n5], Integer.valueOf(i9 + (i5 - i7)), Integer.valueOf(min));
            i5 += min;
            n5++;
        }
    }

    public static final void m(@p4.l k1 k1Var, @p4.l q<? super byte[], ? super Integer, ? super Integer, r2> action) {
        l0.p(k1Var, "<this>");
        l0.p(action, "action");
        int length = k1Var.getSegments$okio().length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            int i7 = k1Var.getDirectory$okio()[length + i5];
            int i8 = k1Var.getDirectory$okio()[i5];
            action.invoke(k1Var.getSegments$okio()[i5], Integer.valueOf(i7), Integer.valueOf(i8 - i6));
            i5++;
            i6 = i8;
        }
    }

    public static final int n(@p4.l k1 k1Var, int i5) {
        l0.p(k1Var, "<this>");
        int a5 = a(k1Var.getDirectory$okio(), i5 + 1, 0, k1Var.getSegments$okio().length);
        if (a5 < 0) {
            return ~a5;
        }
        return a5;
    }
}
