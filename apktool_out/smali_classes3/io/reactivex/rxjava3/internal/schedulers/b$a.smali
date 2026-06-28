.class final Lio/reactivex/rxjava3/internal/schedulers/b$a;
.super Lio/reactivex/rxjava3/core/q0$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/schedulers/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field private final a:Lio/reactivex/rxjava3/internal/disposables/e;

.field private final b:Lio/reactivex/rxjava3/disposables/c;

.field private final c:Lio/reactivex/rxjava3/internal/disposables/e;

.field private final d:Lio/reactivex/rxjava3/internal/schedulers/b$c;

.field volatile e:Z


# direct methods
.method constructor <init>(Lio/reactivex/rxjava3/internal/schedulers/b$c;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lio/reactivex/rxjava3/core/q0$c;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/schedulers/b$a;->d:Lio/reactivex/rxjava3/internal/schedulers/b$c;

    .line 5
    .line 6
    new-instance p1, Lio/reactivex/rxjava3/internal/disposables/e;

    .line 7
    .line 8
    invoke-direct {p1}, Lio/reactivex/rxjava3/internal/disposables/e;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/schedulers/b$a;->a:Lio/reactivex/rxjava3/internal/disposables/e;

    .line 12
    .line 13
    new-instance v0, Lio/reactivex/rxjava3/disposables/c;

    .line 14
    .line 15
    invoke-direct {v0}, Lio/reactivex/rxjava3/disposables/c;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/schedulers/b$a;->b:Lio/reactivex/rxjava3/disposables/c;

    .line 19
    .line 20
    new-instance v1, Lio/reactivex/rxjava3/internal/disposables/e;

    .line 21
    .line 22
    invoke-direct {v1}, Lio/reactivex/rxjava3/internal/disposables/e;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v1, p0, Lio/reactivex/rxjava3/internal/schedulers/b$a;->c:Lio/reactivex/rxjava3/internal/disposables/e;

    .line 26
    .line 27
    invoke-virtual {v1, p1}, Lio/reactivex/rxjava3/internal/disposables/e;->b(Lio/reactivex/rxjava3/disposables/e;)Z

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, v0}, Lio/reactivex/rxjava3/internal/disposables/e;->b(Lio/reactivex/rxjava3/disposables/e;)Z

    .line 31
    .line 32
    .line 33
    return-void
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


# virtual methods
.method public b(Ljava/lang/Runnable;)Lio/reactivex/rxjava3/disposables/e;
    .locals 6
    .param p1    # Ljava/lang/Runnable;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation build Ll3/f;
    .end annotation

    .line 1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/schedulers/b$a;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object p1, Lio/reactivex/rxjava3/internal/disposables/d;->INSTANCE:Lio/reactivex/rxjava3/internal/disposables/d;

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/schedulers/b$a;->d:Lio/reactivex/rxjava3/internal/schedulers/b$c;

    .line 9
    .line 10
    const-wide/16 v2, 0x0

    .line 11
    .line 12
    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 13
    .line 14
    iget-object v5, p0, Lio/reactivex/rxjava3/internal/schedulers/b$a;->a:Lio/reactivex/rxjava3/internal/disposables/e;

    .line 15
    .line 16
    move-object v1, p1

    .line 17
    invoke-virtual/range {v0 .. v5}, Lio/reactivex/rxjava3/internal/schedulers/i;->e(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;Lio/reactivex/rxjava3/disposables/f;)Lio/reactivex/rxjava3/internal/schedulers/n;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

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
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/schedulers/b$a;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object p1, Lio/reactivex/rxjava3/internal/disposables/d;->INSTANCE:Lio/reactivex/rxjava3/internal/disposables/d;

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/schedulers/b$a;->d:Lio/reactivex/rxjava3/internal/schedulers/b$c;

    .line 9
    .line 10
    iget-object v5, p0, Lio/reactivex/rxjava3/internal/schedulers/b$a;->b:Lio/reactivex/rxjava3/disposables/c;

    .line 11
    .line 12
    move-object v1, p1

    .line 13
    move-wide v2, p2

    .line 14
    move-object v4, p4

    .line 15
    invoke-virtual/range {v0 .. v5}, Lio/reactivex/rxjava3/internal/schedulers/i;->e(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;Lio/reactivex/rxjava3/disposables/f;)Lio/reactivex/rxjava3/internal/schedulers/n;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1
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

.method public dispose()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/schedulers/b$a;->e:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lio/reactivex/rxjava3/internal/schedulers/b$a;->e:Z

    .line 7
    .line 8
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/schedulers/b$a;->c:Lio/reactivex/rxjava3/internal/disposables/e;

    .line 9
    .line 10
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/disposables/e;->dispose()V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
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

    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/schedulers/b$a;->e:Z

    return v0
.end method
