.class final Lio/reactivex/rxjava3/internal/operators/observable/s1$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm3/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/observable/s1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        "U:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lm3/o<",
        "TT;",
        "Lio/reactivex/rxjava3/core/n0<",
        "TR;>;>;"
    }
.end annotation


# instance fields
.field private final a:Lm3/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm3/c<",
            "-TT;-TU;+TR;>;"
        }
    .end annotation
.end field

.field private final b:Lm3/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm3/o<",
            "-TT;+",
            "Lio/reactivex/rxjava3/core/n0<",
            "+TU;>;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lm3/c;Lm3/o;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm3/c<",
            "-TT;-TU;+TR;>;",
            "Lm3/o<",
            "-TT;+",
            "Lio/reactivex/rxjava3/core/n0<",
            "+TU;>;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/s1$e;->a:Lm3/c;

    .line 5
    .line 6
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/operators/observable/s1$e;->b:Lm3/o;

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
.method public a(Ljava/lang/Object;)Lio/reactivex/rxjava3/core/n0;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lio/reactivex/rxjava3/core/n0<",
            "TR;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/s1$e;->b:Lm3/o;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lm3/o;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "The mapper returned a null ObservableSource"

    .line 8
    .line 9
    invoke-static {v0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    check-cast v0, Lio/reactivex/rxjava3/core/n0;

    .line 13
    .line 14
    new-instance v1, Lio/reactivex/rxjava3/internal/operators/observable/a2;

    .line 15
    .line 16
    new-instance v2, Lio/reactivex/rxjava3/internal/operators/observable/s1$d;

    .line 17
    .line 18
    iget-object v3, p0, Lio/reactivex/rxjava3/internal/operators/observable/s1$e;->a:Lm3/c;

    .line 19
    .line 20
    invoke-direct {v2, v3, p1}, Lio/reactivex/rxjava3/internal/operators/observable/s1$d;-><init>(Lm3/c;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {v1, v0, v2}, Lio/reactivex/rxjava3/internal/operators/observable/a2;-><init>(Lio/reactivex/rxjava3/core/n0;Lm3/o;)V

    .line 24
    .line 25
    .line 26
    return-object v1
    .line 27
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/internal/operators/observable/s1$e;->a(Ljava/lang/Object;)Lio/reactivex/rxjava3/core/n0;

    move-result-object p1

    return-object p1
.end method
