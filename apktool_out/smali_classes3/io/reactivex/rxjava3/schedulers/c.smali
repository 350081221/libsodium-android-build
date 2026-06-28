.class public final Lio/reactivex/rxjava3/schedulers/c;
.super Lio/reactivex/rxjava3/core/q0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/rxjava3/schedulers/c$a;,
        Lio/reactivex/rxjava3/schedulers/c$b;
    }
.end annotation


# instance fields
.field final b:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "Lio/reactivex/rxjava3/schedulers/c$b;",
            ">;"
        }
    .end annotation
.end field

.field c:J

.field volatile d:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lio/reactivex/rxjava3/core/q0;-><init>()V

    .line 2
    new-instance v0, Ljava/util/concurrent/PriorityBlockingQueue;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Ljava/util/concurrent/PriorityBlockingQueue;-><init>(I)V

    iput-object v0, p0, Lio/reactivex/rxjava3/schedulers/c;->b:Ljava/util/Queue;

    return-void
.end method

.method public constructor <init>(JLjava/util/concurrent/TimeUnit;)V
    .locals 2

    .line 3
    invoke-direct {p0}, Lio/reactivex/rxjava3/core/q0;-><init>()V

    .line 4
    new-instance v0, Ljava/util/concurrent/PriorityBlockingQueue;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Ljava/util/concurrent/PriorityBlockingQueue;-><init>(I)V

    iput-object v0, p0, Lio/reactivex/rxjava3/schedulers/c;->b:Ljava/util/Queue;

    .line 5
    invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide p1

    iput-wide p1, p0, Lio/reactivex/rxjava3/schedulers/c;->d:J

    return-void
.end method

.method private w(J)V
    .locals 5

    .line 1
    :cond_0
    :goto_0
    iget-object v0, p0, Lio/reactivex/rxjava3/schedulers/c;->b:Ljava/util/Queue;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Queue;->peek()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lio/reactivex/rxjava3/schedulers/c$b;

    .line 8
    .line 9
    if-eqz v0, :cond_3

    .line 10
    .line 11
    iget-wide v1, v0, Lio/reactivex/rxjava3/schedulers/c$b;->a:J

    .line 12
    .line 13
    cmp-long v3, v1, p1

    .line 14
    .line 15
    if-lez v3, :cond_1

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_1
    const-wide/16 v3, 0x0

    .line 19
    .line 20
    cmp-long v3, v1, v3

    .line 21
    .line 22
    if-nez v3, :cond_2

    .line 23
    .line 24
    iget-wide v1, p0, Lio/reactivex/rxjava3/schedulers/c;->d:J

    .line 25
    .line 26
    :cond_2
    iput-wide v1, p0, Lio/reactivex/rxjava3/schedulers/c;->d:J

    .line 27
    .line 28
    iget-object v1, p0, Lio/reactivex/rxjava3/schedulers/c;->b:Ljava/util/Queue;

    .line 29
    .line 30
    invoke-interface {v1, v0}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    iget-object v1, v0, Lio/reactivex/rxjava3/schedulers/c$b;->c:Lio/reactivex/rxjava3/schedulers/c$a;

    .line 34
    .line 35
    iget-boolean v1, v1, Lio/reactivex/rxjava3/schedulers/c$a;->a:Z

    .line 36
    .line 37
    if-nez v1, :cond_0

    .line 38
    .line 39
    iget-object v0, v0, Lio/reactivex/rxjava3/schedulers/c$b;->b:Ljava/lang/Runnable;

    .line 40
    .line 41
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_3
    :goto_1
    iput-wide p1, p0, Lio/reactivex/rxjava3/schedulers/c;->d:J

    .line 46
    .line 47
    return-void
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


# virtual methods
.method public c()Lio/reactivex/rxjava3/core/q0$c;
    .locals 1
    .annotation build Ll3/f;
    .end annotation

    new-instance v0, Lio/reactivex/rxjava3/schedulers/c$a;

    invoke-direct {v0, p0}, Lio/reactivex/rxjava3/schedulers/c$a;-><init>(Lio/reactivex/rxjava3/schedulers/c;)V

    return-object v0
.end method

.method public d(Ljava/util/concurrent/TimeUnit;)J
    .locals 3
    .param p1    # Ljava/util/concurrent/TimeUnit;
        .annotation build Ll3/f;
        .end annotation
    .end param

    iget-wide v0, p0, Lio/reactivex/rxjava3/schedulers/c;->d:J

    sget-object v2, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v0

    return-wide v0
.end method

.method public t(JLjava/util/concurrent/TimeUnit;)V
    .locals 2

    iget-wide v0, p0, Lio/reactivex/rxjava3/schedulers/c;->d:J

    invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide p1

    add-long/2addr v0, p1

    sget-object p1, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p0, v0, v1, p1}, Lio/reactivex/rxjava3/schedulers/c;->u(JLjava/util/concurrent/TimeUnit;)V

    return-void
.end method

.method public u(JLjava/util/concurrent/TimeUnit;)V
    .locals 0

    .line 1
    invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide p1

    .line 5
    invoke-direct {p0, p1, p2}, Lio/reactivex/rxjava3/schedulers/c;->w(J)V

    .line 6
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

.method public v()V
    .locals 2

    iget-wide v0, p0, Lio/reactivex/rxjava3/schedulers/c;->d:J

    invoke-direct {p0, v0, v1}, Lio/reactivex/rxjava3/schedulers/c;->w(J)V

    return-void
.end method
