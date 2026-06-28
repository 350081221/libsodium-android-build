.class final Lio/reactivex/rxjava3/internal/operators/observable/j4$a;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/core/p0;
.implements Lio/reactivex/rxjava3/disposables/e;
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/observable/j4;
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
        "Ljava/util/concurrent/atomic/AtomicInteger;",
        "Lio/reactivex/rxjava3/core/p0<",
        "TT;>;",
        "Lio/reactivex/rxjava3/disposables/e;",
        "Ljava/lang/Runnable;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x67d4a190b6f57310L


# instance fields
.field volatile cancelled:Z

.field final capacityHint:I

.field final count:J

.field final downstream:Lio/reactivex/rxjava3/core/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/core/p0<",
            "-",
            "Lio/reactivex/rxjava3/core/i0<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field size:J

.field upstream:Lio/reactivex/rxjava3/disposables/e;

.field window:Lio/reactivex/rxjava3/subjects/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/subjects/j<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lio/reactivex/rxjava3/core/p0;JI)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/p0<",
            "-",
            "Lio/reactivex/rxjava3/core/i0<",
            "TT;>;>;JI)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/j4$a;->downstream:Lio/reactivex/rxjava3/core/p0;

    .line 5
    .line 6
    iput-wide p2, p0, Lio/reactivex/rxjava3/internal/operators/observable/j4$a;->count:J

    .line 7
    .line 8
    iput p4, p0, Lio/reactivex/rxjava3/internal/operators/observable/j4$a;->capacityHint:I

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
.method public dispose()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/j4$a;->cancelled:Z

    return-void
.end method

.method public isDisposed()Z
    .locals 1

    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/j4$a;->cancelled:Z

    return v0
.end method

.method public onComplete()V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/j4$a;->window:Lio/reactivex/rxjava3/subjects/j;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    iput-object v1, p0, Lio/reactivex/rxjava3/internal/operators/observable/j4$a;->window:Lio/reactivex/rxjava3/subjects/j;

    .line 7
    .line 8
    invoke-virtual {v0}, Lio/reactivex/rxjava3/subjects/j;->onComplete()V

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/j4$a;->downstream:Lio/reactivex/rxjava3/core/p0;

    .line 12
    .line 13
    invoke-interface {v0}, Lio/reactivex/rxjava3/core/p0;->onComplete()V

    .line 14
    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/j4$a;->window:Lio/reactivex/rxjava3/subjects/j;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    iput-object v1, p0, Lio/reactivex/rxjava3/internal/operators/observable/j4$a;->window:Lio/reactivex/rxjava3/subjects/j;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lio/reactivex/rxjava3/subjects/j;->onError(Ljava/lang/Throwable;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/j4$a;->downstream:Lio/reactivex/rxjava3/core/p0;

    .line 12
    .line 13
    invoke-interface {v0, p1}, Lio/reactivex/rxjava3/core/p0;->onError(Ljava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    return-void
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

.method public onNext(Ljava/lang/Object;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/j4$a;->window:Lio/reactivex/rxjava3/subjects/j;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iget-boolean v2, p0, Lio/reactivex/rxjava3/internal/operators/observable/j4$a;->cancelled:Z

    .line 7
    .line 8
    if-nez v2, :cond_0

    .line 9
    .line 10
    iget v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/j4$a;->capacityHint:I

    .line 11
    .line 12
    invoke-static {v0, p0}, Lio/reactivex/rxjava3/subjects/j;->P8(ILjava/lang/Runnable;)Lio/reactivex/rxjava3/subjects/j;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/j4$a;->window:Lio/reactivex/rxjava3/subjects/j;

    .line 17
    .line 18
    new-instance v2, Lio/reactivex/rxjava3/internal/operators/observable/m4;

    .line 19
    .line 20
    invoke-direct {v2, v0}, Lio/reactivex/rxjava3/internal/operators/observable/m4;-><init>(Lio/reactivex/rxjava3/subjects/i;)V

    .line 21
    .line 22
    .line 23
    iget-object v3, p0, Lio/reactivex/rxjava3/internal/operators/observable/j4$a;->downstream:Lio/reactivex/rxjava3/core/p0;

    .line 24
    .line 25
    invoke-interface {v3, v2}, Lio/reactivex/rxjava3/core/p0;->onNext(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move-object v2, v1

    .line 30
    :goto_0
    if-eqz v0, :cond_2

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Lio/reactivex/rxjava3/subjects/j;->onNext(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-wide v3, p0, Lio/reactivex/rxjava3/internal/operators/observable/j4$a;->size:J

    .line 36
    .line 37
    const-wide/16 v5, 0x1

    .line 38
    .line 39
    add-long/2addr v3, v5

    .line 40
    iput-wide v3, p0, Lio/reactivex/rxjava3/internal/operators/observable/j4$a;->size:J

    .line 41
    .line 42
    iget-wide v5, p0, Lio/reactivex/rxjava3/internal/operators/observable/j4$a;->count:J

    .line 43
    .line 44
    cmp-long p1, v3, v5

    .line 45
    .line 46
    if-ltz p1, :cond_1

    .line 47
    .line 48
    const-wide/16 v3, 0x0

    .line 49
    .line 50
    iput-wide v3, p0, Lio/reactivex/rxjava3/internal/operators/observable/j4$a;->size:J

    .line 51
    .line 52
    iput-object v1, p0, Lio/reactivex/rxjava3/internal/operators/observable/j4$a;->window:Lio/reactivex/rxjava3/subjects/j;

    .line 53
    .line 54
    invoke-virtual {v0}, Lio/reactivex/rxjava3/subjects/j;->onComplete()V

    .line 55
    .line 56
    .line 57
    iget-boolean p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/j4$a;->cancelled:Z

    .line 58
    .line 59
    if-eqz p1, :cond_1

    .line 60
    .line 61
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/j4$a;->upstream:Lio/reactivex/rxjava3/disposables/e;

    .line 62
    .line 63
    invoke-interface {p1}, Lio/reactivex/rxjava3/disposables/e;->dispose()V

    .line 64
    .line 65
    .line 66
    :cond_1
    if-eqz v2, :cond_2

    .line 67
    .line 68
    invoke-virtual {v2}, Lio/reactivex/rxjava3/internal/operators/observable/m4;->I8()Z

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    if-eqz p1, :cond_2

    .line 73
    .line 74
    invoke-virtual {v0}, Lio/reactivex/rxjava3/subjects/j;->onComplete()V

    .line 75
    .line 76
    .line 77
    iput-object v1, p0, Lio/reactivex/rxjava3/internal/operators/observable/j4$a;->window:Lio/reactivex/rxjava3/subjects/j;

    .line 78
    .line 79
    :cond_2
    return-void
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
.end method

.method public onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/j4$a;->upstream:Lio/reactivex/rxjava3/disposables/e;

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
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/j4$a;->upstream:Lio/reactivex/rxjava3/disposables/e;

    .line 10
    .line 11
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/j4$a;->downstream:Lio/reactivex/rxjava3/core/p0;

    .line 12
    .line 13
    invoke-interface {p1, p0}, Lio/reactivex/rxjava3/core/p0;->onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
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

.method public run()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/j4$a;->cancelled:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/j4$a;->upstream:Lio/reactivex/rxjava3/disposables/e;

    .line 6
    .line 7
    invoke-interface {v0}, Lio/reactivex/rxjava3/disposables/e;->dispose()V

    .line 8
    .line 9
    .line 10
    :cond_0
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
.end method
