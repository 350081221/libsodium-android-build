package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;

@i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a,\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0007\u001a\u0014\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0001\u001a/\u0010\u000f\u001a\u00020\u0000*\u00020\u00002!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0003H\u0007¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/input/pointer/RequestDisallowInterceptTouchEvent;", "requestDisallowInterceptTouchEvent", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "", "onTouchEvent", "pointerInteropFilter", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "view", "Lkotlin/v0;", "name", "motionEvent", "Lkotlin/r2;", "watcher", "motionEventSpy", "ui_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nPointerInteropFilter.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInteropFilter.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropFilter_androidKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,352:1\n135#2:353\n*S KotlinDebug\n*F\n+ 1 PointerInteropFilter.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropFilter_androidKt\n*L\n73#1:353\n*E\n"})
/* loaded from: classes.dex */
public final class PointerInteropFilter_androidKt {
    @l
    @ExperimentalComposeUiApi
    public static final Modifier motionEventSpy(@l Modifier modifier, @l v3.l<? super MotionEvent, r2> lVar) {
        return SuspendingPointerInputFilterKt.pointerInput(modifier, lVar, new PointerInteropFilter_androidKt$motionEventSpy$1(lVar, null));
    }

    @l
    @ExperimentalComposeUiApi
    public static final Modifier pointerInteropFilter(@l Modifier modifier, @l AndroidViewHolder androidViewHolder) {
        PointerInteropFilter pointerInteropFilter = new PointerInteropFilter();
        pointerInteropFilter.setOnTouchEvent(new PointerInteropFilter_androidKt$pointerInteropFilter$3(androidViewHolder));
        RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent = new RequestDisallowInterceptTouchEvent();
        pointerInteropFilter.setRequestDisallowInterceptTouchEvent(requestDisallowInterceptTouchEvent);
        androidViewHolder.setOnRequestDisallowInterceptTouchEvent$ui_release(requestDisallowInterceptTouchEvent);
        return modifier.then(pointerInteropFilter);
    }

    public static /* synthetic */ Modifier pointerInteropFilter$default(Modifier modifier, RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent, v3.l lVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            requestDisallowInterceptTouchEvent = null;
        }
        return pointerInteropFilter(modifier, requestDisallowInterceptTouchEvent, lVar);
    }

    @l
    @ExperimentalComposeUiApi
    public static final Modifier pointerInteropFilter(@l Modifier modifier, @m RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent, @l v3.l<? super MotionEvent, Boolean> lVar) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new PointerInteropFilter_androidKt$pointerInteropFilter$$inlined$debugInspectorInfo$1(requestDisallowInterceptTouchEvent, lVar) : InspectableValueKt.getNoInspectorInfo(), new PointerInteropFilter_androidKt$pointerInteropFilter$2(lVar, requestDisallowInterceptTouchEvent));
    }
}
