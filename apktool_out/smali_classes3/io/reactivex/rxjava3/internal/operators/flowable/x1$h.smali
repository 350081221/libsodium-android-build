.class public final enum Lio/reactivex/rxjava3/internal/operators/flowable/x1$h;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lm3/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/flowable/x1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "h"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/reactivex/rxjava3/internal/operators/flowable/x1$h;",
        ">;",
        "Lm3/g<",
        "Lorg/reactivestreams/q;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lio/reactivex/rxjava3/internal/operators/flowable/x1$h;

.field public static final enum INSTANCE:Lio/reactivex/rxjava3/internal/operators/flowable/x1$h;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/flowable/x1$h;

    .line 2
    .line 3
    const-string v1, "INSTANCE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lio/reactivex/rxjava3/internal/operators/flowable/x1$h;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lio/reactivex/rxjava3/internal/operators/flowable/x1$h;->INSTANCE:Lio/reactivex/rxjava3/internal/operators/flowable/x1$h;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    new-array v1, v1, [Lio/reactivex/rxjava3/internal/operators/flowable/x1$h;

    .line 13
    .line 14
    aput-object v0, v1, v2

    .line 15
    .line 16
    sput-object v1, Lio/reactivex/rxjava3/internal/operators/flowable/x1$h;->$VALUES:[Lio/reactivex/rxjava3/internal/operators/flowable/x1$h;

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

.method public static valueOf(Ljava/lang/String;)Lio/reactivex/rxjava3/internal/operators/flowable/x1$h;
    .locals 1

    const-class v0, Lio/reactivex/rxjava3/internal/operators/flowable/x1$h;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/reactivex/rxjava3/internal/operators/flowable/x1$h;

    return-object p0
.end method

.method public static values()[Lio/reactivex/rxjava3/internal/operators/flowable/x1$h;
    .locals 1

    sget-object v0, Lio/reactivex/rxjava3/internal/operators/flowable/x1$h;->$VALUES:[Lio/reactivex/rxjava3/internal/operators/flowable/x1$h;

    invoke-virtual {v0}, [Lio/reactivex/rxjava3/internal/operators/flowable/x1$h;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/reactivex/rxjava3/internal/operators/flowable/x1$h;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    check-cast p1, Lorg/reactivestreams/q;

    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/internal/operators/flowable/x1$h;->accept(Lorg/reactivestreams/q;)V

    return-void
.end method

.method public accept(Lorg/reactivestreams/q;)V
    .locals 2

    const-wide v0, 0x7fffffffffffffffL

    .line 2
    invoke-interface {p1, v0, v1}, Lorg/reactivestreams/q;->request(J)V

    return-void
.end method
