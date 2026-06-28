.class public interface abstract Lio/reactivex/rxjava3/internal/observers/u;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# virtual methods
.method public abstract drain()V
.end method

.method public abstract innerComplete(Lio/reactivex/rxjava3/internal/observers/t;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/internal/observers/t<",
            "TT;>;)V"
        }
    .end annotation
.end method

.method public abstract innerError(Lio/reactivex/rxjava3/internal/observers/t;Ljava/lang/Throwable;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/internal/observers/t<",
            "TT;>;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation
.end method

.method public abstract innerNext(Lio/reactivex/rxjava3/internal/observers/t;Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/internal/observers/t<",
            "TT;>;TT;)V"
        }
    .end annotation
.end method
