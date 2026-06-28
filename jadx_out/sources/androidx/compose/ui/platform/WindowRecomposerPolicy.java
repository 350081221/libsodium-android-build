package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.InternalComposeUiApi;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.l2;

@StabilityInferred(parameters = 0)
@kotlin.i0(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0001J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002J,\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0086\b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/platform/WindowRecomposerPolicy;", "", "Landroidx/compose/ui/platform/WindowRecomposerFactory;", "factory", "getAndSetFactory", "expected", "", "compareAndSetFactory", "Lkotlin/r2;", "setFactory", "R", "Lkotlin/Function0;", "block", "withFactory", "(Landroidx/compose/ui/platform/WindowRecomposerFactory;Lv3/a;)Ljava/lang/Object;", "Landroid/view/View;", "rootView", "Landroidx/compose/runtime/Recomposer;", "createAndInstallWindowRecomposer$ui_release", "(Landroid/view/View;)Landroidx/compose/runtime/Recomposer;", "createAndInstallWindowRecomposer", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
@InternalComposeUiApi
/* loaded from: classes.dex */
public final class WindowRecomposerPolicy {

    @p4.l
    public static final WindowRecomposerPolicy INSTANCE = new WindowRecomposerPolicy();

    @p4.l
    private static final AtomicReference<WindowRecomposerFactory> factory = new AtomicReference<>(WindowRecomposerFactory.Companion.getLifecycleAware());
    public static final int $stable = 8;

    private WindowRecomposerPolicy() {
    }

    @kotlin.a1
    public final boolean compareAndSetFactory(@p4.l WindowRecomposerFactory windowRecomposerFactory, @p4.l WindowRecomposerFactory windowRecomposerFactory2) {
        return androidx.compose.animation.core.h.a(factory, windowRecomposerFactory, windowRecomposerFactory2);
    }

    @p4.l
    public final Recomposer createAndInstallWindowRecomposer$ui_release(@p4.l View view) {
        final l2 f5;
        Recomposer createRecomposer = factory.get().createRecomposer(view);
        WindowRecomposer_androidKt.setCompositionContext(view, createRecomposer);
        f5 = kotlinx.coroutines.k.f(kotlinx.coroutines.c2.f19867a, kotlinx.coroutines.android.g.i(view.getHandler(), "windowRecomposer cleanup").E0(), null, new WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1(createRecomposer, view, null), 2, null);
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(@p4.l View view2) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(@p4.l View view2) {
                view2.removeOnAttachStateChangeListener(this);
                l2.a.b(l2.this, null, 1, null);
            }
        });
        return createRecomposer;
    }

    @p4.l
    @kotlin.a1
    public final WindowRecomposerFactory getAndSetFactory(@p4.l WindowRecomposerFactory windowRecomposerFactory) {
        return factory.getAndSet(windowRecomposerFactory);
    }

    public final void setFactory(@p4.l WindowRecomposerFactory windowRecomposerFactory) {
        factory.set(windowRecomposerFactory);
    }

    public final <R> R withFactory(@p4.l WindowRecomposerFactory windowRecomposerFactory, @p4.l v3.a<? extends R> aVar) {
        WindowRecomposerFactory andSetFactory = getAndSetFactory(windowRecomposerFactory);
        try {
            R invoke = aVar.invoke();
            kotlin.jvm.internal.i0.d(1);
            if (compareAndSetFactory(windowRecomposerFactory, andSetFactory)) {
                kotlin.jvm.internal.i0.c(1);
                return invoke;
            }
            throw new IllegalStateException("WindowRecomposerFactory was set to unexpected value; cannot safely restore old state");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                kotlin.jvm.internal.i0.d(1);
                if (!compareAndSetFactory(windowRecomposerFactory, andSetFactory)) {
                    kotlin.p.a(th, new IllegalStateException("WindowRecomposerFactory was set to unexpected value; cannot safely restore old state"));
                    throw th;
                }
                kotlin.jvm.internal.i0.c(1);
                throw th2;
            }
        }
    }
}
