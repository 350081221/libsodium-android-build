.class public final Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0092\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u001a\u001a7\u0010\u0006\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00028\u00000\u0003\u00a2\u0006\u0002\u0008\u0004H\u0083\u0008\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u001f\u0010\u000c\u001a\u00020\u000b*\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\n0\t0\u0008H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a\u0017\u0010\u0011\u001a\u00020\u00102\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u000eH\u0082\u0008\u001a\u0084\u0001\u0010+\u001a\u00020(*\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00122\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u00152\u0006\u0010\'\u001a\u00020&H\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008)\u0010*\u001a,\u00102\u001a\u00020(*\u00020,2\u0006\u0010-\u001a\u00020\u00152\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020.2\u0006\u00101\u001a\u00020\u001dH\u0003\u001a=\u00106\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0014*\u00020,2\u0012\u00103\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\n0\t0\u00082\u0006\u00104\u001a\u00020.2\u0006\u00105\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u00086\u00107\u001aR\u0010>\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0014*\u00020,2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00100\u00032!\u0010<\u001a\u001d\u0012\u0013\u0012\u00110\u0015\u00a2\u0006\u000c\u00089\u0012\u0008\u0008:\u0012\u0004\u0008\u0008(;\u0012\u0004\u0012\u00020\u001d0\u00032\u0006\u0010=\u001a\u00020\u001dH\u0083\u0008\u001a7\u0010A\u001a\u00020\u0010\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u00142\u0008\u0008\u0002\u0010?\u001a\u00020\u001d2\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u0003H\u0082\u0008\u001a+\u0010E\u001a\u00020\u0010*\u00020B2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00100\u0003H\u0082\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008C\u0010D\u001a\u0014\u0010G\u001a\u00020\u0010*\u00020.2\u0006\u0010F\u001a\u00020\u0015H\u0002\u001a\u001e\u0010K\u001a\u00020\u0015*\u00020.2\u0006\u0010H\u001a\u00020BH\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008I\u0010J\u001a\u0016\u0010M\u001a\u00020\u0015*\u00020.2\u0008\u0008\u0002\u0010L\u001a\u00020\u0015H\u0000\u001a4\u0010N\u001a\u00020\u0015\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u00082\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150\u0003H\u0082\u0008\u00a2\u0006\u0004\u0008N\u0010O\u001a\u000c\u0010P\u001a\u00020\u0015*\u00020.H\u0002\u001a!\u0010Q\u001a\u00020.*\u00020.2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u0003H\u0082\u0008\u001a\u001c\u0010T\u001a\u00020\u0010*\u00020,2\u0006\u0010R\u001a\u00020.2\u0006\u0010S\u001a\u00020\u0015H\u0002\u001a\u001c\u0010W\u001a\u00020\u0015*\u00020,2\u0006\u0010U\u001a\u00020\u00152\u0006\u0010V\u001a\u00020\u0015H\u0002\"\u0014\u0010X\u001a\u00020\u001d8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008X\u0010Y\"\u0014\u0010Z\u001a\u00020\u00158\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008Z\u0010[\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\\"
    }
    d2 = {
        "T",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;",
        "scope",
        "Lkotlin/Function1;",
        "Lkotlin/u;",
        "block",
        "withDebugLogging",
        "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Lv3/l;)Ljava/lang/Object;",
        "",
        "Lkotlin/collections/k;",
        "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;",
        "",
        "debugRender",
        "([Lkotlin/collections/k;)Ljava/lang/String;",
        "Lkotlin/Function0;",
        "message",
        "Lkotlin/r2;",
        "debugLog",
        "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;",
        "state",
        "",
        "",
        "pinnedItems",
        "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;",
        "itemProvider",
        "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;",
        "resolvedSlots",
        "Landroidx/compose/ui/unit/Constraints;",
        "constraints",
        "",
        "isVertical",
        "reverseLayout",
        "Landroidx/compose/ui/unit/IntOffset;",
        "contentOffset",
        "mainAxisAvailableSize",
        "mainAxisSpacing",
        "beforeContentPadding",
        "afterContentPadding",
        "Lkotlinx/coroutines/s0;",
        "coroutineScope",
        "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;",
        "measureStaggeredGrid-sdzDtKU",
        "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Ljava/util/List;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;JZZJIIIILkotlinx/coroutines/s0;)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;",
        "measureStaggeredGrid",
        "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;",
        "initialScrollDelta",
        "",
        "initialItemIndices",
        "initialItemOffsets",
        "canRestartMeasure",
        "measure",
        "measuredItems",
        "itemScrollOffsets",
        "mainAxisLayoutSize",
        "calculateVisibleItems",
        "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;[Lkotlin/collections/k;[II)Ljava/util/List;",
        "position",
        "Lkotlin/v0;",
        "name",
        "itemIndex",
        "filter",
        "beforeVisibleBounds",
        "calculateExtraItems",
        "reverse",
        "action",
        "fastForEach",
        "Landroidx/compose/foundation/lazy/staggeredgrid/SpanRange;",
        "forEach-nIS5qE8",
        "(JLv3/l;)V",
        "forEach",
        "delta",
        "offsetBy",
        "indexRange",
        "maxInRange-jy6DScQ",
        "([IJ)I",
        "maxInRange",
        "minBound",
        "indexOfMinValue",
        "indexOfMinBy",
        "([Ljava/lang/Object;Lv3/l;)I",
        "indexOfMaxValue",
        "transform",
        "indices",
        "itemCount",
        "ensureIndicesInRange",
        "item",
        "lane",
        "findPreviousItemIndex",
        "DebugLoggingEnabled",
        "Z",
        "Unset",
        "I",
        "foundation_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 4 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext\n+ 5 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 8 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1225:1\n51#1,9:1236\n73#1,4:1245\n957#1:1262\n958#1,3:1267\n73#1,4:1270\n73#1,4:1274\n73#1,4:1278\n957#1:1289\n958#1,3:1294\n73#1,4:1305\n73#1,4:1309\n957#1:1330\n958#1,3:1335\n73#1,4:1340\n73#1,4:1346\n73#1,4:1350\n957#1:1371\n958#1,3:1376\n73#1,4:1379\n73#1,4:1383\n1017#1,4:1387\n73#1,4:1391\n73#1,4:1395\n926#1,3:1399\n944#1:1402\n929#1:1407\n930#1,9:1410\n945#1:1426\n940#1:1427\n926#1,3:1428\n944#1:1431\n929#1:1436\n930#1,9:1439\n945#1:1455\n940#1:1456\n73#1,4:1457\n61#1:1465\n990#1,11:1469\n957#1:1480\n958#1,3:1485\n944#1:1488\n945#1:1501\n957#1:1530\n958#1,3:1535\n495#2,4:1226\n500#2:1235\n129#3,5:1230\n239#4:1249\n236#4:1250\n236#4:1256\n239#4:1282\n236#4:1283\n236#4:1299\n239#4:1317\n236#4:1318\n236#4:1324\n239#4:1358\n236#4:1359\n236#4:1365\n953#5:1251\n952#5:1252\n951#5:1254\n953#5:1257\n952#5:1258\n951#5:1260\n951#5:1263\n952#5:1265\n953#5:1284\n952#5:1285\n951#5:1287\n951#5:1290\n952#5:1292\n951#5:1297\n953#5:1300\n952#5:1301\n951#5:1303\n953#5:1319\n952#5:1320\n951#5:1322\n953#5:1325\n952#5:1326\n951#5:1328\n951#5:1331\n952#5:1333\n951#5:1338\n953#5:1360\n952#5:1361\n951#5:1363\n953#5:1366\n952#5:1367\n951#5:1369\n951#5:1372\n952#5:1374\n951#5:1481\n952#5:1483\n951#5:1526\n952#5:1528\n951#5:1531\n952#5:1533\n62#6:1253\n55#6:1255\n62#6:1259\n55#6:1261\n55#6:1264\n62#6:1266\n62#6:1286\n55#6:1288\n55#6:1291\n62#6:1293\n55#6:1298\n62#6:1302\n55#6:1304\n62#6:1321\n55#6:1323\n62#6:1327\n55#6:1329\n55#6:1332\n62#6:1334\n55#6:1339\n62#6:1362\n55#6:1364\n62#6:1368\n55#6:1370\n55#6:1373\n62#6:1375\n55#6:1482\n62#6:1484\n55#6:1527\n62#6:1529\n55#6:1532\n62#6:1534\n12774#7,2:1313\n12541#7,2:1315\n12774#7,2:1344\n12583#7,2:1354\n12774#7,2:1356\n12583#7,2:1408\n12583#7,2:1437\n12774#7,2:1461\n12583#7,2:1463\n12744#7,2:1467\n51#8,4:1403\n56#8:1419\n33#8,6:1420\n51#8,4:1432\n56#8:1448\n33#8,6:1449\n51#8,6:1489\n33#8,6:1495\n51#8,6:1502\n33#8,6:1508\n51#8,6:1514\n33#8,6:1520\n1#9:1466\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt\n*L\n249#1:1236,9\n312#1:1245,4\n357#1:1262\n357#1:1267,3\n369#1:1270,4\n411#1:1274,4\n450#1:1278,4\n478#1:1289\n478#1:1294,3\n502#1:1305,4\n505#1:1309,4\n538#1:1330\n538#1:1335,3\n559#1:1340,4\n582#1:1346,4\n585#1:1350,4\n657#1:1371\n657#1:1376,3\n695#1:1379,4\n698#1:1383,4\n715#1:1387,4\n719#1:1391,4\n741#1:1395,4\n771#1:1399,3\n771#1:1402\n771#1:1407\n771#1:1410,9\n771#1:1426\n771#1:1427\n801#1:1428,3\n801#1:1431\n801#1:1436\n801#1:1439,9\n801#1:1455\n801#1:1456\n832#1:1457,4\n249#1:1465\n890#1:1469,11\n913#1:1480\n913#1:1485,3\n928#1:1488\n928#1:1501\n970#1:1530\n970#1:1535,3\n114#1:1226,4\n114#1:1235\n114#1:1230,5\n349#1:1249\n349#1:1250\n356#1:1256\n476#1:1282\n476#1:1283\n495#1:1299\n529#1:1317\n529#1:1318\n533#1:1324\n649#1:1358\n649#1:1359\n656#1:1365\n349#1:1251\n349#1:1252\n349#1:1254\n356#1:1257\n356#1:1258\n356#1:1260\n357#1:1263\n357#1:1265\n476#1:1284\n476#1:1285\n476#1:1287\n478#1:1290\n478#1:1292\n486#1:1297\n495#1:1300\n495#1:1301\n495#1:1303\n529#1:1319\n529#1:1320\n529#1:1322\n533#1:1325\n533#1:1326\n533#1:1328\n538#1:1331\n538#1:1333\n550#1:1338\n649#1:1360\n649#1:1361\n649#1:1363\n656#1:1366\n656#1:1367\n656#1:1369\n657#1:1372\n657#1:1374\n913#1:1481\n913#1:1483\n957#1:1526\n957#1:1528\n970#1:1531\n970#1:1533\n349#1:1253\n349#1:1255\n356#1:1259\n356#1:1261\n357#1:1264\n357#1:1266\n476#1:1286\n476#1:1288\n478#1:1291\n478#1:1293\n486#1:1298\n495#1:1302\n495#1:1304\n529#1:1321\n529#1:1323\n533#1:1327\n533#1:1329\n538#1:1332\n538#1:1334\n550#1:1339\n649#1:1362\n649#1:1364\n656#1:1368\n656#1:1370\n657#1:1373\n657#1:1375\n913#1:1482\n913#1:1484\n957#1:1527\n957#1:1529\n970#1:1532\n970#1:1534\n514#1:1313,2\n517#1:1315,2\n578#1:1344,2\n592#1:1354,2\n600#1:1356,2\n784#1:1408,2\n817#1:1437,2\n850#1:1461,2\n851#1:1463,2\n888#1:1467,2\n771#1:1403,4\n771#1:1419\n771#1:1420,6\n801#1:1432,4\n801#1:1448\n801#1:1449,6\n928#1:1489,6\n928#1:1495,6\n944#1:1502,6\n944#1:1508,6\n944#1:1514,6\n944#1:1520,6\n*E\n"
    }
.end annotation


# static fields
.field private static final DebugLoggingEnabled:Z = false

.field private static final Unset:I = -0x80000000


# direct methods
.method private static final calculateExtraItems(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;Lv3/l;Lv3/l;Z)Ljava/util/List;
    .locals 8
    .annotation build Landroidx/compose/foundation/ExperimentalFoundationApi;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;",
            "Lv3/l<",
            "-",
            "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;",
            "Lkotlin/r2;",
            ">;",
            "Lv3/l<",
            "-",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            ">;Z)",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getPinnedItems()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    if-eqz p3, :cond_3

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result p3

    .line 13
    add-int/lit8 p3, p3, -0x1

    .line 14
    .line 15
    if-ltz p3, :cond_6

    .line 16
    .line 17
    :goto_0
    add-int/lit8 v3, p3, -0x1

    .line 18
    .line 19
    invoke-interface {v0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p3

    .line 23
    check-cast p3, Ljava/lang/Number;

    .line 24
    .line 25
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result p3

    .line 29
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-interface {p2, v4}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    check-cast v4, Ljava/lang/Boolean;

    .line 38
    .line 39
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-eqz v4, :cond_1

    .line 44
    .line 45
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getItemProvider()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-virtual {p0, v4, p3, v1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getSpanRange-lOCCd4c(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;II)J

    .line 50
    .line 51
    .line 52
    move-result-wide v4

    .line 53
    if-nez v2, :cond_0

    .line 54
    .line 55
    new-instance v2, Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 58
    .line 59
    .line 60
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getMeasuredItemProvider()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    invoke-virtual {v6, p3, v4, v5}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;->getAndMeasure-jy6DScQ(IJ)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;

    .line 65
    .line 66
    .line 67
    move-result-object p3

    .line 68
    invoke-interface {p1, p3}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    invoke-interface {v2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    :cond_1
    if-gez v3, :cond_2

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_2
    move p3, v3

    .line 78
    goto :goto_0

    .line 79
    :cond_3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 80
    .line 81
    .line 82
    move-result p3

    .line 83
    move v3, v1

    .line 84
    :goto_1
    if-ge v3, p3, :cond_6

    .line 85
    .line 86
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    check-cast v4, Ljava/lang/Number;

    .line 91
    .line 92
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    invoke-interface {p2, v5}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    check-cast v5, Ljava/lang/Boolean;

    .line 105
    .line 106
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 107
    .line 108
    .line 109
    move-result v5

    .line 110
    if-eqz v5, :cond_5

    .line 111
    .line 112
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getItemProvider()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    invoke-virtual {p0, v5, v4, v1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getSpanRange-lOCCd4c(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;II)J

    .line 117
    .line 118
    .line 119
    move-result-wide v5

    .line 120
    if-nez v2, :cond_4

    .line 121
    .line 122
    new-instance v2, Ljava/util/ArrayList;

    .line 123
    .line 124
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 125
    .line 126
    .line 127
    :cond_4
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getMeasuredItemProvider()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;

    .line 128
    .line 129
    .line 130
    move-result-object v7

    .line 131
    invoke-virtual {v7, v4, v5, v6}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;->getAndMeasure-jy6DScQ(IJ)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    invoke-interface {p1, v4}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_6
    :goto_2
    if-nez v2, :cond_7

    .line 145
    .line 146
    invoke-static {}, Lkotlin/collections/u;->E()Ljava/util/List;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    :cond_7
    return-object v2
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
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

.method private static final calculateVisibleItems(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;[Lkotlin/collections/k;[II)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;",
            "[",
            "Lkotlin/collections/k<",
            "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;",
            ">;[II)",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;",
            ">;"
        }
    .end annotation

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    move v3, v2

    .line 5
    :goto_0
    if-ge v2, v0, :cond_0

    .line 6
    .line 7
    aget-object v4, p1, v2

    .line 8
    .line 9
    invoke-virtual {v4}, Lkotlin/collections/f;->size()I

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    add-int/2addr v3, v4

    .line 14
    add-int/lit8 v2, v2, 0x1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 20
    .line 21
    .line 22
    :cond_1
    :goto_1
    array-length v2, p1

    .line 23
    move v3, v1

    .line 24
    :goto_2
    if-ge v3, v2, :cond_3

    .line 25
    .line 26
    aget-object v4, p1, v3

    .line 27
    .line 28
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    const/4 v5, 0x1

    .line 33
    xor-int/2addr v4, v5

    .line 34
    if-eqz v4, :cond_2

    .line 35
    .line 36
    goto :goto_3

    .line 37
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_3
    move v5, v1

    .line 41
    :goto_3
    if-eqz v5, :cond_9

    .line 42
    .line 43
    array-length v2, p1

    .line 44
    const v3, 0x7fffffff

    .line 45
    .line 46
    .line 47
    const/4 v4, -0x1

    .line 48
    move v5, v1

    .line 49
    move v6, v3

    .line 50
    :goto_4
    if-ge v5, v2, :cond_6

    .line 51
    .line 52
    aget-object v7, p1, v5

    .line 53
    .line 54
    invoke-virtual {v7}, Lkotlin/collections/k;->i()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    check-cast v7, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;

    .line 59
    .line 60
    if-eqz v7, :cond_4

    .line 61
    .line 62
    invoke-virtual {v7}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->getIndex()I

    .line 63
    .line 64
    .line 65
    move-result v7

    .line 66
    goto :goto_5

    .line 67
    :cond_4
    move v7, v3

    .line 68
    :goto_5
    if-le v6, v7, :cond_5

    .line 69
    .line 70
    move v4, v5

    .line 71
    move v6, v7

    .line 72
    :cond_5
    add-int/lit8 v5, v5, 0x1

    .line 73
    .line 74
    goto :goto_4

    .line 75
    :cond_6
    aget-object v2, p1, v4

    .line 76
    .line 77
    invoke-virtual {v2}, Lkotlin/collections/k;->removeFirst()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    check-cast v2, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;

    .line 82
    .line 83
    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->getLane()I

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    if-eq v3, v4, :cond_7

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_7
    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->getLane()I

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->getSpan()I

    .line 95
    .line 96
    .line 97
    move-result v5

    .line 98
    invoke-static {v3, v5}, Landroidx/compose/foundation/lazy/staggeredgrid/SpanRange;->constructor-impl(II)J

    .line 99
    .line 100
    .line 101
    move-result-wide v5

    .line 102
    invoke-static {p2, v5, v6}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->maxInRange-jy6DScQ([IJ)I

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getResolvedSlots()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;

    .line 107
    .line 108
    .line 109
    move-result-object v7

    .line 110
    invoke-virtual {v7}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;->getPositions()[I

    .line 111
    .line 112
    .line 113
    move-result-object v7

    .line 114
    aget v4, v7, v4

    .line 115
    .line 116
    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->getPlaceablesCount()I

    .line 117
    .line 118
    .line 119
    move-result v7

    .line 120
    if-nez v7, :cond_8

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_8
    invoke-virtual {v2, v3, v4, p3}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->position(III)V

    .line 124
    .line 125
    .line 126
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    const/16 v4, 0x20

    .line 130
    .line 131
    shr-long v7, v5, v4

    .line 132
    .line 133
    long-to-int v4, v7

    .line 134
    const-wide v7, 0xffffffffL

    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    and-long/2addr v5, v7

    .line 140
    long-to-int v5, v5

    .line 141
    :goto_6
    if-ge v4, v5, :cond_1

    .line 142
    .line 143
    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->getSizeWithSpacings()I

    .line 144
    .line 145
    .line 146
    move-result v6

    .line 147
    add-int/2addr v6, v3

    .line 148
    aput v6, p2, v4

    .line 149
    .line 150
    add-int/lit8 v4, v4, 0x1

    .line 151
    .line 152
    goto :goto_6

    .line 153
    :cond_9
    return-object v0
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
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

.method private static final debugLog(Lv3/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/a<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method private static final debugRender([Lkotlin/collections/k;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lkotlin/collections/k<",
            "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string p0, ""

    return-object p0
.end method

.method private static final ensureIndicesInRange(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;[II)V
    .locals 4

    .line 1
    array-length v0, p1

    .line 2
    add-int/lit8 v0, v0, -0x1

    .line 3
    .line 4
    if-ltz v0, :cond_4

    .line 5
    .line 6
    :goto_0
    add-int/lit8 v1, v0, -0x1

    .line 7
    .line 8
    :goto_1
    aget v2, p1, v0

    .line 9
    .line 10
    if-ge v2, p2, :cond_3

    .line 11
    .line 12
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getLaneInfo()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    aget v3, p1, v0

    .line 17
    .line 18
    invoke-virtual {v2, v3, v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;->assignedToLane(II)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-nez v2, :cond_0

    .line 23
    .line 24
    goto :goto_2

    .line 25
    :cond_0
    aget v2, p1, v0

    .line 26
    .line 27
    if-ltz v2, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getItemProvider()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    aget v3, p1, v0

    .line 34
    .line 35
    invoke-virtual {p0, v2, v3}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->isFullSpan(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;I)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-nez v2, :cond_1

    .line 40
    .line 41
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getLaneInfo()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    aget v3, p1, v0

    .line 46
    .line 47
    invoke-virtual {v2, v3, v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;->setLane(II)V

    .line 48
    .line 49
    .line 50
    :cond_1
    if-gez v1, :cond_2

    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_2
    move v0, v1

    .line 54
    goto :goto_0

    .line 55
    :cond_3
    :goto_2
    aget v2, p1, v0

    .line 56
    .line 57
    invoke-static {p0, v2, v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->findPreviousItemIndex(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;II)I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    aput v2, p1, v0

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_4
    :goto_3
    return-void
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
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
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
.end method

.method private static final fastForEach(Ljava/util/List;ZLv3/l;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "+TT;>;Z",
            "Lv3/l<",
            "-TT;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    add-int/lit8 p1, p1, -0x1

    .line 8
    .line 9
    if-ltz p1, :cond_2

    .line 10
    .line 11
    :goto_0
    add-int/lit8 v0, p1, -0x1

    .line 12
    .line 13
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-interface {p2, p1}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    if-gez v0, :cond_0

    .line 21
    .line 22
    goto :goto_2

    .line 23
    :cond_0
    move p1, v0

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    const/4 v0, 0x0

    .line 30
    :goto_1
    if-ge v0, p1, :cond_2

    .line 31
    .line 32
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-interface {p2, v1}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    add-int/lit8 v0, v0, 0x1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    :goto_2
    return-void
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
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
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
.end method

.method static synthetic fastForEach$default(Ljava/util/List;ZLv3/l;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x1

    .line 2
    .line 3
    const/4 p4, 0x0

    .line 4
    if-eqz p3, :cond_0

    .line 5
    .line 6
    move p1, p4

    .line 7
    :cond_0
    if-eqz p1, :cond_2

    .line 8
    .line 9
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    add-int/lit8 p1, p1, -0x1

    .line 14
    .line 15
    if-ltz p1, :cond_3

    .line 16
    .line 17
    :goto_0
    add-int/lit8 p3, p1, -0x1

    .line 18
    .line 19
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-interface {p2, p1}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    if-gez p3, :cond_1

    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_1
    move p1, p3

    .line 30
    goto :goto_0

    .line 31
    :cond_2
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    :goto_1
    if-ge p4, p1, :cond_3

    .line 36
    .line 37
    invoke-interface {p0, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p3

    .line 41
    invoke-interface {p2, p3}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    add-int/lit8 p4, p4, 0x1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_3
    :goto_2
    return-void
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
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
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
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
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
.end method

.method private static final findPreviousItemIndex(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;II)I
    .locals 0

    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getLaneInfo()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;

    move-result-object p0

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;->findPreviousItemIndex(II)I

    move-result p0

    return p0
.end method

.method private static final forEach-nIS5qE8(JLv3/l;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lv3/l<",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    const/16 v0, 0x20

    shr-long v0, p0, v0

    long-to-int v0, v0

    const-wide v1, 0xffffffffL

    and-long/2addr p0, v1

    long-to-int p0, p0

    :goto_0
    if-ge v0, p0, :cond_0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p2, p1}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private static final indexOfMaxValue([I)I
    .locals 5

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, -0x1

    .line 3
    const/high16 v2, -0x80000000

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    :goto_0
    if-ge v3, v0, :cond_1

    .line 7
    .line 8
    aget v4, p0, v3

    .line 9
    .line 10
    if-ge v2, v4, :cond_0

    .line 11
    .line 12
    move v1, v3

    .line 13
    move v2, v4

    .line 14
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    return v1
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method private static final indexOfMinBy([Ljava/lang/Object;Lv3/l;)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;",
            "Lv3/l<",
            "-TT;",
            "Ljava/lang/Integer;",
            ">;)I"
        }
    .end annotation

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, -0x1

    .line 3
    const v2, 0x7fffffff

    .line 4
    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    :goto_0
    if-ge v3, v0, :cond_1

    .line 8
    .line 9
    aget-object v4, p0, v3

    .line 10
    .line 11
    invoke-interface {p1, v4}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    check-cast v4, Ljava/lang/Number;

    .line 16
    .line 17
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    if-le v2, v4, :cond_0

    .line 22
    .line 23
    move v1, v3

    .line 24
    move v2, v4

    .line 25
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    return v1
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
.end method

.method public static final indexOfMinValue([II)I
    .locals 8
    .param p0    # [I
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, -0x1

    .line 3
    const v2, 0x7fffffff

    .line 4
    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    move v4, v3

    .line 8
    :goto_0
    if-ge v4, v0, :cond_2

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    add-int/lit8 v6, p1, 0x1

    .line 12
    .line 13
    aget v7, p0, v4

    .line 14
    .line 15
    if-gt v6, v7, :cond_0

    .line 16
    .line 17
    if-ge v7, v2, :cond_0

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    move v5, v3

    .line 21
    :goto_1
    if-eqz v5, :cond_1

    .line 22
    .line 23
    move v1, v4

    .line 24
    move v2, v7

    .line 25
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    return v1
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
.end method

.method public static synthetic indexOfMinValue$default([IIILjava/lang/Object;)I
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/high16 p1, -0x80000000

    :cond_0
    invoke-static {p0, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->indexOfMinValue([II)I

    move-result p0

    return p0
.end method

.method private static final maxInRange-jy6DScQ([IJ)I
    .locals 3

    const/16 v0, 0x20

    shr-long v0, p1, v0

    long-to-int v0, v0

    const-wide v1, 0xffffffffL

    and-long/2addr p1, v1

    long-to-int p1, p1

    const/high16 p2, -0x80000000

    :goto_0
    if-ge v0, p1, :cond_0

    aget v1, p0, v0

    invoke-static {p2, v1}, Ljava/lang/Math;->max(II)I

    move-result p2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return p2
.end method

.method private static final measure(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;I[I[IZ)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;
    .locals 39
    .annotation build Landroidx/compose/foundation/ExperimentalFoundationApi;
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    .line 1
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getMeasureScope()Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;

    move-result-object v4

    .line 2
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getItemProvider()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;

    move-result-object v5

    invoke-interface {v5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;->getItemCount()I

    move-result v15

    if-lez v15, :cond_72

    .line 3
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getLaneCount()I

    move-result v5

    if-nez v5, :cond_0

    goto/16 :goto_5a

    .line 4
    :cond_0
    array-length v5, v2

    invoke-static {v2, v5}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v8

    const-string v5, "copyOf(this, size)"

    invoke-static {v8, v5}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    array-length v2, v3

    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v9

    invoke-static {v9, v5}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-static {v0, v8, v15}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->ensureIndicesInRange(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;[II)V

    neg-int v2, v1

    .line 7
    invoke-static {v9, v2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->offsetBy([II)V

    .line 8
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getLaneCount()I

    move-result v6

    new-array v7, v6, [Lkotlin/collections/k;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v6, :cond_1

    .line 9
    new-instance v3, Lkotlin/collections/k;

    const/16 v11, 0x10

    invoke-direct {v3, v11}, Lkotlin/collections/k;-><init>(I)V

    aput-object v3, v7, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 10
    :cond_1
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getBeforeContentPadding()I

    move-result v2

    neg-int v2, v2

    invoke-static {v9, v2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->offsetBy([II)V

    const/4 v2, 0x0

    .line 11
    :goto_1
    invoke-static {v8, v9, v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->measure$lambda$38$hasSpaceBeforeFirst([I[ILandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;)Z

    move-result v3

    if-eqz v3, :cond_c

    .line 12
    invoke-static {v8}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->indexOfMaxValue([I)I

    move-result v3

    .line 13
    aget v10, v8, v3

    .line 14
    array-length v14, v9

    const/4 v11, 0x0

    :goto_2
    if-ge v11, v14, :cond_3

    .line 15
    aget v12, v8, v11

    aget v13, v8, v3

    if-eq v12, v13, :cond_2

    .line 16
    aget v12, v9, v11

    aget v13, v9, v3

    if-ge v12, v13, :cond_2

    .line 17
    aput v13, v9, v11

    :cond_2
    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    .line 18
    :cond_3
    invoke-static {v0, v10, v3}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->findPreviousItemIndex(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;II)I

    move-result v10

    if-gez v10, :cond_4

    move/from16 p2, v2

    move/from16 v24, v15

    goto/16 :goto_9

    .line 19
    :cond_4
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getItemProvider()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;

    move-result-object v11

    invoke-virtual {v0, v11, v10, v3}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getSpanRange-lOCCd4c(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;II)J

    move-result-wide v11

    .line 20
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getLaneInfo()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;

    move-result-object v3

    const-wide v13, 0xffffffffL

    and-long/2addr v13, v11

    long-to-int v13, v13

    move/from16 v24, v15

    const/16 v14, 0x20

    shr-long v14, v11, v14

    long-to-int v14, v14

    sub-int v15, v13, v14

    move/from16 p2, v2

    const/4 v2, 0x1

    if-eq v15, v2, :cond_5

    move/from16 v18, v2

    goto :goto_3

    :cond_5
    const/16 v18, 0x0

    :goto_3
    if-eqz v18, :cond_6

    const/4 v2, -0x2

    goto :goto_4

    :cond_6
    move v2, v14

    :goto_4
    invoke-virtual {v3, v10, v2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;->setLane(II)V

    .line 21
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getMeasuredItemProvider()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;

    move-result-object v2

    invoke-virtual {v2, v10, v11, v12}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;->getAndMeasure-jy6DScQ(IJ)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;

    move-result-object v2

    .line 22
    invoke-static {v9, v11, v12}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->maxInRange-jy6DScQ([IJ)I

    move-result v3

    const/4 v11, 0x1

    if-eq v15, v11, :cond_7

    const/4 v11, 0x1

    goto :goto_5

    :cond_7
    const/4 v11, 0x0

    :goto_5
    if-eqz v11, :cond_8

    .line 23
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getLaneInfo()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;

    move-result-object v11

    invoke-virtual {v11, v10}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;->getGaps(I)[I

    move-result-object v11

    goto :goto_6

    :cond_8
    const/4 v11, 0x0

    :goto_6
    move/from16 v12, p2

    :goto_7
    if-ge v14, v13, :cond_b

    .line 24
    aput v10, v8, v14

    if-nez v11, :cond_9

    const/4 v15, 0x0

    goto :goto_8

    .line 25
    :cond_9
    aget v15, v11, v14

    .line 26
    :goto_8
    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->getSizeWithSpacings()I

    move-result v16

    add-int v16, v3, v16

    add-int v16, v16, v15

    .line 27
    aput v16, v9, v14

    .line 28
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getMainAxisAvailableSize()I

    move-result v15

    add-int v15, v15, v16

    if-gtz v15, :cond_a

    const/4 v12, 0x1

    :cond_a
    add-int/lit8 v14, v14, 0x1

    goto :goto_7

    :cond_b
    move v2, v12

    move/from16 v15, v24

    goto/16 :goto_1

    :cond_c
    move/from16 p2, v2

    move/from16 v24, v15

    const/4 v3, -0x1

    .line 29
    :goto_9
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getBeforeContentPadding()I

    move-result v2

    neg-int v15, v2

    const/4 v2, 0x0

    .line 30
    aget v10, v9, v2

    if-ge v10, v15, :cond_d

    add-int/2addr v1, v10

    sub-int v10, v15, v10

    .line 31
    invoke-static {v9, v10}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->offsetBy([II)V

    .line 32
    :cond_d
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getBeforeContentPadding()I

    move-result v10

    invoke-static {v9, v10}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->offsetBy([II)V

    const/4 v10, -0x1

    if-ne v3, v10, :cond_e

    .line 33
    invoke-static {v8, v2}, Lkotlin/collections/l;->Gf([II)I

    move-result v3

    :cond_e
    if-eq v3, v10, :cond_11

    .line 34
    invoke-static {v8, v0, v9, v3}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->measure$lambda$38$misalignedStart([ILandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;[II)Z

    move-result v2

    if-eqz v2, :cond_11

    if-eqz p4, :cond_11

    .line 35
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getLaneInfo()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;->reset()V

    .line 36
    array-length v2, v8

    new-array v4, v2, [I

    const/4 v5, 0x0

    :goto_a
    if-ge v5, v2, :cond_f

    aput v10, v4, v5

    add-int/lit8 v5, v5, 0x1

    const/4 v10, -0x1

    goto :goto_a

    .line 37
    :cond_f
    array-length v2, v9

    new-array v5, v2, [I

    const/4 v6, 0x0

    :goto_b
    if-ge v6, v2, :cond_10

    .line 38
    aget v7, v9, v3

    aput v7, v5, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_b

    :cond_10
    const/4 v6, 0x0

    .line 39
    invoke-static {v0, v1, v4, v5, v6}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->measure(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;I[I[IZ)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;

    move-result-object v0

    return-object v0

    .line 40
    :cond_11
    array-length v2, v8

    invoke-static {v8, v2}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v10

    invoke-static {v10, v5}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    array-length v11, v9

    new-array v12, v11, [I

    const/4 v2, 0x0

    :goto_c
    if-ge v2, v11, :cond_12

    .line 42
    aget v3, v9, v2

    neg-int v3, v3

    aput v3, v12, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_c

    .line 43
    :cond_12
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getMainAxisSpacing()I

    move-result v2

    add-int v13, v15, v2

    .line 44
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getMainAxisAvailableSize()I

    move-result v2

    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getAfterContentPadding()I

    move-result v3

    add-int/2addr v2, v3

    const/4 v3, 0x0

    invoke-static {v2, v3}, Lkotlin/ranges/s;->u(II)I

    move-result v14

    move/from16 p3, v15

    const/4 v2, 0x0

    const/4 v15, 0x1

    .line 45
    invoke-static {v10, v3, v15, v2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->indexOfMinValue$default([IIILjava/lang/Object;)I

    move-result v25

    move/from16 p1, p2

    move/from16 v3, v25

    const/4 v2, 0x0

    const/4 v15, -0x1

    :goto_d
    if-eq v3, v15, :cond_1a

    .line 46
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getLaneCount()I

    move-result v15

    if-ge v2, v15, :cond_1a

    .line 47
    aget v15, v10, v3

    .line 48
    invoke-static {v10, v15}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->indexOfMinValue([II)I

    move-result v25

    add-int/lit8 v2, v2, 0x1

    move/from16 p2, v2

    if-ltz v15, :cond_19

    .line 49
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getItemProvider()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;

    move-result-object v2

    invoke-virtual {v0, v2, v15, v3}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getSpanRange-lOCCd4c(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;II)J

    move-result-wide v2

    move-object/from16 v26, v4

    .line 50
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getMeasuredItemProvider()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;

    move-result-object v4

    invoke-virtual {v4, v15, v2, v3}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;->getAndMeasure-jy6DScQ(IJ)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;

    move-result-object v4

    move-object/from16 v27, v5

    .line 51
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getLaneInfo()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;

    move-result-object v5

    move/from16 v28, v1

    const-wide v22, 0xffffffffL

    and-long v0, v2, v22

    long-to-int v0, v0

    move-object/from16 v29, v8

    move-object/from16 v30, v9

    const/16 v1, 0x20

    shr-long v8, v2, v1

    long-to-int v1, v8

    sub-int v8, v0, v1

    const/4 v9, 0x1

    if-eq v8, v9, :cond_13

    const/4 v9, 0x1

    goto :goto_e

    :cond_13
    const/4 v9, 0x0

    :goto_e
    if-eqz v9, :cond_14

    const/4 v9, -0x2

    goto :goto_f

    :cond_14
    move v9, v1

    :goto_f
    invoke-virtual {v5, v15, v9}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;->setLane(II)V

    .line 52
    invoke-static {v12, v2, v3}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->maxInRange-jy6DScQ([IJ)I

    move-result v2

    move v3, v1

    :goto_10
    if-ge v3, v0, :cond_15

    .line 53
    invoke-virtual {v4}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->getSizeWithSpacings()I

    move-result v5

    add-int/2addr v5, v2

    aput v5, v12, v3

    .line 54
    aput v15, v10, v3

    .line 55
    aget-object v5, v7, v3

    invoke-virtual {v5, v4}, Lkotlin/collections/k;->addLast(Ljava/lang/Object;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_10

    :cond_15
    if-ge v2, v13, :cond_16

    .line 56
    aget v0, v12, v1

    if-gt v0, v13, :cond_16

    const/4 v0, 0x0

    .line 57
    invoke-virtual {v4, v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->setVisible(Z)V

    const/4 v0, 0x1

    goto :goto_11

    :cond_16
    move/from16 v0, p1

    :goto_11
    const/4 v1, 0x1

    if-eq v8, v1, :cond_17

    const/4 v1, 0x1

    goto :goto_12

    :cond_17
    const/4 v1, 0x0

    :goto_12
    if-eqz v1, :cond_18

    .line 58
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getLaneCount()I

    move-result v2

    goto :goto_13

    :cond_18
    move/from16 v2, p2

    :goto_13
    move/from16 p1, v0

    move/from16 v3, v25

    move-object/from16 v4, v26

    move-object/from16 v5, v27

    move/from16 v1, v28

    move-object/from16 v8, v29

    move-object/from16 v9, v30

    const/4 v15, -0x1

    move-object/from16 v0, p0

    goto/16 :goto_d

    :cond_19
    const/4 v15, -0x1

    move-object/from16 v0, p0

    move/from16 v3, v25

    goto/16 :goto_d

    :cond_1a
    move/from16 v28, v1

    move-object/from16 v26, v4

    move-object/from16 v27, v5

    move-object/from16 v29, v8

    move-object/from16 v30, v9

    :goto_14
    const/4 v0, 0x0

    :goto_15
    if-ge v0, v11, :cond_1e

    .line 59
    aget v1, v12, v0

    if-lt v1, v14, :cond_1c

    if-gtz v1, :cond_1b

    goto :goto_16

    :cond_1b
    const/4 v1, 0x0

    goto :goto_17

    :cond_1c
    :goto_16
    const/4 v1, 0x1

    :goto_17
    if-eqz v1, :cond_1d

    const/4 v0, 0x1

    goto :goto_18

    :cond_1d
    add-int/lit8 v0, v0, 0x1

    goto :goto_15

    :cond_1e
    const/4 v0, 0x0

    :goto_18
    if-nez v0, :cond_22

    const/4 v0, 0x0

    :goto_19
    if-ge v0, v6, :cond_20

    .line 60
    aget-object v1, v7, v0

    .line 61
    invoke-virtual {v1}, Lkotlin/collections/k;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1f

    const/4 v0, 0x0

    goto :goto_1a

    :cond_1f
    add-int/lit8 v0, v0, 0x1

    goto :goto_19

    :cond_20
    const/4 v0, 0x1

    :goto_1a
    if-eqz v0, :cond_21

    goto :goto_1b

    :cond_21
    move/from16 v15, v24

    const/4 v1, 0x1

    goto :goto_1c

    :cond_22
    :goto_1b
    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 62
    invoke-static {v12, v2, v1, v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->indexOfMinValue$default([IIILjava/lang/Object;)I

    move-result v3

    .line 63
    invoke-static {v10}, Lkotlin/collections/l;->Xk([I)I

    move-result v0

    add-int/2addr v0, v1

    move/from16 v15, v24

    if-lt v0, v15, :cond_69

    :goto_1c
    const/4 v0, 0x0

    :goto_1d
    if-ge v0, v6, :cond_27

    .line 64
    aget-object v2, v7, v0

    .line 65
    :goto_1e
    invoke-virtual {v2}, Lkotlin/collections/f;->size()I

    move-result v3

    if-le v3, v1, :cond_25

    invoke-virtual {v2}, Lkotlin/collections/k;->first()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;

    invoke-virtual {v3}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->isVisible()Z

    move-result v3

    if-nez v3, :cond_25

    .line 66
    invoke-virtual {v2}, Lkotlin/collections/k;->removeFirst()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;

    .line 67
    invoke-virtual {v3}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->getSpan()I

    move-result v4

    if-eq v4, v1, :cond_23

    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getLaneInfo()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;

    move-result-object v1

    invoke-virtual {v3}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->getIndex()I

    move-result v4

    invoke-virtual {v1, v4}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;->getGaps(I)[I

    move-result-object v1

    goto :goto_1f

    :cond_23
    const/4 v1, 0x0

    .line 68
    :goto_1f
    aget v4, v30, v0

    .line 69
    invoke-virtual {v3}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->getSizeWithSpacings()I

    move-result v3

    if-nez v1, :cond_24

    const/4 v1, 0x0

    goto :goto_20

    :cond_24
    aget v1, v1, v0

    :goto_20
    add-int/2addr v3, v1

    sub-int/2addr v4, v3

    .line 70
    aput v4, v30, v0

    const/4 v1, 0x1

    goto :goto_1e

    .line 71
    :cond_25
    invoke-virtual {v2}, Lkotlin/collections/k;->i()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;

    if-eqz v1, :cond_26

    invoke-virtual {v1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->getIndex()I

    move-result v1

    goto :goto_21

    :cond_26
    const/4 v1, -0x1

    :goto_21
    aput v1, v29, v0

    add-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    goto :goto_1d

    .line 72
    :cond_27
    array-length v0, v10

    const/4 v1, 0x0

    :goto_22
    if-ge v1, v0, :cond_2a

    aget v2, v10, v1

    add-int/lit8 v3, v15, -0x1

    if-ne v2, v3, :cond_28

    const/4 v2, 0x1

    goto :goto_23

    :cond_28
    const/4 v2, 0x0

    :goto_23
    if-eqz v2, :cond_29

    const/4 v0, 0x1

    goto :goto_24

    :cond_29
    add-int/lit8 v1, v1, 0x1

    goto :goto_22

    :cond_2a
    const/4 v0, 0x0

    :goto_24
    if-eqz v0, :cond_2b

    .line 73
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getMainAxisSpacing()I

    move-result v0

    neg-int v0, v0

    invoke-static {v12, v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->offsetBy([II)V

    :cond_2b
    const/4 v0, 0x0

    :goto_25
    if-ge v0, v11, :cond_2e

    .line 74
    aget v1, v12, v0

    .line 75
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getMainAxisAvailableSize()I

    move-result v2

    if-ge v1, v2, :cond_2c

    const/4 v1, 0x1

    goto :goto_26

    :cond_2c
    const/4 v1, 0x0

    :goto_26
    if-nez v1, :cond_2d

    const/4 v0, 0x0

    goto :goto_27

    :cond_2d
    add-int/lit8 v0, v0, 0x1

    goto :goto_25

    :cond_2e
    const/4 v0, 0x1

    :goto_27
    if-eqz v0, :cond_43

    .line 76
    invoke-static {v12}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->indexOfMaxValue([I)I

    move-result v0

    .line 77
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getMainAxisAvailableSize()I

    move-result v1

    aget v0, v12, v0

    sub-int/2addr v1, v0

    neg-int v0, v1

    move-object/from16 v8, v30

    .line 78
    invoke-static {v8, v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->offsetBy([II)V

    .line 79
    invoke-static {v12, v1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->offsetBy([II)V

    const/4 v0, 0x0

    .line 80
    :goto_28
    array-length v2, v8

    const/4 v3, 0x0

    :goto_29
    if-ge v3, v2, :cond_31

    aget v4, v8, v3

    .line 81
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getBeforeContentPadding()I

    move-result v5

    if-ge v4, v5, :cond_2f

    const/4 v4, 0x1

    goto :goto_2a

    :cond_2f
    const/4 v4, 0x0

    :goto_2a
    if-eqz v4, :cond_30

    const/4 v2, 0x1

    goto :goto_2b

    :cond_30
    add-int/lit8 v3, v3, 0x1

    goto :goto_29

    :cond_31
    const/4 v2, 0x0

    :goto_2b
    if-eqz v2, :cond_41

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 82
    invoke-static {v8, v4, v3, v2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->indexOfMinValue$default([IIILjava/lang/Object;)I

    move-result v5

    .line 83
    invoke-static/range {v29 .. v29}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->indexOfMaxValue([I)I

    move-result v2

    if-eq v5, v2, :cond_33

    .line 84
    aget v3, v8, v5

    aget v4, v8, v2

    if-ne v3, v4, :cond_32

    move v5, v2

    goto :goto_2c

    :cond_32
    const/4 v0, 0x1

    .line 85
    :cond_33
    :goto_2c
    aget v2, v29, v5

    const/4 v3, -0x1

    if-ne v2, v3, :cond_34

    move-object/from16 v9, p0

    move v2, v15

    goto :goto_2d

    :cond_34
    move-object/from16 v9, p0

    .line 86
    :goto_2d
    invoke-static {v9, v2, v5}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->findPreviousItemIndex(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;II)I

    move-result v2

    if-gez v2, :cond_39

    move-object/from16 v13, v29

    if-nez v0, :cond_35

    .line 87
    invoke-static {v13, v9, v8, v5}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->measure$lambda$38$misalignedStart([ILandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;[II)Z

    move-result v2

    if-eqz v2, :cond_38

    :cond_35
    if-eqz p4, :cond_38

    .line 88
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getLaneInfo()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;->reset()V

    .line 89
    array-length v0, v13

    new-array v1, v0, [I

    const/4 v2, 0x0

    :goto_2e
    if-ge v2, v0, :cond_36

    const/4 v3, -0x1

    aput v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_2e

    .line 90
    :cond_36
    array-length v0, v8

    new-array v2, v0, [I

    const/4 v3, 0x0

    :goto_2f
    if-ge v3, v0, :cond_37

    .line 91
    aget v4, v8, v5

    aput v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_2f

    :cond_37
    move/from16 v4, v28

    const/4 v3, 0x0

    .line 92
    invoke-static {v9, v4, v1, v2, v3}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->measure(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;I[I[IZ)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;

    move-result-object v0

    return-object v0

    :cond_38
    move/from16 v4, v28

    move-object/from16 v24, v10

    move/from16 v25, v11

    move/from16 p2, v14

    goto/16 :goto_35

    :cond_39
    move/from16 v4, v28

    move-object/from16 v13, v29

    .line 93
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getItemProvider()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;

    move-result-object v3

    move-object/from16 v24, v10

    move/from16 v25, v11

    invoke-virtual {v9, v3, v2, v5}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getSpanRange-lOCCd4c(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;II)J

    move-result-wide v10

    .line 94
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getLaneInfo()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;

    move-result-object v3

    move/from16 p2, v14

    move/from16 v28, v15

    const-wide v22, 0xffffffffL

    and-long v14, v10, v22

    long-to-int v5, v14

    move/from16 v29, v0

    move v15, v1

    const/16 v14, 0x20

    shr-long v0, v10, v14

    long-to-int v0, v0

    sub-int v1, v5, v0

    const/4 v14, 0x1

    if-eq v1, v14, :cond_3a

    move/from16 v20, v14

    goto :goto_30

    :cond_3a
    const/16 v20, 0x0

    :goto_30
    if-eqz v20, :cond_3b

    const/4 v14, -0x2

    goto :goto_31

    :cond_3b
    move v14, v0

    :goto_31
    invoke-virtual {v3, v2, v14}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;->setLane(II)V

    .line 95
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getMeasuredItemProvider()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;

    move-result-object v3

    invoke-virtual {v3, v2, v10, v11}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;->getAndMeasure-jy6DScQ(IJ)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;

    move-result-object v3

    .line 96
    invoke-static {v8, v10, v11}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->maxInRange-jy6DScQ([IJ)I

    move-result v10

    const/4 v11, 0x1

    if-eq v1, v11, :cond_3c

    const/4 v1, 0x1

    goto :goto_32

    :cond_3c
    const/4 v1, 0x0

    :goto_32
    if-eqz v1, :cond_3d

    .line 97
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getLaneInfo()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;->getGaps(I)[I

    move-result-object v1

    goto :goto_33

    :cond_3d
    const/4 v1, 0x0

    :goto_33
    if-ge v0, v5, :cond_40

    .line 98
    aget v11, v8, v0

    if-eq v11, v10, :cond_3e

    const/16 v29, 0x1

    .line 99
    :cond_3e
    aget-object v11, v7, v0

    invoke-virtual {v11, v3}, Lkotlin/collections/k;->addFirst(Ljava/lang/Object;)V

    .line 100
    aput v2, v13, v0

    if-nez v1, :cond_3f

    const/4 v11, 0x0

    goto :goto_34

    .line 101
    :cond_3f
    aget v11, v1, v0

    .line 102
    :goto_34
    invoke-virtual {v3}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->getSizeWithSpacings()I

    move-result v14

    add-int/2addr v14, v10

    add-int/2addr v14, v11

    aput v14, v8, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_33

    :cond_40
    move/from16 v14, p2

    move v1, v15

    move-object/from16 v10, v24

    move/from16 v11, v25

    move/from16 v15, v28

    move/from16 v0, v29

    move/from16 v28, v4

    move-object/from16 v29, v13

    goto/16 :goto_28

    :cond_41
    move-object/from16 v9, p0

    move-object/from16 v24, v10

    move/from16 v25, v11

    move/from16 p2, v14

    move/from16 v4, v28

    move-object/from16 v13, v29

    :goto_35
    move/from16 v28, v15

    move v15, v1

    if-eqz v0, :cond_42

    if-eqz p4, :cond_42

    .line 103
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getLaneInfo()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;->reset()V

    const/4 v0, 0x0

    .line 104
    invoke-static {v9, v4, v13, v8, v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->measure(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;I[I[IZ)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;

    move-result-object v0

    return-object v0

    :cond_42
    const/4 v0, 0x0

    add-int v1, v4, v15

    const/4 v2, 0x1

    const/4 v5, 0x0

    .line 105
    invoke-static {v8, v0, v2, v5}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->indexOfMinValue$default([IIILjava/lang/Object;)I

    move-result v3

    .line 106
    aget v0, v8, v3

    if-gez v0, :cond_44

    add-int/2addr v1, v0

    .line 107
    invoke-static {v12, v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->offsetBy([II)V

    neg-int v0, v0

    .line 108
    invoke-static {v8, v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->offsetBy([II)V

    goto :goto_36

    :cond_43
    move-object/from16 v9, p0

    move-object/from16 v24, v10

    move/from16 v25, v11

    move/from16 p2, v14

    move/from16 v4, v28

    move-object/from16 v13, v29

    move-object/from16 v8, v30

    const/4 v5, 0x0

    move/from16 v28, v15

    move v1, v4

    .line 109
    :cond_44
    :goto_36
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getState()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->getScrollToBeConsumed$foundation_release()F

    move-result v0

    invoke-static {v0}, Lkotlin/math/b;->L0(F)I

    move-result v0

    invoke-static {v0}, Lkotlin/math/b;->U(I)I

    move-result v0

    invoke-static {v1}, Lkotlin/math/b;->U(I)I

    move-result v2

    if-ne v0, v2, :cond_45

    .line 110
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getState()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->getScrollToBeConsumed$foundation_release()F

    move-result v0

    invoke-static {v0}, Lkotlin/math/b;->L0(F)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v2

    if-lt v0, v2, :cond_45

    int-to-float v0, v1

    goto :goto_37

    .line 111
    :cond_45
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getState()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->getScrollToBeConsumed$foundation_release()F

    move-result v0

    .line 112
    :goto_37
    array-length v1, v8

    invoke-static {v8, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v1

    move-object/from16 v10, v27

    invoke-static {v1, v10}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 113
    array-length v2, v1

    const/4 v3, 0x0

    :goto_38
    if-ge v3, v2, :cond_46

    .line 114
    aget v4, v1, v3

    neg-int v4, v4

    aput v4, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_38

    .line 115
    :cond_46
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getBeforeContentPadding()I

    move-result v2

    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getMainAxisSpacing()I

    move-result v3

    if-le v2, v3, :cond_49

    const/4 v2, 0x0

    :goto_39
    if-ge v2, v6, :cond_49

    .line 116
    aget-object v3, v7, v2

    .line 117
    invoke-virtual {v3}, Lkotlin/collections/f;->size()I

    move-result v4

    const/4 v10, 0x0

    :goto_3a
    if-ge v10, v4, :cond_48

    .line 118
    invoke-virtual {v3, v10}, Lkotlin/collections/k;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;

    .line 119
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getLaneInfo()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;

    move-result-object v14

    invoke-virtual {v11}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->getIndex()I

    move-result v15

    invoke-virtual {v14, v15}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;->getGaps(I)[I

    move-result-object v14

    .line 120
    invoke-virtual {v11}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->getSizeWithSpacings()I

    move-result v11

    if-nez v14, :cond_47

    const/4 v14, 0x0

    goto :goto_3b

    :cond_47
    aget v14, v14, v2

    :goto_3b
    add-int/2addr v11, v14

    .line 121
    invoke-static {v3}, Lkotlin/collections/u;->G(Ljava/util/List;)I

    move-result v14

    if-eq v10, v14, :cond_48

    .line 122
    aget v14, v8, v2

    if-eqz v14, :cond_48

    if-lt v14, v11, :cond_48

    sub-int/2addr v14, v11

    .line 123
    aput v14, v8, v2

    add-int/lit8 v10, v10, 0x1

    .line 124
    invoke-virtual {v3, v10}, Lkotlin/collections/k;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;

    invoke-virtual {v11}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->getIndex()I

    move-result v11

    aput v11, v13, v2

    goto :goto_3a

    :cond_48
    add-int/lit8 v2, v2, 0x1

    goto :goto_39

    .line 125
    :cond_49
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getBeforeContentPadding()I

    move-result v2

    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getAfterContentPadding()I

    move-result v3

    add-int/2addr v2, v3

    .line 126
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->isVertical()Z

    move-result v3

    if-eqz v3, :cond_4a

    .line 127
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getConstraints-msEJaDk()J

    move-result-wide v3

    invoke-static {v3, v4}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    move-result v3

    goto :goto_3c

    .line 128
    :cond_4a
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getConstraints-msEJaDk()J

    move-result-wide v3

    invoke-static {v12}, Lkotlin/collections/l;->Xk([I)I

    move-result v6

    add-int/2addr v6, v2

    invoke-static {v3, v4, v6}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainWidth-K40F9xA(JI)I

    move-result v3

    :goto_3c
    move v11, v3

    .line 129
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->isVertical()Z

    move-result v3

    if-eqz v3, :cond_4b

    .line 130
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getConstraints-msEJaDk()J

    move-result-wide v3

    invoke-static {v12}, Lkotlin/collections/l;->Xk([I)I

    move-result v6

    add-int/2addr v6, v2

    invoke-static {v3, v4, v6}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainHeight-K40F9xA(JI)I

    move-result v2

    goto :goto_3d

    .line 131
    :cond_4b
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getConstraints-msEJaDk()J

    move-result-wide v2

    invoke-static {v2, v3}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    move-result v2

    :goto_3d
    move v14, v2

    .line 132
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->isVertical()Z

    move-result v2

    if-eqz v2, :cond_4c

    move v2, v14

    goto :goto_3e

    :cond_4c
    move v2, v11

    :goto_3e
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getMainAxisAvailableSize()I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 133
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getBeforeContentPadding()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getAfterContentPadding()I

    move-result v3

    add-int/2addr v2, v3

    const/4 v3, 0x0

    .line 134
    aget v4, v1, v3

    .line 135
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getPinnedItems()Ljava/util/List;

    move-result-object v3

    .line 136
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v6

    const/4 v10, -0x1

    add-int/2addr v6, v10

    if-ltz v6, :cond_55

    move v10, v6

    move v6, v4

    move-object v4, v5

    :goto_3f
    add-int/lit8 v15, v10, -0x1

    .line 137
    invoke-interface {v3, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    .line 138
    check-cast v10, Ljava/lang/Number;

    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    move-result v10

    .line 139
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getLaneInfo()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;

    move-result-object v5

    invoke-virtual {v5, v10}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;->getLane(I)I

    move-result v5

    move-object/from16 p4, v3

    const/4 v3, -0x2

    if-eq v5, v3, :cond_4f

    const/4 v3, -0x1

    if-eq v5, v3, :cond_4f

    .line 140
    aget v3, v13, v5

    if-le v3, v10, :cond_4e

    :cond_4d
    const/4 v3, 0x1

    goto :goto_43

    :cond_4e
    :goto_40
    const/4 v3, 0x0

    goto :goto_43

    .line 141
    :cond_4f
    array-length v3, v13

    const/4 v5, 0x0

    :goto_41
    if-ge v5, v3, :cond_4d

    move/from16 v21, v3

    aget v3, v13, v5

    if-le v3, v10, :cond_50

    const/4 v3, 0x1

    goto :goto_42

    :cond_50
    const/4 v3, 0x0

    :goto_42
    if-nez v3, :cond_51

    goto :goto_40

    :cond_51
    add-int/lit8 v5, v5, 0x1

    move/from16 v3, v21

    goto :goto_41

    :goto_43
    if-eqz v3, :cond_53

    .line 142
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getItemProvider()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;

    move-result-object v3

    move-object/from16 v27, v12

    move-object/from16 v38, v13

    const/4 v5, 0x0

    invoke-virtual {v9, v3, v10, v5}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getSpanRange-lOCCd4c(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;II)J

    move-result-wide v12

    if-nez v4, :cond_52

    .line 143
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 144
    :cond_52
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getMeasuredItemProvider()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;

    move-result-object v3

    invoke-virtual {v3, v10, v12, v13}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;->getAndMeasure-jy6DScQ(IJ)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;

    move-result-object v3

    .line 145
    invoke-virtual {v3}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->getSizeWithSpacings()I

    move-result v10

    sub-int/2addr v6, v10

    .line 146
    invoke-virtual {v3, v6, v5, v2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->position(III)V

    .line 147
    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_44

    :cond_53
    move-object/from16 v27, v12

    move-object/from16 v38, v13

    :goto_44
    if-gez v15, :cond_54

    goto :goto_45

    :cond_54
    move-object/from16 v3, p4

    move v10, v15

    move-object/from16 v12, v27

    move-object/from16 v13, v38

    const/4 v5, 0x0

    goto :goto_3f

    :cond_55
    move-object/from16 v27, v12

    move-object/from16 v38, v13

    const/4 v4, 0x0

    :goto_45
    if-nez v4, :cond_56

    .line 148
    invoke-static {}, Lkotlin/collections/u;->E()Ljava/util/List;

    move-result-object v4

    .line 149
    :cond_56
    invoke-static {v9, v7, v1, v2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->calculateVisibleItems(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;[Lkotlin/collections/k;[II)Ljava/util/List;

    move-result-object v15

    const/4 v3, 0x0

    .line 150
    aget v1, v1, v3

    .line 151
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getPinnedItems()Ljava/util/List;

    move-result-object v3

    .line 152
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v5

    const/4 v6, 0x0

    const/16 v17, 0x0

    :goto_46
    if-ge v6, v5, :cond_5f

    .line 153
    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    .line 154
    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    move/from16 v13, v28

    if-lt v7, v13, :cond_58

    :cond_57
    move-object/from16 p4, v3

    move/from16 v21, v5

    move-object/from16 v10, v24

    :goto_47
    const/4 v3, 0x0

    goto :goto_4b

    .line 155
    :cond_58
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getLaneInfo()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;

    move-result-object v10

    invoke-virtual {v10, v7}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;->getLane(I)I

    move-result v10

    const/4 v12, -0x2

    if-eq v10, v12, :cond_59

    const/4 v12, -0x1

    if-eq v10, v12, :cond_59

    .line 156
    aget v10, v24, v10

    if-ge v10, v7, :cond_57

    move-object/from16 p4, v3

    move/from16 v21, v5

    move-object/from16 v10, v24

    :goto_48
    const/4 v3, 0x1

    goto :goto_4b

    :cond_59
    move-object/from16 v10, v24

    .line 157
    array-length v12, v10

    move-object/from16 p4, v3

    const/4 v3, 0x0

    :goto_49
    if-ge v3, v12, :cond_5c

    move/from16 v21, v5

    aget v5, v10, v3

    if-ge v5, v7, :cond_5a

    const/4 v5, 0x1

    goto :goto_4a

    :cond_5a
    const/4 v5, 0x0

    :goto_4a
    if-nez v5, :cond_5b

    goto :goto_47

    :cond_5b
    add-int/lit8 v3, v3, 0x1

    move/from16 v5, v21

    goto :goto_49

    :cond_5c
    move/from16 v21, v5

    goto :goto_48

    :goto_4b
    if-eqz v3, :cond_5e

    .line 158
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getItemProvider()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;

    move-result-object v3

    move/from16 v24, v13

    const/4 v5, 0x0

    invoke-virtual {v9, v3, v7, v5}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getSpanRange-lOCCd4c(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;II)J

    move-result-wide v12

    if-nez v17, :cond_5d

    .line 159
    new-instance v17, Ljava/util/ArrayList;

    invoke-direct/range {v17 .. v17}, Ljava/util/ArrayList;-><init>()V

    :cond_5d
    move-object/from16 v28, v8

    move-object/from16 v3, v17

    .line 160
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getMeasuredItemProvider()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;

    move-result-object v8

    invoke-virtual {v8, v7, v12, v13}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;->getAndMeasure-jy6DScQ(IJ)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;

    move-result-object v7

    .line 161
    invoke-virtual {v7, v1, v5, v2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->position(III)V

    .line 162
    invoke-virtual {v7}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->getSizeWithSpacings()I

    move-result v5

    add-int/2addr v1, v5

    .line 163
    invoke-interface {v3, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object/from16 v17, v3

    goto :goto_4c

    :cond_5e
    move-object/from16 v28, v8

    move/from16 v24, v13

    :goto_4c
    add-int/lit8 v6, v6, 0x1

    move-object/from16 v3, p4

    move/from16 v5, v21

    move-object/from16 v8, v28

    move/from16 v28, v24

    move-object/from16 v24, v10

    goto/16 :goto_46

    :cond_5f
    move-object/from16 v10, v24

    move/from16 v24, v28

    move-object/from16 v28, v8

    if-nez v17, :cond_60

    .line 164
    invoke-static {}, Lkotlin/collections/u;->E()Ljava/util/List;

    move-result-object v17

    .line 165
    :cond_60
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 166
    check-cast v4, Ljava/util/Collection;

    invoke-interface {v1, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 167
    move-object v2, v15

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 168
    move-object/from16 v2, v17

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 169
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getState()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->getPlacementAnimator$foundation_release()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemPlacementAnimator;

    move-result-object v29

    float-to-int v2, v0

    .line 170
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getMeasuredItemProvider()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;

    move-result-object v34

    .line 171
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->isVertical()Z

    move-result v35

    .line 172
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getLaneCount()I

    move-result v36

    .line 173
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getCoroutineScope()Lkotlinx/coroutines/s0;

    move-result-object v37

    move/from16 v30, v2

    move/from16 v31, v11

    move/from16 v32, v14

    move-object/from16 v33, v1

    .line 174
    invoke-virtual/range {v29 .. v37}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemPlacementAnimator;->onMeasured(IIILjava/util/List;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;ZILkotlinx/coroutines/s0;)V

    move/from16 v5, v25

    const/4 v2, 0x0

    :goto_4d
    if-ge v2, v5, :cond_63

    .line 175
    aget v3, v27, v2

    .line 176
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getMainAxisAvailableSize()I

    move-result v4

    if-le v3, v4, :cond_61

    const/4 v3, 0x1

    goto :goto_4e

    :cond_61
    const/4 v3, 0x0

    :goto_4e
    if-eqz v3, :cond_62

    const/4 v2, 0x1

    goto :goto_4f

    :cond_62
    add-int/lit8 v2, v2, 0x1

    goto :goto_4d

    :cond_63
    const/4 v2, 0x0

    :goto_4f
    if-nez v2, :cond_68

    .line 177
    array-length v2, v10

    const/4 v3, 0x0

    :goto_50
    if-ge v3, v2, :cond_66

    aget v4, v10, v3

    add-int/lit8 v5, v24, -0x1

    if-ge v4, v5, :cond_64

    const/4 v4, 0x1

    goto :goto_51

    :cond_64
    const/4 v4, 0x0

    :goto_51
    if-nez v4, :cond_65

    const/4 v2, 0x0

    goto :goto_52

    :cond_65
    add-int/lit8 v3, v3, 0x1

    goto :goto_50

    :cond_66
    const/4 v2, 0x1

    :goto_52
    if-eqz v2, :cond_67

    goto :goto_53

    :cond_67
    const/16 v19, 0x0

    goto :goto_54

    :cond_68
    :goto_53
    const/16 v19, 0x1

    :goto_54
    const/4 v4, 0x0

    .line 178
    new-instance v5, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt$measure$1$29;

    invoke-direct {v5, v1, v9}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt$measure$1$29;-><init>(Ljava/util/List;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;)V

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object/from16 v1, v26

    move v2, v11

    move v3, v14

    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/layout/MeasureScope;->layout$default(Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lv3/l;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;

    move-result-object v10

    .line 179
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->isVertical()Z

    move-result v12

    .line 180
    invoke-static {v11, v14}, Landroidx/compose/ui/unit/IntSizeKt;->IntSize(II)J

    move-result-wide v16

    .line 181
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getBeforeContentPadding()I

    move-result v20

    .line 182
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getAfterContentPadding()I

    move-result v21

    .line 183
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getMainAxisSpacing()I

    move-result v22

    .line 184
    new-instance v1, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;

    move-object v6, v1

    const/16 v23, 0x0

    move-object/from16 v7, v38

    move-object/from16 v8, v28

    move v9, v0

    move/from16 v11, v19

    move/from16 v13, p1

    move/from16 v25, p2

    move/from16 v14, v24

    move/from16 v29, p3

    move/from16 v18, v29

    move/from16 v19, v25

    invoke-direct/range {v6 .. v23}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;-><init>([I[IFLandroidx/compose/ui/layout/MeasureResult;ZZZILjava/util/List;JIIIIILkotlin/jvm/internal/w;)V

    return-object v1

    :cond_69
    move-object/from16 v9, p0

    move-object v8, v10

    move v5, v11

    move/from16 v25, v14

    move/from16 v24, v15

    move-object/from16 v10, v27

    move/from16 v4, v28

    move-object/from16 v1, v29

    move-object/from16 v28, v30

    move/from16 v29, p3

    move-object/from16 v27, v12

    .line 185
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getItemProvider()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;

    move-result-object v2

    invoke-virtual {v9, v2, v0, v3}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getSpanRange-lOCCd4c(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;II)J

    move-result-wide v2

    .line 186
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getLaneInfo()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;

    move-result-object v11

    move v12, v4

    move/from16 v22, v5

    const-wide v14, 0xffffffffL

    and-long v4, v2, v14

    long-to-int v4, v4

    const/16 v5, 0x20

    shr-long v14, v2, v5

    long-to-int v14, v14

    sub-int v15, v4, v14

    const/4 v5, 0x1

    if-eq v15, v5, :cond_6a

    move/from16 v20, v5

    goto :goto_55

    :cond_6a
    const/16 v20, 0x0

    :goto_55
    if-eqz v20, :cond_6b

    const/4 v5, -0x2

    goto :goto_56

    :cond_6b
    move v5, v14

    :goto_56
    invoke-virtual {v11, v0, v5}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;->setLane(II)V

    .line 187
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getMeasuredItemProvider()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;

    move-result-object v5

    invoke-virtual {v5, v0, v2, v3}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;->getAndMeasure-jy6DScQ(IJ)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;

    move-result-object v5

    move-object/from16 v11, v27

    .line 188
    invoke-static {v11, v2, v3}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->maxInRange-jy6DScQ([IJ)I

    move-result v2

    const/4 v3, 0x1

    if-eq v15, v3, :cond_6c

    move v15, v3

    goto :goto_57

    :cond_6c
    const/4 v15, 0x0

    :goto_57
    if-eqz v15, :cond_6d

    .line 189
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getLaneInfo()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;

    move-result-object v15

    invoke-virtual {v15, v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;->getGaps(I)[I

    move-result-object v15

    if-nez v15, :cond_6e

    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getLaneCount()I

    move-result v15

    new-array v15, v15, [I

    goto :goto_58

    :cond_6d
    const/4 v15, 0x0

    :cond_6e
    :goto_58
    move v3, v14

    :goto_59
    if-ge v3, v4, :cond_70

    if-eqz v15, :cond_6f

    .line 190
    aget v23, v11, v3

    sub-int v23, v2, v23

    aput v23, v15, v3

    .line 191
    :cond_6f
    aput v0, v8, v3

    .line 192
    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->getSizeWithSpacings()I

    move-result v23

    add-int v23, v2, v23

    aput v23, v11, v3

    move-object/from16 v38, v1

    .line 193
    aget-object v1, v7, v3

    invoke-virtual {v1, v5}, Lkotlin/collections/k;->addLast(Ljava/lang/Object;)V

    add-int/lit8 v3, v3, 0x1

    move-object/from16 v1, v38

    goto :goto_59

    :cond_70
    move-object/from16 v38, v1

    .line 194
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getLaneInfo()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;

    move-result-object v1

    invoke-virtual {v1, v0, v15}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;->setGaps(I[I)V

    if-ge v2, v13, :cond_71

    .line 195
    aget v0, v11, v14

    if-gt v0, v13, :cond_71

    const/4 v0, 0x0

    .line 196
    invoke-virtual {v5, v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->setVisible(Z)V

    :cond_71
    move-object/from16 v27, v10

    move/from16 v14, v25

    move-object/from16 v30, v28

    move/from16 p3, v29

    move-object/from16 v29, v38

    move-object v10, v8

    move/from16 v28, v12

    move-object v12, v11

    move/from16 v11, v22

    goto/16 :goto_14

    :cond_72
    :goto_5a
    move-object v9, v0

    move-object/from16 v26, v4

    move/from16 v24, v15

    .line 197
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getConstraints-msEJaDk()J

    move-result-wide v0

    invoke-static {v0, v1}, Landroidx/compose/ui/unit/Constraints;->getMinWidth-impl(J)I

    move-result v5

    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getConstraints-msEJaDk()J

    move-result-wide v0

    invoke-static {v0, v1}, Landroidx/compose/ui/unit/Constraints;->getMinHeight-impl(J)I

    move-result v6

    const/4 v7, 0x0

    sget-object v8, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt$measure$1$1;->INSTANCE:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt$measure$1$1;

    const/4 v0, 0x4

    const/4 v10, 0x0

    move-object/from16 v4, v26

    move v9, v0

    invoke-static/range {v4 .. v10}, Landroidx/compose/ui/layout/MeasureScope;->layout$default(Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lv3/l;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;

    move-result-object v5

    .line 198
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->isVertical()Z

    move-result v7

    .line 199
    invoke-static {}, Lkotlin/collections/u;->E()Ljava/util/List;

    move-result-object v10

    .line 200
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getConstraints-msEJaDk()J

    move-result-wide v0

    invoke-static {v0, v1}, Landroidx/compose/ui/unit/Constraints;->getMinWidth-impl(J)I

    move-result v0

    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getConstraints-msEJaDk()J

    move-result-wide v8

    invoke-static {v8, v9}, Landroidx/compose/ui/unit/Constraints;->getMinHeight-impl(J)I

    move-result v1

    invoke-static {v0, v1}, Landroidx/compose/ui/unit/IntSizeKt;->IntSize(II)J

    move-result-wide v11

    .line 201
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getBeforeContentPadding()I

    move-result v0

    neg-int v13, v0

    .line 202
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getMainAxisAvailableSize()I

    move-result v0

    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getAfterContentPadding()I

    move-result v1

    add-int v14, v0, v1

    .line 203
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getBeforeContentPadding()I

    move-result v15

    move/from16 v0, v24

    .line 204
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getAfterContentPadding()I

    move-result v16

    .line 205
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getMainAxisSpacing()I

    move-result v17

    .line 206
    new-instance v19, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;

    move-object/from16 v1, v19

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/16 v18, 0x0

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move v9, v0

    invoke-direct/range {v1 .. v18}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;-><init>([I[IFLandroidx/compose/ui/layout/MeasureResult;ZZZILjava/util/List;JIIIIILkotlin/jvm/internal/w;)V

    return-object v19
.end method

.method private static final measure$lambda$38$hasSpaceBeforeFirst([I[ILandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;)Z
    .locals 6

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    if-ge v2, v0, :cond_1

    .line 5
    .line 6
    aget v3, p0, v2

    .line 7
    .line 8
    aget v4, p1, v2

    .line 9
    .line 10
    invoke-virtual {p2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getMainAxisSpacing()I

    .line 11
    .line 12
    .line 13
    move-result v5

    .line 14
    neg-int v5, v5

    .line 15
    invoke-static {v5, v1}, Ljava/lang/Math;->max(II)I

    .line 16
    .line 17
    .line 18
    move-result v5

    .line 19
    if-ge v4, v5, :cond_0

    .line 20
    .line 21
    if-lez v3, :cond_0

    .line 22
    .line 23
    const/4 p0, 0x1

    .line 24
    return p0

    .line 25
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    return v1
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
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
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
.end method

.method private static final measure$lambda$38$misalignedStart([ILandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;[II)Z
    .locals 7

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    const/4 v3, -0x1

    .line 5
    const/4 v4, 0x1

    .line 6
    if-ge v2, v0, :cond_2

    .line 7
    .line 8
    aget v5, p0, v2

    .line 9
    .line 10
    invoke-static {p1, v5, v2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->findPreviousItemIndex(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;II)I

    .line 11
    .line 12
    .line 13
    move-result v5

    .line 14
    if-ne v5, v3, :cond_0

    .line 15
    .line 16
    aget v3, p2, v2

    .line 17
    .line 18
    aget v5, p2, p3

    .line 19
    .line 20
    if-eq v3, v5, :cond_0

    .line 21
    .line 22
    move v3, v4

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    move v3, v1

    .line 25
    :goto_1
    if-eqz v3, :cond_1

    .line 26
    .line 27
    return v4

    .line 28
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    array-length v0, p0

    .line 32
    move v2, v1

    .line 33
    :goto_2
    if-ge v2, v0, :cond_5

    .line 34
    .line 35
    aget v5, p0, v2

    .line 36
    .line 37
    invoke-static {p1, v5, v2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->findPreviousItemIndex(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;II)I

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    if-eq v5, v3, :cond_3

    .line 42
    .line 43
    aget v5, p2, v2

    .line 44
    .line 45
    aget v6, p2, p3

    .line 46
    .line 47
    if-lt v5, v6, :cond_3

    .line 48
    .line 49
    move v5, v4

    .line 50
    goto :goto_3

    .line 51
    :cond_3
    move v5, v1

    .line 52
    :goto_3
    if-eqz v5, :cond_4

    .line 53
    .line 54
    return v4

    .line 55
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_5
    invoke-virtual {p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getLaneInfo()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-virtual {p0, v1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;->getLane(I)I

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    if-eqz p0, :cond_6

    .line 67
    .line 68
    if-eq p0, v3, :cond_6

    .line 69
    .line 70
    const/4 p1, -0x2

    .line 71
    if-eq p0, p1, :cond_6

    .line 72
    .line 73
    move v1, v4

    .line 74
    :cond_6
    return v1
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
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
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

.method public static final measureStaggeredGrid-sdzDtKU(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Ljava/util/List;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;JZZJIIIILkotlinx/coroutines/s0;)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;
    .locals 19
    .param p0    # Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p15    # Lkotlinx/coroutines/s0;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/compose/foundation/ExperimentalFoundationApi;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;",
            "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;",
            "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;",
            "JZZJIIII",
            "Lkotlinx/coroutines/s0;",
            ")",
            "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    move-object/from16 v9, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v4, p3

    .line 8
    .line 9
    move-object/from16 v5, p4

    .line 10
    .line 11
    move-wide/from16 v6, p5

    .line 12
    .line 13
    move/from16 v8, p7

    .line 14
    .line 15
    move/from16 v15, p8

    .line 16
    .line 17
    move-wide/from16 v11, p9

    .line 18
    .line 19
    move/from16 v10, p11

    .line 20
    .line 21
    move/from16 v16, p12

    .line 22
    .line 23
    move/from16 v13, p13

    .line 24
    .line 25
    move/from16 v14, p14

    .line 26
    .line 27
    move-object/from16 v17, p15

    .line 28
    .line 29
    new-instance v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;

    .line 30
    .line 31
    move-object v1, v0

    .line 32
    const/16 v18, 0x0

    .line 33
    .line 34
    invoke-direct/range {v1 .. v18}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;-><init>(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Ljava/util/List;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;JZLandroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;IJIIZILkotlinx/coroutines/s0;Lkotlin/jvm/internal/w;)V

    .line 35
    .line 36
    .line 37
    new-instance v1, Lkotlin/jvm/internal/k1$h;

    .line 38
    .line 39
    invoke-direct {v1}, Lkotlin/jvm/internal/k1$h;-><init>()V

    .line 40
    .line 41
    .line 42
    new-instance v2, Lkotlin/jvm/internal/k1$h;

    .line 43
    .line 44
    invoke-direct {v2}, Lkotlin/jvm/internal/k1$h;-><init>()V

    .line 45
    .line 46
    .line 47
    sget-object v3, Landroidx/compose/runtime/snapshots/Snapshot;->Companion:Landroidx/compose/runtime/snapshots/Snapshot$Companion;

    .line 48
    .line 49
    invoke-virtual {v3}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->createNonObservableSnapshot()Landroidx/compose/runtime/snapshots/Snapshot;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    :try_start_0
    invoke-virtual {v3}, Landroidx/compose/runtime/snapshots/Snapshot;->makeCurrent()Landroidx/compose/runtime/snapshots/Snapshot;

    .line 54
    .line 55
    .line 56
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 57
    :try_start_1
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->getScrollPosition$foundation_release()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;->getIndices()[I

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    move-object/from16 v6, p1

    .line 66
    .line 67
    move-object/from16 v7, p3

    .line 68
    .line 69
    invoke-virtual {v6, v7, v5}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->updateScrollPositionIfTheFirstItemWasMoved$foundation_release(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;[I)[I

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->getScrollPosition$foundation_release()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    invoke-virtual {v7}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;->getScrollOffsets()[I

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    array-length v8, v5

    .line 82
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getLaneCount()I

    .line 83
    .line 84
    .line 85
    move-result v9

    .line 86
    const/4 v10, 0x1

    .line 87
    const/4 v11, 0x0

    .line 88
    if-ne v8, v9, :cond_0

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_0
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getLaneInfo()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;

    .line 92
    .line 93
    .line 94
    move-result-object v8

    .line 95
    invoke-virtual {v8}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;->reset()V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getLaneCount()I

    .line 99
    .line 100
    .line 101
    move-result v8

    .line 102
    new-array v9, v8, [I

    .line 103
    .line 104
    move v12, v11

    .line 105
    :goto_0
    if-ge v12, v8, :cond_3

    .line 106
    .line 107
    array-length v13, v5

    .line 108
    if-ge v12, v13, :cond_1

    .line 109
    .line 110
    aget v13, v5, v12

    .line 111
    .line 112
    const/4 v14, -0x1

    .line 113
    if-eq v13, v14, :cond_1

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_1
    if-nez v12, :cond_2

    .line 117
    .line 118
    move v13, v11

    .line 119
    goto :goto_1

    .line 120
    :cond_2
    invoke-static {v11, v12}, Landroidx/compose/foundation/lazy/staggeredgrid/SpanRange;->constructor-impl(II)J

    .line 121
    .line 122
    .line 123
    move-result-wide v13

    .line 124
    invoke-static {v9, v13, v14}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->maxInRange-jy6DScQ([IJ)I

    .line 125
    .line 126
    .line 127
    move-result v13

    .line 128
    add-int/2addr v13, v10

    .line 129
    :goto_1
    aput v13, v9, v12

    .line 130
    .line 131
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getLaneInfo()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;

    .line 132
    .line 133
    .line 134
    move-result-object v13

    .line 135
    aget v14, v9, v12

    .line 136
    .line 137
    invoke-virtual {v13, v14, v12}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;->setLane(II)V

    .line 138
    .line 139
    .line 140
    add-int/lit8 v12, v12, 0x1

    .line 141
    .line 142
    goto :goto_0

    .line 143
    :cond_3
    move-object v5, v9

    .line 144
    :goto_2
    iput-object v5, v1, Lkotlin/jvm/internal/k1$h;->element:Ljava/lang/Object;

    .line 145
    .line 146
    array-length v5, v7

    .line 147
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getLaneCount()I

    .line 148
    .line 149
    .line 150
    move-result v8

    .line 151
    if-ne v5, v8, :cond_4

    .line 152
    .line 153
    goto :goto_5

    .line 154
    :cond_4
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getLaneCount()I

    .line 155
    .line 156
    .line 157
    move-result v5

    .line 158
    new-array v8, v5, [I

    .line 159
    .line 160
    move v9, v11

    .line 161
    :goto_3
    if-ge v9, v5, :cond_7

    .line 162
    .line 163
    array-length v12, v7

    .line 164
    if-ge v9, v12, :cond_5

    .line 165
    .line 166
    aget v12, v7, v9

    .line 167
    .line 168
    goto :goto_4

    .line 169
    :cond_5
    if-nez v9, :cond_6

    .line 170
    .line 171
    move v12, v11

    .line 172
    goto :goto_4

    .line 173
    :cond_6
    add-int/lit8 v12, v9, -0x1

    .line 174
    .line 175
    aget v12, v8, v12

    .line 176
    .line 177
    :goto_4
    aput v12, v8, v9

    .line 178
    .line 179
    add-int/lit8 v9, v9, 0x1

    .line 180
    .line 181
    goto :goto_3

    .line 182
    :cond_7
    move-object v7, v8

    .line 183
    :goto_5
    iput-object v7, v2, Lkotlin/jvm/internal/k1$h;->element:Ljava/lang/Object;

    .line 184
    .line 185
    sget-object v5, Lkotlin/r2;->a:Lkotlin/r2;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 186
    .line 187
    :try_start_2
    invoke-virtual {v3, v4}, Landroidx/compose/runtime/snapshots/Snapshot;->restoreCurrent(Landroidx/compose/runtime/snapshots/Snapshot;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 188
    .line 189
    .line 190
    invoke-virtual {v3}, Landroidx/compose/runtime/snapshots/Snapshot;->dispose()V

    .line 191
    .line 192
    .line 193
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->getScrollToBeConsumed$foundation_release()F

    .line 194
    .line 195
    .line 196
    move-result v3

    .line 197
    invoke-static {v3}, Lkotlin/math/b;->L0(F)I

    .line 198
    .line 199
    .line 200
    move-result v3

    .line 201
    iget-object v1, v1, Lkotlin/jvm/internal/k1$h;->element:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast v1, [I

    .line 204
    .line 205
    iget-object v2, v2, Lkotlin/jvm/internal/k1$h;->element:Ljava/lang/Object;

    .line 206
    .line 207
    check-cast v2, [I

    .line 208
    .line 209
    invoke-static {v0, v3, v1, v2, v10}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->measure(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;I[I[IZ)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    return-object v0

    .line 214
    :catchall_0
    move-exception v0

    .line 215
    :try_start_3
    invoke-virtual {v3, v4}, Landroidx/compose/runtime/snapshots/Snapshot;->restoreCurrent(Landroidx/compose/runtime/snapshots/Snapshot;)V

    .line 216
    .line 217
    .line 218
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 219
    :catchall_1
    move-exception v0

    .line 220
    invoke-virtual {v3}, Landroidx/compose/runtime/snapshots/Snapshot;->dispose()V

    .line 221
    .line 222
    .line 223
    throw v0
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
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
.end method

.method private static final offsetBy([II)V
    .locals 3

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    if-ge v1, v0, :cond_0

    .line 4
    .line 5
    aget v2, p0, v1

    .line 6
    .line 7
    add-int/2addr v2, p1

    .line 8
    aput v2, p0, v1

    .line 9
    .line 10
    add-int/lit8 v1, v1, 0x1

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
.end method

.method private static final transform([ILv3/l;)[I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([I",
            "Lv3/l<",
            "-",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;)[I"
        }
    .end annotation

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    if-ge v1, v0, :cond_0

    .line 4
    .line 5
    aget v2, p0, v1

    .line 6
    .line 7
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-interface {p1, v2}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    check-cast v2, Ljava/lang/Number;

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    aput v2, p0, v1

    .line 22
    .line 23
    add-int/lit8 v1, v1, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-object p0
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
.end method

.method private static final withDebugLogging(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Lv3/l;)Ljava/lang/Object;
    .locals 0
    .annotation build Landroidx/compose/foundation/ExperimentalFoundationApi;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;",
            "Lv3/l<",
            "-",
            "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;",
            "+TT;>;)TT;"
        }
    .end annotation

    invoke-interface {p1, p0}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
