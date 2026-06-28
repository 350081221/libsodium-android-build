package androidx.compose.ui.focus;

import android.view.KeyEvent;
import androidx.collection.MutableLongSet;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode;
import androidx.compose.ui.input.rotary.RotaryInputModifierNode;
import androidx.compose.ui.input.rotary.RotaryScrollEvent;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.ArrayList;
import kotlin.i0;
import kotlin.j0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.a;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010M\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070L\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\bN\u0010OJY\u0010\f\u001a\u00020\u0007\"\n\b\u0000\u0010\u0003\u0018\u0001*\u00020\u0002*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0082\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u000e\u001a\u0004\u0018\u00010\r*\u00020\u0002H\u0002J\u001a\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u001a\u001a\u00020\u0007H\u0016J\b\u0010\u001b\u001a\u00020\u0007H\u0016J\u0010\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0011H\u0016J\u0018\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u0011H\u0016J\u001a\u0010 \u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0013J\u001a\u0010\"\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0015H\u0016ø\u0001\u0000¢\u0006\u0004\b!\u0010\u0018J\u001a\u0010$\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0015H\u0016ø\u0001\u0000¢\u0006\u0004\b#\u0010\u0018J\u0010\u0010'\u001a\u00020\u00112\u0006\u0010&\u001a\u00020%H\u0016J\u0010\u0010*\u001a\u00020\u00072\u0006\u0010)\u001a\u00020(H\u0016J\u0010\u0010*\u001a\u00020\u00072\u0006\u0010)\u001a\u00020+H\u0016J\u0010\u0010*\u001a\u00020\u00072\u0006\u0010)\u001a\u00020,H\u0016J\n\u0010.\u001a\u0004\u0018\u00010-H\u0016R\"\u0010/\u001a\u00020(8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u00109\u001a\u0002088\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010>\u001a\u00020=8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\"\u0010C\u001a\u00020B8\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u0018\u0010J\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010K\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006P"}, d2 = {"Landroidx/compose/ui/focus/FocusOwnerImpl;", "Landroidx/compose/ui/focus/FocusOwner;", "Landroidx/compose/ui/node/DelegatableNode;", "T", "Landroidx/compose/ui/node/NodeKind;", "type", "Lkotlin/Function1;", "Lkotlin/r2;", "onPreVisit", "onVisit", "traverseAncestors-Y-YKmho", "(Landroidx/compose/ui/node/DelegatableNode;ILv3/l;Lv3/l;)V", "traverseAncestors", "Landroidx/compose/ui/Modifier$Node;", "lastLocalKeyInputNode", "Landroidx/compose/ui/focus/FocusDirection;", "focusDirection", "", "wrapAroundFocus-3ESFkO8", "(I)Z", "wrapAroundFocus", "Landroidx/compose/ui/input/key/KeyEvent;", "keyEvent", "validateKeyEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "validateKeyEvent", "takeFocus", "releaseFocus", TTDownloadField.TT_FORCE, "clearFocus", "refreshFocusEvents", "moveFocus-3ESFkO8", "moveFocus", "dispatchKeyEvent-ZmokQxo", "dispatchKeyEvent", "dispatchInterceptedSoftKeyboardEvent-ZmokQxo", "dispatchInterceptedSoftKeyboardEvent", "Landroidx/compose/ui/input/rotary/RotaryScrollEvent;", NotificationCompat.CATEGORY_EVENT, "dispatchRotaryEvent", "Landroidx/compose/ui/focus/FocusTargetNode;", "node", "scheduleInvalidation", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "Landroidx/compose/ui/geometry/Rect;", "getFocusRect", "rootFocusNode", "Landroidx/compose/ui/focus/FocusTargetNode;", "getRootFocusNode$ui_release", "()Landroidx/compose/ui/focus/FocusTargetNode;", "setRootFocusNode$ui_release", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "Landroidx/compose/ui/focus/FocusInvalidationManager;", "focusInvalidationManager", "Landroidx/compose/ui/focus/FocusInvalidationManager;", "Landroidx/compose/ui/focus/FocusTransactionManager;", "focusTransactionManager", "Landroidx/compose/ui/focus/FocusTransactionManager;", "getFocusTransactionManager", "()Landroidx/compose/ui/focus/FocusTransactionManager;", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "Landroidx/collection/MutableLongSet;", "keysCurrentlyDown", "Landroidx/collection/MutableLongSet;", "Lkotlin/Function0;", "onRequestApplyChangesListener", "<init>", "(Lv3/l;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nFocusOwnerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusOwnerImpl.kt\nandroidx/compose/ui/focus/FocusOwnerImpl\n+ 2 FocusTransactionManager.kt\nandroidx/compose/ui/focus/FocusTransactionManager\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 7 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 8 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 9 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 10 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 11 NodeKind.kt\nandroidx/compose/ui/node/NodeKind\n*L\n1#1,335:1\n266#1:420\n267#1:492\n268#1:499\n269#1:546\n270#1:593\n271#1:600\n266#1:671\n267#1:743\n268#1:750\n269#1:797\n270#1:844\n271#1:851\n266#1:922\n267#1:994\n268#1:1001\n269#1:1048\n270#1:1095\n271#1:1102\n39#2,7:336\n46#2,4:346\n1#3:343\n1#3:358\n1#3:429\n1#3:609\n1#3:680\n1#3:860\n1#3:931\n1#3:1111\n1#3:1281\n1#3:1293\n728#4,2:344\n96#5:350\n96#5:419\n104#5:601\n104#5:670\n98#5:852\n98#5:921\n90#5,7:1272\n90#5:1288\n262#6:351\n230#6,5:352\n58#6:357\n59#6,8:359\n385#6,5:367\n263#6:372\n390#6:373\n395#6,2:375\n397#6,8:380\n405#6,9:391\n414#6,8:403\n68#6,7:411\n265#6:418\n253#6,2:421\n230#6,5:423\n58#6:428\n59#6,8:430\n385#6,5:438\n255#6,3:443\n390#6:446\n395#6,2:448\n397#6,8:453\n405#6,9:464\n414#6,8:476\n68#6,7:484\n258#6:491\n385#6,12:500\n397#6,8:515\n405#6,9:526\n414#6,8:538\n385#6,12:547\n397#6,8:562\n405#6,9:573\n414#6,8:585\n262#6:602\n230#6,5:603\n58#6:608\n59#6,8:610\n385#6,5:618\n263#6:623\n390#6:624\n395#6,2:626\n397#6,8:631\n405#6,9:642\n414#6,8:654\n68#6,7:662\n265#6:669\n253#6,2:672\n230#6,5:674\n58#6:679\n59#6,8:681\n385#6,5:689\n255#6,3:694\n390#6:697\n395#6,2:699\n397#6,8:704\n405#6,9:715\n414#6,8:727\n68#6,7:735\n258#6:742\n385#6,12:751\n397#6,8:766\n405#6,9:777\n414#6,8:789\n385#6,12:798\n397#6,8:813\n405#6,9:824\n414#6,8:836\n262#6:853\n230#6,5:854\n58#6:859\n59#6,8:861\n385#6,5:869\n263#6:874\n390#6:875\n395#6,2:877\n397#6,8:882\n405#6,9:893\n414#6,8:905\n68#6,7:913\n265#6:920\n253#6,2:923\n230#6,5:925\n58#6:930\n59#6,8:932\n385#6,5:940\n255#6,3:945\n390#6:948\n395#6,2:950\n397#6,8:955\n405#6,9:966\n414#6,8:978\n68#6,7:986\n258#6:993\n385#6,12:1002\n397#6,8:1017\n405#6,9:1028\n414#6,8:1040\n385#6,12:1049\n397#6,8:1064\n405#6,9:1075\n414#6,8:1087\n253#6,2:1103\n230#6,5:1105\n58#6:1110\n59#6,8:1112\n385#6,5:1120\n255#6,3:1125\n390#6:1128\n395#6,2:1130\n397#6,8:1135\n405#6,9:1146\n414#6,8:1158\n68#6,7:1166\n258#6:1173\n385#6,6:1180\n395#6,2:1187\n397#6,8:1192\n405#6,9:1203\n414#6,8:1215\n385#6,6:1223\n395#6,2:1230\n397#6,8:1235\n405#6,9:1246\n414#6,8:1258\n190#6:1280\n191#6,6:1282\n198#6,3:1290\n261#7:374\n261#7:447\n261#7:625\n261#7:698\n261#7:876\n261#7:949\n261#7:1129\n261#7:1186\n261#7:1229\n261#7:1289\n234#8,3:377\n237#8,3:400\n234#8,3:450\n237#8,3:473\n234#8,3:512\n237#8,3:535\n234#8,3:559\n237#8,3:582\n234#8,3:628\n237#8,3:651\n234#8,3:701\n237#8,3:724\n234#8,3:763\n237#8,3:786\n234#8,3:810\n237#8,3:833\n234#8,3:879\n237#8,3:902\n234#8,3:952\n237#8,3:975\n234#8,3:1014\n237#8,3:1037\n234#8,3:1061\n237#8,3:1084\n234#8,3:1132\n237#8,3:1155\n234#8,3:1189\n237#8,3:1212\n234#8,3:1232\n237#8,3:1255\n1208#9:388\n1187#9,2:389\n1208#9:461\n1187#9,2:462\n1208#9:523\n1187#9,2:524\n1208#9:570\n1187#9,2:571\n1208#9:639\n1187#9,2:640\n1208#9:712\n1187#9,2:713\n1208#9:774\n1187#9,2:775\n1208#9:821\n1187#9,2:822\n1208#9:890\n1187#9,2:891\n1208#9:963\n1187#9,2:964\n1208#9:1025\n1187#9,2:1026\n1208#9:1072\n1187#9,2:1073\n1208#9:1143\n1187#9,2:1144\n1208#9:1200\n1187#9,2:1201\n1208#9:1243\n1187#9,2:1244\n51#10,6:493\n33#10,6:594\n51#10,6:744\n33#10,6:845\n51#10,6:995\n33#10,6:1096\n51#10,6:1174\n33#10,6:1266\n47#11:1279\n*S KotlinDebug\n*F\n+ 1 FocusOwnerImpl.kt\nandroidx/compose/ui/focus/FocusOwnerImpl\n*L\n212#1:420\n212#1:492\n212#1:499\n212#1:546\n212#1:593\n212#1:600\n225#1:671\n225#1:743\n225#1:750\n225#1:797\n225#1:844\n225#1:851\n240#1:922\n240#1:994\n240#1:1001\n240#1:1048\n240#1:1095\n240#1:1102\n138#1:336,7\n138#1:346,4\n138#1:343\n210#1:358\n212#1:429\n223#1:609\n225#1:680\n238#1:860\n240#1:931\n266#1:1111\n282#1:1281\n138#1:344,2\n210#1:350\n213#1:419\n223#1:601\n226#1:670\n238#1:852\n241#1:921\n282#1:1272,7\n283#1:1288\n210#1:351\n210#1:352,5\n210#1:357\n210#1:359,8\n210#1:367,5\n210#1:372\n210#1:373\n210#1:375,2\n210#1:380,8\n210#1:391,9\n210#1:403,8\n210#1:411,7\n210#1:418\n212#1:421,2\n212#1:423,5\n212#1:428\n212#1:430,8\n212#1:438,5\n212#1:443,3\n212#1:446\n212#1:448,2\n212#1:453,8\n212#1:464,9\n212#1:476,8\n212#1:484,7\n212#1:491\n212#1:500,12\n212#1:515,8\n212#1:526,9\n212#1:538,8\n212#1:547,12\n212#1:562,8\n212#1:573,9\n212#1:585,8\n223#1:602\n223#1:603,5\n223#1:608\n223#1:610,8\n223#1:618,5\n223#1:623\n223#1:624\n223#1:626,2\n223#1:631,8\n223#1:642,9\n223#1:654,8\n223#1:662,7\n223#1:669\n225#1:672,2\n225#1:674,5\n225#1:679\n225#1:681,8\n225#1:689,5\n225#1:694,3\n225#1:697\n225#1:699,2\n225#1:704,8\n225#1:715,9\n225#1:727,8\n225#1:735,7\n225#1:742\n225#1:751,12\n225#1:766,8\n225#1:777,9\n225#1:789,8\n225#1:798,12\n225#1:813,8\n225#1:824,9\n225#1:836,8\n238#1:853\n238#1:854,5\n238#1:859\n238#1:861,8\n238#1:869,5\n238#1:874\n238#1:875\n238#1:877,2\n238#1:882,8\n238#1:893,9\n238#1:905,8\n238#1:913,7\n238#1:920\n240#1:923,2\n240#1:925,5\n240#1:930\n240#1:932,8\n240#1:940,5\n240#1:945,3\n240#1:948\n240#1:950,2\n240#1:955,8\n240#1:966,9\n240#1:978,8\n240#1:986,7\n240#1:993\n240#1:1002,12\n240#1:1017,8\n240#1:1028,9\n240#1:1040,8\n240#1:1049,12\n240#1:1064,8\n240#1:1075,9\n240#1:1087,8\n266#1:1103,2\n266#1:1105,5\n266#1:1110\n266#1:1112,8\n266#1:1120,5\n266#1:1125,3\n266#1:1128\n266#1:1130,2\n266#1:1135,8\n266#1:1146,9\n266#1:1158,8\n266#1:1166,7\n266#1:1173\n268#1:1180,6\n268#1:1187,2\n268#1:1192,8\n268#1:1203,9\n268#1:1215,8\n269#1:1223,6\n269#1:1230,2\n269#1:1235,8\n269#1:1246,9\n269#1:1258,8\n282#1:1280\n282#1:1282,6\n282#1:1290,3\n210#1:374\n212#1:447\n223#1:625\n225#1:698\n238#1:876\n240#1:949\n266#1:1129\n268#1:1186\n269#1:1229\n283#1:1289\n210#1:377,3\n210#1:400,3\n212#1:450,3\n212#1:473,3\n212#1:512,3\n212#1:535,3\n212#1:559,3\n212#1:582,3\n223#1:628,3\n223#1:651,3\n225#1:701,3\n225#1:724,3\n225#1:763,3\n225#1:786,3\n225#1:810,3\n225#1:833,3\n238#1:879,3\n238#1:902,3\n240#1:952,3\n240#1:975,3\n240#1:1014,3\n240#1:1037,3\n240#1:1061,3\n240#1:1084,3\n266#1:1132,3\n266#1:1155,3\n268#1:1189,3\n268#1:1212,3\n269#1:1232,3\n269#1:1255,3\n210#1:388\n210#1:389,2\n212#1:461\n212#1:462,2\n212#1:523\n212#1:524,2\n212#1:570\n212#1:571,2\n223#1:639\n223#1:640,2\n225#1:712\n225#1:713,2\n225#1:774\n225#1:775,2\n225#1:821\n225#1:822,2\n238#1:890\n238#1:891,2\n240#1:963\n240#1:964,2\n240#1:1025\n240#1:1026,2\n240#1:1072\n240#1:1073,2\n266#1:1143\n266#1:1144,2\n268#1:1200\n268#1:1201,2\n269#1:1243\n269#1:1244,2\n212#1:493,6\n212#1:594,6\n225#1:744,6\n225#1:845,6\n240#1:995,6\n240#1:1096,6\n267#1:1174,6\n270#1:1266,6\n282#1:1279\n*E\n"})
/* loaded from: classes.dex */
public final class FocusOwnerImpl implements FocusOwner {
    public static final int $stable = 8;

    @l
    private final FocusInvalidationManager focusInvalidationManager;

    @m
    private MutableLongSet keysCurrentlyDown;
    public LayoutDirection layoutDirection;

    @l
    private FocusTargetNode rootFocusNode = new FocusTargetNode();

    @l
    private final FocusTransactionManager focusTransactionManager = new FocusTransactionManager();

    @l
    private final Modifier modifier = new ModifierNodeElement<FocusTargetNode>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
        @Override // androidx.compose.ui.node.ModifierNodeElement
        public boolean equals(@m Object obj) {
            return obj == this;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public int hashCode() {
            return FocusOwnerImpl.this.getRootFocusNode$ui_release().hashCode();
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void inspectableProperties(@l InspectorInfo inspectorInfo) {
            inspectorInfo.setName("RootFocusTarget");
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void update(@l FocusTargetNode focusTargetNode) {
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        @l
        public FocusTargetNode create() {
            return FocusOwnerImpl.this.getRootFocusNode$ui_release();
        }
    };

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CustomDestinationResult.values().length];
            try {
                iArr[CustomDestinationResult.Redirected.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CustomDestinationResult.Cancelled.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CustomDestinationResult.RedirectCancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CustomDestinationResult.None.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FocusStateImpl.values().length];
            try {
                iArr2[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[FocusStateImpl.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[FocusStateImpl.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public FocusOwnerImpl(@l v3.l<? super a<r2>, r2> lVar) {
        this.focusInvalidationManager = new FocusInvalidationManager(lVar);
    }

    private final Modifier.Node lastLocalKeyInputNode(DelegatableNode delegatableNode) {
        boolean z4;
        int m5204constructorimpl = NodeKind.m5204constructorimpl(1024) | NodeKind.m5204constructorimpl(8192);
        if (delegatableNode.getNode().isAttached()) {
            Modifier.Node node = delegatableNode.getNode();
            Modifier.Node node2 = null;
            if ((node.getAggregateChildKindSet$ui_release() & m5204constructorimpl) != 0) {
                for (Modifier.Node child$ui_release = node.getChild$ui_release(); child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
                    if ((child$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                        if ((NodeKind.m5204constructorimpl(1024) & child$ui_release.getKindSet$ui_release()) != 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            return node2;
                        }
                        node2 = child$ui_release;
                    }
                }
            }
            return node2;
        }
        throw new IllegalStateException("visitLocalDescendants called on an unattached node".toString());
    }

    /* renamed from: traverseAncestors-Y-YKmho, reason: not valid java name */
    private final /* synthetic */ <T extends DelegatableNode> void m3430traverseAncestorsYYKmho(DelegatableNode delegatableNode, int i5, v3.l<? super T, r2> lVar, v3.l<? super T, r2> lVar2) {
        int size;
        NodeChain nodes$ui_release;
        if (delegatableNode.getNode().isAttached()) {
            Modifier.Node parent$ui_release = delegatableNode.getNode().getParent$ui_release();
            LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
            ArrayList arrayList = null;
            while (requireLayoutNode != null) {
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i5) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & i5) != 0) {
                            for (Modifier.Node node = parent$ui_release; node != null; node = DelegatableNodeKt.pop(null)) {
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
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i6 = size - 1;
                    lVar.invoke((Object) arrayList.get(size));
                    if (i6 < 0) {
                        break;
                    } else {
                        size = i6;
                    }
                }
            }
            for (Modifier.Node node2 = delegatableNode.getNode(); node2 != null; node2 = DelegatableNodeKt.pop(null)) {
                l0.y(3, "T");
                lVar.invoke(node2);
            }
            for (Modifier.Node node3 = delegatableNode.getNode(); node3 != null; node3 = DelegatableNodeKt.pop(null)) {
                l0.y(3, "T");
                lVar2.invoke(node3);
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    lVar2.invoke((Object) arrayList.get(i7));
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    /* renamed from: validateKeyEvent-ZmokQxo, reason: not valid java name */
    private final boolean m3431validateKeyEventZmokQxo(KeyEvent keyEvent) {
        boolean z4;
        long m4736getKeyZmokQxo = KeyEvent_androidKt.m4736getKeyZmokQxo(keyEvent);
        int m4737getTypeZmokQxo = KeyEvent_androidKt.m4737getTypeZmokQxo(keyEvent);
        KeyEventType.Companion companion = KeyEventType.Companion;
        if (KeyEventType.m4729equalsimpl0(m4737getTypeZmokQxo, companion.m4733getKeyDownCS__XNY())) {
            MutableLongSet mutableLongSet = this.keysCurrentlyDown;
            if (mutableLongSet == null) {
                mutableLongSet = new MutableLongSet(3);
                this.keysCurrentlyDown = mutableLongSet;
            }
            mutableLongSet.plusAssign(m4736getKeyZmokQxo);
        } else if (KeyEventType.m4729equalsimpl0(m4737getTypeZmokQxo, companion.m4734getKeyUpCS__XNY())) {
            MutableLongSet mutableLongSet2 = this.keysCurrentlyDown;
            if (mutableLongSet2 != null && mutableLongSet2.contains(m4736getKeyZmokQxo)) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                return false;
            }
            MutableLongSet mutableLongSet3 = this.keysCurrentlyDown;
            if (mutableLongSet3 != null) {
                mutableLongSet3.remove(m4736getKeyZmokQxo);
            }
        }
        return true;
    }

    /* renamed from: wrapAroundFocus-3ESFkO8, reason: not valid java name */
    private final boolean m3432wrapAroundFocus3ESFkO8(int i5) {
        boolean m3413equalsimpl0;
        if (this.rootFocusNode.getFocusState().getHasFocus() && !this.rootFocusNode.getFocusState().isFocused()) {
            FocusDirection.Companion companion = FocusDirection.Companion;
            if (FocusDirection.m3413equalsimpl0(i5, companion.m3423getNextdhqQ8s())) {
                m3413equalsimpl0 = true;
            } else {
                m3413equalsimpl0 = FocusDirection.m3413equalsimpl0(i5, companion.m3424getPreviousdhqQ8s());
            }
            if (m3413equalsimpl0) {
                clearFocus(false);
                if (!this.rootFocusNode.getFocusState().isFocused()) {
                    return false;
                }
                return mo3427moveFocus3ESFkO8(i5);
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.focus.FocusManager
    public void clearFocus(boolean z4) {
        clearFocus(z4, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    @Override // androidx.compose.ui.focus.FocusOwner
    /* renamed from: dispatchInterceptedSoftKeyboardEvent-ZmokQxo */
    public boolean mo3428dispatchInterceptedSoftKeyboardEventZmokQxo(@l KeyEvent keyEvent) {
        SoftKeyboardInterceptionModifierNode softKeyboardInterceptionModifierNode;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        int size;
        NodeChain nodes$ui_release;
        boolean z8;
        boolean z9;
        DelegatingNode delegatingNode;
        NodeChain nodes$ui_release2;
        boolean z10;
        boolean z11;
        FocusTargetNode findActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        if (findActiveFocusNode != null) {
            int m5204constructorimpl = NodeKind.m5204constructorimpl(131072);
            if (findActiveFocusNode.getNode().isAttached()) {
                Modifier.Node parent$ui_release = findActiveFocusNode.getNode().getParent$ui_release();
                LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(findActiveFocusNode);
                loop0: while (true) {
                    if (requireLayoutNode != null) {
                        if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m5204constructorimpl) != 0) {
                            while (parent$ui_release != null) {
                                if ((parent$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                    MutableVector mutableVector = null;
                                    delegatingNode = parent$ui_release;
                                    while (delegatingNode != 0) {
                                        if (delegatingNode instanceof SoftKeyboardInterceptionModifierNode) {
                                            break loop0;
                                        }
                                        if ((delegatingNode.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        if (z10 && (delegatingNode instanceof DelegatingNode)) {
                                            Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                                            int i5 = 0;
                                            delegatingNode = delegatingNode;
                                            while (delegate$ui_release != null) {
                                                if ((delegate$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                if (z11) {
                                                    i5++;
                                                    if (i5 == 1) {
                                                        delegatingNode = delegate$ui_release;
                                                    } else {
                                                        if (mutableVector == null) {
                                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                        }
                                                        if (delegatingNode != 0) {
                                                            mutableVector.add(delegatingNode);
                                                            delegatingNode = 0;
                                                        }
                                                        mutableVector.add(delegate$ui_release);
                                                    }
                                                }
                                                delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                                delegatingNode = delegatingNode;
                                            }
                                            if (i5 == 1) {
                                            }
                                        }
                                        delegatingNode = DelegatableNodeKt.pop(mutableVector);
                                    }
                                }
                                parent$ui_release = parent$ui_release.getParent$ui_release();
                            }
                        }
                        requireLayoutNode = requireLayoutNode.getParent$ui_release();
                        if (requireLayoutNode != null && (nodes$ui_release2 = requireLayoutNode.getNodes$ui_release()) != null) {
                            parent$ui_release = nodes$ui_release2.getTail$ui_release();
                        } else {
                            parent$ui_release = null;
                        }
                    } else {
                        delegatingNode = 0;
                        break;
                    }
                }
                softKeyboardInterceptionModifierNode = (SoftKeyboardInterceptionModifierNode) delegatingNode;
            } else {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
        } else {
            softKeyboardInterceptionModifierNode = null;
        }
        if (softKeyboardInterceptionModifierNode != null) {
            int m5204constructorimpl2 = NodeKind.m5204constructorimpl(131072);
            if (softKeyboardInterceptionModifierNode.getNode().isAttached()) {
                Modifier.Node parent$ui_release2 = softKeyboardInterceptionModifierNode.getNode().getParent$ui_release();
                LayoutNode requireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(softKeyboardInterceptionModifierNode);
                ArrayList arrayList = null;
                while (requireLayoutNode2 != null) {
                    if ((requireLayoutNode2.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m5204constructorimpl2) != 0) {
                        while (parent$ui_release2 != null) {
                            if ((parent$ui_release2.getKindSet$ui_release() & m5204constructorimpl2) != 0) {
                                Modifier.Node node = parent$ui_release2;
                                MutableVector mutableVector2 = null;
                                while (node != null) {
                                    if (node instanceof SoftKeyboardInterceptionModifierNode) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(node);
                                    } else {
                                        if ((node.getKindSet$ui_release() & m5204constructorimpl2) != 0) {
                                            z8 = true;
                                        } else {
                                            z8 = false;
                                        }
                                        if (z8 && (node instanceof DelegatingNode)) {
                                            int i6 = 0;
                                            for (Modifier.Node delegate$ui_release2 = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release2 != null; delegate$ui_release2 = delegate$ui_release2.getChild$ui_release()) {
                                                if ((delegate$ui_release2.getKindSet$ui_release() & m5204constructorimpl2) != 0) {
                                                    z9 = true;
                                                } else {
                                                    z9 = false;
                                                }
                                                if (z9) {
                                                    i6++;
                                                    if (i6 == 1) {
                                                        node = delegate$ui_release2;
                                                    } else {
                                                        if (mutableVector2 == null) {
                                                            mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                        }
                                                        if (node != null) {
                                                            mutableVector2.add(node);
                                                            node = null;
                                                        }
                                                        mutableVector2.add(delegate$ui_release2);
                                                    }
                                                }
                                            }
                                            if (i6 == 1) {
                                            }
                                        }
                                    }
                                    node = DelegatableNodeKt.pop(mutableVector2);
                                }
                            }
                            parent$ui_release2 = parent$ui_release2.getParent$ui_release();
                        }
                    }
                    requireLayoutNode2 = requireLayoutNode2.getParent$ui_release();
                    if (requireLayoutNode2 != null && (nodes$ui_release = requireLayoutNode2.getNodes$ui_release()) != null) {
                        parent$ui_release2 = nodes$ui_release.getTail$ui_release();
                    } else {
                        parent$ui_release2 = null;
                    }
                }
                if (arrayList != null && arrayList.size() - 1 >= 0) {
                    while (true) {
                        int i7 = size - 1;
                        if (((SoftKeyboardInterceptionModifierNode) arrayList.get(size)).mo4424onPreInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                            return true;
                        }
                        if (i7 < 0) {
                            break;
                        }
                        size = i7;
                    }
                }
                DelegatingNode node2 = softKeyboardInterceptionModifierNode.getNode();
                MutableVector mutableVector3 = null;
                while (node2 != 0) {
                    if (node2 instanceof SoftKeyboardInterceptionModifierNode) {
                        if (((SoftKeyboardInterceptionModifierNode) node2).mo4424onPreInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                            return true;
                        }
                    } else {
                        if ((node2.getKindSet$ui_release() & m5204constructorimpl2) != 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (z6 && (node2 instanceof DelegatingNode)) {
                            Modifier.Node delegate$ui_release3 = node2.getDelegate$ui_release();
                            int i8 = 0;
                            node2 = node2;
                            while (delegate$ui_release3 != null) {
                                if ((delegate$ui_release3.getKindSet$ui_release() & m5204constructorimpl2) != 0) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                if (z7) {
                                    i8++;
                                    if (i8 == 1) {
                                        node2 = delegate$ui_release3;
                                    } else {
                                        if (mutableVector3 == null) {
                                            mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (node2 != 0) {
                                            mutableVector3.add(node2);
                                            node2 = 0;
                                        }
                                        mutableVector3.add(delegate$ui_release3);
                                    }
                                }
                                delegate$ui_release3 = delegate$ui_release3.getChild$ui_release();
                                node2 = node2;
                            }
                            if (i8 == 1) {
                            }
                        }
                    }
                    node2 = DelegatableNodeKt.pop(mutableVector3);
                }
                DelegatingNode node3 = softKeyboardInterceptionModifierNode.getNode();
                MutableVector mutableVector4 = null;
                while (node3 != 0) {
                    if (node3 instanceof SoftKeyboardInterceptionModifierNode) {
                        if (((SoftKeyboardInterceptionModifierNode) node3).mo4423onInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                            return true;
                        }
                    } else {
                        if ((node3.getKindSet$ui_release() & m5204constructorimpl2) != 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4 && (node3 instanceof DelegatingNode)) {
                            Modifier.Node delegate$ui_release4 = node3.getDelegate$ui_release();
                            int i9 = 0;
                            node3 = node3;
                            while (delegate$ui_release4 != null) {
                                if ((delegate$ui_release4.getKindSet$ui_release() & m5204constructorimpl2) != 0) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (z5) {
                                    i9++;
                                    if (i9 == 1) {
                                        node3 = delegate$ui_release4;
                                    } else {
                                        if (mutableVector4 == null) {
                                            mutableVector4 = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (node3 != 0) {
                                            mutableVector4.add(node3);
                                            node3 = 0;
                                        }
                                        mutableVector4.add(delegate$ui_release4);
                                    }
                                }
                                delegate$ui_release4 = delegate$ui_release4.getChild$ui_release();
                                node3 = node3;
                            }
                            if (i9 == 1) {
                            }
                        }
                    }
                    node3 = DelegatableNodeKt.pop(mutableVector4);
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        if (((SoftKeyboardInterceptionModifierNode) arrayList.get(i10)).mo4423onInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                            return true;
                        }
                    }
                }
            } else {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v40 */
    /* JADX WARN: Type inference failed for: r9v41, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v42 */
    /* JADX WARN: Type inference failed for: r9v43, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v44, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v45 */
    /* JADX WARN: Type inference failed for: r9v46 */
    /* JADX WARN: Type inference failed for: r9v47 */
    /* JADX WARN: Type inference failed for: r9v48 */
    /* JADX WARN: Type inference failed for: r9v49 */
    /* JADX WARN: Type inference failed for: r9v50 */
    @Override // androidx.compose.ui.focus.FocusOwner
    /* renamed from: dispatchKeyEvent-ZmokQxo */
    public boolean mo3429dispatchKeyEventZmokQxo(@l KeyEvent keyEvent) {
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        int size;
        NodeChain nodes$ui_release;
        boolean z8;
        boolean z9;
        DelegatingNode delegatingNode;
        NodeChain nodes$ui_release2;
        boolean z10;
        boolean z11;
        if (!m3431validateKeyEventZmokQxo(keyEvent)) {
            return false;
        }
        FocusTargetNode findActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        if (findActiveFocusNode != null) {
            Modifier.Node lastLocalKeyInputNode = lastLocalKeyInputNode(findActiveFocusNode);
            if (lastLocalKeyInputNode == null) {
                int m5204constructorimpl = NodeKind.m5204constructorimpl(8192);
                if (findActiveFocusNode.getNode().isAttached()) {
                    Modifier.Node parent$ui_release = findActiveFocusNode.getNode().getParent$ui_release();
                    LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(findActiveFocusNode);
                    loop0: while (true) {
                        if (requireLayoutNode != null) {
                            if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m5204constructorimpl) != 0) {
                                while (parent$ui_release != null) {
                                    if ((parent$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                        MutableVector mutableVector = null;
                                        delegatingNode = parent$ui_release;
                                        while (delegatingNode != 0) {
                                            if (delegatingNode instanceof KeyInputModifierNode) {
                                                break loop0;
                                            }
                                            if ((delegatingNode.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            if (z10 && (delegatingNode instanceof DelegatingNode)) {
                                                Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                                                int i5 = 0;
                                                delegatingNode = delegatingNode;
                                                while (delegate$ui_release != null) {
                                                    if ((delegate$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                                        z11 = true;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    if (z11) {
                                                        i5++;
                                                        if (i5 == 1) {
                                                            delegatingNode = delegate$ui_release;
                                                        } else {
                                                            if (mutableVector == null) {
                                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                            }
                                                            if (delegatingNode != 0) {
                                                                mutableVector.add(delegatingNode);
                                                                delegatingNode = 0;
                                                            }
                                                            mutableVector.add(delegate$ui_release);
                                                        }
                                                    }
                                                    delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                                    delegatingNode = delegatingNode;
                                                }
                                                if (i5 == 1) {
                                                }
                                            }
                                            delegatingNode = DelegatableNodeKt.pop(mutableVector);
                                        }
                                    }
                                    parent$ui_release = parent$ui_release.getParent$ui_release();
                                }
                            }
                            requireLayoutNode = requireLayoutNode.getParent$ui_release();
                            if (requireLayoutNode != null && (nodes$ui_release2 = requireLayoutNode.getNodes$ui_release()) != null) {
                                parent$ui_release = nodes$ui_release2.getTail$ui_release();
                            } else {
                                parent$ui_release = null;
                            }
                        } else {
                            delegatingNode = 0;
                            break;
                        }
                    }
                    KeyInputModifierNode keyInputModifierNode = (KeyInputModifierNode) delegatingNode;
                    if (keyInputModifierNode != null) {
                        lastLocalKeyInputNode = keyInputModifierNode.getNode();
                    } else {
                        lastLocalKeyInputNode = null;
                    }
                } else {
                    throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                }
            }
            if (lastLocalKeyInputNode != null) {
                int m5204constructorimpl2 = NodeKind.m5204constructorimpl(8192);
                if (lastLocalKeyInputNode.getNode().isAttached()) {
                    Modifier.Node parent$ui_release2 = lastLocalKeyInputNode.getNode().getParent$ui_release();
                    LayoutNode requireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(lastLocalKeyInputNode);
                    ArrayList arrayList = null;
                    while (requireLayoutNode2 != null) {
                        if ((requireLayoutNode2.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m5204constructorimpl2) != 0) {
                            while (parent$ui_release2 != null) {
                                if ((parent$ui_release2.getKindSet$ui_release() & m5204constructorimpl2) != 0) {
                                    Modifier.Node node = parent$ui_release2;
                                    MutableVector mutableVector2 = null;
                                    while (node != null) {
                                        if (node instanceof KeyInputModifierNode) {
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                            }
                                            arrayList.add(node);
                                        } else {
                                            if ((node.getKindSet$ui_release() & m5204constructorimpl2) != 0) {
                                                z8 = true;
                                            } else {
                                                z8 = false;
                                            }
                                            if (z8 && (node instanceof DelegatingNode)) {
                                                int i6 = 0;
                                                for (Modifier.Node delegate$ui_release2 = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release2 != null; delegate$ui_release2 = delegate$ui_release2.getChild$ui_release()) {
                                                    if ((delegate$ui_release2.getKindSet$ui_release() & m5204constructorimpl2) != 0) {
                                                        z9 = true;
                                                    } else {
                                                        z9 = false;
                                                    }
                                                    if (z9) {
                                                        i6++;
                                                        if (i6 == 1) {
                                                            node = delegate$ui_release2;
                                                        } else {
                                                            if (mutableVector2 == null) {
                                                                mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                            }
                                                            if (node != null) {
                                                                mutableVector2.add(node);
                                                                node = null;
                                                            }
                                                            mutableVector2.add(delegate$ui_release2);
                                                        }
                                                    }
                                                }
                                                if (i6 == 1) {
                                                }
                                            }
                                        }
                                        node = DelegatableNodeKt.pop(mutableVector2);
                                    }
                                }
                                parent$ui_release2 = parent$ui_release2.getParent$ui_release();
                            }
                        }
                        requireLayoutNode2 = requireLayoutNode2.getParent$ui_release();
                        if (requireLayoutNode2 != null && (nodes$ui_release = requireLayoutNode2.getNodes$ui_release()) != null) {
                            parent$ui_release2 = nodes$ui_release.getTail$ui_release();
                        } else {
                            parent$ui_release2 = null;
                        }
                    }
                    if (arrayList != null && arrayList.size() - 1 >= 0) {
                        while (true) {
                            int i7 = size - 1;
                            if (((KeyInputModifierNode) arrayList.get(size)).mo171onPreKeyEventZmokQxo(keyEvent)) {
                                return true;
                            }
                            if (i7 < 0) {
                                break;
                            }
                            size = i7;
                        }
                    }
                    DelegatingNode node2 = lastLocalKeyInputNode.getNode();
                    MutableVector mutableVector3 = null;
                    while (node2 != 0) {
                        if (node2 instanceof KeyInputModifierNode) {
                            if (((KeyInputModifierNode) node2).mo171onPreKeyEventZmokQxo(keyEvent)) {
                                return true;
                            }
                        } else {
                            if ((node2.getKindSet$ui_release() & m5204constructorimpl2) != 0) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (z6 && (node2 instanceof DelegatingNode)) {
                                Modifier.Node delegate$ui_release3 = node2.getDelegate$ui_release();
                                int i8 = 0;
                                node2 = node2;
                                while (delegate$ui_release3 != null) {
                                    if ((delegate$ui_release3.getKindSet$ui_release() & m5204constructorimpl2) != 0) {
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    if (z7) {
                                        i8++;
                                        if (i8 == 1) {
                                            node2 = delegate$ui_release3;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node2 != 0) {
                                                mutableVector3.add(node2);
                                                node2 = 0;
                                            }
                                            mutableVector3.add(delegate$ui_release3);
                                        }
                                    }
                                    delegate$ui_release3 = delegate$ui_release3.getChild$ui_release();
                                    node2 = node2;
                                }
                                if (i8 == 1) {
                                }
                            }
                        }
                        node2 = DelegatableNodeKt.pop(mutableVector3);
                    }
                    DelegatingNode node3 = lastLocalKeyInputNode.getNode();
                    MutableVector mutableVector4 = null;
                    while (node3 != 0) {
                        if (node3 instanceof KeyInputModifierNode) {
                            if (((KeyInputModifierNode) node3).mo169onKeyEventZmokQxo(keyEvent)) {
                                return true;
                            }
                        } else {
                            if ((node3.getKindSet$ui_release() & m5204constructorimpl2) != 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z4 && (node3 instanceof DelegatingNode)) {
                                Modifier.Node delegate$ui_release4 = node3.getDelegate$ui_release();
                                int i9 = 0;
                                node3 = node3;
                                while (delegate$ui_release4 != null) {
                                    if ((delegate$ui_release4.getKindSet$ui_release() & m5204constructorimpl2) != 0) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    if (z5) {
                                        i9++;
                                        if (i9 == 1) {
                                            node3 = delegate$ui_release4;
                                        } else {
                                            if (mutableVector4 == null) {
                                                mutableVector4 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node3 != 0) {
                                                mutableVector4.add(node3);
                                                node3 = 0;
                                            }
                                            mutableVector4.add(delegate$ui_release4);
                                        }
                                    }
                                    delegate$ui_release4 = delegate$ui_release4.getChild$ui_release();
                                    node3 = node3;
                                }
                                if (i9 == 1) {
                                }
                            }
                        }
                        node3 = DelegatableNodeKt.pop(mutableVector4);
                    }
                    if (arrayList != null) {
                        int size2 = arrayList.size();
                        for (int i10 = 0; i10 < size2; i10++) {
                            if (((KeyInputModifierNode) arrayList.get(i10)).mo169onKeyEventZmokQxo(keyEvent)) {
                                return true;
                            }
                        }
                    }
                } else {
                    throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                }
            }
            return false;
        }
        throw new IllegalStateException("Event can't be processed because we do not have an active focus target.".toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    @Override // androidx.compose.ui.focus.FocusOwner
    public boolean dispatchRotaryEvent(@l RotaryScrollEvent rotaryScrollEvent) {
        RotaryInputModifierNode rotaryInputModifierNode;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        int size;
        NodeChain nodes$ui_release;
        boolean z8;
        boolean z9;
        DelegatingNode delegatingNode;
        NodeChain nodes$ui_release2;
        boolean z10;
        boolean z11;
        FocusTargetNode findActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        if (findActiveFocusNode != null) {
            int m5204constructorimpl = NodeKind.m5204constructorimpl(16384);
            if (findActiveFocusNode.getNode().isAttached()) {
                Modifier.Node parent$ui_release = findActiveFocusNode.getNode().getParent$ui_release();
                LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(findActiveFocusNode);
                loop0: while (true) {
                    if (requireLayoutNode != null) {
                        if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m5204constructorimpl) != 0) {
                            while (parent$ui_release != null) {
                                if ((parent$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                    MutableVector mutableVector = null;
                                    delegatingNode = parent$ui_release;
                                    while (delegatingNode != 0) {
                                        if (delegatingNode instanceof RotaryInputModifierNode) {
                                            break loop0;
                                        }
                                        if ((delegatingNode.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        if (z10 && (delegatingNode instanceof DelegatingNode)) {
                                            Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                                            int i5 = 0;
                                            delegatingNode = delegatingNode;
                                            while (delegate$ui_release != null) {
                                                if ((delegate$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                if (z11) {
                                                    i5++;
                                                    if (i5 == 1) {
                                                        delegatingNode = delegate$ui_release;
                                                    } else {
                                                        if (mutableVector == null) {
                                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                        }
                                                        if (delegatingNode != 0) {
                                                            mutableVector.add(delegatingNode);
                                                            delegatingNode = 0;
                                                        }
                                                        mutableVector.add(delegate$ui_release);
                                                    }
                                                }
                                                delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                                delegatingNode = delegatingNode;
                                            }
                                            if (i5 == 1) {
                                            }
                                        }
                                        delegatingNode = DelegatableNodeKt.pop(mutableVector);
                                    }
                                }
                                parent$ui_release = parent$ui_release.getParent$ui_release();
                            }
                        }
                        requireLayoutNode = requireLayoutNode.getParent$ui_release();
                        if (requireLayoutNode != null && (nodes$ui_release2 = requireLayoutNode.getNodes$ui_release()) != null) {
                            parent$ui_release = nodes$ui_release2.getTail$ui_release();
                        } else {
                            parent$ui_release = null;
                        }
                    } else {
                        delegatingNode = 0;
                        break;
                    }
                }
                rotaryInputModifierNode = (RotaryInputModifierNode) delegatingNode;
            } else {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
        } else {
            rotaryInputModifierNode = null;
        }
        if (rotaryInputModifierNode != null) {
            int m5204constructorimpl2 = NodeKind.m5204constructorimpl(16384);
            if (rotaryInputModifierNode.getNode().isAttached()) {
                Modifier.Node parent$ui_release2 = rotaryInputModifierNode.getNode().getParent$ui_release();
                LayoutNode requireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(rotaryInputModifierNode);
                ArrayList arrayList = null;
                while (requireLayoutNode2 != null) {
                    if ((requireLayoutNode2.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m5204constructorimpl2) != 0) {
                        while (parent$ui_release2 != null) {
                            if ((parent$ui_release2.getKindSet$ui_release() & m5204constructorimpl2) != 0) {
                                Modifier.Node node = parent$ui_release2;
                                MutableVector mutableVector2 = null;
                                while (node != null) {
                                    if (node instanceof RotaryInputModifierNode) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(node);
                                    } else {
                                        if ((node.getKindSet$ui_release() & m5204constructorimpl2) != 0) {
                                            z8 = true;
                                        } else {
                                            z8 = false;
                                        }
                                        if (z8 && (node instanceof DelegatingNode)) {
                                            int i6 = 0;
                                            for (Modifier.Node delegate$ui_release2 = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release2 != null; delegate$ui_release2 = delegate$ui_release2.getChild$ui_release()) {
                                                if ((delegate$ui_release2.getKindSet$ui_release() & m5204constructorimpl2) != 0) {
                                                    z9 = true;
                                                } else {
                                                    z9 = false;
                                                }
                                                if (z9) {
                                                    i6++;
                                                    if (i6 == 1) {
                                                        node = delegate$ui_release2;
                                                    } else {
                                                        if (mutableVector2 == null) {
                                                            mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                        }
                                                        if (node != null) {
                                                            mutableVector2.add(node);
                                                            node = null;
                                                        }
                                                        mutableVector2.add(delegate$ui_release2);
                                                    }
                                                }
                                            }
                                            if (i6 == 1) {
                                            }
                                        }
                                    }
                                    node = DelegatableNodeKt.pop(mutableVector2);
                                }
                            }
                            parent$ui_release2 = parent$ui_release2.getParent$ui_release();
                        }
                    }
                    requireLayoutNode2 = requireLayoutNode2.getParent$ui_release();
                    if (requireLayoutNode2 != null && (nodes$ui_release = requireLayoutNode2.getNodes$ui_release()) != null) {
                        parent$ui_release2 = nodes$ui_release.getTail$ui_release();
                    } else {
                        parent$ui_release2 = null;
                    }
                }
                if (arrayList != null && arrayList.size() - 1 >= 0) {
                    while (true) {
                        int i7 = size - 1;
                        if (((RotaryInputModifierNode) arrayList.get(size)).onPreRotaryScrollEvent(rotaryScrollEvent)) {
                            return true;
                        }
                        if (i7 < 0) {
                            break;
                        }
                        size = i7;
                    }
                }
                DelegatingNode node2 = rotaryInputModifierNode.getNode();
                MutableVector mutableVector3 = null;
                while (node2 != 0) {
                    if (node2 instanceof RotaryInputModifierNode) {
                        if (((RotaryInputModifierNode) node2).onPreRotaryScrollEvent(rotaryScrollEvent)) {
                            return true;
                        }
                    } else {
                        if ((node2.getKindSet$ui_release() & m5204constructorimpl2) != 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (z6 && (node2 instanceof DelegatingNode)) {
                            Modifier.Node delegate$ui_release3 = node2.getDelegate$ui_release();
                            int i8 = 0;
                            node2 = node2;
                            while (delegate$ui_release3 != null) {
                                if ((delegate$ui_release3.getKindSet$ui_release() & m5204constructorimpl2) != 0) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                if (z7) {
                                    i8++;
                                    if (i8 == 1) {
                                        node2 = delegate$ui_release3;
                                    } else {
                                        if (mutableVector3 == null) {
                                            mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (node2 != 0) {
                                            mutableVector3.add(node2);
                                            node2 = 0;
                                        }
                                        mutableVector3.add(delegate$ui_release3);
                                    }
                                }
                                delegate$ui_release3 = delegate$ui_release3.getChild$ui_release();
                                node2 = node2;
                            }
                            if (i8 == 1) {
                            }
                        }
                    }
                    node2 = DelegatableNodeKt.pop(mutableVector3);
                }
                DelegatingNode node3 = rotaryInputModifierNode.getNode();
                MutableVector mutableVector4 = null;
                while (node3 != 0) {
                    if (node3 instanceof RotaryInputModifierNode) {
                        if (((RotaryInputModifierNode) node3).onRotaryScrollEvent(rotaryScrollEvent)) {
                            return true;
                        }
                    } else {
                        if ((node3.getKindSet$ui_release() & m5204constructorimpl2) != 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4 && (node3 instanceof DelegatingNode)) {
                            Modifier.Node delegate$ui_release4 = node3.getDelegate$ui_release();
                            int i9 = 0;
                            node3 = node3;
                            while (delegate$ui_release4 != null) {
                                if ((delegate$ui_release4.getKindSet$ui_release() & m5204constructorimpl2) != 0) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (z5) {
                                    i9++;
                                    if (i9 == 1) {
                                        node3 = delegate$ui_release4;
                                    } else {
                                        if (mutableVector4 == null) {
                                            mutableVector4 = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (node3 != 0) {
                                            mutableVector4.add(node3);
                                            node3 = 0;
                                        }
                                        mutableVector4.add(delegate$ui_release4);
                                    }
                                }
                                delegate$ui_release4 = delegate$ui_release4.getChild$ui_release();
                                node3 = node3;
                            }
                            if (i9 == 1) {
                            }
                        }
                    }
                    node3 = DelegatableNodeKt.pop(mutableVector4);
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        if (((RotaryInputModifierNode) arrayList.get(i10)).onRotaryScrollEvent(rotaryScrollEvent)) {
                            return true;
                        }
                    }
                }
            } else {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    @m
    public Rect getFocusRect() {
        FocusTargetNode findActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        if (findActiveFocusNode != null) {
            return FocusTraversalKt.focusRect(findActiveFocusNode);
        }
        return null;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    @l
    public FocusTransactionManager getFocusTransactionManager() {
        return this.focusTransactionManager;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    @l
    public LayoutDirection getLayoutDirection() {
        LayoutDirection layoutDirection = this.layoutDirection;
        if (layoutDirection != null) {
            return layoutDirection;
        }
        l0.S("layoutDirection");
        return null;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    @l
    public Modifier getModifier() {
        return this.modifier;
    }

    @l
    public final FocusTargetNode getRootFocusNode$ui_release() {
        return this.rootFocusNode;
    }

    @Override // androidx.compose.ui.focus.FocusManager
    /* renamed from: moveFocus-3ESFkO8 */
    public boolean mo3427moveFocus3ESFkO8(int i5) {
        FocusTargetNode findActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        if (findActiveFocusNode == null) {
            return false;
        }
        FocusRequester m3445customFocusSearchOMvw8 = FocusTraversalKt.m3445customFocusSearchOMvw8(findActiveFocusNode, i5, getLayoutDirection());
        FocusRequester.Companion companion = FocusRequester.Companion;
        if (m3445customFocusSearchOMvw8 != companion.getDefault()) {
            if (m3445customFocusSearchOMvw8 == companion.getCancel() || !m3445customFocusSearchOMvw8.focus$ui_release()) {
                return false;
            }
            return true;
        }
        k1.a aVar = new k1.a();
        boolean m3446focusSearchsMXa3k8 = FocusTraversalKt.m3446focusSearchsMXa3k8(this.rootFocusNode, i5, getLayoutDirection(), new FocusOwnerImpl$moveFocus$foundNextItem$1(findActiveFocusNode, this, i5, aVar));
        if (aVar.element) {
            return false;
        }
        if (!m3446focusSearchsMXa3k8 && !m3432wrapAroundFocus3ESFkO8(i5)) {
            return false;
        }
        return true;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void releaseFocus() {
        FocusTransactionsKt.clearFocus(this.rootFocusNode, true, true);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void scheduleInvalidation(@l FocusTargetNode focusTargetNode) {
        this.focusInvalidationManager.scheduleInvalidation(focusTargetNode);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void setLayoutDirection(@l LayoutDirection layoutDirection) {
        this.layoutDirection = layoutDirection;
    }

    public final void setRootFocusNode$ui_release(@l FocusTargetNode focusTargetNode) {
        this.rootFocusNode = focusTargetNode;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void takeFocus() {
        if (this.rootFocusNode.getFocusState() == FocusStateImpl.Inactive) {
            this.rootFocusNode.setFocusState(FocusStateImpl.Active);
        }
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void clearFocus(boolean z4, boolean z5) {
        FocusStateImpl focusStateImpl;
        FocusTransactionManager focusTransactionManager = getFocusTransactionManager();
        try {
            if (focusTransactionManager.ongoingTransaction) {
                focusTransactionManager.cancelTransaction();
            }
            focusTransactionManager.beginTransaction();
            if (!z4) {
                int i5 = WhenMappings.$EnumSwitchMapping$0[FocusTransactionsKt.m3441performCustomClearFocusMxy_nc0(this.rootFocusNode, FocusDirection.Companion.m3421getExitdhqQ8s()).ordinal()];
                if (i5 == 1 || i5 == 2 || i5 == 3) {
                    return;
                }
            }
            FocusStateImpl focusState = this.rootFocusNode.getFocusState();
            if (FocusTransactionsKt.clearFocus(this.rootFocusNode, z4, z5)) {
                FocusTargetNode focusTargetNode = this.rootFocusNode;
                int i6 = WhenMappings.$EnumSwitchMapping$1[focusState.ordinal()];
                if (i6 == 1 || i6 == 2 || i6 == 3) {
                    focusStateImpl = FocusStateImpl.Active;
                } else {
                    if (i6 != 4) {
                        throw new j0();
                    }
                    focusStateImpl = FocusStateImpl.Inactive;
                }
                focusTargetNode.setFocusState(focusStateImpl);
            }
            r2 r2Var = r2.f19517a;
        } finally {
            focusTransactionManager.commitTransaction();
        }
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void scheduleInvalidation(@l FocusEventModifierNode focusEventModifierNode) {
        this.focusInvalidationManager.scheduleInvalidation(focusEventModifierNode);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void scheduleInvalidation(@l FocusPropertiesModifierNode focusPropertiesModifierNode) {
        this.focusInvalidationManager.scheduleInvalidation(focusPropertiesModifierNode);
    }
}
