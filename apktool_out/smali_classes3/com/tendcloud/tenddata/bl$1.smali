.class final Lcom/tendcloud/tenddata/bl$1;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tendcloud/tenddata/bl;->f(Lcom/tendcloud/tenddata/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$feature:Lcom/tendcloud/tenddata/a;


# direct methods
.method constructor <init>(Lcom/tendcloud/tenddata/a;)V
    .locals 0

    iput-object p1, p0, Lcom/tendcloud/tenddata/bl$1;->val$feature:Lcom/tendcloud/tenddata/a;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/tendcloud/tenddata/l;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/tendcloud/tenddata/bl$1;->val$feature:Lcom/tendcloud/tenddata/a;

    .line 5
    .line 6
    invoke-static {v0}, Lcom/tendcloud/tenddata/bl;->a(Lcom/tendcloud/tenddata/a;)V

    .line 7
    .line 8
    .line 9
    invoke-static {}, Lcom/tendcloud/tenddata/bl;->b()V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/tendcloud/tenddata/bl$1;->val$feature:Lcom/tendcloud/tenddata/a;

    .line 13
    .line 14
    invoke-static {v0}, Lcom/tendcloud/tenddata/bl;->b(Lcom/tendcloud/tenddata/a;)V

    .line 15
    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method
