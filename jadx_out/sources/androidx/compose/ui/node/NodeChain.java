package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.layout.ModifierInfo;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.List;
import kotlin.collections.w;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0000\u0018\u00002\u00020\u0001:\u0002yzB\u000f\u0012\u0006\u0010Z\u001a\u00020Y¢\u0006\u0004\bw\u0010xJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J@\u0010\u0012\u001a\u00060\u0011R\u00020\u00002\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0018\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J<\u0010\u0018\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002H\u0002J\u0010\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002H\u0002J\u0018\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u0002H\u0002J\u0018\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0002H\u0002J\u0018\u0010!\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u0002H\u0002J\u0018\u0010\"\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0002H\u0002J \u0010%\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0002H\u0002J\u0019\u0010*\u001a\u00020\u00062\b\u0010'\u001a\u0004\u0018\u00010&H\u0000¢\u0006\u0004\b(\u0010)J\u0017\u0010/\u001a\u00020\u00062\u0006\u0010,\u001a\u00020+H\u0000¢\u0006\u0004\b-\u0010.J\u000f\u00102\u001a\u00020\u0006H\u0000¢\u0006\u0004\b0\u00101J\u0006\u00103\u001a\u00020\u0006J\u0006\u00104\u001a\u00020\u0006J\u0006\u00105\u001a\u00020\u0006J\f\u00108\u001a\b\u0012\u0004\u0012\u00020706J\u000f\u0010:\u001a\u00020\u0006H\u0000¢\u0006\u0004\b9\u00101J\u000f\u0010<\u001a\u00020\u0006H\u0000¢\u0006\u0004\b;\u00101J?\u0010D\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010=\u0018\u00012\f\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000>2\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0@H\u0080\bø\u0001\u0000¢\u0006\u0004\bB\u0010CJ=\u0010G\u001a\u00020\u0006\"\u0006\b\u0000\u0010=\u0018\u00012\f\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000>2\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060@H\u0080\bø\u0001\u0000¢\u0006\u0004\bE\u0010FJ,\u0010G\u001a\u00020\u00062\u0006\u0010H\u001a\u00020\t2\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060@H\u0080\b¢\u0006\u0004\bI\u0010FJ$\u0010G\u001a\u00020\u00062\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060@H\u0080\b¢\u0006\u0004\bI\u0010JJ$\u0010L\u001a\u00020\u00062\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060@H\u0080\b¢\u0006\u0004\bK\u0010JJ=\u0010N\u001a\u00020\u0006\"\u0006\b\u0000\u0010=\u0018\u00012\f\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000>2\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060@H\u0080\bø\u0001\u0000¢\u0006\u0004\bM\u0010FJ,\u0010N\u001a\u00020\u00062\u0006\u0010H\u001a\u00020\t2\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060@H\u0080\b¢\u0006\u0004\bO\u0010FJ$\u0010N\u001a\u00020\u00062\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060@H\u0080\b¢\u0006\u0004\bO\u0010JJ+\u0010\u0017\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010=\u0018\u00012\f\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000>H\u0080\bø\u0001\u0000¢\u0006\u0004\bP\u0010QJ+\u0010\b\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010=\u0018\u00012\f\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000>H\u0080\bø\u0001\u0000¢\u0006\u0004\bR\u0010QJ\u001e\u0010U\u001a\u00020\u000f2\n\u0010?\u001a\u0006\u0012\u0002\b\u00030>H\u0000ø\u0001\u0000¢\u0006\u0004\bS\u0010TJ\u0017\u0010U\u001a\u00020\u000f2\u0006\u0010H\u001a\u00020\tH\u0000¢\u0006\u0004\bV\u0010TJ\b\u0010X\u001a\u00020WH\u0016R\u0017\u0010Z\u001a\u00020Y8\u0006¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u001a\u0010_\u001a\u00020^8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR$\u0010d\u001a\u00020\u00142\u0006\u0010c\u001a\u00020\u00148\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR\u001a\u0010\u0017\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010h\u001a\u0004\bi\u0010jR$\u0010\b\u001a\u00020\u00022\u0006\u0010c\u001a\u00020\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\b\u0010h\u001a\u0004\bk\u0010jR\u001e\u0010l\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u001e\u0010n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010mR\u001c\u0010o\u001a\b\u0018\u00010\u0011R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010pR\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010qR\u0014\u0010r\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\br\u0010sR\u0014\u0010v\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bt\u0010u\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006{"}, d2 = {"Landroidx/compose/ui/node/NodeChain;", "", "Landroidx/compose/ui/Modifier$Node;", "padChain", "paddedHead", "trimChain", "Lkotlin/r2;", "syncAggregateChildKindSet", "head", "", TypedValues.CycleType.S_WAVE_OFFSET, "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/Modifier$Element;", "before", "after", "", "shouldAttachOnInsert", "Landroidx/compose/ui/node/NodeChain$Differ;", "getDiffer", "start", "Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "propagateCoordinator", "tail", "structuralUpdate", "node", "detachAndRemoveNode", "removeNode", "element", "child", "createAndInsertNodeAsParent", "insertParent", "parent", "createAndInsertNodeAsChild", "insertChild", "prev", "next", "updateNode", "Landroidx/compose/ui/node/NodeChain$Logger;", "logger", "useLogger$ui_release", "(Landroidx/compose/ui/node/NodeChain$Logger;)V", "useLogger", "Landroidx/compose/ui/Modifier;", "m", "updateFrom$ui_release", "(Landroidx/compose/ui/Modifier;)V", "updateFrom", "resetState$ui_release", "()V", "resetState", "syncCoordinators", "markAsAttached", "runAttachLifecycle", "", "Landroidx/compose/ui/layout/ModifierInfo;", "getModifierInfo", "markAsDetached$ui_release", "markAsDetached", "runDetachLifecycle$ui_release", "runDetachLifecycle", "T", "Landroidx/compose/ui/node/NodeKind;", "type", "Lkotlin/Function1;", "block", "firstFromHead-aLcG6gQ$ui_release", "(ILv3/l;)Ljava/lang/Object;", "firstFromHead", "headToTail-aLcG6gQ$ui_release", "(ILv3/l;)V", "headToTail", "mask", "headToTail$ui_release", "(Lv3/l;)V", "headToTailExclusive$ui_release", "headToTailExclusive", "tailToHead-aLcG6gQ$ui_release", "tailToHead", "tailToHead$ui_release", "tail-H91voCI$ui_release", "(I)Ljava/lang/Object;", "head-H91voCI$ui_release", "has-H91voCI$ui_release", "(I)Z", "has", "has$ui_release", "", "toString", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/node/InnerNodeCoordinator;", "innerCoordinator", "Landroidx/compose/ui/node/InnerNodeCoordinator;", "getInnerCoordinator$ui_release", "()Landroidx/compose/ui/node/InnerNodeCoordinator;", "<set-?>", "outerCoordinator", "Landroidx/compose/ui/node/NodeCoordinator;", "getOuterCoordinator$ui_release", "()Landroidx/compose/ui/node/NodeCoordinator;", "Landroidx/compose/ui/Modifier$Node;", "getTail$ui_release", "()Landroidx/compose/ui/Modifier$Node;", "getHead$ui_release", "current", "Landroidx/compose/runtime/collection/MutableVector;", "buffer", "cachedDiffer", "Landroidx/compose/ui/node/NodeChain$Differ;", "Landroidx/compose/ui/node/NodeChain$Logger;", "isUpdating", "()Z", "getAggregateChildKindSet", "()I", "aggregateChildKindSet", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "Differ", "Logger", "ui_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nNodeChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 7 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 8 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n1#1,862:1\n756#1,6:873\n725#1,6:890\n725#1,6:896\n733#1,3:903\n736#1,3:909\n756#1,6:912\n756#1,6:918\n702#1,8:926\n725#1,3:934\n710#1,2:937\n703#1:939\n704#1,11:983\n728#1,3:994\n715#1:997\n705#1:998\n708#1,2:999\n725#1,3:1001\n710#1,2:1004\n713#1,2:1049\n728#1,3:1051\n715#1:1054\n725#1,6:1055\n747#1,12:1061\n759#1,3:1116\n753#1:1119\n756#1,6:1120\n741#1,18:1126\n759#1,3:1187\n753#1:1190\n744#1:1191\n702#1,8:1192\n725#1,3:1200\n710#1,2:1203\n703#1:1205\n704#1,11:1249\n728#1,3:1260\n715#1:1263\n705#1:1264\n733#1,6:1265\n1#2:863\n1208#3:864\n1187#3,2:865\n1187#3,2:871\n1188#3:902\n1208#3:960\n1187#3,2:961\n1208#3:1026\n1187#3,2:1027\n1208#3:1093\n1187#3,2:1094\n1208#3:1164\n1187#3,2:1165\n1208#3:1226\n1187#3,2:1227\n523#4:867\n523#4:868\n523#4:869\n523#4:870\n476#4,11:879\n523#4:906\n728#4,2:907\n72#5:924\n261#6:925\n261#6:946\n261#6:1012\n261#6:1079\n261#6:1150\n261#6:1212\n385#7,6:940\n395#7,2:947\n397#7,8:952\n405#7,9:963\n414#7,8:975\n385#7,6:1006\n395#7,2:1013\n397#7,8:1018\n405#7,9:1029\n414#7,8:1041\n385#7,6:1073\n395#7,2:1080\n397#7,8:1085\n405#7,9:1096\n414#7,8:1108\n385#7,6:1144\n395#7,2:1151\n397#7,8:1156\n405#7,9:1167\n414#7,8:1179\n385#7,6:1206\n395#7,2:1213\n397#7,8:1218\n405#7,9:1229\n414#7,8:1241\n234#8,3:949\n237#8,3:972\n234#8,3:1015\n237#8,3:1038\n234#8,3:1082\n237#8,3:1105\n234#8,3:1153\n237#8,3:1176\n234#8,3:1215\n237#8,3:1238\n*S KotlinDebug\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n*L\n219#1:873,6\n289#1:890,6\n299#1:896,6\n325#1:903,3\n325#1:909,3\n359#1:912,6\n365#1:918,6\n695#1:926,8\n695#1:934,3\n695#1:937,2\n695#1:939\n695#1:983,11\n695#1:994,3\n695#1:997\n695#1:998\n702#1:999,2\n702#1:1001,3\n702#1:1004,2\n702#1:1049,2\n702#1:1051,3\n702#1:1054\n709#1:1055,6\n741#1:1061,12\n741#1:1116,3\n741#1:1119\n748#1:1120,6\n764#1:1126,18\n764#1:1187,3\n764#1:1190\n764#1:1191\n771#1:1192,8\n771#1:1200,3\n771#1:1203,2\n771#1:1205\n771#1:1249,11\n771#1:1260,3\n771#1:1263\n771#1:1264\n787#1:1265,6\n114#1:864\n114#1:865,2\n196#1:871,2\n323#1:902\n695#1:960\n695#1:961,2\n703#1:1026\n703#1:1027,2\n742#1:1093\n742#1:1094,2\n764#1:1164\n764#1:1165,2\n771#1:1226\n771#1:1227,2\n125#1:867\n126#1:868\n176#1:869\n188#1:870\n223#1:879,11\n353#1:906\n353#1:907,2\n407#1:924\n407#1:925\n695#1:946\n703#1:1012\n742#1:1079\n764#1:1150\n771#1:1212\n695#1:940,6\n695#1:947,2\n695#1:952,8\n695#1:963,9\n695#1:975,8\n703#1:1006,6\n703#1:1013,2\n703#1:1018,8\n703#1:1029,9\n703#1:1041,8\n742#1:1073,6\n742#1:1080,2\n742#1:1085,8\n742#1:1096,9\n742#1:1108,8\n764#1:1144,6\n764#1:1151,2\n764#1:1156,8\n764#1:1167,9\n764#1:1179,8\n771#1:1206,6\n771#1:1213,2\n771#1:1218,8\n771#1:1229,9\n771#1:1241,8\n695#1:949,3\n695#1:972,3\n703#1:1015,3\n703#1:1038,3\n742#1:1082,3\n742#1:1105,3\n764#1:1153,3\n764#1:1176,3\n771#1:1215,3\n771#1:1238,3\n*E\n"})
/* loaded from: classes.dex */
public final class NodeChain {
    public static final int $stable = 8;

    @m
    private MutableVector<Modifier.Element> buffer;

    @m
    private Differ cachedDiffer;

    @m
    private MutableVector<Modifier.Element> current;

    @l
    private Modifier.Node head;

    @l
    private final InnerNodeCoordinator innerCoordinator;

    @l
    private final LayoutNode layoutNode;

    @m
    private Logger logger;

    @l
    private NodeCoordinator outerCoordinator;

    @l
    private final Modifier.Node tail;

    @i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0082\u0004\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0006\u0010$\u001a\u00020\u0005¢\u0006\u0004\b*\u0010+J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016R\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R(\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R(\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R\"\u0010$\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006,"}, d2 = {"Landroidx/compose/ui/node/NodeChain$Differ;", "Landroidx/compose/ui/node/DiffCallback;", "", "oldIndex", "newIndex", "", "areItemsTheSame", "Lkotlin/r2;", "insert", "atIndex", "remove", "same", "Landroidx/compose/ui/Modifier$Node;", "node", "Landroidx/compose/ui/Modifier$Node;", "getNode", "()Landroidx/compose/ui/Modifier$Node;", "setNode", "(Landroidx/compose/ui/Modifier$Node;)V", TypedValues.CycleType.S_WAVE_OFFSET, "I", "getOffset", "()I", "setOffset", "(I)V", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/Modifier$Element;", "before", "Landroidx/compose/runtime/collection/MutableVector;", "getBefore", "()Landroidx/compose/runtime/collection/MutableVector;", "setBefore", "(Landroidx/compose/runtime/collection/MutableVector;)V", "after", "getAfter", "setAfter", "shouldAttachOnInsert", "Z", "getShouldAttachOnInsert", "()Z", "setShouldAttachOnInsert", "(Z)V", "<init>", "(Landroidx/compose/ui/node/NodeChain;Landroidx/compose/ui/Modifier$Node;ILandroidx/compose/runtime/collection/MutableVector;Landroidx/compose/runtime/collection/MutableVector;Z)V", "ui_release"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nNodeChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChain$Differ\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n*L\n1#1,862:1\n523#2:863\n523#2:864\n523#2:865\n523#2:866\n523#2:867\n523#2:870\n523#2:871\n72#3:868\n261#4:869\n*S KotlinDebug\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChain$Differ\n*L\n422#1:863\n423#1:864\n430#1:865\n431#1:866\n456#1:867\n472#1:870\n473#1:871\n457#1:868\n457#1:869\n*E\n"})
    /* loaded from: classes.dex */
    public final class Differ implements DiffCallback {

        @l
        private MutableVector<Modifier.Element> after;

        @l
        private MutableVector<Modifier.Element> before;

        @l
        private Modifier.Node node;
        private int offset;
        private boolean shouldAttachOnInsert;

        public Differ(@l Modifier.Node node, int i5, @l MutableVector<Modifier.Element> mutableVector, @l MutableVector<Modifier.Element> mutableVector2, boolean z4) {
            this.node = node;
            this.offset = i5;
            this.before = mutableVector;
            this.after = mutableVector2;
            this.shouldAttachOnInsert = z4;
        }

        @Override // androidx.compose.ui.node.DiffCallback
        public boolean areItemsTheSame(int i5, int i6) {
            MutableVector<Modifier.Element> mutableVector = this.before;
            Modifier.Element element = mutableVector.getContent()[this.offset + i5];
            MutableVector<Modifier.Element> mutableVector2 = this.after;
            if (NodeChainKt.actionForModifiers(element, mutableVector2.getContent()[this.offset + i6]) != 0) {
                return true;
            }
            return false;
        }

        @l
        public final MutableVector<Modifier.Element> getAfter() {
            return this.after;
        }

        @l
        public final MutableVector<Modifier.Element> getBefore() {
            return this.before;
        }

        @l
        public final Modifier.Node getNode() {
            return this.node;
        }

        public final int getOffset() {
            return this.offset;
        }

        public final boolean getShouldAttachOnInsert() {
            return this.shouldAttachOnInsert;
        }

        @Override // androidx.compose.ui.node.DiffCallback
        public void insert(int i5) {
            int i6 = this.offset + i5;
            Modifier.Node node = this.node;
            this.node = NodeChain.this.createAndInsertNodeAsChild(this.after.getContent()[i6], node);
            Logger logger = NodeChain.this.logger;
            if (logger != null) {
                logger.nodeInserted(i6, i6, this.after.getContent()[i6], node, this.node);
            }
            if (this.shouldAttachOnInsert) {
                Modifier.Node child$ui_release = this.node.getChild$ui_release();
                l0.m(child$ui_release);
                NodeCoordinator coordinator$ui_release = child$ui_release.getCoordinator$ui_release();
                l0.m(coordinator$ui_release);
                LayoutModifierNode asLayoutModifierNode = DelegatableNodeKt.asLayoutModifierNode(this.node);
                if (asLayoutModifierNode != null) {
                    LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = new LayoutModifierNodeCoordinator(NodeChain.this.getLayoutNode(), asLayoutModifierNode);
                    this.node.updateCoordinator$ui_release(layoutModifierNodeCoordinator);
                    NodeChain.this.propagateCoordinator(this.node, layoutModifierNodeCoordinator);
                    layoutModifierNodeCoordinator.setWrappedBy$ui_release(coordinator$ui_release.getWrappedBy$ui_release());
                    layoutModifierNodeCoordinator.setWrapped$ui_release(coordinator$ui_release);
                    coordinator$ui_release.setWrappedBy$ui_release(layoutModifierNodeCoordinator);
                } else {
                    this.node.updateCoordinator$ui_release(coordinator$ui_release);
                }
                this.node.markAsAttached$ui_release();
                this.node.runAttachLifecycle$ui_release();
                NodeKindKt.autoInvalidateInsertedNode(this.node);
                return;
            }
            this.node.setInsertedNodeAwaitingAttachForInvalidation$ui_release(true);
        }

        @Override // androidx.compose.ui.node.DiffCallback
        public void remove(int i5, int i6) {
            boolean z4;
            Modifier.Node child$ui_release = this.node.getChild$ui_release();
            l0.m(child$ui_release);
            Logger logger = NodeChain.this.logger;
            if (logger != null) {
                MutableVector<Modifier.Element> mutableVector = this.before;
                logger.nodeRemoved(i6, mutableVector.getContent()[this.offset + i6], child$ui_release);
            }
            if ((NodeKind.m5204constructorimpl(2) & child$ui_release.getKindSet$ui_release()) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                NodeCoordinator coordinator$ui_release = child$ui_release.getCoordinator$ui_release();
                l0.m(coordinator$ui_release);
                NodeCoordinator wrappedBy$ui_release = coordinator$ui_release.getWrappedBy$ui_release();
                NodeCoordinator wrapped$ui_release = coordinator$ui_release.getWrapped$ui_release();
                l0.m(wrapped$ui_release);
                if (wrappedBy$ui_release != null) {
                    wrappedBy$ui_release.setWrapped$ui_release(wrapped$ui_release);
                }
                wrapped$ui_release.setWrappedBy$ui_release(wrappedBy$ui_release);
                NodeChain.this.propagateCoordinator(this.node, wrapped$ui_release);
            }
            this.node = NodeChain.this.detachAndRemoveNode(child$ui_release);
        }

        @Override // androidx.compose.ui.node.DiffCallback
        public void same(int i5, int i6) {
            Modifier.Node child$ui_release = this.node.getChild$ui_release();
            l0.m(child$ui_release);
            this.node = child$ui_release;
            MutableVector<Modifier.Element> mutableVector = this.before;
            Modifier.Element element = mutableVector.getContent()[this.offset + i5];
            MutableVector<Modifier.Element> mutableVector2 = this.after;
            Modifier.Element element2 = mutableVector2.getContent()[this.offset + i6];
            if (!l0.g(element, element2)) {
                NodeChain.this.updateNode(element, element2, this.node);
                Logger logger = NodeChain.this.logger;
                if (logger != null) {
                    int i7 = this.offset;
                    logger.nodeUpdated(i7 + i5, i7 + i6, element, element2, this.node);
                    return;
                }
                return;
            }
            Logger logger2 = NodeChain.this.logger;
            if (logger2 != null) {
                int i8 = this.offset;
                logger2.nodeReused(i8 + i5, i8 + i6, element, element2, this.node);
            }
        }

        public final void setAfter(@l MutableVector<Modifier.Element> mutableVector) {
            this.after = mutableVector;
        }

        public final void setBefore(@l MutableVector<Modifier.Element> mutableVector) {
            this.before = mutableVector;
        }

        public final void setNode(@l Modifier.Node node) {
            this.node = node;
        }

        public final void setOffset(int i5) {
            this.offset = i5;
        }

        public final void setShouldAttachOnInsert(boolean z4) {
            this.shouldAttachOnInsert = z4;
        }
    }

    @i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b`\u0018\u00002\u00020\u0001J(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&J0\u0010\r\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&J0\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&J0\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007H&J \u0010\u0014\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/NodeChain$Logger;", "", "", "index", "Landroidx/compose/ui/Modifier$Element;", "prev", "next", "Landroidx/compose/ui/Modifier$Node;", "node", "Lkotlin/r2;", "linearDiffAborted", "oldIndex", "newIndex", "nodeUpdated", "nodeReused", "atIndex", "element", "child", "inserted", "nodeInserted", "nodeRemoved", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public interface Logger {
        void linearDiffAborted(int i5, @l Modifier.Element element, @l Modifier.Element element2, @l Modifier.Node node);

        void nodeInserted(int i5, int i6, @l Modifier.Element element, @l Modifier.Node node, @l Modifier.Node node2);

        void nodeRemoved(int i5, @l Modifier.Element element, @l Modifier.Node node);

        void nodeReused(int i5, int i6, @l Modifier.Element element, @l Modifier.Element element2, @l Modifier.Node node);

        void nodeUpdated(int i5, int i6, @l Modifier.Element element, @l Modifier.Element element2, @l Modifier.Node node);
    }

    public NodeChain(@l LayoutNode layoutNode) {
        this.layoutNode = layoutNode;
        InnerNodeCoordinator innerNodeCoordinator = new InnerNodeCoordinator(layoutNode);
        this.innerCoordinator = innerNodeCoordinator;
        this.outerCoordinator = innerNodeCoordinator;
        TailModifierNode tail = innerNodeCoordinator.getTail();
        this.tail = tail;
        this.head = tail;
    }

    public final Modifier.Node createAndInsertNodeAsChild(Modifier.Element element, Modifier.Node node) {
        Modifier.Node backwardsCompatNode;
        if (element instanceof ModifierNodeElement) {
            backwardsCompatNode = ((ModifierNodeElement) element).create();
            backwardsCompatNode.setKindSet$ui_release(NodeKindKt.calculateNodeKindSetFromIncludingDelegates(backwardsCompatNode));
        } else {
            backwardsCompatNode = new BackwardsCompatNode(element);
        }
        if (!backwardsCompatNode.isAttached()) {
            backwardsCompatNode.setInsertedNodeAwaitingAttachForInvalidation$ui_release(true);
            return insertChild(backwardsCompatNode, node);
        }
        throw new IllegalStateException("A ModifierNodeElement cannot return an already attached node from create() ".toString());
    }

    private final Modifier.Node createAndInsertNodeAsParent(Modifier.Element element, Modifier.Node node) {
        Modifier.Node backwardsCompatNode;
        if (element instanceof ModifierNodeElement) {
            backwardsCompatNode = ((ModifierNodeElement) element).create();
            backwardsCompatNode.setKindSet$ui_release(NodeKindKt.calculateNodeKindSetFromIncludingDelegates(backwardsCompatNode));
        } else {
            backwardsCompatNode = new BackwardsCompatNode(element);
        }
        if (!backwardsCompatNode.isAttached()) {
            backwardsCompatNode.setInsertedNodeAwaitingAttachForInvalidation$ui_release(true);
            return insertParent(backwardsCompatNode, node);
        }
        throw new IllegalStateException("createAndInsertNodeAsParent called on an attached node".toString());
    }

    public final Modifier.Node detachAndRemoveNode(Modifier.Node node) {
        if (node.isAttached()) {
            NodeKindKt.autoInvalidateRemovedNode(node);
            node.runDetachLifecycle$ui_release();
            node.markAsDetached$ui_release();
        }
        return removeNode(node);
    }

    public final int getAggregateChildKindSet() {
        return this.head.getAggregateChildKindSet$ui_release();
    }

    private final Differ getDiffer(Modifier.Node node, int i5, MutableVector<Modifier.Element> mutableVector, MutableVector<Modifier.Element> mutableVector2, boolean z4) {
        Differ differ = this.cachedDiffer;
        if (differ == null) {
            Differ differ2 = new Differ(node, i5, mutableVector, mutableVector2, z4);
            this.cachedDiffer = differ2;
            return differ2;
        }
        differ.setNode(node);
        differ.setOffset(i5);
        differ.setBefore(mutableVector);
        differ.setAfter(mutableVector2);
        differ.setShouldAttachOnInsert(z4);
        return differ;
    }

    private final Modifier.Node insertChild(Modifier.Node node, Modifier.Node node2) {
        Modifier.Node child$ui_release = node2.getChild$ui_release();
        if (child$ui_release != null) {
            child$ui_release.setParent$ui_release(node);
            node.setChild$ui_release(child$ui_release);
        }
        node2.setChild$ui_release(node);
        node.setParent$ui_release(node2);
        return node;
    }

    private final Modifier.Node insertParent(Modifier.Node node, Modifier.Node node2) {
        Modifier.Node parent$ui_release = node2.getParent$ui_release();
        if (parent$ui_release != null) {
            parent$ui_release.setChild$ui_release(node);
            node.setParent$ui_release(parent$ui_release);
        }
        node2.setParent$ui_release(node);
        node.setChild$ui_release(node2);
        return node;
    }

    private final boolean isUpdating() {
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$1;
        Modifier.Node node = this.head;
        nodeChainKt$SentinelHead$1 = NodeChainKt.SentinelHead;
        return node == nodeChainKt$SentinelHead$1;
    }

    private final Modifier.Node padChain() {
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$1;
        boolean z4;
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$12;
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$13;
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$14;
        Modifier.Node node = this.head;
        nodeChainKt$SentinelHead$1 = NodeChainKt.SentinelHead;
        if (node != nodeChainKt$SentinelHead$1) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            Modifier.Node node2 = this.head;
            nodeChainKt$SentinelHead$12 = NodeChainKt.SentinelHead;
            node2.setParent$ui_release(nodeChainKt$SentinelHead$12);
            nodeChainKt$SentinelHead$13 = NodeChainKt.SentinelHead;
            nodeChainKt$SentinelHead$13.setChild$ui_release(node2);
            nodeChainKt$SentinelHead$14 = NodeChainKt.SentinelHead;
            return nodeChainKt$SentinelHead$14;
        }
        throw new IllegalStateException("padChain called on already padded chain".toString());
    }

    public final void propagateCoordinator(Modifier.Node node, NodeCoordinator nodeCoordinator) {
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$1;
        NodeCoordinator nodeCoordinator2;
        boolean z4;
        for (Modifier.Node parent$ui_release = node.getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            nodeChainKt$SentinelHead$1 = NodeChainKt.SentinelHead;
            if (parent$ui_release == nodeChainKt$SentinelHead$1) {
                LayoutNode parent$ui_release2 = this.layoutNode.getParent$ui_release();
                if (parent$ui_release2 != null) {
                    nodeCoordinator2 = parent$ui_release2.getInnerCoordinator$ui_release();
                } else {
                    nodeCoordinator2 = null;
                }
                nodeCoordinator.setWrappedBy$ui_release(nodeCoordinator2);
                this.outerCoordinator = nodeCoordinator;
                return;
            }
            if ((NodeKind.m5204constructorimpl(2) & parent$ui_release.getKindSet$ui_release()) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                parent$ui_release.updateCoordinator$ui_release(nodeCoordinator);
            } else {
                return;
            }
        }
    }

    private final Modifier.Node removeNode(Modifier.Node node) {
        Modifier.Node child$ui_release = node.getChild$ui_release();
        Modifier.Node parent$ui_release = node.getParent$ui_release();
        if (child$ui_release != null) {
            child$ui_release.setParent$ui_release(parent$ui_release);
            node.setChild$ui_release(null);
        }
        if (parent$ui_release != null) {
            parent$ui_release.setChild$ui_release(child$ui_release);
            node.setParent$ui_release(null);
        }
        l0.m(parent$ui_release);
        return parent$ui_release;
    }

    private final void structuralUpdate(int i5, MutableVector<Modifier.Element> mutableVector, MutableVector<Modifier.Element> mutableVector2, Modifier.Node node, boolean z4) {
        MyersDiffKt.executeDiff(mutableVector.getSize() - i5, mutableVector2.getSize() - i5, getDiffer(node, i5, mutableVector, mutableVector2, z4));
        syncAggregateChildKindSet();
    }

    private final void syncAggregateChildKindSet() {
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$1;
        int i5 = 0;
        for (Modifier.Node parent$ui_release = this.tail.getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            nodeChainKt$SentinelHead$1 = NodeChainKt.SentinelHead;
            if (parent$ui_release != nodeChainKt$SentinelHead$1) {
                i5 |= parent$ui_release.getKindSet$ui_release();
                parent$ui_release.setAggregateChildKindSet$ui_release(i5);
            } else {
                return;
            }
        }
    }

    private final Modifier.Node trimChain(Modifier.Node node) {
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$1;
        boolean z4;
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$12;
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$13;
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$14;
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$15;
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$16;
        nodeChainKt$SentinelHead$1 = NodeChainKt.SentinelHead;
        boolean z5 = true;
        if (node == nodeChainKt$SentinelHead$1) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            nodeChainKt$SentinelHead$12 = NodeChainKt.SentinelHead;
            Modifier.Node child$ui_release = nodeChainKt$SentinelHead$12.getChild$ui_release();
            if (child$ui_release == null) {
                child$ui_release = this.tail;
            }
            child$ui_release.setParent$ui_release(null);
            nodeChainKt$SentinelHead$13 = NodeChainKt.SentinelHead;
            nodeChainKt$SentinelHead$13.setChild$ui_release(null);
            nodeChainKt$SentinelHead$14 = NodeChainKt.SentinelHead;
            nodeChainKt$SentinelHead$14.setAggregateChildKindSet$ui_release(-1);
            nodeChainKt$SentinelHead$15 = NodeChainKt.SentinelHead;
            nodeChainKt$SentinelHead$15.updateCoordinator$ui_release(null);
            nodeChainKt$SentinelHead$16 = NodeChainKt.SentinelHead;
            if (child$ui_release == nodeChainKt$SentinelHead$16) {
                z5 = false;
            }
            if (z5) {
                return child$ui_release;
            }
            throw new IllegalStateException("trimChain did not update the head".toString());
        }
        throw new IllegalStateException("trimChain called on already trimmed chain".toString());
    }

    public final void updateNode(Modifier.Element element, Modifier.Element element2, Modifier.Node node) {
        if ((element instanceof ModifierNodeElement) && (element2 instanceof ModifierNodeElement)) {
            NodeChainKt.updateUnsafe((ModifierNodeElement) element2, node);
            if (node.isAttached()) {
                NodeKindKt.autoInvalidateUpdatedNode(node);
                return;
            } else {
                node.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(true);
                return;
            }
        }
        if (node instanceof BackwardsCompatNode) {
            ((BackwardsCompatNode) node).setElement(element2);
            if (node.isAttached()) {
                NodeKindKt.autoInvalidateUpdatedNode(node);
                return;
            } else {
                node.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(true);
                return;
            }
        }
        throw new IllegalStateException("Unknown Modifier.Node type".toString());
    }

    /* renamed from: firstFromHead-aLcG6gQ$ui_release */
    public final /* synthetic */ <T> T m5166firstFromHeadaLcG6gQ$ui_release(int i5, v3.l<? super T, Boolean> lVar) {
        if ((getAggregateChildKindSet() & i5) != 0) {
            for (Modifier.Node head$ui_release = getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
                if ((head$ui_release.getKindSet$ui_release() & i5) != 0) {
                    for (Modifier.Node node = head$ui_release; node != null; node = DelegatableNodeKt.pop(null)) {
                        l0.y(3, "T");
                        if (lVar.invoke(node).booleanValue()) {
                            return node;
                        }
                    }
                }
                if ((head$ui_release.getAggregateChildKindSet$ui_release() & i5) == 0) {
                    break;
                }
            }
        }
        return null;
    }

    @l
    public final Modifier.Node getHead$ui_release() {
        return this.head;
    }

    @l
    public final InnerNodeCoordinator getInnerCoordinator$ui_release() {
        return this.innerCoordinator;
    }

    @l
    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    @l
    public final List<ModifierInfo> getModifierInfo() {
        boolean z4;
        List<ModifierInfo> E;
        MutableVector<Modifier.Element> mutableVector = this.current;
        if (mutableVector == null) {
            E = w.E();
            return E;
        }
        MutableVector mutableVector2 = new MutableVector(new ModifierInfo[mutableVector.getSize()], 0);
        Modifier.Node head$ui_release = getHead$ui_release();
        int i5 = 0;
        while (head$ui_release != null && head$ui_release != getTail$ui_release()) {
            NodeCoordinator coordinator$ui_release = head$ui_release.getCoordinator$ui_release();
            if (coordinator$ui_release != null) {
                OwnedLayer layer = coordinator$ui_release.getLayer();
                OwnedLayer layer2 = this.innerCoordinator.getLayer();
                Modifier.Node child$ui_release = head$ui_release.getChild$ui_release();
                if (child$ui_release == this.tail && head$ui_release.getCoordinator$ui_release() != child$ui_release.getCoordinator$ui_release()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!z4) {
                    layer2 = null;
                }
                if (layer == null) {
                    layer = layer2;
                }
                mutableVector2.add(new ModifierInfo(mutableVector.getContent()[i5], coordinator$ui_release, layer));
                head$ui_release = head$ui_release.getChild$ui_release();
                i5++;
            } else {
                throw new IllegalArgumentException("getModifierInfo called on node with no coordinator".toString());
            }
        }
        return mutableVector2.asMutableList();
    }

    @l
    public final NodeCoordinator getOuterCoordinator$ui_release() {
        return this.outerCoordinator;
    }

    @l
    public final Modifier.Node getTail$ui_release() {
        return this.tail;
    }

    public final boolean has$ui_release(int i5) {
        return (i5 & getAggregateChildKindSet()) != 0;
    }

    /* renamed from: has-H91voCI$ui_release */
    public final boolean m5167hasH91voCI$ui_release(int i5) {
        return (i5 & getAggregateChildKindSet()) != 0;
    }

    /* renamed from: head-H91voCI$ui_release */
    public final /* synthetic */ <T> T m5168headH91voCI$ui_release(int i5) {
        if ((getAggregateChildKindSet() & i5) != 0) {
            for (Object obj = (T) getHead$ui_release(); obj != null; obj = (T) ((Modifier.Node) obj).getChild$ui_release()) {
                if ((((Modifier.Node) obj).getKindSet$ui_release() & i5) != 0) {
                    l0.y(3, "T");
                    return (T) obj;
                }
                if ((((Modifier.Node) obj).getAggregateChildKindSet$ui_release() & i5) == 0) {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    public final void headToTail$ui_release(int i5, @l v3.l<? super Modifier.Node, r2> lVar) {
        if ((getAggregateChildKindSet() & i5) == 0) {
            return;
        }
        for (Modifier.Node head$ui_release = getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
            if ((head$ui_release.getKindSet$ui_release() & i5) != 0) {
                lVar.invoke(head$ui_release);
            }
            if ((head$ui_release.getAggregateChildKindSet$ui_release() & i5) == 0) {
                return;
            }
        }
    }

    /* renamed from: headToTail-aLcG6gQ$ui_release */
    public final /* synthetic */ <T> void m5169headToTailaLcG6gQ$ui_release(int i5, v3.l<? super T, r2> lVar) {
        if ((getAggregateChildKindSet() & i5) != 0) {
            for (Modifier.Node head$ui_release = getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
                if ((head$ui_release.getKindSet$ui_release() & i5) != 0) {
                    for (Modifier.Node node = head$ui_release; node != null; node = DelegatableNodeKt.pop(null)) {
                        l0.y(3, "T");
                        lVar.invoke(node);
                    }
                }
                if ((head$ui_release.getAggregateChildKindSet$ui_release() & i5) == 0) {
                    return;
                }
            }
        }
    }

    public final void headToTailExclusive$ui_release(@l v3.l<? super Modifier.Node, r2> lVar) {
        for (Modifier.Node head$ui_release = getHead$ui_release(); head$ui_release != null && head$ui_release != getTail$ui_release(); head$ui_release = head$ui_release.getChild$ui_release()) {
            lVar.invoke(head$ui_release);
        }
    }

    public final void markAsAttached() {
        for (Modifier.Node head$ui_release = getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
            head$ui_release.markAsAttached$ui_release();
        }
    }

    public final void markAsDetached$ui_release() {
        for (Modifier.Node tail$ui_release = getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
            if (tail$ui_release.isAttached()) {
                tail$ui_release.markAsDetached$ui_release();
            }
        }
    }

    public final void resetState$ui_release() {
        int size;
        for (Modifier.Node tail$ui_release = getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
            if (tail$ui_release.isAttached()) {
                tail$ui_release.reset$ui_release();
            }
        }
        MutableVector<Modifier.Element> mutableVector = this.current;
        if (mutableVector != null && (size = mutableVector.getSize()) > 0) {
            Modifier.Element[] content = mutableVector.getContent();
            int i5 = 0;
            do {
                Modifier.Element element = content[i5];
                if (element instanceof SuspendPointerInputElement) {
                    mutableVector.set(i5, new ForceUpdateElement((ModifierNodeElement) element));
                }
                i5++;
            } while (i5 < size);
        }
        runDetachLifecycle$ui_release();
        markAsDetached$ui_release();
    }

    public final void runAttachLifecycle() {
        for (Modifier.Node head$ui_release = getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
            head$ui_release.runAttachLifecycle$ui_release();
            if (head$ui_release.getInsertedNodeAwaitingAttachForInvalidation$ui_release()) {
                NodeKindKt.autoInvalidateInsertedNode(head$ui_release);
            }
            if (head$ui_release.getUpdatedNodeAwaitingAttachForInvalidation$ui_release()) {
                NodeKindKt.autoInvalidateUpdatedNode(head$ui_release);
            }
            head$ui_release.setInsertedNodeAwaitingAttachForInvalidation$ui_release(false);
            head$ui_release.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(false);
        }
    }

    public final void runDetachLifecycle$ui_release() {
        for (Modifier.Node tail$ui_release = getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
            if (tail$ui_release.isAttached()) {
                tail$ui_release.runDetachLifecycle$ui_release();
            }
        }
    }

    public final void syncCoordinators() {
        NodeCoordinator nodeCoordinator;
        NodeCoordinator layoutModifierNodeCoordinator;
        NodeCoordinator nodeCoordinator2 = this.innerCoordinator;
        for (Modifier.Node parent$ui_release = this.tail.getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            LayoutModifierNode asLayoutModifierNode = DelegatableNodeKt.asLayoutModifierNode(parent$ui_release);
            if (asLayoutModifierNode != null) {
                if (parent$ui_release.getCoordinator$ui_release() != null) {
                    NodeCoordinator coordinator$ui_release = parent$ui_release.getCoordinator$ui_release();
                    l0.n(coordinator$ui_release, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                    layoutModifierNodeCoordinator = (LayoutModifierNodeCoordinator) coordinator$ui_release;
                    LayoutModifierNode layoutModifierNode = layoutModifierNodeCoordinator.getLayoutModifierNode();
                    layoutModifierNodeCoordinator.setLayoutModifierNode$ui_release(asLayoutModifierNode);
                    if (layoutModifierNode != parent$ui_release) {
                        layoutModifierNodeCoordinator.onLayoutModifierNodeChanged();
                    }
                } else {
                    layoutModifierNodeCoordinator = new LayoutModifierNodeCoordinator(this.layoutNode, asLayoutModifierNode);
                    parent$ui_release.updateCoordinator$ui_release(layoutModifierNodeCoordinator);
                }
                nodeCoordinator2.setWrappedBy$ui_release(layoutModifierNodeCoordinator);
                layoutModifierNodeCoordinator.setWrapped$ui_release(nodeCoordinator2);
                nodeCoordinator2 = layoutModifierNodeCoordinator;
            } else {
                parent$ui_release.updateCoordinator$ui_release(nodeCoordinator2);
            }
        }
        LayoutNode parent$ui_release2 = this.layoutNode.getParent$ui_release();
        if (parent$ui_release2 != null) {
            nodeCoordinator = parent$ui_release2.getInnerCoordinator$ui_release();
        } else {
            nodeCoordinator = null;
        }
        nodeCoordinator2.setWrappedBy$ui_release(nodeCoordinator);
        this.outerCoordinator = nodeCoordinator2;
    }

    /* renamed from: tail-H91voCI$ui_release */
    public final /* synthetic */ <T> T m5170tailH91voCI$ui_release(int i5) {
        if ((getAggregateChildKindSet() & i5) != 0) {
            for (Object obj = (T) getTail$ui_release(); obj != null; obj = (T) ((Modifier.Node) obj).getParent$ui_release()) {
                if ((((Modifier.Node) obj).getKindSet$ui_release() & i5) != 0) {
                    l0.y(3, "T");
                    return (T) obj;
                }
            }
            return null;
        }
        return null;
    }

    public final void tailToHead$ui_release(int i5, @l v3.l<? super Modifier.Node, r2> lVar) {
        if ((getAggregateChildKindSet() & i5) == 0) {
            return;
        }
        for (Modifier.Node tail$ui_release = getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
            if ((tail$ui_release.getKindSet$ui_release() & i5) != 0) {
                lVar.invoke(tail$ui_release);
            }
        }
    }

    /* renamed from: tailToHead-aLcG6gQ$ui_release */
    public final /* synthetic */ <T> void m5171tailToHeadaLcG6gQ$ui_release(int i5, v3.l<? super T, r2> lVar) {
        if ((getAggregateChildKindSet() & i5) != 0) {
            for (Modifier.Node tail$ui_release = getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
                if ((tail$ui_release.getKindSet$ui_release() & i5) != 0) {
                    for (Modifier.Node node = tail$ui_release; node != null; node = DelegatableNodeKt.pop(null)) {
                        l0.y(3, "T");
                        lVar.invoke(node);
                    }
                }
            }
        }
    }

    @l
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if (this.head == this.tail) {
            sb.append("]");
        } else {
            Modifier.Node head$ui_release = getHead$ui_release();
            while (true) {
                if (head$ui_release == null || head$ui_release == getTail$ui_release()) {
                    break;
                }
                sb.append(String.valueOf(head$ui_release));
                if (head$ui_release.getChild$ui_release() == this.tail) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                head$ui_release = head$ui_release.getChild$ui_release();
            }
        }
        String sb2 = sb.toString();
        l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0092, code lost:
    
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0093, code lost:
    
        if (r2 >= r1) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0095, code lost:
    
        if (r8 == null) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0097, code lost:
    
        if (r5 == null) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0099, code lost:
    
        structuralUpdate(r2, r8, r9, r5, r18.layoutNode.isAttached());
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b6, code lost:
    
        throw new java.lang.IllegalStateException("structuralUpdate requires a non-null tail".toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c0, code lost:
    
        throw new java.lang.IllegalStateException("expected prior modifier list to be non-empty".toString());
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void updateFrom$ui_release(@p4.l androidx.compose.ui.Modifier r19) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.NodeChain.updateFrom$ui_release(androidx.compose.ui.Modifier):void");
    }

    public final void useLogger$ui_release(@m Logger logger) {
        this.logger = logger;
    }

    public final void tailToHead$ui_release(@l v3.l<? super Modifier.Node, r2> lVar) {
        for (Modifier.Node tail$ui_release = getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
            lVar.invoke(tail$ui_release);
        }
    }

    public final void headToTail$ui_release(@l v3.l<? super Modifier.Node, r2> lVar) {
        for (Modifier.Node head$ui_release = getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
            lVar.invoke(head$ui_release);
        }
    }
}
