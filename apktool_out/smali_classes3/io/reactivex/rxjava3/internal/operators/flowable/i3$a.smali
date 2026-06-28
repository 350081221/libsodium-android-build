.class abstract Lio/reactivex/rxjava3/internal/operators/flowable/i3$a;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/internal/operators/flowable/i3$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/flowable/i3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/concurrent/atomic/AtomicReference<",
        "Lio/reactivex/rxjava3/internal/operators/flowable/i3$e;",
        ">;",
        "Lio/reactivex/rxjava3/internal/operators/flowable/i3$f<",
        "TT;>;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x2090aef8efde5e9eL


# instance fields
.field final eagerTruncate:Z

.field index:J

.field size:I

.field tail:Lio/reactivex/rxjava3/internal/operators/flowable/i3$e;


# direct methods
.method constructor <init>(Z)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$a;->eagerTruncate:Z

    .line 5
    .line 6
    new-instance p1, Lio/reactivex/rxjava3/internal/operators/flowable/i3$e;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    const-wide/16 v1, 0x0

    .line 10
    .line 11
    invoke-direct {p1, v0, v1, v2}, Lio/reactivex/rxjava3/internal/operators/flowable/i3$e;-><init>(Ljava/lang/Object;J)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$a;->tail:Lio/reactivex/rxjava3/internal/operators/flowable/i3$e;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void
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
.method final addLast(Lio/reactivex/rxjava3/internal/operators/flowable/i3$e;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$a;->tail:Lio/reactivex/rxjava3/internal/operators/flowable/i3$e;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$a;->tail:Lio/reactivex/rxjava3/internal/operators/flowable/i3$e;

    .line 7
    .line 8
    iget p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$a;->size:I

    .line 9
    .line 10
    add-int/lit8 p1, p1, 0x1

    .line 11
    .line 12
    iput p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$a;->size:I

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

.method final collect(Ljava/util/Collection;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "-TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/flowable/i3$a;->getHead()Lio/reactivex/rxjava3/internal/operators/flowable/i3$e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :goto_0
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$e;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v1, v0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$e;->value:Ljava/lang/Object;

    .line 14
    .line 15
    invoke-virtual {p0, v1}, Lio/reactivex/rxjava3/internal/operators/flowable/i3$a;->leaveTransform(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-static {v1}, Lio/reactivex/rxjava3/internal/util/q;->isComplete(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-nez v2, :cond_1

    .line 24
    .line 25
    invoke-static {v1}, Lio/reactivex/rxjava3/internal/util/q;->isError(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_0
    invoke-static {v1}, Lio/reactivex/rxjava3/internal/util/q;->getValue(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-interface {p1, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    :goto_1
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

.method public final complete()V
    .locals 6

    .line 1
    invoke-static {}, Lio/reactivex/rxjava3/internal/util/q;->complete()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {p0, v0, v1}, Lio/reactivex/rxjava3/internal/operators/flowable/i3$a;->enterTransform(Ljava/lang/Object;Z)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, Lio/reactivex/rxjava3/internal/operators/flowable/i3$e;

    .line 11
    .line 12
    iget-wide v2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$a;->index:J

    .line 13
    .line 14
    const-wide/16 v4, 0x1

    .line 15
    .line 16
    add-long/2addr v2, v4

    .line 17
    iput-wide v2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$a;->index:J

    .line 18
    .line 19
    invoke-direct {v1, v0, v2, v3}, Lio/reactivex/rxjava3/internal/operators/flowable/i3$e;-><init>(Ljava/lang/Object;J)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v1}, Lio/reactivex/rxjava3/internal/operators/flowable/i3$a;->addLast(Lio/reactivex/rxjava3/internal/operators/flowable/i3$e;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/flowable/i3$a;->truncateFinal()V

    .line 26
    .line 27
    .line 28
    return-void
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

.method enterTransform(Ljava/lang/Object;Z)Ljava/lang/Object;
    .locals 0

    return-object p1
.end method

.method public final error(Ljava/lang/Throwable;)V
    .locals 5

    .line 1
    invoke-static {p1}, Lio/reactivex/rxjava3/internal/util/q;->error(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x1

    .line 6
    invoke-virtual {p0, p1, v0}, Lio/reactivex/rxjava3/internal/operators/flowable/i3$a;->enterTransform(Ljava/lang/Object;Z)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$e;

    .line 11
    .line 12
    iget-wide v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$a;->index:J

    .line 13
    .line 14
    const-wide/16 v3, 0x1

    .line 15
    .line 16
    add-long/2addr v1, v3

    .line 17
    iput-wide v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$a;->index:J

    .line 18
    .line 19
    invoke-direct {v0, p1, v1, v2}, Lio/reactivex/rxjava3/internal/operators/flowable/i3$e;-><init>(Ljava/lang/Object;J)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v0}, Lio/reactivex/rxjava3/internal/operators/flowable/i3$a;->addLast(Lio/reactivex/rxjava3/internal/operators/flowable/i3$e;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/flowable/i3$a;->truncateFinal()V

    .line 26
    .line 27
    .line 28
    return-void
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
.end method

.method getHead()Lio/reactivex/rxjava3/internal/operators/flowable/i3$e;
    .locals 1

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$e;

    return-object v0
.end method

.method hasCompleted()Z
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$a;->tail:Lio/reactivex/rxjava3/internal/operators/flowable/i3$e;

    iget-object v0, v0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$e;->value:Ljava/lang/Object;

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lio/reactivex/rxjava3/internal/operators/flowable/i3$a;->leaveTransform(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lio/reactivex/rxjava3/internal/util/q;->isComplete(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method hasError()Z
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$a;->tail:Lio/reactivex/rxjava3/internal/operators/flowable/i3$e;

    iget-object v0, v0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$e;->value:Ljava/lang/Object;

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lio/reactivex/rxjava3/internal/operators/flowable/i3$a;->leaveTransform(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lio/reactivex/rxjava3/internal/util/q;->isError(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method leaveTransform(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    return-object p1
.end method

.method public final next(Ljava/lang/Object;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lio/reactivex/rxjava3/internal/util/q;->next(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, p1, v0}, Lio/reactivex/rxjava3/internal/operators/flowable/i3$a;->enterTransform(Ljava/lang/Object;Z)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$e;

    .line 11
    .line 12
    iget-wide v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$a;->index:J

    .line 13
    .line 14
    const-wide/16 v3, 0x1

    .line 15
    .line 16
    add-long/2addr v1, v3

    .line 17
    iput-wide v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$a;->index:J

    .line 18
    .line 19
    invoke-direct {v0, p1, v1, v2}, Lio/reactivex/rxjava3/internal/operators/flowable/i3$e;-><init>(Ljava/lang/Object;J)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v0}, Lio/reactivex/rxjava3/internal/operators/flowable/i3$a;->addLast(Lio/reactivex/rxjava3/internal/operators/flowable/i3$e;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/flowable/i3$a;->truncate()V

    .line 26
    .line 27
    .line 28
    return-void
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
.end method

.method final removeFirst()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$e;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$e;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$a;->size:I

    .line 16
    .line 17
    add-int/lit8 v1, v1, -0x1

    .line 18
    .line 19
    iput v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$a;->size:I

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lio/reactivex/rxjava3/internal/operators/flowable/i3$a;->setFirst(Lio/reactivex/rxjava3/internal/operators/flowable/i3$e;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string v1, "Empty list!"

    .line 28
    .line 29
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw v0
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

.method final removeSome(I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$e;

    .line 6
    .line 7
    :goto_0
    if-lez p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$e;

    .line 14
    .line 15
    add-int/lit8 p1, p1, -0x1

    .line 16
    .line 17
    iget v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$a;->size:I

    .line 18
    .line 19
    add-int/lit8 v1, v1, -0x1

    .line 20
    .line 21
    iput v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$a;->size:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {p0, v0}, Lio/reactivex/rxjava3/internal/operators/flowable/i3$a;->setFirst(Lio/reactivex/rxjava3/internal/operators/flowable/i3$e;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, Lio/reactivex/rxjava3/internal/operators/flowable/i3$e;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$a;->tail:Lio/reactivex/rxjava3/internal/operators/flowable/i3$e;

    .line 40
    .line 41
    :cond_1
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

.method public final replay(Lio/reactivex/rxjava3/internal/operators/flowable/i3$c;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/internal/operators/flowable/i3$c<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    monitor-enter p1

    .line 2
    :try_start_0
    iget-boolean v0, p1, Lio/reactivex/rxjava3/internal/operators/flowable/i3$c;->emitting:Z

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput-boolean v1, p1, Lio/reactivex/rxjava3/internal/operators/flowable/i3$c;->missed:Z

    .line 8
    .line 9
    monitor-exit p1

    .line 10
    return-void

    .line 11
    :cond_0
    iput-boolean v1, p1, Lio/reactivex/rxjava3/internal/operators/flowable/i3$c;->emitting:Z

    .line 12
    .line 13
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 14
    :goto_0
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 15
    .line 16
    .line 17
    move-result-wide v2

    .line 18
    const-wide v4, 0x7fffffffffffffffL

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    cmp-long v0, v2, v4

    .line 24
    .line 25
    const/4 v4, 0x0

    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    move v0, v1

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move v0, v4

    .line 31
    :goto_1
    invoke-virtual {p1}, Lio/reactivex/rxjava3/internal/operators/flowable/i3$c;->index()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    check-cast v5, Lio/reactivex/rxjava3/internal/operators/flowable/i3$e;

    .line 36
    .line 37
    const-wide/16 v6, 0x0

    .line 38
    .line 39
    if-nez v5, :cond_2

    .line 40
    .line 41
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/flowable/i3$a;->getHead()Lio/reactivex/rxjava3/internal/operators/flowable/i3$e;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    iput-object v5, p1, Lio/reactivex/rxjava3/internal/operators/flowable/i3$c;->index:Ljava/lang/Object;

    .line 46
    .line 47
    iget-object v8, p1, Lio/reactivex/rxjava3/internal/operators/flowable/i3$c;->totalRequested:Ljava/util/concurrent/atomic/AtomicLong;

    .line 48
    .line 49
    iget-wide v9, v5, Lio/reactivex/rxjava3/internal/operators/flowable/i3$e;->index:J

    .line 50
    .line 51
    invoke-static {v8, v9, v10}, Lio/reactivex/rxjava3/internal/util/d;->a(Ljava/util/concurrent/atomic/AtomicLong;J)J

    .line 52
    .line 53
    .line 54
    :cond_2
    move-wide v8, v6

    .line 55
    :goto_2
    cmp-long v10, v2, v6

    .line 56
    .line 57
    const/4 v11, 0x0

    .line 58
    if-eqz v10, :cond_6

    .line 59
    .line 60
    invoke-virtual {p1}, Lio/reactivex/rxjava3/internal/operators/flowable/i3$c;->isDisposed()Z

    .line 61
    .line 62
    .line 63
    move-result v12

    .line 64
    if-eqz v12, :cond_3

    .line 65
    .line 66
    iput-object v11, p1, Lio/reactivex/rxjava3/internal/operators/flowable/i3$c;->index:Ljava/lang/Object;

    .line 67
    .line 68
    return-void

    .line 69
    :cond_3
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v12

    .line 73
    check-cast v12, Lio/reactivex/rxjava3/internal/operators/flowable/i3$e;

    .line 74
    .line 75
    if-eqz v12, :cond_6

    .line 76
    .line 77
    iget-object v5, v12, Lio/reactivex/rxjava3/internal/operators/flowable/i3$e;->value:Ljava/lang/Object;

    .line 78
    .line 79
    invoke-virtual {p0, v5}, Lio/reactivex/rxjava3/internal/operators/flowable/i3$a;->leaveTransform(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    :try_start_1
    iget-object v10, p1, Lio/reactivex/rxjava3/internal/operators/flowable/i3$c;->child:Lorg/reactivestreams/p;

    .line 84
    .line 85
    invoke-static {v5, v10}, Lio/reactivex/rxjava3/internal/util/q;->accept(Ljava/lang/Object;Lorg/reactivestreams/p;)Z

    .line 86
    .line 87
    .line 88
    move-result v10

    .line 89
    if-eqz v10, :cond_4

    .line 90
    .line 91
    iput-object v11, p1, Lio/reactivex/rxjava3/internal/operators/flowable/i3$c;->index:Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 92
    .line 93
    return-void

    .line 94
    :cond_4
    const-wide/16 v10, 0x1

    .line 95
    .line 96
    add-long/2addr v8, v10

    .line 97
    sub-long/2addr v2, v10

    .line 98
    move-object v5, v12

    .line 99
    goto :goto_2

    .line 100
    :catchall_0
    move-exception v0

    .line 101
    invoke-static {v0}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 102
    .line 103
    .line 104
    iput-object v11, p1, Lio/reactivex/rxjava3/internal/operators/flowable/i3$c;->index:Ljava/lang/Object;

    .line 105
    .line 106
    invoke-virtual {p1}, Lio/reactivex/rxjava3/internal/operators/flowable/i3$c;->dispose()V

    .line 107
    .line 108
    .line 109
    invoke-static {v5}, Lio/reactivex/rxjava3/internal/util/q;->isError(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    if-nez v1, :cond_5

    .line 114
    .line 115
    invoke-static {v5}, Lio/reactivex/rxjava3/internal/util/q;->isComplete(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    if-nez v1, :cond_5

    .line 120
    .line 121
    iget-object p1, p1, Lio/reactivex/rxjava3/internal/operators/flowable/i3$c;->child:Lorg/reactivestreams/p;

    .line 122
    .line 123
    invoke-interface {p1, v0}, Lorg/reactivestreams/p;->onError(Ljava/lang/Throwable;)V

    .line 124
    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_5
    invoke-static {v0}, Lio/reactivex/rxjava3/plugins/a;->Y(Ljava/lang/Throwable;)V

    .line 128
    .line 129
    .line 130
    :goto_3
    return-void

    .line 131
    :cond_6
    if-nez v10, :cond_7

    .line 132
    .line 133
    invoke-virtual {p1}, Lio/reactivex/rxjava3/internal/operators/flowable/i3$c;->isDisposed()Z

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    if-eqz v2, :cond_7

    .line 138
    .line 139
    iput-object v11, p1, Lio/reactivex/rxjava3/internal/operators/flowable/i3$c;->index:Ljava/lang/Object;

    .line 140
    .line 141
    return-void

    .line 142
    :cond_7
    cmp-long v2, v8, v6

    .line 143
    .line 144
    if-eqz v2, :cond_8

    .line 145
    .line 146
    iput-object v5, p1, Lio/reactivex/rxjava3/internal/operators/flowable/i3$c;->index:Ljava/lang/Object;

    .line 147
    .line 148
    if-nez v0, :cond_8

    .line 149
    .line 150
    invoke-virtual {p1, v8, v9}, Lio/reactivex/rxjava3/internal/operators/flowable/i3$c;->produced(J)J

    .line 151
    .line 152
    .line 153
    :cond_8
    monitor-enter p1

    .line 154
    :try_start_2
    iget-boolean v0, p1, Lio/reactivex/rxjava3/internal/operators/flowable/i3$c;->missed:Z

    .line 155
    .line 156
    if-nez v0, :cond_9

    .line 157
    .line 158
    iput-boolean v4, p1, Lio/reactivex/rxjava3/internal/operators/flowable/i3$c;->emitting:Z

    .line 159
    .line 160
    monitor-exit p1

    .line 161
    return-void

    .line 162
    :cond_9
    iput-boolean v4, p1, Lio/reactivex/rxjava3/internal/operators/flowable/i3$c;->missed:Z

    .line 163
    .line 164
    monitor-exit p1

    .line 165
    goto/16 :goto_0

    .line 166
    .line 167
    :catchall_1
    move-exception v0

    .line 168
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 169
    throw v0

    .line 170
    :catchall_2
    move-exception v0

    .line 171
    :try_start_3
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 172
    throw v0
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
.end method

.method final setFirst(Lio/reactivex/rxjava3/internal/operators/flowable/i3$e;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$a;->eagerTruncate:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$e;

    .line 6
    .line 7
    iget-wide v1, p1, Lio/reactivex/rxjava3/internal/operators/flowable/i3$e;->index:J

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-direct {v0, v3, v1, v2}, Lio/reactivex/rxjava3/internal/operators/flowable/i3$e;-><init>(Ljava/lang/Object;J)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    move-object p1, v0

    .line 21
    :cond_0
    invoke-virtual {p0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void
    .line 25
    .line 26
    .line 27
.end method

.method final trimHead()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$e;

    .line 6
    .line 7
    iget-object v1, v0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$e;->value:Ljava/lang/Object;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    new-instance v1, Lio/reactivex/rxjava3/internal/operators/flowable/i3$e;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    const-wide/16 v3, 0x0

    .line 15
    .line 16
    invoke-direct {v1, v2, v3, v4}, Lio/reactivex/rxjava3/internal/operators/flowable/i3$e;-><init>(Ljava/lang/Object;J)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    :cond_0
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

.method abstract truncate()V
.end method

.method truncateFinal()V
    .locals 0

    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/flowable/i3$a;->trimHead()V

    return-void
.end method
