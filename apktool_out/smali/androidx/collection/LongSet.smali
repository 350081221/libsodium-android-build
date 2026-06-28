.class public abstract Landroidx/collection/LongSet;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\r\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\t\n\u0002\u0010\u0016\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001B\t\u0008\u0004\u00a2\u0006\u0004\u00086\u0010+J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\t\u0010\u0008\u001a\u00020\u0007H\u0086\u0008J:\u0010\u0008\u001a\u00020\u00072!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\u000c\u0008\n\u0012\u0008\u0008\u000b\u0012\u0004\u0008\u0008(\u000c\u0012\u0004\u0012\u00020\u00020\tH\u0086\u0008\u00f8\u0001\u0000\u0082\u0002\u0008\n\u0006\u0008\u0001\u0012\u0002\u0010\u0001J:\u0010\u0012\u001a\u00020\u00102!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u000e\u00a2\u0006\u000c\u0008\n\u0012\u0008\u0008\u000b\u0012\u0004\u0008\u0008(\u000f\u0012\u0004\u0012\u00020\u00100\tH\u0081\u0008\u00f8\u0001\u0000\u0082\u0002\u0008\n\u0006\u0008\u0001\u0012\u0002\u0010\u0001J:\u0010\u0013\u001a\u00020\u00102!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\u000c\u0008\n\u0012\u0008\u0008\u000b\u0012\u0004\u0008\u0008(\u000c\u0012\u0004\u0012\u00020\u00100\tH\u0086\u0008\u00f8\u0001\u0000\u0082\u0002\u0008\n\u0006\u0008\u0001\u0012\u0002\u0010\u0001J:\u0010\u0014\u001a\u00020\u00022!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\u000c\u0008\n\u0012\u0008\u0008\u000b\u0012\u0004\u0008\u0008(\u000c\u0012\u0004\u0012\u00020\u00020\tH\u0086\u0008\u00f8\u0001\u0000\u0082\u0002\u0008\n\u0006\u0008\u0001\u0012\u0002\u0010\u0001J:\u0010\u0003\u001a\u00020\u00022!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\u000c\u0008\n\u0012\u0008\u0008\u000b\u0012\u0004\u0008\u0008(\u000c\u0012\u0004\u0012\u00020\u00020\tH\u0086\u0008\u00f8\u0001\u0000\u0082\u0002\u0008\n\u0006\u0008\u0001\u0012\u0002\u0010\u0001J\u0008\u0010\u0015\u001a\u00020\u000eH\u0007J:\u0010\u0015\u001a\u00020\u000e2!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\u000c\u0008\n\u0012\u0008\u0008\u000b\u0012\u0004\u0008\u0008(\u000c\u0012\u0004\u0012\u00020\u00020\tH\u0087\u0008\u00f8\u0001\u0000\u0082\u0002\u0008\n\u0006\u0008\u0001\u0012\u0002\u0010\u0001J\u0011\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u0007H\u0086\u0002J:\u0010\u001e\u001a\u00020\u001d2\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00172\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u00172\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u00172\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u0017H\u0007JT\u0010\u001e\u001a\u00020\u001d2\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00172\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u00172\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u00172\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u00172\u0014\u0008\u0004\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00170\tH\u0087\u0008\u00f8\u0001\u0000J\u0008\u0010 \u001a\u00020\u000eH\u0016J\u0013\u0010\"\u001a\u00020\u00022\u0008\u0010!\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0008\u0010#\u001a\u00020\u001dH\u0016J\u0018\u0010&\u001a\u00020\u000e2\u0006\u0010\u000c\u001a\u00020\u0007H\u0080\u0008\u00a2\u0006\u0004\u0008$\u0010%R\u001c\u0010(\u001a\u00020\'8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u000c\n\u0004\u0008(\u0010)\u0012\u0004\u0008*\u0010+R\u001c\u0010,\u001a\u00020\'8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u000c\n\u0004\u0008,\u0010)\u0012\u0004\u0008-\u0010+R\u0016\u0010.\u001a\u00020\u000e8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0006\n\u0004\u0008.\u0010/R\u0016\u00100\u001a\u00020\u000e8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0006\n\u0004\u00080\u0010/R\u0011\u00103\u001a\u00020\u000e8G\u00a2\u0006\u0006\u001a\u0004\u00081\u00102R\u0011\u00105\u001a\u00020\u000e8G\u00a2\u0006\u0006\u001a\u0004\u00084\u00102\u0082\u0001\u00017\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u00068"
    }
    d2 = {
        "Landroidx/collection/LongSet;",
        "",
        "",
        "any",
        "none",
        "isEmpty",
        "isNotEmpty",
        "",
        "first",
        "Lkotlin/Function1;",
        "Lkotlin/v0;",
        "name",
        "element",
        "predicate",
        "",
        "index",
        "Lkotlin/r2;",
        "block",
        "forEachIndex",
        "forEach",
        "all",
        "count",
        "contains",
        "",
        "separator",
        "prefix",
        "postfix",
        "limit",
        "truncated",
        "",
        "joinToString",
        "transform",
        "hashCode",
        "other",
        "equals",
        "toString",
        "findElementIndex$collection",
        "(J)I",
        "findElementIndex",
        "",
        "metadata",
        "[J",
        "getMetadata$annotations",
        "()V",
        "elements",
        "getElements$annotations",
        "_capacity",
        "I",
        "_size",
        "getCapacity",
        "()I",
        "capacity",
        "getSize",
        "size",
        "<init>",
        "Landroidx/collection/MutableLongSet;",
        "collection"
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
        "SMAP\nLongSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongSet.kt\nandroidx/collection/LongSet\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 3 LongSet.kt\nandroidx/collection/LongSetKt\n*L\n1#1,837:1\n262#1,4:838\n232#1,7:842\n243#1,3:850\n246#1,2:854\n266#1,2:856\n249#1,6:858\n268#1:864\n262#1,4:865\n232#1,7:869\n243#1,3:877\n246#1,2:881\n266#1,2:883\n249#1,6:885\n268#1:891\n232#1,7:894\n243#1,3:902\n246#1,9:906\n262#1,4:915\n232#1,7:919\n243#1,3:927\n246#1,2:931\n266#1,2:933\n249#1,6:935\n268#1:941\n262#1,4:942\n232#1,7:946\n243#1,3:954\n246#1,2:958\n266#1,2:960\n249#1,6:962\n268#1:968\n262#1,4:969\n232#1,7:973\n243#1,3:981\n246#1,2:985\n266#1,2:987\n249#1,6:989\n268#1:995\n442#1:996\n443#1:1000\n445#1,2:1002\n447#1,3:1005\n450#1:1011\n451#1:1015\n452#1:1017\n453#1,4:1020\n459#1:1025\n460#1,8:1027\n262#1,4:1035\n232#1,7:1039\n243#1,3:1047\n246#1,2:1051\n266#1,2:1053\n249#1,6:1055\n268#1:1061\n262#1,4:1062\n232#1,7:1066\n243#1,3:1074\n246#1,2:1078\n266#1,2:1080\n249#1,6:1082\n268#1:1088\n262#1,4:1089\n232#1,7:1093\n243#1,3:1101\n246#1,2:1105\n266#1,2:1107\n249#1,6:1109\n268#1:1115\n262#1,4:1116\n232#1,7:1120\n243#1,3:1128\n246#1,2:1132\n266#1,2:1134\n249#1,6:1136\n268#1:1142\n262#1,4:1143\n232#1,7:1147\n243#1,3:1155\n246#1,2:1159\n266#1,2:1161\n249#1,6:1163\n268#1:1169\n365#1,11:1186\n262#1,4:1197\n232#1,7:1201\n243#1,3:1209\n246#1,2:1213\n266#1:1215\n376#1,10:1216\n267#1:1226\n249#1,6:1227\n268#1:1233\n386#1,2:1234\n365#1,11:1236\n262#1,4:1247\n232#1,7:1251\n243#1,3:1259\n246#1,2:1263\n266#1:1265\n376#1,10:1266\n267#1:1276\n249#1,6:1277\n268#1:1283\n386#1,2:1284\n365#1,11:1286\n262#1,4:1297\n232#1,7:1301\n243#1,3:1309\n246#1,2:1313\n266#1:1315\n376#1,10:1316\n267#1:1326\n249#1,6:1327\n268#1:1333\n386#1,2:1334\n365#1,11:1336\n262#1,4:1347\n232#1,7:1351\n243#1,3:1359\n246#1,2:1363\n266#1:1365\n376#1,10:1366\n267#1:1376\n249#1,6:1377\n268#1:1383\n386#1,2:1384\n365#1,11:1386\n262#1,4:1397\n232#1,7:1401\n243#1,3:1409\n246#1,2:1413\n266#1:1415\n376#1,10:1416\n267#1:1426\n249#1,6:1427\n268#1:1433\n386#1,2:1434\n1810#2:849\n1672#2:853\n1810#2:876\n1672#2:880\n1810#2:892\n1672#2:893\n1810#2:901\n1672#2:905\n1810#2:926\n1672#2:930\n1810#2:953\n1672#2:957\n1810#2:980\n1672#2:984\n1603#2:1001\n1599#2:1004\n1779#2,3:1008\n1793#2,3:1012\n1717#2:1016\n1705#2:1018\n1699#2:1019\n1712#2:1024\n1802#2:1026\n1810#2:1046\n1672#2:1050\n1810#2:1073\n1672#2:1077\n1810#2:1100\n1672#2:1104\n1810#2:1127\n1672#2:1131\n1810#2:1154\n1672#2:1158\n1603#2:1173\n1599#2:1174\n1779#2,3:1175\n1793#2,3:1178\n1717#2:1181\n1705#2:1182\n1699#2:1183\n1712#2:1184\n1802#2:1185\n1810#2:1208\n1672#2:1212\n1810#2:1258\n1672#2:1262\n1810#2:1308\n1672#2:1312\n1810#2:1358\n1672#2:1362\n1810#2:1408\n1672#2:1412\n833#3,3:997\n833#3,3:1170\n*S KotlinDebug\n*F\n+ 1 LongSet.kt\nandroidx/collection/LongSet\n*L\n203#1:838,4\n203#1:842,7\n203#1:850,3\n203#1:854,2\n203#1:856,2\n203#1:858,6\n203#1:864\n222#1:865,4\n222#1:869,7\n222#1:877,3\n222#1:881,2\n222#1:883,2\n222#1:885,6\n222#1:891\n265#1:894,7\n265#1:902,3\n265#1:906,9\n277#1:915,4\n277#1:919,7\n277#1:927,3\n277#1:931,2\n277#1:933,2\n277#1:935,6\n277#1:941\n290#1:942,4\n290#1:946,7\n290#1:954,3\n290#1:958,2\n290#1:960,2\n290#1:962,6\n290#1:968\n311#1:969,4\n311#1:973,7\n311#1:981,3\n311#1:985,2\n311#1:987,2\n311#1:989,6\n311#1:995\n322#1:996\n322#1:1000\n322#1:1002,2\n322#1:1005,3\n322#1:1011\n322#1:1015\n322#1:1017\n322#1:1020,4\n322#1:1025\n322#1:1027,8\n342#1:1035,4\n342#1:1039,7\n342#1:1047,3\n342#1:1051,2\n342#1:1053,2\n342#1:1055,6\n342#1:1061\n375#1:1062,4\n375#1:1066,7\n375#1:1074,3\n375#1:1078,2\n375#1:1080,2\n375#1:1082,6\n375#1:1088\n375#1:1089,4\n375#1:1093,7\n375#1:1101,3\n375#1:1105,2\n375#1:1107,2\n375#1:1109,6\n375#1:1115\n396#1:1116,4\n396#1:1120,7\n396#1:1128,3\n396#1:1132,2\n396#1:1134,2\n396#1:1136,6\n396#1:1142\n422#1:1143,4\n422#1:1147,7\n422#1:1155,3\n422#1:1159,2\n422#1:1161,2\n422#1:1163,6\n422#1:1169\n-1#1:1186,11\n-1#1:1197,4\n-1#1:1201,7\n-1#1:1209,3\n-1#1:1213,2\n-1#1:1215\n-1#1:1216,10\n-1#1:1226\n-1#1:1227,6\n-1#1:1233\n-1#1:1234,2\n-1#1:1236,11\n-1#1:1247,4\n-1#1:1251,7\n-1#1:1259,3\n-1#1:1263,2\n-1#1:1265\n-1#1:1266,10\n-1#1:1276\n-1#1:1277,6\n-1#1:1283\n-1#1:1284,2\n-1#1:1286,11\n-1#1:1297,4\n-1#1:1301,7\n-1#1:1309,3\n-1#1:1313,2\n-1#1:1315\n-1#1:1316,10\n-1#1:1326\n-1#1:1327,6\n-1#1:1333\n-1#1:1334,2\n-1#1:1336,11\n-1#1:1347,4\n-1#1:1351,7\n-1#1:1359,3\n-1#1:1363,2\n-1#1:1365\n-1#1:1366,10\n-1#1:1376\n-1#1:1377,6\n-1#1:1383\n-1#1:1384,2\n-1#1:1386,11\n-1#1:1397,4\n-1#1:1401,7\n-1#1:1409,3\n-1#1:1413,2\n-1#1:1415\n-1#1:1416,10\n-1#1:1426\n-1#1:1427,6\n-1#1:1433\n-1#1:1434,2\n203#1:849\n203#1:853\n222#1:876\n222#1:880\n238#1:892\n245#1:893\n265#1:901\n265#1:905\n277#1:926\n277#1:930\n290#1:953\n290#1:957\n311#1:980\n311#1:984\n322#1:1001\n322#1:1004\n322#1:1008,3\n322#1:1012,3\n322#1:1016\n322#1:1018\n322#1:1019\n322#1:1024\n322#1:1026\n342#1:1046\n342#1:1050\n375#1:1073\n375#1:1077\n375#1:1100\n375#1:1104\n396#1:1127\n396#1:1131\n422#1:1154\n422#1:1158\n443#1:1173\n446#1:1174\n449#1:1175,3\n450#1:1178,3\n451#1:1181\n452#1:1182\n452#1:1183\n456#1:1184\n459#1:1185\n-1#1:1208\n-1#1:1212\n-1#1:1258\n-1#1:1262\n-1#1:1308\n-1#1:1312\n-1#1:1358\n-1#1:1362\n-1#1:1408\n-1#1:1412\n322#1:997,3\n442#1:1170,3\n*E\n"
    }
.end annotation


# instance fields
.field public _capacity:I
    .annotation build Lu3/e;
    .end annotation
.end field

.field public _size:I
    .annotation build Lu3/e;
    .end annotation
.end field

.field public elements:[J
    .annotation build Lp4/l;
    .end annotation

    .annotation build Lu3/e;
    .end annotation
.end field

.field public metadata:[J
    .annotation build Lp4/l;
    .end annotation

    .annotation build Lu3/e;
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Landroidx/collection/ScatterMapKt;->EmptyGroup:[J

    .line 5
    .line 6
    iput-object v0, p0, Landroidx/collection/LongSet;->metadata:[J

    .line 7
    .line 8
    invoke-static {}, Landroidx/collection/LongSetKt;->getEmptyLongArray()[J

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, Landroidx/collection/LongSet;->elements:[J

    .line 13
    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/w;)V
    .locals 0

    invoke-direct {p0}, Landroidx/collection/LongSet;-><init>()V

    return-void
.end method

.method public static synthetic getElements$annotations()V
    .locals 0
    .annotation build Lkotlin/a1;
    .end annotation

    return-void
.end method

.method public static synthetic getMetadata$annotations()V
    .locals 0
    .annotation build Lkotlin/a1;
    .end annotation

    return-void
.end method

.method public static synthetic joinToString$default(Landroidx/collection/LongSet;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;ILjava/lang/Object;)Ljava/lang/String;
    .locals 3

    if-nez p7, :cond_5

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    const-string p1, ", "

    :cond_0
    and-int/lit8 p7, p6, 0x2

    const-string v0, ""

    if-eqz p7, :cond_1

    move-object p7, v0

    goto :goto_0

    :cond_1
    move-object p7, p2

    :goto_0
    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    goto :goto_1

    :cond_2
    move-object v0, p3

    :goto_1
    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    const/4 p4, -0x1

    :cond_3
    move v1, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    const-string p5, "..."

    :cond_4
    move-object v2, p5

    move-object p2, p0

    move-object p3, p1

    move-object p4, p7

    move-object p5, v0

    move p6, v1

    move-object p7, v2

    .line 1
    invoke-virtual/range {p2 .. p7}, Landroidx/collection/LongSet;->joinToString(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_5
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: joinToString"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic joinToString$default(Landroidx/collection/LongSet;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lv3/l;ILjava/lang/Object;)Ljava/lang/String;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p6

    if-nez p8, :cond_c

    and-int/lit8 v2, p7, 0x1

    if-eqz v2, :cond_0

    const-string v2, ", "

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, p7, 0x2

    const-string v4, ""

    if-eqz v3, :cond_1

    move-object v3, v4

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v5, p7, 0x4

    if-eqz v5, :cond_2

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, p7, 0x8

    if-eqz v5, :cond_3

    const/4 v5, -0x1

    goto :goto_3

    :cond_3
    move/from16 v5, p4

    :goto_3
    and-int/lit8 v6, p7, 0x10

    if-eqz v6, :cond_4

    const-string v6, "..."

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    const-string v7, "separator"

    .line 2
    invoke-static {v2, v7}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "prefix"

    invoke-static {v3, v7}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "postfix"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v7, "truncated"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v7, "transform"

    invoke-static {v1, v7}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 5
    iget-object v3, v0, Landroidx/collection/LongSet;->elements:[J

    .line 6
    iget-object v0, v0, Landroidx/collection/LongSet;->metadata:[J

    .line 7
    array-length v8, v0

    add-int/lit8 v8, v8, -0x2

    if-ltz v8, :cond_b

    const/4 v10, 0x0

    const/4 v11, 0x0

    .line 8
    :goto_5
    aget-wide v12, v0, v10

    not-long v14, v12

    const/16 v16, 0x7

    shl-long v14, v14, v16

    and-long/2addr v14, v12

    const-wide v16, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v14, v14, v16

    cmp-long v14, v14, v16

    if-eqz v14, :cond_a

    sub-int v14, v10, v8

    not-int v14, v14

    ushr-int/lit8 v14, v14, 0x1f

    const/16 v15, 0x8

    rsub-int/lit8 v14, v14, 0x8

    const/4 v9, 0x0

    :goto_6
    if-ge v9, v14, :cond_9

    const-wide/16 v16, 0xff

    and-long v16, v12, v16

    const-wide/16 v18, 0x80

    cmp-long v16, v16, v18

    if-gez v16, :cond_5

    const/16 v16, 0x1

    goto :goto_7

    :cond_5
    const/16 v16, 0x0

    :goto_7
    if-eqz v16, :cond_8

    shl-int/lit8 v16, v10, 0x3

    add-int v16, v16, v9

    .line 9
    aget-wide v16, v3, v16

    if-ne v11, v5, :cond_6

    .line 10
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    goto :goto_8

    :cond_6
    if-eqz v11, :cond_7

    .line 11
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 12
    :cond_7
    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v15

    invoke-interface {v1, v15}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/CharSequence;

    invoke-virtual {v7, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    add-int/lit8 v11, v11, 0x1

    const/16 v15, 0x8

    :cond_8
    shr-long/2addr v12, v15

    add-int/lit8 v9, v9, 0x1

    goto :goto_6

    :cond_9
    if-ne v14, v15, :cond_b

    :cond_a
    if-eq v10, v8, :cond_b

    add-int/lit8 v10, v10, 0x1

    goto :goto_5

    .line 13
    :cond_b
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 14
    :goto_8
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "StringBuilder().apply(builderAction).toString()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    .line 15
    :cond_c
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Super calls with default arguments not supported in this target, function: joinToString"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final all(Lv3/l;)Z
    .locals 17
    .param p1    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/l<",
            "-",
            "Ljava/lang/Long;",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "predicate"

    .line 6
    .line 7
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v2, v0, Landroidx/collection/LongSet;->elements:[J

    .line 11
    .line 12
    iget-object v3, v0, Landroidx/collection/LongSet;->metadata:[J

    .line 13
    .line 14
    array-length v4, v3

    .line 15
    add-int/lit8 v4, v4, -0x2

    .line 16
    .line 17
    const/4 v5, 0x1

    .line 18
    if-ltz v4, :cond_4

    .line 19
    .line 20
    const/4 v6, 0x0

    .line 21
    move v7, v6

    .line 22
    :goto_0
    aget-wide v8, v3, v7

    .line 23
    .line 24
    not-long v10, v8

    .line 25
    const/4 v12, 0x7

    .line 26
    shl-long/2addr v10, v12

    .line 27
    and-long/2addr v10, v8

    .line 28
    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    and-long/2addr v10, v12

    .line 34
    cmp-long v10, v10, v12

    .line 35
    .line 36
    if-eqz v10, :cond_3

    .line 37
    .line 38
    sub-int v10, v7, v4

    .line 39
    .line 40
    not-int v10, v10

    .line 41
    ushr-int/lit8 v10, v10, 0x1f

    .line 42
    .line 43
    const/16 v11, 0x8

    .line 44
    .line 45
    rsub-int/lit8 v10, v10, 0x8

    .line 46
    .line 47
    move v12, v6

    .line 48
    :goto_1
    if-ge v12, v10, :cond_2

    .line 49
    .line 50
    const-wide/16 v13, 0xff

    .line 51
    .line 52
    and-long/2addr v13, v8

    .line 53
    const-wide/16 v15, 0x80

    .line 54
    .line 55
    cmp-long v13, v13, v15

    .line 56
    .line 57
    if-gez v13, :cond_0

    .line 58
    .line 59
    move v13, v5

    .line 60
    goto :goto_2

    .line 61
    :cond_0
    move v13, v6

    .line 62
    :goto_2
    if-eqz v13, :cond_1

    .line 63
    .line 64
    shl-int/lit8 v13, v7, 0x3

    .line 65
    .line 66
    add-int/2addr v13, v12

    .line 67
    aget-wide v13, v2, v13

    .line 68
    .line 69
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 70
    .line 71
    .line 72
    move-result-object v13

    .line 73
    invoke-interface {v1, v13}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v13

    .line 77
    check-cast v13, Ljava/lang/Boolean;

    .line 78
    .line 79
    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    .line 80
    .line 81
    .line 82
    move-result v13

    .line 83
    if-nez v13, :cond_1

    .line 84
    .line 85
    return v6

    .line 86
    :cond_1
    shr-long/2addr v8, v11

    .line 87
    add-int/lit8 v12, v12, 0x1

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_2
    if-ne v10, v11, :cond_4

    .line 91
    .line 92
    :cond_3
    if-eq v7, v4, :cond_4

    .line 93
    .line 94
    add-int/lit8 v7, v7, 0x1

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_4
    return v5
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

.method public final any()Z
    .locals 1

    .line 1
    iget v0, p0, Landroidx/collection/LongSet;->_size:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final any(Lv3/l;)Z
    .locals 14
    .param p1    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/l<",
            "-",
            "Ljava/lang/Long;",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "predicate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Landroidx/collection/LongSet;->elements:[J

    .line 3
    iget-object v1, p0, Landroidx/collection/LongSet;->metadata:[J

    .line 4
    array-length v2, v1

    add-int/lit8 v2, v2, -0x2

    const/4 v3, 0x0

    if-ltz v2, :cond_4

    move v4, v3

    .line 5
    :goto_0
    aget-wide v5, v1, v4

    not-long v7, v5

    const/4 v9, 0x7

    shl-long/2addr v7, v9

    and-long/2addr v7, v5

    const-wide v9, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v7, v9

    cmp-long v7, v7, v9

    if-eqz v7, :cond_3

    sub-int v7, v4, v2

    not-int v7, v7

    ushr-int/lit8 v7, v7, 0x1f

    const/16 v8, 0x8

    rsub-int/lit8 v7, v7, 0x8

    move v9, v3

    :goto_1
    if-ge v9, v7, :cond_2

    const-wide/16 v10, 0xff

    and-long/2addr v10, v5

    const-wide/16 v12, 0x80

    cmp-long v10, v10, v12

    const/4 v11, 0x1

    if-gez v10, :cond_0

    move v10, v11

    goto :goto_2

    :cond_0
    move v10, v3

    :goto_2
    if-eqz v10, :cond_1

    shl-int/lit8 v10, v4, 0x3

    add-int/2addr v10, v9

    .line 6
    aget-wide v12, v0, v10

    .line 7
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    invoke-interface {p1, v10}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Boolean;

    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v10

    if-eqz v10, :cond_1

    return v11

    :cond_1
    shr-long/2addr v5, v8

    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_2
    if-ne v7, v8, :cond_4

    :cond_3
    if-eq v4, v2, :cond_4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_4
    return v3
.end method

.method public final contains(J)Z
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static/range {p1 .. p2}, Ljava/lang/Long;->hashCode(J)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const v2, -0x3361d2af    # -8.2930312E7f

    .line 8
    .line 9
    .line 10
    mul-int/2addr v1, v2

    .line 11
    shl-int/lit8 v2, v1, 0x10

    .line 12
    .line 13
    xor-int/2addr v1, v2

    .line 14
    and-int/lit8 v2, v1, 0x7f

    .line 15
    .line 16
    iget v3, v0, Landroidx/collection/LongSet;->_capacity:I

    .line 17
    .line 18
    ushr-int/lit8 v1, v1, 0x7

    .line 19
    .line 20
    and-int/2addr v1, v3

    .line 21
    const/4 v4, 0x0

    .line 22
    move v5, v4

    .line 23
    :goto_0
    iget-object v6, v0, Landroidx/collection/LongSet;->metadata:[J

    .line 24
    .line 25
    shr-int/lit8 v7, v1, 0x3

    .line 26
    .line 27
    and-int/lit8 v8, v1, 0x7

    .line 28
    .line 29
    shl-int/lit8 v8, v8, 0x3

    .line 30
    .line 31
    aget-wide v9, v6, v7

    .line 32
    .line 33
    ushr-long/2addr v9, v8

    .line 34
    const/4 v11, 0x1

    .line 35
    add-int/2addr v7, v11

    .line 36
    aget-wide v12, v6, v7

    .line 37
    .line 38
    rsub-int/lit8 v6, v8, 0x40

    .line 39
    .line 40
    shl-long v6, v12, v6

    .line 41
    .line 42
    int-to-long v12, v8

    .line 43
    neg-long v12, v12

    .line 44
    const/16 v8, 0x3f

    .line 45
    .line 46
    shr-long/2addr v12, v8

    .line 47
    and-long/2addr v6, v12

    .line 48
    or-long/2addr v6, v9

    .line 49
    int-to-long v8, v2

    .line 50
    const-wide v12, 0x101010101010101L

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    mul-long/2addr v8, v12

    .line 56
    xor-long/2addr v8, v6

    .line 57
    sub-long v12, v8, v12

    .line 58
    .line 59
    not-long v8, v8

    .line 60
    and-long/2addr v8, v12

    .line 61
    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    and-long/2addr v8, v12

    .line 67
    :goto_1
    const-wide/16 v14, 0x0

    .line 68
    .line 69
    cmp-long v10, v8, v14

    .line 70
    .line 71
    if-eqz v10, :cond_0

    .line 72
    .line 73
    move v10, v11

    .line 74
    goto :goto_2

    .line 75
    :cond_0
    move v10, v4

    .line 76
    :goto_2
    if-eqz v10, :cond_2

    .line 77
    .line 78
    invoke-static {v8, v9}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 79
    .line 80
    .line 81
    move-result v10

    .line 82
    shr-int/lit8 v10, v10, 0x3

    .line 83
    .line 84
    add-int/2addr v10, v1

    .line 85
    and-int/2addr v10, v3

    .line 86
    iget-object v14, v0, Landroidx/collection/LongSet;->elements:[J

    .line 87
    .line 88
    aget-wide v15, v14, v10

    .line 89
    .line 90
    cmp-long v14, v15, p1

    .line 91
    .line 92
    if-nez v14, :cond_1

    .line 93
    .line 94
    goto :goto_3

    .line 95
    :cond_1
    const-wide/16 v14, 0x1

    .line 96
    .line 97
    sub-long v14, v8, v14

    .line 98
    .line 99
    and-long/2addr v8, v14

    .line 100
    goto :goto_1

    .line 101
    :cond_2
    not-long v8, v6

    .line 102
    const/4 v10, 0x6

    .line 103
    shl-long/2addr v8, v10

    .line 104
    and-long/2addr v6, v8

    .line 105
    and-long/2addr v6, v12

    .line 106
    cmp-long v6, v6, v14

    .line 107
    .line 108
    if-eqz v6, :cond_4

    .line 109
    .line 110
    const/4 v10, -0x1

    .line 111
    :goto_3
    if-ltz v10, :cond_3

    .line 112
    .line 113
    move v4, v11

    .line 114
    :cond_3
    return v4

    .line 115
    :cond_4
    add-int/lit8 v5, v5, 0x8

    .line 116
    .line 117
    add-int/2addr v1, v5

    .line 118
    and-int/2addr v1, v3

    .line 119
    goto :goto_0
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
.end method

.method public final count()I
    .locals 1
    .annotation build Landroidx/annotation/IntRange;
        from = 0x0L
    .end annotation

    .line 1
    iget v0, p0, Landroidx/collection/LongSet;->_size:I

    return v0
.end method

.method public final count(Lv3/l;)I
    .locals 17
    .param p1    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/IntRange;
        from = 0x0L
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/l<",
            "-",
            "Ljava/lang/Long;",
            "Ljava/lang/Boolean;",
            ">;)I"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "predicate"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v2, v0, Landroidx/collection/LongSet;->elements:[J

    .line 3
    iget-object v3, v0, Landroidx/collection/LongSet;->metadata:[J

    .line 4
    array-length v4, v3

    add-int/lit8 v4, v4, -0x2

    const/4 v5, 0x0

    if-ltz v4, :cond_5

    move v6, v5

    move v7, v6

    .line 5
    :goto_0
    aget-wide v8, v3, v6

    not-long v10, v8

    const/4 v12, 0x7

    shl-long/2addr v10, v12

    and-long/2addr v10, v8

    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v10, v12

    cmp-long v10, v10, v12

    if-eqz v10, :cond_3

    sub-int v10, v6, v4

    not-int v10, v10

    ushr-int/lit8 v10, v10, 0x1f

    const/16 v11, 0x8

    rsub-int/lit8 v10, v10, 0x8

    move v12, v5

    :goto_1
    if-ge v12, v10, :cond_2

    const-wide/16 v13, 0xff

    and-long/2addr v13, v8

    const-wide/16 v15, 0x80

    cmp-long v13, v13, v15

    if-gez v13, :cond_0

    const/4 v13, 0x1

    goto :goto_2

    :cond_0
    move v13, v5

    :goto_2
    if-eqz v13, :cond_1

    shl-int/lit8 v13, v6, 0x3

    add-int/2addr v13, v12

    .line 6
    aget-wide v13, v2, v13

    .line 7
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v13

    invoke-interface {v1, v13}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Boolean;

    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v13

    if-eqz v13, :cond_1

    add-int/lit8 v7, v7, 0x1

    :cond_1
    shr-long/2addr v8, v11

    add-int/lit8 v12, v12, 0x1

    goto :goto_1

    :cond_2
    if-ne v10, v11, :cond_6

    :cond_3
    if-eq v6, v4, :cond_4

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_4
    move v5, v7

    :cond_5
    move v7, v5

    :cond_6
    return v7
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 17
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-ne v1, v0, :cond_0

    .line 7
    .line 8
    return v2

    .line 9
    :cond_0
    instance-of v3, v1, Landroidx/collection/LongSet;

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    if-nez v3, :cond_1

    .line 13
    .line 14
    return v4

    .line 15
    :cond_1
    check-cast v1, Landroidx/collection/LongSet;

    .line 16
    .line 17
    iget v3, v1, Landroidx/collection/LongSet;->_size:I

    .line 18
    .line 19
    iget v5, v0, Landroidx/collection/LongSet;->_size:I

    .line 20
    .line 21
    if-eq v3, v5, :cond_2

    .line 22
    .line 23
    return v4

    .line 24
    :cond_2
    iget-object v3, v0, Landroidx/collection/LongSet;->elements:[J

    .line 25
    .line 26
    iget-object v5, v0, Landroidx/collection/LongSet;->metadata:[J

    .line 27
    .line 28
    array-length v6, v5

    .line 29
    add-int/lit8 v6, v6, -0x2

    .line 30
    .line 31
    if-ltz v6, :cond_7

    .line 32
    .line 33
    move v7, v4

    .line 34
    :goto_0
    aget-wide v8, v5, v7

    .line 35
    .line 36
    not-long v10, v8

    .line 37
    const/4 v12, 0x7

    .line 38
    shl-long/2addr v10, v12

    .line 39
    and-long/2addr v10, v8

    .line 40
    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    and-long/2addr v10, v12

    .line 46
    cmp-long v10, v10, v12

    .line 47
    .line 48
    if-eqz v10, :cond_6

    .line 49
    .line 50
    sub-int v10, v7, v6

    .line 51
    .line 52
    not-int v10, v10

    .line 53
    ushr-int/lit8 v10, v10, 0x1f

    .line 54
    .line 55
    const/16 v11, 0x8

    .line 56
    .line 57
    rsub-int/lit8 v10, v10, 0x8

    .line 58
    .line 59
    move v12, v4

    .line 60
    :goto_1
    if-ge v12, v10, :cond_5

    .line 61
    .line 62
    const-wide/16 v13, 0xff

    .line 63
    .line 64
    and-long/2addr v13, v8

    .line 65
    const-wide/16 v15, 0x80

    .line 66
    .line 67
    cmp-long v13, v13, v15

    .line 68
    .line 69
    if-gez v13, :cond_3

    .line 70
    .line 71
    move v13, v2

    .line 72
    goto :goto_2

    .line 73
    :cond_3
    move v13, v4

    .line 74
    :goto_2
    if-eqz v13, :cond_4

    .line 75
    .line 76
    shl-int/lit8 v13, v7, 0x3

    .line 77
    .line 78
    add-int/2addr v13, v12

    .line 79
    aget-wide v13, v3, v13

    .line 80
    .line 81
    invoke-virtual {v1, v13, v14}, Landroidx/collection/LongSet;->contains(J)Z

    .line 82
    .line 83
    .line 84
    move-result v13

    .line 85
    if-nez v13, :cond_4

    .line 86
    .line 87
    return v4

    .line 88
    :cond_4
    shr-long/2addr v8, v11

    .line 89
    add-int/lit8 v12, v12, 0x1

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_5
    if-ne v10, v11, :cond_7

    .line 93
    .line 94
    :cond_6
    if-eq v7, v6, :cond_7

    .line 95
    .line 96
    add-int/lit8 v7, v7, 0x1

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_7
    return v2
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method

.method public final findElementIndex$collection(J)I
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static/range {p1 .. p2}, Ljava/lang/Long;->hashCode(J)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const v2, -0x3361d2af    # -8.2930312E7f

    .line 8
    .line 9
    .line 10
    mul-int/2addr v1, v2

    .line 11
    shl-int/lit8 v2, v1, 0x10

    .line 12
    .line 13
    xor-int/2addr v1, v2

    .line 14
    and-int/lit8 v2, v1, 0x7f

    .line 15
    .line 16
    iget v3, v0, Landroidx/collection/LongSet;->_capacity:I

    .line 17
    .line 18
    ushr-int/lit8 v1, v1, 0x7

    .line 19
    .line 20
    and-int/2addr v1, v3

    .line 21
    const/4 v4, 0x0

    .line 22
    move v5, v4

    .line 23
    :goto_0
    iget-object v6, v0, Landroidx/collection/LongSet;->metadata:[J

    .line 24
    .line 25
    shr-int/lit8 v7, v1, 0x3

    .line 26
    .line 27
    and-int/lit8 v8, v1, 0x7

    .line 28
    .line 29
    shl-int/lit8 v8, v8, 0x3

    .line 30
    .line 31
    aget-wide v9, v6, v7

    .line 32
    .line 33
    ushr-long/2addr v9, v8

    .line 34
    const/4 v11, 0x1

    .line 35
    add-int/2addr v7, v11

    .line 36
    aget-wide v12, v6, v7

    .line 37
    .line 38
    rsub-int/lit8 v6, v8, 0x40

    .line 39
    .line 40
    shl-long v6, v12, v6

    .line 41
    .line 42
    int-to-long v12, v8

    .line 43
    neg-long v12, v12

    .line 44
    const/16 v8, 0x3f

    .line 45
    .line 46
    shr-long/2addr v12, v8

    .line 47
    and-long/2addr v6, v12

    .line 48
    or-long/2addr v6, v9

    .line 49
    int-to-long v8, v2

    .line 50
    const-wide v12, 0x101010101010101L

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    mul-long/2addr v8, v12

    .line 56
    xor-long/2addr v8, v6

    .line 57
    sub-long v12, v8, v12

    .line 58
    .line 59
    not-long v8, v8

    .line 60
    and-long/2addr v8, v12

    .line 61
    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    and-long/2addr v8, v12

    .line 67
    :goto_1
    const-wide/16 v14, 0x0

    .line 68
    .line 69
    cmp-long v10, v8, v14

    .line 70
    .line 71
    if-eqz v10, :cond_0

    .line 72
    .line 73
    move v10, v11

    .line 74
    goto :goto_2

    .line 75
    :cond_0
    move v10, v4

    .line 76
    :goto_2
    if-eqz v10, :cond_2

    .line 77
    .line 78
    invoke-static {v8, v9}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 79
    .line 80
    .line 81
    move-result v10

    .line 82
    shr-int/lit8 v10, v10, 0x3

    .line 83
    .line 84
    add-int/2addr v10, v1

    .line 85
    and-int/2addr v10, v3

    .line 86
    iget-object v14, v0, Landroidx/collection/LongSet;->elements:[J

    .line 87
    .line 88
    aget-wide v15, v14, v10

    .line 89
    .line 90
    cmp-long v14, v15, p1

    .line 91
    .line 92
    if-nez v14, :cond_1

    .line 93
    .line 94
    return v10

    .line 95
    :cond_1
    const-wide/16 v14, 0x1

    .line 96
    .line 97
    sub-long v14, v8, v14

    .line 98
    .line 99
    and-long/2addr v8, v14

    .line 100
    goto :goto_1

    .line 101
    :cond_2
    not-long v8, v6

    .line 102
    const/4 v10, 0x6

    .line 103
    shl-long/2addr v8, v10

    .line 104
    and-long/2addr v6, v8

    .line 105
    and-long/2addr v6, v12

    .line 106
    cmp-long v6, v6, v14

    .line 107
    .line 108
    if-eqz v6, :cond_3

    .line 109
    .line 110
    const/4 v1, -0x1

    .line 111
    return v1

    .line 112
    :cond_3
    add-int/lit8 v5, v5, 0x8

    .line 113
    .line 114
    add-int/2addr v1, v5

    .line 115
    and-int/2addr v1, v3

    .line 116
    goto :goto_0
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
.end method

.method public final first()J
    .locals 14

    .line 1
    iget-object v0, p0, Landroidx/collection/LongSet;->elements:[J

    .line 2
    iget-object v1, p0, Landroidx/collection/LongSet;->metadata:[J

    .line 3
    array-length v2, v1

    add-int/lit8 v2, v2, -0x2

    if-ltz v2, :cond_4

    const/4 v3, 0x0

    move v4, v3

    .line 4
    :goto_0
    aget-wide v5, v1, v4

    not-long v7, v5

    const/4 v9, 0x7

    shl-long/2addr v7, v9

    and-long/2addr v7, v5

    const-wide v9, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v7, v9

    cmp-long v7, v7, v9

    if-eqz v7, :cond_3

    sub-int v7, v4, v2

    not-int v7, v7

    ushr-int/lit8 v7, v7, 0x1f

    const/16 v8, 0x8

    rsub-int/lit8 v7, v7, 0x8

    move v9, v3

    :goto_1
    if-ge v9, v7, :cond_2

    const-wide/16 v10, 0xff

    and-long/2addr v10, v5

    const-wide/16 v12, 0x80

    cmp-long v10, v10, v12

    if-gez v10, :cond_0

    const/4 v10, 0x1

    goto :goto_2

    :cond_0
    move v10, v3

    :goto_2
    if-eqz v10, :cond_1

    shl-int/lit8 v1, v4, 0x3

    add-int/2addr v1, v9

    .line 5
    aget-wide v1, v0, v1

    return-wide v1

    :cond_1
    shr-long/2addr v5, v8

    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_2
    if-ne v7, v8, :cond_4

    :cond_3
    if-eq v4, v2, :cond_4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 6
    :cond_4
    new-instance v0, Ljava/util/NoSuchElementException;

    const-string v1, "The LongSet is empty"

    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final first(Lv3/l;)J
    .locals 14
    .param p1    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/l<",
            "-",
            "Ljava/lang/Long;",
            "Ljava/lang/Boolean;",
            ">;)J"
        }
    .end annotation

    const-string v0, "predicate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    iget-object v0, p0, Landroidx/collection/LongSet;->elements:[J

    .line 8
    iget-object v1, p0, Landroidx/collection/LongSet;->metadata:[J

    .line 9
    array-length v2, v1

    add-int/lit8 v2, v2, -0x2

    if-ltz v2, :cond_4

    const/4 v3, 0x0

    move v4, v3

    .line 10
    :goto_0
    aget-wide v5, v1, v4

    not-long v7, v5

    const/4 v9, 0x7

    shl-long/2addr v7, v9

    and-long/2addr v7, v5

    const-wide v9, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v7, v9

    cmp-long v7, v7, v9

    if-eqz v7, :cond_3

    sub-int v7, v4, v2

    not-int v7, v7

    ushr-int/lit8 v7, v7, 0x1f

    const/16 v8, 0x8

    rsub-int/lit8 v7, v7, 0x8

    move v9, v3

    :goto_1
    if-ge v9, v7, :cond_2

    const-wide/16 v10, 0xff

    and-long/2addr v10, v5

    const-wide/16 v12, 0x80

    cmp-long v10, v10, v12

    if-gez v10, :cond_0

    const/4 v10, 0x1

    goto :goto_2

    :cond_0
    move v10, v3

    :goto_2
    if-eqz v10, :cond_1

    shl-int/lit8 v10, v4, 0x3

    add-int/2addr v10, v9

    .line 11
    aget-wide v10, v0, v10

    .line 12
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    invoke-interface {p1, v12}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Boolean;

    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v12

    if-eqz v12, :cond_1

    return-wide v10

    :cond_1
    shr-long/2addr v5, v8

    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_2
    if-ne v7, v8, :cond_4

    :cond_3
    if-eq v4, v2, :cond_4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 13
    :cond_4
    new-instance p1, Ljava/util/NoSuchElementException;

    const-string v0, "Could not find a match"

    invoke-direct {p1, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final forEach(Lv3/l;)V
    .locals 14
    .param p1    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/l<",
            "-",
            "Ljava/lang/Long;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "block"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/collection/LongSet;->elements:[J

    .line 7
    .line 8
    iget-object v1, p0, Landroidx/collection/LongSet;->metadata:[J

    .line 9
    .line 10
    array-length v2, v1

    .line 11
    add-int/lit8 v2, v2, -0x2

    .line 12
    .line 13
    if-ltz v2, :cond_4

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    move v4, v3

    .line 17
    :goto_0
    aget-wide v5, v1, v4

    .line 18
    .line 19
    not-long v7, v5

    .line 20
    const/4 v9, 0x7

    .line 21
    shl-long/2addr v7, v9

    .line 22
    and-long/2addr v7, v5

    .line 23
    const-wide v9, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    and-long/2addr v7, v9

    .line 29
    cmp-long v7, v7, v9

    .line 30
    .line 31
    if-eqz v7, :cond_3

    .line 32
    .line 33
    sub-int v7, v4, v2

    .line 34
    .line 35
    not-int v7, v7

    .line 36
    ushr-int/lit8 v7, v7, 0x1f

    .line 37
    .line 38
    const/16 v8, 0x8

    .line 39
    .line 40
    rsub-int/lit8 v7, v7, 0x8

    .line 41
    .line 42
    move v9, v3

    .line 43
    :goto_1
    if-ge v9, v7, :cond_2

    .line 44
    .line 45
    const-wide/16 v10, 0xff

    .line 46
    .line 47
    and-long/2addr v10, v5

    .line 48
    const-wide/16 v12, 0x80

    .line 49
    .line 50
    cmp-long v10, v10, v12

    .line 51
    .line 52
    if-gez v10, :cond_0

    .line 53
    .line 54
    const/4 v10, 0x1

    .line 55
    goto :goto_2

    .line 56
    :cond_0
    move v10, v3

    .line 57
    :goto_2
    if-eqz v10, :cond_1

    .line 58
    .line 59
    shl-int/lit8 v10, v4, 0x3

    .line 60
    .line 61
    add-int/2addr v10, v9

    .line 62
    aget-wide v10, v0, v10

    .line 63
    .line 64
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 65
    .line 66
    .line 67
    move-result-object v10

    .line 68
    invoke-interface {p1, v10}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    :cond_1
    shr-long/2addr v5, v8

    .line 72
    add-int/lit8 v9, v9, 0x1

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    if-ne v7, v8, :cond_4

    .line 76
    .line 77
    :cond_3
    if-eq v4, v2, :cond_4

    .line 78
    .line 79
    add-int/lit8 v4, v4, 0x1

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_4
    return-void
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

.method public final forEachIndex(Lv3/l;)V
    .locals 13
    .param p1    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/l<",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .annotation build Lkotlin/a1;
    .end annotation

    .line 1
    const-string v0, "block"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/collection/LongSet;->metadata:[J

    .line 7
    .line 8
    array-length v1, v0

    .line 9
    add-int/lit8 v1, v1, -0x2

    .line 10
    .line 11
    if-ltz v1, :cond_4

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    move v3, v2

    .line 15
    :goto_0
    aget-wide v4, v0, v3

    .line 16
    .line 17
    not-long v6, v4

    .line 18
    const/4 v8, 0x7

    .line 19
    shl-long/2addr v6, v8

    .line 20
    and-long/2addr v6, v4

    .line 21
    const-wide v8, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    and-long/2addr v6, v8

    .line 27
    cmp-long v6, v6, v8

    .line 28
    .line 29
    if-eqz v6, :cond_3

    .line 30
    .line 31
    sub-int v6, v3, v1

    .line 32
    .line 33
    not-int v6, v6

    .line 34
    ushr-int/lit8 v6, v6, 0x1f

    .line 35
    .line 36
    const/16 v7, 0x8

    .line 37
    .line 38
    rsub-int/lit8 v6, v6, 0x8

    .line 39
    .line 40
    move v8, v2

    .line 41
    :goto_1
    if-ge v8, v6, :cond_2

    .line 42
    .line 43
    const-wide/16 v9, 0xff

    .line 44
    .line 45
    and-long/2addr v9, v4

    .line 46
    const-wide/16 v11, 0x80

    .line 47
    .line 48
    cmp-long v9, v9, v11

    .line 49
    .line 50
    if-gez v9, :cond_0

    .line 51
    .line 52
    const/4 v9, 0x1

    .line 53
    goto :goto_2

    .line 54
    :cond_0
    move v9, v2

    .line 55
    :goto_2
    if-eqz v9, :cond_1

    .line 56
    .line 57
    shl-int/lit8 v9, v3, 0x3

    .line 58
    .line 59
    add-int/2addr v9, v8

    .line 60
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 61
    .line 62
    .line 63
    move-result-object v9

    .line 64
    invoke-interface {p1, v9}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    :cond_1
    shr-long/2addr v4, v7

    .line 68
    add-int/lit8 v8, v8, 0x1

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_2
    if-eq v6, v7, :cond_3

    .line 72
    .line 73
    return-void

    .line 74
    :cond_3
    if-eq v3, v1, :cond_4

    .line 75
    .line 76
    add-int/lit8 v3, v3, 0x1

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_4
    return-void
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

.method public final getCapacity()I
    .locals 1
    .annotation build Landroidx/annotation/IntRange;
        from = 0x0L
    .end annotation

    iget v0, p0, Landroidx/collection/LongSet;->_capacity:I

    return v0
.end method

.method public final getSize()I
    .locals 1
    .annotation build Landroidx/annotation/IntRange;
        from = 0x0L
    .end annotation

    iget v0, p0, Landroidx/collection/LongSet;->_size:I

    return v0
.end method

.method public hashCode()I
    .locals 15

    .line 1
    iget-object v0, p0, Landroidx/collection/LongSet;->elements:[J

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/collection/LongSet;->metadata:[J

    .line 4
    .line 5
    array-length v2, v1

    .line 6
    add-int/lit8 v2, v2, -0x2

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    if-ltz v2, :cond_5

    .line 10
    .line 11
    move v4, v3

    .line 12
    move v5, v4

    .line 13
    :goto_0
    aget-wide v6, v1, v4

    .line 14
    .line 15
    not-long v8, v6

    .line 16
    const/4 v10, 0x7

    .line 17
    shl-long/2addr v8, v10

    .line 18
    and-long/2addr v8, v6

    .line 19
    const-wide v10, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    and-long/2addr v8, v10

    .line 25
    cmp-long v8, v8, v10

    .line 26
    .line 27
    if-eqz v8, :cond_3

    .line 28
    .line 29
    sub-int v8, v4, v2

    .line 30
    .line 31
    not-int v8, v8

    .line 32
    ushr-int/lit8 v8, v8, 0x1f

    .line 33
    .line 34
    const/16 v9, 0x8

    .line 35
    .line 36
    rsub-int/lit8 v8, v8, 0x8

    .line 37
    .line 38
    move v10, v3

    .line 39
    :goto_1
    if-ge v10, v8, :cond_2

    .line 40
    .line 41
    const-wide/16 v11, 0xff

    .line 42
    .line 43
    and-long/2addr v11, v6

    .line 44
    const-wide/16 v13, 0x80

    .line 45
    .line 46
    cmp-long v11, v11, v13

    .line 47
    .line 48
    if-gez v11, :cond_0

    .line 49
    .line 50
    const/4 v11, 0x1

    .line 51
    goto :goto_2

    .line 52
    :cond_0
    move v11, v3

    .line 53
    :goto_2
    if-eqz v11, :cond_1

    .line 54
    .line 55
    shl-int/lit8 v11, v4, 0x3

    .line 56
    .line 57
    add-int/2addr v11, v10

    .line 58
    aget-wide v11, v0, v11

    .line 59
    .line 60
    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    .line 61
    .line 62
    .line 63
    move-result v11

    .line 64
    add-int/2addr v5, v11

    .line 65
    :cond_1
    shr-long/2addr v6, v9

    .line 66
    add-int/lit8 v10, v10, 0x1

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    if-ne v8, v9, :cond_6

    .line 70
    .line 71
    :cond_3
    if-eq v4, v2, :cond_4

    .line 72
    .line 73
    add-int/lit8 v4, v4, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_4
    move v3, v5

    .line 77
    :cond_5
    move v5, v3

    .line 78
    :cond_6
    return v5
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
.end method

.method public final isEmpty()Z
    .locals 1

    iget v0, p0, Landroidx/collection/LongSet;->_size:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final isNotEmpty()Z
    .locals 1

    iget v0, p0, Landroidx/collection/LongSet;->_size:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final joinToString()Ljava/lang/String;
    .locals 8
    .annotation build Lp4/l;
    .end annotation

    .annotation build Lu3/i;
    .end annotation

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x1f

    const/4 v7, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v7}, Landroidx/collection/LongSet;->joinToString$default(Landroidx/collection/LongSet;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final joinToString(Ljava/lang/CharSequence;)Ljava/lang/String;
    .locals 9
    .param p1    # Ljava/lang/CharSequence;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .annotation build Lu3/i;
    .end annotation

    const-string v0, "separator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x1e

    const/4 v8, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v8}, Landroidx/collection/LongSet;->joinToString$default(Landroidx/collection/LongSet;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final joinToString(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    .locals 9
    .param p1    # Ljava/lang/CharSequence;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Ljava/lang/CharSequence;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .annotation build Lu3/i;
    .end annotation

    const-string v0, "separator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "prefix"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x1c

    const/4 v8, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v8}, Landroidx/collection/LongSet;->joinToString$default(Landroidx/collection/LongSet;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final joinToString(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    .locals 9
    .param p1    # Ljava/lang/CharSequence;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Ljava/lang/CharSequence;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Ljava/lang/CharSequence;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .annotation build Lu3/i;
    .end annotation

    const-string v0, "separator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "prefix"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "postfix"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x18

    const/4 v8, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-static/range {v1 .. v8}, Landroidx/collection/LongSet;->joinToString$default(Landroidx/collection/LongSet;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final joinToString(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)Ljava/lang/String;
    .locals 9
    .param p1    # Ljava/lang/CharSequence;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Ljava/lang/CharSequence;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Ljava/lang/CharSequence;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .annotation build Lu3/i;
    .end annotation

    const-string v0, "separator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "prefix"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "postfix"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x0

    const/16 v7, 0x10

    const/4 v8, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    invoke-static/range {v1 .. v8}, Landroidx/collection/LongSet;->joinToString$default(Landroidx/collection/LongSet;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final joinToString(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;)Ljava/lang/String;
    .locals 20
    .param p1    # Ljava/lang/CharSequence;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Ljava/lang/CharSequence;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Ljava/lang/CharSequence;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p5    # Ljava/lang/CharSequence;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .annotation build Lu3/i;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p5

    const-string v5, "separator"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "prefix"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "postfix"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v5, "truncated"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 2
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 3
    iget-object v2, v0, Landroidx/collection/LongSet;->elements:[J

    .line 4
    iget-object v6, v0, Landroidx/collection/LongSet;->metadata:[J

    .line 5
    array-length v7, v6

    add-int/lit8 v7, v7, -0x2

    if-ltz v7, :cond_6

    const/4 v9, 0x0

    const/4 v10, 0x0

    .line 6
    :goto_0
    aget-wide v11, v6, v9

    not-long v13, v11

    const/4 v15, 0x7

    shl-long/2addr v13, v15

    and-long/2addr v13, v11

    const-wide v15, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v13, v15

    cmp-long v13, v13, v15

    if-eqz v13, :cond_5

    sub-int v13, v9, v7

    not-int v13, v13

    ushr-int/lit8 v13, v13, 0x1f

    const/16 v14, 0x8

    rsub-int/lit8 v13, v13, 0x8

    const/4 v15, 0x0

    :goto_1
    if-ge v15, v13, :cond_4

    const-wide/16 v16, 0xff

    and-long v16, v11, v16

    const-wide/16 v18, 0x80

    cmp-long v16, v16, v18

    if-gez v16, :cond_0

    const/16 v16, 0x1

    goto :goto_2

    :cond_0
    const/16 v16, 0x0

    :goto_2
    if-eqz v16, :cond_3

    shl-int/lit8 v16, v9, 0x3

    add-int v16, v16, v15

    move/from16 v17, v9

    .line 7
    aget-wide v8, v2, v16

    move/from16 v14, p4

    if-ne v10, v14, :cond_1

    .line 8
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    goto :goto_5

    :cond_1
    if-eqz v10, :cond_2

    .line 9
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 10
    :cond_2
    invoke-virtual {v5, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    add-int/lit8 v10, v10, 0x1

    goto :goto_3

    :cond_3
    move/from16 v14, p4

    move/from16 v17, v9

    :goto_3
    const/16 v8, 0x8

    shr-long/2addr v11, v8

    add-int/lit8 v15, v15, 0x1

    move v14, v8

    move/from16 v9, v17

    goto :goto_1

    :cond_4
    move/from16 v17, v9

    move v8, v14

    move/from16 v14, p4

    if-ne v13, v8, :cond_6

    move/from16 v8, v17

    goto :goto_4

    :cond_5
    move/from16 v14, p4

    move v8, v9

    :goto_4
    if-eq v8, v7, :cond_6

    add-int/lit8 v9, v8, 0x1

    goto :goto_0

    .line 11
    :cond_6
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 12
    :goto_5
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "StringBuilder().apply(builderAction).toString()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v1
.end method

.method public final joinToString(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lv3/l;)Ljava/lang/String;
    .locals 20
    .param p1    # Ljava/lang/CharSequence;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Ljava/lang/CharSequence;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Ljava/lang/CharSequence;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p5    # Ljava/lang/CharSequence;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p6    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            "Ljava/lang/CharSequence;",
            "Ljava/lang/CharSequence;",
            "I",
            "Ljava/lang/CharSequence;",
            "Lv3/l<",
            "-",
            "Ljava/lang/Long;",
            "+",
            "Ljava/lang/CharSequence;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .annotation build Lu3/i;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p5

    move-object/from16 v5, p6

    const-string v6, "separator"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "prefix"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "postfix"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v6, "truncated"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v6, "transform"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 15
    iget-object v2, v0, Landroidx/collection/LongSet;->elements:[J

    .line 16
    iget-object v7, v0, Landroidx/collection/LongSet;->metadata:[J

    .line 17
    array-length v8, v7

    add-int/lit8 v8, v8, -0x2

    if-ltz v8, :cond_6

    const/4 v10, 0x0

    const/4 v11, 0x0

    .line 18
    :goto_0
    aget-wide v12, v7, v10

    not-long v14, v12

    const/16 v16, 0x7

    shl-long v14, v14, v16

    and-long/2addr v14, v12

    const-wide v16, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v14, v14, v16

    cmp-long v14, v14, v16

    if-eqz v14, :cond_5

    sub-int v14, v10, v8

    not-int v14, v14

    ushr-int/lit8 v14, v14, 0x1f

    const/16 v15, 0x8

    rsub-int/lit8 v14, v14, 0x8

    const/4 v9, 0x0

    :goto_1
    if-ge v9, v14, :cond_4

    const-wide/16 v16, 0xff

    and-long v16, v12, v16

    const-wide/16 v18, 0x80

    cmp-long v16, v16, v18

    if-gez v16, :cond_0

    const/16 v16, 0x1

    goto :goto_2

    :cond_0
    const/16 v16, 0x0

    :goto_2
    if-eqz v16, :cond_3

    shl-int/lit8 v16, v10, 0x3

    add-int v16, v16, v9

    .line 19
    aget-wide v16, v2, v16

    move/from16 v15, p4

    if-ne v11, v15, :cond_1

    .line 20
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    goto :goto_5

    :cond_1
    if-eqz v11, :cond_2

    .line 21
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 22
    :cond_2
    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v5, v0}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    add-int/lit8 v11, v11, 0x1

    goto :goto_3

    :cond_3
    move/from16 v15, p4

    :goto_3
    const/16 v0, 0x8

    shr-long/2addr v12, v0

    add-int/lit8 v9, v9, 0x1

    move v15, v0

    move-object/from16 v0, p0

    goto :goto_1

    :cond_4
    move v0, v15

    move/from16 v15, p4

    if-ne v14, v0, :cond_6

    goto :goto_4

    :cond_5
    move/from16 v15, p4

    :goto_4
    if-eq v10, v8, :cond_6

    add-int/lit8 v10, v10, 0x1

    move-object/from16 v0, p0

    goto :goto_0

    .line 23
    :cond_6
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 24
    :goto_5
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "StringBuilder().apply(builderAction).toString()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final joinToString(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILv3/l;)Ljava/lang/String;
    .locals 20
    .param p1    # Ljava/lang/CharSequence;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Ljava/lang/CharSequence;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Ljava/lang/CharSequence;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p5    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            "Ljava/lang/CharSequence;",
            "Ljava/lang/CharSequence;",
            "I",
            "Lv3/l<",
            "-",
            "Ljava/lang/Long;",
            "+",
            "Ljava/lang/CharSequence;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .annotation build Lu3/i;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p5

    const-string v5, "separator"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "prefix"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "postfix"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v5, "transform"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 27
    iget-object v2, v0, Landroidx/collection/LongSet;->elements:[J

    .line 28
    iget-object v6, v0, Landroidx/collection/LongSet;->metadata:[J

    .line 29
    array-length v7, v6

    add-int/lit8 v7, v7, -0x2

    if-ltz v7, :cond_6

    const/4 v9, 0x0

    const/4 v10, 0x0

    .line 30
    :goto_0
    aget-wide v11, v6, v9

    not-long v13, v11

    const/4 v15, 0x7

    shl-long/2addr v13, v15

    and-long/2addr v13, v11

    const-wide v15, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v13, v15

    cmp-long v13, v13, v15

    if-eqz v13, :cond_5

    sub-int v13, v9, v7

    not-int v13, v13

    ushr-int/lit8 v13, v13, 0x1f

    const/16 v14, 0x8

    rsub-int/lit8 v13, v13, 0x8

    const/4 v15, 0x0

    :goto_1
    if-ge v15, v13, :cond_4

    const-wide/16 v16, 0xff

    and-long v16, v11, v16

    const-wide/16 v18, 0x80

    cmp-long v16, v16, v18

    if-gez v16, :cond_0

    const/16 v16, 0x1

    goto :goto_2

    :cond_0
    const/16 v16, 0x0

    :goto_2
    if-eqz v16, :cond_3

    shl-int/lit8 v16, v9, 0x3

    add-int v16, v16, v15

    .line 31
    aget-wide v16, v2, v16

    move/from16 v8, p4

    if-ne v10, v8, :cond_1

    const-string v1, "..."

    .line 32
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    goto :goto_5

    :cond_1
    if-eqz v10, :cond_2

    .line 33
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 34
    :cond_2
    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v14

    invoke-interface {v4, v14}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/CharSequence;

    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    add-int/lit8 v10, v10, 0x1

    const/16 v14, 0x8

    goto :goto_3

    :cond_3
    move/from16 v8, p4

    :goto_3
    shr-long/2addr v11, v14

    add-int/lit8 v15, v15, 0x1

    goto :goto_1

    :cond_4
    move/from16 v8, p4

    if-ne v13, v14, :cond_6

    goto :goto_4

    :cond_5
    move/from16 v8, p4

    :goto_4
    if-eq v9, v7, :cond_6

    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 35
    :cond_6
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 36
    :goto_5
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "StringBuilder().apply(builderAction).toString()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v1
.end method

.method public final joinToString(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lv3/l;)Ljava/lang/String;
    .locals 20
    .param p1    # Ljava/lang/CharSequence;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Ljava/lang/CharSequence;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Ljava/lang/CharSequence;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            "Ljava/lang/CharSequence;",
            "Ljava/lang/CharSequence;",
            "Lv3/l<",
            "-",
            "Ljava/lang/Long;",
            "+",
            "Ljava/lang/CharSequence;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .annotation build Lu3/i;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    const-string v5, "separator"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "prefix"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "postfix"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v5, "transform"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 39
    iget-object v2, v0, Landroidx/collection/LongSet;->elements:[J

    .line 40
    iget-object v6, v0, Landroidx/collection/LongSet;->metadata:[J

    .line 41
    array-length v7, v6

    add-int/lit8 v7, v7, -0x2

    if-ltz v7, :cond_6

    const/4 v9, 0x0

    const/4 v10, 0x0

    .line 42
    :goto_0
    aget-wide v11, v6, v9

    not-long v13, v11

    const/4 v15, 0x7

    shl-long/2addr v13, v15

    and-long/2addr v13, v11

    const-wide v15, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v13, v15

    cmp-long v13, v13, v15

    if-eqz v13, :cond_5

    sub-int v13, v9, v7

    not-int v13, v13

    ushr-int/lit8 v13, v13, 0x1f

    const/16 v14, 0x8

    rsub-int/lit8 v13, v13, 0x8

    const/4 v15, 0x0

    :goto_1
    if-ge v15, v13, :cond_4

    const-wide/16 v16, 0xff

    and-long v16, v11, v16

    const-wide/16 v18, 0x80

    cmp-long v16, v16, v18

    if-gez v16, :cond_0

    const/16 v16, 0x1

    goto :goto_2

    :cond_0
    const/16 v16, 0x0

    :goto_2
    if-eqz v16, :cond_3

    shl-int/lit8 v16, v9, 0x3

    add-int v16, v16, v15

    .line 43
    aget-wide v16, v2, v16

    const/4 v8, -0x1

    if-ne v10, v8, :cond_1

    const-string v1, "..."

    .line 44
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_1
    if-eqz v10, :cond_2

    .line 45
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 46
    :cond_2
    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-interface {v4, v8}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/CharSequence;

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    add-int/lit8 v10, v10, 0x1

    :cond_3
    shr-long/2addr v11, v14

    add-int/lit8 v15, v15, 0x1

    goto :goto_1

    :cond_4
    if-ne v13, v14, :cond_6

    :cond_5
    if-eq v9, v7, :cond_6

    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 47
    :cond_6
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 48
    :goto_3
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "StringBuilder().apply(builderAction).toString()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v1
.end method

.method public final joinToString(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lv3/l;)Ljava/lang/String;
    .locals 19
    .param p1    # Ljava/lang/CharSequence;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Ljava/lang/CharSequence;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            "Ljava/lang/CharSequence;",
            "Lv3/l<",
            "-",
            "Ljava/lang/Long;",
            "+",
            "Ljava/lang/CharSequence;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .annotation build Lu3/i;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    const-string v4, "separator"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "prefix"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v4, "transform"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 50
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 51
    iget-object v2, v0, Landroidx/collection/LongSet;->elements:[J

    .line 52
    iget-object v5, v0, Landroidx/collection/LongSet;->metadata:[J

    .line 53
    array-length v6, v5

    add-int/lit8 v6, v6, -0x2

    if-ltz v6, :cond_6

    const/4 v8, 0x0

    const/4 v9, 0x0

    .line 54
    :goto_0
    aget-wide v10, v5, v8

    not-long v12, v10

    const/4 v14, 0x7

    shl-long/2addr v12, v14

    and-long/2addr v12, v10

    const-wide v14, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v12, v14

    cmp-long v12, v12, v14

    if-eqz v12, :cond_5

    sub-int v12, v8, v6

    not-int v12, v12

    ushr-int/lit8 v12, v12, 0x1f

    const/16 v13, 0x8

    rsub-int/lit8 v12, v12, 0x8

    const/4 v14, 0x0

    :goto_1
    if-ge v14, v12, :cond_4

    const-wide/16 v15, 0xff

    and-long/2addr v15, v10

    const-wide/16 v17, 0x80

    cmp-long v15, v15, v17

    if-gez v15, :cond_0

    const/4 v15, 0x1

    goto :goto_2

    :cond_0
    const/4 v15, 0x0

    :goto_2
    if-eqz v15, :cond_3

    shl-int/lit8 v15, v8, 0x3

    add-int/2addr v15, v14

    .line 55
    aget-wide v15, v2, v15

    const/4 v7, -0x1

    if-ne v9, v7, :cond_1

    const-string v1, "..."

    .line 56
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_1
    if-eqz v9, :cond_2

    .line 57
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 58
    :cond_2
    invoke-static/range {v15 .. v16}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-interface {v3, v7}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/CharSequence;

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    add-int/lit8 v9, v9, 0x1

    :cond_3
    shr-long/2addr v10, v13

    add-int/lit8 v14, v14, 0x1

    goto :goto_1

    :cond_4
    if-ne v12, v13, :cond_6

    :cond_5
    if-eq v8, v6, :cond_6

    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_6
    const-string v1, ""

    .line 59
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 60
    :goto_3
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "StringBuilder().apply(builderAction).toString()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v1
.end method

.method public final joinToString(Ljava/lang/CharSequence;Lv3/l;)Ljava/lang/String;
    .locals 20
    .param p1    # Ljava/lang/CharSequence;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            "Lv3/l<",
            "-",
            "Ljava/lang/Long;",
            "+",
            "Ljava/lang/CharSequence;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .annotation build Lu3/i;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-string v3, "separator"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v3, "transform"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, ""

    .line 62
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 63
    iget-object v5, v0, Landroidx/collection/LongSet;->elements:[J

    .line 64
    iget-object v6, v0, Landroidx/collection/LongSet;->metadata:[J

    .line 65
    array-length v7, v6

    add-int/lit8 v7, v7, -0x2

    if-ltz v7, :cond_6

    const/4 v9, 0x0

    const/4 v10, 0x0

    .line 66
    :goto_0
    aget-wide v11, v6, v9

    not-long v13, v11

    const/4 v15, 0x7

    shl-long/2addr v13, v15

    and-long/2addr v13, v11

    const-wide v15, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v13, v15

    cmp-long v13, v13, v15

    if-eqz v13, :cond_5

    sub-int v13, v9, v7

    not-int v13, v13

    ushr-int/lit8 v13, v13, 0x1f

    const/16 v14, 0x8

    rsub-int/lit8 v13, v13, 0x8

    const/4 v15, 0x0

    :goto_1
    if-ge v15, v13, :cond_4

    const-wide/16 v16, 0xff

    and-long v16, v11, v16

    const-wide/16 v18, 0x80

    cmp-long v16, v16, v18

    if-gez v16, :cond_0

    const/16 v16, 0x1

    goto :goto_2

    :cond_0
    const/16 v16, 0x0

    :goto_2
    if-eqz v16, :cond_3

    shl-int/lit8 v16, v9, 0x3

    add-int v16, v16, v15

    .line 67
    aget-wide v16, v5, v16

    const/4 v8, -0x1

    if-ne v10, v8, :cond_1

    const-string v1, "..."

    .line 68
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_1
    if-eqz v10, :cond_2

    .line 69
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 70
    :cond_2
    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-interface {v2, v8}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/CharSequence;

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    add-int/lit8 v10, v10, 0x1

    :cond_3
    shr-long/2addr v11, v14

    add-int/lit8 v15, v15, 0x1

    goto :goto_1

    :cond_4
    if-ne v13, v14, :cond_6

    :cond_5
    if-eq v9, v7, :cond_6

    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 71
    :cond_6
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 72
    :goto_3
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "StringBuilder().apply(builderAction).toString()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v1
.end method

.method public final joinToString(Lv3/l;)Ljava/lang/String;
    .locals 19
    .param p1    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/l<",
            "-",
            "Ljava/lang/Long;",
            "+",
            "Ljava/lang/CharSequence;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .annotation build Lu3/i;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string/jumbo v2, "transform"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ""

    .line 74
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 75
    iget-object v4, v0, Landroidx/collection/LongSet;->elements:[J

    .line 76
    iget-object v5, v0, Landroidx/collection/LongSet;->metadata:[J

    .line 77
    array-length v6, v5

    add-int/lit8 v6, v6, -0x2

    if-ltz v6, :cond_6

    const/4 v8, 0x0

    const/4 v9, 0x0

    .line 78
    :goto_0
    aget-wide v10, v5, v8

    not-long v12, v10

    const/4 v14, 0x7

    shl-long/2addr v12, v14

    and-long/2addr v12, v10

    const-wide v14, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v12, v14

    cmp-long v12, v12, v14

    if-eqz v12, :cond_5

    sub-int v12, v8, v6

    not-int v12, v12

    ushr-int/lit8 v12, v12, 0x1f

    const/16 v13, 0x8

    rsub-int/lit8 v12, v12, 0x8

    const/4 v14, 0x0

    :goto_1
    if-ge v14, v12, :cond_4

    const-wide/16 v15, 0xff

    and-long/2addr v15, v10

    const-wide/16 v17, 0x80

    cmp-long v15, v15, v17

    if-gez v15, :cond_0

    const/4 v15, 0x1

    goto :goto_2

    :cond_0
    const/4 v15, 0x0

    :goto_2
    if-eqz v15, :cond_3

    shl-int/lit8 v15, v8, 0x3

    add-int/2addr v15, v14

    .line 79
    aget-wide v15, v4, v15

    const/4 v7, -0x1

    if-ne v9, v7, :cond_1

    const-string v1, "..."

    .line 80
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_1
    if-eqz v9, :cond_2

    const-string v7, ", "

    .line 81
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 82
    :cond_2
    invoke-static/range {v15 .. v16}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-interface {v1, v7}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/CharSequence;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    add-int/lit8 v9, v9, 0x1

    :cond_3
    shr-long/2addr v10, v13

    add-int/lit8 v14, v14, 0x1

    goto :goto_1

    :cond_4
    if-ne v12, v13, :cond_6

    :cond_5
    if-eq v8, v6, :cond_6

    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 83
    :cond_6
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 84
    :goto_3
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "StringBuilder().apply(builderAction).toString()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v1
.end method

.method public final none()Z
    .locals 1

    iget v0, p0, Landroidx/collection/LongSet;->_size:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8
    .annotation build Lp4/l;
    .end annotation

    .line 1
    const/4 v1, 0x0

    .line 2
    const-string v2, "["

    .line 3
    .line 4
    const-string v3, "]"

    .line 5
    .line 6
    const/4 v4, 0x0

    .line 7
    const/4 v5, 0x0

    .line 8
    const/16 v6, 0x19

    .line 9
    .line 10
    const/4 v7, 0x0

    .line 11
    move-object v0, p0

    .line 12
    invoke-static/range {v0 .. v7}, Landroidx/collection/LongSet;->joinToString$default(Landroidx/collection/LongSet;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;ILjava/lang/Object;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
    .line 17
    .line 18
    .line 19
.end method
