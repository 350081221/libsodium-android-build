.class final Lio/reactivex/rxjava3/internal/operators/flowable/n3$b;
.super Lio/reactivex/rxjava3/internal/operators/flowable/n3$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/flowable/n3;
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
        "Lio/reactivex/rxjava3/internal/operators/flowable/n3$c<",
        "TT;>;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x63165c33f8fff493L


# direct methods
.method constructor <init>(Lorg/reactivestreams/p;JLjava/util/concurrent/TimeUnit;Lio/reactivex/rxjava3/core/q0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/reactivestreams/p<",
            "-TT;>;J",
            "Ljava/util/concurrent/TimeUnit;",
            "Lio/reactivex/rxjava3/core/q0;",
            ")V"
        }
    .end annotation

    invoke-direct/range {p0 .. p5}, Lio/reactivex/rxjava3/internal/operators/flowable/n3$c;-><init>(Lorg/reactivestreams/p;JLjava/util/concurrent/TimeUnit;Lio/reactivex/rxjava3/core/q0;)V

    return-void
.end method


# virtual methods
.method complete()V
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/n3$c;->downstream:Lorg/reactivestreams/p;

    invoke-interface {v0}, Lorg/reactivestreams/p;->onComplete()V

    return-void
.end method

.method public run()V
    .locals 0

    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/flowable/n3$c;->emit()V

    return-void
.end method
