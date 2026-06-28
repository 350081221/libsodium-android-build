.class public final Lio/reactivex/rxjava3/observers/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/core/p0;
.implements Lio/reactivex/rxjava3/disposables/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lio/reactivex/rxjava3/core/p0<",
        "TT;>;",
        "Lio/reactivex/rxjava3/disposables/e;"
    }
.end annotation


# static fields
.field static final g:I = 0x4


# instance fields
.field final a:Lio/reactivex/rxjava3/core/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/core/p0<",
            "-TT;>;"
        }
    .end annotation
.end field

.field final b:Z

.field c:Lio/reactivex/rxjava3/disposables/e;

.field d:Z

.field e:Lio/reactivex/rxjava3/internal/util/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/internal/util/a<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field volatile f:Z


# direct methods
.method public constructor <init>(Lio/reactivex/rxjava3/core/p0;)V
    .locals 1
    .param p1    # Lio/reactivex/rxjava3/core/p0;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/p0<",
            "-TT;>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lio/reactivex/rxjava3/observers/m;-><init>(Lio/reactivex/rxjava3/core/p0;Z)V

    return-void
.end method

.method public constructor <init>(Lio/reactivex/rxjava3/core/p0;Z)V
    .locals 0
    .param p1    # Lio/reactivex/rxjava3/core/p0;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/p0<",
            "-TT;>;Z)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lio/reactivex/rxjava3/observers/m;->a:Lio/reactivex/rxjava3/core/p0;

    .line 4
    iput-boolean p2, p0, Lio/reactivex/rxjava3/observers/m;->b:Z

    return-void
.end method


# virtual methods
.method a()V
    .locals 2

    .line 1
    :cond_0
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lio/reactivex/rxjava3/observers/m;->e:Lio/reactivex/rxjava3/internal/util/a;

    .line 3
    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Lio/reactivex/rxjava3/observers/m;->d:Z

    .line 8
    .line 9
    monitor-exit p0

    .line 10
    return-void

    .line 11
    :cond_1
    const/4 v1, 0x0

    .line 12
    iput-object v1, p0, Lio/reactivex/rxjava3/observers/m;->e:Lio/reactivex/rxjava3/internal/util/a;

    .line 13
    .line 14
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    iget-object v1, p0, Lio/reactivex/rxjava3/observers/m;->a:Lio/reactivex/rxjava3/core/p0;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lio/reactivex/rxjava3/internal/util/a;->a(Lio/reactivex/rxjava3/core/p0;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    return-void

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    throw v0
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

.method public dispose()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lio/reactivex/rxjava3/observers/m;->f:Z

    .line 3
    .line 4
    iget-object v0, p0, Lio/reactivex/rxjava3/observers/m;->c:Lio/reactivex/rxjava3/disposables/e;

    .line 5
    .line 6
    invoke-interface {v0}, Lio/reactivex/rxjava3/disposables/e;->dispose()V

    .line 7
    .line 8
    .line 9
    return-void
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

.method public isDisposed()Z
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/observers/m;->c:Lio/reactivex/rxjava3/disposables/e;

    invoke-interface {v0}, Lio/reactivex/rxjava3/disposables/e;->isDisposed()Z

    move-result v0

    return v0
.end method

.method public onComplete()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/observers/m;->f:Z

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
    iget-boolean v0, p0, Lio/reactivex/rxjava3/observers/m;->f:Z

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
    iget-boolean v0, p0, Lio/reactivex/rxjava3/observers/m;->d:Z

    .line 14
    .line 15
    if-eqz v0, :cond_3

    .line 16
    .line 17
    iget-object v0, p0, Lio/reactivex/rxjava3/observers/m;->e:Lio/reactivex/rxjava3/internal/util/a;

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
    iput-object v0, p0, Lio/reactivex/rxjava3/observers/m;->e:Lio/reactivex/rxjava3/internal/util/a;

    .line 28
    .line 29
    :cond_2
    invoke-static {}, Lio/reactivex/rxjava3/internal/util/q;->complete()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v0, v1}, Lio/reactivex/rxjava3/internal/util/a;->c(Ljava/lang/Object;)V

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
    iput-boolean v0, p0, Lio/reactivex/rxjava3/observers/m;->f:Z

    .line 40
    .line 41
    iput-boolean v0, p0, Lio/reactivex/rxjava3/observers/m;->d:Z

    .line 42
    .line 43
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    iget-object v0, p0, Lio/reactivex/rxjava3/observers/m;->a:Lio/reactivex/rxjava3/core/p0;

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
    .param p1    # Ljava/lang/Throwable;
        .annotation build Ll3/f;
        .end annotation
    .end param

    .line 1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/observers/m;->f:Z

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
    iget-boolean v0, p0, Lio/reactivex/rxjava3/observers/m;->f:Z

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/observers/m;->d:Z

    .line 17
    .line 18
    if-eqz v0, :cond_4

    .line 19
    .line 20
    iput-boolean v1, p0, Lio/reactivex/rxjava3/observers/m;->f:Z

    .line 21
    .line 22
    iget-object v0, p0, Lio/reactivex/rxjava3/observers/m;->e:Lio/reactivex/rxjava3/internal/util/a;

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
    iput-object v0, p0, Lio/reactivex/rxjava3/observers/m;->e:Lio/reactivex/rxjava3/internal/util/a;

    .line 33
    .line 34
    :cond_2
    invoke-static {p1}, Lio/reactivex/rxjava3/internal/util/q;->error(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iget-boolean v1, p0, Lio/reactivex/rxjava3/observers/m;->b:Z

    .line 39
    .line 40
    if-eqz v1, :cond_3

    .line 41
    .line 42
    invoke-virtual {v0, p1}, Lio/reactivex/rxjava3/internal/util/a;->c(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_3
    invoke-virtual {v0, p1}, Lio/reactivex/rxjava3/internal/util/a;->f(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    :goto_0
    monitor-exit p0

    .line 50
    return-void

    .line 51
    :cond_4
    iput-boolean v1, p0, Lio/reactivex/rxjava3/observers/m;->f:Z

    .line 52
    .line 53
    iput-boolean v1, p0, Lio/reactivex/rxjava3/observers/m;->d:Z

    .line 54
    .line 55
    const/4 v1, 0x0

    .line 56
    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    if-eqz v1, :cond_5

    .line 58
    .line 59
    invoke-static {p1}, Lio/reactivex/rxjava3/plugins/a;->Y(Ljava/lang/Throwable;)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_5
    iget-object v0, p0, Lio/reactivex/rxjava3/observers/m;->a:Lio/reactivex/rxjava3/core/p0;

    .line 64
    .line 65
    invoke-interface {v0, p1}, Lio/reactivex/rxjava3/core/p0;->onError(Ljava/lang/Throwable;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :catchall_0
    move-exception p1

    .line 70
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 71
    throw p1
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
    .param p1    # Ljava/lang/Object;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/observers/m;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    if-nez p1, :cond_1

    .line 7
    .line 8
    iget-object p1, p0, Lio/reactivex/rxjava3/observers/m;->c:Lio/reactivex/rxjava3/disposables/e;

    .line 9
    .line 10
    invoke-interface {p1}, Lio/reactivex/rxjava3/disposables/e;->dispose()V

    .line 11
    .line 12
    .line 13
    const-string p1, "onNext called with a null value."

    .line 14
    .line 15
    invoke-static {p1}, Lio/reactivex/rxjava3/internal/util/k;->b(Ljava/lang/String;)Ljava/lang/NullPointerException;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/observers/m;->onError(Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    monitor-enter p0

    .line 24
    :try_start_0
    iget-boolean v0, p0, Lio/reactivex/rxjava3/observers/m;->f:Z

    .line 25
    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    monitor-exit p0

    .line 29
    return-void

    .line 30
    :cond_2
    iget-boolean v0, p0, Lio/reactivex/rxjava3/observers/m;->d:Z

    .line 31
    .line 32
    if-eqz v0, :cond_4

    .line 33
    .line 34
    iget-object v0, p0, Lio/reactivex/rxjava3/observers/m;->e:Lio/reactivex/rxjava3/internal/util/a;

    .line 35
    .line 36
    if-nez v0, :cond_3

    .line 37
    .line 38
    new-instance v0, Lio/reactivex/rxjava3/internal/util/a;

    .line 39
    .line 40
    const/4 v1, 0x4

    .line 41
    invoke-direct {v0, v1}, Lio/reactivex/rxjava3/internal/util/a;-><init>(I)V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, Lio/reactivex/rxjava3/observers/m;->e:Lio/reactivex/rxjava3/internal/util/a;

    .line 45
    .line 46
    :cond_3
    invoke-static {p1}, Lio/reactivex/rxjava3/internal/util/q;->next(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {v0, p1}, Lio/reactivex/rxjava3/internal/util/a;->c(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    monitor-exit p0

    .line 54
    return-void

    .line 55
    :cond_4
    const/4 v0, 0x1

    .line 56
    iput-boolean v0, p0, Lio/reactivex/rxjava3/observers/m;->d:Z

    .line 57
    .line 58
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    iget-object v0, p0, Lio/reactivex/rxjava3/observers/m;->a:Lio/reactivex/rxjava3/core/p0;

    .line 60
    .line 61
    invoke-interface {v0, p1}, Lio/reactivex/rxjava3/core/p0;->onNext(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Lio/reactivex/rxjava3/observers/m;->a()V

    .line 65
    .line 66
    .line 67
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

.method public onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V
    .locals 1
    .param p1    # Lio/reactivex/rxjava3/disposables/e;
        .annotation build Ll3/f;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/observers/m;->c:Lio/reactivex/rxjava3/disposables/e;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lio/reactivex/rxjava3/internal/disposables/c;->validate(Lio/reactivex/rxjava3/disposables/e;Lio/reactivex/rxjava3/disposables/e;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iput-object p1, p0, Lio/reactivex/rxjava3/observers/m;->c:Lio/reactivex/rxjava3/disposables/e;

    .line 10
    .line 11
    iget-object p1, p0, Lio/reactivex/rxjava3/observers/m;->a:Lio/reactivex/rxjava3/core/p0;

    .line 12
    .line 13
    invoke-interface {p1, p0}, Lio/reactivex/rxjava3/core/p0;->onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V

    .line 14
    .line 15
    .line 16
    :cond_0
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
