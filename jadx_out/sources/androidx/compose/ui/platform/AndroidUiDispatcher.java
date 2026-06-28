package androidx.compose.ui.platform;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.HandlerCompat;
import java.util.ArrayList;
import java.util.List;
import kotlin.r2;

@StabilityInferred(parameters = 0)
@kotlin.i0(d1 = {"\u0000k\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b*\u0001*\b\u0007\u0018\u0000 42\u00020\u0001:\u00014B\u0019\b\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b2\u00103J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000e\u0010\fJ\u0018\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0002H\u0016R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\t0\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010$R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010(R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0017\u0010.\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00065"}, d2 = {"Landroidx/compose/ui/platform/AndroidUiDispatcher;", "Lkotlinx/coroutines/n0;", "Ljava/lang/Runnable;", "nextTask", "Lkotlin/r2;", "performTrampolineDispatch", "", "frameTimeNanos", "performFrameDispatch", "Landroid/view/Choreographer$FrameCallback;", "callback", "postFrameCallback$ui_release", "(Landroid/view/Choreographer$FrameCallback;)V", "postFrameCallback", "removeFrameCallback$ui_release", "removeFrameCallback", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "block", "dispatch", "Landroid/view/Choreographer;", "choreographer", "Landroid/view/Choreographer;", "getChoreographer", "()Landroid/view/Choreographer;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "", "lock", "Ljava/lang/Object;", "Lkotlin/collections/k;", "toRunTrampolined", "Lkotlin/collections/k;", "", "toRunOnFrame", "Ljava/util/List;", "spareToRunOnFrame", "", "scheduledTrampolineDispatch", "Z", "scheduledFrameDispatch", "androidx/compose/ui/platform/AndroidUiDispatcher$dispatchCallback$1", "dispatchCallback", "Landroidx/compose/ui/platform/AndroidUiDispatcher$dispatchCallback$1;", "Landroidx/compose/runtime/MonotonicFrameClock;", "frameClock", "Landroidx/compose/runtime/MonotonicFrameClock;", "getFrameClock", "()Landroidx/compose/runtime/MonotonicFrameClock;", "<init>", "(Landroid/view/Choreographer;Landroid/os/Handler;)V", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0})
@kotlin.jvm.internal.r1({"SMAP\nAndroidUiDispatcher.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidUiDispatcher.android.kt\nandroidx/compose/ui/platform/AndroidUiDispatcher\n+ 2 JvmActuals.jvm.kt\nandroidx/compose/ui/platform/JvmActuals_jvmKt\n*L\n1#1,191:1\n35#2:192\n35#2:193\n35#2:194\n35#2:195\n35#2:196\n35#2:197\n*S KotlinDebug\n*F\n+ 1 AndroidUiDispatcher.android.kt\nandroidx/compose/ui/platform/AndroidUiDispatcher\n*L\n73#1:192\n89#1:193\n99#1:194\n115#1:195\n125#1:196\n137#1:197\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidUiDispatcher extends kotlinx.coroutines.n0 {

    @p4.l
    private static final kotlin.d0<kotlin.coroutines.g> Main$delegate;

    @p4.l
    private static final ThreadLocal<kotlin.coroutines.g> currentThread;

    @p4.l
    private final Choreographer choreographer;

    @p4.l
    private final AndroidUiDispatcher$dispatchCallback$1 dispatchCallback;

    @p4.l
    private final MonotonicFrameClock frameClock;

    @p4.l
    private final Handler handler;

    @p4.l
    private final Object lock;
    private boolean scheduledFrameDispatch;
    private boolean scheduledTrampolineDispatch;

    @p4.l
    private List<Choreographer.FrameCallback> spareToRunOnFrame;

    @p4.l
    private List<Choreographer.FrameCallback> toRunOnFrame;

    @p4.l
    private final kotlin.collections.k<Runnable> toRunTrampolined;

    @p4.l
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @kotlin.i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0007\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/platform/AndroidUiDispatcher$Companion;", "", "Lkotlin/coroutines/g;", "Main$delegate", "Lkotlin/d0;", "getMain", "()Lkotlin/coroutines/g;", "Main", "getCurrentThread", "CurrentThread", "Ljava/lang/ThreadLocal;", "currentThread", "Ljava/lang/ThreadLocal;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
            this();
        }

        @p4.l
        public final kotlin.coroutines.g getCurrentThread() {
            boolean isMainThread;
            isMainThread = AndroidUiDispatcher_androidKt.isMainThread();
            if (isMainThread) {
                return getMain();
            }
            kotlin.coroutines.g gVar = (kotlin.coroutines.g) AndroidUiDispatcher.currentThread.get();
            if (gVar != null) {
                return gVar;
            }
            throw new IllegalStateException("no AndroidUiDispatcher for this thread".toString());
        }

        @p4.l
        public final kotlin.coroutines.g getMain() {
            return (kotlin.coroutines.g) AndroidUiDispatcher.Main$delegate.getValue();
        }
    }

    static {
        kotlin.d0<kotlin.coroutines.g> c5;
        c5 = kotlin.f0.c(AndroidUiDispatcher$Companion$Main$2.INSTANCE);
        Main$delegate = c5;
        currentThread = new ThreadLocal<kotlin.coroutines.g>() { // from class: androidx.compose.ui.platform.AndroidUiDispatcher$Companion$currentThread$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // java.lang.ThreadLocal
            @p4.l
            public kotlin.coroutines.g initialValue() {
                Choreographer choreographer = Choreographer.getInstance();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    AndroidUiDispatcher androidUiDispatcher = new AndroidUiDispatcher(choreographer, HandlerCompat.createAsync(myLooper), null);
                    return androidUiDispatcher.plus(androidUiDispatcher.getFrameClock());
                }
                throw new IllegalStateException("no Looper on this thread".toString());
            }
        };
    }

    private AndroidUiDispatcher(Choreographer choreographer, Handler handler) {
        this.choreographer = choreographer;
        this.handler = handler;
        this.lock = new Object();
        this.toRunTrampolined = new kotlin.collections.k<>();
        this.toRunOnFrame = new ArrayList();
        this.spareToRunOnFrame = new ArrayList();
        this.dispatchCallback = new AndroidUiDispatcher$dispatchCallback$1(this);
        this.frameClock = new AndroidUiFrameClock(choreographer, this);
    }

    public /* synthetic */ AndroidUiDispatcher(Choreographer choreographer, Handler handler, kotlin.jvm.internal.w wVar) {
        this(choreographer, handler);
    }

    private final Runnable nextTask() {
        Runnable q5;
        synchronized (this.lock) {
            q5 = this.toRunTrampolined.q();
        }
        return q5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void performFrameDispatch(long j5) {
        synchronized (this.lock) {
            if (!this.scheduledFrameDispatch) {
                return;
            }
            this.scheduledFrameDispatch = false;
            List<Choreographer.FrameCallback> list = this.toRunOnFrame;
            this.toRunOnFrame = this.spareToRunOnFrame;
            this.spareToRunOnFrame = list;
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                list.get(i5).doFrame(j5);
            }
            list.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void performTrampolineDispatch() {
        boolean z4;
        do {
            Runnable nextTask = nextTask();
            while (nextTask != null) {
                nextTask.run();
                nextTask = nextTask();
            }
            synchronized (this.lock) {
                if (this.toRunTrampolined.isEmpty()) {
                    z4 = false;
                    this.scheduledTrampolineDispatch = false;
                } else {
                    z4 = true;
                }
            }
        } while (z4);
    }

    @Override // kotlinx.coroutines.n0
    public void dispatch(@p4.l kotlin.coroutines.g gVar, @p4.l Runnable runnable) {
        synchronized (this.lock) {
            this.toRunTrampolined.addLast(runnable);
            if (!this.scheduledTrampolineDispatch) {
                this.scheduledTrampolineDispatch = true;
                this.handler.post(this.dispatchCallback);
                if (!this.scheduledFrameDispatch) {
                    this.scheduledFrameDispatch = true;
                    this.choreographer.postFrameCallback(this.dispatchCallback);
                }
            }
            r2 r2Var = r2.f19517a;
        }
    }

    @p4.l
    public final Choreographer getChoreographer() {
        return this.choreographer;
    }

    @p4.l
    public final MonotonicFrameClock getFrameClock() {
        return this.frameClock;
    }

    public final void postFrameCallback$ui_release(@p4.l Choreographer.FrameCallback frameCallback) {
        synchronized (this.lock) {
            this.toRunOnFrame.add(frameCallback);
            if (!this.scheduledFrameDispatch) {
                this.scheduledFrameDispatch = true;
                this.choreographer.postFrameCallback(this.dispatchCallback);
            }
            r2 r2Var = r2.f19517a;
        }
    }

    public final void removeFrameCallback$ui_release(@p4.l Choreographer.FrameCallback frameCallback) {
        synchronized (this.lock) {
            this.toRunOnFrame.remove(frameCallback);
        }
    }
}
