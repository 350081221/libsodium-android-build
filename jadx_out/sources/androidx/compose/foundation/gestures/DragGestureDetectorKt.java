package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.a;
import v3.p;

@i0(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aY\u0010\u000e\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u000126\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a3\u0010\u0014\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\u000fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a!\u0010\u0017\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0082\u0001\u0010\u001e\u001a\u00020\n*\u00020\u00182\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u000f2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u001a2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u001a26\u0010\u0010\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\n0\u0003H\u0086@¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0082\u0001\u0010 \u001a\u00020\n*\u00020\u00182\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u000f2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u001a2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u001a26\u0010\u0010\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\n0\u0003H\u0086@¢\u0006\u0004\b \u0010\u001f\u001aY\u0010#\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u000126\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110!¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\"\u0010\r\u001aa\u0010(\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010%\u001a\u00020$26\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110!¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0003H\u0080@ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a3\u0010*\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\u000fH\u0086@ø\u0001\u0000¢\u0006\u0004\b)\u0010\u0013\u001a!\u0010,\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b+\u0010\u0016\u001a\u0082\u0001\u0010.\u001a\u00020\n*\u00020\u00182\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u000f2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u001a2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u001a26\u0010-\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110!¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\n0\u0003H\u0086@¢\u0006\u0004\b.\u0010\u001f\u001aY\u00100\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u000126\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110!¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b/\u0010\r\u001aa\u00103\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010%\u001a\u00020$26\u00101\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110!¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0003H\u0080@ø\u0001\u0000¢\u0006\u0004\b2\u0010'\u001a3\u00105\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\u000fH\u0086@ø\u0001\u0000¢\u0006\u0004\b4\u0010\u0013\u001a!\u00107\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b6\u0010\u0016\u001a\u0082\u0001\u00109\u001a\u00020\n*\u00020\u00182\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u000f2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u001a2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u001a26\u00108\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110!¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\n0\u0003H\u0086@¢\u0006\u0004\b9\u0010\u001f\u001a]\u0010\u0014\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\u000f2\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u000f2\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u000fH\u0080Hø\u0001\u0000¢\u0006\u0004\b<\u0010=\u001a5\u0010?\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u000fH\u0082Hø\u0001\u0000¢\u0006\u0004\b>\u0010\u0013\u001aK\u0010D\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010%\u001a\u00020$2\u0006\u0010A\u001a\u00020@2\u0018\u00101\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u0003H\u0080Hø\u0001\u0000¢\u0006\u0004\bB\u0010C\u001a\f\u0010F\u001a\u00020@*\u00020EH\u0000\u001a!\u0010H\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\bG\u0010\u0016\u001a\u001e\u0010L\u001a\u00020\u0011*\u00020I2\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\bJ\u0010K\u001a\u001e\u0010P\u001a\u00020!*\u00020M2\u0006\u0010%\u001a\u00020$H\u0000ø\u0001\u0000¢\u0006\u0004\bN\u0010O\"\u001a\u0010Q\u001a\u00020@8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u001a\u0010U\u001a\u00020@8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bU\u0010R\u001a\u0004\bV\u0010T\"\u001a\u0010W\u001a\u00020@8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bW\u0010R\u001a\u0004\bX\u0010T\"\u0014\u0010Z\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[\"\u0014\u0010\\\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010[\"\u0014\u0010]\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010[\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006^"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/input/pointer/PointerId;", "pointerId", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Lkotlin/v0;", "name", "change", "Landroidx/compose/ui/geometry/Offset;", "overSlop", "Lkotlin/r2;", "onTouchSlopReached", "awaitTouchSlopOrCancellation-jO51t88", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "awaitTouchSlopOrCancellation", "Lkotlin/Function1;", "onDrag", "", "drag-jO51t88", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "drag", "awaitDragOrCancellation-rnUCldI", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/coroutines/d;)Ljava/lang/Object;", "awaitDragOrCancellation", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "onDragStart", "Lkotlin/Function0;", "onDragEnd", "onDragCancel", "dragAmount", "detectDragGestures", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lv3/l;Lv3/a;Lv3/a;Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "detectDragGesturesAfterLongPress", "", "awaitVerticalTouchSlopOrCancellation-jO51t88", "awaitVerticalTouchSlopOrCancellation", "Landroidx/compose/ui/input/pointer/PointerType;", "pointerType", "awaitVerticalPointerSlopOrCancellation-gDDlDlE", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "awaitVerticalPointerSlopOrCancellation", "verticalDrag-jO51t88", "verticalDrag", "awaitVerticalDragOrCancellation-rnUCldI", "awaitVerticalDragOrCancellation", "onVerticalDrag", "detectVerticalDragGestures", "awaitHorizontalTouchSlopOrCancellation-jO51t88", "awaitHorizontalTouchSlopOrCancellation", "onPointerSlopReached", "awaitHorizontalPointerSlopOrCancellation-gDDlDlE", "awaitHorizontalPointerSlopOrCancellation", "horizontalDrag-jO51t88", "horizontalDrag", "awaitHorizontalDragOrCancellation-rnUCldI", "awaitHorizontalDragOrCancellation", "onHorizontalDrag", "detectHorizontalDragGestures", "hasDragged", "motionConsumed", "drag-VnAYq1g", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLv3/l;Lv3/l;Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "awaitDragOrUp-jO51t88", "awaitDragOrUp", "Landroidx/compose/foundation/gestures/PointerDirectionConfig;", "pointerDirectionConfig", "awaitPointerSlopOrCancellation-pn7EDYM", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILandroidx/compose/foundation/gestures/PointerDirectionConfig;Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "awaitPointerSlopOrCancellation", "Landroidx/compose/foundation/gestures/Orientation;", "toPointerDirectionConfig", "awaitLongPressOrCancellation-rnUCldI", "awaitLongPressOrCancellation", "Landroidx/compose/ui/input/pointer/PointerEvent;", "isPointerUp-DmW0f2w", "(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z", "isPointerUp", "Landroidx/compose/ui/platform/ViewConfiguration;", "pointerSlop-E8SPZFQ", "(Landroidx/compose/ui/platform/ViewConfiguration;I)F", "pointerSlop", "HorizontalPointerDirectionConfig", "Landroidx/compose/foundation/gestures/PointerDirectionConfig;", "getHorizontalPointerDirectionConfig", "()Landroidx/compose/foundation/gestures/PointerDirectionConfig;", "VerticalPointerDirectionConfig", "getVerticalPointerDirectionConfig", "BidirectionalPointerDirectionConfig", "getBidirectionalPointerDirectionConfig", "Landroidx/compose/ui/unit/Dp;", "mouseSlop", "F", "defaultTouchSlop", "mouseToTouchSlopRatio", "foundation_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,875:1\n659#1,10:876\n669#1,4:895\n673#1,38:906\n613#1,4:944\n617#1,2:957\n619#1,8:966\n659#1,10:974\n669#1,4:993\n673#1,38:1004\n659#1,10:1042\n669#1,4:1061\n673#1,38:1072\n579#1,6:1110\n613#1,4:1116\n617#1,2:1129\n619#1,8:1138\n586#1,10:1146\n613#1,4:1156\n617#1,2:1169\n619#1,8:1178\n659#1,10:1186\n669#1,4:1205\n673#1,38:1216\n659#1,10:1254\n669#1,4:1273\n673#1,38:1284\n579#1,6:1322\n613#1,4:1328\n617#1,2:1341\n619#1,8:1350\n586#1,10:1358\n613#1,4:1368\n617#1,2:1381\n619#1,8:1390\n613#1,4:1398\n617#1,2:1411\n619#1,8:1420\n613#1,4:1428\n617#1,2:1441\n619#1,8:1450\n116#2,2:886\n33#2,6:888\n118#2:894\n33#2,6:899\n118#2:905\n116#2,2:948\n33#2,6:950\n118#2:956\n33#2,6:959\n118#2:965\n116#2,2:984\n33#2,6:986\n118#2:992\n33#2,6:997\n118#2:1003\n116#2,2:1052\n33#2,6:1054\n118#2:1060\n33#2,6:1065\n118#2:1071\n116#2,2:1120\n33#2,6:1122\n118#2:1128\n33#2,6:1131\n118#2:1137\n116#2,2:1160\n33#2,6:1162\n118#2:1168\n33#2,6:1171\n118#2:1177\n116#2,2:1196\n33#2,6:1198\n118#2:1204\n33#2,6:1209\n118#2:1215\n116#2,2:1264\n33#2,6:1266\n118#2:1272\n33#2,6:1277\n118#2:1283\n116#2,2:1332\n33#2,6:1334\n118#2:1340\n33#2,6:1343\n118#2:1349\n116#2,2:1372\n33#2,6:1374\n118#2:1380\n33#2,6:1383\n118#2:1389\n116#2,2:1402\n33#2,6:1404\n118#2:1410\n33#2,6:1413\n118#2:1419\n116#2,2:1432\n33#2,6:1434\n118#2:1440\n33#2,6:1443\n118#2:1449\n116#2,2:1458\n33#2,6:1460\n118#2:1466\n116#2,2:1467\n33#2,6:1469\n118#2:1475\n116#2,2:1476\n33#2,6:1478\n118#2:1484\n116#2,2:1485\n33#2,6:1487\n118#2:1493\n116#2,2:1494\n33#2,6:1496\n118#2:1502\n116#2,2:1503\n33#2,6:1505\n118#2:1511\n116#2,2:1512\n33#2,6:1514\n118#2:1520\n116#2,2:1521\n33#2,6:1523\n118#2:1529\n164#3:1530\n154#3:1531\n81#4:1532\n*S KotlinDebug\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt\n*L\n78#1:876,10\n78#1:895,4\n78#1:906,38\n142#1:944,4\n142#1:957,2\n142#1:966,8\n287#1:974,10\n287#1:993,4\n287#1:1004,38\n298#1:1042,10\n298#1:1061,4\n298#1:1072,38\n324#1:1110,6\n324#1:1116,4\n324#1:1129,2\n324#1:1138,8\n324#1:1146,10\n354#1:1156,4\n354#1:1169,2\n354#1:1178,8\n438#1:1186,10\n438#1:1205,4\n438#1:1216,38\n449#1:1254,10\n449#1:1273,4\n449#1:1284,38\n472#1:1322,6\n472#1:1328,4\n472#1:1341,2\n472#1:1350,8\n472#1:1358,10\n502#1:1368,4\n502#1:1381,2\n502#1:1390,8\n584#1:1398,4\n584#1:1411,2\n584#1:1420,8\n584#1:1428,4\n584#1:1441,2\n584#1:1450,8\n78#1:886,2\n78#1:888,6\n78#1:894\n78#1:899,6\n78#1:905\n142#1:948,2\n142#1:950,6\n142#1:956\n142#1:959,6\n142#1:965\n287#1:984,2\n287#1:986,6\n287#1:992\n287#1:997,6\n287#1:1003\n298#1:1052,2\n298#1:1054,6\n298#1:1060\n298#1:1065,6\n298#1:1071\n324#1:1120,2\n324#1:1122,6\n324#1:1128\n324#1:1131,6\n324#1:1137\n354#1:1160,2\n354#1:1162,6\n354#1:1168\n354#1:1171,6\n354#1:1177\n438#1:1196,2\n438#1:1198,6\n438#1:1204\n438#1:1209,6\n438#1:1215\n449#1:1264,2\n449#1:1266,6\n449#1:1272\n449#1:1277,6\n449#1:1283\n472#1:1332,2\n472#1:1334,6\n472#1:1340\n472#1:1343,6\n472#1:1349\n502#1:1372,2\n502#1:1374,6\n502#1:1380\n502#1:1383,6\n502#1:1389\n584#1:1402,2\n584#1:1404,6\n584#1:1410\n584#1:1413,6\n584#1:1419\n584#1:1432,2\n584#1:1434,6\n584#1:1440\n584#1:1443,6\n584#1:1449\n616#1:1458,2\n616#1:1460,6\n616#1:1466\n618#1:1467,2\n618#1:1469,6\n618#1:1475\n668#1:1476,2\n668#1:1478,6\n668#1:1484\n672#1:1485,2\n672#1:1487,6\n672#1:1493\n668#1:1494,2\n668#1:1496,6\n668#1:1502\n672#1:1503,2\n672#1:1505,6\n672#1:1511\n802#1:1512,2\n802#1:1514,6\n802#1:1520\n855#1:1521,2\n855#1:1523,6\n855#1:1529\n861#1:1530\n862#1:1531\n863#1:1532\n*E\n"})
/* loaded from: classes.dex */
public final class DragGestureDetectorKt {
    private static final float defaultTouchSlop;
    private static final float mouseSlop;
    private static final float mouseToTouchSlopRatio;

    @l
    private static final PointerDirectionConfig HorizontalPointerDirectionConfig = new PointerDirectionConfig() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$HorizontalPointerDirectionConfig$1
        @Override // androidx.compose.foundation.gestures.PointerDirectionConfig
        /* renamed from: calculateDeltaChange-k-4lQ0M */
        public float mo344calculateDeltaChangek4lQ0M(long j5) {
            return Math.abs(Offset.m3493getXimpl(j5));
        }

        @Override // androidx.compose.foundation.gestures.PointerDirectionConfig
        /* renamed from: calculatePostSlopOffset-8S9VItk */
        public long mo345calculatePostSlopOffset8S9VItk(long j5, float f5) {
            return OffsetKt.Offset(Offset.m3493getXimpl(j5) - (Math.signum(Offset.m3493getXimpl(j5)) * f5), Offset.m3494getYimpl(j5));
        }
    };

    @l
    private static final PointerDirectionConfig VerticalPointerDirectionConfig = new PointerDirectionConfig() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$VerticalPointerDirectionConfig$1
        @Override // androidx.compose.foundation.gestures.PointerDirectionConfig
        /* renamed from: calculateDeltaChange-k-4lQ0M */
        public float mo344calculateDeltaChangek4lQ0M(long j5) {
            return Math.abs(Offset.m3494getYimpl(j5));
        }

        @Override // androidx.compose.foundation.gestures.PointerDirectionConfig
        /* renamed from: calculatePostSlopOffset-8S9VItk */
        public long mo345calculatePostSlopOffset8S9VItk(long j5, float f5) {
            return OffsetKt.Offset(Offset.m3493getXimpl(j5), Offset.m3494getYimpl(j5) - (Math.signum(Offset.m3494getYimpl(j5)) * f5));
        }
    };

    @l
    private static final PointerDirectionConfig BidirectionalPointerDirectionConfig = new PointerDirectionConfig() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$BidirectionalPointerDirectionConfig$1
        @Override // androidx.compose.foundation.gestures.PointerDirectionConfig
        /* renamed from: calculateDeltaChange-k-4lQ0M, reason: not valid java name */
        public float mo344calculateDeltaChangek4lQ0M(long j5) {
            return Offset.m3491getDistanceimpl(j5);
        }

        @Override // androidx.compose.foundation.gestures.PointerDirectionConfig
        /* renamed from: calculatePostSlopOffset-8S9VItk, reason: not valid java name */
        public long mo345calculatePostSlopOffset8S9VItk(long j5, float f5) {
            return Offset.m3497minusMKHz9U(j5, Offset.m3500timestuRUvjQ(Offset.m3488divtuRUvjQ(j5, mo344calculateDeltaChangek4lQ0M(j5)), f5));
        }
    };

    static {
        float m6044constructorimpl = Dp.m6044constructorimpl((float) 0.125d);
        mouseSlop = m6044constructorimpl;
        float m6044constructorimpl2 = Dp.m6044constructorimpl(18);
        defaultTouchSlop = m6044constructorimpl2;
        mouseToTouchSlopRatio = m6044constructorimpl / m6044constructorimpl2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cb, code lost:
    
        if (androidx.compose.ui.input.pointer.PointerEventKt.positionChangedIgnoreConsumed(r11) != false) goto L108;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0067 -> B:10:0x006c). Please report as a decompilation issue!!! */
    @p4.m
    /* renamed from: awaitDragOrCancellation-rnUCldI */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m325awaitDragOrCancellationrnUCldI(@p4.l androidx.compose.ui.input.pointer.AwaitPointerEventScope r17, long r18, @p4.l kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.PointerInputChange> r20) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m325awaitDragOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.coroutines.d):java.lang.Object");
    }

    /* renamed from: awaitDragOrUp-jO51t88 */
    private static final Object m326awaitDragOrUpjO51t88(AwaitPointerEventScope awaitPointerEventScope, long j5, v3.l<? super PointerInputChange, Boolean> lVar, d<? super PointerInputChange> dVar) {
        PointerInputChange pointerInputChange;
        k1.g gVar = new k1.g();
        gVar.element = j5;
        while (true) {
            int i5 = 0;
            kotlin.jvm.internal.i0.e(0);
            PointerInputChange pointerInputChange2 = null;
            Object awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, dVar, 1, null);
            kotlin.jvm.internal.i0.e(1);
            PointerEvent pointerEvent = (PointerEvent) awaitPointerEvent$default;
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i6 = 0;
            while (true) {
                if (i6 < size) {
                    pointerInputChange = changes.get(i6);
                    if (Boolean.valueOf(PointerId.m4854equalsimpl0(pointerInputChange.m4870getIdJ3iCeTQ(), gVar.element)).booleanValue()) {
                        break;
                    }
                    i6++;
                } else {
                    pointerInputChange = null;
                    break;
                }
            }
            PointerInputChange pointerInputChange3 = pointerInputChange;
            if (pointerInputChange3 == null) {
                return null;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                int size2 = changes2.size();
                while (true) {
                    if (i5 >= size2) {
                        break;
                    }
                    PointerInputChange pointerInputChange4 = changes2.get(i5);
                    if (Boolean.valueOf(pointerInputChange4.getPressed()).booleanValue()) {
                        pointerInputChange2 = pointerInputChange4;
                        break;
                    }
                    i5++;
                }
                PointerInputChange pointerInputChange5 = pointerInputChange2;
                if (pointerInputChange5 == null) {
                    return pointerInputChange3;
                }
                gVar.element = pointerInputChange5.m4870getIdJ3iCeTQ();
            } else if (lVar.invoke(pointerInputChange3).booleanValue()) {
                return pointerInputChange3;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d8, code lost:
    
        if ((!r2) != false) goto L116;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0067 -> B:10:0x006c). Please report as a decompilation issue!!! */
    @p4.m
    /* renamed from: awaitHorizontalDragOrCancellation-rnUCldI */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m327awaitHorizontalDragOrCancellationrnUCldI(@p4.l androidx.compose.ui.input.pointer.AwaitPointerEventScope r17, long r18, @p4.l kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.PointerInputChange> r20) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m327awaitHorizontalDragOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0100 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x013b -> B:17:0x0187). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x017c -> B:11:0x017e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x01a5 -> B:17:0x0187). Please report as a decompilation issue!!! */
    @p4.m
    /* renamed from: awaitHorizontalPointerSlopOrCancellation-gDDlDlE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m328awaitHorizontalPointerSlopOrCancellationgDDlDlE(@p4.l androidx.compose.ui.input.pointer.AwaitPointerEventScope r20, long r21, int r23, @p4.l v3.p<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.r2> r24, @p4.l kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.PointerInputChange> r25) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m328awaitHorizontalPointerSlopOrCancellationgDDlDlE(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, v3.p, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x018e, code lost:
    
        if (r9.isConsumed() == false) goto L130;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0142 -> B:17:0x00b8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0188 -> B:11:0x018a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x01b4 -> B:16:0x0192). Please report as a decompilation issue!!! */
    @p4.m
    /* renamed from: awaitHorizontalTouchSlopOrCancellation-jO51t88 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m329awaitHorizontalTouchSlopOrCancellationjO51t88(@p4.l androidx.compose.ui.input.pointer.AwaitPointerEventScope r20, long r21, @p4.l v3.p<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.r2> r23, @p4.l kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.PointerInputChange> r24) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m329awaitHorizontalTouchSlopOrCancellationjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, v3.p, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r10v2, types: [androidx.compose.ui.input.pointer.PointerInputChange, T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v6, types: [androidx.compose.ui.input.pointer.PointerInputChange] */
    @p4.m
    /* renamed from: awaitLongPressOrCancellation-rnUCldI */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m330awaitLongPressOrCancellationrnUCldI(@p4.l androidx.compose.ui.input.pointer.AwaitPointerEventScope r9, long r10, @p4.l kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.PointerInputChange> r12) {
        /*
            boolean r0 = r12 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1
            if (r0 == 0) goto L13
            r0 = r12
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1 r0 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1 r0 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r9 = r0.L$1
            kotlin.jvm.internal.k1$h r9 = (kotlin.jvm.internal.k1.h) r9
            java.lang.Object r10 = r0.L$0
            androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.ui.input.pointer.PointerInputChange) r10
            kotlin.e1.n(r12)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L9b
            goto La4
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3b:
            kotlin.e1.n(r12)
            androidx.compose.ui.input.pointer.PointerEvent r12 = r9.getCurrentEvent()
            boolean r12 = m341isPointerUpDmW0f2w(r12, r10)
            if (r12 == 0) goto L49
            return r4
        L49:
            androidx.compose.ui.input.pointer.PointerEvent r12 = r9.getCurrentEvent()
            java.util.List r12 = r12.getChanges()
            int r2 = r12.size()
            r5 = 0
        L56:
            if (r5 >= r2) goto L6d
            java.lang.Object r6 = r12.get(r5)
            r7 = r6
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
            long r7 = r7.m4870getIdJ3iCeTQ()
            boolean r7 = androidx.compose.ui.input.pointer.PointerId.m4854equalsimpl0(r7, r10)
            if (r7 == 0) goto L6a
            goto L6e
        L6a:
            int r5 = r5 + 1
            goto L56
        L6d:
            r6 = r4
        L6e:
            r10 = r6
            androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.ui.input.pointer.PointerInputChange) r10
            if (r10 != 0) goto L74
            return r4
        L74:
            kotlin.jvm.internal.k1$h r11 = new kotlin.jvm.internal.k1$h
            r11.<init>()
            kotlin.jvm.internal.k1$h r12 = new kotlin.jvm.internal.k1$h
            r12.<init>()
            r12.element = r10
            androidx.compose.ui.platform.ViewConfiguration r2 = r9.getViewConfiguration()
            long r5 = r2.getLongPressTimeoutMillis()
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2 r2 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L9a
            r2.<init>(r12, r11, r4)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L9a
            r0.L$0 = r10     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L9a
            r0.L$1 = r11     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L9a
            r0.label = r3     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L9a
            java.lang.Object r9 = r9.withTimeout(r5, r2, r0)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L9a
            if (r9 != r1) goto La4
            return r1
        L9a:
            r9 = r11
        L9b:
            T r9 = r9.element
            androidx.compose.ui.input.pointer.PointerInputChange r9 = (androidx.compose.ui.input.pointer.PointerInputChange) r9
            if (r9 != 0) goto La3
            r4 = r10
            goto La4
        La3:
            r4 = r9
        La4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m330awaitLongPressOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0181 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0136 -> B:17:0x0185). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0177 -> B:11:0x017b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x019f -> B:18:0x00ae). Please report as a decompilation issue!!! */
    @p4.m
    /* renamed from: awaitPointerSlopOrCancellation-pn7EDYM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m331awaitPointerSlopOrCancellationpn7EDYM(@p4.l androidx.compose.ui.input.pointer.AwaitPointerEventScope r20, long r21, int r23, @p4.l androidx.compose.foundation.gestures.PointerDirectionConfig r24, @p4.l v3.p<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super androidx.compose.ui.geometry.Offset, kotlin.r2> r25, @p4.l kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.PointerInputChange> r26) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m331awaitPointerSlopOrCancellationpn7EDYM(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, androidx.compose.foundation.gestures.PointerDirectionConfig, v3.p, kotlin.coroutines.d):java.lang.Object");
    }

    /* renamed from: awaitPointerSlopOrCancellation-pn7EDYM$$forInline */
    private static final Object m332awaitPointerSlopOrCancellationpn7EDYM$$forInline(AwaitPointerEventScope awaitPointerEventScope, long j5, int i5, PointerDirectionConfig pointerDirectionConfig, p<? super PointerInputChange, ? super Offset, r2> pVar, d<? super PointerInputChange> dVar) {
        PointerInputChange pointerInputChange;
        long m3509getZeroF1C5BW0;
        PointerInputChange pointerInputChange2;
        if (m341isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j5)) {
            return null;
        }
        float m342pointerSlopE8SPZFQ = m342pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i5);
        k1.g gVar = new k1.g();
        gVar.element = j5;
        long m3509getZeroF1C5BW02 = Offset.Companion.m3509getZeroF1C5BW0();
        while (true) {
            kotlin.jvm.internal.i0.e(0);
            Object awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, dVar, 1, null);
            kotlin.jvm.internal.i0.e(1);
            PointerEvent pointerEvent = (PointerEvent) awaitPointerEvent$default;
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i6 = 0;
            while (true) {
                if (i6 < size) {
                    pointerInputChange = changes.get(i6);
                    List<PointerInputChange> list = changes;
                    int i7 = size;
                    if (Boolean.valueOf(PointerId.m4854equalsimpl0(pointerInputChange.m4870getIdJ3iCeTQ(), gVar.element)).booleanValue()) {
                        break;
                    }
                    i6++;
                    changes = list;
                    size = i7;
                } else {
                    pointerInputChange = null;
                    break;
                }
            }
            PointerInputChange pointerInputChange3 = pointerInputChange;
            if (pointerInputChange3 == null || pointerInputChange3.isConsumed()) {
                return null;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                int size2 = changes2.size();
                int i8 = 0;
                while (true) {
                    if (i8 < size2) {
                        pointerInputChange2 = changes2.get(i8);
                        if (Boolean.valueOf(pointerInputChange2.getPressed()).booleanValue()) {
                            break;
                        }
                        i8++;
                    } else {
                        pointerInputChange2 = null;
                        break;
                    }
                }
                PointerInputChange pointerInputChange4 = pointerInputChange2;
                if (pointerInputChange4 == null) {
                    return null;
                }
                gVar.element = pointerInputChange4.m4870getIdJ3iCeTQ();
            } else {
                m3509getZeroF1C5BW02 = Offset.m3498plusMKHz9U(m3509getZeroF1C5BW02, Offset.m3497minusMKHz9U(pointerInputChange3.m4872getPositionF1C5BW0(), pointerInputChange3.m4873getPreviousPositionF1C5BW0()));
                if (pointerDirectionConfig.mo344calculateDeltaChangek4lQ0M(m3509getZeroF1C5BW02) < m342pointerSlopE8SPZFQ) {
                    PointerEventPass pointerEventPass = PointerEventPass.Final;
                    kotlin.jvm.internal.i0.e(0);
                    awaitPointerEventScope.awaitPointerEvent(pointerEventPass, dVar);
                    kotlin.jvm.internal.i0.e(1);
                    if (pointerInputChange3.isConsumed()) {
                        return null;
                    }
                } else {
                    pVar.invoke(pointerInputChange3, Offset.m3482boximpl(pointerDirectionConfig.mo345calculatePostSlopOffset8S9VItk(m3509getZeroF1C5BW02, m342pointerSlopE8SPZFQ)));
                    if (pointerInputChange3.isConsumed()) {
                        return pointerInputChange3;
                    }
                    m3509getZeroF1C5BW0 = Offset.Companion.m3509getZeroF1C5BW0();
                    m3509getZeroF1C5BW02 = m3509getZeroF1C5BW0;
                }
            }
            m3509getZeroF1C5BW0 = m3509getZeroF1C5BW02;
            m3509getZeroF1C5BW02 = m3509getZeroF1C5BW0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x018e, code lost:
    
        if (r9.isConsumed() == false) goto L130;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0142 -> B:17:0x00b8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0188 -> B:11:0x018a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x01b0 -> B:16:0x0192). Please report as a decompilation issue!!! */
    @p4.m
    /* renamed from: awaitTouchSlopOrCancellation-jO51t88 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m333awaitTouchSlopOrCancellationjO51t88(@p4.l androidx.compose.ui.input.pointer.AwaitPointerEventScope r20, long r21, @p4.l v3.p<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super androidx.compose.ui.geometry.Offset, kotlin.r2> r23, @p4.l kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.PointerInputChange> r24) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m333awaitTouchSlopOrCancellationjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, v3.p, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d8, code lost:
    
        if ((!r2) != false) goto L116;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0067 -> B:10:0x006c). Please report as a decompilation issue!!! */
    @p4.m
    /* renamed from: awaitVerticalDragOrCancellation-rnUCldI */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m334awaitVerticalDragOrCancellationrnUCldI(@p4.l androidx.compose.ui.input.pointer.AwaitPointerEventScope r17, long r18, @p4.l kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.PointerInputChange> r20) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m334awaitVerticalDragOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0100 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x013b -> B:17:0x0187). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x017c -> B:11:0x017e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x01a5 -> B:17:0x0187). Please report as a decompilation issue!!! */
    @p4.m
    /* renamed from: awaitVerticalPointerSlopOrCancellation-gDDlDlE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m335awaitVerticalPointerSlopOrCancellationgDDlDlE(@p4.l androidx.compose.ui.input.pointer.AwaitPointerEventScope r20, long r21, int r23, @p4.l v3.p<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.r2> r24, @p4.l kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.PointerInputChange> r25) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m335awaitVerticalPointerSlopOrCancellationgDDlDlE(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, v3.p, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x018e, code lost:
    
        if (r9.isConsumed() == false) goto L130;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0142 -> B:17:0x00b8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0188 -> B:11:0x018a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x01b4 -> B:16:0x0192). Please report as a decompilation issue!!! */
    @p4.m
    /* renamed from: awaitVerticalTouchSlopOrCancellation-jO51t88 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m336awaitVerticalTouchSlopOrCancellationjO51t88(@p4.l androidx.compose.ui.input.pointer.AwaitPointerEventScope r20, long r21, @p4.l v3.p<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.r2> r23, @p4.l kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.PointerInputChange> r24) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m336awaitVerticalTouchSlopOrCancellationjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, v3.p, kotlin.coroutines.d):java.lang.Object");
    }

    @m
    public static final Object detectDragGestures(@l PointerInputScope pointerInputScope, @l v3.l<? super Offset, r2> lVar, @l a<r2> aVar, @l a<r2> aVar2, @l p<? super PointerInputChange, ? super Offset, r2> pVar, @l d<? super r2> dVar) {
        Object l5;
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new DragGestureDetectorKt$detectDragGestures$5(lVar, pVar, aVar2, aVar, null), dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return awaitEachGesture == l5 ? awaitEachGesture : r2.f19517a;
    }

    public static /* synthetic */ Object detectDragGestures$default(PointerInputScope pointerInputScope, v3.l lVar, a aVar, a aVar2, p pVar, d dVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            lVar = DragGestureDetectorKt$detectDragGestures$2.INSTANCE;
        }
        v3.l lVar2 = lVar;
        if ((i5 & 2) != 0) {
            aVar = DragGestureDetectorKt$detectDragGestures$3.INSTANCE;
        }
        a aVar3 = aVar;
        if ((i5 & 4) != 0) {
            aVar2 = DragGestureDetectorKt$detectDragGestures$4.INSTANCE;
        }
        return detectDragGestures(pointerInputScope, lVar2, aVar3, aVar2, pVar, dVar);
    }

    @m
    public static final Object detectDragGesturesAfterLongPress(@l PointerInputScope pointerInputScope, @l v3.l<? super Offset, r2> lVar, @l a<r2> aVar, @l a<r2> aVar2, @l p<? super PointerInputChange, ? super Offset, r2> pVar, @l d<? super r2> dVar) {
        Object l5;
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new DragGestureDetectorKt$detectDragGesturesAfterLongPress$5(lVar, aVar, aVar2, pVar, null), dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return awaitEachGesture == l5 ? awaitEachGesture : r2.f19517a;
    }

    public static /* synthetic */ Object detectDragGesturesAfterLongPress$default(PointerInputScope pointerInputScope, v3.l lVar, a aVar, a aVar2, p pVar, d dVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            lVar = DragGestureDetectorKt$detectDragGesturesAfterLongPress$2.INSTANCE;
        }
        v3.l lVar2 = lVar;
        if ((i5 & 2) != 0) {
            aVar = DragGestureDetectorKt$detectDragGesturesAfterLongPress$3.INSTANCE;
        }
        a aVar3 = aVar;
        if ((i5 & 4) != 0) {
            aVar2 = DragGestureDetectorKt$detectDragGesturesAfterLongPress$4.INSTANCE;
        }
        return detectDragGesturesAfterLongPress(pointerInputScope, lVar2, aVar3, aVar2, pVar, dVar);
    }

    @m
    public static final Object detectHorizontalDragGestures(@l PointerInputScope pointerInputScope, @l v3.l<? super Offset, r2> lVar, @l a<r2> aVar, @l a<r2> aVar2, @l p<? super PointerInputChange, ? super Float, r2> pVar, @l d<? super r2> dVar) {
        Object l5;
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new DragGestureDetectorKt$detectHorizontalDragGestures$5(lVar, pVar, aVar, aVar2, null), dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return awaitEachGesture == l5 ? awaitEachGesture : r2.f19517a;
    }

    public static /* synthetic */ Object detectHorizontalDragGestures$default(PointerInputScope pointerInputScope, v3.l lVar, a aVar, a aVar2, p pVar, d dVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            lVar = DragGestureDetectorKt$detectHorizontalDragGestures$2.INSTANCE;
        }
        v3.l lVar2 = lVar;
        if ((i5 & 2) != 0) {
            aVar = DragGestureDetectorKt$detectHorizontalDragGestures$3.INSTANCE;
        }
        a aVar3 = aVar;
        if ((i5 & 4) != 0) {
            aVar2 = DragGestureDetectorKt$detectHorizontalDragGestures$4.INSTANCE;
        }
        return detectHorizontalDragGestures(pointerInputScope, lVar2, aVar3, aVar2, pVar, dVar);
    }

    @m
    public static final Object detectVerticalDragGestures(@l PointerInputScope pointerInputScope, @l v3.l<? super Offset, r2> lVar, @l a<r2> aVar, @l a<r2> aVar2, @l p<? super PointerInputChange, ? super Float, r2> pVar, @l d<? super r2> dVar) {
        Object l5;
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new DragGestureDetectorKt$detectVerticalDragGestures$5(lVar, pVar, aVar, aVar2, null), dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return awaitEachGesture == l5 ? awaitEachGesture : r2.f19517a;
    }

    public static /* synthetic */ Object detectVerticalDragGestures$default(PointerInputScope pointerInputScope, v3.l lVar, a aVar, a aVar2, p pVar, d dVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            lVar = DragGestureDetectorKt$detectVerticalDragGestures$2.INSTANCE;
        }
        v3.l lVar2 = lVar;
        if ((i5 & 2) != 0) {
            aVar = DragGestureDetectorKt$detectVerticalDragGestures$3.INSTANCE;
        }
        a aVar3 = aVar;
        if ((i5 & 4) != 0) {
            aVar2 = DragGestureDetectorKt$detectVerticalDragGestures$4.INSTANCE;
        }
        return detectVerticalDragGestures(pointerInputScope, lVar2, aVar3, aVar2, pVar, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00fe, code lost:
    
        if (r2.invoke(r15).booleanValue() != false) goto L111;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00be A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x008f -> B:10:0x0095). Please report as a decompilation issue!!! */
    @p4.m
    /* renamed from: drag-VnAYq1g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m337dragVnAYq1g(@p4.l androidx.compose.ui.input.pointer.AwaitPointerEventScope r19, long r20, @p4.l v3.l<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.r2> r22, @p4.l v3.l<? super androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Boolean> r23, @p4.l v3.l<? super androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Boolean> r24, @p4.l kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.PointerInputChange> r25) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m337dragVnAYq1g(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, v3.l, v3.l, v3.l, kotlin.coroutines.d):java.lang.Object");
    }

    /* renamed from: drag-VnAYq1g$$forInline */
    private static final Object m338dragVnAYq1g$$forInline(AwaitPointerEventScope awaitPointerEventScope, long j5, v3.l<? super PointerInputChange, r2> lVar, v3.l<? super PointerInputChange, Boolean> lVar2, v3.l<? super PointerInputChange, Boolean> lVar3, d<? super PointerInputChange> dVar) {
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        PointerInputChange pointerInputChange3;
        long j6 = j5;
        if (m341isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j6)) {
            return null;
        }
        while (true) {
            k1.g gVar = new k1.g();
            gVar.element = j6;
            while (true) {
                int i5 = 0;
                kotlin.jvm.internal.i0.e(0);
                Object awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, dVar, 1, null);
                kotlin.jvm.internal.i0.e(1);
                PointerEvent pointerEvent = (PointerEvent) awaitPointerEvent$default;
                List<PointerInputChange> changes = pointerEvent.getChanges();
                int size = changes.size();
                int i6 = 0;
                while (true) {
                    if (i6 < size) {
                        pointerInputChange = changes.get(i6);
                        if (Boolean.valueOf(PointerId.m4854equalsimpl0(pointerInputChange.m4870getIdJ3iCeTQ(), gVar.element)).booleanValue()) {
                            break;
                        }
                        i6++;
                    } else {
                        pointerInputChange = null;
                        break;
                    }
                }
                pointerInputChange2 = pointerInputChange;
                if (pointerInputChange2 != null) {
                    if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                        List<PointerInputChange> changes2 = pointerEvent.getChanges();
                        int size2 = changes2.size();
                        while (true) {
                            if (i5 < size2) {
                                pointerInputChange3 = changes2.get(i5);
                                if (Boolean.valueOf(pointerInputChange3.getPressed()).booleanValue()) {
                                    break;
                                }
                                i5++;
                            } else {
                                pointerInputChange3 = null;
                                break;
                            }
                        }
                        PointerInputChange pointerInputChange4 = pointerInputChange3;
                        if (pointerInputChange4 == null) {
                            break;
                        }
                        gVar.element = pointerInputChange4.m4870getIdJ3iCeTQ();
                    } else if (lVar2.invoke(pointerInputChange2).booleanValue()) {
                        break;
                    }
                } else {
                    pointerInputChange2 = null;
                    break;
                }
            }
            if (pointerInputChange2 == null || lVar3.invoke(pointerInputChange2).booleanValue()) {
                return null;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                return pointerInputChange2;
            }
            lVar.invoke(pointerInputChange2);
            j6 = pointerInputChange2.m4870getIdJ3iCeTQ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0048 -> B:10:0x004b). Please report as a decompilation issue!!! */
    @p4.m
    /* renamed from: drag-jO51t88 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m339dragjO51t88(@p4.l androidx.compose.ui.input.pointer.AwaitPointerEventScope r4, long r5, @p4.l v3.l<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.r2> r7, @p4.l kotlin.coroutines.d<? super java.lang.Boolean> r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1 r0 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1 r0 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.L$1
            v3.l r4 = (v3.l) r4
            java.lang.Object r5 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r5
            kotlin.e1.n(r8)
            r7 = r4
            r4 = r5
            goto L4b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            kotlin.e1.n(r8)
        L3e:
            r0.L$0 = r4
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r8 = m325awaitDragOrCancellationrnUCldI(r4, r5, r0)
            if (r8 != r1) goto L4b
            return r1
        L4b:
            androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
            if (r8 != 0) goto L55
            r4 = 0
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r4
        L55:
            boolean r5 = androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(r8)
            if (r5 == 0) goto L60
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.b.a(r3)
            return r4
        L60:
            r7.invoke(r8)
            long r5 = r8.m4870getIdJ3iCeTQ()
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m339dragjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, v3.l, kotlin.coroutines.d):java.lang.Object");
    }

    @l
    public static final PointerDirectionConfig getBidirectionalPointerDirectionConfig() {
        return BidirectionalPointerDirectionConfig;
    }

    @l
    public static final PointerDirectionConfig getHorizontalPointerDirectionConfig() {
        return HorizontalPointerDirectionConfig;
    }

    @l
    public static final PointerDirectionConfig getVerticalPointerDirectionConfig() {
        return VerticalPointerDirectionConfig;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ef, code lost:
    
        if ((!r0) != false) goto L123;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x007d -> B:10:0x0083). Please report as a decompilation issue!!! */
    @p4.m
    /* renamed from: horizontalDrag-jO51t88 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m340horizontalDragjO51t88(@p4.l androidx.compose.ui.input.pointer.AwaitPointerEventScope r18, long r19, @p4.l v3.l<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.r2> r21, @p4.l kotlin.coroutines.d<? super java.lang.Boolean> r22) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m340horizontalDragjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, v3.l, kotlin.coroutines.d):java.lang.Object");
    }

    /* renamed from: isPointerUp-DmW0f2w */
    public static final boolean m341isPointerUpDmW0f2w(PointerEvent pointerEvent, long j5) {
        PointerInputChange pointerInputChange;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        boolean z4 = false;
        int i5 = 0;
        while (true) {
            if (i5 < size) {
                pointerInputChange = changes.get(i5);
                if (PointerId.m4854equalsimpl0(pointerInputChange.m4870getIdJ3iCeTQ(), j5)) {
                    break;
                }
                i5++;
            } else {
                pointerInputChange = null;
                break;
            }
        }
        PointerInputChange pointerInputChange2 = pointerInputChange;
        if (pointerInputChange2 != null && pointerInputChange2.getPressed()) {
            z4 = true;
        }
        return true ^ z4;
    }

    /* renamed from: pointerSlop-E8SPZFQ */
    public static final float m342pointerSlopE8SPZFQ(@l ViewConfiguration viewConfiguration, int i5) {
        if (PointerType.m4944equalsimpl0(i5, PointerType.Companion.m4949getMouseT8wyACA())) {
            return viewConfiguration.getTouchSlop() * mouseToTouchSlopRatio;
        }
        return viewConfiguration.getTouchSlop();
    }

    @l
    public static final PointerDirectionConfig toPointerDirectionConfig(@l Orientation orientation) {
        if (orientation == Orientation.Vertical) {
            return VerticalPointerDirectionConfig;
        }
        return HorizontalPointerDirectionConfig;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ef, code lost:
    
        if ((!r0) != false) goto L123;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x007d -> B:10:0x0083). Please report as a decompilation issue!!! */
    @p4.m
    /* renamed from: verticalDrag-jO51t88 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m343verticalDragjO51t88(@p4.l androidx.compose.ui.input.pointer.AwaitPointerEventScope r18, long r19, @p4.l v3.l<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.r2> r21, @p4.l kotlin.coroutines.d<? super java.lang.Boolean> r22) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m343verticalDragjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, v3.l, kotlin.coroutines.d):java.lang.Object");
    }
}
