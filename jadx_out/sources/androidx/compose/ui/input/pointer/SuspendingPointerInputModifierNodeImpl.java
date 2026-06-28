package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.IntSize;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.d;
import kotlin.coroutines.f;
import kotlin.coroutines.g;
import kotlin.coroutines.i;
import kotlin.coroutines.intrinsics.c;
import kotlin.coroutines.jvm.internal.h;
import kotlin.d1;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import kotlinx.coroutines.k;
import kotlinx.coroutines.l2;
import kotlinx.coroutines.q;
import kotlinx.coroutines.u0;
import p4.l;
import p4.m;
import v3.p;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001LB0\u0012'\u0010\"\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001a¢\u0006\u0002\b\u001e¢\u0006\u0004\bK\u0010'J-\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u001a\u0010\n\u001a\u0016\u0012\f\u0012\n\u0012\u0002\b\u00030\bR\u00020\u0000\u0012\u0004\u0012\u00020\t0\u0007H\u0082\bJ\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u000f\u001a\u00020\tH\u0016J\b\u0010\u0010\u001a\u00020\tH\u0016J\b\u0010\u0011\u001a\u00020\tH\u0016J\b\u0010\u0012\u001a\u00020\tH\u0016J*\u0010\u0017\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0018\u001a\u00020\tH\u0016J?\u0010\u001f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00192'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001a¢\u0006\u0002\b\u001eH\u0096@¢\u0006\u0004\b\u001f\u0010 Rl\u0010\"\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001a¢\u0006\u0002\b\u001e2'\u0010!\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001a¢\u0006\u0002\b\u001e8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\"\u0010.\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u00030\bR\u00020\u00000-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\"\u00100\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u00030\bR\u00020\u00000-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010/R\u0018\u00101\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010,R\u001c\u00102\u001a\u00020\u00138\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b2\u00103R\"\u00105\u001a\u0002048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0014\u0010>\u001a\u00020;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010@\u001a\u00020;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010=R\u0014\u0010D\u001a\u00020A8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u001a\u0010G\u001a\u00020\u00138VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bE\u0010FR\u001a\u0010J\u001a\u00020H8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bI\u0010F\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006M"}, d2 = {"Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Lkotlin/Function1;", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine;", "Lkotlin/r2;", "block", "forEachCurrentPointerHandler", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerEvent", "dispatchPointerEvent", "onDetach", "onDensityChange", "onViewConfigurationChange", "resetPointerInputHandler", "Landroidx/compose/ui/unit/IntSize;", "bounds", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onPointerEvent", "onCancelPointerInput", "R", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "awaitPointerEventScope", "(Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", t0.b.f22420d, "pointerInputHandler", "Lv3/p;", "getPointerInputHandler", "()Lv3/p;", "setPointerInputHandler", "(Lv3/p;)V", "Lkotlinx/coroutines/l2;", "pointerInputJob", "Lkotlinx/coroutines/l2;", "currentEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "Landroidx/compose/runtime/collection/MutableVector;", "pointerHandlers", "Landroidx/compose/runtime/collection/MutableVector;", "dispatchingPointerHandlers", "lastPointerEvent", "boundsSize", "J", "", "interceptOutOfBoundsChildEvents", "Z", "getInterceptOutOfBoundsChildEvents", "()Z", "setInterceptOutOfBoundsChildEvents", "(Z)V", "", "getDensity", "()F", "density", "getFontScale", "fontScale", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "getSize-YbymL2g", "()J", "size", "Landroidx/compose/ui/geometry/Size;", "getExtendedTouchPadding-NH-jbRc", "extendedTouchPadding", "<init>", "PointerEventHandlerCoroutine", "ui_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nSuspendingPointerInputFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 JvmActuals.jvm.kt\nandroidx/compose/ui/platform/JvmActuals_jvmKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,775:1\n519#1:806\n520#1:808\n522#1,4:810\n528#1:825\n531#1,3:837\n1208#2:776\n1187#2,2:777\n1208#2:779\n1187#2,2:780\n35#3:782\n35#3:807\n35#3:879\n146#4:783\n460#4,11:784\n492#4,11:795\n146#4:809\n460#4,11:814\n492#4,11:826\n728#4,2:880\n86#5,2:840\n33#5,6:842\n88#5:848\n86#5,2:849\n33#5,6:851\n88#5:857\n416#5,3:858\n33#5,4:861\n419#5:865\n420#5:867\n38#5:868\n421#5:869\n1#6:866\n314#7,9:870\n323#7,2:882\n*S KotlinDebug\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl\n*L\n543#1:806\n543#1:808\n543#1:810,4\n543#1:825\n543#1:837,3\n435#1:776\n435#1:777,2\n444#1:779\n444#1:780,2\n519#1:782\n543#1:807\n611#1:879\n520#1:783\n525#1:784,11\n528#1:795,11\n543#1:809\n543#1:814,11\n543#1:826,11\n612#1:880,2\n569#1:840,2\n569#1:842,6\n569#1:848\n579#1:849,2\n579#1:851,6\n579#1:857\n582#1:858,3\n582#1:861,4\n582#1:865\n582#1:867\n582#1:868\n582#1:869\n582#1:866\n609#1:870,9\n609#1:882,2\n*E\n"})
/* loaded from: classes.dex */
public final class SuspendingPointerInputModifierNodeImpl extends Modifier.Node implements SuspendingPointerInputModifierNode, PointerInputScope, Density {
    public static final int $stable = 0;
    private long boundsSize;

    @l
    private PointerEvent currentEvent;

    @l
    private final MutableVector<PointerEventHandlerCoroutine<?>> dispatchingPointerHandlers;
    private boolean interceptOutOfBoundsChildEvents;

    @m
    private PointerEvent lastPointerEvent;

    @l
    private final MutableVector<PointerEventHandlerCoroutine<?>> pointerHandlers;

    @l
    private p<? super PointerInputScope, ? super d<? super r2>, ? extends Object> pointerInputHandler;

    @m
    private l2 pointerInputJob;

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u0015\u0012\f\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b]\u0010^J\u0017\u0010\t\u001a\u00020\u0006*\u00020\u0005H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u0006*\u00020\nH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u0005*\u00020\nH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u00020\u0005*\u00020\u0010H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u000f\u001a\u00020\u0005*\u00020\u0006H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0013J\u0017\u0010\u0018\u001a\u00020\u0015*\u00020\u0014H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u0010*\u00020\u0005H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0012J\u0017\u0010\u001a\u001a\u00020\u0010*\u00020\nH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u000eJ\r\u0010\u001e\u001a\u00020\u001d*\u00020\u001cH\u0097\u0001J\u0017\u0010 \u001a\u00020\u0014*\u00020\u0015H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0017J\u0017\u0010#\u001a\u00020\n*\u00020\u0005H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u001a\u0010#\u001a\u00020\n*\u00020\u0010H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b$\u0010\"J\u001a\u0010#\u001a\u00020\n*\u00020\u0006H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u0016\u0010+\u001a\u00020*2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(J\u0010\u0010.\u001a\u00020*2\b\u0010-\u001a\u0004\u0018\u00010,J\u001d\u00101\u001a\u00020*2\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000/H\u0016¢\u0006\u0004\b1\u00102J\u0018\u00103\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0096@¢\u0006\u0004\b3\u00104JI\u0010<\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0001\u001052\u0006\u00107\u001a\u0002062'\u0010;\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010908¢\u0006\u0002\b:H\u0096@¢\u0006\u0004\b<\u0010=JG\u0010>\u001a\u00028\u0001\"\u0004\b\u0001\u001052\u0006\u00107\u001a\u0002062'\u0010;\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010908¢\u0006\u0002\b:H\u0096@¢\u0006\u0004\b>\u0010=R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001e\u0010B\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010D\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u001a\u0010G\u001a\u00020F8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0014\u0010M\u001a\u00020\u00108\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0014\u0010O\u001a\u00020\u00108\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bN\u0010LR\u0014\u0010R\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u001a\u0010V\u001a\u00020S8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0014\u0010Z\u001a\u00020W8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010YR\u001a\u0010\\\u001a\u00020\u00148VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b[\u0010U\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006_"}, d2 = {"Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine;", "R", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/unit/Density;", "Lkotlin/coroutines/d;", "Landroidx/compose/ui/unit/Dp;", "", "roundToPx-0680j_4", "(F)I", "roundToPx", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp-GaN1DYA", "(J)F", "toDp", "", "toDp-u2uoSUM", "(F)F", "(I)F", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/unit/DpSize;", "toDpSize-k-rfVVM", "(J)J", "toDpSize", "toPx-0680j_4", "toPx", "toPx--R2X_6o", "Landroidx/compose/ui/unit/DpRect;", "Landroidx/compose/ui/geometry/Rect;", "toRect", "toSize-XkaWNTQ", "toSize", "toSp-0xMU5do", "(F)J", "toSp", "toSp-kPz2Gy4", "(I)J", "Landroidx/compose/ui/input/pointer/PointerEvent;", NotificationCompat.CATEGORY_EVENT, "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Lkotlin/r2;", "offerPointerEvent", "", "cause", "cancel", "Lkotlin/d1;", "result", "resumeWith", "(Ljava/lang/Object;)V", "awaitPointerEvent", "(Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/d;)Ljava/lang/Object;", "T", "", "timeMillis", "Lkotlin/Function2;", "", "Lkotlin/u;", "block", "withTimeoutOrNull", "(JLv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "withTimeout", "completion", "Lkotlin/coroutines/d;", "Lkotlinx/coroutines/p;", "pointerAwaiter", "Lkotlinx/coroutines/p;", "awaitPass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "Lkotlin/coroutines/g;", "getContext", "()Lkotlin/coroutines/g;", "getDensity", "()F", "density", "getFontScale", "fontScale", "getCurrentEvent", "()Landroidx/compose/ui/input/pointer/PointerEvent;", "currentEvent", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "()J", "size", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "getExtendedTouchPadding-NH-jbRc", "extendedTouchPadding", "<init>", "(Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl;Lkotlin/coroutines/d;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nSuspendingPointerInputFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine\n+ 2 JvmActuals.jvm.kt\nandroidx/compose/ui/platform/JvmActuals_jvmKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,775:1\n35#2:776\n735#3,2:777\n314#4,11:779\n*S KotlinDebug\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine\n*L\n681#1:776\n682#1:777,2\n689#1:779,11\n*E\n"})
    /* loaded from: classes.dex */
    public final class PointerEventHandlerCoroutine<R> implements AwaitPointerEventScope, Density, d<R> {
        private final /* synthetic */ SuspendingPointerInputModifierNodeImpl $$delegate_0;

        @l
        private final d<R> completion;

        @m
        private kotlinx.coroutines.p<? super PointerEvent> pointerAwaiter;

        @l
        private PointerEventPass awaitPass = PointerEventPass.Main;

        @l
        private final g context = i.INSTANCE;

        /* JADX WARN: Multi-variable type inference failed */
        public PointerEventHandlerCoroutine(@l d<? super R> dVar) {
            this.completion = dVar;
            this.$$delegate_0 = SuspendingPointerInputModifierNodeImpl.this;
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        @m
        public Object awaitPointerEvent(@l PointerEventPass pointerEventPass, @l d<? super PointerEvent> dVar) {
            d e5;
            Object l5;
            e5 = c.e(dVar);
            q qVar = new q(e5, 1);
            qVar.B();
            this.awaitPass = pointerEventPass;
            this.pointerAwaiter = qVar;
            Object E = qVar.E();
            l5 = kotlin.coroutines.intrinsics.d.l();
            if (E == l5) {
                h.c(dVar);
            }
            return E;
        }

        public final void cancel(@m Throwable th) {
            kotlinx.coroutines.p<? super PointerEvent> pVar = this.pointerAwaiter;
            if (pVar != null) {
                pVar.a(th);
            }
            this.pointerAwaiter = null;
        }

        @Override // kotlin.coroutines.d
        @l
        public g getContext() {
            return this.context;
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        @l
        public PointerEvent getCurrentEvent() {
            return SuspendingPointerInputModifierNodeImpl.this.currentEvent;
        }

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            return this.$$delegate_0.getDensity();
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        /* renamed from: getExtendedTouchPadding-NH-jbRc */
        public long mo4783getExtendedTouchPaddingNHjbRc() {
            return SuspendingPointerInputModifierNodeImpl.this.mo295getExtendedTouchPaddingNHjbRc();
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public float getFontScale() {
            return this.$$delegate_0.getFontScale();
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        /* renamed from: getSize-YbymL2g */
        public long mo4784getSizeYbymL2g() {
            return SuspendingPointerInputModifierNodeImpl.this.boundsSize;
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        @l
        public ViewConfiguration getViewConfiguration() {
            return SuspendingPointerInputModifierNodeImpl.this.getViewConfiguration();
        }

        public final void offerPointerEvent(@l PointerEvent pointerEvent, @l PointerEventPass pointerEventPass) {
            kotlinx.coroutines.p<? super PointerEvent> pVar;
            if (pointerEventPass == this.awaitPass && (pVar = this.pointerAwaiter) != null) {
                this.pointerAwaiter = null;
                d1.a aVar = d1.Companion;
                pVar.resumeWith(d1.m6444constructorimpl(pointerEvent));
            }
        }

        @Override // kotlin.coroutines.d
        public void resumeWith(@l Object obj) {
            MutableVector mutableVector = SuspendingPointerInputModifierNodeImpl.this.pointerHandlers;
            SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = SuspendingPointerInputModifierNodeImpl.this;
            synchronized (mutableVector) {
                suspendingPointerInputModifierNodeImpl.pointerHandlers.remove(this);
                r2 r2Var = r2.f19517a;
            }
            this.completion.resumeWith(obj);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: roundToPx--R2X_6o */
        public int mo297roundToPxR2X_6o(long j5) {
            return this.$$delegate_0.mo297roundToPxR2X_6o(j5);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: roundToPx-0680j_4 */
        public int mo298roundToPx0680j_4(float f5) {
            return this.$$delegate_0.mo298roundToPx0680j_4(f5);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        @Stable
        /* renamed from: toDp-GaN1DYA */
        public float mo299toDpGaN1DYA(long j5) {
            return this.$$delegate_0.mo299toDpGaN1DYA(j5);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: toDp-u2uoSUM */
        public float mo300toDpu2uoSUM(float f5) {
            return this.$$delegate_0.mo300toDpu2uoSUM(f5);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: toDp-u2uoSUM */
        public float mo301toDpu2uoSUM(int i5) {
            return this.$$delegate_0.mo301toDpu2uoSUM(i5);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: toDpSize-k-rfVVM */
        public long mo302toDpSizekrfVVM(long j5) {
            return this.$$delegate_0.mo302toDpSizekrfVVM(j5);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: toPx--R2X_6o */
        public float mo303toPxR2X_6o(long j5) {
            return this.$$delegate_0.mo303toPxR2X_6o(j5);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: toPx-0680j_4 */
        public float mo304toPx0680j_4(float f5) {
            return this.$$delegate_0.mo304toPx0680j_4(f5);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        @l
        public Rect toRect(@l DpRect dpRect) {
            return this.$$delegate_0.toRect(dpRect);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: toSize-XkaWNTQ */
        public long mo305toSizeXkaWNTQ(long j5) {
            return this.$$delegate_0.mo305toSizeXkaWNTQ(j5);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        @Stable
        /* renamed from: toSp-0xMU5do */
        public long mo306toSp0xMU5do(float f5) {
            return this.$$delegate_0.mo306toSp0xMU5do(f5);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: toSp-kPz2Gy4 */
        public long mo307toSpkPz2Gy4(float f5) {
            return this.$$delegate_0.mo307toSpkPz2Gy4(f5);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: toSp-kPz2Gy4 */
        public long mo308toSpkPz2Gy4(int i5) {
            return this.$$delegate_0.mo308toSpkPz2Gy4(i5);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
        /* JADX WARN: Type inference failed for: r11v0, types: [long] */
        /* JADX WARN: Type inference failed for: r11v1, types: [kotlinx.coroutines.l2] */
        /* JADX WARN: Type inference failed for: r11v3, types: [kotlinx.coroutines.l2] */
        /* JADX WARN: Type inference failed for: r11v7 */
        /* JADX WARN: Type inference failed for: r11v8 */
        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public <T> java.lang.Object withTimeout(long r11, @p4.l v3.p<? super androidx.compose.ui.input.pointer.AwaitPointerEventScope, ? super kotlin.coroutines.d<? super T>, ? extends java.lang.Object> r13, @p4.l kotlin.coroutines.d<? super T> r14) {
            /*
                r10 = this;
                boolean r0 = r14 instanceof androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1
                if (r0 == 0) goto L13
                r0 = r14
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1 r0 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1 r0 = new androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1
                r0.<init>(r10, r14)
            L18:
                java.lang.Object r14 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r11 = r0.L$0
                kotlinx.coroutines.l2 r11 = (kotlinx.coroutines.l2) r11
                kotlin.e1.n(r14)     // Catch: java.lang.Throwable -> L2d
                goto L75
            L2d:
                r12 = move-exception
                goto L7b
            L2f:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L37:
                kotlin.e1.n(r14)
                r4 = 0
                int r14 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r14 > 0) goto L56
                kotlinx.coroutines.p<? super androidx.compose.ui.input.pointer.PointerEvent> r14 = r10.pointerAwaiter
                if (r14 == 0) goto L56
                kotlin.d1$a r2 = kotlin.d1.Companion
                androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r2 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
                r2.<init>(r11)
                java.lang.Object r2 = kotlin.e1.a(r2)
                java.lang.Object r2 = kotlin.d1.m6444constructorimpl(r2)
                r14.resumeWith(r2)
            L56:
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl r14 = androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.this
                kotlinx.coroutines.s0 r4 = r14.getCoroutineScope()
                r5 = 0
                r6 = 0
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1 r7 = new androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1
                r14 = 0
                r7.<init>(r11, r10, r14)
                r8 = 3
                r9 = 0
                kotlinx.coroutines.l2 r11 = kotlinx.coroutines.i.e(r4, r5, r6, r7, r8, r9)
                r0.L$0 = r11     // Catch: java.lang.Throwable -> L2d
                r0.label = r3     // Catch: java.lang.Throwable -> L2d
                java.lang.Object r14 = r13.invoke(r10, r0)     // Catch: java.lang.Throwable -> L2d
                if (r14 != r1) goto L75
                return r1
            L75:
                androidx.compose.ui.input.pointer.CancelTimeoutCancellationException r12 = androidx.compose.ui.input.pointer.CancelTimeoutCancellationException.INSTANCE
                r11.cancel(r12)
                return r14
            L7b:
                androidx.compose.ui.input.pointer.CancelTimeoutCancellationException r13 = androidx.compose.ui.input.pointer.CancelTimeoutCancellationException.INSTANCE
                r11.cancel(r13)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine.withTimeout(long, v3.p, kotlin.coroutines.d):java.lang.Object");
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public <T> java.lang.Object withTimeoutOrNull(long r5, @p4.l v3.p<? super androidx.compose.ui.input.pointer.AwaitPointerEventScope, ? super kotlin.coroutines.d<? super T>, ? extends java.lang.Object> r7, @p4.l kotlin.coroutines.d<? super T> r8) {
            /*
                r4 = this;
                boolean r0 = r8 instanceof androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1
                if (r0 == 0) goto L13
                r0 = r8
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1 r0 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1 r0 = new androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1
                r0.<init>(r4, r8)
            L18:
                java.lang.Object r8 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.e1.n(r8)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3d
                goto L3e
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                kotlin.e1.n(r8)
                r0.label = r3     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3d
                java.lang.Object r8 = r4.withTimeout(r5, r7, r0)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3d
                if (r8 != r1) goto L3e
                return r1
            L3d:
                r8 = 0
            L3e:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine.withTimeoutOrNull(long, v3.p, kotlin.coroutines.d):java.lang.Object");
        }
    }

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PointerEventPass.values().length];
            try {
                iArr[PointerEventPass.Initial.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PointerEventPass.Final.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PointerEventPass.Main.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SuspendingPointerInputModifierNodeImpl(@l p<? super PointerInputScope, ? super d<? super r2>, ? extends Object> pVar) {
        PointerEvent pointerEvent;
        this.pointerInputHandler = pVar;
        pointerEvent = SuspendingPointerInputFilterKt.EmptyPointerEvent;
        this.currentEvent = pointerEvent;
        this.pointerHandlers = new MutableVector<>(new PointerEventHandlerCoroutine[16], 0);
        this.dispatchingPointerHandlers = new MutableVector<>(new PointerEventHandlerCoroutine[16], 0);
        this.boundsSize = IntSize.Companion.m6219getZeroYbymL2g();
    }

    private final void dispatchPointerEvent(PointerEvent pointerEvent, PointerEventPass pointerEventPass) {
        MutableVector<PointerEventHandlerCoroutine<?>> mutableVector;
        int size;
        synchronized (this.pointerHandlers) {
            MutableVector<PointerEventHandlerCoroutine<?>> mutableVector2 = this.dispatchingPointerHandlers;
            mutableVector2.addAll(mutableVector2.getSize(), this.pointerHandlers);
        }
        try {
            int i5 = WhenMappings.$EnumSwitchMapping$0[pointerEventPass.ordinal()];
            if (i5 != 1 && i5 != 2) {
                if (i5 == 3 && (size = (mutableVector = this.dispatchingPointerHandlers).getSize()) > 0) {
                    int i6 = size - 1;
                    PointerEventHandlerCoroutine<?>[] content = mutableVector.getContent();
                    do {
                        content[i6].offerPointerEvent(pointerEvent, pointerEventPass);
                        i6--;
                    } while (i6 >= 0);
                }
            } else {
                MutableVector<PointerEventHandlerCoroutine<?>> mutableVector3 = this.dispatchingPointerHandlers;
                int size2 = mutableVector3.getSize();
                if (size2 > 0) {
                    PointerEventHandlerCoroutine<?>[] content2 = mutableVector3.getContent();
                    int i7 = 0;
                    do {
                        content2[i7].offerPointerEvent(pointerEvent, pointerEventPass);
                        i7++;
                    } while (i7 < size2);
                }
            }
        } finally {
            this.dispatchingPointerHandlers.clear();
        }
    }

    private final void forEachCurrentPointerHandler(PointerEventPass pointerEventPass, v3.l<? super PointerEventHandlerCoroutine<?>, r2> lVar) {
        MutableVector<PointerEventHandlerCoroutine<?>> mutableVector;
        int size;
        synchronized (this.pointerHandlers) {
            try {
                MutableVector<PointerEventHandlerCoroutine<?>> mutableVector2 = this.dispatchingPointerHandlers;
                mutableVector2.addAll(mutableVector2.getSize(), this.pointerHandlers);
                kotlin.jvm.internal.i0.d(1);
            } catch (Throwable th) {
                kotlin.jvm.internal.i0.d(1);
                kotlin.jvm.internal.i0.c(1);
                throw th;
            }
        }
        kotlin.jvm.internal.i0.c(1);
        try {
            int i5 = WhenMappings.$EnumSwitchMapping$0[pointerEventPass.ordinal()];
            if (i5 != 1 && i5 != 2) {
                if (i5 == 3 && (size = (mutableVector = this.dispatchingPointerHandlers).getSize()) > 0) {
                    int i6 = size - 1;
                    PointerEventHandlerCoroutine<?>[] content = mutableVector.getContent();
                    do {
                        lVar.invoke(content[i6]);
                        i6--;
                    } while (i6 >= 0);
                }
            } else {
                MutableVector<PointerEventHandlerCoroutine<?>> mutableVector3 = this.dispatchingPointerHandlers;
                int size2 = mutableVector3.getSize();
                if (size2 > 0) {
                    PointerEventHandlerCoroutine<?>[] content2 = mutableVector3.getContent();
                    int i7 = 0;
                    do {
                        lVar.invoke(content2[i7]);
                        i7++;
                    } while (i7 < size2);
                }
            }
        } finally {
            kotlin.jvm.internal.i0.d(1);
            this.dispatchingPointerHandlers.clear();
            kotlin.jvm.internal.i0.c(1);
        }
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    @m
    public <R> Object awaitPointerEventScope(@l p<? super AwaitPointerEventScope, ? super d<? super R>, ? extends Object> pVar, @l d<? super R> dVar) {
        d e5;
        Object l5;
        e5 = c.e(dVar);
        q qVar = new q(e5, 1);
        qVar.B();
        PointerEventHandlerCoroutine pointerEventHandlerCoroutine = new PointerEventHandlerCoroutine(qVar);
        synchronized (this.pointerHandlers) {
            this.pointerHandlers.add(pointerEventHandlerCoroutine);
            d<r2> c5 = f.c(pVar, pointerEventHandlerCoroutine, pointerEventHandlerCoroutine);
            d1.a aVar = d1.Companion;
            c5.resumeWith(d1.m6444constructorimpl(r2.f19517a));
        }
        qVar.g(new SuspendingPointerInputModifierNodeImpl$awaitPointerEventScope$2$2(pointerEventHandlerCoroutine));
        Object E = qVar.E();
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (E == l5) {
            h.c(dVar);
        }
        return E;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return DelegatableNodeKt.requireLayoutNode(this).getDensity().getDensity();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    /* renamed from: getExtendedTouchPadding-NH-jbRc */
    public long mo295getExtendedTouchPaddingNHjbRc() {
        long mo305toSizeXkaWNTQ = mo305toSizeXkaWNTQ(getViewConfiguration().mo5131getMinimumTouchTargetSizeMYxV2XQ());
        long mo296getSizeYbymL2g = mo296getSizeYbymL2g();
        return SizeKt.Size(Math.max(0.0f, Size.m3562getWidthimpl(mo305toSizeXkaWNTQ) - IntSize.m6214getWidthimpl(mo296getSizeYbymL2g)) / 2.0f, Math.max(0.0f, Size.m3559getHeightimpl(mo305toSizeXkaWNTQ) - IntSize.m6213getHeightimpl(mo296getSizeYbymL2g)) / 2.0f);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return DelegatableNodeKt.requireLayoutNode(this).getDensity().getFontScale();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    public boolean getInterceptOutOfBoundsChildEvents() {
        return this.interceptOutOfBoundsChildEvents;
    }

    @Override // androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode
    @l
    public p<PointerInputScope, d<? super r2>, Object> getPointerInputHandler() {
        return this.pointerInputHandler;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    /* renamed from: getSize-YbymL2g */
    public long mo296getSizeYbymL2g() {
        return this.boundsSize;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    @l
    public ViewConfiguration getViewConfiguration() {
        return DelegatableNodeKt.requireLayoutNode(this).getViewConfiguration();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        boolean z4;
        PointerEvent pointerEvent = this.lastPointerEvent;
        if (pointerEvent == null) {
            return;
        }
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i5 = 0;
        while (true) {
            z4 = true;
            if (i5 >= size) {
                break;
            }
            if (!(true ^ changes.get(i5).getPressed())) {
                z4 = false;
                break;
            }
            i5++;
        }
        if (z4) {
            return;
        }
        List<PointerInputChange> changes2 = pointerEvent.getChanges();
        ArrayList arrayList = new ArrayList(changes2.size());
        int size2 = changes2.size();
        for (int i6 = 0; i6 < size2; i6++) {
            PointerInputChange pointerInputChange = changes2.get(i6);
            arrayList.add(new PointerInputChange(pointerInputChange.m4870getIdJ3iCeTQ(), pointerInputChange.getUptimeMillis(), pointerInputChange.m4872getPositionF1C5BW0(), false, pointerInputChange.getPressure(), pointerInputChange.getUptimeMillis(), pointerInputChange.m4872getPositionF1C5BW0(), pointerInputChange.getPressed(), pointerInputChange.getPressed(), 0, 0L, 1536, (w) null));
        }
        PointerEvent pointerEvent2 = new PointerEvent(arrayList);
        this.currentEvent = pointerEvent2;
        dispatchPointerEvent(pointerEvent2, PointerEventPass.Initial);
        dispatchPointerEvent(pointerEvent2, PointerEventPass.Main);
        dispatchPointerEvent(pointerEvent2, PointerEventPass.Final);
        this.lastPointerEvent = null;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onDensityChange() {
        resetPointerInputHandler();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        resetPointerInputHandler();
        super.onDetach();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo170onPointerEventH0pRuoY(@l PointerEvent pointerEvent, @l PointerEventPass pointerEventPass, long j5) {
        l2 f5;
        this.boundsSize = j5;
        if (pointerEventPass == PointerEventPass.Initial) {
            this.currentEvent = pointerEvent;
        }
        if (this.pointerInputJob == null) {
            f5 = k.f(getCoroutineScope(), null, u0.UNDISPATCHED, new SuspendingPointerInputModifierNodeImpl$onPointerEvent$1(this, null), 1, null);
            this.pointerInputJob = f5;
        }
        dispatchPointerEvent(pointerEvent, pointerEventPass);
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        boolean z4 = false;
        int i5 = 0;
        while (true) {
            if (i5 < size) {
                if (!PointerEventKt.changedToUpIgnoreConsumed(changes.get(i5))) {
                    break;
                } else {
                    i5++;
                }
            } else {
                z4 = true;
                break;
            }
        }
        if (!(!z4)) {
            pointerEvent = null;
        }
        this.lastPointerEvent = pointerEvent;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onViewConfigurationChange() {
        resetPointerInputHandler();
    }

    @Override // androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode
    public void resetPointerInputHandler() {
        l2 l2Var = this.pointerInputJob;
        if (l2Var != null) {
            l2Var.cancel(new PointerInputResetException());
            this.pointerInputJob = null;
        }
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    public void setInterceptOutOfBoundsChildEvents(boolean z4) {
        this.interceptOutOfBoundsChildEvents = z4;
    }

    @Override // androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode
    public void setPointerInputHandler(@l p<? super PointerInputScope, ? super d<? super r2>, ? extends Object> pVar) {
        resetPointerInputHandler();
        this.pointerInputHandler = pVar;
    }
}
