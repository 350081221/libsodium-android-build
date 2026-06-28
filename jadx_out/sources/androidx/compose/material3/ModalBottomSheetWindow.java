package androidx.compose.material3;

import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewRootForInspector;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.SecureFlagPolicy;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import java.util.UUID;
import kotlin.jvm.internal.r1;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001AB-\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010>\u001a\u00020=¢\u0006\u0004\b?\u0010@J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u000f\u0010\u0007\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\u000e\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0002\b\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0010\u001a\u00020\u0004J\u0006\u0010\u0011\u001a\u00020\u0004J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0014J\b\u0010\u0017\u001a\u00020\u0004H\u0014J\b\u0010\u0018\u001a\u00020\u0004H\u0016J\u0010\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u000e\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u001cR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.RA\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0002\b\f2\u0011\u0010/\u001a\r\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0002\b\f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u00106\u001a\u00020\u00142\u0006\u0010/\u001a\u00020\u00148\u0014@RX\u0094\u000e¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0014\u0010<\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006B"}, d2 = {"Landroidx/compose/material3/ModalBottomSheetWindow;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Landroidx/compose/ui/platform/ViewRootForInspector;", "Lkotlin/r2;", "maybeRegisterBackCallback", "maybeUnregisterBackCallback", "Content", "(Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/CompositionContext;", "parent", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "content", "setCustomContent", "(Landroidx/compose/runtime/CompositionContext;Lv3/p;)V", "show", "dismiss", "Landroid/view/KeyEvent;", NotificationCompat.CATEGORY_EVENT, "", "dispatchKeyEvent", "onAttachedToWindow", "onDetachedFromWindow", "onGlobalLayout", "", "layoutDirection", "setLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "superSetLayoutDirection", "Landroidx/compose/material3/ModalBottomSheetProperties;", "properties", "Landroidx/compose/material3/ModalBottomSheetProperties;", "onDismissRequest", "Lv3/a;", "Landroid/view/View;", "composeView", "Landroid/view/View;", "", "backCallback", "Ljava/lang/Object;", "Landroid/view/WindowManager;", "windowManager", "Landroid/view/WindowManager;", "Landroid/view/WindowManager$LayoutParams;", "params", "Landroid/view/WindowManager$LayoutParams;", "<set-?>", "content$delegate", "Landroidx/compose/runtime/MutableState;", "getContent", "()Lv3/p;", "setContent", "(Lv3/p;)V", "shouldCreateCompositionOnAttachedToWindow", "Z", "getShouldCreateCompositionOnAttachedToWindow", "()Z", "getDisplayWidth", "()I", "displayWidth", "Ljava/util/UUID;", "saveId", "<init>", "(Landroidx/compose/material3/ModalBottomSheetProperties;Lv3/a;Landroid/view/View;Ljava/util/UUID;)V", "Api33Impl", "material3_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nModalBottomSheet.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.android.kt\nandroidx/compose/material3/ModalBottomSheetWindow\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,702:1\n81#2:703\n107#2,2:704\n1#3:706\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheet.android.kt\nandroidx/compose/material3/ModalBottomSheetWindow\n*L\n557#1:703\n557#1:704,2\n*E\n"})
/* loaded from: classes.dex */
public final class ModalBottomSheetWindow extends AbstractComposeView implements ViewTreeObserver.OnGlobalLayoutListener, ViewRootForInspector {

    @p4.m
    private Object backCallback;

    @p4.l
    private final View composeView;

    @p4.l
    private final MutableState content$delegate;

    @p4.l
    private v3.a<r2> onDismissRequest;

    @p4.l
    private final WindowManager.LayoutParams params;

    @p4.l
    private final ModalBottomSheetProperties properties;
    private boolean shouldCreateCompositionOnAttachedToWindow;

    @p4.l
    private final WindowManager windowManager;

    /* JADX INFO: Access modifiers changed from: private */
    @kotlin.i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007J\u001a\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0007J\u001a\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0007¨\u0006\u000e"}, d2 = {"Landroidx/compose/material3/ModalBottomSheetWindow$Api33Impl;", "", "Lkotlin/Function0;", "Lkotlin/r2;", "onDismissRequest", "Landroid/window/OnBackInvokedCallback;", "createBackCallback", "Landroid/view/View;", "view", "backCallback", "maybeRegisterBackCallback", "maybeUnregisterBackCallback", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
    @RequiresApi(33)
    /* loaded from: classes.dex */
    public static final class Api33Impl {

        @p4.l
        public static final Api33Impl INSTANCE = new Api33Impl();

        private Api33Impl() {
        }

        @p4.l
        @DoNotInline
        @u3.m
        public static final OnBackInvokedCallback createBackCallback(@p4.l final v3.a<r2> aVar) {
            return new OnBackInvokedCallback() { // from class: androidx.compose.material3.n0
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    v3.a.this.invoke();
                }
            };
        }

        @DoNotInline
        @u3.m
        public static final void maybeRegisterBackCallback(@p4.l View view, @p4.m Object obj) {
            OnBackInvokedDispatcher findOnBackInvokedDispatcher;
            if ((obj instanceof OnBackInvokedCallback) && (findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) != null) {
                findOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj);
            }
        }

        @DoNotInline
        @u3.m
        public static final void maybeUnregisterBackCallback(@p4.l View view, @p4.m Object obj) {
            OnBackInvokedDispatcher findOnBackInvokedDispatcher;
            if ((obj instanceof OnBackInvokedCallback) && (findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) != null) {
                findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj);
            }
        }
    }

    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ModalBottomSheetWindow(@p4.l ModalBottomSheetProperties modalBottomSheetProperties, @p4.l v3.a<r2> aVar, @p4.l View view, @p4.l UUID uuid) {
        super(view.getContext(), null, 0, 6, null);
        boolean isFlagSecureEnabled;
        boolean shouldApplySecureFlag;
        MutableState mutableStateOf$default;
        this.properties = modalBottomSheetProperties;
        this.onDismissRequest = aVar;
        this.composeView = view;
        setId(android.R.id.content);
        ViewTreeLifecycleOwner.set(this, ViewTreeLifecycleOwner.get(view));
        ViewTreeViewModelStoreOwner.set(this, ViewTreeViewModelStoreOwner.get(view));
        ViewTreeSavedStateRegistryOwner.set(this, ViewTreeSavedStateRegistryOwner.get(view));
        setTag(androidx.compose.ui.R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        Object systemService = view.getContext().getSystemService("window");
        kotlin.jvm.internal.l0.n(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.windowManager = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388691;
        layoutParams.type = 1000;
        layoutParams.width = getDisplayWidth();
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(androidx.compose.ui.R.string.default_popup_window_title));
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.flags = (layoutParams.flags & (-163841)) | 512;
        SecureFlagPolicy securePolicy = modalBottomSheetProperties.getSecurePolicy();
        isFlagSecureEnabled = ModalBottomSheet_androidKt.isFlagSecureEnabled(view);
        shouldApplySecureFlag = ModalBottomSheet_androidKt.shouldApplySecureFlag(securePolicy, isFlagSecureEnabled);
        if (shouldApplySecureFlag) {
            layoutParams.flags |= 8192;
        } else {
            layoutParams.flags &= -8193;
        }
        if (!modalBottomSheetProperties.isFocusable()) {
            layoutParams.flags |= 8;
        } else {
            layoutParams.flags &= -9;
        }
        this.params = layoutParams;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ComposableSingletons$ModalBottomSheet_androidKt.INSTANCE.m1754getLambda2$material3_release(), null, 2, null);
        this.content$delegate = mutableStateOf$default;
    }

    private final v3.p<Composer, Integer, r2> getContent() {
        return (v3.p) this.content$delegate.getValue();
    }

    private final int getDisplayWidth() {
        return getContext().getResources().getDisplayMetrics().widthPixels;
    }

    private final void maybeRegisterBackCallback() {
        if (this.properties.getShouldDismissOnBackPress() && Build.VERSION.SDK_INT >= 33) {
            if (this.backCallback == null) {
                this.backCallback = Api33Impl.createBackCallback(this.onDismissRequest);
            }
            Api33Impl.maybeRegisterBackCallback(this, this.backCallback);
        }
    }

    private final void maybeUnregisterBackCallback() {
        if (Build.VERSION.SDK_INT >= 33) {
            Api33Impl.maybeUnregisterBackCallback(this, this.backCallback);
        }
        this.backCallback = null;
    }

    private final void setContent(v3.p<? super Composer, ? super Integer, r2> pVar) {
        this.content$delegate.setValue(pVar);
    }

    public static /* synthetic */ void setCustomContent$default(ModalBottomSheetWindow modalBottomSheetWindow, CompositionContext compositionContext, v3.p pVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            compositionContext = null;
        }
        modalBottomSheetWindow.setCustomContent(compositionContext, pVar);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    @Composable
    public void Content(@p4.m Composer composer, int i5) {
        int i6;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(-463309699);
        if ((i5 & 6) == 0) {
            if (startRestartGroup.changedInstance(this)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i6 = i7 | i5;
        } else {
            i6 = i5;
        }
        if ((i6 & 3) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-463309699, i6, -1, "androidx.compose.material3.ModalBottomSheetWindow.Content (ModalBottomSheet.android.kt:562)");
            }
            getContent().invoke(startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ModalBottomSheetWindow$Content$4(this, i5));
        }
    }

    public final void dismiss() {
        ViewTreeLifecycleOwner.set(this, null);
        ViewTreeSavedStateRegistryOwner.set(this, null);
        this.composeView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.windowManager.removeViewImmediate(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(@p4.l KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        if (keyEvent.getKeyCode() == 4 && this.properties.getShouldDismissOnBackPress()) {
            if (getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                }
                return true;
            }
            if (keyEvent.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                this.onDismissRequest.invoke();
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.platform.AbstractComposeView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        maybeRegisterBackCallback();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        maybeUnregisterBackCallback();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
    }

    public final void setCustomContent(@p4.m CompositionContext compositionContext, @p4.l v3.p<? super Composer, ? super Integer, r2> pVar) {
        if (compositionContext != null) {
            setParentCompositionContext(compositionContext);
        }
        setContent(pVar);
        this.shouldCreateCompositionOnAttachedToWindow = true;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i5) {
    }

    public final void show() {
        this.windowManager.addView(this, this.params);
    }

    public final void superSetLayoutDirection(@p4.l LayoutDirection layoutDirection) {
        int i5 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        int i6 = 1;
        if (i5 != 1) {
            if (i5 != 2) {
                throw new kotlin.j0();
            }
        } else {
            i6 = 0;
        }
        super.setLayoutDirection(i6);
    }
}
