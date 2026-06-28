.class abstract Lio/reactivex/rxjava3/internal/operators/parallel/e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/internal/fuseable/c;
.implements Lorg/reactivestreams/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/parallel/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lio/reactivex/rxjava3/internal/fuseable/c<",
        "TT;>;",
        "Lorg/reactivestreams/q;"
    }
.end annotation


# instance fields
.field final a:Lm3/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm3/r<",
            "-TT;>;"
        }
    .end annotation
.end field

.field final b:Lm3/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm3/c<",
            "-",
            "Ljava/lang/Long;",
            "-",
            "Ljava/lang/Throwable;",
            "Lio/reactivex/rxjava3/parallel/a;",
            ">;"
        }
    .end annotation
.end field

.field c:Lorg/reactivestreams/q;

.field d:Z


# direct methods
.method constructor <init>(Lm3/r;Lm3/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm3/r<",
            "-TT;>;",
            "Lm3/c<",
            "-",
            "Ljava/lang/Long;",
            "-",
            "Ljava/lang/Throwable;",
            "Lio/reactivex/rxjava3/parallel/a;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/parallel/e$b;->a:Lm3/r;

    .line 5
    .line 6
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/operators/parallel/e$b;->b:Lm3/c;

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
.method public final cancel()V
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/parallel/e$b;->c:Lorg/reactivestreams/q;

    invoke-interface {v0}, Lorg/reactivestreams/q;->cancel()V

    return-void
.end method

.method public final onNext(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p0, p1}, Lio/reactivex/rxjava3/internal/fuseable/c;->tryOnNext(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    iget-boolean p1, p0, Lio/reactivex/rxjava3/internal/operators/parallel/e$b;->d:Z

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/parallel/e$b;->c:Lorg/reactivestreams/q;

    .line 12
    .line 13
    const-wide/16 v0, 0x1

    .line 14
    .line 15
    invoke-interface {p1, v0, v1}, Lorg/reactivestreams/q;->request(J)V

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

.method public final request(J)V
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/parallel/e$b;->c:Lorg/reactivestreams/q;

    invoke-interface {v0, p1, p2}, Lorg/reactivestreams/q;->request(J)V

    return-void
.end method
