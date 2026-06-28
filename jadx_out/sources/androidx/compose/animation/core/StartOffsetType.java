package androidx.compose.animation.core;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.w;
import p4.l;

@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0012"}, d2 = {"Landroidx/compose/animation/core/StartOffsetType;", "", t0.b.f22420d, "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", TTDownloadField.TT_HASHCODE, "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@u3.f
/* loaded from: classes.dex */
public final class StartOffsetType {

    @l
    public static final Companion Companion = new Companion(null);
    private static final int Delay = m148constructorimpl(-1);
    private static final int FastForward = m148constructorimpl(1);
    private final int value;

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Landroidx/compose/animation/core/StartOffsetType$Companion;", "", "()V", "Delay", "Landroidx/compose/animation/core/StartOffsetType;", "getDelay-Eo1U57Q", "()I", "I", "FastForward", "getFastForward-Eo1U57Q", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        /* renamed from: getDelay-Eo1U57Q, reason: not valid java name */
        public final int m154getDelayEo1U57Q() {
            return StartOffsetType.Delay;
        }

        /* renamed from: getFastForward-Eo1U57Q, reason: not valid java name */
        public final int m155getFastForwardEo1U57Q() {
            return StartOffsetType.FastForward;
        }
    }

    private /* synthetic */ StartOffsetType(int i5) {
        this.value = i5;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StartOffsetType m147boximpl(int i5) {
        return new StartOffsetType(i5);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m148constructorimpl(int i5) {
        return i5;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m149equalsimpl(int i5, Object obj) {
        return (obj instanceof StartOffsetType) && i5 == ((StartOffsetType) obj).m153unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m150equalsimpl0(int i5, int i6) {
        return i5 == i6;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m151hashCodeimpl(int i5) {
        return Integer.hashCode(i5);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m152toStringimpl(int i5) {
        return "StartOffsetType(value=" + i5 + ')';
    }

    public boolean equals(Object obj) {
        return m149equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m151hashCodeimpl(this.value);
    }

    public String toString() {
        return m152toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m153unboximpl() {
        return this.value;
    }
}
