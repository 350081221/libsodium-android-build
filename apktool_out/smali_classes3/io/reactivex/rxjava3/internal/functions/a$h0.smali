.class final Lio/reactivex/rxjava3/internal/functions/a$h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm3/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/functions/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "h0"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lm3/o<",
        "TT;",
        "Lio/reactivex/rxjava3/schedulers/d<",
        "TT;>;>;"
    }
.end annotation


# instance fields
.field final a:Ljava/util/concurrent/TimeUnit;

.field final b:Lio/reactivex/rxjava3/core/q0;


# direct methods
.method constructor <init>(Ljava/util/concurrent/TimeUnit;Lio/reactivex/rxjava3/core/q0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/functions/a$h0;->a:Ljava/util/concurrent/TimeUnit;

    .line 5
    .line 6
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/functions/a$h0;->b:Lio/reactivex/rxjava3/core/q0;

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
.method public a(Ljava/lang/Object;)Lio/reactivex/rxjava3/schedulers/d;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lio/reactivex/rxjava3/schedulers/d<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lio/reactivex/rxjava3/schedulers/d;

    iget-object v1, p0, Lio/reactivex/rxjava3/internal/functions/a$h0;->b:Lio/reactivex/rxjava3/core/q0;

    iget-object v2, p0, Lio/reactivex/rxjava3/internal/functions/a$h0;->a:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, v2}, Lio/reactivex/rxjava3/core/q0;->d(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v1

    iget-object v3, p0, Lio/reactivex/rxjava3/internal/functions/a$h0;->a:Ljava/util/concurrent/TimeUnit;

    invoke-direct {v0, p1, v1, v2, v3}, Lio/reactivex/rxjava3/schedulers/d;-><init>(Ljava/lang/Object;JLjava/util/concurrent/TimeUnit;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/internal/functions/a$h0;->a(Ljava/lang/Object;)Lio/reactivex/rxjava3/schedulers/d;

    move-result-object p1

    return-object p1
.end method
