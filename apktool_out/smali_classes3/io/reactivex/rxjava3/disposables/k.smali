.class final Lio/reactivex/rxjava3/disposables/k;
.super Lio/reactivex/rxjava3/disposables/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/reactivex/rxjava3/disposables/h<",
        "Lorg/reactivestreams/q;",
        ">;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x9cfc6416eb4a343L


# direct methods
.method constructor <init>(Lorg/reactivestreams/q;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/reactivex/rxjava3/disposables/h;-><init>(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic onDisposed(Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Ll3/f;
        .end annotation
    .end param

    .line 1
    check-cast p1, Lorg/reactivestreams/q;

    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/disposables/k;->onDisposed(Lorg/reactivestreams/q;)V

    return-void
.end method

.method protected onDisposed(Lorg/reactivestreams/q;)V
    .locals 0
    .param p1    # Lorg/reactivestreams/q;
        .annotation build Ll3/f;
        .end annotation
    .end param

    .line 2
    invoke-interface {p1}, Lorg/reactivestreams/q;->cancel()V

    return-void
.end method
