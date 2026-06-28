.class public final Lio/reactivex/rxjava3/internal/operators/observable/n2;
.super Lio/reactivex/rxjava3/core/i0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/rxjava3/internal/operators/observable/n2$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/reactivex/rxjava3/core/i0<",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:I

.field private final b:J


# direct methods
.method public constructor <init>(II)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lio/reactivex/rxjava3/core/i0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/n2;->a:I

    .line 5
    .line 6
    int-to-long v0, p1

    .line 7
    int-to-long p1, p2

    .line 8
    add-long/2addr v0, p1

    .line 9
    iput-wide v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/n2;->b:J

    .line 10
    .line 11
    return-void
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
.method protected l6(Lio/reactivex/rxjava3/core/p0;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/p0<",
            "-",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v6, Lio/reactivex/rxjava3/internal/operators/observable/n2$a;

    .line 2
    .line 3
    iget v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/n2;->a:I

    .line 4
    .line 5
    int-to-long v2, v0

    .line 6
    iget-wide v4, p0, Lio/reactivex/rxjava3/internal/operators/observable/n2;->b:J

    .line 7
    .line 8
    move-object v0, v6

    .line 9
    move-object v1, p1

    .line 10
    invoke-direct/range {v0 .. v5}, Lio/reactivex/rxjava3/internal/operators/observable/n2$a;-><init>(Lio/reactivex/rxjava3/core/p0;JJ)V

    .line 11
    .line 12
    .line 13
    invoke-interface {p1, v6}, Lio/reactivex/rxjava3/core/p0;->onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v6}, Lio/reactivex/rxjava3/internal/operators/observable/n2$a;->run()V

    .line 17
    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method
