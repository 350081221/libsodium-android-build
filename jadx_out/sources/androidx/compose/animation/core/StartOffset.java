package androidx.compose.animation.core;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.j0;
import kotlin.jvm.internal.w;

@i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0002\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u001a\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00058Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\r\u0010\fR\u000e\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\u0002\n\u0000\u0088\u0001\b\u0092\u0001\u00020\t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Landroidx/compose/animation/core/StartOffset;", "", "offsetMillis", "", "offsetType", "Landroidx/compose/animation/core/StartOffsetType;", "constructor-impl", "(II)J", t0.b.f22420d, "", "(J)J", "getOffsetMillis-impl", "(J)I", "getOffsetType-Eo1U57Q", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", TTDownloadField.TT_HASHCODE, "hashCode-impl", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@u3.f
/* loaded from: classes.dex */
public final class StartOffset {
    private final long value;

    private /* synthetic */ StartOffset(long j5) {
        this.value = j5;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StartOffset m136boximpl(long j5) {
        return new StartOffset(j5);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m137constructorimpl(int i5, int i6) {
        return m138constructorimpl(i5 * i6);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static long m138constructorimpl(long j5) {
        return j5;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ long m139constructorimpl$default(int i5, int i6, int i7, w wVar) {
        if ((i7 & 2) != 0) {
            i6 = StartOffsetType.Companion.m154getDelayEo1U57Q();
        }
        return m137constructorimpl(i5, i6);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m140equalsimpl(long j5, Object obj) {
        return (obj instanceof StartOffset) && j5 == ((StartOffset) obj).m146unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m141equalsimpl0(long j5, long j6) {
        return j5 == j6;
    }

    /* renamed from: getOffsetMillis-impl, reason: not valid java name */
    public static final int m142getOffsetMillisimpl(long j5) {
        return Math.abs((int) j5);
    }

    /* renamed from: getOffsetType-Eo1U57Q, reason: not valid java name */
    public static final int m143getOffsetTypeEo1U57Q(long j5) {
        boolean z4;
        if (j5 > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return StartOffsetType.Companion.m155getFastForwardEo1U57Q();
        }
        if (!z4) {
            return StartOffsetType.Companion.m154getDelayEo1U57Q();
        }
        throw new j0();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m144hashCodeimpl(long j5) {
        return Long.hashCode(j5);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m145toStringimpl(long j5) {
        return "StartOffset(value=" + j5 + ')';
    }

    public boolean equals(Object obj) {
        return m140equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m144hashCodeimpl(this.value);
    }

    public String toString() {
        return m145toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m146unboximpl() {
        return this.value;
    }
}
