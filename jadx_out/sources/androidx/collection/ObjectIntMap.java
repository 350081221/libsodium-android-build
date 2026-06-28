package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.NoSuchElementException;
import kotlin.a1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import t0.b;
import u3.e;
import u3.i;
import v3.p;

@i0(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\t\b\u0004¢\u0006\u0004\bJ\u00107J\u0006\u0010\u0004\u001a\u00020\u0003J\u0006\u0010\u0005\u001a\u00020\u0003J\u0006\u0010\u0006\u001a\u00020\u0003J\u0006\u0010\u0007\u001a\u00020\u0003J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0010\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000fH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0018\u001a\u00020\u00162!\u0010\u0017\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00160\u0012H\u0081\bø\u0001\u0000JD\u0010\u001b\u001a\u00020\u001626\u0010\u0017\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00160\u0019H\u0086\bø\u0001\u0000J/\u0010\u001c\u001a\u00020\u00162!\u0010\u0017\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00160\u0012H\u0086\bø\u0001\u0000J/\u0010\u001d\u001a\u00020\u00162!\u0010\u0017\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00160\u0012H\u0086\bø\u0001\u0000J&\u0010\u001f\u001a\u00020\u00032\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0019H\u0086\bø\u0001\u0000J&\u0010\u0004\u001a\u00020\u00032\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0019H\u0086\bø\u0001\u0000J\u0006\u0010 \u001a\u00020\tJ&\u0010 \u001a\u00020\t2\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0019H\u0086\bø\u0001\u0000J\u0018\u0010!\u001a\u00020\u00032\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u00032\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b#\u0010\"J\u000e\u0010$\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\tJ:\u0010,\u001a\u00020+2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010'\u001a\u00020%2\b\b\u0002\u0010(\u001a\u00020%2\b\b\u0002\u0010)\u001a\u00020\t2\b\b\u0002\u0010*\u001a\u00020%H\u0007Jx\u0010,\u001a\u00020+2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010'\u001a\u00020%2\b\b\u0002\u0010(\u001a\u00020%2\b\b\u0002\u0010)\u001a\u00020\t2\b\b\u0002\u0010*\u001a\u00020%28\b\u0004\u0010-\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020%0\u0019H\u0087\bø\u0001\u0000J\b\u0010.\u001a\u00020\tH\u0016J\u0013\u00100\u001a\u00020\u00032\b\u0010/\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u00101\u001a\u00020+H\u0016J\u0017\u00102\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0001¢\u0006\u0004\b2\u0010\u000bR\u001c\u00104\u001a\u0002038\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b4\u00105\u0012\u0004\b6\u00107R$\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002088\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b9\u0010:\u0012\u0004\b;\u00107R\u001c\u0010=\u001a\u00020<8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b=\u0010>\u0012\u0004\b?\u00107R\u001c\u0010@\u001a\u00020\t8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b@\u0010A\u0012\u0004\bB\u00107R\u001c\u0010C\u001a\u00020\t8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bC\u0010A\u0012\u0004\bD\u00107R\u0011\u0010G\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0011\u0010I\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bH\u0010F\u0082\u0001\u0001K\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006L"}, d2 = {"Landroidx/collection/ObjectIntMap;", "K", "", "", "any", "none", "isEmpty", "isNotEmpty", DatabaseFileArchive.COLUMN_KEY, "", "get", "(Ljava/lang/Object;)I", "defaultValue", "getOrDefault", "(Ljava/lang/Object;I)I", "Lkotlin/Function0;", "getOrElse", "(Ljava/lang/Object;Lv3/a;)I", "Lkotlin/Function1;", "Lkotlin/v0;", "name", "index", "Lkotlin/r2;", "block", "forEachIndexed", "Lkotlin/Function2;", b.f22420d, "forEach", "forEachKey", "forEachValue", "predicate", "all", "count", "contains", "(Ljava/lang/Object;)Z", "containsKey", "containsValue", "", "separator", "prefix", "postfix", "limit", "truncated", "", "joinToString", "transform", TTDownloadField.TT_HASHCODE, "other", "equals", "toString", "findKeyIndex", "", "metadata", "[J", "getMetadata$annotations", "()V", "", "keys", "[Ljava/lang/Object;", "getKeys$annotations", "", "values", "[I", "getValues$annotations", "_capacity", "I", "get_capacity$collection$annotations", "_size", "get_size$collection$annotations", "getCapacity", "()I", "capacity", "getSize", "size", "<init>", "Landroidx/collection/MutableObjectIntMap;", "collection"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nObjectIntMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1058:1\n373#1,6:1061\n383#1,3:1068\n386#1,9:1072\n373#1,6:1081\n383#1,3:1088\n386#1,9:1092\n373#1,6:1101\n383#1,3:1108\n386#1,9:1112\n401#1,4:1121\n373#1,6:1125\n383#1,3:1132\n386#1,2:1136\n406#1,2:1138\n389#1,6:1140\n408#1:1146\n401#1,4:1147\n373#1,6:1151\n383#1,3:1158\n386#1,2:1162\n406#1,2:1164\n389#1,6:1166\n408#1:1172\n401#1,4:1173\n373#1,6:1177\n383#1,3:1184\n386#1,2:1188\n406#1,2:1190\n389#1,6:1192\n408#1:1198\n428#1,3:1199\n373#1,6:1202\n383#1,3:1209\n386#1,2:1213\n431#1,2:1215\n389#1,6:1217\n433#1:1223\n401#1,4:1224\n373#1,6:1228\n383#1,3:1235\n386#1,2:1239\n406#1,2:1241\n389#1,6:1243\n408#1:1249\n401#1,4:1250\n373#1,6:1254\n383#1,3:1261\n386#1,2:1265\n406#1,2:1267\n389#1,6:1269\n408#1:1275\n401#1,4:1276\n373#1,6:1280\n383#1,3:1287\n386#1,2:1291\n406#1,2:1293\n389#1,6:1295\n408#1:1301\n401#1,4:1302\n373#1,6:1306\n383#1,3:1313\n386#1,2:1317\n406#1,2:1319\n389#1,6:1321\n408#1:1327\n401#1,4:1328\n373#1,6:1332\n383#1,3:1339\n386#1,2:1343\n406#1,2:1345\n389#1,6:1347\n408#1:1353\n401#1,4:1354\n373#1,6:1358\n383#1,3:1365\n386#1,2:1369\n406#1,2:1371\n389#1,6:1373\n408#1:1379\n537#1,11:1396\n401#1,4:1407\n373#1,6:1411\n383#1,3:1418\n386#1,2:1422\n406#1:1424\n548#1,10:1425\n407#1:1435\n389#1,6:1436\n408#1:1442\n558#1,2:1443\n537#1,11:1445\n401#1,4:1456\n373#1,6:1460\n383#1,3:1467\n386#1,2:1471\n406#1:1473\n548#1,10:1474\n407#1:1484\n389#1,6:1485\n408#1:1491\n558#1,2:1492\n537#1,11:1494\n401#1,4:1505\n373#1,6:1509\n383#1,3:1516\n386#1,2:1520\n406#1:1522\n548#1,10:1523\n407#1:1533\n389#1,6:1534\n408#1:1540\n558#1,2:1541\n537#1,11:1543\n401#1,4:1554\n373#1,6:1558\n383#1,3:1565\n386#1,2:1569\n406#1:1571\n548#1,10:1572\n407#1:1582\n389#1,6:1583\n408#1:1589\n558#1,2:1590\n537#1,11:1592\n401#1,4:1603\n373#1,6:1607\n383#1,3:1614\n386#1,2:1618\n406#1:1620\n548#1,10:1621\n407#1:1631\n389#1,6:1632\n408#1:1638\n558#1,2:1639\n1810#2:1059\n1672#2:1060\n1810#2:1067\n1672#2:1071\n1810#2:1087\n1672#2:1091\n1810#2:1107\n1672#2:1111\n1810#2:1131\n1672#2:1135\n1810#2:1157\n1672#2:1161\n1810#2:1183\n1672#2:1187\n1810#2:1208\n1672#2:1212\n1810#2:1234\n1672#2:1238\n1810#2:1260\n1672#2:1264\n1810#2:1286\n1672#2:1290\n1810#2:1312\n1672#2:1316\n1810#2:1338\n1672#2:1342\n1810#2:1364\n1672#2:1368\n1589#2,3:1380\n1603#2:1383\n1599#2:1384\n1779#2,3:1385\n1793#2,3:1388\n1717#2:1391\n1705#2:1392\n1699#2:1393\n1712#2:1394\n1802#2:1395\n1810#2:1417\n1672#2:1421\n1810#2:1466\n1672#2:1470\n1810#2:1515\n1672#2:1519\n1810#2:1564\n1672#2:1568\n1810#2:1613\n1672#2:1617\n*S KotlinDebug\n*F\n+ 1 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n*L\n404#1:1061,6\n404#1:1068,3\n404#1:1072,9\n417#1:1081,6\n417#1:1088,3\n417#1:1092,9\n430#1:1101,6\n430#1:1108,3\n430#1:1112,9\n439#1:1121,4\n439#1:1125,6\n439#1:1132,3\n439#1:1136,2\n439#1:1138,2\n439#1:1140,6\n439#1:1146\n449#1:1147,4\n449#1:1151,6\n449#1:1158,3\n449#1:1162,2\n449#1:1164,2\n449#1:1166,6\n449#1:1172\n465#1:1173,4\n465#1:1177,6\n465#1:1184,3\n465#1:1188,2\n465#1:1190,2\n465#1:1192,6\n465#1:1198\n488#1:1199,3\n488#1:1202,6\n488#1:1209,3\n488#1:1213,2\n488#1:1215,2\n488#1:1217,6\n488#1:1223\n512#1:1224,4\n512#1:1228,6\n512#1:1235,3\n512#1:1239,2\n512#1:1241,2\n512#1:1243,6\n512#1:1249\n547#1:1250,4\n547#1:1254,6\n547#1:1261,3\n547#1:1265,2\n547#1:1267,2\n547#1:1269,6\n547#1:1275\n547#1:1276,4\n547#1:1280,6\n547#1:1287,3\n547#1:1291,2\n547#1:1293,2\n547#1:1295,6\n547#1:1301\n568#1:1302,4\n568#1:1306,6\n568#1:1313,3\n568#1:1317,2\n568#1:1319,2\n568#1:1321,6\n568#1:1327\n597#1:1328,4\n597#1:1332,6\n597#1:1339,3\n597#1:1343,2\n597#1:1345,2\n597#1:1347,6\n597#1:1353\n619#1:1354,4\n619#1:1358,6\n619#1:1365,3\n619#1:1369,2\n619#1:1371,2\n619#1:1373,6\n619#1:1379\n-1#1:1396,11\n-1#1:1407,4\n-1#1:1411,6\n-1#1:1418,3\n-1#1:1422,2\n-1#1:1424\n-1#1:1425,10\n-1#1:1435\n-1#1:1436,6\n-1#1:1442\n-1#1:1443,2\n-1#1:1445,11\n-1#1:1456,4\n-1#1:1460,6\n-1#1:1467,3\n-1#1:1471,2\n-1#1:1473\n-1#1:1474,10\n-1#1:1484\n-1#1:1485,6\n-1#1:1491\n-1#1:1492,2\n-1#1:1494,11\n-1#1:1505,4\n-1#1:1509,6\n-1#1:1516,3\n-1#1:1520,2\n-1#1:1522\n-1#1:1523,10\n-1#1:1533\n-1#1:1534,6\n-1#1:1540\n-1#1:1541,2\n-1#1:1543,11\n-1#1:1554,4\n-1#1:1558,6\n-1#1:1565,3\n-1#1:1569,2\n-1#1:1571\n-1#1:1572,10\n-1#1:1582\n-1#1:1583,6\n-1#1:1589\n-1#1:1590,2\n-1#1:1592,11\n-1#1:1603,4\n-1#1:1607,6\n-1#1:1614,3\n-1#1:1618,2\n-1#1:1620\n-1#1:1621,10\n-1#1:1631\n-1#1:1632,6\n-1#1:1638\n-1#1:1639,2\n378#1:1059\n385#1:1060\n404#1:1067\n404#1:1071\n417#1:1087\n417#1:1091\n430#1:1107\n430#1:1111\n439#1:1131\n439#1:1135\n449#1:1157\n449#1:1161\n465#1:1183\n465#1:1187\n488#1:1208\n488#1:1212\n512#1:1234\n512#1:1238\n547#1:1260\n547#1:1264\n547#1:1286\n547#1:1290\n568#1:1312\n568#1:1316\n597#1:1338\n597#1:1342\n619#1:1364\n619#1:1368\n638#1:1380,3\n639#1:1383\n642#1:1384\n646#1:1385,3\n647#1:1388,3\n648#1:1391\n649#1:1392\n649#1:1393\n653#1:1394\n656#1:1395\n-1#1:1417\n-1#1:1421\n-1#1:1466\n-1#1:1470\n-1#1:1515\n-1#1:1519\n-1#1:1564\n-1#1:1568\n-1#1:1613\n-1#1:1617\n*E\n"})
/* loaded from: classes.dex */
public abstract class ObjectIntMap<K> {

    @e
    public int _capacity;

    @e
    public int _size;

    @l
    @e
    public Object[] keys;

    @l
    @e
    public long[] metadata;

    @l
    @e
    public int[] values;

    private ObjectIntMap() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.keys = ContainerHelpersKt.EMPTY_OBJECTS;
        this.values = IntSetKt.getEmptyIntArray();
    }

    public /* synthetic */ ObjectIntMap(w wVar) {
        this();
    }

    @a1
    public static /* synthetic */ void getKeys$annotations() {
    }

    @a1
    public static /* synthetic */ void getMetadata$annotations() {
    }

    @a1
    public static /* synthetic */ void getValues$annotations() {
    }

    public static /* synthetic */ void get_capacity$collection$annotations() {
    }

    public static /* synthetic */ void get_size$collection$annotations() {
    }

    public static /* synthetic */ String joinToString$default(ObjectIntMap objectIntMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i5, CharSequence charSequence4, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i6 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i6 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i6 & 4) == 0 ? charSequence3 : "";
        if ((i6 & 8) != 0) {
            i5 = -1;
        }
        int i7 = i5;
        if ((i6 & 16) != 0) {
            charSequence4 = "...";
        }
        return objectIntMap.joinToString(charSequence, charSequence5, charSequence6, i7, charSequence4);
    }

    public final boolean all(@l p<? super K, ? super Integer, Boolean> predicate) {
        boolean z4;
        l0.p(predicate, "predicate");
        Object[] objArr = this.keys;
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i5 = 0;
            while (true) {
                long j5 = jArr[i5];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((255 & j5) < 128) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            int i8 = (i5 << 3) + i7;
                            if (!predicate.invoke(objArr[i8], Integer.valueOf(iArr[i8])).booleanValue()) {
                                return false;
                            }
                        }
                        j5 >>= 8;
                    }
                    if (i6 != 8) {
                        break;
                    }
                }
                if (i5 == length) {
                    break;
                }
                i5++;
            }
        }
        return true;
    }

    public final boolean any() {
        return this._size != 0;
    }

    public final boolean contains(K k5) {
        return findKeyIndex(k5) >= 0;
    }

    public final boolean containsKey(K k5) {
        return findKeyIndex(k5) >= 0;
    }

    public final boolean containsValue(int i5) {
        boolean z4;
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i6 = 0;
            while (true) {
                long j5 = jArr[i6];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                    for (int i8 = 0; i8 < i7; i8++) {
                        if ((255 & j5) < 128) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4 && i5 == iArr[(i6 << 3) + i8]) {
                            return true;
                        }
                        j5 >>= 8;
                    }
                    if (i7 != 8) {
                        break;
                    }
                }
                if (i6 == length) {
                    break;
                }
                i6++;
            }
        }
        return false;
    }

    public final int count() {
        return getSize();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean equals(@m Object obj) {
        boolean z4;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ObjectIntMap)) {
            return false;
        }
        ObjectIntMap objectIntMap = (ObjectIntMap) obj;
        if (objectIntMap.getSize() != getSize()) {
            return false;
        }
        Object[] objArr = this.keys;
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i5 = 0;
            while (true) {
                long j5 = jArr[i5];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((255 & j5) < 128) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            int i8 = (i5 << 3) + i7;
                            if (iArr[i8] != objectIntMap.get(objArr[i8])) {
                                return false;
                            }
                        }
                        j5 >>= 8;
                    }
                    if (i6 != 8) {
                        break;
                    }
                }
                if (i5 == length) {
                    break;
                }
                i5++;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0073, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
    
        return -1;
     */
    @kotlin.a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int findKeyIndex(K r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r18.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0._capacity
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.metadata
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L48:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L50
            r11 = r12
            goto L51
        L50:
            r11 = r2
        L51:
            if (r11 == 0) goto L6c
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.keys
            r15 = r15[r11]
            boolean r15 = kotlin.jvm.internal.l0.g(r15, r1)
            if (r15 == 0) goto L66
            return r11
        L66:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L48
        L6c:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L77
            r1 = -1
            return r1
        L77:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ObjectIntMap.findKeyIndex(java.lang.Object):int");
    }

    public final void forEach(@l p<? super K, ? super Integer, r2> block) {
        boolean z4;
        l0.p(block, "block");
        Object[] objArr = this.keys;
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i5 = 0;
            while (true) {
                long j5 = jArr[i5];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((255 & j5) < 128) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            int i8 = (i5 << 3) + i7;
                            block.invoke(objArr[i8], Integer.valueOf(iArr[i8]));
                        }
                        j5 >>= 8;
                    }
                    if (i6 != 8) {
                        return;
                    }
                }
                if (i5 != length) {
                    i5++;
                } else {
                    return;
                }
            }
        }
    }

    @a1
    public final void forEachIndexed(@l v3.l<? super Integer, r2> block) {
        boolean z4;
        l0.p(block, "block");
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i5 = 0;
            while (true) {
                long j5 = jArr[i5];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((255 & j5) < 128) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            block.invoke(Integer.valueOf((i5 << 3) + i7));
                        }
                        j5 >>= 8;
                    }
                    if (i6 != 8) {
                        return;
                    }
                }
                if (i5 != length) {
                    i5++;
                } else {
                    return;
                }
            }
        }
    }

    public final void forEachKey(@l v3.l<? super K, r2> block) {
        boolean z4;
        l0.p(block, "block");
        Object[] objArr = this.keys;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i5 = 0;
            while (true) {
                long j5 = jArr[i5];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((255 & j5) < 128) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            block.invoke(objArr[(i5 << 3) + i7]);
                        }
                        j5 >>= 8;
                    }
                    if (i6 != 8) {
                        return;
                    }
                }
                if (i5 != length) {
                    i5++;
                } else {
                    return;
                }
            }
        }
    }

    public final void forEachValue(@l v3.l<? super Integer, r2> block) {
        boolean z4;
        l0.p(block, "block");
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i5 = 0;
            while (true) {
                long j5 = jArr[i5];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((255 & j5) < 128) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            block.invoke(Integer.valueOf(iArr[(i5 << 3) + i7]));
                        }
                        j5 >>= 8;
                    }
                    if (i6 != 8) {
                        return;
                    }
                }
                if (i5 != length) {
                    i5++;
                } else {
                    return;
                }
            }
        }
    }

    public final int get(K k5) {
        int findKeyIndex = findKeyIndex(k5);
        if (findKeyIndex >= 0) {
            return this.values[findKeyIndex];
        }
        throw new NoSuchElementException("There is no key " + k5 + " in the map");
    }

    public final int getCapacity() {
        return this._capacity;
    }

    public final int getOrDefault(K k5, int i5) {
        int findKeyIndex = findKeyIndex(k5);
        if (findKeyIndex >= 0) {
            return this.values[findKeyIndex];
        }
        return i5;
    }

    public final int getOrElse(K k5, @l v3.a<Integer> defaultValue) {
        l0.p(defaultValue, "defaultValue");
        int findKeyIndex = findKeyIndex(k5);
        if (findKeyIndex >= 0) {
            return this.values[findKeyIndex];
        }
        return defaultValue.invoke().intValue();
    }

    public final int getSize() {
        return this._size;
    }

    public int hashCode() {
        boolean z4;
        int i5;
        Object[] objArr = this.keys;
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        int i6 = 0;
        if (length >= 0) {
            int i7 = 0;
            int i8 = 0;
            while (true) {
                long j5 = jArr[i7];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i7 - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((255 & j5) < 128) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            int i11 = (i7 << 3) + i10;
                            Object obj = objArr[i11];
                            int i12 = iArr[i11];
                            if (obj != null) {
                                i5 = obj.hashCode();
                            } else {
                                i5 = 0;
                            }
                            i8 += Integer.hashCode(i12) ^ i5;
                        }
                        j5 >>= 8;
                    }
                    if (i9 != 8) {
                        return i8;
                    }
                }
                if (i7 != length) {
                    i7++;
                } else {
                    i6 = i8;
                    break;
                }
            }
        }
        return i6;
    }

    public final boolean isEmpty() {
        return this._size == 0;
    }

    public final boolean isNotEmpty() {
        return this._size != 0;
    }

    @l
    @i
    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, 31, null);
    }

    @l
    @i
    public final String joinToString(@l CharSequence separator) {
        l0.p(separator, "separator");
        return joinToString$default(this, separator, null, null, 0, null, 30, null);
    }

    @l
    @i
    public final String joinToString(@l CharSequence separator, @l CharSequence prefix) {
        l0.p(separator, "separator");
        l0.p(prefix, "prefix");
        return joinToString$default(this, separator, prefix, null, 0, null, 28, null);
    }

    @l
    @i
    public final String joinToString(@l CharSequence separator, @l CharSequence prefix, @l CharSequence postfix) {
        l0.p(separator, "separator");
        l0.p(prefix, "prefix");
        l0.p(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, 0, null, 24, null);
    }

    @l
    @i
    public final String joinToString(@l CharSequence separator, @l CharSequence prefix, @l CharSequence postfix, int i5) {
        l0.p(separator, "separator");
        l0.p(prefix, "prefix");
        l0.p(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, i5, null, 16, null);
    }

    @l
    @i
    public final String joinToString(@l CharSequence separator, @l CharSequence prefix, @l CharSequence postfix, int i5, @l CharSequence truncated) {
        Object[] objArr;
        Object[] objArr2;
        int i6;
        l0.p(separator, "separator");
        l0.p(prefix, "prefix");
        l0.p(postfix, "postfix");
        l0.p(truncated, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        Object[] objArr3 = this.keys;
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i7 = 0;
            int i8 = 0;
            loop0: while (true) {
                long j5 = jArr[i7];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8;
                    int i10 = 8 - ((~(i7 - length)) >>> 31);
                    int i11 = 0;
                    while (i11 < i10) {
                        if ((j5 & 255) < 128) {
                            int i12 = (i7 << 3) + i11;
                            Object obj = objArr3[i12];
                            int i13 = iArr[i12];
                            objArr2 = objArr3;
                            if (i8 == i5) {
                                sb.append(truncated);
                                break loop0;
                            }
                            if (i8 != 0) {
                                sb.append(separator);
                            }
                            sb.append(obj);
                            sb.append(o0.a.f20835h);
                            sb.append(i13);
                            i8++;
                            i6 = 8;
                        } else {
                            objArr2 = objArr3;
                            i6 = i9;
                        }
                        j5 >>= i6;
                        i11++;
                        i9 = i6;
                        objArr3 = objArr2;
                    }
                    objArr = objArr3;
                    if (i10 != i9) {
                        break;
                    }
                } else {
                    objArr = objArr3;
                }
                if (i7 == length) {
                    break;
                }
                i7++;
                objArr3 = objArr;
            }
        }
        sb.append(postfix);
        String sb2 = sb.toString();
        l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final boolean none() {
        return this._size == 0;
    }

    @l
    public String toString() {
        boolean z4;
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        Object[] objArr = this.keys;
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i5 = 0;
            int i6 = 0;
            while (true) {
                long j5 = jArr[i5];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8 - ((~(i5 - length)) >>> 31);
                    for (int i8 = 0; i8 < i7; i8++) {
                        if ((255 & j5) < 128) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            int i9 = (i5 << 3) + i8;
                            Object obj = objArr[i9];
                            int i10 = iArr[i9];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                            sb.append(i10);
                            i6++;
                            if (i6 < this._size) {
                                sb.append(',');
                                sb.append(' ');
                            }
                        }
                        j5 >>= 8;
                    }
                    if (i7 != 8) {
                        break;
                    }
                }
                if (i5 == length) {
                    break;
                }
                i5++;
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        l0.o(sb2, "s.append('}').toString()");
        return sb2;
    }

    public static /* synthetic */ String joinToString$default(ObjectIntMap objectIntMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i5, CharSequence charSequence4, p transform, int i6, Object obj) {
        long[] jArr;
        long[] jArr2;
        int i7;
        if (obj == null) {
            CharSequence separator = (i6 & 1) != 0 ? ", " : charSequence;
            CharSequence prefix = (i6 & 2) != 0 ? "" : charSequence2;
            CharSequence postfix = (i6 & 4) == 0 ? charSequence3 : "";
            int i8 = (i6 & 8) != 0 ? -1 : i5;
            CharSequence truncated = (i6 & 16) != 0 ? "..." : charSequence4;
            l0.p(separator, "separator");
            l0.p(prefix, "prefix");
            l0.p(postfix, "postfix");
            l0.p(truncated, "truncated");
            l0.p(transform, "transform");
            StringBuilder sb = new StringBuilder();
            sb.append(prefix);
            Object[] objArr = objectIntMap.keys;
            int[] iArr = objectIntMap.values;
            long[] jArr3 = objectIntMap.metadata;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i9 = 0;
                int i10 = 0;
                loop0: while (true) {
                    long j5 = jArr3[i9];
                    int i11 = i9;
                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i12 = 8;
                        int i13 = 8 - ((~(i11 - length)) >>> 31);
                        int i14 = 0;
                        while (i14 < i13) {
                            if ((j5 & 255) < 128) {
                                int i15 = (i11 << 3) + i14;
                                Object obj2 = objArr[i15];
                                int i16 = iArr[i15];
                                if (i10 == i8) {
                                    sb.append(truncated);
                                    break loop0;
                                }
                                if (i10 != 0) {
                                    sb.append(separator);
                                }
                                jArr2 = jArr3;
                                sb.append((CharSequence) transform.invoke(obj2, Integer.valueOf(i16)));
                                i10++;
                                i7 = 8;
                            } else {
                                jArr2 = jArr3;
                                i7 = i12;
                            }
                            j5 >>= i7;
                            i14++;
                            i12 = i7;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        if (i13 != i12) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                    }
                    if (i11 == length) {
                        break;
                    }
                    i9 = i11 + 1;
                    jArr3 = jArr;
                }
                String sb2 = sb.toString();
                l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
            }
            sb.append(postfix);
            String sb22 = sb.toString();
            l0.o(sb22, "StringBuilder().apply(builderAction).toString()");
            return sb22;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final boolean any(@l p<? super K, ? super Integer, Boolean> predicate) {
        l0.p(predicate, "predicate");
        Object[] objArr = this.keys;
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i5 = 0;
            while (true) {
                long j5 = jArr[i5];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((255 & j5) < 128) {
                            int i8 = (i5 << 3) + i7;
                            if (predicate.invoke(objArr[i8], Integer.valueOf(iArr[i8])).booleanValue()) {
                                return true;
                            }
                        }
                        j5 >>= 8;
                    }
                    if (i6 != 8) {
                        break;
                    }
                }
                if (i5 == length) {
                    break;
                }
                i5++;
            }
        }
        return false;
    }

    public final int count(@l p<? super K, ? super Integer, Boolean> predicate) {
        l0.p(predicate, "predicate");
        Object[] objArr = this.keys;
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        int i5 = 0;
        if (length >= 0) {
            int i6 = 0;
            int i7 = 0;
            while (true) {
                long j5 = jArr[i6];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8 - ((~(i6 - length)) >>> 31);
                    for (int i9 = 0; i9 < i8; i9++) {
                        if ((255 & j5) < 128) {
                            int i10 = (i6 << 3) + i9;
                            if (predicate.invoke(objArr[i10], Integer.valueOf(iArr[i10])).booleanValue()) {
                                i7++;
                            }
                        }
                        j5 >>= 8;
                    }
                    if (i8 != 8) {
                        return i7;
                    }
                }
                if (i6 == length) {
                    i5 = i7;
                    break;
                }
                i6++;
            }
        }
        return i5;
    }

    @l
    @i
    public final String joinToString(@l CharSequence charSequence, @l CharSequence prefix, @l CharSequence postfix, int i5, @l CharSequence truncated, @l p<? super K, ? super Integer, ? extends CharSequence> transform) {
        Object[] objArr;
        Object[] objArr2;
        CharSequence separator = charSequence;
        l0.p(separator, "separator");
        l0.p(prefix, "prefix");
        l0.p(postfix, "postfix");
        l0.p(truncated, "truncated");
        l0.p(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        Object[] objArr3 = this.keys;
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i6 = 0;
            int i7 = 0;
            loop0: while (true) {
                long j5 = jArr[i6];
                int i8 = i6;
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                    int i10 = 0;
                    while (i10 < i9) {
                        if ((j5 & 255) < 128) {
                            int i11 = (i8 << 3) + i10;
                            Object obj = objArr3[i11];
                            int i12 = iArr[i11];
                            objArr2 = objArr3;
                            if (i7 == i5) {
                                sb.append(truncated);
                                break loop0;
                            }
                            if (i7 != 0) {
                                sb.append(separator);
                            }
                            sb.append(transform.invoke(obj, Integer.valueOf(i12)));
                            i7++;
                        } else {
                            objArr2 = objArr3;
                        }
                        j5 >>= 8;
                        i10++;
                        separator = charSequence;
                        objArr3 = objArr2;
                    }
                    objArr = objArr3;
                    if (i9 != 8) {
                        break;
                    }
                } else {
                    objArr = objArr3;
                }
                if (i8 == length) {
                    break;
                }
                i6 = i8 + 1;
                separator = charSequence;
                objArr3 = objArr;
            }
            String sb2 = sb.toString();
            l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
        sb.append(postfix);
        String sb22 = sb.toString();
        l0.o(sb22, "StringBuilder().apply(builderAction).toString()");
        return sb22;
    }

    @l
    @i
    public final String joinToString(@l CharSequence separator, @l CharSequence prefix, @l CharSequence postfix, int i5, @l p<? super K, ? super Integer, ? extends CharSequence> transform) {
        int i6;
        l0.p(separator, "separator");
        l0.p(prefix, "prefix");
        l0.p(postfix, "postfix");
        l0.p(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        Object[] objArr = this.keys;
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i7 = 0;
            int i8 = 0;
            loop0: while (true) {
                long j5 = jArr[i7];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8;
                    int i10 = 8 - ((~(i7 - length)) >>> 31);
                    int i11 = 0;
                    while (i11 < i10) {
                        if ((j5 & 255) < 128) {
                            int i12 = (i7 << 3) + i11;
                            Object obj = objArr[i12];
                            int i13 = iArr[i12];
                            if (i8 == i5) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i8 != 0) {
                                sb.append(separator);
                            }
                            sb.append(transform.invoke(obj, Integer.valueOf(i13)));
                            i8++;
                            i6 = 8;
                        } else {
                            i6 = i9;
                        }
                        j5 >>= i6;
                        i11++;
                        i9 = i6;
                    }
                    if (i10 != i9) {
                        break;
                    }
                }
                if (i7 == length) {
                    break;
                }
                i7++;
            }
        }
        sb.append(postfix);
        String sb2 = sb.toString();
        l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @l
    @i
    public final String joinToString(@l CharSequence separator, @l CharSequence prefix, @l CharSequence postfix, @l p<? super K, ? super Integer, ? extends CharSequence> transform) {
        int i5;
        l0.p(separator, "separator");
        l0.p(prefix, "prefix");
        l0.p(postfix, "postfix");
        l0.p(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        Object[] objArr = this.keys;
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i6 = 0;
            int i7 = 0;
            loop0: while (true) {
                long j5 = jArr[i6];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8;
                    int i9 = 8 - ((~(i6 - length)) >>> 31);
                    int i10 = 0;
                    while (i10 < i9) {
                        if ((j5 & 255) < 128) {
                            int i11 = (i6 << 3) + i10;
                            Object obj = objArr[i11];
                            int i12 = iArr[i11];
                            if (i7 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i7 != 0) {
                                sb.append(separator);
                            }
                            sb.append(transform.invoke(obj, Integer.valueOf(i12)));
                            i7++;
                            i5 = 8;
                        } else {
                            i5 = i8;
                        }
                        j5 >>= i5;
                        i10++;
                        i8 = i5;
                    }
                    if (i9 != i8) {
                        break;
                    }
                }
                if (i6 == length) {
                    break;
                }
                i6++;
            }
        }
        sb.append(postfix);
        String sb2 = sb.toString();
        l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @l
    @i
    public final String joinToString(@l CharSequence separator, @l CharSequence prefix, @l p<? super K, ? super Integer, ? extends CharSequence> transform) {
        int i5;
        l0.p(separator, "separator");
        l0.p(prefix, "prefix");
        l0.p(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        Object[] objArr = this.keys;
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i6 = 0;
            int i7 = 0;
            loop0: while (true) {
                long j5 = jArr[i6];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8;
                    int i9 = 8 - ((~(i6 - length)) >>> 31);
                    int i10 = 0;
                    while (i10 < i9) {
                        if ((j5 & 255) < 128) {
                            int i11 = (i6 << 3) + i10;
                            Object obj = objArr[i11];
                            int i12 = iArr[i11];
                            if (i7 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i7 != 0) {
                                sb.append(separator);
                            }
                            sb.append(transform.invoke(obj, Integer.valueOf(i12)));
                            i7++;
                            i5 = 8;
                        } else {
                            i5 = i8;
                        }
                        j5 >>= i5;
                        i10++;
                        i8 = i5;
                    }
                    if (i9 != i8) {
                        break;
                    }
                }
                if (i6 == length) {
                    break;
                }
                i6++;
            }
        }
        sb.append((CharSequence) "");
        String sb2 = sb.toString();
        l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @l
    @i
    public final String joinToString(@l CharSequence separator, @l p<? super K, ? super Integer, ? extends CharSequence> transform) {
        int i5;
        l0.p(separator, "separator");
        l0.p(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        Object[] objArr = this.keys;
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i6 = 0;
            int i7 = 0;
            loop0: while (true) {
                long j5 = jArr[i6];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8;
                    int i9 = 8 - ((~(i6 - length)) >>> 31);
                    int i10 = 0;
                    while (i10 < i9) {
                        if ((j5 & 255) < 128) {
                            int i11 = (i6 << 3) + i10;
                            Object obj = objArr[i11];
                            int i12 = iArr[i11];
                            if (i7 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i7 != 0) {
                                sb.append(separator);
                            }
                            sb.append(transform.invoke(obj, Integer.valueOf(i12)));
                            i7++;
                            i5 = 8;
                        } else {
                            i5 = i8;
                        }
                        j5 >>= i5;
                        i10++;
                        i8 = i5;
                    }
                    if (i9 != i8) {
                        break;
                    }
                }
                if (i6 == length) {
                    break;
                }
                i6++;
            }
        }
        sb.append((CharSequence) "");
        String sb2 = sb.toString();
        l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @l
    @i
    public final String joinToString(@l p<? super K, ? super Integer, ? extends CharSequence> transform) {
        int i5;
        l0.p(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        Object[] objArr = this.keys;
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i6 = 0;
            int i7 = 0;
            loop0: while (true) {
                long j5 = jArr[i6];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8;
                    int i9 = 8 - ((~(i6 - length)) >>> 31);
                    int i10 = 0;
                    while (i10 < i9) {
                        if ((j5 & 255) < 128) {
                            int i11 = (i6 << 3) + i10;
                            Object obj = objArr[i11];
                            int i12 = iArr[i11];
                            if (i7 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i7 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            sb.append(transform.invoke(obj, Integer.valueOf(i12)));
                            i7++;
                            i5 = 8;
                        } else {
                            i5 = i8;
                        }
                        j5 >>= i5;
                        i10++;
                        i8 = i5;
                    }
                    if (i9 != i8) {
                        break;
                    }
                }
                if (i6 == length) {
                    break;
                }
                i6++;
            }
        }
        sb.append((CharSequence) "");
        String sb2 = sb.toString();
        l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
