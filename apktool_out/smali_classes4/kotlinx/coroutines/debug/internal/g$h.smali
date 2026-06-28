.class final Lkotlinx/coroutines/debug/internal/g$h;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlinx/coroutines/debug/internal/g;->j(Ljava/io/PrintStream;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Lkotlinx/coroutines/debug/internal/g$a<",
        "*>;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\u0008\u00030\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lkotlinx/coroutines/debug/internal/g$a;",
        "it",
        "",
        "invoke",
        "(Lkotlinx/coroutines/debug/internal/g$a;)Ljava/lang/Boolean;",
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
.field public static final INSTANCE:Lkotlinx/coroutines/debug/internal/g$h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkotlinx/coroutines/debug/internal/g$h;

    invoke-direct {v0}, Lkotlinx/coroutines/debug/internal/g$h;-><init>()V

    sput-object v0, Lkotlinx/coroutines/debug/internal/g$h;->INSTANCE:Lkotlinx/coroutines/debug/internal/g$h;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Lkotlinx/coroutines/debug/internal/g$a;)Ljava/lang/Boolean;
    .locals 1
    .param p1    # Lkotlinx/coroutines/debug/internal/g$a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/debug/internal/g$a<",
            "*>;)",
            "Ljava/lang/Boolean;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    sget-object v0, Lkotlinx/coroutines/debug/internal/g;->a:Lkotlinx/coroutines/debug/internal/g;

    invoke-static {v0, p1}, Lkotlinx/coroutines/debug/internal/g;->b(Lkotlinx/coroutines/debug/internal/g;Lkotlinx/coroutines/debug/internal/g$a;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lkotlinx/coroutines/debug/internal/g$a;

    invoke-virtual {p0, p1}, Lkotlinx/coroutines/debug/internal/g$h;->invoke(Lkotlinx/coroutines/debug/internal/g$a;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
