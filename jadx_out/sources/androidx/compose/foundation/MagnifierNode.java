package androidx.compose.foundation;

import android.view.View;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u009b\u0001\u0012\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000e\u0012\u001b\b\u0002\u0010\u0010\u001a\u0015\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0002\b\u000e\u0012\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b`\u0010aJ\b\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\t\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0007H\u0002J\u0092\u0001\u0010 \u001a\u00020\u00072\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000e2\u0019\u0010\u0010\u001a\u0015\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0002\b\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00132\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b2\u0006\u0010\u001d\u001a\u00020\u001cø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010!\u001a\u00020\u0007H\u0016J\b\u0010\"\u001a\u00020\u0007H\u0016J\b\u0010#\u001a\u00020\u0007H\u0016J\f\u0010%\u001a\u00020\u0007*\u00020$H\u0016J\u0010\u0010(\u001a\u00020\u00072\u0006\u0010'\u001a\u00020&H\u0016J\f\u0010*\u001a\u00020\u0007*\u00020)H\u0016R3\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R5\u0010\u0010\u001a\u0015\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0002\b\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010+\u001a\u0004\b0\u0010-\"\u0004\b1\u0010/R0\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010+\u001a\u0004\b2\u0010-\"\u0004\b3\u0010/R\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R(\u0010\u0016\u001a\u00020\u00158\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0016\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR(\u0010\u0018\u001a\u00020\u00178\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0018\u00104\u001a\u0004\bC\u00106\"\u0004\bD\u00108R(\u0010\u0019\u001a\u00020\u00178\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0019\u00104\u001a\u0004\bE\u00106\"\u0004\bF\u00108R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u00109\u001a\u0004\bG\u0010;\"\u0004\bH\u0010=R\"\u0010\u001d\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u0018\u0010O\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0018\u0010Q\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0018\u0010T\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR1\u0010[\u001a\u00020\r2\u0006\u0010V\u001a\u00020\r8B@BX\u0082\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010@\"\u0004\bZ\u0010BR\u001c\u0010\\\u001a\u00020\r8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\\\u0010>R\u001e\u0010^\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b^\u0010_\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006b"}, d2 = {"Landroidx/compose/foundation/MagnifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/node/ObserverModifierNode;", "Lkotlin/r2;", "recreateMagnifier", "updateMagnifier", "updateSizeIfNecessary", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/u;", "sourceCenter", "magnifierCenter", "", "zoom", "", "useTextDefault", "Landroidx/compose/ui/unit/DpSize;", "size", "Landroidx/compose/ui/unit/Dp;", "cornerRadius", "elevation", "clippingEnabled", "onSizeChanged", "Landroidx/compose/foundation/PlatformMagnifierFactory;", "platformMagnifierFactory", "update-5F03MCQ", "(Lv3/l;Lv3/l;FZJFFZLv3/l;Landroidx/compose/foundation/PlatformMagnifierFactory;)V", "update", "onAttach", "onDetach", "onObservedReadsChanged", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", MediationConstant.RIT_TYPE_DRAW, "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "onGloballyPositioned", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "applySemantics", "Lv3/l;", "getSourceCenter", "()Lv3/l;", "setSourceCenter", "(Lv3/l;)V", "getMagnifierCenter", "setMagnifierCenter", "getOnSizeChanged", "setOnSizeChanged", "F", "getZoom", "()F", "setZoom", "(F)V", "Z", "getUseTextDefault", "()Z", "setUseTextDefault", "(Z)V", "J", "getSize-MYxV2XQ", "()J", "setSize-EaSLcWc", "(J)V", "getCornerRadius-D9Ej5fM", "setCornerRadius-0680j_4", "getElevation-D9Ej5fM", "setElevation-0680j_4", "getClippingEnabled", "setClippingEnabled", "Landroidx/compose/foundation/PlatformMagnifierFactory;", "getPlatformMagnifierFactory", "()Landroidx/compose/foundation/PlatformMagnifierFactory;", "setPlatformMagnifierFactory", "(Landroidx/compose/foundation/PlatformMagnifierFactory;)V", "Landroid/view/View;", "view", "Landroid/view/View;", "density", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/foundation/PlatformMagnifier;", "magnifier", "Landroidx/compose/foundation/PlatformMagnifier;", "<set-?>", "anchorPositionInRoot$delegate", "Landroidx/compose/runtime/MutableState;", "getAnchorPositionInRoot-F1C5BW0", "setAnchorPositionInRoot-k-4lQ0M", "anchorPositionInRoot", "sourceCenterInRoot", "Landroidx/compose/ui/unit/IntSize;", "previousSize", "Landroidx/compose/ui/unit/IntSize;", "<init>", "(Lv3/l;Lv3/l;Lv3/l;FZJFFZLandroidx/compose/foundation/PlatformMagnifierFactory;Lkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nMagnifier.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Magnifier.android.kt\nandroidx/compose/foundation/MagnifierNode\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,467:1\n81#2:468\n107#2,2:469\n1#3:471\n*S KotlinDebug\n*F\n+ 1 Magnifier.android.kt\nandroidx/compose/foundation/MagnifierNode\n*L\n295#1:468\n295#1:469,2\n*E\n"})
/* loaded from: classes.dex */
public final class MagnifierNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, GlobalPositionAwareModifierNode, DrawModifierNode, SemanticsModifierNode, ObserverModifierNode {
    public static final int $stable = 8;

    @p4.l
    private final MutableState anchorPositionInRoot$delegate;
    private boolean clippingEnabled;
    private float cornerRadius;

    @p4.m
    private Density density;
    private float elevation;

    @p4.m
    private PlatformMagnifier magnifier;

    @p4.m
    private v3.l<? super Density, Offset> magnifierCenter;

    @p4.m
    private v3.l<? super DpSize, r2> onSizeChanged;

    @p4.l
    private PlatformMagnifierFactory platformMagnifierFactory;

    @p4.m
    private IntSize previousSize;
    private long size;

    @p4.l
    private v3.l<? super Density, Offset> sourceCenter;
    private long sourceCenterInRoot;
    private boolean useTextDefault;

    @p4.m
    private View view;
    private float zoom;

    public /* synthetic */ MagnifierNode(v3.l lVar, v3.l lVar2, v3.l lVar3, float f5, boolean z4, long j5, float f6, float f7, boolean z5, PlatformMagnifierFactory platformMagnifierFactory, int i5, w wVar) {
        this(lVar, (i5 & 2) != 0 ? null : lVar2, (i5 & 4) != 0 ? null : lVar3, (i5 & 8) != 0 ? Float.NaN : f5, (i5 & 16) != 0 ? false : z4, (i5 & 32) != 0 ? DpSize.Companion.m6151getUnspecifiedMYxV2XQ() : j5, (i5 & 64) != 0 ? Dp.Companion.m6064getUnspecifiedD9Ej5fM() : f6, (i5 & 128) != 0 ? Dp.Companion.m6064getUnspecifiedD9Ej5fM() : f7, (i5 & 256) != 0 ? true : z5, (i5 & 512) != 0 ? PlatformMagnifierFactory.Companion.getForCurrentPlatform() : platformMagnifierFactory, null);
    }

    public /* synthetic */ MagnifierNode(v3.l lVar, v3.l lVar2, v3.l lVar3, float f5, boolean z4, long j5, float f6, float f7, boolean z5, PlatformMagnifierFactory platformMagnifierFactory, w wVar) {
        this(lVar, lVar2, lVar3, f5, z4, j5, f6, f7, z5, platformMagnifierFactory);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getAnchorPositionInRoot-F1C5BW0, reason: not valid java name */
    private final long m258getAnchorPositionInRootF1C5BW0() {
        return ((Offset) this.anchorPositionInRoot$delegate.getValue()).m3503unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void recreateMagnifier() {
        Density density;
        PlatformMagnifier platformMagnifier = this.magnifier;
        if (platformMagnifier != null) {
            platformMagnifier.dismiss();
        }
        View view = this.view;
        if (view == null || (density = this.density) == null) {
            return;
        }
        this.magnifier = this.platformMagnifierFactory.mo293createnHHXs2Y(view, this.useTextDefault, this.size, this.cornerRadius, this.elevation, this.clippingEnabled, density, this.zoom);
        updateSizeIfNecessary();
    }

    /* renamed from: setAnchorPositionInRoot-k-4lQ0M, reason: not valid java name */
    private final void m259setAnchorPositionInRootk4lQ0M(long j5) {
        this.anchorPositionInRoot$delegate.setValue(Offset.m3482boximpl(j5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateMagnifier() {
        Density density;
        long m3508getUnspecifiedF1C5BW0;
        long m3508getUnspecifiedF1C5BW02;
        PlatformMagnifier platformMagnifier = this.magnifier;
        if (platformMagnifier == null || (density = this.density) == null) {
            return;
        }
        long m3503unboximpl = this.sourceCenter.invoke(density).m3503unboximpl();
        if (OffsetKt.m3512isSpecifiedk4lQ0M(m258getAnchorPositionInRootF1C5BW0()) && OffsetKt.m3512isSpecifiedk4lQ0M(m3503unboximpl)) {
            m3508getUnspecifiedF1C5BW0 = Offset.m3498plusMKHz9U(m258getAnchorPositionInRootF1C5BW0(), m3503unboximpl);
        } else {
            m3508getUnspecifiedF1C5BW0 = Offset.Companion.m3508getUnspecifiedF1C5BW0();
        }
        this.sourceCenterInRoot = m3508getUnspecifiedF1C5BW0;
        if (OffsetKt.m3512isSpecifiedk4lQ0M(m3508getUnspecifiedF1C5BW0)) {
            v3.l<? super Density, Offset> lVar = this.magnifierCenter;
            if (lVar != null) {
                Offset m3482boximpl = Offset.m3482boximpl(lVar.invoke(density).m3503unboximpl());
                if (!OffsetKt.m3512isSpecifiedk4lQ0M(m3482boximpl.m3503unboximpl())) {
                    m3482boximpl = null;
                }
                if (m3482boximpl != null) {
                    m3508getUnspecifiedF1C5BW02 = Offset.m3498plusMKHz9U(m258getAnchorPositionInRootF1C5BW0(), m3482boximpl.m3503unboximpl());
                    platformMagnifier.mo292updateWko1d7g(this.sourceCenterInRoot, m3508getUnspecifiedF1C5BW02, this.zoom);
                    updateSizeIfNecessary();
                    return;
                }
            }
            m3508getUnspecifiedF1C5BW02 = Offset.Companion.m3508getUnspecifiedF1C5BW0();
            platformMagnifier.mo292updateWko1d7g(this.sourceCenterInRoot, m3508getUnspecifiedF1C5BW02, this.zoom);
            updateSizeIfNecessary();
            return;
        }
        platformMagnifier.dismiss();
    }

    private final void updateSizeIfNecessary() {
        Density density;
        PlatformMagnifier platformMagnifier = this.magnifier;
        if (platformMagnifier != null && (density = this.density) != null && !IntSize.m6211equalsimpl(platformMagnifier.mo291getSizeYbymL2g(), this.previousSize)) {
            v3.l<? super DpSize, r2> lVar = this.onSizeChanged;
            if (lVar != null) {
                lVar.invoke(DpSize.m6130boximpl(density.mo302toDpSizekrfVVM(IntSizeKt.m6224toSizeozmzZPI(platformMagnifier.mo291getSizeYbymL2g()))));
            }
            this.previousSize = IntSize.m6206boximpl(platformMagnifier.mo291getSizeYbymL2g());
        }
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(@p4.l SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(Magnifier_androidKt.getMagnifierPositionInRoot(), new MagnifierNode$applySemantics$1(this));
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(@p4.l ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        kotlinx.coroutines.k.f(getCoroutineScope(), null, null, new MagnifierNode$draw$1(this, null), 3, null);
    }

    public final boolean getClippingEnabled() {
        return this.clippingEnabled;
    }

    /* renamed from: getCornerRadius-D9Ej5fM, reason: not valid java name */
    public final float m260getCornerRadiusD9Ej5fM() {
        return this.cornerRadius;
    }

    /* renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m261getElevationD9Ej5fM() {
        return this.elevation;
    }

    @p4.m
    public final v3.l<Density, Offset> getMagnifierCenter() {
        return this.magnifierCenter;
    }

    @p4.m
    public final v3.l<DpSize, r2> getOnSizeChanged() {
        return this.onSizeChanged;
    }

    @p4.l
    public final PlatformMagnifierFactory getPlatformMagnifierFactory() {
        return this.platformMagnifierFactory;
    }

    /* renamed from: getSize-MYxV2XQ, reason: not valid java name */
    public final long m262getSizeMYxV2XQ() {
        return this.size;
    }

    @p4.l
    public final v3.l<Density, Offset> getSourceCenter() {
        return this.sourceCenter;
    }

    public final boolean getUseTextDefault() {
        return this.useTextDefault;
    }

    public final float getZoom() {
        return this.zoom;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        onObservedReadsChanged();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        PlatformMagnifier platformMagnifier = this.magnifier;
        if (platformMagnifier != null) {
            platformMagnifier.dismiss();
        }
        this.magnifier = null;
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(@p4.l LayoutCoordinates layoutCoordinates) {
        m259setAnchorPositionInRootk4lQ0M(LayoutCoordinatesKt.positionInRoot(layoutCoordinates));
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        ObserverModifierNodeKt.observeReads(this, new MagnifierNode$onObservedReadsChanged$1(this));
    }

    public final void setClippingEnabled(boolean z4) {
        this.clippingEnabled = z4;
    }

    /* renamed from: setCornerRadius-0680j_4, reason: not valid java name */
    public final void m263setCornerRadius0680j_4(float f5) {
        this.cornerRadius = f5;
    }

    /* renamed from: setElevation-0680j_4, reason: not valid java name */
    public final void m264setElevation0680j_4(float f5) {
        this.elevation = f5;
    }

    public final void setMagnifierCenter(@p4.m v3.l<? super Density, Offset> lVar) {
        this.magnifierCenter = lVar;
    }

    public final void setOnSizeChanged(@p4.m v3.l<? super DpSize, r2> lVar) {
        this.onSizeChanged = lVar;
    }

    public final void setPlatformMagnifierFactory(@p4.l PlatformMagnifierFactory platformMagnifierFactory) {
        this.platformMagnifierFactory = platformMagnifierFactory;
    }

    /* renamed from: setSize-EaSLcWc, reason: not valid java name */
    public final void m265setSizeEaSLcWc(long j5) {
        this.size = j5;
    }

    public final void setSourceCenter(@p4.l v3.l<? super Density, Offset> lVar) {
        this.sourceCenter = lVar;
    }

    public final void setUseTextDefault(boolean z4) {
        this.useTextDefault = z4;
    }

    public final void setZoom(float f5) {
        this.zoom = f5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
    
        if (kotlin.jvm.internal.l0.g(r27, r14) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0047, code lost:
    
        if (r27.getCanUpdateZoom() == false) goto L20;
     */
    /* renamed from: update-5F03MCQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m266update5F03MCQ(@p4.l v3.l<? super androidx.compose.ui.unit.Density, androidx.compose.ui.geometry.Offset> r17, @p4.m v3.l<? super androidx.compose.ui.unit.Density, androidx.compose.ui.geometry.Offset> r18, float r19, boolean r20, long r21, float r23, float r24, boolean r25, @p4.m v3.l<? super androidx.compose.ui.unit.DpSize, kotlin.r2> r26, @p4.l androidx.compose.foundation.PlatformMagnifierFactory r27) {
        /*
            r16 = this;
            r0 = r16
            r1 = r19
            r2 = r21
            r4 = r23
            r5 = r24
            r6 = r25
            r7 = r27
            float r8 = r0.zoom
            long r9 = r0.size
            float r11 = r0.cornerRadius
            float r12 = r0.elevation
            boolean r13 = r0.clippingEnabled
            androidx.compose.foundation.PlatformMagnifierFactory r14 = r0.platformMagnifierFactory
            r15 = r17
            r0.sourceCenter = r15
            r15 = r18
            r0.magnifierCenter = r15
            r0.zoom = r1
            r15 = r20
            r0.useTextDefault = r15
            r0.size = r2
            r0.cornerRadius = r4
            r0.elevation = r5
            r0.clippingEnabled = r6
            r15 = r26
            r0.onSizeChanged = r15
            r0.platformMagnifierFactory = r7
            androidx.compose.foundation.PlatformMagnifier r15 = r0.magnifier
            if (r15 == 0) goto L63
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 != 0) goto L40
            r1 = 1
            goto L41
        L40:
            r1 = 0
        L41:
            if (r1 != 0) goto L49
            boolean r1 = r27.getCanUpdateZoom()
            if (r1 == 0) goto L63
        L49:
            boolean r1 = androidx.compose.ui.unit.DpSize.m6139equalsimpl0(r2, r9)
            if (r1 == 0) goto L63
            boolean r1 = androidx.compose.ui.unit.Dp.m6049equalsimpl0(r4, r11)
            if (r1 == 0) goto L63
            boolean r1 = androidx.compose.ui.unit.Dp.m6049equalsimpl0(r5, r12)
            if (r1 == 0) goto L63
            if (r6 != r13) goto L63
            boolean r1 = kotlin.jvm.internal.l0.g(r7, r14)
            if (r1 != 0) goto L66
        L63:
            r16.recreateMagnifier()
        L66:
            r16.updateMagnifier()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.MagnifierNode.m266update5F03MCQ(v3.l, v3.l, float, boolean, long, float, float, boolean, v3.l, androidx.compose.foundation.PlatformMagnifierFactory):void");
    }

    private MagnifierNode(v3.l<? super Density, Offset> lVar, v3.l<? super Density, Offset> lVar2, v3.l<? super DpSize, r2> lVar3, float f5, boolean z4, long j5, float f6, float f7, boolean z5, PlatformMagnifierFactory platformMagnifierFactory) {
        MutableState mutableStateOf$default;
        this.sourceCenter = lVar;
        this.magnifierCenter = lVar2;
        this.onSizeChanged = lVar3;
        this.zoom = f5;
        this.useTextDefault = z4;
        this.size = j5;
        this.cornerRadius = f6;
        this.elevation = f7;
        this.clippingEnabled = z5;
        this.platformMagnifierFactory = platformMagnifierFactory;
        Offset.Companion companion = Offset.Companion;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m3482boximpl(companion.m3508getUnspecifiedF1C5BW0()), null, 2, null);
        this.anchorPositionInRoot$delegate = mutableStateOf$default;
        this.sourceCenterInRoot = companion.m3508getUnspecifiedF1C5BW0();
    }
}
