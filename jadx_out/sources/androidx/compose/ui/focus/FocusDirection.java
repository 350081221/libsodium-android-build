package androidx.compose.ui.focus;

import androidx.compose.ui.ExperimentalComposeUiApi;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.w;
import p4.l;
import t0.b;
import u3.f;

@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/focus/FocusDirection;", "", b.f22420d, "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", TTDownloadField.TT_HASHCODE, "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@f
/* loaded from: classes.dex */
public final class FocusDirection {
    private final int value;

    @l
    public static final Companion Companion = new Companion(null);
    private static final int Next = m3411constructorimpl(1);
    private static final int Previous = m3411constructorimpl(2);
    private static final int Left = m3411constructorimpl(3);
    private static final int Right = m3411constructorimpl(4);
    private static final int Up = m3411constructorimpl(5);
    private static final int Down = m3411constructorimpl(6);
    private static final int Enter = m3411constructorimpl(7);
    private static final int Exit = m3411constructorimpl(8);

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R$\u0010\b\u001a\u00020\u00048GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0007\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0006R$\u0010\u000b\u001a\u00020\u00048GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0007\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u0006R\u0019\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0006R\u0019\u0010\u0010\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0011\u0010\u0006R\u0019\u0010\u0012\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0013\u0010\u0006R\u0019\u0010\u0014\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0015\u0010\u0006R\u0019\u0010\u0016\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0017\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/focus/FocusDirection$Companion;", "", "()V", "Down", "Landroidx/compose/ui/focus/FocusDirection;", "getDown-dhqQ-8s", "()I", "I", "Enter", "getEnter-dhqQ-8s$annotations", "getEnter-dhqQ-8s", "Exit", "getExit-dhqQ-8s$annotations", "getExit-dhqQ-8s", "Left", "getLeft-dhqQ-8s", "Next", "getNext-dhqQ-8s", "Previous", "getPrevious-dhqQ-8s", "Right", "getRight-dhqQ-8s", "Up", "getUp-dhqQ-8s", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @ExperimentalComposeUiApi
        /* renamed from: getEnter-dhqQ-8s$annotations, reason: not valid java name */
        public static /* synthetic */ void m3417getEnterdhqQ8s$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getExit-dhqQ-8s$annotations, reason: not valid java name */
        public static /* synthetic */ void m3418getExitdhqQ8s$annotations() {
        }

        /* renamed from: getDown-dhqQ-8s, reason: not valid java name */
        public final int m3419getDowndhqQ8s() {
            return FocusDirection.Down;
        }

        @ExperimentalComposeUiApi
        /* renamed from: getEnter-dhqQ-8s, reason: not valid java name */
        public final int m3420getEnterdhqQ8s() {
            return FocusDirection.Enter;
        }

        @ExperimentalComposeUiApi
        /* renamed from: getExit-dhqQ-8s, reason: not valid java name */
        public final int m3421getExitdhqQ8s() {
            return FocusDirection.Exit;
        }

        /* renamed from: getLeft-dhqQ-8s, reason: not valid java name */
        public final int m3422getLeftdhqQ8s() {
            return FocusDirection.Left;
        }

        /* renamed from: getNext-dhqQ-8s, reason: not valid java name */
        public final int m3423getNextdhqQ8s() {
            return FocusDirection.Next;
        }

        /* renamed from: getPrevious-dhqQ-8s, reason: not valid java name */
        public final int m3424getPreviousdhqQ8s() {
            return FocusDirection.Previous;
        }

        /* renamed from: getRight-dhqQ-8s, reason: not valid java name */
        public final int m3425getRightdhqQ8s() {
            return FocusDirection.Right;
        }

        /* renamed from: getUp-dhqQ-8s, reason: not valid java name */
        public final int m3426getUpdhqQ8s() {
            return FocusDirection.Up;
        }
    }

    private /* synthetic */ FocusDirection(int i5) {
        this.value = i5;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FocusDirection m3410boximpl(int i5) {
        return new FocusDirection(i5);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m3411constructorimpl(int i5) {
        return i5;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3412equalsimpl(int i5, Object obj) {
        return (obj instanceof FocusDirection) && i5 == ((FocusDirection) obj).m3416unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3413equalsimpl0(int i5, int i6) {
        return i5 == i6;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3414hashCodeimpl(int i5) {
        return Integer.hashCode(i5);
    }

    @l
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3415toStringimpl(int i5) {
        if (m3413equalsimpl0(i5, Next)) {
            return "Next";
        }
        if (m3413equalsimpl0(i5, Previous)) {
            return "Previous";
        }
        if (m3413equalsimpl0(i5, Left)) {
            return "Left";
        }
        if (m3413equalsimpl0(i5, Right)) {
            return "Right";
        }
        if (m3413equalsimpl0(i5, Up)) {
            return "Up";
        }
        if (m3413equalsimpl0(i5, Down)) {
            return "Down";
        }
        if (m3413equalsimpl0(i5, Enter)) {
            return "Enter";
        }
        if (m3413equalsimpl0(i5, Exit)) {
            return "Exit";
        }
        return "Invalid FocusDirection";
    }

    public boolean equals(Object obj) {
        return m3412equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3414hashCodeimpl(this.value);
    }

    @l
    public String toString() {
        return m3415toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3416unboximpl() {
        return this.value;
    }
}
