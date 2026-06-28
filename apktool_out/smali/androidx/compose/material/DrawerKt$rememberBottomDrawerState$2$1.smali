.class final Landroidx/compose/material/DrawerKt$rememberBottomDrawerState$2$1;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material/DrawerKt;->rememberBottomDrawerState(Landroidx/compose/material/BottomDrawerValue;Lv3/l;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BottomDrawerState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/a<",
        "Landroidx/compose/material/BottomDrawerState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Landroidx/compose/material/BottomDrawerState;",
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
.field final synthetic $confirmStateChange:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "Landroidx/compose/material/BottomDrawerValue;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $density:Landroidx/compose/ui/unit/Density;

.field final synthetic $initialValue:Landroidx/compose/material/BottomDrawerValue;


# direct methods
.method constructor <init>(Landroidx/compose/material/BottomDrawerValue;Landroidx/compose/ui/unit/Density;Lv3/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material/BottomDrawerValue;",
            "Landroidx/compose/ui/unit/Density;",
            "Lv3/l<",
            "-",
            "Landroidx/compose/material/BottomDrawerValue;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/material/DrawerKt$rememberBottomDrawerState$2$1;->$initialValue:Landroidx/compose/material/BottomDrawerValue;

    iput-object p2, p0, Landroidx/compose/material/DrawerKt$rememberBottomDrawerState$2$1;->$density:Landroidx/compose/ui/unit/Density;

    iput-object p3, p0, Landroidx/compose/material/DrawerKt$rememberBottomDrawerState$2$1;->$confirmStateChange:Lv3/l;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Landroidx/compose/material/BottomDrawerState;
    .locals 3
    .annotation build Lp4/l;
    .end annotation

    .line 2
    iget-object v0, p0, Landroidx/compose/material/DrawerKt$rememberBottomDrawerState$2$1;->$initialValue:Landroidx/compose/material/BottomDrawerValue;

    iget-object v1, p0, Landroidx/compose/material/DrawerKt$rememberBottomDrawerState$2$1;->$density:Landroidx/compose/ui/unit/Density;

    iget-object v2, p0, Landroidx/compose/material/DrawerKt$rememberBottomDrawerState$2$1;->$confirmStateChange:Lv3/l;

    invoke-static {v0, v1, v2}, Landroidx/compose/material/DrawerKt;->BottomDrawerState(Landroidx/compose/material/BottomDrawerValue;Landroidx/compose/ui/unit/Density;Lv3/l;)Landroidx/compose/material/BottomDrawerState;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/material/DrawerKt$rememberBottomDrawerState$2$1;->invoke()Landroidx/compose/material/BottomDrawerState;

    move-result-object v0

    return-object v0
.end method
