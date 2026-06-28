.class final Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$a$a$b;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$a$a;->invoke(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Ljava/lang/String;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
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
        "SMAP\nSearchScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchScreen.kt\ncom/yuanqi/master/addapp/home/SearchScreenKt$SearchScreen$5$1$1$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,447:1\n766#2:448\n857#2,2:449\n*S KotlinDebug\n*F\n+ 1 SearchScreen.kt\ncom/yuanqi/master/addapp/home/SearchScreenKt$SearchScreen$5$1$1$2\n*L\n240#1:448\n240#1:449,2\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $addAppViewModel:Lcom/yuanqi/master/addapp/AddAppViewModel;

.field final synthetic $appshowList:Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Lcom/yuanqi/group/home/models/c;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $searchStr:Lkotlin/jvm/internal/k1$h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/k1$h<",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/k1$h;Landroidx/compose/runtime/snapshots/SnapshotStateList;Lcom/yuanqi/master/addapp/AddAppViewModel;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/k1$h<",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;>;",
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Lcom/yuanqi/group/home/models/c;",
            ">;",
            "Lcom/yuanqi/master/addapp/AddAppViewModel;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$a$a$b;->$searchStr:Lkotlin/jvm/internal/k1$h;

    iput-object p2, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$a$a$b;->$appshowList:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iput-object p3, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$a$a$b;->$addAppViewModel:Lcom/yuanqi/master/addapp/AddAppViewModel;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Ljava/lang/String;Lcom/yuanqi/group/home/models/c;Lcom/yuanqi/group/home/models/c;)I
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$a$a$b;->invoke$lambda$1(Ljava/lang/String;Lcom/yuanqi/group/home/models/c;Lcom/yuanqi/group/home/models/c;)I

    move-result p0

    return p0
.end method

.method private static final invoke$lambda$1(Ljava/lang/String;Lcom/yuanqi/group/home/models/c;Lcom/yuanqi/group/home/models/c;)I
    .locals 8

    .line 1
    const-string v0, "$it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p1, Lcom/yuanqi/group/home/models/c;->e:Ljava/lang/CharSequence;

    .line 7
    .line 8
    const-string v0, "name"

    .line 9
    .line 10
    invoke-static {v1, v0}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x1

    .line 15
    const/4 v5, 0x2

    .line 16
    const/4 v6, 0x0

    .line 17
    move-object v2, p0

    .line 18
    invoke-static/range {v1 .. v6}, Lkotlin/text/v;->p3(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    iget-object v2, p2, Lcom/yuanqi/group/home/models/c;->e:Ljava/lang/CharSequence;

    .line 23
    .line 24
    invoke-static {v2, v0}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 v4, 0x0

    .line 28
    const/4 v5, 0x1

    .line 29
    const/4 v6, 0x2

    .line 30
    const/4 v7, 0x0

    .line 31
    move-object v3, p0

    .line 32
    invoke-static/range {v2 .. v7}, Lkotlin/text/v;->p3(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    if-ne v1, p0, :cond_0

    .line 37
    .line 38
    iget-object p0, p1, Lcom/yuanqi/group/home/models/c;->e:Ljava/lang/CharSequence;

    .line 39
    .line 40
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    iget-object p1, p2, Lcom/yuanqi/group/home/models/c;->e:Ljava/lang/CharSequence;

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    invoke-static {v1, p0}, Lkotlin/jvm/internal/l0;->t(II)I

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    :goto_0
    return p0
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$a$a$b;->invoke(Ljava/lang/String;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Ljava/lang/String;)V
    .locals 5
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$a$a$b;->$searchStr:Lkotlin/jvm/internal/k1$h;

    iget-object v0, v0, Lkotlin/jvm/internal/k1$h;->element:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/runtime/MutableState;

    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 3
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 4
    iget-object p1, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$a$a$b;->$appshowList:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    invoke-virtual {p1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->clear()V

    goto :goto_2

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$a$a$b;->$addAppViewModel:Lcom/yuanqi/master/addapp/AddAppViewModel;

    invoke-virtual {v0}, Lcom/yuanqi/master/addapp/AddAppViewModel;->l()Landroidx/compose/runtime/snapshots/SnapshotStateList;

    move-result-object v0

    .line 6
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 7
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lcom/yuanqi/group/home/models/c;

    .line 8
    iget-object v4, v4, Lcom/yuanqi/group/home/models/c;->e:Ljava/lang/CharSequence;

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, p1, v1}, Lkotlin/text/v;->Q2(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 9
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 10
    :cond_3
    new-instance v0, Lcom/yuanqi/master/addapp/home/m;

    invoke-direct {v0, p1}, Lcom/yuanqi/master/addapp/home/m;-><init>(Ljava/lang/String;)V

    invoke-static {v2, v0}, Lkotlin/collections/u;->r5(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p1

    .line 11
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "YuanQi"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    iget-object v0, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$a$a$b;->$appshowList:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->clear()V

    .line 13
    iget-object v0, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$a$a$b;->$appshowList:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {v0, p1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->addAll(Ljava/util/Collection;)Z

    :goto_2
    return-void
.end method
