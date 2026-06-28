.class public final Lio/reactivex/rxjava3/internal/operators/flowable/m2;
.super Lio/reactivex/rxjava3/core/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/reactivex/rxjava3/core/o<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field public static final b:Lio/reactivex/rxjava3/core/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/core/o<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/reactivex/rxjava3/internal/operators/flowable/m2;

    invoke-direct {v0}, Lio/reactivex/rxjava3/internal/operators/flowable/m2;-><init>()V

    sput-object v0, Lio/reactivex/rxjava3/internal/operators/flowable/m2;->b:Lio/reactivex/rxjava3/core/o;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lio/reactivex/rxjava3/core/o;-><init>()V

    return-void
.end method


# virtual methods
.method public O6(Lorg/reactivestreams/p;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/reactivestreams/p<",
            "-",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lio/reactivex/rxjava3/internal/subscriptions/g;->INSTANCE:Lio/reactivex/rxjava3/internal/subscriptions/g;

    invoke-interface {p1, v0}, Lorg/reactivestreams/p;->onSubscribe(Lorg/reactivestreams/q;)V

    return-void
.end method
