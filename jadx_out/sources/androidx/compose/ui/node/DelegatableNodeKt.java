package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a3\u0010\t\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\b\u001a\u0016\u0010\n\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a)\u0010\u000b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\b\u001a\u001a\u0010\u000e\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\r\u001a\u00020\u0006H\u0002\u001a)\u0010\u000f\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\b\u001a)\u0010\u0010\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0080\b\u001a)\u0010\u0011\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\b\u001a)\u0010\u0012\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\b\u001aA\u0010\u0011\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0013\u0018\u0001*\u00020\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001aA\u0010\u0012\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0013\u0018\u0001*\u00020\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0017\u001aK\u0010\t\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0013\u0018\u0001*\u00020\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001aM\u0010\u001e\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0013\u0018\u0001*\u00020\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u00142\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a5\u0010\"\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001f\"\u0006\b\u0000\u0010\u0013\u0018\u0001*\u00020\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0080\bø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a3\u0010\n\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0013\u0018\u0001*\u00020#*\u00020\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0080\bø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001aA\u0010\u000b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0013\u0018\u0001*\u00020\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\bø\u0001\u0000¢\u0006\u0004\b&\u0010\u0017\u001aA\u0010\u000f\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0013\u0018\u0001*\u00020\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\bø\u0001\u0000¢\u0006\u0004\b'\u0010\u0017\u001aA\u0010)\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0013\u0018\u0001*\u00020\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\bø\u0001\u0000¢\u0006\u0004\b(\u0010\u0017\u001aA\u0010\u0010\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0013\u0018\u0001*\u00020\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0005H\u0080\bø\u0001\u0000¢\u0006\u0004\b*\u0010\u0017\u001a\"\u0010-\u001a\u00020\u0003*\u00020\u00002\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0014H\u0000ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001a\"\u00102\u001a\u00020/*\u00020\u00002\n\u0010.\u001a\u0006\u0012\u0002\b\u00030\u0014H\u0000ø\u0001\u0000¢\u0006\u0004\b0\u00101\u001a\f\u00104\u001a\u000203*\u00020\u0000H\u0000\u001a\f\u00106\u001a\u000205*\u00020\u0000H\u0000\u001a\n\u00108\u001a\u000207*\u00020\u0000\u001a\n\u0010:\u001a\u000209*\u00020\u0000\u001a\n\u0010;\u001a\u00020\u0007*\u00020\u0000\u001a\u000e\u0010=\u001a\u0004\u0018\u00010<*\u00020\u0006H\u0000\u001aA\u0010@\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0013\u0018\u0001*\u00020\u00062\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\bø\u0001\u0000¢\u0006\u0004\b>\u0010?\u001a\u0016\u0010A\u001a\u0004\u0018\u00010\u0006*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\fH\u0002\"\u0018\u0010B\u001a\u00020\u0003*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bB\u0010C\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006D"}, d2 = {"Landroidx/compose/ui/node/DelegatableNode;", "", "mask", "", "includeSelf", "Lkotlin/Function1;", "Landroidx/compose/ui/Modifier$Node;", "Lkotlin/r2;", "block", "visitAncestors", "nearestAncestor", "visitSubtree", "Landroidx/compose/runtime/collection/MutableVector;", "node", "addLayoutNodeChildren", "visitChildren", "visitSubtreeIf", "visitLocalDescendants", "visitLocalAncestors", "T", "Landroidx/compose/ui/node/NodeKind;", "type", "visitLocalDescendants-6rFNWt0", "(Landroidx/compose/ui/node/DelegatableNode;ILv3/l;)V", "visitLocalAncestors-6rFNWt0", "visitAncestors-Y-YKmho", "(Landroidx/compose/ui/node/DelegatableNode;IZLv3/l;)V", "untilType", "visitSelfAndAncestors-5BbP62I", "(Landroidx/compose/ui/node/DelegatableNode;IILv3/l;)V", "visitSelfAndAncestors", "", "ancestors-64DMado", "(Landroidx/compose/ui/node/DelegatableNode;I)Ljava/util/List;", "ancestors", "", "nearestAncestor-64DMado", "(Landroidx/compose/ui/node/DelegatableNode;I)Ljava/lang/Object;", "visitSubtree-6rFNWt0", "visitChildren-6rFNWt0", "visitSelfAndChildren-6rFNWt0", "visitSelfAndChildren", "visitSubtreeIf-6rFNWt0", "has-64DMado", "(Landroidx/compose/ui/node/DelegatableNode;I)Z", "has", "kind", "Landroidx/compose/ui/node/NodeCoordinator;", "requireCoordinator-64DMado", "(Landroidx/compose/ui/node/DelegatableNode;I)Landroidx/compose/ui/node/NodeCoordinator;", "requireCoordinator", "Landroidx/compose/ui/node/LayoutNode;", "requireLayoutNode", "Landroidx/compose/ui/node/Owner;", "requireOwner", "Landroidx/compose/ui/unit/Density;", "requireDensity", "Landroidx/compose/ui/unit/LayoutDirection;", "requireLayoutDirection", "invalidateSubtree", "Landroidx/compose/ui/node/LayoutModifierNode;", "asLayoutModifierNode", "dispatchForKind-6rFNWt0", "(Landroidx/compose/ui/Modifier$Node;ILv3/l;)V", "dispatchForKind", "pop", "isDelegationRoot", "(Landroidx/compose/ui/node/DelegatableNode;)Z", "ui_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nDelegatableNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,427:1\n190#1:447\n191#1,6:449\n385#1,6:455\n395#1,2:462\n397#1,8:467\n405#1,9:478\n414#1,8:490\n198#1,3:498\n206#1:501\n207#1,4:503\n385#1,6:507\n395#1,2:514\n397#1,8:519\n405#1,9:530\n414#1,8:542\n212#1,3:550\n58#1:553\n59#1,8:555\n385#1,6:563\n395#1,2:570\n397#1,8:575\n405#1,9:586\n414#1,8:598\n68#1,7:606\n58#1,9:613\n385#1,12:622\n397#1,8:637\n405#1,9:648\n414#1,8:660\n68#1,7:668\n58#1:675\n59#1,8:677\n385#1,6:687\n395#1,2:694\n397#1,8:699\n405#1,9:710\n414#1,8:722\n68#1,7:730\n230#1,5:737\n58#1:742\n59#1,8:744\n385#1,6:752\n395#1,2:759\n397#1,8:764\n405#1,9:775\n414#1,8:787\n68#1,7:795\n230#1,5:802\n58#1:807\n59#1,8:809\n385#1,6:817\n395#1,2:824\n397#1,8:829\n405#1,9:840\n414#1,8:852\n68#1,7:860\n100#1:867\n101#1,15:869\n385#1,6:884\n395#1,2:891\n397#1,8:896\n405#1,9:907\n414#1,8:919\n117#1,8:927\n133#1:935\n134#1:937\n135#1,7:941\n142#1,9:949\n385#1,6:958\n395#1,2:965\n397#1,17:970\n414#1,8:990\n151#1,6:998\n385#1,6:1004\n395#1,2:1011\n397#1,8:1016\n405#1,9:1027\n414#1,8:1039\n133#1:1047\n134#1:1049\n135#1,7:1053\n142#1,9:1061\n385#1,6:1070\n395#1,2:1077\n397#1,8:1082\n405#1,9:1093\n414#1,8:1105\n151#1,6:1113\n163#1:1119\n164#1:1121\n165#1,12:1125\n385#1,6:1137\n395#1,2:1144\n397#1,8:1149\n405#1,9:1160\n414#1,8:1172\n177#1,8:1180\n1#2:428\n1#2:448\n1#2:502\n1#2:554\n1#2:676\n1#2:743\n1#2:808\n1#2:868\n1#2:936\n1#2:1048\n1#2:1120\n492#3,11:429\n48#3:443\n48#3:948\n48#3:1060\n1208#4:440\n1187#4,2:441\n1208#4:444\n1187#4,2:445\n1208#4:475\n1187#4,2:476\n1208#4:527\n1187#4,2:528\n1208#4:583\n1187#4,2:584\n1208#4:645\n1187#4,2:646\n1208#4:707\n1187#4,2:708\n1208#4:772\n1187#4,2:773\n1208#4:837\n1187#4,2:838\n1208#4:904\n1187#4,2:905\n1208#4:938\n1187#4,2:939\n1208#4:1024\n1187#4,2:1025\n1208#4:1050\n1187#4,2:1051\n1208#4:1090\n1187#4,2:1091\n1208#4:1122\n1187#4,2:1123\n1208#4:1157\n1187#4,2:1158\n1208#4:1197\n1187#4,2:1198\n261#5:461\n261#5:513\n261#5:569\n261#5:685\n261#5:686\n261#5:693\n261#5:758\n261#5:823\n261#5:890\n261#5:964\n261#5:1010\n261#5:1076\n261#5:1143\n261#5:1189\n261#5:1191\n261#5:1192\n261#5:1196\n234#6,3:464\n237#6,3:487\n234#6,3:516\n237#6,3:539\n234#6,3:572\n237#6,3:595\n234#6,3:634\n237#6,3:657\n234#6,3:696\n237#6,3:719\n234#6,3:761\n237#6,3:784\n234#6,3:826\n237#6,3:849\n234#6,3:893\n237#6,3:916\n234#6,3:967\n237#6,3:987\n234#6,3:1013\n237#6,3:1036\n234#6,3:1079\n237#6,3:1102\n234#6,3:1146\n237#6,3:1169\n234#6,3:1193\n237#6,3:1200\n72#7:1188\n72#7:1190\n*S KotlinDebug\n*F\n+ 1 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n*L\n219#1:447\n219#1:449,6\n220#1:455,6\n220#1:462,2\n220#1:467,8\n220#1:478,9\n220#1:490,8\n219#1:498,3\n226#1:501\n226#1:503,4\n227#1:507,6\n227#1:514,2\n227#1:519,8\n227#1:530,9\n227#1:542,8\n226#1:550,3\n234#1:553\n234#1:555,8\n234#1:563,6\n234#1:570,2\n234#1:575,8\n234#1:586,9\n234#1:598,8\n234#1:606,7\n234#1:613,9\n234#1:622,12\n234#1:637,8\n234#1:648,9\n234#1:660,8\n234#1:668,7\n242#1:675\n242#1:677,8\n245#1:687,6\n245#1:694,2\n245#1:699,8\n245#1:710,9\n245#1:722,8\n242#1:730,7\n254#1:737,5\n254#1:742\n254#1:744,8\n254#1:752,6\n254#1:759,2\n254#1:764,8\n254#1:775,9\n254#1:787,8\n254#1:795,7\n262#1:802,5\n262#1:807\n262#1:809,8\n262#1:817,6\n262#1:824,2\n262#1:829,8\n262#1:840,9\n262#1:852,8\n262#1:860,7\n271#1:867\n271#1:869,15\n271#1:884,6\n271#1:891,2\n271#1:896,8\n271#1:907,9\n271#1:919,8\n271#1:927,8\n276#1:935\n276#1:937\n276#1:941,7\n276#1:949,9\n276#1:958,6\n276#1:965,2\n276#1:970,17\n276#1:990,8\n276#1:998,6\n282#1:1004,6\n282#1:1011,2\n282#1:1016,8\n282#1:1027,9\n282#1:1039,8\n283#1:1047\n283#1:1049\n283#1:1053,7\n283#1:1061,9\n283#1:1070,6\n283#1:1077,2\n283#1:1082,8\n283#1:1093,9\n283#1:1105,8\n283#1:1113,6\n289#1:1119\n289#1:1121\n289#1:1125,12\n290#1:1137,6\n290#1:1144,2\n290#1:1149,8\n290#1:1160,9\n290#1:1172,8\n289#1:1180,8\n219#1:448\n226#1:502\n234#1:554\n242#1:676\n254#1:743\n262#1:808\n271#1:868\n276#1:936\n283#1:1048\n289#1:1120\n127#1:429,11\n141#1:443\n276#1:948\n283#1:1060\n134#1:440\n134#1:441,2\n164#1:444\n164#1:445,2\n220#1:475\n220#1:476,2\n227#1:527\n227#1:528,2\n234#1:583\n234#1:584,2\n234#1:645\n234#1:646,2\n245#1:707\n245#1:708,2\n254#1:772\n254#1:773,2\n262#1:837\n262#1:838,2\n271#1:904\n271#1:905,2\n276#1:938\n276#1:939,2\n282#1:1024\n282#1:1025,2\n283#1:1050\n283#1:1051,2\n283#1:1090\n283#1:1091,2\n289#1:1122\n289#1:1123,2\n290#1:1157\n290#1:1158,2\n404#1:1197\n404#1:1198,2\n220#1:461\n227#1:513\n234#1:569\n243#1:685\n244#1:686\n245#1:693\n254#1:758\n262#1:823\n271#1:890\n276#1:964\n282#1:1010\n283#1:1076\n290#1:1143\n347#1:1189\n353#1:1191\n390#1:1192\n397#1:1196\n220#1:464,3\n220#1:487,3\n227#1:516,3\n227#1:539,3\n234#1:572,3\n234#1:595,3\n234#1:634,3\n234#1:657,3\n245#1:696,3\n245#1:719,3\n254#1:761,3\n254#1:784,3\n262#1:826,3\n262#1:849,3\n271#1:893,3\n271#1:916,3\n276#1:967,3\n276#1:987,3\n282#1:1013,3\n282#1:1036,3\n283#1:1079,3\n283#1:1102,3\n290#1:1146,3\n290#1:1169,3\n396#1:1193,3\n396#1:1200,3\n347#1:1188\n353#1:1190\n*E\n"})
/* loaded from: classes.dex */
public final class DelegatableNodeKt {
    public static final /* synthetic */ Modifier.Node access$pop(MutableVector mutableVector) {
        return pop(mutableVector);
    }

    public static final void addLayoutNodeChildren(MutableVector<Modifier.Node> mutableVector, Modifier.Node node) {
        MutableVector<LayoutNode> mutableVector2 = requireLayoutNode(node).get_children$ui_release();
        int size = mutableVector2.getSize();
        if (size > 0) {
            int i5 = size - 1;
            LayoutNode[] content = mutableVector2.getContent();
            do {
                mutableVector.add(content[i5].getNodes$ui_release().getHead$ui_release());
                i5--;
            } while (i5 >= 0);
        }
    }

    /* renamed from: ancestors-64DMado */
    public static final /* synthetic */ <T> List<T> m5097ancestors64DMado(DelegatableNode delegatableNode, int i5) {
        NodeChain nodes$ui_release;
        if (delegatableNode.getNode().isAttached()) {
            Modifier.Node parent$ui_release = delegatableNode.getNode().getParent$ui_release();
            LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
            ArrayList arrayList = null;
            while (requireLayoutNode != null) {
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i5) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & i5) != 0) {
                            for (Modifier.Node node = parent$ui_release; node != null; node = pop(null)) {
                                l0.y(3, "T");
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.add(node);
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
            return arrayList;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m
    public static final LayoutModifierNode asLayoutModifierNode(@l Modifier.Node node) {
        boolean z4;
        boolean z5;
        if ((NodeKind.m5204constructorimpl(2) & node.getKindSet$ui_release()) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            return null;
        }
        if (node instanceof LayoutModifierNode) {
            return (LayoutModifierNode) node;
        }
        if (node instanceof DelegatingNode) {
            Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release();
            while (delegate$ui_release != 0) {
                if (delegate$ui_release instanceof LayoutModifierNode) {
                    return (LayoutModifierNode) delegate$ui_release;
                }
                if (delegate$ui_release instanceof DelegatingNode) {
                    if ((NodeKind.m5204constructorimpl(2) & delegate$ui_release.getKindSet$ui_release()) != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        delegate$ui_release = ((DelegatingNode) delegate$ui_release).getDelegate$ui_release();
                    }
                }
                delegate$ui_release = delegate$ui_release.getChild$ui_release();
            }
        }
        return null;
    }

    /* renamed from: dispatchForKind-6rFNWt0 */
    public static final /* synthetic */ <T> void m5098dispatchForKind6rFNWt0(Modifier.Node node, int i5, v3.l<? super T, r2> lVar) {
        while (node != null) {
            l0.y(3, "T");
            lVar.invoke(node);
            node = pop(null);
        }
    }

    /* renamed from: has-64DMado */
    public static final boolean m5099has64DMado(@l DelegatableNode delegatableNode, int i5) {
        return (delegatableNode.getNode().getAggregateChildKindSet$ui_release() & i5) != 0;
    }

    public static final void invalidateSubtree(@l DelegatableNode delegatableNode) {
        if (delegatableNode.getNode().isAttached()) {
            LayoutNode.invalidateSubtree$default(requireLayoutNode(delegatableNode), false, 1, null);
        }
    }

    public static final boolean isDelegationRoot(@l DelegatableNode delegatableNode) {
        return delegatableNode.getNode() == delegatableNode;
    }

    @m
    public static final Modifier.Node nearestAncestor(@l DelegatableNode delegatableNode, int i5) {
        NodeChain nodes$ui_release;
        if (delegatableNode.getNode().isAttached()) {
            Modifier.Node parent$ui_release = delegatableNode.getNode().getParent$ui_release();
            LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
            while (requireLayoutNode != null) {
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i5) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & i5) != 0) {
                            return parent$ui_release;
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
            return null;
        }
        throw new IllegalStateException("nearestAncestor called on an unattached node".toString());
    }

    /* renamed from: nearestAncestor-64DMado */
    public static final /* synthetic */ <T> T m5100nearestAncestor64DMado(DelegatableNode delegatableNode, int i5) {
        NodeChain nodes$ui_release;
        if (delegatableNode.getNode().isAttached()) {
            Object parent$ui_release = delegatableNode.getNode().getParent$ui_release();
            LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
            while (requireLayoutNode != null) {
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i5) != 0) {
                    while (parent$ui_release != null) {
                        if ((((Modifier.Node) parent$ui_release).getKindSet$ui_release() & i5) != 0) {
                            l0.y(3, "T");
                            return (T) parent$ui_release;
                        }
                        parent$ui_release = (T) ((Modifier.Node) parent$ui_release).getParent$ui_release();
                    }
                }
                requireLayoutNode = requireLayoutNode.getParent$ui_release();
                if (requireLayoutNode != null && (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) != null) {
                    parent$ui_release = (T) nodes$ui_release.getTail$ui_release();
                } else {
                    parent$ui_release = (T) null;
                }
            }
            return null;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    public static final Modifier.Node pop(MutableVector<Modifier.Node> mutableVector) {
        if (mutableVector != null && !mutableVector.isEmpty()) {
            return mutableVector.removeAt(mutableVector.getSize() - 1);
        }
        return null;
    }

    @l
    /* renamed from: requireCoordinator-64DMado */
    public static final NodeCoordinator m5101requireCoordinator64DMado(@l DelegatableNode delegatableNode, int i5) {
        NodeCoordinator coordinator$ui_release = delegatableNode.getNode().getCoordinator$ui_release();
        l0.m(coordinator$ui_release);
        if (coordinator$ui_release.getTail() == delegatableNode && NodeKindKt.m5213getIncludeSelfInTraversalH91voCI(i5)) {
            NodeCoordinator wrapped$ui_release = coordinator$ui_release.getWrapped$ui_release();
            l0.m(wrapped$ui_release);
            return wrapped$ui_release;
        }
        return coordinator$ui_release;
    }

    @l
    public static final Density requireDensity(@l DelegatableNode delegatableNode) {
        return requireLayoutNode(delegatableNode).getDensity();
    }

    @l
    public static final LayoutDirection requireLayoutDirection(@l DelegatableNode delegatableNode) {
        return requireLayoutNode(delegatableNode).getLayoutDirection();
    }

    @l
    public static final LayoutNode requireLayoutNode(@l DelegatableNode delegatableNode) {
        NodeCoordinator coordinator$ui_release = delegatableNode.getNode().getCoordinator$ui_release();
        if (coordinator$ui_release != null) {
            return coordinator$ui_release.getLayoutNode();
        }
        throw new IllegalStateException("Cannot obtain node coordinator. Is the Modifier.Node attached?".toString());
    }

    @l
    public static final Owner requireOwner(@l DelegatableNode delegatableNode) {
        Owner owner$ui_release = requireLayoutNode(delegatableNode).getOwner$ui_release();
        if (owner$ui_release != null) {
            return owner$ui_release;
        }
        throw new IllegalStateException("This node does not have an owner.".toString());
    }

    public static final void visitAncestors(@l DelegatableNode delegatableNode, int i5, boolean z4, @l v3.l<? super Modifier.Node, r2> lVar) {
        Modifier.Node parent$ui_release;
        NodeChain nodes$ui_release;
        if (delegatableNode.getNode().isAttached()) {
            if (z4) {
                parent$ui_release = delegatableNode.getNode();
            } else {
                parent$ui_release = delegatableNode.getNode().getParent$ui_release();
            }
            LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
            while (requireLayoutNode != null) {
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i5) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & i5) != 0) {
                            lVar.invoke(parent$ui_release);
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
            return;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    public static /* synthetic */ void visitAncestors$default(DelegatableNode delegatableNode, int i5, boolean z4, v3.l lVar, int i6, Object obj) {
        Modifier.Node parent$ui_release;
        NodeChain nodes$ui_release;
        if ((i6 & 2) != 0) {
            z4 = false;
        }
        if (delegatableNode.getNode().isAttached()) {
            if (z4) {
                parent$ui_release = delegatableNode.getNode();
            } else {
                parent$ui_release = delegatableNode.getNode().getParent$ui_release();
            }
            LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
            while (requireLayoutNode != null) {
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i5) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & i5) != 0) {
                            lVar.invoke(parent$ui_release);
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
            return;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    /* renamed from: visitAncestors-Y-YKmho */
    public static final /* synthetic */ <T> void m5102visitAncestorsYYKmho(DelegatableNode delegatableNode, int i5, boolean z4, v3.l<? super T, r2> lVar) {
        Modifier.Node parent$ui_release;
        NodeChain nodes$ui_release;
        if (delegatableNode.getNode().isAttached()) {
            if (z4) {
                parent$ui_release = delegatableNode.getNode();
            } else {
                parent$ui_release = delegatableNode.getNode().getParent$ui_release();
            }
            LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
            while (requireLayoutNode != null) {
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i5) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & i5) != 0) {
                            for (Modifier.Node node = parent$ui_release; node != null; node = pop(null)) {
                                l0.y(3, "T");
                                lVar.invoke(node);
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
            return;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    /* renamed from: visitAncestors-Y-YKmho$default */
    public static /* synthetic */ void m5103visitAncestorsYYKmho$default(DelegatableNode delegatableNode, int i5, boolean z4, v3.l lVar, int i6, Object obj) {
        Modifier.Node parent$ui_release;
        NodeChain nodes$ui_release;
        if ((i6 & 2) != 0) {
            z4 = false;
        }
        if (delegatableNode.getNode().isAttached()) {
            if (z4) {
                parent$ui_release = delegatableNode.getNode();
            } else {
                parent$ui_release = delegatableNode.getNode().getParent$ui_release();
            }
            LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
            while (requireLayoutNode != null) {
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i5) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & i5) != 0) {
                            for (Modifier.Node node = parent$ui_release; node != null; node = pop(null)) {
                                l0.y(3, "T");
                                lVar.invoke(node);
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
            return;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    public static final void visitChildren(@l DelegatableNode delegatableNode, int i5, @l v3.l<? super Modifier.Node, r2> lVar) {
        if (delegatableNode.getNode().isAttached()) {
            MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
            Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                addLayoutNodeChildren(mutableVector, delegatableNode.getNode());
            } else {
                mutableVector.add(child$ui_release);
            }
            while (mutableVector.isNotEmpty()) {
                Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
                if ((node.getAggregateChildKindSet$ui_release() & i5) == 0) {
                    addLayoutNodeChildren(mutableVector, node);
                } else {
                    while (true) {
                        if (node == null) {
                            break;
                        }
                        if ((node.getKindSet$ui_release() & i5) != 0) {
                            lVar.invoke(node);
                            break;
                        }
                        node = node.getChild$ui_release();
                    }
                }
            }
            return;
        }
        throw new IllegalStateException("visitChildren called on an unattached node".toString());
    }

    /* renamed from: visitChildren-6rFNWt0 */
    public static final /* synthetic */ <T> void m5104visitChildren6rFNWt0(DelegatableNode delegatableNode, int i5, v3.l<? super T, r2> lVar) {
        if (delegatableNode.getNode().isAttached()) {
            MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
            Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                addLayoutNodeChildren(mutableVector, delegatableNode.getNode());
            } else {
                mutableVector.add(child$ui_release);
            }
            while (mutableVector.isNotEmpty()) {
                Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
                if ((node.getAggregateChildKindSet$ui_release() & i5) == 0) {
                    addLayoutNodeChildren(mutableVector, node);
                } else {
                    while (true) {
                        if (node == null) {
                            break;
                        }
                        if ((node.getKindSet$ui_release() & i5) != 0) {
                            while (node != null) {
                                l0.y(3, "T");
                                lVar.invoke(node);
                                node = pop(null);
                            }
                        } else {
                            node = node.getChild$ui_release();
                        }
                    }
                }
            }
            return;
        }
        throw new IllegalStateException("visitChildren called on an unattached node".toString());
    }

    public static final void visitLocalAncestors(@l DelegatableNode delegatableNode, int i5, @l v3.l<? super Modifier.Node, r2> lVar) {
        if (delegatableNode.getNode().isAttached()) {
            for (Modifier.Node parent$ui_release = delegatableNode.getNode().getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
                if ((parent$ui_release.getKindSet$ui_release() & i5) != 0) {
                    lVar.invoke(parent$ui_release);
                }
            }
            return;
        }
        throw new IllegalStateException("visitLocalAncestors called on an unattached node".toString());
    }

    /* renamed from: visitLocalAncestors-6rFNWt0 */
    public static final /* synthetic */ <T> void m5105visitLocalAncestors6rFNWt0(DelegatableNode delegatableNode, int i5, v3.l<? super T, r2> lVar) {
        if (delegatableNode.getNode().isAttached()) {
            for (Modifier.Node parent$ui_release = delegatableNode.getNode().getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
                if ((parent$ui_release.getKindSet$ui_release() & i5) != 0) {
                    for (Modifier.Node node = parent$ui_release; node != null; node = pop(null)) {
                        l0.y(3, "T");
                        lVar.invoke(node);
                    }
                }
            }
            return;
        }
        throw new IllegalStateException("visitLocalAncestors called on an unattached node".toString());
    }

    public static final void visitLocalDescendants(@l DelegatableNode delegatableNode, int i5, @l v3.l<? super Modifier.Node, r2> lVar) {
        if (delegatableNode.getNode().isAttached()) {
            Modifier.Node node = delegatableNode.getNode();
            if ((node.getAggregateChildKindSet$ui_release() & i5) == 0) {
                return;
            }
            for (Modifier.Node child$ui_release = node.getChild$ui_release(); child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
                if ((child$ui_release.getKindSet$ui_release() & i5) != 0) {
                    lVar.invoke(child$ui_release);
                }
            }
            return;
        }
        throw new IllegalStateException("visitLocalDescendants called on an unattached node".toString());
    }

    /* renamed from: visitLocalDescendants-6rFNWt0 */
    public static final /* synthetic */ <T> void m5106visitLocalDescendants6rFNWt0(DelegatableNode delegatableNode, int i5, v3.l<? super T, r2> lVar) {
        if (delegatableNode.getNode().isAttached()) {
            Modifier.Node node = delegatableNode.getNode();
            if ((node.getAggregateChildKindSet$ui_release() & i5) != 0) {
                for (Modifier.Node child$ui_release = node.getChild$ui_release(); child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
                    if ((child$ui_release.getKindSet$ui_release() & i5) != 0) {
                        for (Modifier.Node node2 = child$ui_release; node2 != null; node2 = pop(null)) {
                            l0.y(3, "T");
                            lVar.invoke(node2);
                        }
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("visitLocalDescendants called on an unattached node".toString());
    }

    /* renamed from: visitSelfAndAncestors-5BbP62I */
    public static final /* synthetic */ <T> void m5107visitSelfAndAncestors5BbP62I(DelegatableNode delegatableNode, int i5, int i6, v3.l<? super T, r2> lVar) {
        NodeChain nodes$ui_release;
        boolean z4;
        Modifier.Node node = delegatableNode.getNode();
        int i7 = i5 | i6;
        if (delegatableNode.getNode().isAttached()) {
            Modifier.Node node2 = delegatableNode.getNode();
            LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
            while (requireLayoutNode != null) {
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i7) != 0) {
                    while (node2 != null) {
                        if ((node2.getKindSet$ui_release() & i7) != 0) {
                            boolean z5 = true;
                            if (node2 != node) {
                                if ((node2.getKindSet$ui_release() & i6) != 0) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (z4) {
                                    return;
                                }
                            }
                            if ((node2.getKindSet$ui_release() & i5) == 0) {
                                z5 = false;
                            }
                            if (z5) {
                                for (Modifier.Node node3 = node2; node3 != null; node3 = pop(null)) {
                                    l0.y(3, "T");
                                    lVar.invoke(node3);
                                }
                            }
                        }
                        node2 = node2.getParent$ui_release();
                    }
                }
                requireLayoutNode = requireLayoutNode.getParent$ui_release();
                if (requireLayoutNode != null && (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) != null) {
                    node2 = nodes$ui_release.getTail$ui_release();
                } else {
                    node2 = null;
                }
            }
            return;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    /* renamed from: visitSelfAndChildren-6rFNWt0 */
    public static final /* synthetic */ <T> void m5108visitSelfAndChildren6rFNWt0(DelegatableNode delegatableNode, int i5, v3.l<? super T, r2> lVar) {
        for (Modifier.Node node = delegatableNode.getNode(); node != null; node = pop(null)) {
            l0.y(3, "T");
            lVar.invoke(node);
        }
        if (delegatableNode.getNode().isAttached()) {
            MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
            Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                addLayoutNodeChildren(mutableVector, delegatableNode.getNode());
            } else {
                mutableVector.add(child$ui_release);
            }
            while (mutableVector.isNotEmpty()) {
                Modifier.Node node2 = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
                if ((node2.getAggregateChildKindSet$ui_release() & i5) == 0) {
                    addLayoutNodeChildren(mutableVector, node2);
                } else {
                    while (true) {
                        if (node2 == null) {
                            break;
                        }
                        if ((node2.getKindSet$ui_release() & i5) != 0) {
                            while (node2 != null) {
                                l0.y(3, "T");
                                lVar.invoke(node2);
                                node2 = pop(null);
                            }
                        } else {
                            node2 = node2.getChild$ui_release();
                        }
                    }
                }
            }
            return;
        }
        throw new IllegalStateException("visitChildren called on an unattached node".toString());
    }

    public static final void visitSubtree(@l DelegatableNode delegatableNode, int i5, @l v3.l<? super Modifier.Node, r2> lVar) {
        if (delegatableNode.getNode().isAttached()) {
            Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
            LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
            NestedVectorStack nestedVectorStack = new NestedVectorStack();
            while (requireLayoutNode != null) {
                if (child$ui_release == null) {
                    child$ui_release = requireLayoutNode.getNodes$ui_release().getHead$ui_release();
                }
                if ((child$ui_release.getAggregateChildKindSet$ui_release() & i5) != 0) {
                    while (child$ui_release != null) {
                        if ((child$ui_release.getKindSet$ui_release() & i5) != 0) {
                            lVar.invoke(child$ui_release);
                        }
                        child$ui_release = child$ui_release.getChild$ui_release();
                    }
                }
                nestedVectorStack.push(requireLayoutNode.get_children$ui_release());
                child$ui_release = null;
                if (nestedVectorStack.isNotEmpty()) {
                    requireLayoutNode = (LayoutNode) nestedVectorStack.pop();
                } else {
                    requireLayoutNode = null;
                }
            }
            return;
        }
        throw new IllegalStateException("visitSubtree called on an unattached node".toString());
    }

    /* renamed from: visitSubtree-6rFNWt0 */
    public static final /* synthetic */ <T> void m5109visitSubtree6rFNWt0(DelegatableNode delegatableNode, int i5, v3.l<? super T, r2> lVar) {
        if (delegatableNode.getNode().isAttached()) {
            Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
            LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
            NestedVectorStack nestedVectorStack = new NestedVectorStack();
            while (requireLayoutNode != null) {
                if (child$ui_release == null) {
                    child$ui_release = requireLayoutNode.getNodes$ui_release().getHead$ui_release();
                }
                if ((child$ui_release.getAggregateChildKindSet$ui_release() & i5) != 0) {
                    while (child$ui_release != null) {
                        if ((child$ui_release.getKindSet$ui_release() & i5) != 0) {
                            for (Modifier.Node node = child$ui_release; node != null; node = pop(null)) {
                                l0.y(3, "T");
                                lVar.invoke(node);
                            }
                        }
                        child$ui_release = child$ui_release.getChild$ui_release();
                    }
                }
                nestedVectorStack.push(requireLayoutNode.get_children$ui_release());
                if (nestedVectorStack.isNotEmpty()) {
                    requireLayoutNode = (LayoutNode) nestedVectorStack.pop();
                } else {
                    requireLayoutNode = null;
                }
                child$ui_release = null;
            }
            return;
        }
        throw new IllegalStateException("visitSubtree called on an unattached node".toString());
    }

    public static final void visitSubtreeIf(@l DelegatableNode delegatableNode, int i5, @l v3.l<? super Modifier.Node, Boolean> lVar) {
        if (delegatableNode.getNode().isAttached()) {
            MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
            Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                addLayoutNodeChildren(mutableVector, delegatableNode.getNode());
            } else {
                mutableVector.add(child$ui_release);
            }
            while (mutableVector.isNotEmpty()) {
                Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
                if ((node.getAggregateChildKindSet$ui_release() & i5) != 0) {
                    for (Modifier.Node node2 = node; node2 != null; node2 = node2.getChild$ui_release()) {
                        if ((node2.getKindSet$ui_release() & i5) == 0 || lVar.invoke(node2).booleanValue()) {
                        }
                    }
                }
                addLayoutNodeChildren(mutableVector, node);
            }
            return;
        }
        throw new IllegalStateException("visitSubtreeIf called on an unattached node".toString());
    }

    /* renamed from: visitSubtreeIf-6rFNWt0 */
    public static final /* synthetic */ <T> void m5110visitSubtreeIf6rFNWt0(DelegatableNode delegatableNode, int i5, v3.l<? super T, Boolean> lVar) {
        boolean z4;
        if (delegatableNode.getNode().isAttached()) {
            MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
            Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                addLayoutNodeChildren(mutableVector, delegatableNode.getNode());
            } else {
                mutableVector.add(child$ui_release);
            }
            while (mutableVector.isNotEmpty()) {
                Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
                if ((node.getAggregateChildKindSet$ui_release() & i5) != 0) {
                    for (Modifier.Node node2 = node; node2 != null; node2 = node2.getChild$ui_release()) {
                        if ((node2.getKindSet$ui_release() & i5) != 0) {
                            Modifier.Node node3 = node2;
                            while (true) {
                                if (node3 != null) {
                                    l0.y(3, "T");
                                    if (!lVar.invoke(node3).booleanValue()) {
                                        z4 = false;
                                        break;
                                    }
                                    node3 = pop(null);
                                } else {
                                    z4 = true;
                                    break;
                                }
                            }
                            if (z4) {
                            }
                        }
                    }
                }
                addLayoutNodeChildren(mutableVector, node);
            }
            return;
        }
        throw new IllegalStateException("visitSubtreeIf called on an unattached node".toString());
    }
}
