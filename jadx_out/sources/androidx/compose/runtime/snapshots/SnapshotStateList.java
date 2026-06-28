package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.v;
import kotlin.r2;
import p4.l;
import u3.h;
import w3.e;

@Stable
@i0(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b*\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u0005:\u0001TB\u0007¢\u0006\u0004\bS\u0010KJ5\u0010\u000b\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00062\u001d\u0010\n\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0002\b\tH\u0082\b¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\r\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00062\u001d\u0010\n\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0002\b\tH\u0082\b¢\u0006\u0004\b\r\u0010\fJ\"\u0010\u000f\u001a\u00020\u000e2\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u000e0\u0007H\u0002J0\u0010\u0010\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00062\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00028\u00010\u0007H\u0082\b¢\u0006\u0004\b\u0010\u0010\fJ3\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\u001e\u0010\n\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00120\u0007H\u0082\bJ3\u0010\u0015\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\u001e\u0010\n\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00120\u0007H\u0082\bJ\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019J\u0018\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010 \u001a\u00020\u000e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0016J\u0018\u0010#\u001a\u00028\u00002\u0006\u0010\"\u001a\u00020!H\u0096\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020!2\u0006\u0010\u001b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b%\u0010&J\b\u0010'\u001a\u00020\u000eH\u0016J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0096\u0002J\u0017\u0010*\u001a\u00020!2\u0006\u0010\u001b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b*\u0010&J\u000e\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+H\u0016J\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+2\u0006\u0010\"\u001a\u00020!H\u0016J\u001e\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010-\u001a\u00020!2\u0006\u0010.\u001a\u00020!H\u0016J\u0017\u00100\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b0\u0010\u001dJ\u001f\u00100\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u001b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b0\u00101J\u001e\u00102\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0016J\u0016\u00102\u001a\u00020\u000e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0016J\b\u00103\u001a\u00020\u0013H\u0016J\u0017\u00104\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b4\u0010\u001dJ\u0016\u00105\u001a\u00020\u000e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0016J\u0017\u00106\u001a\u00028\u00002\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b6\u0010$J\u0016\u00107\u001a\u00020\u000e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0016J \u00108\u001a\u00028\u00002\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u001b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b8\u00109J\u0016\u0010:\u001a\u00020\u00132\u0006\u0010-\u001a\u00020!2\u0006\u0010.\u001a\u00020!J-\u0010?\u001a\u00020!2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u0010;\u001a\u00020!2\u0006\u0010<\u001a\u00020!H\u0000¢\u0006\u0004\b=\u0010>R$\u0010A\u001a\u00020\u00162\u0006\u0010@\u001a\u00020\u00168\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0014\u0010G\u001a\u00020!8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR \u0010L\u001a\b\u0012\u0004\u0012\u00028\u00000\b8@X\u0080\u0004¢\u0006\f\u0012\u0004\bJ\u0010K\u001a\u0004\bH\u0010IR\u0014\u0010N\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010FR \u0010R\u001a\b\u0012\u0004\u0012\u00028\u00000\u00198AX\u0080\u0004¢\u0006\f\u0012\u0004\bQ\u0010K\u001a\u0004\bO\u0010P¨\u0006U"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateList;", "T", "Landroidx/compose/runtime/snapshots/StateObject;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "R", "Lkotlin/Function1;", "Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;", "Lkotlin/u;", "block", "writable", "(Lv3/l;)Ljava/lang/Object;", "withCurrent", "", "mutateBoolean", "mutate", "structural", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "Lkotlin/r2;", "update", "conditionalUpdate", "Landroidx/compose/runtime/snapshots/StateRecord;", t0.b.f22420d, "prependStateRecord", "", "toList", "element", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "", "iterator", "lastIndexOf", "", "listIterator", "fromIndex", "toIndex", "subList", "add", "(ILjava/lang/Object;)V", "addAll", "clear", "remove", "removeAll", "removeAt", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "removeRange", "start", "end", "retainAllInRange$runtime_release", "(Ljava/util/Collection;II)I", "retainAllInRange", "<set-?>", "firstStateRecord", "Landroidx/compose/runtime/snapshots/StateRecord;", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "getStructure$runtime_release", "()I", "structure", "getReadable$runtime_release", "()Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;", "getReadable$runtime_release$annotations", "()V", "readable", "getSize", "size", "getDebuggerDisplayValue", "()Ljava/util/List;", "getDebuggerDisplayValue$annotations", "debuggerDisplayValue", "<init>", "StateListStateRecord", "runtime_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nSnapshotStateList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,484:1\n158#1:485\n197#1,10:487\n207#1:498\n158#1:499\n208#1,9:501\n154#1:510\n217#1,7:516\n227#1,6:526\n190#1,17:532\n207#1:550\n158#1:551\n208#1,9:553\n154#1:562\n217#1,7:568\n227#1,6:578\n195#1:584\n197#1,10:585\n207#1:596\n158#1:597\n208#1,9:599\n154#1:608\n217#1,7:614\n227#1,6:624\n154#1:630\n197#1,10:641\n207#1:652\n158#1:653\n208#1,9:655\n154#1:664\n217#1,7:670\n227#1,6:680\n197#1,10:686\n207#1:697\n158#1:698\n208#1,9:700\n154#1:709\n217#1,7:715\n227#1,6:725\n190#1,17:732\n207#1:750\n158#1:751\n208#1,9:753\n154#1:762\n217#1,7:768\n227#1,6:778\n195#1:784\n194#1,13:785\n207#1:799\n158#1:800\n208#1,9:802\n154#1:811\n217#1,7:817\n227#1,6:827\n195#1:833\n163#1,5:834\n168#1:840\n158#1:841\n169#1,7:843\n154#1:850\n176#1,7:856\n185#1,3:866\n163#1,5:869\n168#1:875\n158#1:876\n169#1,7:878\n154#1:885\n176#1,7:891\n185#1,3:901\n158#1:904\n163#1,5:916\n168#1:922\n158#1:923\n169#1,7:925\n154#1:932\n176#1,7:938\n185#1,3:948\n158#1:952\n154#1:954\n201#1,6:965\n207#1:972\n158#1:973\n208#1,9:975\n154#1:984\n217#1,7:990\n227#1,6:1000\n201#1,7:1006\n158#1:1013\n208#1,9:1015\n154#1:1024\n217#1,7:1030\n227#1,6:1040\n158#1:1047\n154#1:1049\n158#1:1061\n154#1:1063\n2283#2:486\n2283#2:500\n2176#2,2:511\n1714#2:513\n2178#2,2:514\n2180#2,3:523\n2283#2:552\n2176#2,2:563\n1714#2:565\n2178#2,2:566\n2180#2,3:575\n2283#2:598\n2176#2,2:609\n1714#2:611\n2178#2,2:612\n2180#2,3:621\n2176#2,2:631\n1714#2:633\n2178#2,2:635\n2180#2,3:638\n2283#2:654\n2176#2,2:665\n1714#2:667\n2178#2,2:668\n2180#2,3:677\n2283#2:699\n2176#2,2:710\n1714#2:712\n2178#2,2:713\n2180#2,3:722\n2283#2:752\n2176#2,2:763\n1714#2:765\n2178#2,2:766\n2180#2,3:775\n2283#2:801\n2176#2,2:812\n1714#2:814\n2178#2,2:815\n2180#2,3:824\n2283#2:842\n2176#2,2:851\n1714#2:853\n2178#2,2:854\n2180#2,3:863\n2283#2:877\n2176#2,2:886\n1714#2:888\n2178#2,2:889\n2180#2,3:898\n2283#2:905\n2176#2,2:906\n1714#2:908\n2178#2,5:910\n2283#2:915\n2283#2:924\n2176#2,2:933\n1714#2:935\n2178#2,2:936\n2180#2,3:945\n2283#2:953\n2176#2,2:955\n1714#2:957\n2178#2,2:959\n2180#2,3:962\n2283#2:974\n2176#2,2:985\n1714#2:987\n2178#2,2:988\n2180#2,3:997\n2283#2:1014\n2176#2,2:1025\n1714#2:1027\n2178#2,2:1028\n2180#2,3:1037\n2283#2:1048\n2176#2,2:1050\n1714#2:1052\n2178#2,2:1054\n2180#2,3:1057\n2283#2:1062\n2176#2,2:1064\n1714#2:1066\n2178#2,2:1068\n2180#2,3:1071\n82#3:497\n82#3:549\n82#3:595\n82#3:634\n82#3:637\n82#3:651\n82#3:696\n82#3:749\n82#3:798\n82#3:839\n82#3:874\n82#3:909\n82#3:921\n82#3:951\n82#3:958\n82#3:961\n82#3:971\n82#3:1046\n82#3:1053\n82#3:1056\n82#3:1060\n82#3:1067\n82#3:1070\n1#4:731\n*S KotlinDebug\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList\n*L\n62#1:485\n105#1:487,10\n105#1:498\n105#1:499\n105#1:501,9\n105#1:510\n105#1:516,7\n105#1:526,6\n106#1:532,17\n106#1:550\n106#1:551\n106#1:553,9\n106#1:562\n106#1:568,7\n106#1:578,6\n106#1:584\n111#1:585,10\n111#1:596\n111#1:597\n111#1:599,9\n111#1:608\n111#1:614,7\n111#1:624,6\n113#1:630\n121#1:641,10\n121#1:652\n121#1:653\n121#1:655,9\n121#1:664\n121#1:670,7\n121#1:680,6\n122#1:686,10\n122#1:697\n122#1:698\n122#1:700,9\n122#1:709\n122#1:715,7\n122#1:725,6\n123#1:732,17\n123#1:750\n123#1:751\n123#1:753,9\n123#1:762\n123#1:768,7\n123#1:778,6\n123#1:784\n126#1:785,13\n126#1:799\n126#1:800\n126#1:802,9\n126#1:811\n126#1:817,7\n126#1:827,6\n126#1:833\n130#1:834,5\n130#1:840\n130#1:841\n130#1:843,7\n130#1:850\n130#1:856,7\n130#1:866,3\n137#1:869,5\n137#1:875\n137#1:876\n137#1:878,7\n137#1:885\n137#1:891,7\n137#1:901,3\n150#1:904\n160#1:916,5\n160#1:922\n160#1:923\n160#1:925,7\n160#1:932\n160#1:938,7\n160#1:948,3\n168#1:952\n175#1:954\n194#1:965,6\n194#1:972\n194#1:973\n194#1:975,9\n194#1:984\n194#1:990,7\n194#1:1000,6\n194#1:1006,7\n194#1:1013\n194#1:1015,9\n194#1:1024\n194#1:1030,7\n194#1:1040,6\n207#1:1047\n216#1:1049\n207#1:1061\n216#1:1063\n62#1:486\n105#1:500\n105#1:511,2\n105#1:513\n105#1:514,2\n105#1:523,3\n106#1:552\n106#1:563,2\n106#1:565\n106#1:566,2\n106#1:575,3\n111#1:598\n111#1:609,2\n111#1:611\n111#1:612,2\n111#1:621,3\n113#1:631,2\n113#1:633\n113#1:635,2\n113#1:638,3\n121#1:654\n121#1:665,2\n121#1:667\n121#1:668,2\n121#1:677,3\n122#1:699\n122#1:710,2\n122#1:712\n122#1:713,2\n122#1:722,3\n123#1:752\n123#1:763,2\n123#1:765\n123#1:766,2\n123#1:775,3\n126#1:801\n126#1:812,2\n126#1:814\n126#1:815,2\n126#1:824,3\n130#1:842\n130#1:851,2\n130#1:853\n130#1:854,2\n130#1:863,3\n137#1:877\n137#1:886,2\n137#1:888\n137#1:889,2\n137#1:898,3\n150#1:905\n154#1:906,2\n154#1:908\n154#1:910,5\n158#1:915\n160#1:924\n160#1:933,2\n160#1:935\n160#1:936,2\n160#1:945,3\n168#1:953\n175#1:955,2\n175#1:957\n175#1:959,2\n175#1:962,3\n194#1:974\n194#1:985,2\n194#1:987\n194#1:988,2\n194#1:997,3\n194#1:1014\n194#1:1025,2\n194#1:1027\n194#1:1028,2\n194#1:1037,3\n207#1:1048\n216#1:1050,2\n216#1:1052\n216#1:1054,2\n216#1:1057,3\n207#1:1062\n216#1:1064,2\n216#1:1066\n216#1:1068,2\n216#1:1071,3\n105#1:497\n106#1:549\n111#1:595\n113#1:634\n114#1:637\n121#1:651\n122#1:696\n123#1:749\n126#1:798\n130#1:839\n137#1:874\n154#1:909\n160#1:921\n167#1:951\n175#1:958\n176#1:961\n194#1:971\n206#1:1046\n216#1:1053\n217#1:1056\n206#1:1060\n216#1:1067\n217#1:1070\n*E\n"})
/* loaded from: classes.dex */
public final class SnapshotStateList<T> implements StateObject, List<T>, RandomAccess, e {
    public static final int $stable = 0;

    @l
    private StateRecord firstStateRecord = new StateListStateRecord(ExtensionsKt.persistentListOf());

    @StabilityInferred(parameters = 0)
    @i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\b\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0017\b\u0000\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0004\b\u0018\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016R(\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u000f\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014¨\u0006\u0019"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;", "T", "Landroidx/compose/runtime/snapshots/StateRecord;", t0.b.f22420d, "Lkotlin/r2;", "assign", "create", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "list", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "getList$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "setList$runtime_release", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;)V", "", "modification", "I", "getModification$runtime_release", "()I", "setModification$runtime_release", "(I)V", "structuralChange", "getStructuralChange$runtime_release", "setStructuralChange$runtime_release", "<init>", "runtime_release"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nSnapshotStateList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,484:1\n82#2:485\n*S KotlinDebug\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord\n*L\n77#1:485\n*E\n"})
    /* loaded from: classes.dex */
    public static final class StateListStateRecord<T> extends StateRecord {
        public static final int $stable = 8;

        @l
        private PersistentList<? extends T> list;
        private int modification;
        private int structuralChange;

        public StateListStateRecord(@l PersistentList<? extends T> persistentList) {
            this.list = persistentList;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(@l StateRecord stateRecord) {
            Object obj;
            obj = SnapshotStateListKt.sync;
            synchronized (obj) {
                l0.n(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord.assign$lambda$0>");
                this.list = ((StateListStateRecord) stateRecord).list;
                this.modification = ((StateListStateRecord) stateRecord).modification;
                this.structuralChange = ((StateListStateRecord) stateRecord).structuralChange;
                r2 r2Var = r2.f19517a;
            }
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        @l
        public StateRecord create() {
            return new StateListStateRecord(this.list);
        }

        @l
        public final PersistentList<T> getList$runtime_release() {
            return this.list;
        }

        public final int getModification$runtime_release() {
            return this.modification;
        }

        public final int getStructuralChange$runtime_release() {
            return this.structuralChange;
        }

        public final void setList$runtime_release(@l PersistentList<? extends T> persistentList) {
            this.list = persistentList;
        }

        public final void setModification$runtime_release(int i5) {
            this.modification = i5;
        }

        public final void setStructuralChange$runtime_release(int i5) {
            this.structuralChange = i5;
        }
    }

    private final boolean conditionalUpdate(boolean z4, v3.l<? super PersistentList<? extends T>, ? extends PersistentList<? extends T>> lVar) {
        Object obj;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        boolean z5;
        Snapshot current;
        Object obj2;
        do {
            obj = SnapshotStateListKt.sync;
            synchronized (obj) {
                try {
                    StateRecord firstStateRecord = getFirstStateRecord();
                    l0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                    modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                    list$runtime_release = stateListStateRecord.getList$runtime_release();
                    r2 r2Var = r2.f19517a;
                    kotlin.jvm.internal.i0.d(1);
                } catch (Throwable th) {
                    kotlin.jvm.internal.i0.d(1);
                    kotlin.jvm.internal.i0.c(1);
                    throw th;
                }
            }
            kotlin.jvm.internal.i0.c(1);
            l0.m(list$runtime_release);
            PersistentList<? extends T> invoke = lVar.invoke(list$runtime_release);
            z5 = false;
            if (l0.g(invoke, list$runtime_release)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            l0.n(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                try {
                    current = Snapshot.Companion.getCurrent();
                    StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                    obj2 = SnapshotStateListKt.sync;
                    synchronized (obj2) {
                        try {
                            if (stateListStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                                stateListStateRecord3.setList$runtime_release(invoke);
                                if (z4) {
                                    stateListStateRecord3.setStructuralChange$runtime_release(stateListStateRecord3.getStructuralChange$runtime_release() + 1);
                                }
                                stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification$runtime_release() + 1);
                                z5 = true;
                            }
                            kotlin.jvm.internal.i0.d(1);
                        } catch (Throwable th2) {
                            kotlin.jvm.internal.i0.d(1);
                            kotlin.jvm.internal.i0.c(1);
                            throw th2;
                        }
                    }
                    kotlin.jvm.internal.i0.c(1);
                    kotlin.jvm.internal.i0.d(1);
                } catch (Throwable th3) {
                    kotlin.jvm.internal.i0.d(1);
                    kotlin.jvm.internal.i0.c(1);
                    throw th3;
                }
            }
            kotlin.jvm.internal.i0.c(1);
            SnapshotKt.notifyWrite(current, this);
        } while (!z5);
        return true;
    }

    static /* synthetic */ boolean conditionalUpdate$default(SnapshotStateList snapshotStateList, boolean z4, v3.l lVar, int i5, Object obj) {
        Object obj2;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        boolean z5;
        Snapshot current;
        Object obj3;
        if ((i5 & 1) != 0) {
            z4 = true;
        }
        do {
            obj2 = SnapshotStateListKt.sync;
            synchronized (obj2) {
                try {
                    StateRecord firstStateRecord = snapshotStateList.getFirstStateRecord();
                    l0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                    modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                    list$runtime_release = stateListStateRecord.getList$runtime_release();
                    r2 r2Var = r2.f19517a;
                    kotlin.jvm.internal.i0.d(1);
                } catch (Throwable th) {
                    kotlin.jvm.internal.i0.d(1);
                    kotlin.jvm.internal.i0.c(1);
                    throw th;
                }
            }
            kotlin.jvm.internal.i0.c(1);
            l0.m(list$runtime_release);
            PersistentList<? extends T> persistentList = (PersistentList) lVar.invoke(list$runtime_release);
            z5 = false;
            if (l0.g(persistentList, list$runtime_release)) {
                return false;
            }
            StateRecord firstStateRecord2 = snapshotStateList.getFirstStateRecord();
            l0.n(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                try {
                    current = Snapshot.Companion.getCurrent();
                    StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, snapshotStateList, current);
                    obj3 = SnapshotStateListKt.sync;
                    synchronized (obj3) {
                        try {
                            if (stateListStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                                stateListStateRecord3.setList$runtime_release(persistentList);
                                if (z4) {
                                    stateListStateRecord3.setStructuralChange$runtime_release(stateListStateRecord3.getStructuralChange$runtime_release() + 1);
                                }
                                stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification$runtime_release() + 1);
                                z5 = true;
                            }
                            kotlin.jvm.internal.i0.d(1);
                        } catch (Throwable th2) {
                            kotlin.jvm.internal.i0.d(1);
                            kotlin.jvm.internal.i0.c(1);
                            throw th2;
                        }
                    }
                    kotlin.jvm.internal.i0.c(1);
                    kotlin.jvm.internal.i0.d(1);
                } catch (Throwable th3) {
                    kotlin.jvm.internal.i0.d(1);
                    kotlin.jvm.internal.i0.c(1);
                    throw th3;
                }
            }
            kotlin.jvm.internal.i0.c(1);
            SnapshotKt.notifyWrite(current, snapshotStateList);
        } while (!z5);
        return true;
    }

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    public static /* synthetic */ void getReadable$runtime_release$annotations() {
    }

    private final <R> R mutate(v3.l<? super List<T>, ? extends R> lVar) {
        Object obj;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        R invoke;
        Snapshot current;
        Object obj2;
        boolean z4;
        do {
            obj = SnapshotStateListKt.sync;
            synchronized (obj) {
                try {
                    StateRecord firstStateRecord = getFirstStateRecord();
                    l0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                    modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                    list$runtime_release = stateListStateRecord.getList$runtime_release();
                    r2 r2Var = r2.f19517a;
                    kotlin.jvm.internal.i0.d(1);
                } catch (Throwable th) {
                    kotlin.jvm.internal.i0.d(1);
                    kotlin.jvm.internal.i0.c(1);
                    throw th;
                }
            }
            kotlin.jvm.internal.i0.c(1);
            l0.m(list$runtime_release);
            PersistentList.Builder<T> builder = list$runtime_release.builder();
            invoke = lVar.invoke(builder);
            PersistentList<T> build = builder.build();
            if (l0.g(build, list$runtime_release)) {
                break;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            l0.n(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                try {
                    current = Snapshot.Companion.getCurrent();
                    StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                    obj2 = SnapshotStateListKt.sync;
                    synchronized (obj2) {
                        try {
                            if (stateListStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                                stateListStateRecord3.setList$runtime_release(build);
                                stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification$runtime_release() + 1);
                                stateListStateRecord3.setStructuralChange$runtime_release(stateListStateRecord3.getStructuralChange$runtime_release() + 1);
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            kotlin.jvm.internal.i0.d(1);
                        } finally {
                        }
                    }
                    kotlin.jvm.internal.i0.c(1);
                    kotlin.jvm.internal.i0.d(1);
                } catch (Throwable th2) {
                    kotlin.jvm.internal.i0.d(1);
                    kotlin.jvm.internal.i0.c(1);
                    throw th2;
                }
            }
            kotlin.jvm.internal.i0.c(1);
            SnapshotKt.notifyWrite(current, this);
        } while (!z4);
        return invoke;
    }

    private final boolean mutateBoolean(v3.l<? super List<T>, Boolean> lVar) {
        Object obj;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        Boolean invoke;
        Snapshot current;
        Object obj2;
        boolean z4;
        do {
            obj = SnapshotStateListKt.sync;
            synchronized (obj) {
                StateRecord firstStateRecord = getFirstStateRecord();
                l0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                r2 r2Var = r2.f19517a;
            }
            l0.m(list$runtime_release);
            PersistentList.Builder<T> builder = list$runtime_release.builder();
            invoke = lVar.invoke(builder);
            PersistentList<T> build = builder.build();
            if (l0.g(build, list$runtime_release)) {
                break;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            l0.n(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                obj2 = SnapshotStateListKt.sync;
                synchronized (obj2) {
                    if (stateListStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                        stateListStateRecord3.setList$runtime_release(build);
                        z4 = true;
                        stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification$runtime_release() + 1);
                        stateListStateRecord3.setStructuralChange$runtime_release(stateListStateRecord3.getStructuralChange$runtime_release() + 1);
                    } else {
                        z4 = false;
                    }
                }
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!z4);
        return invoke.booleanValue();
    }

    private final void update(boolean z4, v3.l<? super PersistentList<? extends T>, ? extends PersistentList<? extends T>> lVar) {
        Object obj;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        Object obj2;
        boolean z5;
        do {
            obj = SnapshotStateListKt.sync;
            synchronized (obj) {
                try {
                    StateRecord firstStateRecord = getFirstStateRecord();
                    l0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                    modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                    list$runtime_release = stateListStateRecord.getList$runtime_release();
                    r2 r2Var = r2.f19517a;
                    kotlin.jvm.internal.i0.d(1);
                } catch (Throwable th) {
                    kotlin.jvm.internal.i0.d(1);
                    kotlin.jvm.internal.i0.c(1);
                    throw th;
                }
            }
            kotlin.jvm.internal.i0.c(1);
            l0.m(list$runtime_release);
            PersistentList<? extends T> invoke = lVar.invoke(list$runtime_release);
            if (!l0.g(invoke, list$runtime_release)) {
                StateRecord firstStateRecord2 = getFirstStateRecord();
                l0.n(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
                SnapshotKt.getSnapshotInitializer();
                synchronized (SnapshotKt.getLock()) {
                    try {
                        current = Snapshot.Companion.getCurrent();
                        StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                        obj2 = SnapshotStateListKt.sync;
                        synchronized (obj2) {
                            try {
                                if (stateListStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                                    stateListStateRecord3.setList$runtime_release(invoke);
                                    if (z4) {
                                        stateListStateRecord3.setStructuralChange$runtime_release(stateListStateRecord3.getStructuralChange$runtime_release() + 1);
                                    }
                                    stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification$runtime_release() + 1);
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                kotlin.jvm.internal.i0.d(1);
                            } catch (Throwable th2) {
                                kotlin.jvm.internal.i0.d(1);
                                kotlin.jvm.internal.i0.c(1);
                                throw th2;
                            }
                        }
                        kotlin.jvm.internal.i0.c(1);
                        kotlin.jvm.internal.i0.d(1);
                    } catch (Throwable th3) {
                        kotlin.jvm.internal.i0.d(1);
                        kotlin.jvm.internal.i0.c(1);
                        throw th3;
                    }
                }
                kotlin.jvm.internal.i0.c(1);
                SnapshotKt.notifyWrite(current, this);
            } else {
                return;
            }
        } while (!z5);
    }

    static /* synthetic */ void update$default(SnapshotStateList snapshotStateList, boolean z4, v3.l lVar, int i5, Object obj) {
        Object obj2;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        Object obj3;
        boolean z5;
        if ((i5 & 1) != 0) {
            z4 = true;
        }
        do {
            obj2 = SnapshotStateListKt.sync;
            synchronized (obj2) {
                try {
                    StateRecord firstStateRecord = snapshotStateList.getFirstStateRecord();
                    l0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                    modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                    list$runtime_release = stateListStateRecord.getList$runtime_release();
                    r2 r2Var = r2.f19517a;
                    kotlin.jvm.internal.i0.d(1);
                } catch (Throwable th) {
                    kotlin.jvm.internal.i0.d(1);
                    kotlin.jvm.internal.i0.c(1);
                    throw th;
                }
            }
            kotlin.jvm.internal.i0.c(1);
            l0.m(list$runtime_release);
            PersistentList<? extends T> persistentList = (PersistentList) lVar.invoke(list$runtime_release);
            if (!l0.g(persistentList, list$runtime_release)) {
                StateRecord firstStateRecord2 = snapshotStateList.getFirstStateRecord();
                l0.n(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
                SnapshotKt.getSnapshotInitializer();
                synchronized (SnapshotKt.getLock()) {
                    try {
                        current = Snapshot.Companion.getCurrent();
                        StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, snapshotStateList, current);
                        obj3 = SnapshotStateListKt.sync;
                        synchronized (obj3) {
                            try {
                                if (stateListStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                                    stateListStateRecord3.setList$runtime_release(persistentList);
                                    if (z4) {
                                        stateListStateRecord3.setStructuralChange$runtime_release(stateListStateRecord3.getStructuralChange$runtime_release() + 1);
                                    }
                                    stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification$runtime_release() + 1);
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                kotlin.jvm.internal.i0.d(1);
                            } catch (Throwable th2) {
                                kotlin.jvm.internal.i0.d(1);
                                kotlin.jvm.internal.i0.c(1);
                                throw th2;
                            }
                        }
                        kotlin.jvm.internal.i0.c(1);
                        kotlin.jvm.internal.i0.d(1);
                    } catch (Throwable th3) {
                        kotlin.jvm.internal.i0.d(1);
                        kotlin.jvm.internal.i0.c(1);
                        throw th3;
                    }
                }
                kotlin.jvm.internal.i0.c(1);
                SnapshotKt.notifyWrite(current, snapshotStateList);
            } else {
                return;
            }
        } while (!z5);
    }

    private final <R> R withCurrent(v3.l<? super StateListStateRecord<T>, ? extends R> lVar) {
        StateRecord firstStateRecord = getFirstStateRecord();
        l0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return lVar.invoke(SnapshotKt.current((StateListStateRecord) firstStateRecord));
    }

    private final <R> R writable(v3.l<? super StateListStateRecord<T>, ? extends R> lVar) {
        Snapshot current;
        R invoke;
        StateRecord firstStateRecord = getFirstStateRecord();
        l0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        StateListStateRecord stateListStateRecord = (StateListStateRecord) firstStateRecord;
        SnapshotKt.getSnapshotInitializer();
        synchronized (SnapshotKt.getLock()) {
            try {
                current = Snapshot.Companion.getCurrent();
                invoke = lVar.invoke(SnapshotKt.writableRecord(stateListStateRecord, this, current));
                kotlin.jvm.internal.i0.d(1);
            } catch (Throwable th) {
                kotlin.jvm.internal.i0.d(1);
                kotlin.jvm.internal.i0.c(1);
                throw th;
            }
        }
        kotlin.jvm.internal.i0.c(1);
        SnapshotKt.notifyWrite(current, this);
        return invoke;
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T t5) {
        Object obj;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        boolean z4;
        Snapshot current;
        Object obj2;
        do {
            obj = SnapshotStateListKt.sync;
            synchronized (obj) {
                StateRecord firstStateRecord = getFirstStateRecord();
                l0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                r2 r2Var = r2.f19517a;
            }
            l0.m(list$runtime_release);
            PersistentList<T> add = list$runtime_release.add((PersistentList<T>) t5);
            z4 = false;
            if (l0.g(add, list$runtime_release)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            l0.n(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                obj2 = SnapshotStateListKt.sync;
                synchronized (obj2) {
                    if (stateListStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                        stateListStateRecord3.setList$runtime_release(add);
                        stateListStateRecord3.setStructuralChange$runtime_release(stateListStateRecord3.getStructuralChange$runtime_release() + 1);
                        stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification$runtime_release() + 1);
                        z4 = true;
                    }
                }
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!z4);
        return true;
    }

    @Override // java.util.List
    public boolean addAll(int i5, @l Collection<? extends T> collection) {
        return mutateBoolean(new SnapshotStateList$addAll$1(i5, collection));
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        Snapshot current;
        Object obj;
        StateRecord firstStateRecord = getFirstStateRecord();
        l0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        StateListStateRecord stateListStateRecord = (StateListStateRecord) firstStateRecord;
        SnapshotKt.getSnapshotInitializer();
        synchronized (SnapshotKt.getLock()) {
            current = Snapshot.Companion.getCurrent();
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord, this, current);
            obj = SnapshotStateListKt.sync;
            synchronized (obj) {
                stateListStateRecord2.setList$runtime_release(ExtensionsKt.persistentListOf());
                stateListStateRecord2.setModification$runtime_release(stateListStateRecord2.getModification$runtime_release() + 1);
                stateListStateRecord2.setStructuralChange$runtime_release(stateListStateRecord2.getStructuralChange$runtime_release() + 1);
            }
        }
        SnapshotKt.notifyWrite(current, this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return getReadable$runtime_release().getList$runtime_release().contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@l Collection<? extends Object> collection) {
        return getReadable$runtime_release().getList$runtime_release().containsAll(collection);
    }

    @Override // java.util.List
    public T get(int i5) {
        return getReadable$runtime_release().getList$runtime_release().get(i5);
    }

    @l
    @h(name = "getDebuggerDisplayValue")
    public final List<T> getDebuggerDisplayValue() {
        StateRecord firstStateRecord = getFirstStateRecord();
        l0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord)).getList$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    @l
    public StateRecord getFirstStateRecord() {
        return this.firstStateRecord;
    }

    @l
    public final StateListStateRecord<T> getReadable$runtime_release() {
        StateRecord firstStateRecord = getFirstStateRecord();
        l0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (StateListStateRecord) SnapshotKt.readable((StateListStateRecord) firstStateRecord, this);
    }

    public int getSize() {
        return getReadable$runtime_release().getList$runtime_release().size();
    }

    public final int getStructure$runtime_release() {
        StateRecord firstStateRecord = getFirstStateRecord();
        l0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord)).getStructuralChange$runtime_release();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return getReadable$runtime_release().getList$runtime_release().indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return getReadable$runtime_release().getList$runtime_release().isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @l
    public Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return getReadable$runtime_release().getList$runtime_release().lastIndexOf(obj);
    }

    @Override // java.util.List
    @l
    public ListIterator<T> listIterator() {
        return new StateListIterator(this, 0);
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(@l StateRecord stateRecord) {
        stateRecord.setNext$runtime_release(getFirstStateRecord());
        l0.n(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        this.firstStateRecord = (StateListStateRecord) stateRecord;
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int i5) {
        return removeAt(i5);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(@l Collection<? extends Object> collection) {
        Object obj;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        boolean z4;
        Snapshot current;
        Object obj2;
        do {
            obj = SnapshotStateListKt.sync;
            synchronized (obj) {
                StateRecord firstStateRecord = getFirstStateRecord();
                l0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                r2 r2Var = r2.f19517a;
            }
            l0.m(list$runtime_release);
            PersistentList<T> removeAll = list$runtime_release.removeAll((Collection<? extends T>) collection);
            z4 = false;
            if (l0.g(removeAll, list$runtime_release)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            l0.n(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                obj2 = SnapshotStateListKt.sync;
                synchronized (obj2) {
                    if (stateListStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                        stateListStateRecord3.setList$runtime_release(removeAll);
                        stateListStateRecord3.setStructuralChange$runtime_release(stateListStateRecord3.getStructuralChange$runtime_release() + 1);
                        stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification$runtime_release() + 1);
                        z4 = true;
                    }
                }
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!z4);
        return true;
    }

    public T removeAt(int i5) {
        Object obj;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        Object obj2;
        boolean z4;
        T t5 = get(i5);
        do {
            obj = SnapshotStateListKt.sync;
            synchronized (obj) {
                StateRecord firstStateRecord = getFirstStateRecord();
                l0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                r2 r2Var = r2.f19517a;
            }
            l0.m(list$runtime_release);
            PersistentList<T> removeAt = list$runtime_release.removeAt(i5);
            if (l0.g(removeAt, list$runtime_release)) {
                break;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            l0.n(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                obj2 = SnapshotStateListKt.sync;
                synchronized (obj2) {
                    if (stateListStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                        stateListStateRecord3.setList$runtime_release(removeAt);
                        z4 = true;
                        stateListStateRecord3.setStructuralChange$runtime_release(stateListStateRecord3.getStructuralChange$runtime_release() + 1);
                        stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification$runtime_release() + 1);
                    } else {
                        z4 = false;
                    }
                }
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!z4);
        return t5;
    }

    public final void removeRange(int i5, int i6) {
        Object obj;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        Object obj2;
        boolean z4;
        do {
            obj = SnapshotStateListKt.sync;
            synchronized (obj) {
                StateRecord firstStateRecord = getFirstStateRecord();
                l0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                r2 r2Var = r2.f19517a;
            }
            l0.m(list$runtime_release);
            PersistentList.Builder<T> builder = list$runtime_release.builder();
            builder.subList(i5, i6).clear();
            PersistentList<T> build = builder.build();
            if (!l0.g(build, list$runtime_release)) {
                StateRecord firstStateRecord2 = getFirstStateRecord();
                l0.n(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
                SnapshotKt.getSnapshotInitializer();
                synchronized (SnapshotKt.getLock()) {
                    current = Snapshot.Companion.getCurrent();
                    StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                    obj2 = SnapshotStateListKt.sync;
                    synchronized (obj2) {
                        if (stateListStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                            stateListStateRecord3.setList$runtime_release(build);
                            z4 = true;
                            stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification$runtime_release() + 1);
                            stateListStateRecord3.setStructuralChange$runtime_release(stateListStateRecord3.getStructuralChange$runtime_release() + 1);
                        } else {
                            z4 = false;
                        }
                    }
                }
                SnapshotKt.notifyWrite(current, this);
            } else {
                return;
            }
        } while (!z4);
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(@l Collection<? extends Object> collection) {
        return mutateBoolean(new SnapshotStateList$retainAll$1(collection));
    }

    public final int retainAllInRange$runtime_release(@l Collection<? extends T> collection, int i5, int i6) {
        Object obj;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        Object obj2;
        boolean z4;
        int size = size();
        do {
            obj = SnapshotStateListKt.sync;
            synchronized (obj) {
                StateRecord firstStateRecord = getFirstStateRecord();
                l0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                r2 r2Var = r2.f19517a;
            }
            l0.m(list$runtime_release);
            PersistentList.Builder<T> builder = list$runtime_release.builder();
            builder.subList(i5, i6).retainAll(collection);
            PersistentList<T> build = builder.build();
            if (l0.g(build, list$runtime_release)) {
                break;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            l0.n(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                obj2 = SnapshotStateListKt.sync;
                synchronized (obj2) {
                    if (stateListStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                        stateListStateRecord3.setList$runtime_release(build);
                        z4 = true;
                        stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification$runtime_release() + 1);
                        stateListStateRecord3.setStructuralChange$runtime_release(stateListStateRecord3.getStructuralChange$runtime_release() + 1);
                    } else {
                        z4 = false;
                    }
                }
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!z4);
        return size - size();
    }

    @Override // java.util.List
    public T set(int i5, T t5) {
        Object obj;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        Object obj2;
        boolean z4;
        T t6 = get(i5);
        do {
            obj = SnapshotStateListKt.sync;
            synchronized (obj) {
                StateRecord firstStateRecord = getFirstStateRecord();
                l0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                r2 r2Var = r2.f19517a;
            }
            l0.m(list$runtime_release);
            PersistentList<T> persistentList = list$runtime_release.set(i5, (int) t5);
            if (l0.g(persistentList, list$runtime_release)) {
                break;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            l0.n(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                obj2 = SnapshotStateListKt.sync;
                synchronized (obj2) {
                    if (stateListStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                        stateListStateRecord3.setList$runtime_release(persistentList);
                        z4 = true;
                        stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification$runtime_release() + 1);
                    } else {
                        z4 = false;
                    }
                }
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!z4);
        return t6;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    @l
    public List<T> subList(int i5, int i6) {
        boolean z4;
        boolean z5 = true;
        if (i5 >= 0 && i5 <= i6) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4 || i6 > size()) {
            z5 = false;
        }
        if (z5) {
            return new SubList(this, i5, i6);
        }
        throw new IllegalArgumentException("fromIndex or toIndex are out of bounds".toString());
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return v.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) v.b(this, tArr);
    }

    @l
    public final List<T> toList() {
        return getReadable$runtime_release().getList$runtime_release();
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(@l Collection<? extends T> collection) {
        Object obj;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        boolean z4;
        Snapshot current;
        Object obj2;
        do {
            obj = SnapshotStateListKt.sync;
            synchronized (obj) {
                StateRecord firstStateRecord = getFirstStateRecord();
                l0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                r2 r2Var = r2.f19517a;
            }
            l0.m(list$runtime_release);
            PersistentList<T> addAll = list$runtime_release.addAll(collection);
            z4 = false;
            if (l0.g(addAll, list$runtime_release)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            l0.n(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                obj2 = SnapshotStateListKt.sync;
                synchronized (obj2) {
                    if (stateListStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                        stateListStateRecord3.setList$runtime_release(addAll);
                        stateListStateRecord3.setStructuralChange$runtime_release(stateListStateRecord3.getStructuralChange$runtime_release() + 1);
                        stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification$runtime_release() + 1);
                        z4 = true;
                    }
                }
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!z4);
        return true;
    }

    @Override // java.util.List
    @l
    public ListIterator<T> listIterator(int i5) {
        return new StateListIterator(this, i5);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        Object obj2;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        boolean z4;
        Snapshot current;
        Object obj3;
        do {
            obj2 = SnapshotStateListKt.sync;
            synchronized (obj2) {
                StateRecord firstStateRecord = getFirstStateRecord();
                l0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                r2 r2Var = r2.f19517a;
            }
            l0.m(list$runtime_release);
            PersistentList<T> remove = list$runtime_release.remove((PersistentList<T>) obj);
            z4 = false;
            if (l0.g(remove, list$runtime_release)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            l0.n(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                obj3 = SnapshotStateListKt.sync;
                synchronized (obj3) {
                    if (stateListStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                        stateListStateRecord3.setList$runtime_release(remove);
                        stateListStateRecord3.setStructuralChange$runtime_release(stateListStateRecord3.getStructuralChange$runtime_release() + 1);
                        stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification$runtime_release() + 1);
                        z4 = true;
                    }
                }
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!z4);
        return true;
    }

    @Override // java.util.List
    public void add(int i5, T t5) {
        Object obj;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        Object obj2;
        boolean z4;
        do {
            obj = SnapshotStateListKt.sync;
            synchronized (obj) {
                StateRecord firstStateRecord = getFirstStateRecord();
                l0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                r2 r2Var = r2.f19517a;
            }
            l0.m(list$runtime_release);
            PersistentList<T> add = list$runtime_release.add(i5, (int) t5);
            if (l0.g(add, list$runtime_release)) {
                return;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            l0.n(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                obj2 = SnapshotStateListKt.sync;
                synchronized (obj2) {
                    if (stateListStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                        stateListStateRecord3.setList$runtime_release(add);
                        z4 = true;
                        stateListStateRecord3.setStructuralChange$runtime_release(stateListStateRecord3.getStructuralChange$runtime_release() + 1);
                        stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification$runtime_release() + 1);
                    } else {
                        z4 = false;
                    }
                }
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!z4);
    }
}
