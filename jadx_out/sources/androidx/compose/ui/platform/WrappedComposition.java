package androidx.compose.ui.platform;

import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionServiceKey;
import androidx.compose.runtime.CompositionServices;
import androidx.compose.ui.R;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.r2;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u001a\u001a\u00020\u0001¢\u0006\u0004\b*\u0010+J\"\u0010\b\u001a\u00020\u00052\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0005H\u0016J\u0018\u0010\u000f\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J%\u0010\u0013\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R!\u0010$\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010'¨\u0006,"}, d2 = {"Landroidx/compose/ui/platform/WrappedComposition;", "Landroidx/compose/runtime/Composition;", "Landroidx/lifecycle/LifecycleEventObserver;", "Landroidx/compose/runtime/CompositionServices;", "Lkotlin/Function0;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "content", "setContent", "(Lv3/p;)V", "dispose", "Landroidx/lifecycle/LifecycleOwner;", "source", "Landroidx/lifecycle/Lifecycle$Event;", NotificationCompat.CATEGORY_EVENT, "onStateChanged", "T", "Landroidx/compose/runtime/CompositionServiceKey;", DatabaseFileArchive.COLUMN_KEY, "getCompositionService", "(Landroidx/compose/runtime/CompositionServiceKey;)Ljava/lang/Object;", "Landroidx/compose/ui/platform/AndroidComposeView;", "owner", "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwner", "()Landroidx/compose/ui/platform/AndroidComposeView;", "original", "Landroidx/compose/runtime/Composition;", "getOriginal", "()Landroidx/compose/runtime/Composition;", "", "disposed", "Z", "Landroidx/lifecycle/Lifecycle;", "addedToLifecycle", "Landroidx/lifecycle/Lifecycle;", "lastContent", "Lv3/p;", "getHasInvalidations", "()Z", "hasInvalidations", "isDisposed", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;Landroidx/compose/runtime/Composition;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class WrappedComposition implements Composition, LifecycleEventObserver, CompositionServices {

    @p4.m
    private Lifecycle addedToLifecycle;
    private boolean disposed;

    @p4.l
    private v3.p<? super Composer, ? super Integer, r2> lastContent = ComposableSingletons$Wrapper_androidKt.INSTANCE.m5302getLambda1$ui_release();

    @p4.l
    private final Composition original;

    @p4.l
    private final AndroidComposeView owner;

    public WrappedComposition(@p4.l AndroidComposeView androidComposeView, @p4.l Composition composition) {
        this.owner = androidComposeView;
        this.original = composition;
    }

    @Override // androidx.compose.runtime.Composition
    public void dispose() {
        if (!this.disposed) {
            this.disposed = true;
            this.owner.getView().setTag(R.id.wrapped_composition_tag, null);
            Lifecycle lifecycle = this.addedToLifecycle;
            if (lifecycle != null) {
                lifecycle.removeObserver(this);
            }
        }
        this.original.dispose();
    }

    @Override // androidx.compose.runtime.CompositionServices
    @p4.m
    public <T> T getCompositionService(@p4.l CompositionServiceKey<T> compositionServiceKey) {
        Composition composition = this.original;
        CompositionServices compositionServices = composition instanceof CompositionServices ? (CompositionServices) composition : null;
        if (compositionServices != null) {
            return (T) compositionServices.getCompositionService(compositionServiceKey);
        }
        return null;
    }

    @Override // androidx.compose.runtime.Composition
    public boolean getHasInvalidations() {
        return this.original.getHasInvalidations();
    }

    @p4.l
    public final Composition getOriginal() {
        return this.original;
    }

    @p4.l
    public final AndroidComposeView getOwner() {
        return this.owner;
    }

    @Override // androidx.compose.runtime.Composition
    public boolean isDisposed() {
        return this.original.isDisposed();
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@p4.l LifecycleOwner lifecycleOwner, @p4.l Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            dispose();
        } else if (event == Lifecycle.Event.ON_CREATE && !this.disposed) {
            setContent(this.lastContent);
        }
    }

    @Override // androidx.compose.runtime.Composition
    @ComposableInferredTarget(scheme = "[0[0]]")
    public void setContent(@p4.l v3.p<? super Composer, ? super Integer, r2> pVar) {
        this.owner.setOnViewTreeOwnersAvailable(new WrappedComposition$setContent$1(this, pVar));
    }
}
