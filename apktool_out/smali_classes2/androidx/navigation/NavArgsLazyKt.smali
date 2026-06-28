.class public final Landroidx/navigation/NavArgsLazyKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000$\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\"&\u0010\u0003\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u00010\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006\".\u0010\u000b\u001a\u0016\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00020\t0\u0008\u0012\u0004\u0012\u00020\n0\u00078\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "",
        "Ljava/lang/Class;",
        "Landroid/os/Bundle;",
        "methodSignature",
        "[Ljava/lang/Class;",
        "getMethodSignature",
        "()[Ljava/lang/Class;",
        "Landroidx/collection/ArrayMap;",
        "Lkotlin/reflect/d;",
        "Landroidx/navigation/NavArgs;",
        "Ljava/lang/reflect/Method;",
        "methodMap",
        "Landroidx/collection/ArrayMap;",
        "getMethodMap",
        "()Landroidx/collection/ArrayMap;",
        "navigation-common_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field private static final methodMap:Landroidx/collection/ArrayMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/ArrayMap<",
            "Lkotlin/reflect/d<",
            "+",
            "Landroidx/navigation/NavArgs;",
            ">;",
            "Ljava/lang/reflect/Method;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final methodSignature:[Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/Class<",
            "Landroid/os/Bundle;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    new-array v0, v0, [Ljava/lang/Class;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    const-class v2, Landroid/os/Bundle;

    .line 6
    .line 7
    aput-object v2, v0, v1

    .line 8
    .line 9
    sput-object v0, Landroidx/navigation/NavArgsLazyKt;->methodSignature:[Ljava/lang/Class;

    .line 10
    .line 11
    new-instance v0, Landroidx/collection/ArrayMap;

    .line 12
    .line 13
    invoke-direct {v0}, Landroidx/collection/ArrayMap;-><init>()V

    .line 14
    .line 15
    .line 16
    sput-object v0, Landroidx/navigation/NavArgsLazyKt;->methodMap:Landroidx/collection/ArrayMap;

    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
.end method

.method public static final getMethodMap()Landroidx/collection/ArrayMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/collection/ArrayMap<",
            "Lkotlin/reflect/d<",
            "+",
            "Landroidx/navigation/NavArgs;",
            ">;",
            "Ljava/lang/reflect/Method;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Landroidx/navigation/NavArgsLazyKt;->methodMap:Landroidx/collection/ArrayMap;

    return-object v0
.end method

.method public static final getMethodSignature()[Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Ljava/lang/Class<",
            "Landroid/os/Bundle;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Landroidx/navigation/NavArgsLazyKt;->methodSignature:[Ljava/lang/Class;

    return-object v0
.end method
