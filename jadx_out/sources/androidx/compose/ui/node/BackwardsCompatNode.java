package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.BuildDrawCacheParams;
import androidx.compose.ui.draw.DrawCacheModifier;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.focus.FocusEventModifier;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusOrder;
import androidx.compose.ui.focus.FocusOrderModifier;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusPropertiesModifierNode;
import androidx.compose.ui.focus.FocusRequesterModifier;
import androidx.compose.ui.focus.FocusRequesterModifierNode;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputModifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifier;
import androidx.compose.ui.layout.OnPlacedModifier;
import androidx.compose.ui.layout.OnRemeasuredModifier;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.modifier.BackwardsCompatLocalMap;
import androidx.compose.ui.modifier.ModifierLocal;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalMap;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.modifier.ModifierLocalModifierNodeKt;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsModifier;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import java.util.HashSet;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;
import t0.b;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\u0080\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r2\u00020\u000e2\u00020\u000fB\u0010\u0012\u0006\u0010\u0017\u001a\u00020V¢\u0006\u0005\b\u0081\u0001\u0010\\J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0015\u001a\u00020\u0010H\u0002J\u0014\u0010\u0018\u001a\u00020\u00102\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0002J\b\u0010\u0019\u001a\u00020\u0010H\u0016J\b\u0010\u001a\u001a\u00020\u0010H\u0016J\b\u0010\u001b\u001a\u00020\u0010H\u0016J\u000f\u0010\u001e\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0006\u0010\u001f\u001a\u00020\u0010J&\u0010(\u001a\u00020%*\u00020 2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0016ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u001c\u0010-\u001a\u00020+*\u00020)2\u0006\u0010\"\u001a\u00020*2\u0006\u0010,\u001a\u00020+H\u0016J\u001c\u0010/\u001a\u00020+*\u00020)2\u0006\u0010\"\u001a\u00020*2\u0006\u0010.\u001a\u00020+H\u0016J\u001c\u00100\u001a\u00020+*\u00020)2\u0006\u0010\"\u001a\u00020*2\u0006\u0010,\u001a\u00020+H\u0016J\u001c\u00101\u001a\u00020+*\u00020)2\u0006\u0010\"\u001a\u00020*2\u0006\u0010.\u001a\u00020+H\u0016J\f\u00103\u001a\u00020\u0010*\u000202H\u0016J\f\u00105\u001a\u00020\u0010*\u000204H\u0016J*\u0010>\u001a\u00020\u00102\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:H\u0016ø\u0001\u0000¢\u0006\u0004\b<\u0010=J\b\u0010?\u001a\u00020\u0010H\u0016J\b\u0010@\u001a\u00020\u0012H\u0016J\b\u0010A\u001a\u00020\u0012H\u0016J\u0018\u0010E\u001a\u0004\u0018\u00010C*\u00020B2\b\u0010D\u001a\u0004\u0018\u00010CH\u0016J\u0010\u0010H\u001a\u00020\u00102\u0006\u0010G\u001a\u00020FH\u0016J\u001a\u0010L\u001a\u00020\u00102\u0006\u0010I\u001a\u00020:H\u0016ø\u0001\u0000¢\u0006\u0004\bJ\u0010KJ\u0010\u0010M\u001a\u00020\u00102\u0006\u0010G\u001a\u00020FH\u0016J\u0010\u0010P\u001a\u00020\u00102\u0006\u0010O\u001a\u00020NH\u0016J\u0010\u0010S\u001a\u00020\u00102\u0006\u0010R\u001a\u00020QH\u0016J\b\u0010U\u001a\u00020TH\u0016R*\u0010\u0017\u001a\u00020V2\u0006\u0010W\u001a\u00020V8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u0016\u0010]\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0018\u0010`\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR:\u0010e\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030c0bj\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030c`d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\u0018\u0010k\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010o\u001a\u00020B8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bm\u0010nR\u0014\u0010s\u001a\u00020p8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bq\u0010rR\u001a\u0010I\u001a\u00020t8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bu\u0010vR\u0014\u0010z\u001a\u00020w8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bx\u0010yR$\u0010~\u001a\u00028\u0000\"\u0004\b\u0000\u0010{*\b\u0012\u0004\u0012\u00028\u00000c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b|\u0010}R\u0015\u0010\u007f\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0080\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0082\u0001"}, d2 = {"Landroidx/compose/ui/node/BackwardsCompatNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "Landroidx/compose/ui/node/ParentDataModifierNode;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "Landroidx/compose/ui/focus/FocusRequesterModifierNode;", "Landroidx/compose/ui/node/OwnerScope;", "Landroidx/compose/ui/draw/BuildDrawCacheParams;", "Landroidx/compose/ui/Modifier$Node;", "Lkotlin/r2;", "unInitializeModifier", "", "duringAttach", "initializeModifier", "updateDrawCache", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "element", "updateModifierLocalProvider", "onAttach", "onDetach", "onMeasureResultChanged", "onDrawCacheReadsChanged$ui_release", "()V", "onDrawCacheReadsChanged", "updateModifierLocalConsumer", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "height", "minIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", MediationConstant.RIT_TYPE_DRAW, "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "applySemantics", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Landroidx/compose/ui/unit/IntSize;", "bounds", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onPointerEvent", "onCancelPointerInput", "sharePointerInputWithSiblings", "interceptOutOfBoundsChildEvents", "Landroidx/compose/ui/unit/Density;", "", "parentData", "modifyParentData", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "onGloballyPositioned", "size", "onRemeasured-ozmzZPI", "(J)V", "onRemeasured", "onPlaced", "Landroidx/compose/ui/focus/FocusState;", "focusState", "onFocusEvent", "Landroidx/compose/ui/focus/FocusProperties;", "focusProperties", "applyFocusProperties", "", "toString", "Landroidx/compose/ui/Modifier$Element;", b.f22420d, "Landroidx/compose/ui/Modifier$Element;", "getElement", "()Landroidx/compose/ui/Modifier$Element;", "setElement", "(Landroidx/compose/ui/Modifier$Element;)V", "invalidateCache", "Z", "Landroidx/compose/ui/modifier/BackwardsCompatLocalMap;", "_providedValues", "Landroidx/compose/ui/modifier/BackwardsCompatLocalMap;", "Ljava/util/HashSet;", "Landroidx/compose/ui/modifier/ModifierLocal;", "Lkotlin/collections/HashSet;", "readValues", "Ljava/util/HashSet;", "getReadValues", "()Ljava/util/HashSet;", "setReadValues", "(Ljava/util/HashSet;)V", "lastOnPlacedCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc", "()J", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "getProvidedValues", "()Landroidx/compose/ui/modifier/ModifierLocalMap;", "providedValues", "T", "getCurrent", "(Landroidx/compose/ui/modifier/ModifierLocal;)Ljava/lang/Object;", "current", "isValidOwnerScope", "()Z", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nBackwardsCompatNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackwardsCompatNode.kt\nandroidx/compose/ui/node/BackwardsCompatNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 7 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,449:1\n1#2:450\n1#2:481\n80#3:451\n76#3:453\n80#3:457\n74#3:459\n72#3:461\n84#3:463\n86#3:465\n78#3:469\n76#3:471\n84#3:473\n80#3:474\n261#4:452\n261#4:454\n261#4:458\n261#4:460\n261#4:462\n261#4:464\n261#4:466\n261#4:470\n261#4:472\n261#4:496\n735#5,2:455\n728#5,2:467\n230#6,5:475\n58#6:480\n59#6,8:482\n385#6,6:490\n395#6,2:497\n397#6,8:502\n405#6,9:513\n414#6,8:525\n68#6,7:533\n234#7,3:499\n237#7,3:522\n1208#8:510\n1187#8,2:511\n*S KotlinDebug\n*F\n+ 1 BackwardsCompatNode.kt\nandroidx/compose/ui/node/BackwardsCompatNode\n*L\n258#1:481\n116#1:451\n126#1:453\n137#1:457\n145#1:459\n153#1:461\n169#1:463\n194#1:465\n207#1:469\n212#1:471\n222#1:473\n258#1:474\n116#1:452\n126#1:454\n137#1:458\n145#1:460\n153#1:462\n169#1:464\n194#1:466\n207#1:470\n212#1:472\n258#1:496\n130#1:455,2\n205#1:467,2\n258#1:475,5\n258#1:480\n258#1:482,8\n258#1:490,6\n258#1:497,2\n258#1:502,8\n258#1:513,9\n258#1:525,8\n258#1:533,7\n258#1:499,3\n258#1:522,3\n258#1:510\n258#1:511,2\n*E\n"})
/* loaded from: classes.dex */
public final class BackwardsCompatNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode, SemanticsModifierNode, PointerInputModifierNode, ModifierLocalModifierNode, ModifierLocalReadScope, ParentDataModifierNode, LayoutAwareModifierNode, GlobalPositionAwareModifierNode, FocusEventModifierNode, FocusPropertiesModifierNode, FocusRequesterModifierNode, OwnerScope, BuildDrawCacheParams {
    public static final int $stable = 8;

    @m
    private BackwardsCompatLocalMap _providedValues;

    @l
    private Modifier.Element element;
    private boolean invalidateCache;

    @m
    private LayoutCoordinates lastOnPlacedCoordinates;

    @l
    private HashSet<ModifierLocal<?>> readValues;

    public BackwardsCompatNode(@l Modifier.Element element) {
        setKindSet$ui_release(NodeKindKt.calculateNodeKindSetFrom(element));
        this.element = element;
        this.invalidateCache = true;
        this.readValues = new HashSet<>();
    }

    private final void initializeModifier(boolean z4) {
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        if (isAttached()) {
            Modifier.Element element = this.element;
            boolean z11 = false;
            if ((NodeKind.m5204constructorimpl(32) & getKindSet$ui_release()) != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                if (element instanceof ModifierLocalConsumer) {
                    sideEffect(new BackwardsCompatNode$initializeModifier$2(this));
                }
                if (element instanceof ModifierLocalProvider) {
                    updateModifierLocalProvider((ModifierLocalProvider) element);
                }
            }
            if ((NodeKind.m5204constructorimpl(4) & getKindSet$ui_release()) != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z6) {
                if (element instanceof DrawCacheModifier) {
                    this.invalidateCache = true;
                }
                if (!z4) {
                    LayoutModifierNodeKt.invalidateLayer(this);
                }
            }
            if ((NodeKind.m5204constructorimpl(2) & getKindSet$ui_release()) != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (z7) {
                if (BackwardsCompatNodeKt.access$isChainUpdate(this)) {
                    NodeCoordinator coordinator$ui_release = getCoordinator$ui_release();
                    l0.m(coordinator$ui_release);
                    ((LayoutModifierNodeCoordinator) coordinator$ui_release).setLayoutModifierNode$ui_release(this);
                    coordinator$ui_release.onLayoutModifierNodeChanged();
                }
                if (!z4) {
                    LayoutModifierNodeKt.invalidateLayer(this);
                    DelegatableNodeKt.requireLayoutNode(this).invalidateMeasurements$ui_release();
                }
            }
            if (element instanceof RemeasurementModifier) {
                ((RemeasurementModifier) element).onRemeasurementAvailable(DelegatableNodeKt.requireLayoutNode(this));
            }
            if ((NodeKind.m5204constructorimpl(128) & getKindSet$ui_release()) != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z8) {
                if ((element instanceof OnRemeasuredModifier) && BackwardsCompatNodeKt.access$isChainUpdate(this)) {
                    DelegatableNodeKt.requireLayoutNode(this).invalidateMeasurements$ui_release();
                }
                if (element instanceof OnPlacedModifier) {
                    this.lastOnPlacedCoordinates = null;
                    if (BackwardsCompatNodeKt.access$isChainUpdate(this)) {
                        DelegatableNodeKt.requireOwner(this).registerOnLayoutCompletedListener(new Owner.OnLayoutCompletedListener() { // from class: androidx.compose.ui.node.BackwardsCompatNode$initializeModifier$3
                            @Override // androidx.compose.ui.node.Owner.OnLayoutCompletedListener
                            public void onLayoutComplete() {
                                LayoutCoordinates layoutCoordinates;
                                layoutCoordinates = BackwardsCompatNode.this.lastOnPlacedCoordinates;
                                if (layoutCoordinates == null) {
                                    BackwardsCompatNode backwardsCompatNode = BackwardsCompatNode.this;
                                    backwardsCompatNode.onPlaced(DelegatableNodeKt.m5101requireCoordinator64DMado(backwardsCompatNode, NodeKind.m5204constructorimpl(128)));
                                }
                            }
                        });
                    }
                }
            }
            if ((NodeKind.m5204constructorimpl(256) & getKindSet$ui_release()) != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9 && (element instanceof OnGloballyPositionedModifier) && BackwardsCompatNodeKt.access$isChainUpdate(this)) {
                DelegatableNodeKt.requireLayoutNode(this).invalidateMeasurements$ui_release();
            }
            if (element instanceof FocusRequesterModifier) {
                ((FocusRequesterModifier) element).getFocusRequester().getFocusRequesterNodes$ui_release().add(this);
            }
            if ((NodeKind.m5204constructorimpl(16) & getKindSet$ui_release()) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && (element instanceof PointerInputModifier)) {
                ((PointerInputModifier) element).getPointerInputFilter().setLayoutCoordinates$ui_release(getCoordinator$ui_release());
            }
            if ((NodeKind.m5204constructorimpl(8) & getKindSet$ui_release()) != 0) {
                z11 = true;
            }
            if (z11) {
                DelegatableNodeKt.requireOwner(this).onSemanticsChange();
                return;
            }
            return;
        }
        throw new IllegalStateException("initializeModifier called on unattached node".toString());
    }

    private final void unInitializeModifier() {
        boolean z4;
        if (isAttached()) {
            Modifier.Element element = this.element;
            boolean z5 = true;
            if ((NodeKind.m5204constructorimpl(32) & getKindSet$ui_release()) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                if (element instanceof ModifierLocalProvider) {
                    DelegatableNodeKt.requireOwner(this).getModifierLocalManager().removedProvider(this, ((ModifierLocalProvider) element).getKey());
                }
                if (element instanceof ModifierLocalConsumer) {
                    ((ModifierLocalConsumer) element).onModifierLocalsUpdated(BackwardsCompatNodeKt.access$getDetachedModifierLocalReadScope$p());
                }
            }
            if ((NodeKind.m5204constructorimpl(8) & getKindSet$ui_release()) == 0) {
                z5 = false;
            }
            if (z5) {
                DelegatableNodeKt.requireOwner(this).onSemanticsChange();
            }
            if (element instanceof FocusRequesterModifier) {
                ((FocusRequesterModifier) element).getFocusRequester().getFocusRequesterNodes$ui_release().remove(this);
                return;
            }
            return;
        }
        throw new IllegalStateException("unInitializeModifier called on unattached node".toString());
    }

    private final void updateDrawCache() {
        Modifier.Element element = this.element;
        if (element instanceof DrawCacheModifier) {
            DelegatableNodeKt.requireOwner(this).getSnapshotObserver().observeReads$ui_release(this, BackwardsCompatNodeKt.access$getOnDrawCacheReadsChanged$p(), new BackwardsCompatNode$updateDrawCache$1(element, this));
        }
        this.invalidateCache = false;
    }

    private final void updateModifierLocalProvider(ModifierLocalProvider<?> modifierLocalProvider) {
        BackwardsCompatLocalMap backwardsCompatLocalMap = this._providedValues;
        if (backwardsCompatLocalMap != null && backwardsCompatLocalMap.contains$ui_release(modifierLocalProvider.getKey())) {
            backwardsCompatLocalMap.setElement(modifierLocalProvider);
            DelegatableNodeKt.requireOwner(this).getModifierLocalManager().updatedProvider(this, modifierLocalProvider.getKey());
        } else {
            this._providedValues = new BackwardsCompatLocalMap(modifierLocalProvider);
            if (BackwardsCompatNodeKt.access$isChainUpdate(this)) {
                DelegatableNodeKt.requireOwner(this).getModifierLocalManager().insertedProvider(this, modifierLocalProvider.getKey());
            }
        }
    }

    @Override // androidx.compose.ui.focus.FocusPropertiesModifierNode
    public void applyFocusProperties(@l FocusProperties focusProperties) {
        Modifier.Element element = this.element;
        if (element instanceof FocusOrderModifier) {
            ((FocusOrderModifier) element).populateFocusOrder(new FocusOrder(focusProperties));
            return;
        }
        throw new IllegalStateException("applyFocusProperties called on wrong node".toString());
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(@l SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Modifier.Element element = this.element;
        l0.n(element, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        SemanticsConfiguration semanticsConfiguration = ((SemanticsModifier) element).getSemanticsConfiguration();
        l0.n(semanticsPropertyReceiver, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        ((SemanticsConfiguration) semanticsPropertyReceiver).collapsePeer$ui_release(semanticsConfiguration);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(@l ContentDrawScope contentDrawScope) {
        Modifier.Element element = this.element;
        l0.n(element, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        DrawModifier drawModifier = (DrawModifier) element;
        if (this.invalidateCache && (element instanceof DrawCacheModifier)) {
            updateDrawCache();
        }
        drawModifier.draw(contentDrawScope);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode, androidx.compose.ui.modifier.ModifierLocalReadScope
    public <T> T getCurrent(@l ModifierLocal<T> modifierLocal) {
        NodeChain nodes$ui_release;
        boolean z4;
        boolean z5;
        this.readValues.add(modifierLocal);
        int m5204constructorimpl = NodeKind.m5204constructorimpl(32);
        if (getNode().isAttached()) {
            Modifier.Node parent$ui_release = getNode().getParent$ui_release();
            LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(this);
            while (requireLayoutNode != null) {
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m5204constructorimpl) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                            DelegatingNode delegatingNode = parent$ui_release;
                            ?? r5 = 0;
                            while (delegatingNode != 0) {
                                if (delegatingNode instanceof ModifierLocalModifierNode) {
                                    ModifierLocalModifierNode modifierLocalModifierNode = (ModifierLocalModifierNode) delegatingNode;
                                    if (modifierLocalModifierNode.getProvidedValues().contains$ui_release(modifierLocal)) {
                                        return (T) modifierLocalModifierNode.getProvidedValues().get$ui_release(modifierLocal);
                                    }
                                } else {
                                    if ((delegatingNode.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (z4 && (delegatingNode instanceof DelegatingNode)) {
                                        Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                                        int i5 = 0;
                                        delegatingNode = delegatingNode;
                                        r5 = r5;
                                        while (delegate$ui_release != null) {
                                            if ((delegate$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                                z5 = true;
                                            } else {
                                                z5 = false;
                                            }
                                            if (z5) {
                                                i5++;
                                                r5 = r5;
                                                if (i5 == 1) {
                                                    delegatingNode = delegate$ui_release;
                                                } else {
                                                    if (r5 == 0) {
                                                        r5 = new MutableVector(new Modifier.Node[16], 0);
                                                    }
                                                    if (delegatingNode != 0) {
                                                        r5.add(delegatingNode);
                                                        delegatingNode = 0;
                                                    }
                                                    r5.add(delegate$ui_release);
                                                }
                                            }
                                            delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                            delegatingNode = delegatingNode;
                                            r5 = r5;
                                        }
                                        if (i5 == 1) {
                                        }
                                    }
                                }
                                delegatingNode = DelegatableNodeKt.pop(r5);
                            }
                        }
                        parent$ui_release = parent$ui_release.getParent$ui_release();
                    }
                }
                requireLayoutNode = requireLayoutNode.getParent$ui_release();
                if (requireLayoutNode != null && (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) != null) {
                    parent$ui_release = nodes$ui_release.getTail$ui_release();
                } else {
                    parent$ui_release = null;
                }
            }
            return modifierLocal.getDefaultFactory$ui_release().invoke();
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    @l
    public Density getDensity() {
        return DelegatableNodeKt.requireLayoutNode(this).getDensity();
    }

    @l
    public final Modifier.Element getElement() {
        return this.element;
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    @l
    public LayoutDirection getLayoutDirection() {
        return DelegatableNodeKt.requireLayoutNode(this).getLayoutDirection();
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    @l
    public ModifierLocalMap getProvidedValues() {
        BackwardsCompatLocalMap backwardsCompatLocalMap = this._providedValues;
        return backwardsCompatLocalMap != null ? backwardsCompatLocalMap : ModifierLocalModifierNodeKt.modifierLocalMapOf();
    }

    @l
    public final HashSet<ModifierLocal<?>> getReadValues() {
        return this.readValues;
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    /* renamed from: getSize-NH-jbRc */
    public long mo3399getSizeNHjbRc() {
        return IntSizeKt.m6224toSizeozmzZPI(DelegatableNodeKt.m5101requireCoordinator64DMado(this, NodeKind.m5204constructorimpl(128)).mo5005getSizeYbymL2g());
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public boolean interceptOutOfBoundsChildEvents() {
        Modifier.Element element = this.element;
        l0.n(element, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return ((PointerInputModifier) element).getPointerInputFilter().getInterceptOutOfBoundsChildEvents();
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return isAttached();
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(@l IntrinsicMeasureScope intrinsicMeasureScope, @l IntrinsicMeasurable intrinsicMeasurable, int i5) {
        Modifier.Element element = this.element;
        l0.n(element, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((LayoutModifier) element).maxIntrinsicHeight(intrinsicMeasureScope, intrinsicMeasurable, i5);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(@l IntrinsicMeasureScope intrinsicMeasureScope, @l IntrinsicMeasurable intrinsicMeasurable, int i5) {
        Modifier.Element element = this.element;
        l0.n(element, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((LayoutModifier) element).maxIntrinsicWidth(intrinsicMeasureScope, intrinsicMeasurable, i5);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @l
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo82measure3p2s80s(@l MeasureScope measureScope, @l Measurable measurable, long j5) {
        Modifier.Element element = this.element;
        l0.n(element, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((LayoutModifier) element).mo56measure3p2s80s(measureScope, measurable, j5);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(@l IntrinsicMeasureScope intrinsicMeasureScope, @l IntrinsicMeasurable intrinsicMeasurable, int i5) {
        Modifier.Element element = this.element;
        l0.n(element, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((LayoutModifier) element).minIntrinsicHeight(intrinsicMeasureScope, intrinsicMeasurable, i5);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(@l IntrinsicMeasureScope intrinsicMeasureScope, @l IntrinsicMeasurable intrinsicMeasurable, int i5) {
        Modifier.Element element = this.element;
        l0.n(element, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((LayoutModifier) element).minIntrinsicWidth(intrinsicMeasureScope, intrinsicMeasurable, i5);
    }

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    @m
    public Object modifyParentData(@l Density density, @m Object obj) {
        Modifier.Element element = this.element;
        l0.n(element, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return ((ParentDataModifier) element).modifyParentData(density, obj);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        initializeModifier(true);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        Modifier.Element element = this.element;
        l0.n(element, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((PointerInputModifier) element).getPointerInputFilter().onCancel();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        unInitializeModifier();
    }

    public final void onDrawCacheReadsChanged$ui_release() {
        this.invalidateCache = true;
        DrawModifierNodeKt.invalidateDraw(this);
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public void onFocusEvent(@l FocusState focusState) {
        Modifier.Element element = this.element;
        if (element instanceof FocusEventModifier) {
            ((FocusEventModifier) element).onFocusEvent(focusState);
            return;
        }
        throw new IllegalStateException("onFocusEvent called on wrong node".toString());
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(@l LayoutCoordinates layoutCoordinates) {
        Modifier.Element element = this.element;
        l0.n(element, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        ((OnGloballyPositionedModifier) element).onGloballyPositioned(layoutCoordinates);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void onMeasureResultChanged() {
        this.invalidateCache = true;
        DrawModifierNodeKt.invalidateDraw(this);
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public void onPlaced(@l LayoutCoordinates layoutCoordinates) {
        this.lastOnPlacedCoordinates = layoutCoordinates;
        Modifier.Element element = this.element;
        if (element instanceof OnPlacedModifier) {
            ((OnPlacedModifier) element).onPlaced(layoutCoordinates);
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo170onPointerEventH0pRuoY(@l PointerEvent pointerEvent, @l PointerEventPass pointerEventPass, long j5) {
        Modifier.Element element = this.element;
        l0.n(element, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((PointerInputModifier) element).getPointerInputFilter().mo4896onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j5);
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    public void mo294onRemeasuredozmzZPI(long j5) {
        Modifier.Element element = this.element;
        if (element instanceof OnRemeasuredModifier) {
            ((OnRemeasuredModifier) element).mo5041onRemeasuredozmzZPI(j5);
        }
    }

    public final void setElement(@l Modifier.Element element) {
        if (isAttached()) {
            unInitializeModifier();
        }
        this.element = element;
        setKindSet$ui_release(NodeKindKt.calculateNodeKindSetFrom(element));
        if (isAttached()) {
            initializeModifier(false);
        }
    }

    public final void setReadValues(@l HashSet<ModifierLocal<?>> hashSet) {
        this.readValues = hashSet;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public boolean sharePointerInputWithSiblings() {
        Modifier.Element element = this.element;
        l0.n(element, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return ((PointerInputModifier) element).getPointerInputFilter().getShareWithSiblings();
    }

    @l
    public String toString() {
        return this.element.toString();
    }

    public final void updateModifierLocalConsumer() {
        if (isAttached()) {
            this.readValues.clear();
            DelegatableNodeKt.requireOwner(this).getSnapshotObserver().observeReads$ui_release(this, BackwardsCompatNodeKt.access$getUpdateModifierLocalConsumer$p(), new BackwardsCompatNode$updateModifierLocalConsumer$1(this));
        }
    }
}
