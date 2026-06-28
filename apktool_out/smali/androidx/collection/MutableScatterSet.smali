.class public final Landroidx/collection/MutableScatterSet;
.super Landroidx/collection/ScatterSet;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/collection/MutableScatterSet$MutableSetWrapper;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Landroidx/collection/ScatterSet<",
        "TE;>;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0011\n\u0002\u0008\u0003\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010#\n\u0002\u0008\u0007\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u0008\u0012\u0004\u0012\u00028\u00000\u0002:\u00012B\u0011\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u00080\u00101J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0008\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0002J\u0008\u0010\t\u001a\u00020\u0005H\u0002J\u0017\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00028\u0000H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0002J\u0008\u0010\u000f\u001a\u00020\u0005H\u0002J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0003H\u0002J\u0019\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0013H\u0082\u0008J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\n\u001a\u00028\u0000\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u00052\u0006\u0010\n\u001a\u00028\u0000H\u0086\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u001d\u0010\u001d\u001a\u00020\u00162\u000e\u0010\u001c\u001a\n\u0012\u0006\u0008\u0001\u0012\u00028\u00000\u001b\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0014\u0010\u001d\u001a\u00020\u00162\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u001fJ\u0014\u0010\u001d\u001a\u00020\u00162\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00028\u00000 J\u0014\u0010\u001d\u001a\u00020\u00162\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0002J\u0014\u0010\u001d\u001a\u00020\u00162\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00028\u00000!J \u0010\u0019\u001a\u00020\u00052\u000e\u0010\u001c\u001a\n\u0012\u0006\u0008\u0001\u0012\u00028\u00000\u001bH\u0086\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\"J\u0017\u0010\u0019\u001a\u00020\u00052\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u001fH\u0086\u0002J\u0017\u0010\u0019\u001a\u00020\u00052\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00028\u00000 H\u0086\u0002J\u0017\u0010\u0019\u001a\u00020\u00052\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002J\u0017\u0010\u0019\u001a\u00020\u00052\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00028\u00000!H\u0086\u0002J\u0015\u0010#\u001a\u00020\u00162\u0006\u0010\n\u001a\u00028\u0000\u00a2\u0006\u0004\u0008#\u0010\u0018J\u0018\u0010$\u001a\u00020\u00052\u0006\u0010\n\u001a\u00028\u0000H\u0086\u0002\u00a2\u0006\u0004\u0008$\u0010\u001aJ\u001d\u0010%\u001a\u00020\u00162\u000e\u0010\u001c\u001a\n\u0012\u0006\u0008\u0001\u0012\u00028\u00000\u001b\u00a2\u0006\u0004\u0008%\u0010\u001eJ\u0014\u0010%\u001a\u00020\u00162\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00028\u00000 J\u0014\u0010%\u001a\u00020\u00162\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u001fJ\u0014\u0010%\u001a\u00020\u00162\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0002J\u0014\u0010%\u001a\u00020\u00162\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00028\u00000!J \u0010$\u001a\u00020\u00052\u000e\u0010\u001c\u001a\n\u0012\u0006\u0008\u0001\u0012\u00028\u00000\u001bH\u0086\u0002\u00a2\u0006\u0004\u0008$\u0010\"J\u0017\u0010$\u001a\u00020\u00052\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00028\u00000 H\u0086\u0002J\u0017\u0010$\u001a\u00020\u00052\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u001fH\u0086\u0002J\u0017\u0010$\u001a\u00020\u00052\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002J\u0017\u0010$\u001a\u00020\u00052\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00028\u00000!H\u0086\u0002J \u0010(\u001a\u00020\u00052\u0012\u0010\'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00160&H\u0086\u0008\u00f8\u0001\u0000J\u0010\u0010)\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0003H\u0001J\u0006\u0010*\u001a\u00020\u0005J\u0008\u0010+\u001a\u00020\u0003H\u0007J\u000c\u0010-\u001a\u0008\u0012\u0004\u0012\u00028\u00000,R\u0016\u0010.\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008.\u0010/\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u00063"
    }
    d2 = {
        "Landroidx/collection/MutableScatterSet;",
        "E",
        "Landroidx/collection/ScatterSet;",
        "",
        "initialCapacity",
        "Lkotlin/r2;",
        "initializeStorage",
        "capacity",
        "initializeMetadata",
        "initializeGrowth",
        "element",
        "findAbsoluteInsertIndex",
        "(Ljava/lang/Object;)I",
        "hash1",
        "findFirstAvailableSlot",
        "adjustStorage",
        "newCapacity",
        "resizeStorage",
        "index",
        "",
        "value",
        "writeMetadata",
        "",
        "add",
        "(Ljava/lang/Object;)Z",
        "plusAssign",
        "(Ljava/lang/Object;)V",
        "",
        "elements",
        "addAll",
        "([Ljava/lang/Object;)Z",
        "",
        "Lkotlin/sequences/m;",
        "Landroidx/collection/ObjectList;",
        "([Ljava/lang/Object;)V",
        "remove",
        "minusAssign",
        "removeAll",
        "Lkotlin/Function1;",
        "predicate",
        "removeIf",
        "removeElementAt",
        "clear",
        "trim",
        "",
        "asMutableSet",
        "growthLimit",
        "I",
        "<init>",
        "(I)V",
        "MutableSetWrapper",
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
        "SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/MutableScatterSet\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 7 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 8 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n1#1,1084:1\n1002#1,2:1269\n1006#1,5:1277\n1002#1,2:1308\n1006#1,5:1316\n1002#1,2:1333\n1006#1,5:1341\n1#2:1085\n1656#3,6:1086\n1810#3:1109\n1672#3:1113\n1589#3,3:1132\n1603#3:1136\n1599#3:1139\n1779#3,3:1143\n1793#3,3:1147\n1717#3:1151\n1705#3:1153\n1699#3:1154\n1712#3:1159\n1802#3:1161\n1589#3,3:1171\n1603#3:1175\n1599#3:1178\n1779#3,3:1182\n1793#3,3:1186\n1717#3:1190\n1705#3:1192\n1699#3:1193\n1712#3:1198\n1802#3:1200\n1810#3:1226\n1672#3:1230\n1810#3:1255\n1672#3:1259\n1656#3,6:1271\n1656#3,6:1282\n1589#3,3:1288\n1599#3:1291\n1603#3:1292\n1779#3,3:1293\n1793#3,3:1296\n1717#3:1299\n1705#3:1300\n1699#3:1301\n1712#3:1302\n1802#3:1303\n1666#3:1304\n1645#3:1305\n1664#3:1306\n1645#3:1307\n1656#3,6:1310\n1779#3,3:1321\n1810#3:1324\n1699#3:1325\n1669#3:1326\n1645#3:1327\n1589#3,3:1328\n1599#3:1331\n1603#3:1332\n1656#3,6:1335\n1656#3,6:1346\n1656#3,6:1352\n13579#4,2:1092\n13579#4,2:1209\n1855#5,2:1094\n1855#5,2:1213\n1295#6,2:1096\n1295#6,2:1211\n267#7,4:1098\n237#7,7:1102\n248#7,3:1110\n251#7,2:1114\n272#7,2:1116\n254#7,6:1118\n274#7:1124\n433#7:1131\n434#7:1135\n436#7,2:1137\n438#7,3:1140\n441#7:1146\n442#7:1150\n443#7:1152\n444#7,4:1155\n450#7:1160\n451#7,8:1162\n433#7:1170\n434#7:1174\n436#7,2:1176\n438#7,3:1179\n441#7:1185\n442#7:1189\n443#7:1191\n444#7,4:1194\n450#7:1199\n451#7,8:1201\n267#7,4:1215\n237#7,7:1219\n248#7,3:1227\n251#7,2:1231\n272#7,2:1233\n254#7,6:1235\n274#7:1241\n237#7,7:1248\n248#7,3:1256\n251#7,9:1260\n305#8,6:1125\n305#8,6:1242\n*S KotlinDebug\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/MutableScatterSet\n*L\n857#1:1269,2\n857#1:1277,5\n917#1:1308,2\n917#1:1316,5\n990#1:1333,2\n990#1:1341,5\n567#1:1086,6\n692#1:1109\n692#1:1113\n714#1:1132,3\n714#1:1136\n714#1:1139\n714#1:1143,3\n714#1:1147,3\n714#1:1151\n714#1:1153\n714#1:1154\n714#1:1159\n714#1:1161\n727#1:1171,3\n727#1:1175\n727#1:1178\n727#1:1182,3\n727#1:1186,3\n727#1:1190\n727#1:1192\n727#1:1193\n727#1:1198\n727#1:1200\n823#1:1226\n823#1:1230\n843#1:1255\n843#1:1259\n857#1:1271,6\n868#1:1282,6\n882#1:1288,3\n883#1:1291\n884#1:1292\n891#1:1293,3\n892#1:1296,3\n893#1:1299\n894#1:1300\n894#1:1301\n898#1:1302\n901#1:1303\n910#1:1304\n910#1:1305\n916#1:1306\n916#1:1307\n917#1:1310,6\n931#1:1321,3\n932#1:1324\n934#1:1325\n985#1:1326\n985#1:1327\n987#1:1328,3\n988#1:1331\n990#1:1332\n990#1:1335,6\n1003#1:1346,6\n1009#1:1352,6\n662#1:1092,2\n793#1:1209,2\n672#1:1094,2\n813#1:1213,2\n682#1:1096,2\n803#1:1211,2\n692#1:1098,4\n692#1:1102,7\n692#1:1110,3\n692#1:1114,2\n692#1:1116,2\n692#1:1118,6\n692#1:1124\n714#1:1131\n714#1:1135\n714#1:1137,2\n714#1:1140,3\n714#1:1146\n714#1:1150\n714#1:1152\n714#1:1155,4\n714#1:1160\n714#1:1162,8\n727#1:1170\n727#1:1174\n727#1:1176,2\n727#1:1179,3\n727#1:1185\n727#1:1189\n727#1:1191\n727#1:1194,4\n727#1:1199\n727#1:1201,8\n823#1:1215,4\n823#1:1219,7\n823#1:1227,3\n823#1:1231,2\n823#1:1233,2\n823#1:1235,6\n823#1:1241\n843#1:1248,7\n843#1:1256,3\n843#1:1260,9\n702#1:1125,6\n833#1:1242,6\n*E\n"
    }
.end annotation


# instance fields
.field private growthLimit:I


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1}, Landroidx/collection/MutableScatterSet;-><init>(IILkotlin/jvm/internal/w;)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Landroidx/collection/ScatterSet;-><init>(Lkotlin/jvm/internal/w;)V

    if-ltz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 3
    invoke-static {p1}, Landroidx/collection/ScatterMapKt;->unloadedCapacity(I)I

    move-result p1

    invoke-direct {p0, p1}, Landroidx/collection/MutableScatterSet;->initializeStorage(I)V

    return-void

    .line 4
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Capacity must be a positive value."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public synthetic constructor <init>(IILkotlin/jvm/internal/w;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x6

    .line 1
    :cond_0
    invoke-direct {p0, p1}, Landroidx/collection/MutableScatterSet;-><init>(I)V

    return-void
.end method

.method private final adjustStorage()V
    .locals 6

    .line 1
    iget v0, p0, Landroidx/collection/ScatterSet;->_capacity:I

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    if-le v0, v1, :cond_0

    .line 6
    .line 7
    iget v0, p0, Landroidx/collection/ScatterSet;->_size:I

    .line 8
    .line 9
    int-to-long v0, v0

    .line 10
    invoke-static {v0, v1}, Lkotlin/g2;->l(J)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    const-wide/16 v2, 0x20

    .line 15
    .line 16
    mul-long/2addr v0, v2

    .line 17
    invoke-static {v0, v1}, Lkotlin/g2;->l(J)J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    iget v2, p0, Landroidx/collection/ScatterSet;->_capacity:I

    .line 22
    .line 23
    int-to-long v2, v2

    .line 24
    invoke-static {v2, v3}, Lkotlin/g2;->l(J)J

    .line 25
    .line 26
    .line 27
    move-result-wide v2

    .line 28
    const-wide/16 v4, 0x19

    .line 29
    .line 30
    mul-long/2addr v2, v4

    .line 31
    invoke-static {v2, v3}, Lkotlin/g2;->l(J)J

    .line 32
    .line 33
    .line 34
    move-result-wide v2

    .line 35
    invoke-static {v0, v1, v2, v3}, Landroidx/collection/a;->a(JJ)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-gtz v0, :cond_0

    .line 40
    .line 41
    iget v0, p0, Landroidx/collection/ScatterSet;->_capacity:I

    .line 42
    .line 43
    invoke-static {v0}, Landroidx/collection/ScatterMapKt;->nextCapacity(I)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    invoke-direct {p0, v0}, Landroidx/collection/MutableScatterSet;->resizeStorage(I)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    iget v0, p0, Landroidx/collection/ScatterSet;->_capacity:I

    .line 52
    .line 53
    invoke-static {v0}, Landroidx/collection/ScatterMapKt;->nextCapacity(I)I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    invoke-direct {p0, v0}, Landroidx/collection/MutableScatterSet;->resizeStorage(I)V

    .line 58
    .line 59
    .line 60
    :goto_0
    return-void
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
.end method

.method private final findAbsoluteInsertIndex(Ljava/lang/Object;)I
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)I"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v3, 0x0

    .line 13
    :goto_0
    const v4, -0x3361d2af    # -8.2930312E7f

    .line 14
    .line 15
    .line 16
    mul-int/2addr v3, v4

    .line 17
    shl-int/lit8 v4, v3, 0x10

    .line 18
    .line 19
    xor-int/2addr v3, v4

    .line 20
    ushr-int/lit8 v4, v3, 0x7

    .line 21
    .line 22
    and-int/lit8 v3, v3, 0x7f

    .line 23
    .line 24
    iget v5, v0, Landroidx/collection/ScatterSet;->_capacity:I

    .line 25
    .line 26
    and-int v6, v4, v5

    .line 27
    .line 28
    const/4 v7, 0x0

    .line 29
    :goto_1
    iget-object v8, v0, Landroidx/collection/ScatterSet;->metadata:[J

    .line 30
    .line 31
    shr-int/lit8 v9, v6, 0x3

    .line 32
    .line 33
    and-int/lit8 v10, v6, 0x7

    .line 34
    .line 35
    shl-int/lit8 v10, v10, 0x3

    .line 36
    .line 37
    aget-wide v11, v8, v9

    .line 38
    .line 39
    ushr-long/2addr v11, v10

    .line 40
    const/4 v13, 0x1

    .line 41
    add-int/2addr v9, v13

    .line 42
    aget-wide v14, v8, v9

    .line 43
    .line 44
    rsub-int/lit8 v8, v10, 0x40

    .line 45
    .line 46
    shl-long v8, v14, v8

    .line 47
    .line 48
    int-to-long v14, v10

    .line 49
    neg-long v14, v14

    .line 50
    const/16 v10, 0x3f

    .line 51
    .line 52
    shr-long/2addr v14, v10

    .line 53
    and-long/2addr v8, v14

    .line 54
    or-long/2addr v8, v11

    .line 55
    int-to-long v10, v3

    .line 56
    const-wide v14, 0x101010101010101L

    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    mul-long v16, v10, v14

    .line 62
    .line 63
    move/from16 v18, v3

    .line 64
    .line 65
    xor-long v2, v8, v16

    .line 66
    .line 67
    sub-long v14, v2, v14

    .line 68
    .line 69
    not-long v2, v2

    .line 70
    and-long/2addr v2, v14

    .line 71
    const-wide v14, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    and-long/2addr v2, v14

    .line 77
    :goto_2
    const-wide/16 v16, 0x0

    .line 78
    .line 79
    cmp-long v19, v2, v16

    .line 80
    .line 81
    if-eqz v19, :cond_1

    .line 82
    .line 83
    move/from16 v19, v13

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_1
    const/16 v19, 0x0

    .line 87
    .line 88
    :goto_3
    if-eqz v19, :cond_3

    .line 89
    .line 90
    invoke-static {v2, v3}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 91
    .line 92
    .line 93
    move-result v16

    .line 94
    shr-int/lit8 v16, v16, 0x3

    .line 95
    .line 96
    add-int v16, v6, v16

    .line 97
    .line 98
    and-int v16, v16, v5

    .line 99
    .line 100
    iget-object v12, v0, Landroidx/collection/ScatterSet;->elements:[Ljava/lang/Object;

    .line 101
    .line 102
    aget-object v12, v12, v16

    .line 103
    .line 104
    invoke-static {v12, v1}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v12

    .line 108
    if-eqz v12, :cond_2

    .line 109
    .line 110
    return v16

    .line 111
    :cond_2
    const-wide/16 v16, 0x1

    .line 112
    .line 113
    sub-long v16, v2, v16

    .line 114
    .line 115
    and-long v2, v2, v16

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_3
    not-long v2, v8

    .line 119
    const/4 v12, 0x6

    .line 120
    shl-long/2addr v2, v12

    .line 121
    and-long/2addr v2, v8

    .line 122
    and-long/2addr v2, v14

    .line 123
    cmp-long v2, v2, v16

    .line 124
    .line 125
    if-eqz v2, :cond_7

    .line 126
    .line 127
    invoke-direct {v0, v4}, Landroidx/collection/MutableScatterSet;->findFirstAvailableSlot(I)I

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    iget v2, v0, Landroidx/collection/MutableScatterSet;->growthLimit:I

    .line 132
    .line 133
    const-wide/16 v5, 0xff

    .line 134
    .line 135
    if-nez v2, :cond_5

    .line 136
    .line 137
    iget-object v2, v0, Landroidx/collection/ScatterSet;->metadata:[J

    .line 138
    .line 139
    shr-int/lit8 v3, v1, 0x3

    .line 140
    .line 141
    aget-wide v7, v2, v3

    .line 142
    .line 143
    and-int/lit8 v2, v1, 0x7

    .line 144
    .line 145
    shl-int/lit8 v2, v2, 0x3

    .line 146
    .line 147
    shr-long v2, v7, v2

    .line 148
    .line 149
    and-long/2addr v2, v5

    .line 150
    const-wide/16 v7, 0xfe

    .line 151
    .line 152
    cmp-long v2, v2, v7

    .line 153
    .line 154
    if-nez v2, :cond_4

    .line 155
    .line 156
    move v2, v13

    .line 157
    goto :goto_4

    .line 158
    :cond_4
    const/4 v2, 0x0

    .line 159
    :goto_4
    if-nez v2, :cond_5

    .line 160
    .line 161
    invoke-direct/range {p0 .. p0}, Landroidx/collection/MutableScatterSet;->adjustStorage()V

    .line 162
    .line 163
    .line 164
    invoke-direct {v0, v4}, Landroidx/collection/MutableScatterSet;->findFirstAvailableSlot(I)I

    .line 165
    .line 166
    .line 167
    move-result v1

    .line 168
    :cond_5
    iget v2, v0, Landroidx/collection/ScatterSet;->_size:I

    .line 169
    .line 170
    add-int/2addr v2, v13

    .line 171
    iput v2, v0, Landroidx/collection/ScatterSet;->_size:I

    .line 172
    .line 173
    iget v2, v0, Landroidx/collection/MutableScatterSet;->growthLimit:I

    .line 174
    .line 175
    iget-object v3, v0, Landroidx/collection/ScatterSet;->metadata:[J

    .line 176
    .line 177
    shr-int/lit8 v4, v1, 0x3

    .line 178
    .line 179
    aget-wide v7, v3, v4

    .line 180
    .line 181
    and-int/lit8 v9, v1, 0x7

    .line 182
    .line 183
    shl-int/lit8 v9, v9, 0x3

    .line 184
    .line 185
    shr-long v14, v7, v9

    .line 186
    .line 187
    and-long/2addr v14, v5

    .line 188
    const-wide/16 v16, 0x80

    .line 189
    .line 190
    cmp-long v12, v14, v16

    .line 191
    .line 192
    if-nez v12, :cond_6

    .line 193
    .line 194
    move/from16 v19, v13

    .line 195
    .line 196
    goto :goto_5

    .line 197
    :cond_6
    const/16 v19, 0x0

    .line 198
    .line 199
    :goto_5
    sub-int v2, v2, v19

    .line 200
    .line 201
    iput v2, v0, Landroidx/collection/MutableScatterSet;->growthLimit:I

    .line 202
    .line 203
    shl-long v12, v5, v9

    .line 204
    .line 205
    not-long v12, v12

    .line 206
    and-long/2addr v7, v12

    .line 207
    shl-long v12, v10, v9

    .line 208
    .line 209
    or-long/2addr v7, v12

    .line 210
    aput-wide v7, v3, v4

    .line 211
    .line 212
    iget v2, v0, Landroidx/collection/ScatterSet;->_capacity:I

    .line 213
    .line 214
    add-int/lit8 v4, v1, -0x7

    .line 215
    .line 216
    and-int/2addr v4, v2

    .line 217
    and-int/lit8 v2, v2, 0x7

    .line 218
    .line 219
    add-int/2addr v4, v2

    .line 220
    shr-int/lit8 v2, v4, 0x3

    .line 221
    .line 222
    and-int/lit8 v4, v4, 0x7

    .line 223
    .line 224
    shl-int/lit8 v4, v4, 0x3

    .line 225
    .line 226
    aget-wide v7, v3, v2

    .line 227
    .line 228
    shl-long/2addr v5, v4

    .line 229
    not-long v5, v5

    .line 230
    and-long/2addr v5, v7

    .line 231
    shl-long v7, v10, v4

    .line 232
    .line 233
    or-long v4, v5, v7

    .line 234
    .line 235
    aput-wide v4, v3, v2

    .line 236
    .line 237
    return v1

    .line 238
    :cond_7
    add-int/lit8 v7, v7, 0x8

    .line 239
    .line 240
    add-int/2addr v6, v7

    .line 241
    and-int/2addr v6, v5

    .line 242
    move/from16 v3, v18

    .line 243
    .line 244
    goto/16 :goto_1
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

.method private final findFirstAvailableSlot(I)I
    .locals 9

    .line 1
    iget v0, p0, Landroidx/collection/ScatterSet;->_capacity:I

    .line 2
    .line 3
    and-int/2addr p1, v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    iget-object v2, p0, Landroidx/collection/ScatterSet;->metadata:[J

    .line 6
    .line 7
    shr-int/lit8 v3, p1, 0x3

    .line 8
    .line 9
    and-int/lit8 v4, p1, 0x7

    .line 10
    .line 11
    shl-int/lit8 v4, v4, 0x3

    .line 12
    .line 13
    aget-wide v5, v2, v3

    .line 14
    .line 15
    ushr-long/2addr v5, v4

    .line 16
    add-int/lit8 v3, v3, 0x1

    .line 17
    .line 18
    aget-wide v7, v2, v3

    .line 19
    .line 20
    rsub-int/lit8 v2, v4, 0x40

    .line 21
    .line 22
    shl-long v2, v7, v2

    .line 23
    .line 24
    int-to-long v7, v4

    .line 25
    neg-long v7, v7

    .line 26
    const/16 v4, 0x3f

    .line 27
    .line 28
    shr-long/2addr v7, v4

    .line 29
    and-long/2addr v2, v7

    .line 30
    or-long/2addr v2, v5

    .line 31
    not-long v4, v2

    .line 32
    const/4 v6, 0x7

    .line 33
    shl-long/2addr v4, v6

    .line 34
    and-long/2addr v2, v4

    .line 35
    const-wide v4, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    and-long/2addr v2, v4

    .line 41
    const-wide/16 v4, 0x0

    .line 42
    .line 43
    cmp-long v4, v2, v4

    .line 44
    .line 45
    if-eqz v4, :cond_0

    .line 46
    .line 47
    invoke-static {v2, v3}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    shr-int/lit8 v1, v1, 0x3

    .line 52
    .line 53
    add-int/2addr p1, v1

    .line 54
    and-int/2addr p1, v0

    .line 55
    return p1

    .line 56
    :cond_0
    add-int/lit8 v1, v1, 0x8

    .line 57
    .line 58
    add-int/2addr p1, v1

    .line 59
    and-int/2addr p1, v0

    .line 60
    goto :goto_0
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
.end method

.method private final initializeGrowth()V
    .locals 2

    invoke-virtual {p0}, Landroidx/collection/ScatterSet;->getCapacity()I

    move-result v0

    invoke-static {v0}, Landroidx/collection/ScatterMapKt;->loadedCapacity(I)I

    move-result v0

    iget v1, p0, Landroidx/collection/ScatterSet;->_size:I

    sub-int/2addr v0, v1

    iput v0, p0, Landroidx/collection/MutableScatterSet;->growthLimit:I

    return-void
.end method

.method private final initializeMetadata(I)V
    .locals 8

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object v0, Landroidx/collection/ScatterMapKt;->EmptyGroup:[J

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    add-int/lit8 v0, p1, 0x1

    .line 7
    .line 8
    add-int/lit8 v0, v0, 0x7

    .line 9
    .line 10
    add-int/lit8 v0, v0, 0x7

    .line 11
    .line 12
    and-int/lit8 v0, v0, -0x8

    .line 13
    .line 14
    shr-int/lit8 v0, v0, 0x3

    .line 15
    .line 16
    new-array v0, v0, [J

    .line 17
    .line 18
    const-wide v2, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    const/4 v5, 0x0

    .line 25
    const/4 v6, 0x6

    .line 26
    const/4 v7, 0x0

    .line 27
    move-object v1, v0

    .line 28
    invoke-static/range {v1 .. v7}, Lkotlin/collections/l;->U1([JJIIILjava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iput-object v0, p0, Landroidx/collection/ScatterSet;->metadata:[J

    .line 32
    .line 33
    shr-int/lit8 v1, p1, 0x3

    .line 34
    .line 35
    and-int/lit8 p1, p1, 0x7

    .line 36
    .line 37
    shl-int/lit8 p1, p1, 0x3

    .line 38
    .line 39
    aget-wide v2, v0, v1

    .line 40
    .line 41
    const-wide/16 v4, 0xff

    .line 42
    .line 43
    shl-long/2addr v4, p1

    .line 44
    not-long v6, v4

    .line 45
    and-long/2addr v2, v6

    .line 46
    or-long/2addr v2, v4

    .line 47
    aput-wide v2, v0, v1

    .line 48
    .line 49
    invoke-direct {p0}, Landroidx/collection/MutableScatterSet;->initializeGrowth()V

    .line 50
    .line 51
    .line 52
    return-void
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
.end method

.method private final initializeStorage(I)V
    .locals 1

    .line 1
    if-lez p1, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x7

    .line 4
    invoke-static {p1}, Landroidx/collection/ScatterMapKt;->normalizeCapacity(I)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    :goto_0
    iput p1, p0, Landroidx/collection/ScatterSet;->_capacity:I

    .line 15
    .line 16
    invoke-direct {p0, p1}, Landroidx/collection/MutableScatterSet;->initializeMetadata(I)V

    .line 17
    .line 18
    .line 19
    new-array p1, p1, [Ljava/lang/Object;

    .line 20
    .line 21
    iput-object p1, p0, Landroidx/collection/ScatterSet;->elements:[Ljava/lang/Object;

    .line 22
    .line 23
    return-void
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

.method private final resizeStorage(I)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/collection/ScatterSet;->metadata:[J

    .line 4
    .line 5
    iget-object v2, v0, Landroidx/collection/ScatterSet;->elements:[Ljava/lang/Object;

    .line 6
    .line 7
    iget v3, v0, Landroidx/collection/ScatterSet;->_capacity:I

    .line 8
    .line 9
    invoke-direct/range {p0 .. p1}, Landroidx/collection/MutableScatterSet;->initializeStorage(I)V

    .line 10
    .line 11
    .line 12
    iget-object v4, v0, Landroidx/collection/ScatterSet;->elements:[Ljava/lang/Object;

    .line 13
    .line 14
    const/4 v6, 0x0

    .line 15
    :goto_0
    if-ge v6, v3, :cond_3

    .line 16
    .line 17
    shr-int/lit8 v7, v6, 0x3

    .line 18
    .line 19
    aget-wide v7, v1, v7

    .line 20
    .line 21
    and-int/lit8 v9, v6, 0x7

    .line 22
    .line 23
    shl-int/lit8 v9, v9, 0x3

    .line 24
    .line 25
    shr-long/2addr v7, v9

    .line 26
    const-wide/16 v9, 0xff

    .line 27
    .line 28
    and-long/2addr v7, v9

    .line 29
    const-wide/16 v11, 0x80

    .line 30
    .line 31
    cmp-long v7, v7, v11

    .line 32
    .line 33
    if-gez v7, :cond_0

    .line 34
    .line 35
    const/4 v7, 0x1

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    const/4 v7, 0x0

    .line 38
    :goto_1
    if-eqz v7, :cond_2

    .line 39
    .line 40
    aget-object v7, v2, v6

    .line 41
    .line 42
    if-eqz v7, :cond_1

    .line 43
    .line 44
    invoke-virtual {v7}, Ljava/lang/Object;->hashCode()I

    .line 45
    .line 46
    .line 47
    move-result v8

    .line 48
    goto :goto_2

    .line 49
    :cond_1
    const/4 v8, 0x0

    .line 50
    :goto_2
    const v11, -0x3361d2af    # -8.2930312E7f

    .line 51
    .line 52
    .line 53
    mul-int/2addr v8, v11

    .line 54
    shl-int/lit8 v11, v8, 0x10

    .line 55
    .line 56
    xor-int/2addr v8, v11

    .line 57
    ushr-int/lit8 v11, v8, 0x7

    .line 58
    .line 59
    invoke-direct {v0, v11}, Landroidx/collection/MutableScatterSet;->findFirstAvailableSlot(I)I

    .line 60
    .line 61
    .line 62
    move-result v11

    .line 63
    and-int/lit8 v8, v8, 0x7f

    .line 64
    .line 65
    int-to-long v12, v8

    .line 66
    iget-object v8, v0, Landroidx/collection/ScatterSet;->metadata:[J

    .line 67
    .line 68
    shr-int/lit8 v14, v11, 0x3

    .line 69
    .line 70
    and-int/lit8 v15, v11, 0x7

    .line 71
    .line 72
    shl-int/lit8 v15, v15, 0x3

    .line 73
    .line 74
    aget-wide v16, v8, v14

    .line 75
    .line 76
    move/from16 v18, v6

    .line 77
    .line 78
    shl-long v5, v9, v15

    .line 79
    .line 80
    not-long v5, v5

    .line 81
    and-long v5, v16, v5

    .line 82
    .line 83
    shl-long v15, v12, v15

    .line 84
    .line 85
    or-long/2addr v5, v15

    .line 86
    aput-wide v5, v8, v14

    .line 87
    .line 88
    iget v5, v0, Landroidx/collection/ScatterSet;->_capacity:I

    .line 89
    .line 90
    add-int/lit8 v6, v11, -0x7

    .line 91
    .line 92
    and-int/2addr v6, v5

    .line 93
    and-int/lit8 v5, v5, 0x7

    .line 94
    .line 95
    add-int/2addr v6, v5

    .line 96
    shr-int/lit8 v5, v6, 0x3

    .line 97
    .line 98
    and-int/lit8 v6, v6, 0x7

    .line 99
    .line 100
    shl-int/lit8 v6, v6, 0x3

    .line 101
    .line 102
    aget-wide v14, v8, v5

    .line 103
    .line 104
    shl-long/2addr v9, v6

    .line 105
    not-long v9, v9

    .line 106
    and-long/2addr v9, v14

    .line 107
    shl-long/2addr v12, v6

    .line 108
    or-long/2addr v9, v12

    .line 109
    aput-wide v9, v8, v5

    .line 110
    .line 111
    aput-object v7, v4, v11

    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_2
    move/from16 v18, v6

    .line 115
    .line 116
    :goto_3
    add-int/lit8 v6, v18, 0x1

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_3
    return-void
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

.method private final writeMetadata(IJ)V
    .locals 9

    .line 1
    iget-object v0, p0, Landroidx/collection/ScatterSet;->metadata:[J

    .line 2
    .line 3
    shr-int/lit8 v1, p1, 0x3

    .line 4
    .line 5
    and-int/lit8 v2, p1, 0x7

    .line 6
    .line 7
    shl-int/lit8 v2, v2, 0x3

    .line 8
    .line 9
    aget-wide v3, v0, v1

    .line 10
    .line 11
    const-wide/16 v5, 0xff

    .line 12
    .line 13
    shl-long v7, v5, v2

    .line 14
    .line 15
    not-long v7, v7

    .line 16
    and-long/2addr v3, v7

    .line 17
    shl-long v7, p2, v2

    .line 18
    .line 19
    or-long v2, v3, v7

    .line 20
    .line 21
    aput-wide v2, v0, v1

    .line 22
    .line 23
    iget v1, p0, Landroidx/collection/ScatterSet;->_capacity:I

    .line 24
    .line 25
    add-int/lit8 p1, p1, -0x7

    .line 26
    .line 27
    and-int/2addr p1, v1

    .line 28
    and-int/lit8 v1, v1, 0x7

    .line 29
    .line 30
    add-int/2addr p1, v1

    .line 31
    shr-int/lit8 v1, p1, 0x3

    .line 32
    .line 33
    and-int/lit8 p1, p1, 0x7

    .line 34
    .line 35
    shl-int/lit8 p1, p1, 0x3

    .line 36
    .line 37
    aget-wide v2, v0, v1

    .line 38
    .line 39
    shl-long v4, v5, p1

    .line 40
    .line 41
    not-long v4, v4

    .line 42
    and-long/2addr v2, v4

    .line 43
    shl-long p1, p2, p1

    .line 44
    .line 45
    or-long/2addr p1, v2

    .line 46
    aput-wide p1, v0, v1

    .line 47
    .line 48
    return-void
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


# virtual methods
.method public final add(Ljava/lang/Object;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)Z"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/collection/ScatterSet;->getSize()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-direct {p0, p1}, Landroidx/collection/MutableScatterSet;->findAbsoluteInsertIndex(Ljava/lang/Object;)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget-object v2, p0, Landroidx/collection/ScatterSet;->elements:[Ljava/lang/Object;

    .line 10
    .line 11
    aput-object p1, v2, v1

    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/collection/ScatterSet;->getSize()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eq p1, v0, :cond_0

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    :goto_0
    return p1
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

.method public final addAll(Landroidx/collection/ObjectList;)Z
    .locals 1
    .param p1    # Landroidx/collection/ObjectList;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/ObjectList<",
            "TE;>;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-virtual {p0}, Landroidx/collection/ScatterSet;->getSize()I

    move-result v0

    .line 14
    invoke-virtual {p0, p1}, Landroidx/collection/MutableScatterSet;->plusAssign(Landroidx/collection/ObjectList;)V

    .line 15
    invoke-virtual {p0}, Landroidx/collection/ScatterSet;->getSize()I

    move-result p1

    if-eq v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final addAll(Landroidx/collection/ScatterSet;)Z
    .locals 1
    .param p1    # Landroidx/collection/ScatterSet;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/ScatterSet<",
            "TE;>;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-virtual {p0}, Landroidx/collection/ScatterSet;->getSize()I

    move-result v0

    .line 11
    invoke-virtual {p0, p1}, Landroidx/collection/MutableScatterSet;->plusAssign(Landroidx/collection/ScatterSet;)V

    .line 12
    invoke-virtual {p0}, Landroidx/collection/ScatterSet;->getSize()I

    move-result p1

    if-eq v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final addAll(Ljava/lang/Iterable;)Z
    .locals 1
    .param p1    # Ljava/lang/Iterable;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+TE;>;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-virtual {p0}, Landroidx/collection/ScatterSet;->getSize()I

    move-result v0

    .line 5
    invoke-virtual {p0, p1}, Landroidx/collection/MutableScatterSet;->plusAssign(Ljava/lang/Iterable;)V

    .line 6
    invoke-virtual {p0}, Landroidx/collection/ScatterSet;->getSize()I

    move-result p1

    if-eq v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final addAll(Lkotlin/sequences/m;)Z
    .locals 1
    .param p1    # Lkotlin/sequences/m;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/sequences/m<",
            "+TE;>;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-virtual {p0}, Landroidx/collection/ScatterSet;->getSize()I

    move-result v0

    .line 8
    invoke-virtual {p0, p1}, Landroidx/collection/MutableScatterSet;->plusAssign(Lkotlin/sequences/m;)V

    .line 9
    invoke-virtual {p0}, Landroidx/collection/ScatterSet;->getSize()I

    move-result p1

    if-eq v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final addAll([Ljava/lang/Object;)Z
    .locals 1
    .param p1    # [Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TE;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Landroidx/collection/ScatterSet;->getSize()I

    move-result v0

    .line 2
    invoke-virtual {p0, p1}, Landroidx/collection/MutableScatterSet;->plusAssign([Ljava/lang/Object;)V

    .line 3
    invoke-virtual {p0}, Landroidx/collection/ScatterSet;->getSize()I

    move-result p1

    if-eq v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final asMutableSet()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "TE;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Landroidx/collection/MutableScatterSet$MutableSetWrapper;

    invoke-direct {v0, p0}, Landroidx/collection/MutableScatterSet$MutableSetWrapper;-><init>(Landroidx/collection/MutableScatterSet;)V

    return-object v0
.end method

.method public final clear()V
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Landroidx/collection/ScatterSet;->_size:I

    .line 3
    .line 4
    iget-object v1, p0, Landroidx/collection/ScatterSet;->metadata:[J

    .line 5
    .line 6
    sget-object v2, Landroidx/collection/ScatterMapKt;->EmptyGroup:[J

    .line 7
    .line 8
    if-eq v1, v2, :cond_0

    .line 9
    .line 10
    const-wide v2, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    const/4 v5, 0x0

    .line 17
    const/4 v6, 0x6

    .line 18
    const/4 v7, 0x0

    .line 19
    invoke-static/range {v1 .. v7}, Lkotlin/collections/l;->U1([JJIIILjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Landroidx/collection/ScatterSet;->metadata:[J

    .line 23
    .line 24
    iget v2, p0, Landroidx/collection/ScatterSet;->_capacity:I

    .line 25
    .line 26
    shr-int/lit8 v3, v2, 0x3

    .line 27
    .line 28
    and-int/lit8 v2, v2, 0x7

    .line 29
    .line 30
    shl-int/lit8 v2, v2, 0x3

    .line 31
    .line 32
    aget-wide v4, v1, v3

    .line 33
    .line 34
    const-wide/16 v6, 0xff

    .line 35
    .line 36
    shl-long/2addr v6, v2

    .line 37
    not-long v8, v6

    .line 38
    and-long/2addr v4, v8

    .line 39
    or-long/2addr v4, v6

    .line 40
    aput-wide v4, v1, v3

    .line 41
    .line 42
    :cond_0
    iget-object v1, p0, Landroidx/collection/ScatterSet;->elements:[Ljava/lang/Object;

    .line 43
    .line 44
    const/4 v2, 0x0

    .line 45
    iget v3, p0, Landroidx/collection/ScatterSet;->_capacity:I

    .line 46
    .line 47
    invoke-static {v1, v2, v0, v3}, Lkotlin/collections/l;->M1([Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 48
    .line 49
    .line 50
    invoke-direct {p0}, Landroidx/collection/MutableScatterSet;->initializeGrowth()V

    .line 51
    .line 52
    .line 53
    return-void
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
.end method

.method public final minusAssign(Landroidx/collection/ObjectList;)V
    .locals 3
    .param p1    # Landroidx/collection/ObjectList;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/ObjectList<",
            "TE;>;)V"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    iget-object v0, p1, Landroidx/collection/ObjectList;->content:[Ljava/lang/Object;

    .line 21
    iget p1, p1, Landroidx/collection/ObjectList;->_size:I

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_0

    .line 22
    aget-object v2, v0, v1

    .line 23
    invoke-virtual {p0, v2}, Landroidx/collection/MutableScatterSet;->minusAssign(Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final minusAssign(Landroidx/collection/ScatterSet;)V
    .locals 13
    .param p1    # Landroidx/collection/ScatterSet;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/ScatterSet<",
            "TE;>;)V"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    iget-object v0, p1, Landroidx/collection/ScatterSet;->elements:[Ljava/lang/Object;

    .line 15
    iget-object p1, p1, Landroidx/collection/ScatterSet;->metadata:[J

    .line 16
    array-length v1, p1

    add-int/lit8 v1, v1, -0x2

    if-ltz v1, :cond_4

    const/4 v2, 0x0

    move v3, v2

    .line 17
    :goto_0
    aget-wide v4, p1, v3

    not-long v6, v4

    const/4 v8, 0x7

    shl-long/2addr v6, v8

    and-long/2addr v6, v4

    const-wide v8, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v6, v8

    cmp-long v6, v6, v8

    if-eqz v6, :cond_3

    sub-int v6, v3, v1

    not-int v6, v6

    ushr-int/lit8 v6, v6, 0x1f

    const/16 v7, 0x8

    rsub-int/lit8 v6, v6, 0x8

    move v8, v2

    :goto_1
    if-ge v8, v6, :cond_2

    const-wide/16 v9, 0xff

    and-long/2addr v9, v4

    const-wide/16 v11, 0x80

    cmp-long v9, v9, v11

    if-gez v9, :cond_0

    const/4 v9, 0x1

    goto :goto_2

    :cond_0
    move v9, v2

    :goto_2
    if-eqz v9, :cond_1

    shl-int/lit8 v9, v3, 0x3

    add-int/2addr v9, v8

    .line 18
    aget-object v9, v0, v9

    .line 19
    invoke-virtual {p0, v9}, Landroidx/collection/MutableScatterSet;->minusAssign(Ljava/lang/Object;)V

    :cond_1
    shr-long/2addr v4, v7

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_2
    if-ne v6, v7, :cond_4

    :cond_3
    if-eq v3, v1, :cond_4

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    return-void
.end method

.method public final minusAssign(Ljava/lang/Iterable;)V
    .locals 1
    .param p1    # Ljava/lang/Iterable;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+TE;>;)V"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 13
    invoke-virtual {p0, v0}, Landroidx/collection/MutableScatterSet;->minusAssign(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final minusAssign(Ljava/lang/Object;)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 1
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto :goto_0

    :cond_0
    move v3, v2

    :goto_0
    const v4, -0x3361d2af    # -8.2930312E7f

    mul-int/2addr v3, v4

    shl-int/lit8 v4, v3, 0x10

    xor-int/2addr v3, v4

    and-int/lit8 v4, v3, 0x7f

    .line 2
    iget v5, v0, Landroidx/collection/ScatterSet;->_capacity:I

    ushr-int/lit8 v3, v3, 0x7

    and-int/2addr v3, v5

    move v6, v2

    .line 3
    :goto_1
    iget-object v7, v0, Landroidx/collection/ScatterSet;->metadata:[J

    shr-int/lit8 v8, v3, 0x3

    and-int/lit8 v9, v3, 0x7

    shl-int/lit8 v9, v9, 0x3

    .line 4
    aget-wide v10, v7, v8

    ushr-long/2addr v10, v9

    const/4 v12, 0x1

    add-int/2addr v8, v12

    aget-wide v13, v7, v8

    rsub-int/lit8 v7, v9, 0x40

    shl-long v7, v13, v7

    int-to-long v13, v9

    neg-long v13, v13

    const/16 v9, 0x3f

    shr-long/2addr v13, v9

    and-long/2addr v7, v13

    or-long/2addr v7, v10

    int-to-long v9, v4

    const-wide v13, 0x101010101010101L

    mul-long/2addr v9, v13

    xor-long/2addr v9, v7

    sub-long v13, v9, v13

    not-long v9, v9

    and-long/2addr v9, v13

    const-wide v13, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v9, v13

    :goto_2
    const-wide/16 v15, 0x0

    cmp-long v11, v9, v15

    if-eqz v11, :cond_1

    move v11, v12

    goto :goto_3

    :cond_1
    move v11, v2

    :goto_3
    if-eqz v11, :cond_3

    .line 5
    invoke-static {v9, v10}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    move-result v11

    shr-int/lit8 v11, v11, 0x3

    add-int/2addr v11, v3

    and-int/2addr v11, v5

    .line 6
    iget-object v15, v0, Landroidx/collection/ScatterSet;->elements:[Ljava/lang/Object;

    aget-object v15, v15, v11

    invoke-static {v15, v1}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_2

    goto :goto_4

    :cond_2
    const-wide/16 v15, 0x1

    sub-long v15, v9, v15

    and-long/2addr v9, v15

    goto :goto_2

    :cond_3
    not-long v9, v7

    const/4 v11, 0x6

    shl-long/2addr v9, v11

    and-long/2addr v7, v9

    and-long/2addr v7, v13

    cmp-long v7, v7, v15

    if-eqz v7, :cond_5

    const/4 v11, -0x1

    :goto_4
    if-ltz v11, :cond_4

    .line 7
    invoke-virtual {v0, v11}, Landroidx/collection/MutableScatterSet;->removeElementAt(I)V

    :cond_4
    return-void

    :cond_5
    add-int/lit8 v6, v6, 0x8

    add-int/2addr v3, v6

    and-int/2addr v3, v5

    goto :goto_1
.end method

.method public final minusAssign(Lkotlin/sequences/m;)V
    .locals 1
    .param p1    # Lkotlin/sequences/m;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/sequences/m<",
            "+TE;>;)V"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-interface {p1}, Lkotlin/sequences/m;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 11
    invoke-virtual {p0, v0}, Landroidx/collection/MutableScatterSet;->minusAssign(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final minusAssign([Ljava/lang/Object;)V
    .locals 3
    .param p1    # [Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TE;)V"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p1, v1

    .line 9
    invoke-virtual {p0, v2}, Landroidx/collection/MutableScatterSet;->minusAssign(Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final plusAssign(Landroidx/collection/ObjectList;)V
    .locals 3
    .param p1    # Landroidx/collection/ObjectList;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/ObjectList<",
            "TE;>;)V"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    iget-object v0, p1, Landroidx/collection/ObjectList;->content:[Ljava/lang/Object;

    .line 16
    iget p1, p1, Landroidx/collection/ObjectList;->_size:I

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_0

    .line 17
    aget-object v2, v0, v1

    .line 18
    invoke-virtual {p0, v2}, Landroidx/collection/MutableScatterSet;->plusAssign(Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final plusAssign(Landroidx/collection/ScatterSet;)V
    .locals 13
    .param p1    # Landroidx/collection/ScatterSet;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/ScatterSet<",
            "TE;>;)V"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    iget-object v0, p1, Landroidx/collection/ScatterSet;->elements:[Ljava/lang/Object;

    .line 10
    iget-object p1, p1, Landroidx/collection/ScatterSet;->metadata:[J

    .line 11
    array-length v1, p1

    add-int/lit8 v1, v1, -0x2

    if-ltz v1, :cond_4

    const/4 v2, 0x0

    move v3, v2

    .line 12
    :goto_0
    aget-wide v4, p1, v3

    not-long v6, v4

    const/4 v8, 0x7

    shl-long/2addr v6, v8

    and-long/2addr v6, v4

    const-wide v8, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v6, v8

    cmp-long v6, v6, v8

    if-eqz v6, :cond_3

    sub-int v6, v3, v1

    not-int v6, v6

    ushr-int/lit8 v6, v6, 0x1f

    const/16 v7, 0x8

    rsub-int/lit8 v6, v6, 0x8

    move v8, v2

    :goto_1
    if-ge v8, v6, :cond_2

    const-wide/16 v9, 0xff

    and-long/2addr v9, v4

    const-wide/16 v11, 0x80

    cmp-long v9, v9, v11

    if-gez v9, :cond_0

    const/4 v9, 0x1

    goto :goto_2

    :cond_0
    move v9, v2

    :goto_2
    if-eqz v9, :cond_1

    shl-int/lit8 v9, v3, 0x3

    add-int/2addr v9, v8

    .line 13
    aget-object v9, v0, v9

    .line 14
    invoke-virtual {p0, v9}, Landroidx/collection/MutableScatterSet;->plusAssign(Ljava/lang/Object;)V

    :cond_1
    shr-long/2addr v4, v7

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_2
    if-ne v6, v7, :cond_4

    :cond_3
    if-eq v3, v1, :cond_4

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    return-void
.end method

.method public final plusAssign(Ljava/lang/Iterable;)V
    .locals 1
    .param p1    # Ljava/lang/Iterable;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+TE;>;)V"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 6
    invoke-virtual {p0, v0}, Landroidx/collection/MutableScatterSet;->plusAssign(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final plusAssign(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Landroidx/collection/MutableScatterSet;->findAbsoluteInsertIndex(Ljava/lang/Object;)I

    move-result v0

    .line 2
    iget-object v1, p0, Landroidx/collection/ScatterSet;->elements:[Ljava/lang/Object;

    aput-object p1, v1, v0

    return-void
.end method

.method public final plusAssign(Lkotlin/sequences/m;)V
    .locals 1
    .param p1    # Lkotlin/sequences/m;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/sequences/m<",
            "+TE;>;)V"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-interface {p1}, Lkotlin/sequences/m;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 8
    invoke-virtual {p0, v0}, Landroidx/collection/MutableScatterSet;->plusAssign(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final plusAssign([Ljava/lang/Object;)V
    .locals 3
    .param p1    # [Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TE;)V"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p1, v1

    .line 4
    invoke-virtual {p0, v2}, Landroidx/collection/MutableScatterSet;->plusAssign(Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)Z"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v3, v2

    .line 14
    :goto_0
    const v4, -0x3361d2af    # -8.2930312E7f

    .line 15
    .line 16
    .line 17
    mul-int/2addr v3, v4

    .line 18
    shl-int/lit8 v4, v3, 0x10

    .line 19
    .line 20
    xor-int/2addr v3, v4

    .line 21
    and-int/lit8 v4, v3, 0x7f

    .line 22
    .line 23
    iget v5, v0, Landroidx/collection/ScatterSet;->_capacity:I

    .line 24
    .line 25
    ushr-int/lit8 v3, v3, 0x7

    .line 26
    .line 27
    and-int/2addr v3, v5

    .line 28
    move v6, v2

    .line 29
    :goto_1
    iget-object v7, v0, Landroidx/collection/ScatterSet;->metadata:[J

    .line 30
    .line 31
    shr-int/lit8 v8, v3, 0x3

    .line 32
    .line 33
    and-int/lit8 v9, v3, 0x7

    .line 34
    .line 35
    shl-int/lit8 v9, v9, 0x3

    .line 36
    .line 37
    aget-wide v10, v7, v8

    .line 38
    .line 39
    ushr-long/2addr v10, v9

    .line 40
    const/4 v12, 0x1

    .line 41
    add-int/2addr v8, v12

    .line 42
    aget-wide v13, v7, v8

    .line 43
    .line 44
    rsub-int/lit8 v7, v9, 0x40

    .line 45
    .line 46
    shl-long v7, v13, v7

    .line 47
    .line 48
    int-to-long v13, v9

    .line 49
    neg-long v13, v13

    .line 50
    const/16 v9, 0x3f

    .line 51
    .line 52
    shr-long/2addr v13, v9

    .line 53
    and-long/2addr v7, v13

    .line 54
    or-long/2addr v7, v10

    .line 55
    int-to-long v9, v4

    .line 56
    const-wide v13, 0x101010101010101L

    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    mul-long/2addr v9, v13

    .line 62
    xor-long/2addr v9, v7

    .line 63
    sub-long v13, v9, v13

    .line 64
    .line 65
    not-long v9, v9

    .line 66
    and-long/2addr v9, v13

    .line 67
    const-wide v13, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    and-long/2addr v9, v13

    .line 73
    :goto_2
    const-wide/16 v15, 0x0

    .line 74
    .line 75
    cmp-long v11, v9, v15

    .line 76
    .line 77
    if-eqz v11, :cond_1

    .line 78
    .line 79
    move v11, v12

    .line 80
    goto :goto_3

    .line 81
    :cond_1
    move v11, v2

    .line 82
    :goto_3
    if-eqz v11, :cond_3

    .line 83
    .line 84
    invoke-static {v9, v10}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 85
    .line 86
    .line 87
    move-result v11

    .line 88
    shr-int/lit8 v11, v11, 0x3

    .line 89
    .line 90
    add-int/2addr v11, v3

    .line 91
    and-int/2addr v11, v5

    .line 92
    iget-object v15, v0, Landroidx/collection/ScatterSet;->elements:[Ljava/lang/Object;

    .line 93
    .line 94
    aget-object v15, v15, v11

    .line 95
    .line 96
    invoke-static {v15, v1}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v15

    .line 100
    if-eqz v15, :cond_2

    .line 101
    .line 102
    goto :goto_4

    .line 103
    :cond_2
    const-wide/16 v15, 0x1

    .line 104
    .line 105
    sub-long v15, v9, v15

    .line 106
    .line 107
    and-long/2addr v9, v15

    .line 108
    goto :goto_2

    .line 109
    :cond_3
    not-long v9, v7

    .line 110
    const/4 v11, 0x6

    .line 111
    shl-long/2addr v9, v11

    .line 112
    and-long/2addr v7, v9

    .line 113
    and-long/2addr v7, v13

    .line 114
    cmp-long v7, v7, v15

    .line 115
    .line 116
    if-eqz v7, :cond_6

    .line 117
    .line 118
    const/4 v11, -0x1

    .line 119
    :goto_4
    if-ltz v11, :cond_4

    .line 120
    .line 121
    move v2, v12

    .line 122
    :cond_4
    if-eqz v2, :cond_5

    .line 123
    .line 124
    invoke-virtual {v0, v11}, Landroidx/collection/MutableScatterSet;->removeElementAt(I)V

    .line 125
    .line 126
    .line 127
    :cond_5
    return v2

    .line 128
    :cond_6
    add-int/lit8 v6, v6, 0x8

    .line 129
    .line 130
    add-int/2addr v3, v6

    .line 131
    and-int/2addr v3, v5

    .line 132
    goto :goto_1
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

.method public final removeAll(Landroidx/collection/ObjectList;)Z
    .locals 1
    .param p1    # Landroidx/collection/ObjectList;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/ObjectList<",
            "TE;>;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-virtual {p0}, Landroidx/collection/ScatterSet;->getSize()I

    move-result v0

    .line 14
    invoke-virtual {p0, p1}, Landroidx/collection/MutableScatterSet;->minusAssign(Landroidx/collection/ObjectList;)V

    .line 15
    invoke-virtual {p0}, Landroidx/collection/ScatterSet;->getSize()I

    move-result p1

    if-eq v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final removeAll(Landroidx/collection/ScatterSet;)Z
    .locals 1
    .param p1    # Landroidx/collection/ScatterSet;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/ScatterSet<",
            "TE;>;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-virtual {p0}, Landroidx/collection/ScatterSet;->getSize()I

    move-result v0

    .line 11
    invoke-virtual {p0, p1}, Landroidx/collection/MutableScatterSet;->minusAssign(Landroidx/collection/ScatterSet;)V

    .line 12
    invoke-virtual {p0}, Landroidx/collection/ScatterSet;->getSize()I

    move-result p1

    if-eq v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final removeAll(Ljava/lang/Iterable;)Z
    .locals 1
    .param p1    # Ljava/lang/Iterable;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+TE;>;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-virtual {p0}, Landroidx/collection/ScatterSet;->getSize()I

    move-result v0

    .line 8
    invoke-virtual {p0, p1}, Landroidx/collection/MutableScatterSet;->minusAssign(Ljava/lang/Iterable;)V

    .line 9
    invoke-virtual {p0}, Landroidx/collection/ScatterSet;->getSize()I

    move-result p1

    if-eq v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final removeAll(Lkotlin/sequences/m;)Z
    .locals 1
    .param p1    # Lkotlin/sequences/m;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/sequences/m<",
            "+TE;>;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-virtual {p0}, Landroidx/collection/ScatterSet;->getSize()I

    move-result v0

    .line 5
    invoke-virtual {p0, p1}, Landroidx/collection/MutableScatterSet;->minusAssign(Lkotlin/sequences/m;)V

    .line 6
    invoke-virtual {p0}, Landroidx/collection/ScatterSet;->getSize()I

    move-result p1

    if-eq v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final removeAll([Ljava/lang/Object;)Z
    .locals 1
    .param p1    # [Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TE;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Landroidx/collection/ScatterSet;->getSize()I

    move-result v0

    .line 2
    invoke-virtual {p0, p1}, Landroidx/collection/MutableScatterSet;->minusAssign([Ljava/lang/Object;)V

    .line 3
    invoke-virtual {p0}, Landroidx/collection/ScatterSet;->getSize()I

    move-result p1

    if-eq v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final removeElementAt(I)V
    .locals 11
    .annotation build Lkotlin/a1;
    .end annotation

    .line 1
    iget v0, p0, Landroidx/collection/ScatterSet;->_size:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    iput v0, p0, Landroidx/collection/ScatterSet;->_size:I

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/collection/ScatterSet;->metadata:[J

    .line 8
    .line 9
    shr-int/lit8 v1, p1, 0x3

    .line 10
    .line 11
    and-int/lit8 v2, p1, 0x7

    .line 12
    .line 13
    shl-int/lit8 v2, v2, 0x3

    .line 14
    .line 15
    aget-wide v3, v0, v1

    .line 16
    .line 17
    const-wide/16 v5, 0xff

    .line 18
    .line 19
    shl-long v7, v5, v2

    .line 20
    .line 21
    not-long v7, v7

    .line 22
    and-long/2addr v3, v7

    .line 23
    const-wide/16 v7, 0xfe

    .line 24
    .line 25
    shl-long v9, v7, v2

    .line 26
    .line 27
    or-long v2, v3, v9

    .line 28
    .line 29
    aput-wide v2, v0, v1

    .line 30
    .line 31
    iget v1, p0, Landroidx/collection/ScatterSet;->_capacity:I

    .line 32
    .line 33
    add-int/lit8 v2, p1, -0x7

    .line 34
    .line 35
    and-int/2addr v2, v1

    .line 36
    and-int/lit8 v1, v1, 0x7

    .line 37
    .line 38
    add-int/2addr v2, v1

    .line 39
    shr-int/lit8 v1, v2, 0x3

    .line 40
    .line 41
    and-int/lit8 v2, v2, 0x7

    .line 42
    .line 43
    shl-int/lit8 v2, v2, 0x3

    .line 44
    .line 45
    aget-wide v3, v0, v1

    .line 46
    .line 47
    shl-long/2addr v5, v2

    .line 48
    not-long v5, v5

    .line 49
    and-long/2addr v3, v5

    .line 50
    shl-long v5, v7, v2

    .line 51
    .line 52
    or-long v2, v3, v5

    .line 53
    .line 54
    aput-wide v2, v0, v1

    .line 55
    .line 56
    iget-object v0, p0, Landroidx/collection/ScatterSet;->elements:[Ljava/lang/Object;

    .line 57
    .line 58
    const/4 v1, 0x0

    .line 59
    aput-object v1, v0, p1

    .line 60
    .line 61
    return-void
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
.end method

.method public final removeIf(Lv3/l;)V
    .locals 14
    .param p1    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/l<",
            "-TE;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "predicate"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/collection/ScatterSet;->elements:[Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v1, p0, Landroidx/collection/ScatterSet;->metadata:[J

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
    aget-object v11, v0, v10

    .line 63
    .line 64
    invoke-interface {p1, v11}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v11

    .line 68
    check-cast v11, Ljava/lang/Boolean;

    .line 69
    .line 70
    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    .line 71
    .line 72
    .line 73
    move-result v11

    .line 74
    if-eqz v11, :cond_1

    .line 75
    .line 76
    invoke-virtual {p0, v10}, Landroidx/collection/MutableScatterSet;->removeElementAt(I)V

    .line 77
    .line 78
    .line 79
    :cond_1
    shr-long/2addr v5, v8

    .line 80
    add-int/lit8 v9, v9, 0x1

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_2
    if-ne v7, v8, :cond_4

    .line 84
    .line 85
    :cond_3
    if-eq v4, v2, :cond_4

    .line 86
    .line 87
    add-int/lit8 v4, v4, 0x1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_4
    return-void
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

.method public final trim()I
    .locals 2
    .annotation build Landroidx/annotation/IntRange;
        from = 0x0L
    .end annotation

    .line 1
    iget v0, p0, Landroidx/collection/ScatterSet;->_capacity:I

    .line 2
    .line 3
    iget v1, p0, Landroidx/collection/ScatterSet;->_size:I

    .line 4
    .line 5
    invoke-static {v1}, Landroidx/collection/ScatterMapKt;->unloadedCapacity(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {v1}, Landroidx/collection/ScatterMapKt;->normalizeCapacity(I)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-ge v1, v0, :cond_0

    .line 14
    .line 15
    invoke-direct {p0, v1}, Landroidx/collection/MutableScatterSet;->resizeStorage(I)V

    .line 16
    .line 17
    .line 18
    iget v1, p0, Landroidx/collection/ScatterSet;->_capacity:I

    .line 19
    .line 20
    sub-int/2addr v0, v1

    .line 21
    return v0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    return v0
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
.end method
