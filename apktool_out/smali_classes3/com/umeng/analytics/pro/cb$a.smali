.class Lcom/umeng/analytics/pro/cb$a;
.super Lcom/umeng/analytics/pro/da;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/umeng/analytics/pro/cb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/umeng/analytics/pro/da<",
        "Lcom/umeng/analytics/pro/cb;",
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

.method synthetic constructor <init>(Lcom/umeng/analytics/pro/cb$1;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/umeng/analytics/pro/cb$a;-><init>()V

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
    check-cast p2, Lcom/umeng/analytics/pro/cb;

    invoke-virtual {p0, p1, p2}, Lcom/umeng/analytics/pro/cb$a;->b(Lcom/umeng/analytics/pro/cq;Lcom/umeng/analytics/pro/cb;)V

    return-void
.end method

.method public a(Lcom/umeng/analytics/pro/cq;Lcom/umeng/analytics/pro/cb;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    const/4 v0, 0x0

    .line 2
    iput-object v0, p2, Lcom/umeng/analytics/pro/cb;->b:Lcom/umeng/analytics/pro/by;

    .line 3
    iput-object v0, p2, Lcom/umeng/analytics/pro/cb;->a:Ljava/lang/Object;

    .line 4
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cq;->j()Lcom/umeng/analytics/pro/cv;

    .line 5
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cq;->l()Lcom/umeng/analytics/pro/cl;

    move-result-object v0

    .line 6
    invoke-virtual {p2, p1, v0}, Lcom/umeng/analytics/pro/cb;->a(Lcom/umeng/analytics/pro/cq;Lcom/umeng/analytics/pro/cl;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p2, Lcom/umeng/analytics/pro/cb;->a:Ljava/lang/Object;

    if-eqz v1, :cond_0

    .line 7
    iget-short v0, v0, Lcom/umeng/analytics/pro/cl;->c:S

    invoke-virtual {p2, v0}, Lcom/umeng/analytics/pro/cb;->a(S)Lcom/umeng/analytics/pro/by;

    move-result-object v0

    iput-object v0, p2, Lcom/umeng/analytics/pro/cb;->b:Lcom/umeng/analytics/pro/by;

    .line 8
    :cond_0
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cq;->m()V

    .line 9
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cq;->l()Lcom/umeng/analytics/pro/cl;

    .line 10
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cq;->k()V

    return-void
.end method

.method public synthetic b(Lcom/umeng/analytics/pro/cq;Lcom/umeng/analytics/pro/br;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 1
    check-cast p2, Lcom/umeng/analytics/pro/cb;

    invoke-virtual {p0, p1, p2}, Lcom/umeng/analytics/pro/cb$a;->a(Lcom/umeng/analytics/pro/cq;Lcom/umeng/analytics/pro/cb;)V

    return-void
.end method

.method public b(Lcom/umeng/analytics/pro/cq;Lcom/umeng/analytics/pro/cb;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 2
    invoke-virtual {p2}, Lcom/umeng/analytics/pro/cb;->a()Lcom/umeng/analytics/pro/by;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lcom/umeng/analytics/pro/cb;->b()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p2}, Lcom/umeng/analytics/pro/cb;->d()Lcom/umeng/analytics/pro/cv;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/cq;->a(Lcom/umeng/analytics/pro/cv;)V

    .line 4
    iget-object v0, p2, Lcom/umeng/analytics/pro/cb;->b:Lcom/umeng/analytics/pro/by;

    invoke-virtual {p2, v0}, Lcom/umeng/analytics/pro/cb;->c(Lcom/umeng/analytics/pro/by;)Lcom/umeng/analytics/pro/cl;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/cq;->a(Lcom/umeng/analytics/pro/cl;)V

    .line 5
    invoke-virtual {p2, p1}, Lcom/umeng/analytics/pro/cb;->a(Lcom/umeng/analytics/pro/cq;)V

    .line 6
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cq;->c()V

    .line 7
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cq;->d()V

    .line 8
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cq;->b()V

    return-void

    .line 9
    :cond_0
    new-instance p1, Lcom/umeng/analytics/pro/cr;

    const-string p2, "Cannot write a TUnion with no set value!"

    invoke-direct {p1, p2}, Lcom/umeng/analytics/pro/cr;-><init>(Ljava/lang/String;)V

    throw p1
.end method
