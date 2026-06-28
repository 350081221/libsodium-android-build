package androidx.collection;

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

@i0(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\bF\u00103J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\u0011\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0086\u0002J\u0016\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\tJ\"\u0010\u000e\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\rH\u0086\bø\u0001\u0000J/\u0010\u0015\u001a\u00020\u00132!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\u000fH\u0081\bø\u0001\u0000JD\u0010\u0018\u001a\u00020\u001326\u0010\u0014\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00130\u0016H\u0086\bø\u0001\u0000J/\u0010\u0019\u001a\u00020\u00132!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00130\u000fH\u0086\bø\u0001\u0000J/\u0010\u001a\u001a\u00020\u00132!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00130\u000fH\u0086\bø\u0001\u0000J&\u0010\u001c\u001a\u00020\u00022\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\u0016H\u0086\bø\u0001\u0000J&\u0010\u0003\u001a\u00020\u00022\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\u0016H\u0086\bø\u0001\u0000J\u0006\u0010\u001d\u001a\u00020\tJ&\u0010\u001d\u001a\u00020\t2\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\u0016H\u0086\bø\u0001\u0000J\u0011\u0010\u001e\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0086\u0002J\u000e\u0010\u001f\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010 \u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\tJ:\u0010(\u001a\u00020'2\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010#\u001a\u00020!2\b\b\u0002\u0010$\u001a\u00020!2\b\b\u0002\u0010%\u001a\u00020\t2\b\b\u0002\u0010&\u001a\u00020!H\u0007Jx\u0010(\u001a\u00020'2\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010#\u001a\u00020!2\b\b\u0002\u0010$\u001a\u00020!2\b\b\u0002\u0010%\u001a\u00020\t2\b\b\u0002\u0010&\u001a\u00020!28\b\u0004\u0010)\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020!0\u0016H\u0087\bø\u0001\u0000J\b\u0010*\u001a\u00020\tH\u0016J\u0013\u0010,\u001a\u00020\u00022\b\u0010+\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010-\u001a\u00020'H\u0016J\u0010\u0010.\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0001R\u001c\u00100\u001a\u00020/8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b0\u00101\u0012\u0004\b2\u00103R\u001c\u00105\u001a\u0002048\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b5\u00106\u0012\u0004\b7\u00103R\u001c\u00109\u001a\u0002088\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b9\u0010:\u0012\u0004\b;\u00103R\u001c\u0010<\u001a\u00020\t8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b<\u0010=\u0012\u0004\b>\u00103R\u001c\u0010?\u001a\u00020\t8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b?\u0010=\u0012\u0004\b@\u00103R\u0011\u0010C\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0011\u0010E\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bD\u0010B\u0082\u0001\u0001G\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006H"}, d2 = {"Landroidx/collection/FloatIntMap;", "", "", "any", "none", "isEmpty", "isNotEmpty", "", DatabaseFileArchive.COLUMN_KEY, "", "get", "defaultValue", "getOrDefault", "Lkotlin/Function0;", "getOrElse", "Lkotlin/Function1;", "Lkotlin/v0;", "name", "index", "Lkotlin/r2;", "block", "forEachIndexed", "Lkotlin/Function2;", b.f22420d, "forEach", "forEachKey", "forEachValue", "predicate", "all", "count", "contains", "containsKey", "containsValue", "", "separator", "prefix", "postfix", "limit", "truncated", "", "joinToString", "transform", TTDownloadField.TT_HASHCODE, "other", "equals", "toString", "findKeyIndex", "", "metadata", "[J", "getMetadata$annotations", "()V", "", "keys", "[F", "getKeys$annotations", "", "values", "[I", "getValues$annotations", "_capacity", "I", "get_capacity$collection$annotations", "_size", "get_size$collection$annotations", "getCapacity", "()I", "capacity", "getSize", "size", "<init>", "Landroidx/collection/MutableFloatIntMap;", "collection"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nFloatIntMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatIntMap.kt\nandroidx/collection/FloatIntMap\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 3 FloatSet.kt\nandroidx/collection/FloatSetKt\n*L\n1#1,1031:1\n357#1,6:1034\n367#1,3:1041\n370#1,9:1045\n357#1,6:1054\n367#1,3:1061\n370#1,9:1065\n357#1,6:1074\n367#1,3:1081\n370#1,9:1085\n385#1,4:1094\n357#1,6:1098\n367#1,3:1105\n370#1,2:1109\n389#1,2:1111\n373#1,6:1113\n391#1:1119\n385#1,4:1120\n357#1,6:1124\n367#1,3:1131\n370#1,2:1135\n389#1,2:1137\n373#1,6:1139\n391#1:1145\n385#1,4:1146\n357#1,6:1150\n367#1,3:1157\n370#1,2:1161\n389#1,2:1163\n373#1,6:1165\n391#1:1171\n410#1,3:1172\n357#1,6:1175\n367#1,3:1182\n370#1,2:1186\n413#1,2:1188\n373#1,6:1190\n415#1:1196\n385#1,4:1197\n357#1,6:1201\n367#1,3:1208\n370#1,2:1212\n389#1,2:1214\n373#1,6:1216\n391#1:1222\n385#1,4:1223\n357#1,6:1227\n367#1,3:1234\n370#1,2:1238\n389#1,2:1240\n373#1,6:1242\n391#1:1248\n385#1,4:1249\n357#1,6:1253\n367#1,3:1260\n370#1,2:1264\n389#1,2:1266\n373#1,6:1268\n391#1:1274\n385#1,4:1275\n357#1,6:1279\n367#1,3:1286\n370#1,2:1290\n389#1,2:1292\n373#1,6:1294\n391#1:1300\n385#1,4:1301\n357#1,6:1305\n367#1,3:1312\n370#1,2:1316\n389#1,2:1318\n373#1,6:1320\n391#1:1326\n385#1,4:1327\n357#1,6:1331\n367#1,3:1338\n370#1,2:1342\n389#1,2:1344\n373#1,6:1346\n391#1:1352\n519#1,11:1369\n385#1,4:1380\n357#1,6:1384\n367#1,3:1391\n370#1,2:1395\n389#1:1397\n530#1,10:1398\n390#1:1408\n373#1,6:1409\n391#1:1415\n540#1,2:1416\n519#1,11:1418\n385#1,4:1429\n357#1,6:1433\n367#1,3:1440\n370#1,2:1444\n389#1:1446\n530#1,10:1447\n390#1:1457\n373#1,6:1458\n391#1:1464\n540#1,2:1465\n519#1,11:1467\n385#1,4:1478\n357#1,6:1482\n367#1,3:1489\n370#1,2:1493\n389#1:1495\n530#1,10:1496\n390#1:1506\n373#1,6:1507\n391#1:1513\n540#1,2:1514\n519#1,11:1516\n385#1,4:1527\n357#1,6:1531\n367#1,3:1538\n370#1,2:1542\n389#1:1544\n530#1,10:1545\n390#1:1555\n373#1,6:1556\n391#1:1562\n540#1,2:1563\n519#1,11:1565\n385#1,4:1576\n357#1,6:1580\n367#1,3:1587\n370#1,2:1591\n389#1:1593\n530#1,10:1594\n390#1:1604\n373#1,6:1605\n391#1:1611\n540#1,2:1612\n1810#2:1032\n1672#2:1033\n1810#2:1040\n1672#2:1044\n1810#2:1060\n1672#2:1064\n1810#2:1080\n1672#2:1084\n1810#2:1104\n1672#2:1108\n1810#2:1130\n1672#2:1134\n1810#2:1156\n1672#2:1160\n1810#2:1181\n1672#2:1185\n1810#2:1207\n1672#2:1211\n1810#2:1233\n1672#2:1237\n1810#2:1259\n1672#2:1263\n1810#2:1285\n1672#2:1289\n1810#2:1311\n1672#2:1315\n1810#2:1337\n1672#2:1341\n1603#2:1356\n1599#2:1357\n1779#2,3:1358\n1793#2,3:1361\n1717#2:1364\n1705#2:1365\n1699#2:1366\n1712#2:1367\n1802#2:1368\n1810#2:1390\n1672#2:1394\n1810#2:1439\n1672#2:1443\n1810#2:1488\n1672#2:1492\n1810#2:1537\n1672#2:1541\n1810#2:1586\n1672#2:1590\n833#3,3:1353\n*S KotlinDebug\n*F\n+ 1 FloatIntMap.kt\nandroidx/collection/FloatIntMap\n*L\n388#1:1034,6\n388#1:1041,3\n388#1:1045,9\n400#1:1054,6\n400#1:1061,3\n400#1:1065,9\n412#1:1074,6\n412#1:1081,3\n412#1:1085,9\n421#1:1094,4\n421#1:1098,6\n421#1:1105,3\n421#1:1109,2\n421#1:1111,2\n421#1:1113,6\n421#1:1119\n431#1:1120,4\n431#1:1124,6\n431#1:1131,3\n431#1:1135,2\n431#1:1137,2\n431#1:1139,6\n431#1:1145\n447#1:1146,4\n447#1:1150,6\n447#1:1157,3\n447#1:1161,2\n447#1:1163,2\n447#1:1165,6\n447#1:1171\n470#1:1172,3\n470#1:1175,6\n470#1:1182,3\n470#1:1186,2\n470#1:1188,2\n470#1:1190,6\n470#1:1196\n494#1:1197,4\n494#1:1201,6\n494#1:1208,3\n494#1:1212,2\n494#1:1214,2\n494#1:1216,6\n494#1:1222\n529#1:1223,4\n529#1:1227,6\n529#1:1234,3\n529#1:1238,2\n529#1:1240,2\n529#1:1242,6\n529#1:1248\n529#1:1249,4\n529#1:1253,6\n529#1:1260,3\n529#1:1264,2\n529#1:1266,2\n529#1:1268,6\n529#1:1274\n550#1:1275,4\n550#1:1279,6\n550#1:1286,3\n550#1:1290,2\n550#1:1292,2\n550#1:1294,6\n550#1:1300\n576#1:1301,4\n576#1:1305,6\n576#1:1312,3\n576#1:1316,2\n576#1:1318,2\n576#1:1320,6\n576#1:1326\n598#1:1327,4\n598#1:1331,6\n598#1:1338,3\n598#1:1342,2\n598#1:1344,2\n598#1:1346,6\n598#1:1352\n-1#1:1369,11\n-1#1:1380,4\n-1#1:1384,6\n-1#1:1391,3\n-1#1:1395,2\n-1#1:1397\n-1#1:1398,10\n-1#1:1408\n-1#1:1409,6\n-1#1:1415\n-1#1:1416,2\n-1#1:1418,11\n-1#1:1429,4\n-1#1:1433,6\n-1#1:1440,3\n-1#1:1444,2\n-1#1:1446\n-1#1:1447,10\n-1#1:1457\n-1#1:1458,6\n-1#1:1464\n-1#1:1465,2\n-1#1:1467,11\n-1#1:1478,4\n-1#1:1482,6\n-1#1:1489,3\n-1#1:1493,2\n-1#1:1495\n-1#1:1496,10\n-1#1:1506\n-1#1:1507,6\n-1#1:1513\n-1#1:1514,2\n-1#1:1516,11\n-1#1:1527,4\n-1#1:1531,6\n-1#1:1538,3\n-1#1:1542,2\n-1#1:1544\n-1#1:1545,10\n-1#1:1555\n-1#1:1556,6\n-1#1:1562\n-1#1:1563,2\n-1#1:1565,11\n-1#1:1576,4\n-1#1:1580,6\n-1#1:1587,3\n-1#1:1591,2\n-1#1:1593\n-1#1:1594,10\n-1#1:1604\n-1#1:1605,6\n-1#1:1611\n-1#1:1612,2\n362#1:1032\n369#1:1033\n388#1:1040\n388#1:1044\n400#1:1060\n400#1:1064\n412#1:1080\n412#1:1084\n421#1:1104\n421#1:1108\n431#1:1130\n431#1:1134\n447#1:1156\n447#1:1160\n470#1:1181\n470#1:1185\n494#1:1207\n494#1:1211\n529#1:1233\n529#1:1237\n529#1:1259\n529#1:1263\n550#1:1285\n550#1:1289\n576#1:1311\n576#1:1315\n598#1:1337\n598#1:1341\n618#1:1356\n621#1:1357\n625#1:1358,3\n626#1:1361,3\n627#1:1364\n628#1:1365\n628#1:1366\n632#1:1367\n635#1:1368\n-1#1:1390\n-1#1:1394\n-1#1:1439\n-1#1:1443\n-1#1:1488\n-1#1:1492\n-1#1:1537\n-1#1:1541\n-1#1:1586\n-1#1:1590\n617#1:1353,3\n*E\n"})
/* loaded from: classes.dex */
public abstract class FloatIntMap {

    @e
    public int _capacity;

    @e
    public int _size;

    @l
    @e
    public float[] keys;

    @l
    @e
    public long[] metadata;

    @l
    @e
    public int[] values;

    private FloatIntMap() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.keys = FloatSetKt.getEmptyFloatArray();
        this.values = IntSetKt.getEmptyIntArray();
    }

    public /* synthetic */ FloatIntMap(w wVar) {
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

    public static /* synthetic */ String joinToString$default(FloatIntMap floatIntMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i5, CharSequence charSequence4, int i6, Object obj) {
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
        return floatIntMap.joinToString(charSequence, charSequence5, charSequence6, i7, charSequence4);
    }

    public final boolean all(@l p<? super Float, ? super Integer, Boolean> predicate) {
        boolean z4;
        l0.p(predicate, "predicate");
        float[] fArr = this.keys;
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
                            if (!predicate.invoke(Float.valueOf(fArr[i8]), Integer.valueOf(iArr[i8])).booleanValue()) {
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

    public final boolean contains(float f5) {
        return findKeyIndex(f5) >= 0;
    }

    public final boolean containsKey(float f5) {
        return findKeyIndex(f5) >= 0;
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

    public boolean equals(@m Object obj) {
        boolean z4;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FloatIntMap)) {
            return false;
        }
        FloatIntMap floatIntMap = (FloatIntMap) obj;
        if (floatIntMap.getSize() != getSize()) {
            return false;
        }
        float[] fArr = this.keys;
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
                            if (iArr[i8] != floatIntMap.get(fArr[i8])) {
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

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0070, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
    
        return -1;
     */
    @kotlin.a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int findKeyIndex(float r17) {
        /*
            r16 = this;
            r0 = r16
            int r1 = java.lang.Float.hashCode(r17)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r0._capacity
            int r1 = r1 >>> 7
            r1 = r1 & r3
            r4 = 0
            r5 = r4
        L16:
            long[] r6 = r0.metadata
            int r7 = r1 >> 3
            r8 = r1 & 7
            int r8 = r8 << 3
            r9 = r6[r7]
            long r9 = r9 >>> r8
            r11 = 1
            int r7 = r7 + r11
            r12 = r6[r7]
            int r6 = 64 - r8
            long r6 = r12 << r6
            long r12 = (long) r8
            long r12 = -r12
            r8 = 63
            long r12 = r12 >> r8
            long r6 = r6 & r12
            long r6 = r6 | r9
            long r8 = (long) r2
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r8 = r8 * r12
            long r8 = r8 ^ r6
            long r12 = r8 - r12
            long r8 = ~r8
            long r8 = r8 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r12
        L42:
            r14 = 0
            int r10 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r10 == 0) goto L4a
            r10 = r11
            goto L4b
        L4a:
            r10 = r4
        L4b:
            if (r10 == 0) goto L69
            int r10 = java.lang.Long.numberOfTrailingZeros(r8)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            float[] r14 = r0.keys
            r14 = r14[r10]
            int r14 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r14 != 0) goto L5f
            r14 = r11
            goto L60
        L5f:
            r14 = r4
        L60:
            if (r14 == 0) goto L63
            return r10
        L63:
            r14 = 1
            long r14 = r8 - r14
            long r8 = r8 & r14
            goto L42
        L69:
            long r8 = ~r6
            r10 = 6
            long r8 = r8 << r10
            long r6 = r6 & r8
            long r6 = r6 & r12
            int r6 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r6 == 0) goto L74
            r1 = -1
            return r1
        L74:
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.FloatIntMap.findKeyIndex(float):int");
    }

    public final void forEach(@l p<? super Float, ? super Integer, r2> block) {
        boolean z4;
        l0.p(block, "block");
        float[] fArr = this.keys;
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
                            block.invoke(Float.valueOf(fArr[i8]), Integer.valueOf(iArr[i8]));
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

    public final void forEachKey(@l v3.l<? super Float, r2> block) {
        boolean z4;
        l0.p(block, "block");
        float[] fArr = this.keys;
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
                            block.invoke(Float.valueOf(fArr[(i5 << 3) + i7]));
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

    public final int get(float f5) {
        int findKeyIndex = findKeyIndex(f5);
        if (findKeyIndex >= 0) {
            return this.values[findKeyIndex];
        }
        throw new NoSuchElementException("Cannot find value for key " + f5);
    }

    public final int getCapacity() {
        return this._capacity;
    }

    public final int getOrDefault(float f5, int i5) {
        int findKeyIndex = findKeyIndex(f5);
        if (findKeyIndex >= 0) {
            return this.values[findKeyIndex];
        }
        return i5;
    }

    public final int getOrElse(float f5, @l v3.a<Integer> defaultValue) {
        l0.p(defaultValue, "defaultValue");
        int findKeyIndex = findKeyIndex(f5);
        if (findKeyIndex < 0) {
            return defaultValue.invoke().intValue();
        }
        return this.values[findKeyIndex];
    }

    public final int getSize() {
        return this._size;
    }

    public int hashCode() {
        boolean z4;
        float[] fArr = this.keys;
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
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            int i10 = (i6 << 3) + i9;
                            float f5 = fArr[i10];
                            i7 += Integer.hashCode(iArr[i10]) ^ Float.hashCode(f5);
                        }
                        j5 >>= 8;
                    }
                    if (i8 != 8) {
                        return i7;
                    }
                }
                if (i6 != length) {
                    i6++;
                } else {
                    i5 = i7;
                    break;
                }
            }
        }
        return i5;
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
        float[] fArr;
        float[] fArr2;
        int i6;
        l0.p(separator, "separator");
        l0.p(prefix, "prefix");
        l0.p(postfix, "postfix");
        l0.p(truncated, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        float[] fArr3 = this.keys;
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
                            float f5 = fArr3[i12];
                            int i13 = iArr[i12];
                            fArr2 = fArr3;
                            if (i8 == i5) {
                                sb.append(truncated);
                                break loop0;
                            }
                            if (i8 != 0) {
                                sb.append(separator);
                            }
                            sb.append(f5);
                            sb.append(o0.a.f20835h);
                            sb.append(i13);
                            i8++;
                            i6 = 8;
                        } else {
                            fArr2 = fArr3;
                            i6 = i9;
                        }
                        j5 >>= i6;
                        i11++;
                        i9 = i6;
                        fArr3 = fArr2;
                    }
                    fArr = fArr3;
                    if (i10 != i9) {
                        break;
                    }
                } else {
                    fArr = fArr3;
                }
                if (i7 == length) {
                    break;
                }
                i7++;
                fArr3 = fArr;
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
        float[] fArr = this.keys;
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
                            float f5 = fArr[i9];
                            int i10 = iArr[i9];
                            sb.append(f5);
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

    public static /* synthetic */ String joinToString$default(FloatIntMap floatIntMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i5, CharSequence charSequence4, p transform, int i6, Object obj) {
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
            float[] fArr = floatIntMap.keys;
            int[] iArr = floatIntMap.values;
            long[] jArr3 = floatIntMap.metadata;
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
                                float f5 = fArr[i15];
                                int i16 = iArr[i15];
                                if (i10 == i8) {
                                    sb.append(truncated);
                                    break loop0;
                                }
                                if (i10 != 0) {
                                    sb.append(separator);
                                }
                                Float valueOf = Float.valueOf(f5);
                                jArr2 = jArr3;
                                sb.append((CharSequence) transform.invoke(valueOf, Integer.valueOf(i16)));
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

    public final boolean any(@l p<? super Float, ? super Integer, Boolean> predicate) {
        l0.p(predicate, "predicate");
        float[] fArr = this.keys;
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
                            if (predicate.invoke(Float.valueOf(fArr[i8]), Integer.valueOf(iArr[i8])).booleanValue()) {
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

    public final int count(@l p<? super Float, ? super Integer, Boolean> predicate) {
        l0.p(predicate, "predicate");
        float[] fArr = this.keys;
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
                            if (predicate.invoke(Float.valueOf(fArr[i10]), Integer.valueOf(iArr[i10])).booleanValue()) {
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
    public final String joinToString(@l CharSequence charSequence, @l CharSequence prefix, @l CharSequence postfix, int i5, @l CharSequence truncated, @l p<? super Float, ? super Integer, ? extends CharSequence> transform) {
        CharSequence separator = charSequence;
        l0.p(separator, "separator");
        l0.p(prefix, "prefix");
        l0.p(postfix, "postfix");
        l0.p(truncated, "truncated");
        l0.p(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        float[] fArr = this.keys;
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
                            float f5 = fArr[i11];
                            int i12 = iArr[i11];
                            if (i7 == i5) {
                                sb.append(truncated);
                                break loop0;
                            }
                            if (i7 != 0) {
                                sb.append(separator);
                            }
                            sb.append(transform.invoke(Float.valueOf(f5), Integer.valueOf(i12)));
                            i7++;
                        }
                        j5 >>= 8;
                        i10++;
                        separator = charSequence;
                    }
                    if (i9 != 8) {
                        break;
                    }
                }
                if (i8 == length) {
                    break;
                }
                i6 = i8 + 1;
                separator = charSequence;
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
    public final String joinToString(@l CharSequence charSequence, @l CharSequence prefix, @l CharSequence postfix, int i5, @l p<? super Float, ? super Integer, ? extends CharSequence> transform) {
        CharSequence separator = charSequence;
        l0.p(separator, "separator");
        l0.p(prefix, "prefix");
        l0.p(postfix, "postfix");
        l0.p(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        float[] fArr = this.keys;
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
                            float f5 = fArr[i11];
                            int i12 = iArr[i11];
                            if (i7 == i5) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i7 != 0) {
                                sb.append(separator);
                            }
                            sb.append(transform.invoke(Float.valueOf(f5), Integer.valueOf(i12)));
                            i7++;
                        }
                        j5 >>= 8;
                        i10++;
                        separator = charSequence;
                        i8 = 8;
                    }
                    if (i9 != i8) {
                        break;
                    }
                }
                if (i6 == length) {
                    break;
                }
                i6++;
                separator = charSequence;
            }
        }
        sb.append(postfix);
        String sb2 = sb.toString();
        l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @l
    @i
    public final String joinToString(@l CharSequence separator, @l CharSequence prefix, @l CharSequence postfix, @l p<? super Float, ? super Integer, ? extends CharSequence> transform) {
        int i5;
        l0.p(separator, "separator");
        l0.p(prefix, "prefix");
        l0.p(postfix, "postfix");
        l0.p(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        float[] fArr = this.keys;
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
                            float f5 = fArr[i11];
                            int i12 = iArr[i11];
                            if (i7 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i7 != 0) {
                                sb.append(separator);
                            }
                            sb.append(transform.invoke(Float.valueOf(f5), Integer.valueOf(i12)));
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
    public final String joinToString(@l CharSequence separator, @l CharSequence prefix, @l p<? super Float, ? super Integer, ? extends CharSequence> transform) {
        int i5;
        l0.p(separator, "separator");
        l0.p(prefix, "prefix");
        l0.p(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        float[] fArr = this.keys;
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
                            float f5 = fArr[i11];
                            int i12 = iArr[i11];
                            if (i7 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i7 != 0) {
                                sb.append(separator);
                            }
                            sb.append(transform.invoke(Float.valueOf(f5), Integer.valueOf(i12)));
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
    public final String joinToString(@l CharSequence separator, @l p<? super Float, ? super Integer, ? extends CharSequence> transform) {
        int i5;
        l0.p(separator, "separator");
        l0.p(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        float[] fArr = this.keys;
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
                            float f5 = fArr[i11];
                            int i12 = iArr[i11];
                            if (i7 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i7 != 0) {
                                sb.append(separator);
                            }
                            sb.append(transform.invoke(Float.valueOf(f5), Integer.valueOf(i12)));
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
    public final String joinToString(@l p<? super Float, ? super Integer, ? extends CharSequence> transform) {
        int i5;
        l0.p(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        float[] fArr = this.keys;
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
                            float f5 = fArr[i11];
                            int i12 = iArr[i11];
                            if (i7 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i7 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            sb.append(transform.invoke(Float.valueOf(f5), Integer.valueOf(i12)));
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
            String sb2 = sb.toString();
            l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
        sb.append((CharSequence) "");
        String sb22 = sb.toString();
        l0.o(sb22, "StringBuilder().apply(builderAction).toString()");
        return sb22;
    }
}
