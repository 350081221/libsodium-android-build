.class final Lio/reactivex/rxjava3/internal/operators/observable/n3$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/core/p0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/observable/n3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lio/reactivex/rxjava3/core/p0<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final a:Lio/reactivex/rxjava3/core/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/core/p0<",
            "-TT;>;"
        }
    .end annotation
.end field

.field final b:Lio/reactivex/rxjava3/internal/disposables/a;

.field c:Lio/reactivex/rxjava3/disposables/e;

.field volatile d:Z

.field e:Z


# direct methods
.method constructor <init>(Lio/reactivex/rxjava3/core/p0;Lio/reactivex/rxjava3/internal/disposables/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/p0<",
            "-TT;>;",
            "Lio/reactivex/rxjava3/internal/disposables/a;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/n3$b;->a:Lio/reactivex/rxjava3/core/p0;

    .line 5
    .line 6
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/operators/observable/n3$b;->b:Lio/reactivex/rxjava3/internal/disposables/a;

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
.method public onComplete()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/n3$b;->b:Lio/reactivex/rxjava3/internal/disposables/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/disposables/a;->dispose()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/n3$b;->a:Lio/reactivex/rxjava3/core/p0;

    .line 7
    .line 8
    invoke-interface {v0}, Lio/reactivex/rxjava3/core/p0;->onComplete()V

    .line 9
    .line 10
    .line 11
    return-void
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
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/n3$b;->b:Lio/reactivex/rxjava3/internal/disposables/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/disposables/a;->dispose()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/n3$b;->a:Lio/reactivex/rxjava3/core/p0;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Lio/reactivex/rxjava3/core/p0;->onError(Ljava/lang/Throwable;)V

    .line 9
    .line 10
    .line 11
    return-void
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
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/n3$b;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/n3$b;->a:Lio/reactivex/rxjava3/core/p0;

    .line 6
    .line 7
    invoke-interface {v0, p1}, Lio/reactivex/rxjava3/core/p0;->onNext(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/n3$b;->d:Z

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    iput-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/n3$b;->e:Z

    .line 17
    .line 18
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/n3$b;->a:Lio/reactivex/rxjava3/core/p0;

    .line 19
    .line 20
    invoke-interface {v0, p1}, Lio/reactivex/rxjava3/core/p0;->onNext(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    :cond_1
    :goto_0
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/n3$b;->c:Lio/reactivex/rxjava3/disposables/e;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lio/reactivex/rxjava3/internal/disposables/c;->validate(Lio/reactivex/rxjava3/disposables/e;Lio/reactivex/rxjava3/disposables/e;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/n3$b;->c:Lio/reactivex/rxjava3/disposables/e;

    .line 10
    .line 11
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/n3$b;->b:Lio/reactivex/rxjava3/internal/disposables/a;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {v0, v1, p1}, Lio/reactivex/rxjava3/internal/disposables/a;->setResource(ILio/reactivex/rxjava3/disposables/e;)Z

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
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
