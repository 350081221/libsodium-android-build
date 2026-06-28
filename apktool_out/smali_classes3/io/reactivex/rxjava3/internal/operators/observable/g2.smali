.class public final Lio/reactivex/rxjava3/internal/operators/observable/g2;
.super Lio/reactivex/rxjava3/core/i0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/reactivex/rxjava3/core/i0<",
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

    new-instance v0, Lio/reactivex/rxjava3/internal/operators/observable/g2;

    invoke-direct {v0}, Lio/reactivex/rxjava3/internal/operators/observable/g2;-><init>()V

    sput-object v0, Lio/reactivex/rxjava3/internal/operators/observable/g2;->a:Lio/reactivex/rxjava3/core/i0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lio/reactivex/rxjava3/core/i0;-><init>()V

    return-void
.end method


# virtual methods
.method protected l6(Lio/reactivex/rxjava3/core/p0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/p0<",
            "-",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lio/reactivex/rxjava3/internal/disposables/d;->NEVER:Lio/reactivex/rxjava3/internal/disposables/d;

    invoke-interface {p1, v0}, Lio/reactivex/rxjava3/core/p0;->onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V

    return-void
.end method
