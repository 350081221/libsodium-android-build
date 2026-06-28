package androidx.compose.foundation.gestures;

import androidx.annotation.FloatRange;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
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
import com.google.android.material.color.utilities.Contrast;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import kotlin.ranges.u;
import p4.l;
import p4.m;
import v3.a;
import v3.q;
import v3.r;

@Stable
@i0(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b1\b\u0007\u0018\u0000 q*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001qBs\u0012\u0006\u0010m\u001a\u00028\u0000\u0012!\u0010-\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u00030+\u0012\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000301\u0012\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u000306\u0012#\b\u0002\u0010<\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(;\u0012\u0004\u0012\u00020\f0+¢\u0006\u0004\bn\u0010oB\u0083\u0001\b\u0017\u0012\u0006\u0010m\u001a\u00028\u0000\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012!\u0010-\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u00030+\u0012\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000301\u0012\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u000306\u0012#\b\u0002\u0010<\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(;\u0012\u0004\u0012\u00020\f0+¢\u0006\u0004\bn\u0010pJ'\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u000f\u001a\u00020\u0003J%\u0010\u0014\u001a\u00020\u00132\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\b\b\u0002\u0010\u0012\u001a\u00028\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u0003H\u0086@¢\u0006\u0004\b\u0016\u0010\u0017J^\u0010\"\u001a\u00020\u00132\b\b\u0002\u0010\u0019\u001a\u00020\u00182B\u0010!\u001a>\b\u0001\u0012\u0004\u0012\u00020\u001b\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001a¢\u0006\u0002\b H\u0086@¢\u0006\u0004\b\"\u0010#J{\u0010\"\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00028\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00182W\u0010!\u001aS\b\u0001\u0012\u0004\u0012\u00020\u001b\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u00020$¢\u0006\u0002\b H\u0086@¢\u0006\u0004\b\"\u0010%J\u0017\u0010)\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u0003H\u0000¢\u0006\u0004\b'\u0010(J\u000e\u0010*\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u0003R5\u0010-\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u00030+8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R \u00102\u001a\b\u0012\u0004\u0012\u00020\u0003018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001d\u00107\u001a\b\u0012\u0004\u0012\u00020\u0003068\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R5\u0010<\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(;\u0012\u0004\u0012\u00020\f0+8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b<\u0010.\u001a\u0004\b=\u00100R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001a\u0010B\u001a\u00020A8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER+\u0010\u0005\u001a\u00028\u00002\u0006\u0010F\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001b\u0010\u000b\u001a\u00028\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010JR\u001b\u0010R\u001a\u00028\u00008@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bP\u0010N\u001a\u0004\bQ\u0010JR+\u0010\u0004\u001a\u00020\u00032\u0006\u0010F\u001a\u00020\u00038F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u001b\u0010[\u001a\u00020\u00038GX\u0086\u0084\u0002¢\u0006\f\n\u0004\bY\u0010N\u001a\u0004\bZ\u0010VR+\u0010_\u001a\u00020\u00032\u0006\u0010F\u001a\u00020\u00038F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\\\u0010T\u001a\u0004\b]\u0010V\"\u0004\b^\u0010XR/\u0010c\u001a\u0004\u0018\u00018\u00002\b\u0010F\u001a\u0004\u0018\u00018\u00008B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b`\u0010H\u001a\u0004\ba\u0010J\"\u0004\bb\u0010LR7\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\f\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000\u00108F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bd\u0010H\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\u0014\u0010i\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0011\u0010k\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bk\u0010l¨\u0006r"}, d2 = {"Landroidx/compose/foundation/gestures/AnchoredDraggableState;", "T", "", "", TypedValues.CycleType.S_WAVE_OFFSET, "currentValue", "velocity", "computeTarget", "(FLjava/lang/Object;F)Ljava/lang/Object;", "computeTargetWithoutThresholds", "(FLjava/lang/Object;)Ljava/lang/Object;", "targetValue", "", "trySnapTo", "(Ljava/lang/Object;)Z", "requireOffset", "Landroidx/compose/foundation/gestures/DraggableAnchors;", "newAnchors", "newTarget", "Lkotlin/r2;", "updateAnchors", "(Landroidx/compose/foundation/gestures/DraggableAnchors;Ljava/lang/Object;)V", "settle", "(FLkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/foundation/MutatePriority;", "dragPriority", "Lkotlin/Function3;", "Landroidx/compose/foundation/gestures/AnchoredDragScope;", "Lkotlin/v0;", "name", "anchors", "Lkotlin/coroutines/d;", "Lkotlin/u;", "block", "anchoredDrag", "(Landroidx/compose/foundation/MutatePriority;Lv3/q;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/Function4;", "(Ljava/lang/Object;Landroidx/compose/foundation/MutatePriority;Lv3/r;Lkotlin/coroutines/d;)Ljava/lang/Object;", "delta", "newOffsetForDelta$foundation_release", "(F)F", "newOffsetForDelta", "dispatchRawDelta", "Lkotlin/Function1;", "totalDistance", "positionalThreshold", "Lv3/l;", "getPositionalThreshold$foundation_release", "()Lv3/l;", "Lkotlin/Function0;", "velocityThreshold", "Lv3/a;", "getVelocityThreshold$foundation_release", "()Lv3/a;", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "getAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "newValue", "confirmValueChange", "getConfirmValueChange$foundation_release", "Landroidx/compose/foundation/MutatorMutex;", "dragMutex", "Landroidx/compose/foundation/MutatorMutex;", "Landroidx/compose/foundation/gestures/DraggableState;", "draggableState", "Landroidx/compose/foundation/gestures/DraggableState;", "getDraggableState$foundation_release", "()Landroidx/compose/foundation/gestures/DraggableState;", "<set-?>", "currentValue$delegate", "Landroidx/compose/runtime/MutableState;", "getCurrentValue", "()Ljava/lang/Object;", "setCurrentValue", "(Ljava/lang/Object;)V", "targetValue$delegate", "Landroidx/compose/runtime/State;", "getTargetValue", "closestValue$delegate", "getClosestValue$foundation_release", "closestValue", "offset$delegate", "Landroidx/compose/runtime/MutableFloatState;", "getOffset", "()F", "setOffset", "(F)V", "progress$delegate", "getProgress", "progress", "lastVelocity$delegate", "getLastVelocity", "setLastVelocity", "lastVelocity", "dragTarget$delegate", "getDragTarget", "setDragTarget", "dragTarget", "anchors$delegate", "getAnchors", "()Landroidx/compose/foundation/gestures/DraggableAnchors;", "setAnchors", "(Landroidx/compose/foundation/gestures/DraggableAnchors;)V", "anchoredDragScope", "Landroidx/compose/foundation/gestures/AnchoredDragScope;", "isAnimationRunning", "()Z", "initialValue", "<init>", "(Ljava/lang/Object;Lv3/l;Lv3/a;Landroidx/compose/animation/core/AnimationSpec;Lv3/l;)V", "(Ljava/lang/Object;Landroidx/compose/foundation/gestures/DraggableAnchors;Lv3/l;Lv3/a;Landroidx/compose/animation/core/AnimationSpec;Lv3/l;)V", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalFoundationApi
@r1({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/AnchoredDraggableState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 4 MutatorMutex.kt\nandroidx/compose/foundation/MutatorMutex\n*L\n1#1,767:1\n81#2:768\n107#2,2:769\n81#2:771\n81#2:772\n81#2:776\n81#2:780\n107#2,2:781\n81#2:783\n107#2,2:784\n76#3:773\n109#3,2:774\n76#3:777\n109#3,2:778\n195#4,9:786\n*S KotlinDebug\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/AnchoredDraggableState\n*L\n294#1:768\n294#1:769,2\n302#1:771\n316#1:772\n361#1:776\n381#1:780\n381#1:781,2\n383#1:783\n383#1:784,2\n333#1:773\n333#1:774,2\n378#1:777\n378#1:778,2\n613#1:786,9\n*E\n"})
/* loaded from: classes.dex */
public final class AnchoredDraggableState<T> {
    public static final int $stable = 0;

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private final AnchoredDragScope anchoredDragScope;

    @l
    private final MutableState anchors$delegate;

    @l
    private final AnimationSpec<Float> animationSpec;

    @l
    private final State closestValue$delegate;

    @l
    private final v3.l<T, Boolean> confirmValueChange;

    @l
    private final MutableState currentValue$delegate;

    @l
    private final MutatorMutex dragMutex;

    @l
    private final MutableState dragTarget$delegate;

    @l
    private final DraggableState draggableState;

    @l
    private final MutableFloatState lastVelocity$delegate;

    @l
    private final MutableFloatState offset$delegate;

    @l
    private final v3.l<Float, Float> positionalThreshold;

    @l
    private final State progress$delegate;

    @l
    private final State targetValue$delegate;

    @l
    private final a<Float> velocityThreshold;

    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableState$1 */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends n0 implements v3.l<T, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

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

    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableState$2 */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends n0 implements v3.l<T, Boolean> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(1);
        }

        @Override // v3.l
        @l
        public final Boolean invoke(T t5) {
            return Boolean.TRUE;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
            return invoke((AnonymousClass2) obj);
        }
    }

    @i0(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013Jy\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0010\u0012\u0004\u0012\u00028\u00010\u000f\"\b\b\u0001\u0010\u0002*\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\r0\u0006H\u0007¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/gestures/AnchoredDraggableState$Companion;", "", "T", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "Lkotlin/Function1;", "Lkotlin/v0;", "name", "distance", "positionalThreshold", "Lkotlin/Function0;", "velocityThreshold", "", "confirmValueChange", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/gestures/AnchoredDraggableState;", "Saver", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Saver Saver$default(Companion companion, AnimationSpec animationSpec, v3.l lVar, a aVar, v3.l lVar2, int i5, Object obj) {
            if ((i5 & 8) != 0) {
                lVar2 = AnchoredDraggableState$Companion$Saver$1.INSTANCE;
            }
            return companion.Saver(animationSpec, lVar, aVar, lVar2);
        }

        @l
        @ExperimentalFoundationApi
        public final <T> Saver<AnchoredDraggableState<T>, T> Saver(@l AnimationSpec<Float> animationSpec, @l v3.l<? super Float, Float> lVar, @l a<Float> aVar, @l v3.l<? super T, Boolean> lVar2) {
            return SaverKt.Saver(AnchoredDraggableState$Companion$Saver$2.INSTANCE, new AnchoredDraggableState$Companion$Saver$3(lVar, aVar, animationSpec, lVar2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnchoredDraggableState(T t5, @l v3.l<? super Float, Float> lVar, @l a<Float> aVar, @l AnimationSpec<Float> animationSpec, @l v3.l<? super T, Boolean> lVar2) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        MapDraggableAnchors emptyDraggableAnchors;
        MutableState mutableStateOf$default3;
        this.positionalThreshold = lVar;
        this.velocityThreshold = aVar;
        this.animationSpec = animationSpec;
        this.confirmValueChange = lVar2;
        this.dragMutex = new MutatorMutex();
        this.draggableState = new AnchoredDraggableState$draggableState$1(this);
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t5, null, 2, null);
        this.currentValue$delegate = mutableStateOf$default;
        this.targetValue$delegate = SnapshotStateKt.derivedStateOf(new AnchoredDraggableState$targetValue$2(this));
        this.closestValue$delegate = SnapshotStateKt.derivedStateOf(new AnchoredDraggableState$closestValue$2(this));
        this.offset$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(Float.NaN);
        this.progress$delegate = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new AnchoredDraggableState$progress$2(this));
        this.lastVelocity$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.dragTarget$delegate = mutableStateOf$default2;
        emptyDraggableAnchors = AnchoredDraggableKt.emptyDraggableAnchors();
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(emptyDraggableAnchors, null, 2, null);
        this.anchors$delegate = mutableStateOf$default3;
        this.anchoredDragScope = new AnchoredDragScope(this) { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDragScope$1
            final /* synthetic */ AnchoredDraggableState<T> this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.this$0 = this;
            }

            @Override // androidx.compose.foundation.gestures.AnchoredDragScope
            public void dragTo(float f5, float f6) {
                this.this$0.setOffset(f5);
                this.this$0.setLastVelocity(f6);
            }
        };
    }

    public static /* synthetic */ Object anchoredDrag$default(AnchoredDraggableState anchoredDraggableState, MutatePriority mutatePriority, q qVar, d dVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return anchoredDraggableState.anchoredDrag(mutatePriority, qVar, dVar);
    }

    public final T computeTarget(float f5, T t5, float f6) {
        boolean z4;
        DraggableAnchors<T> anchors = getAnchors();
        float positionOf = anchors.positionOf(t5);
        float floatValue = this.velocityThreshold.invoke().floatValue();
        boolean z5 = true;
        if (positionOf == f5) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4 && !Float.isNaN(positionOf)) {
            if (Math.abs(f6) >= Math.abs(floatValue)) {
                if (f5 - positionOf <= 0.0f) {
                    z5 = false;
                }
                T closestAnchor = anchors.closestAnchor(f5, z5);
                l0.m(closestAnchor);
                return closestAnchor;
            }
            if (f5 - positionOf <= 0.0f) {
                z5 = false;
            }
            T closestAnchor2 = anchors.closestAnchor(f5, z5);
            l0.m(closestAnchor2);
            if (Math.abs(positionOf - f5) > Math.abs(this.positionalThreshold.invoke(Float.valueOf(Math.abs(positionOf - anchors.positionOf(closestAnchor2)))).floatValue())) {
                return closestAnchor2;
            }
            return t5;
        }
        return t5;
    }

    public final T computeTargetWithoutThresholds(float f5, T t5) {
        boolean z4;
        DraggableAnchors<T> anchors = getAnchors();
        float positionOf = anchors.positionOf(t5);
        boolean z5 = true;
        if (positionOf == f5) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4 && !Float.isNaN(positionOf)) {
            if (f5 - positionOf <= 0.0f) {
                z5 = false;
            }
            T closestAnchor = anchors.closestAnchor(f5, z5);
            if (closestAnchor != null) {
                return closestAnchor;
            }
            return t5;
        }
        return t5;
    }

    public final T getDragTarget() {
        return this.dragTarget$delegate.getValue();
    }

    private final void setAnchors(DraggableAnchors<T> draggableAnchors) {
        this.anchors$delegate.setValue(draggableAnchors);
    }

    private final void setCurrentValue(T t5) {
        this.currentValue$delegate.setValue(t5);
    }

    public final void setDragTarget(T t5) {
        this.dragTarget$delegate.setValue(t5);
    }

    public final void setLastVelocity(float f5) {
        this.lastVelocity$delegate.setFloatValue(f5);
    }

    public final void setOffset(float f5) {
        this.offset$delegate.setFloatValue(f5);
    }

    private final boolean trySnapTo(T t5) {
        MutatorMutex mutatorMutex = this.dragMutex;
        boolean tryLock = mutatorMutex.tryLock();
        if (tryLock) {
            try {
                AnchoredDragScope anchoredDragScope = this.anchoredDragScope;
                float positionOf = getAnchors().positionOf(t5);
                if (!Float.isNaN(positionOf)) {
                    AnchoredDragScope.dragTo$default(anchoredDragScope, positionOf, 0.0f, 2, null);
                    setDragTarget(null);
                }
                setCurrentValue(t5);
            } finally {
                mutatorMutex.unlock();
            }
        }
        return tryLock;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateAnchors$default(AnchoredDraggableState anchoredDraggableState, DraggableAnchors draggableAnchors, Object obj, int i5, Object obj2) {
        if ((i5 & 2) != 0) {
            if (!Float.isNaN(anchoredDraggableState.getOffset())) {
                obj = draggableAnchors.closestAnchor(anchoredDraggableState.getOffset());
                if (obj == null) {
                    obj = anchoredDraggableState.getTargetValue();
                }
            } else {
                obj = anchoredDraggableState.getTargetValue();
            }
        }
        anchoredDraggableState.updateAnchors(draggableAnchors, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object anchoredDrag(@p4.l androidx.compose.foundation.MutatePriority r7, @p4.l v3.q<? super androidx.compose.foundation.gestures.AnchoredDragScope, ? super androidx.compose.foundation.gestures.DraggableAnchors<T>, ? super kotlin.coroutines.d<? super kotlin.r2>, ? extends java.lang.Object> r8, @p4.l kotlin.coroutines.d<? super kotlin.r2> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$1 r0 = (androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$1 r0 = new androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 != r4) goto L31
            java.lang.Object r7 = r0.L$0
            androidx.compose.foundation.gestures.AnchoredDraggableState r7 = (androidx.compose.foundation.gestures.AnchoredDraggableState) r7
            kotlin.e1.n(r9)     // Catch: java.lang.Throwable -> L2f
            goto L50
        L2f:
            r8 = move-exception
            goto L89
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            kotlin.e1.n(r9)
            androidx.compose.foundation.MutatorMutex r9 = r6.dragMutex     // Catch: java.lang.Throwable -> L87
            androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2 r2 = new androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2     // Catch: java.lang.Throwable -> L87
            r5 = 0
            r2.<init>(r6, r8, r5)     // Catch: java.lang.Throwable -> L87
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L87
            r0.label = r4     // Catch: java.lang.Throwable -> L87
            java.lang.Object r7 = r9.mutate(r7, r2, r0)     // Catch: java.lang.Throwable -> L87
            if (r7 != r1) goto L4f
            return r1
        L4f:
            r7 = r6
        L50:
            androidx.compose.foundation.gestures.DraggableAnchors r8 = r7.getAnchors()
            float r9 = r7.getOffset()
            java.lang.Object r8 = r8.closestAnchor(r9)
            if (r8 == 0) goto L84
            float r9 = r7.getOffset()
            androidx.compose.foundation.gestures.DraggableAnchors r0 = r7.getAnchors()
            float r0 = r0.positionOf(r8)
            float r9 = r9 - r0
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 > 0) goto L84
            v3.l<T, java.lang.Boolean> r9 = r7.confirmValueChange
            java.lang.Object r9 = r9.invoke(r8)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L84
            r7.setCurrentValue(r8)
        L84:
            kotlin.r2 r7 = kotlin.r2.f19517a
            return r7
        L87:
            r8 = move-exception
            r7 = r6
        L89:
            androidx.compose.foundation.gestures.DraggableAnchors r9 = r7.getAnchors()
            float r0 = r7.getOffset()
            java.lang.Object r9 = r9.closestAnchor(r0)
            if (r9 == 0) goto Lbd
            float r0 = r7.getOffset()
            androidx.compose.foundation.gestures.DraggableAnchors r1 = r7.getAnchors()
            float r1 = r1.positionOf(r9)
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto Lbd
            v3.l<T, java.lang.Boolean> r0 = r7.confirmValueChange
            java.lang.Object r0 = r0.invoke(r9)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lbd
            r7.setCurrentValue(r9)
        Lbd:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableState.anchoredDrag(androidx.compose.foundation.MutatePriority, v3.q, kotlin.coroutines.d):java.lang.Object");
    }

    public final float dispatchRawDelta(float f5) {
        float offset;
        float newOffsetForDelta$foundation_release = newOffsetForDelta$foundation_release(f5);
        if (Float.isNaN(getOffset())) {
            offset = 0.0f;
        } else {
            offset = getOffset();
        }
        setOffset(newOffsetForDelta$foundation_release);
        return newOffsetForDelta$foundation_release - offset;
    }

    @l
    public final DraggableAnchors<T> getAnchors() {
        return (DraggableAnchors) this.anchors$delegate.getValue();
    }

    @l
    public final AnimationSpec<Float> getAnimationSpec() {
        return this.animationSpec;
    }

    public final T getClosestValue$foundation_release() {
        return (T) this.closestValue$delegate.getValue();
    }

    @l
    public final v3.l<T, Boolean> getConfirmValueChange$foundation_release() {
        return this.confirmValueChange;
    }

    public final T getCurrentValue() {
        return this.currentValue$delegate.getValue();
    }

    @l
    public final DraggableState getDraggableState$foundation_release() {
        return this.draggableState;
    }

    public final float getLastVelocity() {
        return this.lastVelocity$delegate.getFloatValue();
    }

    public final float getOffset() {
        return this.offset$delegate.getFloatValue();
    }

    @l
    public final v3.l<Float, Float> getPositionalThreshold$foundation_release() {
        return this.positionalThreshold;
    }

    @FloatRange(from = 0.0d, to = Contrast.RATIO_MIN)
    public final float getProgress() {
        return ((Number) this.progress$delegate.getValue()).floatValue();
    }

    public final T getTargetValue() {
        return (T) this.targetValue$delegate.getValue();
    }

    @l
    public final a<Float> getVelocityThreshold$foundation_release() {
        return this.velocityThreshold;
    }

    public final boolean isAnimationRunning() {
        return getDragTarget() != null;
    }

    public final float newOffsetForDelta$foundation_release(float f5) {
        float offset;
        float H;
        if (Float.isNaN(getOffset())) {
            offset = 0.0f;
        } else {
            offset = getOffset();
        }
        H = u.H(offset + f5, getAnchors().minAnchor(), getAnchors().maxAnchor());
        return H;
    }

    public final float requireOffset() {
        if (!Float.isNaN(getOffset())) {
            return getOffset();
        }
        throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?".toString());
    }

    @m
    public final Object settle(float f5, @l d<? super r2> dVar) {
        Object l5;
        Object l6;
        T currentValue = getCurrentValue();
        T computeTarget = computeTarget(requireOffset(), currentValue, f5);
        if (this.confirmValueChange.invoke(computeTarget).booleanValue()) {
            Object animateTo = AnchoredDraggableKt.animateTo(this, computeTarget, f5, dVar);
            l6 = kotlin.coroutines.intrinsics.d.l();
            if (animateTo == l6) {
                return animateTo;
            }
            return r2.f19517a;
        }
        Object animateTo2 = AnchoredDraggableKt.animateTo(this, currentValue, f5, dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (animateTo2 == l5) {
            return animateTo2;
        }
        return r2.f19517a;
    }

    public final void updateAnchors(@l DraggableAnchors<T> draggableAnchors, T t5) {
        if (!l0.g(getAnchors(), draggableAnchors)) {
            setAnchors(draggableAnchors);
            if (!trySnapTo(t5)) {
                setDragTarget(t5);
            }
        }
    }

    public static /* synthetic */ Object anchoredDrag$default(AnchoredDraggableState anchoredDraggableState, Object obj, MutatePriority mutatePriority, r rVar, d dVar, int i5, Object obj2) {
        if ((i5 & 2) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return anchoredDraggableState.anchoredDrag(obj, mutatePriority, rVar, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object anchoredDrag(T r7, @p4.l androidx.compose.foundation.MutatePriority r8, @p4.l v3.r<? super androidx.compose.foundation.gestures.AnchoredDragScope, ? super androidx.compose.foundation.gestures.DraggableAnchors<T>, ? super T, ? super kotlin.coroutines.d<? super kotlin.r2>, ? extends java.lang.Object> r9, @p4.l kotlin.coroutines.d<? super kotlin.r2> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$3
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$3 r0 = (androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$3 r0 = new androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$3
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            java.lang.Object r7 = r0.L$0
            androidx.compose.foundation.gestures.AnchoredDraggableState r7 = (androidx.compose.foundation.gestures.AnchoredDraggableState) r7
            kotlin.e1.n(r10)     // Catch: java.lang.Throwable -> L30
            goto L5a
        L30:
            r8 = move-exception
            goto L94
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            kotlin.e1.n(r10)
            androidx.compose.foundation.gestures.DraggableAnchors r10 = r6.getAnchors()
            boolean r10 = r10.hasAnchorFor(r7)
            if (r10 == 0) goto Lcc
            androidx.compose.foundation.MutatorMutex r10 = r6.dragMutex     // Catch: java.lang.Throwable -> L92
            androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4 r2 = new androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4     // Catch: java.lang.Throwable -> L92
            r2.<init>(r6, r7, r9, r5)     // Catch: java.lang.Throwable -> L92
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L92
            r0.label = r4     // Catch: java.lang.Throwable -> L92
            java.lang.Object r7 = r10.mutate(r8, r2, r0)     // Catch: java.lang.Throwable -> L92
            if (r7 != r1) goto L59
            return r1
        L59:
            r7 = r6
        L5a:
            r7.setDragTarget(r5)
            androidx.compose.foundation.gestures.DraggableAnchors r8 = r7.getAnchors()
            float r9 = r7.getOffset()
            java.lang.Object r8 = r8.closestAnchor(r9)
            if (r8 == 0) goto Lcf
            float r9 = r7.getOffset()
            androidx.compose.foundation.gestures.DraggableAnchors r10 = r7.getAnchors()
            float r10 = r10.positionOf(r8)
            float r9 = r9 - r10
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 > 0) goto Lcf
            v3.l<T, java.lang.Boolean> r9 = r7.confirmValueChange
            java.lang.Object r9 = r9.invoke(r8)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto Lcf
            r7.setCurrentValue(r8)
            goto Lcf
        L92:
            r8 = move-exception
            r7 = r6
        L94:
            r7.setDragTarget(r5)
            androidx.compose.foundation.gestures.DraggableAnchors r9 = r7.getAnchors()
            float r10 = r7.getOffset()
            java.lang.Object r9 = r9.closestAnchor(r10)
            if (r9 == 0) goto Lcb
            float r10 = r7.getOffset()
            androidx.compose.foundation.gestures.DraggableAnchors r0 = r7.getAnchors()
            float r0 = r0.positionOf(r9)
            float r10 = r10 - r0
            float r10 = java.lang.Math.abs(r10)
            int r10 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r10 > 0) goto Lcb
            v3.l<T, java.lang.Boolean> r10 = r7.confirmValueChange
            java.lang.Object r10 = r10.invoke(r9)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto Lcb
            r7.setCurrentValue(r9)
        Lcb:
            throw r8
        Lcc:
            r6.setCurrentValue(r7)
        Lcf:
            kotlin.r2 r7 = kotlin.r2.f19517a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableState.anchoredDrag(java.lang.Object, androidx.compose.foundation.MutatePriority, v3.r, kotlin.coroutines.d):java.lang.Object");
    }

    public /* synthetic */ AnchoredDraggableState(Object obj, v3.l lVar, a aVar, AnimationSpec animationSpec, v3.l lVar2, int i5, w wVar) {
        this(obj, lVar, aVar, animationSpec, (i5 & 16) != 0 ? AnonymousClass1.INSTANCE : lVar2);
    }

    public /* synthetic */ AnchoredDraggableState(Object obj, DraggableAnchors draggableAnchors, v3.l lVar, a aVar, AnimationSpec animationSpec, v3.l lVar2, int i5, w wVar) {
        this(obj, draggableAnchors, lVar, aVar, animationSpec, (i5 & 32) != 0 ? AnonymousClass2.INSTANCE : lVar2);
    }

    @ExperimentalFoundationApi
    public AnchoredDraggableState(T t5, @l DraggableAnchors<T> draggableAnchors, @l v3.l<? super Float, Float> lVar, @l a<Float> aVar, @l AnimationSpec<Float> animationSpec, @l v3.l<? super T, Boolean> lVar2) {
        this(t5, lVar, aVar, animationSpec, lVar2);
        setAnchors(draggableAnchors);
        trySnapTo(t5);
    }
}
