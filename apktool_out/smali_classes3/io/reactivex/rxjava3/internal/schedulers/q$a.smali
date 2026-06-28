.class final Lio/reactivex/rxjava3/internal/schedulers/q$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm3/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/schedulers/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/rxjava3/internal/schedulers/q$a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm3/o<",
        "Lio/reactivex/rxjava3/internal/schedulers/q$f;",
        "Lio/reactivex/rxjava3/core/c;",
        ">;"
    }
.end annotation


# instance fields
.field final a:Lio/reactivex/rxjava3/core/q0$c;


# direct methods
.method constructor <init>(Lio/reactivex/rxjava3/core/q0$c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/schedulers/q$a;->a:Lio/reactivex/rxjava3/core/q0$c;

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
.method public a(Lio/reactivex/rxjava3/internal/schedulers/q$f;)Lio/reactivex/rxjava3/core/c;
    .locals 1

    new-instance v0, Lio/reactivex/rxjava3/internal/schedulers/q$a$a;

    invoke-direct {v0, p0, p1}, Lio/reactivex/rxjava3/internal/schedulers/q$a$a;-><init>(Lio/reactivex/rxjava3/internal/schedulers/q$a;Lio/reactivex/rxjava3/internal/schedulers/q$f;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    check-cast p1, Lio/reactivex/rxjava3/internal/schedulers/q$f;

    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/internal/schedulers/q$a;->a(Lio/reactivex/rxjava3/internal/schedulers/q$f;)Lio/reactivex/rxjava3/core/c;

    move-result-object p1

    return-object p1
.end method
