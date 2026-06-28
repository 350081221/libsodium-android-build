.class public final Landroidx/compose/ui/node/ObserverNodeOwnerScope;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/node/OwnerScope;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/node/ObserverNodeOwnerScope$Companion;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0008\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\nB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000b"
    }
    d2 = {
        "Landroidx/compose/ui/node/ObserverNodeOwnerScope;",
        "Landroidx/compose/ui/node/OwnerScope;",
        "observerNode",
        "Landroidx/compose/ui/node/ObserverModifierNode;",
        "(Landroidx/compose/ui/node/ObserverModifierNode;)V",
        "isValidOwnerScope",
        "",
        "()Z",
        "getObserverNode$ui_release",
        "()Landroidx/compose/ui/node/ObserverModifierNode;",
        "Companion",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Landroidx/compose/ui/node/ObserverNodeOwnerScope$Companion;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final OnObserveReadsChanged:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "Landroidx/compose/ui/node/ObserverNodeOwnerScope;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field


# instance fields
.field private final observerNode:Landroidx/compose/ui/node/ObserverModifierNode;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/compose/ui/node/ObserverNodeOwnerScope$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Landroidx/compose/ui/node/ObserverNodeOwnerScope$Companion;-><init>(Lkotlin/jvm/internal/w;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/compose/ui/node/ObserverNodeOwnerScope;->Companion:Landroidx/compose/ui/node/ObserverNodeOwnerScope$Companion;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    sput v0, Landroidx/compose/ui/node/ObserverNodeOwnerScope;->$stable:I

    .line 12
    .line 13
    sget-object v0, Landroidx/compose/ui/node/ObserverNodeOwnerScope$Companion$OnObserveReadsChanged$1;->INSTANCE:Landroidx/compose/ui/node/ObserverNodeOwnerScope$Companion$OnObserveReadsChanged$1;

    .line 14
    .line 15
    sput-object v0, Landroidx/compose/ui/node/ObserverNodeOwnerScope;->OnObserveReadsChanged:Lv3/l;

    .line 16
    .line 17
    return-void
    .line 18
    .line 19
.end method

.method public constructor <init>(Landroidx/compose/ui/node/ObserverModifierNode;)V
    .locals 0
    .param p1    # Landroidx/compose/ui/node/ObserverModifierNode;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/node/ObserverNodeOwnerScope;->observerNode:Landroidx/compose/ui/node/ObserverModifierNode;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
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
.end method

.method public static final synthetic access$getOnObserveReadsChanged$cp()Lv3/l;
    .locals 1

    sget-object v0, Landroidx/compose/ui/node/ObserverNodeOwnerScope;->OnObserveReadsChanged:Lv3/l;

    return-object v0
.end method


# virtual methods
.method public final getObserverNode$ui_release()Landroidx/compose/ui/node/ObserverModifierNode;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/node/ObserverNodeOwnerScope;->observerNode:Landroidx/compose/ui/node/ObserverModifierNode;

    return-object v0
.end method

.method public isValidOwnerScope()Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/node/ObserverNodeOwnerScope;->observerNode:Landroidx/compose/ui/node/ObserverModifierNode;

    invoke-interface {v0}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    move-result v0

    return v0
.end method
