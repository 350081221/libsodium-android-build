.class final enum Lio/reactivex/rxjava3/subscribers/f$a;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/core/t;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/subscribers/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/reactivex/rxjava3/subscribers/f$a;",
        ">;",
        "Lio/reactivex/rxjava3/core/t<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lio/reactivex/rxjava3/subscribers/f$a;

.field public static final enum INSTANCE:Lio/reactivex/rxjava3/subscribers/f$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lio/reactivex/rxjava3/subscribers/f$a;

    .line 2
    .line 3
    const-string v1, "INSTANCE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lio/reactivex/rxjava3/subscribers/f$a;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lio/reactivex/rxjava3/subscribers/f$a;->INSTANCE:Lio/reactivex/rxjava3/subscribers/f$a;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    new-array v1, v1, [Lio/reactivex/rxjava3/subscribers/f$a;

    .line 13
    .line 14
    aput-object v0, v1, v2

    .line 15
    .line 16
    sput-object v1, Lio/reactivex/rxjava3/subscribers/f$a;->$VALUES:[Lio/reactivex/rxjava3/subscribers/f$a;

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

.method public static valueOf(Ljava/lang/String;)Lio/reactivex/rxjava3/subscribers/f$a;
    .locals 1

    const-class v0, Lio/reactivex/rxjava3/subscribers/f$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/reactivex/rxjava3/subscribers/f$a;

    return-object p0
.end method

.method public static values()[Lio/reactivex/rxjava3/subscribers/f$a;
    .locals 1

    sget-object v0, Lio/reactivex/rxjava3/subscribers/f$a;->$VALUES:[Lio/reactivex/rxjava3/subscribers/f$a;

    invoke-virtual {v0}, [Lio/reactivex/rxjava3/subscribers/f$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/reactivex/rxjava3/subscribers/f$a;

    return-object v0
.end method


# virtual methods
.method public onComplete()V
    .locals 0

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public onSubscribe(Lorg/reactivestreams/q;)V
    .locals 0

    return-void
.end method
