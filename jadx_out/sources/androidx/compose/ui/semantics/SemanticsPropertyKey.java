package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.w;
import kotlin.reflect.o;
import p4.l;
import p4.m;
import t0.b;
import v3.p;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B/\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u001e\b\u0002\u0010\u0018\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0017¢\u0006\u0004\b\"\u0010#B\u0019\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u001e\u001a\u00020\u001c¢\u0006\u0004\b\"\u0010$B7\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u001e\u001a\u00020\u001c\u0012\u001c\u0010\u0018\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0017¢\u0006\u0004\b\"\u0010%J!\u0010\u0005\u001a\u0004\u0018\u00018\u00002\b\u0010\u0003\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u000b\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\r\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u0017\u0010\u0013\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R0\u0010\u0018\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR$\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006&"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "T", "", "parentValue", "childValue", "merge", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "thisRef", "Lkotlin/reflect/o;", "property", "getValue", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Lkotlin/reflect/o;)Ljava/lang/Object;", b.f22420d, "Lkotlin/r2;", "setValue", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Lkotlin/reflect/o;Ljava/lang/Object;)V", "", "toString", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lkotlin/Function2;", "mergePolicy", "Lv3/p;", "getMergePolicy$ui_release", "()Lv3/p;", "", "<set-?>", "isImportantForAccessibility", "Z", "isImportantForAccessibility$ui_release", "()Z", "<init>", "(Ljava/lang/String;Lv3/p;)V", "(Ljava/lang/String;Z)V", "(Ljava/lang/String;ZLv3/p;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SemanticsPropertyKey<T> {
    public static final int $stable = 8;
    private boolean isImportantForAccessibility;

    @l
    private final p<T, T, T> mergePolicy;

    @l
    private final String name;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u0004\n\u0002\b\u0006\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u00012\b\u0010\u0002\u001a\u0004\u0018\u0001H\u00012\u0006\u0010\u0003\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "T", "parentValue", "childValue", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.semantics.SemanticsPropertyKey$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements p<T, T, T> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(2);
        }

        @Override // v3.p
        @m
        public final T invoke(@m T t5, T t6) {
            return t5 == null ? t6 : t5;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SemanticsPropertyKey(@l String str, @l p<? super T, ? super T, ? extends T> pVar) {
        this.name = str;
        this.mergePolicy = pVar;
    }

    @l
    public final p<T, T, T> getMergePolicy$ui_release() {
        return this.mergePolicy;
    }

    @l
    public final String getName() {
        return this.name;
    }

    public final T getValue(@l SemanticsPropertyReceiver semanticsPropertyReceiver, @l o<?> oVar) {
        return (T) SemanticsPropertiesKt.access$throwSemanticsGetNotSupported();
    }

    public final boolean isImportantForAccessibility$ui_release() {
        return this.isImportantForAccessibility;
    }

    @m
    public final T merge(@m T t5, T t6) {
        return this.mergePolicy.invoke(t5, t6);
    }

    public final void setValue(@l SemanticsPropertyReceiver semanticsPropertyReceiver, @l o<?> oVar, T t5) {
        semanticsPropertyReceiver.set(this, t5);
    }

    @l
    public String toString() {
        return "AccessibilityKey: " + this.name;
    }

    public /* synthetic */ SemanticsPropertyKey(String str, p pVar, int i5, w wVar) {
        this(str, (i5 & 2) != 0 ? AnonymousClass1.INSTANCE : pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SemanticsPropertyKey(@l String str, boolean z4) {
        this(str, null, 2, 0 == true ? 1 : 0);
        this.isImportantForAccessibility = z4;
    }

    public SemanticsPropertyKey(@l String str, boolean z4, @l p<? super T, ? super T, ? extends T> pVar) {
        this(str, pVar);
        this.isImportantForAccessibility = z4;
    }
}
