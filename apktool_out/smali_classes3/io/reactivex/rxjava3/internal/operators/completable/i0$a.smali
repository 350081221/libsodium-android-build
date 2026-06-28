.class final Lio/reactivex/rxjava3/internal/operators/completable/i0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/core/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/completable/i0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation


# instance fields
.field private final a:Lio/reactivex/rxjava3/core/f;

.field final synthetic b:Lio/reactivex/rxjava3/internal/operators/completable/i0;


# direct methods
.method constructor <init>(Lio/reactivex/rxjava3/internal/operators/completable/i0;Lio/reactivex/rxjava3/core/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/completable/i0$a;->b:Lio/reactivex/rxjava3/internal/operators/completable/i0;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/operators/completable/i0$a;->a:Lio/reactivex/rxjava3/core/f;

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
.method public onComplete()V
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/completable/i0$a;->a:Lio/reactivex/rxjava3/core/f;

    invoke-interface {v0}, Lio/reactivex/rxjava3/core/f;->onComplete()V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 5

    .line 1
    :try_start_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/completable/i0$a;->b:Lio/reactivex/rxjava3/internal/operators/completable/i0;

    .line 2
    .line 3
    iget-object v0, v0, Lio/reactivex/rxjava3/internal/operators/completable/i0;->b:Lm3/r;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lm3/r;->test(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/completable/i0$a;->a:Lio/reactivex/rxjava3/core/f;

    .line 12
    .line 13
    invoke-interface {p1}, Lio/reactivex/rxjava3/core/f;->onComplete()V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/completable/i0$a;->a:Lio/reactivex/rxjava3/core/f;

    .line 18
    .line 19
    invoke-interface {v0, p1}, Lio/reactivex/rxjava3/core/f;->onError(Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    :goto_0
    return-void

    .line 23
    :catchall_0
    move-exception v0

    .line 24
    invoke-static {v0}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/completable/i0$a;->a:Lio/reactivex/rxjava3/core/f;

    .line 28
    .line 29
    new-instance v2, Lio/reactivex/rxjava3/exceptions/a;

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    new-array v3, v3, [Ljava/lang/Throwable;

    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    aput-object p1, v3, v4

    .line 36
    .line 37
    const/4 p1, 0x1

    .line 38
    aput-object v0, v3, p1

    .line 39
    .line 40
    invoke-direct {v2, v3}, Lio/reactivex/rxjava3/exceptions/a;-><init>([Ljava/lang/Throwable;)V

    .line 41
    .line 42
    .line 43
    invoke-interface {v1, v2}, Lio/reactivex/rxjava3/core/f;->onError(Ljava/lang/Throwable;)V

    .line 44
    .line 45
    .line 46
    return-void
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

.method public onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/completable/i0$a;->a:Lio/reactivex/rxjava3/core/f;

    invoke-interface {v0, p1}, Lio/reactivex/rxjava3/core/f;->onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V

    return-void
.end method
