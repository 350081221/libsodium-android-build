package androidx.compose.material3.internal;

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
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewRootForInspector;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
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
@i0(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B?\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020\u0016\u0012\u0006\u0010[\u001a\u00020Z\u0012\u0006\u0010]\u001a\u00020\\¢\u0006\u0004\b^\u0010_J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\u0006\u0010\n\u001a\u00020\u0006J(\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00060\r¢\u0006\u0002\b\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u001e\u0010\u0019\u001a\u00020\u00062\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u001a\u001a\u00020\u0006J\u0006\u0010\u001b\u001a\u00020\u0006J\u0012\u0010\u001d\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u001eH\u0016J\b\u0010 \u001a\u00020\u0006H\u0016R\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\"\u0010/\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R/\u0010=\u001a\u0004\u0018\u0001052\b\u00106\u001a\u0004\u0018\u0001058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R5\u0010D\u001a\u0004\u0018\u00010>2\b\u00106\u001a\u0004\u0018\u00010>8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b?\u00108\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001b\u0010I\u001a\u00020\u00168FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u001a\u0010K\u001a\u00020J8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010N\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010P\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010ORA\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00060\r¢\u0006\u0002\b\u000e2\u0011\u00106\u001a\r\u0012\u0004\u0012\u00020\u00060\r¢\u0006\u0002\b\u000e8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bQ\u00108\u001a\u0004\bR\u0010S\"\u0004\b\u0010\u0010TR$\u0010U\u001a\u00020\u00162\u0006\u00106\u001a\u00020\u00168\u0014@RX\u0094\u000e¢\u0006\f\n\u0004\bU\u0010)\u001a\u0004\bV\u0010HR\u0014\u0010Y\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010X\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006`"}, d2 = {"Landroidx/compose/material3/internal/PopupLayout;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroidx/compose/ui/platform/ViewRootForInspector;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Lkotlin/r2;", "superSetLayoutDirection", "Landroid/view/WindowManager$LayoutParams;", "createLayoutParams", "show", "Landroidx/compose/runtime/CompositionContext;", "parent", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "content", "setContent", "(Landroidx/compose/runtime/CompositionContext;Lv3/p;)V", "Content", "(Landroidx/compose/runtime/Composer;I)V", "Landroid/view/KeyEvent;", NotificationCompat.CATEGORY_EVENT, "", "dispatchKeyEvent", "onDismissRequest", "updateParameters", "updatePosition", "dismiss", "Landroid/view/MotionEvent;", "onTouchEvent", "", "setLayoutDirection", "onGlobalLayout", "Lv3/a;", "Landroid/view/View;", "composeView", "Landroid/view/View;", "Landroidx/compose/ui/window/PopupPositionProvider;", "positionProvider", "Landroidx/compose/ui/window/PopupPositionProvider;", "isTouchExplorationEnabled", "Z", "Landroid/view/WindowManager;", "windowManager", "Landroid/view/WindowManager;", "params", "Landroid/view/WindowManager$LayoutParams;", "parentLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getParentLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setParentLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "Landroidx/compose/ui/unit/IntRect;", "<set-?>", "parentBounds$delegate", "Landroidx/compose/runtime/MutableState;", "getParentBounds", "()Landroidx/compose/ui/unit/IntRect;", "setParentBounds", "(Landroidx/compose/ui/unit/IntRect;)V", "parentBounds", "Landroidx/compose/ui/unit/IntSize;", "popupContentSize$delegate", "getPopupContentSize-bOM6tXw", "()Landroidx/compose/ui/unit/IntSize;", "setPopupContentSize-fhxjrPA", "(Landroidx/compose/ui/unit/IntSize;)V", "popupContentSize", "canCalculatePosition$delegate", "Landroidx/compose/runtime/State;", "getCanCalculatePosition", "()Z", "canCalculatePosition", "Landroidx/compose/ui/unit/Dp;", "maxSupportedElevation", "F", "Landroid/graphics/Rect;", "previousWindowVisibleFrame", "Landroid/graphics/Rect;", "tmpWindowVisibleFrame", "content$delegate", "getContent", "()Lv3/p;", "(Lv3/p;)V", "shouldCreateCompositionOnAttachedToWindow", "getShouldCreateCompositionOnAttachedToWindow", "getSubCompositionView", "()Landroidx/compose/ui/platform/AbstractComposeView;", "subCompositionView", "Landroidx/compose/ui/unit/Density;", "density", "Ljava/util/UUID;", "popupId", "<init>", "(Lv3/a;Landroid/view/View;Landroidx/compose/ui/window/PopupPositionProvider;ZLandroidx/compose/ui/unit/Density;Ljava/util/UUID;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"ViewConstructor"})
@r1({"SMAP\nExposedDropdownMenuPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenuPopup.android.kt\nandroidx/compose/material3/internal/PopupLayout\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,436:1\n154#2:437\n1#3:438\n81#4:439\n107#4,2:440\n81#4:442\n107#4,2:443\n81#4:445\n81#4:446\n107#4,2:447\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenuPopup.android.kt\nandroidx/compose/material3/internal/PopupLayout\n*L\n228#1:437\n220#1:439\n220#1:440,2\n221#1:442\n221#1:443,2\n224#1:445\n264#1:446\n264#1:447,2\n*E\n"})
/* loaded from: classes.dex */
public final class PopupLayout extends AbstractComposeView implements ViewRootForInspector, ViewTreeObserver.OnGlobalLayoutListener {

    @l
    private final State canCalculatePosition$delegate;

    @l
    private final View composeView;

    @l
    private final MutableState content$delegate;
    private final boolean isTouchExplorationEnabled;
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
    private final PopupPositionProvider positionProvider;

    @l
    private final Rect previousWindowVisibleFrame;
    private boolean shouldCreateCompositionOnAttachedToWindow;

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

    public PopupLayout(@m a<r2> aVar, @l View view, @l PopupPositionProvider popupPositionProvider, boolean z4, @l Density density, @l UUID uuid) {
        super(view.getContext(), null, 0, 6, null);
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        MutableState mutableStateOf$default3;
        this.onDismissRequest = aVar;
        this.composeView = view;
        this.positionProvider = popupPositionProvider;
        this.isTouchExplorationEnabled = z4;
        Object systemService = view.getContext().getSystemService("window");
        l0.n(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.windowManager = (WindowManager) systemService;
        this.params = createLayoutParams();
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
        setId(R.id.content);
        ViewTreeLifecycleOwner.set(this, ViewTreeLifecycleOwner.get(view));
        ViewTreeViewModelStoreOwner.set(this, ViewTreeViewModelStoreOwner.get(view));
        ViewTreeSavedStateRegistryOwner.set(this, ViewTreeSavedStateRegistryOwner.get(view));
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        setTag(androidx.compose.ui.R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(density.mo304toPx0680j_4(m6044constructorimpl));
        setOutlineProvider(new ViewOutlineProvider() { // from class: androidx.compose.material3.internal.PopupLayout.2
            @Override // android.view.ViewOutlineProvider
            public void getOutline(@l View view2, @l Outline outline) {
                outline.setRect(0, 0, view2.getWidth(), view2.getHeight());
                outline.setAlpha(0.0f);
            }
        });
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ComposableSingletons$ExposedDropdownMenuPopup_androidKt.INSTANCE.m2612getLambda1$material3_release(), null, 2, null);
        this.content$delegate = mutableStateOf$default3;
    }

    private final WindowManager.LayoutParams createLayoutParams() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        int i5 = 393248;
        layoutParams.flags = 393248;
        if (this.isTouchExplorationEnabled) {
            i5 = 393248 & (-33);
        }
        layoutParams.flags = i5;
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

    @Override // androidx.compose.ui.platform.AbstractComposeView
    @Composable
    public void Content(@m Composer composer, int i5) {
        int i6;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(-1284481754);
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
                ComposerKt.traceEventStart(-1284481754, i6, -1, "androidx.compose.material3.internal.PopupLayout.Content (ExposedDropdownMenuPopup.android.kt:279)");
            }
            getContent().invoke(startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
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
    public final IntSize m2614getPopupContentSizebOM6tXw() {
        return (IntSize) this.popupContentSize$delegate.getValue();
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

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.composeView.getWindowVisibleDisplayFrame(this.tmpWindowVisibleFrame);
        if (!l0.g(this.tmpWindowVisibleFrame, this.previousWindowVisibleFrame)) {
            updatePosition();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(@p4.m android.view.MotionEvent r5) {
        /*
            r4 = this;
            if (r5 != 0) goto L7
            boolean r5 = super.onTouchEvent(r5)
            return r5
        L7:
            int r0 = r5.getAction()
            r1 = 4
            r2 = 0
            if (r0 == r1) goto L3f
            int r0 = r5.getAction()
            if (r0 != 0) goto L71
            float r0 = r5.getX()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L3f
            float r0 = r5.getX()
            int r1 = r4.getWidth()
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L3f
            float r0 = r5.getY()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L3f
            float r0 = r5.getY()
            int r1 = r4.getHeight()
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L71
        L3f:
            float r0 = r5.getRawX()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r3 = 1
            if (r0 != 0) goto L4b
            r0 = r3
            goto L4c
        L4b:
            r0 = r1
        L4c:
            if (r0 == 0) goto L5d
            float r0 = r5.getRawY()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L58
            r0 = r3
            goto L59
        L58:
            r0 = r1
        L59:
            if (r0 == 0) goto L5d
            r0 = r3
            goto L5e
        L5d:
            r0 = r1
        L5e:
            androidx.compose.ui.unit.IntRect r2 = r4.getParentBounds()
            if (r2 == 0) goto L66
            if (r0 != 0) goto L67
        L66:
            r1 = r3
        L67:
            if (r1 == 0) goto L71
            v3.a<kotlin.r2> r5 = r4.onDismissRequest
            if (r5 == 0) goto L70
            r5.invoke()
        L70:
            return r3
        L71:
            boolean r5 = super.onTouchEvent(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.PopupLayout.onTouchEvent(android.view.MotionEvent):boolean");
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
    public final void m2615setPopupContentSizefhxjrPA(@m IntSize intSize) {
        this.popupContentSize$delegate.setValue(intSize);
    }

    public final void show() {
        this.windowManager.addView(this, this.params);
    }

    public final void updateParameters(@m a<r2> aVar, @l LayoutDirection layoutDirection) {
        this.onDismissRequest = aVar;
        superSetLayoutDirection(layoutDirection);
    }

    public final void updatePosition() {
        IntSize m2614getPopupContentSizebOM6tXw;
        IntRect parentBounds = getParentBounds();
        if (parentBounds != null && (m2614getPopupContentSizebOM6tXw = m2614getPopupContentSizebOM6tXw()) != null) {
            long m6218unboximpl = m2614getPopupContentSizebOM6tXw.m6218unboximpl();
            Rect rect = this.previousWindowVisibleFrame;
            this.composeView.getWindowVisibleDisplayFrame(rect);
            long mo979calculatePositionllwVHH4 = this.positionProvider.mo979calculatePositionllwVHH4(parentBounds, RectHelper_androidKt.toComposeIntRect(rect).m6198getSizeYbymL2g(), this.parentLayoutDirection, m6218unboximpl);
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
