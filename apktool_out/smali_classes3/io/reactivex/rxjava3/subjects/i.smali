.class public abstract Lio/reactivex/rxjava3/subjects/i;
.super Lio/reactivex/rxjava3/core/i0;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/core/p0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/rxjava3/core/i0<",
        "TT;>;",
        "Lio/reactivex/rxjava3/core/p0<",
        "TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lio/reactivex/rxjava3/core/i0;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract I8()Ljava/lang/Throwable;
    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/g;
    .end annotation
.end method

.method public abstract J8()Z
    .annotation runtime Ll3/d;
    .end annotation
.end method

.method public abstract K8()Z
    .annotation runtime Ll3/d;
    .end annotation
.end method

.method public abstract L8()Z
    .annotation runtime Ll3/d;
    .end annotation
.end method

.method public final M8()Lio/reactivex/rxjava3/subjects/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/rxjava3/subjects/i<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .line 1
    instance-of v0, p0, Lio/reactivex/rxjava3/subjects/g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, Lio/reactivex/rxjava3/subjects/g;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lio/reactivex/rxjava3/subjects/g;-><init>(Lio/reactivex/rxjava3/subjects/i;)V

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
