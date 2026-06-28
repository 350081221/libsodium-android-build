.class final Lio/reactivex/rxjava3/internal/operators/flowable/o$a;
.super Lio/reactivex/rxjava3/subscribers/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/flowable/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "U::",
        "Ljava/util/Collection<",
        "-TT;>;B:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/rxjava3/subscribers/b<",
        "TB;>;"
    }
.end annotation


# instance fields
.field final b:Lio/reactivex/rxjava3/internal/operators/flowable/o$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/internal/operators/flowable/o$b<",
            "TT;TU;TB;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lio/reactivex/rxjava3/internal/operators/flowable/o$b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/internal/operators/flowable/o$b<",
            "TT;TU;TB;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lio/reactivex/rxjava3/subscribers/b;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/o$a;->b:Lio/reactivex/rxjava3/internal/operators/flowable/o$b;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
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
.end method


# virtual methods
.method public onComplete()V
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/o$a;->b:Lio/reactivex/rxjava3/internal/operators/flowable/o$b;

    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/operators/flowable/o$b;->onComplete()V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/o$a;->b:Lio/reactivex/rxjava3/internal/operators/flowable/o$b;

    invoke-virtual {v0, p1}, Lio/reactivex/rxjava3/internal/operators/flowable/o$b;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TB;)V"
        }
    .end annotation

    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/o$a;->b:Lio/reactivex/rxjava3/internal/operators/flowable/o$b;

    invoke-virtual {p1}, Lio/reactivex/rxjava3/internal/operators/flowable/o$b;->v()V

    return-void
.end method
