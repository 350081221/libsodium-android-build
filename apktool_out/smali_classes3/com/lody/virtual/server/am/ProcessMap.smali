.class Lcom/lody/virtual/server/am/ProcessMap;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final mMap:Lcom/lody/virtual/helper/collection/ArrayMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/lody/virtual/helper/collection/ArrayMap<",
            "Ljava/lang/String;",
            "Lcom/lody/virtual/helper/collection/SparseArray<",
            "TE;>;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/lody/virtual/helper/collection/ArrayMap;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/lody/virtual/helper/collection/ArrayMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/lody/virtual/server/am/ProcessMap;->mMap:Lcom/lody/virtual/helper/collection/ArrayMap;

    .line 10
    .line 11
    return-void
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
.end method


# virtual methods
.method public get(Ljava/lang/String;I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)TE;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/am/ProcessMap;->mMap:Lcom/lody/virtual/helper/collection/ArrayMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/lody/virtual/helper/collection/SimpleArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/lody/virtual/helper/collection/SparseArray;

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    return-object p1

    .line 13
    :cond_0
    invoke-virtual {p1, p2}, Lcom/lody/virtual/helper/collection/SparseArray;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
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
.end method

.method public getMap()Lcom/lody/virtual/helper/collection/ArrayMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/lody/virtual/helper/collection/ArrayMap<",
            "Ljava/lang/String;",
            "Lcom/lody/virtual/helper/collection/SparseArray<",
            "TE;>;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/lody/virtual/server/am/ProcessMap;->mMap:Lcom/lody/virtual/helper/collection/ArrayMap;

    return-object v0
.end method

.method public put(Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "ITE;)TE;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/am/ProcessMap;->mMap:Lcom/lody/virtual/helper/collection/ArrayMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/lody/virtual/helper/collection/SimpleArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/lody/virtual/helper/collection/SparseArray;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Lcom/lody/virtual/helper/collection/SparseArray;

    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    invoke-direct {v0, v1}, Lcom/lody/virtual/helper/collection/SparseArray;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Lcom/lody/virtual/server/am/ProcessMap;->mMap:Lcom/lody/virtual/helper/collection/ArrayMap;

    .line 18
    .line 19
    invoke-virtual {v1, p1, v0}, Lcom/lody/virtual/helper/collection/SimpleArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {v0, p2, p3}, Lcom/lody/virtual/helper/collection/SparseArray;->put(ILjava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-object p3
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
.end method

.method public remove(Ljava/lang/String;I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)TE;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/am/ProcessMap;->mMap:Lcom/lody/virtual/helper/collection/ArrayMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/lody/virtual/helper/collection/SimpleArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/lody/virtual/helper/collection/SparseArray;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {v0, p2}, Lcom/lody/virtual/helper/collection/SparseArray;->removeReturnOld(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-virtual {v0}, Lcom/lody/virtual/helper/collection/SparseArray;->size()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, Lcom/lody/virtual/server/am/ProcessMap;->mMap:Lcom/lody/virtual/helper/collection/ArrayMap;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Lcom/lody/virtual/helper/collection/SimpleArrayMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    :cond_0
    return-object p2

    .line 27
    :cond_1
    const/4 p1, 0x0

    .line 28
    return-object p1
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
.end method
