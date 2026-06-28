.class public final Lkotlinx/coroutines/internal/y;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0016\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0012\u001a\u0010\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002*\u00020\u0000H\u0001\"\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0081T\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u0012\u0004\u0008\u0007\u0010\u0008\"\u001a\u0010\u000c\u001a\u00020\u00048\u0000X\u0081T\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u0006\u0012\u0004\u0008\u000b\u0010\u0008\"\u001a\u0010\u000f\u001a\u00020\u00048\u0000X\u0081T\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u0006\u0012\u0004\u0008\u000e\u0010\u0008\" \u0010\u0014\u001a\u00020\u00008\u0000X\u0081\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0010\u0010\u0011\u0012\u0004\u0008\u0013\u0010\u0008\u001a\u0004\u0008\u0005\u0010\u0012*\u000c\u0008\u0002\u0010\u0015\"\u00020\u00012\u00020\u0001\u00a8\u0006\u0016"
    }
    d2 = {
        "",
        "Lkotlinx/coroutines/internal/z;",
        "Lkotlinx/coroutines/internal/Node;",
        "f",
        "",
        "a",
        "I",
        "getUNDECIDED$annotations",
        "()V",
        "UNDECIDED",
        "b",
        "getSUCCESS$annotations",
        "SUCCESS",
        "c",
        "getFAILURE$annotations",
        "FAILURE",
        "d",
        "Ljava/lang/Object;",
        "()Ljava/lang/Object;",
        "getCONDITION_FALSE$annotations",
        "CONDITION_FALSE",
        "Node",
        "kotlinx-coroutines-core"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final a:I = 0x0

.field public static final b:I = 0x1

.field public static final c:I = 0x2

.field private static final d:Ljava/lang/Object;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lkotlinx/coroutines/internal/t0;

    const-string v1, "CONDITION_FALSE"

    invoke-direct {v0, v1}, Lkotlinx/coroutines/internal/t0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lkotlinx/coroutines/internal/y;->d:Ljava/lang/Object;

    return-void
.end method

.method public static final a()Ljava/lang/Object;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Lkotlinx/coroutines/internal/y;->d:Ljava/lang/Object;

    return-object v0
.end method

.method public static synthetic b()V
    .locals 0
    .annotation build Lkotlin/a1;
    .end annotation

    return-void
.end method

.method public static synthetic c()V
    .locals 0
    .annotation build Lkotlin/a1;
    .end annotation

    return-void
.end method

.method public static synthetic d()V
    .locals 0
    .annotation build Lkotlin/a1;
    .end annotation

    return-void
.end method

.method public static synthetic e()V
    .locals 0
    .annotation build Lkotlin/a1;
    .end annotation

    return-void
.end method

.method public static final f(Ljava/lang/Object;)Lkotlinx/coroutines/internal/z;
    .locals 1
    .param p0    # Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lkotlin/a1;
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    instance-of v0, p0, Lkotlinx/coroutines/internal/n0;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lkotlinx/coroutines/internal/n0;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    iget-object v0, v0, Lkotlinx/coroutines/internal/n0;->a:Lkotlinx/coroutines/internal/z;

    if-nez v0, :cond_2

    :cond_1
    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->n(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    check-cast v0, Lkotlinx/coroutines/internal/z;

    :cond_2
    return-object v0
.end method
