.class public final Landroidx/compose/foundation/pager/PagerLazyAnimateScrollScopeKt$PagerLazyAnimateScrollScope$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/pager/PagerLazyAnimateScrollScopeKt;->PagerLazyAnimateScrollScope(Landroidx/compose/foundation/pager/PagerState;)Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001c\u0010\u0008\u001a\u00020\u0007*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0018\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016J9\u0010\u0012\u001a\u00020\u00072\'\u0010\u0011\u001a#\u0008\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\r\u00a2\u0006\u0002\u0008\u0010H\u0096@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00028VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u00028VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\u0015R\u0014\u0010\u001e\u001a\u00020\u00028VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010\u0015\u00a8\u0006\u001f"
    }
    d2 = {
        "androidx/compose/foundation/pager/PagerLazyAnimateScrollScopeKt$PagerLazyAnimateScrollScope$1",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;",
        "",
        "index",
        "getVisibleItemScrollOffset",
        "Landroidx/compose/foundation/gestures/ScrollScope;",
        "scrollOffset",
        "Lkotlin/r2;",
        "snapToItem",
        "targetIndex",
        "targetItemOffset",
        "",
        "calculateDistanceTo",
        "Lkotlin/Function2;",
        "Lkotlin/coroutines/d;",
        "",
        "Lkotlin/u;",
        "block",
        "scroll",
        "(Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;",
        "getFirstVisibleItemIndex",
        "()I",
        "firstVisibleItemIndex",
        "getFirstVisibleItemScrollOffset",
        "firstVisibleItemScrollOffset",
        "getLastVisibleItemIndex",
        "lastVisibleItemIndex",
        "getItemCount",
        "itemCount",
        "getVisibleItemsAverageSize",
        "visibleItemsAverageSize",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nPagerLazyAnimateScrollScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerLazyAnimateScrollScope.kt\nandroidx/compose/foundation/pager/PagerLazyAnimateScrollScopeKt$PagerLazyAnimateScrollScope$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,67:1\n116#2,2:68\n33#2,6:70\n118#2:76\n*S KotlinDebug\n*F\n+ 1 PagerLazyAnimateScrollScope.kt\nandroidx/compose/foundation/pager/PagerLazyAnimateScrollScopeKt$PagerLazyAnimateScrollScope$1\n*L\n45#1:68,2\n45#1:70,6\n45#1:76\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $state:Landroidx/compose/foundation/pager/PagerState;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/pager/PagerState;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/pager/PagerLazyAnimateScrollScopeKt$PagerLazyAnimateScrollScope$1;->$state:Landroidx/compose/foundation/pager/PagerState;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method


# virtual methods
.method public calculateDistanceTo(II)F
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerLazyAnimateScrollScopeKt$PagerLazyAnimateScrollScope$1;->$state:Landroidx/compose/foundation/pager/PagerState;

    invoke-virtual {v0}, Landroidx/compose/foundation/pager/PagerState;->getCurrentPage()I

    move-result v0

    sub-int/2addr p1, v0

    int-to-float p1, p1

    invoke-virtual {p0}, Landroidx/compose/foundation/pager/PagerLazyAnimateScrollScopeKt$PagerLazyAnimateScrollScope$1;->getVisibleItemsAverageSize()I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr p1, v0

    int-to-float p2, p2

    add-float/2addr p1, p2

    return p1
.end method

.method public getFirstVisibleItemIndex()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerLazyAnimateScrollScopeKt$PagerLazyAnimateScrollScope$1;->$state:Landroidx/compose/foundation/pager/PagerState;

    invoke-virtual {v0}, Landroidx/compose/foundation/pager/PagerState;->getFirstVisiblePage$foundation_release()I

    move-result v0

    return v0
.end method

.method public getFirstVisibleItemScrollOffset()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerLazyAnimateScrollScopeKt$PagerLazyAnimateScrollScope$1;->$state:Landroidx/compose/foundation/pager/PagerState;

    invoke-virtual {v0}, Landroidx/compose/foundation/pager/PagerState;->getFirstVisiblePageOffset$foundation_release()I

    move-result v0

    return v0
.end method

.method public getItemCount()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerLazyAnimateScrollScopeKt$PagerLazyAnimateScrollScope$1;->$state:Landroidx/compose/foundation/pager/PagerState;

    invoke-virtual {v0}, Landroidx/compose/foundation/pager/PagerState;->getPageCount()I

    move-result v0

    return v0
.end method

.method public getLastVisibleItemIndex()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerLazyAnimateScrollScopeKt$PagerLazyAnimateScrollScope$1;->$state:Landroidx/compose/foundation/pager/PagerState;

    invoke-virtual {v0}, Landroidx/compose/foundation/pager/PagerState;->getLayoutInfo()Landroidx/compose/foundation/pager/PagerLayoutInfo;

    move-result-object v0

    invoke-interface {v0}, Landroidx/compose/foundation/pager/PagerLayoutInfo;->getVisiblePagesInfo()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/u;->m3(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/foundation/pager/PageInfo;

    invoke-interface {v0}, Landroidx/compose/foundation/pager/PageInfo;->getIndex()I

    move-result v0

    return v0
.end method

.method public getVisibleItemScrollOffset(I)I
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerLazyAnimateScrollScopeKt$PagerLazyAnimateScrollScope$1;->$state:Landroidx/compose/foundation/pager/PagerState;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/foundation/pager/PagerState;->getLayoutInfo()Landroidx/compose/foundation/pager/PagerLayoutInfo;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Landroidx/compose/foundation/pager/PagerLayoutInfo;->getVisiblePagesInfo()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x0

    .line 16
    move v3, v2

    .line 17
    :goto_0
    if-ge v3, v1, :cond_2

    .line 18
    .line 19
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    move-object v5, v4

    .line 24
    check-cast v5, Landroidx/compose/foundation/pager/PageInfo;

    .line 25
    .line 26
    invoke-interface {v5}, Landroidx/compose/foundation/pager/PageInfo;->getIndex()I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    if-ne v5, p1, :cond_0

    .line 31
    .line 32
    const/4 v5, 0x1

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    move v5, v2

    .line 35
    :goto_1
    if-eqz v5, :cond_1

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    const/4 v4, 0x0

    .line 42
    :goto_2
    check-cast v4, Landroidx/compose/foundation/pager/PageInfo;

    .line 43
    .line 44
    if-eqz v4, :cond_3

    .line 45
    .line 46
    invoke-interface {v4}, Landroidx/compose/foundation/pager/PageInfo;->getOffset()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    :cond_3
    return v2
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
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
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method

.method public getVisibleItemsAverageSize()I
    .locals 2

    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerLazyAnimateScrollScopeKt$PagerLazyAnimateScrollScope$1;->$state:Landroidx/compose/foundation/pager/PagerState;

    invoke-virtual {v0}, Landroidx/compose/foundation/pager/PagerState;->getPageSize$foundation_release()I

    move-result v0

    iget-object v1, p0, Landroidx/compose/foundation/pager/PagerLazyAnimateScrollScopeKt$PagerLazyAnimateScrollScope$1;->$state:Landroidx/compose/foundation/pager/PagerState;

    invoke-virtual {v1}, Landroidx/compose/foundation/pager/PagerState;->getPageSpacing$foundation_release()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public scroll(Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 6
    .param p1    # Lv3/p;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/p<",
            "-",
            "Landroidx/compose/foundation/gestures/ScrollScope;",
            "-",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerLazyAnimateScrollScopeKt$PagerLazyAnimateScrollScope$1;->$state:Landroidx/compose/foundation/pager/PagerState;

    const/4 v1, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/gestures/ScrollableState;->scroll$default(Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/MutatePriority;Lv3/p;Lkotlin/coroutines/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public snapToItem(Landroidx/compose/foundation/gestures/ScrollScope;II)V
    .locals 0
    .param p1    # Landroidx/compose/foundation/gestures/ScrollScope;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    int-to-float p1, p3

    .line 2
    iget-object p3, p0, Landroidx/compose/foundation/pager/PagerLazyAnimateScrollScopeKt$PagerLazyAnimateScrollScope$1;->$state:Landroidx/compose/foundation/pager/PagerState;

    .line 3
    .line 4
    invoke-virtual {p3}, Landroidx/compose/foundation/pager/PagerState;->getPageSizeWithSpacing$foundation_release()I

    .line 5
    .line 6
    .line 7
    move-result p3

    .line 8
    int-to-float p3, p3

    .line 9
    div-float/2addr p1, p3

    .line 10
    iget-object p3, p0, Landroidx/compose/foundation/pager/PagerLazyAnimateScrollScopeKt$PagerLazyAnimateScrollScope$1;->$state:Landroidx/compose/foundation/pager/PagerState;

    .line 11
    .line 12
    invoke-virtual {p3, p2, p1}, Landroidx/compose/foundation/pager/PagerState;->snapToItem$foundation_release(IF)V

    .line 13
    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
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
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
.end method
