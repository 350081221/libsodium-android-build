.class public final Lio/reactivex/rxjava3/internal/operators/single/l0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/rxjava3/internal/operators/single/l0$c;,
        Lio/reactivex/rxjava3/internal/operators/single/l0$d;,
        Lio/reactivex/rxjava3/internal/operators/single/l0$b;,
        Lio/reactivex/rxjava3/internal/operators/single/l0$a;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 5
    .line 6
    const-string v1, "No instances!"

    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    throw v0
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
.end method

.method public static a()Lm3/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lm3/s<",
            "Ljava/util/NoSuchElementException;",
            ">;"
        }
    .end annotation

    sget-object v0, Lio/reactivex/rxjava3/internal/operators/single/l0$a;->INSTANCE:Lio/reactivex/rxjava3/internal/operators/single/l0$a;

    return-object v0
.end method

.method public static b(Ljava/lang/Iterable;)Ljava/lang/Iterable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Iterable<",
            "+",
            "Lio/reactivex/rxjava3/core/x0<",
            "+TT;>;>;)",
            "Ljava/lang/Iterable<",
            "+",
            "Lio/reactivex/rxjava3/core/o<",
            "TT;>;>;"
        }
    .end annotation

    new-instance v0, Lio/reactivex/rxjava3/internal/operators/single/l0$c;

    invoke-direct {v0, p0}, Lio/reactivex/rxjava3/internal/operators/single/l0$c;-><init>(Ljava/lang/Iterable;)V

    return-object v0
.end method

.method public static c()Lm3/o;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Lm3/o<",
            "Lio/reactivex/rxjava3/core/x0<",
            "+TT;>;",
            "Lorg/reactivestreams/o<",
            "+TT;>;>;"
        }
    .end annotation

    sget-object v0, Lio/reactivex/rxjava3/internal/operators/single/l0$b;->INSTANCE:Lio/reactivex/rxjava3/internal/operators/single/l0$b;

    return-object v0
.end method
