package androidx.compose.material3;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016J\u0006\u0010\u000b\u001a\u00020\u0003R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"androidx/compose/material3/ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$1", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Lkotlin/r2;", "registerOnGlobalLayoutListener", "unregisterOnGlobalLayoutListener", "Landroid/view/View;", "p0", "onViewAttachedToWindow", "onViewDetachedFromWindow", "onGlobalLayout", "dispose", "", "isListeningToGlobalLayout", "Z", "material3_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$1 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ v3.a<r2> $onKeyboardVisibilityChange;
    final /* synthetic */ View $view;
    private boolean isListeningToGlobalLayout;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$1(View view, v3.a<r2> aVar) {
        this.$view = view;
        this.$onKeyboardVisibilityChange = aVar;
        view.addOnAttachStateChangeListener(this);
        registerOnGlobalLayoutListener();
    }

    private final void registerOnGlobalLayoutListener() {
        if (!this.isListeningToGlobalLayout && this.$view.isAttachedToWindow()) {
            this.$view.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.isListeningToGlobalLayout = true;
        }
    }

    private final void unregisterOnGlobalLayoutListener() {
        if (!this.isListeningToGlobalLayout) {
            return;
        }
        this.$view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.isListeningToGlobalLayout = false;
    }

    public final void dispose() {
        unregisterOnGlobalLayoutListener();
        this.$view.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.$onKeyboardVisibilityChange.invoke();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(@p4.l View view) {
        registerOnGlobalLayoutListener();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(@p4.l View view) {
        unregisterOnGlobalLayoutListener();
    }
}
