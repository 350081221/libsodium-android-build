package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.CallSuper;
import androidx.annotation.StyleRes;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import kotlin.i0;
import kotlin.jvm.internal.l0;

@i0(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u001b\b\u0007\u0012\u0006\u0010/\u001a\u00020.\u0012\b\b\u0003\u00100\u001a\u00020\r¢\u0006\u0004\b1\u00102J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0015J\b\u0010\n\u001a\u00020\bH\u0015J\b\u0010\u000b\u001a\u00020\bH\u0015J\b\u0010\f\u001a\u00020\bH\u0017J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u001a\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016J\u001a\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0015\u001a\u00020\bH\u0017R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001d\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u00063"}, d2 = {"Landroidx/activity/ComponentDialog;", "Landroid/app/Dialog;", "Landroidx/lifecycle/LifecycleOwner;", "Landroidx/activity/OnBackPressedDispatcherOwner;", "Landroidx/savedstate/SavedStateRegistryOwner;", "Landroid/os/Bundle;", "onSaveInstanceState", "savedInstanceState", "Lkotlin/r2;", "onCreate", "onStart", "onStop", "onBackPressed", "", "layoutResID", "setContentView", "Landroid/view/View;", "view", "Landroid/view/ViewGroup$LayoutParams;", "params", "addContentView", "initializeViewTreeOwners", "Landroidx/lifecycle/LifecycleRegistry;", "_lifecycleRegistry", "Landroidx/lifecycle/LifecycleRegistry;", "Landroidx/savedstate/SavedStateRegistryController;", "savedStateRegistryController", "Landroidx/savedstate/SavedStateRegistryController;", "Landroidx/activity/OnBackPressedDispatcher;", "onBackPressedDispatcher", "Landroidx/activity/OnBackPressedDispatcher;", "getOnBackPressedDispatcher", "()Landroidx/activity/OnBackPressedDispatcher;", "getOnBackPressedDispatcher$annotations", "()V", "getLifecycleRegistry", "()Landroidx/lifecycle/LifecycleRegistry;", "lifecycleRegistry", "Landroidx/savedstate/SavedStateRegistry;", "getSavedStateRegistry", "()Landroidx/savedstate/SavedStateRegistry;", "savedStateRegistry", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "Landroid/content/Context;", com.umeng.analytics.pro.d.X, "themeResId", "<init>", "(Landroid/content/Context;I)V", "activity_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public class ComponentDialog extends Dialog implements LifecycleOwner, OnBackPressedDispatcherOwner, SavedStateRegistryOwner {

    @p4.m
    private LifecycleRegistry _lifecycleRegistry;

    @p4.l
    private final OnBackPressedDispatcher onBackPressedDispatcher;

    @p4.l
    private final SavedStateRegistryController savedStateRegistryController;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @u3.i
    public ComponentDialog(@p4.l Context context) {
        this(context, 0, 2, null);
        l0.p(context, "context");
    }

    public /* synthetic */ ComponentDialog(Context context, int i5, int i6, kotlin.jvm.internal.w wVar) {
        this(context, (i6 & 2) != 0 ? 0 : i5);
    }

    private final LifecycleRegistry getLifecycleRegistry() {
        LifecycleRegistry lifecycleRegistry = this._lifecycleRegistry;
        if (lifecycleRegistry == null) {
            LifecycleRegistry lifecycleRegistry2 = new LifecycleRegistry(this);
            this._lifecycleRegistry = lifecycleRegistry2;
            return lifecycleRegistry2;
        }
        return lifecycleRegistry;
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBackPressedDispatcher$lambda$1(ComponentDialog this$0) {
        l0.p(this$0, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(@p4.l View view, @p4.m ViewGroup.LayoutParams layoutParams) {
        l0.p(view, "view");
        initializeViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    @p4.l
    public Lifecycle getLifecycle() {
        return getLifecycleRegistry();
    }

    @Override // androidx.activity.OnBackPressedDispatcherOwner
    @p4.l
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.onBackPressedDispatcher;
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    @p4.l
    public SavedStateRegistry getSavedStateRegistry() {
        return this.savedStateRegistryController.getSavedStateRegistry();
    }

    @CallSuper
    public void initializeViewTreeOwners() {
        Window window = getWindow();
        l0.m(window);
        View decorView = window.getDecorView();
        l0.o(decorView, "window!!.decorView");
        ViewTreeLifecycleOwner.set(decorView, this);
        Window window2 = getWindow();
        l0.m(window2);
        View decorView2 = window2.getDecorView();
        l0.o(decorView2, "window!!.decorView");
        ViewTreeOnBackPressedDispatcherOwner.set(decorView2, this);
        Window window3 = getWindow();
        l0.m(window3);
        View decorView3 = window3.getDecorView();
        l0.o(decorView3, "window!!.decorView");
        ViewTreeSavedStateRegistryOwner.set(decorView3, this);
    }

    @Override // android.app.Dialog
    @CallSuper
    public void onBackPressed() {
        this.onBackPressedDispatcher.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Dialog
    @CallSuper
    public void onCreate(@p4.m Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackPressedDispatcher onBackPressedDispatcher = this.onBackPressedDispatcher;
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            l0.o(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            onBackPressedDispatcher.setOnBackInvokedDispatcher(onBackInvokedDispatcher);
        }
        this.savedStateRegistryController.performRestore(bundle);
        getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
    }

    @Override // android.app.Dialog
    @p4.l
    public Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        l0.o(onSaveInstanceState, "super.onSaveInstanceState()");
        this.savedStateRegistryController.performSave(onSaveInstanceState);
        return onSaveInstanceState;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Dialog
    @CallSuper
    public void onStart() {
        super.onStart();
        getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Dialog
    @CallSuper
    public void onStop() {
        getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
        this._lifecycleRegistry = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i5) {
        initializeViewTreeOwners();
        super.setContentView(i5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @u3.i
    public ComponentDialog(@p4.l Context context, @StyleRes int i5) {
        super(context, i5);
        l0.p(context, "context");
        this.savedStateRegistryController = SavedStateRegistryController.Companion.create(this);
        this.onBackPressedDispatcher = new OnBackPressedDispatcher(new Runnable() { // from class: androidx.activity.o
            @Override // java.lang.Runnable
            public final void run() {
                ComponentDialog.onBackPressedDispatcher$lambda$1(ComponentDialog.this);
            }
        });
    }

    @Override // android.app.Dialog
    public void setContentView(@p4.l View view) {
        l0.p(view, "view");
        initializeViewTreeOwners();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(@p4.l View view, @p4.m ViewGroup.LayoutParams layoutParams) {
        l0.p(view, "view");
        initializeViewTreeOwners();
        super.setContentView(view, layoutParams);
    }
}
