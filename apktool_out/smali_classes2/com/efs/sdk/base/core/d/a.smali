.class public final Lcom/efs/sdk/base/core/d/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public b:B

.field public c:I

.field public d:Ljava/lang/String;

.field public e:I

.field f:J

.field g:I


# direct methods
.method constructor <init>(Ljava/lang/String;B)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    iput-byte v0, p0, Lcom/efs/sdk/base/core/d/a;->b:B

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput v0, p0, Lcom/efs/sdk/base/core/d/a;->c:I

    .line 9
    .line 10
    const-string v0, "none"

    .line 11
    .line 12
    iput-object v0, p0, Lcom/efs/sdk/base/core/d/a;->d:Ljava/lang/String;

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    iput v0, p0, Lcom/efs/sdk/base/core/d/a;->e:I

    .line 16
    .line 17
    const-wide/16 v1, 0x0

    .line 18
    .line 19
    iput-wide v1, p0, Lcom/efs/sdk/base/core/d/a;->f:J

    .line 20
    .line 21
    iput v0, p0, Lcom/efs/sdk/base/core/d/a;->g:I

    .line 22
    .line 23
    iput-object p1, p0, Lcom/efs/sdk/base/core/d/a;->a:Ljava/lang/String;

    .line 24
    .line 25
    if-lez p2, :cond_0

    .line 26
    .line 27
    const/4 p1, 0x3

    .line 28
    if-lt p1, p2, :cond_0

    .line 29
    .line 30
    iput-byte p2, p0, Lcom/efs/sdk/base/core/d/a;->b:B

    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 34
    .line 35
    const-string v0, "log protocol flag invalid : "

    .line 36
    .line 37
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw p1
    .line 49
    .line 50
.end method
