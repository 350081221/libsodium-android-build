.class public final enum Lio/reactivex/rxjava3/internal/disposables/d;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/internal/fuseable/l;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/reactivex/rxjava3/internal/disposables/d;",
        ">;",
        "Lio/reactivex/rxjava3/internal/fuseable/l<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lio/reactivex/rxjava3/internal/disposables/d;

.field public static final enum INSTANCE:Lio/reactivex/rxjava3/internal/disposables/d;

.field public static final enum NEVER:Lio/reactivex/rxjava3/internal/disposables/d;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lio/reactivex/rxjava3/internal/disposables/d;

    .line 2
    .line 3
    const-string v1, "INSTANCE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lio/reactivex/rxjava3/internal/disposables/d;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lio/reactivex/rxjava3/internal/disposables/d;->INSTANCE:Lio/reactivex/rxjava3/internal/disposables/d;

    .line 10
    .line 11
    new-instance v1, Lio/reactivex/rxjava3/internal/disposables/d;

    .line 12
    .line 13
    const-string v3, "NEVER"

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    invoke-direct {v1, v3, v4}, Lio/reactivex/rxjava3/internal/disposables/d;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lio/reactivex/rxjava3/internal/disposables/d;->NEVER:Lio/reactivex/rxjava3/internal/disposables/d;

    .line 20
    .line 21
    const/4 v3, 0x2

    .line 22
    new-array v3, v3, [Lio/reactivex/rxjava3/internal/disposables/d;

    .line 23
    .line 24
    aput-object v0, v3, v2

    .line 25
    .line 26
    aput-object v1, v3, v4

    .line 27
    .line 28
    sput-object v3, Lio/reactivex/rxjava3/internal/disposables/d;->$VALUES:[Lio/reactivex/rxjava3/internal/disposables/d;

    .line 29
    .line 30
    return-void
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
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

.method public static complete(Lio/reactivex/rxjava3/core/a0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/a0<",
            "*>;)V"
        }
    .end annotation

    .line 3
    sget-object v0, Lio/reactivex/rxjava3/internal/disposables/d;->INSTANCE:Lio/reactivex/rxjava3/internal/disposables/d;

    invoke-interface {p0, v0}, Lio/reactivex/rxjava3/core/a0;->onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V

    .line 4
    invoke-interface {p0}, Lio/reactivex/rxjava3/core/a0;->onComplete()V

    return-void
.end method

.method public static complete(Lio/reactivex/rxjava3/core/f;)V
    .locals 1

    .line 5
    sget-object v0, Lio/reactivex/rxjava3/internal/disposables/d;->INSTANCE:Lio/reactivex/rxjava3/internal/disposables/d;

    invoke-interface {p0, v0}, Lio/reactivex/rxjava3/core/f;->onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V

    .line 6
    invoke-interface {p0}, Lio/reactivex/rxjava3/core/f;->onComplete()V

    return-void
.end method

.method public static complete(Lio/reactivex/rxjava3/core/p0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/p0<",
            "*>;)V"
        }
    .end annotation

    .line 1
    sget-object v0, Lio/reactivex/rxjava3/internal/disposables/d;->INSTANCE:Lio/reactivex/rxjava3/internal/disposables/d;

    invoke-interface {p0, v0}, Lio/reactivex/rxjava3/core/p0;->onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V

    .line 2
    invoke-interface {p0}, Lio/reactivex/rxjava3/core/p0;->onComplete()V

    return-void
.end method

.method public static error(Ljava/lang/Throwable;Lio/reactivex/rxjava3/core/a0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            "Lio/reactivex/rxjava3/core/a0<",
            "*>;)V"
        }
    .end annotation

    .line 7
    sget-object v0, Lio/reactivex/rxjava3/internal/disposables/d;->INSTANCE:Lio/reactivex/rxjava3/internal/disposables/d;

    invoke-interface {p1, v0}, Lio/reactivex/rxjava3/core/a0;->onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V

    .line 8
    invoke-interface {p1, p0}, Lio/reactivex/rxjava3/core/a0;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static error(Ljava/lang/Throwable;Lio/reactivex/rxjava3/core/f;)V
    .locals 1

    .line 3
    sget-object v0, Lio/reactivex/rxjava3/internal/disposables/d;->INSTANCE:Lio/reactivex/rxjava3/internal/disposables/d;

    invoke-interface {p1, v0}, Lio/reactivex/rxjava3/core/f;->onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V

    .line 4
    invoke-interface {p1, p0}, Lio/reactivex/rxjava3/core/f;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static error(Ljava/lang/Throwable;Lio/reactivex/rxjava3/core/p0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            "Lio/reactivex/rxjava3/core/p0<",
            "*>;)V"
        }
    .end annotation

    .line 1
    sget-object v0, Lio/reactivex/rxjava3/internal/disposables/d;->INSTANCE:Lio/reactivex/rxjava3/internal/disposables/d;

    invoke-interface {p1, v0}, Lio/reactivex/rxjava3/core/p0;->onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V

    .line 2
    invoke-interface {p1, p0}, Lio/reactivex/rxjava3/core/p0;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static error(Ljava/lang/Throwable;Lio/reactivex/rxjava3/core/u0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            "Lio/reactivex/rxjava3/core/u0<",
            "*>;)V"
        }
    .end annotation

    .line 5
    sget-object v0, Lio/reactivex/rxjava3/internal/disposables/d;->INSTANCE:Lio/reactivex/rxjava3/internal/disposables/d;

    invoke-interface {p1, v0}, Lio/reactivex/rxjava3/core/u0;->onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V

    .line 6
    invoke-interface {p1, p0}, Lio/reactivex/rxjava3/core/u0;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lio/reactivex/rxjava3/internal/disposables/d;
    .locals 1

    const-class v0, Lio/reactivex/rxjava3/internal/disposables/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/reactivex/rxjava3/internal/disposables/d;

    return-object p0
.end method

.method public static values()[Lio/reactivex/rxjava3/internal/disposables/d;
    .locals 1

    sget-object v0, Lio/reactivex/rxjava3/internal/disposables/d;->$VALUES:[Lio/reactivex/rxjava3/internal/disposables/d;

    invoke-virtual {v0}, [Lio/reactivex/rxjava3/internal/disposables/d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/reactivex/rxjava3/internal/disposables/d;

    return-object v0
.end method


# virtual methods
.method public clear()V
    .locals 0

    return-void
.end method

.method public dispose()V
    .locals 0

    return-void
.end method

.method public isDisposed()Z
    .locals 1

    sget-object v0, Lio/reactivex/rxjava3/internal/disposables/d;->INSTANCE:Lio/reactivex/rxjava3/internal/disposables/d;

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isEmpty()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public offer(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Should not be called!"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public offer(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 2
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Should not be called!"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public poll()Ljava/lang/Object;
    .locals 1
    .annotation build Ll3/g;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public requestFusion(I)I
    .locals 0

    and-int/lit8 p1, p1, 0x2

    return p1
.end method
