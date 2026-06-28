.class public final enum Lio/reactivex/rxjava3/internal/util/h;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/core/t;
.implements Lio/reactivex/rxjava3/core/p0;
.implements Lio/reactivex/rxjava3/core/a0;
.implements Lio/reactivex/rxjava3/core/u0;
.implements Lio/reactivex/rxjava3/core/f;
.implements Lorg/reactivestreams/q;
.implements Lio/reactivex/rxjava3/disposables/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/reactivex/rxjava3/internal/util/h;",
        ">;",
        "Lio/reactivex/rxjava3/core/t<",
        "Ljava/lang/Object;",
        ">;",
        "Lio/reactivex/rxjava3/core/p0<",
        "Ljava/lang/Object;",
        ">;",
        "Lio/reactivex/rxjava3/core/a0<",
        "Ljava/lang/Object;",
        ">;",
        "Lio/reactivex/rxjava3/core/u0<",
        "Ljava/lang/Object;",
        ">;",
        "Lio/reactivex/rxjava3/core/f;",
        "Lorg/reactivestreams/q;",
        "Lio/reactivex/rxjava3/disposables/e;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lio/reactivex/rxjava3/internal/util/h;

.field public static final enum INSTANCE:Lio/reactivex/rxjava3/internal/util/h;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lio/reactivex/rxjava3/internal/util/h;

    .line 2
    .line 3
    const-string v1, "INSTANCE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lio/reactivex/rxjava3/internal/util/h;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lio/reactivex/rxjava3/internal/util/h;->INSTANCE:Lio/reactivex/rxjava3/internal/util/h;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    new-array v1, v1, [Lio/reactivex/rxjava3/internal/util/h;

    .line 13
    .line 14
    aput-object v0, v1, v2

    .line 15
    .line 16
    sput-object v1, Lio/reactivex/rxjava3/internal/util/h;->$VALUES:[Lio/reactivex/rxjava3/internal/util/h;

    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static asObserver()Lio/reactivex/rxjava3/core/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Lio/reactivex/rxjava3/core/p0<",
            "TT;>;"
        }
    .end annotation

    sget-object v0, Lio/reactivex/rxjava3/internal/util/h;->INSTANCE:Lio/reactivex/rxjava3/internal/util/h;

    return-object v0
.end method

.method public static asSubscriber()Lorg/reactivestreams/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Lorg/reactivestreams/p<",
            "TT;>;"
        }
    .end annotation

    sget-object v0, Lio/reactivex/rxjava3/internal/util/h;->INSTANCE:Lio/reactivex/rxjava3/internal/util/h;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lio/reactivex/rxjava3/internal/util/h;
    .locals 1

    const-class v0, Lio/reactivex/rxjava3/internal/util/h;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/reactivex/rxjava3/internal/util/h;

    return-object p0
.end method

.method public static values()[Lio/reactivex/rxjava3/internal/util/h;
    .locals 1

    sget-object v0, Lio/reactivex/rxjava3/internal/util/h;->$VALUES:[Lio/reactivex/rxjava3/internal/util/h;

    invoke-virtual {v0}, [Lio/reactivex/rxjava3/internal/util/h;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/reactivex/rxjava3/internal/util/h;

    return-object v0
.end method


# virtual methods
.method public cancel()V
    .locals 0

    return-void
.end method

.method public dispose()V
    .locals 0

    return-void
.end method

.method public isDisposed()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public onComplete()V
    .locals 0

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p1}, Lio/reactivex/rxjava3/plugins/a;->Y(Ljava/lang/Throwable;)V

    return-void
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V
    .locals 0

    .line 1
    invoke-interface {p1}, Lio/reactivex/rxjava3/disposables/e;->dispose()V

    return-void
.end method

.method public onSubscribe(Lorg/reactivestreams/q;)V
    .locals 0

    .line 2
    invoke-interface {p1}, Lorg/reactivestreams/q;->cancel()V

    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public request(J)V
    .locals 0

    return-void
.end method
