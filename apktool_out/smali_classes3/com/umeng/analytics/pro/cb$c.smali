.class Lcom/umeng/analytics/pro/cb$c;
.super Lcom/umeng/analytics/pro/db;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/umeng/analytics/pro/cb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/umeng/analytics/pro/db<",
        "Lcom/umeng/analytics/pro/cb;",
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

.method synthetic constructor <init>(Lcom/umeng/analytics/pro/cb$1;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/umeng/analytics/pro/cb$c;-><init>()V

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

    invoke-virtual {p0, p1, p2}, Lcom/umeng/analytics/pro/cb$c;->b(Lcom/umeng/analytics/pro/cq;Lcom/umeng/analytics/pro/cb;)V

    return-void
.end method

.method public a(Lcom/umeng/analytics/pro/cq;Lcom/umeng/analytics/pro/cb;)V
    .locals 1
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
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cq;->v()S

    move-result v0

    .line 5
    invoke-virtual {p2, p1, v0}, Lcom/umeng/analytics/pro/cb;->a(Lcom/umeng/analytics/pro/cq;S)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p2, Lcom/umeng/analytics/pro/cb;->a:Ljava/lang/Object;

    if-eqz p1, :cond_0

    .line 6
    invoke-virtual {p2, v0}, Lcom/umeng/analytics/pro/cb;->a(S)Lcom/umeng/analytics/pro/by;

    move-result-object p1

    iput-object p1, p2, Lcom/umeng/analytics/pro/cb;->b:Lcom/umeng/analytics/pro/by;

    :cond_0
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

    invoke-virtual {p0, p1, p2}, Lcom/umeng/analytics/pro/cb$c;->a(Lcom/umeng/analytics/pro/cq;Lcom/umeng/analytics/pro/cb;)V

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
    iget-object v0, p2, Lcom/umeng/analytics/pro/cb;->b:Lcom/umeng/analytics/pro/by;

    invoke-interface {v0}, Lcom/umeng/analytics/pro/by;->a()S

    move-result v0

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/cq;->a(S)V

    .line 4
    invoke-virtual {p2, p1}, Lcom/umeng/analytics/pro/cb;->b(Lcom/umeng/analytics/pro/cq;)V

    return-void

    .line 5
    :cond_0
    new-instance p1, Lcom/umeng/analytics/pro/cr;

    const-string p2, "Cannot write a TUnion with no set value!"

    invoke-direct {p1, p2}, Lcom/umeng/analytics/pro/cr;-><init>(Ljava/lang/String;)V

    throw p1
.end method
