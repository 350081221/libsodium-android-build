.class public final Landroidx/collection/MutableObjectList;
.super Landroidx/collection/ObjectList;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/collection/MutableObjectList$MutableObjectListIterator;,
        Landroidx/collection/MutableObjectList$ObjectListMutableList;,
        Landroidx/collection/MutableObjectList$SubList;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Landroidx/collection/ObjectList<",
        "TE;>;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0008\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u0008\u0012\u0004\u0012\u00028\u00000\u0002:\u000389:B\u0011\u0012\u0008\u0008\u0002\u00105\u001a\u00020\u0007\u00a2\u0006\u0004\u00086\u00107J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001f\u0010\u0005\u001a\u00020\t2\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00028\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\nJ%\u0010\r\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u00072\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001e\u0010\r\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u00072\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000fJ\u001e\u0010\r\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u00072\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0002J\u0014\u0010\r\u001a\u00020\u00042\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0002J\u0014\u0010\r\u001a\u00020\u00042\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0010J\u001b\u0010\r\u001a\u00020\u00042\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000b\u00a2\u0006\u0004\u0008\r\u0010\u0011J\u0014\u0010\r\u001a\u00020\u00042\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0012J\u0014\u0010\r\u001a\u00020\u00042\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0013J\u0014\u0010\r\u001a\u00020\u00042\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0014J\u0017\u0010\u0015\u001a\u00020\t2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002J\u0017\u0010\u0015\u001a\u00020\t2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0010H\u0086\u0002J\u001e\u0010\u0015\u001a\u00020\t2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000bH\u0086\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0017\u0010\u0015\u001a\u00020\t2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0012H\u0086\u0002J\u0017\u0010\u0015\u001a\u00020\t2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0013H\u0086\u0002J\u0017\u0010\u0015\u001a\u00020\t2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0014H\u0086\u0002J\u0006\u0010\u0017\u001a\u00020\tJ\u0010\u0010\u0019\u001a\u00020\t2\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u0007J\u000e\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0007J\u0018\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00028\u0000H\u0086\n\u00a2\u0006\u0004\u0008\u0015\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00028\u0000H\u0086\n\u00a2\u0006\u0004\u0008\u001d\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000\u00a2\u0006\u0004\u0008\u001e\u0010\u0006J/\u0010#\u001a\u00020\t2!\u0010\"\u001a\u001d\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\u000c\u0008 \u0012\u0008\u0008!\u0012\u0004\u0008\u0008(\u0003\u0012\u0004\u0012\u00020\u00040\u001fH\u0086\u0008\u00f8\u0001\u0000J\u001b\u0010$\u001a\u00020\u00042\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000b\u00a2\u0006\u0004\u0008$\u0010\u0011J\u0014\u0010$\u001a\u00020\u00042\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0002J\u0014\u0010$\u001a\u00020\u00042\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0010J\u0014\u0010$\u001a\u00020\u00042\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0012J\u0014\u0010$\u001a\u00020\u00042\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0013J\u0014\u0010$\u001a\u00020\u00042\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0014J\u001e\u0010\u001d\u001a\u00020\t2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000bH\u0086\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u0016J\u0017\u0010\u001d\u001a\u00020\t2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002J\u0017\u0010\u001d\u001a\u00020\t2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0010H\u0086\u0002J\u0017\u0010\u001d\u001a\u00020\t2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0012H\u0086\u0002J\u0017\u0010\u001d\u001a\u00020\t2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0013H\u0086\u0002J\u0017\u0010\u001d\u001a\u00020\t2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0014H\u0086\u0002J\u0017\u0010%\u001a\u00028\u00002\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008%\u0010&J\u001a\u0010)\u001a\u00020\t2\u0008\u0008\u0001\u0010\'\u001a\u00020\u00072\u0008\u0008\u0001\u0010(\u001a\u00020\u0007J\u001b\u0010*\u001a\u00020\u00042\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000b\u00a2\u0006\u0004\u0008*\u0010\u0011J\u0014\u0010*\u001a\u00020\u00042\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0002J\u0014\u0010*\u001a\u00020\u00042\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000fJ\u0014\u0010*\u001a\u00020\u00042\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0013J\u0014\u0010*\u001a\u00020\u00042\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0014J\"\u0010+\u001a\u00028\u00002\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00028\u0000H\u0086\u0002\u00a2\u0006\u0004\u0008+\u0010,J\u000e\u0010-\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0012H\u0016J\u000c\u0010/\u001a\u0008\u0012\u0004\u0012\u00028\u00000.R\u001e\u00101\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001008\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00081\u00102R\u0012\u0010\u001a\u001a\u00020\u00078\u00c6\u0002\u00a2\u0006\u0006\u001a\u0004\u00083\u00104\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u0006;"
    }
    d2 = {
        "Landroidx/collection/MutableObjectList;",
        "E",
        "Landroidx/collection/ObjectList;",
        "element",
        "",
        "add",
        "(Ljava/lang/Object;)Z",
        "",
        "index",
        "Lkotlin/r2;",
        "(ILjava/lang/Object;)V",
        "",
        "elements",
        "addAll",
        "(I[Ljava/lang/Object;)Z",
        "",
        "Landroidx/collection/ScatterSet;",
        "([Ljava/lang/Object;)Z",
        "",
        "",
        "Lkotlin/sequences/m;",
        "plusAssign",
        "([Ljava/lang/Object;)V",
        "clear",
        "minCapacity",
        "trim",
        "capacity",
        "ensureCapacity",
        "(Ljava/lang/Object;)V",
        "minusAssign",
        "remove",
        "Lkotlin/Function1;",
        "Lkotlin/v0;",
        "name",
        "predicate",
        "removeIf",
        "removeAll",
        "removeAt",
        "(I)Ljava/lang/Object;",
        "start",
        "end",
        "removeRange",
        "retainAll",
        "set",
        "(ILjava/lang/Object;)Ljava/lang/Object;",
        "asList",
        "",
        "asMutableList",
        "Landroidx/collection/MutableObjectList$ObjectListMutableList;",
        "list",
        "Landroidx/collection/MutableObjectList$ObjectListMutableList;",
        "getCapacity",
        "()I",
        "initialCapacity",
        "<init>",
        "(I)V",
        "MutableObjectListIterator",
        "ObjectListMutableList",
        "SubList",
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
        "SMAP\nObjectList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectList.kt\nandroidx/collection/MutableObjectList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 6 ObjectList.kt\nandroidx/collection/ObjectList\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1618:1\n948#1,2:1641\n948#1,2:1652\n948#1,2:1656\n652#1:1659\n955#1,2:1662\n955#1,2:1669\n955#1,2:1691\n955#1,2:1701\n955#1,2:1704\n955#1,2:1708\n1864#2,3:1619\n1855#2:1651\n1856#2:1654\n1855#2:1703\n1856#2:1706\n267#3,4:1622\n237#3,7:1626\n248#3,3:1634\n251#3,2:1638\n272#3:1640\n273#3:1643\n254#3,6:1644\n274#3:1650\n267#3,4:1672\n237#3,7:1676\n248#3,3:1684\n251#3,2:1688\n272#3:1690\n273#3:1693\n254#3,6:1694\n274#3:1700\n1810#4:1633\n1672#4:1637\n1810#4:1683\n1672#4:1687\n1295#5:1655\n1296#5:1658\n1295#5:1707\n1296#5:1710\n80#6:1660\n305#6,4:1665\n310#6:1671\n75#6:1711\n75#6:1712\n75#6:1713\n75#6:1714\n75#6:1715\n75#6:1716\n75#6:1717\n75#6:1718\n13579#7:1661\n13580#7:1664\n*S KotlinDebug\n*F\n+ 1 ObjectList.kt\nandroidx/collection/MutableObjectList\n*L\n864#1:1641,2\n898#1:1652,2\n907#1:1656,2\n927#1:1659\n1050#1:1662,2\n1059#1:1669,2\n1068#1:1691,2\n1077#1:1701,2\n1086#1:1704,2\n1095#1:1708,2\n740#1:1619,3\n897#1:1651\n897#1:1654\n1085#1:1703\n1085#1:1706\n863#1:1622,4\n863#1:1626,7\n863#1:1634,3\n863#1:1638,2\n863#1:1640\n863#1:1643\n863#1:1644,6\n863#1:1650\n1067#1:1672,4\n1067#1:1676,7\n1067#1:1684,3\n1067#1:1688,2\n1067#1:1690\n1067#1:1693\n1067#1:1694,6\n1067#1:1700\n863#1:1633\n863#1:1637\n1067#1:1683\n1067#1:1687\n906#1:1655\n906#1:1658\n1094#1:1707\n1094#1:1710\n979#1:1660\n1058#1:1665,4\n1058#1:1671\n1105#1:1711\n1109#1:1712\n1159#1:1713\n1175#1:1714\n1191#1:1715\n1207#1:1716\n1223#1:1717\n1242#1:1718\n1049#1:1661\n1049#1:1664\n*E\n"
    }
.end annotation


# instance fields
.field private list:Landroidx/collection/MutableObjectList$ObjectListMutableList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableObjectList$ObjectListMutableList<",
            "TE;>;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1}, Landroidx/collection/MutableObjectList;-><init>(IILkotlin/jvm/internal/w;)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Landroidx/collection/ObjectList;-><init>(ILkotlin/jvm/internal/w;)V

    return-void
.end method

.method public synthetic constructor <init>(IILkotlin/jvm/internal/w;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/16 p1, 0x10

    .line 1
    :cond_0
    invoke-direct {p0, p1}, Landroidx/collection/MutableObjectList;-><init>(I)V

    return-void
.end method

.method public static synthetic trim$default(Landroidx/collection/MutableObjectList;IILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget p1, p0, Landroidx/collection/ObjectList;->_size:I

    :cond_0
    invoke-virtual {p0, p1}, Landroidx/collection/MutableObjectList;->trim(I)V

    return-void
.end method


# virtual methods
.method public final add(ILjava/lang/Object;)V
    .locals 4
    .param p1    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x0L
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITE;)V"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-ltz p1, :cond_0

    .line 4
    iget v2, p0, Landroidx/collection/ObjectList;->_size:I

    if-gt p1, v2, :cond_0

    move v0, v1

    :cond_0
    if-eqz v0, :cond_2

    .line 5
    iget v0, p0, Landroidx/collection/ObjectList;->_size:I

    add-int/2addr v0, v1

    invoke-virtual {p0, v0}, Landroidx/collection/MutableObjectList;->ensureCapacity(I)V

    .line 6
    iget-object v0, p0, Landroidx/collection/ObjectList;->content:[Ljava/lang/Object;

    .line 7
    iget v2, p0, Landroidx/collection/ObjectList;->_size:I

    if-eq p1, v2, :cond_1

    add-int/lit8 v3, p1, 0x1

    .line 8
    invoke-static {v0, v0, v3, p1, v2}, Lkotlin/collections/l;->B0([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    .line 9
    :cond_1
    aput-object p2, v0, p1

    .line 10
    iget p1, p0, Landroidx/collection/ObjectList;->_size:I

    add-int/2addr p1, v1

    iput p1, p0, Landroidx/collection/ObjectList;->_size:I

    return-void

    .line 11
    :cond_2
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Index "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " must be in 0.."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p0, Landroidx/collection/ObjectList;->_size:I

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final add(Ljava/lang/Object;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)Z"
        }
    .end annotation

    .line 1
    iget v0, p0, Landroidx/collection/ObjectList;->_size:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    invoke-virtual {p0, v0}, Landroidx/collection/MutableObjectList;->ensureCapacity(I)V

    .line 2
    iget-object v0, p0, Landroidx/collection/ObjectList;->content:[Ljava/lang/Object;

    iget v2, p0, Landroidx/collection/ObjectList;->_size:I

    aput-object p1, v0, v2

    add-int/2addr v2, v1

    .line 3
    iput v2, p0, Landroidx/collection/ObjectList;->_size:I

    return v1
.end method

.method public final addAll(ILandroidx/collection/ObjectList;)Z
    .locals 5
    .param p1    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x0L
        .end annotation
    .end param
    .param p2    # Landroidx/collection/ObjectList;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroidx/collection/ObjectList<",
            "TE;>;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ltz p1, :cond_0

    .line 24
    iget v2, p0, Landroidx/collection/ObjectList;->_size:I

    if-gt p1, v2, :cond_0

    move v2, v0

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    if-eqz v2, :cond_3

    .line 25
    invoke-virtual {p2}, Landroidx/collection/ObjectList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    return v1

    .line 26
    :cond_1
    iget v2, p0, Landroidx/collection/ObjectList;->_size:I

    iget v3, p2, Landroidx/collection/ObjectList;->_size:I

    add-int/2addr v2, v3

    invoke-virtual {p0, v2}, Landroidx/collection/MutableObjectList;->ensureCapacity(I)V

    .line 27
    iget-object v2, p0, Landroidx/collection/ObjectList;->content:[Ljava/lang/Object;

    .line 28
    iget v3, p0, Landroidx/collection/ObjectList;->_size:I

    if-eq p1, v3, :cond_2

    .line 29
    iget v4, p2, Landroidx/collection/ObjectList;->_size:I

    add-int/2addr v4, p1

    .line 30
    invoke-static {v2, v2, v4, p1, v3}, Lkotlin/collections/l;->B0([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    .line 31
    :cond_2
    iget-object v3, p2, Landroidx/collection/ObjectList;->content:[Ljava/lang/Object;

    .line 32
    iget v4, p2, Landroidx/collection/ObjectList;->_size:I

    .line 33
    invoke-static {v3, v2, p1, v1, v4}, Lkotlin/collections/l;->B0([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    .line 34
    iget p1, p0, Landroidx/collection/ObjectList;->_size:I

    iget p2, p2, Landroidx/collection/ObjectList;->_size:I

    add-int/2addr p1, p2

    iput p1, p0, Landroidx/collection/ObjectList;->_size:I

    return v0

    .line 35
    :cond_3
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Index "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " must be in 0.."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p0, Landroidx/collection/ObjectList;->_size:I

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final addAll(ILjava/util/Collection;)Z
    .locals 6
    .param p1    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x0L
        .end annotation
    .end param
    .param p2    # Ljava/util/Collection;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Collection<",
            "+TE;>;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ltz p1, :cond_0

    .line 11
    iget v2, p0, Landroidx/collection/ObjectList;->_size:I

    if-gt p1, v2, :cond_0

    move v2, v0

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    if-eqz v2, :cond_5

    .line 12
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    return v1

    .line 13
    :cond_1
    iget v2, p0, Landroidx/collection/ObjectList;->_size:I

    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result v3

    add-int/2addr v2, v3

    invoke-virtual {p0, v2}, Landroidx/collection/MutableObjectList;->ensureCapacity(I)V

    .line 14
    iget-object v2, p0, Landroidx/collection/ObjectList;->content:[Ljava/lang/Object;

    .line 15
    iget v3, p0, Landroidx/collection/ObjectList;->_size:I

    if-eq p1, v3, :cond_2

    .line 16
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result v3

    add-int/2addr v3, p1

    .line 17
    iget v4, p0, Landroidx/collection/ObjectList;->_size:I

    .line 18
    invoke-static {v2, v2, v3, p1, v4}, Lkotlin/collections/l;->B0([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    .line 19
    :cond_2
    move-object v3, p2

    check-cast v3, Ljava/lang/Iterable;

    .line 20
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v5, v1, 0x1

    if-gez v1, :cond_3

    invoke-static {}, Lkotlin/collections/u;->W()V

    :cond_3
    add-int/2addr v1, p1

    .line 21
    aput-object v4, v2, v1

    move v1, v5

    goto :goto_1

    .line 22
    :cond_4
    iget p1, p0, Landroidx/collection/ObjectList;->_size:I

    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result p2

    add-int/2addr p1, p2

    iput p1, p0, Landroidx/collection/ObjectList;->_size:I

    return v0

    .line 23
    :cond_5
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Index "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " must be in 0.."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p0, Landroidx/collection/ObjectList;->_size:I

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final addAll(I[Ljava/lang/Object;)Z
    .locals 9
    .param p1    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x0L
        .end annotation
    .end param
    .param p2    # [Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I[TE;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ltz p1, :cond_0

    .line 1
    iget v2, p0, Landroidx/collection/ObjectList;->_size:I

    if-gt p1, v2, :cond_0

    move v2, v0

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    if-eqz v2, :cond_4

    .line 2
    array-length v2, p2

    if-nez v2, :cond_1

    move v2, v0

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    if-eqz v2, :cond_2

    return v1

    .line 3
    :cond_2
    iget v1, p0, Landroidx/collection/ObjectList;->_size:I

    array-length v2, p2

    add-int/2addr v1, v2

    invoke-virtual {p0, v1}, Landroidx/collection/MutableObjectList;->ensureCapacity(I)V

    .line 4
    iget-object v3, p0, Landroidx/collection/ObjectList;->content:[Ljava/lang/Object;

    .line 5
    iget v1, p0, Landroidx/collection/ObjectList;->_size:I

    if-eq p1, v1, :cond_3

    .line 6
    array-length v2, p2

    add-int/2addr v2, p1

    .line 7
    invoke-static {v3, v3, v2, p1, v1}, Lkotlin/collections/l;->B0([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    :cond_3
    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0xc

    const/4 v8, 0x0

    move-object v2, p2

    move v4, p1

    .line 8
    invoke-static/range {v2 .. v8}, Lkotlin/collections/l;->K0([Ljava/lang/Object;[Ljava/lang/Object;IIIILjava/lang/Object;)[Ljava/lang/Object;

    .line 9
    iget p1, p0, Landroidx/collection/ObjectList;->_size:I

    array-length p2, p2

    add-int/2addr p1, p2

    iput p1, p0, Landroidx/collection/ObjectList;->_size:I

    return v0

    .line 10
    :cond_4
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Index "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " must be in 0.."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p0, Landroidx/collection/ObjectList;->_size:I

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2
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

    .line 36
    iget v0, p0, Landroidx/collection/ObjectList;->_size:I

    .line 37
    invoke-virtual {p0, p1}, Landroidx/collection/MutableObjectList;->plusAssign(Landroidx/collection/ObjectList;)V

    .line 38
    iget p1, p0, Landroidx/collection/ObjectList;->_size:I

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

    .line 39
    iget v0, p0, Landroidx/collection/ObjectList;->_size:I

    .line 40
    invoke-virtual {p0, p1}, Landroidx/collection/MutableObjectList;->plusAssign(Landroidx/collection/ScatterSet;)V

    .line 41
    iget p1, p0, Landroidx/collection/ObjectList;->_size:I

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

    .line 48
    iget v0, p0, Landroidx/collection/ObjectList;->_size:I

    .line 49
    invoke-virtual {p0, p1}, Landroidx/collection/MutableObjectList;->plusAssign(Ljava/lang/Iterable;)V

    .line 50
    iget p1, p0, Landroidx/collection/ObjectList;->_size:I

    if-eq v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final addAll(Ljava/util/List;)Z
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+TE;>;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    iget v0, p0, Landroidx/collection/ObjectList;->_size:I

    .line 46
    invoke-virtual {p0, p1}, Landroidx/collection/MutableObjectList;->plusAssign(Ljava/util/List;)V

    .line 47
    iget p1, p0, Landroidx/collection/ObjectList;->_size:I

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

    .line 51
    iget v0, p0, Landroidx/collection/ObjectList;->_size:I

    .line 52
    invoke-virtual {p0, p1}, Landroidx/collection/MutableObjectList;->plusAssign(Lkotlin/sequences/m;)V

    .line 53
    iget p1, p0, Landroidx/collection/ObjectList;->_size:I

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

    .line 42
    iget v0, p0, Landroidx/collection/ObjectList;->_size:I

    .line 43
    invoke-virtual {p0, p1}, Landroidx/collection/MutableObjectList;->plusAssign([Ljava/lang/Object;)V

    .line 44
    iget p1, p0, Landroidx/collection/ObjectList;->_size:I

    if-eq v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public asList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "TE;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    invoke-virtual {p0}, Landroidx/collection/MutableObjectList;->asMutableList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final asMutableList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "TE;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/collection/MutableObjectList;->list:Landroidx/collection/MutableObjectList$ObjectListMutableList;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    new-instance v0, Landroidx/collection/MutableObjectList$ObjectListMutableList;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Landroidx/collection/MutableObjectList$ObjectListMutableList;-><init>(Landroidx/collection/MutableObjectList;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Landroidx/collection/MutableObjectList;->list:Landroidx/collection/MutableObjectList$ObjectListMutableList;

    .line 12
    .line 13
    :goto_0
    return-object v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
.end method

.method public final clear()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/collection/ObjectList;->content:[Ljava/lang/Object;

    .line 2
    .line 3
    iget v1, p0, Landroidx/collection/ObjectList;->_size:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    invoke-static {v0, v2, v3, v1}, Lkotlin/collections/l;->M1([Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 8
    .line 9
    .line 10
    iput v3, p0, Landroidx/collection/ObjectList;->_size:I

    .line 11
    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
.end method

.method public final ensureCapacity(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/collection/ObjectList;->content:[Ljava/lang/Object;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    if-ge v1, p1, :cond_0

    .line 5
    .line 6
    array-length v1, v0

    .line 7
    mul-int/lit8 v1, v1, 0x3

    .line 8
    .line 9
    div-int/lit8 v1, v1, 0x2

    .line 10
    .line 11
    invoke-static {p1, v1}, Ljava/lang/Math;->max(II)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const-string v0, "copyOf(this, newSize)"

    .line 20
    .line 21
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Landroidx/collection/ObjectList;->content:[Ljava/lang/Object;

    .line 25
    .line 26
    :cond_0
    return-void
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public final getCapacity()I
    .locals 1

    iget-object v0, p0, Landroidx/collection/ObjectList;->content:[Ljava/lang/Object;

    array-length v0, v0

    return v0
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

    .line 7
    iget-object v0, p1, Landroidx/collection/ObjectList;->content:[Ljava/lang/Object;

    .line 8
    iget p1, p1, Landroidx/collection/ObjectList;->_size:I

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_0

    .line 9
    aget-object v2, v0, v1

    .line 10
    invoke-virtual {p0, v2}, Landroidx/collection/MutableObjectList;->remove(Ljava/lang/Object;)Z

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

    .line 11
    iget-object v0, p1, Landroidx/collection/ScatterSet;->elements:[Ljava/lang/Object;

    .line 12
    iget-object p1, p1, Landroidx/collection/ScatterSet;->metadata:[J

    .line 13
    array-length v1, p1

    add-int/lit8 v1, v1, -0x2

    if-ltz v1, :cond_4

    const/4 v2, 0x0

    move v3, v2

    .line 14
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

    .line 15
    aget-object v9, v0, v9

    .line 16
    invoke-virtual {p0, v9}, Landroidx/collection/MutableObjectList;->remove(Ljava/lang/Object;)Z

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

    .line 17
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 18
    invoke-virtual {p0, v0}, Landroidx/collection/MutableObjectList;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final minusAssign(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Landroidx/collection/MutableObjectList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final minusAssign(Ljava/util/List;)V
    .locals 3
    .param p1    # Ljava/util/List;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+TE;>;)V"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 3
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    .line 4
    invoke-virtual {p0, v2}, Landroidx/collection/MutableObjectList;->remove(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
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

    .line 19
    invoke-interface {p1}, Lkotlin/sequences/m;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 20
    invoke-virtual {p0, v0}, Landroidx/collection/MutableObjectList;->remove(Ljava/lang/Object;)Z

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

    .line 5
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p1, v1

    .line 6
    invoke-virtual {p0, v2}, Landroidx/collection/MutableObjectList;->remove(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final plusAssign(Landroidx/collection/ObjectList;)V
    .locals 5
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

    .line 1
    invoke-virtual {p1}, Landroidx/collection/ObjectList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget v0, p0, Landroidx/collection/ObjectList;->_size:I

    iget v1, p1, Landroidx/collection/ObjectList;->_size:I

    add-int/2addr v0, v1

    invoke-virtual {p0, v0}, Landroidx/collection/MutableObjectList;->ensureCapacity(I)V

    .line 3
    iget-object v0, p0, Landroidx/collection/ObjectList;->content:[Ljava/lang/Object;

    .line 4
    iget-object v1, p1, Landroidx/collection/ObjectList;->content:[Ljava/lang/Object;

    .line 5
    iget v2, p0, Landroidx/collection/ObjectList;->_size:I

    const/4 v3, 0x0

    .line 6
    iget v4, p1, Landroidx/collection/ObjectList;->_size:I

    .line 7
    invoke-static {v1, v0, v2, v3, v4}, Lkotlin/collections/l;->B0([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    .line 8
    iget v0, p0, Landroidx/collection/ObjectList;->_size:I

    iget p1, p1, Landroidx/collection/ObjectList;->_size:I

    add-int/2addr v0, p1

    iput v0, p0, Landroidx/collection/ObjectList;->_size:I

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
    invoke-virtual {p1}, Landroidx/collection/ScatterSet;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 10
    :cond_0
    iget v0, p0, Landroidx/collection/ObjectList;->_size:I

    invoke-virtual {p1}, Landroidx/collection/ScatterSet;->getSize()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {p0, v0}, Landroidx/collection/MutableObjectList;->ensureCapacity(I)V

    .line 11
    iget-object v0, p1, Landroidx/collection/ScatterSet;->elements:[Ljava/lang/Object;

    .line 12
    iget-object p1, p1, Landroidx/collection/ScatterSet;->metadata:[J

    .line 13
    array-length v1, p1

    add-int/lit8 v1, v1, -0x2

    if-ltz v1, :cond_5

    const/4 v2, 0x0

    move v3, v2

    .line 14
    :goto_0
    aget-wide v4, p1, v3

    not-long v6, v4

    const/4 v8, 0x7

    shl-long/2addr v6, v8

    and-long/2addr v6, v4

    const-wide v8, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v6, v8

    cmp-long v6, v6, v8

    if-eqz v6, :cond_4

    sub-int v6, v3, v1

    not-int v6, v6

    ushr-int/lit8 v6, v6, 0x1f

    const/16 v7, 0x8

    rsub-int/lit8 v6, v6, 0x8

    move v8, v2

    :goto_1
    if-ge v8, v6, :cond_3

    const-wide/16 v9, 0xff

    and-long/2addr v9, v4

    const-wide/16 v11, 0x80

    cmp-long v9, v9, v11

    if-gez v9, :cond_1

    const/4 v9, 0x1

    goto :goto_2

    :cond_1
    move v9, v2

    :goto_2
    if-eqz v9, :cond_2

    shl-int/lit8 v9, v3, 0x3

    add-int/2addr v9, v8

    .line 15
    aget-object v9, v0, v9

    .line 16
    invoke-virtual {p0, v9}, Landroidx/collection/MutableObjectList;->add(Ljava/lang/Object;)Z

    :cond_2
    shr-long/2addr v4, v7

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_3
    if-ne v6, v7, :cond_5

    :cond_4
    if-eq v3, v1, :cond_5

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_5
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

    .line 30
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 31
    invoke-virtual {p0, v0}, Landroidx/collection/MutableObjectList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final plusAssign(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)V"
        }
    .end annotation

    .line 29
    invoke-virtual {p0, p1}, Landroidx/collection/MutableObjectList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final plusAssign(Ljava/util/List;)V
    .locals 6
    .param p1    # Ljava/util/List;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+TE;>;)V"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 23
    :cond_0
    iget v0, p0, Landroidx/collection/ObjectList;->_size:I

    .line 24
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, Landroidx/collection/MutableObjectList;->ensureCapacity(I)V

    .line 25
    iget-object v1, p0, Landroidx/collection/ObjectList;->content:[Ljava/lang/Object;

    .line 26
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    add-int v4, v3, v0

    .line 27
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    aput-object v5, v1, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 28
    :cond_1
    iget v0, p0, Landroidx/collection/ObjectList;->_size:I

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    add-int/2addr v0, p1

    iput v0, p0, Landroidx/collection/ObjectList;->_size:I

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

    .line 32
    invoke-interface {p1}, Lkotlin/sequences/m;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 33
    invoke-virtual {p0, v0}, Landroidx/collection/MutableObjectList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final plusAssign([Ljava/lang/Object;)V
    .locals 8
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

    .line 17
    array-length v0, p1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    return-void

    .line 18
    :cond_1
    iget v0, p0, Landroidx/collection/ObjectList;->_size:I

    array-length v1, p1

    add-int/2addr v0, v1

    invoke-virtual {p0, v0}, Landroidx/collection/MutableObjectList;->ensureCapacity(I)V

    .line 19
    iget-object v2, p0, Landroidx/collection/ObjectList;->content:[Ljava/lang/Object;

    .line 20
    iget v3, p0, Landroidx/collection/ObjectList;->_size:I

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0xc

    const/4 v7, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Lkotlin/collections/l;->K0([Ljava/lang/Object;[Ljava/lang/Object;IIIILjava/lang/Object;)[Ljava/lang/Object;

    .line 21
    iget v0, p0, Landroidx/collection/ObjectList;->_size:I

    array-length p1, p1

    add-int/2addr v0, p1

    iput v0, p0, Landroidx/collection/ObjectList;->_size:I

    return-void
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)Z"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Landroidx/collection/ObjectList;->indexOf(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-ltz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroidx/collection/MutableObjectList;->removeAt(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    return p1

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    return p1
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

    .line 5
    iget v0, p0, Landroidx/collection/ObjectList;->_size:I

    .line 6
    invoke-virtual {p0, p1}, Landroidx/collection/MutableObjectList;->minusAssign(Landroidx/collection/ObjectList;)V

    .line 7
    iget p1, p0, Landroidx/collection/ObjectList;->_size:I

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

    .line 8
    iget v0, p0, Landroidx/collection/ObjectList;->_size:I

    .line 9
    invoke-virtual {p0, p1}, Landroidx/collection/MutableObjectList;->minusAssign(Landroidx/collection/ScatterSet;)V

    .line 10
    iget p1, p0, Landroidx/collection/ObjectList;->_size:I

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

    .line 14
    iget v0, p0, Landroidx/collection/ObjectList;->_size:I

    .line 15
    invoke-virtual {p0, p1}, Landroidx/collection/MutableObjectList;->minusAssign(Ljava/lang/Iterable;)V

    .line 16
    iget p1, p0, Landroidx/collection/ObjectList;->_size:I

    if-eq v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final removeAll(Ljava/util/List;)Z
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+TE;>;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    iget v0, p0, Landroidx/collection/ObjectList;->_size:I

    .line 12
    invoke-virtual {p0, p1}, Landroidx/collection/MutableObjectList;->minusAssign(Ljava/util/List;)V

    .line 13
    iget p1, p0, Landroidx/collection/ObjectList;->_size:I

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

    .line 17
    iget v0, p0, Landroidx/collection/ObjectList;->_size:I

    .line 18
    invoke-virtual {p0, p1}, Landroidx/collection/MutableObjectList;->minusAssign(Lkotlin/sequences/m;)V

    .line 19
    iget p1, p0, Landroidx/collection/ObjectList;->_size:I

    if-eq v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final removeAll([Ljava/lang/Object;)Z
    .locals 5
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
    iget v0, p0, Landroidx/collection/ObjectList;->_size:I

    .line 2
    array-length v1, p1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_0

    .line 3
    aget-object v4, p1, v3

    invoke-virtual {p0, v4}, Landroidx/collection/MutableObjectList;->remove(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 4
    :cond_0
    iget p1, p0, Landroidx/collection/ObjectList;->_size:I

    if-eq v0, p1, :cond_1

    const/4 v2, 0x1

    :cond_1
    return v2
.end method

.method public final removeAt(I)Ljava/lang/Object;
    .locals 4
    .param p1    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x0L
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-ltz p1, :cond_0

    .line 4
    .line 5
    iget v2, p0, Landroidx/collection/ObjectList;->_size:I

    .line 6
    .line 7
    if-ge p1, v2, :cond_0

    .line 8
    .line 9
    move v0, v1

    .line 10
    :cond_0
    if-eqz v0, :cond_2

    .line 11
    .line 12
    iget-object v0, p0, Landroidx/collection/ObjectList;->content:[Ljava/lang/Object;

    .line 13
    .line 14
    aget-object v1, v0, p1

    .line 15
    .line 16
    iget v2, p0, Landroidx/collection/ObjectList;->_size:I

    .line 17
    .line 18
    add-int/lit8 v3, v2, -0x1

    .line 19
    .line 20
    if-eq p1, v3, :cond_1

    .line 21
    .line 22
    add-int/lit8 v3, p1, 0x1

    .line 23
    .line 24
    invoke-static {v0, v0, p1, v3, v2}, Lkotlin/collections/l;->B0([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    :cond_1
    iget p1, p0, Landroidx/collection/ObjectList;->_size:I

    .line 28
    .line 29
    add-int/lit8 p1, p1, -0x1

    .line 30
    .line 31
    iput p1, p0, Landroidx/collection/ObjectList;->_size:I

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    aput-object v2, v0, p1

    .line 35
    .line 36
    return-object v1

    .line 37
    :cond_2
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 38
    .line 39
    new-instance v2, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 42
    .line 43
    .line 44
    const-string v3, "Index "

    .line 45
    .line 46
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string p1, " must be in 0.."

    .line 53
    .line 54
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    iget p1, p0, Landroidx/collection/ObjectList;->_size:I

    .line 58
    .line 59
    sub-int/2addr p1, v1

    .line 60
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw v0
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
    .locals 7
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
    iget v0, p0, Landroidx/collection/ObjectList;->_size:I

    .line 7
    .line 8
    iget-object v1, p0, Landroidx/collection/ObjectList;->content:[Ljava/lang/Object;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-static {v2, v0}, Lkotlin/ranges/s;->W1(II)Lkotlin/ranges/l;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-virtual {v3}, Lkotlin/ranges/j;->e()I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    invoke-virtual {v3}, Lkotlin/ranges/j;->g()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-gt v4, v3, :cond_1

    .line 24
    .line 25
    :goto_0
    sub-int v5, v4, v2

    .line 26
    .line 27
    aget-object v6, v1, v4

    .line 28
    .line 29
    aput-object v6, v1, v5

    .line 30
    .line 31
    aget-object v5, v1, v4

    .line 32
    .line 33
    invoke-interface {p1, v5}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    check-cast v5, Ljava/lang/Boolean;

    .line 38
    .line 39
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    if-eqz v5, :cond_0

    .line 44
    .line 45
    add-int/lit8 v2, v2, 0x1

    .line 46
    .line 47
    :cond_0
    if-eq v4, v3, :cond_1

    .line 48
    .line 49
    add-int/lit8 v4, v4, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    const/4 p1, 0x0

    .line 53
    sub-int v3, v0, v2

    .line 54
    .line 55
    invoke-static {v1, p1, v3, v0}, Lkotlin/collections/l;->M1([Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 56
    .line 57
    .line 58
    iget p1, p0, Landroidx/collection/ObjectList;->_size:I

    .line 59
    .line 60
    sub-int/2addr p1, v2

    .line 61
    iput p1, p0, Landroidx/collection/ObjectList;->_size:I

    .line 62
    .line 63
    return-void
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

.method public final removeRange(II)V
    .locals 4
    .param p1    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x0L
        .end annotation
    .end param
    .param p2    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x0L
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    if-ltz p1, :cond_0

    .line 4
    .line 5
    iget v2, p0, Landroidx/collection/ObjectList;->_size:I

    .line 6
    .line 7
    if-gt p1, v2, :cond_0

    .line 8
    .line 9
    move v2, v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v2, v1

    .line 12
    :goto_0
    const-string v3, "Start ("

    .line 13
    .line 14
    if-eqz v2, :cond_5

    .line 15
    .line 16
    if-ltz p2, :cond_1

    .line 17
    .line 18
    iget v2, p0, Landroidx/collection/ObjectList;->_size:I

    .line 19
    .line 20
    if-gt p2, v2, :cond_1

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move v0, v1

    .line 24
    :goto_1
    if-eqz v0, :cond_5

    .line 25
    .line 26
    if-lt p2, p1, :cond_4

    .line 27
    .line 28
    if-eq p2, p1, :cond_3

    .line 29
    .line 30
    iget v0, p0, Landroidx/collection/ObjectList;->_size:I

    .line 31
    .line 32
    if-ge p2, v0, :cond_2

    .line 33
    .line 34
    iget-object v1, p0, Landroidx/collection/ObjectList;->content:[Ljava/lang/Object;

    .line 35
    .line 36
    invoke-static {v1, v1, p1, p2, v0}, Lkotlin/collections/l;->B0([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    :cond_2
    iget v0, p0, Landroidx/collection/ObjectList;->_size:I

    .line 40
    .line 41
    sub-int/2addr p2, p1

    .line 42
    sub-int p1, v0, p2

    .line 43
    .line 44
    iget-object p2, p0, Landroidx/collection/ObjectList;->content:[Ljava/lang/Object;

    .line 45
    .line 46
    const/4 v1, 0x0

    .line 47
    invoke-static {p2, v1, p1, v0}, Lkotlin/collections/l;->M1([Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 48
    .line 49
    .line 50
    iput p1, p0, Landroidx/collection/ObjectList;->_size:I

    .line 51
    .line 52
    :cond_3
    return-void

    .line 53
    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 54
    .line 55
    new-instance v1, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string p1, ") is more than end ("

    .line 67
    .line 68
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const/16 p1, 0x29

    .line 75
    .line 76
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw v0

    .line 87
    :cond_5
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 88
    .line 89
    new-instance v1, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    const-string p1, ") and end ("

    .line 101
    .line 102
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    const-string p1, ") must be in 0.."

    .line 109
    .line 110
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    iget p1, p0, Landroidx/collection/ObjectList;->_size:I

    .line 114
    .line 115
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    throw v0
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
.end method

.method public final retainAll(Landroidx/collection/ObjectList;)Z
    .locals 4
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

    .line 7
    iget v0, p0, Landroidx/collection/ObjectList;->_size:I

    .line 8
    iget-object v1, p0, Landroidx/collection/ObjectList;->content:[Ljava/lang/Object;

    add-int/lit8 v2, v0, -0x1

    :goto_0
    const/4 v3, -0x1

    if-ge v3, v2, :cond_1

    .line 9
    aget-object v3, v1, v2

    .line 10
    invoke-virtual {p1, v3}, Landroidx/collection/ObjectList;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 11
    invoke-virtual {p0, v2}, Landroidx/collection/MutableObjectList;->removeAt(I)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    .line 12
    :cond_1
    iget p1, p0, Landroidx/collection/ObjectList;->_size:I

    if-eq v0, p1, :cond_2

    const/4 p1, 0x1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    return p1
.end method

.method public final retainAll(Ljava/lang/Iterable;)Z
    .locals 4
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

    .line 19
    iget v0, p0, Landroidx/collection/ObjectList;->_size:I

    .line 20
    iget-object v1, p0, Landroidx/collection/ObjectList;->content:[Ljava/lang/Object;

    add-int/lit8 v2, v0, -0x1

    :goto_0
    const/4 v3, -0x1

    if-ge v3, v2, :cond_1

    .line 21
    aget-object v3, v1, v2

    .line 22
    invoke-static {p1, v3}, Lkotlin/collections/u;->T1(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 23
    invoke-virtual {p0, v2}, Landroidx/collection/MutableObjectList;->removeAt(I)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    .line 24
    :cond_1
    iget p1, p0, Landroidx/collection/ObjectList;->_size:I

    if-eq v0, p1, :cond_2

    const/4 p1, 0x1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    return p1
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 4
    .param p1    # Ljava/util/Collection;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+TE;>;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    iget v0, p0, Landroidx/collection/ObjectList;->_size:I

    .line 14
    iget-object v1, p0, Landroidx/collection/ObjectList;->content:[Ljava/lang/Object;

    add-int/lit8 v2, v0, -0x1

    :goto_0
    const/4 v3, -0x1

    if-ge v3, v2, :cond_1

    .line 15
    aget-object v3, v1, v2

    .line 16
    invoke-interface {p1, v3}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 17
    invoke-virtual {p0, v2}, Landroidx/collection/MutableObjectList;->removeAt(I)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    .line 18
    :cond_1
    iget p1, p0, Landroidx/collection/ObjectList;->_size:I

    if-eq v0, p1, :cond_2

    const/4 p1, 0x1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    return p1
.end method

.method public final retainAll(Lkotlin/sequences/m;)Z
    .locals 4
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

    .line 25
    iget v0, p0, Landroidx/collection/ObjectList;->_size:I

    .line 26
    iget-object v1, p0, Landroidx/collection/ObjectList;->content:[Ljava/lang/Object;

    add-int/lit8 v2, v0, -0x1

    :goto_0
    const/4 v3, -0x1

    if-ge v3, v2, :cond_1

    .line 27
    aget-object v3, v1, v2

    .line 28
    invoke-static {p1, v3}, Lkotlin/sequences/p;->f0(Lkotlin/sequences/m;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 29
    invoke-virtual {p0, v2}, Landroidx/collection/MutableObjectList;->removeAt(I)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    .line 30
    :cond_1
    iget p1, p0, Landroidx/collection/ObjectList;->_size:I

    if-eq v0, p1, :cond_2

    const/4 p1, 0x1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    return p1
.end method

.method public final retainAll([Ljava/lang/Object;)Z
    .locals 4
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
    iget v0, p0, Landroidx/collection/ObjectList;->_size:I

    .line 2
    iget-object v1, p0, Landroidx/collection/ObjectList;->content:[Ljava/lang/Object;

    add-int/lit8 v2, v0, -0x1

    :goto_0
    const/4 v3, -0x1

    if-ge v3, v2, :cond_1

    .line 3
    aget-object v3, v1, v2

    .line 4
    invoke-static {p1, v3}, Lkotlin/collections/l;->If([Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v3

    if-gez v3, :cond_0

    .line 5
    invoke-virtual {p0, v2}, Landroidx/collection/MutableObjectList;->removeAt(I)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    .line 6
    :cond_1
    iget p1, p0, Landroidx/collection/ObjectList;->_size:I

    if-eq v0, p1, :cond_2

    const/4 p1, 0x1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    return p1
.end method

.method public final set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .param p1    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x0L
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITE;)TE;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    if-ltz p1, :cond_0

    .line 4
    .line 5
    iget v2, p0, Landroidx/collection/ObjectList;->_size:I

    .line 6
    .line 7
    if-ge p1, v2, :cond_0

    .line 8
    .line 9
    move v1, v0

    .line 10
    :cond_0
    if-eqz v1, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Landroidx/collection/ObjectList;->content:[Ljava/lang/Object;

    .line 13
    .line 14
    aget-object v1, v0, p1

    .line 15
    .line 16
    aput-object p2, v0, p1

    .line 17
    .line 18
    return-object v1

    .line 19
    :cond_1
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    .line 20
    .line 21
    new-instance v1, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    const-string v2, "set index "

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string p1, " must be between 0 .. "

    .line 35
    .line 36
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    iget p1, p0, Landroidx/collection/ObjectList;->_size:I

    .line 40
    .line 41
    sub-int/2addr p1, v0

    .line 42
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-direct {p2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p2
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

.method public final trim(I)V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/collection/ObjectList;->_size:I

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    iget-object v0, p0, Landroidx/collection/ObjectList;->content:[Ljava/lang/Object;

    .line 8
    .line 9
    array-length v1, v0

    .line 10
    if-le v1, p1, :cond_0

    .line 11
    .line 12
    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string v0, "copyOf(this, newSize)"

    .line 17
    .line 18
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Landroidx/collection/ObjectList;->content:[Ljava/lang/Object;

    .line 22
    .line 23
    :cond_0
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
