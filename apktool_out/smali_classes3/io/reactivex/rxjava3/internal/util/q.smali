.class public final enum Lio/reactivex/rxjava3/internal/util/q;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/rxjava3/internal/util/q$a;,
        Lio/reactivex/rxjava3/internal/util/q$c;,
        Lio/reactivex/rxjava3/internal/util/q$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/reactivex/rxjava3/internal/util/q;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lio/reactivex/rxjava3/internal/util/q;

.field public static final enum COMPLETE:Lio/reactivex/rxjava3/internal/util/q;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lio/reactivex/rxjava3/internal/util/q;

    .line 2
    .line 3
    const-string v1, "COMPLETE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lio/reactivex/rxjava3/internal/util/q;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lio/reactivex/rxjava3/internal/util/q;->COMPLETE:Lio/reactivex/rxjava3/internal/util/q;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    new-array v1, v1, [Lio/reactivex/rxjava3/internal/util/q;

    .line 13
    .line 14
    aput-object v0, v1, v2

    .line 15
    .line 16
    sput-object v1, Lio/reactivex/rxjava3/internal/util/q;->$VALUES:[Lio/reactivex/rxjava3/internal/util/q;

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

.method public static accept(Ljava/lang/Object;Lio/reactivex/rxjava3/core/p0;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "Lio/reactivex/rxjava3/core/p0<",
            "-TT;>;)Z"
        }
    .end annotation

    .line 6
    sget-object v0, Lio/reactivex/rxjava3/internal/util/q;->COMPLETE:Lio/reactivex/rxjava3/internal/util/q;

    const/4 v1, 0x1

    if-ne p0, v0, :cond_0

    .line 7
    invoke-interface {p1}, Lio/reactivex/rxjava3/core/p0;->onComplete()V

    return v1

    .line 8
    :cond_0
    instance-of v0, p0, Lio/reactivex/rxjava3/internal/util/q$b;

    if-eqz v0, :cond_1

    .line 9
    check-cast p0, Lio/reactivex/rxjava3/internal/util/q$b;

    iget-object p0, p0, Lio/reactivex/rxjava3/internal/util/q$b;->e:Ljava/lang/Throwable;

    invoke-interface {p1, p0}, Lio/reactivex/rxjava3/core/p0;->onError(Ljava/lang/Throwable;)V

    return v1

    .line 10
    :cond_1
    invoke-interface {p1, p0}, Lio/reactivex/rxjava3/core/p0;->onNext(Ljava/lang/Object;)V

    const/4 p0, 0x0

    return p0
.end method

.method public static accept(Ljava/lang/Object;Lorg/reactivestreams/p;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "Lorg/reactivestreams/p<",
            "-TT;>;)Z"
        }
    .end annotation

    .line 1
    sget-object v0, Lio/reactivex/rxjava3/internal/util/q;->COMPLETE:Lio/reactivex/rxjava3/internal/util/q;

    const/4 v1, 0x1

    if-ne p0, v0, :cond_0

    .line 2
    invoke-interface {p1}, Lorg/reactivestreams/p;->onComplete()V

    return v1

    .line 3
    :cond_0
    instance-of v0, p0, Lio/reactivex/rxjava3/internal/util/q$b;

    if-eqz v0, :cond_1

    .line 4
    check-cast p0, Lio/reactivex/rxjava3/internal/util/q$b;

    iget-object p0, p0, Lio/reactivex/rxjava3/internal/util/q$b;->e:Ljava/lang/Throwable;

    invoke-interface {p1, p0}, Lorg/reactivestreams/p;->onError(Ljava/lang/Throwable;)V

    return v1

    .line 5
    :cond_1
    invoke-interface {p1, p0}, Lorg/reactivestreams/p;->onNext(Ljava/lang/Object;)V

    const/4 p0, 0x0

    return p0
.end method

.method public static acceptFull(Ljava/lang/Object;Lio/reactivex/rxjava3/core/p0;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "Lio/reactivex/rxjava3/core/p0<",
            "-TT;>;)Z"
        }
    .end annotation

    .line 8
    sget-object v0, Lio/reactivex/rxjava3/internal/util/q;->COMPLETE:Lio/reactivex/rxjava3/internal/util/q;

    const/4 v1, 0x1

    if-ne p0, v0, :cond_0

    .line 9
    invoke-interface {p1}, Lio/reactivex/rxjava3/core/p0;->onComplete()V

    return v1

    .line 10
    :cond_0
    instance-of v0, p0, Lio/reactivex/rxjava3/internal/util/q$b;

    if-eqz v0, :cond_1

    .line 11
    check-cast p0, Lio/reactivex/rxjava3/internal/util/q$b;

    iget-object p0, p0, Lio/reactivex/rxjava3/internal/util/q$b;->e:Ljava/lang/Throwable;

    invoke-interface {p1, p0}, Lio/reactivex/rxjava3/core/p0;->onError(Ljava/lang/Throwable;)V

    return v1

    .line 12
    :cond_1
    instance-of v0, p0, Lio/reactivex/rxjava3/internal/util/q$a;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 13
    check-cast p0, Lio/reactivex/rxjava3/internal/util/q$a;

    iget-object p0, p0, Lio/reactivex/rxjava3/internal/util/q$a;->upstream:Lio/reactivex/rxjava3/disposables/e;

    invoke-interface {p1, p0}, Lio/reactivex/rxjava3/core/p0;->onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V

    return v1

    .line 14
    :cond_2
    invoke-interface {p1, p0}, Lio/reactivex/rxjava3/core/p0;->onNext(Ljava/lang/Object;)V

    return v1
.end method

.method public static acceptFull(Ljava/lang/Object;Lorg/reactivestreams/p;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "Lorg/reactivestreams/p<",
            "-TT;>;)Z"
        }
    .end annotation

    .line 1
    sget-object v0, Lio/reactivex/rxjava3/internal/util/q;->COMPLETE:Lio/reactivex/rxjava3/internal/util/q;

    const/4 v1, 0x1

    if-ne p0, v0, :cond_0

    .line 2
    invoke-interface {p1}, Lorg/reactivestreams/p;->onComplete()V

    return v1

    .line 3
    :cond_0
    instance-of v0, p0, Lio/reactivex/rxjava3/internal/util/q$b;

    if-eqz v0, :cond_1

    .line 4
    check-cast p0, Lio/reactivex/rxjava3/internal/util/q$b;

    iget-object p0, p0, Lio/reactivex/rxjava3/internal/util/q$b;->e:Ljava/lang/Throwable;

    invoke-interface {p1, p0}, Lorg/reactivestreams/p;->onError(Ljava/lang/Throwable;)V

    return v1

    .line 5
    :cond_1
    instance-of v0, p0, Lio/reactivex/rxjava3/internal/util/q$c;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 6
    check-cast p0, Lio/reactivex/rxjava3/internal/util/q$c;

    iget-object p0, p0, Lio/reactivex/rxjava3/internal/util/q$c;->upstream:Lorg/reactivestreams/q;

    invoke-interface {p1, p0}, Lorg/reactivestreams/p;->onSubscribe(Lorg/reactivestreams/q;)V

    return v1

    .line 7
    :cond_2
    invoke-interface {p1, p0}, Lorg/reactivestreams/p;->onNext(Ljava/lang/Object;)V

    return v1
.end method

.method public static complete()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lio/reactivex/rxjava3/internal/util/q;->COMPLETE:Lio/reactivex/rxjava3/internal/util/q;

    return-object v0
.end method

.method public static disposable(Lio/reactivex/rxjava3/disposables/e;)Ljava/lang/Object;
    .locals 1

    new-instance v0, Lio/reactivex/rxjava3/internal/util/q$a;

    invoke-direct {v0, p0}, Lio/reactivex/rxjava3/internal/util/q$a;-><init>(Lio/reactivex/rxjava3/disposables/e;)V

    return-object v0
.end method

.method public static error(Ljava/lang/Throwable;)Ljava/lang/Object;
    .locals 1

    new-instance v0, Lio/reactivex/rxjava3/internal/util/q$b;

    invoke-direct {v0, p0}, Lio/reactivex/rxjava3/internal/util/q$b;-><init>(Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public static getDisposable(Ljava/lang/Object;)Lio/reactivex/rxjava3/disposables/e;
    .locals 0

    check-cast p0, Lio/reactivex/rxjava3/internal/util/q$a;

    iget-object p0, p0, Lio/reactivex/rxjava3/internal/util/q$a;->upstream:Lio/reactivex/rxjava3/disposables/e;

    return-object p0
.end method

.method public static getError(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 0

    check-cast p0, Lio/reactivex/rxjava3/internal/util/q$b;

    iget-object p0, p0, Lio/reactivex/rxjava3/internal/util/q$b;->e:Ljava/lang/Throwable;

    return-object p0
.end method

.method public static getSubscription(Ljava/lang/Object;)Lorg/reactivestreams/q;
    .locals 0

    check-cast p0, Lio/reactivex/rxjava3/internal/util/q$c;

    iget-object p0, p0, Lio/reactivex/rxjava3/internal/util/q$c;->upstream:Lorg/reactivestreams/q;

    return-object p0
.end method

.method public static getValue(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    return-object p0
.end method

.method public static isComplete(Ljava/lang/Object;)Z
    .locals 1

    sget-object v0, Lio/reactivex/rxjava3/internal/util/q;->COMPLETE:Lio/reactivex/rxjava3/internal/util/q;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isDisposable(Ljava/lang/Object;)Z
    .locals 0

    instance-of p0, p0, Lio/reactivex/rxjava3/internal/util/q$a;

    return p0
.end method

.method public static isError(Ljava/lang/Object;)Z
    .locals 0

    instance-of p0, p0, Lio/reactivex/rxjava3/internal/util/q$b;

    return p0
.end method

.method public static isSubscription(Ljava/lang/Object;)Z
    .locals 0

    instance-of p0, p0, Lio/reactivex/rxjava3/internal/util/q$c;

    return p0
.end method

.method public static next(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    return-object p0
.end method

.method public static subscription(Lorg/reactivestreams/q;)Ljava/lang/Object;
    .locals 1

    new-instance v0, Lio/reactivex/rxjava3/internal/util/q$c;

    invoke-direct {v0, p0}, Lio/reactivex/rxjava3/internal/util/q$c;-><init>(Lorg/reactivestreams/q;)V

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lio/reactivex/rxjava3/internal/util/q;
    .locals 1

    const-class v0, Lio/reactivex/rxjava3/internal/util/q;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/reactivex/rxjava3/internal/util/q;

    return-object p0
.end method

.method public static values()[Lio/reactivex/rxjava3/internal/util/q;
    .locals 1

    sget-object v0, Lio/reactivex/rxjava3/internal/util/q;->$VALUES:[Lio/reactivex/rxjava3/internal/util/q;

    invoke-virtual {v0}, [Lio/reactivex/rxjava3/internal/util/q;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/reactivex/rxjava3/internal/util/q;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "NotificationLite.Complete"

    return-object v0
.end method
