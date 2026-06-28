package androidx.compose.ui.input.pointer;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.ui.geometry.Offset;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.i0;
import kotlin.r2;
import p4.l;

@i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a2\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a2\u0010\u000b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\n\u0010\b\u001a&\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\f2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0000\u001a:\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerEvent;", "Landroidx/compose/ui/geometry/Offset;", TypedValues.CycleType.S_WAVE_OFFSET, "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "Lkotlin/r2;", "block", "toMotionEventScope-d-4ec7I", "(Landroidx/compose/ui/input/pointer/PointerEvent;JLv3/l;)V", "toMotionEventScope", "toCancelMotionEventScope-d-4ec7I", "toCancelMotionEventScope", "", "nowMillis", "emptyCancelMotionEventScope", "", "cancel", "toMotionEventScope-ubNVwUQ", "(Landroidx/compose/ui/input/pointer/PointerEvent;JLv3/l;Z)V", "ui_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class PointerInteropUtils_androidKt {
    public static final void emptyCancelMotionEventScope(long j5, @l v3.l<? super MotionEvent, r2> lVar) {
        MotionEvent obtain = MotionEvent.obtain(j5, j5, 3, 0.0f, 0.0f, 0);
        obtain.setSource(0);
        lVar.invoke(obtain);
        obtain.recycle();
    }

    public static /* synthetic */ void emptyCancelMotionEventScope$default(long j5, v3.l lVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            j5 = SystemClock.uptimeMillis();
        }
        emptyCancelMotionEventScope(j5, lVar);
    }

    /* renamed from: toCancelMotionEventScope-d-4ec7I, reason: not valid java name */
    public static final void m4931toCancelMotionEventScoped4ec7I(@l PointerEvent pointerEvent, long j5, @l v3.l<? super MotionEvent, r2> lVar) {
        m4933toMotionEventScopeubNVwUQ(pointerEvent, j5, lVar, true);
    }

    /* renamed from: toMotionEventScope-d-4ec7I, reason: not valid java name */
    public static final void m4932toMotionEventScoped4ec7I(@l PointerEvent pointerEvent, long j5, @l v3.l<? super MotionEvent, r2> lVar) {
        m4933toMotionEventScopeubNVwUQ(pointerEvent, j5, lVar, false);
    }

    /* renamed from: toMotionEventScope-ubNVwUQ, reason: not valid java name */
    private static final void m4933toMotionEventScopeubNVwUQ(PointerEvent pointerEvent, long j5, v3.l<? super MotionEvent, r2> lVar, boolean z4) {
        MotionEvent motionEvent$ui_release = pointerEvent.getMotionEvent$ui_release();
        if (motionEvent$ui_release != null) {
            int action = motionEvent$ui_release.getAction();
            if (z4) {
                motionEvent$ui_release.setAction(3);
            }
            motionEvent$ui_release.offsetLocation(-Offset.m3493getXimpl(j5), -Offset.m3494getYimpl(j5));
            lVar.invoke(motionEvent$ui_release);
            motionEvent$ui_release.offsetLocation(Offset.m3493getXimpl(j5), Offset.m3494getYimpl(j5));
            motionEvent$ui_release.setAction(action);
            return;
        }
        throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.".toString());
    }
}
