.class final Lio/reactivex/rxjava3/internal/operators/parallel/m$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/core/t;
.implements Lorg/reactivestreams/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/parallel/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lio/reactivex/rxjava3/core/t<",
        "TT;>;",
        "Lorg/reactivestreams/q;"
    }
.end annotation


# instance fields
.field final a:Lorg/reactivestreams/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/reactivestreams/p<",
            "-TT;>;"
        }
    .end annotation
.end field

.field final b:Lio/reactivex/rxjava3/internal/operators/parallel/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/internal/operators/parallel/m<",
            "TT;>;"
        }
    .end annotation
.end field

.field c:Lorg/reactivestreams/q;

.field d:Z


# direct methods
.method constructor <init>(Lorg/reactivestreams/p;Lio/reactivex/rxjava3/internal/operators/parallel/m;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/reactivestreams/p<",
            "-TT;>;",
            "Lio/reactivex/rxjava3/internal/operators/parallel/m<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/parallel/m$a;->a:Lorg/reactivestreams/p;

    .line 5
    .line 6
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/operators/parallel/m$a;->b:Lio/reactivex/rxjava3/internal/operators/parallel/m;

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
.method public cancel()V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/parallel/m$a;->b:Lio/reactivex/rxjava3/internal/operators/parallel/m;

    .line 2
    .line 3
    iget-object v0, v0, Lio/reactivex/rxjava3/internal/operators/parallel/m;->i:Lm3/a;

    .line 4
    .line 5
    invoke-interface {v0}, Lm3/a;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :catchall_0
    move-exception v0

    .line 10
    invoke-static {v0}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lio/reactivex/rxjava3/plugins/a;->Y(Ljava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    :goto_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/parallel/m$a;->c:Lorg/reactivestreams/q;

    .line 17
    .line 18
    invoke-interface {v0}, Lorg/reactivestreams/q;->cancel()V

    .line 19
    .line 20
    .line 21
    return-void
    .line 22
    .line 23
.end method

.method public onComplete()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/parallel/m$a;->d:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/parallel/m$a;->d:Z

    .line 7
    .line 8
    :try_start_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/parallel/m$a;->b:Lio/reactivex/rxjava3/internal/operators/parallel/m;

    .line 9
    .line 10
    iget-object v0, v0, Lio/reactivex/rxjava3/internal/operators/parallel/m;->e:Lm3/a;

    .line 11
    .line 12
    invoke-interface {v0}, Lm3/a;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/parallel/m$a;->a:Lorg/reactivestreams/p;

    .line 16
    .line 17
    invoke-interface {v0}, Lorg/reactivestreams/p;->onComplete()V

    .line 18
    .line 19
    .line 20
    :try_start_1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/parallel/m$a;->b:Lio/reactivex/rxjava3/internal/operators/parallel/m;

    .line 21
    .line 22
    iget-object v0, v0, Lio/reactivex/rxjava3/internal/operators/parallel/m;->f:Lm3/a;

    .line 23
    .line 24
    invoke-interface {v0}, Lm3/a;->run()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception v0

    .line 29
    invoke-static {v0}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    invoke-static {v0}, Lio/reactivex/rxjava3/plugins/a;->Y(Ljava/lang/Throwable;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catchall_1
    move-exception v0

    .line 37
    invoke-static {v0}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/parallel/m$a;->a:Lorg/reactivestreams/p;

    .line 41
    .line 42
    invoke-interface {v1, v0}, Lorg/reactivestreams/p;->onError(Ljava/lang/Throwable;)V

    .line 43
    .line 44
    .line 45
    :cond_0
    :goto_0
    return-void
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

.method public onError(Ljava/lang/Throwable;)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/parallel/m$a;->d:Z

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
    const/4 v0, 0x1

    .line 10
    iput-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/parallel/m$a;->d:Z

    .line 11
    .line 12
    :try_start_0
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/parallel/m$a;->b:Lio/reactivex/rxjava3/internal/operators/parallel/m;

    .line 13
    .line 14
    iget-object v1, v1, Lio/reactivex/rxjava3/internal/operators/parallel/m;->d:Lm3/g;

    .line 15
    .line 16
    invoke-interface {v1, p1}, Lm3/g;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception v1

    .line 21
    invoke-static {v1}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 22
    .line 23
    .line 24
    new-instance v2, Lio/reactivex/rxjava3/exceptions/a;

    .line 25
    .line 26
    const/4 v3, 0x2

    .line 27
    new-array v3, v3, [Ljava/lang/Throwable;

    .line 28
    .line 29
    const/4 v4, 0x0

    .line 30
    aput-object p1, v3, v4

    .line 31
    .line 32
    aput-object v1, v3, v0

    .line 33
    .line 34
    invoke-direct {v2, v3}, Lio/reactivex/rxjava3/exceptions/a;-><init>([Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    move-object p1, v2

    .line 38
    :goto_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/parallel/m$a;->a:Lorg/reactivestreams/p;

    .line 39
    .line 40
    invoke-interface {v0, p1}, Lorg/reactivestreams/p;->onError(Ljava/lang/Throwable;)V

    .line 41
    .line 42
    .line 43
    :try_start_1
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/parallel/m$a;->b:Lio/reactivex/rxjava3/internal/operators/parallel/m;

    .line 44
    .line 45
    iget-object p1, p1, Lio/reactivex/rxjava3/internal/operators/parallel/m;->f:Lm3/a;

    .line 46
    .line 47
    invoke-interface {p1}, Lm3/a;->run()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :catchall_1
    move-exception p1

    .line 52
    invoke-static {p1}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 53
    .line 54
    .line 55
    invoke-static {p1}, Lio/reactivex/rxjava3/plugins/a;->Y(Ljava/lang/Throwable;)V

    .line 56
    .line 57
    .line 58
    :goto_1
    return-void
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
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/parallel/m$a;->d:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    :try_start_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/parallel/m$a;->b:Lio/reactivex/rxjava3/internal/operators/parallel/m;

    .line 6
    .line 7
    iget-object v0, v0, Lio/reactivex/rxjava3/internal/operators/parallel/m;->b:Lm3/g;

    .line 8
    .line 9
    invoke-interface {v0, p1}, Lm3/g;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/parallel/m$a;->a:Lorg/reactivestreams/p;

    .line 13
    .line 14
    invoke-interface {v0, p1}, Lorg/reactivestreams/p;->onNext(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    :try_start_1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/parallel/m$a;->b:Lio/reactivex/rxjava3/internal/operators/parallel/m;

    .line 18
    .line 19
    iget-object v0, v0, Lio/reactivex/rxjava3/internal/operators/parallel/m;->c:Lm3/g;

    .line 20
    .line 21
    invoke-interface {v0, p1}, Lm3/g;->accept(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception p1

    .line 26
    invoke-static {p1}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/internal/operators/parallel/m$a;->onError(Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catchall_1
    move-exception p1

    .line 34
    invoke-static {p1}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/internal/operators/parallel/m$a;->onError(Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    :goto_0
    return-void
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

.method public onSubscribe(Lorg/reactivestreams/q;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/parallel/m$a;->c:Lorg/reactivestreams/q;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lio/reactivex/rxjava3/internal/subscriptions/j;->validate(Lorg/reactivestreams/q;Lorg/reactivestreams/q;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/parallel/m$a;->c:Lorg/reactivestreams/q;

    .line 10
    .line 11
    :try_start_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/parallel/m$a;->b:Lio/reactivex/rxjava3/internal/operators/parallel/m;

    .line 12
    .line 13
    iget-object v0, v0, Lio/reactivex/rxjava3/internal/operators/parallel/m;->g:Lm3/g;

    .line 14
    .line 15
    invoke-interface {v0, p1}, Lm3/g;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/parallel/m$a;->a:Lorg/reactivestreams/p;

    .line 19
    .line 20
    invoke-interface {p1, p0}, Lorg/reactivestreams/p;->onSubscribe(Lorg/reactivestreams/q;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    invoke-static {v0}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    invoke-interface {p1}, Lorg/reactivestreams/q;->cancel()V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/parallel/m$a;->a:Lorg/reactivestreams/p;

    .line 32
    .line 33
    sget-object v1, Lio/reactivex/rxjava3/internal/subscriptions/g;->INSTANCE:Lio/reactivex/rxjava3/internal/subscriptions/g;

    .line 34
    .line 35
    invoke-interface {p1, v1}, Lorg/reactivestreams/p;->onSubscribe(Lorg/reactivestreams/q;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v0}, Lio/reactivex/rxjava3/internal/operators/parallel/m$a;->onError(Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    :cond_0
    :goto_0
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
.end method

.method public request(J)V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/parallel/m$a;->b:Lio/reactivex/rxjava3/internal/operators/parallel/m;

    .line 2
    .line 3
    iget-object v0, v0, Lio/reactivex/rxjava3/internal/operators/parallel/m;->h:Lm3/q;

    .line 4
    .line 5
    invoke-interface {v0, p1, p2}, Lm3/q;->a(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :catchall_0
    move-exception v0

    .line 10
    invoke-static {v0}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lio/reactivex/rxjava3/plugins/a;->Y(Ljava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    :goto_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/parallel/m$a;->c:Lorg/reactivestreams/q;

    .line 17
    .line 18
    invoke-interface {v0, p1, p2}, Lorg/reactivestreams/q;->request(J)V

    .line 19
    .line 20
    .line 21
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method
