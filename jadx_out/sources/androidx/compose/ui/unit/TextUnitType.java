package androidx.compose.ui.unit;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.w;
import p4.l;
import u3.f;

@i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/unit/TextUnitType;", "", "type", "", "constructor-impl", "(J)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", TTDownloadField.TT_HASHCODE, "", "hashCode-impl", "(J)I", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@f
/* loaded from: classes.dex */
public final class TextUnitType {
    private final long type;

    @l
    public static final Companion Companion = new Companion(null);
    private static final long Unspecified = m6261constructorimpl(0);
    private static final long Sp = m6261constructorimpl(4294967296L);
    private static final long Em = m6261constructorimpl(8589934592L);

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, d2 = {"Landroidx/compose/ui/unit/TextUnitType$Companion;", "", "()V", "Em", "Landroidx/compose/ui/unit/TextUnitType;", "getEm-UIouoOA", "()J", "J", "Sp", "getSp-UIouoOA", "Unspecified", "getUnspecified-UIouoOA", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        /* renamed from: getEm-UIouoOA, reason: not valid java name */
        public final long m6267getEmUIouoOA() {
            return TextUnitType.Em;
        }

        /* renamed from: getSp-UIouoOA, reason: not valid java name */
        public final long m6268getSpUIouoOA() {
            return TextUnitType.Sp;
        }

        /* renamed from: getUnspecified-UIouoOA, reason: not valid java name */
        public final long m6269getUnspecifiedUIouoOA() {
            return TextUnitType.Unspecified;
        }
    }

    private /* synthetic */ TextUnitType(long j5) {
        this.type = j5;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextUnitType m6260boximpl(long j5) {
        return new TextUnitType(j5);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m6261constructorimpl(long j5) {
        return j5;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6262equalsimpl(long j5, Object obj) {
        return (obj instanceof TextUnitType) && j5 == ((TextUnitType) obj).m6266unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6263equalsimpl0(long j5, long j6) {
        return j5 == j6;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6264hashCodeimpl(long j5) {
        return Long.hashCode(j5);
    }

    @l
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6265toStringimpl(long j5) {
        if (m6263equalsimpl0(j5, Unspecified)) {
            return "Unspecified";
        }
        if (m6263equalsimpl0(j5, Sp)) {
            return "Sp";
        }
        if (m6263equalsimpl0(j5, Em)) {
            return "Em";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m6262equalsimpl(this.type, obj);
    }

    public int hashCode() {
        return m6264hashCodeimpl(this.type);
    }

    @l
    public String toString() {
        return m6265toStringimpl(this.type);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m6266unboximpl() {
        return this.type;
    }
}
