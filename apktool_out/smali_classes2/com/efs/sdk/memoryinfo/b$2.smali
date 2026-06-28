.class final Lcom/efs/sdk/memoryinfo/b$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/efs/sdk/memoryinfo/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/efs/sdk/memoryinfo/b;

.field final synthetic f:Landroid/os/Handler;

.field final synthetic i:J

.field final synthetic j:I

.field final synthetic k:Lcom/efs/sdk/memoryinfo/e;

.field final synthetic l:Ljava/lang/String;

.field final synthetic m:I


# direct methods
.method constructor <init>(Lcom/efs/sdk/memoryinfo/b;JILandroid/os/Handler;Lcom/efs/sdk/memoryinfo/e;Ljava/lang/String;I)V
    .locals 0

    iput-object p1, p0, Lcom/efs/sdk/memoryinfo/b$2;->c:Lcom/efs/sdk/memoryinfo/b;

    iput-wide p2, p0, Lcom/efs/sdk/memoryinfo/b$2;->i:J

    iput p4, p0, Lcom/efs/sdk/memoryinfo/b$2;->j:I

    iput-object p5, p0, Lcom/efs/sdk/memoryinfo/b$2;->f:Landroid/os/Handler;

    iput-object p6, p0, Lcom/efs/sdk/memoryinfo/b$2;->k:Lcom/efs/sdk/memoryinfo/e;

    iput-object p7, p0, Lcom/efs/sdk/memoryinfo/b$2;->l:Ljava/lang/String;

    iput p8, p0, Lcom/efs/sdk/memoryinfo/b$2;->m:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-wide v2, p0, Lcom/efs/sdk/memoryinfo/b$2;->i:J

    .line 6
    .line 7
    sub-long/2addr v0, v2

    .line 8
    iget v2, p0, Lcom/efs/sdk/memoryinfo/b$2;->j:I

    .line 9
    .line 10
    mul-int/lit16 v2, v2, 0x3e8

    .line 11
    .line 12
    int-to-long v2, v2

    .line 13
    cmp-long v0, v0, v2

    .line 14
    .line 15
    if-lez v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lcom/efs/sdk/memoryinfo/b$2;->f:Landroid/os/Handler;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/efs/sdk/memoryinfo/b$2;->c:Lcom/efs/sdk/memoryinfo/b;

    .line 25
    .line 26
    iget-object v1, p0, Lcom/efs/sdk/memoryinfo/b$2;->k:Lcom/efs/sdk/memoryinfo/e;

    .line 27
    .line 28
    iget-object v2, p0, Lcom/efs/sdk/memoryinfo/b$2;->l:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, Lcom/efs/sdk/memoryinfo/b;->a(Lcom/efs/sdk/memoryinfo/b;Lcom/efs/sdk/memoryinfo/e;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception v0

    .line 35
    const-string v1, "collect "

    .line 36
    .line 37
    invoke-static {v1, v0}, Lcom/efs/sdk/memoryinfo/f;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    :goto_0
    iget-object v0, p0, Lcom/efs/sdk/memoryinfo/b$2;->f:Landroid/os/Handler;

    .line 41
    .line 42
    iget v1, p0, Lcom/efs/sdk/memoryinfo/b$2;->m:I

    .line 43
    .line 44
    mul-int/lit16 v1, v1, 0x3e8

    .line 45
    .line 46
    int-to-long v1, v1

    .line 47
    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 48
    .line 49
    .line 50
    return-void
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
.end method
