.class public final Lio/reactivex/rxjava3/internal/operators/maybe/w;
.super Lio/reactivex/rxjava3/core/x;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/internal/fuseable/o;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/reactivex/rxjava3/core/x<",
        "Ljava/lang/Object;",
        ">;",
        "Lio/reactivex/rxjava3/internal/fuseable/o<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lio/reactivex/rxjava3/internal/operators/maybe/w;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/reactivex/rxjava3/internal/operators/maybe/w;

    invoke-direct {v0}, Lio/reactivex/rxjava3/internal/operators/maybe/w;-><init>()V

    sput-object v0, Lio/reactivex/rxjava3/internal/operators/maybe/w;->a:Lio/reactivex/rxjava3/internal/operators/maybe/w;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lio/reactivex/rxjava3/core/x;-><init>()V

    return-void
.end method


# virtual methods
.method protected U1(Lio/reactivex/rxjava3/core/a0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/a0<",
            "-",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-static {p1}, Lio/reactivex/rxjava3/internal/disposables/d;->complete(Lio/reactivex/rxjava3/core/a0;)V

    return-void
.end method

.method public get()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
