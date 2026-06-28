.class final Lio/reactivex/rxjava3/internal/schedulers/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/schedulers/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field private final a:J

.field private final b:Ljava/util/concurrent/ConcurrentLinkedQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentLinkedQueue<",
            "Lio/reactivex/rxjava3/internal/schedulers/g$c;",
            ">;"
        }
    .end annotation
.end field

.field final c:Lio/reactivex/rxjava3/disposables/c;

.field private final d:Ljava/util/concurrent/ScheduledExecutorService;

.field private final e:Ljava/util/concurrent/Future;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Future<",
            "*>;"
        }
    .end annotation
.end field

.field private final f:Ljava/util/concurrent/ThreadFactory;


# direct methods
.method constructor <init>(JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ThreadFactory;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p3, :cond_0

    .line 5
    .line 6
    invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 7
    .line 8
    .line 9
    move-result-wide p1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const-wide/16 p1, 0x0

    .line 12
    .line 13
    :goto_0
    move-wide v4, p1

    .line 14
    iput-wide v4, p0, Lio/reactivex/rxjava3/internal/schedulers/g$a;->a:J

    .line 15
    .line 16
    new-instance p1, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 17
    .line 18
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/schedulers/g$a;->b:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 22
    .line 23
    new-instance p1, Lio/reactivex/rxjava3/disposables/c;

    .line 24
    .line 25
    invoke-direct {p1}, Lio/reactivex/rxjava3/disposables/c;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/schedulers/g$a;->c:Lio/reactivex/rxjava3/disposables/c;

    .line 29
    .line 30
    iput-object p4, p0, Lio/reactivex/rxjava3/internal/schedulers/g$a;->f:Ljava/util/concurrent/ThreadFactory;

    .line 31
    .line 32
    if-eqz p3, :cond_1

    .line 33
    .line 34
    const/4 p1, 0x1

    .line 35
    sget-object p2, Lio/reactivex/rxjava3/internal/schedulers/g;->g:Lio/reactivex/rxjava3/internal/schedulers/k;

    .line 36
    .line 37
    invoke-static {p1, p2}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    sget-object v6, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 42
    .line 43
    move-object v0, p1

    .line 44
    move-object v1, p0

    .line 45
    move-wide v2, v4

    .line 46
    invoke-interface/range {v0 .. v6}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    goto :goto_1

    .line 51
    :cond_1
    const/4 p1, 0x0

    .line 52
    move-object p2, p1

    .line 53
    :goto_1
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/schedulers/g$a;->d:Ljava/util/concurrent/ScheduledExecutorService;

    .line 54
    .line 55
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/schedulers/g$a;->e:Ljava/util/concurrent/Future;

    .line 56
    .line 57
    return-void
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
.end method

.method static a(Ljava/util/concurrent/ConcurrentLinkedQueue;Lio/reactivex/rxjava3/disposables/c;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/ConcurrentLinkedQueue<",
            "Lio/reactivex/rxjava3/internal/schedulers/g$c;",
            ">;",
            "Lio/reactivex/rxjava3/disposables/c;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-static {}, Lio/reactivex/rxjava3/internal/schedulers/g$a;->c()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-eqz v3, :cond_1

    .line 20
    .line 21
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    check-cast v3, Lio/reactivex/rxjava3/internal/schedulers/g$c;

    .line 26
    .line 27
    invoke-virtual {v3}, Lio/reactivex/rxjava3/internal/schedulers/g$c;->r()J

    .line 28
    .line 29
    .line 30
    move-result-wide v4

    .line 31
    cmp-long v4, v4, v0

    .line 32
    .line 33
    if-gtz v4, :cond_1

    .line 34
    .line 35
    invoke-virtual {p0, v3}, Ljava/util/concurrent/ConcurrentLinkedQueue;->remove(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-eqz v4, :cond_0

    .line 40
    .line 41
    invoke-virtual {p1, v3}, Lio/reactivex/rxjava3/disposables/c;->a(Lio/reactivex/rxjava3/disposables/e;)Z

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    return-void
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method

.method static c()J
    .locals 2

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    return-wide v0
.end method


# virtual methods
.method b()Lio/reactivex/rxjava3/internal/schedulers/g$c;
    .locals 2

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/schedulers/g$a;->c:Lio/reactivex/rxjava3/disposables/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/reactivex/rxjava3/disposables/c;->isDisposed()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lio/reactivex/rxjava3/internal/schedulers/g;->l:Lio/reactivex/rxjava3/internal/schedulers/g$c;

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/schedulers/g$a;->b:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/schedulers/g$a;->b:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Lio/reactivex/rxjava3/internal/schedulers/g$c;

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    return-object v0

    .line 31
    :cond_1
    new-instance v0, Lio/reactivex/rxjava3/internal/schedulers/g$c;

    .line 32
    .line 33
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/schedulers/g$a;->f:Ljava/util/concurrent/ThreadFactory;

    .line 34
    .line 35
    invoke-direct {v0, v1}, Lio/reactivex/rxjava3/internal/schedulers/g$c;-><init>(Ljava/util/concurrent/ThreadFactory;)V

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/schedulers/g$a;->c:Lio/reactivex/rxjava3/disposables/c;

    .line 39
    .line 40
    invoke-virtual {v1, v0}, Lio/reactivex/rxjava3/disposables/c;->b(Lio/reactivex/rxjava3/disposables/e;)Z

    .line 41
    .line 42
    .line 43
    return-object v0
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

.method d(Lio/reactivex/rxjava3/internal/schedulers/g$c;)V
    .locals 4

    .line 1
    invoke-static {}, Lio/reactivex/rxjava3/internal/schedulers/g$a;->c()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-wide v2, p0, Lio/reactivex/rxjava3/internal/schedulers/g$a;->a:J

    .line 6
    .line 7
    add-long/2addr v0, v2

    .line 8
    invoke-virtual {p1, v0, v1}, Lio/reactivex/rxjava3/internal/schedulers/g$c;->s(J)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/schedulers/g$a;->b:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->offer(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    return-void
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
.end method

.method e()V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/schedulers/g$a;->c:Lio/reactivex/rxjava3/disposables/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/reactivex/rxjava3/disposables/c;->dispose()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/schedulers/g$a;->e:Ljava/util/concurrent/Future;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/schedulers/g$a;->d:Ljava/util/concurrent/ScheduledExecutorService;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 19
    .line 20
    .line 21
    :cond_1
    return-void
    .line 22
    .line 23
.end method

.method public run()V
    .locals 2

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/schedulers/g$a;->b:Ljava/util/concurrent/ConcurrentLinkedQueue;

    iget-object v1, p0, Lio/reactivex/rxjava3/internal/schedulers/g$a;->c:Lio/reactivex/rxjava3/disposables/c;

    invoke-static {v0, v1}, Lio/reactivex/rxjava3/internal/schedulers/g$a;->a(Ljava/util/concurrent/ConcurrentLinkedQueue;Lio/reactivex/rxjava3/disposables/c;)V

    return-void
.end method
