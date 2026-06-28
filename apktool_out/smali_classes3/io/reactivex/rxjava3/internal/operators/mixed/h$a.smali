.class final Lio/reactivex/rxjava3/internal/operators/mixed/h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/core/t;
.implements Lio/reactivex/rxjava3/disposables/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/mixed/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/rxjava3/internal/operators/mixed/h$a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lio/reactivex/rxjava3/core/t<",
        "TT;>;",
        "Lio/reactivex/rxjava3/disposables/e;"
    }
.end annotation


# static fields
.field static final h:Lio/reactivex/rxjava3/internal/operators/mixed/h$a$a;


# instance fields
.field final a:Lio/reactivex/rxjava3/core/f;

.field final b:Lm3/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm3/o<",
            "-TT;+",
            "Lio/reactivex/rxjava3/core/i;",
            ">;"
        }
    .end annotation
.end field

.field final c:Z

.field final d:Lio/reactivex/rxjava3/internal/util/c;

.field final e:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lio/reactivex/rxjava3/internal/operators/mixed/h$a$a;",
            ">;"
        }
    .end annotation
.end field

.field volatile f:Z

.field g:Lorg/reactivestreams/q;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/reactivex/rxjava3/internal/operators/mixed/h$a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/reactivex/rxjava3/internal/operators/mixed/h$a$a;-><init>(Lio/reactivex/rxjava3/internal/operators/mixed/h$a;)V

    sput-object v0, Lio/reactivex/rxjava3/internal/operators/mixed/h$a;->h:Lio/reactivex/rxjava3/internal/operators/mixed/h$a$a;

    return-void
.end method

.method constructor <init>(Lio/reactivex/rxjava3/core/f;Lm3/o;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/f;",
            "Lm3/o<",
            "-TT;+",
            "Lio/reactivex/rxjava3/core/i;",
            ">;Z)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/mixed/h$a;->a:Lio/reactivex/rxjava3/core/f;

    .line 5
    .line 6
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/operators/mixed/h$a;->b:Lm3/o;

    .line 7
    .line 8
    iput-boolean p3, p0, Lio/reactivex/rxjava3/internal/operators/mixed/h$a;->c:Z

    .line 9
    .line 10
    new-instance p1, Lio/reactivex/rxjava3/internal/util/c;

    .line 11
    .line 12
    invoke-direct {p1}, Lio/reactivex/rxjava3/internal/util/c;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/mixed/h$a;->d:Lio/reactivex/rxjava3/internal/util/c;

    .line 16
    .line 17
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 18
    .line 19
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/mixed/h$a;->e:Ljava/util/concurrent/atomic/AtomicReference;

    .line 23
    .line 24
    return-void
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


# virtual methods
.method a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/mixed/h$a;->e:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    sget-object v1, Lio/reactivex/rxjava3/internal/operators/mixed/h$a;->h:Lio/reactivex/rxjava3/internal/operators/mixed/h$a$a;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lio/reactivex/rxjava3/internal/operators/mixed/h$a$a;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    if-eq v0, v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/operators/mixed/h$a$a;->dispose()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method b(Lio/reactivex/rxjava3/internal/operators/mixed/h$a$a;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/mixed/h$a;->e:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, p1, v1}, Landroidx/compose/animation/core/h;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    iget-boolean p1, p0, Lio/reactivex/rxjava3/internal/operators/mixed/h$a;->f:Z

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/mixed/h$a;->d:Lio/reactivex/rxjava3/internal/util/c;

    .line 15
    .line 16
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/mixed/h$a;->a:Lio/reactivex/rxjava3/core/f;

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Lio/reactivex/rxjava3/internal/util/c;->tryTerminateConsumer(Lio/reactivex/rxjava3/core/f;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method c(Lio/reactivex/rxjava3/internal/operators/mixed/h$a$a;Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/mixed/h$a;->e:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, p1, v1}, Landroidx/compose/animation/core/h;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    if-eqz p1, :cond_1

    .line 9
    .line 10
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/mixed/h$a;->d:Lio/reactivex/rxjava3/internal/util/c;

    .line 11
    .line 12
    invoke-virtual {p1, p2}, Lio/reactivex/rxjava3/internal/util/c;->tryAddThrowableOrReport(Ljava/lang/Throwable;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-eqz p1, :cond_2

    .line 17
    .line 18
    iget-boolean p1, p0, Lio/reactivex/rxjava3/internal/operators/mixed/h$a;->c:Z

    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    iget-boolean p1, p0, Lio/reactivex/rxjava3/internal/operators/mixed/h$a;->f:Z

    .line 23
    .line 24
    if-eqz p1, :cond_2

    .line 25
    .line 26
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/mixed/h$a;->d:Lio/reactivex/rxjava3/internal/util/c;

    .line 27
    .line 28
    iget-object p2, p0, Lio/reactivex/rxjava3/internal/operators/mixed/h$a;->a:Lio/reactivex/rxjava3/core/f;

    .line 29
    .line 30
    invoke-virtual {p1, p2}, Lio/reactivex/rxjava3/internal/util/c;->tryTerminateConsumer(Lio/reactivex/rxjava3/core/f;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/mixed/h$a;->g:Lorg/reactivestreams/q;

    .line 35
    .line 36
    invoke-interface {p1}, Lorg/reactivestreams/q;->cancel()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/mixed/h$a;->a()V

    .line 40
    .line 41
    .line 42
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/mixed/h$a;->d:Lio/reactivex/rxjava3/internal/util/c;

    .line 43
    .line 44
    iget-object p2, p0, Lio/reactivex/rxjava3/internal/operators/mixed/h$a;->a:Lio/reactivex/rxjava3/core/f;

    .line 45
    .line 46
    invoke-virtual {p1, p2}, Lio/reactivex/rxjava3/internal/util/c;->tryTerminateConsumer(Lio/reactivex/rxjava3/core/f;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    invoke-static {p2}, Lio/reactivex/rxjava3/plugins/a;->Y(Ljava/lang/Throwable;)V

    .line 51
    .line 52
    .line 53
    :cond_2
    :goto_0
    return-void
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
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
.end method

.method public dispose()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/mixed/h$a;->g:Lorg/reactivestreams/q;

    .line 2
    .line 3
    invoke-interface {v0}, Lorg/reactivestreams/q;->cancel()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/mixed/h$a;->a()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/mixed/h$a;->d:Lio/reactivex/rxjava3/internal/util/c;

    .line 10
    .line 11
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/util/c;->tryTerminateAndReport()V

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
.end method

.method public isDisposed()Z
    .locals 2

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/mixed/h$a;->e:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lio/reactivex/rxjava3/internal/operators/mixed/h$a;->h:Lio/reactivex/rxjava3/internal/operators/mixed/h$a$a;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public onComplete()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/mixed/h$a;->f:Z

    .line 3
    .line 4
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/mixed/h$a;->e:Ljava/util/concurrent/atomic/AtomicReference;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/mixed/h$a;->d:Lio/reactivex/rxjava3/internal/util/c;

    .line 13
    .line 14
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/mixed/h$a;->a:Lio/reactivex/rxjava3/core/f;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lio/reactivex/rxjava3/internal/util/c;->tryTerminateConsumer(Lio/reactivex/rxjava3/core/f;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/mixed/h$a;->d:Lio/reactivex/rxjava3/internal/util/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lio/reactivex/rxjava3/internal/util/c;->tryAddThrowableOrReport(Ljava/lang/Throwable;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_1

    .line 8
    .line 9
    iget-boolean p1, p0, Lio/reactivex/rxjava3/internal/operators/mixed/h$a;->c:Z

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/mixed/h$a;->onComplete()V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/mixed/h$a;->a()V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/mixed/h$a;->d:Lio/reactivex/rxjava3/internal/util/c;

    .line 21
    .line 22
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/mixed/h$a;->a:Lio/reactivex/rxjava3/core/f;

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Lio/reactivex/rxjava3/internal/util/c;->tryTerminateConsumer(Lio/reactivex/rxjava3/core/f;)V

    .line 25
    .line 26
    .line 27
    :cond_1
    :goto_0
    return-void
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/mixed/h$a;->b:Lm3/o;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lm3/o;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const-string v0, "The mapper returned a null CompletableSource"

    .line 8
    .line 9
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    check-cast p1, Lio/reactivex/rxjava3/core/i;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/mixed/h$a$a;

    .line 15
    .line 16
    invoke-direct {v0, p0}, Lio/reactivex/rxjava3/internal/operators/mixed/h$a$a;-><init>(Lio/reactivex/rxjava3/internal/operators/mixed/h$a;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/mixed/h$a;->e:Ljava/util/concurrent/atomic/AtomicReference;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Lio/reactivex/rxjava3/internal/operators/mixed/h$a$a;

    .line 26
    .line 27
    sget-object v2, Lio/reactivex/rxjava3/internal/operators/mixed/h$a;->h:Lio/reactivex/rxjava3/internal/operators/mixed/h$a$a;

    .line 28
    .line 29
    if-ne v1, v2, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    iget-object v2, p0, Lio/reactivex/rxjava3/internal/operators/mixed/h$a;->e:Ljava/util/concurrent/atomic/AtomicReference;

    .line 33
    .line 34
    invoke-static {v2, v1, v0}, Landroidx/compose/animation/core/h;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_0

    .line 39
    .line 40
    if-eqz v1, :cond_2

    .line 41
    .line 42
    invoke-virtual {v1}, Lio/reactivex/rxjava3/internal/operators/mixed/h$a$a;->dispose()V

    .line 43
    .line 44
    .line 45
    :cond_2
    invoke-interface {p1, v0}, Lio/reactivex/rxjava3/core/i;->a(Lio/reactivex/rxjava3/core/f;)V

    .line 46
    .line 47
    .line 48
    :goto_0
    return-void

    .line 49
    :catchall_0
    move-exception p1

    .line 50
    invoke-static {p1}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/mixed/h$a;->g:Lorg/reactivestreams/q;

    .line 54
    .line 55
    invoke-interface {v0}, Lorg/reactivestreams/q;->cancel()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/internal/operators/mixed/h$a;->onError(Ljava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    return-void
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
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/mixed/h$a;->g:Lorg/reactivestreams/q;

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
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/mixed/h$a;->g:Lorg/reactivestreams/q;

    .line 10
    .line 11
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/mixed/h$a;->a:Lio/reactivex/rxjava3/core/f;

    .line 12
    .line 13
    invoke-interface {v0, p0}, Lio/reactivex/rxjava3/core/f;->onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V

    .line 14
    .line 15
    .line 16
    const-wide v0, 0x7fffffffffffffffL

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    invoke-interface {p1, v0, v1}, Lorg/reactivestreams/q;->request(J)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
    .line 25
    .line 26
    .line 27
.end method
