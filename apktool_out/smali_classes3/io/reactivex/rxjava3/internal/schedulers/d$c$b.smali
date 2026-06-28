.class final Lio/reactivex/rxjava3/internal/schedulers/d$c$b;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;
.implements Lio/reactivex/rxjava3/disposables/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/schedulers/d$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# static fields
.field static final FINISHED:I = 0x2

.field static final INTERRUPTED:I = 0x4

.field static final INTERRUPTING:I = 0x3

.field static final READY:I = 0x0

.field static final RUNNING:I = 0x1

.field private static final serialVersionUID:J = -0x3201fa934be19cacL


# instance fields
.field final run:Ljava/lang/Runnable;

.field final tasks:Lio/reactivex/rxjava3/disposables/f;

.field volatile thread:Ljava/lang/Thread;


# direct methods
.method constructor <init>(Ljava/lang/Runnable;Lio/reactivex/rxjava3/disposables/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/schedulers/d$c$b;->run:Ljava/lang/Runnable;

    .line 5
    .line 6
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/schedulers/d$c$b;->tasks:Lio/reactivex/rxjava3/disposables/f;

    .line 7
    .line 8
    return-void
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
.method cleanup()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/schedulers/d$c$b;->tasks:Lio/reactivex/rxjava3/disposables/f;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p0}, Lio/reactivex/rxjava3/disposables/f;->c(Lio/reactivex/rxjava3/disposables/e;)Z

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
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
.end method

.method public dispose()V
    .locals 3

    .line 1
    :cond_0
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    if-lt v0, v1, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    const/4 v1, 0x4

    .line 10
    if-nez v0, :cond_2

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/schedulers/d$c$b;->cleanup()V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_2
    const/4 v0, 0x1

    .line 24
    const/4 v2, 0x3

    .line 25
    invoke-virtual {p0, v0, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/schedulers/d$c$b;->thread:Ljava/lang/Thread;

    .line 32
    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 36
    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/schedulers/d$c$b;->thread:Ljava/lang/Thread;

    .line 40
    .line 41
    :cond_3
    invoke-virtual {p0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/schedulers/d$c$b;->cleanup()V

    .line 45
    .line 46
    .line 47
    :goto_0
    return-void
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

.method public isDisposed()Z
    .locals 2

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    const/4 v1, 0x2

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public run()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_5

    .line 6
    .line 7
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/schedulers/d$c$b;->thread:Ljava/lang/Thread;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v2, 0x0

    .line 20
    if-eqz v0, :cond_4

    .line 21
    .line 22
    const/4 v0, 0x3

    .line 23
    const/4 v3, 0x2

    .line 24
    :try_start_0
    iget-object v4, p0, Lio/reactivex/rxjava3/internal/schedulers/d$c$b;->run:Ljava/lang/Runnable;

    .line 25
    .line 26
    invoke-interface {v4}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    .line 29
    iput-object v2, p0, Lio/reactivex/rxjava3/internal/schedulers/d$c$b;->thread:Ljava/lang/Thread;

    .line 30
    .line 31
    invoke-virtual {p0, v1, v3}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/schedulers/d$c$b;->cleanup()V

    .line 38
    .line 39
    .line 40
    goto :goto_3

    .line 41
    :cond_0
    :goto_0
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-ne v1, v0, :cond_1

    .line 46
    .line 47
    invoke-static {}, Ljava/lang/Thread;->yield()V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    .line 52
    .line 53
    .line 54
    goto :goto_3

    .line 55
    :catchall_0
    move-exception v4

    .line 56
    iput-object v2, p0, Lio/reactivex/rxjava3/internal/schedulers/d$c$b;->thread:Ljava/lang/Thread;

    .line 57
    .line 58
    invoke-virtual {p0, v1, v3}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-nez v1, :cond_3

    .line 63
    .line 64
    :goto_1
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-ne v1, v0, :cond_2

    .line 69
    .line 70
    invoke-static {}, Ljava/lang/Thread;->yield()V

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_2
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    .line 75
    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_3
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/schedulers/d$c$b;->cleanup()V

    .line 79
    .line 80
    .line 81
    :goto_2
    throw v4

    .line 82
    :cond_4
    iput-object v2, p0, Lio/reactivex/rxjava3/internal/schedulers/d$c$b;->thread:Ljava/lang/Thread;

    .line 83
    .line 84
    :cond_5
    :goto_3
    return-void
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
