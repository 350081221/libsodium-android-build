.class final Landroidx/compose/foundation/pager/PagerKt$VerticalPager$2;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/pager/PagerKt;->VerticalPager-xYaah8o(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/pager/PageSize;IFLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;ZZLv3/l;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Lv3/r;Landroidx/compose/runtime/Composer;III)V
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

.field final synthetic $beyondBoundsPageCount:I

.field final synthetic $contentPadding:Landroidx/compose/foundation/layout/PaddingValues;

.field final synthetic $flingBehavior:Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;

.field final synthetic $horizontalAlignment:Landroidx/compose/ui/Alignment$Horizontal;

.field final synthetic $key:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $modifier:Landroidx/compose/ui/Modifier;

.field final synthetic $pageContent:Lv3/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/r<",
            "Landroidx/compose/foundation/pager/PagerScope;",
            "Ljava/lang/Integer;",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $pageNestedScrollConnection:Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;

.field final synthetic $pageSize:Landroidx/compose/foundation/pager/PageSize;

.field final synthetic $pageSpacing:F

.field final synthetic $reverseLayout:Z

.field final synthetic $state:Landroidx/compose/foundation/pager/PagerState;

.field final synthetic $userScrollEnabled:Z


# direct methods
.method constructor <init>(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/pager/PageSize;IFLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;ZZLv3/l;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Lv3/r;III)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/pager/PagerState;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/foundation/layout/PaddingValues;",
            "Landroidx/compose/foundation/pager/PageSize;",
            "IF",
            "Landroidx/compose/ui/Alignment$Horizontal;",
            "Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;",
            "ZZ",
            "Lv3/l<",
            "-",
            "Ljava/lang/Integer;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;",
            "Lv3/r<",
            "-",
            "Landroidx/compose/foundation/pager/PagerScope;",
            "-",
            "Ljava/lang/Integer;",
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

    iput-object v1, v0, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$2;->$state:Landroidx/compose/foundation/pager/PagerState;

    move-object v1, p2

    iput-object v1, v0, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$2;->$modifier:Landroidx/compose/ui/Modifier;

    move-object v1, p3

    iput-object v1, v0, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$2;->$contentPadding:Landroidx/compose/foundation/layout/PaddingValues;

    move-object v1, p4

    iput-object v1, v0, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$2;->$pageSize:Landroidx/compose/foundation/pager/PageSize;

    move v1, p5

    iput v1, v0, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$2;->$beyondBoundsPageCount:I

    move v1, p6

    iput v1, v0, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$2;->$pageSpacing:F

    move-object v1, p7

    iput-object v1, v0, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$2;->$horizontalAlignment:Landroidx/compose/ui/Alignment$Horizontal;

    move-object v1, p8

    iput-object v1, v0, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$2;->$flingBehavior:Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;

    move v1, p9

    iput-boolean v1, v0, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$2;->$userScrollEnabled:Z

    move v1, p10

    iput-boolean v1, v0, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$2;->$reverseLayout:Z

    move-object v1, p11

    iput-object v1, v0, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$2;->$key:Lv3/l;

    move-object v1, p12

    iput-object v1, v0, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$2;->$pageNestedScrollConnection:Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;

    move-object v1, p13

    iput-object v1, v0, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$2;->$pageContent:Lv3/r;

    move/from16 v1, p14

    iput v1, v0, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$2;->$$changed:I

    move/from16 v1, p15

    iput v1, v0, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$2;->$$changed1:I

    move/from16 v1, p16

    iput v1, v0, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$2;->$$default:I

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

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$2;->invoke(Landroidx/compose/runtime/Composer;I)V

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

    iget-object v1, v0, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$2;->$state:Landroidx/compose/foundation/pager/PagerState;

    iget-object v2, v0, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$2;->$modifier:Landroidx/compose/ui/Modifier;

    iget-object v3, v0, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$2;->$contentPadding:Landroidx/compose/foundation/layout/PaddingValues;

    iget-object v4, v0, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$2;->$pageSize:Landroidx/compose/foundation/pager/PageSize;

    iget v5, v0, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$2;->$beyondBoundsPageCount:I

    iget v6, v0, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$2;->$pageSpacing:F

    iget-object v7, v0, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$2;->$horizontalAlignment:Landroidx/compose/ui/Alignment$Horizontal;

    iget-object v8, v0, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$2;->$flingBehavior:Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;

    iget-boolean v9, v0, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$2;->$userScrollEnabled:Z

    iget-boolean v10, v0, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$2;->$reverseLayout:Z

    iget-object v11, v0, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$2;->$key:Lv3/l;

    iget-object v12, v0, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$2;->$pageNestedScrollConnection:Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;

    iget-object v13, v0, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$2;->$pageContent:Lv3/r;

    iget v15, v0, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$2;->$$changed:I

    or-int/lit8 v15, v15, 0x1

    invoke-static {v15}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v15

    move-object/from16 p1, v1

    iget v1, v0, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$2;->$$changed1:I

    invoke-static {v1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v16

    iget v1, v0, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$2;->$$default:I

    move/from16 v17, v1

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v17}, Landroidx/compose/foundation/pager/PagerKt;->VerticalPager-xYaah8o(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/pager/PageSize;IFLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;ZZLv3/l;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Lv3/r;Landroidx/compose/runtime/Composer;III)V

    return-void
.end method
