package androidx.compose.ui.platform;

import android.os.Handler;
import android.view.Choreographer;
import java.util.List;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"androidx/compose/ui/platform/AndroidUiDispatcher$dispatchCallback$1", "Landroid/view/Choreographer$FrameCallback;", "Ljava/lang/Runnable;", "Lkotlin/r2;", "run", "", "frameTimeNanos", "doFrame", "ui_release"}, k = 1, mv = {1, 8, 0})
@kotlin.jvm.internal.r1({"SMAP\nAndroidUiDispatcher.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidUiDispatcher.android.kt\nandroidx/compose/ui/platform/AndroidUiDispatcher$dispatchCallback$1\n+ 2 JvmActuals.jvm.kt\nandroidx/compose/ui/platform/JvmActuals_jvmKt\n*L\n1#1,191:1\n35#2:192\n*S KotlinDebug\n*F\n+ 1 AndroidUiDispatcher.android.kt\nandroidx/compose/ui/platform/AndroidUiDispatcher$dispatchCallback$1\n*L\n58#1:192\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidUiDispatcher$dispatchCallback$1 implements Choreographer.FrameCallback, Runnable {
    final /* synthetic */ AndroidUiDispatcher this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AndroidUiDispatcher$dispatchCallback$1(AndroidUiDispatcher androidUiDispatcher) {
        this.this$0 = androidUiDispatcher;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j5) {
        Handler handler;
        handler = this.this$0.handler;
        handler.removeCallbacks(this);
        this.this$0.performTrampolineDispatch();
        this.this$0.performFrameDispatch(j5);
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        List list;
        this.this$0.performTrampolineDispatch();
        obj = this.this$0.lock;
        AndroidUiDispatcher androidUiDispatcher = this.this$0;
        synchronized (obj) {
            list = androidUiDispatcher.toRunOnFrame;
            if (list.isEmpty()) {
                androidUiDispatcher.getChoreographer().removeFrameCallback(this);
                androidUiDispatcher.scheduledFrameDispatch = false;
            }
            r2 r2Var = r2.f19517a;
        }
    }
}
