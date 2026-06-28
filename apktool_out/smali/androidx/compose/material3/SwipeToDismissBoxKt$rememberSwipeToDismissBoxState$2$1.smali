.class final Landroidx/compose/material3/SwipeToDismissBoxKt$rememberSwipeToDismissBoxState$2$1;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/SwipeToDismissBoxKt;->rememberSwipeToDismissBoxState(Landroidx/compose/material3/SwipeToDismissBoxValue;Lv3/l;Lv3/l;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SwipeToDismissBoxState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/a<",
        "Landroidx/compose/material3/SwipeToDismissBoxState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Landroidx/compose/material3/SwipeToDismissBoxState;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $confirmValueChange:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "Landroidx/compose/material3/SwipeToDismissBoxValue;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $density:Landroidx/compose/ui/unit/Density;

.field final synthetic $initialValue:Landroidx/compose/material3/SwipeToDismissBoxValue;

.field final synthetic $positionalThreshold:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroidx/compose/material3/SwipeToDismissBoxValue;Landroidx/compose/ui/unit/Density;Lv3/l;Lv3/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material3/SwipeToDismissBoxValue;",
            "Landroidx/compose/ui/unit/Density;",
            "Lv3/l<",
            "-",
            "Landroidx/compose/material3/SwipeToDismissBoxValue;",
            "Ljava/lang/Boolean;",
            ">;",
            "Lv3/l<",
            "-",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/material3/SwipeToDismissBoxKt$rememberSwipeToDismissBoxState$2$1;->$initialValue:Landroidx/compose/material3/SwipeToDismissBoxValue;

    iput-object p2, p0, Landroidx/compose/material3/SwipeToDismissBoxKt$rememberSwipeToDismissBoxState$2$1;->$density:Landroidx/compose/ui/unit/Density;

    iput-object p3, p0, Landroidx/compose/material3/SwipeToDismissBoxKt$rememberSwipeToDismissBoxState$2$1;->$confirmValueChange:Lv3/l;

    iput-object p4, p0, Landroidx/compose/material3/SwipeToDismissBoxKt$rememberSwipeToDismissBoxState$2$1;->$positionalThreshold:Lv3/l;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Landroidx/compose/material3/SwipeToDismissBoxState;
    .locals 5
    .annotation build Lp4/l;
    .end annotation

    .line 2
    new-instance v0, Landroidx/compose/material3/SwipeToDismissBoxState;

    iget-object v1, p0, Landroidx/compose/material3/SwipeToDismissBoxKt$rememberSwipeToDismissBoxState$2$1;->$initialValue:Landroidx/compose/material3/SwipeToDismissBoxValue;

    iget-object v2, p0, Landroidx/compose/material3/SwipeToDismissBoxKt$rememberSwipeToDismissBoxState$2$1;->$density:Landroidx/compose/ui/unit/Density;

    iget-object v3, p0, Landroidx/compose/material3/SwipeToDismissBoxKt$rememberSwipeToDismissBoxState$2$1;->$confirmValueChange:Lv3/l;

    iget-object v4, p0, Landroidx/compose/material3/SwipeToDismissBoxKt$rememberSwipeToDismissBoxState$2$1;->$positionalThreshold:Lv3/l;

    invoke-direct {v0, v1, v2, v3, v4}, Landroidx/compose/material3/SwipeToDismissBoxState;-><init>(Landroidx/compose/material3/SwipeToDismissBoxValue;Landroidx/compose/ui/unit/Density;Lv3/l;Lv3/l;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/material3/SwipeToDismissBoxKt$rememberSwipeToDismissBoxState$2$1;->invoke()Landroidx/compose/material3/SwipeToDismissBoxState;

    move-result-object v0

    return-object v0
.end method
