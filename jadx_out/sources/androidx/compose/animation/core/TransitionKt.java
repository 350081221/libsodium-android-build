package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.a1;
import kotlin.i0;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.j0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;
import v3.q;

@i0(d1 = {"\u0000\u0096\u0001\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a5\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\t\u0010\n\u001a5\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\f\u001ac\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0012R\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u0000\"\b\b\u0002\u0010\u000f*\u00020\u000e*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00102\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a^\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u00022&\u0010\u001a\u001a\"\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00028\u00010\u0015¢\u0006\u0002\b\u0019H\u0087\b¢\u0006\u0004\b\u001b\u0010\u001c\u001aC\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u001d\u001a\u00028\u00012\u0006\u0010\u0001\u001a\u00028\u00012\u0006\u0010\u001e\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u001f\u0010 \u001a¨\u0001\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00010'\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u0000\"\b\b\u0002\u0010\u000f*\u00020\u000e*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00102*\b\n\u0010$\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000!\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\"0\u0015¢\u0006\u0002\b\u0019¢\u0006\u0002\b#2\b\b\u0002\u0010\u0003\u001a\u00020\u00022&\u0010&\u001a\"\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(%\u0012\u0004\u0012\u00028\u00010\u0015¢\u0006\u0002\b\u0019H\u0087\b¢\u0006\u0004\b(\u0010)\u001ao\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00010'\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u0000\"\b\b\u0002\u0010\u000f*\u00020\u000e*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010*\u001a\u00028\u00012\u0006\u0010+\u001a\u00028\u00012\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00010\"2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b-\u0010.\u001a\u0084\u0001\u00100\u001a\b\u0012\u0004\u0012\u00020/0'\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00042*\b\n\u0010$\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000!\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\"0\u0015¢\u0006\u0002\b\u0019¢\u0006\u0002\b#2\b\b\u0002\u0010\u0003\u001a\u00020\u00022&\u0010&\u001a\"\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020/0\u0015¢\u0006\u0002\b\u0019H\u0087\b¢\u0006\u0004\b0\u00101\u001a\u0084\u0001\u00103\u001a\b\u0012\u0004\u0012\u0002020'\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00042*\b\n\u0010$\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000!\u0012\n\u0012\b\u0012\u0004\u0012\u0002020\"0\u0015¢\u0006\u0002\b\u0019¢\u0006\u0002\b#2\b\b\u0002\u0010\u0003\u001a\u00020\u00022&\u0010&\u001a\"\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(%\u0012\u0004\u0012\u0002020\u0015¢\u0006\u0002\b\u0019H\u0087\b¢\u0006\u0004\b3\u00101\u001a\u0084\u0001\u00105\u001a\b\u0012\u0004\u0012\u0002040'\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00042*\b\n\u0010$\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000!\u0012\n\u0012\b\u0012\u0004\u0012\u0002040\"0\u0015¢\u0006\u0002\b\u0019¢\u0006\u0002\b#2\b\b\u0002\u0010\u0003\u001a\u00020\u00022&\u0010&\u001a\"\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(%\u0012\u0004\u0012\u0002040\u0015¢\u0006\u0002\b\u0019H\u0087\b¢\u0006\u0004\b5\u00101\u001a\u0084\u0001\u00107\u001a\b\u0012\u0004\u0012\u0002060'\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00042*\b\n\u0010$\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000!\u0012\n\u0012\b\u0012\u0004\u0012\u0002060\"0\u0015¢\u0006\u0002\b\u0019¢\u0006\u0002\b#2\b\b\u0002\u0010\u0003\u001a\u00020\u00022&\u0010&\u001a\"\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(%\u0012\u0004\u0012\u0002060\u0015¢\u0006\u0002\b\u0019H\u0087\b¢\u0006\u0004\b7\u00101\u001a\u0084\u0001\u00109\u001a\b\u0012\u0004\u0012\u0002080'\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00042*\b\n\u0010$\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000!\u0012\n\u0012\b\u0012\u0004\u0012\u0002080\"0\u0015¢\u0006\u0002\b\u0019¢\u0006\u0002\b#2\b\b\u0002\u0010\u0003\u001a\u00020\u00022&\u0010&\u001a\"\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(%\u0012\u0004\u0012\u0002080\u0015¢\u0006\u0002\b\u0019H\u0087\b¢\u0006\u0004\b9\u00101\u001a\u0084\u0001\u0010;\u001a\b\u0012\u0004\u0012\u00020:0'\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00042*\b\n\u0010$\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000!\u0012\n\u0012\b\u0012\u0004\u0012\u00020:0\"0\u0015¢\u0006\u0002\b\u0019¢\u0006\u0002\b#2\b\b\u0002\u0010\u0003\u001a\u00020\u00022&\u0010&\u001a\"\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020:0\u0015¢\u0006\u0002\b\u0019H\u0087\b¢\u0006\u0004\b;\u00101\u001a\u0084\u0001\u0010=\u001a\b\u0012\u0004\u0012\u00020<0'\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00042*\b\n\u0010$\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000!\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0\"0\u0015¢\u0006\u0002\b\u0019¢\u0006\u0002\b#2\b\b\u0002\u0010\u0003\u001a\u00020\u00022&\u0010&\u001a\"\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020<0\u0015¢\u0006\u0002\b\u0019H\u0087\b¢\u0006\u0004\b=\u00101\u001a\u0084\u0001\u0010?\u001a\b\u0012\u0004\u0012\u00020>0'\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00042*\b\n\u0010$\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000!\u0012\n\u0012\b\u0012\u0004\u0012\u00020>0\"0\u0015¢\u0006\u0002\b\u0019¢\u0006\u0002\b#2\b\b\u0002\u0010\u0003\u001a\u00020\u00022&\u0010&\u001a\"\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020>0\u0015¢\u0006\u0002\b\u0019H\u0087\b¢\u0006\u0004\b?\u00101\"\u0014\u0010@\u001a\u00020:8\u0000X\u0080T¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006B"}, d2 = {"T", "targetState", "", TTDownloadField.TT_LABEL, "Landroidx/compose/animation/core/Transition;", "updateTransition", "(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/core/TransitionState;", "transitionState", "rememberTransition", "(Landroidx/compose/animation/core/TransitionState;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/core/MutableTransitionState;", "(Landroidx/compose/animation/core/MutableTransitionState;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;", "S", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "createDeferredAnimation", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition$DeferredAnimation;", "Lkotlin/Function1;", "Lkotlin/v0;", "name", "parentState", "Landroidx/compose/runtime/Composable;", "transformToChildState", "createChildTransition", "(Landroidx/compose/animation/core/Transition;Ljava/lang/String;Lv3/q;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;", "initialState", "childLabel", "createChildTransitionInternal", "(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Lkotlin/u;", "transitionSpec", "state", "targetValueByState", "Landroidx/compose/runtime/State;", "animateValue", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/TwoWayConverter;Lv3/q;Ljava/lang/String;Lv3/q;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "initialValue", "targetValue", "animationSpec", "createTransitionAnimation", "(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "", "animateFloat", "(Landroidx/compose/animation/core/Transition;Lv3/q;Ljava/lang/String;Lv3/q;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "Landroidx/compose/ui/unit/Dp;", "animateDp", "Landroidx/compose/ui/geometry/Offset;", "animateOffset", "Landroidx/compose/ui/geometry/Size;", "animateSize", "Landroidx/compose/ui/unit/IntOffset;", "animateIntOffset", "", "animateInt", "Landroidx/compose/ui/unit/IntSize;", "animateIntSize", "Landroidx/compose/ui/geometry/Rect;", "animateRect", "AnimationDebugDurationScale", "I", "animation-core_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1382:1\n1083#1,5:1449\n1083#1,5:1454\n1083#1,5:1459\n1083#1,5:1464\n1083#1,5:1469\n1083#1,5:1474\n1083#1,5:1479\n1083#1,5:1484\n25#2:1383\n36#2:1396\n36#2:1409\n36#2:1416\n36#2:1423\n36#2:1436\n1116#3,6:1384\n1116#3,6:1390\n1116#3,6:1397\n1116#3,6:1403\n1116#3,6:1410\n1116#3,6:1417\n1116#3,6:1424\n1116#3,6:1430\n1116#3,6:1437\n1116#3,6:1443\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n*L\n1166#1:1449,5\n1197#1:1454,5\n1228#1:1459,5\n1259#1:1464,5\n1290#1:1469,5\n1321#1:1474,5\n1351#1:1479,5\n1381#1:1484,5\n75#1:1383\n318#1:1396\n978#1:1409\n1011#1:1416\n1024#1:1423\n1099#1:1436\n75#1:1384,6\n77#1:1390,6\n318#1:1397,6\n322#1:1403,6\n978#1:1410,6\n1011#1:1417,6\n1024#1:1424,6\n1028#1:1430,6\n1099#1:1437,6\n1122#1:1443,6\n*E\n"})
/* loaded from: classes.dex */
public final class TransitionKt {
    public static final int AnimationDebugDurationScale = 1;

    @l
    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final <S> State<Dp> animateDp(@l Transition<S> transition, @m q<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Dp>> qVar, @m String str, @l q<? super S, ? super Composer, ? super Integer, Dp> qVar2, @m Composer composer, int i5, int i6) {
        composer.startReplaceableGroup(184732935);
        if ((i6 & 1) != 0) {
            qVar = TransitionKt$animateDp$1.INSTANCE;
        }
        if ((i6 & 2) != 0) {
            str = "DpAnimation";
        }
        String str2 = str;
        TwoWayConverter<Dp, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(Dp.Companion);
        int i7 = i5 & 14;
        int i8 = i5 << 3;
        int i9 = i7 | (i8 & 896) | (i8 & 7168) | (i8 & 57344);
        composer.startReplaceableGroup(-142660079);
        int i10 = (i9 >> 9) & 112;
        State<Dp> createTransitionAnimation = createTransitionAnimation(transition, qVar2.invoke(transition.getCurrentState(), composer, Integer.valueOf(i10)), qVar2.invoke(transition.getTargetState(), composer, Integer.valueOf(i10)), qVar.invoke(transition.getSegment(), composer, Integer.valueOf((i9 >> 3) & 112)), vectorConverter, str2, composer, (i9 & 14) | ((i9 << 9) & 57344) | ((i9 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return createTransitionAnimation;
    }

    @l
    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final <S> State<Float> animateFloat(@l Transition<S> transition, @m q<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Float>> qVar, @m String str, @l q<? super S, ? super Composer, ? super Integer, Float> qVar2, @m Composer composer, int i5, int i6) {
        composer.startReplaceableGroup(-1338768149);
        if ((i6 & 1) != 0) {
            qVar = TransitionKt$animateFloat$1.INSTANCE;
        }
        if ((i6 & 2) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(a0.f19382a);
        int i7 = i5 & 14;
        int i8 = i5 << 3;
        int i9 = i7 | (i8 & 896) | (i8 & 7168) | (i8 & 57344);
        composer.startReplaceableGroup(-142660079);
        int i10 = (i9 >> 9) & 112;
        State<Float> createTransitionAnimation = createTransitionAnimation(transition, qVar2.invoke(transition.getCurrentState(), composer, Integer.valueOf(i10)), qVar2.invoke(transition.getTargetState(), composer, Integer.valueOf(i10)), qVar.invoke(transition.getSegment(), composer, Integer.valueOf((i9 >> 3) & 112)), vectorConverter, str2, composer, (i9 & 14) | ((i9 << 9) & 57344) | ((i9 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return createTransitionAnimation;
    }

    @l
    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final <S> State<Integer> animateInt(@l Transition<S> transition, @m q<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Integer>> qVar, @m String str, @l q<? super S, ? super Composer, ? super Integer, Integer> qVar2, @m Composer composer, int i5, int i6) {
        composer.startReplaceableGroup(1318902782);
        if ((i6 & 1) != 0) {
            qVar = TransitionKt$animateInt$1.INSTANCE;
        }
        if ((i6 & 2) != 0) {
            str = "IntAnimation";
        }
        String str2 = str;
        TwoWayConverter<Integer, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(j0.f19410a);
        int i7 = i5 & 14;
        int i8 = i5 << 3;
        int i9 = i7 | (i8 & 896) | (i8 & 7168) | (i8 & 57344);
        composer.startReplaceableGroup(-142660079);
        int i10 = (i9 >> 9) & 112;
        State<Integer> createTransitionAnimation = createTransitionAnimation(transition, qVar2.invoke(transition.getCurrentState(), composer, Integer.valueOf(i10)), qVar2.invoke(transition.getTargetState(), composer, Integer.valueOf(i10)), qVar.invoke(transition.getSegment(), composer, Integer.valueOf((i9 >> 3) & 112)), vectorConverter, str2, composer, (i9 & 14) | ((i9 << 9) & 57344) | ((i9 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return createTransitionAnimation;
    }

    @l
    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final <S> State<IntOffset> animateIntOffset(@l Transition<S> transition, @m q<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<IntOffset>> qVar, @m String str, @l q<? super S, ? super Composer, ? super Integer, IntOffset> qVar2, @m Composer composer, int i5, int i6) {
        composer.startReplaceableGroup(776131825);
        if ((i6 & 1) != 0) {
            qVar = TransitionKt$animateIntOffset$1.INSTANCE;
        }
        if ((i6 & 2) != 0) {
            str = "IntOffsetAnimation";
        }
        String str2 = str;
        TwoWayConverter<IntOffset, AnimationVector2D> vectorConverter = VectorConvertersKt.getVectorConverter(IntOffset.Companion);
        int i7 = i5 & 14;
        int i8 = i5 << 3;
        int i9 = i7 | (i8 & 896) | (i8 & 7168) | (i8 & 57344);
        composer.startReplaceableGroup(-142660079);
        int i10 = (i9 >> 9) & 112;
        State<IntOffset> createTransitionAnimation = createTransitionAnimation(transition, qVar2.invoke(transition.getCurrentState(), composer, Integer.valueOf(i10)), qVar2.invoke(transition.getTargetState(), composer, Integer.valueOf(i10)), qVar.invoke(transition.getSegment(), composer, Integer.valueOf((i9 >> 3) & 112)), vectorConverter, str2, composer, (i9 & 14) | ((i9 << 9) & 57344) | ((i9 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return createTransitionAnimation;
    }

    @l
    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final <S> State<IntSize> animateIntSize(@l Transition<S> transition, @m q<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<IntSize>> qVar, @m String str, @l q<? super S, ? super Composer, ? super Integer, IntSize> qVar2, @m Composer composer, int i5, int i6) {
        composer.startReplaceableGroup(-2104123233);
        if ((i6 & 1) != 0) {
            qVar = TransitionKt$animateIntSize$1.INSTANCE;
        }
        if ((i6 & 2) != 0) {
            str = "IntSizeAnimation";
        }
        String str2 = str;
        TwoWayConverter<IntSize, AnimationVector2D> vectorConverter = VectorConvertersKt.getVectorConverter(IntSize.Companion);
        int i7 = i5 & 14;
        int i8 = i5 << 3;
        int i9 = i7 | (i8 & 896) | (i8 & 7168) | (i8 & 57344);
        composer.startReplaceableGroup(-142660079);
        int i10 = (i9 >> 9) & 112;
        State<IntSize> createTransitionAnimation = createTransitionAnimation(transition, qVar2.invoke(transition.getCurrentState(), composer, Integer.valueOf(i10)), qVar2.invoke(transition.getTargetState(), composer, Integer.valueOf(i10)), qVar.invoke(transition.getSegment(), composer, Integer.valueOf((i9 >> 3) & 112)), vectorConverter, str2, composer, (i9 & 14) | ((i9 << 9) & 57344) | ((i9 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return createTransitionAnimation;
    }

    @l
    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final <S> State<Offset> animateOffset(@l Transition<S> transition, @m q<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Offset>> qVar, @m String str, @l q<? super S, ? super Composer, ? super Integer, Offset> qVar2, @m Composer composer, int i5, int i6) {
        composer.startReplaceableGroup(2078477582);
        if ((i6 & 1) != 0) {
            qVar = TransitionKt$animateOffset$1.INSTANCE;
        }
        if ((i6 & 2) != 0) {
            str = "OffsetAnimation";
        }
        String str2 = str;
        TwoWayConverter<Offset, AnimationVector2D> vectorConverter = VectorConvertersKt.getVectorConverter(Offset.Companion);
        int i7 = i5 & 14;
        int i8 = i5 << 3;
        int i9 = i7 | (i8 & 896) | (i8 & 7168) | (i8 & 57344);
        composer.startReplaceableGroup(-142660079);
        int i10 = (i9 >> 9) & 112;
        State<Offset> createTransitionAnimation = createTransitionAnimation(transition, qVar2.invoke(transition.getCurrentState(), composer, Integer.valueOf(i10)), qVar2.invoke(transition.getTargetState(), composer, Integer.valueOf(i10)), qVar.invoke(transition.getSegment(), composer, Integer.valueOf((i9 >> 3) & 112)), vectorConverter, str2, composer, (i9 & 14) | ((i9 << 9) & 57344) | ((i9 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return createTransitionAnimation;
    }

    @l
    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final <S> State<Rect> animateRect(@l Transition<S> transition, @m q<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Rect>> qVar, @m String str, @l q<? super S, ? super Composer, ? super Integer, Rect> qVar2, @m Composer composer, int i5, int i6) {
        composer.startReplaceableGroup(1496278239);
        if ((i6 & 1) != 0) {
            qVar = TransitionKt$animateRect$1.INSTANCE;
        }
        if ((i6 & 2) != 0) {
            str = "RectAnimation";
        }
        String str2 = str;
        TwoWayConverter<Rect, AnimationVector4D> vectorConverter = VectorConvertersKt.getVectorConverter(Rect.Companion);
        int i7 = i5 & 14;
        int i8 = i5 << 3;
        int i9 = i7 | (i8 & 896) | (i8 & 7168) | (i8 & 57344);
        composer.startReplaceableGroup(-142660079);
        int i10 = (i9 >> 9) & 112;
        State<Rect> createTransitionAnimation = createTransitionAnimation(transition, qVar2.invoke(transition.getCurrentState(), composer, Integer.valueOf(i10)), qVar2.invoke(transition.getTargetState(), composer, Integer.valueOf(i10)), qVar.invoke(transition.getSegment(), composer, Integer.valueOf((i9 >> 3) & 112)), vectorConverter, str2, composer, (i9 & 14) | ((i9 << 9) & 57344) | ((i9 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return createTransitionAnimation;
    }

    @l
    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final <S> State<Size> animateSize(@l Transition<S> transition, @m q<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Size>> qVar, @m String str, @l q<? super S, ? super Composer, ? super Integer, Size> qVar2, @m Composer composer, int i5, int i6) {
        composer.startReplaceableGroup(-802210820);
        if ((i6 & 1) != 0) {
            qVar = TransitionKt$animateSize$1.INSTANCE;
        }
        if ((i6 & 2) != 0) {
            str = "SizeAnimation";
        }
        String str2 = str;
        TwoWayConverter<Size, AnimationVector2D> vectorConverter = VectorConvertersKt.getVectorConverter(Size.Companion);
        int i7 = i5 & 14;
        int i8 = i5 << 3;
        int i9 = i7 | (i8 & 896) | (i8 & 7168) | (i8 & 57344);
        composer.startReplaceableGroup(-142660079);
        int i10 = (i9 >> 9) & 112;
        State<Size> createTransitionAnimation = createTransitionAnimation(transition, qVar2.invoke(transition.getCurrentState(), composer, Integer.valueOf(i10)), qVar2.invoke(transition.getTargetState(), composer, Integer.valueOf(i10)), qVar.invoke(transition.getSegment(), composer, Integer.valueOf((i9 >> 3) & 112)), vectorConverter, str2, composer, (i9 & 14) | ((i9 << 9) & 57344) | ((i9 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return createTransitionAnimation;
    }

    @l
    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final <S, T, V extends AnimationVector> State<T> animateValue(@l Transition<S> transition, @l TwoWayConverter<T, V> twoWayConverter, @m q<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<T>> qVar, @m String str, @l q<? super S, ? super Composer, ? super Integer, ? extends T> qVar2, @m Composer composer, int i5, int i6) {
        composer.startReplaceableGroup(-142660079);
        if ((i6 & 2) != 0) {
            qVar = TransitionKt$animateValue$1.INSTANCE;
        }
        if ((i6 & 4) != 0) {
            str = "ValueAnimation";
        }
        int i7 = (i5 >> 9) & 112;
        State<T> createTransitionAnimation = createTransitionAnimation(transition, qVar2.invoke(transition.getCurrentState(), composer, Integer.valueOf(i7)), qVar2.invoke(transition.getTargetState(), composer, Integer.valueOf(i7)), qVar.invoke(transition.getSegment(), composer, Integer.valueOf((i5 >> 3) & 112)), twoWayConverter, str, composer, (i5 & 14) | (57344 & (i5 << 9)) | ((i5 << 6) & 458752));
        composer.endReplaceableGroup();
        return createTransitionAnimation;
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    @l
    @ExperimentalTransitionApi
    @Composable
    public static final <S, T> Transition<T> createChildTransition(@l Transition<S> transition, @m String str, @l q<? super S, ? super Composer, ? super Integer, ? extends T> qVar, @m Composer composer, int i5, int i6) {
        composer.startReplaceableGroup(1215497572);
        if ((i6 & 1) != 0) {
            str = "ChildTransition";
        }
        String str2 = str;
        int i7 = i5 & 14;
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(transition);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = transition.getCurrentState();
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        if (transition.isSeeking()) {
            rememberedValue = transition.getCurrentState();
        }
        int i8 = (i5 >> 3) & 112;
        Transition<T> createChildTransitionInternal = createChildTransitionInternal(transition, qVar.invoke(rememberedValue, composer, Integer.valueOf(i8)), qVar.invoke(transition.getTargetState(), composer, Integer.valueOf(i8)), str2, composer, i7 | ((i5 << 6) & 7168));
        composer.endReplaceableGroup();
        return createChildTransitionInternal;
    }

    @l
    @Composable
    @a1
    public static final <S, T> Transition<T> createChildTransitionInternal(@l Transition<S> transition, T t5, T t6, @l String str, @m Composer composer, int i5) {
        composer.startReplaceableGroup(-198307638);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-198307638, i5, -1, "androidx.compose.animation.core.createChildTransitionInternal (Transition.kt:1022)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(transition);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new Transition(new MutableTransitionState(t5), transition.getLabel() + " > " + str);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Transition<T> transition2 = (Transition) rememberedValue;
        composer.startReplaceableGroup(1951131101);
        boolean changed2 = composer.changed(transition) | composer.changed(transition2);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new TransitionKt$createChildTransitionInternal$1$1(transition, transition2);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        EffectsKt.DisposableEffect(transition2, (v3.l<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue2, composer, 0);
        if (transition.isSeeking()) {
            transition2.seek(t5, t6, transition.getLastSeekedTimeNanos$animation_core_release());
        } else {
            transition2.updateTarget$animation_core_release(t6, composer, ((i5 >> 3) & 8) | ((i5 >> 6) & 14));
            transition2.setSeeking$animation_core_release(false);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return transition2;
    }

    @l
    @Composable
    @InternalAnimationApi
    public static final <S, T, V extends AnimationVector> Transition<S>.DeferredAnimation<T, V> createDeferredAnimation(@l Transition<S> transition, @l TwoWayConverter<T, V> twoWayConverter, @m String str, @m Composer composer, int i5, int i6) {
        composer.startReplaceableGroup(-1714122528);
        if ((i6 & 2) != 0) {
            str = "DeferredAnimation";
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1714122528, i5, -1, "androidx.compose.animation.core.createDeferredAnimation (Transition.kt:976)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(transition);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new Transition.DeferredAnimation(twoWayConverter, str);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Transition<S>.DeferredAnimation<T, V> deferredAnimation = (Transition.DeferredAnimation) rememberedValue;
        EffectsKt.DisposableEffect(deferredAnimation, new TransitionKt$createDeferredAnimation$1(transition, deferredAnimation), composer, 0);
        if (transition.isSeeking()) {
            deferredAnimation.setupSeeking$animation_core_release();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return deferredAnimation;
    }

    @l
    @Composable
    @a1
    public static final <S, T, V extends AnimationVector> State<T> createTransitionAnimation(@l Transition<S> transition, T t5, T t6, @l FiniteAnimationSpec<T> finiteAnimationSpec, @l TwoWayConverter<T, V> twoWayConverter, @l String str, @m Composer composer, int i5) {
        composer.startReplaceableGroup(-304821198);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-304821198, i5, -1, "androidx.compose.animation.core.createTransitionAnimation (Transition.kt:1097)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(transition);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new Transition.TransitionAnimationState(t5, AnimationStateKt.createZeroVectorFrom(twoWayConverter, t6), twoWayConverter, str);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Transition.TransitionAnimationState transitionAnimationState = (Transition.TransitionAnimationState) rememberedValue;
        if (transition.isSeeking()) {
            transitionAnimationState.updateInitialAndTargetValue$animation_core_release(t5, t6, finiteAnimationSpec);
        } else {
            transitionAnimationState.updateTargetValue$animation_core_release(t6, finiteAnimationSpec);
        }
        composer.startReplaceableGroup(1951134899);
        boolean changed2 = composer.changed(transition) | composer.changed(transitionAnimationState);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new TransitionKt$createTransitionAnimation$1$1(transition, transitionAnimationState);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        EffectsKt.DisposableEffect(transitionAnimationState, (v3.l<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return transitionAnimationState;
    }

    @l
    @ExperimentalTransitionApi
    @Composable
    public static final <T> Transition<T> rememberTransition(@l TransitionState<T> transitionState, @m String str, @m Composer composer, int i5, int i6) {
        composer.startReplaceableGroup(1643203617);
        if ((i6 & 2) != 0) {
            str = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1643203617, i5, -1, "androidx.compose.animation.core.rememberTransition (Transition.kt:316)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(transitionState);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new Transition((TransitionState) transitionState, str);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Transition<T> transition = (Transition) rememberedValue;
        transition.animateTo$animation_core_release(transitionState.getTargetState(), composer, 0);
        composer.startReplaceableGroup(1951103416);
        boolean changed2 = composer.changed(transition);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new TransitionKt$rememberTransition$1$1(transition);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        EffectsKt.DisposableEffect(transition, (v3.l<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return transition;
    }

    @l
    @Composable
    public static final <T> Transition<T> updateTransition(T t5, @m String str, @m Composer composer, int i5, int i6) {
        composer.startReplaceableGroup(2029166765);
        if ((i6 & 2) != 0) {
            str = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2029166765, i5, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:73)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = new Transition(t5, str);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Transition<T> transition = (Transition) rememberedValue;
        transition.animateTo$animation_core_release(t5, composer, (i5 & 8) | 48 | (i5 & 14));
        composer.startReplaceableGroup(1951093734);
        boolean changed = composer.changed(transition);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new TransitionKt$updateTransition$1$1(transition);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        EffectsKt.DisposableEffect(transition, (v3.l<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue2, composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return transition;
    }

    @l
    @Composable
    public static final <T> Transition<T> updateTransition(@l MutableTransitionState<T> mutableTransitionState, @m String str, @m Composer composer, int i5, int i6) {
        composer.startReplaceableGroup(882913843);
        if ((i6 & 2) != 0) {
            str = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(882913843, i5, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:355)");
        }
        Transition<T> rememberTransition = rememberTransition(mutableTransitionState, str, composer, (i5 & 112) | (i5 & 14), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberTransition;
    }
}
