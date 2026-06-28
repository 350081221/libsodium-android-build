.class public final Landroidx/room/util/RelationUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/RestrictTo;
    value = {
        .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP_PREFIX:Landroidx/annotation/RestrictTo$Scope;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001ar\u0010\u000b\u001a\u00020\t\"\u0008\u0008\u0000\u0010\u0001*\u00020\u0000\"\u0004\u0008\u0001\u0010\u00022\"\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u00042\u0006\u0010\u0007\u001a\u00020\u00062.\u0010\n\u001a*\u0012 \u0012\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0004\u0012\u0004\u0012\u00020\t0\u0008\u001a<\u0010\r\u001a\u00020\t\"\u0004\u0008\u0000\u0010\u00022\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000c2\u0006\u0010\u0007\u001a\u00020\u00062\u0018\u0010\n\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u000c\u0012\u0004\u0012\u00020\t0\u0008\u001aR\u0010\u000f\u001a\u00020\t\"\u0008\u0008\u0000\u0010\u0001*\u00020\u0000\"\u0004\u0008\u0001\u0010\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u001e\u0010\n\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e\u0012\u0004\u0012\u00020\t0\u0008\u00a8\u0006\u0010"
    }
    d2 = {
        "",
        "K",
        "V",
        "Ljava/util/HashMap;",
        "Lkotlin/collections/HashMap;",
        "map",
        "",
        "isRelationCollection",
        "Lkotlin/Function1;",
        "Lkotlin/r2;",
        "fetchBlock",
        "recursiveFetchHashMap",
        "Landroidx/collection/LongSparseArray;",
        "recursiveFetchLongSparseArray",
        "Landroidx/collection/ArrayMap;",
        "recursiveFetchArrayMap",
        "room-runtime_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lu3/h;
    name = "RelationUtil"
.end annotation


# direct methods
.method public static final recursiveFetchArrayMap(Landroidx/collection/ArrayMap;ZLv3/l;)V
    .locals 8
    .param p0    # Landroidx/collection/ArrayMap;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/collection/ArrayMap<",
            "TK;TV;>;Z",
            "Lv3/l<",
            "-",
            "Landroidx/collection/ArrayMap<",
            "TK;TV;>;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "map"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "fetchBlock"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Landroidx/collection/ArrayMap;

    .line 12
    .line 13
    const/16 v1, 0x3e7

    .line 14
    .line 15
    invoke-direct {v0, v1}, Landroidx/collection/ArrayMap;-><init>(I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Landroidx/collection/SimpleArrayMap;->size()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    const/4 v3, 0x0

    .line 23
    move v4, v3

    .line 24
    move v5, v4

    .line 25
    :cond_0
    :goto_0
    if-ge v4, v2, :cond_3

    .line 26
    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0, v4}, Landroidx/collection/SimpleArrayMap;->keyAt(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    invoke-virtual {p0, v4}, Landroidx/collection/SimpleArrayMap;->valueAt(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v7

    .line 37
    invoke-interface {v0, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    invoke-virtual {p0, v4}, Landroidx/collection/SimpleArrayMap;->keyAt(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    const/4 v7, 0x0

    .line 46
    invoke-interface {v0, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 50
    .line 51
    add-int/lit8 v5, v5, 0x1

    .line 52
    .line 53
    if-ne v5, v1, :cond_0

    .line 54
    .line 55
    invoke-interface {p2, v0}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    if-nez p1, :cond_2

    .line 59
    .line 60
    invoke-virtual {p0, v0}, Landroidx/collection/ArrayMap;->putAll(Ljava/util/Map;)V

    .line 61
    .line 62
    .line 63
    :cond_2
    invoke-virtual {v0}, Landroidx/collection/SimpleArrayMap;->clear()V

    .line 64
    .line 65
    .line 66
    move v5, v3

    .line 67
    goto :goto_0

    .line 68
    :cond_3
    if-lez v5, :cond_4

    .line 69
    .line 70
    invoke-interface {p2, v0}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    if-nez p1, :cond_4

    .line 74
    .line 75
    invoke-virtual {p0, v0}, Landroidx/collection/ArrayMap;->putAll(Ljava/util/Map;)V

    .line 76
    .line 77
    .line 78
    :cond_4
    return-void
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
.end method

.method public static final recursiveFetchHashMap(Ljava/util/HashMap;ZLv3/l;)V
    .locals 7
    .param p0    # Ljava/util/HashMap;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/HashMap<",
            "TK;TV;>;Z",
            "Lv3/l<",
            "-",
            "Ljava/util/HashMap<",
            "TK;TV;>;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "map"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "fetchBlock"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Ljava/util/HashMap;

    .line 12
    .line 13
    const/16 v1, 0x3e7

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    const/4 v3, 0x0

    .line 27
    :goto_0
    move v4, v3

    .line 28
    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    if-eqz v5, :cond_3

    .line 33
    .line 34
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    const-string v6, "key"

    .line 39
    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    invoke-static {v5, v6}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    invoke-interface {v0, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    invoke-static {v5, v6}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const/4 v6, 0x0

    .line 57
    invoke-interface {v0, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 61
    .line 62
    if-ne v4, v1, :cond_0

    .line 63
    .line 64
    invoke-interface {p2, v0}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    if-nez p1, :cond_2

    .line 68
    .line 69
    invoke-virtual {p0, v0}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 70
    .line 71
    .line 72
    :cond_2
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_3
    if-lez v4, :cond_4

    .line 77
    .line 78
    invoke-interface {p2, v0}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    if-nez p1, :cond_4

    .line 82
    .line 83
    invoke-virtual {p0, v0}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 84
    .line 85
    .line 86
    :cond_4
    return-void
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
.end method

.method public static final recursiveFetchLongSparseArray(Landroidx/collection/LongSparseArray;ZLv3/l;)V
    .locals 9
    .param p0    # Landroidx/collection/LongSparseArray;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/collection/LongSparseArray<",
            "TV;>;Z",
            "Lv3/l<",
            "-",
            "Landroidx/collection/LongSparseArray<",
            "TV;>;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "map"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "fetchBlock"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Landroidx/collection/LongSparseArray;

    .line 12
    .line 13
    const/16 v1, 0x3e7

    .line 14
    .line 15
    invoke-direct {v0, v1}, Landroidx/collection/LongSparseArray;-><init>(I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Landroidx/collection/LongSparseArray;->size()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    const/4 v3, 0x0

    .line 23
    move v4, v3

    .line 24
    move v5, v4

    .line 25
    :cond_0
    :goto_0
    if-ge v4, v2, :cond_3

    .line 26
    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0, v4}, Landroidx/collection/LongSparseArray;->keyAt(I)J

    .line 30
    .line 31
    .line 32
    move-result-wide v6

    .line 33
    invoke-virtual {p0, v4}, Landroidx/collection/LongSparseArray;->valueAt(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v8

    .line 37
    invoke-virtual {v0, v6, v7, v8}, Landroidx/collection/LongSparseArray;->put(JLjava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    invoke-virtual {p0, v4}, Landroidx/collection/LongSparseArray;->keyAt(I)J

    .line 42
    .line 43
    .line 44
    move-result-wide v6

    .line 45
    const/4 v8, 0x0

    .line 46
    invoke-virtual {v0, v6, v7, v8}, Landroidx/collection/LongSparseArray;->put(JLjava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 50
    .line 51
    add-int/lit8 v5, v5, 0x1

    .line 52
    .line 53
    if-ne v5, v1, :cond_0

    .line 54
    .line 55
    invoke-interface {p2, v0}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    if-nez p1, :cond_2

    .line 59
    .line 60
    invoke-virtual {p0, v0}, Landroidx/collection/LongSparseArray;->putAll(Landroidx/collection/LongSparseArray;)V

    .line 61
    .line 62
    .line 63
    :cond_2
    invoke-virtual {v0}, Landroidx/collection/LongSparseArray;->clear()V

    .line 64
    .line 65
    .line 66
    move v5, v3

    .line 67
    goto :goto_0

    .line 68
    :cond_3
    if-lez v5, :cond_4

    .line 69
    .line 70
    invoke-interface {p2, v0}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    if-nez p1, :cond_4

    .line 74
    .line 75
    invoke-virtual {p0, v0}, Landroidx/collection/LongSparseArray;->putAll(Landroidx/collection/LongSparseArray;)V

    .line 76
    .line 77
    .line 78
    :cond_4
    return-void
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
.end method
