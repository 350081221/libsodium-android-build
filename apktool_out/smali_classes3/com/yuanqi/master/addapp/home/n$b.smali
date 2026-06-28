.class final Lcom/yuanqi/master/addapp/home/n$b;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/a;


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
        "Lv3/a<",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
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

.field final synthetic $installNum:Landroidx/compose/runtime/MutableIntState;


# direct methods
.method constructor <init>(Lcom/yuanqi/group/home/models/c;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/runtime/snapshots/SnapshotStateList;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/yuanqi/group/home/models/c;",
            "Landroidx/compose/runtime/MutableIntState;",
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Lcom/yuanqi/group/home/models/c;",
            ">;I)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/yuanqi/master/addapp/home/n$b;->$info:Lcom/yuanqi/group/home/models/c;

    iput-object p2, p0, Lcom/yuanqi/master/addapp/home/n$b;->$installNum:Landroidx/compose/runtime/MutableIntState;

    iput-object p3, p0, Lcom/yuanqi/master/addapp/home/n$b;->$appShowList:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iput p4, p0, Lcom/yuanqi/master/addapp/home/n$b;->$index:I

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/yuanqi/master/addapp/home/n$b;->invoke()V

    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    return-object v0
.end method

.method public final invoke()V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/yuanqi/master/addapp/home/n$b;->$info:Lcom/yuanqi/group/home/models/c;

    invoke-virtual {v0}, Lcom/yuanqi/group/home/models/c;->a()Lcom/yuanqi/group/home/models/c;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/yuanqi/master/addapp/home/n$b;->$installNum:Landroidx/compose/runtime/MutableIntState;

    invoke-interface {v1}, Landroidx/compose/runtime/MutableIntState;->getIntValue()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-interface {v1, v2}, Landroidx/compose/runtime/MutableIntState;->setIntValue(I)V

    .line 4
    iget-object v1, p0, Lcom/yuanqi/master/addapp/home/n$b;->$installNum:Landroidx/compose/runtime/MutableIntState;

    invoke-interface {v1}, Landroidx/compose/runtime/MutableIntState;->getIntValue()I

    move-result v1

    iput v1, v0, Lcom/yuanqi/group/home/models/c;->f:I

    .line 5
    iget-object v1, p0, Lcom/yuanqi/master/addapp/home/n$b;->$appShowList:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iget v2, p0, Lcom/yuanqi/master/addapp/home/n$b;->$index:I

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    invoke-virtual {v1, v2, v0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
