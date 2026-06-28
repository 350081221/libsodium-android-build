.class public final Lio/reactivex/rxjava3/internal/operators/completable/g;
.super Lio/reactivex/rxjava3/core/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/rxjava3/internal/operators/completable/g$a;
    }
.end annotation


# instance fields
.field final a:Lio/reactivex/rxjava3/core/g;


# direct methods
.method public constructor <init>(Lio/reactivex/rxjava3/core/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lio/reactivex/rxjava3/core/c;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/completable/g;->a:Lio/reactivex/rxjava3/core/g;

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
.method protected Y0(Lio/reactivex/rxjava3/core/f;)V
    .locals 1

    .line 1
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/completable/g$a;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lio/reactivex/rxjava3/internal/operators/completable/g$a;-><init>(Lio/reactivex/rxjava3/core/f;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, v0}, Lio/reactivex/rxjava3/core/f;->onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V

    .line 7
    .line 8
    .line 9
    :try_start_0
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/completable/g;->a:Lio/reactivex/rxjava3/core/g;

    .line 10
    .line 11
    invoke-interface {p1, v0}, Lio/reactivex/rxjava3/core/g;->a(Lio/reactivex/rxjava3/core/e;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception p1

    .line 16
    invoke-static {p1}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p1}, Lio/reactivex/rxjava3/internal/operators/completable/g$a;->onError(Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    :goto_0
    return-void
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method
