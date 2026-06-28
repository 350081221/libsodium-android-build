.class final Lio/reactivex/rxjava3/internal/operators/maybe/i0$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/core/a0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/maybe/i0$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/reactivex/rxjava3/core/a0<",
        "TR;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lio/reactivex/rxjava3/internal/operators/maybe/i0$a;


# direct methods
.method constructor <init>(Lio/reactivex/rxjava3/internal/operators/maybe/i0$a;)V
    .locals 0

    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/maybe/i0$a$a;->a:Lio/reactivex/rxjava3/internal/operators/maybe/i0$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onComplete()V
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/i0$a$a;->a:Lio/reactivex/rxjava3/internal/operators/maybe/i0$a;

    iget-object v0, v0, Lio/reactivex/rxjava3/internal/operators/maybe/i0$a;->downstream:Lio/reactivex/rxjava3/core/a0;

    invoke-interface {v0}, Lio/reactivex/rxjava3/core/a0;->onComplete()V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/i0$a$a;->a:Lio/reactivex/rxjava3/internal/operators/maybe/i0$a;

    iget-object v0, v0, Lio/reactivex/rxjava3/internal/operators/maybe/i0$a;->downstream:Lio/reactivex/rxjava3/core/a0;

    invoke-interface {v0, p1}, Lio/reactivex/rxjava3/core/a0;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/i0$a$a;->a:Lio/reactivex/rxjava3/internal/operators/maybe/i0$a;

    invoke-static {v0, p1}, Lio/reactivex/rxjava3/internal/disposables/c;->setOnce(Ljava/util/concurrent/atomic/AtomicReference;Lio/reactivex/rxjava3/disposables/e;)Z

    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TR;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/i0$a$a;->a:Lio/reactivex/rxjava3/internal/operators/maybe/i0$a;

    iget-object v0, v0, Lio/reactivex/rxjava3/internal/operators/maybe/i0$a;->downstream:Lio/reactivex/rxjava3/core/a0;

    invoke-interface {v0, p1}, Lio/reactivex/rxjava3/core/a0;->onSuccess(Ljava/lang/Object;)V

    return-void
.end method
