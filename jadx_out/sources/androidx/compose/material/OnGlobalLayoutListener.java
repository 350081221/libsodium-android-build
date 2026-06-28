package androidx.compose.material;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.i0;
import kotlin.r2;
import p4.l;
import v3.a;

@i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016J\u0006\u0010\u000b\u001a\u00020\u0003R\u0014\u0010\f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Landroidx/compose/material/OnGlobalLayoutListener;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Lkotlin/r2;", "registerOnGlobalLayoutListener", "unregisterOnGlobalLayoutListener", "Landroid/view/View;", "p0", "onViewAttachedToWindow", "onViewDetachedFromWindow", "onGlobalLayout", "dispose", "view", "Landroid/view/View;", "Lkotlin/Function0;", "onGlobalLayoutCallback", "Lv3/a;", "", "isListeningToGlobalLayout", "Z", "<init>", "(Landroid/view/View;Lv3/a;)V", "material_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class OnGlobalLayoutListener implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
    private boolean isListeningToGlobalLayout;

    @l
    private final a<r2> onGlobalLayoutCallback;

    @l
    private final View view;

    public OnGlobalLayoutListener(@l View view, @l a<r2> aVar) {
        this.view = view;
        this.onGlobalLayoutCallback = aVar;
        view.addOnAttachStateChangeListener(this);
        registerOnGlobalLayoutListener();
    }

    private final void registerOnGlobalLayoutListener() {
        if (!this.isListeningToGlobalLayout && this.view.isAttachedToWindow()) {
            this.view.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.isListeningToGlobalLayout = true;
        }
    }

    private final void unregisterOnGlobalLayoutListener() {
        if (!this.isListeningToGlobalLayout) {
            return;
        }
        this.view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.isListeningToGlobalLayout = false;
    }

    public final void dispose() {
        unregisterOnGlobalLayoutListener();
        this.view.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.onGlobalLayoutCallback.invoke();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(@l View view) {
        registerOnGlobalLayoutListener();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(@l View view) {
        unregisterOnGlobalLayoutListener();
    }
}
