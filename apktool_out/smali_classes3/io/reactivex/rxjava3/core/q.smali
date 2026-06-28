.class public interface abstract Lio/reactivex/rxjava3/core/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/core/k;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lio/reactivex/rxjava3/core/k<",
        "TT;>;"
    }
.end annotation


# virtual methods
.method public abstract isCancelled()Z
.end method

.method public abstract requested()J
.end method

.method public abstract serialize()Lio/reactivex/rxjava3/core/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/rxjava3/core/q<",
            "TT;>;"
        }
    .end annotation

    .annotation build Ll3/f;
    .end annotation
.end method

.method public abstract setCancellable(Lm3/f;)V
    .param p1    # Lm3/f;
        .annotation build Ll3/g;
        .end annotation
    .end param
.end method

.method public abstract setDisposable(Lio/reactivex/rxjava3/disposables/e;)V
    .param p1    # Lio/reactivex/rxjava3/disposables/e;
        .annotation build Ll3/g;
        .end annotation
    .end param
.end method

.method public abstract tryOnError(Ljava/lang/Throwable;)Z
    .param p1    # Ljava/lang/Throwable;
        .annotation build Ll3/f;
        .end annotation
    .end param
.end method
