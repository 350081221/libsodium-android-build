package androidx.compose.animation.core;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.j0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.k;
import kotlin.r2;
import kotlinx.coroutines.channels.o;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000t\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\f\u001aY\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\n2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001aR\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u0001\u001a\u00020\r2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001aR\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\n2\u0006\u0010\u0001\u001a\u00020\u00112\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00110\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001aR\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\n2\u0006\u0010\u0001\u001a\u00020\u00152\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00150\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0013\u001aO\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\n2\u0006\u0010\u0001\u001a\u00020\u00182\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00180\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001aO\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\n2\u0006\u0010\u0001\u001a\u00020\u001b2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001aR\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\n2\u0006\u0010\u0001\u001a\u00020\u001e2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0013\u001aR\u0010#\u001a\b\u0012\u0004\u0012\u00020!0\n2\u0006\u0010\u0001\u001a\u00020!2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020!0\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\"\u0010\u0013\u001a\u007f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010$\"\b\b\u0001\u0010&*\u00020%2\u0006\u0010\u0001\u001a\u00028\u00002\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010'2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b)\u0010*\u001aO\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\n2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00002\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u000b\u0010+\u001aH\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u0001\u001a\u00020\r2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b,\u0010-\u001aH\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\n2\u0006\u0010\u0001\u001a\u00020\u00112\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00110\u00022\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b.\u0010/\u001aH\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\n2\u0006\u0010\u0001\u001a\u00020\u00152\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00150\u00022\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b0\u0010/\u001aE\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\n2\u0006\u0010\u0001\u001a\u00020\u00182\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00180\u00022\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u0019\u00101\u001aE\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\n2\u0006\u0010\u0001\u001a\u00020\u001b2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00022\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u001c\u00102\u001aH\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\n2\u0006\u0010\u0001\u001a\u00020\u001e2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00022\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b3\u0010/\u001aH\u0010#\u001a\b\u0012\u0004\u0012\u00020!0\n2\u0006\u0010\u0001\u001a\u00020!2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020!0\u00022\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b4\u0010/\u001au\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010$\"\b\b\u0001\u0010&*\u00020%2\u0006\u0010\u0001\u001a\u00028\u00002\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010'2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00018\u00002\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b)\u00105\"\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\u0000068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108\"\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\r068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00108\"\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0011068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00108\"\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\u0015068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00108\"\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u0018068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00108\"\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u001b068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00108\"\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\u001e068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00108\"\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020!068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u00108\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006B²\u0006*\u0010@\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\"\u0004\b\u0000\u0010$\"\b\b\u0001\u0010&*\u00020%8\nX\u008a\u0084\u0002²\u0006\"\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010$\"\b\b\u0001\u0010&*\u00020%8\nX\u008a\u0084\u0002"}, d2 = {"", "targetValue", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "visibilityThreshold", "", TTDownloadField.TT_LABEL, "Lkotlin/Function1;", "Lkotlin/r2;", "finishedListener", "Landroidx/compose/runtime/State;", "animateFloatAsState", "(FLandroidx/compose/animation/core/AnimationSpec;FLjava/lang/String;Lv3/l;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "Landroidx/compose/ui/unit/Dp;", "animateDpAsState-AjpBEmI", "(FLandroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;Lv3/l;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateDpAsState", "Landroidx/compose/ui/geometry/Size;", "animateSizeAsState-YLp_XPw", "(JLandroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;Lv3/l;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateSizeAsState", "Landroidx/compose/ui/geometry/Offset;", "animateOffsetAsState-7362WCg", "animateOffsetAsState", "Landroidx/compose/ui/geometry/Rect;", "animateRectAsState", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;Lv3/l;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "", "animateIntAsState", "(ILandroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;Lv3/l;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "Landroidx/compose/ui/unit/IntOffset;", "animateIntOffsetAsState-HyPO7BM", "animateIntOffsetAsState", "Landroidx/compose/ui/unit/IntSize;", "animateIntSizeAsState-4goxYXU", "animateIntSizeAsState", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "animateValueAsState", "(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/Object;Ljava/lang/String;Lv3/l;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "(FLandroidx/compose/animation/core/AnimationSpec;FLv3/l;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateDpAsState-Kz89ssw", "(FLandroidx/compose/animation/core/AnimationSpec;Lv3/l;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateSizeAsState-LjSzlW0", "(JLandroidx/compose/animation/core/AnimationSpec;Lv3/l;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateOffsetAsState-N6fFfp4", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/animation/core/AnimationSpec;Lv3/l;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "(ILandroidx/compose/animation/core/AnimationSpec;Lv3/l;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateIntOffsetAsState-8f6pmRE", "animateIntSizeAsState-zTRF_AQ", "(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/Object;Lv3/l;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "Landroidx/compose/animation/core/SpringSpec;", "defaultAnimation", "Landroidx/compose/animation/core/SpringSpec;", "dpDefaultSpring", "sizeDefaultSpring", "offsetDefaultSpring", "rectDefaultSpring", "intDefaultSpring", "intOffsetDefaultSpring", "intSizeDefaultSpring", "listener", "animSpec", "animation-core_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nAnimateAsState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimateAsState.kt\nandroidx/compose/animation/core/AnimateAsStateKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,584:1\n36#2:585\n25#2:592\n25#2:599\n25#2:606\n25#2:613\n25#2:620\n1116#3,6:586\n1116#3,6:593\n1116#3,6:600\n1116#3,6:607\n1116#3,6:614\n1116#3,6:621\n81#4:627\n81#4:628\n*S KotlinDebug\n*F\n+ 1 AnimateAsState.kt\nandroidx/compose/animation/core/AnimateAsStateKt\n*L\n72#1:585\n394#1:592\n400#1:599\n401#1:606\n414#1:613\n573#1:620\n72#1:586,6\n394#1:593,6\n400#1:600,6\n401#1:607,6\n414#1:614,6\n573#1:621,6\n402#1:627\n403#1:628\n*E\n"})
/* loaded from: classes.dex */
public final class AnimateAsStateKt {

    @l
    private static final SpringSpec<Float> defaultAnimation = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);

    @l
    private static final SpringSpec<Dp> dpDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, Dp.m6042boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Dp.Companion)), 3, null);

    @l
    private static final SpringSpec<Size> sizeDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, Size.m3550boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Size.Companion)), 3, null);

    @l
    private static final SpringSpec<Offset> offsetDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, Offset.m3482boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Offset.Companion)), 3, null);

    @l
    private static final SpringSpec<Rect> rectDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, VisibilityThresholdsKt.getVisibilityThreshold(Rect.Companion), 3, null);

    @l
    private static final SpringSpec<Integer> intDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, Integer.valueOf(VisibilityThresholdsKt.getVisibilityThreshold(j0.f19410a)), 3, null);

    @l
    private static final SpringSpec<IntOffset> intOffsetDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m6163boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 3, null);

    @l
    private static final SpringSpec<IntSize> intSizeDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, IntSize.m6206boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 3, null);

    @l
    @Composable
    /* renamed from: animateDpAsState-AjpBEmI, reason: not valid java name */
    public static final State<Dp> m108animateDpAsStateAjpBEmI(float f5, @m AnimationSpec<Dp> animationSpec, @m String str, @m v3.l<? super Dp, r2> lVar, @m Composer composer, int i5, int i6) {
        AnimationSpec<Dp> animationSpec2;
        String str2;
        v3.l<? super Dp, r2> lVar2;
        composer.startReplaceableGroup(-1407150062);
        if ((i6 & 2) != 0) {
            animationSpec2 = dpDefaultSpring;
        } else {
            animationSpec2 = animationSpec;
        }
        if ((i6 & 4) != 0) {
            str2 = "DpAnimation";
        } else {
            str2 = str;
        }
        if ((i6 & 8) != 0) {
            lVar2 = null;
        } else {
            lVar2 = lVar;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1407150062, i5, -1, "androidx.compose.animation.core.animateDpAsState (AnimateAsState.kt:113)");
        }
        int i7 = i5 << 6;
        State<Dp> animateValueAsState = animateValueAsState(Dp.m6042boximpl(f5), VectorConvertersKt.getVectorConverter(Dp.Companion), animationSpec2, null, str2, lVar2, composer, (i5 & 14) | ((i5 << 3) & 896) | (57344 & i7) | (i7 & 458752), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    @Composable
    @k(level = kotlin.m.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    /* renamed from: animateDpAsState-Kz89ssw, reason: not valid java name */
    public static final /* synthetic */ State m109animateDpAsStateKz89ssw(float f5, AnimationSpec animationSpec, v3.l lVar, Composer composer, int i5, int i6) {
        composer.startReplaceableGroup(704104481);
        if ((i6 & 2) != 0) {
            animationSpec = dpDefaultSpring;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i6 & 4) != 0) {
            lVar = null;
        }
        v3.l lVar2 = lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(704104481, i5, -1, "androidx.compose.animation.core.animateDpAsState (AnimateAsState.kt:462)");
        }
        State animateValueAsState = animateValueAsState(Dp.m6042boximpl(f5), VectorConvertersKt.getVectorConverter(Dp.Companion), animationSpec2, null, null, lVar2, composer, (i5 & 14) | ((i5 << 3) & 896) | ((i5 << 9) & 458752), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    @l
    @Composable
    public static final State<Float> animateFloatAsState(float f5, @m AnimationSpec<Float> animationSpec, float f6, @m String str, @m v3.l<? super Float, r2> lVar, @m Composer composer, int i5, int i6) {
        composer.startReplaceableGroup(668842840);
        AnimationSpec<Float> animationSpec2 = (i6 & 2) != 0 ? defaultAnimation : animationSpec;
        float f7 = (i6 & 4) != 0 ? 0.01f : f6;
        String str2 = (i6 & 8) != 0 ? "FloatAnimation" : str;
        v3.l<? super Float, r2> lVar2 = (i6 & 16) != 0 ? null : lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(668842840, i5, -1, "androidx.compose.animation.core.animateFloatAsState (AnimateAsState.kt:68)");
        }
        composer.startReplaceableGroup(841393662);
        if (animationSpec2 == defaultAnimation) {
            Float valueOf = Float.valueOf(f7);
            composer.startReplaceableGroup(1157296644);
            boolean changed = composer.changed(valueOf);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = AnimationSpecKt.spring$default(0.0f, 0.0f, Float.valueOf(f7), 3, null);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            animationSpec2 = (AnimationSpec) rememberedValue;
        }
        composer.endReplaceableGroup();
        int i7 = i5 << 3;
        State<Float> animateValueAsState = animateValueAsState(Float.valueOf(f5), VectorConvertersKt.getVectorConverter(a0.f19382a), animationSpec2, Float.valueOf(f7), str2, lVar2, composer, (i7 & 7168) | (i5 & 14) | (57344 & i7) | (i7 & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    @l
    @Composable
    public static final State<Integer> animateIntAsState(int i5, @m AnimationSpec<Integer> animationSpec, @m String str, @m v3.l<? super Integer, r2> lVar, @m Composer composer, int i6, int i7) {
        composer.startReplaceableGroup(428074472);
        AnimationSpec<Integer> animationSpec2 = (i7 & 2) != 0 ? intDefaultSpring : animationSpec;
        String str2 = (i7 & 4) != 0 ? "IntAnimation" : str;
        v3.l<? super Integer, r2> lVar2 = (i7 & 8) != 0 ? null : lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(428074472, i6, -1, "androidx.compose.animation.core.animateIntAsState (AnimateAsState.kt:273)");
        }
        int i8 = i6 << 6;
        State<Integer> animateValueAsState = animateValueAsState(Integer.valueOf(i5), VectorConvertersKt.getVectorConverter(j0.f19410a), animationSpec2, null, str2, lVar2, composer, (i6 & 14) | ((i6 << 3) & 896) | (57344 & i8) | (i8 & 458752), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    @Composable
    @k(level = kotlin.m.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    /* renamed from: animateIntOffsetAsState-8f6pmRE, reason: not valid java name */
    public static final /* synthetic */ State m110animateIntOffsetAsState8f6pmRE(long j5, AnimationSpec animationSpec, v3.l lVar, Composer composer, int i5, int i6) {
        AnimationSpec animationSpec2;
        v3.l lVar2;
        composer.startReplaceableGroup(1010307371);
        if ((i6 & 2) != 0) {
            animationSpec2 = intOffsetDefaultSpring;
        } else {
            animationSpec2 = animationSpec;
        }
        if ((i6 & 4) != 0) {
            lVar2 = null;
        } else {
            lVar2 = lVar;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1010307371, i5, -1, "androidx.compose.animation.core.animateIntOffsetAsState (AnimateAsState.kt:543)");
        }
        State animateValueAsState = animateValueAsState(IntOffset.m6163boximpl(j5), VectorConvertersKt.getVectorConverter(IntOffset.Companion), animationSpec2, null, null, lVar2, composer, (i5 & 14) | ((i5 << 3) & 896) | ((i5 << 9) & 458752), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    @l
    @Composable
    /* renamed from: animateIntOffsetAsState-HyPO7BM, reason: not valid java name */
    public static final State<IntOffset> m111animateIntOffsetAsStateHyPO7BM(long j5, @m AnimationSpec<IntOffset> animationSpec, @m String str, @m v3.l<? super IntOffset, r2> lVar, @m Composer composer, int i5, int i6) {
        AnimationSpec<IntOffset> animationSpec2;
        String str2;
        v3.l<? super IntOffset, r2> lVar2;
        composer.startReplaceableGroup(-696782904);
        if ((i6 & 2) != 0) {
            animationSpec2 = intOffsetDefaultSpring;
        } else {
            animationSpec2 = animationSpec;
        }
        if ((i6 & 4) != 0) {
            str2 = "IntOffsetAnimation";
        } else {
            str2 = str;
        }
        if ((i6 & 8) != 0) {
            lVar2 = null;
        } else {
            lVar2 = lVar;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-696782904, i5, -1, "androidx.compose.animation.core.animateIntOffsetAsState (AnimateAsState.kt:313)");
        }
        int i7 = i5 << 6;
        State<IntOffset> animateValueAsState = animateValueAsState(IntOffset.m6163boximpl(j5), VectorConvertersKt.getVectorConverter(IntOffset.Companion), animationSpec2, null, str2, lVar2, composer, (i5 & 14) | ((i5 << 3) & 896) | (57344 & i7) | (i7 & 458752), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    @l
    @Composable
    /* renamed from: animateIntSizeAsState-4goxYXU, reason: not valid java name */
    public static final State<IntSize> m112animateIntSizeAsState4goxYXU(long j5, @m AnimationSpec<IntSize> animationSpec, @m String str, @m v3.l<? super IntSize, r2> lVar, @m Composer composer, int i5, int i6) {
        AnimationSpec<IntSize> animationSpec2;
        String str2;
        v3.l<? super IntSize, r2> lVar2;
        composer.startReplaceableGroup(582576328);
        if ((i6 & 2) != 0) {
            animationSpec2 = intSizeDefaultSpring;
        } else {
            animationSpec2 = animationSpec;
        }
        if ((i6 & 4) != 0) {
            str2 = "IntSizeAnimation";
        } else {
            str2 = str;
        }
        if ((i6 & 8) != 0) {
            lVar2 = null;
        } else {
            lVar2 = lVar;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(582576328, i5, -1, "androidx.compose.animation.core.animateIntSizeAsState (AnimateAsState.kt:351)");
        }
        int i7 = i5 << 6;
        State<IntSize> animateValueAsState = animateValueAsState(IntSize.m6206boximpl(j5), VectorConvertersKt.getVectorConverter(IntSize.Companion), animationSpec2, null, str2, lVar2, composer, (i5 & 14) | ((i5 << 3) & 896) | (57344 & i7) | (i7 & 458752), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    @Composable
    @k(level = kotlin.m.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    /* renamed from: animateIntSizeAsState-zTRF_AQ, reason: not valid java name */
    public static final /* synthetic */ State m113animateIntSizeAsStatezTRF_AQ(long j5, AnimationSpec animationSpec, v3.l lVar, Composer composer, int i5, int i6) {
        AnimationSpec animationSpec2;
        v3.l lVar2;
        composer.startReplaceableGroup(-1749239765);
        if ((i6 & 2) != 0) {
            animationSpec2 = intSizeDefaultSpring;
        } else {
            animationSpec2 = animationSpec;
        }
        if ((i6 & 4) != 0) {
            lVar2 = null;
        } else {
            lVar2 = lVar;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1749239765, i5, -1, "androidx.compose.animation.core.animateIntSizeAsState (AnimateAsState.kt:558)");
        }
        State animateValueAsState = animateValueAsState(IntSize.m6206boximpl(j5), VectorConvertersKt.getVectorConverter(IntSize.Companion), animationSpec2, null, null, lVar2, composer, (i5 & 14) | ((i5 << 3) & 896) | ((i5 << 9) & 458752), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    @l
    @Composable
    /* renamed from: animateOffsetAsState-7362WCg, reason: not valid java name */
    public static final State<Offset> m114animateOffsetAsState7362WCg(long j5, @m AnimationSpec<Offset> animationSpec, @m String str, @m v3.l<? super Offset, r2> lVar, @m Composer composer, int i5, int i6) {
        AnimationSpec<Offset> animationSpec2;
        String str2;
        v3.l<? super Offset, r2> lVar2;
        composer.startReplaceableGroup(357896800);
        if ((i6 & 2) != 0) {
            animationSpec2 = offsetDefaultSpring;
        } else {
            animationSpec2 = animationSpec;
        }
        if ((i6 & 4) != 0) {
            str2 = "OffsetAnimation";
        } else {
            str2 = str;
        }
        if ((i6 & 8) != 0) {
            lVar2 = null;
        } else {
            lVar2 = lVar;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(357896800, i5, -1, "androidx.compose.animation.core.animateOffsetAsState (AnimateAsState.kt:194)");
        }
        int i7 = i5 << 6;
        State<Offset> animateValueAsState = animateValueAsState(Offset.m3482boximpl(j5), VectorConvertersKt.getVectorConverter(Offset.Companion), animationSpec2, null, str2, lVar2, composer, (i5 & 14) | ((i5 << 3) & 896) | (57344 & i7) | (i7 & 458752), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    @Composable
    @k(level = kotlin.m.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    /* renamed from: animateOffsetAsState-N6fFfp4, reason: not valid java name */
    public static final /* synthetic */ State m115animateOffsetAsStateN6fFfp4(long j5, AnimationSpec animationSpec, v3.l lVar, Composer composer, int i5, int i6) {
        AnimationSpec animationSpec2;
        v3.l lVar2;
        composer.startReplaceableGroup(-456513133);
        if ((i6 & 2) != 0) {
            animationSpec2 = offsetDefaultSpring;
        } else {
            animationSpec2 = animationSpec;
        }
        if ((i6 & 4) != 0) {
            lVar2 = null;
        } else {
            lVar2 = lVar;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-456513133, i5, -1, "androidx.compose.animation.core.animateOffsetAsState (AnimateAsState.kt:498)");
        }
        State animateValueAsState = animateValueAsState(Offset.m3482boximpl(j5), VectorConvertersKt.getVectorConverter(Offset.Companion), animationSpec2, null, null, lVar2, composer, (i5 & 14) | ((i5 << 3) & 896) | ((i5 << 9) & 458752), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    @l
    @Composable
    public static final State<Rect> animateRectAsState(@l Rect rect, @m AnimationSpec<Rect> animationSpec, @m String str, @m v3.l<? super Rect, r2> lVar, @m Composer composer, int i5, int i6) {
        composer.startReplaceableGroup(536062978);
        AnimationSpec<Rect> animationSpec2 = (i6 & 2) != 0 ? rectDefaultSpring : animationSpec;
        String str2 = (i6 & 4) != 0 ? "RectAnimation" : str;
        v3.l<? super Rect, r2> lVar2 = (i6 & 8) != 0 ? null : lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(536062978, i5, -1, "androidx.compose.animation.core.animateRectAsState (AnimateAsState.kt:235)");
        }
        int i7 = i5 << 6;
        State<Rect> animateValueAsState = animateValueAsState(rect, VectorConvertersKt.getVectorConverter(Rect.Companion), animationSpec2, null, str2, lVar2, composer, (i5 & 14) | ((i5 << 3) & 896) | (57344 & i7) | (i7 & 458752), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    @Composable
    @k(level = kotlin.m.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    /* renamed from: animateSizeAsState-LjSzlW0, reason: not valid java name */
    public static final /* synthetic */ State m116animateSizeAsStateLjSzlW0(long j5, AnimationSpec animationSpec, v3.l lVar, Composer composer, int i5, int i6) {
        AnimationSpec animationSpec2;
        v3.l lVar2;
        composer.startReplaceableGroup(875212471);
        if ((i6 & 2) != 0) {
            animationSpec2 = sizeDefaultSpring;
        } else {
            animationSpec2 = animationSpec;
        }
        if ((i6 & 4) != 0) {
            lVar2 = null;
        } else {
            lVar2 = lVar;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(875212471, i5, -1, "androidx.compose.animation.core.animateSizeAsState (AnimateAsState.kt:480)");
        }
        State animateValueAsState = animateValueAsState(Size.m3550boximpl(j5), VectorConvertersKt.getVectorConverter(Size.Companion), animationSpec2, null, null, lVar2, composer, (i5 & 14) | ((i5 << 3) & 896) | ((i5 << 9) & 458752), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    @l
    @Composable
    /* renamed from: animateSizeAsState-YLp_XPw, reason: not valid java name */
    public static final State<Size> m117animateSizeAsStateYLp_XPw(long j5, @m AnimationSpec<Size> animationSpec, @m String str, @m v3.l<? super Size, r2> lVar, @m Composer composer, int i5, int i6) {
        AnimationSpec<Size> animationSpec2;
        String str2;
        v3.l<? super Size, r2> lVar2;
        composer.startReplaceableGroup(1374633148);
        if ((i6 & 2) != 0) {
            animationSpec2 = sizeDefaultSpring;
        } else {
            animationSpec2 = animationSpec;
        }
        if ((i6 & 4) != 0) {
            str2 = "SizeAnimation";
        } else {
            str2 = str;
        }
        if ((i6 & 8) != 0) {
            lVar2 = null;
        } else {
            lVar2 = lVar;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1374633148, i5, -1, "androidx.compose.animation.core.animateSizeAsState (AnimateAsState.kt:154)");
        }
        int i7 = i5 << 6;
        State<Size> animateValueAsState = animateValueAsState(Size.m3550boximpl(j5), VectorConvertersKt.getVectorConverter(Size.Companion), animationSpec2, null, str2, lVar2, composer, (i5 & 14) | ((i5 << 3) & 896) | (57344 & i7) | (i7 & 458752), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    @l
    @Composable
    public static final <T, V extends AnimationVector> State<T> animateValueAsState(T t5, @l TwoWayConverter<T, V> twoWayConverter, @m AnimationSpec<T> animationSpec, @m T t6, @m String str, @m v3.l<? super T, r2> lVar, @m Composer composer, int i5, int i6) {
        AnimationSpec<T> animationSpec2;
        composer.startReplaceableGroup(-1994373980);
        if ((i6 & 4) != 0) {
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            animationSpec2 = (AnimationSpec) rememberedValue;
        } else {
            animationSpec2 = animationSpec;
        }
        T t7 = (i6 & 8) != 0 ? null : t6;
        String str2 = (i6 & 16) != 0 ? "ValueAnimation" : str;
        v3.l<? super T, r2> lVar2 = (i6 & 32) != 0 ? null : lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1994373980, i5, -1, "androidx.compose.animation.core.animateValueAsState (AnimateAsState.kt:397)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue2 = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue2;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = new Animatable(t5, twoWayConverter, t7, str2);
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        Animatable animatable = (Animatable) rememberedValue3;
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(lVar2, composer, (i5 >> 15) & 14);
        if (t7 != null && (animationSpec2 instanceof SpringSpec)) {
            SpringSpec springSpec = (SpringSpec) animationSpec2;
            if (!l0.g(springSpec.getVisibilityThreshold(), t7)) {
                animationSpec2 = AnimationSpecKt.spring(springSpec.getDampingRatio(), springSpec.getStiffness(), t7);
            }
        }
        State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(animationSpec2, composer, 0);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue4 = composer.rememberedValue();
        if (rememberedValue4 == companion.getEmpty()) {
            rememberedValue4 = o.d(-1, null, null, 6, null);
            composer.updateRememberedValue(rememberedValue4);
        }
        composer.endReplaceableGroup();
        kotlinx.coroutines.channels.l lVar3 = (kotlinx.coroutines.channels.l) rememberedValue4;
        EffectsKt.SideEffect(new AnimateAsStateKt$animateValueAsState$2(lVar3, t5), composer, 0);
        EffectsKt.LaunchedEffect(lVar3, new AnimateAsStateKt$animateValueAsState$3(lVar3, animatable, rememberUpdatedState2, rememberUpdatedState, null), composer, 72);
        State<T> state = (State) mutableState.getValue();
        if (state == null) {
            state = animatable.asState();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> v3.l<T, r2> animateValueAsState$lambda$4(State<? extends v3.l<? super T, r2>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> AnimationSpec<T> animateValueAsState$lambda$6(State<? extends AnimationSpec<T>> state) {
        return state.getValue();
    }

    @Composable
    @k(level = kotlin.m.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    public static final /* synthetic */ State animateRectAsState(Rect rect, AnimationSpec animationSpec, v3.l lVar, Composer composer, int i5, int i6) {
        composer.startReplaceableGroup(-782613967);
        if ((i6 & 2) != 0) {
            animationSpec = rectDefaultSpring;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i6 & 4) != 0) {
            lVar = null;
        }
        v3.l lVar2 = lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-782613967, i5, -1, "androidx.compose.animation.core.animateRectAsState (AnimateAsState.kt:513)");
        }
        State animateValueAsState = animateValueAsState(rect, VectorConvertersKt.getVectorConverter(Rect.Companion), animationSpec2, null, null, lVar2, composer, (i5 & 14) | ((i5 << 3) & 896) | ((i5 << 9) & 458752), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    @Composable
    @k(level = kotlin.m.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    public static final /* synthetic */ State animateIntAsState(int i5, AnimationSpec animationSpec, v3.l lVar, Composer composer, int i6, int i7) {
        composer.startReplaceableGroup(-842612981);
        if ((i7 & 2) != 0) {
            animationSpec = intDefaultSpring;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i7 & 4) != 0) {
            lVar = null;
        }
        v3.l lVar2 = lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-842612981, i6, -1, "androidx.compose.animation.core.animateIntAsState (AnimateAsState.kt:528)");
        }
        State animateValueAsState = animateValueAsState(Integer.valueOf(i5), VectorConvertersKt.getVectorConverter(j0.f19410a), animationSpec2, null, null, lVar2, composer, (i6 & 14) | ((i6 << 3) & 896) | ((i6 << 9) & 458752), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    @Composable
    @k(level = kotlin.m.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    public static final /* synthetic */ State animateFloatAsState(float f5, AnimationSpec animationSpec, float f6, v3.l lVar, Composer composer, int i5, int i6) {
        composer.startReplaceableGroup(1091643291);
        if ((i6 & 2) != 0) {
            animationSpec = defaultAnimation;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i6 & 4) != 0) {
            f6 = 0.01f;
        }
        float f7 = f6;
        if ((i6 & 8) != 0) {
            lVar = null;
        }
        v3.l lVar2 = lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1091643291, i5, -1, "androidx.compose.animation.core.animateFloatAsState (AnimateAsState.kt:446)");
        }
        State<Float> animateFloatAsState = animateFloatAsState(f5, animationSpec2, f7, null, lVar2, composer, (i5 & 14) | (i5 & 112) | (i5 & 896) | ((i5 << 3) & 57344), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateFloatAsState;
    }

    @Composable
    @k(level = kotlin.m.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    public static final /* synthetic */ State animateValueAsState(Object obj, TwoWayConverter twoWayConverter, AnimationSpec animationSpec, Object obj2, v3.l lVar, Composer composer, int i5, int i6) {
        AnimationSpec animationSpec2;
        composer.startReplaceableGroup(-846382129);
        if ((i6 & 4) != 0) {
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            animationSpec2 = (AnimationSpec) rememberedValue;
        } else {
            animationSpec2 = animationSpec;
        }
        Object obj3 = (i6 & 8) != 0 ? null : obj2;
        v3.l lVar2 = (i6 & 16) != 0 ? null : lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-846382129, i5, -1, "androidx.compose.animation.core.animateValueAsState (AnimateAsState.kt:575)");
        }
        int i7 = i5 & 8;
        State animateValueAsState = animateValueAsState(obj, twoWayConverter, animationSpec2, obj3, "ValueAnimation", lVar2, composer, (i7 << 9) | i7 | 24576 | (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | ((i5 << 3) & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateValueAsState;
    }
}
