.class public Lorg/osmdroid/util/MapTileList;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/osmdroid/util/MapTileContainer;


# instance fields
.field private mSize:I

.field private mTileIndices:[J


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public clear()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lorg/osmdroid/util/MapTileList;->mSize:I

    return-void
.end method

.method public contains(J)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lorg/osmdroid/util/MapTileList;->mTileIndices:[J

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    move v0, v1

    .line 8
    :goto_0
    iget v2, p0, Lorg/osmdroid/util/MapTileList;->mSize:I

    .line 9
    .line 10
    if-ge v0, v2, :cond_2

    .line 11
    .line 12
    iget-object v2, p0, Lorg/osmdroid/util/MapTileList;->mTileIndices:[J

    .line 13
    .line 14
    aget-wide v3, v2, v0

    .line 15
    .line 16
    cmp-long v2, v3, p1

    .line 17
    .line 18
    if-nez v2, :cond_1

    .line 19
    .line 20
    const/4 p1, 0x1

    .line 21
    return p1

    .line 22
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_2
    return v1
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
.end method

.method public ensureCapacity(I)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lorg/osmdroid/util/MapTileList;->mTileIndices:[J

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    array-length v0, v0

    .line 9
    if-lt v0, p1, :cond_1

    .line 10
    .line 11
    return-void

    .line 12
    :cond_1
    monitor-enter p0

    .line 13
    :try_start_0
    new-array p1, p1, [J

    .line 14
    .line 15
    iget-object v0, p0, Lorg/osmdroid/util/MapTileList;->mTileIndices:[J

    .line 16
    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    array-length v1, v0

    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-static {v0, v2, p1, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 22
    .line 23
    .line 24
    :cond_2
    iput-object p1, p0, Lorg/osmdroid/util/MapTileList;->mTileIndices:[J

    .line 25
    .line 26
    monitor-exit p0

    .line 27
    return-void

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    throw p1
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
.end method

.method public get(I)J
    .locals 3

    iget-object v0, p0, Lorg/osmdroid/util/MapTileList;->mTileIndices:[J

    aget-wide v1, v0, p1

    return-wide v1
.end method

.method public getSize()I
    .locals 1

    iget v0, p0, Lorg/osmdroid/util/MapTileList;->mSize:I

    return v0
.end method

.method public put(I)V
    .locals 8

    const/4 v0, 0x1

    shl-int v1, v0, p1

    const/4 v4, 0x0

    const/4 v5, 0x0

    add-int/lit8 v7, v1, -0x1

    move-object v2, p0

    move v3, p1

    move v6, v7

    .line 7
    invoke-virtual/range {v2 .. v7}, Lorg/osmdroid/util/MapTileList;->put(IIIII)V

    return-void
.end method

.method public put(IIIII)V
    .locals 6

    const/4 v0, 0x1

    shl-int v1, v0, p1

    sub-int v2, p4, p2

    add-int/2addr v2, v0

    const/4 v3, 0x0

    if-ge p4, p2, :cond_0

    move p4, v1

    goto :goto_0

    :cond_0
    move p4, v3

    :goto_0
    add-int/2addr v2, p4

    sub-int p4, p5, p3

    add-int/2addr p4, v0

    if-ge p5, p3, :cond_1

    move p5, v1

    goto :goto_1

    :cond_1
    move p5, v3

    :goto_1
    add-int/2addr p4, p5

    .line 3
    invoke-virtual {p0}, Lorg/osmdroid/util/MapTileList;->getSize()I

    move-result p5

    mul-int v0, v2, p4

    add-int/2addr p5, v0

    invoke-virtual {p0, p5}, Lorg/osmdroid/util/MapTileList;->ensureCapacity(I)V

    move p5, v3

    :goto_2
    if-ge p5, v2, :cond_3

    move v0, v3

    :goto_3
    if-ge v0, p4, :cond_2

    add-int v4, p2, p5

    .line 4
    rem-int/2addr v4, v1

    add-int v5, p3, v0

    .line 5
    rem-int/2addr v5, v1

    .line 6
    invoke-static {p1, v4, v5}, Lorg/osmdroid/util/MapTileIndex;->getTileIndex(III)J

    move-result-wide v4

    invoke-virtual {p0, v4, v5}, Lorg/osmdroid/util/MapTileList;->put(J)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_2
    add-int/lit8 p5, p5, 0x1

    goto :goto_2

    :cond_3
    return-void
.end method

.method public put(J)V
    .locals 3

    .line 1
    iget v0, p0, Lorg/osmdroid/util/MapTileList;->mSize:I

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Lorg/osmdroid/util/MapTileList;->ensureCapacity(I)V

    .line 2
    iget-object v0, p0, Lorg/osmdroid/util/MapTileList;->mTileIndices:[J

    iget v1, p0, Lorg/osmdroid/util/MapTileList;->mSize:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lorg/osmdroid/util/MapTileList;->mSize:I

    aput-wide p1, v0, v1

    return-void
.end method

.method public toArray()[J
    .locals 4

    .line 1
    iget v0, p0, Lorg/osmdroid/util/MapTileList;->mSize:I

    .line 2
    .line 3
    new-array v1, v0, [J

    .line 4
    .line 5
    iget-object v2, p0, Lorg/osmdroid/util/MapTileList;->mTileIndices:[J

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-static {v2, v3, v1, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-object v1
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
.end method
