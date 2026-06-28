.class Lio/reactivex/rxjava3/internal/schedulers/q$c;
.super Lio/reactivex/rxjava3/internal/schedulers/q$f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/schedulers/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field private final action:Ljava/lang/Runnable;


# direct methods
.method constructor <init>(Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lio/reactivex/rxjava3/internal/schedulers/q$f;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/schedulers/q$c;->action:Ljava/lang/Runnable;

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
.method protected callActual(Lio/reactivex/rxjava3/core/q0$c;Lio/reactivex/rxjava3/core/f;)Lio/reactivex/rxjava3/disposables/e;
    .locals 2

    new-instance v0, Lio/reactivex/rxjava3/internal/schedulers/q$d;

    iget-object v1, p0, Lio/reactivex/rxjava3/internal/schedulers/q$c;->action:Ljava/lang/Runnable;

    invoke-direct {v0, v1, p2}, Lio/reactivex/rxjava3/internal/schedulers/q$d;-><init>(Ljava/lang/Runnable;Lio/reactivex/rxjava3/core/f;)V

    invoke-virtual {p1, v0}, Lio/reactivex/rxjava3/core/q0$c;->b(Ljava/lang/Runnable;)Lio/reactivex/rxjava3/disposables/e;

    move-result-object p1

    return-object p1
.end method
