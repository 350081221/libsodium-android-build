.class final Lcom/lody/virtual/helper/collection/MapCollections$ArrayIterator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/helper/collection/MapCollections;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "ArrayIterator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "TT;>;"
    }
.end annotation


# instance fields
.field mCanRemove:Z

.field mIndex:I

.field final mOffset:I

.field mSize:I

.field final synthetic this$0:Lcom/lody/virtual/helper/collection/MapCollections;


# direct methods
.method constructor <init>(Lcom/lody/virtual/helper/collection/MapCollections;I)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/lody/virtual/helper/collection/MapCollections$ArrayIterator;->this$0:Lcom/lody/virtual/helper/collection/MapCollections;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Lcom/lody/virtual/helper/collection/MapCollections$ArrayIterator;->mCanRemove:Z

    .line 8
    .line 9
    iput p2, p0, Lcom/lody/virtual/helper/collection/MapCollections$ArrayIterator;->mOffset:I

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/lody/virtual/helper/collection/MapCollections;->colGetSize()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    iput p1, p0, Lcom/lody/virtual/helper/collection/MapCollections$ArrayIterator;->mSize:I

    .line 16
    .line 17
    return-void
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


# virtual methods
.method public hasNext()Z
    .locals 2

    iget v0, p0, Lcom/lody/virtual/helper/collection/MapCollections$ArrayIterator;->mIndex:I

    iget v1, p0, Lcom/lody/virtual/helper/collection/MapCollections$ArrayIterator;->mSize:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/helper/collection/MapCollections$ArrayIterator;->this$0:Lcom/lody/virtual/helper/collection/MapCollections;

    .line 2
    .line 3
    iget v1, p0, Lcom/lody/virtual/helper/collection/MapCollections$ArrayIterator;->mIndex:I

    .line 4
    .line 5
    iget v2, p0, Lcom/lody/virtual/helper/collection/MapCollections$ArrayIterator;->mOffset:I

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Lcom/lody/virtual/helper/collection/MapCollections;->colGetEntry(II)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget v1, p0, Lcom/lody/virtual/helper/collection/MapCollections$ArrayIterator;->mIndex:I

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    add-int/2addr v1, v2

    .line 15
    iput v1, p0, Lcom/lody/virtual/helper/collection/MapCollections$ArrayIterator;->mIndex:I

    .line 16
    .line 17
    iput-boolean v2, p0, Lcom/lody/virtual/helper/collection/MapCollections$ArrayIterator;->mCanRemove:Z

    .line 18
    .line 19
    return-object v0
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public remove()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/lody/virtual/helper/collection/MapCollections$ArrayIterator;->mCanRemove:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lcom/lody/virtual/helper/collection/MapCollections$ArrayIterator;->mIndex:I

    .line 6
    .line 7
    add-int/lit8 v0, v0, -0x1

    .line 8
    .line 9
    iput v0, p0, Lcom/lody/virtual/helper/collection/MapCollections$ArrayIterator;->mIndex:I

    .line 10
    .line 11
    iget v1, p0, Lcom/lody/virtual/helper/collection/MapCollections$ArrayIterator;->mSize:I

    .line 12
    .line 13
    add-int/lit8 v1, v1, -0x1

    .line 14
    .line 15
    iput v1, p0, Lcom/lody/virtual/helper/collection/MapCollections$ArrayIterator;->mSize:I

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    iput-boolean v1, p0, Lcom/lody/virtual/helper/collection/MapCollections$ArrayIterator;->mCanRemove:Z

    .line 19
    .line 20
    iget-object v1, p0, Lcom/lody/virtual/helper/collection/MapCollections$ArrayIterator;->this$0:Lcom/lody/virtual/helper/collection/MapCollections;

    .line 21
    .line 22
    invoke-virtual {v1, v0}, Lcom/lody/virtual/helper/collection/MapCollections;->colRemoveAt(I)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 27
    .line 28
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 29
    .line 30
    .line 31
    throw v0
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
.end method
