package androidx.compose.animation.core;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotLongStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.List;
import kotlin.a1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;
import v3.p;

@Stable
@i0(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0004tuvwB#\b\u0001\u0012\f\u00102\u001a\b\u0012\u0004\u0012\u00028\u000001\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010,¢\u0006\u0004\bo\u0010pB\u001b\b\u0010\u0012\u0006\u0010\u0012\u001a\u00028\u0000\u0012\b\u00104\u001a\u0004\u0018\u00010,¢\u0006\u0004\bo\u0010qB#\b\u0011\u0012\f\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000r\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010,¢\u0006\u0004\bo\u0010sJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u001f\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0011\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u001c\u001a\u00020\u00192\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001e\u001a\u00020\u00192\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b\u001d\u0010\u001bJ)\u0010#\u001a\u00020\u00192\u0018\u0010 \u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001fR\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0004\b!\u0010\"J)\u0010&\u001a\u00020\u00032\u0018\u0010 \u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001fR\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0004\b$\u0010%J\u0017\u0010)\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00028\u0000H\u0001¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00028\u0000H\u0001¢\u0006\u0004\b*\u0010(J\b\u0010-\u001a\u00020,H\u0016J)\u0010&\u001a\u00020\u00032\u0018\u0010/\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030.R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0004\b$\u00100R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00028\u0000018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0019\u00104\u001a\u0004\u0018\u00010,8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R+\u0010\u0013\u001a\u00028\u00002\u0006\u00108\u001a\u00028\u00008F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R7\u0010E\u001a\b\u0012\u0004\u0012\u00028\u00000?2\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u00000?8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b@\u0010:\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR1\u0010\u0014\u001a\u00020\u00052\u0006\u00108\u001a\u00020\u00058F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\bF\u0010G\u0012\u0004\bK\u0010\u0010\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010\rR+\u0010O\u001a\u00020\u00052\u0006\u00108\u001a\u00020\u00058B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bL\u0010G\u001a\u0004\bM\u0010I\"\u0004\bN\u0010\rR+\u0010U\u001a\u00020\u00192\u0006\u00108\u001a\u00020\u00198@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bP\u0010:\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR,\u0010W\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001fR\b\u0012\u0004\u0012\u00028\u00000\u00000V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u001e\u0010Y\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010XR1\u0010[\u001a\u00020\u00192\u0006\u00108\u001a\u00020\u00198F@@X\u0087\u008e\u0002¢\u0006\u0018\n\u0004\bZ\u0010:\u0012\u0004\b]\u0010\u0010\u001a\u0004\b[\u0010R\"\u0004\b\\\u0010TR\"\u0010^\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010I\"\u0004\ba\u0010\rR\u001b\u0010e\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010IR\u0011\u0010g\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\bf\u0010<R\u0011\u0010h\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bh\u0010RR\u001b\u0010l\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000i8F¢\u0006\u0006\u001a\u0004\bj\u0010kR)\u0010n\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001fR\b\u0012\u0004\u0012\u00028\u00000\u00000i8F¢\u0006\u0006\u001a\u0004\bm\u0010k¨\u0006x"}, d2 = {"Landroidx/compose/animation/core/Transition;", "S", "", "Lkotlin/r2;", "onChildAnimationUpdated", "", "frameTimeNanos", "", "durationScale", "onFrame$animation_core_release", "(JF)V", "onFrame", "onTransitionStart$animation_core_release", "(J)V", "onTransitionStart", "onTransitionEnd$animation_core_release", "()V", "onTransitionEnd", "initialState", "targetState", "playTimeNanos", "seek", "(Ljava/lang/Object;Ljava/lang/Object;J)V", "setPlaytimeAfterInitialAndTargetStateEstablished", "transition", "", "addTransition$animation_core_release", "(Landroidx/compose/animation/core/Transition;)Z", "addTransition", "removeTransition$animation_core_release", "removeTransition", "Landroidx/compose/animation/core/Transition$TransitionAnimationState;", "animation", "addAnimation$animation_core_release", "(Landroidx/compose/animation/core/Transition$TransitionAnimationState;)Z", "addAnimation", "removeAnimation$animation_core_release", "(Landroidx/compose/animation/core/Transition$TransitionAnimationState;)V", "removeAnimation", "updateTarget$animation_core_release", "(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)V", "updateTarget", "animateTo$animation_core_release", "animateTo", "", "toString", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "deferredAnimation", "(Landroidx/compose/animation/core/Transition$DeferredAnimation;)V", "Landroidx/compose/animation/core/TransitionState;", "transitionState", "Landroidx/compose/animation/core/TransitionState;", TTDownloadField.TT_LABEL, "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "<set-?>", "targetState$delegate", "Landroidx/compose/runtime/MutableState;", "getTargetState", "()Ljava/lang/Object;", "setTargetState$animation_core_release", "(Ljava/lang/Object;)V", "Landroidx/compose/animation/core/Transition$Segment;", "segment$delegate", "getSegment", "()Landroidx/compose/animation/core/Transition$Segment;", "setSegment", "(Landroidx/compose/animation/core/Transition$Segment;)V", "segment", "playTimeNanos$delegate", "Landroidx/compose/runtime/MutableLongState;", "getPlayTimeNanos", "()J", "setPlayTimeNanos", "getPlayTimeNanos$annotations", "startTimeNanos$delegate", "getStartTimeNanos", "setStartTimeNanos", "startTimeNanos", "updateChildrenNeeded$delegate", "getUpdateChildrenNeeded$animation_core_release", "()Z", "setUpdateChildrenNeeded$animation_core_release", "(Z)V", "updateChildrenNeeded", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "_animations", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "_transitions", "isSeeking$delegate", "isSeeking", "setSeeking$animation_core_release", "isSeeking$annotations", "lastSeekedTimeNanos", "J", "getLastSeekedTimeNanos$animation_core_release", "setLastSeekedTimeNanos$animation_core_release", "totalDurationNanos$delegate", "Landroidx/compose/runtime/State;", "getTotalDurationNanos", "totalDurationNanos", "getCurrentState", "currentState", "isRunning", "", "getTransitions", "()Ljava/util/List;", "transitions", "getAnimations", "animations", "<init>", "(Landroidx/compose/animation/core/TransitionState;Ljava/lang/String;)V", "(Ljava/lang/Object;Ljava/lang/String;)V", "Landroidx/compose/animation/core/MutableTransitionState;", "(Landroidx/compose/animation/core/MutableTransitionState;Ljava/lang/String;)V", "DeferredAnimation", "Segment", "SegmentImpl", "TransitionAnimationState", "animation-core_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotLongState.kt\nandroidx/compose/runtime/SnapshotLongStateKt__SnapshotLongStateKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1382:1\n81#2:1383\n107#2,2:1384\n81#2:1386\n107#2,2:1387\n81#2:1395\n107#2,2:1396\n81#2:1398\n107#2,2:1399\n81#2:1401\n76#3:1389\n109#3,2:1390\n76#3:1392\n109#3,2:1393\n33#4,6:1402\n33#4,6:1408\n33#4,6:1414\n33#4,6:1420\n33#4,6:1426\n256#4,3:1438\n33#4,4:1441\n259#4,2:1445\n38#4:1447\n261#4:1448\n33#4,6:1449\n1116#5,6:1432\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition\n*L\n408#1:1383\n408#1:1384,2\n415#1:1386\n415#1:1387,2\n434#1:1395\n434#1:1396,2\n455#1:1398\n455#1:1399,2\n467#1:1401\n430#1:1389\n430#1:1390,2\n431#1:1392\n431#1:1393,2\n492#1:1402,6\n501#1:1408,6\n572#1:1414,6\n585#1:1420,6\n630#1:1426,6\n664#1:1438,3\n664#1:1441,4\n664#1:1445,2\n664#1:1447\n664#1:1448\n673#1:1449,6\n646#1:1432,6\n*E\n"})
/* loaded from: classes.dex */
public final class Transition<S> {
    public static final int $stable = 0;

    @l
    private final SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> _animations;

    @l
    private final SnapshotStateList<Transition<?>> _transitions;

    @l
    private final MutableState isSeeking$delegate;

    @m
    private final String label;
    private long lastSeekedTimeNanos;

    @l
    private final MutableLongState playTimeNanos$delegate;

    @l
    private final MutableState segment$delegate;

    @l
    private final MutableLongState startTimeNanos$delegate;

    @l
    private final MutableState targetState$delegate;

    @l
    private final State totalDurationNanos$delegate;

    @l
    private final TransitionState<S> transitionState;

    @l
    private final MutableState updateChildrenNeeded$delegate;

    @i0(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\u0004\u0018\u0000*\u0004\b\u0001\u0010\u0001*\b\b\u0002\u0010\u0003*\u00020\u00022\u00020\u0004:\u0001*B%\b\u0000\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b(\u0010)JT\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e2#\u0010\t\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u0005¢\u0006\u0002\b\b2!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00028\u00010\u0005J\u000f\u0010\u0013\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR{\u0010'\u001a*\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u001eR\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000R\b\u0012\u0004\u0012\u00028\u00000\u001f2.\u0010 \u001a*\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u001eR\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000R\b\u0012\u0004\u0012\u00028\u00000\u001f8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006+"}, d2 = {"Landroidx/compose/animation/core/Transition$DeferredAnimation;", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "", "Lkotlin/Function1;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Lkotlin/u;", "transitionSpec", "Lkotlin/v0;", "name", "state", "targetValueByState", "Landroidx/compose/runtime/State;", "animate", "Lkotlin/r2;", "setupSeeking$animation_core_release", "()V", "setupSeeking", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "", TTDownloadField.TT_LABEL, "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;", "Landroidx/compose/animation/core/Transition;", "<set-?>", "data$delegate", "Landroidx/compose/runtime/MutableState;", "getData$animation_core_release", "()Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;", "setData$animation_core_release", "(Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;)V", "data", "<init>", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;)V", "DeferredAnimationData", "animation-core_release"}, k = 1, mv = {1, 8, 0})
    @InternalAnimationApi
    @r1({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition$DeferredAnimation\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1382:1\n81#2:1383\n107#2,2:1384\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition$DeferredAnimation\n*L\n880#1:1383\n880#1:1384,2\n*E\n"})
    /* loaded from: classes.dex */
    public final class DeferredAnimation<T, V extends AnimationVector> {

        @l
        private final MutableState data$delegate;

        @l
        private final String label;

        @l
        private final TwoWayConverter<T, V> typeConverter;

        @i0(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0080\u0004\u0018\u0000*\u0004\b\u0003\u0010\u0001*\b\b\u0004\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00030\u0004Bm\u0012\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\tR\b\u0012\u0004\u0012\u00028\u00000\n\u0012#\u0010\u0012\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u00100\u000f¢\u0006\u0002\b\u0011\u0012!\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00028\u00030\u000f¢\u0006\u0004\b!\u0010\"J\u0014\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005R-\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\tR\b\u0012\u0004\u0012\u00028\u00000\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR?\u0010\u0012\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u00100\u000f¢\u0006\u0002\b\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R=\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00028\u00030\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u0014\u0010 \u001a\u00028\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/runtime/State;", "Landroidx/compose/animation/core/Transition$Segment;", "segment", "Lkotlin/r2;", "updateAnimationStates", "Landroidx/compose/animation/core/Transition$TransitionAnimationState;", "Landroidx/compose/animation/core/Transition;", "animation", "Landroidx/compose/animation/core/Transition$TransitionAnimationState;", "getAnimation", "()Landroidx/compose/animation/core/Transition$TransitionAnimationState;", "Lkotlin/Function1;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Lkotlin/u;", "transitionSpec", "Lv3/l;", "getTransitionSpec", "()Lv3/l;", "setTransitionSpec", "(Lv3/l;)V", "Lkotlin/v0;", "name", "state", "targetValueByState", "getTargetValueByState", "setTargetValueByState", "getValue", "()Ljava/lang/Object;", t0.b.f22420d, "<init>", "(Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/core/Transition$TransitionAnimationState;Lv3/l;Lv3/l;)V", "animation-core_release"}, k = 1, mv = {1, 8, 0})
        /* loaded from: classes.dex */
        public final class DeferredAnimationData<T, V extends AnimationVector> implements State<T> {

            @l
            private final Transition<S>.TransitionAnimationState<T, V> animation;

            @l
            private v3.l<? super S, ? extends T> targetValueByState;

            @l
            private v3.l<? super Segment<S>, ? extends FiniteAnimationSpec<T>> transitionSpec;

            public DeferredAnimationData(@l Transition<S>.TransitionAnimationState<T, V> transitionAnimationState, @l v3.l<? super Segment<S>, ? extends FiniteAnimationSpec<T>> lVar, @l v3.l<? super S, ? extends T> lVar2) {
                this.animation = transitionAnimationState;
                this.transitionSpec = lVar;
                this.targetValueByState = lVar2;
            }

            @l
            public final Transition<S>.TransitionAnimationState<T, V> getAnimation() {
                return this.animation;
            }

            @l
            public final v3.l<S, T> getTargetValueByState() {
                return this.targetValueByState;
            }

            @l
            public final v3.l<Segment<S>, FiniteAnimationSpec<T>> getTransitionSpec() {
                return this.transitionSpec;
            }

            @Override // androidx.compose.runtime.State
            public T getValue() {
                updateAnimationStates(Transition.this.getSegment());
                return this.animation.getValue();
            }

            public final void setTargetValueByState(@l v3.l<? super S, ? extends T> lVar) {
                this.targetValueByState = lVar;
            }

            public final void setTransitionSpec(@l v3.l<? super Segment<S>, ? extends FiniteAnimationSpec<T>> lVar) {
                this.transitionSpec = lVar;
            }

            public final void updateAnimationStates(@l Segment<S> segment) {
                T invoke = this.targetValueByState.invoke(segment.getTargetState());
                if (Transition.this.isSeeking()) {
                    this.animation.updateInitialAndTargetValue$animation_core_release(this.targetValueByState.invoke(segment.getInitialState()), invoke, this.transitionSpec.invoke(segment));
                } else {
                    this.animation.updateTargetValue$animation_core_release(invoke, this.transitionSpec.invoke(segment));
                }
            }
        }

        public DeferredAnimation(@l TwoWayConverter<T, V> twoWayConverter, @l String str) {
            MutableState mutableStateOf$default;
            this.typeConverter = twoWayConverter;
            this.label = str;
            mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            this.data$delegate = mutableStateOf$default;
        }

        @l
        public final State<T> animate(@l v3.l<? super Segment<S>, ? extends FiniteAnimationSpec<T>> lVar, @l v3.l<? super S, ? extends T> lVar2) {
            Transition<S>.DeferredAnimationData<T, V>.DeferredAnimationData<T, V> data$animation_core_release = getData$animation_core_release();
            if (data$animation_core_release == null) {
                Transition<S> transition = Transition.this;
                data$animation_core_release = new DeferredAnimationData<>(new TransitionAnimationState(lVar2.invoke(transition.getCurrentState()), AnimationStateKt.createZeroVectorFrom(this.typeConverter, lVar2.invoke(Transition.this.getCurrentState())), this.typeConverter, this.label), lVar, lVar2);
                Transition<S> transition2 = Transition.this;
                setData$animation_core_release(data$animation_core_release);
                transition2.addAnimation$animation_core_release(data$animation_core_release.getAnimation());
            }
            Transition<S> transition3 = Transition.this;
            data$animation_core_release.setTargetValueByState(lVar2);
            data$animation_core_release.setTransitionSpec(lVar);
            data$animation_core_release.updateAnimationStates(transition3.getSegment());
            return data$animation_core_release;
        }

        @m
        public final Transition<S>.DeferredAnimationData<T, V>.DeferredAnimationData<T, V> getData$animation_core_release() {
            return (DeferredAnimationData) this.data$delegate.getValue();
        }

        @l
        public final String getLabel() {
            return this.label;
        }

        @l
        public final TwoWayConverter<T, V> getTypeConverter() {
            return this.typeConverter;
        }

        public final void setData$animation_core_release(@m Transition<S>.DeferredAnimationData<T, V>.DeferredAnimationData<T, V> deferredAnimationData) {
            this.data$delegate.setValue(deferredAnimationData);
        }

        public final void setupSeeking$animation_core_release() {
            Transition<S>.DeferredAnimationData<T, V>.DeferredAnimationData<T, V> data$animation_core_release = getData$animation_core_release();
            if (data$animation_core_release != null) {
                Transition<S> transition = Transition.this;
                data$animation_core_release.getAnimation().updateInitialAndTargetValue$animation_core_release(data$animation_core_release.getTargetValueByState().invoke(transition.getSegment().getInitialState()), data$animation_core_release.getTargetValueByState().invoke(transition.getSegment().getTargetState()), data$animation_core_release.getTransitionSpec().invoke(transition.getSegment()));
            }
        }
    }

    @i0(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J\u001a\u0010\b\u001a\u00020\t*\u00028\u00012\u0006\u0010\u0006\u001a\u00028\u0001H\u0096\u0004¢\u0006\u0002\u0010\nR\u0012\u0010\u0003\u001a\u00028\u0001X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00028\u0001X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Landroidx/compose/animation/core/Transition$Segment;", "S", "", "initialState", "getInitialState", "()Ljava/lang/Object;", "targetState", "getTargetState", "isTransitioningTo", "", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public interface Segment<S> {

        @i0(k = 3, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class DefaultImpls {
            @Deprecated
            public static <S> boolean isTransitioningTo(@l Segment<S> segment, S s5, S s6) {
                return Segment.super.isTransitioningTo(s5, s6);
            }
        }

        S getInitialState();

        S getTargetState();

        default boolean isTransitioningTo(S s5, S s6) {
            return l0.g(s5, getInitialState()) && l0.g(s6, getTargetState());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u0012\u0006\u0010\u0004\u001a\u00028\u0001¢\u0006\u0002\u0010\u0005J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0016\u0010\u0003\u001a\u00028\u0001X\u0096\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00028\u0001X\u0096\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\t\u0010\u0007¨\u0006\u0010"}, d2 = {"Landroidx/compose/animation/core/Transition$SegmentImpl;", "S", "Landroidx/compose/animation/core/Transition$Segment;", "initialState", "targetState", "(Ljava/lang/Object;Ljava/lang/Object;)V", "getInitialState", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getTargetState", "equals", "", "other", "", TTDownloadField.TT_HASHCODE, "", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class SegmentImpl<S> implements Segment<S> {
        private final S initialState;
        private final S targetState;

        public SegmentImpl(S s5, S s6) {
            this.initialState = s5;
            this.targetState = s6;
        }

        public boolean equals(@m Object obj) {
            if (obj instanceof Segment) {
                Segment segment = (Segment) obj;
                if (l0.g(getInitialState(), segment.getInitialState()) && l0.g(getTargetState(), segment.getTargetState())) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.compose.animation.core.Transition.Segment
        public S getInitialState() {
            return this.initialState;
        }

        @Override // androidx.compose.animation.core.Transition.Segment
        public S getTargetState() {
            return this.targetState;
        }

        public int hashCode() {
            S initialState = getInitialState();
            int hashCode = (initialState != null ? initialState.hashCode() : 0) * 31;
            S targetState = getTargetState();
            return hashCode + (targetState != null ? targetState.hashCode() : 0);
        }
    }

    @Stable
    @i0(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b$\b\u0087\u0004\u0018\u0000*\u0004\b\u0001\u0010\u0001*\b\b\u0002\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00010\u0004B5\b\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0001\u0012\u0006\u0010Y\u001a\u00028\u0002\u0012\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020#\u0012\u0006\u0010(\u001a\u00020\u0018¢\u0006\u0004\bZ\u0010[J#\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0005\u001a\u00028\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0017\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J%\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00028\u00012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u001bH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ-\u0010\"\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u001a\u001a\u00028\u00012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u001bH\u0000¢\u0006\u0004\b \u0010!R#\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010(\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R+\u0010\u001a\u001a\u00028\u00012\u0006\u0010,\u001a\u00028\u00018B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R7\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u001b2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00010\u001b8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b3\u0010.\u001a\u0004\b4\u00105\"\u0004\b6\u00107RC\u0010>\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002082\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002088F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b9\u0010.\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R+\u0010D\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u00068@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b?\u0010.\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR+\u0010J\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\u000b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010\u0013R+\u0010N\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bK\u0010.\u001a\u0004\bL\u0010A\"\u0004\bM\u0010CR+\u0010R\u001a\u00028\u00012\u0006\u0010,\u001a\u00028\u00018V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bO\u0010.\u001a\u0004\bP\u00100\"\u0004\bQ\u00102R\u0016\u0010S\u001a\u00028\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00028\u00010\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010X\u001a\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bW\u0010H¨\u0006\\"}, d2 = {"Landroidx/compose/animation/core/Transition$TransitionAnimationState;", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/runtime/State;", "initialValue", "", "isInterrupted", "Lkotlin/r2;", "updateAnimation", "(Ljava/lang/Object;Z)V", "", "playTimeNanos", "", "durationScale", "onPlayTimeChanged$animation_core_release", "(JF)V", "onPlayTimeChanged", "seekTo$animation_core_release", "(J)V", "seekTo", "resetAnimation$animation_core_release", "()V", "resetAnimation", "", "toString", "targetValue", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "animationSpec", "updateTargetValue$animation_core_release", "(Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;)V", "updateTargetValue", "updateInitialAndTargetValue$animation_core_release", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;)V", "updateInitialAndTargetValue", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", TTDownloadField.TT_LABEL, "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "<set-?>", "targetValue$delegate", "Landroidx/compose/runtime/MutableState;", "getTargetValue", "()Ljava/lang/Object;", "setTargetValue", "(Ljava/lang/Object;)V", "animationSpec$delegate", "getAnimationSpec", "()Landroidx/compose/animation/core/FiniteAnimationSpec;", "setAnimationSpec", "(Landroidx/compose/animation/core/FiniteAnimationSpec;)V", "Landroidx/compose/animation/core/TargetBasedAnimation;", "animation$delegate", "getAnimation", "()Landroidx/compose/animation/core/TargetBasedAnimation;", "setAnimation", "(Landroidx/compose/animation/core/TargetBasedAnimation;)V", "animation", "isFinished$delegate", "isFinished$animation_core_release", "()Z", "setFinished$animation_core_release", "(Z)V", "isFinished", "offsetTimeNanos$delegate", "Landroidx/compose/runtime/MutableLongState;", "getOffsetTimeNanos", "()J", "setOffsetTimeNanos", "offsetTimeNanos", "needsReset$delegate", "getNeedsReset", "setNeedsReset", "needsReset", "value$delegate", "getValue", "setValue$animation_core_release", t0.b.f22420d, "velocityVector", "Landroidx/compose/animation/core/AnimationVector;", "interruptionSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "getDurationNanos$animation_core_release", "durationNanos", "initialVelocityVector", "<init>", "(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;)V", "animation-core_release"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition$TransitionAnimationState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotLongState.kt\nandroidx/compose/runtime/SnapshotLongStateKt__SnapshotLongStateKt\n*L\n1#1,1382:1\n81#2:1383\n107#2,2:1384\n81#2:1386\n107#2,2:1387\n81#2:1389\n107#2,2:1390\n81#2:1392\n107#2,2:1393\n81#2:1398\n107#2,2:1399\n81#2:1401\n107#2,2:1402\n76#3:1395\n109#3,2:1396\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition$TransitionAnimationState\n*L\n696#1:1383\n696#1:1384,2\n702#1:1386\n702#1:1387,2\n709#1:1389\n709#1:1390,2\n717#1:1392\n717#1:1393,2\n719#1:1398\n719#1:1399,2\n722#1:1401\n722#1:1402,2\n718#1:1395\n718#1:1396,2\n*E\n"})
    /* loaded from: classes.dex */
    public final class TransitionAnimationState<T, V extends AnimationVector> implements State<T> {

        @l
        private final MutableState animation$delegate;

        @l
        private final MutableState animationSpec$delegate;

        @l
        private final FiniteAnimationSpec<T> interruptionSpec;

        @l
        private final MutableState isFinished$delegate;

        @l
        private final String label;

        @l
        private final MutableState needsReset$delegate;

        @l
        private final MutableLongState offsetTimeNanos$delegate;

        @l
        private final MutableState targetValue$delegate;

        @l
        private final TwoWayConverter<T, V> typeConverter;

        @l
        private final MutableState value$delegate;

        @l
        private V velocityVector;

        public TransitionAnimationState(T t5, @l V v4, @l TwoWayConverter<T, V> twoWayConverter, @l String str) {
            MutableState mutableStateOf$default;
            MutableState mutableStateOf$default2;
            MutableState mutableStateOf$default3;
            MutableState mutableStateOf$default4;
            MutableState mutableStateOf$default5;
            MutableState mutableStateOf$default6;
            T t6;
            this.typeConverter = twoWayConverter;
            this.label = str;
            mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t5, null, 2, null);
            this.targetValue$delegate = mutableStateOf$default;
            mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null), null, 2, null);
            this.animationSpec$delegate = mutableStateOf$default2;
            mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TargetBasedAnimation(getAnimationSpec(), twoWayConverter, t5, getTargetValue(), v4), null, 2, null);
            this.animation$delegate = mutableStateOf$default3;
            mutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
            this.isFinished$delegate = mutableStateOf$default4;
            this.offsetTimeNanos$delegate = SnapshotLongStateKt.mutableLongStateOf(0L);
            mutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            this.needsReset$delegate = mutableStateOf$default5;
            mutableStateOf$default6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t5, null, 2, null);
            this.value$delegate = mutableStateOf$default6;
            this.velocityVector = v4;
            Float f5 = VisibilityThresholdsKt.getVisibilityThresholdMap().get(twoWayConverter);
            if (f5 != null) {
                float floatValue = f5.floatValue();
                V invoke = twoWayConverter.getConvertToVector().invoke(t5);
                int size$animation_core_release = invoke.getSize$animation_core_release();
                for (int i5 = 0; i5 < size$animation_core_release; i5++) {
                    invoke.set$animation_core_release(i5, floatValue);
                }
                t6 = this.typeConverter.getConvertFromVector().invoke(invoke);
            } else {
                t6 = null;
            }
            this.interruptionSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, t6, 3, null);
        }

        private final boolean getNeedsReset() {
            return ((Boolean) this.needsReset$delegate.getValue()).booleanValue();
        }

        private final long getOffsetTimeNanos() {
            return this.offsetTimeNanos$delegate.getLongValue();
        }

        private final T getTargetValue() {
            return this.targetValue$delegate.getValue();
        }

        private final void setAnimation(TargetBasedAnimation<T, V> targetBasedAnimation) {
            this.animation$delegate.setValue(targetBasedAnimation);
        }

        private final void setAnimationSpec(FiniteAnimationSpec<T> finiteAnimationSpec) {
            this.animationSpec$delegate.setValue(finiteAnimationSpec);
        }

        private final void setNeedsReset(boolean z4) {
            this.needsReset$delegate.setValue(Boolean.valueOf(z4));
        }

        private final void setOffsetTimeNanos(long j5) {
            this.offsetTimeNanos$delegate.setLongValue(j5);
        }

        private final void setTargetValue(T t5) {
            this.targetValue$delegate.setValue(t5);
        }

        private final void updateAnimation(T t5, boolean z4) {
            FiniteAnimationSpec<T> animationSpec;
            if (z4) {
                if (getAnimationSpec() instanceof SpringSpec) {
                    animationSpec = getAnimationSpec();
                } else {
                    animationSpec = this.interruptionSpec;
                }
            } else {
                animationSpec = getAnimationSpec();
            }
            setAnimation(new TargetBasedAnimation<>(animationSpec, this.typeConverter, t5, getTargetValue(), this.velocityVector));
            Transition.this.onChildAnimationUpdated();
        }

        /* JADX WARN: Multi-variable type inference failed */
        static /* synthetic */ void updateAnimation$default(TransitionAnimationState transitionAnimationState, Object obj, boolean z4, int i5, Object obj2) {
            if ((i5 & 1) != 0) {
                obj = transitionAnimationState.getValue();
            }
            if ((i5 & 2) != 0) {
                z4 = false;
            }
            transitionAnimationState.updateAnimation(obj, z4);
        }

        @l
        public final TargetBasedAnimation<T, V> getAnimation() {
            return (TargetBasedAnimation) this.animation$delegate.getValue();
        }

        @l
        public final FiniteAnimationSpec<T> getAnimationSpec() {
            return (FiniteAnimationSpec) this.animationSpec$delegate.getValue();
        }

        public final long getDurationNanos$animation_core_release() {
            return getAnimation().getDurationNanos();
        }

        @l
        public final String getLabel() {
            return this.label;
        }

        @l
        public final TwoWayConverter<T, V> getTypeConverter() {
            return this.typeConverter;
        }

        @Override // androidx.compose.runtime.State
        public T getValue() {
            return this.value$delegate.getValue();
        }

        public final boolean isFinished$animation_core_release() {
            return ((Boolean) this.isFinished$delegate.getValue()).booleanValue();
        }

        public final void onPlayTimeChanged$animation_core_release(long j5, float f5) {
            long durationNanos;
            if (f5 > 0.0f) {
                float offsetTimeNanos = ((float) (j5 - getOffsetTimeNanos())) / f5;
                if (!Float.isNaN(offsetTimeNanos)) {
                    durationNanos = offsetTimeNanos;
                } else {
                    throw new IllegalStateException(("Duration scale adjusted time is NaN. Duration scale: " + f5 + ",playTimeNanos: " + j5 + ", offsetTimeNanos: " + getOffsetTimeNanos()).toString());
                }
            } else {
                durationNanos = getAnimation().getDurationNanos();
            }
            setValue$animation_core_release(getAnimation().getValueFromNanos(durationNanos));
            this.velocityVector = getAnimation().getVelocityVectorFromNanos(durationNanos);
            if (getAnimation().isFinishedFromNanos(durationNanos)) {
                setFinished$animation_core_release(true);
                setOffsetTimeNanos(0L);
            }
        }

        public final void resetAnimation$animation_core_release() {
            setNeedsReset(true);
        }

        public final void seekTo$animation_core_release(long j5) {
            setValue$animation_core_release(getAnimation().getValueFromNanos(j5));
            this.velocityVector = getAnimation().getVelocityVectorFromNanos(j5);
        }

        public final void setFinished$animation_core_release(boolean z4) {
            this.isFinished$delegate.setValue(Boolean.valueOf(z4));
        }

        public void setValue$animation_core_release(T t5) {
            this.value$delegate.setValue(t5);
        }

        @l
        public String toString() {
            return "current value: " + getValue() + ", target: " + getTargetValue() + ", spec: " + getAnimationSpec();
        }

        public final void updateInitialAndTargetValue$animation_core_release(T t5, T t6, @l FiniteAnimationSpec<T> finiteAnimationSpec) {
            setTargetValue(t6);
            setAnimationSpec(finiteAnimationSpec);
            if (l0.g(getAnimation().getInitialValue(), t5) && l0.g(getAnimation().getTargetValue(), t6)) {
                return;
            }
            updateAnimation$default(this, t5, false, 2, null);
        }

        public final void updateTargetValue$animation_core_release(T t5, @l FiniteAnimationSpec<T> finiteAnimationSpec) {
            if (!l0.g(getTargetValue(), t5) || getNeedsReset()) {
                setTargetValue(t5);
                setAnimationSpec(finiteAnimationSpec);
                updateAnimation$default(this, null, !isFinished$animation_core_release(), 1, null);
                setFinished$animation_core_release(false);
                setOffsetTimeNanos(Transition.this.getPlayTimeNanos());
                setNeedsReset(false);
            }
        }
    }

    @a1
    public Transition(@l TransitionState<S> transitionState, @m String str) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        MutableState mutableStateOf$default3;
        MutableState mutableStateOf$default4;
        this.transitionState = transitionState;
        this.label = str;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(getCurrentState(), null, 2, null);
        this.targetState$delegate = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new SegmentImpl(getCurrentState(), getCurrentState()), null, 2, null);
        this.segment$delegate = mutableStateOf$default2;
        this.playTimeNanos$delegate = SnapshotLongStateKt.mutableLongStateOf(0L);
        this.startTimeNanos$delegate = SnapshotLongStateKt.mutableLongStateOf(Long.MIN_VALUE);
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        this.updateChildrenNeeded$delegate = mutableStateOf$default3;
        this._animations = SnapshotStateKt.mutableStateListOf();
        this._transitions = SnapshotStateKt.mutableStateListOf();
        mutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.isSeeking$delegate = mutableStateOf$default4;
        this.totalDurationNanos$delegate = SnapshotStateKt.derivedStateOf(new Transition$totalDurationNanos$2(this));
        transitionState.transitionConfigured$animation_core_release(this);
    }

    @InternalAnimationApi
    public static /* synthetic */ void getPlayTimeNanos$annotations() {
    }

    private final long getStartTimeNanos() {
        return this.startTimeNanos$delegate.getLongValue();
    }

    @InternalAnimationApi
    public static /* synthetic */ void isSeeking$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onChildAnimationUpdated() {
        setUpdateChildrenNeeded$animation_core_release(true);
        if (isSeeking()) {
            SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList = this._animations;
            int size = snapshotStateList.size();
            long j5 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                Transition<S>.TransitionAnimationState<?, ?> transitionAnimationState = snapshotStateList.get(i5);
                j5 = Math.max(j5, transitionAnimationState.getDurationNanos$animation_core_release());
                transitionAnimationState.seekTo$animation_core_release(this.lastSeekedTimeNanos);
            }
            setUpdateChildrenNeeded$animation_core_release(false);
        }
    }

    private final void setSegment(Segment<S> segment) {
        this.segment$delegate.setValue(segment);
    }

    private final void setStartTimeNanos(long j5) {
        this.startTimeNanos$delegate.setLongValue(j5);
    }

    public final boolean addAnimation$animation_core_release(@l Transition<S>.TransitionAnimationState<?, ?> transitionAnimationState) {
        return this._animations.add(transitionAnimationState);
    }

    public final boolean addTransition$animation_core_release(@l Transition<?> transition) {
        return this._transitions.add(transition);
    }

    @Composable
    public final void animateTo$animation_core_release(S s5, @m Composer composer, int i5) {
        int i6;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(-1493585151);
        if ((i5 & 14) == 0) {
            if (startRestartGroup.changed(s5)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i6 = i8 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 112) == 0) {
            if (startRestartGroup.changed(this)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i6 |= i7;
        }
        if ((i6 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1493585151, i6, -1, "androidx.compose.animation.core.Transition.animateTo (Transition.kt:639)");
            }
            if (!isSeeking()) {
                updateTarget$animation_core_release(s5, startRestartGroup, (i6 & 14) | (i6 & 112));
                if (!l0.g(s5, getCurrentState()) || isRunning() || getUpdateChildrenNeeded$animation_core_release()) {
                    startRestartGroup.startReplaceableGroup(1951115890);
                    boolean changed = startRestartGroup.changed(this);
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new Transition$animateTo$1$1(this, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(this, (p<? super s0, ? super kotlin.coroutines.d<? super r2>, ? extends Object>) rememberedValue, startRestartGroup, ((i6 >> 3) & 14) | 64);
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Transition$animateTo$2(this, s5, i5));
        }
    }

    @l
    public final List<Transition<S>.TransitionAnimationState<?, ?>> getAnimations() {
        return this._animations;
    }

    public final S getCurrentState() {
        return this.transitionState.getCurrentState();
    }

    @m
    public final String getLabel() {
        return this.label;
    }

    public final long getLastSeekedTimeNanos$animation_core_release() {
        return this.lastSeekedTimeNanos;
    }

    public final long getPlayTimeNanos() {
        return this.playTimeNanos$delegate.getLongValue();
    }

    @l
    public final Segment<S> getSegment() {
        return (Segment) this.segment$delegate.getValue();
    }

    public final S getTargetState() {
        return (S) this.targetState$delegate.getValue();
    }

    public final long getTotalDurationNanos() {
        return ((Number) this.totalDurationNanos$delegate.getValue()).longValue();
    }

    @l
    public final List<Transition<?>> getTransitions() {
        return this._transitions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getUpdateChildrenNeeded$animation_core_release() {
        return ((Boolean) this.updateChildrenNeeded$delegate.getValue()).booleanValue();
    }

    public final boolean isRunning() {
        return getStartTimeNanos() != Long.MIN_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isSeeking() {
        return ((Boolean) this.isSeeking$delegate.getValue()).booleanValue();
    }

    public final void onFrame$animation_core_release(long j5, float f5) {
        if (getStartTimeNanos() == Long.MIN_VALUE) {
            onTransitionStart$animation_core_release(j5);
        }
        setUpdateChildrenNeeded$animation_core_release(false);
        setPlayTimeNanos(j5 - getStartTimeNanos());
        SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        boolean z4 = true;
        for (int i5 = 0; i5 < size; i5++) {
            Transition<S>.TransitionAnimationState<?, ?> transitionAnimationState = snapshotStateList.get(i5);
            if (!transitionAnimationState.isFinished$animation_core_release()) {
                transitionAnimationState.onPlayTimeChanged$animation_core_release(getPlayTimeNanos(), f5);
            }
            if (!transitionAnimationState.isFinished$animation_core_release()) {
                z4 = false;
            }
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i6 = 0; i6 < size2; i6++) {
            Transition<?> transition = snapshotStateList2.get(i6);
            if (!l0.g(transition.getTargetState(), transition.getCurrentState())) {
                transition.onFrame$animation_core_release(getPlayTimeNanos(), f5);
            }
            if (!l0.g(transition.getTargetState(), transition.getCurrentState())) {
                z4 = false;
            }
        }
        if (z4) {
            onTransitionEnd$animation_core_release();
        }
    }

    public final void onTransitionEnd$animation_core_release() {
        setStartTimeNanos(Long.MIN_VALUE);
        TransitionState<S> transitionState = this.transitionState;
        if (transitionState instanceof MutableTransitionState) {
            ((MutableTransitionState) transitionState).setCurrentState$animation_core_release(getTargetState());
        }
        setPlayTimeNanos(0L);
        this.transitionState.setRunning$animation_core_release(false);
    }

    public final void onTransitionStart$animation_core_release(long j5) {
        setStartTimeNanos(j5);
        this.transitionState.setRunning$animation_core_release(true);
    }

    public final void removeAnimation$animation_core_release(@l Transition<S>.TransitionAnimationState<?, ?> transitionAnimationState) {
        this._animations.remove(transitionAnimationState);
    }

    public final boolean removeTransition$animation_core_release(@l Transition<?> transition) {
        return this._transitions.remove(transition);
    }

    @u3.h(name = "seek")
    public final void seek(S s5, S s6, long j5) {
        setStartTimeNanos(Long.MIN_VALUE);
        this.transitionState.setRunning$animation_core_release(false);
        if (!isSeeking() || !l0.g(getCurrentState(), s5) || !l0.g(getTargetState(), s6)) {
            if (!l0.g(getCurrentState(), s5)) {
                TransitionState<S> transitionState = this.transitionState;
                if (transitionState instanceof MutableTransitionState) {
                    ((MutableTransitionState) transitionState).setCurrentState$animation_core_release(s5);
                }
            }
            setTargetState$animation_core_release(s6);
            setSeeking$animation_core_release(true);
            setSegment(new SegmentImpl(s5, s6));
        }
        SnapshotStateList<Transition<?>> snapshotStateList = this._transitions;
        int size = snapshotStateList.size();
        for (int i5 = 0; i5 < size; i5++) {
            Transition<?> transition = snapshotStateList.get(i5);
            l0.n(transition, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (transition.isSeeking()) {
                transition.seek(transition.getCurrentState(), transition.getTargetState(), j5);
            }
        }
        SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList2 = this._animations;
        int size2 = snapshotStateList2.size();
        for (int i6 = 0; i6 < size2; i6++) {
            snapshotStateList2.get(i6).seekTo$animation_core_release(j5);
        }
        this.lastSeekedTimeNanos = j5;
    }

    public final void setLastSeekedTimeNanos$animation_core_release(long j5) {
        this.lastSeekedTimeNanos = j5;
    }

    public final void setPlayTimeNanos(long j5) {
        this.playTimeNanos$delegate.setLongValue(j5);
    }

    public final void setSeeking$animation_core_release(boolean z4) {
        this.isSeeking$delegate.setValue(Boolean.valueOf(z4));
    }

    public final void setTargetState$animation_core_release(S s5) {
        this.targetState$delegate.setValue(s5);
    }

    public final void setUpdateChildrenNeeded$animation_core_release(boolean z4) {
        this.updateChildrenNeeded$delegate.setValue(Boolean.valueOf(z4));
    }

    @l
    public String toString() {
        List<Transition<S>.TransitionAnimationState<?, ?>> animations = getAnimations();
        int size = animations.size();
        String str = "Transition animation values: ";
        for (int i5 = 0; i5 < size; i5++) {
            str = str + animations.get(i5) + ", ";
        }
        return str;
    }

    @Composable
    public final void updateTarget$animation_core_release(S s5, @m Composer composer, int i5) {
        int i6;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(-583974681);
        if ((i5 & 14) == 0) {
            if (startRestartGroup.changed(s5)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i6 = i8 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 112) == 0) {
            if (startRestartGroup.changed(this)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i6 |= i7;
        }
        if ((i6 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-583974681, i6, -1, "androidx.compose.animation.core.Transition.updateTarget (Transition.kt:608)");
            }
            if (!isSeeking() && !l0.g(getTargetState(), s5)) {
                setSegment(new SegmentImpl(getTargetState(), s5));
                if (!l0.g(getCurrentState(), getTargetState())) {
                    TransitionState<S> transitionState = this.transitionState;
                    if (transitionState instanceof MutableTransitionState) {
                        ((MutableTransitionState) transitionState).setCurrentState$animation_core_release(getTargetState());
                    } else {
                        throw new IllegalStateException("Can only update the current state with MutableTransitionState".toString());
                    }
                }
                setTargetState$animation_core_release(s5);
                if (!isRunning()) {
                    setUpdateChildrenNeeded$animation_core_release(true);
                }
                SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList = this._animations;
                int size = snapshotStateList.size();
                for (int i9 = 0; i9 < size; i9++) {
                    snapshotStateList.get(i9).resetAnimation$animation_core_release();
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Transition$updateTarget$3(this, s5, i5));
        }
    }

    public final void removeAnimation$animation_core_release(@l Transition<S>.DeferredAnimation<?, ?> deferredAnimation) {
        Transition<S>.TransitionAnimationState<?, ?> animation;
        Transition<S>.DeferredAnimationData<?, V>.DeferredAnimationData<?, ?> data$animation_core_release = deferredAnimation.getData$animation_core_release();
        if (data$animation_core_release == null || (animation = data$animation_core_release.getAnimation()) == null) {
            return;
        }
        removeAnimation$animation_core_release(animation);
    }

    public /* synthetic */ Transition(TransitionState transitionState, String str, int i5, w wVar) {
        this(transitionState, (i5 & 2) != 0 ? null : str);
    }

    public Transition(S s5, @m String str) {
        this(new MutableTransitionState(s5), str);
    }

    public /* synthetic */ Transition(MutableTransitionState mutableTransitionState, String str, int i5, w wVar) {
        this(mutableTransitionState, (i5 & 2) != 0 ? null : str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @a1
    public Transition(@l MutableTransitionState<S> mutableTransitionState, @m String str) {
        this((TransitionState) mutableTransitionState, str);
        l0.n(mutableTransitionState, "null cannot be cast to non-null type androidx.compose.animation.core.TransitionState<S of androidx.compose.animation.core.Transition>");
    }
}
