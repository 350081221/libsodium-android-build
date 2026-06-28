package androidx.compose.runtime;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.w;
import p4.l;
import t0.b;
import u3.f;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0083@\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u000e\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0005J\u0010\u0010\u0014\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0012\u0010\u0006\u001a\u00020\u00078Æ\u0002¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u00078Æ\u0002¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u0088\u0001\u0002¨\u0006\u0019"}, d2 = {"Landroidx/compose/runtime/GroupKind;", "", b.f22420d, "", "constructor-impl", "(I)I", "isNode", "", "isNode-impl", "(I)Z", "isReusable", "isReusable-impl", "getValue", "()I", "equals", "other", "equals-impl", "(ILjava/lang/Object;)Z", TTDownloadField.TT_HASHCODE, "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@f
/* loaded from: classes.dex */
public final class GroupKind {

    @l
    public static final Companion Companion = new Companion(null);
    private static final int Group = m3244constructorimpl(0);
    private static final int Node = m3244constructorimpl(1);
    private static final int ReusableNode = m3244constructorimpl(2);
    private final int value;

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/GroupKind$Companion;", "", "()V", "Group", "Landroidx/compose/runtime/GroupKind;", "getGroup-ULZAiWs", "()I", "I", "Node", "getNode-ULZAiWs", "ReusableNode", "getReusableNode-ULZAiWs", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        /* renamed from: getGroup-ULZAiWs, reason: not valid java name */
        public final int m3252getGroupULZAiWs() {
            return GroupKind.Group;
        }

        /* renamed from: getNode-ULZAiWs, reason: not valid java name */
        public final int m3253getNodeULZAiWs() {
            return GroupKind.Node;
        }

        /* renamed from: getReusableNode-ULZAiWs, reason: not valid java name */
        public final int m3254getReusableNodeULZAiWs() {
            return GroupKind.ReusableNode;
        }
    }

    private /* synthetic */ GroupKind(int i5) {
        this.value = i5;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ GroupKind m3243boximpl(int i5) {
        return new GroupKind(i5);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m3244constructorimpl(int i5) {
        return i5;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3245equalsimpl(int i5, Object obj) {
        return (obj instanceof GroupKind) && i5 == ((GroupKind) obj).m3251unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3246equalsimpl0(int i5, int i6) {
        return i5 == i6;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3247hashCodeimpl(int i5) {
        return Integer.hashCode(i5);
    }

    /* renamed from: isNode-impl, reason: not valid java name */
    public static final boolean m3248isNodeimpl(int i5) {
        return i5 != Companion.m3252getGroupULZAiWs();
    }

    /* renamed from: isReusable-impl, reason: not valid java name */
    public static final boolean m3249isReusableimpl(int i5) {
        return i5 != Companion.m3253getNodeULZAiWs();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3250toStringimpl(int i5) {
        return "GroupKind(value=" + i5 + ')';
    }

    public boolean equals(Object obj) {
        return m3245equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m3247hashCodeimpl(this.value);
    }

    public String toString() {
        return m3250toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3251unboximpl() {
        return this.value;
    }
}
