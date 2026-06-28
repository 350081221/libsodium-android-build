.class final Lio/reactivex/rxjava3/subjects/g;
.super Lio/reactivex/rxjava3/subjects/i;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/internal/util/a$a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/rxjava3/subjects/i<",
        "TT;>;",
        "Lio/reactivex/rxjava3/internal/util/a$a<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field final a:Lio/reactivex/rxjava3/subjects/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/subjects/i<",
            "TT;>;"
        }
    .end annotation
.end field

.field b:Z

.field c:Lio/reactivex/rxjava3/internal/util/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/internal/util/a<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field volatile d:Z


# direct methods
.method constructor <init>(Lio/reactivex/rxjava3/subjects/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/subjects/i<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lio/reactivex/rxjava3/subjects/i;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/subjects/g;->a:Lio/reactivex/rxjava3/subjects/i;

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
.end method


# virtual methods
.method public I8()Ljava/lang/Throwable;
    .locals 1
    .annotation build Ll3/g;
    .end annotation

    iget-object v0, p0, Lio/reactivex/rxjava3/subjects/g;->a:Lio/reactivex/rxjava3/subjects/i;

    invoke-virtual {v0}, Lio/reactivex/rxjava3/subjects/i;->I8()Ljava/lang/Throwable;

    move-result-object v0

    return-object v0
.end method

.method public J8()Z
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/subjects/g;->a:Lio/reactivex/rxjava3/subjects/i;

    invoke-virtual {v0}, Lio/reactivex/rxjava3/subjects/i;->J8()Z

    move-result v0

    return v0
.end method

.method public K8()Z
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/subjects/g;->a:Lio/reactivex/rxjava3/subjects/i;

    invoke-virtual {v0}, Lio/reactivex/rxjava3/subjects/i;->K8()Z

    move-result v0

    return v0
.end method

.method public L8()Z
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/subjects/g;->a:Lio/reactivex/rxjava3/subjects/i;

    invoke-virtual {v0}, Lio/reactivex/rxjava3/subjects/i;->L8()Z

    move-result v0

    return v0
.end method

.method N8()V
    .locals 2

    .line 1
    :goto_0
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lio/reactivex/rxjava3/subjects/g;->c:Lio/reactivex/rxjava3/internal/util/a;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Lio/reactivex/rxjava3/subjects/g;->b:Z

    .line 8
    .line 9
    monitor-exit p0

    .line 10
    return-void

    .line 11
    :cond_0
    const/4 v1, 0x0

    .line 12
    iput-object v1, p0, Lio/reactivex/rxjava3/subjects/g;->c:Lio/reactivex/rxjava3/internal/util/a;

    .line 13
    .line 14
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    invoke-virtual {v0, p0}, Lio/reactivex/rxjava3/internal/util/a;->d(Lio/reactivex/rxjava3/internal/util/a$a;)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception v0

    .line 20
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    throw v0
    .line 22
    .line 23
.end method

.method protected l6(Lio/reactivex/rxjava3/core/p0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/p0<",
            "-TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/rxjava3/subjects/g;->a:Lio/reactivex/rxjava3/subjects/i;

    invoke-virtual {v0, p1}, Lio/reactivex/rxjava3/core/i0;->subscribe(Lio/reactivex/rxjava3/core/p0;)V

    return-void
.end method

.method public onComplete()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/subjects/g;->d:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    monitor-enter p0

    .line 7
    :try_start_0
    iget-boolean v0, p0, Lio/reactivex/rxjava3/subjects/g;->d:Z

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    monitor-exit p0

    .line 12
    return-void

    .line 13
    :cond_1
    const/4 v0, 0x1

    .line 14
    iput-boolean v0, p0, Lio/reactivex/rxjava3/subjects/g;->d:Z

    .line 15
    .line 16
    iget-boolean v1, p0, Lio/reactivex/rxjava3/subjects/g;->b:Z

    .line 17
    .line 18
    if-eqz v1, :cond_3

    .line 19
    .line 20
    iget-object v0, p0, Lio/reactivex/rxjava3/subjects/g;->c:Lio/reactivex/rxjava3/internal/util/a;

    .line 21
    .line 22
    if-nez v0, :cond_2

    .line 23
    .line 24
    new-instance v0, Lio/reactivex/rxjava3/internal/util/a;

    .line 25
    .line 26
    const/4 v1, 0x4

    .line 27
    invoke-direct {v0, v1}, Lio/reactivex/rxjava3/internal/util/a;-><init>(I)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lio/reactivex/rxjava3/subjects/g;->c:Lio/reactivex/rxjava3/internal/util/a;

    .line 31
    .line 32
    :cond_2
    invoke-static {}, Lio/reactivex/rxjava3/internal/util/q;->complete()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v0, v1}, Lio/reactivex/rxjava3/internal/util/a;->c(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    monitor-exit p0

    .line 40
    return-void

    .line 41
    :cond_3
    iput-boolean v0, p0, Lio/reactivex/rxjava3/subjects/g;->b:Z

    .line 42
    .line 43
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    iget-object v0, p0, Lio/reactivex/rxjava3/subjects/g;->a:Lio/reactivex/rxjava3/subjects/i;

    .line 45
    .line 46
    invoke-interface {v0}, Lio/reactivex/rxjava3/core/p0;->onComplete()V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :catchall_0
    move-exception v0

    .line 51
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 52
    throw v0
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

.method public onError(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/subjects/g;->d:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, Lio/reactivex/rxjava3/plugins/a;->Y(Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    monitor-enter p0

    .line 10
    :try_start_0
    iget-boolean v0, p0, Lio/reactivex/rxjava3/subjects/g;->d:Z

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    iput-boolean v1, p0, Lio/reactivex/rxjava3/subjects/g;->d:Z

    .line 17
    .line 18
    iget-boolean v0, p0, Lio/reactivex/rxjava3/subjects/g;->b:Z

    .line 19
    .line 20
    if-eqz v0, :cond_3

    .line 21
    .line 22
    iget-object v0, p0, Lio/reactivex/rxjava3/subjects/g;->c:Lio/reactivex/rxjava3/internal/util/a;

    .line 23
    .line 24
    if-nez v0, :cond_2

    .line 25
    .line 26
    new-instance v0, Lio/reactivex/rxjava3/internal/util/a;

    .line 27
    .line 28
    const/4 v1, 0x4

    .line 29
    invoke-direct {v0, v1}, Lio/reactivex/rxjava3/internal/util/a;-><init>(I)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lio/reactivex/rxjava3/subjects/g;->c:Lio/reactivex/rxjava3/internal/util/a;

    .line 33
    .line 34
    :cond_2
    invoke-static {p1}, Lio/reactivex/rxjava3/internal/util/q;->error(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {v0, p1}, Lio/reactivex/rxjava3/internal/util/a;->f(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    monitor-exit p0

    .line 42
    return-void

    .line 43
    :cond_3
    iput-boolean v1, p0, Lio/reactivex/rxjava3/subjects/g;->b:Z

    .line 44
    .line 45
    const/4 v1, 0x0

    .line 46
    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    if-eqz v1, :cond_4

    .line 48
    .line 49
    invoke-static {p1}, Lio/reactivex/rxjava3/plugins/a;->Y(Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_4
    iget-object v0, p0, Lio/reactivex/rxjava3/subjects/g;->a:Lio/reactivex/rxjava3/subjects/i;

    .line 54
    .line 55
    invoke-interface {v0, p1}, Lio/reactivex/rxjava3/core/p0;->onError(Ljava/lang/Throwable;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :catchall_0
    move-exception p1

    .line 60
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 61
    throw p1
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

.method public onNext(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/subjects/g;->d:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    monitor-enter p0

    .line 7
    :try_start_0
    iget-boolean v0, p0, Lio/reactivex/rxjava3/subjects/g;->d:Z

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    monitor-exit p0

    .line 12
    return-void

    .line 13
    :cond_1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/subjects/g;->b:Z

    .line 14
    .line 15
    if-eqz v0, :cond_3

    .line 16
    .line 17
    iget-object v0, p0, Lio/reactivex/rxjava3/subjects/g;->c:Lio/reactivex/rxjava3/internal/util/a;

    .line 18
    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    new-instance v0, Lio/reactivex/rxjava3/internal/util/a;

    .line 22
    .line 23
    const/4 v1, 0x4

    .line 24
    invoke-direct {v0, v1}, Lio/reactivex/rxjava3/internal/util/a;-><init>(I)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lio/reactivex/rxjava3/subjects/g;->c:Lio/reactivex/rxjava3/internal/util/a;

    .line 28
    .line 29
    :cond_2
    invoke-static {p1}, Lio/reactivex/rxjava3/internal/util/q;->next(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {v0, p1}, Lio/reactivex/rxjava3/internal/util/a;->c(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    monitor-exit p0

    .line 37
    return-void

    .line 38
    :cond_3
    const/4 v0, 0x1

    .line 39
    iput-boolean v0, p0, Lio/reactivex/rxjava3/subjects/g;->b:Z

    .line 40
    .line 41
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    iget-object v0, p0, Lio/reactivex/rxjava3/subjects/g;->a:Lio/reactivex/rxjava3/subjects/i;

    .line 43
    .line 44
    invoke-interface {v0, p1}, Lio/reactivex/rxjava3/core/p0;->onNext(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Lio/reactivex/rxjava3/subjects/g;->N8()V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :catchall_0
    move-exception p1

    .line 52
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 53
    throw p1
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

.method public onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/subjects/g;->d:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_3

    .line 5
    .line 6
    monitor-enter p0

    .line 7
    :try_start_0
    iget-boolean v0, p0, Lio/reactivex/rxjava3/subjects/g;->d:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-boolean v0, p0, Lio/reactivex/rxjava3/subjects/g;->b:Z

    .line 13
    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    iget-object v0, p0, Lio/reactivex/rxjava3/subjects/g;->c:Lio/reactivex/rxjava3/internal/util/a;

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    new-instance v0, Lio/reactivex/rxjava3/internal/util/a;

    .line 21
    .line 22
    const/4 v1, 0x4

    .line 23
    invoke-direct {v0, v1}, Lio/reactivex/rxjava3/internal/util/a;-><init>(I)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lio/reactivex/rxjava3/subjects/g;->c:Lio/reactivex/rxjava3/internal/util/a;

    .line 27
    .line 28
    :cond_1
    invoke-static {p1}, Lio/reactivex/rxjava3/internal/util/q;->disposable(Lio/reactivex/rxjava3/disposables/e;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {v0, p1}, Lio/reactivex/rxjava3/internal/util/a;->c(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    monitor-exit p0

    .line 36
    return-void

    .line 37
    :cond_2
    iput-boolean v1, p0, Lio/reactivex/rxjava3/subjects/g;->b:Z

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    move v1, v0

    .line 41
    :goto_0
    monitor-exit p0

    .line 42
    goto :goto_1

    .line 43
    :catchall_0
    move-exception p1

    .line 44
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    throw p1

    .line 46
    :cond_3
    :goto_1
    if-eqz v1, :cond_4

    .line 47
    .line 48
    invoke-interface {p1}, Lio/reactivex/rxjava3/disposables/e;->dispose()V

    .line 49
    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_4
    iget-object v0, p0, Lio/reactivex/rxjava3/subjects/g;->a:Lio/reactivex/rxjava3/subjects/i;

    .line 53
    .line 54
    invoke-interface {v0, p1}, Lio/reactivex/rxjava3/core/p0;->onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Lio/reactivex/rxjava3/subjects/g;->N8()V

    .line 58
    .line 59
    .line 60
    :goto_2
    return-void
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

.method public test(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/subjects/g;->a:Lio/reactivex/rxjava3/subjects/i;

    invoke-static {p1, v0}, Lio/reactivex/rxjava3/internal/util/q;->acceptFull(Ljava/lang/Object;Lio/reactivex/rxjava3/core/p0;)Z

    move-result p1

    return p1
.end method
