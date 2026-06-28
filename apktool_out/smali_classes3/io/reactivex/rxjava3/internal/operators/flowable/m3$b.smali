.class final Lio/reactivex/rxjava3/internal/operators/flowable/m3$b;
.super Lio/reactivex/rxjava3/internal/operators/flowable/m3$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/flowable/m3;
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
        "Lio/reactivex/rxjava3/internal/operators/flowable/m3$c<",
        "TT;>;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x2a0bdab9530de829L


# direct methods
.method constructor <init>(Lorg/reactivestreams/p;Lorg/reactivestreams/o;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/reactivestreams/p<",
            "-TT;>;",
            "Lorg/reactivestreams/o<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Lio/reactivex/rxjava3/internal/operators/flowable/m3$c;-><init>(Lorg/reactivestreams/p;Lorg/reactivestreams/o;)V

    return-void
.end method


# virtual methods
.method completion()V
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/m3$c;->downstream:Lorg/reactivestreams/p;

    invoke-interface {v0}, Lorg/reactivestreams/p;->onComplete()V

    return-void
.end method

.method run()V
    .locals 0

    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/flowable/m3$c;->emit()V

    return-void
.end method
