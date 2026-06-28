.class final synthetic Lkotlinx/coroutines/selects/a$b;
.super Lkotlin/jvm/internal/h0;
.source "SourceFile"

# interfaces
.implements Lv3/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlinx/coroutines/selects/a;->b()Lkotlinx/coroutines/selects/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/h0;",
        "Lv3/q<",
        "Lkotlinx/coroutines/selects/a;",
        "Lkotlinx/coroutines/selects/m<",
        "*>;",
        "Ljava/lang/Object;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lkotlinx/coroutines/selects/a$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkotlinx/coroutines/selects/a$b;

    invoke-direct {v0}, Lkotlinx/coroutines/selects/a$b;-><init>()V

    sput-object v0, Lkotlinx/coroutines/selects/a$b;->INSTANCE:Lkotlinx/coroutines/selects/a$b;

    return-void
.end method

.method constructor <init>()V
    .locals 6

    const/4 v1, 0x3

    const-class v2, Lkotlinx/coroutines/selects/a;

    const-string v3, "register"

    const-string v4, "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V"

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/h0;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/selects/a;

    check-cast p2, Lkotlinx/coroutines/selects/m;

    invoke-virtual {p0, p1, p2, p3}, Lkotlinx/coroutines/selects/a$b;->invoke(Lkotlinx/coroutines/selects/a;Lkotlinx/coroutines/selects/m;Ljava/lang/Object;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/selects/a;Lkotlinx/coroutines/selects/m;Ljava/lang/Object;)V
    .locals 0
    .param p1    # Lkotlinx/coroutines/selects/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lkotlinx/coroutines/selects/m;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/selects/a;",
            "Lkotlinx/coroutines/selects/m<",
            "*>;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-static {p1, p2, p3}, Lkotlinx/coroutines/selects/a;->a(Lkotlinx/coroutines/selects/a;Lkotlinx/coroutines/selects/m;Ljava/lang/Object;)V

    return-void
.end method
