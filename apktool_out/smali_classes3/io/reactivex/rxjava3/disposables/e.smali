.class public interface abstract Lio/reactivex/rxjava3/disposables/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static f(Ljava/util/concurrent/Future;Z)Lio/reactivex/rxjava3/disposables/e;
    .locals 1
    .param p0    # Ljava/util/concurrent/Future;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Future<",
            "*>;Z)",
            "Lio/reactivex/rxjava3/disposables/e;"
        }
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .line 1
    const-string v0, "future is null"

    .line 2
    .line 3
    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    new-instance v0, Lio/reactivex/rxjava3/disposables/g;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Lio/reactivex/rxjava3/disposables/g;-><init>(Ljava/util/concurrent/Future;Z)V

    .line 9
    .line 10
    .line 11
    return-object v0
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

.method public static h()Lio/reactivex/rxjava3/disposables/e;
    .locals 1
    .annotation build Ll3/f;
    .end annotation

    sget-object v0, Lio/reactivex/rxjava3/internal/disposables/d;->INSTANCE:Lio/reactivex/rxjava3/internal/disposables/d;

    return-object v0
.end method

.method public static i(Ljava/util/concurrent/Future;)Lio/reactivex/rxjava3/disposables/e;
    .locals 1
    .param p0    # Ljava/util/concurrent/Future;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Future<",
            "*>;)",
            "Lio/reactivex/rxjava3/disposables/e;"
        }
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .line 1
    const-string v0, "future is null"

    .line 2
    .line 3
    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    invoke-static {p0, v0}, Lio/reactivex/rxjava3/disposables/e;->f(Ljava/util/concurrent/Future;Z)Lio/reactivex/rxjava3/disposables/e;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
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

.method public static j()Lio/reactivex/rxjava3/disposables/e;
    .locals 1
    .annotation build Ll3/f;
    .end annotation

    sget-object v0, Lio/reactivex/rxjava3/internal/functions/a;->b:Ljava/lang/Runnable;

    invoke-static {v0}, Lio/reactivex/rxjava3/disposables/e;->m(Ljava/lang/Runnable;)Lio/reactivex/rxjava3/disposables/e;

    move-result-object v0

    return-object v0
.end method

.method public static k(Lorg/reactivestreams/q;)Lio/reactivex/rxjava3/disposables/e;
    .locals 1
    .param p0    # Lorg/reactivestreams/q;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation build Ll3/f;
    .end annotation

    .line 1
    const-string v0, "subscription is null"

    .line 2
    .line 3
    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    new-instance v0, Lio/reactivex/rxjava3/disposables/k;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lio/reactivex/rxjava3/disposables/k;-><init>(Lorg/reactivestreams/q;)V

    .line 9
    .line 10
    .line 11
    return-object v0
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

.method public static l(Lio/reactivex/rxjava3/disposables/e;)Ljava/lang/AutoCloseable;
    .locals 1
    .param p0    # Lio/reactivex/rxjava3/disposables/e;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation build Ll3/f;
    .end annotation

    .line 1
    const-string v0, "disposable is null"

    .line 2
    .line 3
    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    new-instance v0, Lio/reactivex/rxjava3/disposables/d;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lio/reactivex/rxjava3/disposables/d;-><init>(Lio/reactivex/rxjava3/disposables/e;)V

    .line 9
    .line 10
    .line 11
    return-object v0
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

.method public static m(Ljava/lang/Runnable;)Lio/reactivex/rxjava3/disposables/e;
    .locals 1
    .param p0    # Ljava/lang/Runnable;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation build Ll3/f;
    .end annotation

    .line 1
    const-string v0, "run is null"

    .line 2
    .line 3
    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    new-instance v0, Lio/reactivex/rxjava3/disposables/i;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lio/reactivex/rxjava3/disposables/i;-><init>(Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    return-object v0
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

.method public static n(Ljava/lang/AutoCloseable;)Lio/reactivex/rxjava3/disposables/e;
    .locals 1
    .param p0    # Ljava/lang/AutoCloseable;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation build Ll3/f;
    .end annotation

    .line 1
    const-string v0, "autoCloseable is null"

    .line 2
    .line 3
    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    new-instance v0, Lio/reactivex/rxjava3/disposables/b;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lio/reactivex/rxjava3/disposables/b;-><init>(Ljava/lang/AutoCloseable;)V

    .line 9
    .line 10
    .line 11
    return-object v0
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

.method public static p(Lm3/a;)Lio/reactivex/rxjava3/disposables/e;
    .locals 1
    .param p0    # Lm3/a;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation build Ll3/f;
    .end annotation

    .line 1
    const-string v0, "action is null"

    .line 2
    .line 3
    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    new-instance v0, Lio/reactivex/rxjava3/disposables/a;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lio/reactivex/rxjava3/disposables/a;-><init>(Lm3/a;)V

    .line 9
    .line 10
    .line 11
    return-object v0
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
.method public abstract dispose()V
.end method

.method public abstract isDisposed()Z
.end method
