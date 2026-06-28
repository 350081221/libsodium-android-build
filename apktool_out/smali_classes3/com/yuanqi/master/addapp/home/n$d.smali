.class final Lcom/yuanqi/master/addapp/home/n$d;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/addapp/home/n;->a(ILcom/yuanqi/master/addapp/AddAppViewModel;Landroidx/compose/runtime/snapshots/SnapshotStateList;Landroidx/compose/runtime/Composer;I)V
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


# direct methods
.method constructor <init>(ILcom/yuanqi/master/addapp/AddAppViewModel;Landroidx/compose/runtime/snapshots/SnapshotStateList;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/yuanqi/master/addapp/AddAppViewModel;",
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Lcom/yuanqi/group/home/models/c;",
            ">;I)V"
        }
    .end annotation

    iput p1, p0, Lcom/yuanqi/master/addapp/home/n$d;->$index:I

    iput-object p2, p0, Lcom/yuanqi/master/addapp/home/n$d;->$addAppViewModel:Lcom/yuanqi/master/addapp/AddAppViewModel;

    iput-object p3, p0, Lcom/yuanqi/master/addapp/home/n$d;->$appShowList:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iput p4, p0, Lcom/yuanqi/master/addapp/home/n$d;->$$changed:I

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

    invoke-virtual {p0, p1, p2}, Lcom/yuanqi/master/addapp/home/n$d;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 3
    .param p1    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param

    iget p2, p0, Lcom/yuanqi/master/addapp/home/n$d;->$index:I

    iget-object v0, p0, Lcom/yuanqi/master/addapp/home/n$d;->$addAppViewModel:Lcom/yuanqi/master/addapp/AddAppViewModel;

    iget-object v1, p0, Lcom/yuanqi/master/addapp/home/n$d;->$appShowList:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iget v2, p0, Lcom/yuanqi/master/addapp/home/n$d;->$$changed:I

    or-int/lit8 v2, v2, 0x1

    invoke-static {v2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v2

    invoke-static {p2, v0, v1, p1, v2}, Lcom/yuanqi/master/addapp/home/n;->a(ILcom/yuanqi/master/addapp/AddAppViewModel;Landroidx/compose/runtime/snapshots/SnapshotStateList;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method
