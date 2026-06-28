.class public interface abstract Lio/reactivex/rxjava3/core/e;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract isDisposed()Z
.end method

.method public abstract onComplete()V
.end method

.method public abstract onError(Ljava/lang/Throwable;)V
    .param p1    # Ljava/lang/Throwable;
        .annotation build Ll3/f;
        .end annotation
    .end param
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
