.class final Lcom/yuanqi/master/addapp/home/n$e$c$a$g$a;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/addapp/home/n$e$c$a$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/p<",
        "Landroidx/compose/ui/input/pointer/PointerInputChange;",
        "Landroidx/compose/ui/geometry/Offset;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "<anonymous>",
        "",
        "change",
        "Landroidx/compose/ui/input/pointer/PointerInputChange;",
        "<anonymous parameter 1>",
        "Landroidx/compose/ui/geometry/Offset;",
        "invoke-Uv8p0NA",
        "(Landroidx/compose/ui/input/pointer/PointerInputChange;J)V"
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
        "SMAP\nSelectAppScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectAppScreen.kt\ncom/yuanqi/master/addapp/home/SelectAppScreenKt$SelectAppScene$1$3$1$1$7$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,676:1\n223#2,2:677\n*S KotlinDebug\n*F\n+ 1 SelectAppScreen.kt\ncom/yuanqi/master/addapp/home/SelectAppScreenKt$SelectAppScene$1$3$1$1$7$1\n*L\n340#1:677,2\n*E\n"
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

.field final synthetic $boxSize:F

.field final synthetic $gridState:Landroidx/compose/foundation/lazy/grid/LazyGridState;

.field final synthetic $scope:Lkotlinx/coroutines/s0;


# direct methods
.method constructor <init>(FLcom/yuanqi/master/addapp/AddAppViewModel;Landroidx/compose/runtime/snapshots/SnapshotStateList;Lkotlinx/coroutines/s0;Landroidx/compose/foundation/lazy/grid/LazyGridState;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F",
            "Lcom/yuanqi/master/addapp/AddAppViewModel;",
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Lcom/yuanqi/group/home/models/c;",
            ">;",
            "Lkotlinx/coroutines/s0;",
            "Landroidx/compose/foundation/lazy/grid/LazyGridState;",
            ")V"
        }
    .end annotation

    iput p1, p0, Lcom/yuanqi/master/addapp/home/n$e$c$a$g$a;->$boxSize:F

    iput-object p2, p0, Lcom/yuanqi/master/addapp/home/n$e$c$a$g$a;->$addAppViewModel:Lcom/yuanqi/master/addapp/AddAppViewModel;

    iput-object p3, p0, Lcom/yuanqi/master/addapp/home/n$e$c$a$g$a;->$appShowList:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iput-object p4, p0, Lcom/yuanqi/master/addapp/home/n$e$c$a$g$a;->$scope:Lkotlinx/coroutines/s0;

    iput-object p5, p0, Lcom/yuanqi/master/addapp/home/n$e$c$a$g$a;->$gridState:Landroidx/compose/foundation/lazy/grid/LazyGridState;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Landroidx/compose/ui/input/pointer/PointerInputChange;

    check-cast p2, Landroidx/compose/ui/geometry/Offset;

    invoke-virtual {p2}, Landroidx/compose/ui/geometry/Offset;->unbox-impl()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, Lcom/yuanqi/master/addapp/home/n$e$c$a$g$a;->invoke-Uv8p0NA(Landroidx/compose/ui/input/pointer/PointerInputChange;J)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke-Uv8p0NA(Landroidx/compose/ui/input/pointer/PointerInputChange;J)V
    .locals 7
    .param p1    # Landroidx/compose/ui/input/pointer/PointerInputChange;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string p2, "change"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPosition-F1C5BW0()J

    .line 7
    .line 8
    .line 9
    move-result-wide p1

    .line 10
    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iget p2, p0, Lcom/yuanqi/master/addapp/home/n$e$c$a$g$a;->$boxSize:F

    .line 15
    .line 16
    div-float/2addr p1, p2

    .line 17
    const/4 p2, 0x0

    .line 18
    cmpg-float p2, p1, p2

    .line 19
    .line 20
    if-ltz p2, :cond_3

    .line 21
    .line 22
    iget-object p2, p0, Lcom/yuanqi/master/addapp/home/n$e$c$a$g$a;->$addAppViewModel:Lcom/yuanqi/master/addapp/AddAppViewModel;

    .line 23
    .line 24
    invoke-virtual {p2}, Lcom/yuanqi/master/addapp/AddAppViewModel;->v()Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    invoke-virtual {p2}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->size()I

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    int-to-float p2, p2

    .line 33
    cmpl-float p2, p1, p2

    .line 34
    .line 35
    if-ltz p2, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    iget-object p2, p0, Lcom/yuanqi/master/addapp/home/n$e$c$a$g$a;->$addAppViewModel:Lcom/yuanqi/master/addapp/AddAppViewModel;

    .line 39
    .line 40
    invoke-virtual {p2}, Lcom/yuanqi/master/addapp/AddAppViewModel;->C()Landroidx/compose/runtime/MutableState;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    iget-object p3, p0, Lcom/yuanqi/master/addapp/home/n$e$c$a$g$a;->$addAppViewModel:Lcom/yuanqi/master/addapp/AddAppViewModel;

    .line 45
    .line 46
    invoke-virtual {p3}, Lcom/yuanqi/master/addapp/AddAppViewModel;->v()Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 47
    .line 48
    .line 49
    move-result-object p3

    .line 50
    invoke-virtual {p3}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->toList()Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object p3

    .line 54
    float-to-int p1, p1

    .line 55
    invoke-interface {p3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    check-cast p1, Ljava/lang/Character;

    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    invoke-static {p1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-interface {p2, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    iget-object p1, p0, Lcom/yuanqi/master/addapp/home/n$e$c$a$g$a;->$appShowList:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 73
    .line 74
    iget-object p2, p0, Lcom/yuanqi/master/addapp/home/n$e$c$a$g$a;->$addAppViewModel:Lcom/yuanqi/master/addapp/AddAppViewModel;

    .line 75
    .line 76
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result p3

    .line 84
    if-eqz p3, :cond_2

    .line 85
    .line 86
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p3

    .line 90
    check-cast p3, Lcom/yuanqi/group/home/models/c;

    .line 91
    .line 92
    iget-object v0, p3, Lcom/yuanqi/group/home/models/c;->j:Ljava/lang/Character;

    .line 93
    .line 94
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-virtual {p2}, Lcom/yuanqi/master/addapp/AddAppViewModel;->C()Landroidx/compose/runtime/MutableState;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-interface {v1}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-eqz v0, :cond_1

    .line 111
    .line 112
    iget-object v1, p0, Lcom/yuanqi/master/addapp/home/n$e$c$a$g$a;->$scope:Lkotlinx/coroutines/s0;

    .line 113
    .line 114
    const/4 v2, 0x0

    .line 115
    const/4 v3, 0x0

    .line 116
    new-instance v4, Lcom/yuanqi/master/addapp/home/n$e$c$a$g$a$a;

    .line 117
    .line 118
    iget-object p1, p0, Lcom/yuanqi/master/addapp/home/n$e$c$a$g$a;->$gridState:Landroidx/compose/foundation/lazy/grid/LazyGridState;

    .line 119
    .line 120
    iget-object p2, p0, Lcom/yuanqi/master/addapp/home/n$e$c$a$g$a;->$appShowList:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 121
    .line 122
    const/4 v0, 0x0

    .line 123
    invoke-direct {v4, p1, p2, p3, v0}, Lcom/yuanqi/master/addapp/home/n$e$c$a$g$a$a;-><init>(Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/runtime/snapshots/SnapshotStateList;Lcom/yuanqi/group/home/models/c;Lkotlin/coroutines/d;)V

    .line 124
    .line 125
    .line 126
    const/4 v5, 0x3

    .line 127
    const/4 v6, 0x0

    .line 128
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/i;->e(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;Lkotlinx/coroutines/u0;Lv3/p;ILjava/lang/Object;)Lkotlinx/coroutines/l2;

    .line 129
    .line 130
    .line 131
    return-void

    .line 132
    :cond_2
    new-instance p1, Ljava/util/NoSuchElementException;

    .line 133
    .line 134
    const-string p2, "Collection contains no element matching the predicate."

    .line 135
    .line 136
    invoke-direct {p1, p2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    throw p1

    .line 140
    :cond_3
    :goto_0
    return-void
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
.end method
