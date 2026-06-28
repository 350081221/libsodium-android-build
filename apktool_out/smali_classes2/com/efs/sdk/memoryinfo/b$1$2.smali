.class final Lcom/efs/sdk/memoryinfo/b$1$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/efs/sdk/memoryinfo/b$1;->onChange(Ljava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/efs/sdk/memoryinfo/b$1;

.field final synthetic f:Landroid/os/Handler;

.field final synthetic g:I

.field final synthetic h:I


# direct methods
.method constructor <init>(Lcom/efs/sdk/memoryinfo/b$1;Landroid/os/Handler;II)V
    .locals 0

    iput-object p1, p0, Lcom/efs/sdk/memoryinfo/b$1$2;->e:Lcom/efs/sdk/memoryinfo/b$1;

    iput-object p2, p0, Lcom/efs/sdk/memoryinfo/b$1$2;->f:Landroid/os/Handler;

    iput p3, p0, Lcom/efs/sdk/memoryinfo/b$1$2;->g:I

    iput p4, p0, Lcom/efs/sdk/memoryinfo/b$1$2;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 1
    :try_start_0
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    new-instance v2, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {v0}, Lcom/umeng/commonsdk/utils/UMUtils;->MD5(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v8

    .line 36
    iget-object v0, p0, Lcom/efs/sdk/memoryinfo/b$1$2;->e:Lcom/efs/sdk/memoryinfo/b$1;

    .line 37
    .line 38
    iget-object v2, v0, Lcom/efs/sdk/memoryinfo/b$1;->c:Lcom/efs/sdk/memoryinfo/b;

    .line 39
    .line 40
    iget-object v0, p0, Lcom/efs/sdk/memoryinfo/b$1$2;->f:Landroid/os/Handler;

    .line 41
    .line 42
    iget v9, p0, Lcom/efs/sdk/memoryinfo/b$1$2;->g:I

    .line 43
    .line 44
    iget v5, p0, Lcom/efs/sdk/memoryinfo/b$1$2;->h:I

    .line 45
    .line 46
    new-instance v7, Lcom/efs/sdk/memoryinfo/e;

    .line 47
    .line 48
    iget-object v1, v2, Lcom/efs/sdk/memoryinfo/b;->mContext:Landroid/content/Context;

    .line 49
    .line 50
    iget-object v3, v2, Lcom/efs/sdk/memoryinfo/b;->a:Lcom/efs/sdk/base/EfsReporter;

    .line 51
    .line 52
    invoke-direct {v7, v1, v3}, Lcom/efs/sdk/memoryinfo/e;-><init>(Landroid/content/Context;Lcom/efs/sdk/base/EfsReporter;)V

    .line 53
    .line 54
    .line 55
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 56
    .line 57
    .line 58
    move-result-wide v3

    .line 59
    new-instance v10, Lcom/efs/sdk/memoryinfo/b$2;

    .line 60
    .line 61
    move-object v1, v10

    .line 62
    move-object v6, v0

    .line 63
    invoke-direct/range {v1 .. v9}, Lcom/efs/sdk/memoryinfo/b$2;-><init>(Lcom/efs/sdk/memoryinfo/b;JILandroid/os/Handler;Lcom/efs/sdk/memoryinfo/e;Ljava/lang/String;I)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v10}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :catchall_0
    iget-object v0, p0, Lcom/efs/sdk/memoryinfo/b$1$2;->f:Landroid/os/Handler;

    .line 71
    .line 72
    const/4 v1, 0x1

    .line 73
    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 74
    .line 75
    .line 76
    return-void
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method
