package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.net.http.Headers;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.OwnerScope;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import androidx.compose.ui.platform.NestedScrollInteropConnectionKt;
import androidx.compose.ui.platform.WindowRecomposer_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.VelocityKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.umeng.analytics.pro.bi;
import com.umeng.analytics.pro.d;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.r2;
import kotlin.ranges.u;
import kotlinx.coroutines.i;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u0000 ©\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002©\u0001B?\u0012\b\u0010¤\u0001\u001a\u00030£\u0001\u0012\n\u0010¦\u0001\u001a\u0005\u0018\u00010¥\u0001\u0012\u0006\u0010I\u001a\u00020\u0005\u0012\u0006\u0010L\u001a\u00020K\u0012\u0006\u0010N\u001a\u00020\n\u0012\u0006\u0010S\u001a\u00020R¢\u0006\u0006\b§\u0001\u0010¨\u0001J \u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u000e\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000bJ\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\u0018\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005H\u0014J\u0006\u0010\u0016\u001a\u00020\u000fJ0\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0005H\u0014J\n\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016J\u0010\u0010!\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u0017H\u0016J\b\u0010\"\u001a\u00020\u000fH\u0014J\b\u0010#\u001a\u00020\u000fH\u0014J\u001e\u0010)\u001a\u0004\u0018\u00010(2\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010'\u001a\u0004\u0018\u00010&H\u0016J\u0018\u0010,\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\n2\u0006\u0010+\u001a\u00020\nH\u0016J\u0006\u0010-\u001a\u00020\u000fJ\u0010\u0010/\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020\u0005H\u0014J\u0012\u00102\u001a\u00020\u00172\b\u00101\u001a\u0004\u0018\u000100H\u0016J\b\u00103\u001a\u00020\u0017H\u0016J(\u00106\u001a\u00020\u00172\u0006\u0010*\u001a\u00020\n2\u0006\u0010+\u001a\u00020\n2\u0006\u00104\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u0005H\u0016J\b\u00107\u001a\u00020\u0005H\u0016J(\u00108\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\n2\u0006\u0010+\u001a\u00020\n2\u0006\u00104\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u0005H\u0016J\u0018\u00109\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\n2\u0006\u00105\u001a\u00020\u0005H\u0016J@\u0010?\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\n2\u0006\u0010:\u001a\u00020\u00052\u0006\u0010;\u001a\u00020\u00052\u0006\u0010<\u001a\u00020\u00052\u0006\u0010=\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u00052\u0006\u0010>\u001a\u00020$H\u0016J8\u0010?\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\n2\u0006\u0010:\u001a\u00020\u00052\u0006\u0010;\u001a\u00020\u00052\u0006\u0010<\u001a\u00020\u00052\u0006\u0010=\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u0005H\u0016J0\u0010B\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\n2\u0006\u0010@\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u00052\u0006\u0010>\u001a\u00020$2\u0006\u00105\u001a\u00020\u0005H\u0016J(\u0010F\u001a\u00020\u00172\u0006\u0010+\u001a\u00020\n2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020C2\u0006\u0010>\u001a\u00020\u0017H\u0016J \u0010G\u001a\u00020\u00172\u0006\u0010+\u001a\u00020\n2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020CH\u0016J\b\u0010H\u001a\u00020\u0017H\u0016R\u0014\u0010I\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010L\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0017\u0010N\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u0014\u0010S\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR6\u0010W\u001a\b\u0012\u0004\u0012\u00020\u000f0U2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020\u000f0U8\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u0016\u0010]\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R6\u0010`\u001a\b\u0012\u0004\u0012\u00020\u000f0U2\f\u0010_\u001a\b\u0012\u0004\u0012\u00020\u000f0U8\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010X\u001a\u0004\ba\u0010Z\"\u0004\bb\u0010\\R6\u0010c\u001a\b\u0012\u0004\u0012\u00020\u000f0U2\f\u0010_\u001a\b\u0012\u0004\u0012\u00020\u000f0U8\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\bc\u0010X\u001a\u0004\bd\u0010Z\"\u0004\be\u0010\\R*\u0010g\u001a\u00020f2\u0006\u0010V\u001a\u00020f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR0\u0010n\u001a\u0010\u0012\u0004\u0012\u00020f\u0012\u0004\u0012\u00020\u000f\u0018\u00010m8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR*\u0010u\u001a\u00020t2\u0006\u0010V\u001a\u00020t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bu\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR0\u0010{\u001a\u0010\u0012\u0004\u0012\u00020t\u0012\u0004\u0012\u00020\u000f\u0018\u00010m8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b{\u0010o\u001a\u0004\b|\u0010q\"\u0004\b}\u0010sR3\u0010\u007f\u001a\u0004\u0018\u00010~2\b\u0010V\u001a\u0004\u0018\u00010~8\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R7\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0085\u00012\t\u0010V\u001a\u0005\u0018\u00010\u0085\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R\u001c\u0010\u008c\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0U8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u008c\u0001\u0010XR\u001c\u0010\u008d\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0U8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u008d\u0001\u0010XR4\u0010\u008e\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000f\u0018\u00010m8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b\u008e\u0001\u0010o\u001a\u0005\b\u008f\u0001\u0010q\"\u0005\b\u0090\u0001\u0010sR\u0015\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b%\u0010\u0091\u0001R\u0018\u0010\u0092\u0001\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0092\u0001\u0010JR\u0018\u0010\u0093\u0001\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0093\u0001\u0010JR\u0018\u0010\u0095\u0001\u001a\u00030\u0094\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0018\u0010\u0097\u0001\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0097\u0001\u0010^R\u001d\u0010\u0099\u0001\u001a\u00030\u0098\u00018\u0006¢\u0006\u0010\n\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0018\u0010 \u0001\u001a\u00030\u009d\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R\u0017\u0010¡\u0001\u001a\u00020\u00178VX\u0096\u0004¢\u0006\b\u001a\u0006\b¡\u0001\u0010¢\u0001¨\u0006ª\u0001"}, d2 = {"Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Landroid/view/ViewGroup;", "Landroidx/core/view/NestedScrollingParent3;", "Landroidx/compose/runtime/ComposeNodeLifecycleCallback;", "Landroidx/compose/ui/node/OwnerScope;", "", "min", "max", "preferred", "obtainMeasureSpec", "Landroid/view/View;", "Landroidx/compose/ui/viewinterop/InteropView;", "getInteropView", "", "getAccessibilityClassName", "Lkotlin/r2;", "onReuse", "onDeactivate", "onRelease", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "remeasure", "", "changed", "l", bi.aL, "r", "b", "onLayout", "Landroid/view/ViewGroup$LayoutParams;", "getLayoutParams", "disallowIntercept", "requestDisallowInterceptTouchEvent", "onAttachedToWindow", "onDetachedFromWindow", "", Headers.LOCATION, "Landroid/graphics/Rect;", "dirty", "Landroid/view/ViewParent;", "invalidateChildInParent", "child", TypedValues.AttributesType.S_TARGET, "onDescendantInvalidated", "invalidateOrDefer", "visibility", "onWindowVisibilityChanged", "Landroid/graphics/Region;", "region", "gatherTransparentRegion", "shouldDelayChildPressedState", "axes", "type", "onStartNestedScroll", "getNestedScrollAxes", "onNestedScrollAccepted", "onStopNestedScroll", "dxConsumed", "dyConsumed", "dxUnconsumed", "dyUnconsumed", "consumed", "onNestedScroll", "dx", "dy", "onNestedPreScroll", "", "velocityX", "velocityY", "onNestedFling", "onNestedPreFling", "isNestedScrollingEnabled", "compositeKeyHash", "I", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "dispatcher", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Landroidx/compose/ui/node/Owner;", "owner", "Landroidx/compose/ui/node/Owner;", "Lkotlin/Function0;", t0.b.f22420d, "update", "Lv3/a;", "getUpdate", "()Lv3/a;", "setUpdate", "(Lv3/a;)V", "hasUpdateBlock", "Z", "<set-?>", "reset", "getReset", "setReset", "release", "getRelease", "setRelease", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "setModifier", "(Landroidx/compose/ui/Modifier;)V", "Lkotlin/Function1;", "onModifierChanged", "Lv3/l;", "getOnModifierChanged$ui_release", "()Lv3/l;", "setOnModifierChanged$ui_release", "(Lv3/l;)V", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "onDensityChanged", "getOnDensityChanged$ui_release", "setOnDensityChanged$ui_release", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "setLifecycleOwner", "(Landroidx/lifecycle/LifecycleOwner;)V", "Landroidx/savedstate/SavedStateRegistryOwner;", "savedStateRegistryOwner", "Landroidx/savedstate/SavedStateRegistryOwner;", "getSavedStateRegistryOwner", "()Landroidx/savedstate/SavedStateRegistryOwner;", "setSavedStateRegistryOwner", "(Landroidx/savedstate/SavedStateRegistryOwner;)V", "runUpdate", "runInvalidate", "onRequestDisallowInterceptTouchEvent", "getOnRequestDisallowInterceptTouchEvent$ui_release", "setOnRequestDisallowInterceptTouchEvent$ui_release", "[I", "lastWidthMeasureSpec", "lastHeightMeasureSpec", "Landroidx/core/view/NestedScrollingParentHelper;", "nestedScrollingParentHelper", "Landroidx/core/view/NestedScrollingParentHelper;", "isDrawing", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "getSnapshotObserver", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "snapshotObserver", "isValidOwnerScope", "()Z", "Landroid/content/Context;", d.X, "Landroidx/compose/runtime/CompositionContext;", "parentContext", "<init>", "(Landroid/content/Context;Landroidx/compose/runtime/CompositionContext;ILandroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;Landroid/view/View;Landroidx/compose/ui/node/Owner;)V", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public class AndroidViewHolder extends ViewGroup implements NestedScrollingParent3, ComposeNodeLifecycleCallback, OwnerScope {
    private final int compositeKeyHash;

    @l
    private Density density;

    @l
    private final NestedScrollDispatcher dispatcher;
    private boolean hasUpdateBlock;
    private boolean isDrawing;
    private int lastHeightMeasureSpec;
    private int lastWidthMeasureSpec;

    @l
    private final LayoutNode layoutNode;

    @m
    private LifecycleOwner lifecycleOwner;

    @l
    private final int[] location;

    @l
    private Modifier modifier;

    @l
    private final NestedScrollingParentHelper nestedScrollingParentHelper;

    @m
    private v3.l<? super Density, r2> onDensityChanged;

    @m
    private v3.l<? super Modifier, r2> onModifierChanged;

    @m
    private v3.l<? super Boolean, r2> onRequestDisallowInterceptTouchEvent;

    @l
    private final Owner owner;

    @l
    private v3.a<r2> release;

    @l
    private v3.a<r2> reset;

    @l
    private final v3.a<r2> runInvalidate;

    @l
    private final v3.a<r2> runUpdate;

    @m
    private SavedStateRegistryOwner savedStateRegistryOwner;

    @l
    private v3.a<r2> update;

    @l
    private final View view;

    @l
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @l
    private static final v3.l<AndroidViewHolder, r2> OnCommitAffectingUpdate = AndroidViewHolder$Companion$OnCommitAffectingUpdate$1.INSTANCE;

    @i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/ui/viewinterop/AndroidViewHolder$Companion;", "", "Lkotlin/Function1;", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Lkotlin/r2;", "OnCommitAffectingUpdate", "Lv3/l;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AndroidViewHolder(@l Context context, @m CompositionContext compositionContext, int i5, @l NestedScrollDispatcher nestedScrollDispatcher, @l View view, @l Owner owner) {
        super(context);
        this.compositeKeyHash = i5;
        this.dispatcher = nestedScrollDispatcher;
        this.view = view;
        this.owner = owner;
        if (compositionContext != null) {
            WindowRecomposer_androidKt.setCompositionContext(this, compositionContext);
        }
        setSaveFromParentEnabled(false);
        addView(view);
        this.update = AndroidViewHolder$update$1.INSTANCE;
        this.reset = AndroidViewHolder$reset$1.INSTANCE;
        this.release = AndroidViewHolder$release$1.INSTANCE;
        Modifier.Companion companion = Modifier.Companion;
        this.modifier = companion;
        this.density = DensityKt.Density$default(1.0f, 0.0f, 2, null);
        this.runUpdate = new AndroidViewHolder$runUpdate$1(this);
        this.runInvalidate = new AndroidViewHolder$runInvalidate$1(this);
        this.location = new int[2];
        this.lastWidthMeasureSpec = Integer.MIN_VALUE;
        this.lastHeightMeasureSpec = Integer.MIN_VALUE;
        this.nestedScrollingParentHelper = new NestedScrollingParentHelper(this);
        Object[] objArr = 0 == true ? 1 : 0;
        final LayoutNode layoutNode = new LayoutNode(false, objArr, 3, null);
        layoutNode.setInteropViewFactoryHolder$ui_release(this);
        Modifier onGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(DrawModifierKt.drawBehind(PointerInteropFilter_androidKt.pointerInteropFilter(SemanticsModifierKt.semantics(NestedScrollModifierKt.nestedScroll(companion, AndroidViewHolder_androidKt.access$getNoOpScrollConnection$p(), nestedScrollDispatcher), true, AndroidViewHolder$layoutNode$1$coreModifier$1.INSTANCE), this), new AndroidViewHolder$layoutNode$1$coreModifier$2(this, layoutNode, this)), new AndroidViewHolder$layoutNode$1$coreModifier$3(this, layoutNode));
        layoutNode.setCompositeKeyHash(i5);
        layoutNode.setModifier(this.modifier.then(onGloballyPositioned));
        this.onModifierChanged = new AndroidViewHolder$layoutNode$1$1(layoutNode, onGloballyPositioned);
        layoutNode.setDensity(this.density);
        this.onDensityChanged = new AndroidViewHolder$layoutNode$1$2(layoutNode);
        layoutNode.setOnAttach$ui_release(new AndroidViewHolder$layoutNode$1$3(this, layoutNode));
        layoutNode.setOnDetach$ui_release(new AndroidViewHolder$layoutNode$1$4(this));
        layoutNode.setMeasurePolicy(new MeasurePolicy() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5
            private final int intrinsicHeight(int i6) {
                int obtainMeasureSpec;
                AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
                ViewGroup.LayoutParams layoutParams = androidViewHolder.getLayoutParams();
                l0.m(layoutParams);
                obtainMeasureSpec = androidViewHolder.obtainMeasureSpec(0, i6, layoutParams.width);
                androidViewHolder.measure(obtainMeasureSpec, View.MeasureSpec.makeMeasureSpec(0, 0));
                return AndroidViewHolder.this.getMeasuredHeight();
            }

            private final int intrinsicWidth(int i6) {
                int obtainMeasureSpec;
                AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                AndroidViewHolder androidViewHolder2 = AndroidViewHolder.this;
                ViewGroup.LayoutParams layoutParams = androidViewHolder2.getLayoutParams();
                l0.m(layoutParams);
                obtainMeasureSpec = androidViewHolder2.obtainMeasureSpec(0, i6, layoutParams.height);
                androidViewHolder.measure(makeMeasureSpec, obtainMeasureSpec);
                return AndroidViewHolder.this.getMeasuredWidth();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicHeight(@l IntrinsicMeasureScope intrinsicMeasureScope, @l List<? extends IntrinsicMeasurable> list, int i6) {
                return intrinsicHeight(i6);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicWidth(@l IntrinsicMeasureScope intrinsicMeasureScope, @l List<? extends IntrinsicMeasurable> list, int i6) {
                return intrinsicWidth(i6);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            @l
            /* renamed from: measure-3p2s80s */
            public MeasureResult mo30measure3p2s80s(@l MeasureScope measureScope, @l List<? extends Measurable> list, long j5) {
                int obtainMeasureSpec;
                int obtainMeasureSpec2;
                if (AndroidViewHolder.this.getChildCount() == 0) {
                    return MeasureScope.layout$default(measureScope, Constraints.m6002getMinWidthimpl(j5), Constraints.m6001getMinHeightimpl(j5), null, AndroidViewHolder$layoutNode$1$5$measure$1.INSTANCE, 4, null);
                }
                if (Constraints.m6002getMinWidthimpl(j5) != 0) {
                    AndroidViewHolder.this.getChildAt(0).setMinimumWidth(Constraints.m6002getMinWidthimpl(j5));
                }
                if (Constraints.m6001getMinHeightimpl(j5) != 0) {
                    AndroidViewHolder.this.getChildAt(0).setMinimumHeight(Constraints.m6001getMinHeightimpl(j5));
                }
                AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
                int m6002getMinWidthimpl = Constraints.m6002getMinWidthimpl(j5);
                int m6000getMaxWidthimpl = Constraints.m6000getMaxWidthimpl(j5);
                ViewGroup.LayoutParams layoutParams = AndroidViewHolder.this.getLayoutParams();
                l0.m(layoutParams);
                obtainMeasureSpec = androidViewHolder.obtainMeasureSpec(m6002getMinWidthimpl, m6000getMaxWidthimpl, layoutParams.width);
                AndroidViewHolder androidViewHolder2 = AndroidViewHolder.this;
                int m6001getMinHeightimpl = Constraints.m6001getMinHeightimpl(j5);
                int m5999getMaxHeightimpl = Constraints.m5999getMaxHeightimpl(j5);
                ViewGroup.LayoutParams layoutParams2 = AndroidViewHolder.this.getLayoutParams();
                l0.m(layoutParams2);
                obtainMeasureSpec2 = androidViewHolder2.obtainMeasureSpec(m6001getMinHeightimpl, m5999getMaxHeightimpl, layoutParams2.height);
                androidViewHolder.measure(obtainMeasureSpec, obtainMeasureSpec2);
                return MeasureScope.layout$default(measureScope, AndroidViewHolder.this.getMeasuredWidth(), AndroidViewHolder.this.getMeasuredHeight(), null, new AndroidViewHolder$layoutNode$1$5$measure$2(AndroidViewHolder.this, layoutNode), 4, null);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicHeight(@l IntrinsicMeasureScope intrinsicMeasureScope, @l List<? extends IntrinsicMeasurable> list, int i6) {
                return intrinsicHeight(i6);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicWidth(@l IntrinsicMeasureScope intrinsicMeasureScope, @l List<? extends IntrinsicMeasurable> list, int i6) {
                return intrinsicWidth(i6);
            }
        });
        this.layoutNode = layoutNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OwnerSnapshotObserver getSnapshotObserver() {
        if (isAttachedToWindow()) {
            return this.owner.getSnapshotObserver();
        }
        throw new IllegalStateException("Expected AndroidViewHolder to be attached when observing reads.".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int obtainMeasureSpec(int i5, int i6, int i7) {
        int I;
        if (i7 < 0 && i5 != i6) {
            if (i7 == -2 && i6 != Integer.MAX_VALUE) {
                return View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
            }
            if (i7 == -1 && i6 != Integer.MAX_VALUE) {
                return View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
            }
            return View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        I = u.I(i7, i5, i6);
        return View.MeasureSpec.makeMeasureSpec(I, 1073741824);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean gatherTransparentRegion(@m Region region) {
        if (region == null) {
            return true;
        }
        getLocationInWindow(this.location);
        int[] iArr = this.location;
        int i5 = iArr[0];
        region.op(i5, iArr[1], i5 + getWidth(), this.location[1] + getHeight(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    @l
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    @l
    public final Density getDensity() {
        return this.density;
    }

    @m
    public final View getInteropView() {
        return this.view;
    }

    @l
    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    @Override // android.view.View
    @m
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
        if (layoutParams == null) {
            return new ViewGroup.LayoutParams(-1, -1);
        }
        return layoutParams;
    }

    @m
    public final LifecycleOwner getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    @l
    public final Modifier getModifier() {
        return this.modifier;
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.nestedScrollingParentHelper.getNestedScrollAxes();
    }

    @m
    public final v3.l<Density, r2> getOnDensityChanged$ui_release() {
        return this.onDensityChanged;
    }

    @m
    public final v3.l<Modifier, r2> getOnModifierChanged$ui_release() {
        return this.onModifierChanged;
    }

    @m
    public final v3.l<Boolean, r2> getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.onRequestDisallowInterceptTouchEvent;
    }

    @l
    public final v3.a<r2> getRelease() {
        return this.release;
    }

    @l
    public final v3.a<r2> getReset() {
        return this.reset;
    }

    @m
    public final SavedStateRegistryOwner getSavedStateRegistryOwner() {
        return this.savedStateRegistryOwner;
    }

    @l
    public final v3.a<r2> getUpdate() {
        return this.update;
    }

    @l
    public final View getView() {
        return this.view;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    @m
    public ViewParent invalidateChildInParent(@m int[] iArr, @m Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        invalidateOrDefer();
        return null;
    }

    public final void invalidateOrDefer() {
        if (this.isDrawing) {
            View view = this.view;
            final v3.a<r2> aVar = this.runInvalidate;
            view.postOnAnimation(new Runnable() { // from class: androidx.compose.ui.viewinterop.a
                @Override // java.lang.Runnable
                public final void run() {
                    v3.a.this.invoke();
                }
            });
            return;
        }
        this.layoutNode.invalidateLayer$ui_release();
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.view.isNestedScrollingEnabled();
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return isAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.runUpdate.invoke();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onDeactivate() {
        this.reset.invoke();
        removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(@l View view, @l View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidateOrDefer();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().clear$ui_release(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i5, int i6, int i7, int i8) {
        this.view.layout(0, 0, i7 - i5, i8 - i6);
    }

    @Override // android.view.View
    protected void onMeasure(int i5, int i6) {
        if (this.view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i5), View.MeasureSpec.getSize(i6));
            return;
        }
        if (this.view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        this.view.measure(i5, i6);
        setMeasuredDimension(this.view.getMeasuredWidth(), this.view.getMeasuredHeight());
        this.lastWidthMeasureSpec = i5;
        this.lastHeightMeasureSpec = i6;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(@l View view, float f5, float f6, boolean z4) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        i.e(this.dispatcher.getCoroutineScope(), null, null, new AndroidViewHolder$onNestedFling$1(z4, this, VelocityKt.Velocity(AndroidViewHolder_androidKt.access$toComposeVelocity(f5), AndroidViewHolder_androidKt.access$toComposeVelocity(f6)), null), 3, null);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(@l View view, float f5, float f6) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        i.e(this.dispatcher.getCoroutineScope(), null, null, new AndroidViewHolder$onNestedPreFling$1(this, VelocityKt.Velocity(AndroidViewHolder_androidKt.access$toComposeVelocity(f5), AndroidViewHolder_androidKt.access$toComposeVelocity(f6)), null), 3, null);
        return false;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(@l View view, int i5, int i6, @l int[] iArr, int i7) {
        if (!isNestedScrollingEnabled()) {
            return;
        }
        long m4757dispatchPreScrollOzD1aCk = this.dispatcher.m4757dispatchPreScrollOzD1aCk(OffsetKt.Offset(AndroidViewHolder_androidKt.access$toComposeOffset(i5), AndroidViewHolder_androidKt.access$toComposeOffset(i6)), AndroidViewHolder_androidKt.access$toNestedScrollSource(i7));
        iArr[0] = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m3493getXimpl(m4757dispatchPreScrollOzD1aCk));
        iArr[1] = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m3494getYimpl(m4757dispatchPreScrollOzD1aCk));
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(@l View view, int i5, int i6, int i7, int i8, int i9, @l int[] iArr) {
        if (isNestedScrollingEnabled()) {
            long m4755dispatchPostScrollDzOQY0M = this.dispatcher.m4755dispatchPostScrollDzOQY0M(OffsetKt.Offset(AndroidViewHolder_androidKt.access$toComposeOffset(i5), AndroidViewHolder_androidKt.access$toComposeOffset(i6)), OffsetKt.Offset(AndroidViewHolder_androidKt.access$toComposeOffset(i7), AndroidViewHolder_androidKt.access$toComposeOffset(i8)), AndroidViewHolder_androidKt.access$toNestedScrollSource(i9));
            iArr[0] = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m3493getXimpl(m4755dispatchPostScrollDzOQY0M));
            iArr[1] = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m3494getYimpl(m4755dispatchPostScrollDzOQY0M));
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(@l View view, @l View view2, int i5, int i6) {
        this.nestedScrollingParentHelper.onNestedScrollAccepted(view, view2, i5, i6);
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onRelease() {
        this.release.invoke();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onReuse() {
        if (this.view.getParent() != this) {
            addView(this.view);
        } else {
            this.reset.invoke();
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(@l View view, @l View view2, int i5, int i6) {
        return ((i5 & 2) == 0 && (i5 & 1) == 0) ? false : true;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(@l View view, int i5) {
        this.nestedScrollingParentHelper.onStopNestedScroll(view, i5);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i5) {
        super.onWindowVisibilityChanged(i5);
    }

    public final void remeasure() {
        int i5;
        int i6 = this.lastWidthMeasureSpec;
        if (i6 != Integer.MIN_VALUE && (i5 = this.lastHeightMeasureSpec) != Integer.MIN_VALUE) {
            measure(i6, i5);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z4) {
        v3.l<? super Boolean, r2> lVar = this.onRequestDisallowInterceptTouchEvent;
        if (lVar != null) {
            lVar.invoke(Boolean.valueOf(z4));
        }
        super.requestDisallowInterceptTouchEvent(z4);
    }

    public final void setDensity(@l Density density) {
        if (density != this.density) {
            this.density = density;
            v3.l<? super Density, r2> lVar = this.onDensityChanged;
            if (lVar != null) {
                lVar.invoke(density);
            }
        }
    }

    public final void setLifecycleOwner(@m LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner != this.lifecycleOwner) {
            this.lifecycleOwner = lifecycleOwner;
            ViewTreeLifecycleOwner.set(this, lifecycleOwner);
        }
    }

    public final void setModifier(@l Modifier modifier) {
        if (modifier != this.modifier) {
            this.modifier = modifier;
            v3.l<? super Modifier, r2> lVar = this.onModifierChanged;
            if (lVar != null) {
                lVar.invoke(modifier);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(@m v3.l<? super Density, r2> lVar) {
        this.onDensityChanged = lVar;
    }

    public final void setOnModifierChanged$ui_release(@m v3.l<? super Modifier, r2> lVar) {
        this.onModifierChanged = lVar;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(@m v3.l<? super Boolean, r2> lVar) {
        this.onRequestDisallowInterceptTouchEvent = lVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setRelease(@l v3.a<r2> aVar) {
        this.release = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setReset(@l v3.a<r2> aVar) {
        this.reset = aVar;
    }

    public final void setSavedStateRegistryOwner(@m SavedStateRegistryOwner savedStateRegistryOwner) {
        if (savedStateRegistryOwner != this.savedStateRegistryOwner) {
            this.savedStateRegistryOwner = savedStateRegistryOwner;
            ViewTreeSavedStateRegistryOwner.set(this, savedStateRegistryOwner);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setUpdate(@l v3.a<r2> aVar) {
        this.update = aVar;
        this.hasUpdateBlock = true;
        this.runUpdate.invoke();
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(@l View view, int i5, int i6, int i7, int i8, int i9) {
        if (isNestedScrollingEnabled()) {
            this.dispatcher.m4755dispatchPostScrollDzOQY0M(OffsetKt.Offset(AndroidViewHolder_androidKt.access$toComposeOffset(i5), AndroidViewHolder_androidKt.access$toComposeOffset(i6)), OffsetKt.Offset(AndroidViewHolder_androidKt.access$toComposeOffset(i7), AndroidViewHolder_androidKt.access$toComposeOffset(i8)), AndroidViewHolder_androidKt.access$toNestedScrollSource(i9));
        }
    }
}
