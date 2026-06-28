.class final Lcom/umeng/commonsdk/internal/utils/k$1;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/umeng/commonsdk/internal/utils/k;->b(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:[Ljava/lang/String;

.field final synthetic b:Landroid/content/Context;


# direct methods
.method constructor <init>([Ljava/lang/String;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/umeng/commonsdk/internal/utils/k$1;->a:[Ljava/lang/String;

    iput-object p2, p0, Lcom/umeng/commonsdk/internal/utils/k$1;->b:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    invoke-super {p0}, Ljava/lang/Thread;->run()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    iget-object v0, p0, Lcom/umeng/commonsdk/internal/utils/k$1;->a:[Ljava/lang/String;

    .line 5
    .line 6
    invoke-static {}, Lcom/umeng/commonsdk/internal/utils/k;->c()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const/4 v2, 0x0

    .line 11
    aput-object v1, v0, v2

    .line 12
    .line 13
    iget-object v0, p0, Lcom/umeng/commonsdk/internal/utils/k$1;->a:[Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {}, Lcom/umeng/commonsdk/internal/utils/k;->a()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const/4 v3, 0x1

    .line 20
    aput-object v1, v0, v3

    .line 21
    .line 22
    iget-object v0, p0, Lcom/umeng/commonsdk/internal/utils/k$1;->a:[Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {}, Lcom/umeng/commonsdk/internal/utils/k;->b()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const/4 v4, 0x2

    .line 29
    aput-object v1, v0, v4

    .line 30
    .line 31
    new-instance v0, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 34
    .line 35
    .line 36
    const-string v1, "diskType = "

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, Lcom/umeng/commonsdk/internal/utils/k$1;->a:[Ljava/lang/String;

    .line 42
    .line 43
    aget-object v1, v1, v2

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v1, "; ThremalZone = "

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    iget-object v1, p0, Lcom/umeng/commonsdk/internal/utils/k$1;->a:[Ljava/lang/String;

    .line 54
    .line 55
    aget-object v1, v1, v3

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v1, "; GoldFishRc = "

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    iget-object v1, p0, Lcom/umeng/commonsdk/internal/utils/k$1;->a:[Ljava/lang/String;

    .line 66
    .line 67
    aget-object v1, v1, v4

    .line 68
    .line 69
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-static {v0}, Lcom/umeng/commonsdk/statistics/common/ULog;->i(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    iget-object v0, p0, Lcom/umeng/commonsdk/internal/utils/k$1;->b:Landroid/content/Context;

    .line 80
    .line 81
    iget-object v1, p0, Lcom/umeng/commonsdk/internal/utils/k$1;->a:[Ljava/lang/String;

    .line 82
    .line 83
    invoke-static {v0, v1}, Lcom/umeng/commonsdk/internal/utils/k;->a(Landroid/content/Context;[Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :catchall_0
    move-exception v0

    .line 88
    iget-object v1, p0, Lcom/umeng/commonsdk/internal/utils/k$1;->b:Landroid/content/Context;

    .line 89
    .line 90
    invoke-static {v1, v0}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    .line 91
    .line 92
    .line 93
    :goto_0
    return-void
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
