.class final Lio/reactivex/rxjava3/internal/operators/flowable/d$a;
.super Lio/reactivex/rxjava3/subscribers/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/flowable/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/rxjava3/internal/operators/flowable/d$a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/rxjava3/subscribers/a<",
        "TT;>;"
    }
.end annotation


# instance fields
.field volatile b:Ljava/lang/Object;


# direct methods
.method constructor <init>(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lio/reactivex/rxjava3/subscribers/a;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lio/reactivex/rxjava3/internal/util/q;->next(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/d$a;->b:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
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
.method public d()Lio/reactivex/rxjava3/internal/operators/flowable/d$a$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/rxjava3/internal/operators/flowable/d$a<",
            "TT;>.a;"
        }
    .end annotation

    new-instance v0, Lio/reactivex/rxjava3/internal/operators/flowable/d$a$a;

    invoke-direct {v0, p0}, Lio/reactivex/rxjava3/internal/operators/flowable/d$a$a;-><init>(Lio/reactivex/rxjava3/internal/operators/flowable/d$a;)V

    return-object v0
.end method

.method public onComplete()V
    .locals 1

    invoke-static {}, Lio/reactivex/rxjava3/internal/util/q;->complete()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/d$a;->b:Ljava/lang/Object;

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p1}, Lio/reactivex/rxjava3/internal/util/q;->error(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/d$a;->b:Ljava/lang/Object;

    return-void
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    invoke-static {p1}, Lio/reactivex/rxjava3/internal/util/q;->next(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/d$a;->b:Ljava/lang/Object;

    return-void
.end method
