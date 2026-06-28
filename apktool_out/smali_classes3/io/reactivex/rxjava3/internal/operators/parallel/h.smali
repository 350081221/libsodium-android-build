.class public final Lio/reactivex/rxjava3/internal/operators/parallel/h;
.super Lio/reactivex/rxjava3/parallel/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/rxjava3/parallel/b<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final a:[Lorg/reactivestreams/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lorg/reactivestreams/o<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>([Lorg/reactivestreams/o;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lorg/reactivestreams/o<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lio/reactivex/rxjava3/parallel/b;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/parallel/h;->a:[Lorg/reactivestreams/o;

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
.method public M()I
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/parallel/h;->a:[Lorg/reactivestreams/o;

    array-length v0, v0

    return v0
.end method

.method public X([Lorg/reactivestreams/p;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lorg/reactivestreams/p<",
            "-TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/parallel/b;->b0([Lorg/reactivestreams/p;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    array-length v0, p1

    .line 9
    const/4 v1, 0x0

    .line 10
    :goto_0
    if-ge v1, v0, :cond_1

    .line 11
    .line 12
    iget-object v2, p0, Lio/reactivex/rxjava3/internal/operators/parallel/h;->a:[Lorg/reactivestreams/o;

    .line 13
    .line 14
    aget-object v2, v2, v1

    .line 15
    .line 16
    aget-object v3, p1, v1

    .line 17
    .line 18
    invoke-interface {v2, v3}, Lorg/reactivestreams/o;->subscribe(Lorg/reactivestreams/p;)V

    .line 19
    .line 20
    .line 21
    add-int/lit8 v1, v1, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    return-void
    .line 25
    .line 26
    .line 27
.end method
