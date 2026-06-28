.class public abstract Lcom/efs/sdk/base/core/e/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lcom/efs/sdk/base/core/e/a/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()Lcom/efs/sdk/base/core/e/a/a;
.end method

.method public final a(Lcom/efs/sdk/base/core/d/b;)V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/efs/sdk/base/core/e/a;->a:Lcom/efs/sdk/base/core/e/a/a;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 6
    :try_start_1
    iget-object v0, p0, Lcom/efs/sdk/base/core/e/a;->a:Lcom/efs/sdk/base/core/e/a/a;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/efs/sdk/base/core/e/a;->a()Lcom/efs/sdk/base/core/e/a/a;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Lcom/efs/sdk/base/core/e/a;->a:Lcom/efs/sdk/base/core/e/a/a;

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    monitor-exit p0

    .line 19
    return-void

    .line 20
    :cond_0
    monitor-exit p0

    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    :try_start_2
    throw p1

    .line 25
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/efs/sdk/base/core/e/a;->a:Lcom/efs/sdk/base/core/e/a/a;

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Lcom/efs/sdk/base/core/e/a/a;->a(Lcom/efs/sdk/base/core/d/b;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :catchall_1
    move-exception p1

    .line 32
    const-string v0, "efs.processor"

    .line 33
    .line 34
    const-string v1, "log handle error"

    .line 35
    .line 36
    invoke-static {v0, v1, p1}, Lcom/efs/sdk/base/core/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    return-void
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
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
.end method
