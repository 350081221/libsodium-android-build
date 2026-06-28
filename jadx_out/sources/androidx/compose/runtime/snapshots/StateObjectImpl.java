package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.AtomicInt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0011"}, d2 = {"Landroidx/compose/runtime/snapshots/StateObjectImpl;", "Landroidx/compose/runtime/snapshots/StateObject;", "Landroidx/compose/runtime/snapshots/ReaderKind;", "reader", "Lkotlin/r2;", "recordReadIn-h_f27i8$runtime_release", "(I)V", "recordReadIn", "", "isReadIn-h_f27i8$runtime_release", "(I)Z", "isReadIn", "Landroidx/compose/runtime/AtomicInt;", "readerKind", "Landroidx/compose/runtime/AtomicInt;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nStateObjectImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/StateObjectImpl\n+ 2 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/ReaderKind\n*L\n1#1,55:1\n47#2:56\n45#2:57\n47#2:58\n*S KotlinDebug\n*F\n+ 1 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/StateObjectImpl\n*L\n32#1:56\n34#1:57\n39#1:58\n*E\n"})
/* loaded from: classes.dex */
public abstract class StateObjectImpl implements StateObject {
    public static final int $stable = 0;

    @l
    private final AtomicInt readerKind = new AtomicInt(0);

    /* renamed from: isReadIn-h_f27i8$runtime_release, reason: not valid java name */
    public final boolean m3368isReadInh_f27i8$runtime_release(int i5) {
        return (i5 & ReaderKind.m3356constructorimpl(this.readerKind.get())) != 0;
    }

    /* renamed from: recordReadIn-h_f27i8$runtime_release, reason: not valid java name */
    public final void m3369recordReadInh_f27i8$runtime_release(int i5) {
        int m3356constructorimpl;
        boolean z4;
        do {
            m3356constructorimpl = ReaderKind.m3356constructorimpl(this.readerKind.get());
            if ((m3356constructorimpl & i5) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                return;
            }
        } while (!this.readerKind.compareAndSet(m3356constructorimpl, ReaderKind.m3356constructorimpl(m3356constructorimpl | i5)));
    }
}
