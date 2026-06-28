.class public final Landroidx/compose/ui/focus/FocusOwnerImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/focus/FocusOwner;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/focus/FocusOwnerImpl$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010M\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070L\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0004\u0008N\u0010OJY\u0010\u000c\u001a\u00020\u0007\"\n\u0008\u0000\u0010\u0003\u0018\u0001*\u00020\u0002*\u00020\u00022\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00042\u0012\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0082\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000e\u0010\u000e\u001a\u0004\u0018\u00010\r*\u00020\u0002H\u0002J\u001a\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001a\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0008\u0010\u001a\u001a\u00020\u0007H\u0016J\u0008\u0010\u001b\u001a\u00020\u0007H\u0016J\u0010\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0011H\u0016J\u0018\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u0011H\u0016J\u001a\u0010 \u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001f\u0010\u0013J\u001a\u0010\"\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0015H\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008!\u0010\u0018J\u001a\u0010$\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0015H\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008#\u0010\u0018J\u0010\u0010\'\u001a\u00020\u00112\u0006\u0010&\u001a\u00020%H\u0016J\u0010\u0010*\u001a\u00020\u00072\u0006\u0010)\u001a\u00020(H\u0016J\u0010\u0010*\u001a\u00020\u00072\u0006\u0010)\u001a\u00020+H\u0016J\u0010\u0010*\u001a\u00020\u00072\u0006\u0010)\u001a\u00020,H\u0016J\n\u0010.\u001a\u0004\u0018\u00010-H\u0016R\"\u0010/\u001a\u00020(8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008/\u00100\u001a\u0004\u00081\u00102\"\u0004\u00083\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00086\u00107R\u001a\u00109\u001a\u0002088\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u00089\u0010:\u001a\u0004\u0008;\u0010<R\u001a\u0010>\u001a\u00020=8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008>\u0010?\u001a\u0004\u0008@\u0010AR\"\u0010C\u001a\u00020B8\u0016@\u0016X\u0096.\u00a2\u0006\u0012\n\u0004\u0008C\u0010D\u001a\u0004\u0008E\u0010F\"\u0004\u0008G\u0010HR\u0018\u0010J\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008J\u0010K\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006P"
    }
    d2 = {
        "Landroidx/compose/ui/focus/FocusOwnerImpl;",
        "Landroidx/compose/ui/focus/FocusOwner;",
        "Landroidx/compose/ui/node/DelegatableNode;",
        "T",
        "Landroidx/compose/ui/node/NodeKind;",
        "type",
        "Lkotlin/Function1;",
        "Lkotlin/r2;",
        "onPreVisit",
        "onVisit",
        "traverseAncestors-Y-YKmho",
        "(Landroidx/compose/ui/node/DelegatableNode;ILv3/l;Lv3/l;)V",
        "traverseAncestors",
        "Landroidx/compose/ui/Modifier$Node;",
        "lastLocalKeyInputNode",
        "Landroidx/compose/ui/focus/FocusDirection;",
        "focusDirection",
        "",
        "wrapAroundFocus-3ESFkO8",
        "(I)Z",
        "wrapAroundFocus",
        "Landroidx/compose/ui/input/key/KeyEvent;",
        "keyEvent",
        "validateKeyEvent-ZmokQxo",
        "(Landroid/view/KeyEvent;)Z",
        "validateKeyEvent",
        "takeFocus",
        "releaseFocus",
        "force",
        "clearFocus",
        "refreshFocusEvents",
        "moveFocus-3ESFkO8",
        "moveFocus",
        "dispatchKeyEvent-ZmokQxo",
        "dispatchKeyEvent",
        "dispatchInterceptedSoftKeyboardEvent-ZmokQxo",
        "dispatchInterceptedSoftKeyboardEvent",
        "Landroidx/compose/ui/input/rotary/RotaryScrollEvent;",
        "event",
        "dispatchRotaryEvent",
        "Landroidx/compose/ui/focus/FocusTargetNode;",
        "node",
        "scheduleInvalidation",
        "Landroidx/compose/ui/focus/FocusEventModifierNode;",
        "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;",
        "Landroidx/compose/ui/geometry/Rect;",
        "getFocusRect",
        "rootFocusNode",
        "Landroidx/compose/ui/focus/FocusTargetNode;",
        "getRootFocusNode$ui_release",
        "()Landroidx/compose/ui/focus/FocusTargetNode;",
        "setRootFocusNode$ui_release",
        "(Landroidx/compose/ui/focus/FocusTargetNode;)V",
        "Landroidx/compose/ui/focus/FocusInvalidationManager;",
        "focusInvalidationManager",
        "Landroidx/compose/ui/focus/FocusInvalidationManager;",
        "Landroidx/compose/ui/focus/FocusTransactionManager;",
        "focusTransactionManager",
        "Landroidx/compose/ui/focus/FocusTransactionManager;",
        "getFocusTransactionManager",
        "()Landroidx/compose/ui/focus/FocusTransactionManager;",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "getModifier",
        "()Landroidx/compose/ui/Modifier;",
        "Landroidx/compose/ui/unit/LayoutDirection;",
        "layoutDirection",
        "Landroidx/compose/ui/unit/LayoutDirection;",
        "getLayoutDirection",
        "()Landroidx/compose/ui/unit/LayoutDirection;",
        "setLayoutDirection",
        "(Landroidx/compose/ui/unit/LayoutDirection;)V",
        "Landroidx/collection/MutableLongSet;",
        "keysCurrentlyDown",
        "Landroidx/collection/MutableLongSet;",
        "Lkotlin/Function0;",
        "onRequestApplyChangesListener",
        "<init>",
        "(Lv3/l;)V",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nFocusOwnerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusOwnerImpl.kt\nandroidx/compose/ui/focus/FocusOwnerImpl\n+ 2 FocusTransactionManager.kt\nandroidx/compose/ui/focus/FocusTransactionManager\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 7 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 8 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 9 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 10 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 11 NodeKind.kt\nandroidx/compose/ui/node/NodeKind\n*L\n1#1,335:1\n266#1:420\n267#1:492\n268#1:499\n269#1:546\n270#1:593\n271#1:600\n266#1:671\n267#1:743\n268#1:750\n269#1:797\n270#1:844\n271#1:851\n266#1:922\n267#1:994\n268#1:1001\n269#1:1048\n270#1:1095\n271#1:1102\n39#2,7:336\n46#2,4:346\n1#3:343\n1#3:358\n1#3:429\n1#3:609\n1#3:680\n1#3:860\n1#3:931\n1#3:1111\n1#3:1281\n1#3:1293\n728#4,2:344\n96#5:350\n96#5:419\n104#5:601\n104#5:670\n98#5:852\n98#5:921\n90#5,7:1272\n90#5:1288\n262#6:351\n230#6,5:352\n58#6:357\n59#6,8:359\n385#6,5:367\n263#6:372\n390#6:373\n395#6,2:375\n397#6,8:380\n405#6,9:391\n414#6,8:403\n68#6,7:411\n265#6:418\n253#6,2:421\n230#6,5:423\n58#6:428\n59#6,8:430\n385#6,5:438\n255#6,3:443\n390#6:446\n395#6,2:448\n397#6,8:453\n405#6,9:464\n414#6,8:476\n68#6,7:484\n258#6:491\n385#6,12:500\n397#6,8:515\n405#6,9:526\n414#6,8:538\n385#6,12:547\n397#6,8:562\n405#6,9:573\n414#6,8:585\n262#6:602\n230#6,5:603\n58#6:608\n59#6,8:610\n385#6,5:618\n263#6:623\n390#6:624\n395#6,2:626\n397#6,8:631\n405#6,9:642\n414#6,8:654\n68#6,7:662\n265#6:669\n253#6,2:672\n230#6,5:674\n58#6:679\n59#6,8:681\n385#6,5:689\n255#6,3:694\n390#6:697\n395#6,2:699\n397#6,8:704\n405#6,9:715\n414#6,8:727\n68#6,7:735\n258#6:742\n385#6,12:751\n397#6,8:766\n405#6,9:777\n414#6,8:789\n385#6,12:798\n397#6,8:813\n405#6,9:824\n414#6,8:836\n262#6:853\n230#6,5:854\n58#6:859\n59#6,8:861\n385#6,5:869\n263#6:874\n390#6:875\n395#6,2:877\n397#6,8:882\n405#6,9:893\n414#6,8:905\n68#6,7:913\n265#6:920\n253#6,2:923\n230#6,5:925\n58#6:930\n59#6,8:932\n385#6,5:940\n255#6,3:945\n390#6:948\n395#6,2:950\n397#6,8:955\n405#6,9:966\n414#6,8:978\n68#6,7:986\n258#6:993\n385#6,12:1002\n397#6,8:1017\n405#6,9:1028\n414#6,8:1040\n385#6,12:1049\n397#6,8:1064\n405#6,9:1075\n414#6,8:1087\n253#6,2:1103\n230#6,5:1105\n58#6:1110\n59#6,8:1112\n385#6,5:1120\n255#6,3:1125\n390#6:1128\n395#6,2:1130\n397#6,8:1135\n405#6,9:1146\n414#6,8:1158\n68#6,7:1166\n258#6:1173\n385#6,6:1180\n395#6,2:1187\n397#6,8:1192\n405#6,9:1203\n414#6,8:1215\n385#6,6:1223\n395#6,2:1230\n397#6,8:1235\n405#6,9:1246\n414#6,8:1258\n190#6:1280\n191#6,6:1282\n198#6,3:1290\n261#7:374\n261#7:447\n261#7:625\n261#7:698\n261#7:876\n261#7:949\n261#7:1129\n261#7:1186\n261#7:1229\n261#7:1289\n234#8,3:377\n237#8,3:400\n234#8,3:450\n237#8,3:473\n234#8,3:512\n237#8,3:535\n234#8,3:559\n237#8,3:582\n234#8,3:628\n237#8,3:651\n234#8,3:701\n237#8,3:724\n234#8,3:763\n237#8,3:786\n234#8,3:810\n237#8,3:833\n234#8,3:879\n237#8,3:902\n234#8,3:952\n237#8,3:975\n234#8,3:1014\n237#8,3:1037\n234#8,3:1061\n237#8,3:1084\n234#8,3:1132\n237#8,3:1155\n234#8,3:1189\n237#8,3:1212\n234#8,3:1232\n237#8,3:1255\n1208#9:388\n1187#9,2:389\n1208#9:461\n1187#9,2:462\n1208#9:523\n1187#9,2:524\n1208#9:570\n1187#9,2:571\n1208#9:639\n1187#9,2:640\n1208#9:712\n1187#9,2:713\n1208#9:774\n1187#9,2:775\n1208#9:821\n1187#9,2:822\n1208#9:890\n1187#9,2:891\n1208#9:963\n1187#9,2:964\n1208#9:1025\n1187#9,2:1026\n1208#9:1072\n1187#9,2:1073\n1208#9:1143\n1187#9,2:1144\n1208#9:1200\n1187#9,2:1201\n1208#9:1243\n1187#9,2:1244\n51#10,6:493\n33#10,6:594\n51#10,6:744\n33#10,6:845\n51#10,6:995\n33#10,6:1096\n51#10,6:1174\n33#10,6:1266\n47#11:1279\n*S KotlinDebug\n*F\n+ 1 FocusOwnerImpl.kt\nandroidx/compose/ui/focus/FocusOwnerImpl\n*L\n212#1:420\n212#1:492\n212#1:499\n212#1:546\n212#1:593\n212#1:600\n225#1:671\n225#1:743\n225#1:750\n225#1:797\n225#1:844\n225#1:851\n240#1:922\n240#1:994\n240#1:1001\n240#1:1048\n240#1:1095\n240#1:1102\n138#1:336,7\n138#1:346,4\n138#1:343\n210#1:358\n212#1:429\n223#1:609\n225#1:680\n238#1:860\n240#1:931\n266#1:1111\n282#1:1281\n138#1:344,2\n210#1:350\n213#1:419\n223#1:601\n226#1:670\n238#1:852\n241#1:921\n282#1:1272,7\n283#1:1288\n210#1:351\n210#1:352,5\n210#1:357\n210#1:359,8\n210#1:367,5\n210#1:372\n210#1:373\n210#1:375,2\n210#1:380,8\n210#1:391,9\n210#1:403,8\n210#1:411,7\n210#1:418\n212#1:421,2\n212#1:423,5\n212#1:428\n212#1:430,8\n212#1:438,5\n212#1:443,3\n212#1:446\n212#1:448,2\n212#1:453,8\n212#1:464,9\n212#1:476,8\n212#1:484,7\n212#1:491\n212#1:500,12\n212#1:515,8\n212#1:526,9\n212#1:538,8\n212#1:547,12\n212#1:562,8\n212#1:573,9\n212#1:585,8\n223#1:602\n223#1:603,5\n223#1:608\n223#1:610,8\n223#1:618,5\n223#1:623\n223#1:624\n223#1:626,2\n223#1:631,8\n223#1:642,9\n223#1:654,8\n223#1:662,7\n223#1:669\n225#1:672,2\n225#1:674,5\n225#1:679\n225#1:681,8\n225#1:689,5\n225#1:694,3\n225#1:697\n225#1:699,2\n225#1:704,8\n225#1:715,9\n225#1:727,8\n225#1:735,7\n225#1:742\n225#1:751,12\n225#1:766,8\n225#1:777,9\n225#1:789,8\n225#1:798,12\n225#1:813,8\n225#1:824,9\n225#1:836,8\n238#1:853\n238#1:854,5\n238#1:859\n238#1:861,8\n238#1:869,5\n238#1:874\n238#1:875\n238#1:877,2\n238#1:882,8\n238#1:893,9\n238#1:905,8\n238#1:913,7\n238#1:920\n240#1:923,2\n240#1:925,5\n240#1:930\n240#1:932,8\n240#1:940,5\n240#1:945,3\n240#1:948\n240#1:950,2\n240#1:955,8\n240#1:966,9\n240#1:978,8\n240#1:986,7\n240#1:993\n240#1:1002,12\n240#1:1017,8\n240#1:1028,9\n240#1:1040,8\n240#1:1049,12\n240#1:1064,8\n240#1:1075,9\n240#1:1087,8\n266#1:1103,2\n266#1:1105,5\n266#1:1110\n266#1:1112,8\n266#1:1120,5\n266#1:1125,3\n266#1:1128\n266#1:1130,2\n266#1:1135,8\n266#1:1146,9\n266#1:1158,8\n266#1:1166,7\n266#1:1173\n268#1:1180,6\n268#1:1187,2\n268#1:1192,8\n268#1:1203,9\n268#1:1215,8\n269#1:1223,6\n269#1:1230,2\n269#1:1235,8\n269#1:1246,9\n269#1:1258,8\n282#1:1280\n282#1:1282,6\n282#1:1290,3\n210#1:374\n212#1:447\n223#1:625\n225#1:698\n238#1:876\n240#1:949\n266#1:1129\n268#1:1186\n269#1:1229\n283#1:1289\n210#1:377,3\n210#1:400,3\n212#1:450,3\n212#1:473,3\n212#1:512,3\n212#1:535,3\n212#1:559,3\n212#1:582,3\n223#1:628,3\n223#1:651,3\n225#1:701,3\n225#1:724,3\n225#1:763,3\n225#1:786,3\n225#1:810,3\n225#1:833,3\n238#1:879,3\n238#1:902,3\n240#1:952,3\n240#1:975,3\n240#1:1014,3\n240#1:1037,3\n240#1:1061,3\n240#1:1084,3\n266#1:1132,3\n266#1:1155,3\n268#1:1189,3\n268#1:1212,3\n269#1:1232,3\n269#1:1255,3\n210#1:388\n210#1:389,2\n212#1:461\n212#1:462,2\n212#1:523\n212#1:524,2\n212#1:570\n212#1:571,2\n223#1:639\n223#1:640,2\n225#1:712\n225#1:713,2\n225#1:774\n225#1:775,2\n225#1:821\n225#1:822,2\n238#1:890\n238#1:891,2\n240#1:963\n240#1:964,2\n240#1:1025\n240#1:1026,2\n240#1:1072\n240#1:1073,2\n266#1:1143\n266#1:1144,2\n268#1:1200\n268#1:1201,2\n269#1:1243\n269#1:1244,2\n212#1:493,6\n212#1:594,6\n225#1:744,6\n225#1:845,6\n240#1:995,6\n240#1:1096,6\n267#1:1174,6\n270#1:1266,6\n282#1:1279\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final focusInvalidationManager:Landroidx/compose/ui/focus/FocusInvalidationManager;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final focusTransactionManager:Landroidx/compose/ui/focus/FocusTransactionManager;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private keysCurrentlyDown:Landroidx/collection/MutableLongSet;
    .annotation build Lp4/m;
    .end annotation
.end field

.field public layoutDirection:Landroidx/compose/ui/unit/LayoutDirection;

.field private final modifier:Landroidx/compose/ui/Modifier;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lv3/l;)V
    .locals 1
    .param p1    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/l<",
            "-",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 5
    .line 6
    invoke-direct {v0}, Landroidx/compose/ui/focus/FocusTargetNode;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;

    .line 10
    .line 11
    new-instance v0, Landroidx/compose/ui/focus/FocusInvalidationManager;

    .line 12
    .line 13
    invoke-direct {v0, p1}, Landroidx/compose/ui/focus/FocusInvalidationManager;-><init>(Lv3/l;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->focusInvalidationManager:Landroidx/compose/ui/focus/FocusInvalidationManager;

    .line 17
    .line 18
    new-instance p1, Landroidx/compose/ui/focus/FocusTransactionManager;

    .line 19
    .line 20
    invoke-direct {p1}, Landroidx/compose/ui/focus/FocusTransactionManager;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->focusTransactionManager:Landroidx/compose/ui/focus/FocusTransactionManager;

    .line 24
    .line 25
    new-instance p1, Landroidx/compose/ui/focus/FocusOwnerImpl$modifier$1;

    .line 26
    .line 27
    invoke-direct {p1, p0}, Landroidx/compose/ui/focus/FocusOwnerImpl$modifier$1;-><init>(Landroidx/compose/ui/focus/FocusOwnerImpl;)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->modifier:Landroidx/compose/ui/Modifier;

    .line 31
    .line 32
    return-void
.end method

.method private final lastLocalKeyInputNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/Modifier$Node;
    .locals 5

    .line 1
    const/16 v0, 0x400

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/16 v2, 0x2000

    .line 8
    .line 9
    invoke-static {v2}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    or-int/2addr v1, v2

    .line 14
    invoke-interface {p1}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v2}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_4

    .line 23
    .line 24
    invoke-interface {p1}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p1}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    and-int/2addr v2, v1

    .line 33
    const/4 v3, 0x0

    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    invoke-virtual {p1}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    :goto_0
    if-eqz p1, :cond_3

    .line 41
    .line 42
    invoke-virtual {p1}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    and-int/2addr v2, v1

    .line 47
    if-eqz v2, :cond_2

    .line 48
    .line 49
    invoke-static {v0}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    invoke-virtual {p1}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    and-int/2addr v2, v4

    .line 58
    if-eqz v2, :cond_0

    .line 59
    .line 60
    const/4 v2, 0x1

    .line 61
    goto :goto_1

    .line 62
    :cond_0
    const/4 v2, 0x0

    .line 63
    :goto_1
    if-eqz v2, :cond_1

    .line 64
    .line 65
    return-object v3

    .line 66
    :cond_1
    move-object v3, p1

    .line 67
    :cond_2
    invoke-virtual {p1}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    goto :goto_0

    .line 72
    :cond_3
    return-object v3

    .line 73
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 74
    .line 75
    const-string/jumbo v0, "visitLocalDescendants called on an unattached node"

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    throw p1
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method

.method private final synthetic traverseAncestors-Y-YKmho(Landroidx/compose/ui/node/DelegatableNode;ILv3/l;Lv3/l;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Landroidx/compose/ui/node/DelegatableNode;",
            ">(",
            "Landroidx/compose/ui/node/DelegatableNode;",
            "I",
            "Lv3/l<",
            "-TT;",
            "Lkotlin/r2;",
            ">;",
            "Lv3/l<",
            "-TT;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_a

    .line 10
    .line 11
    invoke-interface {p1}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {p1}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const/4 v2, 0x0

    .line 24
    move-object v3, v2

    .line 25
    :goto_0
    const-string v4, "T"

    .line 26
    .line 27
    const/4 v5, 0x3

    .line 28
    if-eqz v1, :cond_4

    .line 29
    .line 30
    invoke-virtual {v1}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    invoke-virtual {v6}, Landroidx/compose/ui/node/NodeChain;->getHead$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    invoke-virtual {v6}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    and-int/2addr v6, p2

    .line 43
    if-eqz v6, :cond_2

    .line 44
    .line 45
    :goto_1
    if-eqz v0, :cond_2

    .line 46
    .line 47
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    and-int/2addr v6, p2

    .line 52
    if-eqz v6, :cond_1

    .line 53
    .line 54
    move-object v6, v0

    .line 55
    :goto_2
    if-eqz v6, :cond_1

    .line 56
    .line 57
    invoke-static {v5, v4}, Lkotlin/jvm/internal/l0;->y(ILjava/lang/String;)V

    .line 58
    .line 59
    .line 60
    if-nez v3, :cond_0

    .line 61
    .line 62
    new-instance v3, Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 65
    .line 66
    .line 67
    :cond_0
    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    invoke-static {v2}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    goto :goto_2

    .line 75
    :cond_1
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    goto :goto_1

    .line 80
    :cond_2
    invoke-virtual {v1}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    if-eqz v1, :cond_3

    .line 85
    .line 86
    invoke-virtual {v1}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    if-eqz v0, :cond_3

    .line 91
    .line 92
    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeChain;->getTail$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    goto :goto_0

    .line 97
    :cond_3
    move-object v0, v2

    .line 98
    goto :goto_0

    .line 99
    :cond_4
    if-eqz v3, :cond_6

    .line 100
    .line 101
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 102
    .line 103
    .line 104
    move-result p2

    .line 105
    add-int/lit8 p2, p2, -0x1

    .line 106
    .line 107
    if-ltz p2, :cond_6

    .line 108
    .line 109
    :goto_3
    add-int/lit8 v0, p2, -0x1

    .line 110
    .line 111
    invoke-interface {v3, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    invoke-interface {p3, p2}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    if-gez v0, :cond_5

    .line 119
    .line 120
    goto :goto_4

    .line 121
    :cond_5
    move p2, v0

    .line 122
    goto :goto_3

    .line 123
    :cond_6
    :goto_4
    invoke-interface {p1}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 124
    .line 125
    .line 126
    move-result-object p2

    .line 127
    :goto_5
    if-eqz p2, :cond_7

    .line 128
    .line 129
    invoke-static {v5, v4}, Lkotlin/jvm/internal/l0;->y(ILjava/lang/String;)V

    .line 130
    .line 131
    .line 132
    invoke-interface {p3, p2}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    invoke-static {v2}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    .line 136
    .line 137
    .line 138
    move-result-object p2

    .line 139
    goto :goto_5

    .line 140
    :cond_7
    invoke-interface {p1}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    :goto_6
    if-eqz p1, :cond_8

    .line 145
    .line 146
    invoke-static {v5, v4}, Lkotlin/jvm/internal/l0;->y(ILjava/lang/String;)V

    .line 147
    .line 148
    .line 149
    invoke-interface {p4, p1}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    invoke-static {v2}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    goto :goto_6

    .line 157
    :cond_8
    if-eqz v3, :cond_9

    .line 158
    .line 159
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 160
    .line 161
    .line 162
    move-result p1

    .line 163
    const/4 p2, 0x0

    .line 164
    :goto_7
    if-ge p2, p1, :cond_9

    .line 165
    .line 166
    invoke-interface {v3, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object p3

    .line 170
    invoke-interface {p4, p3}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    add-int/lit8 p2, p2, 0x1

    .line 174
    .line 175
    goto :goto_7

    .line 176
    :cond_9
    return-void

    .line 177
    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 178
    .line 179
    const-string/jumbo p2, "visitAncestors called on an unattached node"

    .line 180
    .line 181
    .line 182
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object p2

    .line 186
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    throw p1
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method

.method private final validateKeyEvent-ZmokQxo(Landroid/view/KeyEvent;)Z
    .locals 5

    .line 1
    invoke-static {p1}, Landroidx/compose/ui/input/key/KeyEvent_androidKt;->getKey-ZmokQxo(Landroid/view/KeyEvent;)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {p1}, Landroidx/compose/ui/input/key/KeyEvent_androidKt;->getType-ZmokQxo(Landroid/view/KeyEvent;)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    sget-object v2, Landroidx/compose/ui/input/key/KeyEventType;->Companion:Landroidx/compose/ui/input/key/KeyEventType$Companion;

    .line 10
    .line 11
    invoke-virtual {v2}, Landroidx/compose/ui/input/key/KeyEventType$Companion;->getKeyDown-CS__XNY()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    invoke-static {p1, v3}, Landroidx/compose/ui/input/key/KeyEventType;->equals-impl0(II)Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    const/4 v4, 0x1

    .line 20
    if-eqz v3, :cond_1

    .line 21
    .line 22
    iget-object p1, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->keysCurrentlyDown:Landroidx/collection/MutableLongSet;

    .line 23
    .line 24
    if-nez p1, :cond_0

    .line 25
    .line 26
    new-instance p1, Landroidx/collection/MutableLongSet;

    .line 27
    .line 28
    const/4 v2, 0x3

    .line 29
    invoke-direct {p1, v2}, Landroidx/collection/MutableLongSet;-><init>(I)V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->keysCurrentlyDown:Landroidx/collection/MutableLongSet;

    .line 33
    .line 34
    :cond_0
    invoke-virtual {p1, v0, v1}, Landroidx/collection/MutableLongSet;->plusAssign(J)V

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    invoke-virtual {v2}, Landroidx/compose/ui/input/key/KeyEventType$Companion;->getKeyUp-CS__XNY()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    invoke-static {p1, v2}, Landroidx/compose/ui/input/key/KeyEventType;->equals-impl0(II)Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-eqz p1, :cond_4

    .line 47
    .line 48
    iget-object p1, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->keysCurrentlyDown:Landroidx/collection/MutableLongSet;

    .line 49
    .line 50
    const/4 v2, 0x0

    .line 51
    if-eqz p1, :cond_2

    .line 52
    .line 53
    invoke-virtual {p1, v0, v1}, Landroidx/collection/LongSet;->contains(J)Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    if-ne p1, v4, :cond_2

    .line 58
    .line 59
    move p1, v4

    .line 60
    goto :goto_0

    .line 61
    :cond_2
    move p1, v2

    .line 62
    :goto_0
    if-nez p1, :cond_3

    .line 63
    .line 64
    return v2

    .line 65
    :cond_3
    iget-object p1, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->keysCurrentlyDown:Landroidx/collection/MutableLongSet;

    .line 66
    .line 67
    if-eqz p1, :cond_4

    .line 68
    .line 69
    invoke-virtual {p1, v0, v1}, Landroidx/collection/MutableLongSet;->remove(J)Z

    .line 70
    .line 71
    .line 72
    :cond_4
    :goto_1
    return v4
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method

.method private final wrapAroundFocus-3ESFkO8(I)Z
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/ui/focus/FocusTargetNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroidx/compose/ui/focus/FocusStateImpl;->getHasFocus()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_3

    .line 13
    .line 14
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroidx/compose/ui/focus/FocusTargetNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Landroidx/compose/ui/focus/FocusStateImpl;->isFocused()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_0
    sget-object v0, Landroidx/compose/ui/focus/FocusDirection;->Companion:Landroidx/compose/ui/focus/FocusDirection$Companion;

    .line 28
    .line 29
    invoke-virtual {v0}, Landroidx/compose/ui/focus/FocusDirection$Companion;->getNext-dhqQ-8s()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    invoke-static {p1, v2}, Landroidx/compose/ui/focus/FocusDirection;->equals-impl0(II)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    const/4 v0, 0x1

    .line 40
    goto :goto_0

    .line 41
    :cond_1
    invoke-virtual {v0}, Landroidx/compose/ui/focus/FocusDirection$Companion;->getPrevious-dhqQ-8s()I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    invoke-static {p1, v0}, Landroidx/compose/ui/focus/FocusDirection;->equals-impl0(II)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    :goto_0
    if-eqz v0, :cond_3

    .line 50
    .line 51
    invoke-virtual {p0, v1}, Landroidx/compose/ui/focus/FocusOwnerImpl;->clearFocus(Z)V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;

    .line 55
    .line 56
    invoke-virtual {v0}, Landroidx/compose/ui/focus/FocusTargetNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v0}, Landroidx/compose/ui/focus/FocusStateImpl;->isFocused()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-nez v0, :cond_2

    .line 65
    .line 66
    return v1

    .line 67
    :cond_2
    invoke-virtual {p0, p1}, Landroidx/compose/ui/focus/FocusOwnerImpl;->moveFocus-3ESFkO8(I)Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    return p1

    .line 72
    :cond_3
    :goto_1
    return v1
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method


# virtual methods
.method public clearFocus(Z)V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, p1, v0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->clearFocus(ZZ)V

    return-void
.end method

.method public clearFocus(ZZ)V
    .locals 6

    .line 2
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->getFocusTransactionManager()Landroidx/compose/ui/focus/FocusTransactionManager;

    move-result-object v0

    .line 3
    :try_start_0
    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$getOngoingTransaction$p(Landroidx/compose/ui/focus/FocusTransactionManager;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$cancelTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    .line 4
    :cond_0
    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$beginTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    const/4 v1, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-nez p1, :cond_2

    .line 5
    iget-object v4, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;

    sget-object v5, Landroidx/compose/ui/focus/FocusDirection;->Companion:Landroidx/compose/ui/focus/FocusDirection$Companion;

    invoke-virtual {v5}, Landroidx/compose/ui/focus/FocusDirection$Companion;->getExit-dhqQ-8s()I

    move-result v5

    invoke-static {v4, v5}, Landroidx/compose/ui/focus/FocusTransactionsKt;->performCustomClearFocus-Mxy_nc0(Landroidx/compose/ui/focus/FocusTargetNode;I)Landroidx/compose/ui/focus/CustomDestinationResult;

    move-result-object v4

    sget-object v5, Landroidx/compose/ui/focus/FocusOwnerImpl$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v4, v5, v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eq v4, v3, :cond_1

    if-eq v4, v2, :cond_1

    if-eq v4, v1, :cond_1

    goto :goto_0

    .line 6
    :cond_1
    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$commitTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    return-void

    .line 7
    :cond_2
    :goto_0
    :try_start_1
    iget-object v4, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;

    invoke-virtual {v4}, Landroidx/compose/ui/focus/FocusTargetNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    move-result-object v4

    .line 8
    iget-object v5, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;

    invoke-static {v5, p1, p2}, Landroidx/compose/ui/focus/FocusTransactionsKt;->clearFocus(Landroidx/compose/ui/focus/FocusTargetNode;ZZ)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 9
    iget-object p1, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;

    sget-object p2, Landroidx/compose/ui/focus/FocusOwnerImpl$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget p2, p2, v4

    if-eq p2, v3, :cond_4

    if-eq p2, v2, :cond_4

    if-eq p2, v1, :cond_4

    const/4 v1, 0x4

    if-ne p2, v1, :cond_3

    .line 10
    sget-object p2, Landroidx/compose/ui/focus/FocusStateImpl;->Inactive:Landroidx/compose/ui/focus/FocusStateImpl;

    goto :goto_1

    :cond_3
    new-instance p1, Lkotlin/j0;

    invoke-direct {p1}, Lkotlin/j0;-><init>()V

    throw p1

    .line 11
    :cond_4
    sget-object p2, Landroidx/compose/ui/focus/FocusStateImpl;->Active:Landroidx/compose/ui/focus/FocusStateImpl;

    .line 12
    :goto_1
    invoke-virtual {p1, p2}, Landroidx/compose/ui/focus/FocusTargetNode;->setFocusState(Landroidx/compose/ui/focus/FocusStateImpl;)V

    .line 13
    :cond_5
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 14
    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$commitTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    return-void

    :catchall_0
    move-exception p1

    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$commitTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    throw p1
.end method

.method public dispatchInterceptedSoftKeyboardEvent-ZmokQxo(Landroid/view/KeyEvent;)Z
    .locals 14
    .param p1    # Landroid/view/KeyEvent;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTraversalKt;->findActiveFocusNode(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string/jumbo v1, "visitAncestors called on an unattached node"

    .line 8
    .line 9
    .line 10
    const/high16 v2, 0x20000

    .line 11
    .line 12
    const/16 v3, 0x10

    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    const/4 v5, 0x0

    .line 16
    const/4 v6, 0x1

    .line 17
    if-eqz v0, :cond_e

    .line 18
    .line 19
    invoke-static {v2}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 20
    .line 21
    .line 22
    move-result v7

    .line 23
    invoke-interface {v0}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 24
    .line 25
    .line 26
    move-result-object v8

    .line 27
    invoke-virtual {v8}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 28
    .line 29
    .line 30
    move-result v8

    .line 31
    if-eqz v8, :cond_d

    .line 32
    .line 33
    invoke-interface {v0}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 34
    .line 35
    .line 36
    move-result-object v8

    .line 37
    invoke-virtual {v8}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 38
    .line 39
    .line 40
    move-result-object v8

    .line 41
    invoke-static {v0}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    :goto_0
    if-eqz v0, :cond_c

    .line 46
    .line 47
    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    .line 48
    .line 49
    .line 50
    move-result-object v9

    .line 51
    invoke-virtual {v9}, Landroidx/compose/ui/node/NodeChain;->getHead$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 52
    .line 53
    .line 54
    move-result-object v9

    .line 55
    invoke-virtual {v9}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    .line 56
    .line 57
    .line 58
    move-result v9

    .line 59
    and-int/2addr v9, v7

    .line 60
    if-eqz v9, :cond_a

    .line 61
    .line 62
    :goto_1
    if-eqz v8, :cond_a

    .line 63
    .line 64
    invoke-virtual {v8}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 65
    .line 66
    .line 67
    move-result v9

    .line 68
    and-int/2addr v9, v7

    .line 69
    if-eqz v9, :cond_9

    .line 70
    .line 71
    move-object v10, v4

    .line 72
    move-object v9, v8

    .line 73
    :goto_2
    if-eqz v9, :cond_9

    .line 74
    .line 75
    instance-of v11, v9, Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;

    .line 76
    .line 77
    if-eqz v11, :cond_0

    .line 78
    .line 79
    goto/16 :goto_7

    .line 80
    .line 81
    :cond_0
    invoke-virtual {v9}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 82
    .line 83
    .line 84
    move-result v11

    .line 85
    and-int/2addr v11, v7

    .line 86
    if-eqz v11, :cond_1

    .line 87
    .line 88
    move v11, v6

    .line 89
    goto :goto_3

    .line 90
    :cond_1
    move v11, v5

    .line 91
    :goto_3
    if-eqz v11, :cond_8

    .line 92
    .line 93
    instance-of v11, v9, Landroidx/compose/ui/node/DelegatingNode;

    .line 94
    .line 95
    if-eqz v11, :cond_8

    .line 96
    .line 97
    move-object v11, v9

    .line 98
    check-cast v11, Landroidx/compose/ui/node/DelegatingNode;

    .line 99
    .line 100
    invoke-virtual {v11}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 101
    .line 102
    .line 103
    move-result-object v11

    .line 104
    move v12, v5

    .line 105
    :goto_4
    if-eqz v11, :cond_7

    .line 106
    .line 107
    invoke-virtual {v11}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 108
    .line 109
    .line 110
    move-result v13

    .line 111
    and-int/2addr v13, v7

    .line 112
    if-eqz v13, :cond_2

    .line 113
    .line 114
    move v13, v6

    .line 115
    goto :goto_5

    .line 116
    :cond_2
    move v13, v5

    .line 117
    :goto_5
    if-eqz v13, :cond_6

    .line 118
    .line 119
    add-int/lit8 v12, v12, 0x1

    .line 120
    .line 121
    if-ne v12, v6, :cond_3

    .line 122
    .line 123
    move-object v9, v11

    .line 124
    goto :goto_6

    .line 125
    :cond_3
    if-nez v10, :cond_4

    .line 126
    .line 127
    new-instance v10, Landroidx/compose/runtime/collection/MutableVector;

    .line 128
    .line 129
    new-array v13, v3, [Landroidx/compose/ui/Modifier$Node;

    .line 130
    .line 131
    invoke-direct {v10, v13, v5}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 132
    .line 133
    .line 134
    :cond_4
    if-eqz v9, :cond_5

    .line 135
    .line 136
    invoke-virtual {v10, v9}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-object v9, v4

    .line 140
    :cond_5
    invoke-virtual {v10, v11}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    :cond_6
    :goto_6
    invoke-virtual {v11}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 144
    .line 145
    .line 146
    move-result-object v11

    .line 147
    goto :goto_4

    .line 148
    :cond_7
    if-ne v12, v6, :cond_8

    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_8
    invoke-static {v10}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    .line 152
    .line 153
    .line 154
    move-result-object v9

    .line 155
    goto :goto_2

    .line 156
    :cond_9
    invoke-virtual {v8}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 157
    .line 158
    .line 159
    move-result-object v8

    .line 160
    goto :goto_1

    .line 161
    :cond_a
    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    if-eqz v0, :cond_b

    .line 166
    .line 167
    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    .line 168
    .line 169
    .line 170
    move-result-object v8

    .line 171
    if-eqz v8, :cond_b

    .line 172
    .line 173
    invoke-virtual {v8}, Landroidx/compose/ui/node/NodeChain;->getTail$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 174
    .line 175
    .line 176
    move-result-object v8

    .line 177
    goto/16 :goto_0

    .line 178
    .line 179
    :cond_b
    move-object v8, v4

    .line 180
    goto/16 :goto_0

    .line 181
    .line 182
    :cond_c
    move-object v9, v4

    .line 183
    :goto_7
    check-cast v9, Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;

    .line 184
    .line 185
    goto :goto_8

    .line 186
    :cond_d
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 187
    .line 188
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    throw p1

    .line 196
    :cond_e
    move-object v9, v4

    .line 197
    :goto_8
    if-eqz v9, :cond_36

    .line 198
    .line 199
    invoke-static {v2}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 200
    .line 201
    .line 202
    move-result v0

    .line 203
    invoke-interface {v9}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    invoke-virtual {v2}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 208
    .line 209
    .line 210
    move-result v2

    .line 211
    if-eqz v2, :cond_35

    .line 212
    .line 213
    invoke-interface {v9}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    invoke-static {v9}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    move-object v7, v4

    .line 226
    :goto_9
    if-eqz v2, :cond_1c

    .line 227
    .line 228
    invoke-virtual {v2}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    .line 229
    .line 230
    .line 231
    move-result-object v8

    .line 232
    invoke-virtual {v8}, Landroidx/compose/ui/node/NodeChain;->getHead$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 233
    .line 234
    .line 235
    move-result-object v8

    .line 236
    invoke-virtual {v8}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    .line 237
    .line 238
    .line 239
    move-result v8

    .line 240
    and-int/2addr v8, v0

    .line 241
    if-eqz v8, :cond_1a

    .line 242
    .line 243
    :goto_a
    if-eqz v1, :cond_1a

    .line 244
    .line 245
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 246
    .line 247
    .line 248
    move-result v8

    .line 249
    and-int/2addr v8, v0

    .line 250
    if-eqz v8, :cond_19

    .line 251
    .line 252
    move-object v8, v1

    .line 253
    move-object v10, v4

    .line 254
    :goto_b
    if-eqz v8, :cond_19

    .line 255
    .line 256
    instance-of v11, v8, Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;

    .line 257
    .line 258
    if-eqz v11, :cond_10

    .line 259
    .line 260
    if-nez v7, :cond_f

    .line 261
    .line 262
    new-instance v7, Ljava/util/ArrayList;

    .line 263
    .line 264
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 265
    .line 266
    .line 267
    :cond_f
    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    goto :goto_10

    .line 271
    :cond_10
    invoke-virtual {v8}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 272
    .line 273
    .line 274
    move-result v11

    .line 275
    and-int/2addr v11, v0

    .line 276
    if-eqz v11, :cond_11

    .line 277
    .line 278
    move v11, v6

    .line 279
    goto :goto_c

    .line 280
    :cond_11
    move v11, v5

    .line 281
    :goto_c
    if-eqz v11, :cond_18

    .line 282
    .line 283
    instance-of v11, v8, Landroidx/compose/ui/node/DelegatingNode;

    .line 284
    .line 285
    if-eqz v11, :cond_18

    .line 286
    .line 287
    move-object v11, v8

    .line 288
    check-cast v11, Landroidx/compose/ui/node/DelegatingNode;

    .line 289
    .line 290
    invoke-virtual {v11}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 291
    .line 292
    .line 293
    move-result-object v11

    .line 294
    move v12, v5

    .line 295
    :goto_d
    if-eqz v11, :cond_17

    .line 296
    .line 297
    invoke-virtual {v11}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 298
    .line 299
    .line 300
    move-result v13

    .line 301
    and-int/2addr v13, v0

    .line 302
    if-eqz v13, :cond_12

    .line 303
    .line 304
    move v13, v6

    .line 305
    goto :goto_e

    .line 306
    :cond_12
    move v13, v5

    .line 307
    :goto_e
    if-eqz v13, :cond_16

    .line 308
    .line 309
    add-int/lit8 v12, v12, 0x1

    .line 310
    .line 311
    if-ne v12, v6, :cond_13

    .line 312
    .line 313
    move-object v8, v11

    .line 314
    goto :goto_f

    .line 315
    :cond_13
    if-nez v10, :cond_14

    .line 316
    .line 317
    new-instance v10, Landroidx/compose/runtime/collection/MutableVector;

    .line 318
    .line 319
    new-array v13, v3, [Landroidx/compose/ui/Modifier$Node;

    .line 320
    .line 321
    invoke-direct {v10, v13, v5}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 322
    .line 323
    .line 324
    :cond_14
    if-eqz v8, :cond_15

    .line 325
    .line 326
    invoke-virtual {v10, v8}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    move-object v8, v4

    .line 330
    :cond_15
    invoke-virtual {v10, v11}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 331
    .line 332
    .line 333
    :cond_16
    :goto_f
    invoke-virtual {v11}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 334
    .line 335
    .line 336
    move-result-object v11

    .line 337
    goto :goto_d

    .line 338
    :cond_17
    if-ne v12, v6, :cond_18

    .line 339
    .line 340
    goto :goto_b

    .line 341
    :cond_18
    :goto_10
    invoke-static {v10}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    .line 342
    .line 343
    .line 344
    move-result-object v8

    .line 345
    goto :goto_b

    .line 346
    :cond_19
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 347
    .line 348
    .line 349
    move-result-object v1

    .line 350
    goto :goto_a

    .line 351
    :cond_1a
    invoke-virtual {v2}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    .line 352
    .line 353
    .line 354
    move-result-object v2

    .line 355
    if-eqz v2, :cond_1b

    .line 356
    .line 357
    invoke-virtual {v2}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    .line 358
    .line 359
    .line 360
    move-result-object v1

    .line 361
    if-eqz v1, :cond_1b

    .line 362
    .line 363
    invoke-virtual {v1}, Landroidx/compose/ui/node/NodeChain;->getTail$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 364
    .line 365
    .line 366
    move-result-object v1

    .line 367
    goto/16 :goto_9

    .line 368
    .line 369
    :cond_1b
    move-object v1, v4

    .line 370
    goto/16 :goto_9

    .line 371
    .line 372
    :cond_1c
    if-eqz v7, :cond_1f

    .line 373
    .line 374
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 375
    .line 376
    .line 377
    move-result v1

    .line 378
    add-int/lit8 v1, v1, -0x1

    .line 379
    .line 380
    if-ltz v1, :cond_1f

    .line 381
    .line 382
    :goto_11
    add-int/lit8 v2, v1, -0x1

    .line 383
    .line 384
    invoke-interface {v7, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object v1

    .line 388
    check-cast v1, Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;

    .line 389
    .line 390
    invoke-interface {v1, p1}, Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;->onPreInterceptKeyBeforeSoftKeyboard-ZmokQxo(Landroid/view/KeyEvent;)Z

    .line 391
    .line 392
    .line 393
    move-result v1

    .line 394
    if-eqz v1, :cond_1d

    .line 395
    .line 396
    return v6

    .line 397
    :cond_1d
    if-gez v2, :cond_1e

    .line 398
    .line 399
    goto :goto_12

    .line 400
    :cond_1e
    move v1, v2

    .line 401
    goto :goto_11

    .line 402
    :cond_1f
    :goto_12
    invoke-interface {v9}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 403
    .line 404
    .line 405
    move-result-object v1

    .line 406
    move-object v2, v4

    .line 407
    :goto_13
    if-eqz v1, :cond_29

    .line 408
    .line 409
    instance-of v8, v1, Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;

    .line 410
    .line 411
    if-eqz v8, :cond_20

    .line 412
    .line 413
    check-cast v1, Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;

    .line 414
    .line 415
    invoke-interface {v1, p1}, Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;->onPreInterceptKeyBeforeSoftKeyboard-ZmokQxo(Landroid/view/KeyEvent;)Z

    .line 416
    .line 417
    .line 418
    move-result v1

    .line 419
    if-eqz v1, :cond_28

    .line 420
    .line 421
    return v6

    .line 422
    :cond_20
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 423
    .line 424
    .line 425
    move-result v8

    .line 426
    and-int/2addr v8, v0

    .line 427
    if-eqz v8, :cond_21

    .line 428
    .line 429
    move v8, v6

    .line 430
    goto :goto_14

    .line 431
    :cond_21
    move v8, v5

    .line 432
    :goto_14
    if-eqz v8, :cond_28

    .line 433
    .line 434
    instance-of v8, v1, Landroidx/compose/ui/node/DelegatingNode;

    .line 435
    .line 436
    if-eqz v8, :cond_28

    .line 437
    .line 438
    move-object v8, v1

    .line 439
    check-cast v8, Landroidx/compose/ui/node/DelegatingNode;

    .line 440
    .line 441
    invoke-virtual {v8}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 442
    .line 443
    .line 444
    move-result-object v8

    .line 445
    move v10, v5

    .line 446
    :goto_15
    if-eqz v8, :cond_27

    .line 447
    .line 448
    invoke-virtual {v8}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 449
    .line 450
    .line 451
    move-result v11

    .line 452
    and-int/2addr v11, v0

    .line 453
    if-eqz v11, :cond_22

    .line 454
    .line 455
    move v11, v6

    .line 456
    goto :goto_16

    .line 457
    :cond_22
    move v11, v5

    .line 458
    :goto_16
    if-eqz v11, :cond_26

    .line 459
    .line 460
    add-int/lit8 v10, v10, 0x1

    .line 461
    .line 462
    if-ne v10, v6, :cond_23

    .line 463
    .line 464
    move-object v1, v8

    .line 465
    goto :goto_17

    .line 466
    :cond_23
    if-nez v2, :cond_24

    .line 467
    .line 468
    new-instance v2, Landroidx/compose/runtime/collection/MutableVector;

    .line 469
    .line 470
    new-array v11, v3, [Landroidx/compose/ui/Modifier$Node;

    .line 471
    .line 472
    invoke-direct {v2, v11, v5}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 473
    .line 474
    .line 475
    :cond_24
    if-eqz v1, :cond_25

    .line 476
    .line 477
    invoke-virtual {v2, v1}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 478
    .line 479
    .line 480
    move-object v1, v4

    .line 481
    :cond_25
    invoke-virtual {v2, v8}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 482
    .line 483
    .line 484
    :cond_26
    :goto_17
    invoke-virtual {v8}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 485
    .line 486
    .line 487
    move-result-object v8

    .line 488
    goto :goto_15

    .line 489
    :cond_27
    if-ne v10, v6, :cond_28

    .line 490
    .line 491
    goto :goto_13

    .line 492
    :cond_28
    invoke-static {v2}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    .line 493
    .line 494
    .line 495
    move-result-object v1

    .line 496
    goto :goto_13

    .line 497
    :cond_29
    invoke-interface {v9}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 498
    .line 499
    .line 500
    move-result-object v1

    .line 501
    move-object v2, v4

    .line 502
    :goto_18
    if-eqz v1, :cond_33

    .line 503
    .line 504
    instance-of v8, v1, Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;

    .line 505
    .line 506
    if-eqz v8, :cond_2a

    .line 507
    .line 508
    check-cast v1, Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;

    .line 509
    .line 510
    invoke-interface {v1, p1}, Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;->onInterceptKeyBeforeSoftKeyboard-ZmokQxo(Landroid/view/KeyEvent;)Z

    .line 511
    .line 512
    .line 513
    move-result v1

    .line 514
    if-eqz v1, :cond_32

    .line 515
    .line 516
    return v6

    .line 517
    :cond_2a
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 518
    .line 519
    .line 520
    move-result v8

    .line 521
    and-int/2addr v8, v0

    .line 522
    if-eqz v8, :cond_2b

    .line 523
    .line 524
    move v8, v6

    .line 525
    goto :goto_19

    .line 526
    :cond_2b
    move v8, v5

    .line 527
    :goto_19
    if-eqz v8, :cond_32

    .line 528
    .line 529
    instance-of v8, v1, Landroidx/compose/ui/node/DelegatingNode;

    .line 530
    .line 531
    if-eqz v8, :cond_32

    .line 532
    .line 533
    move-object v8, v1

    .line 534
    check-cast v8, Landroidx/compose/ui/node/DelegatingNode;

    .line 535
    .line 536
    invoke-virtual {v8}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 537
    .line 538
    .line 539
    move-result-object v8

    .line 540
    move v9, v5

    .line 541
    :goto_1a
    if-eqz v8, :cond_31

    .line 542
    .line 543
    invoke-virtual {v8}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 544
    .line 545
    .line 546
    move-result v10

    .line 547
    and-int/2addr v10, v0

    .line 548
    if-eqz v10, :cond_2c

    .line 549
    .line 550
    move v10, v6

    .line 551
    goto :goto_1b

    .line 552
    :cond_2c
    move v10, v5

    .line 553
    :goto_1b
    if-eqz v10, :cond_30

    .line 554
    .line 555
    add-int/lit8 v9, v9, 0x1

    .line 556
    .line 557
    if-ne v9, v6, :cond_2d

    .line 558
    .line 559
    move-object v1, v8

    .line 560
    goto :goto_1c

    .line 561
    :cond_2d
    if-nez v2, :cond_2e

    .line 562
    .line 563
    new-instance v2, Landroidx/compose/runtime/collection/MutableVector;

    .line 564
    .line 565
    new-array v10, v3, [Landroidx/compose/ui/Modifier$Node;

    .line 566
    .line 567
    invoke-direct {v2, v10, v5}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 568
    .line 569
    .line 570
    :cond_2e
    if-eqz v1, :cond_2f

    .line 571
    .line 572
    invoke-virtual {v2, v1}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 573
    .line 574
    .line 575
    move-object v1, v4

    .line 576
    :cond_2f
    invoke-virtual {v2, v8}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 577
    .line 578
    .line 579
    :cond_30
    :goto_1c
    invoke-virtual {v8}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 580
    .line 581
    .line 582
    move-result-object v8

    .line 583
    goto :goto_1a

    .line 584
    :cond_31
    if-ne v9, v6, :cond_32

    .line 585
    .line 586
    goto :goto_18

    .line 587
    :cond_32
    invoke-static {v2}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    .line 588
    .line 589
    .line 590
    move-result-object v1

    .line 591
    goto :goto_18

    .line 592
    :cond_33
    if-eqz v7, :cond_36

    .line 593
    .line 594
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 595
    .line 596
    .line 597
    move-result v0

    .line 598
    move v1, v5

    .line 599
    :goto_1d
    if-ge v1, v0, :cond_36

    .line 600
    .line 601
    invoke-interface {v7, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 602
    .line 603
    .line 604
    move-result-object v2

    .line 605
    check-cast v2, Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;

    .line 606
    .line 607
    invoke-interface {v2, p1}, Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;->onInterceptKeyBeforeSoftKeyboard-ZmokQxo(Landroid/view/KeyEvent;)Z

    .line 608
    .line 609
    .line 610
    move-result v2

    .line 611
    if-eqz v2, :cond_34

    .line 612
    .line 613
    return v6

    .line 614
    :cond_34
    add-int/lit8 v1, v1, 0x1

    .line 615
    .line 616
    goto :goto_1d

    .line 617
    :cond_35
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 618
    .line 619
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 620
    .line 621
    .line 622
    move-result-object v0

    .line 623
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 624
    .line 625
    .line 626
    throw p1

    .line 627
    :cond_36
    return v5
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
.end method

.method public dispatchKeyEvent-ZmokQxo(Landroid/view/KeyEvent;)Z
    .locals 14
    .param p1    # Landroid/view/KeyEvent;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p1}, Landroidx/compose/ui/focus/FocusOwnerImpl;->validateKeyEvent-ZmokQxo(Landroid/view/KeyEvent;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;

    .line 10
    .line 11
    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTraversalKt;->findActiveFocusNode(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_39

    .line 16
    .line 17
    invoke-direct {p0, v0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->lastLocalKeyInputNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/Modifier$Node;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    const-string/jumbo v3, "visitAncestors called on an unattached node"

    .line 22
    .line 23
    .line 24
    const/16 v4, 0x2000

    .line 25
    .line 26
    const/16 v5, 0x10

    .line 27
    .line 28
    const/4 v6, 0x0

    .line 29
    const/4 v7, 0x1

    .line 30
    if-nez v2, :cond_10

    .line 31
    .line 32
    invoke-static {v4}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    invoke-interface {v0}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 37
    .line 38
    .line 39
    move-result-object v8

    .line 40
    invoke-virtual {v8}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 41
    .line 42
    .line 43
    move-result v8

    .line 44
    if-eqz v8, :cond_f

    .line 45
    .line 46
    invoke-interface {v0}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 47
    .line 48
    .line 49
    move-result-object v8

    .line 50
    invoke-virtual {v8}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 51
    .line 52
    .line 53
    move-result-object v8

    .line 54
    invoke-static {v0}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    :goto_0
    if-eqz v0, :cond_d

    .line 59
    .line 60
    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    .line 61
    .line 62
    .line 63
    move-result-object v9

    .line 64
    invoke-virtual {v9}, Landroidx/compose/ui/node/NodeChain;->getHead$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 65
    .line 66
    .line 67
    move-result-object v9

    .line 68
    invoke-virtual {v9}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    .line 69
    .line 70
    .line 71
    move-result v9

    .line 72
    and-int/2addr v9, v2

    .line 73
    if-eqz v9, :cond_b

    .line 74
    .line 75
    :goto_1
    if-eqz v8, :cond_b

    .line 76
    .line 77
    invoke-virtual {v8}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 78
    .line 79
    .line 80
    move-result v9

    .line 81
    and-int/2addr v9, v2

    .line 82
    if-eqz v9, :cond_a

    .line 83
    .line 84
    move-object v10, v6

    .line 85
    move-object v9, v8

    .line 86
    :goto_2
    if-eqz v9, :cond_a

    .line 87
    .line 88
    instance-of v11, v9, Landroidx/compose/ui/input/key/KeyInputModifierNode;

    .line 89
    .line 90
    if-eqz v11, :cond_1

    .line 91
    .line 92
    goto/16 :goto_7

    .line 93
    .line 94
    :cond_1
    invoke-virtual {v9}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 95
    .line 96
    .line 97
    move-result v11

    .line 98
    and-int/2addr v11, v2

    .line 99
    if-eqz v11, :cond_2

    .line 100
    .line 101
    move v11, v7

    .line 102
    goto :goto_3

    .line 103
    :cond_2
    move v11, v1

    .line 104
    :goto_3
    if-eqz v11, :cond_9

    .line 105
    .line 106
    instance-of v11, v9, Landroidx/compose/ui/node/DelegatingNode;

    .line 107
    .line 108
    if-eqz v11, :cond_9

    .line 109
    .line 110
    move-object v11, v9

    .line 111
    check-cast v11, Landroidx/compose/ui/node/DelegatingNode;

    .line 112
    .line 113
    invoke-virtual {v11}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 114
    .line 115
    .line 116
    move-result-object v11

    .line 117
    move v12, v1

    .line 118
    :goto_4
    if-eqz v11, :cond_8

    .line 119
    .line 120
    invoke-virtual {v11}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 121
    .line 122
    .line 123
    move-result v13

    .line 124
    and-int/2addr v13, v2

    .line 125
    if-eqz v13, :cond_3

    .line 126
    .line 127
    move v13, v7

    .line 128
    goto :goto_5

    .line 129
    :cond_3
    move v13, v1

    .line 130
    :goto_5
    if-eqz v13, :cond_7

    .line 131
    .line 132
    add-int/lit8 v12, v12, 0x1

    .line 133
    .line 134
    if-ne v12, v7, :cond_4

    .line 135
    .line 136
    move-object v9, v11

    .line 137
    goto :goto_6

    .line 138
    :cond_4
    if-nez v10, :cond_5

    .line 139
    .line 140
    new-instance v10, Landroidx/compose/runtime/collection/MutableVector;

    .line 141
    .line 142
    new-array v13, v5, [Landroidx/compose/ui/Modifier$Node;

    .line 143
    .line 144
    invoke-direct {v10, v13, v1}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 145
    .line 146
    .line 147
    :cond_5
    if-eqz v9, :cond_6

    .line 148
    .line 149
    invoke-virtual {v10, v9}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-object v9, v6

    .line 153
    :cond_6
    invoke-virtual {v10, v11}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    :cond_7
    :goto_6
    invoke-virtual {v11}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 157
    .line 158
    .line 159
    move-result-object v11

    .line 160
    goto :goto_4

    .line 161
    :cond_8
    if-ne v12, v7, :cond_9

    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_9
    invoke-static {v10}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    .line 165
    .line 166
    .line 167
    move-result-object v9

    .line 168
    goto :goto_2

    .line 169
    :cond_a
    invoke-virtual {v8}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 170
    .line 171
    .line 172
    move-result-object v8

    .line 173
    goto :goto_1

    .line 174
    :cond_b
    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    if-eqz v0, :cond_c

    .line 179
    .line 180
    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    .line 181
    .line 182
    .line 183
    move-result-object v8

    .line 184
    if-eqz v8, :cond_c

    .line 185
    .line 186
    invoke-virtual {v8}, Landroidx/compose/ui/node/NodeChain;->getTail$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 187
    .line 188
    .line 189
    move-result-object v8

    .line 190
    goto/16 :goto_0

    .line 191
    .line 192
    :cond_c
    move-object v8, v6

    .line 193
    goto/16 :goto_0

    .line 194
    .line 195
    :cond_d
    move-object v9, v6

    .line 196
    :goto_7
    check-cast v9, Landroidx/compose/ui/input/key/KeyInputModifierNode;

    .line 197
    .line 198
    if-eqz v9, :cond_e

    .line 199
    .line 200
    invoke-interface {v9}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    goto :goto_8

    .line 205
    :cond_e
    move-object v2, v6

    .line 206
    goto :goto_8

    .line 207
    :cond_f
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 208
    .line 209
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    throw p1

    .line 217
    :cond_10
    :goto_8
    if-eqz v2, :cond_38

    .line 218
    .line 219
    invoke-static {v4}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    invoke-interface {v2}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 224
    .line 225
    .line 226
    move-result-object v4

    .line 227
    invoke-virtual {v4}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 228
    .line 229
    .line 230
    move-result v4

    .line 231
    if-eqz v4, :cond_37

    .line 232
    .line 233
    invoke-interface {v2}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 234
    .line 235
    .line 236
    move-result-object v3

    .line 237
    invoke-virtual {v3}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 238
    .line 239
    .line 240
    move-result-object v3

    .line 241
    invoke-static {v2}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    .line 242
    .line 243
    .line 244
    move-result-object v4

    .line 245
    move-object v8, v6

    .line 246
    :goto_9
    if-eqz v4, :cond_1e

    .line 247
    .line 248
    invoke-virtual {v4}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    .line 249
    .line 250
    .line 251
    move-result-object v9

    .line 252
    invoke-virtual {v9}, Landroidx/compose/ui/node/NodeChain;->getHead$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 253
    .line 254
    .line 255
    move-result-object v9

    .line 256
    invoke-virtual {v9}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    .line 257
    .line 258
    .line 259
    move-result v9

    .line 260
    and-int/2addr v9, v0

    .line 261
    if-eqz v9, :cond_1c

    .line 262
    .line 263
    :goto_a
    if-eqz v3, :cond_1c

    .line 264
    .line 265
    invoke-virtual {v3}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 266
    .line 267
    .line 268
    move-result v9

    .line 269
    and-int/2addr v9, v0

    .line 270
    if-eqz v9, :cond_1b

    .line 271
    .line 272
    move-object v9, v3

    .line 273
    move-object v10, v6

    .line 274
    :goto_b
    if-eqz v9, :cond_1b

    .line 275
    .line 276
    instance-of v11, v9, Landroidx/compose/ui/input/key/KeyInputModifierNode;

    .line 277
    .line 278
    if-eqz v11, :cond_12

    .line 279
    .line 280
    if-nez v8, :cond_11

    .line 281
    .line 282
    new-instance v8, Ljava/util/ArrayList;

    .line 283
    .line 284
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 285
    .line 286
    .line 287
    :cond_11
    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 288
    .line 289
    .line 290
    goto :goto_10

    .line 291
    :cond_12
    invoke-virtual {v9}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 292
    .line 293
    .line 294
    move-result v11

    .line 295
    and-int/2addr v11, v0

    .line 296
    if-eqz v11, :cond_13

    .line 297
    .line 298
    move v11, v7

    .line 299
    goto :goto_c

    .line 300
    :cond_13
    move v11, v1

    .line 301
    :goto_c
    if-eqz v11, :cond_1a

    .line 302
    .line 303
    instance-of v11, v9, Landroidx/compose/ui/node/DelegatingNode;

    .line 304
    .line 305
    if-eqz v11, :cond_1a

    .line 306
    .line 307
    move-object v11, v9

    .line 308
    check-cast v11, Landroidx/compose/ui/node/DelegatingNode;

    .line 309
    .line 310
    invoke-virtual {v11}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 311
    .line 312
    .line 313
    move-result-object v11

    .line 314
    move v12, v1

    .line 315
    :goto_d
    if-eqz v11, :cond_19

    .line 316
    .line 317
    invoke-virtual {v11}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 318
    .line 319
    .line 320
    move-result v13

    .line 321
    and-int/2addr v13, v0

    .line 322
    if-eqz v13, :cond_14

    .line 323
    .line 324
    move v13, v7

    .line 325
    goto :goto_e

    .line 326
    :cond_14
    move v13, v1

    .line 327
    :goto_e
    if-eqz v13, :cond_18

    .line 328
    .line 329
    add-int/lit8 v12, v12, 0x1

    .line 330
    .line 331
    if-ne v12, v7, :cond_15

    .line 332
    .line 333
    move-object v9, v11

    .line 334
    goto :goto_f

    .line 335
    :cond_15
    if-nez v10, :cond_16

    .line 336
    .line 337
    new-instance v10, Landroidx/compose/runtime/collection/MutableVector;

    .line 338
    .line 339
    new-array v13, v5, [Landroidx/compose/ui/Modifier$Node;

    .line 340
    .line 341
    invoke-direct {v10, v13, v1}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 342
    .line 343
    .line 344
    :cond_16
    if-eqz v9, :cond_17

    .line 345
    .line 346
    invoke-virtual {v10, v9}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 347
    .line 348
    .line 349
    move-object v9, v6

    .line 350
    :cond_17
    invoke-virtual {v10, v11}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 351
    .line 352
    .line 353
    :cond_18
    :goto_f
    invoke-virtual {v11}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 354
    .line 355
    .line 356
    move-result-object v11

    .line 357
    goto :goto_d

    .line 358
    :cond_19
    if-ne v12, v7, :cond_1a

    .line 359
    .line 360
    goto :goto_b

    .line 361
    :cond_1a
    :goto_10
    invoke-static {v10}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    .line 362
    .line 363
    .line 364
    move-result-object v9

    .line 365
    goto :goto_b

    .line 366
    :cond_1b
    invoke-virtual {v3}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 367
    .line 368
    .line 369
    move-result-object v3

    .line 370
    goto :goto_a

    .line 371
    :cond_1c
    invoke-virtual {v4}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    .line 372
    .line 373
    .line 374
    move-result-object v4

    .line 375
    if-eqz v4, :cond_1d

    .line 376
    .line 377
    invoke-virtual {v4}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    .line 378
    .line 379
    .line 380
    move-result-object v3

    .line 381
    if-eqz v3, :cond_1d

    .line 382
    .line 383
    invoke-virtual {v3}, Landroidx/compose/ui/node/NodeChain;->getTail$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 384
    .line 385
    .line 386
    move-result-object v3

    .line 387
    goto/16 :goto_9

    .line 388
    .line 389
    :cond_1d
    move-object v3, v6

    .line 390
    goto/16 :goto_9

    .line 391
    .line 392
    :cond_1e
    if-eqz v8, :cond_21

    .line 393
    .line 394
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 395
    .line 396
    .line 397
    move-result v3

    .line 398
    add-int/lit8 v3, v3, -0x1

    .line 399
    .line 400
    if-ltz v3, :cond_21

    .line 401
    .line 402
    :goto_11
    add-int/lit8 v4, v3, -0x1

    .line 403
    .line 404
    invoke-interface {v8, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v3

    .line 408
    check-cast v3, Landroidx/compose/ui/input/key/KeyInputModifierNode;

    .line 409
    .line 410
    invoke-interface {v3, p1}, Landroidx/compose/ui/input/key/KeyInputModifierNode;->onPreKeyEvent-ZmokQxo(Landroid/view/KeyEvent;)Z

    .line 411
    .line 412
    .line 413
    move-result v3

    .line 414
    if-eqz v3, :cond_1f

    .line 415
    .line 416
    return v7

    .line 417
    :cond_1f
    if-gez v4, :cond_20

    .line 418
    .line 419
    goto :goto_12

    .line 420
    :cond_20
    move v3, v4

    .line 421
    goto :goto_11

    .line 422
    :cond_21
    :goto_12
    invoke-interface {v2}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 423
    .line 424
    .line 425
    move-result-object v3

    .line 426
    move-object v4, v6

    .line 427
    :goto_13
    if-eqz v3, :cond_2b

    .line 428
    .line 429
    instance-of v9, v3, Landroidx/compose/ui/input/key/KeyInputModifierNode;

    .line 430
    .line 431
    if-eqz v9, :cond_22

    .line 432
    .line 433
    check-cast v3, Landroidx/compose/ui/input/key/KeyInputModifierNode;

    .line 434
    .line 435
    invoke-interface {v3, p1}, Landroidx/compose/ui/input/key/KeyInputModifierNode;->onPreKeyEvent-ZmokQxo(Landroid/view/KeyEvent;)Z

    .line 436
    .line 437
    .line 438
    move-result v3

    .line 439
    if-eqz v3, :cond_2a

    .line 440
    .line 441
    return v7

    .line 442
    :cond_22
    invoke-virtual {v3}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 443
    .line 444
    .line 445
    move-result v9

    .line 446
    and-int/2addr v9, v0

    .line 447
    if-eqz v9, :cond_23

    .line 448
    .line 449
    move v9, v7

    .line 450
    goto :goto_14

    .line 451
    :cond_23
    move v9, v1

    .line 452
    :goto_14
    if-eqz v9, :cond_2a

    .line 453
    .line 454
    instance-of v9, v3, Landroidx/compose/ui/node/DelegatingNode;

    .line 455
    .line 456
    if-eqz v9, :cond_2a

    .line 457
    .line 458
    move-object v9, v3

    .line 459
    check-cast v9, Landroidx/compose/ui/node/DelegatingNode;

    .line 460
    .line 461
    invoke-virtual {v9}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 462
    .line 463
    .line 464
    move-result-object v9

    .line 465
    move v10, v1

    .line 466
    :goto_15
    if-eqz v9, :cond_29

    .line 467
    .line 468
    invoke-virtual {v9}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 469
    .line 470
    .line 471
    move-result v11

    .line 472
    and-int/2addr v11, v0

    .line 473
    if-eqz v11, :cond_24

    .line 474
    .line 475
    move v11, v7

    .line 476
    goto :goto_16

    .line 477
    :cond_24
    move v11, v1

    .line 478
    :goto_16
    if-eqz v11, :cond_28

    .line 479
    .line 480
    add-int/lit8 v10, v10, 0x1

    .line 481
    .line 482
    if-ne v10, v7, :cond_25

    .line 483
    .line 484
    move-object v3, v9

    .line 485
    goto :goto_17

    .line 486
    :cond_25
    if-nez v4, :cond_26

    .line 487
    .line 488
    new-instance v4, Landroidx/compose/runtime/collection/MutableVector;

    .line 489
    .line 490
    new-array v11, v5, [Landroidx/compose/ui/Modifier$Node;

    .line 491
    .line 492
    invoke-direct {v4, v11, v1}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 493
    .line 494
    .line 495
    :cond_26
    if-eqz v3, :cond_27

    .line 496
    .line 497
    invoke-virtual {v4, v3}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 498
    .line 499
    .line 500
    move-object v3, v6

    .line 501
    :cond_27
    invoke-virtual {v4, v9}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 502
    .line 503
    .line 504
    :cond_28
    :goto_17
    invoke-virtual {v9}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 505
    .line 506
    .line 507
    move-result-object v9

    .line 508
    goto :goto_15

    .line 509
    :cond_29
    if-ne v10, v7, :cond_2a

    .line 510
    .line 511
    goto :goto_13

    .line 512
    :cond_2a
    invoke-static {v4}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    .line 513
    .line 514
    .line 515
    move-result-object v3

    .line 516
    goto :goto_13

    .line 517
    :cond_2b
    invoke-interface {v2}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 518
    .line 519
    .line 520
    move-result-object v2

    .line 521
    move-object v3, v6

    .line 522
    :goto_18
    if-eqz v2, :cond_35

    .line 523
    .line 524
    instance-of v4, v2, Landroidx/compose/ui/input/key/KeyInputModifierNode;

    .line 525
    .line 526
    if-eqz v4, :cond_2c

    .line 527
    .line 528
    check-cast v2, Landroidx/compose/ui/input/key/KeyInputModifierNode;

    .line 529
    .line 530
    invoke-interface {v2, p1}, Landroidx/compose/ui/input/key/KeyInputModifierNode;->onKeyEvent-ZmokQxo(Landroid/view/KeyEvent;)Z

    .line 531
    .line 532
    .line 533
    move-result v2

    .line 534
    if-eqz v2, :cond_34

    .line 535
    .line 536
    return v7

    .line 537
    :cond_2c
    invoke-virtual {v2}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 538
    .line 539
    .line 540
    move-result v4

    .line 541
    and-int/2addr v4, v0

    .line 542
    if-eqz v4, :cond_2d

    .line 543
    .line 544
    move v4, v7

    .line 545
    goto :goto_19

    .line 546
    :cond_2d
    move v4, v1

    .line 547
    :goto_19
    if-eqz v4, :cond_34

    .line 548
    .line 549
    instance-of v4, v2, Landroidx/compose/ui/node/DelegatingNode;

    .line 550
    .line 551
    if-eqz v4, :cond_34

    .line 552
    .line 553
    move-object v4, v2

    .line 554
    check-cast v4, Landroidx/compose/ui/node/DelegatingNode;

    .line 555
    .line 556
    invoke-virtual {v4}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 557
    .line 558
    .line 559
    move-result-object v4

    .line 560
    move v9, v1

    .line 561
    :goto_1a
    if-eqz v4, :cond_33

    .line 562
    .line 563
    invoke-virtual {v4}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 564
    .line 565
    .line 566
    move-result v10

    .line 567
    and-int/2addr v10, v0

    .line 568
    if-eqz v10, :cond_2e

    .line 569
    .line 570
    move v10, v7

    .line 571
    goto :goto_1b

    .line 572
    :cond_2e
    move v10, v1

    .line 573
    :goto_1b
    if-eqz v10, :cond_32

    .line 574
    .line 575
    add-int/lit8 v9, v9, 0x1

    .line 576
    .line 577
    if-ne v9, v7, :cond_2f

    .line 578
    .line 579
    move-object v2, v4

    .line 580
    goto :goto_1c

    .line 581
    :cond_2f
    if-nez v3, :cond_30

    .line 582
    .line 583
    new-instance v3, Landroidx/compose/runtime/collection/MutableVector;

    .line 584
    .line 585
    new-array v10, v5, [Landroidx/compose/ui/Modifier$Node;

    .line 586
    .line 587
    invoke-direct {v3, v10, v1}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 588
    .line 589
    .line 590
    :cond_30
    if-eqz v2, :cond_31

    .line 591
    .line 592
    invoke-virtual {v3, v2}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 593
    .line 594
    .line 595
    move-object v2, v6

    .line 596
    :cond_31
    invoke-virtual {v3, v4}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 597
    .line 598
    .line 599
    :cond_32
    :goto_1c
    invoke-virtual {v4}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 600
    .line 601
    .line 602
    move-result-object v4

    .line 603
    goto :goto_1a

    .line 604
    :cond_33
    if-ne v9, v7, :cond_34

    .line 605
    .line 606
    goto :goto_18

    .line 607
    :cond_34
    invoke-static {v3}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    .line 608
    .line 609
    .line 610
    move-result-object v2

    .line 611
    goto :goto_18

    .line 612
    :cond_35
    if-eqz v8, :cond_38

    .line 613
    .line 614
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 615
    .line 616
    .line 617
    move-result v0

    .line 618
    move v2, v1

    .line 619
    :goto_1d
    if-ge v2, v0, :cond_38

    .line 620
    .line 621
    invoke-interface {v8, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 622
    .line 623
    .line 624
    move-result-object v3

    .line 625
    check-cast v3, Landroidx/compose/ui/input/key/KeyInputModifierNode;

    .line 626
    .line 627
    invoke-interface {v3, p1}, Landroidx/compose/ui/input/key/KeyInputModifierNode;->onKeyEvent-ZmokQxo(Landroid/view/KeyEvent;)Z

    .line 628
    .line 629
    .line 630
    move-result v3

    .line 631
    if-eqz v3, :cond_36

    .line 632
    .line 633
    return v7

    .line 634
    :cond_36
    add-int/lit8 v2, v2, 0x1

    .line 635
    .line 636
    goto :goto_1d

    .line 637
    :cond_37
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 638
    .line 639
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 640
    .line 641
    .line 642
    move-result-object v0

    .line 643
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 644
    .line 645
    .line 646
    throw p1

    .line 647
    :cond_38
    return v1

    .line 648
    :cond_39
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 649
    .line 650
    const-string v0, "Event can\'t be processed because we do not have an active focus target."

    .line 651
    .line 652
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 653
    .line 654
    .line 655
    move-result-object v0

    .line 656
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 657
    .line 658
    .line 659
    throw p1
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
.end method

.method public dispatchRotaryEvent(Landroidx/compose/ui/input/rotary/RotaryScrollEvent;)Z
    .locals 14
    .param p1    # Landroidx/compose/ui/input/rotary/RotaryScrollEvent;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTraversalKt;->findActiveFocusNode(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string/jumbo v1, "visitAncestors called on an unattached node"

    .line 8
    .line 9
    .line 10
    const/16 v2, 0x4000

    .line 11
    .line 12
    const/16 v3, 0x10

    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    const/4 v5, 0x0

    .line 16
    const/4 v6, 0x1

    .line 17
    if-eqz v0, :cond_e

    .line 18
    .line 19
    invoke-static {v2}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 20
    .line 21
    .line 22
    move-result v7

    .line 23
    invoke-interface {v0}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 24
    .line 25
    .line 26
    move-result-object v8

    .line 27
    invoke-virtual {v8}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 28
    .line 29
    .line 30
    move-result v8

    .line 31
    if-eqz v8, :cond_d

    .line 32
    .line 33
    invoke-interface {v0}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 34
    .line 35
    .line 36
    move-result-object v8

    .line 37
    invoke-virtual {v8}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 38
    .line 39
    .line 40
    move-result-object v8

    .line 41
    invoke-static {v0}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    :goto_0
    if-eqz v0, :cond_c

    .line 46
    .line 47
    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    .line 48
    .line 49
    .line 50
    move-result-object v9

    .line 51
    invoke-virtual {v9}, Landroidx/compose/ui/node/NodeChain;->getHead$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 52
    .line 53
    .line 54
    move-result-object v9

    .line 55
    invoke-virtual {v9}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    .line 56
    .line 57
    .line 58
    move-result v9

    .line 59
    and-int/2addr v9, v7

    .line 60
    if-eqz v9, :cond_a

    .line 61
    .line 62
    :goto_1
    if-eqz v8, :cond_a

    .line 63
    .line 64
    invoke-virtual {v8}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 65
    .line 66
    .line 67
    move-result v9

    .line 68
    and-int/2addr v9, v7

    .line 69
    if-eqz v9, :cond_9

    .line 70
    .line 71
    move-object v10, v4

    .line 72
    move-object v9, v8

    .line 73
    :goto_2
    if-eqz v9, :cond_9

    .line 74
    .line 75
    instance-of v11, v9, Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;

    .line 76
    .line 77
    if-eqz v11, :cond_0

    .line 78
    .line 79
    goto/16 :goto_7

    .line 80
    .line 81
    :cond_0
    invoke-virtual {v9}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 82
    .line 83
    .line 84
    move-result v11

    .line 85
    and-int/2addr v11, v7

    .line 86
    if-eqz v11, :cond_1

    .line 87
    .line 88
    move v11, v6

    .line 89
    goto :goto_3

    .line 90
    :cond_1
    move v11, v5

    .line 91
    :goto_3
    if-eqz v11, :cond_8

    .line 92
    .line 93
    instance-of v11, v9, Landroidx/compose/ui/node/DelegatingNode;

    .line 94
    .line 95
    if-eqz v11, :cond_8

    .line 96
    .line 97
    move-object v11, v9

    .line 98
    check-cast v11, Landroidx/compose/ui/node/DelegatingNode;

    .line 99
    .line 100
    invoke-virtual {v11}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 101
    .line 102
    .line 103
    move-result-object v11

    .line 104
    move v12, v5

    .line 105
    :goto_4
    if-eqz v11, :cond_7

    .line 106
    .line 107
    invoke-virtual {v11}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 108
    .line 109
    .line 110
    move-result v13

    .line 111
    and-int/2addr v13, v7

    .line 112
    if-eqz v13, :cond_2

    .line 113
    .line 114
    move v13, v6

    .line 115
    goto :goto_5

    .line 116
    :cond_2
    move v13, v5

    .line 117
    :goto_5
    if-eqz v13, :cond_6

    .line 118
    .line 119
    add-int/lit8 v12, v12, 0x1

    .line 120
    .line 121
    if-ne v12, v6, :cond_3

    .line 122
    .line 123
    move-object v9, v11

    .line 124
    goto :goto_6

    .line 125
    :cond_3
    if-nez v10, :cond_4

    .line 126
    .line 127
    new-instance v10, Landroidx/compose/runtime/collection/MutableVector;

    .line 128
    .line 129
    new-array v13, v3, [Landroidx/compose/ui/Modifier$Node;

    .line 130
    .line 131
    invoke-direct {v10, v13, v5}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 132
    .line 133
    .line 134
    :cond_4
    if-eqz v9, :cond_5

    .line 135
    .line 136
    invoke-virtual {v10, v9}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-object v9, v4

    .line 140
    :cond_5
    invoke-virtual {v10, v11}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    :cond_6
    :goto_6
    invoke-virtual {v11}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 144
    .line 145
    .line 146
    move-result-object v11

    .line 147
    goto :goto_4

    .line 148
    :cond_7
    if-ne v12, v6, :cond_8

    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_8
    invoke-static {v10}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    .line 152
    .line 153
    .line 154
    move-result-object v9

    .line 155
    goto :goto_2

    .line 156
    :cond_9
    invoke-virtual {v8}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 157
    .line 158
    .line 159
    move-result-object v8

    .line 160
    goto :goto_1

    .line 161
    :cond_a
    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    if-eqz v0, :cond_b

    .line 166
    .line 167
    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    .line 168
    .line 169
    .line 170
    move-result-object v8

    .line 171
    if-eqz v8, :cond_b

    .line 172
    .line 173
    invoke-virtual {v8}, Landroidx/compose/ui/node/NodeChain;->getTail$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 174
    .line 175
    .line 176
    move-result-object v8

    .line 177
    goto/16 :goto_0

    .line 178
    .line 179
    :cond_b
    move-object v8, v4

    .line 180
    goto/16 :goto_0

    .line 181
    .line 182
    :cond_c
    move-object v9, v4

    .line 183
    :goto_7
    check-cast v9, Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;

    .line 184
    .line 185
    goto :goto_8

    .line 186
    :cond_d
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 187
    .line 188
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    throw p1

    .line 196
    :cond_e
    move-object v9, v4

    .line 197
    :goto_8
    if-eqz v9, :cond_36

    .line 198
    .line 199
    invoke-static {v2}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 200
    .line 201
    .line 202
    move-result v0

    .line 203
    invoke-interface {v9}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    invoke-virtual {v2}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 208
    .line 209
    .line 210
    move-result v2

    .line 211
    if-eqz v2, :cond_35

    .line 212
    .line 213
    invoke-interface {v9}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    invoke-static {v9}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    move-object v7, v4

    .line 226
    :goto_9
    if-eqz v2, :cond_1c

    .line 227
    .line 228
    invoke-virtual {v2}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    .line 229
    .line 230
    .line 231
    move-result-object v8

    .line 232
    invoke-virtual {v8}, Landroidx/compose/ui/node/NodeChain;->getHead$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 233
    .line 234
    .line 235
    move-result-object v8

    .line 236
    invoke-virtual {v8}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    .line 237
    .line 238
    .line 239
    move-result v8

    .line 240
    and-int/2addr v8, v0

    .line 241
    if-eqz v8, :cond_1a

    .line 242
    .line 243
    :goto_a
    if-eqz v1, :cond_1a

    .line 244
    .line 245
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 246
    .line 247
    .line 248
    move-result v8

    .line 249
    and-int/2addr v8, v0

    .line 250
    if-eqz v8, :cond_19

    .line 251
    .line 252
    move-object v8, v1

    .line 253
    move-object v10, v4

    .line 254
    :goto_b
    if-eqz v8, :cond_19

    .line 255
    .line 256
    instance-of v11, v8, Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;

    .line 257
    .line 258
    if-eqz v11, :cond_10

    .line 259
    .line 260
    if-nez v7, :cond_f

    .line 261
    .line 262
    new-instance v7, Ljava/util/ArrayList;

    .line 263
    .line 264
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 265
    .line 266
    .line 267
    :cond_f
    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    goto :goto_10

    .line 271
    :cond_10
    invoke-virtual {v8}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 272
    .line 273
    .line 274
    move-result v11

    .line 275
    and-int/2addr v11, v0

    .line 276
    if-eqz v11, :cond_11

    .line 277
    .line 278
    move v11, v6

    .line 279
    goto :goto_c

    .line 280
    :cond_11
    move v11, v5

    .line 281
    :goto_c
    if-eqz v11, :cond_18

    .line 282
    .line 283
    instance-of v11, v8, Landroidx/compose/ui/node/DelegatingNode;

    .line 284
    .line 285
    if-eqz v11, :cond_18

    .line 286
    .line 287
    move-object v11, v8

    .line 288
    check-cast v11, Landroidx/compose/ui/node/DelegatingNode;

    .line 289
    .line 290
    invoke-virtual {v11}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 291
    .line 292
    .line 293
    move-result-object v11

    .line 294
    move v12, v5

    .line 295
    :goto_d
    if-eqz v11, :cond_17

    .line 296
    .line 297
    invoke-virtual {v11}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 298
    .line 299
    .line 300
    move-result v13

    .line 301
    and-int/2addr v13, v0

    .line 302
    if-eqz v13, :cond_12

    .line 303
    .line 304
    move v13, v6

    .line 305
    goto :goto_e

    .line 306
    :cond_12
    move v13, v5

    .line 307
    :goto_e
    if-eqz v13, :cond_16

    .line 308
    .line 309
    add-int/lit8 v12, v12, 0x1

    .line 310
    .line 311
    if-ne v12, v6, :cond_13

    .line 312
    .line 313
    move-object v8, v11

    .line 314
    goto :goto_f

    .line 315
    :cond_13
    if-nez v10, :cond_14

    .line 316
    .line 317
    new-instance v10, Landroidx/compose/runtime/collection/MutableVector;

    .line 318
    .line 319
    new-array v13, v3, [Landroidx/compose/ui/Modifier$Node;

    .line 320
    .line 321
    invoke-direct {v10, v13, v5}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 322
    .line 323
    .line 324
    :cond_14
    if-eqz v8, :cond_15

    .line 325
    .line 326
    invoke-virtual {v10, v8}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    move-object v8, v4

    .line 330
    :cond_15
    invoke-virtual {v10, v11}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 331
    .line 332
    .line 333
    :cond_16
    :goto_f
    invoke-virtual {v11}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 334
    .line 335
    .line 336
    move-result-object v11

    .line 337
    goto :goto_d

    .line 338
    :cond_17
    if-ne v12, v6, :cond_18

    .line 339
    .line 340
    goto :goto_b

    .line 341
    :cond_18
    :goto_10
    invoke-static {v10}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    .line 342
    .line 343
    .line 344
    move-result-object v8

    .line 345
    goto :goto_b

    .line 346
    :cond_19
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 347
    .line 348
    .line 349
    move-result-object v1

    .line 350
    goto :goto_a

    .line 351
    :cond_1a
    invoke-virtual {v2}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    .line 352
    .line 353
    .line 354
    move-result-object v2

    .line 355
    if-eqz v2, :cond_1b

    .line 356
    .line 357
    invoke-virtual {v2}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    .line 358
    .line 359
    .line 360
    move-result-object v1

    .line 361
    if-eqz v1, :cond_1b

    .line 362
    .line 363
    invoke-virtual {v1}, Landroidx/compose/ui/node/NodeChain;->getTail$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 364
    .line 365
    .line 366
    move-result-object v1

    .line 367
    goto/16 :goto_9

    .line 368
    .line 369
    :cond_1b
    move-object v1, v4

    .line 370
    goto/16 :goto_9

    .line 371
    .line 372
    :cond_1c
    if-eqz v7, :cond_1f

    .line 373
    .line 374
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 375
    .line 376
    .line 377
    move-result v1

    .line 378
    add-int/lit8 v1, v1, -0x1

    .line 379
    .line 380
    if-ltz v1, :cond_1f

    .line 381
    .line 382
    :goto_11
    add-int/lit8 v2, v1, -0x1

    .line 383
    .line 384
    invoke-interface {v7, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object v1

    .line 388
    check-cast v1, Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;

    .line 389
    .line 390
    invoke-interface {v1, p1}, Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;->onPreRotaryScrollEvent(Landroidx/compose/ui/input/rotary/RotaryScrollEvent;)Z

    .line 391
    .line 392
    .line 393
    move-result v1

    .line 394
    if-eqz v1, :cond_1d

    .line 395
    .line 396
    return v6

    .line 397
    :cond_1d
    if-gez v2, :cond_1e

    .line 398
    .line 399
    goto :goto_12

    .line 400
    :cond_1e
    move v1, v2

    .line 401
    goto :goto_11

    .line 402
    :cond_1f
    :goto_12
    invoke-interface {v9}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 403
    .line 404
    .line 405
    move-result-object v1

    .line 406
    move-object v2, v4

    .line 407
    :goto_13
    if-eqz v1, :cond_29

    .line 408
    .line 409
    instance-of v8, v1, Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;

    .line 410
    .line 411
    if-eqz v8, :cond_20

    .line 412
    .line 413
    check-cast v1, Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;

    .line 414
    .line 415
    invoke-interface {v1, p1}, Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;->onPreRotaryScrollEvent(Landroidx/compose/ui/input/rotary/RotaryScrollEvent;)Z

    .line 416
    .line 417
    .line 418
    move-result v1

    .line 419
    if-eqz v1, :cond_28

    .line 420
    .line 421
    return v6

    .line 422
    :cond_20
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 423
    .line 424
    .line 425
    move-result v8

    .line 426
    and-int/2addr v8, v0

    .line 427
    if-eqz v8, :cond_21

    .line 428
    .line 429
    move v8, v6

    .line 430
    goto :goto_14

    .line 431
    :cond_21
    move v8, v5

    .line 432
    :goto_14
    if-eqz v8, :cond_28

    .line 433
    .line 434
    instance-of v8, v1, Landroidx/compose/ui/node/DelegatingNode;

    .line 435
    .line 436
    if-eqz v8, :cond_28

    .line 437
    .line 438
    move-object v8, v1

    .line 439
    check-cast v8, Landroidx/compose/ui/node/DelegatingNode;

    .line 440
    .line 441
    invoke-virtual {v8}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 442
    .line 443
    .line 444
    move-result-object v8

    .line 445
    move v10, v5

    .line 446
    :goto_15
    if-eqz v8, :cond_27

    .line 447
    .line 448
    invoke-virtual {v8}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 449
    .line 450
    .line 451
    move-result v11

    .line 452
    and-int/2addr v11, v0

    .line 453
    if-eqz v11, :cond_22

    .line 454
    .line 455
    move v11, v6

    .line 456
    goto :goto_16

    .line 457
    :cond_22
    move v11, v5

    .line 458
    :goto_16
    if-eqz v11, :cond_26

    .line 459
    .line 460
    add-int/lit8 v10, v10, 0x1

    .line 461
    .line 462
    if-ne v10, v6, :cond_23

    .line 463
    .line 464
    move-object v1, v8

    .line 465
    goto :goto_17

    .line 466
    :cond_23
    if-nez v2, :cond_24

    .line 467
    .line 468
    new-instance v2, Landroidx/compose/runtime/collection/MutableVector;

    .line 469
    .line 470
    new-array v11, v3, [Landroidx/compose/ui/Modifier$Node;

    .line 471
    .line 472
    invoke-direct {v2, v11, v5}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 473
    .line 474
    .line 475
    :cond_24
    if-eqz v1, :cond_25

    .line 476
    .line 477
    invoke-virtual {v2, v1}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 478
    .line 479
    .line 480
    move-object v1, v4

    .line 481
    :cond_25
    invoke-virtual {v2, v8}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 482
    .line 483
    .line 484
    :cond_26
    :goto_17
    invoke-virtual {v8}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 485
    .line 486
    .line 487
    move-result-object v8

    .line 488
    goto :goto_15

    .line 489
    :cond_27
    if-ne v10, v6, :cond_28

    .line 490
    .line 491
    goto :goto_13

    .line 492
    :cond_28
    invoke-static {v2}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    .line 493
    .line 494
    .line 495
    move-result-object v1

    .line 496
    goto :goto_13

    .line 497
    :cond_29
    invoke-interface {v9}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 498
    .line 499
    .line 500
    move-result-object v1

    .line 501
    move-object v2, v4

    .line 502
    :goto_18
    if-eqz v1, :cond_33

    .line 503
    .line 504
    instance-of v8, v1, Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;

    .line 505
    .line 506
    if-eqz v8, :cond_2a

    .line 507
    .line 508
    check-cast v1, Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;

    .line 509
    .line 510
    invoke-interface {v1, p1}, Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;->onRotaryScrollEvent(Landroidx/compose/ui/input/rotary/RotaryScrollEvent;)Z

    .line 511
    .line 512
    .line 513
    move-result v1

    .line 514
    if-eqz v1, :cond_32

    .line 515
    .line 516
    return v6

    .line 517
    :cond_2a
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 518
    .line 519
    .line 520
    move-result v8

    .line 521
    and-int/2addr v8, v0

    .line 522
    if-eqz v8, :cond_2b

    .line 523
    .line 524
    move v8, v6

    .line 525
    goto :goto_19

    .line 526
    :cond_2b
    move v8, v5

    .line 527
    :goto_19
    if-eqz v8, :cond_32

    .line 528
    .line 529
    instance-of v8, v1, Landroidx/compose/ui/node/DelegatingNode;

    .line 530
    .line 531
    if-eqz v8, :cond_32

    .line 532
    .line 533
    move-object v8, v1

    .line 534
    check-cast v8, Landroidx/compose/ui/node/DelegatingNode;

    .line 535
    .line 536
    invoke-virtual {v8}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 537
    .line 538
    .line 539
    move-result-object v8

    .line 540
    move v9, v5

    .line 541
    :goto_1a
    if-eqz v8, :cond_31

    .line 542
    .line 543
    invoke-virtual {v8}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 544
    .line 545
    .line 546
    move-result v10

    .line 547
    and-int/2addr v10, v0

    .line 548
    if-eqz v10, :cond_2c

    .line 549
    .line 550
    move v10, v6

    .line 551
    goto :goto_1b

    .line 552
    :cond_2c
    move v10, v5

    .line 553
    :goto_1b
    if-eqz v10, :cond_30

    .line 554
    .line 555
    add-int/lit8 v9, v9, 0x1

    .line 556
    .line 557
    if-ne v9, v6, :cond_2d

    .line 558
    .line 559
    move-object v1, v8

    .line 560
    goto :goto_1c

    .line 561
    :cond_2d
    if-nez v2, :cond_2e

    .line 562
    .line 563
    new-instance v2, Landroidx/compose/runtime/collection/MutableVector;

    .line 564
    .line 565
    new-array v10, v3, [Landroidx/compose/ui/Modifier$Node;

    .line 566
    .line 567
    invoke-direct {v2, v10, v5}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 568
    .line 569
    .line 570
    :cond_2e
    if-eqz v1, :cond_2f

    .line 571
    .line 572
    invoke-virtual {v2, v1}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 573
    .line 574
    .line 575
    move-object v1, v4

    .line 576
    :cond_2f
    invoke-virtual {v2, v8}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 577
    .line 578
    .line 579
    :cond_30
    :goto_1c
    invoke-virtual {v8}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 580
    .line 581
    .line 582
    move-result-object v8

    .line 583
    goto :goto_1a

    .line 584
    :cond_31
    if-ne v9, v6, :cond_32

    .line 585
    .line 586
    goto :goto_18

    .line 587
    :cond_32
    invoke-static {v2}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    .line 588
    .line 589
    .line 590
    move-result-object v1

    .line 591
    goto :goto_18

    .line 592
    :cond_33
    if-eqz v7, :cond_36

    .line 593
    .line 594
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 595
    .line 596
    .line 597
    move-result v0

    .line 598
    move v1, v5

    .line 599
    :goto_1d
    if-ge v1, v0, :cond_36

    .line 600
    .line 601
    invoke-interface {v7, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 602
    .line 603
    .line 604
    move-result-object v2

    .line 605
    check-cast v2, Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;

    .line 606
    .line 607
    invoke-interface {v2, p1}, Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;->onRotaryScrollEvent(Landroidx/compose/ui/input/rotary/RotaryScrollEvent;)Z

    .line 608
    .line 609
    .line 610
    move-result v2

    .line 611
    if-eqz v2, :cond_34

    .line 612
    .line 613
    return v6

    .line 614
    :cond_34
    add-int/lit8 v1, v1, 0x1

    .line 615
    .line 616
    goto :goto_1d

    .line 617
    :cond_35
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 618
    .line 619
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 620
    .line 621
    .line 622
    move-result-object v0

    .line 623
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 624
    .line 625
    .line 626
    throw p1

    .line 627
    :cond_36
    return v5
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
.end method

.method public getFocusRect()Landroidx/compose/ui/geometry/Rect;
    .locals 1
    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;

    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTraversalKt;->findActiveFocusNode(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTraversalKt;->focusRect(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/geometry/Rect;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getFocusTransactionManager()Landroidx/compose/ui/focus/FocusTransactionManager;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->focusTransactionManager:Landroidx/compose/ui/focus/FocusTransactionManager;

    return-object v0
.end method

.method public getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->layoutDirection:Landroidx/compose/ui/unit/LayoutDirection;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "layoutDirection"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public getModifier()Landroidx/compose/ui/Modifier;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->modifier:Landroidx/compose/ui/Modifier;

    return-object v0
.end method

.method public final getRootFocusNode$ui_release()Landroidx/compose/ui/focus/FocusTargetNode;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;

    return-object v0
.end method

.method public moveFocus-3ESFkO8(I)Z
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTraversalKt;->findActiveFocusNode(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-static {v0, p1, v2}, Landroidx/compose/ui/focus/FocusTraversalKt;->customFocusSearch--OM-vw8(Landroidx/compose/ui/focus/FocusTargetNode;ILandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/focus/FocusRequester;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    sget-object v3, Landroidx/compose/ui/focus/FocusRequester;->Companion:Landroidx/compose/ui/focus/FocusRequester$Companion;

    .line 20
    .line 21
    invoke-virtual {v3}, Landroidx/compose/ui/focus/FocusRequester$Companion;->getDefault()Landroidx/compose/ui/focus/FocusRequester;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    const/4 v5, 0x1

    .line 26
    if-eq v2, v4, :cond_2

    .line 27
    .line 28
    invoke-virtual {v3}, Landroidx/compose/ui/focus/FocusRequester$Companion;->getCancel()Landroidx/compose/ui/focus/FocusRequester;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    if-eq v2, p1, :cond_1

    .line 33
    .line 34
    invoke-virtual {v2}, Landroidx/compose/ui/focus/FocusRequester;->focus$ui_release()Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    move v1, v5

    .line 41
    :cond_1
    return v1

    .line 42
    :cond_2
    new-instance v2, Lkotlin/jvm/internal/k1$a;

    .line 43
    .line 44
    invoke-direct {v2}, Lkotlin/jvm/internal/k1$a;-><init>()V

    .line 45
    .line 46
    .line 47
    iget-object v3, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;

    .line 48
    .line 49
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    new-instance v6, Landroidx/compose/ui/focus/FocusOwnerImpl$moveFocus$foundNextItem$1;

    .line 54
    .line 55
    invoke-direct {v6, v0, p0, p1, v2}, Landroidx/compose/ui/focus/FocusOwnerImpl$moveFocus$foundNextItem$1;-><init>(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/FocusOwnerImpl;ILkotlin/jvm/internal/k1$a;)V

    .line 56
    .line 57
    .line 58
    invoke-static {v3, p1, v4, v6}, Landroidx/compose/ui/focus/FocusTraversalKt;->focusSearch-sMXa3k8(Landroidx/compose/ui/focus/FocusTargetNode;ILandroidx/compose/ui/unit/LayoutDirection;Lv3/l;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    iget-boolean v2, v2, Lkotlin/jvm/internal/k1$a;->element:Z

    .line 63
    .line 64
    if-nez v2, :cond_4

    .line 65
    .line 66
    if-nez v0, :cond_3

    .line 67
    .line 68
    invoke-direct {p0, p1}, Landroidx/compose/ui/focus/FocusOwnerImpl;->wrapAroundFocus-3ESFkO8(I)Z

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    if-eqz p1, :cond_4

    .line 73
    .line 74
    :cond_3
    move v1, v5

    .line 75
    :cond_4
    return v1
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method

.method public releaseFocus()V
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;

    const/4 v1, 0x1

    invoke-static {v0, v1, v1}, Landroidx/compose/ui/focus/FocusTransactionsKt;->clearFocus(Landroidx/compose/ui/focus/FocusTargetNode;ZZ)Z

    return-void
.end method

.method public scheduleInvalidation(Landroidx/compose/ui/focus/FocusEventModifierNode;)V
    .locals 1
    .param p1    # Landroidx/compose/ui/focus/FocusEventModifierNode;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 2
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->focusInvalidationManager:Landroidx/compose/ui/focus/FocusInvalidationManager;

    invoke-virtual {v0, p1}, Landroidx/compose/ui/focus/FocusInvalidationManager;->scheduleInvalidation(Landroidx/compose/ui/focus/FocusEventModifierNode;)V

    return-void
.end method

.method public scheduleInvalidation(Landroidx/compose/ui/focus/FocusPropertiesModifierNode;)V
    .locals 1
    .param p1    # Landroidx/compose/ui/focus/FocusPropertiesModifierNode;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 3
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->focusInvalidationManager:Landroidx/compose/ui/focus/FocusInvalidationManager;

    invoke-virtual {v0, p1}, Landroidx/compose/ui/focus/FocusInvalidationManager;->scheduleInvalidation(Landroidx/compose/ui/focus/FocusPropertiesModifierNode;)V

    return-void
.end method

.method public scheduleInvalidation(Landroidx/compose/ui/focus/FocusTargetNode;)V
    .locals 1
    .param p1    # Landroidx/compose/ui/focus/FocusTargetNode;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->focusInvalidationManager:Landroidx/compose/ui/focus/FocusInvalidationManager;

    invoke-virtual {v0, p1}, Landroidx/compose/ui/focus/FocusInvalidationManager;->scheduleInvalidation(Landroidx/compose/ui/focus/FocusTargetNode;)V

    return-void
.end method

.method public setLayoutDirection(Landroidx/compose/ui/unit/LayoutDirection;)V
    .locals 0
    .param p1    # Landroidx/compose/ui/unit/LayoutDirection;
        .annotation build Lp4/l;
        .end annotation
    .end param

    iput-object p1, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->layoutDirection:Landroidx/compose/ui/unit/LayoutDirection;

    return-void
.end method

.method public final setRootFocusNode$ui_release(Landroidx/compose/ui/focus/FocusTargetNode;)V
    .locals 0
    .param p1    # Landroidx/compose/ui/focus/FocusTargetNode;
        .annotation build Lp4/l;
        .end annotation
    .end param

    iput-object p1, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;

    return-void
.end method

.method public takeFocus()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/ui/focus/FocusTargetNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Landroidx/compose/ui/focus/FocusStateImpl;->Inactive:Landroidx/compose/ui/focus/FocusStateImpl;

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;

    .line 12
    .line 13
    sget-object v1, Landroidx/compose/ui/focus/FocusStateImpl;->Active:Landroidx/compose/ui/focus/FocusStateImpl;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroidx/compose/ui/focus/FocusTargetNode;->setFocusState(Landroidx/compose/ui/focus/FocusStateImpl;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
    .line 19
.end method
