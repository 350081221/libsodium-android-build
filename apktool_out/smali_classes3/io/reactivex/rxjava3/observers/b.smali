.class public abstract Lio/reactivex/rxjava3/observers/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/core/p0;


# annotations
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
.field private a:Lio/reactivex/rxjava3/disposables/e;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method protected final a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/observers/b;->a:Lio/reactivex/rxjava3/disposables/e;

    .line 2
    .line 3
    sget-object v1, Lio/reactivex/rxjava3/internal/disposables/c;->DISPOSED:Lio/reactivex/rxjava3/internal/disposables/c;

    .line 4
    .line 5
    iput-object v1, p0, Lio/reactivex/rxjava3/observers/b;->a:Lio/reactivex/rxjava3/disposables/e;

    .line 6
    .line 7
    invoke-interface {v0}, Lio/reactivex/rxjava3/disposables/e;->dispose()V

    .line 8
    .line 9
    .line 10
    return-void
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
.end method

.method protected b()V
    .locals 0

    return-void
.end method

.method public final onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V
    .locals 2
    .param p1    # Lio/reactivex/rxjava3/disposables/e;
        .annotation build Ll3/f;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/observers/b;->a:Lio/reactivex/rxjava3/disposables/e;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {v0, p1, v1}, Lio/reactivex/rxjava3/internal/util/i;->e(Lio/reactivex/rxjava3/disposables/e;Lio/reactivex/rxjava3/disposables/e;Ljava/lang/Class;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iput-object p1, p0, Lio/reactivex/rxjava3/observers/b;->a:Lio/reactivex/rxjava3/disposables/e;

    .line 14
    .line 15
    invoke-virtual {p0}, Lio/reactivex/rxjava3/observers/b;->b()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
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
