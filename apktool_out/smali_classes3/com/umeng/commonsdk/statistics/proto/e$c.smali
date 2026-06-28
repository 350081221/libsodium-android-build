.class Lcom/umeng/commonsdk/statistics/proto/e$c;
.super Lcom/umeng/analytics/pro/db;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/umeng/commonsdk/statistics/proto/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/umeng/analytics/pro/db<",
        "Lcom/umeng/commonsdk/statistics/proto/e;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/umeng/analytics/pro/db;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/umeng/commonsdk/statistics/proto/e$1;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/umeng/commonsdk/statistics/proto/e$c;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/umeng/analytics/pro/cq;Lcom/umeng/analytics/pro/br;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 1
    check-cast p2, Lcom/umeng/commonsdk/statistics/proto/e;

    invoke-virtual {p0, p1, p2}, Lcom/umeng/commonsdk/statistics/proto/e$c;->a(Lcom/umeng/analytics/pro/cq;Lcom/umeng/commonsdk/statistics/proto/e;)V

    return-void
.end method

.method public a(Lcom/umeng/analytics/pro/cq;Lcom/umeng/commonsdk/statistics/proto/e;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 2
    check-cast p1, Lcom/umeng/analytics/pro/cw;

    .line 3
    new-instance v0, Ljava/util/BitSet;

    invoke-direct {v0}, Ljava/util/BitSet;-><init>()V

    .line 4
    invoke-virtual {p2}, Lcom/umeng/commonsdk/statistics/proto/e;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    .line 5
    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    .line 6
    :cond_0
    invoke-virtual {p2}, Lcom/umeng/commonsdk/statistics/proto/e;->g()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    .line 7
    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    .line 8
    :cond_1
    invoke-virtual {p2}, Lcom/umeng/commonsdk/statistics/proto/e;->j()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x2

    .line 9
    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    :cond_2
    const/4 v1, 0x3

    .line 10
    invoke-virtual {p1, v0, v1}, Lcom/umeng/analytics/pro/cw;->a(Ljava/util/BitSet;I)V

    .line 11
    invoke-virtual {p2}, Lcom/umeng/commonsdk/statistics/proto/e;->d()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 12
    iget-object v0, p2, Lcom/umeng/commonsdk/statistics/proto/e;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/ck;->a(Ljava/lang/String;)V

    .line 13
    :cond_3
    invoke-virtual {p2}, Lcom/umeng/commonsdk/statistics/proto/e;->g()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 14
    iget-wide v0, p2, Lcom/umeng/commonsdk/statistics/proto/e;->b:J

    invoke-virtual {p1, v0, v1}, Lcom/umeng/analytics/pro/ck;->a(J)V

    .line 15
    :cond_4
    invoke-virtual {p2}, Lcom/umeng/commonsdk/statistics/proto/e;->j()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 16
    iget-object p2, p2, Lcom/umeng/commonsdk/statistics/proto/e;->c:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/umeng/analytics/pro/ck;->a(Ljava/lang/String;)V

    :cond_5
    return-void
.end method

.method public bridge synthetic b(Lcom/umeng/analytics/pro/cq;Lcom/umeng/analytics/pro/br;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 1
    check-cast p2, Lcom/umeng/commonsdk/statistics/proto/e;

    invoke-virtual {p0, p1, p2}, Lcom/umeng/commonsdk/statistics/proto/e$c;->b(Lcom/umeng/analytics/pro/cq;Lcom/umeng/commonsdk/statistics/proto/e;)V

    return-void
.end method

.method public b(Lcom/umeng/analytics/pro/cq;Lcom/umeng/commonsdk/statistics/proto/e;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 2
    check-cast p1, Lcom/umeng/analytics/pro/cw;

    const/4 v0, 0x3

    .line 3
    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/cw;->b(I)Ljava/util/BitSet;

    move-result-object v0

    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    .line 5
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/ck;->z()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p2, Lcom/umeng/commonsdk/statistics/proto/e;->a:Ljava/lang/String;

    .line 6
    invoke-virtual {p2, v2}, Lcom/umeng/commonsdk/statistics/proto/e;->a(Z)V

    .line 7
    :cond_0
    invoke-virtual {v0, v2}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 8
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/ck;->x()J

    move-result-wide v3

    iput-wide v3, p2, Lcom/umeng/commonsdk/statistics/proto/e;->b:J

    .line 9
    invoke-virtual {p2, v2}, Lcom/umeng/commonsdk/statistics/proto/e;->b(Z)V

    :cond_1
    const/4 v1, 0x2

    .line 10
    invoke-virtual {v0, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 11
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/ck;->z()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p2, Lcom/umeng/commonsdk/statistics/proto/e;->c:Ljava/lang/String;

    .line 12
    invoke-virtual {p2, v2}, Lcom/umeng/commonsdk/statistics/proto/e;->c(Z)V

    :cond_2
    return-void
.end method
