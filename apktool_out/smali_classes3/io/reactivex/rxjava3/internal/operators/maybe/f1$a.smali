.class final Lio/reactivex/rxjava3/internal/operators/maybe/f1$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/core/a0;
.implements Lio/reactivex/rxjava3/disposables/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/maybe/f1;
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
        "Lio/reactivex/rxjava3/core/a0<",
        "TT;>;",
        "Lio/reactivex/rxjava3/disposables/e;"
    }
.end annotation


# instance fields
.field final a:Lio/reactivex/rxjava3/core/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/core/a0<",
            "-TT;>;"
        }
    .end annotation
.end field

.field final b:Lio/reactivex/rxjava3/internal/operators/maybe/f1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/internal/operators/maybe/f1<",
            "TT;>;"
        }
    .end annotation
.end field

.field c:Lio/reactivex/rxjava3/disposables/e;


# direct methods
.method constructor <init>(Lio/reactivex/rxjava3/core/a0;Lio/reactivex/rxjava3/internal/operators/maybe/f1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/a0<",
            "-TT;>;",
            "Lio/reactivex/rxjava3/internal/operators/maybe/f1<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/maybe/f1$a;->a:Lio/reactivex/rxjava3/core/a0;

    .line 5
    .line 6
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/operators/maybe/f1$a;->b:Lio/reactivex/rxjava3/internal/operators/maybe/f1;

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
.method a()V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/f1$a;->b:Lio/reactivex/rxjava3/internal/operators/maybe/f1;

    .line 2
    .line 3
    iget-object v0, v0, Lio/reactivex/rxjava3/internal/operators/maybe/f1;->f:Lm3/a;

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
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method b(Ljava/lang/Throwable;)V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/f1$a;->b:Lio/reactivex/rxjava3/internal/operators/maybe/f1;

    .line 2
    .line 3
    iget-object v0, v0, Lio/reactivex/rxjava3/internal/operators/maybe/f1;->d:Lm3/g;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lm3/g;->accept(Ljava/lang/Object;)V
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
    new-instance v1, Lio/reactivex/rxjava3/exceptions/a;

    .line 14
    .line 15
    const/4 v2, 0x2

    .line 16
    new-array v2, v2, [Ljava/lang/Throwable;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    aput-object p1, v2, v3

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    aput-object v0, v2, p1

    .line 23
    .line 24
    invoke-direct {v1, v2}, Lio/reactivex/rxjava3/exceptions/a;-><init>([Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    move-object p1, v1

    .line 28
    :goto_0
    sget-object v0, Lio/reactivex/rxjava3/internal/disposables/c;->DISPOSED:Lio/reactivex/rxjava3/internal/disposables/c;

    .line 29
    .line 30
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/f1$a;->c:Lio/reactivex/rxjava3/disposables/e;

    .line 31
    .line 32
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/f1$a;->a:Lio/reactivex/rxjava3/core/a0;

    .line 33
    .line 34
    invoke-interface {v0, p1}, Lio/reactivex/rxjava3/core/a0;->onError(Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/maybe/f1$a;->a()V

    .line 38
    .line 39
    .line 40
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

.method public dispose()V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/f1$a;->b:Lio/reactivex/rxjava3/internal/operators/maybe/f1;

    .line 2
    .line 3
    iget-object v0, v0, Lio/reactivex/rxjava3/internal/operators/maybe/f1;->g:Lm3/a;

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
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/f1$a;->c:Lio/reactivex/rxjava3/disposables/e;

    .line 17
    .line 18
    invoke-interface {v0}, Lio/reactivex/rxjava3/disposables/e;->dispose()V

    .line 19
    .line 20
    .line 21
    sget-object v0, Lio/reactivex/rxjava3/internal/disposables/c;->DISPOSED:Lio/reactivex/rxjava3/internal/disposables/c;

    .line 22
    .line 23
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/f1$a;->c:Lio/reactivex/rxjava3/disposables/e;

    .line 24
    .line 25
    return-void
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

.method public isDisposed()Z
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/f1$a;->c:Lio/reactivex/rxjava3/disposables/e;

    invoke-interface {v0}, Lio/reactivex/rxjava3/disposables/e;->isDisposed()Z

    move-result v0

    return v0
.end method

.method public onComplete()V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/f1$a;->c:Lio/reactivex/rxjava3/disposables/e;

    .line 2
    .line 3
    sget-object v1, Lio/reactivex/rxjava3/internal/disposables/c;->DISPOSED:Lio/reactivex/rxjava3/internal/disposables/c;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/f1$a;->b:Lio/reactivex/rxjava3/internal/operators/maybe/f1;

    .line 9
    .line 10
    iget-object v0, v0, Lio/reactivex/rxjava3/internal/operators/maybe/f1;->e:Lm3/a;

    .line 11
    .line 12
    invoke-interface {v0}, Lm3/a;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    .line 15
    iput-object v1, p0, Lio/reactivex/rxjava3/internal/operators/maybe/f1$a;->c:Lio/reactivex/rxjava3/disposables/e;

    .line 16
    .line 17
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/f1$a;->a:Lio/reactivex/rxjava3/core/a0;

    .line 18
    .line 19
    invoke-interface {v0}, Lio/reactivex/rxjava3/core/a0;->onComplete()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/maybe/f1$a;->a()V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :catchall_0
    move-exception v0

    .line 27
    invoke-static {v0}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v0}, Lio/reactivex/rxjava3/internal/operators/maybe/f1$a;->b(Ljava/lang/Throwable;)V

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
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/f1$a;->c:Lio/reactivex/rxjava3/disposables/e;

    .line 2
    .line 3
    sget-object v1, Lio/reactivex/rxjava3/internal/disposables/c;->DISPOSED:Lio/reactivex/rxjava3/internal/disposables/c;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {p1}, Lio/reactivex/rxjava3/plugins/a;->Y(Ljava/lang/Throwable;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/internal/operators/maybe/f1$a;->b(Ljava/lang/Throwable;)V

    .line 12
    .line 13
    .line 14
    return-void
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

.method public onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/f1$a;->c:Lio/reactivex/rxjava3/disposables/e;

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
    :try_start_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/f1$a;->b:Lio/reactivex/rxjava3/internal/operators/maybe/f1;

    .line 10
    .line 11
    iget-object v0, v0, Lio/reactivex/rxjava3/internal/operators/maybe/f1;->b:Lm3/g;

    .line 12
    .line 13
    invoke-interface {v0, p1}, Lm3/g;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/maybe/f1$a;->c:Lio/reactivex/rxjava3/disposables/e;

    .line 17
    .line 18
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/maybe/f1$a;->a:Lio/reactivex/rxjava3/core/a0;

    .line 19
    .line 20
    invoke-interface {p1, p0}, Lio/reactivex/rxjava3/core/a0;->onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V

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
    invoke-interface {p1}, Lio/reactivex/rxjava3/disposables/e;->dispose()V

    .line 29
    .line 30
    .line 31
    sget-object p1, Lio/reactivex/rxjava3/internal/disposables/c;->DISPOSED:Lio/reactivex/rxjava3/internal/disposables/c;

    .line 32
    .line 33
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/maybe/f1$a;->c:Lio/reactivex/rxjava3/disposables/e;

    .line 34
    .line 35
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/maybe/f1$a;->a:Lio/reactivex/rxjava3/core/a0;

    .line 36
    .line 37
    invoke-static {v0, p1}, Lio/reactivex/rxjava3/internal/disposables/d;->error(Ljava/lang/Throwable;Lio/reactivex/rxjava3/core/a0;)V

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

.method public onSuccess(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/f1$a;->c:Lio/reactivex/rxjava3/disposables/e;

    .line 2
    .line 3
    sget-object v1, Lio/reactivex/rxjava3/internal/disposables/c;->DISPOSED:Lio/reactivex/rxjava3/internal/disposables/c;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/f1$a;->b:Lio/reactivex/rxjava3/internal/operators/maybe/f1;

    .line 9
    .line 10
    iget-object v0, v0, Lio/reactivex/rxjava3/internal/operators/maybe/f1;->c:Lm3/g;

    .line 11
    .line 12
    invoke-interface {v0, p1}, Lm3/g;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    .line 15
    iput-object v1, p0, Lio/reactivex/rxjava3/internal/operators/maybe/f1$a;->c:Lio/reactivex/rxjava3/disposables/e;

    .line 16
    .line 17
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/f1$a;->a:Lio/reactivex/rxjava3/core/a0;

    .line 18
    .line 19
    invoke-interface {v0, p1}, Lio/reactivex/rxjava3/core/a0;->onSuccess(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/maybe/f1$a;->a()V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    invoke-static {p1}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/internal/operators/maybe/f1$a;->b(Ljava/lang/Throwable;)V

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
