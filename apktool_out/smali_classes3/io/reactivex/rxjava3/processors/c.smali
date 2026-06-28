.class public abstract Lio/reactivex/rxjava3/processors/c;
.super Lio/reactivex/rxjava3/core/o;
.source "SourceFile"

# interfaces
.implements Lorg/reactivestreams/n;
.implements Lio/reactivex/rxjava3/core/t;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/rxjava3/core/o<",
        "TT;>;",
        "Lorg/reactivestreams/n<",
        "TT;TT;>;",
        "Lio/reactivex/rxjava3/core/t<",
        "TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lio/reactivex/rxjava3/core/o;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract n9()Ljava/lang/Throwable;
    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/g;
    .end annotation
.end method

.method public abstract o9()Z
    .annotation runtime Ll3/d;
    .end annotation
.end method

.method public abstract p9()Z
    .annotation runtime Ll3/d;
    .end annotation
.end method

.method public abstract q9()Z
    .annotation runtime Ll3/d;
    .end annotation
.end method

.method public final r9()Lio/reactivex/rxjava3/processors/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/rxjava3/processors/c<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .line 1
    instance-of v0, p0, Lio/reactivex/rxjava3/processors/g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, Lio/reactivex/rxjava3/processors/g;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lio/reactivex/rxjava3/processors/g;-><init>(Lio/reactivex/rxjava3/processors/c;)V

    .line 9
    .line 10
    .line 11
    return-object v0
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
