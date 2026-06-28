.class final Landroidx/compose/material/ModalBottomSheetKt$rememberModalBottomSheetState$2;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material/ModalBottomSheetKt;->rememberModalBottomSheetState(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lv3/l;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ModalBottomSheetState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/a<",
        "Landroidx/compose/material/ModalBottomSheetState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Landroidx/compose/material/ModalBottomSheetState;",
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
.field final synthetic $animationSpec:Landroidx/compose/animation/core/AnimationSpec;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/animation/core/AnimationSpec<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $confirmValueChange:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "Landroidx/compose/material/ModalBottomSheetValue;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $density:Landroidx/compose/ui/unit/Density;

.field final synthetic $initialValue:Landroidx/compose/material/ModalBottomSheetValue;

.field final synthetic $skipHalfExpanded:Z


# direct methods
.method constructor <init>(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/ui/unit/Density;Landroidx/compose/animation/core/AnimationSpec;Lv3/l;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material/ModalBottomSheetValue;",
            "Landroidx/compose/ui/unit/Density;",
            "Landroidx/compose/animation/core/AnimationSpec<",
            "Ljava/lang/Float;",
            ">;",
            "Lv3/l<",
            "-",
            "Landroidx/compose/material/ModalBottomSheetValue;",
            "Ljava/lang/Boolean;",
            ">;Z)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/material/ModalBottomSheetKt$rememberModalBottomSheetState$2;->$initialValue:Landroidx/compose/material/ModalBottomSheetValue;

    iput-object p2, p0, Landroidx/compose/material/ModalBottomSheetKt$rememberModalBottomSheetState$2;->$density:Landroidx/compose/ui/unit/Density;

    iput-object p3, p0, Landroidx/compose/material/ModalBottomSheetKt$rememberModalBottomSheetState$2;->$animationSpec:Landroidx/compose/animation/core/AnimationSpec;

    iput-object p4, p0, Landroidx/compose/material/ModalBottomSheetKt$rememberModalBottomSheetState$2;->$confirmValueChange:Lv3/l;

    iput-boolean p5, p0, Landroidx/compose/material/ModalBottomSheetKt$rememberModalBottomSheetState$2;->$skipHalfExpanded:Z

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Landroidx/compose/material/ModalBottomSheetState;
    .locals 5
    .annotation build Lp4/l;
    .end annotation

    .line 2
    iget-object v0, p0, Landroidx/compose/material/ModalBottomSheetKt$rememberModalBottomSheetState$2;->$initialValue:Landroidx/compose/material/ModalBottomSheetValue;

    .line 3
    iget-object v1, p0, Landroidx/compose/material/ModalBottomSheetKt$rememberModalBottomSheetState$2;->$density:Landroidx/compose/ui/unit/Density;

    .line 4
    iget-object v2, p0, Landroidx/compose/material/ModalBottomSheetKt$rememberModalBottomSheetState$2;->$animationSpec:Landroidx/compose/animation/core/AnimationSpec;

    .line 5
    iget-object v3, p0, Landroidx/compose/material/ModalBottomSheetKt$rememberModalBottomSheetState$2;->$confirmValueChange:Lv3/l;

    .line 6
    iget-boolean v4, p0, Landroidx/compose/material/ModalBottomSheetKt$rememberModalBottomSheetState$2;->$skipHalfExpanded:Z

    .line 7
    invoke-static {v0, v1, v2, v3, v4}, Landroidx/compose/material/ModalBottomSheetKt;->ModalBottomSheetState(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/ui/unit/Density;Landroidx/compose/animation/core/AnimationSpec;Lv3/l;Z)Landroidx/compose/material/ModalBottomSheetState;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/material/ModalBottomSheetKt$rememberModalBottomSheetState$2;->invoke()Landroidx/compose/material/ModalBottomSheetState;

    move-result-object v0

    return-object v0
.end method
