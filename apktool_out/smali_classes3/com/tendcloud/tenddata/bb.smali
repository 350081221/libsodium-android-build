.class public Lcom/tendcloud/tenddata/bb;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tendcloud/tenddata/bb$b;,
        Lcom/tendcloud/tenddata/bb$a;
    }
.end annotation


# static fields
.field private static a:I = 0x2

.field private static b:I = 0x6

.field private static c:I = 0x6

.field private static d:I = -0x28

.field private static e:I = 0x4


# instance fields
.field private f:Lcom/tendcloud/tenddata/ay;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/tendcloud/tenddata/ay;

    invoke-direct {v0}, Lcom/tendcloud/tenddata/ay;-><init>()V

    invoke-direct {p0, v0}, Lcom/tendcloud/tenddata/bb;-><init>(Lcom/tendcloud/tenddata/ay;)V

    return-void
.end method

.method public constructor <init>(Lcom/tendcloud/tenddata/ay;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/tendcloud/tenddata/bb;->f:Lcom/tendcloud/tenddata/ay;

    return-void
.end method


# virtual methods
.method public a(II)D
    .locals 7

    const-wide/16 v0, 0x0

    if-gez p1, :cond_2

    if-ltz p2, :cond_0

    goto :goto_0

    :cond_0
    add-int/2addr p2, p1

    .line 41
    div-int/lit8 p2, p2, 0x2

    int-to-double v2, p2

    int-to-double p1, p1

    sub-double/2addr p1, v2

    .line 42
    invoke-static {p1, p2}, Ljava/lang/Math;->abs(D)D

    move-result-wide p1

    .line 43
    sget v4, Lcom/tendcloud/tenddata/bb;->a:I

    int-to-double v5, v4

    cmpl-double v5, p1, v5

    if-lez v5, :cond_1

    int-to-double v0, v4

    sub-double v0, p1, v0

    :cond_1
    add-double/2addr v0, v2

    div-double/2addr v0, v2

    .line 44
    sget p1, Lcom/tendcloud/tenddata/bb;->b:I

    int-to-double p1, p1

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->pow(DD)D

    move-result-wide p1

    return-wide p1

    :cond_2
    :goto_0
    return-wide v0
.end method

.method public a(Lcom/tendcloud/tenddata/ba;Lcom/tendcloud/tenddata/ba;)D
    .locals 18

    move-object/from16 v0, p0

    const/4 v1, 0x0

    move-object/from16 v2, p1

    .line 1
    invoke-virtual {v2, v1}, Lcom/tendcloud/tenddata/ba;->a(Z)Ljava/util/Map;

    move-result-object v3

    move-object/from16 v4, p2

    .line 2
    invoke-virtual {v4, v1}, Lcom/tendcloud/tenddata/ba;->a(Z)Ljava/util/Map;

    move-result-object v5

    .line 3
    new-instance v6, Ljava/util/HashSet;

    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    .line 4
    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    move v10, v1

    move v11, v10

    const-wide/16 v12, 0x0

    const-wide/16 v14, 0x0

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Ljava/util/Map$Entry;

    .line 5
    invoke-interface/range {v16 .. v16}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v1, v17

    check-cast v1, Lcom/tendcloud/tenddata/ax;

    .line 6
    invoke-interface/range {v16 .. v16}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    invoke-interface {v5, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/tendcloud/tenddata/ax;

    .line 7
    invoke-virtual {v1}, Lcom/tendcloud/tenddata/ax;->c()B

    move-result v9

    add-int/2addr v11, v9

    if-nez v8, :cond_0

    .line 8
    invoke-interface {v6, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    add-int/lit8 v10, v10, 0x1

    .line 9
    invoke-virtual {v1}, Lcom/tendcloud/tenddata/ax;->c()B

    move-result v9

    invoke-virtual {v8}, Lcom/tendcloud/tenddata/ax;->c()B

    move-result v2

    invoke-virtual {v0, v9, v2}, Lcom/tendcloud/tenddata/bb;->b(II)D

    move-result-wide v16

    add-double v12, v12, v16

    .line 10
    invoke-virtual {v1}, Lcom/tendcloud/tenddata/ax;->c()B

    move-result v1

    invoke-virtual {v8}, Lcom/tendcloud/tenddata/ax;->c()B

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/tendcloud/tenddata/bb;->a(II)D

    move-result-wide v1

    mul-double v16, v16, v1

    add-double v14, v14, v16

    :goto_1
    move-object/from16 v2, p1

    const/4 v1, 0x0

    goto :goto_0

    :cond_1
    if-nez v10, :cond_2

    const-wide/16 v1, 0x0

    return-wide v1

    :cond_2
    const-wide/16 v1, 0x0

    .line 11
    invoke-interface {v5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_3
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Map$Entry;

    .line 12
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/tendcloud/tenddata/ax;

    invoke-virtual {v8}, Lcom/tendcloud/tenddata/ax;->c()B

    move-result v8

    add-int/2addr v11, v8

    .line 13
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    invoke-interface {v3, v8}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_3

    .line 14
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 15
    :cond_4
    invoke-virtual/range {p1 .. p1}, Lcom/tendcloud/tenddata/ba;->c()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual/range {p2 .. p2}, Lcom/tendcloud/tenddata/ba;->c()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    add-int/2addr v3, v4

    const/4 v4, 0x0

    sub-int/2addr v3, v4

    .line 16
    div-int/2addr v11, v3

    .line 17
    iget-object v3, v0, Lcom/tendcloud/tenddata/bb;->f:Lcom/tendcloud/tenddata/ay;

    invoke-virtual {v3}, Lcom/tendcloud/tenddata/ay;->d()I

    move-result v3

    int-to-double v4, v11

    const-wide v7, 0x3ff3333333333333L    # 1.2

    add-double/2addr v4, v7

    double-to-int v4, v4

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 18
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move-wide v8, v1

    :cond_5
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const-wide/high16 v5, 0x3ff0000000000000L    # 1.0

    if-eqz v1, :cond_6

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tendcloud/tenddata/ax;

    .line 19
    invoke-virtual {v1}, Lcom/tendcloud/tenddata/ax;->c()B

    move-result v1

    if-le v1, v3, :cond_5

    add-double/2addr v8, v5

    goto :goto_3

    :cond_6
    mul-int/lit8 v10, v10, 0x2

    int-to-double v1, v10

    add-double/2addr v1, v8

    div-double/2addr v8, v1

    div-double/2addr v14, v12

    .line 20
    sget v1, Lcom/tendcloud/tenddata/bb;->e:I

    int-to-double v1, v1

    invoke-static {v8, v9, v1, v2}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v1

    sub-double/2addr v5, v1

    mul-double/2addr v14, v5

    return-wide v14
.end method

.method public a(Lcom/tendcloud/tenddata/ba;Ljava/util/List;)D
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tendcloud/tenddata/ba;",
            "Ljava/util/List<",
            "Lcom/tendcloud/tenddata/ba;",
            ">;)D"
        }
    .end annotation

    .line 21
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    const-wide/16 v0, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/tendcloud/tenddata/ba;

    .line 22
    invoke-virtual {p0, v2, p1}, Lcom/tendcloud/tenddata/bb;->a(Lcom/tendcloud/tenddata/ba;Lcom/tendcloud/tenddata/ba;)D

    move-result-wide v2

    .line 23
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(DD)D

    move-result-wide v0

    goto :goto_0

    :cond_0
    return-wide v0
.end method

.method public a(Ljava/util/List;Ljava/util/List;)D
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tendcloud/tenddata/ba;",
            ">;",
            "Ljava/util/List<",
            "Lcom/tendcloud/tenddata/ba;",
            ">;)D"
        }
    .end annotation

    .line 24
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const-wide/16 v1, 0x0

    if-nez v0, :cond_3

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 25
    :cond_0
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 26
    invoke-virtual {p0, p1, p2, v0}, Lcom/tendcloud/tenddata/bb;->b(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 27
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 p2, 0x0

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tendcloud/tenddata/bb$a;

    .line 28
    iget-object v3, v0, Lcom/tendcloud/tenddata/bb$a;->fp1:Lcom/tendcloud/tenddata/ba;

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/tendcloud/tenddata/bb$a;->fp2:Lcom/tendcloud/tenddata/ba;

    if-eqz v3, :cond_1

    .line 29
    iget-wide v3, v0, Lcom/tendcloud/tenddata/bb$a;->score:D

    add-double/2addr v1, v3

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_2
    int-to-double p1, p2

    div-double/2addr v1, p1

    :cond_3
    :goto_1
    return-wide v1
.end method

.method public a(Ljava/util/List;Ljava/util/List;Ljava/util/List;)D
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tendcloud/tenddata/ba;",
            ">;",
            "Ljava/util/List<",
            "Lcom/tendcloud/tenddata/ba;",
            ">;",
            "Ljava/util/List<",
            "Lcom/tendcloud/tenddata/ba;",
            ">;)D"
        }
    .end annotation

    .line 30
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const-wide/16 v1, 0x0

    if-nez v0, :cond_5

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    .line 31
    :cond_0
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 32
    invoke-virtual {p0, p1, p2, v0}, Lcom/tendcloud/tenddata/bb;->b(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 33
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 p2, 0x0

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tendcloud/tenddata/bb$a;

    .line 34
    iget-object v3, v0, Lcom/tendcloud/tenddata/bb$a;->fp1:Lcom/tendcloud/tenddata/ba;

    if-eqz v3, :cond_2

    iget-object v4, v0, Lcom/tendcloud/tenddata/bb$a;->fp2:Lcom/tendcloud/tenddata/ba;

    if-eqz v4, :cond_2

    .line 35
    iget-wide v5, v0, Lcom/tendcloud/tenddata/bb$a;->score:D

    add-double/2addr v1, v5

    add-int/lit8 p2, p2, 0x1

    .line 36
    invoke-virtual {p0, v3, v4}, Lcom/tendcloud/tenddata/bb;->b(Lcom/tendcloud/tenddata/ba;Lcom/tendcloud/tenddata/ba;)Lcom/tendcloud/tenddata/ba;

    move-result-object v0

    invoke-interface {p3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 37
    :cond_2
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v3

    iget-object v4, p0, Lcom/tendcloud/tenddata/bb;->f:Lcom/tendcloud/tenddata/ay;

    invoke-virtual {v4}, Lcom/tendcloud/tenddata/ay;->b()I

    move-result v4

    if-ge v3, v4, :cond_1

    .line 38
    iget-object v3, v0, Lcom/tendcloud/tenddata/bb$a;->fp1:Lcom/tendcloud/tenddata/ba;

    if-nez v3, :cond_3

    iget-object v0, v0, Lcom/tendcloud/tenddata/bb$a;->fp2:Lcom/tendcloud/tenddata/ba;

    invoke-virtual {v0}, Lcom/tendcloud/tenddata/ba;->d()Lcom/tendcloud/tenddata/ba;

    move-result-object v0

    goto :goto_1

    :cond_3
    invoke-virtual {v3}, Lcom/tendcloud/tenddata/ba;->d()Lcom/tendcloud/tenddata/ba;

    move-result-object v0

    :goto_1
    invoke-interface {p3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    int-to-double p1, p2

    div-double/2addr v1, p1

    return-wide v1

    .line 39
    :cond_5
    :goto_2
    invoke-interface {p3, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 40
    invoke-interface {p3, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-wide v1
.end method

.method public b(II)D
    .locals 3

    if-gez p1, :cond_2

    if-ltz p2, :cond_0

    goto :goto_1

    .line 52
    :cond_0
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    int-to-double p1, p1

    .line 53
    sget v0, Lcom/tendcloud/tenddata/bb;->d:I

    int-to-double v1, v0

    cmpl-double v1, p1, v1

    if-ltz v1, :cond_1

    const-wide/high16 p1, 0x3ff0000000000000L    # 1.0

    goto :goto_0

    :cond_1
    const-wide/high16 v1, 0x4060000000000000L    # 128.0

    add-double/2addr p1, v1

    add-int/lit16 v0, v0, 0x80

    int-to-double v0, v0

    div-double/2addr p1, v0

    sget v0, Lcom/tendcloud/tenddata/bb;->c:I

    int-to-double v0, v0

    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->pow(DD)D

    move-result-wide p1

    :goto_0
    return-wide p1

    :cond_2
    :goto_1
    const-wide/16 p1, 0x0

    return-wide p1
.end method

.method public b(Lcom/tendcloud/tenddata/ba;Lcom/tendcloud/tenddata/ba;)Lcom/tendcloud/tenddata/ba;
    .locals 17

    move-object/from16 v0, p0

    const/4 v1, 0x0

    move-object/from16 v2, p1

    .line 1
    invoke-virtual {v2, v1}, Lcom/tendcloud/tenddata/ba;->a(Z)Ljava/util/Map;

    move-result-object v2

    move-object/from16 v3, p2

    .line 2
    invoke-virtual {v3, v1}, Lcom/tendcloud/tenddata/ba;->a(Z)Ljava/util/Map;

    move-result-object v1

    .line 3
    new-instance v4, Ljava/util/TreeMap;

    invoke-direct {v4}, Ljava/util/TreeMap;-><init>()V

    .line 4
    new-instance v5, Lcom/tendcloud/tenddata/ba;

    invoke-direct {v5}, Lcom/tendcloud/tenddata/ba;-><init>()V

    .line 5
    invoke-virtual/range {p2 .. p2}, Lcom/tendcloud/tenddata/ba;->b()J

    move-result-wide v6

    invoke-virtual {v5, v6, v7}, Lcom/tendcloud/tenddata/ba;->setPoiId(J)V

    .line 6
    invoke-virtual/range {p2 .. p2}, Lcom/tendcloud/tenddata/ba;->a()I

    move-result v3

    invoke-virtual {v5, v3}, Lcom/tendcloud/tenddata/ba;->setTimestamp(I)V

    .line 7
    new-instance v3, Ljava/util/LinkedList;

    invoke-direct {v3}, Ljava/util/LinkedList;-><init>()V

    .line 8
    invoke-virtual {v5, v3}, Lcom/tendcloud/tenddata/ba;->setBsslist(Ljava/util/List;)V

    .line 9
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    const-wide v8, 0x3f1a36e2eb1c432dL    # 1.0E-4

    if-eqz v7, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Map$Entry;

    .line 10
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/tendcloud/tenddata/ax;

    .line 11
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v1, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/tendcloud/tenddata/ax;

    if-nez v7, :cond_1

    .line 12
    invoke-virtual {v10}, Lcom/tendcloud/tenddata/ax;->c()B

    move-result v7

    neg-int v7, v7

    int-to-double v11, v7

    .line 13
    :goto_1
    invoke-static {v11, v12}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v7

    invoke-interface {v4, v7}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    add-double/2addr v11, v8

    goto :goto_1

    .line 14
    :cond_0
    invoke-static {v11, v12}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v7

    invoke-interface {v4, v7, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 15
    :cond_1
    new-instance v8, Lcom/tendcloud/tenddata/ax;

    .line 16
    invoke-virtual {v7}, Lcom/tendcloud/tenddata/ax;->a()Ljava/lang/String;

    move-result-object v12

    .line 17
    invoke-virtual {v7}, Lcom/tendcloud/tenddata/ax;->b()Ljava/lang/String;

    move-result-object v13

    .line 18
    invoke-virtual {v7}, Lcom/tendcloud/tenddata/ax;->c()B

    move-result v9

    invoke-virtual {v10}, Lcom/tendcloud/tenddata/ax;->c()B

    move-result v10

    add-int/2addr v9, v10

    div-int/lit8 v9, v9, 0x2

    int-to-byte v14, v9

    .line 19
    invoke-virtual {v7}, Lcom/tendcloud/tenddata/ax;->d()B

    move-result v15

    .line 20
    invoke-virtual {v7}, Lcom/tendcloud/tenddata/ax;->e()B

    move-result v16

    move-object v11, v8

    invoke-direct/range {v11 .. v16}, Lcom/tendcloud/tenddata/ax;-><init>(Ljava/lang/String;Ljava/lang/String;BBB)V

    .line 21
    invoke-interface {v3, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 22
    :cond_2
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    .line 23
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v2, v7}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_3

    .line 24
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/tendcloud/tenddata/ax;

    invoke-virtual {v7}, Lcom/tendcloud/tenddata/ax;->c()B

    move-result v7

    neg-int v7, v7

    int-to-double v10, v7

    .line 25
    :goto_3
    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v7

    invoke-interface {v4, v7}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    add-double/2addr v10, v8

    goto :goto_3

    .line 26
    :cond_4
    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v7

    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v4, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 27
    :cond_5
    invoke-interface {v4}, Ljava/util/SortedMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 28
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Double;

    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v6

    neg-double v6, v6

    double-to-int v4, v6

    int-to-byte v4, v4

    .line 29
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v6

    iget-object v7, v0, Lcom/tendcloud/tenddata/bb;->f:Lcom/tendcloud/tenddata/ay;

    invoke-virtual {v7}, Lcom/tendcloud/tenddata/ay;->c()I

    move-result v7

    if-ge v6, v7, :cond_7

    iget-object v6, v0, Lcom/tendcloud/tenddata/bb;->f:Lcom/tendcloud/tenddata/ay;

    invoke-virtual {v6}, Lcom/tendcloud/tenddata/ay;->d()I

    move-result v6

    if-ge v4, v6, :cond_6

    goto :goto_5

    .line 30
    :cond_6
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_7
    :goto_5
    return-object v5
.end method

.method public b(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tendcloud/tenddata/ba;",
            ">;",
            "Ljava/util/List<",
            "Lcom/tendcloud/tenddata/ba;",
            ">;",
            "Ljava/util/List<",
            "Lcom/tendcloud/tenddata/bb$a;",
            ">;)V"
        }
    .end annotation

    .line 31
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 32
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 33
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 34
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/tendcloud/tenddata/ba;

    .line 35
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v7, v4

    check-cast v7, Lcom/tendcloud/tenddata/ba;

    .line 36
    invoke-interface {v2, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 37
    invoke-virtual {p0, v3, v7}, Lcom/tendcloud/tenddata/bb;->a(Lcom/tendcloud/tenddata/ba;Lcom/tendcloud/tenddata/ba;)D

    move-result-wide v8

    .line 38
    new-instance v11, Lcom/tendcloud/tenddata/bb$a;

    move-object v4, v11

    move-object v5, p0

    move-object v6, v3

    invoke-direct/range {v4 .. v9}, Lcom/tendcloud/tenddata/bb$a;-><init>(Lcom/tendcloud/tenddata/bb;Lcom/tendcloud/tenddata/ba;Lcom/tendcloud/tenddata/ba;D)V

    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 39
    :cond_0
    invoke-interface {v1, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 40
    :cond_1
    new-instance p1, Lcom/tendcloud/tenddata/bb$1;

    invoke-direct {p1, p0}, Lcom/tendcloud/tenddata/bb$1;-><init>(Lcom/tendcloud/tenddata/bb;)V

    .line 41
    invoke-static {v0, p1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 42
    invoke-interface {p3}, Ljava/util/List;->clear()V

    .line 43
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/tendcloud/tenddata/bb$a;

    .line 44
    iget-object v0, p2, Lcom/tendcloud/tenddata/bb$a;->fp1:Lcom/tendcloud/tenddata/ba;

    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p2, Lcom/tendcloud/tenddata/bb$a;->fp2:Lcom/tendcloud/tenddata/ba;

    invoke-interface {v2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 45
    iget-object v0, p2, Lcom/tendcloud/tenddata/bb$a;->fp1:Lcom/tendcloud/tenddata/ba;

    invoke-interface {v1, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 46
    iget-object v0, p2, Lcom/tendcloud/tenddata/bb$a;->fp2:Lcom/tendcloud/tenddata/ba;

    invoke-interface {v2, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 47
    invoke-interface {p3, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 48
    :cond_3
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    move-object v5, p2

    check-cast v5, Lcom/tendcloud/tenddata/ba;

    .line 49
    new-instance p2, Lcom/tendcloud/tenddata/bb$a;

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    move-object v3, p2

    move-object v4, p0

    invoke-direct/range {v3 .. v8}, Lcom/tendcloud/tenddata/bb$a;-><init>(Lcom/tendcloud/tenddata/bb;Lcom/tendcloud/tenddata/ba;Lcom/tendcloud/tenddata/ba;D)V

    invoke-interface {p3, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 50
    :cond_4
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    move-object v3, p2

    check-cast v3, Lcom/tendcloud/tenddata/ba;

    .line 51
    new-instance p2, Lcom/tendcloud/tenddata/bb$a;

    const/4 v2, 0x0

    const-wide/16 v4, 0x0

    move-object v0, p2

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/tendcloud/tenddata/bb$a;-><init>(Lcom/tendcloud/tenddata/bb;Lcom/tendcloud/tenddata/ba;Lcom/tendcloud/tenddata/ba;D)V

    invoke-interface {p3, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_5
    return-void
.end method
