.class public final Landroidx/collection/ArraySet;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Collection;
.implements Ljava/util/Set;
.implements Lw3/b;
.implements Lw3/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/collection/ArraySet$ElementIterator;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Collection<",
        "TE;>;",
        "Ljava/util/Set<",
        "TE;>;",
        "Lw3/b;",
        "Lw3/h;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u000c\n\u0002\u0010\u0011\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010)\n\u0000\n\u0002\u0010\u001e\n\u0002\u0008\u0003\n\u0002\u0010\u0015\n\u0002\u0008\u0019\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0008\u0012\u0004\u0012\u00028\u00000\u0003:\u0001BB\u0013\u0008\u0007\u0012\u0008\u0008\u0002\u0010=\u001a\u00020\u0006\u00a2\u0006\u0004\u0008>\u0010:B\u001b\u0008\u0016\u0012\u0010\u0010?\u001a\u000c\u0012\u0006\u0008\u0001\u0012\u00028\u0000\u0018\u00010\u0000\u00a2\u0006\u0004\u0008>\u0010@B\u0019\u0008\u0016\u0012\u000e\u0010?\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010&\u00a2\u0006\u0004\u0008>\u0010AB\u001b\u0008\u0016\u0012\u0010\u0010\u0015\u001a\u000c\u0012\u0006\u0008\u0001\u0012\u00028\u0000\u0018\u00010\u001a\u00a2\u0006\u0004\u0008>\u00104J\u0008\u0010\u0005\u001a\u00020\u0004H\u0016J\u000e\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000f\u001a\u00020\u00062\u0008\u0010\u000e\u001a\u0004\u0018\u00010\rJ\u0015\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0008\u0010\u0013\u001a\u00020\nH\u0016J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u000cJ\u0016\u0010\u0016\u001a\u00020\u00042\u000e\u0010\u0015\u001a\n\u0012\u0006\u0008\u0001\u0012\u00028\u00000\u0000J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u000cJ\u0015\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0018\u0010\u0012J\u0016\u0010\u0019\u001a\u00020\n2\u000e\u0010\u0015\u001a\n\u0012\u0006\u0008\u0001\u0012\u00028\u00000\u0000J\u0015\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u001a\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\'\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u001a\"\u0004\u0008\u0001\u0010\u001d2\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u001a\u00a2\u0006\u0004\u0008\u001b\u0010\u001eJ\u0013\u0010 \u001a\u00020\n2\u0008\u0010\u001f\u001a\u0004\u0018\u00010\rH\u0096\u0002J\u0008\u0010!\u001a\u00020\u0006H\u0016J\u0008\u0010#\u001a\u00020\"H\u0016J\u000f\u0010%\u001a\u0008\u0012\u0004\u0012\u00028\u00000$H\u0096\u0002J\u0016\u0010(\u001a\u00020\n2\u000c\u0010\'\u001a\u0008\u0012\u0004\u0012\u00028\u00000&H\u0016J\u0016\u0010\u0016\u001a\u00020\n2\u000c\u0010\'\u001a\u0008\u0012\u0004\u0012\u00028\u00000&H\u0016J\u0016\u0010\u0019\u001a\u00020\n2\u000c\u0010\'\u001a\u0008\u0012\u0004\u0012\u00028\u00000&H\u0016J\u0016\u0010)\u001a\u00020\n2\u000c\u0010\'\u001a\u0008\u0012\u0004\u0012\u00028\u00000&H\u0016R\"\u0010+\u001a\u00020*8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008+\u0010,\u001a\u0004\u0008-\u0010.\"\u0004\u0008/\u00100R*\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u001a8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0015\u00101\u001a\u0004\u00082\u0010\u001c\"\u0004\u00083\u00104R\"\u00105\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u00085\u00106\u001a\u0004\u00087\u00108\"\u0004\u00089\u0010:R\u0014\u0010<\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008;\u00108\u00a8\u0006C"
    }
    d2 = {
        "Landroidx/collection/ArraySet;",
        "E",
        "",
        "",
        "Lkotlin/r2;",
        "clear",
        "",
        "minimumCapacity",
        "ensureCapacity",
        "element",
        "",
        "contains",
        "(Ljava/lang/Object;)Z",
        "",
        "key",
        "indexOf",
        "index",
        "valueAt",
        "(I)Ljava/lang/Object;",
        "isEmpty",
        "add",
        "array",
        "addAll",
        "remove",
        "removeAt",
        "removeAll",
        "",
        "toArray",
        "()[Ljava/lang/Object;",
        "T",
        "([Ljava/lang/Object;)[Ljava/lang/Object;",
        "other",
        "equals",
        "hashCode",
        "",
        "toString",
        "",
        "iterator",
        "",
        "elements",
        "containsAll",
        "retainAll",
        "",
        "hashes",
        "[I",
        "getHashes$collection",
        "()[I",
        "setHashes$collection",
        "([I)V",
        "[Ljava/lang/Object;",
        "getArray$collection",
        "setArray$collection",
        "([Ljava/lang/Object;)V",
        "_size",
        "I",
        "get_size$collection",
        "()I",
        "set_size$collection",
        "(I)V",
        "getSize",
        "size",
        "capacity",
        "<init>",
        "set",
        "(Landroidx/collection/ArraySet;)V",
        "(Ljava/util/Collection;)V",
        "ElementIterator",
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
        "SMAP\nArraySet.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArraySet.jvm.kt\nandroidx/collection/ArraySet\n+ 2 ArraySet.kt\nandroidx/collection/ArraySetKt\n*L\n1#1,300:1\n304#2,10:301\n317#2,14:311\n334#2:325\n339#2:326\n345#2:327\n350#2:328\n355#2,61:329\n420#2,17:390\n440#2,6:407\n450#2,60:413\n518#2,9:473\n531#2,22:482\n557#2,7:504\n568#2,19:511\n591#2,6:530\n601#2,6:536\n611#2,5:542\n620#2,8:547\n*S KotlinDebug\n*F\n+ 1 ArraySet.jvm.kt\nandroidx/collection/ArraySet\n*L\n98#1:301,10\n108#1:311,14\n118#1:325\n128#1:326\n138#1:327\n145#1:328\n157#1:329,61\n167#1:390,17\n177#1:407,6\n188#1:413,60\n197#1:473,9\n224#1:482,22\n231#1:504,7\n240#1:511,19\n267#1:530,6\n276#1:536,6\n286#1:542,5\n297#1:547,8\n*E\n"
    }
.end annotation


# instance fields
.field private _size:I

.field private array:[Ljava/lang/Object;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private hashes:[I
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3
    .annotation build Lu3/i;
    .end annotation

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1}, Landroidx/collection/ArraySet;-><init>(IILkotlin/jvm/internal/w;)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1
    .annotation build Lu3/i;
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v0, Landroidx/collection/internal/ContainerHelpersKt;->EMPTY_INTS:[I

    iput-object v0, p0, Landroidx/collection/ArraySet;->hashes:[I

    .line 3
    sget-object v0, Landroidx/collection/internal/ContainerHelpersKt;->EMPTY_OBJECTS:[Ljava/lang/Object;

    iput-object v0, p0, Landroidx/collection/ArraySet;->array:[Ljava/lang/Object;

    if-lez p1, :cond_0

    .line 4
    invoke-static {p0, p1}, Landroidx/collection/ArraySetKt;->allocArrays(Landroidx/collection/ArraySet;I)V

    :cond_0
    return-void
.end method

.method public synthetic constructor <init>(IILkotlin/jvm/internal/w;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 5
    :cond_0
    invoke-direct {p0, p1}, Landroidx/collection/ArraySet;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Landroidx/collection/ArraySet;)V
    .locals 1
    .param p1    # Landroidx/collection/ArraySet;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/ArraySet<",
            "+TE;>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 6
    invoke-direct {p0, v0}, Landroidx/collection/ArraySet;-><init>(I)V

    if-eqz p1, :cond_0

    .line 7
    invoke-virtual {p0, p1}, Landroidx/collection/ArraySet;->addAll(Landroidx/collection/ArraySet;)V

    :cond_0
    return-void
.end method

.method public constructor <init>(Ljava/util/Collection;)V
    .locals 1
    .param p1    # Ljava/util/Collection;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+TE;>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 8
    invoke-direct {p0, v0}, Landroidx/collection/ArraySet;-><init>(I)V

    if-eqz p1, :cond_0

    .line 9
    invoke-virtual {p0, p1}, Landroidx/collection/ArraySet;->addAll(Ljava/util/Collection;)Z

    :cond_0
    return-void
.end method

.method public constructor <init>([Ljava/lang/Object;)V
    .locals 1
    .param p1    # [Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TE;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 10
    invoke-direct {p0, v0}, Landroidx/collection/ArraySet;-><init>(I)V

    if-eqz p1, :cond_0

    .line 11
    invoke-static {p1}, Lkotlin/jvm/internal/i;->a([Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 12
    invoke-virtual {p0, v0}, Landroidx/collection/ArraySet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public add(Ljava/lang/Object;)Z
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
    invoke-virtual/range {p0 .. p0}, Landroidx/collection/ArraySet;->get_size$collection()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x0

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-static/range {p0 .. p0}, Landroidx/collection/ArraySetKt;->indexOfNull(Landroidx/collection/ArraySet;)I

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    move v5, v3

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    invoke-static {v0, v1, v4}, Landroidx/collection/ArraySetKt;->indexOf(Landroidx/collection/ArraySet;Ljava/lang/Object;I)I

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    move/from16 v16, v5

    .line 27
    .line 28
    move v5, v4

    .line 29
    move/from16 v4, v16

    .line 30
    .line 31
    :goto_0
    if-ltz v4, :cond_1

    .line 32
    .line 33
    goto/16 :goto_3

    .line 34
    .line 35
    :cond_1
    not-int v4, v4

    .line 36
    invoke-virtual/range {p0 .. p0}, Landroidx/collection/ArraySet;->getHashes$collection()[I

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    array-length v6, v6

    .line 41
    const/4 v7, 0x1

    .line 42
    if-lt v2, v6, :cond_6

    .line 43
    .line 44
    const/16 v6, 0x8

    .line 45
    .line 46
    if-lt v2, v6, :cond_2

    .line 47
    .line 48
    shr-int/lit8 v6, v2, 0x1

    .line 49
    .line 50
    add-int/2addr v6, v2

    .line 51
    goto :goto_1

    .line 52
    :cond_2
    const/4 v8, 0x4

    .line 53
    if-lt v2, v8, :cond_3

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_3
    move v6, v8

    .line 57
    :goto_1
    invoke-virtual/range {p0 .. p0}, Landroidx/collection/ArraySet;->getHashes$collection()[I

    .line 58
    .line 59
    .line 60
    move-result-object v8

    .line 61
    invoke-virtual/range {p0 .. p0}, Landroidx/collection/ArraySet;->getArray$collection()[Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v15

    .line 65
    invoke-static {v0, v6}, Landroidx/collection/ArraySetKt;->allocArrays(Landroidx/collection/ArraySet;I)V

    .line 66
    .line 67
    .line 68
    invoke-virtual/range {p0 .. p0}, Landroidx/collection/ArraySet;->get_size$collection()I

    .line 69
    .line 70
    .line 71
    move-result v6

    .line 72
    if-ne v2, v6, :cond_5

    .line 73
    .line 74
    invoke-virtual/range {p0 .. p0}, Landroidx/collection/ArraySet;->getHashes$collection()[I

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    array-length v6, v6

    .line 79
    if-nez v6, :cond_4

    .line 80
    .line 81
    move v3, v7

    .line 82
    :cond_4
    xor-int/2addr v3, v7

    .line 83
    if-eqz v3, :cond_6

    .line 84
    .line 85
    invoke-virtual/range {p0 .. p0}, Landroidx/collection/ArraySet;->getHashes$collection()[I

    .line 86
    .line 87
    .line 88
    move-result-object v9

    .line 89
    const/4 v10, 0x0

    .line 90
    const/4 v11, 0x0

    .line 91
    array-length v12, v8

    .line 92
    const/4 v13, 0x6

    .line 93
    const/4 v14, 0x0

    .line 94
    invoke-static/range {v8 .. v14}, Lkotlin/collections/l;->I0([I[IIIIILjava/lang/Object;)[I

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {p0 .. p0}, Landroidx/collection/ArraySet;->getArray$collection()[Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v10

    .line 101
    const/4 v12, 0x0

    .line 102
    array-length v13, v15

    .line 103
    const/4 v14, 0x6

    .line 104
    const/4 v3, 0x0

    .line 105
    move-object v9, v15

    .line 106
    move-object v15, v3

    .line 107
    invoke-static/range {v9 .. v15}, Lkotlin/collections/l;->K0([Ljava/lang/Object;[Ljava/lang/Object;IIIILjava/lang/Object;)[Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_5
    new-instance v1, Ljava/util/ConcurrentModificationException;

    .line 112
    .line 113
    invoke-direct {v1}, Ljava/util/ConcurrentModificationException;-><init>()V

    .line 114
    .line 115
    .line 116
    throw v1

    .line 117
    :cond_6
    :goto_2
    if-ge v4, v2, :cond_7

    .line 118
    .line 119
    invoke-virtual/range {p0 .. p0}, Landroidx/collection/ArraySet;->getHashes$collection()[I

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    invoke-virtual/range {p0 .. p0}, Landroidx/collection/ArraySet;->getHashes$collection()[I

    .line 124
    .line 125
    .line 126
    move-result-object v6

    .line 127
    add-int/lit8 v8, v4, 0x1

    .line 128
    .line 129
    invoke-static {v3, v6, v8, v4, v2}, Lkotlin/collections/l;->z0([I[IIII)[I

    .line 130
    .line 131
    .line 132
    invoke-virtual/range {p0 .. p0}, Landroidx/collection/ArraySet;->getArray$collection()[Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    invoke-virtual/range {p0 .. p0}, Landroidx/collection/ArraySet;->getArray$collection()[Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v6

    .line 140
    invoke-static {v3, v6, v8, v4, v2}, Lkotlin/collections/l;->B0([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    :cond_7
    invoke-virtual/range {p0 .. p0}, Landroidx/collection/ArraySet;->get_size$collection()I

    .line 144
    .line 145
    .line 146
    move-result v3

    .line 147
    if-ne v2, v3, :cond_8

    .line 148
    .line 149
    invoke-virtual/range {p0 .. p0}, Landroidx/collection/ArraySet;->getHashes$collection()[I

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    array-length v2, v2

    .line 154
    if-ge v4, v2, :cond_8

    .line 155
    .line 156
    invoke-virtual/range {p0 .. p0}, Landroidx/collection/ArraySet;->getHashes$collection()[I

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    aput v5, v2, v4

    .line 161
    .line 162
    invoke-virtual/range {p0 .. p0}, Landroidx/collection/ArraySet;->getArray$collection()[Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    aput-object v1, v2, v4

    .line 167
    .line 168
    invoke-virtual/range {p0 .. p0}, Landroidx/collection/ArraySet;->get_size$collection()I

    .line 169
    .line 170
    .line 171
    move-result v1

    .line 172
    add-int/2addr v1, v7

    .line 173
    invoke-virtual {v0, v1}, Landroidx/collection/ArraySet;->set_size$collection(I)V

    .line 174
    .line 175
    .line 176
    move v3, v7

    .line 177
    :goto_3
    return v3

    .line 178
    :cond_8
    new-instance v1, Ljava/util/ConcurrentModificationException;

    .line 179
    .line 180
    invoke-direct {v1}, Ljava/util/ConcurrentModificationException;-><init>()V

    .line 181
    .line 182
    .line 183
    throw v1
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

.method public final addAll(Landroidx/collection/ArraySet;)V
    .locals 8
    .param p1    # Landroidx/collection/ArraySet;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/ArraySet<",
            "+TE;>;)V"
        }
    .end annotation

    const-string v0, "array"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p1}, Landroidx/collection/ArraySet;->get_size$collection()I

    move-result v0

    .line 2
    invoke-virtual {p0}, Landroidx/collection/ArraySet;->get_size$collection()I

    move-result v1

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, Landroidx/collection/ArraySet;->ensureCapacity(I)V

    .line 3
    invoke-virtual {p0}, Landroidx/collection/ArraySet;->get_size$collection()I

    move-result v1

    if-nez v1, :cond_1

    if-lez v0, :cond_2

    .line 4
    invoke-virtual {p1}, Landroidx/collection/ArraySet;->getHashes$collection()[I

    move-result-object v1

    invoke-virtual {p0}, Landroidx/collection/ArraySet;->getHashes$collection()[I

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    move v5, v0

    invoke-static/range {v1 .. v7}, Lkotlin/collections/l;->I0([I[IIIIILjava/lang/Object;)[I

    .line 5
    invoke-virtual {p1}, Landroidx/collection/ArraySet;->getArray$collection()[Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0}, Landroidx/collection/ArraySet;->getArray$collection()[Ljava/lang/Object;

    move-result-object v2

    invoke-static/range {v1 .. v7}, Lkotlin/collections/l;->K0([Ljava/lang/Object;[Ljava/lang/Object;IIIILjava/lang/Object;)[Ljava/lang/Object;

    .line 6
    invoke-virtual {p0}, Landroidx/collection/ArraySet;->get_size$collection()I

    move-result p1

    if-nez p1, :cond_0

    .line 7
    invoke-virtual {p0, v0}, Landroidx/collection/ArraySet;->set_size$collection(I)V

    goto :goto_1

    .line 8
    :cond_0
    new-instance p1, Ljava/util/ConcurrentModificationException;

    invoke-direct {p1}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw p1

    :cond_1
    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    .line 9
    invoke-virtual {p1, v1}, Landroidx/collection/ArraySet;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroidx/collection/ArraySet;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public addAll(Ljava/util/Collection;)Z
    .locals 2
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

    .line 10
    invoke-virtual {p0}, Landroidx/collection/ArraySet;->get_size$collection()I

    move-result v0

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {p0, v0}, Landroidx/collection/ArraySet;->ensureCapacity(I)V

    .line 11
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 12
    invoke-virtual {p0, v1}, Landroidx/collection/ArraySet;->add(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    goto :goto_0

    :cond_0
    return v0
.end method

.method public clear()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/collection/ArraySet;->get_size$collection()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Landroidx/collection/internal/ContainerHelpersKt;->EMPTY_INTS:[I

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Landroidx/collection/ArraySet;->setHashes$collection([I)V

    .line 10
    .line 11
    .line 12
    sget-object v0, Landroidx/collection/internal/ContainerHelpersKt;->EMPTY_OBJECTS:[Ljava/lang/Object;

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Landroidx/collection/ArraySet;->setArray$collection([Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-virtual {p0, v0}, Landroidx/collection/ArraySet;->set_size$collection(I)V

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-virtual {p0}, Landroidx/collection/ArraySet;->get_size$collection()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    new-instance v0, Ljava/util/ConcurrentModificationException;

    .line 29
    .line 30
    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    .line 31
    .line 32
    .line 33
    throw v0
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

.method public contains(Ljava/lang/Object;)Z
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/collection/ArraySet;->indexOf(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public containsAll(Ljava/util/Collection;)Z
    .locals 1
    .param p1    # Ljava/util/Collection;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    .line 1
    const-string v0, "elements"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {p0, v0}, Landroidx/collection/ArraySet;->contains(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    const/4 p1, 0x0

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const/4 p1, 0x1

    .line 29
    :goto_0
    return p1
    .line 30
    .line 31
    .line 32
.end method

.method public final ensureCapacity(I)V
    .locals 10

    .line 1
    invoke-virtual {p0}, Landroidx/collection/ArraySet;->get_size$collection()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroidx/collection/ArraySet;->getHashes$collection()[I

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    array-length v1, v1

    .line 10
    if-ge v1, p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Landroidx/collection/ArraySet;->getHashes$collection()[I

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {p0}, Landroidx/collection/ArraySet;->getArray$collection()[Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-static {p0, p1}, Landroidx/collection/ArraySetKt;->allocArrays(Landroidx/collection/ArraySet;I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Landroidx/collection/ArraySet;->get_size$collection()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-lez p1, :cond_0

    .line 28
    .line 29
    invoke-virtual {p0}, Landroidx/collection/ArraySet;->getHashes$collection()[I

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    const/4 v4, 0x0

    .line 34
    const/4 v5, 0x0

    .line 35
    invoke-virtual {p0}, Landroidx/collection/ArraySet;->get_size$collection()I

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    const/4 v7, 0x6

    .line 40
    const/4 v8, 0x0

    .line 41
    invoke-static/range {v2 .. v8}, Lkotlin/collections/l;->I0([I[IIIIILjava/lang/Object;)[I

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Landroidx/collection/ArraySet;->getArray$collection()[Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    const/4 v6, 0x0

    .line 49
    invoke-virtual {p0}, Landroidx/collection/ArraySet;->get_size$collection()I

    .line 50
    .line 51
    .line 52
    move-result v7

    .line 53
    const/4 v8, 0x6

    .line 54
    const/4 v9, 0x0

    .line 55
    move-object v3, v1

    .line 56
    invoke-static/range {v3 .. v9}, Lkotlin/collections/l;->K0([Ljava/lang/Object;[Ljava/lang/Object;IIIILjava/lang/Object;)[Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    :cond_0
    invoke-virtual {p0}, Landroidx/collection/ArraySet;->get_size$collection()I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    if-ne p1, v0, :cond_1

    .line 64
    .line 65
    return-void

    .line 66
    :cond_1
    new-instance p1, Ljava/util/ConcurrentModificationException;

    .line 67
    .line 68
    invoke-direct {p1}, Ljava/util/ConcurrentModificationException;-><init>()V

    .line 69
    .line 70
    .line 71
    throw p1
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

.method public equals(Ljava/lang/Object;)Z
    .locals 6
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    goto :goto_2

    .line 5
    :cond_0
    instance-of v1, p1, Ljava/util/Set;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_3

    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/collection/ArraySet;->size()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    move-object v3, p1

    .line 15
    check-cast v3, Ljava/util/Set;

    .line 16
    .line 17
    invoke-interface {v3}, Ljava/util/Set;->size()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-eq v1, v3, :cond_1

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    :try_start_0
    invoke-virtual {p0}, Landroidx/collection/ArraySet;->get_size$collection()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    move v3, v2

    .line 29
    :goto_0
    if-ge v3, v1, :cond_4

    .line 30
    .line 31
    invoke-virtual {p0, v3}, Landroidx/collection/ArraySet;->valueAt(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    move-object v5, p1

    .line 36
    check-cast v5, Ljava/util/Set;

    .line 37
    .line 38
    invoke-interface {v5, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v4
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    if-nez v4, :cond_2

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :catch_0
    :cond_3
    :goto_1
    move v0, v2

    .line 49
    :cond_4
    :goto_2
    return v0
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
.end method

.method public final getArray$collection()[Ljava/lang/Object;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/collection/ArraySet;->array:[Ljava/lang/Object;

    return-object v0
.end method

.method public final getHashes$collection()[I
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/collection/ArraySet;->hashes:[I

    return-object v0
.end method

.method public getSize()I
    .locals 1

    iget v0, p0, Landroidx/collection/ArraySet;->_size:I

    return v0
.end method

.method public final get_size$collection()I
    .locals 1

    iget v0, p0, Landroidx/collection/ArraySet;->_size:I

    return v0
.end method

.method public hashCode()I
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/collection/ArraySet;->getHashes$collection()[I

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroidx/collection/ArraySet;->get_size$collection()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    move v3, v2

    .line 11
    :goto_0
    if-ge v2, v1, :cond_0

    .line 12
    .line 13
    aget v4, v0, v2

    .line 14
    .line 15
    add-int/2addr v3, v4

    .line 16
    add-int/lit8 v2, v2, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return v3
.end method

.method public final indexOf(Ljava/lang/Object;)I
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param

    if-nez p1, :cond_0

    invoke-static {p0}, Landroidx/collection/ArraySetKt;->indexOfNull(Landroidx/collection/ArraySet;)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-static {p0, p1, v0}, Landroidx/collection/ArraySetKt;->indexOf(Landroidx/collection/ArraySet;Ljava/lang/Object;I)I

    move-result p1

    :goto_0
    return p1
.end method

.method public isEmpty()Z
    .locals 1

    invoke-virtual {p0}, Landroidx/collection/ArraySet;->get_size$collection()I

    move-result v0

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TE;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Landroidx/collection/ArraySet$ElementIterator;

    invoke-direct {v0, p0}, Landroidx/collection/ArraySet$ElementIterator;-><init>(Landroidx/collection/ArraySet;)V

    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/collection/ArraySet;->indexOf(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-ltz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroidx/collection/ArraySet;->removeAt(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    :goto_0
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

.method public final removeAll(Landroidx/collection/ArraySet;)Z
    .locals 5
    .param p1    # Landroidx/collection/ArraySet;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/ArraySet<",
            "+TE;>;)Z"
        }
    .end annotation

    const-string v0, "array"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p1}, Landroidx/collection/ArraySet;->get_size$collection()I

    move-result v0

    .line 2
    invoke-virtual {p0}, Landroidx/collection/ArraySet;->get_size$collection()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v0, :cond_0

    .line 3
    invoke-virtual {p1, v3}, Landroidx/collection/ArraySet;->valueAt(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p0, v4}, Landroidx/collection/ArraySet;->remove(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p0}, Landroidx/collection/ArraySet;->get_size$collection()I

    move-result p1

    if-eq v1, p1, :cond_1

    const/4 v2, 0x1

    :cond_1
    return v2
.end method

.method public removeAll(Ljava/util/Collection;)Z
    .locals 2
    .param p1    # Ljava/util/Collection;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 6
    invoke-virtual {p0, v1}, Landroidx/collection/ArraySet;->remove(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    goto :goto_0

    :cond_0
    return v0
.end method

.method public final removeAt(I)Ljava/lang/Object;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/collection/ArraySet;->get_size$collection()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroidx/collection/ArraySet;->getArray$collection()[Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    aget-object v1, v1, p1

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    if-gt v0, v2, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Landroidx/collection/ArraySet;->clear()V

    .line 15
    .line 16
    .line 17
    goto/16 :goto_1

    .line 18
    .line 19
    :cond_0
    add-int/lit8 v3, v0, -0x1

    .line 20
    .line 21
    invoke-virtual {p0}, Landroidx/collection/ArraySet;->getHashes$collection()[I

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    array-length v4, v4

    .line 26
    const/16 v5, 0x8

    .line 27
    .line 28
    if-le v4, v5, :cond_3

    .line 29
    .line 30
    invoke-virtual {p0}, Landroidx/collection/ArraySet;->get_size$collection()I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    invoke-virtual {p0}, Landroidx/collection/ArraySet;->getHashes$collection()[I

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    array-length v6, v6

    .line 39
    div-int/lit8 v6, v6, 0x3

    .line 40
    .line 41
    if-ge v4, v6, :cond_3

    .line 42
    .line 43
    invoke-virtual {p0}, Landroidx/collection/ArraySet;->get_size$collection()I

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-le v4, v5, :cond_1

    .line 48
    .line 49
    invoke-virtual {p0}, Landroidx/collection/ArraySet;->get_size$collection()I

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    invoke-virtual {p0}, Landroidx/collection/ArraySet;->get_size$collection()I

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    shr-int/lit8 v2, v5, 0x1

    .line 58
    .line 59
    add-int v5, v4, v2

    .line 60
    .line 61
    :cond_1
    invoke-virtual {p0}, Landroidx/collection/ArraySet;->getHashes$collection()[I

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-virtual {p0}, Landroidx/collection/ArraySet;->getArray$collection()[Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    invoke-static {p0, v5}, Landroidx/collection/ArraySetKt;->allocArrays(Landroidx/collection/ArraySet;I)V

    .line 70
    .line 71
    .line 72
    if-lez p1, :cond_2

    .line 73
    .line 74
    invoke-virtual {p0}, Landroidx/collection/ArraySet;->getHashes$collection()[I

    .line 75
    .line 76
    .line 77
    move-result-object v7

    .line 78
    const/4 v8, 0x0

    .line 79
    const/4 v9, 0x0

    .line 80
    const/4 v11, 0x6

    .line 81
    const/4 v12, 0x0

    .line 82
    move-object v6, v2

    .line 83
    move v10, p1

    .line 84
    invoke-static/range {v6 .. v12}, Lkotlin/collections/l;->I0([I[IIIIILjava/lang/Object;)[I

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, Landroidx/collection/ArraySet;->getArray$collection()[Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v7

    .line 91
    move-object v6, v4

    .line 92
    invoke-static/range {v6 .. v12}, Lkotlin/collections/l;->K0([Ljava/lang/Object;[Ljava/lang/Object;IIIILjava/lang/Object;)[Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    :cond_2
    if-ge p1, v3, :cond_5

    .line 96
    .line 97
    invoke-virtual {p0}, Landroidx/collection/ArraySet;->getHashes$collection()[I

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    add-int/lit8 v6, p1, 0x1

    .line 102
    .line 103
    add-int/lit8 v7, v3, 0x1

    .line 104
    .line 105
    invoke-static {v2, v5, p1, v6, v7}, Lkotlin/collections/l;->z0([I[IIII)[I

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0}, Landroidx/collection/ArraySet;->getArray$collection()[Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-static {v4, v2, p1, v6, v7}, Lkotlin/collections/l;->B0([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_3
    if-ge p1, v3, :cond_4

    .line 117
    .line 118
    invoke-virtual {p0}, Landroidx/collection/ArraySet;->getHashes$collection()[I

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    invoke-virtual {p0}, Landroidx/collection/ArraySet;->getHashes$collection()[I

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    add-int/lit8 v5, p1, 0x1

    .line 127
    .line 128
    add-int/lit8 v6, v3, 0x1

    .line 129
    .line 130
    invoke-static {v2, v4, p1, v5, v6}, Lkotlin/collections/l;->z0([I[IIII)[I

    .line 131
    .line 132
    .line 133
    invoke-virtual {p0}, Landroidx/collection/ArraySet;->getArray$collection()[Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    invoke-virtual {p0}, Landroidx/collection/ArraySet;->getArray$collection()[Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    invoke-static {v2, v4, p1, v5, v6}, Lkotlin/collections/l;->B0([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    :cond_4
    invoke-virtual {p0}, Landroidx/collection/ArraySet;->getArray$collection()[Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    const/4 v2, 0x0

    .line 149
    aput-object v2, p1, v3

    .line 150
    .line 151
    :cond_5
    :goto_0
    invoke-virtual {p0}, Landroidx/collection/ArraySet;->get_size$collection()I

    .line 152
    .line 153
    .line 154
    move-result p1

    .line 155
    if-ne v0, p1, :cond_6

    .line 156
    .line 157
    invoke-virtual {p0, v3}, Landroidx/collection/ArraySet;->set_size$collection(I)V

    .line 158
    .line 159
    .line 160
    :goto_1
    return-object v1

    .line 161
    :cond_6
    new-instance p1, Ljava/util/ConcurrentModificationException;

    .line 162
    .line 163
    invoke-direct {p1}, Ljava/util/ConcurrentModificationException;-><init>()V

    .line 164
    .line 165
    .line 166
    throw p1
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

.method public retainAll(Ljava/util/Collection;)Z
    .locals 5
    .param p1    # Ljava/util/Collection;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    .line 1
    const-string v0, "elements"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/collection/ArraySet;->get_size$collection()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x1

    .line 11
    sub-int/2addr v0, v1

    .line 12
    const/4 v2, 0x0

    .line 13
    :goto_0
    const/4 v3, -0x1

    .line 14
    if-ge v3, v0, :cond_1

    .line 15
    .line 16
    move-object v3, p1

    .line 17
    check-cast v3, Ljava/lang/Iterable;

    .line 18
    .line 19
    invoke-virtual {p0}, Landroidx/collection/ArraySet;->getArray$collection()[Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    aget-object v4, v4, v0

    .line 24
    .line 25
    invoke-static {v3, v4}, Lkotlin/collections/u;->T1(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-nez v3, :cond_0

    .line 30
    .line 31
    invoke-virtual {p0, v0}, Landroidx/collection/ArraySet;->removeAt(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move v2, v1

    .line 35
    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    return v2
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
.end method

.method public final setArray$collection([Ljava/lang/Object;)V
    .locals 1
    .param p1    # [Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Landroidx/collection/ArraySet;->array:[Ljava/lang/Object;

    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
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

.method public final setHashes$collection([I)V
    .locals 1
    .param p1    # [I
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Landroidx/collection/ArraySet;->hashes:[I

    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
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

.method public final set_size$collection(I)V
    .locals 0

    iput p1, p0, Landroidx/collection/ArraySet;->_size:I

    return-void
.end method

.method public final bridge size()I
    .locals 1

    invoke-virtual {p0}, Landroidx/collection/ArraySet;->getSize()I

    move-result v0

    return v0
.end method

.method public final toArray()[Ljava/lang/Object;
    .locals 3
    .annotation build Lp4/l;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/collection/ArraySet;->array:[Ljava/lang/Object;

    const/4 v1, 0x0

    iget v2, p0, Landroidx/collection/ArraySet;->_size:I

    invoke-static {v0, v1, v2}, Lkotlin/collections/l;->l1([Ljava/lang/Object;II)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 3
    .param p1    # [Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)[TT;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    const-string v0, "array"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget v0, p0, Landroidx/collection/ArraySet;->_size:I

    invoke-static {p1, v0}, Landroidx/collection/ArraySetJvmUtil;->resizeForToArray([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    .line 3
    iget-object v0, p0, Landroidx/collection/ArraySet;->array:[Ljava/lang/Object;

    const/4 v1, 0x0

    iget v2, p0, Landroidx/collection/ArraySet;->_size:I

    invoke-static {v0, p1, v1, v1, v2}, Lkotlin/collections/l;->B0([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    const-string v0, "result"

    .line 4
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 4
    .annotation build Lp4/l;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/collection/ArraySet;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string/jumbo v0, "{}"

    .line 8
    .line 9
    .line 10
    goto :goto_2

    .line 11
    :cond_0
    invoke-virtual {p0}, Landroidx/collection/ArraySet;->get_size$collection()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    mul-int/lit8 v0, v0, 0xe

    .line 16
    .line 17
    new-instance v1, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 20
    .line 21
    .line 22
    const/16 v0, 0x7b

    .line 23
    .line 24
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Landroidx/collection/ArraySet;->get_size$collection()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    const/4 v2, 0x0

    .line 32
    :goto_0
    if-ge v2, v0, :cond_3

    .line 33
    .line 34
    if-lez v2, :cond_1

    .line 35
    .line 36
    const-string v3, ", "

    .line 37
    .line 38
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    :cond_1
    invoke-virtual {p0, v2}, Landroidx/collection/ArraySet;->valueAt(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    if-eq v3, p0, :cond_2

    .line 46
    .line 47
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    const-string v3, "(this Set)"

    .line 52
    .line 53
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_3
    const/16 v0, 0x7d

    .line 60
    .line 61
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    const-string v1, "StringBuilder(capacity).\u2026builderAction).toString()"

    .line 69
    .line 70
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    :goto_2
    return-object v0
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

.method public final valueAt(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    invoke-virtual {p0}, Landroidx/collection/ArraySet;->getArray$collection()[Ljava/lang/Object;

    move-result-object v0

    aget-object p1, v0, p1

    return-object p1
.end method
