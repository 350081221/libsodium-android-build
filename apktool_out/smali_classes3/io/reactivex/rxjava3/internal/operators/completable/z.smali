.class public final Lio/reactivex/rxjava3/internal/operators/completable/z;
.super Lio/reactivex/rxjava3/core/c;
.source "SourceFile"


# instance fields
.field final a:Lio/reactivex/rxjava3/core/i;

.field final b:Lio/reactivex/rxjava3/core/h;


# direct methods
.method public constructor <init>(Lio/reactivex/rxjava3/core/i;Lio/reactivex/rxjava3/core/h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lio/reactivex/rxjava3/core/c;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/completable/z;->a:Lio/reactivex/rxjava3/core/i;

    .line 5
    .line 6
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/operators/completable/z;->b:Lio/reactivex/rxjava3/core/h;

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
.method protected Y0(Lio/reactivex/rxjava3/core/f;)V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/completable/z;->b:Lio/reactivex/rxjava3/core/h;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lio/reactivex/rxjava3/core/h;->a(Lio/reactivex/rxjava3/core/f;)Lio/reactivex/rxjava3/core/f;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/completable/z;->a:Lio/reactivex/rxjava3/core/i;

    .line 8
    .line 9
    invoke-interface {v0, p1}, Lio/reactivex/rxjava3/core/i;->a(Lio/reactivex/rxjava3/core/f;)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception p1

    .line 14
    invoke-static {p1}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    invoke-static {p1}, Lio/reactivex/rxjava3/plugins/a;->Y(Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    :goto_0
    return-void

    .line 21
    :catch_0
    move-exception p1

    .line 22
    throw p1
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method
