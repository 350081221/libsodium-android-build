.class Lcom/tendcloud/tenddata/bq$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tendcloud/tenddata/bq;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tendcloud/tenddata/bq;


# direct methods
.method constructor <init>(Lcom/tendcloud/tenddata/bq;)V
    .locals 0

    iput-object p1, p0, Lcom/tendcloud/tenddata/bq$1;->this$0:Lcom/tendcloud/tenddata/bq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/bq$1;->this$0:Lcom/tendcloud/tenddata/bq;

    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    iput-wide v1, v0, Lcom/tendcloud/tenddata/bq;->b:J

    .line 8
    .line 9
    iget-object v0, p0, Lcom/tendcloud/tenddata/bq$1;->this$0:Lcom/tendcloud/tenddata/bq;

    .line 10
    .line 11
    iget v1, v0, Lcom/tendcloud/tenddata/bq;->d:I

    .line 12
    .line 13
    iget v2, v0, Lcom/tendcloud/tenddata/bq;->e:I

    .line 14
    .line 15
    if-eq v1, v2, :cond_0

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    if-le v1, v2, :cond_0

    .line 19
    .line 20
    iget-wide v1, v0, Lcom/tendcloud/tenddata/bq;->b:J

    .line 21
    .line 22
    iget-wide v3, v0, Lcom/tendcloud/tenddata/bq;->c:J

    .line 23
    .line 24
    sub-long/2addr v1, v3

    .line 25
    const-wide/32 v3, 0x2bf20

    .line 26
    .line 27
    .line 28
    cmp-long v0, v1, v3

    .line 29
    .line 30
    if-lez v0, :cond_0

    .line 31
    .line 32
    new-instance v0, Lcom/tendcloud/tenddata/bv;

    .line 33
    .line 34
    invoke-direct {v0}, Lcom/tendcloud/tenddata/bv;-><init>()V

    .line 35
    .line 36
    .line 37
    const-string v1, "env"

    .line 38
    .line 39
    iput-object v1, v0, Lcom/tendcloud/tenddata/bv;->b:Ljava/lang/String;

    .line 40
    .line 41
    const-string v1, "cellUpdate"

    .line 42
    .line 43
    iput-object v1, v0, Lcom/tendcloud/tenddata/bv;->c:Ljava/lang/String;

    .line 44
    .line 45
    sget-object v1, Lcom/tendcloud/tenddata/a;->ENV:Lcom/tendcloud/tenddata/a;

    .line 46
    .line 47
    iput-object v1, v0, Lcom/tendcloud/tenddata/bv;->a:Lcom/tendcloud/tenddata/a;

    .line 48
    .line 49
    invoke-static {}, Lcom/tendcloud/tenddata/z;->a()Lcom/tendcloud/tenddata/z;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {v1, v0}, Lcom/tendcloud/tenddata/z;->post(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-object v0, p0, Lcom/tendcloud/tenddata/bq$1;->this$0:Lcom/tendcloud/tenddata/bq;

    .line 57
    .line 58
    iget-wide v1, v0, Lcom/tendcloud/tenddata/bq;->b:J

    .line 59
    .line 60
    iput-wide v1, v0, Lcom/tendcloud/tenddata/bq;->c:J

    .line 61
    .line 62
    iget v1, v0, Lcom/tendcloud/tenddata/bq;->d:I

    .line 63
    .line 64
    iput v1, v0, Lcom/tendcloud/tenddata/bq;->e:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    .line 66
    :catchall_0
    :cond_0
    return-void
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
