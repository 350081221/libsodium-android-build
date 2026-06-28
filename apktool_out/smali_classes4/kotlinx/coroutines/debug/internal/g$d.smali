.class public final Lkotlinx/coroutines/debug/internal/g$d;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlinx/coroutines/debug/internal/g;->g()Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Lkotlinx/coroutines/debug/internal/g$a<",
        "*>;",
        "Lkotlinx/coroutines/debug/internal/d;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\u0008\u0008\u0000\u0010\u0001*\u00020\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\u0008\u00030\u0002H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "",
        "R",
        "Lkotlinx/coroutines/debug/internal/g$a;",
        "owner",
        "invoke",
        "(Lkotlinx/coroutines/debug/internal/g$a;)Ljava/lang/Object;",
        "kotlinx/coroutines/debug/internal/g$f",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nDebugProbesImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl$dumpCoroutinesInfoImpl$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n*L\n1#1,609:1\n1#2:610\n238#3:611\n*E\n"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/debug/internal/g$a;

    invoke-virtual {p0, p1}, Lkotlinx/coroutines/debug/internal/g$d;->invoke(Lkotlinx/coroutines/debug/internal/g$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/debug/internal/g$a;)Ljava/lang/Object;
    .locals 2
    .param p1    # Lkotlinx/coroutines/debug/internal/g$a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/debug/internal/g$a<",
            "*>;)",
            "Lkotlinx/coroutines/debug/internal/d;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    .line 2
    sget-object v0, Lkotlinx/coroutines/debug/internal/g;->a:Lkotlinx/coroutines/debug/internal/g;

    invoke-static {v0, p1}, Lkotlinx/coroutines/debug/internal/g;->b(Lkotlinx/coroutines/debug/internal/g;Lkotlinx/coroutines/debug/internal/g$a;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p1, Lkotlinx/coroutines/debug/internal/g$a;->b:Lkotlinx/coroutines/debug/internal/e;

    invoke-virtual {v0}, Lkotlinx/coroutines/debug/internal/e;->c()Lkotlin/coroutines/g;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 4
    new-instance v1, Lkotlinx/coroutines/debug/internal/d;

    iget-object p1, p1, Lkotlinx/coroutines/debug/internal/g$a;->b:Lkotlinx/coroutines/debug/internal/e;

    invoke-direct {v1, p1, v0}, Lkotlinx/coroutines/debug/internal/d;-><init>(Lkotlinx/coroutines/debug/internal/e;Lkotlin/coroutines/g;)V

    :cond_1
    :goto_0
    return-object v1
.end method
