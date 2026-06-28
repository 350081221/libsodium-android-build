.class final Lio/reactivex/rxjava3/processors/f$c;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements Lorg/reactivestreams/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/processors/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/concurrent/atomic/AtomicInteger;",
        "Lorg/reactivestreams/q;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x679849349531b12L


# instance fields
.field volatile cancelled:Z

.field final downstream:Lorg/reactivestreams/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/reactivestreams/p<",
            "-TT;>;"
        }
    .end annotation
.end field

.field emitted:J

.field index:Ljava/lang/Object;

.field final requested:Ljava/util/concurrent/atomic/AtomicLong;

.field final state:Lio/reactivex/rxjava3/processors/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/processors/f<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lorg/reactivestreams/p;Lio/reactivex/rxjava3/processors/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/reactivestreams/p<",
            "-TT;>;",
            "Lio/reactivex/rxjava3/processors/f<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/processors/f$c;->downstream:Lorg/reactivestreams/p;

    .line 5
    .line 6
    iput-object p2, p0, Lio/reactivex/rxjava3/processors/f$c;->state:Lio/reactivex/rxjava3/processors/f;

    .line 7
    .line 8
    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    .line 9
    .line 10
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lio/reactivex/rxjava3/processors/f$c;->requested:Ljava/util/concurrent/atomic/AtomicLong;

    .line 14
    .line 15
    return-void
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


# virtual methods
.method public cancel()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/processors/f$c;->cancelled:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lio/reactivex/rxjava3/processors/f$c;->cancelled:Z

    .line 7
    .line 8
    iget-object v0, p0, Lio/reactivex/rxjava3/processors/f$c;->state:Lio/reactivex/rxjava3/processors/f;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Lio/reactivex/rxjava3/processors/f;->E9(Lio/reactivex/rxjava3/processors/f$c;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
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
    iget-object v0, p0, Lio/reactivex/rxjava3/processors/f$c;->requested:Ljava/util/concurrent/atomic/AtomicLong;

    .line 8
    .line 9
    invoke-static {v0, p1, p2}, Lio/reactivex/rxjava3/internal/util/d;->a(Ljava/util/concurrent/atomic/AtomicLong;J)J

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lio/reactivex/rxjava3/processors/f$c;->state:Lio/reactivex/rxjava3/processors/f;

    .line 13
    .line 14
    iget-object p1, p1, Lio/reactivex/rxjava3/processors/f;->b:Lio/reactivex/rxjava3/processors/f$b;

    .line 15
    .line 16
    invoke-interface {p1, p0}, Lio/reactivex/rxjava3/processors/f$b;->a(Lio/reactivex/rxjava3/processors/f$c;)V

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
