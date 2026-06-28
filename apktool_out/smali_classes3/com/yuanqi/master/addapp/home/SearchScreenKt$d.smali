.class final Lcom/yuanqi/master/addapp/home/SearchScreenKt$d;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/addapp/home/SearchScreenKt;->a(Lcom/yuanqi/master/addapp/AddAppViewModel;Lcom/yuanqi/group/home/models/c;ILandroidx/compose/runtime/snapshots/SnapshotStateList;Lv3/a;Landroidx/compose/runtime/Composer;I)V
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
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $$changed:I

.field final synthetic $action:Lv3/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $addAppViewModel:Lcom/yuanqi/master/addapp/AddAppViewModel;

.field final synthetic $appShowList:Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Lcom/yuanqi/group/home/models/c;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $index:I

.field final synthetic $info:Lcom/yuanqi/group/home/models/c;


# direct methods
.method constructor <init>(Lcom/yuanqi/master/addapp/AddAppViewModel;Lcom/yuanqi/group/home/models/c;ILandroidx/compose/runtime/snapshots/SnapshotStateList;Lv3/a;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/yuanqi/master/addapp/AddAppViewModel;",
            "Lcom/yuanqi/group/home/models/c;",
            "I",
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Lcom/yuanqi/group/home/models/c;",
            ">;",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;I)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$d;->$addAppViewModel:Lcom/yuanqi/master/addapp/AddAppViewModel;

    iput-object p2, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$d;->$info:Lcom/yuanqi/group/home/models/c;

    iput p3, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$d;->$index:I

    iput-object p4, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$d;->$appShowList:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iput-object p5, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$d;->$action:Lv3/a;

    iput p6, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$d;->$$changed:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/yuanqi/master/addapp/home/SearchScreenKt$d;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 7
    .param p1    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$d;->$addAppViewModel:Lcom/yuanqi/master/addapp/AddAppViewModel;

    iget-object v1, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$d;->$info:Lcom/yuanqi/group/home/models/c;

    iget v2, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$d;->$index:I

    iget-object v3, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$d;->$appShowList:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iget-object v4, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$d;->$action:Lv3/a;

    iget p2, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$d;->$$changed:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v6

    move-object v5, p1

    invoke-static/range {v0 .. v6}, Lcom/yuanqi/master/addapp/home/SearchScreenKt;->a(Lcom/yuanqi/master/addapp/AddAppViewModel;Lcom/yuanqi/group/home/models/c;ILandroidx/compose/runtime/snapshots/SnapshotStateList;Lv3/a;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method
