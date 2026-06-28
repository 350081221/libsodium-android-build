package androidx.activity;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/activity/OnBackPressedDispatcher;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ComponentActivity$onBackPressedDispatcher$2 extends n0 implements v3.a<OnBackPressedDispatcher> {
    final /* synthetic */ ComponentActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComponentActivity$onBackPressedDispatcher$2(ComponentActivity componentActivity) {
        super(0);
        this.this$0 = componentActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(ComponentActivity this$0) {
        l0.p(this$0, "this$0");
        try {
            super/*android.app.Activity*/.onBackPressed();
        } catch (IllegalStateException e5) {
            if (l0.g(e5.getMessage(), "Can not perform this action after onSaveInstanceState")) {
            } else {
                throw e5;
            }
        } catch (NullPointerException e6) {
            if (!l0.g(e6.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e6;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$2$lambda$1(ComponentActivity this$0, OnBackPressedDispatcher dispatcher) {
        l0.p(this$0, "this$0");
        l0.p(dispatcher, "$dispatcher");
        this$0.addObserverForBackInvoker(dispatcher);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.a
    @p4.l
    public final OnBackPressedDispatcher invoke() {
        final ComponentActivity componentActivity = this.this$0;
        final OnBackPressedDispatcher onBackPressedDispatcher = new OnBackPressedDispatcher(new Runnable() { // from class: androidx.activity.m
            @Override // java.lang.Runnable
            public final void run() {
                ComponentActivity$onBackPressedDispatcher$2.invoke$lambda$0(ComponentActivity.this);
            }
        });
        final ComponentActivity componentActivity2 = this.this$0;
        if (Build.VERSION.SDK_INT >= 33) {
            if (!l0.g(Looper.myLooper(), Looper.getMainLooper())) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.activity.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        ComponentActivity$onBackPressedDispatcher$2.invoke$lambda$2$lambda$1(ComponentActivity.this, onBackPressedDispatcher);
                    }
                });
            } else {
                componentActivity2.addObserverForBackInvoker(onBackPressedDispatcher);
            }
        }
        return onBackPressedDispatcher;
    }
}
