.class public final Landroidx/navigation/NavArgsLazy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/d0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Args::",
        "Landroidx/navigation/NavArgs;",
        ">",
        "Ljava/lang/Object;",
        "Lkotlin/d0<",
        "TArgs;>;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\u0018\u0000*\u0008\u0008\u0000\u0010\u0002*\u00020\u00012\u0008\u0012\u0004\u0012\u00028\u00000\u0003B#\u0012\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0008\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008R\u001a\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000cR\u0018\u0010\r\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00028\u00008VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0014"
    }
    d2 = {
        "Landroidx/navigation/NavArgsLazy;",
        "Landroidx/navigation/NavArgs;",
        "Args",
        "Lkotlin/d0;",
        "",
        "isInitialized",
        "Lkotlin/reflect/d;",
        "navArgsClass",
        "Lkotlin/reflect/d;",
        "Lkotlin/Function0;",
        "Landroid/os/Bundle;",
        "argumentProducer",
        "Lv3/a;",
        "cached",
        "Landroidx/navigation/NavArgs;",
        "getValue",
        "()Landroidx/navigation/NavArgs;",
        "value",
        "<init>",
        "(Lkotlin/reflect/d;Lv3/a;)V",
        "navigation-common_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final argumentProducer:Lv3/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/a<",
            "Landroid/os/Bundle;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private cached:Landroidx/navigation/NavArgs;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TArgs;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation
.end field

.field private final navArgsClass:Lkotlin/reflect/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/reflect/d<",
            "TArgs;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/reflect/d;Lv3/a;)V
    .locals 1
    .param p1    # Lkotlin/reflect/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/reflect/d<",
            "TArgs;>;",
            "Lv3/a<",
            "Landroid/os/Bundle;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "navArgsClass"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "argumentProducer"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Landroidx/navigation/NavArgsLazy;->navArgsClass:Lkotlin/reflect/d;

    .line 15
    .line 16
    iput-object p2, p0, Landroidx/navigation/NavArgsLazy;->argumentProducer:Lv3/a;

    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
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
.end method


# virtual methods
.method public getValue()Landroidx/navigation/NavArgs;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TArgs;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 2
    iget-object v0, p0, Landroidx/navigation/NavArgsLazy;->cached:Landroidx/navigation/NavArgs;

    if-nez v0, :cond_1

    .line 3
    iget-object v0, p0, Landroidx/navigation/NavArgsLazy;->argumentProducer:Lv3/a;

    invoke-interface {v0}, Lv3/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Bundle;

    .line 4
    invoke-static {}, Landroidx/navigation/NavArgsLazyKt;->getMethodMap()Landroidx/collection/ArrayMap;

    move-result-object v1

    iget-object v2, p0, Landroidx/navigation/NavArgsLazy;->navArgsClass:Lkotlin/reflect/d;

    invoke-virtual {v1, v2}, Landroidx/collection/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/reflect/Method;

    if-nez v1, :cond_0

    .line 5
    iget-object v1, p0, Landroidx/navigation/NavArgsLazy;->navArgsClass:Lkotlin/reflect/d;

    invoke-static {v1}, Lu3/a;->e(Lkotlin/reflect/d;)Ljava/lang/Class;

    move-result-object v1

    invoke-static {}, Landroidx/navigation/NavArgsLazyKt;->getMethodSignature()[Ljava/lang/Class;

    move-result-object v2

    array-length v3, v2

    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/lang/Class;

    const-string v3, "fromBundle"

    invoke-virtual {v1, v3, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    .line 6
    invoke-static {}, Landroidx/navigation/NavArgsLazyKt;->getMethodMap()Landroidx/collection/ArrayMap;

    move-result-object v2

    iget-object v3, p0, Landroidx/navigation/NavArgsLazy;->navArgsClass:Lkotlin/reflect/d;

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "navArgsClass.java.getMet\u2026hod\n                    }"

    .line 7
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x0

    .line 8
    invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type Args of androidx.navigation.NavArgsLazy"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l0;->n(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/navigation/NavArgs;

    .line 9
    iput-object v0, p0, Landroidx/navigation/NavArgsLazy;->cached:Landroidx/navigation/NavArgs;

    :cond_1
    return-object v0
.end method

.method public bridge synthetic getValue()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/navigation/NavArgsLazy;->getValue()Landroidx/navigation/NavArgs;

    move-result-object v0

    return-object v0
.end method

.method public isInitialized()Z
    .locals 1

    iget-object v0, p0, Landroidx/navigation/NavArgsLazy;->cached:Landroidx/navigation/NavArgs;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
