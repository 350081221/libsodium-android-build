.class final Lio/reactivex/rxjava3/internal/schedulers/g$b;
.super Lio/reactivex/rxjava3/core/q0$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/schedulers/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field private final a:Lio/reactivex/rxjava3/disposables/c;

.field private final b:Lio/reactivex/rxjava3/internal/schedulers/g$a;

.field private final c:Lio/reactivex/rxjava3/internal/schedulers/g$c;

.field final d:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method constructor <init>(Lio/reactivex/rxjava3/internal/schedulers/g$a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lio/reactivex/rxjava3/core/q0$c;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/schedulers/g$b;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 10
    .line 11
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/schedulers/g$b;->b:Lio/reactivex/rxjava3/internal/schedulers/g$a;

    .line 12
    .line 13
    new-instance v0, Lio/reactivex/rxjava3/disposables/c;

    .line 14
    .line 15
    invoke-direct {v0}, Lio/reactivex/rxjava3/disposables/c;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/schedulers/g$b;->a:Lio/reactivex/rxjava3/disposables/c;

    .line 19
    .line 20
    invoke-virtual {p1}, Lio/reactivex/rxjava3/internal/schedulers/g$a;->b()Lio/reactivex/rxjava3/internal/schedulers/g$c;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/schedulers/g$b;->c:Lio/reactivex/rxjava3/internal/schedulers/g$c;

    .line 25
    .line 26
    return-void
    .line 27
.end method


# virtual methods
.method public c(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lio/reactivex/rxjava3/disposables/e;
    .locals 6
    .param p1    # Ljava/lang/Runnable;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .param p4    # Ljava/util/concurrent/TimeUnit;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation build Ll3/f;
    .end annotation

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/schedulers/g$b;->a:Lio/reactivex/rxjava3/disposables/c;

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
    sget-object p1, Lio/reactivex/rxjava3/internal/disposables/d;->INSTANCE:Lio/reactivex/rxjava3/internal/disposables/d;

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/schedulers/g$b;->c:Lio/reactivex/rxjava3/internal/schedulers/g$c;

    .line 13
    .line 14
    iget-object v5, p0, Lio/reactivex/rxjava3/internal/schedulers/g$b;->a:Lio/reactivex/rxjava3/disposables/c;

    .line 15
    .line 16
    move-object v1, p1

    .line 17
    move-wide v2, p2

    .line 18
    move-object v4, p4

    .line 19
    invoke-virtual/range {v0 .. v5}, Lio/reactivex/rxjava3/internal/schedulers/i;->e(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;Lio/reactivex/rxjava3/disposables/f;)Lio/reactivex/rxjava3/internal/schedulers/n;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1
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

.method public dispose()V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/schedulers/g$b;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/schedulers/g$b;->a:Lio/reactivex/rxjava3/disposables/c;

    .line 12
    .line 13
    invoke-virtual {v0}, Lio/reactivex/rxjava3/disposables/c;->dispose()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/schedulers/g$b;->b:Lio/reactivex/rxjava3/internal/schedulers/g$a;

    .line 17
    .line 18
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/schedulers/g$b;->c:Lio/reactivex/rxjava3/internal/schedulers/g$c;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lio/reactivex/rxjava3/internal/schedulers/g$a;->d(Lio/reactivex/rxjava3/internal/schedulers/g$c;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public isDisposed()Z
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/schedulers/g$b;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method
