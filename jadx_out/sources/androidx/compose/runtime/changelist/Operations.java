package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.InternalComposeApi;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.changelist.Operation;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.Arrays;
import java.util.NoSuchElementException;
import kotlin.b1;
import kotlin.collections.e0;
import kotlin.collections.o;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.r2;
import kotlin.ranges.u;
import org.ccil.cowan.tagsoup.p;
import p4.l;
import t0.b;
import u3.f;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0011\b\u0000\u0018\u0000 M2\u00020\u0001:\u0003MNOB\u0007¢\u0006\u0004\bK\u0010LJ\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0002J\f\u0010\f\u001a\u00020\u000b*\u00020\u000bH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0002J\u001a\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0016\u001a\u00020\u00022\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0014H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0012J\u0018\u0010\u0019\u001a\u00020\u000b*\u00060\u0017R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u000bH\u0002J\u0016\u0010\u001b\u001a\u00020\u000b*\u0004\u0018\u00010\u001a2\u0006\u0010\u0018\u001a\u00020\u000bH\u0002J \u0010\u001e\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u001c*\b\u0012\u0004\u0012\u00028\u00000\u001d2\u0006\u0010\u0018\u001a\u00020\u000bH\u0002J\u0006\u0010 \u001a\u00020\u001fJ\u0006\u0010!\u001a\u00020\u001fJ\u0006\u0010\"\u001a\u00020\u0006J\u0010\u0010$\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\rH\u0007J\u000e\u0010%\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\rJ7\u0010%\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\r2\u0017\u0010)\u001a\u0013\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00060&¢\u0006\u0002\b(H\u0086\b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001J\u0006\u0010*\u001a\u00020\u0006J\u000e\u0010,\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u0000J&\u0010.\u001a\u00020\u00062\u001b\u0010-\u001a\u0017\u0012\b\u0012\u00060\u0017R\u00020\u0000\u0012\u0004\u0012\u00020\u00060&¢\u0006\u0002\b(H\u0086\bJ&\u00100\u001a\u00020\u00062\u001b\u0010/\u001a\u0017\u0012\b\u0012\u00060\u0017R\u00020\u0000\u0012\u0004\u0012\u00020\u00060&¢\u0006\u0002\b(H\u0086\bJ\"\u00107\u001a\u00020\u00062\n\u00102\u001a\u0006\u0012\u0002\b\u0003012\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u000205J\b\u00108\u001a\u00020\u000bH\u0017J\u0010\u00109\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000bH\u0016R\u001e\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010=\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010@\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010B\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010>R\u001e\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010E\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010>R\u0016\u0010F\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010>R\u0016\u0010G\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010>R\u0011\u0010J\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bH\u0010I\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006P"}, d2 = {"Landroidx/compose/runtime/changelist/Operations;", "Landroidx/compose/runtime/changelist/OperationsDebugStringFormattable;", "", "currentSize", "requiredSize", "determineNewSize", "Lkotlin/r2;", "ensureIntArgsSizeAtLeast", "ensureObjectArgsSizeAtLeast", "paramCount", "createExpectedArgMask", "", p.f21289y, "Landroidx/compose/runtime/changelist/Operation;", "peekOperation", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "parameter", "topIntIndexOf-w8GmfQM", "(I)I", "topIntIndexOf", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "topObjectIndexOf-31yXWZQ", "topObjectIndexOf", "Landroidx/compose/runtime/changelist/Operations$OpIterator;", "linePrefix", "currentOpToDebugString", "", "formatOpArgumentToString", "T", "", "toCollectionString", "", "isEmpty", "isNotEmpty", "clear", "operation", "pushOp", "push", "Lkotlin/Function1;", "Landroidx/compose/runtime/changelist/Operations$WriteScope;", "Lkotlin/u;", "args", "pop", "other", "popInto", "sink", "drain", "action", "forEach", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "executeAndFlushAllPendingOperations", "toString", "toDebugString", "", "opCodes", "[Landroidx/compose/runtime/changelist/Operation;", "opCodesSize", "I", "", "intArgs", "[I", "intArgsSize", "objectArgs", "[Ljava/lang/Object;", "objectArgsSize", "pushedIntMask", "pushedObjectMask", "getSize", "()I", "size", "<init>", "()V", "Companion", "OpIterator", "WriteScope", "runtime_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nOperations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operations.kt\nandroidx/compose/runtime/changelist/Operations\n*L\n1#1,473:1\n292#1,7:474\n281#1:481\n292#1,7:482\n282#1,2:489\n292#1,7:491\n*S KotlinDebug\n*F\n+ 1 Operations.kt\nandroidx/compose/runtime/changelist/Operations\n*L\n281#1:474,7\n305#1:481\n305#1:482,7\n305#1:489,2\n404#1:491,7\n*E\n"})
/* loaded from: classes.dex */
public final class Operations implements OperationsDebugStringFormattable {
    public static final int InitialCapacity = 16;
    private static final int MaxResizeAmount = 1024;
    private int intArgsSize;
    private int objectArgsSize;
    private int opCodesSize;
    private int pushedIntMask;
    private int pushedObjectMask;

    @l
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @l
    private Operation[] opCodes = new Operation[16];

    @l
    private int[] intArgs = new int[16];

    @l
    private Object[] objectArgs = new Object[16];

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/changelist/Operations$Companion;", "", "()V", "InitialCapacity", "", "MaxResizeAmount", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }
    }

    @i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u0010\u001a\u0002H\u0011\"\u0004\b\u0000\u0010\u00112\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00110\u0012H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/changelist/Operations$OpIterator;", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "(Landroidx/compose/runtime/changelist/Operations;)V", "intIdx", "", "objIdx", "opIdx", "operation", "Landroidx/compose/runtime/changelist/Operation;", "getOperation", "()Landroidx/compose/runtime/changelist/Operation;", "getInt", "parameter", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "getInt-w8GmfQM", "(I)I", "getObject", "T", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "getObject-31yXWZQ", "(I)Ljava/lang/Object;", "next", "", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public final class OpIterator implements OperationArgContainer {
        private int intIdx;
        private int objIdx;
        private int opIdx;

        public OpIterator() {
        }

        @Override // androidx.compose.runtime.changelist.OperationArgContainer
        /* renamed from: getInt-w8GmfQM */
        public int mo3334getIntw8GmfQM(int i5) {
            return Operations.this.intArgs[this.intIdx + i5];
        }

        @Override // androidx.compose.runtime.changelist.OperationArgContainer
        /* renamed from: getObject-31yXWZQ */
        public <T> T mo3335getObject31yXWZQ(int i5) {
            return (T) Operations.this.objectArgs[this.objIdx + i5];
        }

        @l
        public final Operation getOperation() {
            Operation operation = Operations.this.opCodes[this.opIdx];
            l0.m(operation);
            return operation;
        }

        public final boolean next() {
            if (this.opIdx >= Operations.this.opCodesSize) {
                return false;
            }
            Operation operation = getOperation();
            this.intIdx += operation.getInts();
            this.objIdx += operation.getObjects();
            int i5 = this.opIdx + 1;
            this.opIdx = i5;
            if (i5 >= Operations.this.opCodesSize) {
                return false;
            }
            return true;
        }
    }

    @i0(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\"\u0010#J \u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\u000e\u001a\u00020\u0006\"\u0004\b\u0000\u0010\n2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u0005\u001a\u00028\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u001a\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0011\u0010!\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \u0088\u0001\u001c\u0092\u0001\u00020\u001b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Landroidx/compose/runtime/changelist/Operations$WriteScope;", "", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "parameter", "", b.f22420d, "Lkotlin/r2;", "setInt-A6tL2VI", "(Landroidx/compose/runtime/changelist/Operations;II)V", "setInt", "T", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "setObject-DKhxnng", "(Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;)V", "setObject", "", "toString-impl", "(Landroidx/compose/runtime/changelist/Operations;)Ljava/lang/String;", "toString", "hashCode-impl", "(Landroidx/compose/runtime/changelist/Operations;)I", TTDownloadField.TT_HASHCODE, "other", "", "equals-impl", "(Landroidx/compose/runtime/changelist/Operations;Ljava/lang/Object;)Z", "equals", "Landroidx/compose/runtime/changelist/Operations;", "stack", "Landroidx/compose/runtime/changelist/Operations;", "Landroidx/compose/runtime/changelist/Operation;", "getOperation-impl", "(Landroidx/compose/runtime/changelist/Operations;)Landroidx/compose/runtime/changelist/Operation;", "operation", "constructor-impl", "(Landroidx/compose/runtime/changelist/Operations;)Landroidx/compose/runtime/changelist/Operations;", "runtime_release"}, k = 1, mv = {1, 8, 0})
    @f
    /* loaded from: classes.dex */
    public static final class WriteScope {

        @l
        private final Operations stack;

        private /* synthetic */ WriteScope(Operations operations) {
            this.stack = operations;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ WriteScope m3340boximpl(Operations operations) {
            return new WriteScope(operations);
        }

        @l
        /* renamed from: constructor-impl, reason: not valid java name */
        public static Operations m3341constructorimpl(@l Operations operations) {
            return operations;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m3342equalsimpl(Operations operations, Object obj) {
            return (obj instanceof WriteScope) && l0.g(operations, ((WriteScope) obj).m3349unboximpl());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m3343equalsimpl0(Operations operations, Operations operations2) {
            return l0.g(operations, operations2);
        }

        @l
        /* renamed from: getOperation-impl, reason: not valid java name */
        public static final Operation m3344getOperationimpl(Operations operations) {
            return operations.peekOperation();
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m3345hashCodeimpl(Operations operations) {
            return operations.hashCode();
        }

        /* renamed from: setInt-A6tL2VI, reason: not valid java name */
        public static final void m3346setIntA6tL2VI(Operations operations, int i5, int i6) {
            boolean z4 = true;
            int i7 = 1 << i5;
            if ((operations.pushedIntMask & i7) != 0) {
                z4 = false;
            }
            if (z4) {
                operations.pushedIntMask |= i7;
                operations.intArgs[operations.m3338topIntIndexOfw8GmfQM(i5)] = i6;
            } else {
                throw new IllegalStateException(("Already pushed argument " + m3344getOperationimpl(operations).mo3276intParamNamew8GmfQM(i5)).toString());
            }
        }

        /* renamed from: setObject-DKhxnng, reason: not valid java name */
        public static final <T> void m3347setObjectDKhxnng(Operations operations, int i5, T t5) {
            boolean z4 = true;
            int i6 = 1 << i5;
            if ((operations.pushedObjectMask & i6) != 0) {
                z4 = false;
            }
            if (z4) {
                operations.pushedObjectMask |= i6;
                operations.objectArgs[operations.m3339topObjectIndexOf31yXWZQ(i5)] = t5;
            } else {
                throw new IllegalStateException(("Already pushed argument " + m3344getOperationimpl(operations).mo3277objectParamName31yXWZQ(i5)).toString());
            }
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m3348toStringimpl(Operations operations) {
            return "WriteScope(stack=" + operations + ')';
        }

        public boolean equals(Object obj) {
            return m3342equalsimpl(this.stack, obj);
        }

        public int hashCode() {
            return m3345hashCodeimpl(this.stack);
        }

        public String toString() {
            return m3348toStringimpl(this.stack);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ Operations m3349unboximpl() {
            return this.stack;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int createExpectedArgMask(int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (-1) >>> (32 - i5);
    }

    private final String currentOpToDebugString(OpIterator opIterator, String str) {
        Operation operation = opIterator.getOperation();
        if (operation.getInts() == 0 && operation.getObjects() == 0) {
            return operation.getName();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(operation.getName());
        sb.append('(');
        String indent = indent(str);
        int ints = operation.getInts();
        boolean z4 = true;
        for (int i5 = 0; i5 < ints; i5++) {
            int m3302constructorimpl = Operation.IntParameter.m3302constructorimpl(i5);
            String mo3276intParamNamew8GmfQM = operation.mo3276intParamNamew8GmfQM(m3302constructorimpl);
            if (!z4) {
                sb.append(", ");
            } else {
                z4 = false;
            }
            sb.append('\n');
            l0.o(sb, "append('\\n')");
            sb.append(indent);
            sb.append(mo3276intParamNamew8GmfQM);
            sb.append(" = ");
            sb.append(opIterator.mo3334getIntw8GmfQM(m3302constructorimpl));
        }
        int objects = operation.getObjects();
        for (int i6 = 0; i6 < objects; i6++) {
            int m3313constructorimpl = Operation.ObjectParameter.m3313constructorimpl(i6);
            String mo3277objectParamName31yXWZQ = operation.mo3277objectParamName31yXWZQ(m3313constructorimpl);
            if (!z4) {
                sb.append(", ");
            } else {
                z4 = false;
            }
            sb.append('\n');
            l0.o(sb, "append('\\n')");
            sb.append(indent);
            sb.append(mo3277objectParamName31yXWZQ);
            sb.append(" = ");
            sb.append(formatOpArgumentToString(opIterator.mo3335getObject31yXWZQ(m3313constructorimpl), indent));
        }
        sb.append('\n');
        l0.o(sb, "append('\\n')");
        sb.append(str);
        sb.append(")");
        String sb2 = sb.toString();
        l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    private final int determineNewSize(int i5, int i6) {
        int B;
        int u4;
        B = u.B(i5, 1024);
        u4 = u.u(i5 + B, i6);
        return u4;
    }

    private final void ensureIntArgsSizeAtLeast(int i5) {
        int[] iArr = this.intArgs;
        int length = iArr.length;
        if (i5 > length) {
            int[] copyOf = Arrays.copyOf(iArr, determineNewSize(length, i5));
            l0.o(copyOf, "copyOf(this, newSize)");
            this.intArgs = copyOf;
        }
    }

    private final void ensureObjectArgsSizeAtLeast(int i5) {
        Object[] objArr = this.objectArgs;
        int length = objArr.length;
        if (i5 > length) {
            Object[] copyOf = Arrays.copyOf(objArr, determineNewSize(length, i5));
            l0.o(copyOf, "copyOf(this, newSize)");
            this.objectArgs = copyOf;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String formatOpArgumentToString(Object obj, String str) {
        Iterable x5;
        Iterable y5;
        Iterable A5;
        Iterable z5;
        Iterable B5;
        if (obj == null) {
            return "null";
        }
        if (obj instanceof Object[]) {
            B5 = kotlin.collections.p.B5((Object[]) obj);
            return toCollectionString(B5, str);
        }
        if (obj instanceof int[]) {
            z5 = kotlin.collections.p.z5((int[]) obj);
            return toCollectionString(z5, str);
        }
        if (obj instanceof long[]) {
            A5 = kotlin.collections.p.A5((long[]) obj);
            return toCollectionString(A5, str);
        }
        if (obj instanceof float[]) {
            y5 = kotlin.collections.p.y5((float[]) obj);
            return toCollectionString(y5, str);
        }
        if (obj instanceof double[]) {
            x5 = kotlin.collections.p.x5((double[]) obj);
            return toCollectionString(x5, str);
        }
        if (obj instanceof Iterable) {
            return toCollectionString((Iterable) obj, str);
        }
        if (obj instanceof OperationsDebugStringFormattable) {
            return ((OperationsDebugStringFormattable) obj).toDebugString(str);
        }
        return obj.toString();
    }

    private final String indent(String str) {
        return str + "    ";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Operation peekOperation() {
        Operation operation = this.opCodes[this.opCodesSize - 1];
        l0.m(operation);
        return operation;
    }

    private final <T> String toCollectionString(Iterable<? extends T> iterable, String str) {
        String j32;
        j32 = e0.j3(iterable, ", ", "[", "]", 0, null, new Operations$toCollectionString$1(this, str), 24, null);
        return j32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: topIntIndexOf-w8GmfQM, reason: not valid java name */
    public final int m3338topIntIndexOfw8GmfQM(int i5) {
        return (this.intArgsSize - peekOperation().getInts()) + i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: topObjectIndexOf-31yXWZQ, reason: not valid java name */
    public final int m3339topObjectIndexOf31yXWZQ(int i5) {
        return (this.objectArgsSize - peekOperation().getObjects()) + i5;
    }

    public final void clear() {
        this.opCodesSize = 0;
        this.intArgsSize = 0;
        o.M1(this.objectArgs, null, 0, this.objectArgsSize);
        this.objectArgsSize = 0;
    }

    public final void drain(@l v3.l<? super OpIterator, r2> lVar) {
        if (isNotEmpty()) {
            OpIterator opIterator = new OpIterator();
            do {
                lVar.invoke(opIterator);
            } while (opIterator.next());
        }
        clear();
    }

    public final void executeAndFlushAllPendingOperations(@l Applier<?> applier, @l SlotWriter slotWriter, @l RememberManager rememberManager) {
        if (isNotEmpty()) {
            OpIterator opIterator = new OpIterator();
            do {
                opIterator.getOperation().execute(opIterator, applier, slotWriter, rememberManager);
            } while (opIterator.next());
        }
        clear();
    }

    public final void forEach(@l v3.l<? super OpIterator, r2> lVar) {
        if (isNotEmpty()) {
            OpIterator opIterator = new OpIterator();
            do {
                lVar.invoke(opIterator);
            } while (opIterator.next());
        }
    }

    public final int getSize() {
        return this.opCodesSize;
    }

    public final boolean isEmpty() {
        return getSize() == 0;
    }

    public final boolean isNotEmpty() {
        return getSize() != 0;
    }

    public final void pop() {
        if (!isEmpty()) {
            Operation[] operationArr = this.opCodes;
            int i5 = this.opCodesSize - 1;
            this.opCodesSize = i5;
            Operation operation = operationArr[i5];
            l0.m(operation);
            this.opCodes[this.opCodesSize] = null;
            int objects = operation.getObjects();
            for (int i6 = 0; i6 < objects; i6++) {
                Object[] objArr = this.objectArgs;
                int i7 = this.objectArgsSize - 1;
                this.objectArgsSize = i7;
                objArr[i7] = null;
            }
            int ints = operation.getInts();
            for (int i8 = 0; i8 < ints; i8++) {
                int[] iArr = this.intArgs;
                int i9 = this.intArgsSize - 1;
                this.intArgsSize = i9;
                iArr[i9] = 0;
            }
            return;
        }
        throw new NoSuchElementException("Cannot pop(), because the stack is empty.");
    }

    public final void popInto(@l Operations operations) {
        if (!isEmpty()) {
            Operation[] operationArr = this.opCodes;
            int i5 = this.opCodesSize - 1;
            this.opCodesSize = i5;
            Operation operation = operationArr[i5];
            l0.m(operation);
            this.opCodes[this.opCodesSize] = null;
            operations.pushOp(operation);
            int i6 = this.objectArgsSize;
            int i7 = operations.objectArgsSize;
            int objects = operation.getObjects();
            for (int i8 = 0; i8 < objects; i8++) {
                i7--;
                i6--;
                Object[] objArr = operations.objectArgs;
                Object[] objArr2 = this.objectArgs;
                objArr[i7] = objArr2[i6];
                objArr2[i6] = null;
            }
            int i9 = this.intArgsSize;
            int i10 = operations.intArgsSize;
            int ints = operation.getInts();
            for (int i11 = 0; i11 < ints; i11++) {
                i10--;
                i9--;
                int[] iArr = operations.intArgs;
                int[] iArr2 = this.intArgs;
                iArr[i10] = iArr2[i9];
                iArr2[i9] = 0;
            }
            this.objectArgsSize -= operation.getObjects();
            this.intArgsSize -= operation.getInts();
            return;
        }
        throw new NoSuchElementException("Cannot pop(), because the stack is empty.");
    }

    public final void push(@l Operation operation) {
        if (operation.getInts() == 0 && operation.getObjects() == 0) {
            pushOp(operation);
            return;
        }
        throw new IllegalArgumentException(("Cannot push " + operation + " without arguments because it expects " + operation.getInts() + " ints and " + operation.getObjects() + " objects.").toString());
    }

    @InternalComposeApi
    public final void pushOp(@l Operation operation) {
        int B;
        this.pushedIntMask = 0;
        this.pushedObjectMask = 0;
        int i5 = this.opCodesSize;
        if (i5 == this.opCodes.length) {
            B = u.B(i5, 1024);
            Object[] copyOf = Arrays.copyOf(this.opCodes, this.opCodesSize + B);
            l0.o(copyOf, "copyOf(this, newSize)");
            this.opCodes = (Operation[]) copyOf;
        }
        ensureIntArgsSizeAtLeast(this.intArgsSize + operation.getInts());
        ensureObjectArgsSizeAtLeast(this.objectArgsSize + operation.getObjects());
        Operation[] operationArr = this.opCodes;
        int i6 = this.opCodesSize;
        this.opCodesSize = i6 + 1;
        operationArr[i6] = operation;
        this.intArgsSize += operation.getInts();
        this.objectArgsSize += operation.getObjects();
    }

    @Override // androidx.compose.runtime.changelist.OperationsDebugStringFormattable
    @l
    public String toDebugString(@l String str) {
        StringBuilder sb = new StringBuilder();
        if (isNotEmpty()) {
            OpIterator opIterator = new OpIterator();
            int i5 = 1;
            while (true) {
                sb.append(str);
                int i6 = i5 + 1;
                sb.append(i5);
                sb.append(". ");
                sb.append(currentOpToDebugString(opIterator, str));
                l0.o(sb, "append(value)");
                sb.append('\n');
                l0.o(sb, "append('\\n')");
                if (!opIterator.next()) {
                    break;
                }
                i5 = i6;
            }
        }
        String sb2 = sb.toString();
        l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @l
    @k(message = "toString() will return the default implementation from Any. Did you mean to use toDebugString()?", replaceWith = @b1(expression = "toDebugString()", imports = {}))
    public String toString() {
        return super.toString();
    }

    public final void push(@l Operation operation, @l v3.l<? super WriteScope, r2> lVar) {
        pushOp(operation);
        lVar.invoke(WriteScope.m3340boximpl(WriteScope.m3341constructorimpl(this)));
        if (this.pushedIntMask == createExpectedArgMask(operation.getInts()) && this.pushedObjectMask == createExpectedArgMask(operation.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = operation.getInts();
        int i5 = 0;
        for (int i6 = 0; i6 < ints; i6++) {
            if (((1 << i6) & this.pushedIntMask) != 0) {
                if (i5 > 0) {
                    sb.append(", ");
                }
                sb.append(operation.mo3276intParamNamew8GmfQM(Operation.IntParameter.m3302constructorimpl(i6)));
                i5++;
            }
        }
        String sb2 = sb.toString();
        l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int objects = operation.getObjects();
        int i7 = 0;
        for (int i8 = 0; i8 < objects; i8++) {
            if (((1 << i8) & this.pushedObjectMask) != 0) {
                if (i5 > 0) {
                    sb3.append(", ");
                }
                sb3.append(operation.mo3277objectParamName31yXWZQ(Operation.ObjectParameter.m3313constructorimpl(i8)));
                i7++;
            }
        }
        String sb4 = sb3.toString();
        l0.o(sb4, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + operation + ". Not all arguments were provided. Missing " + i5 + " int arguments (" + sb2 + ") and " + i7 + " object arguments (" + sb4 + ").").toString());
    }
}
