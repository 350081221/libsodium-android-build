.class final Lio/reactivex/rxjava3/subjects/j$a;
.super Lio/reactivex/rxjava3/internal/observers/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/subjects/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/reactivex/rxjava3/internal/observers/b<",
        "TT;>;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x6e022e8b5b1c1e37L


# instance fields
.field final synthetic this$0:Lio/reactivex/rxjava3/subjects/j;


# direct methods
.method constructor <init>(Lio/reactivex/rxjava3/subjects/j;)V
    .locals 0

    iput-object p1, p0, Lio/reactivex/rxjava3/subjects/j$a;->this$0:Lio/reactivex/rxjava3/subjects/j;

    invoke-direct {p0}, Lio/reactivex/rxjava3/internal/observers/b;-><init>()V

    return-void
.end method


# virtual methods
.method public clear()V
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/subjects/j$a;->this$0:Lio/reactivex/rxjava3/subjects/j;

    iget-object v0, v0, Lio/reactivex/rxjava3/subjects/j;->a:Lio/reactivex/rxjava3/internal/queue/c;

    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/queue/c;->clear()V

    return-void
.end method

.method public dispose()V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/subjects/j$a;->this$0:Lio/reactivex/rxjava3/subjects/j;

    .line 2
    .line 3
    iget-boolean v0, v0, Lio/reactivex/rxjava3/subjects/j;->e:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lio/reactivex/rxjava3/subjects/j$a;->this$0:Lio/reactivex/rxjava3/subjects/j;

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    iput-boolean v1, v0, Lio/reactivex/rxjava3/subjects/j;->e:Z

    .line 11
    .line 12
    iget-object v0, p0, Lio/reactivex/rxjava3/subjects/j$a;->this$0:Lio/reactivex/rxjava3/subjects/j;

    .line 13
    .line 14
    invoke-virtual {v0}, Lio/reactivex/rxjava3/subjects/j;->S8()V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lio/reactivex/rxjava3/subjects/j$a;->this$0:Lio/reactivex/rxjava3/subjects/j;

    .line 18
    .line 19
    iget-object v0, v0, Lio/reactivex/rxjava3/subjects/j;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lio/reactivex/rxjava3/subjects/j$a;->this$0:Lio/reactivex/rxjava3/subjects/j;

    .line 26
    .line 27
    iget-object v0, v0, Lio/reactivex/rxjava3/subjects/j;->i:Lio/reactivex/rxjava3/internal/observers/b;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_0

    .line 34
    .line 35
    iget-object v0, p0, Lio/reactivex/rxjava3/subjects/j$a;->this$0:Lio/reactivex/rxjava3/subjects/j;

    .line 36
    .line 37
    iget-object v0, v0, Lio/reactivex/rxjava3/subjects/j;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lio/reactivex/rxjava3/subjects/j$a;->this$0:Lio/reactivex/rxjava3/subjects/j;

    .line 43
    .line 44
    iget-boolean v1, v0, Lio/reactivex/rxjava3/subjects/j;->j:Z

    .line 45
    .line 46
    if-nez v1, :cond_0

    .line 47
    .line 48
    iget-object v0, v0, Lio/reactivex/rxjava3/subjects/j;->a:Lio/reactivex/rxjava3/internal/queue/c;

    .line 49
    .line 50
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/queue/c;->clear()V

    .line 51
    .line 52
    .line 53
    :cond_0
    return-void
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

.method public isDisposed()Z
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/subjects/j$a;->this$0:Lio/reactivex/rxjava3/subjects/j;

    iget-boolean v0, v0, Lio/reactivex/rxjava3/subjects/j;->e:Z

    return v0
.end method

.method public isEmpty()Z
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/subjects/j$a;->this$0:Lio/reactivex/rxjava3/subjects/j;

    iget-object v0, v0, Lio/reactivex/rxjava3/subjects/j;->a:Lio/reactivex/rxjava3/internal/queue/c;

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

    iget-object v0, p0, Lio/reactivex/rxjava3/subjects/j$a;->this$0:Lio/reactivex/rxjava3/subjects/j;

    iget-object v0, v0, Lio/reactivex/rxjava3/subjects/j;->a:Lio/reactivex/rxjava3/internal/queue/c;

    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/queue/c;->poll()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public requestFusion(I)I
    .locals 2

    const/4 v0, 0x2

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    iget-object p1, p0, Lio/reactivex/rxjava3/subjects/j$a;->this$0:Lio/reactivex/rxjava3/subjects/j;

    const/4 v1, 0x1

    iput-boolean v1, p1, Lio/reactivex/rxjava3/subjects/j;->j:Z

    return v0

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
