package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "motionEvent", "Landroid/view/MotionEvent;", "invoke", "(Landroid/view/MotionEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PointerInteropFilter_androidKt$pointerInteropFilter$3 extends n0 implements l<MotionEvent, Boolean> {
    final /* synthetic */ AndroidViewHolder $view;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointerInteropFilter_androidKt$pointerInteropFilter$3(AndroidViewHolder androidViewHolder) {
        super(1);
        this.$view = androidViewHolder;
    }

    @Override // v3.l
    @p4.l
    public final Boolean invoke(@p4.l MotionEvent motionEvent) {
        boolean dispatchTouchEvent;
        switch (motionEvent.getActionMasked()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                dispatchTouchEvent = this.$view.dispatchTouchEvent(motionEvent);
                break;
            default:
                dispatchTouchEvent = this.$view.dispatchGenericMotionEvent(motionEvent);
                break;
        }
        return Boolean.valueOf(dispatchTouchEvent);
    }
}
