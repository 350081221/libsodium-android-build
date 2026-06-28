package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.runtime.snapshots.Snapshot;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.k;
import kotlin.collections.w;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.r1;
import kotlin.math.d;
import kotlin.r2;
import kotlinx.coroutines.s0;
import v3.a;
import v3.l;

@i0(d1 = {"\u0000\u0092\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001a\u001a7\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0002\b\u0004H\u0083\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\f\u001a\u00020\u000b*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eH\u0082\b\u001a\u0084\u0001\u0010+\u001a\u00020(*\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u00152\u0006\u0010'\u001a\u00020&H\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a,\u00102\u001a\u00020(*\u00020,2\u0006\u0010-\u001a\u00020\u00152\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020.2\u0006\u00101\u001a\u00020\u001dH\u0003\u001a=\u00106\u001a\b\u0012\u0004\u0012\u00020\n0\u0014*\u00020,2\u0012\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u00104\u001a\u00020.2\u0006\u00105\u001a\u00020\u0015H\u0002¢\u0006\u0004\b6\u00107\u001aR\u0010>\u001a\b\u0012\u0004\u0012\u00020\n0\u0014*\u00020,2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00100\u00032!\u0010<\u001a\u001d\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b9\u0012\b\b:\u0012\u0004\b\b(;\u0012\u0004\u0012\u00020\u001d0\u00032\u0006\u0010=\u001a\u00020\u001dH\u0083\b\u001a7\u0010A\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00142\b\b\u0002\u0010?\u001a\u00020\u001d2\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u0003H\u0082\b\u001a+\u0010E\u001a\u00020\u0010*\u00020B2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00100\u0003H\u0082\bø\u0001\u0000¢\u0006\u0004\bC\u0010D\u001a\u0014\u0010G\u001a\u00020\u0010*\u00020.2\u0006\u0010F\u001a\u00020\u0015H\u0002\u001a\u001e\u0010K\u001a\u00020\u0015*\u00020.2\u0006\u0010H\u001a\u00020BH\u0002ø\u0001\u0000¢\u0006\u0004\bI\u0010J\u001a\u0016\u0010M\u001a\u00020\u0015*\u00020.2\b\b\u0002\u0010L\u001a\u00020\u0015H\u0000\u001a4\u0010N\u001a\u00020\u0015\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150\u0003H\u0082\b¢\u0006\u0004\bN\u0010O\u001a\f\u0010P\u001a\u00020\u0015*\u00020.H\u0002\u001a!\u0010Q\u001a\u00020.*\u00020.2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u0003H\u0082\b\u001a\u001c\u0010T\u001a\u00020\u0010*\u00020,2\u0006\u0010R\u001a\u00020.2\u0006\u0010S\u001a\u00020\u0015H\u0002\u001a\u001c\u0010W\u001a\u00020\u0015*\u00020,2\u0006\u0010U\u001a\u00020\u00152\u0006\u0010V\u001a\u00020\u0015H\u0002\"\u0014\u0010X\u001a\u00020\u001d8\u0002X\u0082T¢\u0006\u0006\n\u0004\bX\u0010Y\"\u0014\u0010Z\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\bZ\u0010[\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\\"}, d2 = {"T", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "scope", "Lkotlin/Function1;", "Lkotlin/u;", "block", "withDebugLogging", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Lv3/l;)Ljava/lang/Object;", "", "Lkotlin/collections/k;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "", "debugRender", "([Lkotlin/collections/k;)Ljava/lang/String;", "Lkotlin/Function0;", CrashHianalyticsData.MESSAGE, "Lkotlin/r2;", "debugLog", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "state", "", "", "pinnedItems", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "itemProvider", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "resolvedSlots", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "isVertical", "reverseLayout", "Landroidx/compose/ui/unit/IntOffset;", "contentOffset", "mainAxisAvailableSize", "mainAxisSpacing", "beforeContentPadding", "afterContentPadding", "Lkotlinx/coroutines/s0;", "coroutineScope", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "measureStaggeredGrid-sdzDtKU", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Ljava/util/List;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;JZZJIIIILkotlinx/coroutines/s0;)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "measureStaggeredGrid", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;", "initialScrollDelta", "", "initialItemIndices", "initialItemOffsets", "canRestartMeasure", "measure", "measuredItems", "itemScrollOffsets", "mainAxisLayoutSize", "calculateVisibleItems", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;[Lkotlin/collections/k;[II)Ljava/util/List;", "position", "Lkotlin/v0;", "name", "itemIndex", "filter", "beforeVisibleBounds", "calculateExtraItems", "reverse", "action", "fastForEach", "Landroidx/compose/foundation/lazy/staggeredgrid/SpanRange;", "forEach-nIS5qE8", "(JLv3/l;)V", "forEach", "delta", "offsetBy", "indexRange", "maxInRange-jy6DScQ", "([IJ)I", "maxInRange", "minBound", "indexOfMinValue", "indexOfMinBy", "([Ljava/lang/Object;Lv3/l;)I", "indexOfMaxValue", "transform", "indices", "itemCount", "ensureIndicesInRange", "item", "lane", "findPreviousItemIndex", "DebugLoggingEnabled", "Z", "Unset", "I", "foundation_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 4 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext\n+ 5 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 8 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1225:1\n51#1,9:1236\n73#1,4:1245\n957#1:1262\n958#1,3:1267\n73#1,4:1270\n73#1,4:1274\n73#1,4:1278\n957#1:1289\n958#1,3:1294\n73#1,4:1305\n73#1,4:1309\n957#1:1330\n958#1,3:1335\n73#1,4:1340\n73#1,4:1346\n73#1,4:1350\n957#1:1371\n958#1,3:1376\n73#1,4:1379\n73#1,4:1383\n1017#1,4:1387\n73#1,4:1391\n73#1,4:1395\n926#1,3:1399\n944#1:1402\n929#1:1407\n930#1,9:1410\n945#1:1426\n940#1:1427\n926#1,3:1428\n944#1:1431\n929#1:1436\n930#1,9:1439\n945#1:1455\n940#1:1456\n73#1,4:1457\n61#1:1465\n990#1,11:1469\n957#1:1480\n958#1,3:1485\n944#1:1488\n945#1:1501\n957#1:1530\n958#1,3:1535\n495#2,4:1226\n500#2:1235\n129#3,5:1230\n239#4:1249\n236#4:1250\n236#4:1256\n239#4:1282\n236#4:1283\n236#4:1299\n239#4:1317\n236#4:1318\n236#4:1324\n239#4:1358\n236#4:1359\n236#4:1365\n953#5:1251\n952#5:1252\n951#5:1254\n953#5:1257\n952#5:1258\n951#5:1260\n951#5:1263\n952#5:1265\n953#5:1284\n952#5:1285\n951#5:1287\n951#5:1290\n952#5:1292\n951#5:1297\n953#5:1300\n952#5:1301\n951#5:1303\n953#5:1319\n952#5:1320\n951#5:1322\n953#5:1325\n952#5:1326\n951#5:1328\n951#5:1331\n952#5:1333\n951#5:1338\n953#5:1360\n952#5:1361\n951#5:1363\n953#5:1366\n952#5:1367\n951#5:1369\n951#5:1372\n952#5:1374\n951#5:1481\n952#5:1483\n951#5:1526\n952#5:1528\n951#5:1531\n952#5:1533\n62#6:1253\n55#6:1255\n62#6:1259\n55#6:1261\n55#6:1264\n62#6:1266\n62#6:1286\n55#6:1288\n55#6:1291\n62#6:1293\n55#6:1298\n62#6:1302\n55#6:1304\n62#6:1321\n55#6:1323\n62#6:1327\n55#6:1329\n55#6:1332\n62#6:1334\n55#6:1339\n62#6:1362\n55#6:1364\n62#6:1368\n55#6:1370\n55#6:1373\n62#6:1375\n55#6:1482\n62#6:1484\n55#6:1527\n62#6:1529\n55#6:1532\n62#6:1534\n12774#7,2:1313\n12541#7,2:1315\n12774#7,2:1344\n12583#7,2:1354\n12774#7,2:1356\n12583#7,2:1408\n12583#7,2:1437\n12774#7,2:1461\n12583#7,2:1463\n12744#7,2:1467\n51#8,4:1403\n56#8:1419\n33#8,6:1420\n51#8,4:1432\n56#8:1448\n33#8,6:1449\n51#8,6:1489\n33#8,6:1495\n51#8,6:1502\n33#8,6:1508\n51#8,6:1514\n33#8,6:1520\n1#9:1466\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt\n*L\n249#1:1236,9\n312#1:1245,4\n357#1:1262\n357#1:1267,3\n369#1:1270,4\n411#1:1274,4\n450#1:1278,4\n478#1:1289\n478#1:1294,3\n502#1:1305,4\n505#1:1309,4\n538#1:1330\n538#1:1335,3\n559#1:1340,4\n582#1:1346,4\n585#1:1350,4\n657#1:1371\n657#1:1376,3\n695#1:1379,4\n698#1:1383,4\n715#1:1387,4\n719#1:1391,4\n741#1:1395,4\n771#1:1399,3\n771#1:1402\n771#1:1407\n771#1:1410,9\n771#1:1426\n771#1:1427\n801#1:1428,3\n801#1:1431\n801#1:1436\n801#1:1439,9\n801#1:1455\n801#1:1456\n832#1:1457,4\n249#1:1465\n890#1:1469,11\n913#1:1480\n913#1:1485,3\n928#1:1488\n928#1:1501\n970#1:1530\n970#1:1535,3\n114#1:1226,4\n114#1:1235\n114#1:1230,5\n349#1:1249\n349#1:1250\n356#1:1256\n476#1:1282\n476#1:1283\n495#1:1299\n529#1:1317\n529#1:1318\n533#1:1324\n649#1:1358\n649#1:1359\n656#1:1365\n349#1:1251\n349#1:1252\n349#1:1254\n356#1:1257\n356#1:1258\n356#1:1260\n357#1:1263\n357#1:1265\n476#1:1284\n476#1:1285\n476#1:1287\n478#1:1290\n478#1:1292\n486#1:1297\n495#1:1300\n495#1:1301\n495#1:1303\n529#1:1319\n529#1:1320\n529#1:1322\n533#1:1325\n533#1:1326\n533#1:1328\n538#1:1331\n538#1:1333\n550#1:1338\n649#1:1360\n649#1:1361\n649#1:1363\n656#1:1366\n656#1:1367\n656#1:1369\n657#1:1372\n657#1:1374\n913#1:1481\n913#1:1483\n957#1:1526\n957#1:1528\n970#1:1531\n970#1:1533\n349#1:1253\n349#1:1255\n356#1:1259\n356#1:1261\n357#1:1264\n357#1:1266\n476#1:1286\n476#1:1288\n478#1:1291\n478#1:1293\n486#1:1298\n495#1:1302\n495#1:1304\n529#1:1321\n529#1:1323\n533#1:1327\n533#1:1329\n538#1:1332\n538#1:1334\n550#1:1339\n649#1:1362\n649#1:1364\n656#1:1368\n656#1:1370\n657#1:1373\n657#1:1375\n913#1:1482\n913#1:1484\n957#1:1527\n957#1:1529\n970#1:1532\n970#1:1534\n514#1:1313,2\n517#1:1315,2\n578#1:1344,2\n592#1:1354,2\n600#1:1356,2\n784#1:1408,2\n817#1:1437,2\n850#1:1461,2\n851#1:1463,2\n888#1:1467,2\n771#1:1403,4\n771#1:1419\n771#1:1420,6\n801#1:1432,4\n801#1:1448\n801#1:1449,6\n928#1:1489,6\n928#1:1495,6\n944#1:1502,6\n944#1:1508,6\n944#1:1514,6\n944#1:1520,6\n*E\n"})
/* loaded from: classes.dex */
public final class LazyStaggeredGridMeasureKt {
    private static final boolean DebugLoggingEnabled = false;
    private static final int Unset = Integer.MIN_VALUE;

    @ExperimentalFoundationApi
    private static final List<LazyStaggeredGridMeasuredItem> calculateExtraItems(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, l<? super LazyStaggeredGridMeasuredItem, r2> lVar, l<? super Integer, Boolean> lVar2, boolean z4) {
        List<LazyStaggeredGridMeasuredItem> E;
        List<Integer> pinnedItems = lazyStaggeredGridMeasureContext.getPinnedItems();
        ArrayList arrayList = null;
        if (z4) {
            int size = pinnedItems.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i5 = size - 1;
                    int intValue = pinnedItems.get(size).intValue();
                    if (lVar2.invoke(Integer.valueOf(intValue)).booleanValue()) {
                        long m750getSpanRangelOCCd4c = lazyStaggeredGridMeasureContext.m750getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), intValue, 0);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        LazyStaggeredGridMeasuredItem m758getAndMeasurejy6DScQ = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m758getAndMeasurejy6DScQ(intValue, m750getSpanRangelOCCd4c);
                        lVar.invoke(m758getAndMeasurejy6DScQ);
                        arrayList.add(m758getAndMeasurejy6DScQ);
                    }
                    if (i5 < 0) {
                        break;
                    }
                    size = i5;
                }
            }
        } else {
            int size2 = pinnedItems.size();
            for (int i6 = 0; i6 < size2; i6++) {
                int intValue2 = pinnedItems.get(i6).intValue();
                if (lVar2.invoke(Integer.valueOf(intValue2)).booleanValue()) {
                    long m750getSpanRangelOCCd4c2 = lazyStaggeredGridMeasureContext.m750getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), intValue2, 0);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    LazyStaggeredGridMeasuredItem m758getAndMeasurejy6DScQ2 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m758getAndMeasurejy6DScQ(intValue2, m750getSpanRangelOCCd4c2);
                    lVar.invoke(m758getAndMeasurejy6DScQ2);
                    arrayList.add(m758getAndMeasurejy6DScQ2);
                }
            }
        }
        if (arrayList == null) {
            E = w.E();
            return E;
        }
        return arrayList;
    }

    private static final List<LazyStaggeredGridMeasuredItem> calculateVisibleItems(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, k<LazyStaggeredGridMeasuredItem>[] kVarArr, int[] iArr, int i5) {
        boolean z4;
        int i6;
        int i7 = 0;
        for (k<LazyStaggeredGridMeasuredItem> kVar : kVarArr) {
            i7 += kVar.size();
        }
        ArrayList arrayList = new ArrayList(i7);
        while (true) {
            int length = kVarArr.length;
            int i8 = 0;
            while (true) {
                if (i8 < length) {
                    z4 = true;
                    if (!kVarArr[i8].isEmpty()) {
                        break;
                    }
                    i8++;
                } else {
                    z4 = false;
                    break;
                }
            }
            if (z4) {
                int length2 = kVarArr.length;
                int i9 = -1;
                int i10 = Integer.MAX_VALUE;
                for (int i11 = 0; i11 < length2; i11++) {
                    LazyStaggeredGridMeasuredItem i12 = kVarArr[i11].i();
                    if (i12 != null) {
                        i6 = i12.getIndex();
                    } else {
                        i6 = Integer.MAX_VALUE;
                    }
                    if (i10 > i6) {
                        i9 = i11;
                        i10 = i6;
                    }
                }
                LazyStaggeredGridMeasuredItem removeFirst = kVarArr[i9].removeFirst();
                if (removeFirst.getLane() == i9) {
                    long m763constructorimpl = SpanRange.m763constructorimpl(removeFirst.getLane(), removeFirst.getSpan());
                    int m753maxInRangejy6DScQ = m753maxInRangejy6DScQ(iArr, m763constructorimpl);
                    int i13 = lazyStaggeredGridMeasureContext.getResolvedSlots().getPositions()[i9];
                    if (removeFirst.getPlaceablesCount() != 0) {
                        removeFirst.position(m753maxInRangejy6DScQ, i13, i5);
                        arrayList.add(removeFirst);
                        int i14 = (int) (m763constructorimpl & 4294967295L);
                        for (int i15 = (int) (m763constructorimpl >> 32); i15 < i14; i15++) {
                            iArr[i15] = removeFirst.getSizeWithSpacings() + m753maxInRangejy6DScQ;
                        }
                    }
                }
            } else {
                return arrayList;
            }
        }
    }

    private static final void debugLog(a<String> aVar) {
    }

    private static final String debugRender(k<LazyStaggeredGridMeasuredItem>[] kVarArr) {
        return "";
    }

    private static final void ensureIndicesInRange(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int[] iArr, int i5) {
        int length = iArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i6 = length - 1;
            while (true) {
                if (iArr[length] < i5 && lazyStaggeredGridMeasureContext.getLaneInfo().assignedToLane(iArr[length], length)) {
                    break;
                } else {
                    iArr[length] = findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[length], length);
                }
            }
            if (iArr[length] >= 0 && !lazyStaggeredGridMeasureContext.isFullSpan(lazyStaggeredGridMeasureContext.getItemProvider(), iArr[length])) {
                lazyStaggeredGridMeasureContext.getLaneInfo().setLane(iArr[length], length);
            }
            if (i6 >= 0) {
                length = i6;
            } else {
                return;
            }
        }
    }

    private static final <T> void fastForEach(List<? extends T> list, boolean z4, l<? super T, r2> lVar) {
        if (z4) {
            int size = list.size() - 1;
            if (size < 0) {
                return;
            }
            while (true) {
                int i5 = size - 1;
                lVar.invoke(list.get(size));
                if (i5 >= 0) {
                    size = i5;
                } else {
                    return;
                }
            }
        } else {
            int size2 = list.size();
            for (int i6 = 0; i6 < size2; i6++) {
                lVar.invoke(list.get(i6));
            }
        }
    }

    static /* synthetic */ void fastForEach$default(List list, boolean z4, l lVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z4 = false;
        }
        if (z4) {
            int size = list.size() - 1;
            if (size < 0) {
                return;
            }
            while (true) {
                int i6 = size - 1;
                lVar.invoke(list.get(size));
                if (i6 >= 0) {
                    size = i6;
                } else {
                    return;
                }
            }
        } else {
            int size2 = list.size();
            for (int i7 = 0; i7 < size2; i7++) {
                lVar.invoke(list.get(i7));
            }
        }
    }

    private static final int findPreviousItemIndex(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int i5, int i6) {
        return lazyStaggeredGridMeasureContext.getLaneInfo().findPreviousItemIndex(i5, i6);
    }

    /* renamed from: forEach-nIS5qE8, reason: not valid java name */
    private static final void m752forEachnIS5qE8(long j5, l<? super Integer, r2> lVar) {
        int i5 = (int) (j5 & 4294967295L);
        for (int i6 = (int) (j5 >> 32); i6 < i5; i6++) {
            lVar.invoke(Integer.valueOf(i6));
        }
    }

    private static final int indexOfMaxValue(int[] iArr) {
        int length = iArr.length;
        int i5 = -1;
        int i6 = Integer.MIN_VALUE;
        for (int i7 = 0; i7 < length; i7++) {
            int i8 = iArr[i7];
            if (i6 < i8) {
                i5 = i7;
                i6 = i8;
            }
        }
        return i5;
    }

    private static final <T> int indexOfMinBy(T[] tArr, l<? super T, Integer> lVar) {
        int length = tArr.length;
        int i5 = -1;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < length; i7++) {
            int intValue = lVar.invoke(tArr[i7]).intValue();
            if (i6 > intValue) {
                i5 = i7;
                i6 = intValue;
            }
        }
        return i5;
    }

    public static final int indexOfMinValue(@p4.l int[] iArr, int i5) {
        int length = iArr.length;
        int i6 = -1;
        int i7 = Integer.MAX_VALUE;
        for (int i8 = 0; i8 < length; i8++) {
            boolean z4 = true;
            int i9 = i5 + 1;
            int i10 = iArr[i8];
            if (i9 > i10 || i10 >= i7) {
                z4 = false;
            }
            if (z4) {
                i6 = i8;
                i7 = i10;
            }
        }
        return i6;
    }

    public static /* synthetic */ int indexOfMinValue$default(int[] iArr, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i5 = Integer.MIN_VALUE;
        }
        return indexOfMinValue(iArr, i5);
    }

    /* renamed from: maxInRange-jy6DScQ, reason: not valid java name */
    private static final int m753maxInRangejy6DScQ(int[] iArr, long j5) {
        int i5 = (int) (j5 & 4294967295L);
        int i6 = Integer.MIN_VALUE;
        for (int i7 = (int) (j5 >> 32); i7 < i5; i7++) {
            i6 = Math.max(i6, iArr[i7]);
        }
        return i6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:301:0x0587, code lost:
    
        if (r13[r5] > r10) goto L290;
     */
    /* JADX WARN: Removed duplicated region for block: B:260:0x049d A[LOOP:19: B:259:0x049b->B:260:0x049d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x06d3  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x06e8  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x06e5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:393:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0511  */
    @androidx.compose.foundation.ExperimentalFoundationApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult measure(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext r39, int r40, int[] r41, int[] r42, boolean r43) {
        /*
            Method dump skipped, instructions count: 2145
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt.measure(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext, int, int[], int[], boolean):androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult");
    }

    private static final boolean measure$lambda$38$hasSpaceBeforeFirst(int[] iArr, int[] iArr2, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext) {
        int length = iArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            int i6 = iArr[i5];
            if (iArr2[i5] < Math.max(-lazyStaggeredGridMeasureContext.getMainAxisSpacing(), 0) && i6 > 0) {
                return true;
            }
        }
        return false;
    }

    private static final boolean measure$lambda$38$misalignedStart(int[] iArr, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int[] iArr2, int i5) {
        boolean z4;
        boolean z5;
        int length = iArr.length;
        for (int i6 = 0; i6 < length; i6++) {
            if (findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[i6], i6) == -1 && iArr2[i6] != iArr2[i5]) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                return true;
            }
        }
        int length2 = iArr.length;
        for (int i7 = 0; i7 < length2; i7++) {
            if (findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[i7], i7) != -1 && iArr2[i7] >= iArr2[i5]) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                return true;
            }
        }
        int lane = lazyStaggeredGridMeasureContext.getLaneInfo().getLane(0);
        if (lane == 0 || lane == -1 || lane == -2) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @p4.l
    @ExperimentalFoundationApi
    /* renamed from: measureStaggeredGrid-sdzDtKU, reason: not valid java name */
    public static final LazyStaggeredGridMeasureResult m754measureStaggeredGridsdzDtKU(@p4.l LazyLayoutMeasureScope lazyLayoutMeasureScope, @p4.l LazyStaggeredGridState lazyStaggeredGridState, @p4.l List<Integer> list, @p4.l LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, @p4.l LazyStaggeredGridSlots lazyStaggeredGridSlots, long j5, boolean z4, boolean z5, long j6, int i5, int i6, int i7, int i8, @p4.l s0 s0Var) {
        T t5;
        int m753maxInRangejy6DScQ;
        T t6;
        int i9;
        int L0;
        LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext = new LazyStaggeredGridMeasureContext(lazyStaggeredGridState, list, lazyStaggeredGridItemProvider, lazyStaggeredGridSlots, j5, z4, lazyLayoutMeasureScope, i5, j6, i7, i8, z5, i6, s0Var, null);
        k1.h hVar = new k1.h();
        k1.h hVar2 = new k1.h();
        Snapshot createNonObservableSnapshot = Snapshot.Companion.createNonObservableSnapshot();
        try {
            Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
            try {
                int[] updateScrollPositionIfTheFirstItemWasMoved$foundation_release = lazyStaggeredGridState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyStaggeredGridItemProvider, lazyStaggeredGridState.getScrollPosition$foundation_release().getIndices());
                int[] scrollOffsets = lazyStaggeredGridState.getScrollPosition$foundation_release().getScrollOffsets();
                if (updateScrollPositionIfTheFirstItemWasMoved$foundation_release.length == lazyStaggeredGridMeasureContext.getLaneCount()) {
                    t5 = updateScrollPositionIfTheFirstItemWasMoved$foundation_release;
                } else {
                    lazyStaggeredGridMeasureContext.getLaneInfo().reset();
                    int laneCount = lazyStaggeredGridMeasureContext.getLaneCount();
                    int[] iArr = new int[laneCount];
                    for (int i10 = 0; i10 < laneCount; i10++) {
                        if (i10 >= updateScrollPositionIfTheFirstItemWasMoved$foundation_release.length || (m753maxInRangejy6DScQ = updateScrollPositionIfTheFirstItemWasMoved$foundation_release[i10]) == -1) {
                            if (i10 == 0) {
                                m753maxInRangejy6DScQ = 0;
                            } else {
                                m753maxInRangejy6DScQ = m753maxInRangejy6DScQ(iArr, SpanRange.m763constructorimpl(0, i10)) + 1;
                            }
                        }
                        iArr[i10] = m753maxInRangejy6DScQ;
                        lazyStaggeredGridMeasureContext.getLaneInfo().setLane(iArr[i10], i10);
                    }
                    t5 = iArr;
                }
                hVar.element = t5;
                if (scrollOffsets.length == lazyStaggeredGridMeasureContext.getLaneCount()) {
                    t6 = scrollOffsets;
                } else {
                    int laneCount2 = lazyStaggeredGridMeasureContext.getLaneCount();
                    int[] iArr2 = new int[laneCount2];
                    for (int i11 = 0; i11 < laneCount2; i11++) {
                        if (i11 < scrollOffsets.length) {
                            i9 = scrollOffsets[i11];
                        } else if (i11 == 0) {
                            i9 = 0;
                        } else {
                            i9 = iArr2[i11 - 1];
                        }
                        iArr2[i11] = i9;
                    }
                    t6 = iArr2;
                }
                hVar2.element = t6;
                r2 r2Var = r2.f19517a;
                createNonObservableSnapshot.dispose();
                L0 = d.L0(lazyStaggeredGridState.getScrollToBeConsumed$foundation_release());
                return measure(lazyStaggeredGridMeasureContext, L0, (int[]) hVar.element, (int[]) hVar2.element, true);
            } finally {
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
            }
        } catch (Throwable th) {
            createNonObservableSnapshot.dispose();
            throw th;
        }
    }

    private static final void offsetBy(int[] iArr, int i5) {
        int length = iArr.length;
        for (int i6 = 0; i6 < length; i6++) {
            iArr[i6] = iArr[i6] + i5;
        }
    }

    private static final int[] transform(int[] iArr, l<? super Integer, Integer> lVar) {
        int length = iArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            iArr[i5] = lVar.invoke(Integer.valueOf(iArr[i5])).intValue();
        }
        return iArr;
    }

    @ExperimentalFoundationApi
    private static final <T> T withDebugLogging(LazyLayoutMeasureScope lazyLayoutMeasureScope, l<? super LazyLayoutMeasureScope, ? extends T> lVar) {
        return lVar.invoke(lazyLayoutMeasureScope);
    }
}
