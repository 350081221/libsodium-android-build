.class public final Lio/reactivex/rxjava3/internal/operators/maybe/a1;
.super Lio/reactivex/rxjava3/core/x;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/reactivex/rxjava3/core/x<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lio/reactivex/rxjava3/internal/operators/maybe/a1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/reactivex/rxjava3/internal/operators/maybe/a1;

    invoke-direct {v0}, Lio/reactivex/rxjava3/internal/operators/maybe/a1;-><init>()V

    sput-object v0, Lio/reactivex/rxjava3/internal/operators/maybe/a1;->a:Lio/reactivex/rxjava3/internal/operators/maybe/a1;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lio/reactivex/rxjava3/core/x;-><init>()V

    return-void
.end method


# virtual methods
.method protected U1(Lio/reactivex/rxjava3/core/a0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/a0<",
            "-",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lio/reactivex/rxjava3/internal/disposables/d;->NEVER:Lio/reactivex/rxjava3/internal/disposables/d;

    invoke-interface {p1, v0}, Lio/reactivex/rxjava3/core/a0;->onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V

    return-void
.end method
