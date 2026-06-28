.class public final Lio/reactivex/rxjava3/internal/operators/flowable/q;
.super Lio/reactivex/rxjava3/internal/operators/flowable/a;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/core/t;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/rxjava3/internal/operators/flowable/q$b;,
        Lio/reactivex/rxjava3/internal/operators/flowable/q$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/rxjava3/internal/operators/flowable/a<",
        "TT;TT;>;",
        "Lio/reactivex/rxjava3/core/t<",
        "TT;>;"
    }
.end annotation


# static fields
.field static final l:[Lio/reactivex/rxjava3/internal/operators/flowable/q$a;

.field static final m:[Lio/reactivex/rxjava3/internal/operators/flowable/q$a;


# instance fields
.field final c:Ljava/util/concurrent/atomic/AtomicBoolean;

.field final d:I

.field final e:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "[",
            "Lio/reactivex/rxjava3/internal/operators/flowable/q$a<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field volatile f:J

.field final g:Lio/reactivex/rxjava3/internal/operators/flowable/q$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/internal/operators/flowable/q$b<",
            "TT;>;"
        }
    .end annotation
.end field

.field h:Lio/reactivex/rxjava3/internal/operators/flowable/q$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/internal/operators/flowable/q$b<",
            "TT;>;"
        }
    .end annotation
.end field

.field i:I

.field j:Ljava/lang/Throwable;

.field volatile k:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v1, v0, [Lio/reactivex/rxjava3/internal/operators/flowable/q$a;

    .line 3
    .line 4
    sput-object v1, Lio/reactivex/rxjava3/internal/operators/flowable/q;->l:[Lio/reactivex/rxjava3/internal/operators/flowable/q$a;

    .line 5
    .line 6
    new-array v0, v0, [Lio/reactivex/rxjava3/internal/operators/flowable/q$a;

    .line 7
    .line 8
    sput-object v0, Lio/reactivex/rxjava3/internal/operators/flowable/q;->m:[Lio/reactivex/rxjava3/internal/operators/flowable/q$a;

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
.end method

.method public constructor <init>(Lio/reactivex/rxjava3/core/o;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/o<",
            "TT;>;I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lio/reactivex/rxjava3/internal/operators/flowable/a;-><init>(Lio/reactivex/rxjava3/core/o;)V

    .line 2
    .line 3
    .line 4
    iput p2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/q;->d:I

    .line 5
    .line 6
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/q;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 12
    .line 13
    new-instance p1, Lio/reactivex/rxjava3/internal/operators/flowable/q$b;

    .line 14
    .line 15
    invoke-direct {p1, p2}, Lio/reactivex/rxjava3/internal/operators/flowable/q$b;-><init>(I)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/q;->g:Lio/reactivex/rxjava3/internal/operators/flowable/q$b;

    .line 19
    .line 20
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/q;->h:Lio/reactivex/rxjava3/internal/operators/flowable/q$b;

    .line 21
    .line 22
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 23
    .line 24
    sget-object p2, Lio/reactivex/rxjava3/internal/operators/flowable/q;->l:[Lio/reactivex/rxjava3/internal/operators/flowable/q$a;

    .line 25
    .line 26
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/q;->e:Ljava/util/concurrent/atomic/AtomicReference;

    .line 30
    .line 31
    return-void
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
.method protected O6(Lorg/reactivestreams/p;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/reactivestreams/p<",
            "-TT;>;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/flowable/q$a;

    .line 2
    .line 3
    invoke-direct {v0, p1, p0}, Lio/reactivex/rxjava3/internal/operators/flowable/q$a;-><init>(Lorg/reactivestreams/p;Lio/reactivex/rxjava3/internal/operators/flowable/q;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, v0}, Lorg/reactivestreams/p;->onSubscribe(Lorg/reactivestreams/q;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lio/reactivex/rxjava3/internal/operators/flowable/q;->n9(Lio/reactivex/rxjava3/internal/operators/flowable/q$a;)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/q;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/q;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    const/4 v2, 0x1

    .line 24
    invoke-virtual {p1, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/a;->b:Lio/reactivex/rxjava3/core/o;

    .line 31
    .line 32
    invoke-virtual {p1, p0}, Lio/reactivex/rxjava3/core/o;->N6(Lio/reactivex/rxjava3/core/t;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-virtual {p0, v0}, Lio/reactivex/rxjava3/internal/operators/flowable/q;->s9(Lio/reactivex/rxjava3/internal/operators/flowable/q$a;)V

    .line 37
    .line 38
    .line 39
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

.method n9(Lio/reactivex/rxjava3/internal/operators/flowable/q$a;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/internal/operators/flowable/q$a<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    :cond_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/q;->e:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lio/reactivex/rxjava3/internal/operators/flowable/q$a;

    .line 8
    .line 9
    sget-object v1, Lio/reactivex/rxjava3/internal/operators/flowable/q;->m:[Lio/reactivex/rxjava3/internal/operators/flowable/q$a;

    .line 10
    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    return-void

    .line 14
    :cond_1
    array-length v1, v0

    .line 15
    add-int/lit8 v2, v1, 0x1

    .line 16
    .line 17
    new-array v2, v2, [Lio/reactivex/rxjava3/internal/operators/flowable/q$a;

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-static {v0, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 21
    .line 22
    .line 23
    aput-object p1, v2, v1

    .line 24
    .line 25
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/q;->e:Ljava/util/concurrent/atomic/AtomicReference;

    .line 26
    .line 27
    invoke-static {v1, v0, v2}, Landroidx/compose/animation/core/h;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_0

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

.method o9()J
    .locals 2

    iget-wide v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/q;->f:J

    return-wide v0
.end method

.method public onComplete()V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/q;->k:Z

    .line 3
    .line 4
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/q;->e:Ljava/util/concurrent/atomic/AtomicReference;

    .line 5
    .line 6
    sget-object v1, Lio/reactivex/rxjava3/internal/operators/flowable/q;->m:[Lio/reactivex/rxjava3/internal/operators/flowable/q$a;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, [Lio/reactivex/rxjava3/internal/operators/flowable/q$a;

    .line 13
    .line 14
    array-length v1, v0

    .line 15
    const/4 v2, 0x0

    .line 16
    :goto_0
    if-ge v2, v1, :cond_0

    .line 17
    .line 18
    aget-object v3, v0, v2

    .line 19
    .line 20
    invoke-virtual {p0, v3}, Lio/reactivex/rxjava3/internal/operators/flowable/q;->s9(Lio/reactivex/rxjava3/internal/operators/flowable/q$a;)V

    .line 21
    .line 22
    .line 23
    add-int/lit8 v2, v2, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-void
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

.method public onError(Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/q;->k:Z

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
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/q;->j:Ljava/lang/Throwable;

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    iput-boolean p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/q;->k:Z

    .line 13
    .line 14
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/q;->e:Ljava/util/concurrent/atomic/AtomicReference;

    .line 15
    .line 16
    sget-object v0, Lio/reactivex/rxjava3/internal/operators/flowable/q;->m:[Lio/reactivex/rxjava3/internal/operators/flowable/q$a;

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, [Lio/reactivex/rxjava3/internal/operators/flowable/q$a;

    .line 23
    .line 24
    array-length v0, p1

    .line 25
    const/4 v1, 0x0

    .line 26
    :goto_0
    if-ge v1, v0, :cond_1

    .line 27
    .line 28
    aget-object v2, p1, v1

    .line 29
    .line 30
    invoke-virtual {p0, v2}, Lio/reactivex/rxjava3/internal/operators/flowable/q;->s9(Lio/reactivex/rxjava3/internal/operators/flowable/q$a;)V

    .line 31
    .line 32
    .line 33
    add-int/lit8 v1, v1, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    return-void
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

.method public onNext(Ljava/lang/Object;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    iget v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/q;->i:I

    .line 2
    .line 3
    iget v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/q;->d:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    new-instance v1, Lio/reactivex/rxjava3/internal/operators/flowable/q$b;

    .line 10
    .line 11
    invoke-direct {v1, v0}, Lio/reactivex/rxjava3/internal/operators/flowable/q$b;-><init>(I)V

    .line 12
    .line 13
    .line 14
    iget-object v0, v1, Lio/reactivex/rxjava3/internal/operators/flowable/q$b;->a:[Ljava/lang/Object;

    .line 15
    .line 16
    aput-object p1, v0, v2

    .line 17
    .line 18
    iput v3, p0, Lio/reactivex/rxjava3/internal/operators/flowable/q;->i:I

    .line 19
    .line 20
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/q;->h:Lio/reactivex/rxjava3/internal/operators/flowable/q$b;

    .line 21
    .line 22
    iput-object v1, p1, Lio/reactivex/rxjava3/internal/operators/flowable/q$b;->b:Lio/reactivex/rxjava3/internal/operators/flowable/q$b;

    .line 23
    .line 24
    iput-object v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/q;->h:Lio/reactivex/rxjava3/internal/operators/flowable/q$b;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/q;->h:Lio/reactivex/rxjava3/internal/operators/flowable/q$b;

    .line 28
    .line 29
    iget-object v1, v1, Lio/reactivex/rxjava3/internal/operators/flowable/q$b;->a:[Ljava/lang/Object;

    .line 30
    .line 31
    aput-object p1, v1, v0

    .line 32
    .line 33
    add-int/2addr v0, v3

    .line 34
    iput v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/q;->i:I

    .line 35
    .line 36
    :goto_0
    iget-wide v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/q;->f:J

    .line 37
    .line 38
    const-wide/16 v3, 0x1

    .line 39
    .line 40
    add-long/2addr v0, v3

    .line 41
    iput-wide v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/q;->f:J

    .line 42
    .line 43
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/q;->e:Ljava/util/concurrent/atomic/AtomicReference;

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    check-cast p1, [Lio/reactivex/rxjava3/internal/operators/flowable/q$a;

    .line 50
    .line 51
    array-length v0, p1

    .line 52
    :goto_1
    if-ge v2, v0, :cond_1

    .line 53
    .line 54
    aget-object v1, p1, v2

    .line 55
    .line 56
    invoke-virtual {p0, v1}, Lio/reactivex/rxjava3/internal/operators/flowable/q;->s9(Lio/reactivex/rxjava3/internal/operators/flowable/q$a;)V

    .line 57
    .line 58
    .line 59
    add-int/lit8 v2, v2, 0x1

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    return-void
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

    const-wide v0, 0x7fffffffffffffffL

    invoke-interface {p1, v0, v1}, Lorg/reactivestreams/q;->request(J)V

    return-void
.end method

.method p9()Z
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/q;->e:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/reactivex/rxjava3/internal/operators/flowable/q$a;

    array-length v0, v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method q9()Z
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/q;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method

.method r9(Lio/reactivex/rxjava3/internal/operators/flowable/q$a;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/internal/operators/flowable/q$a<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    :cond_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/q;->e:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lio/reactivex/rxjava3/internal/operators/flowable/q$a;

    .line 8
    .line 9
    array-length v1, v0

    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    return-void

    .line 13
    :cond_1
    const/4 v2, 0x0

    .line 14
    move v3, v2

    .line 15
    :goto_0
    if-ge v3, v1, :cond_3

    .line 16
    .line 17
    aget-object v4, v0, v3

    .line 18
    .line 19
    if-ne v4, p1, :cond_2

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_3
    const/4 v3, -0x1

    .line 26
    :goto_1
    if-gez v3, :cond_4

    .line 27
    .line 28
    return-void

    .line 29
    :cond_4
    const/4 v4, 0x1

    .line 30
    if-ne v1, v4, :cond_5

    .line 31
    .line 32
    sget-object v1, Lio/reactivex/rxjava3/internal/operators/flowable/q;->l:[Lio/reactivex/rxjava3/internal/operators/flowable/q$a;

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_5
    add-int/lit8 v5, v1, -0x1

    .line 36
    .line 37
    new-array v5, v5, [Lio/reactivex/rxjava3/internal/operators/flowable/q$a;

    .line 38
    .line 39
    invoke-static {v0, v2, v5, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 40
    .line 41
    .line 42
    add-int/lit8 v2, v3, 0x1

    .line 43
    .line 44
    sub-int/2addr v1, v3

    .line 45
    sub-int/2addr v1, v4

    .line 46
    invoke-static {v0, v2, v5, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 47
    .line 48
    .line 49
    move-object v1, v5

    .line 50
    :goto_2
    iget-object v2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/q;->e:Ljava/util/concurrent/atomic/AtomicReference;

    .line 51
    .line 52
    invoke-static {v2, v0, v1}, Landroidx/compose/animation/core/h;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_0

    .line 57
    .line 58
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

.method s9(Lio/reactivex/rxjava3/internal/operators/flowable/q$a;)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/internal/operators/flowable/q$a<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual/range {p1 .. p1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-wide v2, v1, Lio/reactivex/rxjava3/internal/operators/flowable/q$a;->index:J

    .line 13
    .line 14
    iget v4, v1, Lio/reactivex/rxjava3/internal/operators/flowable/q$a;->offset:I

    .line 15
    .line 16
    iget-object v5, v1, Lio/reactivex/rxjava3/internal/operators/flowable/q$a;->node:Lio/reactivex/rxjava3/internal/operators/flowable/q$b;

    .line 17
    .line 18
    iget-object v6, v1, Lio/reactivex/rxjava3/internal/operators/flowable/q$a;->requested:Ljava/util/concurrent/atomic/AtomicLong;

    .line 19
    .line 20
    iget-object v7, v1, Lio/reactivex/rxjava3/internal/operators/flowable/q$a;->downstream:Lorg/reactivestreams/p;

    .line 21
    .line 22
    iget v8, v0, Lio/reactivex/rxjava3/internal/operators/flowable/q;->d:I

    .line 23
    .line 24
    const/4 v9, 0x1

    .line 25
    move v10, v9

    .line 26
    :cond_1
    :goto_0
    iget-boolean v11, v0, Lio/reactivex/rxjava3/internal/operators/flowable/q;->k:Z

    .line 27
    .line 28
    iget-wide v12, v0, Lio/reactivex/rxjava3/internal/operators/flowable/q;->f:J

    .line 29
    .line 30
    cmp-long v12, v12, v2

    .line 31
    .line 32
    const/4 v13, 0x0

    .line 33
    if-nez v12, :cond_2

    .line 34
    .line 35
    move v12, v9

    .line 36
    goto :goto_1

    .line 37
    :cond_2
    move v12, v13

    .line 38
    :goto_1
    const/4 v14, 0x0

    .line 39
    if-eqz v11, :cond_4

    .line 40
    .line 41
    if-eqz v12, :cond_4

    .line 42
    .line 43
    iput-object v14, v1, Lio/reactivex/rxjava3/internal/operators/flowable/q$a;->node:Lio/reactivex/rxjava3/internal/operators/flowable/q$b;

    .line 44
    .line 45
    iget-object v1, v0, Lio/reactivex/rxjava3/internal/operators/flowable/q;->j:Ljava/lang/Throwable;

    .line 46
    .line 47
    if-eqz v1, :cond_3

    .line 48
    .line 49
    invoke-interface {v7, v1}, Lorg/reactivestreams/p;->onError(Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_3
    invoke-interface {v7}, Lorg/reactivestreams/p;->onComplete()V

    .line 54
    .line 55
    .line 56
    :goto_2
    return-void

    .line 57
    :cond_4
    if-nez v12, :cond_7

    .line 58
    .line 59
    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 60
    .line 61
    .line 62
    move-result-wide v11

    .line 63
    const-wide/high16 v15, -0x8000000000000000L

    .line 64
    .line 65
    cmp-long v15, v11, v15

    .line 66
    .line 67
    if-nez v15, :cond_5

    .line 68
    .line 69
    iput-object v14, v1, Lio/reactivex/rxjava3/internal/operators/flowable/q$a;->node:Lio/reactivex/rxjava3/internal/operators/flowable/q$b;

    .line 70
    .line 71
    return-void

    .line 72
    :cond_5
    cmp-long v11, v11, v2

    .line 73
    .line 74
    if-eqz v11, :cond_7

    .line 75
    .line 76
    if-ne v4, v8, :cond_6

    .line 77
    .line 78
    iget-object v4, v5, Lio/reactivex/rxjava3/internal/operators/flowable/q$b;->b:Lio/reactivex/rxjava3/internal/operators/flowable/q$b;

    .line 79
    .line 80
    move-object v5, v4

    .line 81
    move v4, v13

    .line 82
    :cond_6
    iget-object v11, v5, Lio/reactivex/rxjava3/internal/operators/flowable/q$b;->a:[Ljava/lang/Object;

    .line 83
    .line 84
    aget-object v11, v11, v4

    .line 85
    .line 86
    invoke-interface {v7, v11}, Lorg/reactivestreams/p;->onNext(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    add-int/2addr v4, v9

    .line 90
    const-wide/16 v11, 0x1

    .line 91
    .line 92
    add-long/2addr v2, v11

    .line 93
    goto :goto_0

    .line 94
    :cond_7
    iput-wide v2, v1, Lio/reactivex/rxjava3/internal/operators/flowable/q$a;->index:J

    .line 95
    .line 96
    iput v4, v1, Lio/reactivex/rxjava3/internal/operators/flowable/q$a;->offset:I

    .line 97
    .line 98
    iput-object v5, v1, Lio/reactivex/rxjava3/internal/operators/flowable/q$a;->node:Lio/reactivex/rxjava3/internal/operators/flowable/q$b;

    .line 99
    .line 100
    neg-int v10, v10

    .line 101
    invoke-virtual {v1, v10}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    .line 102
    .line 103
    .line 104
    move-result v10

    .line 105
    if-nez v10, :cond_1

    .line 106
    .line 107
    return-void
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
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
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
