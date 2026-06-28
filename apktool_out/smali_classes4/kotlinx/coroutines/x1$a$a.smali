.class final Lkotlinx/coroutines/x1$a$a;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlinx/coroutines/x1$a;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Lkotlin/coroutines/g$b;",
        "Lkotlinx/coroutines/x1;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lkotlin/coroutines/g$b;",
        "it",
        "Lkotlinx/coroutines/x1;",
        "invoke",
        "(Lkotlin/coroutines/g$b;)Lkotlinx/coroutines/x1;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final INSTANCE:Lkotlinx/coroutines/x1$a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkotlinx/coroutines/x1$a$a;

    invoke-direct {v0}, Lkotlinx/coroutines/x1$a$a;-><init>()V

    sput-object v0, Lkotlinx/coroutines/x1$a$a;->INSTANCE:Lkotlinx/coroutines/x1$a$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlin/coroutines/g$b;

    invoke-virtual {p0, p1}, Lkotlinx/coroutines/x1$a$a;->invoke(Lkotlin/coroutines/g$b;)Lkotlinx/coroutines/x1;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlin/coroutines/g$b;)Lkotlinx/coroutines/x1;
    .locals 1
    .param p1    # Lkotlin/coroutines/g$b;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/m;
    .end annotation

    .line 2
    instance-of v0, p1, Lkotlinx/coroutines/x1;

    if-eqz v0, :cond_0

    check-cast p1, Lkotlinx/coroutines/x1;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method
