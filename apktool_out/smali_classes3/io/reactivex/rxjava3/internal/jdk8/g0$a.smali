.class final Lio/reactivex/rxjava3/internal/jdk8/g0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/disposables/e;
.implements Ljava/util/function/BiConsumer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/jdk8/g0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lio/reactivex/rxjava3/disposables/e;",
        "Ljava/util/function/BiConsumer<",
        "TT;",
        "Ljava/lang/Throwable;",
        ">;"
    }
.end annotation


# instance fields
.field final a:Lio/reactivex/rxjava3/core/u0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/core/u0<",
            "-TT;>;"
        }
    .end annotation
.end field

.field final b:Lio/reactivex/rxjava3/internal/jdk8/g$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/internal/jdk8/g$a<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lio/reactivex/rxjava3/core/u0;Lio/reactivex/rxjava3/internal/jdk8/g$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/u0<",
            "-TT;>;",
            "Lio/reactivex/rxjava3/internal/jdk8/g$a<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/jdk8/g0$a;->a:Lio/reactivex/rxjava3/core/u0;

    .line 5
    .line 6
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/jdk8/g0$a;->b:Lio/reactivex/rxjava3/internal/jdk8/g$a;

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
.method public a(Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/jdk8/g0$a;->a:Lio/reactivex/rxjava3/core/u0;

    .line 4
    .line 5
    invoke-interface {p1, p2}, Lio/reactivex/rxjava3/core/u0;->onError(Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    if-eqz p1, :cond_1

    .line 10
    .line 11
    iget-object p2, p0, Lio/reactivex/rxjava3/internal/jdk8/g0$a;->a:Lio/reactivex/rxjava3/core/u0;

    .line 12
    .line 13
    invoke-interface {p2, p1}, Lio/reactivex/rxjava3/core/u0;->onSuccess(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/jdk8/g0$a;->a:Lio/reactivex/rxjava3/core/u0;

    .line 18
    .line 19
    new-instance p2, Ljava/lang/NullPointerException;

    .line 20
    .line 21
    const-string v0, "The CompletionStage terminated with null."

    .line 22
    .line 23
    invoke-direct {p2, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p1, p2}, Lio/reactivex/rxjava3/core/u0;->onError(Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    return-void
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

.method public bridge synthetic accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/lang/Throwable;

    invoke-virtual {p0, p1, p2}, Lio/reactivex/rxjava3/internal/jdk8/g0$a;->a(Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public dispose()V
    .locals 2

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/jdk8/g0$a;->b:Lio/reactivex/rxjava3/internal/jdk8/g$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public isDisposed()Z
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/jdk8/g0$a;->b:Lio/reactivex/rxjava3/internal/jdk8/g$a;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
