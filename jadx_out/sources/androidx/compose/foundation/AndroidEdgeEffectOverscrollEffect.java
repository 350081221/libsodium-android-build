package androidx.compose.foundation;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.collections.w;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010k\u001a\u00020j\u0012\u0006\u00107\u001a\u000206¢\u0006\u0004\bl\u0010mJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\n\u001a\u00020\u0002*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0002J \u0010\f\u001a\u00020\u0002*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00052\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0002J \u0010\u000e\u001a\u00020\u0002*\u00020\u00042\u0006\u0010\r\u001a\u00020\u00052\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0002J \u0010\u0010\u001a\u00020\u0002*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00052\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0013\u001a\u00020\u0011H\u0002J\u001a\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\"\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0014H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\"\u0010 \u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0014H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001dJ\"\u0010\"\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0014H\u0002ø\u0001\u0000¢\u0006\u0004\b!\u0010\u001dJ\"\u0010$\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0014H\u0002ø\u0001\u0000¢\u0006\u0004\b#\u0010\u001dJ6\u0010+\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010&\u001a\u00020%2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140'H\u0016ø\u0001\u0000¢\u0006\u0004\b)\u0010*J?\u00104\u001a\u00020\u00112\u0006\u0010-\u001a\u00020,2\"\u00101\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020,\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0/\u0012\u0006\u0012\u0004\u0018\u0001000.H\u0096@ø\u0001\u0000¢\u0006\u0004\b2\u00103J\n\u00105\u001a\u00020\u0011*\u00020\u0004R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001e\u00109\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010;\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010=\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010<R\u0014\u0010>\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010<R\u0014\u0010?\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010<R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00050@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010C\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010<R\u0014\u0010D\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010<R\u0014\u0010E\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010<R\u0014\u0010F\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010<R\u0016\u0010H\u001a\u00020G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR+\u0010Q\u001a\u00020G2\u0006\u0010J\u001a\u00020G8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR(\u0010R\u001a\u00020\u00028\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bR\u0010S\u0012\u0004\bX\u0010Y\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u0016\u0010Z\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010SR\u001c\u0010\\\u001a\u00020[8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\\\u0010]R \u0010_\u001a\u000e\u0012\u0004\u0012\u00020^\u0012\u0004\u0012\u00020\u00110'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u001e\u0010b\u001a\u0004\u0018\u00010a8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bb\u0010cR\u001a\u0010e\u001a\u00020d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR\u0014\u0010i\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bi\u0010U\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006n"}, d2 = {"Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;", "Landroidx/compose/foundation/OverscrollEffect;", "", "stopOverscrollAnimation", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroid/widget/EdgeEffect;", "left", "Landroid/graphics/Canvas;", "Landroidx/compose/ui/graphics/NativeCanvas;", "canvas", "drawLeft", "top", "drawTop", "right", "drawRight", "bottom", "drawBottom", "Lkotlin/r2;", "invalidateOverscroll", "animateToRelease", "Landroidx/compose/ui/geometry/Offset;", "delta", "releaseOppositeOverscroll-k-4lQ0M", "(J)Z", "releaseOppositeOverscroll", "scroll", "displacement", "", "pullTop-0a9Yr6o", "(JJ)F", "pullTop", "pullBottom-0a9Yr6o", "pullBottom", "pullLeft-0a9Yr6o", "pullLeft", "pullRight-0a9Yr6o", "pullRight", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "Lkotlin/Function1;", "performScroll", "applyToScroll-Rhakbz0", "(JILv3/l;)J", "applyToScroll", "Landroidx/compose/ui/unit/Velocity;", "velocity", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "performFling", "applyToFling-BMRW4eQ", "(JLv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "applyToFling", "drawOverscroll", "Landroidx/compose/foundation/OverscrollConfiguration;", "overscrollConfig", "Landroidx/compose/foundation/OverscrollConfiguration;", "pointerPosition", "Landroidx/compose/ui/geometry/Offset;", "topEffect", "Landroid/widget/EdgeEffect;", "bottomEffect", "leftEffect", "rightEffect", "", "allEffects", "Ljava/util/List;", "topEffectNegation", "bottomEffectNegation", "leftEffectNegation", "rightEffectNegation", "", "consumeCount", "I", "<set-?>", "invalidateCount$delegate", "Landroidx/compose/runtime/MutableIntState;", "getInvalidateCount", "()I", "setInvalidateCount", "(I)V", "invalidateCount", "invalidationEnabled", "Z", "getInvalidationEnabled$foundation_release", "()Z", "setInvalidationEnabled$foundation_release", "(Z)V", "getInvalidationEnabled$foundation_release$annotations", "()V", "scrollCycleInProgress", "Landroidx/compose/ui/geometry/Size;", "containerSize", "J", "Landroidx/compose/ui/unit/IntSize;", "onNewSize", "Lv3/l;", "Landroidx/compose/ui/input/pointer/PointerId;", "pointerId", "Landroidx/compose/ui/input/pointer/PointerId;", "Landroidx/compose/ui/Modifier;", "effectModifier", "Landroidx/compose/ui/Modifier;", "getEffectModifier", "()Landroidx/compose/ui/Modifier;", "isInProgress", "Landroid/content/Context;", com.umeng.analytics.pro.d.X, "<init>", "(Landroid/content/Context;Landroidx/compose/foundation/OverscrollConfiguration;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nAndroidOverscroll.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 4 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 5 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,595:1\n33#2,6:596\n101#2,2:606\n33#2,6:608\n103#2:614\n33#2,6:616\n135#3:602\n75#4:603\n108#4,2:604\n246#5:615\n*S KotlinDebug\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect\n*L\n125#1:596,6\n270#1:606,2\n270#1:608,6\n270#1:614\n451#1:616,6\n345#1:602\n130#1:603\n130#1:604,2\n355#1:615\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidEdgeEffectOverscrollEffect implements OverscrollEffect {
    public static final int $stable = 0;

    @p4.l
    private final List<EdgeEffect> allEffects;

    @p4.l
    private final EdgeEffect bottomEffect;

    @p4.l
    private final EdgeEffect bottomEffectNegation;
    private int consumeCount;
    private long containerSize;

    @p4.l
    private final Modifier effectModifier;

    @p4.l
    private final MutableIntState invalidateCount$delegate;
    private boolean invalidationEnabled;

    @p4.l
    private final EdgeEffect leftEffect;

    @p4.l
    private final EdgeEffect leftEffectNegation;

    @p4.l
    private final v3.l<IntSize, r2> onNewSize;

    @p4.l
    private final OverscrollConfiguration overscrollConfig;

    @p4.m
    private PointerId pointerId;

    @p4.m
    private Offset pointerPosition;

    @p4.l
    private final EdgeEffect rightEffect;

    @p4.l
    private final EdgeEffect rightEffectNegation;
    private boolean scrollCycleInProgress;

    @p4.l
    private final EdgeEffect topEffect;

    @p4.l
    private final EdgeEffect topEffectNegation;

    public AndroidEdgeEffectOverscrollEffect(@p4.l Context context, @p4.l OverscrollConfiguration overscrollConfiguration) {
        List<EdgeEffect> L;
        Modifier modifier;
        v3.l noInspectorInfo;
        this.overscrollConfig = overscrollConfiguration;
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        EdgeEffect create = edgeEffectCompat.create(context, null);
        this.topEffect = create;
        EdgeEffect create2 = edgeEffectCompat.create(context, null);
        this.bottomEffect = create2;
        EdgeEffect create3 = edgeEffectCompat.create(context, null);
        this.leftEffect = create3;
        EdgeEffect create4 = edgeEffectCompat.create(context, null);
        this.rightEffect = create4;
        L = w.L(create3, create, create4, create2);
        this.allEffects = L;
        this.topEffectNegation = edgeEffectCompat.create(context, null);
        this.bottomEffectNegation = edgeEffectCompat.create(context, null);
        this.leftEffectNegation = edgeEffectCompat.create(context, null);
        this.rightEffectNegation = edgeEffectCompat.create(context, null);
        int size = L.size();
        for (int i5 = 0; i5 < size; i5++) {
            L.get(i5).setColor(ColorKt.m3788toArgb8_81llA(this.overscrollConfig.m290getGlowColor0d7_KjU()));
        }
        this.consumeCount = -1;
        this.invalidateCount$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
        this.invalidationEnabled = true;
        this.containerSize = Size.Companion.m3571getZeroNHjbRc();
        AndroidEdgeEffectOverscrollEffect$onNewSize$1 androidEdgeEffectOverscrollEffect$onNewSize$1 = new AndroidEdgeEffectOverscrollEffect$onNewSize$1(this);
        this.onNewSize = androidEdgeEffectOverscrollEffect$onNewSize$1;
        Modifier.Companion companion = Modifier.Companion;
        modifier = AndroidOverscroll_androidKt.StretchOverscrollNonClippingLayer;
        Modifier onSizeChanged = OnRemeasuredModifierKt.onSizeChanged(SuspendingPointerInputFilterKt.pointerInput(companion.then(modifier), r2.f19517a, new AndroidEdgeEffectOverscrollEffect$effectModifier$1(this, null)), androidEdgeEffectOverscrollEffect$onNewSize$1);
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new AndroidEdgeEffectOverscrollEffect$special$$inlined$debugInspectorInfo$1(this);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        this.effectModifier = onSizeChanged.then(new DrawOverscrollModifier(this, noInspectorInfo));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animateToRelease() {
        List<EdgeEffect> list = this.allEffects;
        int size = list.size();
        boolean z4 = false;
        for (int i5 = 0; i5 < size; i5++) {
            EdgeEffect edgeEffect = list.get(i5);
            edgeEffect.onRelease();
            if (!edgeEffect.isFinished() && !z4) {
                z4 = false;
            } else {
                z4 = true;
            }
        }
        if (z4) {
            invalidateOverscroll();
        }
    }

    private final boolean drawBottom(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(180.0f);
        canvas.translate(-Size.m3562getWidthimpl(this.containerSize), (-Size.m3559getHeightimpl(this.containerSize)) + drawScope.mo304toPx0680j_4(this.overscrollConfig.getDrawPadding().mo503calculateBottomPaddingD9Ej5fM()));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    private final boolean drawLeft(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(270.0f);
        canvas.translate(-Size.m3559getHeightimpl(this.containerSize), drawScope.mo304toPx0680j_4(this.overscrollConfig.getDrawPadding().mo504calculateLeftPaddingu2uoSUM(drawScope.getLayoutDirection())));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    private final boolean drawRight(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        int L0;
        int save = canvas.save();
        L0 = kotlin.math.d.L0(Size.m3562getWidthimpl(this.containerSize));
        float mo505calculateRightPaddingu2uoSUM = this.overscrollConfig.getDrawPadding().mo505calculateRightPaddingu2uoSUM(drawScope.getLayoutDirection());
        canvas.rotate(90.0f);
        canvas.translate(0.0f, (-L0) + drawScope.mo304toPx0680j_4(mo505calculateRightPaddingu2uoSUM));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    private final boolean drawTop(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.translate(0.0f, drawScope.mo304toPx0680j_4(this.overscrollConfig.getDrawPadding().mo506calculateTopPaddingD9Ej5fM()));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    private final int getInvalidateCount() {
        return this.invalidateCount$delegate.getIntValue();
    }

    @VisibleForTesting
    public static /* synthetic */ void getInvalidationEnabled$foundation_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invalidateOverscroll() {
        if (this.invalidationEnabled && this.consumeCount == getInvalidateCount()) {
            setInvalidateCount(getInvalidateCount() + 1);
        }
    }

    /* renamed from: pullBottom-0a9Yr6o, reason: not valid java name */
    private final float m176pullBottom0a9Yr6o(long j5, long j6) {
        float m3493getXimpl = Offset.m3493getXimpl(j6) / Size.m3562getWidthimpl(this.containerSize);
        float m3494getYimpl = Offset.m3494getYimpl(j5) / Size.m3559getHeightimpl(this.containerSize);
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        boolean z4 = true;
        float m3559getHeightimpl = (-edgeEffectCompat.onPullDistanceCompat(this.bottomEffect, -m3494getYimpl, 1 - m3493getXimpl)) * Size.m3559getHeightimpl(this.containerSize);
        if (edgeEffectCompat.getDistanceCompat(this.bottomEffect) != 0.0f) {
            z4 = false;
        }
        if (!z4) {
            return Offset.m3494getYimpl(j5);
        }
        return m3559getHeightimpl;
    }

    /* renamed from: pullLeft-0a9Yr6o, reason: not valid java name */
    private final float m177pullLeft0a9Yr6o(long j5, long j6) {
        float m3494getYimpl = Offset.m3494getYimpl(j6) / Size.m3559getHeightimpl(this.containerSize);
        float m3493getXimpl = Offset.m3493getXimpl(j5) / Size.m3562getWidthimpl(this.containerSize);
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        boolean z4 = true;
        float onPullDistanceCompat = edgeEffectCompat.onPullDistanceCompat(this.leftEffect, m3493getXimpl, 1 - m3494getYimpl) * Size.m3562getWidthimpl(this.containerSize);
        if (edgeEffectCompat.getDistanceCompat(this.leftEffect) != 0.0f) {
            z4 = false;
        }
        if (!z4) {
            return Offset.m3493getXimpl(j5);
        }
        return onPullDistanceCompat;
    }

    /* renamed from: pullRight-0a9Yr6o, reason: not valid java name */
    private final float m178pullRight0a9Yr6o(long j5, long j6) {
        boolean z4;
        float m3494getYimpl = Offset.m3494getYimpl(j6) / Size.m3559getHeightimpl(this.containerSize);
        float m3493getXimpl = Offset.m3493getXimpl(j5) / Size.m3562getWidthimpl(this.containerSize);
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        float m3562getWidthimpl = (-edgeEffectCompat.onPullDistanceCompat(this.rightEffect, -m3493getXimpl, m3494getYimpl)) * Size.m3562getWidthimpl(this.containerSize);
        if (edgeEffectCompat.getDistanceCompat(this.rightEffect) == 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            return Offset.m3493getXimpl(j5);
        }
        return m3562getWidthimpl;
    }

    /* renamed from: pullTop-0a9Yr6o, reason: not valid java name */
    private final float m179pullTop0a9Yr6o(long j5, long j6) {
        boolean z4;
        float m3493getXimpl = Offset.m3493getXimpl(j6) / Size.m3562getWidthimpl(this.containerSize);
        float m3494getYimpl = Offset.m3494getYimpl(j5) / Size.m3559getHeightimpl(this.containerSize);
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        float onPullDistanceCompat = edgeEffectCompat.onPullDistanceCompat(this.topEffect, m3494getYimpl, m3493getXimpl) * Size.m3559getHeightimpl(this.containerSize);
        if (edgeEffectCompat.getDistanceCompat(this.topEffect) == 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            return Offset.m3494getYimpl(j5);
        }
        return onPullDistanceCompat;
    }

    /* renamed from: releaseOppositeOverscroll-k-4lQ0M, reason: not valid java name */
    private final boolean m180releaseOppositeOverscrollk4lQ0M(long j5) {
        boolean z4;
        boolean z5 = false;
        if (!this.leftEffect.isFinished() && Offset.m3493getXimpl(j5) < 0.0f) {
            EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.leftEffect, Offset.m3493getXimpl(j5));
            z4 = this.leftEffect.isFinished();
        } else {
            z4 = false;
        }
        if (!this.rightEffect.isFinished() && Offset.m3493getXimpl(j5) > 0.0f) {
            EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.rightEffect, Offset.m3493getXimpl(j5));
            if (!z4 && !this.rightEffect.isFinished()) {
                z4 = false;
            } else {
                z4 = true;
            }
        }
        if (!this.topEffect.isFinished() && Offset.m3494getYimpl(j5) < 0.0f) {
            EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.topEffect, Offset.m3494getYimpl(j5));
            if (!z4 && !this.topEffect.isFinished()) {
                z4 = false;
            } else {
                z4 = true;
            }
        }
        if (!this.bottomEffect.isFinished() && Offset.m3494getYimpl(j5) > 0.0f) {
            EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.bottomEffect, Offset.m3494getYimpl(j5));
            if (z4 || this.bottomEffect.isFinished()) {
                z5 = true;
            }
            return z5;
        }
        return z4;
    }

    private final void setInvalidateCount(int i5) {
        this.invalidateCount$delegate.setIntValue(i5);
    }

    private final boolean stopOverscrollAnimation() {
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        long m3572getCenteruvyYCjk = SizeKt.m3572getCenteruvyYCjk(this.containerSize);
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        boolean z8 = false;
        if (edgeEffectCompat.getDistanceCompat(this.leftEffect) == 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            m177pullLeft0a9Yr6o(Offset.Companion.m3509getZeroF1C5BW0(), m3572getCenteruvyYCjk);
            z5 = true;
        } else {
            z5 = false;
        }
        if (edgeEffectCompat.getDistanceCompat(this.rightEffect) == 0.0f) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (!z6) {
            m178pullRight0a9Yr6o(Offset.Companion.m3509getZeroF1C5BW0(), m3572getCenteruvyYCjk);
            z5 = true;
        }
        if (edgeEffectCompat.getDistanceCompat(this.topEffect) == 0.0f) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!z7) {
            m179pullTop0a9Yr6o(Offset.Companion.m3509getZeroF1C5BW0(), m3572getCenteruvyYCjk);
            z5 = true;
        }
        if (edgeEffectCompat.getDistanceCompat(this.bottomEffect) == 0.0f) {
            z8 = true;
        }
        if (!z8) {
            m176pullBottom0a9Yr6o(Offset.Companion.m3509getZeroF1C5BW0(), m3572getCenteruvyYCjk);
            return true;
        }
        return z5;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0132 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // androidx.compose.foundation.OverscrollEffect
    @p4.m
    /* renamed from: applyToFling-BMRW4eQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo181applyToFlingBMRW4eQ(long r12, @p4.l v3.p<? super androidx.compose.ui.unit.Velocity, ? super kotlin.coroutines.d<? super androidx.compose.ui.unit.Velocity>, ? extends java.lang.Object> r14, @p4.l kotlin.coroutines.d<? super kotlin.r2> r15) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.mo181applyToFlingBMRW4eQ(long, v3.p, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0175 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00a2  */
    @Override // androidx.compose.foundation.OverscrollEffect
    /* renamed from: applyToScroll-Rhakbz0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long mo182applyToScrollRhakbz0(long r18, int r20, @p4.l v3.l<? super androidx.compose.ui.geometry.Offset, androidx.compose.ui.geometry.Offset> r21) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.mo182applyToScrollRhakbz0(long, int, v3.l):long");
    }

    public final void drawOverscroll(@p4.l DrawScope drawScope) {
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        if (Size.m3564isEmptyimpl(this.containerSize)) {
            return;
        }
        androidx.compose.ui.graphics.Canvas canvas = drawScope.getDrawContext().getCanvas();
        this.consumeCount = getInvalidateCount();
        Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        boolean z9 = true;
        if (edgeEffectCompat.getDistanceCompat(this.leftEffectNegation) == 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            drawRight(drawScope, this.leftEffectNegation, nativeCanvas);
            this.leftEffectNegation.finish();
        }
        if (!this.leftEffect.isFinished()) {
            z5 = drawLeft(drawScope, this.leftEffect, nativeCanvas);
            edgeEffectCompat.onPullDistanceCompat(this.leftEffectNegation, edgeEffectCompat.getDistanceCompat(this.leftEffect), 0.0f);
        } else {
            z5 = false;
        }
        if (edgeEffectCompat.getDistanceCompat(this.topEffectNegation) == 0.0f) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (!z6) {
            drawBottom(drawScope, this.topEffectNegation, nativeCanvas);
            this.topEffectNegation.finish();
        }
        if (!this.topEffect.isFinished()) {
            if (!drawTop(drawScope, this.topEffect, nativeCanvas) && !z5) {
                z5 = false;
            } else {
                z5 = true;
            }
            edgeEffectCompat.onPullDistanceCompat(this.topEffectNegation, edgeEffectCompat.getDistanceCompat(this.topEffect), 0.0f);
        }
        if (edgeEffectCompat.getDistanceCompat(this.rightEffectNegation) == 0.0f) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!z7) {
            drawLeft(drawScope, this.rightEffectNegation, nativeCanvas);
            this.rightEffectNegation.finish();
        }
        if (!this.rightEffect.isFinished()) {
            if (!drawRight(drawScope, this.rightEffect, nativeCanvas) && !z5) {
                z5 = false;
            } else {
                z5 = true;
            }
            edgeEffectCompat.onPullDistanceCompat(this.rightEffectNegation, edgeEffectCompat.getDistanceCompat(this.rightEffect), 0.0f);
        }
        if (edgeEffectCompat.getDistanceCompat(this.bottomEffectNegation) == 0.0f) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (!z8) {
            drawTop(drawScope, this.bottomEffectNegation, nativeCanvas);
            this.bottomEffectNegation.finish();
        }
        if (!this.bottomEffect.isFinished()) {
            if (!drawBottom(drawScope, this.bottomEffect, nativeCanvas) && !z5) {
                z9 = false;
            }
            edgeEffectCompat.onPullDistanceCompat(this.bottomEffectNegation, edgeEffectCompat.getDistanceCompat(this.bottomEffect), 0.0f);
            z5 = z9;
        }
        if (z5) {
            invalidateOverscroll();
        }
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    @p4.l
    public Modifier getEffectModifier() {
        return this.effectModifier;
    }

    public final boolean getInvalidationEnabled$foundation_release() {
        return this.invalidationEnabled;
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public boolean isInProgress() {
        boolean z4;
        List<EdgeEffect> list = this.allEffects;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (EdgeEffectCompat.INSTANCE.getDistanceCompat(list.get(i5)) == 0.0f) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                return true;
            }
        }
        return false;
    }

    public final void setInvalidationEnabled$foundation_release(boolean z4) {
        this.invalidationEnabled = z4;
    }
}
