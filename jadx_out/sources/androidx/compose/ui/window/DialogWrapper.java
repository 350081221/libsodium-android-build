package androidx.compose.ui.window;

import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.ComponentDialog;
import androidx.activity.OnBackPressedCallback;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewRootForInspector;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.app.NotificationCompat;
import kotlin.i0;
import kotlin.j0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B=\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J(\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00050\f¢\u0006\u0002\b\r¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0014\u001a\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0003J\u0006\u0010\u0015\u001a\u00020\u0005J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u001a\u001a\u00020\u0005H\u0016R\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001bR\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010$\u001a\u00020#8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00063"}, d2 = {"Landroidx/compose/ui/window/DialogWrapper;", "Landroidx/activity/ComponentDialog;", "Landroidx/compose/ui/platform/ViewRootForInspector;", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Lkotlin/r2;", "setLayoutDirection", "Landroidx/compose/ui/window/SecureFlagPolicy;", "securePolicy", "setSecurePolicy", "Landroidx/compose/runtime/CompositionContext;", "parentComposition", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "children", "setContent", "(Landroidx/compose/runtime/CompositionContext;Lv3/p;)V", "onDismissRequest", "Landroidx/compose/ui/window/DialogProperties;", "properties", "updateParameters", "disposeComposition", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "", "onTouchEvent", "cancel", "Lv3/a;", "Landroidx/compose/ui/window/DialogProperties;", "Landroid/view/View;", "composeView", "Landroid/view/View;", "Landroidx/compose/ui/window/DialogLayout;", "dialogLayout", "Landroidx/compose/ui/window/DialogLayout;", "Landroidx/compose/ui/unit/Dp;", "maxSupportedElevation", "F", "", "defaultSoftInputMode", "I", "Landroidx/compose/ui/platform/AbstractComposeView;", "getSubCompositionView", "()Landroidx/compose/ui/platform/AbstractComposeView;", "subCompositionView", "Landroidx/compose/ui/unit/Density;", "density", "Ljava/util/UUID;", "dialogId", "<init>", "(Lv3/a;Landroidx/compose/ui/window/DialogProperties;Landroid/view/View;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;Ljava/util/UUID;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nAndroidDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/DialogWrapper\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,466:1\n154#2:467\n1#3:468\n*S KotlinDebug\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/DialogWrapper\n*L\n302#1:467\n*E\n"})
/* loaded from: classes.dex */
public final class DialogWrapper extends ComponentDialog implements ViewRootForInspector {

    @l
    private final View composeView;
    private final int defaultSoftInputMode;

    @l
    private final DialogLayout dialogLayout;
    private final float maxSupportedElevation;

    @l
    private v3.a<r2> onDismissRequest;

    @l
    private DialogProperties properties;

    @i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/activity/OnBackPressedCallback;", "Lkotlin/r2;", "invoke", "(Landroidx/activity/OnBackPressedCallback;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.window.DialogWrapper$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends n0 implements v3.l<OnBackPressedCallback, r2> {
        AnonymousClass2() {
            super(1);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(OnBackPressedCallback onBackPressedCallback) {
            invoke2(onBackPressedCallback);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@l OnBackPressedCallback onBackPressedCallback) {
            if (DialogWrapper.this.properties.getDismissOnBackPress()) {
                DialogWrapper.this.onDismissRequest.invoke();
            }
        }
    }

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
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

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DialogWrapper(@p4.l v3.a<kotlin.r2> r7, @p4.l androidx.compose.ui.window.DialogProperties r8, @p4.l android.view.View r9, @p4.l androidx.compose.ui.unit.LayoutDirection r10, @p4.l androidx.compose.ui.unit.Density r11, @p4.l java.util.UUID r12) {
        /*
            r6 = this;
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            android.content.Context r1 = r9.getContext()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 31
            if (r2 >= r3) goto L16
            boolean r2 = r8.getDecorFitsSystemWindows()
            if (r2 == 0) goto L13
            goto L16
        L13:
            int r2 = androidx.compose.ui.R.style.FloatingDialogWindowTheme
            goto L18
        L16:
            int r2 = androidx.compose.ui.R.style.DialogWindowTheme
        L18:
            r0.<init>(r1, r2)
            r1 = 2
            r2 = 0
            r3 = 0
            r6.<init>(r0, r2, r1, r3)
            r6.onDismissRequest = r7
            r6.properties = r8
            r6.composeView = r9
            r7 = 8
            float r7 = (float) r7
            float r7 = androidx.compose.ui.unit.Dp.m6044constructorimpl(r7)
            r6.maxSupportedElevation = r7
            android.view.Window r8 = r6.getWindow()
            if (r8 == 0) goto Lc6
            android.view.WindowManager$LayoutParams r0 = r8.getAttributes()
            int r0 = r0.softInputMode
            r0 = r0 & 240(0xf0, float:3.36E-43)
            r6.defaultSoftInputMode = r0
            r0 = 1
            r8.requestFeature(r0)
            r0 = 17170445(0x106000d, float:2.461195E-38)
            r8.setBackgroundDrawableResource(r0)
            androidx.compose.ui.window.DialogProperties r0 = r6.properties
            boolean r0 = r0.getDecorFitsSystemWindows()
            androidx.core.view.WindowCompat.setDecorFitsSystemWindows(r8, r0)
            androidx.compose.ui.window.DialogLayout r0 = new androidx.compose.ui.window.DialogLayout
            android.content.Context r1 = r6.getContext()
            r0.<init>(r1, r8)
            int r1 = androidx.compose.ui.R.id.compose_view_saveable_id_tag
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Dialog:"
            r4.append(r5)
            r4.append(r12)
            java.lang.String r12 = r4.toString()
            r0.setTag(r1, r12)
            r0.setClipChildren(r2)
            float r7 = r11.mo304toPx0680j_4(r7)
            r0.setElevation(r7)
            androidx.compose.ui.window.DialogWrapper$1$2 r7 = new androidx.compose.ui.window.DialogWrapper$1$2
            r7.<init>()
            r0.setOutlineProvider(r7)
            r6.dialogLayout = r0
            android.view.View r7 = r8.getDecorView()
            boolean r8 = r7 instanceof android.view.ViewGroup
            if (r8 == 0) goto L91
            r3 = r7
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
        L91:
            if (r3 == 0) goto L96
            _init_$disableClipping(r3)
        L96:
            r6.setContentView(r0)
            androidx.lifecycle.LifecycleOwner r7 = androidx.lifecycle.ViewTreeLifecycleOwner.get(r9)
            androidx.lifecycle.ViewTreeLifecycleOwner.set(r0, r7)
            androidx.lifecycle.ViewModelStoreOwner r7 = androidx.lifecycle.ViewTreeViewModelStoreOwner.get(r9)
            androidx.lifecycle.ViewTreeViewModelStoreOwner.set(r0, r7)
            androidx.savedstate.SavedStateRegistryOwner r7 = androidx.savedstate.ViewTreeSavedStateRegistryOwner.get(r9)
            androidx.savedstate.ViewTreeSavedStateRegistryOwner.set(r0, r7)
            v3.a<kotlin.r2> r7 = r6.onDismissRequest
            androidx.compose.ui.window.DialogProperties r8 = r6.properties
            r6.updateParameters(r7, r8, r10)
            androidx.activity.OnBackPressedDispatcher r0 = r6.getOnBackPressedDispatcher()
            r2 = 0
            androidx.compose.ui.window.DialogWrapper$2 r3 = new androidx.compose.ui.window.DialogWrapper$2
            r3.<init>()
            r4 = 2
            r5 = 0
            r1 = r6
            androidx.activity.OnBackPressedDispatcherKt.addCallback$default(r0, r1, r2, r3, r4, r5)
            return
        Lc6:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Dialog has no window"
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.DialogWrapper.<init>(v3.a, androidx.compose.ui.window.DialogProperties, android.view.View, androidx.compose.ui.unit.LayoutDirection, androidx.compose.ui.unit.Density, java.util.UUID):void");
    }

    private static final void _init_$disableClipping(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof DialogLayout) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = viewGroup.getChildAt(i5);
            if (childAt instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) childAt;
            } else {
                viewGroup2 = null;
            }
            if (viewGroup2 != null) {
                _init_$disableClipping(viewGroup2);
            }
        }
    }

    private final void setLayoutDirection(LayoutDirection layoutDirection) {
        DialogLayout dialogLayout = this.dialogLayout;
        int i5 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        int i6 = 1;
        if (i5 != 1) {
            if (i5 != 2) {
                throw new j0();
            }
        } else {
            i6 = 0;
        }
        dialogLayout.setLayoutDirection(i6);
    }

    private final void setSecurePolicy(SecureFlagPolicy secureFlagPolicy) {
        int i5;
        boolean shouldApplySecureFlag = SecureFlagPolicy_androidKt.shouldApplySecureFlag(secureFlagPolicy, AndroidPopup_androidKt.isFlagSecureEnabled(this.composeView));
        Window window = getWindow();
        l0.m(window);
        if (shouldApplySecureFlag) {
            i5 = 8192;
        } else {
            i5 = -8193;
        }
        window.setFlags(i5, 8192);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
    }

    public final void disposeComposition() {
        this.dialogLayout.disposeComposition();
    }

    @Override // androidx.compose.ui.platform.ViewRootForInspector
    @l
    public AbstractComposeView getSubCompositionView() {
        return this.dialogLayout;
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(@l MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (onTouchEvent && this.properties.getDismissOnClickOutside()) {
            this.onDismissRequest.invoke();
        }
        return onTouchEvent;
    }

    public final void setContent(@l CompositionContext compositionContext, @l p<? super Composer, ? super Integer, r2> pVar) {
        this.dialogLayout.setContent(compositionContext, pVar);
    }

    public final void updateParameters(@l v3.a<r2> aVar, @l DialogProperties dialogProperties, @l LayoutDirection layoutDirection) {
        Window window;
        this.onDismissRequest = aVar;
        this.properties = dialogProperties;
        setSecurePolicy(dialogProperties.getSecurePolicy());
        setLayoutDirection(layoutDirection);
        if (dialogProperties.getUsePlatformDefaultWidth() && !this.dialogLayout.getUsePlatformDefaultWidth() && (window = getWindow()) != null) {
            window.setLayout(-2, -2);
        }
        this.dialogLayout.setUsePlatformDefaultWidth(dialogProperties.getUsePlatformDefaultWidth());
        if (Build.VERSION.SDK_INT < 31) {
            if (dialogProperties.getDecorFitsSystemWindows()) {
                Window window2 = getWindow();
                if (window2 != null) {
                    window2.setSoftInputMode(this.defaultSoftInputMode);
                    return;
                }
                return;
            }
            Window window3 = getWindow();
            if (window3 != null) {
                window3.setSoftInputMode(16);
            }
        }
    }
}
