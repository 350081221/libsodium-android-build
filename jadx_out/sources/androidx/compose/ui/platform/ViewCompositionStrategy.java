package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.customview.poolingcontainer.PoolingContainer;
import androidx.customview.poolingcontainer.PoolingContainerListener;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import kotlin.jvm.internal.k1;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u0000 \u00072\u00020\u0001:\u0005\u0007\b\t\n\u000bJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/ViewCompositionStrategy;", "", "Landroidx/compose/ui/platform/AbstractComposeView;", "view", "Lkotlin/Function0;", "Lkotlin/r2;", "installFor", "Companion", "DisposeOnDetachedFromWindow", "DisposeOnDetachedFromWindowOrReleasedFromPool", "DisposeOnLifecycleDestroyed", "DisposeOnViewTreeLifecycleDestroyed", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface ViewCompositionStrategy {

    @p4.l
    public static final Companion Companion = Companion.$$INSTANCE;

    @kotlin.i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/platform/ViewCompositionStrategy$Companion;", "", "()V", "Default", "Landroidx/compose/ui/platform/ViewCompositionStrategy;", "getDefault", "()Landroidx/compose/ui/platform/ViewCompositionStrategy;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @p4.l
        public final ViewCompositionStrategy getDefault() {
            return DisposeOnDetachedFromWindowOrReleasedFromPool.INSTANCE;
        }
    }

    @StabilityInferred(parameters = 1)
    @kotlin.i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/ViewCompositionStrategy$DisposeOnDetachedFromWindow;", "Landroidx/compose/ui/platform/ViewCompositionStrategy;", "Landroidx/compose/ui/platform/AbstractComposeView;", "view", "Lkotlin/Function0;", "Lkotlin/r2;", "installFor", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class DisposeOnDetachedFromWindow implements ViewCompositionStrategy {
        public static final int $stable = 0;

        @p4.l
        public static final DisposeOnDetachedFromWindow INSTANCE = new DisposeOnDetachedFromWindow();

        private DisposeOnDetachedFromWindow() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$1, android.view.View$OnAttachStateChangeListener] */
        @Override // androidx.compose.ui.platform.ViewCompositionStrategy
        @p4.l
        public v3.a<r2> installFor(@p4.l final AbstractComposeView abstractComposeView) {
            ?? r02 = new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(@p4.l View view) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(@p4.l View view) {
                    AbstractComposeView.this.disposeComposition();
                }
            };
            abstractComposeView.addOnAttachStateChangeListener(r02);
            return new ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$1(abstractComposeView, r02);
        }
    }

    @StabilityInferred(parameters = 1)
    @kotlin.i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool;", "Landroidx/compose/ui/platform/ViewCompositionStrategy;", "Landroidx/compose/ui/platform/AbstractComposeView;", "view", "Lkotlin/Function0;", "Lkotlin/r2;", "installFor", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class DisposeOnDetachedFromWindowOrReleasedFromPool implements ViewCompositionStrategy {
        public static final int $stable = 0;

        @p4.l
        public static final DisposeOnDetachedFromWindowOrReleasedFromPool INSTANCE = new DisposeOnDetachedFromWindowOrReleasedFromPool();

        private DisposeOnDetachedFromWindowOrReleasedFromPool() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View$OnAttachStateChangeListener, androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1] */
        @Override // androidx.compose.ui.platform.ViewCompositionStrategy
        @p4.l
        public v3.a<r2> installFor(@p4.l final AbstractComposeView abstractComposeView) {
            ?? r02 = new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(@p4.l View view) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(@p4.l View view) {
                    if (!PoolingContainer.isWithinPoolingContainer(AbstractComposeView.this)) {
                        AbstractComposeView.this.disposeComposition();
                    }
                }
            };
            abstractComposeView.addOnAttachStateChangeListener(r02);
            PoolingContainerListener poolingContainerListener = new PoolingContainerListener() { // from class: androidx.compose.ui.platform.e2
                @Override // androidx.customview.poolingcontainer.PoolingContainerListener
                public final void onRelease() {
                    AbstractComposeView.this.disposeComposition();
                }
            };
            PoolingContainer.addPoolingContainerListener(abstractComposeView, poolingContainerListener);
            return new ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$1(abstractComposeView, r02, poolingContainerListener);
        }
    }

    @StabilityInferred(parameters = 1)
    @kotlin.i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed;", "Landroidx/compose/ui/platform/ViewCompositionStrategy;", "Landroidx/compose/ui/platform/AbstractComposeView;", "view", "Lkotlin/Function0;", "Lkotlin/r2;", "installFor", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class DisposeOnViewTreeLifecycleDestroyed implements ViewCompositionStrategy {
        public static final int $stable = 0;

        @p4.l
        public static final DisposeOnViewTreeLifecycleDestroyed INSTANCE = new DisposeOnViewTreeLifecycleDestroyed();

        private DisposeOnViewTreeLifecycleDestroyed() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1, android.view.View$OnAttachStateChangeListener] */
        /* JADX WARN: Type inference failed for: r2v0, types: [T, androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$1] */
        @Override // androidx.compose.ui.platform.ViewCompositionStrategy
        @p4.l
        public v3.a<r2> installFor(@p4.l final AbstractComposeView abstractComposeView) {
            if (abstractComposeView.isAttachedToWindow()) {
                LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(abstractComposeView);
                if (lifecycleOwner != null) {
                    return ViewCompositionStrategy_androidKt.access$installForLifecycle(abstractComposeView, lifecycleOwner.getLifecycle());
                }
                throw new IllegalStateException(("View tree for " + abstractComposeView + " has no ViewTreeLifecycleOwner").toString());
            }
            final k1.h hVar = new k1.h();
            ?? r12 = new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1
                /* JADX WARN: Type inference failed for: r3v7, types: [T, v3.a] */
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(@p4.l View view) {
                    ?? installForLifecycle;
                    LifecycleOwner lifecycleOwner2 = ViewTreeLifecycleOwner.get(AbstractComposeView.this);
                    AbstractComposeView abstractComposeView2 = AbstractComposeView.this;
                    if (lifecycleOwner2 != null) {
                        k1.h<v3.a<r2>> hVar2 = hVar;
                        installForLifecycle = ViewCompositionStrategy_androidKt.installForLifecycle(abstractComposeView2, lifecycleOwner2.getLifecycle());
                        hVar2.element = installForLifecycle;
                        AbstractComposeView.this.removeOnAttachStateChangeListener(this);
                        return;
                    }
                    throw new IllegalStateException(("View tree for " + abstractComposeView2 + " has no ViewTreeLifecycleOwner").toString());
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(@p4.l View view) {
                }
            };
            abstractComposeView.addOnAttachStateChangeListener(r12);
            hVar.element = new ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$1(abstractComposeView, r12);
            return new ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$2(hVar);
        }
    }

    @p4.l
    v3.a<r2> installFor(@p4.l AbstractComposeView abstractComposeView);

    @StabilityInferred(parameters = 0)
    @kotlin.i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/platform/ViewCompositionStrategy$DisposeOnLifecycleDestroyed;", "Landroidx/compose/ui/platform/ViewCompositionStrategy;", "Landroidx/compose/ui/platform/AbstractComposeView;", "view", "Lkotlin/Function0;", "Lkotlin/r2;", "installFor", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "<init>", "(Landroidx/lifecycle/Lifecycle;)V", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "(Landroidx/lifecycle/LifecycleOwner;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class DisposeOnLifecycleDestroyed implements ViewCompositionStrategy {
        public static final int $stable = 8;

        @p4.l
        private final Lifecycle lifecycle;

        public DisposeOnLifecycleDestroyed(@p4.l Lifecycle lifecycle) {
            this.lifecycle = lifecycle;
        }

        @Override // androidx.compose.ui.platform.ViewCompositionStrategy
        @p4.l
        public v3.a<r2> installFor(@p4.l AbstractComposeView abstractComposeView) {
            return ViewCompositionStrategy_androidKt.access$installForLifecycle(abstractComposeView, this.lifecycle);
        }

        public DisposeOnLifecycleDestroyed(@p4.l LifecycleOwner lifecycleOwner) {
            this(lifecycleOwner.getLifecycle());
        }
    }
}
