.class final Lio/reactivex/rxjava3/internal/operators/completable/o0$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/core/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/completable/o0$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lio/reactivex/rxjava3/internal/operators/completable/o0$a;


# direct methods
.method constructor <init>(Lio/reactivex/rxjava3/internal/operators/completable/o0$a;)V
    .locals 0

    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/completable/o0$a$a;->a:Lio/reactivex/rxjava3/internal/operators/completable/o0$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onComplete()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/completable/o0$a$a;->a:Lio/reactivex/rxjava3/internal/operators/completable/o0$a;

    .line 2
    .line 3
    iget-object v0, v0, Lio/reactivex/rxjava3/internal/operators/completable/o0$a;->b:Lio/reactivex/rxjava3/disposables/c;

    .line 4
    .line 5
    invoke-virtual {v0}, Lio/reactivex/rxjava3/disposables/c;->dispose()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/completable/o0$a$a;->a:Lio/reactivex/rxjava3/internal/operators/completable/o0$a;

    .line 9
    .line 10
    iget-object v0, v0, Lio/reactivex/rxjava3/internal/operators/completable/o0$a;->c:Lio/reactivex/rxjava3/core/f;

    .line 11
    .line 12
    invoke-interface {v0}, Lio/reactivex/rxjava3/core/f;->onComplete()V

    .line 13
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
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/completable/o0$a$a;->a:Lio/reactivex/rxjava3/internal/operators/completable/o0$a;

    .line 2
    .line 3
    iget-object v0, v0, Lio/reactivex/rxjava3/internal/operators/completable/o0$a;->b:Lio/reactivex/rxjava3/disposables/c;

    .line 4
    .line 5
    invoke-virtual {v0}, Lio/reactivex/rxjava3/disposables/c;->dispose()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/completable/o0$a$a;->a:Lio/reactivex/rxjava3/internal/operators/completable/o0$a;

    .line 9
    .line 10
    iget-object v0, v0, Lio/reactivex/rxjava3/internal/operators/completable/o0$a;->c:Lio/reactivex/rxjava3/core/f;

    .line 11
    .line 12
    invoke-interface {v0, p1}, Lio/reactivex/rxjava3/core/f;->onError(Ljava/lang/Throwable;)V

    .line 13
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
.end method

.method public onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/completable/o0$a$a;->a:Lio/reactivex/rxjava3/internal/operators/completable/o0$a;

    iget-object v0, v0, Lio/reactivex/rxjava3/internal/operators/completable/o0$a;->b:Lio/reactivex/rxjava3/disposables/c;

    invoke-virtual {v0, p1}, Lio/reactivex/rxjava3/disposables/c;->b(Lio/reactivex/rxjava3/disposables/e;)Z

    return-void
.end method
