.class public final Lio/reactivex/rxjava3/internal/operators/observable/t0;
.super Lio/reactivex/rxjava3/core/i0;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/internal/fuseable/o;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/reactivex/rxjava3/core/i0<",
        "Ljava/lang/Object;",
        ">;",
        "Lio/reactivex/rxjava3/internal/fuseable/o<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lio/reactivex/rxjava3/core/i0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/core/i0<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/reactivex/rxjava3/internal/operators/observable/t0;

    invoke-direct {v0}, Lio/reactivex/rxjava3/internal/operators/observable/t0;-><init>()V

    sput-object v0, Lio/reactivex/rxjava3/internal/operators/observable/t0;->a:Lio/reactivex/rxjava3/core/i0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lio/reactivex/rxjava3/core/i0;-><init>()V

    return-void
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method protected l6(Lio/reactivex/rxjava3/core/p0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/p0<",
            "-",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-static {p1}, Lio/reactivex/rxjava3/internal/disposables/d;->complete(Lio/reactivex/rxjava3/core/p0;)V

    return-void
.end method
