.class final Lio/reactivex/rxjava3/internal/operators/mixed/w;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 5
    .line 6
    const-string v1, "No instances!"

    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    throw v0
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

.method static a(Ljava/lang/Object;Lm3/o;Lio/reactivex/rxjava3/core/f;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "Lm3/o<",
            "-TT;+",
            "Lio/reactivex/rxjava3/core/i;",
            ">;",
            "Lio/reactivex/rxjava3/core/f;",
            ")Z"
        }
    .end annotation

    .line 1
    instance-of v0, p0, Lm3/s;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    check-cast p0, Lm3/s;

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    :try_start_0
    invoke-interface {p0}, Lm3/s;->get()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    invoke-interface {p1, p0}, Lm3/o;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const-string p1, "The mapper returned a null CompletableSource"

    .line 19
    .line 20
    invoke-static {p0, p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    check-cast p0, Lio/reactivex/rxjava3/core/i;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p0, 0x0

    .line 27
    :goto_0
    if-nez p0, :cond_1

    .line 28
    .line 29
    invoke-static {p2}, Lio/reactivex/rxjava3/internal/disposables/d;->complete(Lio/reactivex/rxjava3/core/f;)V

    .line 30
    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    invoke-interface {p0, p2}, Lio/reactivex/rxjava3/core/i;->a(Lio/reactivex/rxjava3/core/f;)V

    .line 34
    .line 35
    .line 36
    :goto_1
    return v0

    .line 37
    :catchall_0
    move-exception p0

    .line 38
    invoke-static {p0}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    invoke-static {p0, p2}, Lio/reactivex/rxjava3/internal/disposables/d;->error(Ljava/lang/Throwable;Lio/reactivex/rxjava3/core/f;)V

    .line 42
    .line 43
    .line 44
    return v0

    .line 45
    :cond_2
    const/4 p0, 0x0

    .line 46
    return p0
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

.method static b(Ljava/lang/Object;Lm3/o;Lio/reactivex/rxjava3/core/p0;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "Lm3/o<",
            "-TT;+",
            "Lio/reactivex/rxjava3/core/d0<",
            "+TR;>;>;",
            "Lio/reactivex/rxjava3/core/p0<",
            "-TR;>;)Z"
        }
    .end annotation

    .line 1
    instance-of v0, p0, Lm3/s;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    check-cast p0, Lm3/s;

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    :try_start_0
    invoke-interface {p0}, Lm3/s;->get()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    invoke-interface {p1, p0}, Lm3/o;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const-string p1, "The mapper returned a null MaybeSource"

    .line 19
    .line 20
    invoke-static {p0, p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    check-cast p0, Lio/reactivex/rxjava3/core/d0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p0, 0x0

    .line 27
    :goto_0
    if-nez p0, :cond_1

    .line 28
    .line 29
    invoke-static {p2}, Lio/reactivex/rxjava3/internal/disposables/d;->complete(Lio/reactivex/rxjava3/core/p0;)V

    .line 30
    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    invoke-static {p2}, Lio/reactivex/rxjava3/internal/operators/maybe/q1;->I8(Lio/reactivex/rxjava3/core/p0;)Lio/reactivex/rxjava3/core/a0;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-interface {p0, p1}, Lio/reactivex/rxjava3/core/d0;->a(Lio/reactivex/rxjava3/core/a0;)V

    .line 38
    .line 39
    .line 40
    :goto_1
    return v0

    .line 41
    :catchall_0
    move-exception p0

    .line 42
    invoke-static {p0}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 43
    .line 44
    .line 45
    invoke-static {p0, p2}, Lio/reactivex/rxjava3/internal/disposables/d;->error(Ljava/lang/Throwable;Lio/reactivex/rxjava3/core/p0;)V

    .line 46
    .line 47
    .line 48
    return v0

    .line 49
    :cond_2
    const/4 p0, 0x0

    .line 50
    return p0
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

.method static c(Ljava/lang/Object;Lm3/o;Lio/reactivex/rxjava3/core/p0;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "Lm3/o<",
            "-TT;+",
            "Lio/reactivex/rxjava3/core/x0<",
            "+TR;>;>;",
            "Lio/reactivex/rxjava3/core/p0<",
            "-TR;>;)Z"
        }
    .end annotation

    .line 1
    instance-of v0, p0, Lm3/s;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    check-cast p0, Lm3/s;

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    :try_start_0
    invoke-interface {p0}, Lm3/s;->get()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    invoke-interface {p1, p0}, Lm3/o;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const-string p1, "The mapper returned a null SingleSource"

    .line 19
    .line 20
    invoke-static {p0, p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    check-cast p0, Lio/reactivex/rxjava3/core/x0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p0, 0x0

    .line 27
    :goto_0
    if-nez p0, :cond_1

    .line 28
    .line 29
    invoke-static {p2}, Lio/reactivex/rxjava3/internal/disposables/d;->complete(Lio/reactivex/rxjava3/core/p0;)V

    .line 30
    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    invoke-static {p2}, Lio/reactivex/rxjava3/internal/operators/single/b1;->I8(Lio/reactivex/rxjava3/core/p0;)Lio/reactivex/rxjava3/core/u0;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-interface {p0, p1}, Lio/reactivex/rxjava3/core/x0;->a(Lio/reactivex/rxjava3/core/u0;)V

    .line 38
    .line 39
    .line 40
    :goto_1
    return v0

    .line 41
    :catchall_0
    move-exception p0

    .line 42
    invoke-static {p0}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 43
    .line 44
    .line 45
    invoke-static {p0, p2}, Lio/reactivex/rxjava3/internal/disposables/d;->error(Ljava/lang/Throwable;Lio/reactivex/rxjava3/core/p0;)V

    .line 46
    .line 47
    .line 48
    return v0

    .line 49
    :cond_2
    const/4 p0, 0x0

    .line 50
    return p0
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
