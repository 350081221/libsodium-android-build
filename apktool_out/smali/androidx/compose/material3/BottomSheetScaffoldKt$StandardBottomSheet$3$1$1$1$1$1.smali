.class final Landroidx/compose/material3/BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$1$1;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1;->invoke(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/a<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "<anonymous>",
        "",
        "invoke",
        "()Ljava/lang/Boolean;"
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
.field final synthetic $scope:Lkotlinx/coroutines/s0;

.field final synthetic $this_with:Landroidx/compose/material3/SheetState;


# direct methods
.method constructor <init>(Lkotlinx/coroutines/s0;Landroidx/compose/material3/SheetState;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/material3/BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$1$1;->$scope:Lkotlinx/coroutines/s0;

    iput-object p2, p0, Landroidx/compose/material3/BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$1$1;->$this_with:Landroidx/compose/material3/SheetState;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Boolean;
    .locals 6
    .annotation build Lp4/l;
    .end annotation

    .line 2
    iget-object v0, p0, Landroidx/compose/material3/BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$1$1;->$scope:Lkotlinx/coroutines/s0;

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-instance v3, Landroidx/compose/material3/BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$1$1$1;

    iget-object v4, p0, Landroidx/compose/material3/BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$1$1;->$this_with:Landroidx/compose/material3/SheetState;

    const/4 v5, 0x0

    invoke-direct {v3, v4, v5}, Landroidx/compose/material3/BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$1$1$1;-><init>(Landroidx/compose/material3/SheetState;Lkotlin/coroutines/d;)V

    const/4 v4, 0x3

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/i;->e(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;Lkotlinx/coroutines/u0;Lv3/p;ILjava/lang/Object;)Lkotlinx/coroutines/l2;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/material3/BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$1$1;->invoke()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
