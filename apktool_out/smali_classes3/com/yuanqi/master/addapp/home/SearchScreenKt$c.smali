.class final Lcom/yuanqi/master/addapp/home/SearchScreenKt$c;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/a;


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

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nSearchScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchScreen.kt\ncom/yuanqi/master/addapp/home/SearchScreenKt$SearchGridItems$2$1$1$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,447:1\n766#2:448\n857#2,2:449\n*S KotlinDebug\n*F\n+ 1 SearchScreen.kt\ncom/yuanqi/master/addapp/home/SearchScreenKt$SearchGridItems$2$1$1$2\n*L\n407#1:448\n407#1:449,2\n*E\n"
    }
.end annotation


# instance fields
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

.field final synthetic $context:Landroid/content/Context;

.field final synthetic $index:I

.field final synthetic $info:Lcom/yuanqi/group/home/models/c;

.field final synthetic $installNum:Landroidx/compose/runtime/MutableIntState;


# direct methods
.method constructor <init>(Landroidx/compose/runtime/snapshots/SnapshotStateList;Lcom/yuanqi/master/addapp/AddAppViewModel;Lcom/yuanqi/group/home/models/c;Landroid/content/Context;Landroidx/compose/runtime/MutableIntState;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Lcom/yuanqi/group/home/models/c;",
            ">;",
            "Lcom/yuanqi/master/addapp/AddAppViewModel;",
            "Lcom/yuanqi/group/home/models/c;",
            "Landroid/content/Context;",
            "Landroidx/compose/runtime/MutableIntState;",
            "I)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$c;->$appShowList:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iput-object p2, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$c;->$addAppViewModel:Lcom/yuanqi/master/addapp/AddAppViewModel;

    iput-object p3, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$c;->$info:Lcom/yuanqi/group/home/models/c;

    iput-object p4, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$c;->$context:Landroid/content/Context;

    iput-object p5, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$c;->$installNum:Landroidx/compose/runtime/MutableIntState;

    iput p6, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$c;->$index:I

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/yuanqi/master/addapp/home/SearchScreenKt$c;->invoke()V

    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    return-object v0
.end method

.method public final invoke()V
    .locals 6

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 3
    iget-object v1, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$c;->$appShowList:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 4
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 5
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Lcom/yuanqi/group/home/models/c;

    .line 6
    iget v5, v5, Lcom/yuanqi/group/home/models/c;->f:I

    if-lez v5, :cond_1

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-eqz v4, :cond_0

    .line 7
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 8
    :cond_2
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 9
    sget-object v1, Lcom/yuanqi/master/mine/account/a;->a:Lcom/yuanqi/master/mine/account/a;

    invoke-virtual {v1}, Lcom/yuanqi/master/mine/account/a;->k()Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$c;->$addAppViewModel:Lcom/yuanqi/master/addapp/AddAppViewModel;

    iget-object v2, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$c;->$info:Lcom/yuanqi/group/home/models/c;

    iget-object v2, v2, Lcom/yuanqi/group/home/models/c;->a:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Lcom/yuanqi/master/addapp/AddAppViewModel;->N(Ljava/util/ArrayList;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 10
    iget-object v0, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$c;->$addAppViewModel:Lcom/yuanqi/master/addapp/AddAppViewModel;

    iget-object v1, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$c;->$context:Landroid/content/Context;

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Lcom/yuanqi/master/BaseViewModel;->b(Landroid/content/Context;I)V

    return-void

    .line 11
    :cond_3
    iget-object v0, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$c;->$info:Lcom/yuanqi/group/home/models/c;

    invoke-virtual {v0}, Lcom/yuanqi/group/home/models/c;->a()Lcom/yuanqi/group/home/models/c;

    move-result-object v0

    .line 12
    iget-object v1, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$c;->$installNum:Landroidx/compose/runtime/MutableIntState;

    invoke-interface {v1}, Landroidx/compose/runtime/MutableIntState;->getValue()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    add-int/2addr v2, v4

    invoke-interface {v1, v2}, Landroidx/compose/runtime/MutableIntState;->setValue(I)V

    .line 13
    iget-object v1, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$c;->$installNum:Landroidx/compose/runtime/MutableIntState;

    invoke-interface {v1}, Landroidx/compose/runtime/MutableIntState;->getValue()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iput v1, v0, Lcom/yuanqi/group/home/models/c;->f:I

    .line 14
    iget-object v1, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$c;->$appShowList:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iget v2, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$c;->$index:I

    invoke-virtual {v0}, Lcom/yuanqi/group/home/models/c;->a()Lcom/yuanqi/group/home/models/c;

    move-result-object v0

    const-string v3, "copy(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2, v0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
