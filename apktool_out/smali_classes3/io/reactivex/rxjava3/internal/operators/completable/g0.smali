.class public final Lio/reactivex/rxjava3/internal/operators/completable/g0;
.super Lio/reactivex/rxjava3/core/c;
.source "SourceFile"


# static fields
.field public static final a:Lio/reactivex/rxjava3/core/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/reactivex/rxjava3/internal/operators/completable/g0;

    invoke-direct {v0}, Lio/reactivex/rxjava3/internal/operators/completable/g0;-><init>()V

    sput-object v0, Lio/reactivex/rxjava3/internal/operators/completable/g0;->a:Lio/reactivex/rxjava3/core/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lio/reactivex/rxjava3/core/c;-><init>()V

    return-void
.end method


# virtual methods
.method protected Y0(Lio/reactivex/rxjava3/core/f;)V
    .locals 1

    sget-object v0, Lio/reactivex/rxjava3/internal/disposables/d;->NEVER:Lio/reactivex/rxjava3/internal/disposables/d;

    invoke-interface {p1, v0}, Lio/reactivex/rxjava3/core/f;->onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V

    return-void
.end method
