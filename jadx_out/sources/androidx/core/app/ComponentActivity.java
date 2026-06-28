package androidx.core.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.RestrictTo;
import androidx.collection.SimpleArrayMap;
import androidx.core.view.KeyEventDispatcher;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ReportFragment;

@kotlin.i0(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001,B\u0007¢\u0006\u0004\b+\u0010\"J\u001f\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0017J\u0012\u0010\u0010\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u000eH\u0015J)\u0010\u0016\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0013*\u00020\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0018H\u0017J\u0010\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u0010\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u001f\u0010\u001d\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0004¢\u0006\u0004\b\u001d\u0010\tR.\u0010\u001f\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\n0\u0014\u0012\u0004\u0012\u00020\n0\u001e8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u0012\u0004\b!\u0010\"R\u001a\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b$\u0010%\u0012\u0004\b&\u0010\"R\u0014\u0010*\u001a\u00020'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006-"}, d2 = {"Landroidx/core/app/ComponentActivity;", "Landroid/app/Activity;", "Landroidx/lifecycle/LifecycleOwner;", "Landroidx/core/view/KeyEventDispatcher$Component;", "", "", "args", "", "shouldSkipDump", "([Ljava/lang/String;)Z", "Landroidx/core/app/ComponentActivity$ExtraData;", "extraData", "Lkotlin/r2;", "putExtraData", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "outState", "onSaveInstanceState", "T", "Ljava/lang/Class;", "extraDataClass", "getExtraData", "(Ljava/lang/Class;)Landroidx/core/app/ComponentActivity$ExtraData;", "Landroid/view/KeyEvent;", NotificationCompat.CATEGORY_EVENT, "superDispatchKeyEvent", "dispatchKeyShortcutEvent", "dispatchKeyEvent", "shouldDumpInternalState", "Landroidx/collection/SimpleArrayMap;", "extraDataMap", "Landroidx/collection/SimpleArrayMap;", "getExtraDataMap$annotations", "()V", "Landroidx/lifecycle/LifecycleRegistry;", "lifecycleRegistry", "Landroidx/lifecycle/LifecycleRegistry;", "getLifecycleRegistry$annotations", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "<init>", "ExtraData", "core_release"}, k = 1, mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public class ComponentActivity extends Activity implements LifecycleOwner, KeyEventDispatcher.Component {

    @p4.l
    private final SimpleArrayMap<Class<? extends ExtraData>, ExtraData> extraDataMap = new SimpleArrayMap<>();

    @p4.l
    private final LifecycleRegistry lifecycleRegistry = new LifecycleRegistry(this);

    @kotlin.k(message = "Store the object you want to save directly by using\n      {@link View#setTag(int, Object)} with the window's decor view.")
    @kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/core/app/ComponentActivity$ExtraData;", "", "()V", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes2.dex */
    public static class ExtraData {
    }

    private static /* synthetic */ void getExtraDataMap$annotations() {
    }

    private static /* synthetic */ void getLifecycleRegistry$annotations() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0046, code lost:
    
        if (r4.equals("--list-dumpables") == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 33) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x004f, code lost:
    
        if (r4.equals("--dump-dumpable") == false) goto L51;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0018. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean shouldSkipDump(java.lang.String[] r4) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            if (r4 == 0) goto Lf
            int r2 = r4.length
            if (r2 != 0) goto L9
            r2 = r0
            goto La
        L9:
            r2 = r1
        La:
            if (r2 == 0) goto Ld
            goto Lf
        Ld:
            r2 = r1
            goto L10
        Lf:
            r2 = r0
        L10:
            if (r2 != 0) goto L6d
            r4 = r4[r1]
            int r2 = r4.hashCode()
            switch(r2) {
                case -645125871: goto L5b;
                case 100470631: goto L49;
                case 472614934: goto L40;
                case 1159329357: goto L2e;
                case 1455016274: goto L1c;
                default: goto L1b;
            }
        L1b:
            goto L6d
        L1c:
            java.lang.String r2 = "--autofill"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L25
            goto L6d
        L25:
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r4 < r2) goto L2c
            goto L2d
        L2c:
            r0 = r1
        L2d:
            return r0
        L2e:
            java.lang.String r2 = "--contentcapture"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L37
            goto L6d
        L37:
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r4 < r2) goto L3e
            goto L3f
        L3e:
            r0 = r1
        L3f:
            return r0
        L40:
            java.lang.String r2 = "--list-dumpables"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L52
            goto L6d
        L49:
            java.lang.String r2 = "--dump-dumpable"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L52
            goto L6d
        L52:
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r4 < r2) goto L59
            goto L5a
        L59:
            r0 = r1
        L5a:
            return r0
        L5b:
            java.lang.String r2 = "--translation"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L64
            goto L6d
        L64:
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r4 < r2) goto L6b
            goto L6c
        L6b:
            r0 = r1
        L6c:
            return r0
        L6d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.ComponentActivity.shouldSkipDump(java.lang.String[]):boolean");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(@p4.l KeyEvent event) {
        kotlin.jvm.internal.l0.p(event, "event");
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.l0.o(decorView, "window.decorView");
        if (KeyEventDispatcher.dispatchBeforeHierarchy(decorView, event)) {
            return true;
        }
        return KeyEventDispatcher.dispatchKeyEvent(this, decorView, this, event);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(@p4.l KeyEvent event) {
        kotlin.jvm.internal.l0.p(event, "event");
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.l0.o(decorView, "window.decorView");
        if (KeyEventDispatcher.dispatchBeforeHierarchy(decorView, event)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(event);
    }

    @kotlin.k(message = "Use {@link View#getTag(int)} with the window's decor view.")
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @p4.m
    public <T extends ExtraData> T getExtraData(@p4.l Class<T> extraDataClass) {
        kotlin.jvm.internal.l0.p(extraDataClass, "extraDataClass");
        return (T) this.extraDataMap.get(extraDataClass);
    }

    @p4.l
    public Lifecycle getLifecycle() {
        return this.lifecycleRegistry;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onCreate(@p4.m Bundle bundle) {
        super.onCreate(bundle);
        ReportFragment.Companion.injectIfNeededIn(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    @CallSuper
    public void onSaveInstanceState(@p4.l Bundle outState) {
        kotlin.jvm.internal.l0.p(outState, "outState");
        this.lifecycleRegistry.setCurrentState(Lifecycle.State.CREATED);
        super.onSaveInstanceState(outState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.k(message = "Use {@link View#setTag(int, Object)} with the window's decor view.")
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void putExtraData(@p4.l ExtraData extraData) {
        kotlin.jvm.internal.l0.p(extraData, "extraData");
        this.extraDataMap.put(extraData.getClass(), extraData);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean shouldDumpInternalState(@p4.m String[] strArr) {
        return !shouldSkipDump(strArr);
    }

    @Override // androidx.core.view.KeyEventDispatcher.Component
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean superDispatchKeyEvent(@p4.l KeyEvent event) {
        kotlin.jvm.internal.l0.p(event, "event");
        return super.dispatchKeyEvent(event);
    }
}
