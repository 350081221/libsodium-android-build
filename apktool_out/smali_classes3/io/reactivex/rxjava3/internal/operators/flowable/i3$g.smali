.class final Lio/reactivex/rxjava3/internal/operators/flowable/i3$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm3/s;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/flowable/i3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lm3/s<",
        "Lio/reactivex/rxjava3/internal/operators/flowable/i3$f<",
        "TT;>;>;"
    }
.end annotation


# instance fields
.field final a:I

.field final b:Z


# direct methods
.method constructor <init>(IZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$g;->a:I

    .line 5
    .line 6
    iput-boolean p2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$g;->b:Z

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
.method public a()Lio/reactivex/rxjava3/internal/operators/flowable/i3$f;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/rxjava3/internal/operators/flowable/i3$f<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$l;

    iget v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$g;->a:I

    iget-boolean v2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$g;->b:Z

    invoke-direct {v0, v1, v2}, Lio/reactivex/rxjava3/internal/operators/flowable/i3$l;-><init>(IZ)V

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/flowable/i3$g;->a()Lio/reactivex/rxjava3/internal/operators/flowable/i3$f;

    move-result-object v0

    return-object v0
.end method
