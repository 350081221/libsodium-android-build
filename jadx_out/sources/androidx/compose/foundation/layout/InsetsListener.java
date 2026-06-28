package androidx.compose.foundation.layout;

import android.os.Build;
import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.List;
import kotlin.i0;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b.\u0010/J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016J\u001e\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eH\u0016J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u0015\u001a\u00020\u0007H\u0016J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0012H\u0016R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\u001f\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$R$\u0010(\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u00060"}, d2 = {"Landroidx/compose/foundation/layout/InsetsListener;", "Landroidx/core/view/WindowInsetsAnimationCompat$Callback;", "Ljava/lang/Runnable;", "Landroidx/core/view/OnApplyWindowInsetsListener;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroidx/core/view/WindowInsetsAnimationCompat;", "animation", "Lkotlin/r2;", "onPrepare", "Landroidx/core/view/WindowInsetsAnimationCompat$BoundsCompat;", "bounds", "onStart", "Landroidx/core/view/WindowInsetsCompat;", "insets", "", "runningAnimations", "onProgress", "onEnd", "Landroid/view/View;", "view", "onApplyWindowInsets", "run", "onViewAttachedToWindow", "v", "onViewDetachedFromWindow", "Landroidx/compose/foundation/layout/WindowInsetsHolder;", "composeInsets", "Landroidx/compose/foundation/layout/WindowInsetsHolder;", "getComposeInsets", "()Landroidx/compose/foundation/layout/WindowInsetsHolder;", "", "prepared", "Z", "getPrepared", "()Z", "setPrepared", "(Z)V", "runningAnimation", "getRunningAnimation", "setRunningAnimation", "savedInsets", "Landroidx/core/view/WindowInsetsCompat;", "getSavedInsets", "()Landroidx/core/view/WindowInsetsCompat;", "setSavedInsets", "(Landroidx/core/view/WindowInsetsCompat;)V", "<init>", "(Landroidx/compose/foundation/layout/WindowInsetsHolder;)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class InsetsListener extends WindowInsetsAnimationCompat.Callback implements Runnable, OnApplyWindowInsetsListener, View.OnAttachStateChangeListener {

    @l
    private final WindowInsetsHolder composeInsets;
    private boolean prepared;
    private boolean runningAnimation;

    @m
    private WindowInsetsCompat savedInsets;

    public InsetsListener(@l WindowInsetsHolder windowInsetsHolder) {
        super(!windowInsetsHolder.getConsumes() ? 1 : 0);
        this.composeInsets = windowInsetsHolder;
    }

    @l
    public final WindowInsetsHolder getComposeInsets() {
        return this.composeInsets;
    }

    public final boolean getPrepared() {
        return this.prepared;
    }

    public final boolean getRunningAnimation() {
        return this.runningAnimation;
    }

    @m
    public final WindowInsetsCompat getSavedInsets() {
        return this.savedInsets;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    @l
    public WindowInsetsCompat onApplyWindowInsets(@l View view, @l WindowInsetsCompat windowInsetsCompat) {
        this.savedInsets = windowInsetsCompat;
        this.composeInsets.updateImeAnimationTarget(windowInsetsCompat);
        if (this.prepared) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.runningAnimation) {
            this.composeInsets.updateImeAnimationSource(windowInsetsCompat);
            WindowInsetsHolder.update$default(this.composeInsets, windowInsetsCompat, 0, 2, null);
        }
        if (this.composeInsets.getConsumes()) {
            return WindowInsetsCompat.CONSUMED;
        }
        return windowInsetsCompat;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public void onEnd(@l WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        this.prepared = false;
        this.runningAnimation = false;
        WindowInsetsCompat windowInsetsCompat = this.savedInsets;
        if (windowInsetsAnimationCompat.getDurationMillis() != 0 && windowInsetsCompat != null) {
            this.composeInsets.updateImeAnimationSource(windowInsetsCompat);
            this.composeInsets.updateImeAnimationTarget(windowInsetsCompat);
            WindowInsetsHolder.update$default(this.composeInsets, windowInsetsCompat, 0, 2, null);
        }
        this.savedInsets = null;
        super.onEnd(windowInsetsAnimationCompat);
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public void onPrepare(@l WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        this.prepared = true;
        this.runningAnimation = true;
        super.onPrepare(windowInsetsAnimationCompat);
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    @l
    public WindowInsetsCompat onProgress(@l WindowInsetsCompat windowInsetsCompat, @l List<WindowInsetsAnimationCompat> list) {
        WindowInsetsHolder.update$default(this.composeInsets, windowInsetsCompat, 0, 2, null);
        if (this.composeInsets.getConsumes()) {
            return WindowInsetsCompat.CONSUMED;
        }
        return windowInsetsCompat;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    @l
    public WindowInsetsAnimationCompat.BoundsCompat onStart(@l WindowInsetsAnimationCompat windowInsetsAnimationCompat, @l WindowInsetsAnimationCompat.BoundsCompat boundsCompat) {
        this.prepared = false;
        return super.onStart(windowInsetsAnimationCompat, boundsCompat);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(@l View view) {
        view.requestApplyInsets();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(@l View view) {
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.prepared) {
            this.prepared = false;
            this.runningAnimation = false;
            WindowInsetsCompat windowInsetsCompat = this.savedInsets;
            if (windowInsetsCompat != null) {
                this.composeInsets.updateImeAnimationSource(windowInsetsCompat);
                WindowInsetsHolder.update$default(this.composeInsets, windowInsetsCompat, 0, 2, null);
                this.savedInsets = null;
            }
        }
    }

    public final void setPrepared(boolean z4) {
        this.prepared = z4;
    }

    public final void setRunningAnimation(boolean z4) {
        this.runningAnimation = z4;
    }

    public final void setSavedInsets(@m WindowInsetsCompat windowInsetsCompat) {
        this.savedInsets = windowInsetsCompat;
    }
}
