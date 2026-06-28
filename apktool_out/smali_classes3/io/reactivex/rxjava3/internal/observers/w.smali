.class public abstract Lio/reactivex/rxjava3/internal/observers/w;
.super Lio/reactivex/rxjava3/internal/observers/y;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/core/p0;
.implements Lio/reactivex/rxjava3/internal/util/r;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "U:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/rxjava3/internal/observers/y;",
        "Lio/reactivex/rxjava3/core/p0<",
        "TT;>;",
        "Lio/reactivex/rxjava3/internal/util/r<",
        "TU;TV;>;"
    }
.end annotation


# instance fields
.field protected final F:Lio/reactivex/rxjava3/core/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/core/p0<",
            "-TV;>;"
        }
    .end annotation
.end field

.field protected final G:Lio/reactivex/rxjava3/internal/fuseable/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/internal/fuseable/p<",
            "TU;>;"
        }
    .end annotation
.end field

.field protected volatile H:Z

.field protected volatile I:Z

.field protected J:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>(Lio/reactivex/rxjava3/core/p0;Lio/reactivex/rxjava3/internal/fuseable/p;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/p0<",
            "-TV;>;",
            "Lio/reactivex/rxjava3/internal/fuseable/p<",
            "TU;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lio/reactivex/rxjava3/internal/observers/y;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/observers/w;->F:Lio/reactivex/rxjava3/core/p0;

    .line 5
    .line 6
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/observers/w;->G:Lio/reactivex/rxjava3/internal/fuseable/p;

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
.method public final a(I)I
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/observers/z;->p:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result p1

    return p1
.end method

.method public final b()Z
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/observers/z;->p:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/observers/w;->I:Z

    return v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/observers/w;->H:Z

    return v0
.end method

.method public final e()Ljava/lang/Throwable;
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/observers/w;->J:Ljava/lang/Throwable;

    return-object v0
.end method

.method public g(Lio/reactivex/rxjava3/core/p0;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/p0<",
            "-TV;>;TU;)V"
        }
    .end annotation

    return-void
.end method

.method protected final o(Ljava/lang/Object;ZLio/reactivex/rxjava3/disposables/e;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TU;Z",
            "Lio/reactivex/rxjava3/disposables/e;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/observers/w;->F:Lio/reactivex/rxjava3/core/p0;

    .line 2
    .line 3
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/observers/w;->G:Lio/reactivex/rxjava3/internal/fuseable/p;

    .line 4
    .line 5
    iget-object v2, p0, Lio/reactivex/rxjava3/internal/observers/z;->p:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    iget-object v2, p0, Lio/reactivex/rxjava3/internal/observers/z;->p:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    const/4 v4, 0x1

    .line 17
    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0, v0, p1}, Lio/reactivex/rxjava3/internal/observers/w;->g(Lio/reactivex/rxjava3/core/p0;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    const/4 p1, -0x1

    .line 27
    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/internal/observers/w;->a(I)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-nez p1, :cond_1

    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    invoke-interface {v1, p1}, Lio/reactivex/rxjava3/internal/fuseable/q;->offer(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/observers/w;->b()Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-nez p1, :cond_1

    .line 42
    .line 43
    return-void

    .line 44
    :cond_1
    invoke-static {v1, v0, p2, p3, p0}, Lio/reactivex/rxjava3/internal/util/v;->d(Lio/reactivex/rxjava3/internal/fuseable/p;Lio/reactivex/rxjava3/core/p0;ZLio/reactivex/rxjava3/disposables/e;Lio/reactivex/rxjava3/internal/util/r;)V

    .line 45
    .line 46
    .line 47
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
.end method

.method protected final q(Ljava/lang/Object;ZLio/reactivex/rxjava3/disposables/e;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TU;Z",
            "Lio/reactivex/rxjava3/disposables/e;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/observers/w;->F:Lio/reactivex/rxjava3/core/p0;

    .line 2
    .line 3
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/observers/w;->G:Lio/reactivex/rxjava3/internal/fuseable/p;

    .line 4
    .line 5
    iget-object v2, p0, Lio/reactivex/rxjava3/internal/observers/z;->p:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-nez v2, :cond_1

    .line 12
    .line 13
    iget-object v2, p0, Lio/reactivex/rxjava3/internal/observers/z;->p:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    const/4 v4, 0x1

    .line 17
    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    invoke-interface {v1}, Lio/reactivex/rxjava3/internal/fuseable/q;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    invoke-virtual {p0, v0, p1}, Lio/reactivex/rxjava3/internal/observers/w;->g(Lio/reactivex/rxjava3/core/p0;Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    const/4 p1, -0x1

    .line 33
    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/internal/observers/w;->a(I)I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-nez p1, :cond_2

    .line 38
    .line 39
    return-void

    .line 40
    :cond_0
    invoke-interface {v1, p1}, Lio/reactivex/rxjava3/internal/fuseable/q;->offer(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    invoke-interface {v1, p1}, Lio/reactivex/rxjava3/internal/fuseable/q;->offer(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/observers/w;->b()Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-nez p1, :cond_2

    .line 52
    .line 53
    return-void

    .line 54
    :cond_2
    :goto_0
    invoke-static {v1, v0, p2, p3, p0}, Lio/reactivex/rxjava3/internal/util/v;->d(Lio/reactivex/rxjava3/internal/fuseable/p;Lio/reactivex/rxjava3/core/p0;ZLio/reactivex/rxjava3/disposables/e;Lio/reactivex/rxjava3/internal/util/r;)V

    .line 55
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
