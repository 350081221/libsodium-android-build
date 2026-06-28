.class final Landroidx/compose/foundation/text/selection/SelectionManager_androidKt$selectionMagnifier$1$2$1;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/text/selection/SelectionManager_androidKt$selectionMagnifier$1;->invoke(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Lv3/a<",
        "+",
        "Landroidx/compose/ui/geometry/Offset;",
        ">;",
        "Landroidx/compose/ui/Modifier;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0006\u001a\u00020\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lkotlin/Function0;",
        "Landroidx/compose/ui/geometry/Offset;",
        "center",
        "Landroidx/compose/ui/Modifier;",
        "invoke",
        "(Lv3/a;)Landroidx/compose/ui/Modifier;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field final synthetic $density:Landroidx/compose/ui/unit/Density;

.field final synthetic $magnifierSize$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/compose/ui/unit/IntSize;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroidx/compose/ui/unit/Density;Landroidx/compose/runtime/MutableState;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/unit/Density;",
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/compose/ui/unit/IntSize;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/foundation/text/selection/SelectionManager_androidKt$selectionMagnifier$1$2$1;->$density:Landroidx/compose/ui/unit/Density;

    iput-object p2, p0, Landroidx/compose/foundation/text/selection/SelectionManager_androidKt$selectionMagnifier$1$2$1;->$magnifierSize$delegate:Landroidx/compose/runtime/MutableState;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Lv3/a;)Landroidx/compose/ui/Modifier;
    .locals 14
    .param p1    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/a<",
            "Landroidx/compose/ui/geometry/Offset;",
            ">;)",
            "Landroidx/compose/ui/Modifier;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 2
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 3
    new-instance v1, Landroidx/compose/foundation/text/selection/SelectionManager_androidKt$selectionMagnifier$1$2$1$1;

    invoke-direct {v1, p1}, Landroidx/compose/foundation/text/selection/SelectionManager_androidKt$selectionMagnifier$1$2$1$1;-><init>(Lv3/a;)V

    const/4 v2, 0x0

    new-instance v3, Landroidx/compose/foundation/text/selection/SelectionManager_androidKt$selectionMagnifier$1$2$1$2;

    iget-object p1, p0, Landroidx/compose/foundation/text/selection/SelectionManager_androidKt$selectionMagnifier$1$2$1;->$density:Landroidx/compose/ui/unit/Density;

    iget-object v4, p0, Landroidx/compose/foundation/text/selection/SelectionManager_androidKt$selectionMagnifier$1$2$1;->$magnifierSize$delegate:Landroidx/compose/runtime/MutableState;

    invoke-direct {v3, p1, v4}, Landroidx/compose/foundation/text/selection/SelectionManager_androidKt$selectionMagnifier$1$2$1$2;-><init>(Landroidx/compose/ui/unit/Density;Landroidx/compose/runtime/MutableState;)V

    const/4 v4, 0x0

    const/4 v5, 0x1

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    .line 4
    sget-object p1, Landroidx/compose/foundation/PlatformMagnifierFactory;->Companion:Landroidx/compose/foundation/PlatformMagnifierFactory$Companion;

    invoke-virtual {p1}, Landroidx/compose/foundation/PlatformMagnifierFactory$Companion;->getForCurrentPlatform()Landroidx/compose/foundation/PlatformMagnifierFactory;

    move-result-object v11

    const/16 v12, 0x1ea

    const/4 v13, 0x0

    .line 5
    invoke-static/range {v0 .. v13}, Landroidx/compose/foundation/Magnifier_androidKt;->magnifier-jPUL71Q$default(Landroidx/compose/ui/Modifier;Lv3/l;Lv3/l;Lv3/l;FZJFFZLandroidx/compose/foundation/PlatformMagnifierFactory;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lv3/a;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/text/selection/SelectionManager_androidKt$selectionMagnifier$1$2$1;->invoke(Lv3/a;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1
.end method
