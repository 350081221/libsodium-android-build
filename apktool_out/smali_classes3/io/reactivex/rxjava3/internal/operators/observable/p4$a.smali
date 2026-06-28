.class final Lio/reactivex/rxjava3/internal/operators/observable/p4$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm3/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/observable/p4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm3/o<",
        "TT;TR;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lio/reactivex/rxjava3/internal/operators/observable/p4;


# direct methods
.method constructor <init>(Lio/reactivex/rxjava3/internal/operators/observable/p4;)V
    .locals 0

    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/p4$a;->a:Lio/reactivex/rxjava3/internal/operators/observable/p4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)TR;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/p4$a;->a:Lio/reactivex/rxjava3/internal/operators/observable/p4;

    iget-object v0, v0, Lio/reactivex/rxjava3/internal/operators/observable/p4;->d:Lm3/o;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-interface {v0, v1}, Lm3/o;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "The combiner returned a null value"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    return-object p1
.end method
