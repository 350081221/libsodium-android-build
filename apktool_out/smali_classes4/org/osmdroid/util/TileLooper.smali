.class public abstract Lorg/osmdroid/util/TileLooper;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private horizontalWrapEnabled:Z

.field protected mTileZoomLevel:I

.field protected final mTiles:Landroid/graphics/Rect;

.field private verticalWrapEnabled:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0, v0}, Lorg/osmdroid/util/TileLooper;-><init>(ZZ)V

    return-void
.end method

.method public constructor <init>(ZZ)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lorg/osmdroid/util/TileLooper;->mTiles:Landroid/graphics/Rect;

    .line 4
    iput-boolean p1, p0, Lorg/osmdroid/util/TileLooper;->horizontalWrapEnabled:Z

    .line 5
    iput-boolean p2, p0, Lorg/osmdroid/util/TileLooper;->verticalWrapEnabled:Z

    return-void
.end method


# virtual methods
.method public finaliseLoop()V
    .locals 0

    return-void
.end method

.method public abstract handleTile(JII)V
.end method

.method public initialiseLoop()V
    .locals 0

    return-void
.end method

.method public isHorizontalWrapEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lorg/osmdroid/util/TileLooper;->horizontalWrapEnabled:Z

    return v0
.end method

.method public isVerticalWrapEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lorg/osmdroid/util/TileLooper;->verticalWrapEnabled:Z

    return v0
.end method

.method protected loop(DLorg/osmdroid/util/RectL;)V
    .locals 3

    .line 1
    invoke-static {p1, p2}, Lorg/osmdroid/util/TileSystem;->getTileSize(D)D

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-object v2, p0, Lorg/osmdroid/util/TileLooper;->mTiles:Landroid/graphics/Rect;

    .line 6
    .line 7
    invoke-static {p3, v0, v1, v2}, Lorg/osmdroid/util/TileSystem;->getTileFromMercator(Lorg/osmdroid/util/RectL;DLandroid/graphics/Rect;)Landroid/graphics/Rect;

    .line 8
    .line 9
    .line 10
    invoke-static {p1, p2}, Lorg/osmdroid/util/TileSystem;->getInputTileZoomLevel(D)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iput p1, p0, Lorg/osmdroid/util/TileLooper;->mTileZoomLevel:I

    .line 15
    .line 16
    invoke-virtual {p0}, Lorg/osmdroid/util/TileLooper;->initialiseLoop()V

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    iget p2, p0, Lorg/osmdroid/util/TileLooper;->mTileZoomLevel:I

    .line 21
    .line 22
    shl-int/2addr p1, p2

    .line 23
    iget-object p2, p0, Lorg/osmdroid/util/TileLooper;->mTiles:Landroid/graphics/Rect;

    .line 24
    .line 25
    iget p2, p2, Landroid/graphics/Rect;->left:I

    .line 26
    .line 27
    :goto_0
    iget-object p3, p0, Lorg/osmdroid/util/TileLooper;->mTiles:Landroid/graphics/Rect;

    .line 28
    .line 29
    iget v0, p3, Landroid/graphics/Rect;->right:I

    .line 30
    .line 31
    if-gt p2, v0, :cond_4

    .line 32
    .line 33
    iget p3, p3, Landroid/graphics/Rect;->top:I

    .line 34
    .line 35
    :goto_1
    iget-object v0, p0, Lorg/osmdroid/util/TileLooper;->mTiles:Landroid/graphics/Rect;

    .line 36
    .line 37
    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    .line 38
    .line 39
    if-gt p3, v0, :cond_3

    .line 40
    .line 41
    iget-boolean v0, p0, Lorg/osmdroid/util/TileLooper;->horizontalWrapEnabled:Z

    .line 42
    .line 43
    if-nez v0, :cond_0

    .line 44
    .line 45
    if-ltz p2, :cond_2

    .line 46
    .line 47
    if-ge p2, p1, :cond_2

    .line 48
    .line 49
    :cond_0
    iget-boolean v0, p0, Lorg/osmdroid/util/TileLooper;->verticalWrapEnabled:Z

    .line 50
    .line 51
    if-nez v0, :cond_1

    .line 52
    .line 53
    if-ltz p3, :cond_2

    .line 54
    .line 55
    if-ge p3, p1, :cond_2

    .line 56
    .line 57
    :cond_1
    invoke-static {p2, p1}, Lorg/osmdroid/util/MyMath;->mod(II)I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    invoke-static {p3, p1}, Lorg/osmdroid/util/MyMath;->mod(II)I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    iget v2, p0, Lorg/osmdroid/util/TileLooper;->mTileZoomLevel:I

    .line 66
    .line 67
    invoke-static {v2, v0, v1}, Lorg/osmdroid/util/MapTileIndex;->getTileIndex(III)J

    .line 68
    .line 69
    .line 70
    move-result-wide v0

    .line 71
    invoke-virtual {p0, v0, v1, p2, p3}, Lorg/osmdroid/util/TileLooper;->handleTile(JII)V

    .line 72
    .line 73
    .line 74
    :cond_2
    add-int/lit8 p3, p3, 0x1

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_3
    add-int/lit8 p2, p2, 0x1

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_4
    invoke-virtual {p0}, Lorg/osmdroid/util/TileLooper;->finaliseLoop()V

    .line 81
    .line 82
    .line 83
    return-void
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method

.method public setHorizontalWrapEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/osmdroid/util/TileLooper;->horizontalWrapEnabled:Z

    return-void
.end method

.method public setVerticalWrapEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/osmdroid/util/TileLooper;->verticalWrapEnabled:Z

    return-void
.end method
