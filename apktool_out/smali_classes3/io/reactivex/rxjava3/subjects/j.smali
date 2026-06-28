.class public final Lio/reactivex/rxjava3/subjects/j;
.super Lio/reactivex/rxjava3/subjects/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/rxjava3/subjects/j$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/rxjava3/subjects/i<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final a:Lio/reactivex/rxjava3/internal/queue/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/internal/queue/c<",
            "TT;>;"
        }
    .end annotation
.end field

.field final b:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lio/reactivex/rxjava3/core/p0<",
            "-TT;>;>;"
        }
    .end annotation
.end field

.field final c:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field final d:Z

.field volatile e:Z

.field volatile f:Z

.field g:Ljava/lang/Throwable;

.field final h:Ljava/util/concurrent/atomic/AtomicBoolean;

.field final i:Lio/reactivex/rxjava3/internal/observers/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/internal/observers/b<",
            "TT;>;"
        }
    .end annotation
.end field

.field j:Z


# direct methods
.method constructor <init>(ILjava/lang/Runnable;Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lio/reactivex/rxjava3/subjects/i;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lio/reactivex/rxjava3/internal/queue/c;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Lio/reactivex/rxjava3/internal/queue/c;-><init>(I)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lio/reactivex/rxjava3/subjects/j;->a:Lio/reactivex/rxjava3/internal/queue/c;

    .line 10
    .line 11
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 12
    .line 13
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lio/reactivex/rxjava3/subjects/j;->c:Ljava/util/concurrent/atomic/AtomicReference;

    .line 17
    .line 18
    iput-boolean p3, p0, Lio/reactivex/rxjava3/subjects/j;->d:Z

    .line 19
    .line 20
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 21
    .line 22
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lio/reactivex/rxjava3/subjects/j;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 26
    .line 27
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 28
    .line 29
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Lio/reactivex/rxjava3/subjects/j;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 33
    .line 34
    new-instance p1, Lio/reactivex/rxjava3/subjects/j$a;

    .line 35
    .line 36
    invoke-direct {p1, p0}, Lio/reactivex/rxjava3/subjects/j$a;-><init>(Lio/reactivex/rxjava3/subjects/j;)V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, Lio/reactivex/rxjava3/subjects/j;->i:Lio/reactivex/rxjava3/internal/observers/b;

    .line 40
    .line 41
    return-void
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
.end method

.method public static N8()Lio/reactivex/rxjava3/subjects/j;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Lio/reactivex/rxjava3/subjects/j<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    new-instance v0, Lio/reactivex/rxjava3/subjects/j;

    invoke-static {}, Lio/reactivex/rxjava3/core/i0;->Z()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lio/reactivex/rxjava3/subjects/j;-><init>(ILjava/lang/Runnable;Z)V

    return-object v0
.end method

.method public static O8(I)Lio/reactivex/rxjava3/subjects/j;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(I)",
            "Lio/reactivex/rxjava3/subjects/j<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .line 1
    const-string v0, "capacityHint"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lio/reactivex/rxjava3/internal/functions/b;->b(ILjava/lang/String;)I

    .line 4
    .line 5
    .line 6
    new-instance v0, Lio/reactivex/rxjava3/subjects/j;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-direct {v0, p0, v1, v2}, Lio/reactivex/rxjava3/subjects/j;-><init>(ILjava/lang/Runnable;Z)V

    .line 11
    .line 12
    .line 13
    return-object v0
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

.method public static P8(ILjava/lang/Runnable;)Lio/reactivex/rxjava3/subjects/j;
    .locals 2
    .param p1    # Ljava/lang/Runnable;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(I",
            "Ljava/lang/Runnable;",
            ")",
            "Lio/reactivex/rxjava3/subjects/j<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .line 1
    const-string v0, "capacityHint"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lio/reactivex/rxjava3/internal/functions/b;->b(ILjava/lang/String;)I

    .line 4
    .line 5
    .line 6
    const-string v0, "onTerminate"

    .line 7
    .line 8
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    new-instance v0, Lio/reactivex/rxjava3/subjects/j;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-direct {v0, p0, p1, v1}, Lio/reactivex/rxjava3/subjects/j;-><init>(ILjava/lang/Runnable;Z)V

    .line 15
    .line 16
    .line 17
    return-object v0
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

.method public static Q8(ILjava/lang/Runnable;Z)Lio/reactivex/rxjava3/subjects/j;
    .locals 1
    .param p1    # Ljava/lang/Runnable;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(I",
            "Ljava/lang/Runnable;",
            "Z)",
            "Lio/reactivex/rxjava3/subjects/j<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .line 1
    const-string v0, "capacityHint"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lio/reactivex/rxjava3/internal/functions/b;->b(ILjava/lang/String;)I

    .line 4
    .line 5
    .line 6
    const-string v0, "onTerminate"

    .line 7
    .line 8
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    new-instance v0, Lio/reactivex/rxjava3/subjects/j;

    .line 12
    .line 13
    invoke-direct {v0, p0, p1, p2}, Lio/reactivex/rxjava3/subjects/j;-><init>(ILjava/lang/Runnable;Z)V

    .line 14
    .line 15
    .line 16
    return-object v0
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
.end method

.method public static R8(Z)Lio/reactivex/rxjava3/subjects/j;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(Z)",
            "Lio/reactivex/rxjava3/subjects/j<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    new-instance v0, Lio/reactivex/rxjava3/subjects/j;

    invoke-static {}, Lio/reactivex/rxjava3/core/i0;->Z()I

    move-result v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, p0}, Lio/reactivex/rxjava3/subjects/j;-><init>(ILjava/lang/Runnable;Z)V

    return-object v0
.end method


# virtual methods
.method public I8()Ljava/lang/Throwable;
    .locals 1
    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/g;
    .end annotation

    .line 1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/subjects/j;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lio/reactivex/rxjava3/subjects/j;->g:Ljava/lang/Throwable;

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    return-object v0
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

.method public J8()Z
    .locals 1
    .annotation runtime Ll3/d;
    .end annotation

    iget-boolean v0, p0, Lio/reactivex/rxjava3/subjects/j;->f:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/reactivex/rxjava3/subjects/j;->g:Ljava/lang/Throwable;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public K8()Z
    .locals 1
    .annotation runtime Ll3/d;
    .end annotation

    iget-object v0, p0, Lio/reactivex/rxjava3/subjects/j;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public L8()Z
    .locals 1
    .annotation runtime Ll3/d;
    .end annotation

    iget-boolean v0, p0, Lio/reactivex/rxjava3/subjects/j;->f:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/reactivex/rxjava3/subjects/j;->g:Ljava/lang/Throwable;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method S8()V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/subjects/j;->c:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Runnable;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lio/reactivex/rxjava3/subjects/j;->c:Ljava/util/concurrent/atomic/AtomicReference;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static {v1, v0, v2}, Landroidx/compose/animation/core/h;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method T8()V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/subjects/j;->i:Lio/reactivex/rxjava3/internal/observers/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v0, p0, Lio/reactivex/rxjava3/subjects/j;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Lio/reactivex/rxjava3/core/p0;

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    :goto_0
    if-eqz v0, :cond_2

    .line 20
    .line 21
    iget-boolean v1, p0, Lio/reactivex/rxjava3/subjects/j;->j:Z

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    invoke-virtual {p0, v0}, Lio/reactivex/rxjava3/subjects/j;->U8(Lio/reactivex/rxjava3/core/p0;)V

    .line 26
    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    invoke-virtual {p0, v0}, Lio/reactivex/rxjava3/subjects/j;->V8(Lio/reactivex/rxjava3/core/p0;)V

    .line 30
    .line 31
    .line 32
    :goto_1
    return-void

    .line 33
    :cond_2
    iget-object v0, p0, Lio/reactivex/rxjava3/subjects/j;->i:Lio/reactivex/rxjava3/internal/observers/b;

    .line 34
    .line 35
    neg-int v1, v1

    .line 36
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-nez v1, :cond_3

    .line 41
    .line 42
    return-void

    .line 43
    :cond_3
    iget-object v0, p0, Lio/reactivex/rxjava3/subjects/j;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, Lio/reactivex/rxjava3/core/p0;

    .line 50
    .line 51
    goto :goto_0
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

.method U8(Lio/reactivex/rxjava3/core/p0;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/p0<",
            "-TT;>;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/subjects/j;->a:Lio/reactivex/rxjava3/internal/queue/c;

    .line 2
    .line 3
    iget-boolean v1, p0, Lio/reactivex/rxjava3/subjects/j;->d:Z

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    xor-int/2addr v1, v2

    .line 7
    :cond_0
    iget-boolean v3, p0, Lio/reactivex/rxjava3/subjects/j;->e:Z

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-eqz v3, :cond_1

    .line 11
    .line 12
    iget-object p1, p0, Lio/reactivex/rxjava3/subjects/j;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 13
    .line 14
    invoke-virtual {p1, v4}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    iget-boolean v3, p0, Lio/reactivex/rxjava3/subjects/j;->f:Z

    .line 19
    .line 20
    if-eqz v1, :cond_2

    .line 21
    .line 22
    if-eqz v3, :cond_2

    .line 23
    .line 24
    invoke-virtual {p0, v0, p1}, Lio/reactivex/rxjava3/subjects/j;->X8(Lio/reactivex/rxjava3/internal/fuseable/q;Lio/reactivex/rxjava3/core/p0;)Z

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    if-eqz v5, :cond_2

    .line 29
    .line 30
    return-void

    .line 31
    :cond_2
    invoke-interface {p1, v4}, Lio/reactivex/rxjava3/core/p0;->onNext(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    if-eqz v3, :cond_3

    .line 35
    .line 36
    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/subjects/j;->W8(Lio/reactivex/rxjava3/core/p0;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_3
    iget-object v3, p0, Lio/reactivex/rxjava3/subjects/j;->i:Lio/reactivex/rxjava3/internal/observers/b;

    .line 41
    .line 42
    neg-int v2, v2

    .line 43
    invoke-virtual {v3, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-nez v2, :cond_0

    .line 48
    .line 49
    return-void
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

.method V8(Lio/reactivex/rxjava3/core/p0;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/p0<",
            "-TT;>;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/subjects/j;->a:Lio/reactivex/rxjava3/internal/queue/c;

    .line 2
    .line 3
    iget-boolean v1, p0, Lio/reactivex/rxjava3/subjects/j;->d:Z

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    xor-int/2addr v1, v2

    .line 7
    move v3, v2

    .line 8
    move v4, v3

    .line 9
    :cond_0
    :goto_0
    iget-boolean v5, p0, Lio/reactivex/rxjava3/subjects/j;->e:Z

    .line 10
    .line 11
    if-eqz v5, :cond_1

    .line 12
    .line 13
    iget-object p1, p0, Lio/reactivex/rxjava3/subjects/j;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-virtual {p1, v1}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-interface {v0}, Lio/reactivex/rxjava3/internal/fuseable/q;->clear()V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    iget-boolean v5, p0, Lio/reactivex/rxjava3/subjects/j;->f:Z

    .line 24
    .line 25
    iget-object v6, p0, Lio/reactivex/rxjava3/subjects/j;->a:Lio/reactivex/rxjava3/internal/queue/c;

    .line 26
    .line 27
    invoke-virtual {v6}, Lio/reactivex/rxjava3/internal/queue/c;->poll()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    const/4 v7, 0x0

    .line 32
    if-nez v6, :cond_2

    .line 33
    .line 34
    move v8, v2

    .line 35
    goto :goto_1

    .line 36
    :cond_2
    move v8, v7

    .line 37
    :goto_1
    if-eqz v5, :cond_5

    .line 38
    .line 39
    if-eqz v1, :cond_4

    .line 40
    .line 41
    if-eqz v3, :cond_4

    .line 42
    .line 43
    invoke-virtual {p0, v0, p1}, Lio/reactivex/rxjava3/subjects/j;->X8(Lio/reactivex/rxjava3/internal/fuseable/q;Lio/reactivex/rxjava3/core/p0;)Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-eqz v3, :cond_3

    .line 48
    .line 49
    return-void

    .line 50
    :cond_3
    move v3, v7

    .line 51
    :cond_4
    if-eqz v8, :cond_5

    .line 52
    .line 53
    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/subjects/j;->W8(Lio/reactivex/rxjava3/core/p0;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_5
    if-eqz v8, :cond_6

    .line 58
    .line 59
    iget-object v5, p0, Lio/reactivex/rxjava3/subjects/j;->i:Lio/reactivex/rxjava3/internal/observers/b;

    .line 60
    .line 61
    neg-int v4, v4

    .line 62
    invoke-virtual {v5, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    if-nez v4, :cond_0

    .line 67
    .line 68
    return-void

    .line 69
    :cond_6
    invoke-interface {p1, v6}, Lio/reactivex/rxjava3/core/p0;->onNext(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    goto :goto_0
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

.method W8(Lio/reactivex/rxjava3/core/p0;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/p0<",
            "-TT;>;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/subjects/j;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lio/reactivex/rxjava3/subjects/j;->g:Ljava/lang/Throwable;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {p1, v0}, Lio/reactivex/rxjava3/core/p0;->onError(Ljava/lang/Throwable;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-interface {p1}, Lio/reactivex/rxjava3/core/p0;->onComplete()V

    .line 16
    .line 17
    .line 18
    :goto_0
    return-void
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

.method X8(Lio/reactivex/rxjava3/internal/fuseable/q;Lio/reactivex/rxjava3/core/p0;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/internal/fuseable/q<",
            "TT;>;",
            "Lio/reactivex/rxjava3/core/p0<",
            "-TT;>;)Z"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/subjects/j;->g:Ljava/lang/Throwable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lio/reactivex/rxjava3/subjects/j;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Lio/reactivex/rxjava3/internal/fuseable/q;->clear()V

    .line 12
    .line 13
    .line 14
    invoke-interface {p2, v0}, Lio/reactivex/rxjava3/core/p0;->onError(Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    return p1

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    return p1
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

.method protected l6(Lio/reactivex/rxjava3/core/p0;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/p0<",
            "-TT;>;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/subjects/j;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lio/reactivex/rxjava3/subjects/j;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, Lio/reactivex/rxjava3/subjects/j;->i:Lio/reactivex/rxjava3/internal/observers/b;

    .line 20
    .line 21
    invoke-interface {p1, v0}, Lio/reactivex/rxjava3/core/p0;->onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lio/reactivex/rxjava3/subjects/j;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-boolean p1, p0, Lio/reactivex/rxjava3/subjects/j;->e:Z

    .line 30
    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    iget-object p1, p0, Lio/reactivex/rxjava3/subjects/j;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_0
    invoke-virtual {p0}, Lio/reactivex/rxjava3/subjects/j;->T8()V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    const-string v1, "Only a single observer allowed."

    .line 47
    .line 48
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-static {v0, p1}, Lio/reactivex/rxjava3/internal/disposables/d;->error(Ljava/lang/Throwable;Lio/reactivex/rxjava3/core/p0;)V

    .line 52
    .line 53
    .line 54
    :goto_0
    return-void
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

.method public onComplete()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/subjects/j;->f:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-boolean v0, p0, Lio/reactivex/rxjava3/subjects/j;->e:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Lio/reactivex/rxjava3/subjects/j;->f:Z

    .line 12
    .line 13
    invoke-virtual {p0}, Lio/reactivex/rxjava3/subjects/j;->S8()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lio/reactivex/rxjava3/subjects/j;->T8()V

    .line 17
    .line 18
    .line 19
    :cond_1
    :goto_0
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    const-string v0, "onError called with a null Throwable."

    .line 2
    .line 3
    invoke-static {p1, v0}, Lio/reactivex/rxjava3/internal/util/k;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lio/reactivex/rxjava3/subjects/j;->f:Z

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    iget-boolean v0, p0, Lio/reactivex/rxjava3/subjects/j;->e:Z

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iput-object p1, p0, Lio/reactivex/rxjava3/subjects/j;->g:Ljava/lang/Throwable;

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    iput-boolean p1, p0, Lio/reactivex/rxjava3/subjects/j;->f:Z

    .line 19
    .line 20
    invoke-virtual {p0}, Lio/reactivex/rxjava3/subjects/j;->S8()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lio/reactivex/rxjava3/subjects/j;->T8()V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    :goto_0
    invoke-static {p1}, Lio/reactivex/rxjava3/plugins/a;->Y(Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    return-void
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
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    const-string v0, "onNext called with a null value."

    .line 2
    .line 3
    invoke-static {p1, v0}, Lio/reactivex/rxjava3/internal/util/k;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lio/reactivex/rxjava3/subjects/j;->f:Z

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    iget-boolean v0, p0, Lio/reactivex/rxjava3/subjects/j;->e:Z

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object v0, p0, Lio/reactivex/rxjava3/subjects/j;->a:Lio/reactivex/rxjava3/internal/queue/c;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lio/reactivex/rxjava3/internal/queue/c;->offer(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lio/reactivex/rxjava3/subjects/j;->T8()V

    .line 21
    .line 22
    .line 23
    :cond_1
    :goto_0
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/subjects/j;->f:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Lio/reactivex/rxjava3/subjects/j;->e:Z

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    :cond_0
    invoke-interface {p1}, Lio/reactivex/rxjava3/disposables/e;->dispose()V

    .line 10
    .line 11
    .line 12
    :cond_1
    return-void
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
