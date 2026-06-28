.class final Lio/reactivex/rxjava3/internal/operators/parallel/i$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/reactivestreams/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/parallel/i$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation


# instance fields
.field final a:I

.field final b:I

.field final synthetic c:Lio/reactivex/rxjava3/internal/operators/parallel/i$a;


# direct methods
.method constructor <init>(Lio/reactivex/rxjava3/internal/operators/parallel/i$a;II)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/parallel/i$a$a;->c:Lio/reactivex/rxjava3/internal/operators/parallel/i$a;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput p2, p0, Lio/reactivex/rxjava3/internal/operators/parallel/i$a$a;->a:I

    .line 7
    .line 8
    iput p3, p0, Lio/reactivex/rxjava3/internal/operators/parallel/i$a$a;->b:I

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
    .locals 7

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/parallel/i$a$a;->c:Lio/reactivex/rxjava3/internal/operators/parallel/i$a;

    .line 2
    .line 3
    iget-object v1, v0, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->requests:Ljava/util/concurrent/atomic/AtomicLongArray;

    .line 4
    .line 5
    iget v0, p0, Lio/reactivex/rxjava3/internal/operators/parallel/i$a$a;->b:I

    .line 6
    .line 7
    iget v2, p0, Lio/reactivex/rxjava3/internal/operators/parallel/i$a$a;->a:I

    .line 8
    .line 9
    add-int/2addr v2, v0

    .line 10
    const-wide/16 v3, 0x0

    .line 11
    .line 12
    const-wide/16 v5, 0x1

    .line 13
    .line 14
    invoke-virtual/range {v1 .. v6}, Ljava/util/concurrent/atomic/AtomicLongArray;->compareAndSet(IJJ)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/parallel/i$a$a;->c:Lio/reactivex/rxjava3/internal/operators/parallel/i$a;

    .line 21
    .line 22
    iget v1, p0, Lio/reactivex/rxjava3/internal/operators/parallel/i$a$a;->b:I

    .line 23
    .line 24
    add-int/2addr v1, v1

    .line 25
    invoke-virtual {v0, v1}, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->cancel(I)V

    .line 26
    .line 27
    .line 28
    :cond_0
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

.method public request(J)V
    .locals 7

    .line 1
    invoke-static {p1, p2}, Lio/reactivex/rxjava3/internal/subscriptions/j;->validate(J)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/parallel/i$a$a;->c:Lio/reactivex/rxjava3/internal/operators/parallel/i$a;

    .line 8
    .line 9
    iget-object v0, v0, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->requests:Ljava/util/concurrent/atomic/AtomicLongArray;

    .line 10
    .line 11
    :cond_0
    iget v1, p0, Lio/reactivex/rxjava3/internal/operators/parallel/i$a$a;->a:I

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicLongArray;->get(I)J

    .line 14
    .line 15
    .line 16
    move-result-wide v3

    .line 17
    const-wide v1, 0x7fffffffffffffffL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    cmp-long v1, v3, v1

    .line 23
    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    invoke-static {v3, v4, p1, p2}, Lio/reactivex/rxjava3/internal/util/d;->c(JJ)J

    .line 28
    .line 29
    .line 30
    move-result-wide v5

    .line 31
    iget v2, p0, Lio/reactivex/rxjava3/internal/operators/parallel/i$a$a;->a:I

    .line 32
    .line 33
    move-object v1, v0

    .line 34
    invoke-virtual/range {v1 .. v6}, Ljava/util/concurrent/atomic/AtomicLongArray;->compareAndSet(IJJ)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_0

    .line 39
    .line 40
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/parallel/i$a$a;->c:Lio/reactivex/rxjava3/internal/operators/parallel/i$a;

    .line 41
    .line 42
    iget-object p1, p1, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->subscriberCount:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    iget p2, p0, Lio/reactivex/rxjava3/internal/operators/parallel/i$a$a;->b:I

    .line 49
    .line 50
    if-ne p1, p2, :cond_2

    .line 51
    .line 52
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/parallel/i$a$a;->c:Lio/reactivex/rxjava3/internal/operators/parallel/i$a;

    .line 53
    .line 54
    invoke-virtual {p1}, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;->drain()V

    .line 55
    .line 56
    .line 57
    :cond_2
    return-void
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
