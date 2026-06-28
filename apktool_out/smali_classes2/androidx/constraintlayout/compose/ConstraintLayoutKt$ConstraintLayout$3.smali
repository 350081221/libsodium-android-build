.class public final Landroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$3;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/constraintlayout/compose/ConstraintLayoutKt;->ConstraintLayout(Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/compose/ui/Modifier;IZLandroidx/compose/animation/core/AnimationSpec;Lv3/a;Lv3/p;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
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
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $channel:Lkotlinx/coroutines/channels/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/channels/l<",
            "Landroidx/constraintlayout/compose/ConstraintSet;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $constraintSet:Landroidx/constraintlayout/compose/ConstraintSet;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/channels/l;Landroidx/constraintlayout/compose/ConstraintSet;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/channels/l<",
            "Landroidx/constraintlayout/compose/ConstraintSet;",
            ">;",
            "Landroidx/constraintlayout/compose/ConstraintSet;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$3;->$channel:Lkotlinx/coroutines/channels/l;

    iput-object p2, p0, Landroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$3;->$constraintSet:Landroidx/constraintlayout/compose/ConstraintSet;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$3;->invoke()V

    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    return-object v0
.end method

.method public final invoke()V
    .locals 2

    .line 2
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$3;->$channel:Lkotlinx/coroutines/channels/l;

    iget-object v1, p0, Landroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$3;->$constraintSet:Landroidx/constraintlayout/compose/ConstraintSet;

    invoke-interface {v0, v1}, Lkotlinx/coroutines/channels/h0;->p(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
