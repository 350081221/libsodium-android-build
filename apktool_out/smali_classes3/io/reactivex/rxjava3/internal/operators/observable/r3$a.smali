.class final Lio/reactivex/rxjava3/internal/operators/observable/r3$a;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/core/p0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/observable/r3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/concurrent/atomic/AtomicReference<",
        "Lio/reactivex/rxjava3/disposables/e;",
        ">;",
        "Lio/reactivex/rxjava3/core/p0<",
        "TR;>;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x3540c639803a63b9L


# instance fields
.field final bufferSize:I

.field volatile done:Z

.field final index:J

.field final parent:Lio/reactivex/rxjava3/internal/operators/observable/r3$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/internal/operators/observable/r3$b<",
            "TT;TR;>;"
        }
    .end annotation
.end field

.field volatile queue:Lio/reactivex/rxjava3/internal/fuseable/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/internal/fuseable/q<",
            "TR;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lio/reactivex/rxjava3/internal/operators/observable/r3$b;JI)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/internal/operators/observable/r3$b<",
            "TT;TR;>;JI)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/r3$a;->parent:Lio/reactivex/rxjava3/internal/operators/observable/r3$b;

    .line 5
    .line 6
    iput-wide p2, p0, Lio/reactivex/rxjava3/internal/operators/observable/r3$a;->index:J

    .line 7
    .line 8
    iput p4, p0, Lio/reactivex/rxjava3/internal/operators/observable/r3$a;->bufferSize:I

    .line 9
    .line 10
    return-void
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
.method public cancel()V
    .locals 0

    invoke-static {p0}, Lio/reactivex/rxjava3/internal/disposables/c;->dispose(Ljava/util/concurrent/atomic/AtomicReference;)Z

    return-void
.end method

.method public onComplete()V
    .locals 4

    .line 1
    iget-wide v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/r3$a;->index:J

    .line 2
    .line 3
    iget-object v2, p0, Lio/reactivex/rxjava3/internal/operators/observable/r3$a;->parent:Lio/reactivex/rxjava3/internal/operators/observable/r3$b;

    .line 4
    .line 5
    iget-wide v2, v2, Lio/reactivex/rxjava3/internal/operators/observable/r3$b;->unique:J

    .line 6
    .line 7
    cmp-long v0, v0, v2

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/r3$a;->done:Z

    .line 13
    .line 14
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/r3$a;->parent:Lio/reactivex/rxjava3/internal/operators/observable/r3$b;

    .line 15
    .line 16
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/operators/observable/r3$b;->drain()V

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

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/r3$a;->parent:Lio/reactivex/rxjava3/internal/operators/observable/r3$b;

    invoke-virtual {v0, p0, p1}, Lio/reactivex/rxjava3/internal/operators/observable/r3$b;->innerError(Lio/reactivex/rxjava3/internal/operators/observable/r3$a;Ljava/lang/Throwable;)V

    return-void
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TR;)V"
        }
    .end annotation

    .line 1
    iget-wide v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/r3$a;->index:J

    .line 2
    .line 3
    iget-object v2, p0, Lio/reactivex/rxjava3/internal/operators/observable/r3$a;->parent:Lio/reactivex/rxjava3/internal/operators/observable/r3$b;

    .line 4
    .line 5
    iget-wide v2, v2, Lio/reactivex/rxjava3/internal/operators/observable/r3$b;->unique:J

    .line 6
    .line 7
    cmp-long v0, v0, v2

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/r3$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/q;

    .line 14
    .line 15
    invoke-interface {v0, p1}, Lio/reactivex/rxjava3/internal/fuseable/q;->offer(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/r3$a;->parent:Lio/reactivex/rxjava3/internal/operators/observable/r3$b;

    .line 19
    .line 20
    invoke-virtual {p1}, Lio/reactivex/rxjava3/internal/operators/observable/r3$b;->drain()V

    .line 21
    .line 22
    .line 23
    :cond_1
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V
    .locals 2

    .line 1
    invoke-static {p0, p1}, Lio/reactivex/rxjava3/internal/disposables/c;->setOnce(Ljava/util/concurrent/atomic/AtomicReference;Lio/reactivex/rxjava3/disposables/e;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    instance-of v0, p1, Lio/reactivex/rxjava3/internal/fuseable/l;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    check-cast p1, Lio/reactivex/rxjava3/internal/fuseable/l;

    .line 12
    .line 13
    const/4 v0, 0x7

    .line 14
    invoke-interface {p1, v0}, Lio/reactivex/rxjava3/internal/fuseable/m;->requestFusion(I)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x1

    .line 19
    if-ne v0, v1, :cond_0

    .line 20
    .line 21
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/r3$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/q;

    .line 22
    .line 23
    iput-boolean v1, p0, Lio/reactivex/rxjava3/internal/operators/observable/r3$a;->done:Z

    .line 24
    .line 25
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/r3$a;->parent:Lio/reactivex/rxjava3/internal/operators/observable/r3$b;

    .line 26
    .line 27
    invoke-virtual {p1}, Lio/reactivex/rxjava3/internal/operators/observable/r3$b;->drain()V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    const/4 v1, 0x2

    .line 32
    if-ne v0, v1, :cond_1

    .line 33
    .line 34
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/r3$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/q;

    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    new-instance p1, Lio/reactivex/rxjava3/internal/queue/c;

    .line 38
    .line 39
    iget v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/r3$a;->bufferSize:I

    .line 40
    .line 41
    invoke-direct {p1, v0}, Lio/reactivex/rxjava3/internal/queue/c;-><init>(I)V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/r3$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/q;

    .line 45
    .line 46
    :cond_2
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
