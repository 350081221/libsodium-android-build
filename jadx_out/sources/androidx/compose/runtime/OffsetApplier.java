package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.umeng.analytics.pro.d;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.y;
import p4.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0016\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016J \u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016J\b\u0010\u0013\u001a\u00020\u0004H\u0016R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u001b\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Landroidx/compose/runtime/OffsetApplier;", "N", "Landroidx/compose/runtime/Applier;", "node", "Lkotlin/r2;", "down", "(Ljava/lang/Object;)V", d.R, "", "index", "instance", "insertTopDown", "(ILjava/lang/Object;)V", "insertBottomUp", "count", "remove", TypedValues.TransitionType.S_FROM, TypedValues.TransitionType.S_TO, "move", "clear", "applier", "Landroidx/compose/runtime/Applier;", TypedValues.CycleType.S_WAVE_OFFSET, "I", "nesting", "getCurrent", "()Ljava/lang/Object;", "current", "<init>", "(Landroidx/compose/runtime/Applier;I)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nApplier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Applier.kt\nandroidx/compose/runtime/OffsetApplier\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,289:1\n4178#2,5:290\n4178#2,5:295\n*S KotlinDebug\n*F\n+ 1 Applier.kt\nandroidx/compose/runtime/OffsetApplier\n*L\n263#1:290,5\n286#1:295,5\n*E\n"})
/* loaded from: classes.dex */
public final class OffsetApplier<N> implements Applier<N> {
    public static final int $stable = 8;

    @l
    private final Applier<N> applier;
    private int nesting;
    private final int offset;

    public OffsetApplier(@l Applier<N> applier, int i5) {
        this.applier = applier;
        this.offset = i5;
    }

    @Override // androidx.compose.runtime.Applier
    public void clear() {
        ComposerKt.composeRuntimeError("Clear is not valid on OffsetApplier".toString());
        throw new y();
    }

    @Override // androidx.compose.runtime.Applier
    public void down(N n5) {
        this.nesting++;
        this.applier.down(n5);
    }

    @Override // androidx.compose.runtime.Applier
    public N getCurrent() {
        return this.applier.getCurrent();
    }

    @Override // androidx.compose.runtime.Applier
    public void insertBottomUp(int i5, N n5) {
        this.applier.insertBottomUp(i5 + (this.nesting == 0 ? this.offset : 0), n5);
    }

    @Override // androidx.compose.runtime.Applier
    public void insertTopDown(int i5, N n5) {
        this.applier.insertTopDown(i5 + (this.nesting == 0 ? this.offset : 0), n5);
    }

    @Override // androidx.compose.runtime.Applier
    public void move(int i5, int i6, int i7) {
        int i8;
        if (this.nesting == 0) {
            i8 = this.offset;
        } else {
            i8 = 0;
        }
        this.applier.move(i5 + i8, i6 + i8, i7);
    }

    @Override // androidx.compose.runtime.Applier
    public void remove(int i5, int i6) {
        this.applier.remove(i5 + (this.nesting == 0 ? this.offset : 0), i6);
    }

    @Override // androidx.compose.runtime.Applier
    public void up() {
        boolean z4;
        int i5 = this.nesting;
        if (i5 > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            this.nesting = i5 - 1;
            this.applier.up();
        } else {
            ComposerKt.composeRuntimeError("OffsetApplier up called with no corresponding down".toString());
            throw new y();
        }
    }
}
