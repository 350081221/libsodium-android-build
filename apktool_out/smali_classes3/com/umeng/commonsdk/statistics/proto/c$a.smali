.class Lcom/umeng/commonsdk/statistics/proto/c$a;
.super Lcom/umeng/analytics/pro/da;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/umeng/commonsdk/statistics/proto/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/umeng/analytics/pro/da<",
        "Lcom/umeng/commonsdk/statistics/proto/c;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/umeng/analytics/pro/da;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/umeng/commonsdk/statistics/proto/c$1;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/umeng/commonsdk/statistics/proto/c$a;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lcom/umeng/analytics/pro/cq;Lcom/umeng/analytics/pro/br;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 1
    check-cast p2, Lcom/umeng/commonsdk/statistics/proto/c;

    invoke-virtual {p0, p1, p2}, Lcom/umeng/commonsdk/statistics/proto/c$a;->b(Lcom/umeng/analytics/pro/cq;Lcom/umeng/commonsdk/statistics/proto/c;)V

    return-void
.end method

.method public a(Lcom/umeng/analytics/pro/cq;Lcom/umeng/commonsdk/statistics/proto/c;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 2
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cq;->j()Lcom/umeng/analytics/pro/cv;

    .line 3
    :goto_0
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cq;->l()Lcom/umeng/analytics/pro/cl;

    move-result-object v0

    .line 4
    iget-byte v1, v0, Lcom/umeng/analytics/pro/cl;->b:B

    if-nez v1, :cond_0

    .line 5
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cq;->k()V

    .line 6
    invoke-virtual {p2}, Lcom/umeng/commonsdk/statistics/proto/c;->n()V

    return-void

    .line 7
    :cond_0
    iget-short v0, v0, Lcom/umeng/analytics/pro/cl;->c:S

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eq v0, v4, :cond_6

    if-eq v0, v3, :cond_3

    const/4 v2, 0x3

    if-eq v0, v2, :cond_1

    .line 8
    invoke-static {p1, v1}, Lcom/umeng/analytics/pro/ct;->a(Lcom/umeng/analytics/pro/cq;B)V

    goto/16 :goto_3

    :cond_1
    const/16 v0, 0xb

    if-ne v1, v0, :cond_2

    .line 9
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cq;->z()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lcom/umeng/commonsdk/statistics/proto/c;->c:Ljava/lang/String;

    .line 10
    invoke-virtual {p2, v4}, Lcom/umeng/commonsdk/statistics/proto/c;->c(Z)V

    goto :goto_3

    .line 11
    :cond_2
    invoke-static {p1, v1}, Lcom/umeng/analytics/pro/ct;->a(Lcom/umeng/analytics/pro/cq;B)V

    goto :goto_3

    :cond_3
    const/16 v0, 0xf

    if-ne v1, v0, :cond_5

    .line 12
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cq;->p()Lcom/umeng/analytics/pro/cm;

    move-result-object v0

    .line 13
    new-instance v1, Ljava/util/ArrayList;

    iget v3, v0, Lcom/umeng/analytics/pro/cm;->b:I

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, p2, Lcom/umeng/commonsdk/statistics/proto/c;->b:Ljava/util/List;

    .line 14
    :goto_1
    iget v1, v0, Lcom/umeng/analytics/pro/cm;->b:I

    if-ge v2, v1, :cond_4

    .line 15
    new-instance v1, Lcom/umeng/commonsdk/statistics/proto/a;

    invoke-direct {v1}, Lcom/umeng/commonsdk/statistics/proto/a;-><init>()V

    .line 16
    invoke-virtual {v1, p1}, Lcom/umeng/commonsdk/statistics/proto/a;->read(Lcom/umeng/analytics/pro/cq;)V

    .line 17
    iget-object v3, p2, Lcom/umeng/commonsdk/statistics/proto/c;->b:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 18
    :cond_4
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cq;->q()V

    .line 19
    invoke-virtual {p2, v4}, Lcom/umeng/commonsdk/statistics/proto/c;->b(Z)V

    goto :goto_3

    .line 20
    :cond_5
    invoke-static {p1, v1}, Lcom/umeng/analytics/pro/ct;->a(Lcom/umeng/analytics/pro/cq;B)V

    goto :goto_3

    :cond_6
    const/16 v0, 0xd

    if-ne v1, v0, :cond_8

    .line 21
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cq;->n()Lcom/umeng/analytics/pro/cn;

    move-result-object v0

    .line 22
    new-instance v1, Ljava/util/HashMap;

    iget v5, v0, Lcom/umeng/analytics/pro/cn;->c:I

    mul-int/2addr v5, v3

    invoke-direct {v1, v5}, Ljava/util/HashMap;-><init>(I)V

    iput-object v1, p2, Lcom/umeng/commonsdk/statistics/proto/c;->a:Ljava/util/Map;

    .line 23
    :goto_2
    iget v1, v0, Lcom/umeng/analytics/pro/cn;->c:I

    if-ge v2, v1, :cond_7

    .line 24
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cq;->z()Ljava/lang/String;

    move-result-object v1

    .line 25
    new-instance v3, Lcom/umeng/commonsdk/statistics/proto/b;

    invoke-direct {v3}, Lcom/umeng/commonsdk/statistics/proto/b;-><init>()V

    .line 26
    invoke-virtual {v3, p1}, Lcom/umeng/commonsdk/statistics/proto/b;->read(Lcom/umeng/analytics/pro/cq;)V

    .line 27
    iget-object v5, p2, Lcom/umeng/commonsdk/statistics/proto/c;->a:Ljava/util/Map;

    invoke-interface {v5, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 28
    :cond_7
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cq;->o()V

    .line 29
    invoke-virtual {p2, v4}, Lcom/umeng/commonsdk/statistics/proto/c;->a(Z)V

    goto :goto_3

    .line 30
    :cond_8
    invoke-static {p1, v1}, Lcom/umeng/analytics/pro/ct;->a(Lcom/umeng/analytics/pro/cq;B)V

    .line 31
    :goto_3
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cq;->m()V

    goto/16 :goto_0
.end method

.method public synthetic b(Lcom/umeng/analytics/pro/cq;Lcom/umeng/analytics/pro/br;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 1
    check-cast p2, Lcom/umeng/commonsdk/statistics/proto/c;

    invoke-virtual {p0, p1, p2}, Lcom/umeng/commonsdk/statistics/proto/c$a;->a(Lcom/umeng/analytics/pro/cq;Lcom/umeng/commonsdk/statistics/proto/c;)V

    return-void
.end method

.method public b(Lcom/umeng/analytics/pro/cq;Lcom/umeng/commonsdk/statistics/proto/c;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 2
    invoke-virtual {p2}, Lcom/umeng/commonsdk/statistics/proto/c;->n()V

    .line 3
    invoke-static {}, Lcom/umeng/commonsdk/statistics/proto/c;->o()Lcom/umeng/analytics/pro/cv;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/cq;->a(Lcom/umeng/analytics/pro/cv;)V

    .line 4
    iget-object v0, p2, Lcom/umeng/commonsdk/statistics/proto/c;->a:Ljava/util/Map;

    const/16 v1, 0xc

    if-eqz v0, :cond_1

    .line 5
    invoke-static {}, Lcom/umeng/commonsdk/statistics/proto/c;->p()Lcom/umeng/analytics/pro/cl;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/cq;->a(Lcom/umeng/analytics/pro/cl;)V

    .line 6
    new-instance v0, Lcom/umeng/analytics/pro/cn;

    iget-object v2, p2, Lcom/umeng/commonsdk/statistics/proto/c;->a:Ljava/util/Map;

    .line 7
    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v2

    const/16 v3, 0xb

    invoke-direct {v0, v3, v1, v2}, Lcom/umeng/analytics/pro/cn;-><init>(BBI)V

    .line 8
    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/cq;->a(Lcom/umeng/analytics/pro/cn;)V

    .line 9
    iget-object v0, p2, Lcom/umeng/commonsdk/statistics/proto/c;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 10
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {p1, v3}, Lcom/umeng/analytics/pro/cq;->a(Ljava/lang/String;)V

    .line 11
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/umeng/commonsdk/statistics/proto/b;

    invoke-virtual {v2, p1}, Lcom/umeng/commonsdk/statistics/proto/b;->write(Lcom/umeng/analytics/pro/cq;)V

    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cq;->e()V

    .line 13
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cq;->c()V

    .line 14
    :cond_1
    iget-object v0, p2, Lcom/umeng/commonsdk/statistics/proto/c;->b:Ljava/util/List;

    if-eqz v0, :cond_3

    .line 15
    invoke-virtual {p2}, Lcom/umeng/commonsdk/statistics/proto/c;->j()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 16
    invoke-static {}, Lcom/umeng/commonsdk/statistics/proto/c;->q()Lcom/umeng/analytics/pro/cl;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/cq;->a(Lcom/umeng/analytics/pro/cl;)V

    .line 17
    new-instance v0, Lcom/umeng/analytics/pro/cm;

    iget-object v2, p2, Lcom/umeng/commonsdk/statistics/proto/c;->b:Ljava/util/List;

    .line 18
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v0, v1, v2}, Lcom/umeng/analytics/pro/cm;-><init>(BI)V

    .line 19
    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/cq;->a(Lcom/umeng/analytics/pro/cm;)V

    .line 20
    iget-object v0, p2, Lcom/umeng/commonsdk/statistics/proto/c;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/umeng/commonsdk/statistics/proto/a;

    .line 21
    invoke-virtual {v1, p1}, Lcom/umeng/commonsdk/statistics/proto/a;->write(Lcom/umeng/analytics/pro/cq;)V

    goto :goto_1

    .line 22
    :cond_2
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cq;->f()V

    .line 23
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cq;->c()V

    .line 24
    :cond_3
    iget-object v0, p2, Lcom/umeng/commonsdk/statistics/proto/c;->c:Ljava/lang/String;

    if-eqz v0, :cond_4

    .line 25
    invoke-virtual {p2}, Lcom/umeng/commonsdk/statistics/proto/c;->m()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 26
    invoke-static {}, Lcom/umeng/commonsdk/statistics/proto/c;->r()Lcom/umeng/analytics/pro/cl;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/cq;->a(Lcom/umeng/analytics/pro/cl;)V

    .line 27
    iget-object p2, p2, Lcom/umeng/commonsdk/statistics/proto/c;->c:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/umeng/analytics/pro/cq;->a(Ljava/lang/String;)V

    .line 28
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cq;->c()V

    .line 29
    :cond_4
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cq;->d()V

    .line 30
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cq;->b()V

    return-void
.end method
