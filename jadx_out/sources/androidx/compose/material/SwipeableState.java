package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.android.dx.io.Opcodes;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.List;
import java.util.Map;
import kotlin.collections.a1;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.q1;
import kotlin.r2;
import kotlin.ranges.u;
import kotlin.u0;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import p4.l;
import p4.m;
import t0.b;
import v3.p;

@k(message = "Material's Swipeable has been replaced by Foundation's AnchoredDraggable APIs. Please see developer.android.com for an overview of the changes and a migration guide.")
@Stable
@i0(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\b\u0017\u0018\u0000 |*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001|BD\u0012\u0006\u0010y\u001a\u00028\u0000\u0012\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012#\b\u0002\u0010(\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020'0#¢\u0006\u0004\bz\u0010{J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\n\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u0082@¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0010\u001a\u00020\u00052\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ8\u0010\u0014\u001a\u00020\u00052\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\fH\u0080@¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00028\u0000H\u0087@¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00028\u00002\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u0087@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0003H\u0086@¢\u0006\u0004\b\u001c\u0010\u0007J\u000e\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0003R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R5\u0010(\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020'0#8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R+\u00103\u001a\u00028\u00002\u0006\u0010,\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R+\u00105\u001a\u00020'2\u0006\u0010,\u001a\u00020'8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b4\u0010.\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010;R\u0014\u0010=\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010;R\u001c\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010.RC\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\f2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\f8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b@\u0010.\u001a\u0004\bA\u0010B\"\u0004\bC\u0010\u000fR&\u0010F\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\f0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\"\u0010H\u001a\u00020\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010N\u001a\u00020\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bN\u0010I\u001a\u0004\bO\u0010K\"\u0004\bP\u0010MRO\u0010W\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030Q2\u0018\u0010,\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030Q8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bR\u0010.\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR+\u0010[\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u00038@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bX\u0010;\u001a\u0004\bY\u0010K\"\u0004\bZ\u0010MR/\u0010b\u001a\u0004\u0018\u00010\\2\b\u0010,\u001a\u0004\u0018\u00010\\8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b]\u0010.\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\u001a\u0010d\u001a\u00020c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR\u0017\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00030h8F¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0017\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00030h8F¢\u0006\u0006\u001a\u0004\bl\u0010jR\u001a\u0010\u0015\u001a\u00028\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\bo\u0010p\u001a\u0004\bn\u00100R \u0010u\u001a\b\u0012\u0004\u0012\u00028\u00000q8FX\u0087\u0004¢\u0006\f\u0012\u0004\bt\u0010p\u001a\u0004\br\u0010sR\u001a\u0010x\u001a\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\bw\u0010p\u001a\u0004\bv\u0010K¨\u0006}"}, d2 = {"Landroidx/compose/material/SwipeableState;", "T", "", "", TypedValues.AttributesType.S_TARGET, "Lkotlin/r2;", "snapInternalToOffset", "(FLkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/animation/core/AnimationSpec;", "spec", "animateInternalToOffset", "(FLandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "newAnchors", "ensureInit$material_release", "(Ljava/util/Map;)V", "ensureInit", "oldAnchors", "processNewAnchors$material_release", "(Ljava/util/Map;Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "processNewAnchors", "targetValue", "snapTo", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "anim", "animateTo", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/d;)Ljava/lang/Object;", "velocity", "performFling", "delta", "performDrag", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "getAnimationSpec$material_release", "()Landroidx/compose/animation/core/AnimationSpec;", "Lkotlin/Function1;", "Lkotlin/v0;", "name", "newValue", "", "confirmStateChange", "Lv3/l;", "getConfirmStateChange$material_release", "()Lv3/l;", "<set-?>", "currentValue$delegate", "Landroidx/compose/runtime/MutableState;", "getCurrentValue", "()Ljava/lang/Object;", "setCurrentValue", "(Ljava/lang/Object;)V", "currentValue", "isAnimationRunning$delegate", "isAnimationRunning", "()Z", "setAnimationRunning", "(Z)V", "Landroidx/compose/runtime/MutableFloatState;", "offsetState", "Landroidx/compose/runtime/MutableFloatState;", "overflowState", "absoluteOffset", "Landroidx/compose/runtime/MutableState;", "animationTarget", "anchors$delegate", "getAnchors$material_release", "()Ljava/util/Map;", "setAnchors$material_release", "anchors", "Lkotlinx/coroutines/flow/i;", "latestNonEmptyAnchorsFlow", "Lkotlinx/coroutines/flow/i;", "minBound", "F", "getMinBound$material_release", "()F", "setMinBound$material_release", "(F)V", "maxBound", "getMaxBound$material_release", "setMaxBound$material_release", "Lkotlin/Function2;", "thresholds$delegate", "getThresholds$material_release", "()Lv3/p;", "setThresholds$material_release", "(Lv3/p;)V", "thresholds", "velocityThreshold$delegate", "getVelocityThreshold$material_release", "setVelocityThreshold$material_release", "velocityThreshold", "Landroidx/compose/material/ResistanceConfig;", "resistance$delegate", "getResistance$material_release", "()Landroidx/compose/material/ResistanceConfig;", "setResistance$material_release", "(Landroidx/compose/material/ResistanceConfig;)V", "resistance", "Landroidx/compose/foundation/gestures/DraggableState;", "draggableState", "Landroidx/compose/foundation/gestures/DraggableState;", "getDraggableState$material_release", "()Landroidx/compose/foundation/gestures/DraggableState;", "Landroidx/compose/runtime/State;", "getOffset", "()Landroidx/compose/runtime/State;", TypedValues.CycleType.S_WAVE_OFFSET, "getOverflow", "overflow", "getTargetValue", "getTargetValue$annotations", "()V", "Landroidx/compose/material/SwipeProgress;", "getProgress", "()Landroidx/compose/material/SwipeProgress;", "getProgress$annotations", "progress", "getDirection", "getDirection$annotations", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "initialValue", "<init>", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lv3/l;)V", "Companion", "material_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalMaterialApi
@r1({"SMAP\nSwipeable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableState\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,908:1\n21#2:909\n23#2:913\n50#3:910\n55#3:912\n106#4:911\n81#5:914\n107#5,2:915\n81#5:917\n107#5,2:918\n81#5:920\n107#5,2:921\n81#5:951\n107#5,2:952\n81#5:957\n107#5,2:958\n2333#6,14:923\n2333#6,14:937\n76#7:954\n109#7,2:955\n1#8:960\n*S KotlinDebug\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableState\n*L\n133#1:909\n133#1:913\n133#1:910\n133#1:912\n133#1:911\n96#1:914\n96#1:915,2\n102#1:917\n102#1:918,2\n129#1:920\n129#1:921,2\n200#1:951\n200#1:952,2\n204#1:957\n204#1:958,2\n179#1:923,14\n185#1:937,14\n202#1:954\n202#1:955,2\n*E\n"})
/* loaded from: classes.dex */
public class SwipeableState<T> {
    public static final int $stable = 0;

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private final MutableFloatState absoluteOffset;

    @l
    private final MutableState anchors$delegate;

    @l
    private final AnimationSpec<Float> animationSpec;

    @l
    private final MutableState<Float> animationTarget;

    @l
    private final v3.l<T, Boolean> confirmStateChange;

    @l
    private final MutableState currentValue$delegate;

    @l
    private final DraggableState draggableState;

    @l
    private final MutableState isAnimationRunning$delegate;

    @l
    private final i<Map<Float, T>> latestNonEmptyAnchorsFlow;
    private float maxBound;
    private float minBound;

    @l
    private final MutableFloatState offsetState;

    @l
    private final MutableFloatState overflowState;

    @l
    private final MutableState resistance$delegate;

    @l
    private final MutableState thresholds$delegate;

    @l
    private final MutableFloatState velocityThreshold$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material.SwipeableState$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements v3.l<T, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // v3.l
        @l
        public final Boolean invoke(T t5) {
            return Boolean.TRUE;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
            return invoke((AnonymousClass1) obj);
        }
    }

    @i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JD\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u0005\u0012\u0004\u0012\u0002H\u00060\u0004\"\b\b\u0001\u0010\u0006*\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u00020\f0\u000b¨\u0006\r"}, d2 = {"Landroidx/compose/material/SwipeableState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material/SwipeableState;", "T", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmStateChange", "Lkotlin/Function1;", "", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        public final <T> Saver<SwipeableState<T>, T> Saver(@l AnimationSpec<Float> animationSpec, @l v3.l<? super T, Boolean> lVar) {
            return SaverKt.Saver(SwipeableState$Companion$Saver$1.INSTANCE, new SwipeableState$Companion$Saver$2(animationSpec, lVar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SwipeableState(T t5, @l AnimationSpec<Float> animationSpec, @l v3.l<? super T, Boolean> lVar) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        MutableState<Float> mutableStateOf$default3;
        Map z4;
        MutableState mutableStateOf$default4;
        MutableState mutableStateOf$default5;
        MutableState mutableStateOf$default6;
        this.animationSpec = animationSpec;
        this.confirmStateChange = lVar;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t5, null, 2, null);
        this.currentValue$delegate = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.isAnimationRunning$delegate = mutableStateOf$default2;
        this.offsetState = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.overflowState = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.absoluteOffset = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.animationTarget = mutableStateOf$default3;
        z4 = a1.z();
        mutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(z4, null, 2, null);
        this.anchors$delegate = mutableStateOf$default4;
        final i snapshotFlow = SnapshotStateKt.snapshotFlow(new SwipeableState$latestNonEmptyAnchorsFlow$1(this));
        this.latestNonEmptyAnchorsFlow = kotlinx.coroutines.flow.k.U1(new i<Map<Float, ? extends T>>() { // from class: androidx.compose.material.SwipeableState$special$$inlined$filter$1

            @i0(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", b.f22420d, "Lkotlin/r2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx/coroutines/flow/a0$a$b", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            @r1({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Swipeable.kt\nandroidx/compose/material/SwipeableState\n*L\n1#1,222:1\n22#2:223\n23#2:225\n133#3:224\n*E\n"})
            /* renamed from: androidx.compose.material.SwipeableState$special$$inlined$filter$1$2, reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements j {
                final /* synthetic */ j $this_unsafeFlow;

                @f(c = "androidx.compose.material.SwipeableState$special$$inlined$filter$1$2", f = "Swipeable.kt", i = {}, l = {Opcodes.XOR_INT_LIT8}, m = "emit", n = {}, s = {})
                @i0(k = 3, mv = {1, 8, 0}, xi = 48)
                @r1({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: androidx.compose.material.SwipeableState$special$$inlined$filter$1$2$1, reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(kotlin.coroutines.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(j jVar) {
                    this.$this_unsafeFlow = jVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.j
                @p4.m
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, @p4.l kotlin.coroutines.d r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof androidx.compose.material.SwipeableState$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        androidx.compose.material.SwipeableState$special$$inlined$filter$1$2$1 r0 = (androidx.compose.material.SwipeableState$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        androidx.compose.material.SwipeableState$special$$inlined$filter$1$2$1 r0 = new androidx.compose.material.SwipeableState$special$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.e1.n(r6)
                        goto L49
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.e1.n(r6)
                        kotlinx.coroutines.flow.j r6 = r4.$this_unsafeFlow
                        r2 = r5
                        java.util.Map r2 = (java.util.Map) r2
                        boolean r2 = r2.isEmpty()
                        r2 = r2 ^ r3
                        if (r2 == 0) goto L49
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L49
                        return r1
                    L49:
                        kotlin.r2 r5 = kotlin.r2.f19517a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableState$special$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            @m
            public Object collect(@l j jVar, @l kotlin.coroutines.d dVar) {
                Object l5;
                Object collect = i.this.collect(new AnonymousClass2(jVar), dVar);
                l5 = kotlin.coroutines.intrinsics.d.l();
                if (collect == l5) {
                    return collect;
                }
                return r2.f19517a;
            }
        }, 1);
        this.minBound = Float.NEGATIVE_INFINITY;
        this.maxBound = Float.POSITIVE_INFINITY;
        mutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(SwipeableState$thresholds$2.INSTANCE, null, 2, null);
        this.thresholds$delegate = mutableStateOf$default5;
        this.velocityThreshold$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        mutableStateOf$default6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.resistance$delegate = mutableStateOf$default6;
        this.draggableState = DraggableKt.DraggableState(new SwipeableState$draggableState$1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object animateInternalToOffset(float f5, AnimationSpec<Float> animationSpec, kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        Object drag$default = DraggableState.drag$default(this.draggableState, null, new SwipeableState$animateInternalToOffset$2(this, f5, animationSpec, null), dVar, 1, null);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return drag$default == l5 ? drag$default : r2.f19517a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateTo$default(SwipeableState swipeableState, Object obj, AnimationSpec animationSpec, kotlin.coroutines.d dVar, int i5, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateTo");
        }
        if ((i5 & 2) != 0) {
            animationSpec = swipeableState.animationSpec;
        }
        return swipeableState.animateTo(obj, animationSpec, dVar);
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getDirection$annotations() {
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getProgress$annotations() {
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getTargetValue$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAnimationRunning(boolean z4) {
        this.isAnimationRunning$delegate.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentValue(T t5) {
        this.currentValue$delegate.setValue(t5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object snapInternalToOffset(float f5, kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        Object drag$default = DraggableState.drag$default(this.draggableState, null, new SwipeableState$snapInternalToOffset$2(f5, this, null), dVar, 1, null);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return drag$default == l5 ? drag$default : r2.f19517a;
    }

    @ExperimentalMaterialApi
    @m
    public final Object animateTo(T t5, @l AnimationSpec<Float> animationSpec, @l kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        Object collect = this.latestNonEmptyAnchorsFlow.collect(new SwipeableState$animateTo$2(t5, this, animationSpec), dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return collect == l5 ? collect : r2.f19517a;
    }

    public final void ensureInit$material_release(@l Map<Float, ? extends T> map) {
        Float offset;
        if (getAnchors$material_release().isEmpty()) {
            offset = SwipeableKt.getOffset(map, getCurrentValue());
            if (offset != null) {
                this.offsetState.setFloatValue(offset.floatValue());
                this.absoluteOffset.setFloatValue(offset.floatValue());
                return;
            }
            throw new IllegalArgumentException("The initial value must have an associated anchor.".toString());
        }
    }

    @l
    public final Map<Float, T> getAnchors$material_release() {
        return (Map) this.anchors$delegate.getValue();
    }

    @l
    public final AnimationSpec<Float> getAnimationSpec$material_release() {
        return this.animationSpec;
    }

    @l
    public final v3.l<T, Boolean> getConfirmStateChange$material_release() {
        return this.confirmStateChange;
    }

    public final T getCurrentValue() {
        return this.currentValue$delegate.getValue();
    }

    public final float getDirection() {
        Float offset;
        offset = SwipeableKt.getOffset(getAnchors$material_release(), getCurrentValue());
        if (offset == null) {
            return 0.0f;
        }
        return Math.signum(getOffset().getValue().floatValue() - offset.floatValue());
    }

    @l
    public final DraggableState getDraggableState$material_release() {
        return this.draggableState;
    }

    public final float getMaxBound$material_release() {
        return this.maxBound;
    }

    public final float getMinBound$material_release() {
        return this.minBound;
    }

    @l
    public final State<Float> getOffset() {
        return this.offsetState;
    }

    @l
    public final State<Float> getOverflow() {
        return this.overflowState;
    }

    @l
    public final SwipeProgress<T> getProgress() {
        List findBounds;
        Object currentValue;
        Object obj;
        float f5;
        Object K;
        u0 a5;
        findBounds = SwipeableKt.findBounds(getOffset().getValue().floatValue(), getAnchors$material_release().keySet());
        int size = findBounds.size();
        if (size != 0) {
            if (size != 1) {
                if (getDirection() > 0.0f) {
                    a5 = q1.a(findBounds.get(0), findBounds.get(1));
                } else {
                    a5 = q1.a(findBounds.get(1), findBounds.get(0));
                }
                float floatValue = ((Number) a5.component1()).floatValue();
                float floatValue2 = ((Number) a5.component2()).floatValue();
                obj = a1.K(getAnchors$material_release(), Float.valueOf(floatValue));
                currentValue = a1.K(getAnchors$material_release(), Float.valueOf(floatValue2));
                f5 = (getOffset().getValue().floatValue() - floatValue) / (floatValue2 - floatValue);
            } else {
                K = a1.K(getAnchors$material_release(), findBounds.get(0));
                currentValue = a1.K(getAnchors$material_release(), findBounds.get(0));
                f5 = 1.0f;
                obj = K;
            }
        } else {
            T currentValue2 = getCurrentValue();
            currentValue = getCurrentValue();
            obj = currentValue2;
            f5 = 1.0f;
        }
        return new SwipeProgress<>(obj, currentValue, f5);
    }

    @m
    public final ResistanceConfig getResistance$material_release() {
        return (ResistanceConfig) this.resistance$delegate.getValue();
    }

    public final T getTargetValue() {
        Float offset;
        float floatValue;
        float computeTarget;
        Float value = this.animationTarget.getValue();
        if (value != null) {
            computeTarget = value.floatValue();
        } else {
            float floatValue2 = getOffset().getValue().floatValue();
            offset = SwipeableKt.getOffset(getAnchors$material_release(), getCurrentValue());
            if (offset != null) {
                floatValue = offset.floatValue();
            } else {
                floatValue = getOffset().getValue().floatValue();
            }
            computeTarget = SwipeableKt.computeTarget(floatValue2, floatValue, getAnchors$material_release().keySet(), getThresholds$material_release(), 0.0f, Float.POSITIVE_INFINITY);
        }
        T t5 = getAnchors$material_release().get(Float.valueOf(computeTarget));
        if (t5 == null) {
            return getCurrentValue();
        }
        return t5;
    }

    @l
    public final p<Float, Float, Float> getThresholds$material_release() {
        return (p) this.thresholds$delegate.getValue();
    }

    public final float getVelocityThreshold$material_release() {
        return this.velocityThreshold$delegate.getFloatValue();
    }

    public final boolean isAnimationRunning() {
        return ((Boolean) this.isAnimationRunning$delegate.getValue()).booleanValue();
    }

    public final float performDrag(float f5) {
        float H;
        H = u.H(this.absoluteOffset.getFloatValue() + f5, this.minBound, this.maxBound);
        float floatValue = H - this.absoluteOffset.getFloatValue();
        if (Math.abs(floatValue) > 0.0f) {
            this.draggableState.dispatchRawDelta(floatValue);
        }
        return floatValue;
    }

    @m
    public final Object performFling(final float f5, @l kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        Object collect = this.latestNonEmptyAnchorsFlow.collect(new j(this) { // from class: androidx.compose.material.SwipeableState$performFling$2
            final /* synthetic */ SwipeableState<T> this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.this$0 = this;
            }

            @Override // kotlinx.coroutines.flow.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, kotlin.coroutines.d dVar2) {
                return emit((Map) obj, (kotlin.coroutines.d<? super r2>) dVar2);
            }

            @m
            public final Object emit(@l Map<Float, ? extends T> map, @l kotlin.coroutines.d<? super r2> dVar2) {
                Float offset;
                float computeTarget;
                Object animateInternalToOffset;
                Object l6;
                Object l7;
                offset = SwipeableKt.getOffset(map, this.this$0.getCurrentValue());
                l0.m(offset);
                float floatValue = offset.floatValue();
                computeTarget = SwipeableKt.computeTarget(this.this$0.getOffset().getValue().floatValue(), floatValue, map.keySet(), this.this$0.getThresholds$material_release(), f5, this.this$0.getVelocityThreshold$material_release());
                T t5 = map.get(kotlin.coroutines.jvm.internal.b.e(computeTarget));
                if (t5 != null && this.this$0.getConfirmStateChange$material_release().invoke(t5).booleanValue()) {
                    Object animateTo$default = SwipeableState.animateTo$default(this.this$0, t5, null, dVar2, 2, null);
                    l7 = kotlin.coroutines.intrinsics.d.l();
                    return animateTo$default == l7 ? animateTo$default : r2.f19517a;
                }
                SwipeableState<T> swipeableState = this.this$0;
                animateInternalToOffset = swipeableState.animateInternalToOffset(floatValue, swipeableState.getAnimationSpec$material_release(), dVar2);
                l6 = kotlin.coroutines.intrinsics.d.l();
                return animateInternalToOffset == l6 ? animateInternalToOffset : r2.f19517a;
            }
        }, dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return collect == l5 ? collect : r2.f19517a;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @p4.m
    public final java.lang.Object processNewAnchors$material_release(@p4.l java.util.Map<java.lang.Float, ? extends T> r10, @p4.l java.util.Map<java.lang.Float, ? extends T> r11, @p4.l kotlin.coroutines.d<? super kotlin.r2> r12) {
        /*
            Method dump skipped, instructions count: 643
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableState.processNewAnchors$material_release(java.util.Map, java.util.Map, kotlin.coroutines.d):java.lang.Object");
    }

    public final void setAnchors$material_release(@l Map<Float, ? extends T> map) {
        this.anchors$delegate.setValue(map);
    }

    public final void setMaxBound$material_release(float f5) {
        this.maxBound = f5;
    }

    public final void setMinBound$material_release(float f5) {
        this.minBound = f5;
    }

    public final void setResistance$material_release(@m ResistanceConfig resistanceConfig) {
        this.resistance$delegate.setValue(resistanceConfig);
    }

    public final void setThresholds$material_release(@l p<? super Float, ? super Float, Float> pVar) {
        this.thresholds$delegate.setValue(pVar);
    }

    public final void setVelocityThreshold$material_release(float f5) {
        this.velocityThreshold$delegate.setFloatValue(f5);
    }

    @ExperimentalMaterialApi
    @m
    public final Object snapTo(T t5, @l kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        Object collect = this.latestNonEmptyAnchorsFlow.collect(new SwipeableState$snapTo$2(t5, this), dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return collect == l5 ? collect : r2.f19517a;
    }

    public /* synthetic */ SwipeableState(Object obj, AnimationSpec animationSpec, v3.l lVar, int i5, w wVar) {
        this(obj, (i5 & 2) != 0 ? SwipeableDefaults.INSTANCE.getAnimationSpec() : animationSpec, (i5 & 4) != 0 ? AnonymousClass1.INSTANCE : lVar);
    }
}
