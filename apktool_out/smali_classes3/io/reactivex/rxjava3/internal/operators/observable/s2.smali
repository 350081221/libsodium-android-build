.class public final Lio/reactivex/rxjava3/internal/operators/observable/s2;
.super Lio/reactivex/rxjava3/core/i0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/rxjava3/internal/operators/observable/s2$b;,
        Lio/reactivex/rxjava3/internal/operators/observable/s2$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/rxjava3/core/i0<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final a:Lio/reactivex/rxjava3/observables/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/observables/a<",
            "TT;>;"
        }
    .end annotation
.end field

.field final b:I

.field final c:J

.field final d:Ljava/util/concurrent/TimeUnit;

.field final e:Lio/reactivex/rxjava3/core/q0;

.field f:Lio/reactivex/rxjava3/internal/operators/observable/s2$a;


# direct methods
.method public constructor <init>(Lio/reactivex/rxjava3/observables/a;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/observables/a<",
            "TT;>;)V"
        }
    .end annotation

    const/4 v2, 0x1

    const-wide/16 v3, 0x0

    .line 1
    sget-object v5, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v6}, Lio/reactivex/rxjava3/internal/operators/observable/s2;-><init>(Lio/reactivex/rxjava3/observables/a;IJLjava/util/concurrent/TimeUnit;Lio/reactivex/rxjava3/core/q0;)V

    return-void
.end method

.method public constructor <init>(Lio/reactivex/rxjava3/observables/a;IJLjava/util/concurrent/TimeUnit;Lio/reactivex/rxjava3/core/q0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/observables/a<",
            "TT;>;IJ",
            "Ljava/util/concurrent/TimeUnit;",
            "Lio/reactivex/rxjava3/core/q0;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Lio/reactivex/rxjava3/core/i0;-><init>()V

    .line 3
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/s2;->a:Lio/reactivex/rxjava3/observables/a;

    .line 4
    iput p2, p0, Lio/reactivex/rxjava3/internal/operators/observable/s2;->b:I

    .line 5
    iput-wide p3, p0, Lio/reactivex/rxjava3/internal/operators/observable/s2;->c:J

    .line 6
    iput-object p5, p0, Lio/reactivex/rxjava3/internal/operators/observable/s2;->d:Ljava/util/concurrent/TimeUnit;

    .line 7
    iput-object p6, p0, Lio/reactivex/rxjava3/internal/operators/observable/s2;->e:Lio/reactivex/rxjava3/core/q0;

    return-void
.end method


# virtual methods
.method I8(Lio/reactivex/rxjava3/internal/operators/observable/s2$a;)V
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/s2;->f:Lio/reactivex/rxjava3/internal/operators/observable/s2$a;

    .line 3
    .line 4
    if-eqz v0, :cond_4

    .line 5
    .line 6
    if-eq v0, p1, :cond_0

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_0
    iget-wide v0, p1, Lio/reactivex/rxjava3/internal/operators/observable/s2$a;->subscriberCount:J

    .line 10
    .line 11
    const-wide/16 v2, 0x1

    .line 12
    .line 13
    sub-long/2addr v0, v2

    .line 14
    iput-wide v0, p1, Lio/reactivex/rxjava3/internal/operators/observable/s2$a;->subscriberCount:J

    .line 15
    .line 16
    const-wide/16 v2, 0x0

    .line 17
    .line 18
    cmp-long v0, v0, v2

    .line 19
    .line 20
    if-nez v0, :cond_3

    .line 21
    .line 22
    iget-boolean v0, p1, Lio/reactivex/rxjava3/internal/operators/observable/s2$a;->connected:Z

    .line 23
    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    iget-wide v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/s2;->c:J

    .line 28
    .line 29
    cmp-long v0, v0, v2

    .line 30
    .line 31
    if-nez v0, :cond_2

    .line 32
    .line 33
    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/internal/operators/observable/s2;->K8(Lio/reactivex/rxjava3/internal/operators/observable/s2$a;)V

    .line 34
    .line 35
    .line 36
    monitor-exit p0

    .line 37
    return-void

    .line 38
    :cond_2
    new-instance v0, Lio/reactivex/rxjava3/internal/disposables/f;

    .line 39
    .line 40
    invoke-direct {v0}, Lio/reactivex/rxjava3/internal/disposables/f;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object v0, p1, Lio/reactivex/rxjava3/internal/operators/observable/s2$a;->timer:Lio/reactivex/rxjava3/disposables/e;

    .line 44
    .line 45
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/observable/s2;->e:Lio/reactivex/rxjava3/core/q0;

    .line 47
    .line 48
    iget-wide v2, p0, Lio/reactivex/rxjava3/internal/operators/observable/s2;->c:J

    .line 49
    .line 50
    iget-object v4, p0, Lio/reactivex/rxjava3/internal/operators/observable/s2;->d:Ljava/util/concurrent/TimeUnit;

    .line 51
    .line 52
    invoke-virtual {v1, p1, v2, v3, v4}, Lio/reactivex/rxjava3/core/q0;->g(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lio/reactivex/rxjava3/disposables/e;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {v0, p1}, Lio/reactivex/rxjava3/internal/disposables/f;->replace(Lio/reactivex/rxjava3/disposables/e;)Z

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_3
    :goto_0
    :try_start_1
    monitor-exit p0

    .line 61
    return-void

    .line 62
    :cond_4
    :goto_1
    monitor-exit p0

    .line 63
    return-void

    .line 64
    :catchall_0
    move-exception p1

    .line 65
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 66
    throw p1
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
.end method

.method J8(Lio/reactivex/rxjava3/internal/operators/observable/s2$a;)V
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/s2;->f:Lio/reactivex/rxjava3/internal/operators/observable/s2$a;

    .line 3
    .line 4
    if-ne v0, p1, :cond_1

    .line 5
    .line 6
    iget-object v0, p1, Lio/reactivex/rxjava3/internal/operators/observable/s2$a;->timer:Lio/reactivex/rxjava3/disposables/e;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {v0}, Lio/reactivex/rxjava3/disposables/e;->dispose()V

    .line 12
    .line 13
    .line 14
    iput-object v1, p1, Lio/reactivex/rxjava3/internal/operators/observable/s2$a;->timer:Lio/reactivex/rxjava3/disposables/e;

    .line 15
    .line 16
    :cond_0
    iget-wide v2, p1, Lio/reactivex/rxjava3/internal/operators/observable/s2$a;->subscriberCount:J

    .line 17
    .line 18
    const-wide/16 v4, 0x1

    .line 19
    .line 20
    sub-long/2addr v2, v4

    .line 21
    iput-wide v2, p1, Lio/reactivex/rxjava3/internal/operators/observable/s2$a;->subscriberCount:J

    .line 22
    .line 23
    const-wide/16 v4, 0x0

    .line 24
    .line 25
    cmp-long p1, v2, v4

    .line 26
    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    iput-object v1, p0, Lio/reactivex/rxjava3/internal/operators/observable/s2;->f:Lio/reactivex/rxjava3/internal/operators/observable/s2$a;

    .line 30
    .line 31
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/s2;->a:Lio/reactivex/rxjava3/observables/a;

    .line 32
    .line 33
    invoke-virtual {p1}, Lio/reactivex/rxjava3/observables/a;->T8()V

    .line 34
    .line 35
    .line 36
    :cond_1
    monitor-exit p0

    .line 37
    return-void

    .line 38
    :catchall_0
    move-exception p1

    .line 39
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    throw p1
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
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
.end method

.method K8(Lio/reactivex/rxjava3/internal/operators/observable/s2$a;)V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p1, Lio/reactivex/rxjava3/internal/operators/observable/s2$a;->subscriberCount:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v0, v0, v2

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/s2;->f:Lio/reactivex/rxjava3/internal/operators/observable/s2$a;

    .line 11
    .line 12
    if-ne p1, v0, :cond_1

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/s2;->f:Lio/reactivex/rxjava3/internal/operators/observable/s2$a;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lio/reactivex/rxjava3/disposables/e;

    .line 22
    .line 23
    invoke-static {p1}, Lio/reactivex/rxjava3/internal/disposables/c;->dispose(Ljava/util/concurrent/atomic/AtomicReference;)Z

    .line 24
    .line 25
    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    const/4 v0, 0x1

    .line 29
    iput-boolean v0, p1, Lio/reactivex/rxjava3/internal/operators/observable/s2$a;->disconnectedEarly:Z

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/s2;->a:Lio/reactivex/rxjava3/observables/a;

    .line 33
    .line 34
    invoke-virtual {p1}, Lio/reactivex/rxjava3/observables/a;->T8()V

    .line 35
    .line 36
    .line 37
    :cond_1
    :goto_0
    monitor-exit p0

    .line 38
    return-void

    .line 39
    :catchall_0
    move-exception p1

    .line 40
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    throw p1
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
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
.end method

.method protected l6(Lio/reactivex/rxjava3/core/p0;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/p0<",
            "-TT;>;)V"
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/s2;->f:Lio/reactivex/rxjava3/internal/operators/observable/s2$a;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/observable/s2$a;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lio/reactivex/rxjava3/internal/operators/observable/s2$a;-><init>(Lio/reactivex/rxjava3/internal/operators/observable/s2;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/s2;->f:Lio/reactivex/rxjava3/internal/operators/observable/s2$a;

    .line 12
    .line 13
    :cond_0
    iget-wide v1, v0, Lio/reactivex/rxjava3/internal/operators/observable/s2$a;->subscriberCount:J

    .line 14
    .line 15
    const-wide/16 v3, 0x0

    .line 16
    .line 17
    cmp-long v3, v1, v3

    .line 18
    .line 19
    if-nez v3, :cond_1

    .line 20
    .line 21
    iget-object v3, v0, Lio/reactivex/rxjava3/internal/operators/observable/s2$a;->timer:Lio/reactivex/rxjava3/disposables/e;

    .line 22
    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    invoke-interface {v3}, Lio/reactivex/rxjava3/disposables/e;->dispose()V

    .line 26
    .line 27
    .line 28
    :cond_1
    const-wide/16 v3, 0x1

    .line 29
    .line 30
    add-long/2addr v1, v3

    .line 31
    iput-wide v1, v0, Lio/reactivex/rxjava3/internal/operators/observable/s2$a;->subscriberCount:J

    .line 32
    .line 33
    iget-boolean v3, v0, Lio/reactivex/rxjava3/internal/operators/observable/s2$a;->connected:Z

    .line 34
    .line 35
    if-nez v3, :cond_2

    .line 36
    .line 37
    iget v3, p0, Lio/reactivex/rxjava3/internal/operators/observable/s2;->b:I

    .line 38
    .line 39
    int-to-long v3, v3

    .line 40
    cmp-long v1, v1, v3

    .line 41
    .line 42
    if-nez v1, :cond_2

    .line 43
    .line 44
    const/4 v1, 0x1

    .line 45
    iput-boolean v1, v0, Lio/reactivex/rxjava3/internal/operators/observable/s2$a;->connected:Z

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    const/4 v1, 0x0

    .line 49
    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    iget-object v2, p0, Lio/reactivex/rxjava3/internal/operators/observable/s2;->a:Lio/reactivex/rxjava3/observables/a;

    .line 51
    .line 52
    new-instance v3, Lio/reactivex/rxjava3/internal/operators/observable/s2$b;

    .line 53
    .line 54
    invoke-direct {v3, p1, p0, v0}, Lio/reactivex/rxjava3/internal/operators/observable/s2$b;-><init>(Lio/reactivex/rxjava3/core/p0;Lio/reactivex/rxjava3/internal/operators/observable/s2;Lio/reactivex/rxjava3/internal/operators/observable/s2$a;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2, v3}, Lio/reactivex/rxjava3/core/i0;->subscribe(Lio/reactivex/rxjava3/core/p0;)V

    .line 58
    .line 59
    .line 60
    if-eqz v1, :cond_3

    .line 61
    .line 62
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/s2;->a:Lio/reactivex/rxjava3/observables/a;

    .line 63
    .line 64
    invoke-virtual {p1, v0}, Lio/reactivex/rxjava3/observables/a;->M8(Lm3/g;)V

    .line 65
    .line 66
    .line 67
    :cond_3
    return-void

    .line 68
    :catchall_0
    move-exception p1

    .line 69
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 70
    throw p1
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
.end method
