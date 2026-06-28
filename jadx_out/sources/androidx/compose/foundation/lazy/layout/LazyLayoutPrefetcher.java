package androidx.compose.foundation.lazy.layout;

import android.os.Trace;
import android.view.Choreographer;
import android.view.View;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import com.lody.virtual.server.content.SyncStorageEngine;
import java.util.concurrent.TimeUnit;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 92\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u00029:B'\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b7\u00108J \u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0005H\u0016J\"\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u001a\u001a\u00020\u000eH\u0016J\b\u0010\u001b\u001a\u00020\u000eH\u0016J\b\u0010\u001c\u001a\u00020\u000eH\u0016R\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010/\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010.R\u0016\u00100\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u001c\u00104\u001a\n 3*\u0004\u0018\u000102028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00106\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00101\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006;"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher;", "Landroidx/compose/runtime/RememberObserver;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$Prefetcher;", "Ljava/lang/Runnable;", "Landroid/view/Choreographer$FrameCallback;", "", "now", "nextFrame", "average", "", "enoughTimeLeft", "new", "current", "calculateAverageTime", "Lkotlin/r2;", "run", "frameTimeNanos", "doFrame", "", "index", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "schedulePrefetch-0kLqBqw", "(IJ)Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "schedulePrefetch", "onRemembered", "onForgotten", "onAbandoned", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "prefetchState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "Landroidx/compose/ui/layout/SubcomposeLayoutState;", "subcomposeLayoutState", "Landroidx/compose/ui/layout/SubcomposeLayoutState;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;", "itemContentFactory", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;", "Landroid/view/View;", "view", "Landroid/view/View;", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher$PrefetchRequest;", "prefetchRequests", "Landroidx/compose/runtime/collection/MutableVector;", "averagePrecomposeTimeNs", "J", "averagePremeasureTimeNs", "prefetchScheduled", "Z", "Landroid/view/Choreographer;", "kotlin.jvm.PlatformType", "choreographer", "Landroid/view/Choreographer;", "isActive", "<init>", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;Landroidx/compose/ui/layout/SubcomposeLayoutState;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;Landroid/view/View;)V", "Companion", "PrefetchRequest", "foundation_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalFoundationApi
@r1({"SMAP\nLazyLayoutPrefetcher.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPrefetcher.android.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 AndroidTrace.android.kt\nandroidx/compose/ui/util/AndroidTrace_androidKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,319:1\n1208#2:320\n1187#2,2:321\n523#3:323\n26#4,5:324\n26#4,5:330\n1#5:329\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPrefetcher.android.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher\n*L\n122#1:320\n122#1:321,2\n160#1:323\n165#1:324,5\n187#1:330,5\n*E\n"})
/* loaded from: classes.dex */
public final class LazyLayoutPrefetcher implements RememberObserver, LazyLayoutPrefetchState.Prefetcher, Runnable, Choreographer.FrameCallback {
    private static long frameIntervalNs;
    private long averagePrecomposeTimeNs;
    private long averagePremeasureTimeNs;
    private boolean isActive;

    @l
    private final LazyLayoutItemContentFactory itemContentFactory;
    private boolean prefetchScheduled;

    @l
    private final LazyLayoutPrefetchState prefetchState;

    @l
    private final SubcomposeLayoutState subcomposeLayoutState;

    @l
    private final View view;

    @l
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @l
    private final MutableVector<PrefetchRequest> prefetchRequests = new MutableVector<>(new PrefetchRequest[16], 0);
    private final Choreographer choreographer = Choreographer.getInstance();

    @i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher$Companion;", "", "Landroid/view/View;", "view", "Lkotlin/r2;", "calculateFrameIntervalIfNeeded", "", "frameIntervalNs", "J", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
        
            if (r5 >= 30.0f) goto L11;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void calculateFrameIntervalIfNeeded(android.view.View r5) {
            /*
                r4 = this;
                long r0 = androidx.compose.foundation.lazy.layout.LazyLayoutPrefetcher.access$getFrameIntervalNs$cp()
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto L2c
                android.view.Display r0 = r5.getDisplay()
                boolean r5 = r5.isInEditMode()
                if (r5 != 0) goto L21
                if (r0 == 0) goto L21
                float r5 = r0.getRefreshRate()
                r0 = 1106247680(0x41f00000, float:30.0)
                int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r0 < 0) goto L21
                goto L23
            L21:
                r5 = 1114636288(0x42700000, float:60.0)
            L23:
                r0 = 1000000000(0x3b9aca00, float:0.0047237873)
                float r0 = (float) r0
                float r0 = r0 / r5
                long r0 = (long) r0
                androidx.compose.foundation.lazy.layout.LazyLayoutPrefetcher.access$setFrameIntervalNs$cp(r0)
            L2c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutPrefetcher.Companion.calculateFrameIntervalIfNeeded(android.view.View):void");
        }
    }

    @i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\n\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0016\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher$PrefetchRequest;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "Lkotlin/r2;", "cancel", "", "index", "I", "getIndex", "()I", "Landroidx/compose/ui/unit/Constraints;", "constraints", "J", "getConstraints-msEJaDk", "()J", "Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;", "precomposeHandle", "Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;", "getPrecomposeHandle", "()Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;", "setPrecomposeHandle", "(Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;)V", "", SyncStorageEngine.MESG_CANCELED, "Z", "getCanceled", "()Z", "setCanceled", "(Z)V", "measured", "getMeasured", "setMeasured", "<init>", "(IJLkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    private static final class PrefetchRequest implements LazyLayoutPrefetchState.PrefetchHandle {
        private boolean canceled;
        private final long constraints;
        private final int index;
        private boolean measured;

        @m
        private SubcomposeLayoutState.PrecomposedSlotHandle precomposeHandle;

        private PrefetchRequest(int i5, long j5) {
            this.index = i5;
            this.constraints = j5;
        }

        public /* synthetic */ PrefetchRequest(int i5, long j5, w wVar) {
            this(i5, j5);
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle
        public void cancel() {
            if (!this.canceled) {
                this.canceled = true;
                SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = this.precomposeHandle;
                if (precomposedSlotHandle != null) {
                    precomposedSlotHandle.dispose();
                }
                this.precomposeHandle = null;
            }
        }

        public final boolean getCanceled() {
            return this.canceled;
        }

        /* renamed from: getConstraints-msEJaDk, reason: not valid java name */
        public final long m720getConstraintsmsEJaDk() {
            return this.constraints;
        }

        public final int getIndex() {
            return this.index;
        }

        public final boolean getMeasured() {
            return this.measured;
        }

        @m
        public final SubcomposeLayoutState.PrecomposedSlotHandle getPrecomposeHandle() {
            return this.precomposeHandle;
        }

        public final void setCanceled(boolean z4) {
            this.canceled = z4;
        }

        public final void setMeasured(boolean z4) {
            this.measured = z4;
        }

        public final void setPrecomposeHandle(@m SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle) {
            this.precomposeHandle = precomposedSlotHandle;
        }
    }

    public LazyLayoutPrefetcher(@l LazyLayoutPrefetchState lazyLayoutPrefetchState, @l SubcomposeLayoutState subcomposeLayoutState, @l LazyLayoutItemContentFactory lazyLayoutItemContentFactory, @l View view) {
        this.prefetchState = lazyLayoutPrefetchState;
        this.subcomposeLayoutState = subcomposeLayoutState;
        this.itemContentFactory = lazyLayoutItemContentFactory;
        this.view = view;
        Companion.calculateFrameIntervalIfNeeded(view);
    }

    private final long calculateAverageTime(long j5, long j6) {
        if (j6 == 0) {
            return j5;
        }
        long j7 = 4;
        return (j5 / j7) + ((j6 / j7) * 3);
    }

    private final boolean enoughTimeLeft(long j5, long j6, long j7) {
        return j5 + j7 < j6;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j5) {
        if (this.isActive) {
            this.view.post(this);
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        this.isActive = false;
        this.prefetchState.setPrefetcher$foundation_release(null);
        this.view.removeCallbacks(this);
        this.choreographer.removeFrameCallback(this);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        this.prefetchState.setPrefetcher$foundation_release(this);
        this.isActive = true;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z4;
        boolean z5;
        if (!this.prefetchRequests.isEmpty() && this.prefetchScheduled && this.isActive && this.view.getWindowVisibility() == 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(this.view.getDrawingTime()) + frameIntervalNs;
            if (System.nanoTime() > nanos) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z6 = false;
            while (this.prefetchRequests.isNotEmpty() && !z6) {
                PrefetchRequest prefetchRequest = this.prefetchRequests.getContent()[0];
                LazyLayoutItemProvider invoke = this.itemContentFactory.getItemProvider().invoke();
                if (!prefetchRequest.getCanceled()) {
                    int itemCount = invoke.getItemCount();
                    int index = prefetchRequest.getIndex();
                    if (index >= 0 && index < itemCount) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        if (prefetchRequest.getPrecomposeHandle() == null) {
                            Trace.beginSection("compose:lazylist:prefetch:compose");
                            try {
                                long nanoTime = System.nanoTime();
                                if (!enoughTimeLeft(nanoTime, nanos, this.averagePrecomposeTimeNs) && !z4) {
                                    z6 = true;
                                    r2 r2Var = r2.f19517a;
                                }
                                Object key = invoke.getKey(prefetchRequest.getIndex());
                                prefetchRequest.setPrecomposeHandle(this.subcomposeLayoutState.precompose(key, this.itemContentFactory.getContent(prefetchRequest.getIndex(), key, invoke.getContentType(prefetchRequest.getIndex()))));
                                this.averagePrecomposeTimeNs = calculateAverageTime(System.nanoTime() - nanoTime, this.averagePrecomposeTimeNs);
                                z4 = false;
                                r2 r2Var2 = r2.f19517a;
                            } finally {
                            }
                        } else if (!prefetchRequest.getMeasured()) {
                            Trace.beginSection("compose:lazylist:prefetch:measure");
                            try {
                                long nanoTime2 = System.nanoTime();
                                if (!enoughTimeLeft(nanoTime2, nanos, this.averagePremeasureTimeNs) && !z4) {
                                    r2 r2Var3 = r2.f19517a;
                                    z6 = true;
                                }
                                SubcomposeLayoutState.PrecomposedSlotHandle precomposeHandle = prefetchRequest.getPrecomposeHandle();
                                l0.m(precomposeHandle);
                                int placeablesCount = precomposeHandle.getPlaceablesCount();
                                for (int i5 = 0; i5 < placeablesCount; i5++) {
                                    precomposeHandle.mo5014premeasure0kLqBqw(i5, prefetchRequest.m720getConstraintsmsEJaDk());
                                }
                                this.averagePremeasureTimeNs = calculateAverageTime(System.nanoTime() - nanoTime2, this.averagePremeasureTimeNs);
                                this.prefetchRequests.removeAt(0);
                                z4 = false;
                            } finally {
                            }
                        } else {
                            throw new IllegalStateException("request already measured".toString());
                        }
                    }
                }
                this.prefetchRequests.removeAt(0);
            }
            if (z6) {
                this.choreographer.postFrameCallback(this);
                return;
            } else {
                this.prefetchScheduled = false;
                return;
            }
        }
        this.prefetchScheduled = false;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.Prefetcher
    @l
    /* renamed from: schedulePrefetch-0kLqBqw */
    public LazyLayoutPrefetchState.PrefetchHandle mo719schedulePrefetch0kLqBqw(int i5, long j5) {
        PrefetchRequest prefetchRequest = new PrefetchRequest(i5, j5, null);
        this.prefetchRequests.add(prefetchRequest);
        if (!this.prefetchScheduled) {
            this.prefetchScheduled = true;
            this.view.post(this);
        }
        return prefetchRequest;
    }
}
