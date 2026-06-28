package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.IntSize;
import kotlin.i0;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0011\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b$\u0010\"J*\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\b\u0010\f\u001a\u00020\bH&R$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0015\u001a\u00020\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001d\u001a\u00020\u00068Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0018R\u001a\u0010#\u001a\u00020\u00148VX\u0096\u0004¢\u0006\f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006%"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputFilter;", "", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Landroidx/compose/ui/unit/IntSize;", "bounds", "Lkotlin/r2;", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onPointerEvent", "onCancel", "Landroidx/compose/ui/layout/LayoutCoordinates;", "layoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getLayoutCoordinates$ui_release", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "setLayoutCoordinates$ui_release", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "", "isAttached", "Z", "isAttached$ui_release", "()Z", "setAttached$ui_release", "(Z)V", "getSize-YbymL2g", "()J", "size", "getInterceptOutOfBoundsChildEvents", "interceptOutOfBoundsChildEvents", "getShareWithSiblings", "getShareWithSiblings$annotations", "()V", "shareWithSiblings", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public abstract class PointerInputFilter {
    public static final int $stable = 8;
    private boolean isAttached;

    @m
    private LayoutCoordinates layoutCoordinates;

    public static /* synthetic */ void getShareWithSiblings$annotations() {
    }

    public boolean getInterceptOutOfBoundsChildEvents() {
        return false;
    }

    @m
    public final LayoutCoordinates getLayoutCoordinates$ui_release() {
        return this.layoutCoordinates;
    }

    public boolean getShareWithSiblings() {
        return false;
    }

    /* renamed from: getSize-YbymL2g, reason: not valid java name */
    public final long m4895getSizeYbymL2g() {
        LayoutCoordinates layoutCoordinates = this.layoutCoordinates;
        return layoutCoordinates != null ? layoutCoordinates.mo5005getSizeYbymL2g() : IntSize.Companion.m6219getZeroYbymL2g();
    }

    public final boolean isAttached$ui_release() {
        return this.isAttached;
    }

    public abstract void onCancel();

    /* renamed from: onPointerEvent-H0pRuoY, reason: not valid java name */
    public abstract void mo4896onPointerEventH0pRuoY(@l PointerEvent pointerEvent, @l PointerEventPass pointerEventPass, long j5);

    public final void setAttached$ui_release(boolean z4) {
        this.isAttached = z4;
    }

    public final void setLayoutCoordinates$ui_release(@m LayoutCoordinates layoutCoordinates) {
        this.layoutCoordinates = layoutCoordinates;
    }
}
