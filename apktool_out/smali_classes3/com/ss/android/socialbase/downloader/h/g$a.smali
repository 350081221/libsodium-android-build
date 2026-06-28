.class Lcom/ss/android/socialbase/downloader/h/g$a;
.super Landroid/os/HandlerThread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ss/android/socialbase/downloader/h/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/ss/android/socialbase/downloader/h/g;


# direct methods
.method constructor <init>(Lcom/ss/android/socialbase/downloader/h/g;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/h/g$a;->a:Lcom/ss/android/socialbase/downloader/h/g;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
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
.end method


# virtual methods
.method protected onLooperPrepared()V
    .locals 5

    .line 1
    invoke-super {p0}, Landroid/os/HandlerThread;->onLooperPrepared()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/g$a;->a:Lcom/ss/android/socialbase/downloader/h/g;

    .line 9
    .line 10
    invoke-static {v1}, Lcom/ss/android/socialbase/downloader/h/g;->a(Lcom/ss/android/socialbase/downloader/h/g;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    monitor-enter v1

    .line 15
    :try_start_0
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/h/g$a;->a:Lcom/ss/android/socialbase/downloader/h/g;

    .line 16
    .line 17
    new-instance v3, Landroid/os/Handler;

    .line 18
    .line 19
    invoke-direct {v3, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 20
    .line 21
    .line 22
    invoke-static {v2, v3}, Lcom/ss/android/socialbase/downloader/h/g;->a(Lcom/ss/android/socialbase/downloader/h/g;Landroid/os/Handler;)Landroid/os/Handler;

    .line 23
    .line 24
    .line 25
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/g$a;->a:Lcom/ss/android/socialbase/downloader/h/g;

    .line 27
    .line 28
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/h/g;->b(Lcom/ss/android/socialbase/downloader/h/g;)Ljava/util/Queue;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/g$a;->a:Lcom/ss/android/socialbase/downloader/h/g;

    .line 39
    .line 40
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/h/g;->b(Lcom/ss/android/socialbase/downloader/h/g;)Ljava/util/Queue;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, Lcom/ss/android/socialbase/downloader/h/g$b;

    .line 49
    .line 50
    if-eqz v0, :cond_0

    .line 51
    .line 52
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/g$a;->a:Lcom/ss/android/socialbase/downloader/h/g;

    .line 53
    .line 54
    invoke-static {v1}, Lcom/ss/android/socialbase/downloader/h/g;->c(Lcom/ss/android/socialbase/downloader/h/g;)Landroid/os/Handler;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    iget-object v2, v0, Lcom/ss/android/socialbase/downloader/h/g$b;->a:Ljava/lang/Runnable;

    .line 59
    .line 60
    iget-wide v3, v0, Lcom/ss/android/socialbase/downloader/h/g$b;->b:J

    .line 61
    .line 62
    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    return-void

    .line 67
    :catchall_0
    move-exception v0

    .line 68
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 69
    throw v0
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
