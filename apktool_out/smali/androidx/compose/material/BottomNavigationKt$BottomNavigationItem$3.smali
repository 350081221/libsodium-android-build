.class final Landroidx/compose/material/BottomNavigationKt$BottomNavigationItem$3;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material/BottomNavigationKt;->BottomNavigationItem-jY6E1Zs(Landroidx/compose/foundation/layout/RowScope;ZLv3/a;Lv3/p;Landroidx/compose/ui/Modifier;ZLv3/p;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;JJLandroidx/compose/runtime/Composer;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/p<",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $$changed:I

.field final synthetic $$changed1:I

.field final synthetic $$default:I

.field final synthetic $alwaysShowLabel:Z

.field final synthetic $enabled:Z

.field final synthetic $icon:Lv3/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/p<",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

.field final synthetic $label:Lv3/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/p<",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $modifier:Landroidx/compose/ui/Modifier;

.field final synthetic $onClick:Lv3/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $selected:Z

.field final synthetic $selectedContentColor:J

.field final synthetic $this_BottomNavigationItem:Landroidx/compose/foundation/layout/RowScope;

.field final synthetic $unselectedContentColor:J


# direct methods
.method constructor <init>(Landroidx/compose/foundation/layout/RowScope;ZLv3/a;Lv3/p;Landroidx/compose/ui/Modifier;ZLv3/p;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;JJIII)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/layout/RowScope;",
            "Z",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;",
            "Lv3/p<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Z",
            "Lv3/p<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;Z",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "JJIII)V"
        }
    .end annotation

    move-object v0, p0

    move-object v1, p1

    iput-object v1, v0, Landroidx/compose/material/BottomNavigationKt$BottomNavigationItem$3;->$this_BottomNavigationItem:Landroidx/compose/foundation/layout/RowScope;

    move v1, p2

    iput-boolean v1, v0, Landroidx/compose/material/BottomNavigationKt$BottomNavigationItem$3;->$selected:Z

    move-object v1, p3

    iput-object v1, v0, Landroidx/compose/material/BottomNavigationKt$BottomNavigationItem$3;->$onClick:Lv3/a;

    move-object v1, p4

    iput-object v1, v0, Landroidx/compose/material/BottomNavigationKt$BottomNavigationItem$3;->$icon:Lv3/p;

    move-object v1, p5

    iput-object v1, v0, Landroidx/compose/material/BottomNavigationKt$BottomNavigationItem$3;->$modifier:Landroidx/compose/ui/Modifier;

    move v1, p6

    iput-boolean v1, v0, Landroidx/compose/material/BottomNavigationKt$BottomNavigationItem$3;->$enabled:Z

    move-object v1, p7

    iput-object v1, v0, Landroidx/compose/material/BottomNavigationKt$BottomNavigationItem$3;->$label:Lv3/p;

    move v1, p8

    iput-boolean v1, v0, Landroidx/compose/material/BottomNavigationKt$BottomNavigationItem$3;->$alwaysShowLabel:Z

    move-object v1, p9

    iput-object v1, v0, Landroidx/compose/material/BottomNavigationKt$BottomNavigationItem$3;->$interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    move-wide v1, p10

    iput-wide v1, v0, Landroidx/compose/material/BottomNavigationKt$BottomNavigationItem$3;->$selectedContentColor:J

    move-wide v1, p12

    iput-wide v1, v0, Landroidx/compose/material/BottomNavigationKt$BottomNavigationItem$3;->$unselectedContentColor:J

    move/from16 v1, p14

    iput v1, v0, Landroidx/compose/material/BottomNavigationKt$BottomNavigationItem$3;->$$changed:I

    move/from16 v1, p15

    iput v1, v0, Landroidx/compose/material/BottomNavigationKt$BottomNavigationItem$3;->$$changed1:I

    move/from16 v1, p16

    iput v1, v0, Landroidx/compose/material/BottomNavigationKt$BottomNavigationItem$3;->$$default:I

    const/4 v1, 0x2

    invoke-direct {p0, v1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroidx/compose/material/BottomNavigationKt$BottomNavigationItem$3;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 18
    .param p1    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param

    move-object/from16 v0, p0

    move-object/from16 v14, p1

    iget-object v1, v0, Landroidx/compose/material/BottomNavigationKt$BottomNavigationItem$3;->$this_BottomNavigationItem:Landroidx/compose/foundation/layout/RowScope;

    iget-boolean v2, v0, Landroidx/compose/material/BottomNavigationKt$BottomNavigationItem$3;->$selected:Z

    iget-object v3, v0, Landroidx/compose/material/BottomNavigationKt$BottomNavigationItem$3;->$onClick:Lv3/a;

    iget-object v4, v0, Landroidx/compose/material/BottomNavigationKt$BottomNavigationItem$3;->$icon:Lv3/p;

    iget-object v5, v0, Landroidx/compose/material/BottomNavigationKt$BottomNavigationItem$3;->$modifier:Landroidx/compose/ui/Modifier;

    iget-boolean v6, v0, Landroidx/compose/material/BottomNavigationKt$BottomNavigationItem$3;->$enabled:Z

    iget-object v7, v0, Landroidx/compose/material/BottomNavigationKt$BottomNavigationItem$3;->$label:Lv3/p;

    iget-boolean v8, v0, Landroidx/compose/material/BottomNavigationKt$BottomNavigationItem$3;->$alwaysShowLabel:Z

    iget-object v9, v0, Landroidx/compose/material/BottomNavigationKt$BottomNavigationItem$3;->$interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    iget-wide v10, v0, Landroidx/compose/material/BottomNavigationKt$BottomNavigationItem$3;->$selectedContentColor:J

    iget-wide v12, v0, Landroidx/compose/material/BottomNavigationKt$BottomNavigationItem$3;->$unselectedContentColor:J

    iget v15, v0, Landroidx/compose/material/BottomNavigationKt$BottomNavigationItem$3;->$$changed:I

    or-int/lit8 v15, v15, 0x1

    invoke-static {v15}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v15

    move-object/from16 p1, v1

    iget v1, v0, Landroidx/compose/material/BottomNavigationKt$BottomNavigationItem$3;->$$changed1:I

    invoke-static {v1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v16

    iget v1, v0, Landroidx/compose/material/BottomNavigationKt$BottomNavigationItem$3;->$$default:I

    move/from16 v17, v1

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v17}, Landroidx/compose/material/BottomNavigationKt;->BottomNavigationItem-jY6E1Zs(Landroidx/compose/foundation/layout/RowScope;ZLv3/a;Lv3/p;Landroidx/compose/ui/Modifier;ZLv3/p;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;JJLandroidx/compose/runtime/Composer;III)V

    return-void
.end method
