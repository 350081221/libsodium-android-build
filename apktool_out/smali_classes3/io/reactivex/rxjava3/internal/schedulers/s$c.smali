.class final Lio/reactivex/rxjava3/internal/schedulers/s$c;
.super Lio/reactivex/rxjava3/core/q0$c;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/disposables/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/schedulers/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/rxjava3/internal/schedulers/s$c$a;
    }
.end annotation


# instance fields
.field final a:Ljava/util/concurrent/PriorityBlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/PriorityBlockingQueue<",
            "Lio/reactivex/rxjava3/internal/schedulers/s$b;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/concurrent/atomic/AtomicInteger;

.field final c:Ljava/util/concurrent/atomic/AtomicInteger;

.field volatile d:Z


# direct methods
.method constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lio/reactivex/rxjava3/core/q0$c;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/PriorityBlockingQueue;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/PriorityBlockingQueue;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/schedulers/s$c;->a:Ljava/util/concurrent/PriorityBlockingQueue;

    .line 10
    .line 11
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/schedulers/s$c;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 17
    .line 18
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/schedulers/s$c;->c:Ljava/util/concurrent/atomic/AtomicInteger;

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


# virtual methods
.method public b(Ljava/lang/Runnable;)Lio/reactivex/rxjava3/disposables/e;
    .locals 2
    .param p1    # Ljava/lang/Runnable;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation build Ll3/f;
    .end annotation

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p0, v0}, Lio/reactivex/rxjava3/core/q0$c;->a(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, Lio/reactivex/rxjava3/internal/schedulers/s$c;->e(Ljava/lang/Runnable;J)Lio/reactivex/rxjava3/disposables/e;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lio/reactivex/rxjava3/disposables/e;
    .locals 2
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
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lio/reactivex/rxjava3/core/q0$c;->a(Ljava/util/concurrent/TimeUnit;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    invoke-virtual {p4, p2, p3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 8
    .line 9
    .line 10
    move-result-wide p2

    .line 11
    add-long/2addr v0, p2

    .line 12
    new-instance p2, Lio/reactivex/rxjava3/internal/schedulers/s$a;

    .line 13
    .line 14
    invoke-direct {p2, p1, p0, v0, v1}, Lio/reactivex/rxjava3/internal/schedulers/s$a;-><init>(Ljava/lang/Runnable;Lio/reactivex/rxjava3/internal/schedulers/s$c;J)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p2, v0, v1}, Lio/reactivex/rxjava3/internal/schedulers/s$c;->e(Ljava/lang/Runnable;J)Lio/reactivex/rxjava3/disposables/e;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1
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

.method public dispose()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/reactivex/rxjava3/internal/schedulers/s$c;->d:Z

    return-void
.end method

.method e(Ljava/lang/Runnable;J)Lio/reactivex/rxjava3/disposables/e;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/schedulers/s$c;->d:Z

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
    new-instance v0, Lio/reactivex/rxjava3/internal/schedulers/s$b;

    .line 9
    .line 10
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    iget-object p3, p0, Lio/reactivex/rxjava3/internal/schedulers/s$c;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 15
    .line 16
    invoke-virtual {p3}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 17
    .line 18
    .line 19
    move-result p3

    .line 20
    invoke-direct {v0, p1, p2, p3}, Lio/reactivex/rxjava3/internal/schedulers/s$b;-><init>(Ljava/lang/Runnable;Ljava/lang/Long;I)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/schedulers/s$c;->a:Ljava/util/concurrent/PriorityBlockingQueue;

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Ljava/util/concurrent/PriorityBlockingQueue;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/schedulers/s$c;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-nez p1, :cond_4

    .line 35
    .line 36
    const/4 p1, 0x1

    .line 37
    :cond_1
    :goto_0
    iget-boolean p2, p0, Lio/reactivex/rxjava3/internal/schedulers/s$c;->d:Z

    .line 38
    .line 39
    if-eqz p2, :cond_2

    .line 40
    .line 41
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/schedulers/s$c;->a:Ljava/util/concurrent/PriorityBlockingQueue;

    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/util/concurrent/PriorityBlockingQueue;->clear()V

    .line 44
    .line 45
    .line 46
    sget-object p1, Lio/reactivex/rxjava3/internal/disposables/d;->INSTANCE:Lio/reactivex/rxjava3/internal/disposables/d;

    .line 47
    .line 48
    return-object p1

    .line 49
    :cond_2
    iget-object p2, p0, Lio/reactivex/rxjava3/internal/schedulers/s$c;->a:Ljava/util/concurrent/PriorityBlockingQueue;

    .line 50
    .line 51
    invoke-virtual {p2}, Ljava/util/concurrent/PriorityBlockingQueue;->poll()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    check-cast p2, Lio/reactivex/rxjava3/internal/schedulers/s$b;

    .line 56
    .line 57
    if-nez p2, :cond_3

    .line 58
    .line 59
    iget-object p2, p0, Lio/reactivex/rxjava3/internal/schedulers/s$c;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 60
    .line 61
    neg-int p1, p1

    .line 62
    invoke-virtual {p2, p1}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-nez p1, :cond_1

    .line 67
    .line 68
    sget-object p1, Lio/reactivex/rxjava3/internal/disposables/d;->INSTANCE:Lio/reactivex/rxjava3/internal/disposables/d;

    .line 69
    .line 70
    return-object p1

    .line 71
    :cond_3
    iget-boolean p3, p2, Lio/reactivex/rxjava3/internal/schedulers/s$b;->d:Z

    .line 72
    .line 73
    if-nez p3, :cond_1

    .line 74
    .line 75
    iget-object p2, p2, Lio/reactivex/rxjava3/internal/schedulers/s$b;->a:Ljava/lang/Runnable;

    .line 76
    .line 77
    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_4
    new-instance p1, Lio/reactivex/rxjava3/internal/schedulers/s$c$a;

    .line 82
    .line 83
    invoke-direct {p1, p0, v0}, Lio/reactivex/rxjava3/internal/schedulers/s$c$a;-><init>(Lio/reactivex/rxjava3/internal/schedulers/s$c;Lio/reactivex/rxjava3/internal/schedulers/s$b;)V

    .line 84
    .line 85
    .line 86
    invoke-static {p1}, Lio/reactivex/rxjava3/disposables/e;->m(Ljava/lang/Runnable;)Lio/reactivex/rxjava3/disposables/e;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    return-object p1
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

.method public isDisposed()Z
    .locals 1

    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/schedulers/s$c;->d:Z

    return v0
.end method
