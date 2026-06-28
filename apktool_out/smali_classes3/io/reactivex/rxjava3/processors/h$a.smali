.class final Lio/reactivex/rxjava3/processors/h$a;
.super Lio/reactivex/rxjava3/internal/subscriptions/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/processors/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/reactivex/rxjava3/internal/subscriptions/c<",
        "TT;>;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x43f4c9bf08ec328eL


# instance fields
.field final synthetic this$0:Lio/reactivex/rxjava3/processors/h;


# direct methods
.method constructor <init>(Lio/reactivex/rxjava3/processors/h;)V
    .locals 0

    iput-object p1, p0, Lio/reactivex/rxjava3/processors/h$a;->this$0:Lio/reactivex/rxjava3/processors/h;

    invoke-direct {p0}, Lio/reactivex/rxjava3/internal/subscriptions/c;-><init>()V

    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/processors/h$a;->this$0:Lio/reactivex/rxjava3/processors/h;

    .line 2
    .line 3
    iget-boolean v0, v0, Lio/reactivex/rxjava3/processors/h;->h:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lio/reactivex/rxjava3/processors/h$a;->this$0:Lio/reactivex/rxjava3/processors/h;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    iput-boolean v1, v0, Lio/reactivex/rxjava3/processors/h;->h:Z

    .line 12
    .line 13
    iget-object v0, p0, Lio/reactivex/rxjava3/processors/h$a;->this$0:Lio/reactivex/rxjava3/processors/h;

    .line 14
    .line 15
    invoke-virtual {v0}, Lio/reactivex/rxjava3/processors/h;->y9()V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lio/reactivex/rxjava3/processors/h$a;->this$0:Lio/reactivex/rxjava3/processors/h;

    .line 19
    .line 20
    iget-object v0, v0, Lio/reactivex/rxjava3/processors/h;->g:Ljava/util/concurrent/atomic/AtomicReference;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lio/reactivex/rxjava3/processors/h$a;->this$0:Lio/reactivex/rxjava3/processors/h;

    .line 27
    .line 28
    iget-object v0, v0, Lio/reactivex/rxjava3/processors/h;->j:Lio/reactivex/rxjava3/internal/subscriptions/c;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    iget-object v0, p0, Lio/reactivex/rxjava3/processors/h$a;->this$0:Lio/reactivex/rxjava3/processors/h;

    .line 37
    .line 38
    iget-object v0, v0, Lio/reactivex/rxjava3/processors/h;->g:Ljava/util/concurrent/atomic/AtomicReference;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, Lio/reactivex/rxjava3/processors/h$a;->this$0:Lio/reactivex/rxjava3/processors/h;

    .line 44
    .line 45
    iget-boolean v1, v0, Lio/reactivex/rxjava3/processors/h;->l:Z

    .line 46
    .line 47
    if-nez v1, :cond_1

    .line 48
    .line 49
    iget-object v0, v0, Lio/reactivex/rxjava3/processors/h;->b:Lio/reactivex/rxjava3/internal/queue/c;

    .line 50
    .line 51
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/queue/c;->clear()V

    .line 52
    .line 53
    .line 54
    :cond_1
    return-void
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

.method public clear()V
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/processors/h$a;->this$0:Lio/reactivex/rxjava3/processors/h;

    iget-object v0, v0, Lio/reactivex/rxjava3/processors/h;->b:Lio/reactivex/rxjava3/internal/queue/c;

    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/queue/c;->clear()V

    return-void
.end method

.method public isEmpty()Z
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/processors/h$a;->this$0:Lio/reactivex/rxjava3/processors/h;

    iget-object v0, v0, Lio/reactivex/rxjava3/processors/h;->b:Lio/reactivex/rxjava3/internal/queue/c;

    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/queue/c;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public poll()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .annotation build Ll3/g;
    .end annotation

    iget-object v0, p0, Lio/reactivex/rxjava3/processors/h$a;->this$0:Lio/reactivex/rxjava3/processors/h;

    iget-object v0, v0, Lio/reactivex/rxjava3/processors/h;->b:Lio/reactivex/rxjava3/internal/queue/c;

    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/queue/c;->poll()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public request(J)V
    .locals 1

    .line 1
    invoke-static {p1, p2}, Lio/reactivex/rxjava3/internal/subscriptions/j;->validate(J)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lio/reactivex/rxjava3/processors/h$a;->this$0:Lio/reactivex/rxjava3/processors/h;

    .line 8
    .line 9
    iget-object v0, v0, Lio/reactivex/rxjava3/processors/h;->k:Ljava/util/concurrent/atomic/AtomicLong;

    .line 10
    .line 11
    invoke-static {v0, p1, p2}, Lio/reactivex/rxjava3/internal/util/d;->a(Ljava/util/concurrent/atomic/AtomicLong;J)J

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lio/reactivex/rxjava3/processors/h$a;->this$0:Lio/reactivex/rxjava3/processors/h;

    .line 15
    .line 16
    invoke-virtual {p1}, Lio/reactivex/rxjava3/processors/h;->z9()V

    .line 17
    .line 18
    .line 19
    :cond_0
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

.method public requestFusion(I)I
    .locals 2

    const/4 v0, 0x2

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    iget-object p1, p0, Lio/reactivex/rxjava3/processors/h$a;->this$0:Lio/reactivex/rxjava3/processors/h;

    const/4 v1, 0x1

    iput-boolean v1, p1, Lio/reactivex/rxjava3/processors/h;->l:Z

    return v0

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
