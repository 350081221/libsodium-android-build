package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.util.MathHelpersKt;
import com.umeng.analytics.pro.bi;
import kotlin.a1;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;
import t0.b;
import v3.a;

@i0(d1 = {"\u0000@\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0014\u001a \u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\f\u001a\u00020\u0004*\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\u000f\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\r\u001a\u00020\u0004H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u0006\u001a\u001f\u0010\u000f\u001a\u00020\u0004*\u00020\u00102\u0006\u0010\r\u001a\u00020\u0004H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u0011\u001a\u001f\u0010\u000f\u001a\u00020\u0004*\u00020\u00122\u0006\u0010\r\u001a\u00020\u0004H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u0013\u001a\u001f\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001a\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0004H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\"\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a*\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0004H\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a*\u0010)\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b'\u0010(\"\u0014\u0010*\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010+\"\u0014\u0010,\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010+\"\u0014\u0010-\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010+\"\u0014\u0010.\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010+\"\u001f\u00103\u001a\u00020/*\u00020\u00048Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b2\u0010\u001c\u001a\u0004\b0\u00101\"\u001e\u00106\u001a\u00020/*\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b5\u0010\u001c\u001a\u0004\b4\u00101\"\u001e\u0010;\u001a\u00020\u0004*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b9\u0010:\u001a\u0004\b7\u00108\"\u001e\u0010>\u001a\u00020\u0004*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b=\u0010:\u001a\u0004\b<\u00108\"\u001e\u0010;\u001a\u00020\u0004*\u00020\u00108FX\u0087\u0004¢\u0006\f\u0012\u0004\b9\u0010@\u001a\u0004\b7\u0010?\"\u001e\u0010>\u001a\u00020\u0004*\u00020\u00108FX\u0087\u0004¢\u0006\f\u0012\u0004\b=\u0010@\u001a\u0004\b<\u0010?\"\u001e\u0010;\u001a\u00020\u0004*\u00020\u00128FX\u0087\u0004¢\u0006\f\u0012\u0004\b9\u0010B\u001a\u0004\b7\u0010A\"\u001e\u0010>\u001a\u00020\u0004*\u00020\u00128FX\u0087\u0004¢\u0006\f\u0012\u0004\b=\u0010B\u001a\u0004\b<\u0010A\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006C"}, d2 = {"", b.f22420d, "Landroidx/compose/ui/unit/TextUnitType;", "type", "Landroidx/compose/ui/unit/TextUnit;", "TextUnit-anM5pPY", "(FJ)J", "TextUnit", "Lkotlin/Function0;", "block", "takeOrElse-eAf_CNQ", "(JLv3/a;)J", "takeOrElse", "other", "times-mpE4wyQ", "times", "", "(DJ)J", "", "(IJ)J", "", "unitType", "v", "pack", "(JF)J", bi.ay, "Lkotlin/r2;", "checkArithmetic--R2X_6o", "(J)V", "checkArithmetic", "b", "checkArithmetic-NB67dxo", "(JJ)V", "c", "checkArithmetic-vU-0ePk", "(JJJ)V", "start", "stop", "fraction", "lerp-C3pnCVY", "(JJF)J", "lerp", "UNIT_MASK", "J", "UNIT_TYPE_UNSPECIFIED", "UNIT_TYPE_SP", "UNIT_TYPE_EM", "", "isSpecified--R2X_6o", "(J)Z", "isSpecified--R2X_6o$annotations", "isSpecified", "isUnspecified--R2X_6o", "isUnspecified--R2X_6o$annotations", "isUnspecified", "getSp", "(F)J", "getSp$annotations", "(F)V", "sp", "getEm", "getEm$annotations", "em", "(D)J", "(D)V", "(I)J", "(I)V", "ui-unit_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nTextUnit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n*L\n1#1,388:1\n250#1:389\n*S KotlinDebug\n*F\n+ 1 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n*L\n264#1:389\n*E\n"})
/* loaded from: classes.dex */
public final class TextUnitKt {
    private static final long UNIT_MASK = 1095216660480L;
    private static final long UNIT_TYPE_EM = 8589934592L;
    private static final long UNIT_TYPE_SP = 4294967296L;
    private static final long UNIT_TYPE_UNSPECIFIED = 0;

    /* renamed from: TextUnit-anM5pPY, reason: not valid java name */
    public static final long m6247TextUnitanM5pPY(float f5, long j5) {
        return pack(j5, f5);
    }

    @a1
    /* renamed from: checkArithmetic--R2X_6o, reason: not valid java name */
    public static final void m6248checkArithmeticR2X_6o(long j5) {
        if (!(!m6253isUnspecifiedR2X_6o(j5))) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
        }
    }

    @a1
    /* renamed from: checkArithmetic-NB67dxo, reason: not valid java name */
    public static final void m6249checkArithmeticNB67dxo(long j5, long j6) {
        boolean z4;
        if (!m6253isUnspecifiedR2X_6o(j5) && !m6253isUnspecifiedR2X_6o(j6)) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (TextUnitType.m6263equalsimpl0(TextUnit.m6234getTypeUIouoOA(j5), TextUnit.m6234getTypeUIouoOA(j6))) {
                return;
            }
            throw new IllegalArgumentException(("Cannot perform operation for " + ((Object) TextUnitType.m6265toStringimpl(TextUnit.m6234getTypeUIouoOA(j5))) + " and " + ((Object) TextUnitType.m6265toStringimpl(TextUnit.m6234getTypeUIouoOA(j6)))).toString());
        }
        throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
    }

    @a1
    /* renamed from: checkArithmetic-vU-0ePk, reason: not valid java name */
    public static final void m6250checkArithmeticvU0ePk(long j5, long j6, long j7) {
        boolean z4;
        boolean z5 = true;
        if (!m6253isUnspecifiedR2X_6o(j5) && !m6253isUnspecifiedR2X_6o(j6) && !m6253isUnspecifiedR2X_6o(j7)) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (!TextUnitType.m6263equalsimpl0(TextUnit.m6234getTypeUIouoOA(j5), TextUnit.m6234getTypeUIouoOA(j6)) || !TextUnitType.m6263equalsimpl0(TextUnit.m6234getTypeUIouoOA(j6), TextUnit.m6234getTypeUIouoOA(j7))) {
                z5 = false;
            }
            if (z5) {
                return;
            }
            throw new IllegalArgumentException(("Cannot perform operation for " + ((Object) TextUnitType.m6265toStringimpl(TextUnit.m6234getTypeUIouoOA(j5))) + " and " + ((Object) TextUnitType.m6265toStringimpl(TextUnit.m6234getTypeUIouoOA(j6)))).toString());
        }
        throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
    }

    public static final long getEm(float f5) {
        return pack(UNIT_TYPE_EM, f5);
    }

    @Stable
    public static /* synthetic */ void getEm$annotations(double d5) {
    }

    @Stable
    public static /* synthetic */ void getEm$annotations(float f5) {
    }

    @Stable
    public static /* synthetic */ void getEm$annotations(int i5) {
    }

    public static final long getSp(float f5) {
        return pack(UNIT_TYPE_SP, f5);
    }

    @Stable
    public static /* synthetic */ void getSp$annotations(double d5) {
    }

    @Stable
    public static /* synthetic */ void getSp$annotations(float f5) {
    }

    @Stable
    public static /* synthetic */ void getSp$annotations(int i5) {
    }

    /* renamed from: isSpecified--R2X_6o, reason: not valid java name */
    public static final boolean m6251isSpecifiedR2X_6o(long j5) {
        return !m6253isUnspecifiedR2X_6o(j5);
    }

    @Stable
    /* renamed from: isSpecified--R2X_6o$annotations, reason: not valid java name */
    public static /* synthetic */ void m6252isSpecifiedR2X_6o$annotations(long j5) {
    }

    /* renamed from: isUnspecified--R2X_6o, reason: not valid java name */
    public static final boolean m6253isUnspecifiedR2X_6o(long j5) {
        return TextUnit.m6233getRawTypeimpl(j5) == 0;
    }

    @Stable
    /* renamed from: isUnspecified--R2X_6o$annotations, reason: not valid java name */
    public static /* synthetic */ void m6254isUnspecifiedR2X_6o$annotations(long j5) {
    }

    @Stable
    /* renamed from: lerp-C3pnCVY, reason: not valid java name */
    public static final long m6255lerpC3pnCVY(long j5, long j6, float f5) {
        m6249checkArithmeticNB67dxo(j5, j6);
        return pack(TextUnit.m6233getRawTypeimpl(j5), MathHelpersKt.lerp(TextUnit.m6235getValueimpl(j5), TextUnit.m6235getValueimpl(j6), f5));
    }

    @a1
    public static final long pack(long j5, float f5) {
        return TextUnit.m6227constructorimpl(j5 | (Float.floatToIntBits(f5) & 4294967295L));
    }

    /* renamed from: takeOrElse-eAf_CNQ, reason: not valid java name */
    public static final long m6256takeOrElseeAf_CNQ(long j5, @l a<TextUnit> aVar) {
        if (!(!m6253isUnspecifiedR2X_6o(j5))) {
            return aVar.invoke().m6244unboximpl();
        }
        return j5;
    }

    @Stable
    /* renamed from: times-mpE4wyQ, reason: not valid java name */
    public static final long m6258timesmpE4wyQ(float f5, long j5) {
        m6248checkArithmeticR2X_6o(j5);
        return pack(TextUnit.m6233getRawTypeimpl(j5), f5 * TextUnit.m6235getValueimpl(j5));
    }

    public static final long getEm(double d5) {
        return pack(UNIT_TYPE_EM, (float) d5);
    }

    public static final long getSp(double d5) {
        return pack(UNIT_TYPE_SP, (float) d5);
    }

    public static final long getEm(int i5) {
        return pack(UNIT_TYPE_EM, i5);
    }

    public static final long getSp(int i5) {
        return pack(UNIT_TYPE_SP, i5);
    }

    @Stable
    /* renamed from: times-mpE4wyQ, reason: not valid java name */
    public static final long m6257timesmpE4wyQ(double d5, long j5) {
        m6248checkArithmeticR2X_6o(j5);
        return pack(TextUnit.m6233getRawTypeimpl(j5), ((float) d5) * TextUnit.m6235getValueimpl(j5));
    }

    @Stable
    /* renamed from: times-mpE4wyQ, reason: not valid java name */
    public static final long m6259timesmpE4wyQ(int i5, long j5) {
        m6248checkArithmeticR2X_6o(j5);
        return pack(TextUnit.m6233getRawTypeimpl(j5), i5 * TextUnit.m6235getValueimpl(j5));
    }
}
