.class final Lio/reactivex/rxjava3/internal/operators/single/e1$b;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/disposables/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/single/e1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/concurrent/atomic/AtomicInteger;",
        "Lio/reactivex/rxjava3/disposables/e;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x4d1e29153b0426a9L


# instance fields
.field final downstream:Lio/reactivex/rxjava3/core/u0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/core/u0<",
            "-TR;>;"
        }
    .end annotation
.end field

.field final observers:[Lio/reactivex/rxjava3/internal/operators/single/e1$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lio/reactivex/rxjava3/internal/operators/single/e1$c<",
            "TT;>;"
        }
    .end annotation
.end field

.field final values:[Ljava/lang/Object;

.field final zipper:Lm3/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm3/o<",
            "-[",
            "Ljava/lang/Object;",
            "+TR;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lio/reactivex/rxjava3/core/u0;ILm3/o;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/u0<",
            "-TR;>;I",
            "Lm3/o<",
            "-[",
            "Ljava/lang/Object;",
            "+TR;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/single/e1$b;->downstream:Lio/reactivex/rxjava3/core/u0;

    .line 5
    .line 6
    iput-object p3, p0, Lio/reactivex/rxjava3/internal/operators/single/e1$b;->zipper:Lm3/o;

    .line 7
    .line 8
    new-array p1, p2, [Lio/reactivex/rxjava3/internal/operators/single/e1$c;

    .line 9
    .line 10
    const/4 p3, 0x0

    .line 11
    :goto_0
    if-ge p3, p2, :cond_0

    .line 12
    .line 13
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/single/e1$c;

    .line 14
    .line 15
    invoke-direct {v0, p0, p3}, Lio/reactivex/rxjava3/internal/operators/single/e1$c;-><init>(Lio/reactivex/rxjava3/internal/operators/single/e1$b;I)V

    .line 16
    .line 17
    .line 18
    aput-object v0, p1, p3

    .line 19
    .line 20
    add-int/lit8 p3, p3, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/single/e1$b;->observers:[Lio/reactivex/rxjava3/internal/operators/single/e1$c;

    .line 24
    .line 25
    new-array p1, p2, [Ljava/lang/Object;

    .line 26
    .line 27
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/single/e1$b;->values:[Ljava/lang/Object;

    .line 28
    .line 29
    return-void
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
.method public dispose()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndSet(I)I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-lez v1, :cond_0

    .line 7
    .line 8
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/single/e1$b;->observers:[Lio/reactivex/rxjava3/internal/operators/single/e1$c;

    .line 9
    .line 10
    array-length v2, v1

    .line 11
    :goto_0
    if-ge v0, v2, :cond_0

    .line 12
    .line 13
    aget-object v3, v1, v0

    .line 14
    .line 15
    invoke-virtual {v3}, Lio/reactivex/rxjava3/internal/operators/single/e1$c;->dispose()V

    .line 16
    .line 17
    .line 18
    add-int/lit8 v0, v0, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    return-void
    .line 22
    .line 23
.end method

.method disposeExcept(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/single/e1$b;->observers:[Lio/reactivex/rxjava3/internal/operators/single/e1$c;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, p1, :cond_0

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    invoke-virtual {v3}, Lio/reactivex/rxjava3/internal/operators/single/e1$c;->dispose()V

    .line 10
    .line 11
    .line 12
    add-int/lit8 v2, v2, 0x1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    :goto_1
    add-int/lit8 p1, p1, 0x1

    .line 16
    .line 17
    if-ge p1, v1, :cond_1

    .line 18
    .line 19
    aget-object v2, v0, p1

    .line 20
    .line 21
    invoke-virtual {v2}, Lio/reactivex/rxjava3/internal/operators/single/e1$c;->dispose()V

    .line 22
    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    return-void
    .line 26
    .line 27
.end method

.method innerError(Ljava/lang/Throwable;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndSet(I)I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-lez v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, p2}, Lio/reactivex/rxjava3/internal/operators/single/e1$b;->disposeExcept(I)V

    .line 9
    .line 10
    .line 11
    iget-object p2, p0, Lio/reactivex/rxjava3/internal/operators/single/e1$b;->downstream:Lio/reactivex/rxjava3/core/u0;

    .line 12
    .line 13
    invoke-interface {p2, p1}, Lio/reactivex/rxjava3/core/u0;->onError(Ljava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-static {p1}, Lio/reactivex/rxjava3/plugins/a;->Y(Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    :goto_0
    return-void
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

.method innerSuccess(Ljava/lang/Object;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;I)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/single/e1$b;->values:[Ljava/lang/Object;

    .line 2
    .line 3
    aput-object p1, v0, p2

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    :try_start_0
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/single/e1$b;->zipper:Lm3/o;

    .line 12
    .line 13
    iget-object p2, p0, Lio/reactivex/rxjava3/internal/operators/single/e1$b;->values:[Ljava/lang/Object;

    .line 14
    .line 15
    invoke-interface {p1, p2}, Lm3/o;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const-string p2, "The zipper returned a null value"

    .line 20
    .line 21
    invoke-static {p1, p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    iget-object p2, p0, Lio/reactivex/rxjava3/internal/operators/single/e1$b;->downstream:Lio/reactivex/rxjava3/core/u0;

    .line 25
    .line 26
    invoke-interface {p2, p1}, Lio/reactivex/rxjava3/core/u0;->onSuccess(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    invoke-static {p1}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    iget-object p2, p0, Lio/reactivex/rxjava3/internal/operators/single/e1$b;->downstream:Lio/reactivex/rxjava3/core/u0;

    .line 35
    .line 36
    invoke-interface {p2, p1}, Lio/reactivex/rxjava3/core/u0;->onError(Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    :goto_0
    return-void
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

.method public isDisposed()Z
    .locals 1

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
