package androidx.compose.ui.window;

import android.annotation.SuppressLint;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.WindowManager;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.R;
import androidx.compose.ui.UiComposable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewRootForInspector;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import java.util.UUID;
import kotlin.i0;
import kotlin.j0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.math.d;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;

@StabilityInferred(parameters = 0)
@SuppressLint({"ViewConstructor"})
@i0(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0015\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u009c\u00012\u00020\u00012\u00020\u0002:\u0002\u009c\u0001BX\u0012\u000e\u00100\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0017\u0012\u0006\u00102\u001a\u000201\u0012\u0006\u00104\u001a\u000203\u0012\u0006\u0010J\u001a\u00020I\u0012\b\u0010\u0096\u0001\u001a\u00030\u0095\u0001\u0012\u0007\u0010\u0097\u0001\u001a\u00020W\u0012\b\u0010\u0099\u0001\u001a\u00030\u0098\u0001\u0012\b\b\u0002\u0010M\u001a\u00020L¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0003H\u0002J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\u0006\u0010\u0014\u001a\u00020\u0005J(\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00152\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00050\u0017¢\u0006\u0002\b\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u001e\u001a\u00020\u0005H\u0014J\b\u0010\u001f\u001a\u00020\u0005H\u0014J\u001f\u0010$\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\fH\u0010¢\u0006\u0004\b\"\u0010#J7\u0010,\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020\f2\u0006\u0010(\u001a\u00020\f2\u0006\u0010)\u001a\u00020\fH\u0010¢\u0006\u0004\b*\u0010+J\u0010\u0010/\u001a\u00020\u00032\u0006\u0010.\u001a\u00020-H\u0016J.\u00105\u001a\u00020\u00052\u000e\u00100\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00172\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u0002032\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u00108\u001a\u00020\u00052\u0006\u00107\u001a\u000206J\u0006\u00109\u001a\u00020\u0005J\u000f\u0010<\u001a\u00020\u0005H\u0001¢\u0006\u0004\b:\u0010;J\u0006\u0010=\u001a\u00020\u0005J\u0006\u0010>\u001a\u00020\u0005J\u0012\u0010@\u001a\u00020\u00032\b\u0010.\u001a\u0004\u0018\u00010?H\u0016J\u0010\u0010A\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\fH\u0016R\u001e\u00100\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010BR\u0016\u00102\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010CR\"\u00104\u001a\u0002038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR \u0010R\u001a\u00020\u00128\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bR\u0010S\u0012\u0004\bV\u0010;\u001a\u0004\bT\u0010UR\"\u0010X\u001a\u00020W8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\"\u0010^\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR5\u0010l\u001a\u0004\u0018\u00010d2\b\u0010e\u001a\u0004\u0018\u00010d8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR/\u00107\u001a\u0004\u0018\u0001062\b\u0010e\u001a\u0004\u0018\u0001068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bm\u0010g\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\u0018\u0010s\u001a\u0004\u0018\u00010r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR\u001b\u0010y\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bw\u0010xR\u001a\u0010{\u001a\u00020z8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b{\u0010|R\u0014\u0010~\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0018\u0010\u0081\u0001\u001a\u00030\u0080\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001RE\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00050\u0017¢\u0006\u0002\b\u00182\u0011\u0010e\u001a\r\u0012\u0004\u0012\u00020\u00050\u0017¢\u0006\u0002\b\u00188B@BX\u0082\u008e\u0002¢\u0006\u0016\n\u0005\b\u0083\u0001\u0010g\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0005\b\u001a\u0010\u0086\u0001R(\u0010\u0087\u0001\u001a\u00020\u00032\u0006\u0010e\u001a\u00020\u00038\u0014@RX\u0094\u000e¢\u0006\u000f\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0005\b\u0089\u0001\u0010xR\u0018\u0010\u008b\u0001\u001a\u00030\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0017\u0010\u008f\u0001\u001a\u00020\f8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0017\u0010\u0091\u0001\u001a\u00020\f8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0090\u0001\u0010\u008e\u0001R\u0017\u0010\u0094\u0001\u001a\u00020\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u009d\u0001"}, d2 = {"Landroidx/compose/ui/window/PopupLayout;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroidx/compose/ui/platform/ViewRootForInspector;", "", "isFocusable", "Lkotlin/r2;", "setIsFocusable", "Landroidx/compose/ui/window/SecureFlagPolicy;", "securePolicy", "setSecurePolicy", "clippingEnabled", "setClippingEnabled", "", "flags", "applyNewFlags", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "superSetLayoutDirection", "Landroid/view/WindowManager$LayoutParams;", "createLayoutParams", "show", "Landroidx/compose/runtime/CompositionContext;", "parent", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "content", "setContent", "(Landroidx/compose/runtime/CompositionContext;Lv3/p;)V", "Content", "(Landroidx/compose/runtime/Composer;I)V", "onAttachedToWindow", "onDetachedFromWindow", "widthMeasureSpec", "heightMeasureSpec", "internalOnMeasure$ui_release", "(II)V", "internalOnMeasure", "changed", "left", "top", "right", "bottom", "internalOnLayout$ui_release", "(ZIIII)V", "internalOnLayout", "Landroid/view/KeyEvent;", NotificationCompat.CATEGORY_EVENT, "dispatchKeyEvent", "onDismissRequest", "Landroidx/compose/ui/window/PopupProperties;", "properties", "", "testTag", "updateParameters", "Landroidx/compose/ui/layout/LayoutCoordinates;", "parentLayoutCoordinates", "updateParentLayoutCoordinates", "pollForLocationOnScreenChange", "updateParentBounds$ui_release", "()V", "updateParentBounds", "updatePosition", "dismiss", "Landroid/view/MotionEvent;", "onTouchEvent", "setLayoutDirection", "Lv3/a;", "Landroidx/compose/ui/window/PopupProperties;", "Ljava/lang/String;", "getTestTag", "()Ljava/lang/String;", "setTestTag", "(Ljava/lang/String;)V", "Landroid/view/View;", "composeView", "Landroid/view/View;", "Landroidx/compose/ui/window/PopupLayoutHelper;", "popupLayoutHelper", "Landroidx/compose/ui/window/PopupLayoutHelper;", "Landroid/view/WindowManager;", "windowManager", "Landroid/view/WindowManager;", "params", "Landroid/view/WindowManager$LayoutParams;", "getParams$ui_release", "()Landroid/view/WindowManager$LayoutParams;", "getParams$ui_release$annotations", "Landroidx/compose/ui/window/PopupPositionProvider;", "positionProvider", "Landroidx/compose/ui/window/PopupPositionProvider;", "getPositionProvider", "()Landroidx/compose/ui/window/PopupPositionProvider;", "setPositionProvider", "(Landroidx/compose/ui/window/PopupPositionProvider;)V", "parentLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getParentLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setParentLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "Landroidx/compose/ui/unit/IntSize;", "<set-?>", "popupContentSize$delegate", "Landroidx/compose/runtime/MutableState;", "getPopupContentSize-bOM6tXw", "()Landroidx/compose/ui/unit/IntSize;", "setPopupContentSize-fhxjrPA", "(Landroidx/compose/ui/unit/IntSize;)V", "popupContentSize", "parentLayoutCoordinates$delegate", "getParentLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "setParentLayoutCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "Landroidx/compose/ui/unit/IntRect;", "parentBounds", "Landroidx/compose/ui/unit/IntRect;", "canCalculatePosition$delegate", "Landroidx/compose/runtime/State;", "getCanCalculatePosition", "()Z", "canCalculatePosition", "Landroidx/compose/ui/unit/Dp;", "maxSupportedElevation", "F", "Landroid/graphics/Rect;", "previousWindowVisibleFrame", "Landroid/graphics/Rect;", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "snapshotStateObserver", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "content$delegate", "getContent", "()Lv3/p;", "(Lv3/p;)V", "shouldCreateCompositionOnAttachedToWindow", "Z", "getShouldCreateCompositionOnAttachedToWindow", "", "locationOnScreen", "[I", "getDisplayWidth", "()I", "displayWidth", "getDisplayHeight", "displayHeight", "getSubCompositionView", "()Landroidx/compose/ui/platform/AbstractComposeView;", "subCompositionView", "Landroidx/compose/ui/unit/Density;", "density", "initialPositionProvider", "Ljava/util/UUID;", "popupId", "<init>", "(Lv3/a;Landroidx/compose/ui/window/PopupProperties;Ljava/lang/String;Landroid/view/View;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/window/PopupPositionProvider;Ljava/util/UUID;Landroidx/compose/ui/window/PopupLayoutHelper;)V", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nAndroidPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/PopupLayout\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,867:1\n154#2:868\n1#3:869\n81#4:870\n107#4,2:871\n81#4:873\n107#4,2:874\n81#4:876\n81#4:877\n107#4,2:878\n*S KotlinDebug\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/PopupLayout\n*L\n415#1:868\n404#1:870\n404#1:871,2\n405#1:873\n405#1:874,2\n409#1:876\n459#1:877\n459#1:878,2\n*E\n"})
/* loaded from: classes.dex */
public final class PopupLayout extends AbstractComposeView implements ViewRootForInspector {

    @l
    private final State canCalculatePosition$delegate;

    @l
    private final View composeView;

    @l
    private final MutableState content$delegate;

    @l
    private final int[] locationOnScreen;
    private final float maxSupportedElevation;

    @m
    private v3.a<r2> onDismissRequest;

    @l
    private final WindowManager.LayoutParams params;

    @m
    private IntRect parentBounds;

    @l
    private final MutableState parentLayoutCoordinates$delegate;

    @l
    private LayoutDirection parentLayoutDirection;

    @l
    private final MutableState popupContentSize$delegate;

    @l
    private final PopupLayoutHelper popupLayoutHelper;

    @l
    private PopupPositionProvider positionProvider;

    @l
    private final Rect previousWindowVisibleFrame;

    @l
    private PopupProperties properties;
    private boolean shouldCreateCompositionOnAttachedToWindow;

    @l
    private final SnapshotStateObserver snapshotStateObserver;

    @l
    private String testTag;

    @l
    private final WindowManager windowManager;

    @l
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @l
    private static final v3.l<PopupLayout, r2> onCommitAffectingPopupPosition = PopupLayout$Companion$onCommitAffectingPopupPosition$1.INSTANCE;

    @i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/ui/window/PopupLayout$Companion;", "", "Lkotlin/Function1;", "Landroidx/compose/ui/window/PopupLayout;", "Lkotlin/r2;", "onCommitAffectingPopupPosition", "Lv3/l;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ PopupLayout(v3.a r11, androidx.compose.ui.window.PopupProperties r12, java.lang.String r13, android.view.View r14, androidx.compose.ui.unit.Density r15, androidx.compose.ui.window.PopupPositionProvider r16, java.util.UUID r17, androidx.compose.ui.window.PopupLayoutHelper r18, int r19, kotlin.jvm.internal.w r20) {
        /*
            r10 = this;
            r0 = r19
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L19
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L12
            androidx.compose.ui.window.PopupLayoutHelperImpl29 r0 = new androidx.compose.ui.window.PopupLayoutHelperImpl29
            r0.<init>()
            goto L17
        L12:
            androidx.compose.ui.window.PopupLayoutHelperImpl r0 = new androidx.compose.ui.window.PopupLayoutHelperImpl
            r0.<init>()
        L17:
            r9 = r0
            goto L1b
        L19:
            r9 = r18
        L1b:
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.PopupLayout.<init>(v3.a, androidx.compose.ui.window.PopupProperties, java.lang.String, android.view.View, androidx.compose.ui.unit.Density, androidx.compose.ui.window.PopupPositionProvider, java.util.UUID, androidx.compose.ui.window.PopupLayoutHelper, int, kotlin.jvm.internal.w):void");
    }

    private final void applyNewFlags(int i5) {
        WindowManager.LayoutParams layoutParams = this.params;
        layoutParams.flags = i5;
        this.popupLayoutHelper.updateViewLayout(this.windowManager, this, layoutParams);
    }

    private final WindowManager.LayoutParams createLayoutParams() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.flags = (layoutParams.flags & (-8552473)) | 262144;
        layoutParams.type = 1002;
        layoutParams.token = this.composeView.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(this.composeView.getContext().getResources().getString(R.string.default_popup_window_title));
        return layoutParams;
    }

    private final p<Composer, Integer, r2> getContent() {
        return (p) this.content$delegate.getValue();
    }

    private final int getDisplayHeight() {
        int L0;
        L0 = d.L0(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density);
        return L0;
    }

    private final int getDisplayWidth() {
        int L0;
        L0 = d.L0(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density);
        return L0;
    }

    @VisibleForTesting
    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutCoordinates getParentLayoutCoordinates() {
        return (LayoutCoordinates) this.parentLayoutCoordinates$delegate.getValue();
    }

    private final void setClippingEnabled(boolean z4) {
        int i5;
        if (z4) {
            i5 = this.params.flags & (-513);
        } else {
            i5 = this.params.flags | 512;
        }
        applyNewFlags(i5);
    }

    private final void setContent(p<? super Composer, ? super Integer, r2> pVar) {
        this.content$delegate.setValue(pVar);
    }

    private final void setIsFocusable(boolean z4) {
        int i5;
        if (!z4) {
            i5 = this.params.flags | 8;
        } else {
            i5 = this.params.flags & (-9);
        }
        applyNewFlags(i5);
    }

    private final void setParentLayoutCoordinates(LayoutCoordinates layoutCoordinates) {
        this.parentLayoutCoordinates$delegate.setValue(layoutCoordinates);
    }

    private final void setSecurePolicy(SecureFlagPolicy secureFlagPolicy) {
        int i5;
        if (SecureFlagPolicy_androidKt.shouldApplySecureFlag(secureFlagPolicy, AndroidPopup_androidKt.isFlagSecureEnabled(this.composeView))) {
            i5 = this.params.flags | 8192;
        } else {
            i5 = this.params.flags & (-8193);
        }
        applyNewFlags(i5);
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
    @UiComposable
    public void Content(@m Composer composer, int i5) {
        Composer startRestartGroup = composer.startRestartGroup(-857613600);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-857613600, i5, -1, "androidx.compose.ui.window.PopupLayout.Content (AndroidPopup.android.kt:475)");
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
        this.windowManager.removeViewImmediate(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(@l KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        if (keyEvent.getKeyCode() == 4 && this.properties.getDismissOnBackPress()) {
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
                v3.a<r2> aVar = this.onDismissRequest;
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

    @l
    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.params;
    }

    @l
    public final LayoutDirection getParentLayoutDirection() {
        return this.parentLayoutDirection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m
    /* renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final IntSize m6297getPopupContentSizebOM6tXw() {
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

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void internalOnLayout$ui_release(boolean z4, int i5, int i6, int i7, int i8) {
        View childAt;
        super.internalOnLayout$ui_release(z4, i5, i6, i7, i8);
        if (this.properties.getUsePlatformDefaultWidth() || (childAt = getChildAt(0)) == null) {
            return;
        }
        this.params.width = childAt.getMeasuredWidth();
        this.params.height = childAt.getMeasuredHeight();
        this.popupLayoutHelper.updateViewLayout(this.windowManager, this, this.params);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void internalOnMeasure$ui_release(int i5, int i6) {
        if (this.properties.getUsePlatformDefaultWidth()) {
            super.internalOnMeasure$ui_release(i5, i6);
        } else {
            super.internalOnMeasure$ui_release(View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), Integer.MIN_VALUE));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.platform.AbstractComposeView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.snapshotStateObserver.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.snapshotStateObserver.stop();
        this.snapshotStateObserver.clear();
    }

    @Override // android.view.View
    public boolean onTouchEvent(@m MotionEvent motionEvent) {
        boolean z4;
        if (!this.properties.getDismissOnClickOutside()) {
            return super.onTouchEvent(motionEvent);
        }
        boolean z5 = false;
        if (motionEvent != null && motionEvent.getAction() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            v3.a<r2> aVar = this.onDismissRequest;
            if (aVar != null) {
                aVar.invoke();
            }
            return true;
        }
        if (motionEvent != null && motionEvent.getAction() == 4) {
            z5 = true;
        }
        if (z5) {
            v3.a<r2> aVar2 = this.onDismissRequest;
            if (aVar2 != null) {
                aVar2.invoke();
            }
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void pollForLocationOnScreenChange() {
        int[] iArr = this.locationOnScreen;
        int i5 = iArr[0];
        int i6 = iArr[1];
        this.composeView.getLocationOnScreen(iArr);
        int[] iArr2 = this.locationOnScreen;
        if (i5 != iArr2[0] || i6 != iArr2[1]) {
            updateParentBounds$ui_release();
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i5) {
    }

    public final void setParentLayoutDirection(@l LayoutDirection layoutDirection) {
        this.parentLayoutDirection = layoutDirection;
    }

    /* renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m6298setPopupContentSizefhxjrPA(@m IntSize intSize) {
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

    public final void updateParameters(@m v3.a<r2> aVar, @l PopupProperties popupProperties, @l String str, @l LayoutDirection layoutDirection) {
        this.onDismissRequest = aVar;
        if (popupProperties.getUsePlatformDefaultWidth() && !this.properties.getUsePlatformDefaultWidth()) {
            WindowManager.LayoutParams layoutParams = this.params;
            layoutParams.width = -2;
            layoutParams.height = -2;
            this.popupLayoutHelper.updateViewLayout(this.windowManager, this, layoutParams);
        }
        this.properties = popupProperties;
        this.testTag = str;
        setIsFocusable(popupProperties.getFocusable());
        setSecurePolicy(popupProperties.getSecurePolicy());
        setClippingEnabled(popupProperties.getClippingEnabled());
        superSetLayoutDirection(layoutDirection);
    }

    @VisibleForTesting
    public final void updateParentBounds$ui_release() {
        int L0;
        int L02;
        LayoutCoordinates parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates == null) {
            return;
        }
        long mo5005getSizeYbymL2g = parentLayoutCoordinates.mo5005getSizeYbymL2g();
        long positionInWindow = LayoutCoordinatesKt.positionInWindow(parentLayoutCoordinates);
        L0 = d.L0(Offset.m3493getXimpl(positionInWindow));
        L02 = d.L0(Offset.m3494getYimpl(positionInWindow));
        IntRect m6204IntRectVbeCjmY = IntRectKt.m6204IntRectVbeCjmY(IntOffsetKt.IntOffset(L0, L02), mo5005getSizeYbymL2g);
        if (!l0.g(m6204IntRectVbeCjmY, this.parentBounds)) {
            this.parentBounds = m6204IntRectVbeCjmY;
            updatePosition();
        }
    }

    public final void updateParentLayoutCoordinates(@l LayoutCoordinates layoutCoordinates) {
        setParentLayoutCoordinates(layoutCoordinates);
        updateParentBounds$ui_release();
    }

    public final void updatePosition() {
        IntSize m6297getPopupContentSizebOM6tXw;
        IntRect intBounds;
        IntRect intRect = this.parentBounds;
        if (intRect != null && (m6297getPopupContentSizebOM6tXw = m6297getPopupContentSizebOM6tXw()) != null) {
            long m6218unboximpl = m6297getPopupContentSizebOM6tXw.m6218unboximpl();
            Rect rect = this.previousWindowVisibleFrame;
            this.popupLayoutHelper.getWindowVisibleDisplayFrame(this.composeView, rect);
            intBounds = AndroidPopup_androidKt.toIntBounds(rect);
            long IntSize = IntSizeKt.IntSize(intBounds.getWidth(), intBounds.getHeight());
            k1.g gVar = new k1.g();
            gVar.element = IntOffset.Companion.m6182getZeronOccac();
            this.snapshotStateObserver.observeReads(this, onCommitAffectingPopupPosition, new PopupLayout$updatePosition$1(gVar, this, intRect, IntSize, m6218unboximpl));
            this.params.x = IntOffset.m6172getXimpl(gVar.element);
            this.params.y = IntOffset.m6173getYimpl(gVar.element);
            if (this.properties.getExcludeFromSystemGesture()) {
                this.popupLayoutHelper.setGestureExclusionRects(this, IntSize.m6214getWidthimpl(IntSize), IntSize.m6213getHeightimpl(IntSize));
            }
            this.popupLayoutHelper.updateViewLayout(this.windowManager, this, this.params);
        }
    }

    public final void setContent(@l CompositionContext compositionContext, @l p<? super Composer, ? super Integer, r2> pVar) {
        setParentCompositionContext(compositionContext);
        setContent(pVar);
        this.shouldCreateCompositionOnAttachedToWindow = true;
    }

    public PopupLayout(@m v3.a<r2> aVar, @l PopupProperties popupProperties, @l String str, @l View view, @l Density density, @l PopupPositionProvider popupPositionProvider, @l UUID uuid, @l PopupLayoutHelper popupLayoutHelper) {
        super(view.getContext(), null, 0, 6, null);
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        MutableState mutableStateOf$default3;
        this.onDismissRequest = aVar;
        this.properties = popupProperties;
        this.testTag = str;
        this.composeView = view;
        this.popupLayoutHelper = popupLayoutHelper;
        Object systemService = view.getContext().getSystemService("window");
        l0.n(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.windowManager = (WindowManager) systemService;
        this.params = createLayoutParams();
        this.positionProvider = popupPositionProvider;
        this.parentLayoutDirection = LayoutDirection.Ltr;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.popupContentSize$delegate = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.parentLayoutCoordinates$delegate = mutableStateOf$default2;
        this.canCalculatePosition$delegate = SnapshotStateKt.derivedStateOf(new PopupLayout$canCalculatePosition$2(this));
        float m6044constructorimpl = Dp.m6044constructorimpl(8);
        this.maxSupportedElevation = m6044constructorimpl;
        this.previousWindowVisibleFrame = new Rect();
        this.snapshotStateObserver = new SnapshotStateObserver(new PopupLayout$snapshotStateObserver$1(this));
        setId(android.R.id.content);
        ViewTreeLifecycleOwner.set(this, ViewTreeLifecycleOwner.get(view));
        ViewTreeViewModelStoreOwner.set(this, ViewTreeViewModelStoreOwner.get(view));
        ViewTreeSavedStateRegistryOwner.set(this, ViewTreeSavedStateRegistryOwner.get(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(density.mo304toPx0680j_4(m6044constructorimpl));
        setOutlineProvider(new ViewOutlineProvider() { // from class: androidx.compose.ui.window.PopupLayout.2
            @Override // android.view.ViewOutlineProvider
            public void getOutline(@l View view2, @l Outline outline) {
                outline.setRect(0, 0, view2.getWidth(), view2.getHeight());
                outline.setAlpha(0.0f);
            }
        });
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ComposableSingletons$AndroidPopup_androidKt.INSTANCE.m6296getLambda1$ui_release(), null, 2, null);
        this.content$delegate = mutableStateOf$default3;
        this.locationOnScreen = new int[2];
    }
}
