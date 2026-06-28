.class public final Lio/reactivex/rxjava3/internal/operators/completable/n;
.super Lio/reactivex/rxjava3/core/c;
.source "SourceFile"


# static fields
.field public static final a:Lio/reactivex/rxjava3/core/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/reactivex/rxjava3/internal/operators/completable/n;

    invoke-direct {v0}, Lio/reactivex/rxjava3/internal/operators/completable/n;-><init>()V

    sput-object v0, Lio/reactivex/rxjava3/internal/operators/completable/n;->a:Lio/reactivex/rxjava3/core/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lio/reactivex/rxjava3/core/c;-><init>()V

    return-void
.end method


# virtual methods
.method public Y0(Lio/reactivex/rxjava3/core/f;)V
    .locals 0

    invoke-static {p1}, Lio/reactivex/rxjava3/internal/disposables/d;->complete(Lio/reactivex/rxjava3/core/f;)V

    return-void
.end method
