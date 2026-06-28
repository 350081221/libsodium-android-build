package androidx.compose.material.internal;

import android.R;
import android.annotation.SuppressLint;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewRootForInspector;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import java.util.UUID;
import kotlin.i0;
import kotlin.j0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.a;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B?\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0010\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010j\u001a\u00020i\u0012\u0006\u0010k\u001a\u000204\u0012\u0006\u0010m\u001a\u00020l¢\u0006\u0004\bn\u0010oJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\f\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002J\u0006\u0010\r\u001a\u00020\u0006J(\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\u00060\u0010¢\u0006\u0002\b\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J&\u0010\u001e\u001a\u00020\u00062\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00102\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u001f\u001a\u00020\u0006J\u0006\u0010 \u001a\u00020\u0006J\u0012\u0010\"\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010$\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020#H\u0016J\b\u0010%\u001a\u00020\u0006H\u0016R\u001e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010&R\"\u0010\u001d\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00102\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\"\u00105\u001a\u0002048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010;\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R/\u0010H\u001a\u0004\u0018\u00010\u000b2\b\u0010A\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR5\u0010O\u001a\u0004\u0018\u00010I2\b\u0010A\u001a\u0004\u0018\u00010I8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bJ\u0010C\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u001b\u0010T\u001a\u00020\u00198FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u001a\u0010V\u001a\u00020U8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010X\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010Z\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010YR(\u0010]\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\\\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00190[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^RA\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\u00060\u0010¢\u0006\u0002\b\u00112\u0011\u0010A\u001a\r\u0012\u0004\u0012\u00020\u00060\u0010¢\u0006\u0002\b\u00118B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b_\u0010C\u001a\u0004\b`\u0010a\"\u0004\b\u0013\u0010bR$\u0010c\u001a\u00020\u00192\u0006\u0010A\u001a\u00020\u00198\u0014@RX\u0094\u000e¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010SR\u0014\u0010h\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bf\u0010g\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006p"}, d2 = {"Landroidx/compose/material/internal/PopupLayout;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroidx/compose/ui/platform/ViewRootForInspector;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Lkotlin/r2;", "superSetLayoutDirection", "Landroid/view/WindowManager$LayoutParams;", "createLayoutParams", "Landroid/graphics/Rect;", "Landroidx/compose/ui/unit/IntRect;", "toIntBounds", "show", "Landroidx/compose/runtime/CompositionContext;", "parent", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "content", "setContent", "(Landroidx/compose/runtime/CompositionContext;Lv3/p;)V", "Content", "(Landroidx/compose/runtime/Composer;I)V", "Landroid/view/KeyEvent;", NotificationCompat.CATEGORY_EVENT, "", "dispatchKeyEvent", "onDismissRequest", "", "testTag", "updateParameters", "updatePosition", "dismiss", "Landroid/view/MotionEvent;", "onTouchEvent", "", "setLayoutDirection", "onGlobalLayout", "Lv3/a;", "Ljava/lang/String;", "getTestTag", "()Ljava/lang/String;", "setTestTag", "(Ljava/lang/String;)V", "Landroid/view/View;", "composeView", "Landroid/view/View;", "Landroid/view/WindowManager;", "windowManager", "Landroid/view/WindowManager;", "params", "Landroid/view/WindowManager$LayoutParams;", "Landroidx/compose/ui/window/PopupPositionProvider;", "positionProvider", "Landroidx/compose/ui/window/PopupPositionProvider;", "getPositionProvider", "()Landroidx/compose/ui/window/PopupPositionProvider;", "setPositionProvider", "(Landroidx/compose/ui/window/PopupPositionProvider;)V", "parentLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getParentLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setParentLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "<set-?>", "parentBounds$delegate", "Landroidx/compose/runtime/MutableState;", "getParentBounds", "()Landroidx/compose/ui/unit/IntRect;", "setParentBounds", "(Landroidx/compose/ui/unit/IntRect;)V", "parentBounds", "Landroidx/compose/ui/unit/IntSize;", "popupContentSize$delegate", "getPopupContentSize-bOM6tXw", "()Landroidx/compose/ui/unit/IntSize;", "setPopupContentSize-fhxjrPA", "(Landroidx/compose/ui/unit/IntSize;)V", "popupContentSize", "canCalculatePosition$delegate", "Landroidx/compose/runtime/State;", "getCanCalculatePosition", "()Z", "canCalculatePosition", "Landroidx/compose/ui/unit/Dp;", "maxSupportedElevation", "F", "previousWindowVisibleFrame", "Landroid/graphics/Rect;", "tmpWindowVisibleFrame", "Lkotlin/Function2;", "Landroidx/compose/ui/geometry/Offset;", "dismissOnOutsideClick", "Lv3/p;", "content$delegate", "getContent", "()Lv3/p;", "(Lv3/p;)V", "shouldCreateCompositionOnAttachedToWindow", "Z", "getShouldCreateCompositionOnAttachedToWindow", "getSubCompositionView", "()Landroidx/compose/ui/platform/AbstractComposeView;", "subCompositionView", "Landroidx/compose/ui/unit/Density;", "density", "initialPositionProvider", "Ljava/util/UUID;", "popupId", "<init>", "(Lv3/a;Ljava/lang/String;Landroid/view/View;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/window/PopupPositionProvider;Ljava/util/UUID;)V", "material_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"ViewConstructor"})
@r1({"SMAP\nExposedDropdownMenuPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenuPopup.android.kt\nandroidx/compose/material/internal/PopupLayout\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,464:1\n154#2:465\n1#3:466\n81#4:467\n107#4,2:468\n81#4:470\n107#4,2:471\n81#4:473\n81#4:474\n107#4,2:475\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenuPopup.android.kt\nandroidx/compose/material/internal/PopupLayout\n*L\n241#1:465\n233#1:467\n233#1:468,2\n234#1:470\n234#1:471,2\n237#1:473\n286#1:474\n286#1:475,2\n*E\n"})
/* loaded from: classes.dex */
public final class PopupLayout extends AbstractComposeView implements ViewRootForInspector, ViewTreeObserver.OnGlobalLayoutListener {

    @l
    private final State canCalculatePosition$delegate;

    @l
    private final View composeView;

    @l
    private final MutableState content$delegate;

    @l
    private final p<Offset, IntRect, Boolean> dismissOnOutsideClick;
    private final float maxSupportedElevation;

    @m
    private a<r2> onDismissRequest;

    @l
    private final WindowManager.LayoutParams params;

    @l
    private final MutableState parentBounds$delegate;

    @l
    private LayoutDirection parentLayoutDirection;

    @l
    private final MutableState popupContentSize$delegate;

    @l
    private PopupPositionProvider positionProvider;

    @l
    private final Rect previousWindowVisibleFrame;
    private boolean shouldCreateCompositionOnAttachedToWindow;

    @l
    private String testTag;

    @l
    private final Rect tmpWindowVisibleFrame;

    @l
    private final WindowManager windowManager;

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

    public PopupLayout(@m a<r2> aVar, @l String str, @l View view, @l Density density, @l PopupPositionProvider popupPositionProvider, @l UUID uuid) {
        super(view.getContext(), null, 0, 6, null);
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        MutableState mutableStateOf$default3;
        this.onDismissRequest = aVar;
        this.testTag = str;
        this.composeView = view;
        Object systemService = view.getContext().getSystemService("window");
        l0.n(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.windowManager = (WindowManager) systemService;
        this.params = createLayoutParams();
        this.positionProvider = popupPositionProvider;
        this.parentLayoutDirection = LayoutDirection.Ltr;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.parentBounds$delegate = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.popupContentSize$delegate = mutableStateOf$default2;
        this.canCalculatePosition$delegate = SnapshotStateKt.derivedStateOf(new PopupLayout$canCalculatePosition$2(this));
        float m6044constructorimpl = Dp.m6044constructorimpl(8);
        this.maxSupportedElevation = m6044constructorimpl;
        this.previousWindowVisibleFrame = new Rect();
        this.tmpWindowVisibleFrame = new Rect();
        this.dismissOnOutsideClick = PopupLayout$dismissOnOutsideClick$1.INSTANCE;
        setId(R.id.content);
        ViewTreeLifecycleOwner.set(this, ViewTreeLifecycleOwner.get(view));
        ViewTreeViewModelStoreOwner.set(this, ViewTreeViewModelStoreOwner.get(view));
        ViewTreeSavedStateRegistryOwner.set(this, ViewTreeSavedStateRegistryOwner.get(view));
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        setTag(androidx.compose.ui.R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(density.mo304toPx0680j_4(m6044constructorimpl));
        setOutlineProvider(new ViewOutlineProvider() { // from class: androidx.compose.material.internal.PopupLayout.2
            @Override // android.view.ViewOutlineProvider
            public void getOutline(@l View view2, @l Outline outline) {
                outline.setRect(0, 0, view2.getWidth(), view2.getHeight());
                outline.setAlpha(0.0f);
            }
        });
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ComposableSingletons$ExposedDropdownMenuPopup_androidKt.INSTANCE.m1520getLambda1$material_release(), null, 2, null);
        this.content$delegate = mutableStateOf$default3;
    }

    private final WindowManager.LayoutParams createLayoutParams() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.flags = 393248;
        layoutParams.softInputMode = 1;
        layoutParams.type = 1000;
        layoutParams.token = this.composeView.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(this.composeView.getContext().getResources().getString(androidx.compose.ui.R.string.default_popup_window_title));
        return layoutParams;
    }

    private final p<Composer, Integer, r2> getContent() {
        return (p) this.content$delegate.getValue();
    }

    private final void setContent(p<? super Composer, ? super Integer, r2> pVar) {
        this.content$delegate.setValue(pVar);
    }

    private final void superSetLayoutDirection(LayoutDirection layoutDirection) {
        int i5 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        int i6 = 1;
        if (i5 != 1) {
            if (i5 != 2) {
                throw new j0();
            }
        } else {
            i6 = 0;
        }
        super.setLayoutDirection(i6);
    }

    private final IntRect toIntBounds(Rect rect) {
        return new IntRect(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    @Composable
    public void Content(@m Composer composer, int i5) {
        Composer startRestartGroup = composer.startRestartGroup(-864350873);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-864350873, i5, -1, "androidx.compose.material.internal.PopupLayout.Content (ExposedDropdownMenuPopup.android.kt:301)");
        }
        getContent().invoke(startRestartGroup, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new PopupLayout$Content$4(this, i5));
        }
    }

    public final void dismiss() {
        ViewTreeLifecycleOwner.set(this, null);
        this.composeView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.windowManager.removeViewImmediate(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(@l KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        if (keyEvent.getKeyCode() == 4) {
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
                a<r2> aVar = this.onDismissRequest;
                if (aVar != null) {
                    aVar.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.canCalculatePosition$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m
    public final IntRect getParentBounds() {
        return (IntRect) this.parentBounds$delegate.getValue();
    }

    @l
    public final LayoutDirection getParentLayoutDirection() {
        return this.parentLayoutDirection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m
    /* renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final IntSize m1522getPopupContentSizebOM6tXw() {
        return (IntSize) this.popupContentSize$delegate.getValue();
    }

    @l
    public final PopupPositionProvider getPositionProvider() {
        return this.positionProvider;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    @Override // androidx.compose.ui.platform.ViewRootForInspector
    @l
    public AbstractComposeView getSubCompositionView() {
        return this;
    }

    @l
    public final String getTestTag() {
        return this.testTag;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.composeView.getWindowVisibleDisplayFrame(this.tmpWindowVisibleFrame);
        if (!l0.g(this.tmpWindowVisibleFrame, this.previousWindowVisibleFrame)) {
            updatePosition();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007f, code lost:
    
        if (r3.invoke(r1, r0).booleanValue() == false) goto L34;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(@p4.m android.view.MotionEvent r9) {
        /*
            r8 = this;
            if (r9 != 0) goto L7
            boolean r9 = super.onTouchEvent(r9)
            return r9
        L7:
            int r0 = r9.getAction()
            r1 = 0
            if (r0 != 0) goto L38
            float r0 = r9.getX()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L3f
            float r0 = r9.getX()
            int r2 = r8.getWidth()
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L3f
            float r0 = r9.getY()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L3f
            float r0 = r9.getY()
            int r2 = r8.getHeight()
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L3f
        L38:
            int r0 = r9.getAction()
            r2 = 4
            if (r0 != r2) goto L8c
        L3f:
            androidx.compose.ui.unit.IntRect r0 = r8.getParentBounds()
            r2 = 1
            if (r0 == 0) goto L81
            v3.p<androidx.compose.ui.geometry.Offset, androidx.compose.ui.unit.IntRect, java.lang.Boolean> r3 = r8.dismissOnOutsideClick
            float r4 = r9.getRawX()
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            r5 = 0
            if (r4 != 0) goto L53
            r4 = r2
            goto L54
        L53:
            r4 = r5
        L54:
            if (r4 != 0) goto L74
            float r4 = r9.getRawY()
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 != 0) goto L60
            r1 = r2
            goto L61
        L60:
            r1 = r5
        L61:
            if (r1 != 0) goto L74
            float r1 = r9.getRawX()
            float r4 = r9.getRawY()
            long r6 = androidx.compose.ui.geometry.OffsetKt.Offset(r1, r4)
            androidx.compose.ui.geometry.Offset r1 = androidx.compose.ui.geometry.Offset.m3482boximpl(r6)
            goto L75
        L74:
            r1 = 0
        L75:
            java.lang.Object r0 = r3.invoke(r1, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L82
        L81:
            r5 = r2
        L82:
            if (r5 == 0) goto L8c
            v3.a<kotlin.r2> r9 = r8.onDismissRequest
            if (r9 == 0) goto L8b
            r9.invoke()
        L8b:
            return r2
        L8c:
            boolean r9 = super.onTouchEvent(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.internal.PopupLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public void setLayoutDirection(int i5) {
    }

    public final void setParentBounds(@m IntRect intRect) {
        this.parentBounds$delegate.setValue(intRect);
    }

    public final void setParentLayoutDirection(@l LayoutDirection layoutDirection) {
        this.parentLayoutDirection = layoutDirection;
    }

    /* renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m1523setPopupContentSizefhxjrPA(@m IntSize intSize) {
        this.popupContentSize$delegate.setValue(intSize);
    }

    public final void setPositionProvider(@l PopupPositionProvider popupPositionProvider) {
        this.positionProvider = popupPositionProvider;
    }

    public final void setTestTag(@l String str) {
        this.testTag = str;
    }

    public final void show() {
        this.windowManager.addView(this, this.params);
    }

    public final void updateParameters(@m a<r2> aVar, @l String str, @l LayoutDirection layoutDirection) {
        this.onDismissRequest = aVar;
        this.testTag = str;
        superSetLayoutDirection(layoutDirection);
    }

    public final void updatePosition() {
        IntSize m1522getPopupContentSizebOM6tXw;
        IntRect parentBounds = getParentBounds();
        if (parentBounds != null && (m1522getPopupContentSizebOM6tXw = m1522getPopupContentSizebOM6tXw()) != null) {
            long m6218unboximpl = m1522getPopupContentSizebOM6tXw.m6218unboximpl();
            Rect rect = this.previousWindowVisibleFrame;
            this.composeView.getWindowVisibleDisplayFrame(rect);
            IntRect intBounds = toIntBounds(rect);
            long mo979calculatePositionllwVHH4 = this.positionProvider.mo979calculatePositionllwVHH4(parentBounds, IntSizeKt.IntSize(intBounds.getWidth(), intBounds.getHeight()), this.parentLayoutDirection, m6218unboximpl);
            this.params.x = IntOffset.m6172getXimpl(mo979calculatePositionllwVHH4);
            this.params.y = IntOffset.m6173getYimpl(mo979calculatePositionllwVHH4);
            this.windowManager.updateViewLayout(this, this.params);
        }
    }

    public final void setContent(@l CompositionContext compositionContext, @l p<? super Composer, ? super Integer, r2> pVar) {
        setParentCompositionContext(compositionContext);
        setContent(pVar);
        this.shouldCreateCompositionOnAttachedToWindow = true;
    }
}
