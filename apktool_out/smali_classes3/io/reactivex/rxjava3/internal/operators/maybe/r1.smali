.class public final enum Lio/reactivex/rxjava3/internal/operators/maybe/r1;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lm3/o;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/reactivex/rxjava3/internal/operators/maybe/r1;",
        ">;",
        "Lm3/o<",
        "Lio/reactivex/rxjava3/core/d0<",
        "Ljava/lang/Object;",
        ">;",
        "Lorg/reactivestreams/o<",
        "Ljava/lang/Object;",
        ">;>;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lio/reactivex/rxjava3/internal/operators/maybe/r1;

.field public static final enum INSTANCE:Lio/reactivex/rxjava3/internal/operators/maybe/r1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/maybe/r1;

    .line 2
    .line 3
    const-string v1, "INSTANCE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lio/reactivex/rxjava3/internal/operators/maybe/r1;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lio/reactivex/rxjava3/internal/operators/maybe/r1;->INSTANCE:Lio/reactivex/rxjava3/internal/operators/maybe/r1;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    new-array v1, v1, [Lio/reactivex/rxjava3/internal/operators/maybe/r1;

    .line 13
    .line 14
    aput-object v0, v1, v2

    .line 15
    .line 16
    sput-object v1, Lio/reactivex/rxjava3/internal/operators/maybe/r1;->$VALUES:[Lio/reactivex/rxjava3/internal/operators/maybe/r1;

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

.method public static instance()Lm3/o;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Lm3/o<",
            "Lio/reactivex/rxjava3/core/d0<",
            "TT;>;",
            "Lorg/reactivestreams/o<",
            "TT;>;>;"
        }
    .end annotation

    sget-object v0, Lio/reactivex/rxjava3/internal/operators/maybe/r1;->INSTANCE:Lio/reactivex/rxjava3/internal/operators/maybe/r1;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lio/reactivex/rxjava3/internal/operators/maybe/r1;
    .locals 1

    const-class v0, Lio/reactivex/rxjava3/internal/operators/maybe/r1;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/reactivex/rxjava3/internal/operators/maybe/r1;

    return-object p0
.end method

.method public static values()[Lio/reactivex/rxjava3/internal/operators/maybe/r1;
    .locals 1

    sget-object v0, Lio/reactivex/rxjava3/internal/operators/maybe/r1;->$VALUES:[Lio/reactivex/rxjava3/internal/operators/maybe/r1;

    invoke-virtual {v0}, [Lio/reactivex/rxjava3/internal/operators/maybe/r1;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/reactivex/rxjava3/internal/operators/maybe/r1;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    check-cast p1, Lio/reactivex/rxjava3/core/d0;

    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/internal/operators/maybe/r1;->apply(Lio/reactivex/rxjava3/core/d0;)Lorg/reactivestreams/o;

    move-result-object p1

    return-object p1
.end method

.method public apply(Lio/reactivex/rxjava3/core/d0;)Lorg/reactivestreams/o;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/d0<",
            "Ljava/lang/Object;",
            ">;)",
            "Lorg/reactivestreams/o<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 2
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/maybe/p1;

    invoke-direct {v0, p1}, Lio/reactivex/rxjava3/internal/operators/maybe/p1;-><init>(Lio/reactivex/rxjava3/core/d0;)V

    return-object v0
.end method
