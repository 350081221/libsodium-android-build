.class final Lio/reactivex/rxjava3/internal/operators/maybe/w1$c;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/core/a0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/maybe/w1;
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
        "Ljava/util/concurrent/atomic/AtomicReference<",
        "Lio/reactivex/rxjava3/disposables/e;",
        ">;",
        "Lio/reactivex/rxjava3/core/a0<",
        "TT;>;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x2e204f2d0e121106L


# instance fields
.field final index:I

.field final parent:Lio/reactivex/rxjava3/internal/operators/maybe/w1$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/internal/operators/maybe/w1$b<",
            "TT;*>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lio/reactivex/rxjava3/internal/operators/maybe/w1$b;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/internal/operators/maybe/w1$b<",
            "TT;*>;I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/maybe/w1$c;->parent:Lio/reactivex/rxjava3/internal/operators/maybe/w1$b;

    .line 5
    .line 6
    iput p2, p0, Lio/reactivex/rxjava3/internal/operators/maybe/w1$c;->index:I

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


# virtual methods
.method public dispose()V
    .locals 0

    invoke-static {p0}, Lio/reactivex/rxjava3/internal/disposables/c;->dispose(Ljava/util/concurrent/atomic/AtomicReference;)Z

    return-void
.end method

.method public onComplete()V
    .locals 2

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/w1$c;->parent:Lio/reactivex/rxjava3/internal/operators/maybe/w1$b;

    iget v1, p0, Lio/reactivex/rxjava3/internal/operators/maybe/w1$c;->index:I

    invoke-virtual {v0, v1}, Lio/reactivex/rxjava3/internal/operators/maybe/w1$b;->innerComplete(I)V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/w1$c;->parent:Lio/reactivex/rxjava3/internal/operators/maybe/w1$b;

    iget v1, p0, Lio/reactivex/rxjava3/internal/operators/maybe/w1$c;->index:I

    invoke-virtual {v0, p1, v1}, Lio/reactivex/rxjava3/internal/operators/maybe/w1$b;->innerError(Ljava/lang/Throwable;I)V

    return-void
.end method

.method public onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V
    .locals 0

    invoke-static {p0, p1}, Lio/reactivex/rxjava3/internal/disposables/c;->setOnce(Ljava/util/concurrent/atomic/AtomicReference;Lio/reactivex/rxjava3/disposables/e;)Z

    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/w1$c;->parent:Lio/reactivex/rxjava3/internal/operators/maybe/w1$b;

    iget v1, p0, Lio/reactivex/rxjava3/internal/operators/maybe/w1$c;->index:I

    invoke-virtual {v0, p1, v1}, Lio/reactivex/rxjava3/internal/operators/maybe/w1$b;->innerSuccess(Ljava/lang/Object;I)V

    return-void
.end method
