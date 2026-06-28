.class final Landroidx/compose/material3/TimePickerKt$TimeSelector$2$1;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/TimePickerKt;->TimeSelector-uXwN82Y(Landroidx/compose/ui/Modifier;ILandroidx/compose/material3/TimePickerState;ILandroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/a<",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Lkotlin/r2;",
        "invoke",
        "()V",
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
.field final synthetic $scope:Lkotlinx/coroutines/s0;

.field final synthetic $selection:I

.field final synthetic $state:Landroidx/compose/material3/TimePickerState;


# direct methods
.method constructor <init>(ILandroidx/compose/material3/TimePickerState;Lkotlinx/coroutines/s0;)V
    .locals 0

    iput p1, p0, Landroidx/compose/material3/TimePickerKt$TimeSelector$2$1;->$selection:I

    iput-object p2, p0, Landroidx/compose/material3/TimePickerKt$TimeSelector$2$1;->$state:Landroidx/compose/material3/TimePickerState;

    iput-object p3, p0, Landroidx/compose/material3/TimePickerKt$TimeSelector$2$1;->$scope:Lkotlinx/coroutines/s0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/material3/TimePickerKt$TimeSelector$2$1;->invoke()V

    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    return-object v0
.end method

.method public final invoke()V
    .locals 8

    .line 2
    iget v0, p0, Landroidx/compose/material3/TimePickerKt$TimeSelector$2$1;->$selection:I

    iget-object v1, p0, Landroidx/compose/material3/TimePickerKt$TimeSelector$2$1;->$state:Landroidx/compose/material3/TimePickerState;

    invoke-virtual {v1}, Landroidx/compose/material3/TimePickerState;->getSelection-JiIwxys$material3_release()I

    move-result v1

    invoke-static {v0, v1}, Landroidx/compose/material3/Selection;->equals-impl0(II)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Landroidx/compose/material3/TimePickerKt$TimeSelector$2$1;->$state:Landroidx/compose/material3/TimePickerState;

    iget v1, p0, Landroidx/compose/material3/TimePickerKt$TimeSelector$2$1;->$selection:I

    invoke-virtual {v0, v1}, Landroidx/compose/material3/TimePickerState;->setSelection-iHAOin8$material3_release(I)V

    .line 4
    iget-object v2, p0, Landroidx/compose/material3/TimePickerKt$TimeSelector$2$1;->$scope:Lkotlinx/coroutines/s0;

    const/4 v3, 0x0

    const/4 v4, 0x0

    new-instance v5, Landroidx/compose/material3/TimePickerKt$TimeSelector$2$1$1;

    iget-object v0, p0, Landroidx/compose/material3/TimePickerKt$TimeSelector$2$1;->$state:Landroidx/compose/material3/TimePickerState;

    const/4 v1, 0x0

    invoke-direct {v5, v0, v1}, Landroidx/compose/material3/TimePickerKt$TimeSelector$2$1$1;-><init>(Landroidx/compose/material3/TimePickerState;Lkotlin/coroutines/d;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/i;->e(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;Lkotlinx/coroutines/u0;Lv3/p;ILjava/lang/Object;)Lkotlinx/coroutines/l2;

    :cond_0
    return-void
.end method
