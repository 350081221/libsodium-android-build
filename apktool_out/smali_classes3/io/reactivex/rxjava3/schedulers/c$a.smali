.class final Lio/reactivex/rxjava3/schedulers/c$a;
.super Lio/reactivex/rxjava3/core/q0$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/schedulers/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/rxjava3/schedulers/c$a$a;
    }
.end annotation


# instance fields
.field volatile a:Z

.field final synthetic b:Lio/reactivex/rxjava3/schedulers/c;


# direct methods
.method constructor <init>(Lio/reactivex/rxjava3/schedulers/c;)V
    .locals 0

    iput-object p1, p0, Lio/reactivex/rxjava3/schedulers/c$a;->b:Lio/reactivex/rxjava3/schedulers/c;

    invoke-direct {p0}, Lio/reactivex/rxjava3/core/q0$c;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/concurrent/TimeUnit;)J
    .locals 2
    .param p1    # Ljava/util/concurrent/TimeUnit;
        .annotation build Ll3/f;
        .end annotation
    .end param

    iget-object v0, p0, Lio/reactivex/rxjava3/schedulers/c$a;->b:Lio/reactivex/rxjava3/schedulers/c;

    invoke-virtual {v0, p1}, Lio/reactivex/rxjava3/schedulers/c;->d(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v0

    return-wide v0
.end method

.method public b(Ljava/lang/Runnable;)Lio/reactivex/rxjava3/disposables/e;
    .locals 10
    .param p1    # Ljava/lang/Runnable;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation build Ll3/f;
    .end annotation

    .line 1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/schedulers/c$a;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object p1, Lio/reactivex/rxjava3/internal/disposables/d;->INSTANCE:Lio/reactivex/rxjava3/internal/disposables/d;

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    new-instance v7, Lio/reactivex/rxjava3/schedulers/c$b;

    .line 9
    .line 10
    const-wide/16 v2, 0x0

    .line 11
    .line 12
    iget-object v0, p0, Lio/reactivex/rxjava3/schedulers/c$a;->b:Lio/reactivex/rxjava3/schedulers/c;

    .line 13
    .line 14
    iget-wide v5, v0, Lio/reactivex/rxjava3/schedulers/c;->c:J

    .line 15
    .line 16
    const-wide/16 v8, 0x1

    .line 17
    .line 18
    add-long/2addr v8, v5

    .line 19
    iput-wide v8, v0, Lio/reactivex/rxjava3/schedulers/c;->c:J

    .line 20
    .line 21
    move-object v0, v7

    .line 22
    move-object v1, p0

    .line 23
    move-object v4, p1

    .line 24
    invoke-direct/range {v0 .. v6}, Lio/reactivex/rxjava3/schedulers/c$b;-><init>(Lio/reactivex/rxjava3/schedulers/c$a;JLjava/lang/Runnable;J)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lio/reactivex/rxjava3/schedulers/c$a;->b:Lio/reactivex/rxjava3/schedulers/c;

    .line 28
    .line 29
    iget-object p1, p1, Lio/reactivex/rxjava3/schedulers/c;->b:Ljava/util/Queue;

    .line 30
    .line 31
    invoke-interface {p1, v7}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    new-instance p1, Lio/reactivex/rxjava3/schedulers/c$a$a;

    .line 35
    .line 36
    invoke-direct {p1, p0, v7}, Lio/reactivex/rxjava3/schedulers/c$a$a;-><init>(Lio/reactivex/rxjava3/schedulers/c$a;Lio/reactivex/rxjava3/schedulers/c$b;)V

    .line 37
    .line 38
    .line 39
    invoke-static {p1}, Lio/reactivex/rxjava3/disposables/e;->m(Ljava/lang/Runnable;)Lio/reactivex/rxjava3/disposables/e;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    return-object p1
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

.method public c(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lio/reactivex/rxjava3/disposables/e;
    .locals 8
    .param p1    # Ljava/lang/Runnable;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .param p4    # Ljava/util/concurrent/TimeUnit;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation build Ll3/f;
    .end annotation

    .line 1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/schedulers/c$a;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object p1, Lio/reactivex/rxjava3/internal/disposables/d;->INSTANCE:Lio/reactivex/rxjava3/internal/disposables/d;

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    new-instance v7, Lio/reactivex/rxjava3/schedulers/c$b;

    .line 9
    .line 10
    iget-object v0, p0, Lio/reactivex/rxjava3/schedulers/c$a;->b:Lio/reactivex/rxjava3/schedulers/c;

    .line 11
    .line 12
    iget-wide v0, v0, Lio/reactivex/rxjava3/schedulers/c;->d:J

    .line 13
    .line 14
    invoke-virtual {p4, p2, p3}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 15
    .line 16
    .line 17
    move-result-wide p2

    .line 18
    add-long v2, v0, p2

    .line 19
    .line 20
    iget-object p2, p0, Lio/reactivex/rxjava3/schedulers/c$a;->b:Lio/reactivex/rxjava3/schedulers/c;

    .line 21
    .line 22
    iget-wide v5, p2, Lio/reactivex/rxjava3/schedulers/c;->c:J

    .line 23
    .line 24
    const-wide/16 p3, 0x1

    .line 25
    .line 26
    add-long/2addr p3, v5

    .line 27
    iput-wide p3, p2, Lio/reactivex/rxjava3/schedulers/c;->c:J

    .line 28
    .line 29
    move-object v0, v7

    .line 30
    move-object v1, p0

    .line 31
    move-object v4, p1

    .line 32
    invoke-direct/range {v0 .. v6}, Lio/reactivex/rxjava3/schedulers/c$b;-><init>(Lio/reactivex/rxjava3/schedulers/c$a;JLjava/lang/Runnable;J)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lio/reactivex/rxjava3/schedulers/c$a;->b:Lio/reactivex/rxjava3/schedulers/c;

    .line 36
    .line 37
    iget-object p1, p1, Lio/reactivex/rxjava3/schedulers/c;->b:Ljava/util/Queue;

    .line 38
    .line 39
    invoke-interface {p1, v7}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    new-instance p1, Lio/reactivex/rxjava3/schedulers/c$a$a;

    .line 43
    .line 44
    invoke-direct {p1, p0, v7}, Lio/reactivex/rxjava3/schedulers/c$a$a;-><init>(Lio/reactivex/rxjava3/schedulers/c$a;Lio/reactivex/rxjava3/schedulers/c$b;)V

    .line 45
    .line 46
    .line 47
    invoke-static {p1}, Lio/reactivex/rxjava3/disposables/e;->m(Ljava/lang/Runnable;)Lio/reactivex/rxjava3/disposables/e;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    return-object p1
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

.method public dispose()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/reactivex/rxjava3/schedulers/c$a;->a:Z

    return-void
.end method

.method public isDisposed()Z
    .locals 1

    iget-boolean v0, p0, Lio/reactivex/rxjava3/schedulers/c$a;->a:Z

    return v0
.end method
