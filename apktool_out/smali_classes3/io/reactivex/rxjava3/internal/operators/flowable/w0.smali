.class public final Lio/reactivex/rxjava3/internal/operators/flowable/w0;
.super Lio/reactivex/rxjava3/core/o;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/internal/fuseable/o;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/reactivex/rxjava3/core/o<",
        "Ljava/lang/Object;",
        ">;",
        "Lio/reactivex/rxjava3/internal/fuseable/o<",
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

    new-instance v0, Lio/reactivex/rxjava3/internal/operators/flowable/w0;

    invoke-direct {v0}, Lio/reactivex/rxjava3/internal/operators/flowable/w0;-><init>()V

    sput-object v0, Lio/reactivex/rxjava3/internal/operators/flowable/w0;->b:Lio/reactivex/rxjava3/core/o;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lio/reactivex/rxjava3/core/o;-><init>()V

    return-void
.end method


# virtual methods
.method public O6(Lorg/reactivestreams/p;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/reactivestreams/p<",
            "-",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-static {p1}, Lio/reactivex/rxjava3/internal/subscriptions/g;->complete(Lorg/reactivestreams/p;)V

    return-void
.end method

.method public get()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
