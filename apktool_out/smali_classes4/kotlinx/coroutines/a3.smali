.class public final Lkotlinx/coroutines/a3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/n1;
.implements Lkotlinx/coroutines/v;


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u00c7\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0008\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0008\u0010\n\u001a\u00020\tH\u0016R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u0011"
    }
    d2 = {
        "Lkotlinx/coroutines/a3;",
        "Lkotlinx/coroutines/n1;",
        "Lkotlinx/coroutines/v;",
        "Lkotlin/r2;",
        "dispose",
        "",
        "cause",
        "",
        "e",
        "",
        "toString",
        "Lkotlinx/coroutines/l2;",
        "getParent",
        "()Lkotlinx/coroutines/l2;",
        "parent",
        "<init>",
        "()V",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlinx/coroutines/g2;
.end annotation


# static fields
.field public static final a:Lkotlinx/coroutines/a3;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkotlinx/coroutines/a3;

    invoke-direct {v0}, Lkotlinx/coroutines/a3;-><init>()V

    sput-object v0, Lkotlinx/coroutines/a3;->a:Lkotlinx/coroutines/a3;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 0

    return-void
.end method

.method public e(Ljava/lang/Throwable;)Z
    .locals 0
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lp4/l;
        .end annotation
    .end param

    const/4 p1, 0x0

    return p1
.end method

.method public getParent()Lkotlinx/coroutines/l2;
    .locals 1
    .annotation build Lp4/m;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    const-string v0, "NonDisposableHandle"

    return-object v0
.end method
