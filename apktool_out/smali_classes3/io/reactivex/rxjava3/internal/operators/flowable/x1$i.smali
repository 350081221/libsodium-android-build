.class final Lio/reactivex/rxjava3/internal/operators/flowable/x1$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm3/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/flowable/x1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "i"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "S:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lm3/c<",
        "TS;",
        "Lio/reactivex/rxjava3/core/k<",
        "TT;>;TS;>;"
    }
.end annotation


# instance fields
.field final a:Lm3/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm3/b<",
            "TS;",
            "Lio/reactivex/rxjava3/core/k<",
            "TT;>;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lm3/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm3/b<",
            "TS;",
            "Lio/reactivex/rxjava3/core/k<",
            "TT;>;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/x1$i;->a:Lm3/b;

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
.method public a(Ljava/lang/Object;Lio/reactivex/rxjava3/core/k;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TS;",
            "Lio/reactivex/rxjava3/core/k<",
            "TT;>;)TS;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/x1$i;->a:Lm3/b;

    invoke-interface {v0, p1, p2}, Lm3/b;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    check-cast p2, Lio/reactivex/rxjava3/core/k;

    invoke-virtual {p0, p1, p2}, Lio/reactivex/rxjava3/internal/operators/flowable/x1$i;->a(Ljava/lang/Object;Lio/reactivex/rxjava3/core/k;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
