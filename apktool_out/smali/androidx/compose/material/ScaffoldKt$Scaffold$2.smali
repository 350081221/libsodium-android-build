.class final Landroidx/compose/material/ScaffoldKt$Scaffold$2;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material/ScaffoldKt;->Scaffold-u4IkXBM(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/Modifier;Landroidx/compose/material/ScaffoldState;Lv3/p;Lv3/p;Lv3/q;Lv3/p;IZLv3/q;ZLandroidx/compose/ui/graphics/Shape;FJJJJJLv3/q;Landroidx/compose/runtime/Composer;III)V
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

.field final synthetic $backgroundColor:J

.field final synthetic $bottomBar:Lv3/p;
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

.field final synthetic $content:Lv3/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/q<",
            "Landroidx/compose/foundation/layout/PaddingValues;",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $contentColor:J

.field final synthetic $contentWindowInsets:Landroidx/compose/foundation/layout/WindowInsets;

.field final synthetic $drawerBackgroundColor:J

.field final synthetic $drawerContent:Lv3/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/q<",
            "Landroidx/compose/foundation/layout/ColumnScope;",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $drawerContentColor:J

.field final synthetic $drawerElevation:F

.field final synthetic $drawerGesturesEnabled:Z

.field final synthetic $drawerScrimColor:J

.field final synthetic $drawerShape:Landroidx/compose/ui/graphics/Shape;

.field final synthetic $floatingActionButton:Lv3/p;
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

.field final synthetic $floatingActionButtonPosition:I

.field final synthetic $isFloatingActionButtonDocked:Z

.field final synthetic $modifier:Landroidx/compose/ui/Modifier;

.field final synthetic $scaffoldState:Landroidx/compose/material/ScaffoldState;

.field final synthetic $snackbarHost:Lv3/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/q<",
            "Landroidx/compose/material/SnackbarHostState;",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $topBar:Lv3/p;
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


# direct methods
.method constructor <init>(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/Modifier;Landroidx/compose/material/ScaffoldState;Lv3/p;Lv3/p;Lv3/q;Lv3/p;IZLv3/q;ZLandroidx/compose/ui/graphics/Shape;FJJJJJLv3/q;III)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/layout/WindowInsets;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/material/ScaffoldState;",
            "Lv3/p<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;",
            "Lv3/p<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;",
            "Lv3/q<",
            "-",
            "Landroidx/compose/material/SnackbarHostState;",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;",
            "Lv3/p<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;IZ",
            "Lv3/q<",
            "-",
            "Landroidx/compose/foundation/layout/ColumnScope;",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;Z",
            "Landroidx/compose/ui/graphics/Shape;",
            "FJJJJJ",
            "Lv3/q<",
            "-",
            "Landroidx/compose/foundation/layout/PaddingValues;",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;III)V"
        }
    .end annotation

    move-object v0, p0

    move-object v1, p1

    iput-object v1, v0, Landroidx/compose/material/ScaffoldKt$Scaffold$2;->$contentWindowInsets:Landroidx/compose/foundation/layout/WindowInsets;

    move-object v1, p2

    iput-object v1, v0, Landroidx/compose/material/ScaffoldKt$Scaffold$2;->$modifier:Landroidx/compose/ui/Modifier;

    move-object v1, p3

    iput-object v1, v0, Landroidx/compose/material/ScaffoldKt$Scaffold$2;->$scaffoldState:Landroidx/compose/material/ScaffoldState;

    move-object v1, p4

    iput-object v1, v0, Landroidx/compose/material/ScaffoldKt$Scaffold$2;->$topBar:Lv3/p;

    move-object v1, p5

    iput-object v1, v0, Landroidx/compose/material/ScaffoldKt$Scaffold$2;->$bottomBar:Lv3/p;

    move-object v1, p6

    iput-object v1, v0, Landroidx/compose/material/ScaffoldKt$Scaffold$2;->$snackbarHost:Lv3/q;

    move-object v1, p7

    iput-object v1, v0, Landroidx/compose/material/ScaffoldKt$Scaffold$2;->$floatingActionButton:Lv3/p;

    move v1, p8

    iput v1, v0, Landroidx/compose/material/ScaffoldKt$Scaffold$2;->$floatingActionButtonPosition:I

    move v1, p9

    iput-boolean v1, v0, Landroidx/compose/material/ScaffoldKt$Scaffold$2;->$isFloatingActionButtonDocked:Z

    move-object v1, p10

    iput-object v1, v0, Landroidx/compose/material/ScaffoldKt$Scaffold$2;->$drawerContent:Lv3/q;

    move v1, p11

    iput-boolean v1, v0, Landroidx/compose/material/ScaffoldKt$Scaffold$2;->$drawerGesturesEnabled:Z

    move-object v1, p12

    iput-object v1, v0, Landroidx/compose/material/ScaffoldKt$Scaffold$2;->$drawerShape:Landroidx/compose/ui/graphics/Shape;

    move/from16 v1, p13

    iput v1, v0, Landroidx/compose/material/ScaffoldKt$Scaffold$2;->$drawerElevation:F

    move-wide/from16 v1, p14

    iput-wide v1, v0, Landroidx/compose/material/ScaffoldKt$Scaffold$2;->$drawerBackgroundColor:J

    move-wide/from16 v1, p16

    iput-wide v1, v0, Landroidx/compose/material/ScaffoldKt$Scaffold$2;->$drawerContentColor:J

    move-wide/from16 v1, p18

    iput-wide v1, v0, Landroidx/compose/material/ScaffoldKt$Scaffold$2;->$drawerScrimColor:J

    move-wide/from16 v1, p20

    iput-wide v1, v0, Landroidx/compose/material/ScaffoldKt$Scaffold$2;->$backgroundColor:J

    move-wide/from16 v1, p22

    iput-wide v1, v0, Landroidx/compose/material/ScaffoldKt$Scaffold$2;->$contentColor:J

    move-object/from16 v1, p24

    iput-object v1, v0, Landroidx/compose/material/ScaffoldKt$Scaffold$2;->$content:Lv3/q;

    move/from16 v1, p25

    iput v1, v0, Landroidx/compose/material/ScaffoldKt$Scaffold$2;->$$changed:I

    move/from16 v1, p26

    iput v1, v0, Landroidx/compose/material/ScaffoldKt$Scaffold$2;->$$changed1:I

    move/from16 v1, p27

    iput v1, v0, Landroidx/compose/material/ScaffoldKt$Scaffold$2;->$$default:I

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

    invoke-virtual {p0, p1, p2}, Landroidx/compose/material/ScaffoldKt$Scaffold$2;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 29
    .param p1    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param

    move-object/from16 v0, p0

    move-object/from16 v25, p1

    iget-object v1, v0, Landroidx/compose/material/ScaffoldKt$Scaffold$2;->$contentWindowInsets:Landroidx/compose/foundation/layout/WindowInsets;

    iget-object v2, v0, Landroidx/compose/material/ScaffoldKt$Scaffold$2;->$modifier:Landroidx/compose/ui/Modifier;

    iget-object v3, v0, Landroidx/compose/material/ScaffoldKt$Scaffold$2;->$scaffoldState:Landroidx/compose/material/ScaffoldState;

    iget-object v4, v0, Landroidx/compose/material/ScaffoldKt$Scaffold$2;->$topBar:Lv3/p;

    iget-object v5, v0, Landroidx/compose/material/ScaffoldKt$Scaffold$2;->$bottomBar:Lv3/p;

    iget-object v6, v0, Landroidx/compose/material/ScaffoldKt$Scaffold$2;->$snackbarHost:Lv3/q;

    iget-object v7, v0, Landroidx/compose/material/ScaffoldKt$Scaffold$2;->$floatingActionButton:Lv3/p;

    iget v8, v0, Landroidx/compose/material/ScaffoldKt$Scaffold$2;->$floatingActionButtonPosition:I

    iget-boolean v9, v0, Landroidx/compose/material/ScaffoldKt$Scaffold$2;->$isFloatingActionButtonDocked:Z

    iget-object v10, v0, Landroidx/compose/material/ScaffoldKt$Scaffold$2;->$drawerContent:Lv3/q;

    iget-boolean v11, v0, Landroidx/compose/material/ScaffoldKt$Scaffold$2;->$drawerGesturesEnabled:Z

    iget-object v12, v0, Landroidx/compose/material/ScaffoldKt$Scaffold$2;->$drawerShape:Landroidx/compose/ui/graphics/Shape;

    iget v13, v0, Landroidx/compose/material/ScaffoldKt$Scaffold$2;->$drawerElevation:F

    iget-wide v14, v0, Landroidx/compose/material/ScaffoldKt$Scaffold$2;->$drawerBackgroundColor:J

    move-object/from16 p1, v1

    move-object/from16 p2, v2

    iget-wide v1, v0, Landroidx/compose/material/ScaffoldKt$Scaffold$2;->$drawerContentColor:J

    move-wide/from16 v16, v1

    iget-wide v1, v0, Landroidx/compose/material/ScaffoldKt$Scaffold$2;->$drawerScrimColor:J

    move-wide/from16 v18, v1

    iget-wide v1, v0, Landroidx/compose/material/ScaffoldKt$Scaffold$2;->$backgroundColor:J

    move-wide/from16 v20, v1

    iget-wide v1, v0, Landroidx/compose/material/ScaffoldKt$Scaffold$2;->$contentColor:J

    move-wide/from16 v22, v1

    iget-object v1, v0, Landroidx/compose/material/ScaffoldKt$Scaffold$2;->$content:Lv3/q;

    move-object/from16 v24, v1

    iget v1, v0, Landroidx/compose/material/ScaffoldKt$Scaffold$2;->$$changed:I

    or-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v26

    iget v1, v0, Landroidx/compose/material/ScaffoldKt$Scaffold$2;->$$changed1:I

    invoke-static {v1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v27

    iget v1, v0, Landroidx/compose/material/ScaffoldKt$Scaffold$2;->$$default:I

    move/from16 v28, v1

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-static/range {v1 .. v28}, Landroidx/compose/material/ScaffoldKt;->Scaffold-u4IkXBM(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/Modifier;Landroidx/compose/material/ScaffoldState;Lv3/p;Lv3/p;Lv3/q;Lv3/p;IZLv3/q;ZLandroidx/compose/ui/graphics/Shape;FJJJJJLv3/q;Landroidx/compose/runtime/Composer;III)V

    return-void
.end method
