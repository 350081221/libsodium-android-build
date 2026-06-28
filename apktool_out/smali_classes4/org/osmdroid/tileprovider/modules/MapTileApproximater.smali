.class public Lorg/osmdroid/tileprovider/modules/MapTileApproximater;
.super Lorg/osmdroid/tileprovider/modules/MapTileModuleProviderBase;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/osmdroid/tileprovider/modules/MapTileApproximater$TileLoader;
    }
.end annotation


# instance fields
.field private final mProviders:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/osmdroid/tileprovider/modules/MapTileModuleProviderBase;",
            ">;"
        }
    .end annotation
.end field

.field private minZoomLevel:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-static {}, Lorg/osmdroid/config/a;->a()Lorg/osmdroid/config/c;

    move-result-object v0

    invoke-interface {v0}, Lorg/osmdroid/config/c;->h0()S

    move-result v0

    .line 2
    invoke-static {}, Lorg/osmdroid/config/a;->a()Lorg/osmdroid/config/c;

    move-result-object v1

    invoke-interface {v1}, Lorg/osmdroid/config/c;->e()S

    move-result v1

    .line 3
    invoke-direct {p0, v0, v1}, Lorg/osmdroid/tileprovider/modules/MapTileApproximater;-><init>(II)V

    return-void
.end method

.method public constructor <init>(II)V
    .locals 0

    .line 4
    invoke-direct {p0, p1, p2}, Lorg/osmdroid/tileprovider/modules/MapTileModuleProviderBase;-><init>(II)V

    .line 5
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object p1, p0, Lorg/osmdroid/tileprovider/modules/MapTileApproximater;->mProviders:Ljava/util/List;

    return-void
.end method

.method public static approximateTileFromLowerZoom(Landroid/graphics/drawable/BitmapDrawable;JI)Landroid/graphics/Bitmap;
    .locals 10

    const/4 v0, 0x0

    if-gtz p3, :cond_0

    return-object v0

    .line 14
    :cond_0
    invoke-virtual {p0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    .line 15
    invoke-static {v1}, Lorg/osmdroid/tileprovider/modules/MapTileApproximater;->getTileBitmap(I)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 16
    new-instance v3, Landroid/graphics/Canvas;

    invoke-direct {v3, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 17
    instance-of v4, p0, Lorg/osmdroid/tileprovider/ReusableBitmapDrawable;

    if-eqz v4, :cond_1

    .line 18
    move-object v5, p0

    check-cast v5, Lorg/osmdroid/tileprovider/ReusableBitmapDrawable;

    goto :goto_0

    :cond_1
    move-object v5, v0

    :goto_0
    if-eqz v4, :cond_2

    .line 19
    invoke-virtual {v5}, Lorg/osmdroid/tileprovider/ReusableBitmapDrawable;->beginUsingDrawable()V

    :cond_2
    const/4 v6, 0x0

    if-eqz v4, :cond_3

    .line 20
    :try_start_0
    invoke-virtual {v5}, Lorg/osmdroid/tileprovider/ReusableBitmapDrawable;->isBitmapValid()Z

    move-result v7

    if-eqz v7, :cond_5

    goto :goto_1

    :catchall_0
    move-exception p0

    goto :goto_3

    :cond_3
    :goto_1
    shr-int v7, v1, p3

    if-nez v7, :cond_4

    goto :goto_2

    .line 21
    :cond_4
    invoke-static {p1, p2}, Lorg/osmdroid/util/MapTileIndex;->getX(J)I

    move-result v8

    const/4 v9, 0x1

    shl-int p3, v9, p3

    rem-int/2addr v8, p3

    mul-int/2addr v8, v7

    .line 22
    invoke-static {p1, p2}, Lorg/osmdroid/util/MapTileIndex;->getY(J)I

    move-result p1

    rem-int/2addr p1, p3

    mul-int/2addr p1, v7

    .line 23
    new-instance p2, Landroid/graphics/Rect;

    add-int p3, v8, v7

    add-int/2addr v7, p1

    invoke-direct {p2, v8, p1, p3, v7}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 24
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1, v6, v6, v1, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 25
    invoke-virtual {p0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object p0

    invoke-virtual {v3, p0, p2, p1, v0}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move v6, v9

    :cond_5
    :goto_2
    if-eqz v4, :cond_6

    .line 26
    invoke-virtual {v5}, Lorg/osmdroid/tileprovider/ReusableBitmapDrawable;->finishUsingDrawable()V

    :cond_6
    if-nez v6, :cond_7

    return-object v0

    :cond_7
    return-object v2

    :goto_3
    if-eqz v4, :cond_8

    invoke-virtual {v5}, Lorg/osmdroid/tileprovider/ReusableBitmapDrawable;->finishUsingDrawable()V

    .line 27
    :cond_8
    throw p0
.end method

.method public static approximateTileFromLowerZoom(Lorg/osmdroid/tileprovider/modules/MapTileModuleProviderBase;JI)Landroid/graphics/Bitmap;
    .locals 4

    const/4 v0, 0x0

    if-gtz p3, :cond_0

    return-object v0

    .line 5
    :cond_0
    invoke-static {p1, p2}, Lorg/osmdroid/util/MapTileIndex;->getZoom(J)I

    move-result v1

    sub-int/2addr v1, p3

    .line 6
    invoke-virtual {p0}, Lorg/osmdroid/tileprovider/modules/MapTileModuleProviderBase;->getMinimumZoomLevel()I

    move-result v2

    if-ge v1, v2, :cond_1

    return-object v0

    .line 7
    :cond_1
    invoke-virtual {p0}, Lorg/osmdroid/tileprovider/modules/MapTileModuleProviderBase;->getMaximumZoomLevel()I

    move-result v2

    if-le v1, v2, :cond_2

    return-object v0

    .line 8
    :cond_2
    invoke-static {p1, p2}, Lorg/osmdroid/util/MapTileIndex;->getX(J)I

    move-result v2

    shr-int/2addr v2, p3

    .line 9
    invoke-static {p1, p2}, Lorg/osmdroid/util/MapTileIndex;->getY(J)I

    move-result v3

    shr-int/2addr v3, p3

    .line 10
    invoke-static {v1, v2, v3}, Lorg/osmdroid/util/MapTileIndex;->getTileIndex(III)J

    move-result-wide v1

    .line 11
    :try_start_0
    invoke-virtual {p0}, Lorg/osmdroid/tileprovider/modules/MapTileModuleProviderBase;->getTileLoader()Lorg/osmdroid/tileprovider/modules/MapTileModuleProviderBase$TileLoader;

    move-result-object p0

    invoke-virtual {p0, v1, v2}, Lorg/osmdroid/tileprovider/modules/MapTileModuleProviderBase$TileLoader;->loadTileIfReachable(J)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    .line 12
    instance-of v1, p0, Landroid/graphics/drawable/BitmapDrawable;

    if-nez v1, :cond_3

    return-object v0

    .line 13
    :cond_3
    check-cast p0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-static {p0, p1, p2, p3}, Lorg/osmdroid/tileprovider/modules/MapTileApproximater;->approximateTileFromLowerZoom(Landroid/graphics/drawable/BitmapDrawable;JI)Landroid/graphics/Bitmap;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    return-object v0
.end method

.method private computeZoomLevels()V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lorg/osmdroid/tileprovider/modules/MapTileApproximater;->minZoomLevel:I

    .line 3
    .line 4
    iget-object v1, p0, Lorg/osmdroid/tileprovider/modules/MapTileApproximater;->mProviders:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const/4 v2, 0x1

    .line 11
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-eqz v3, :cond_1

    .line 16
    .line 17
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    check-cast v3, Lorg/osmdroid/tileprovider/modules/MapTileModuleProviderBase;

    .line 22
    .line 23
    invoke-virtual {v3}, Lorg/osmdroid/tileprovider/modules/MapTileModuleProviderBase;->getMinimumZoomLevel()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    iput v3, p0, Lorg/osmdroid/tileprovider/modules/MapTileApproximater;->minZoomLevel:I

    .line 30
    .line 31
    move v2, v0

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iget v4, p0, Lorg/osmdroid/tileprovider/modules/MapTileApproximater;->minZoomLevel:I

    .line 34
    .line 35
    invoke-static {v4, v3}, Ljava/lang/Math;->min(II)I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    iput v3, p0, Lorg/osmdroid/tileprovider/modules/MapTileApproximater;->minZoomLevel:I

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    return-void
    .line 43
    .line 44
    .line 45
.end method

.method public static getTileBitmap(I)Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    invoke-static {}, Lorg/osmdroid/tileprovider/BitmapPool;->getInstance()Lorg/osmdroid/tileprovider/BitmapPool;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0, p0}, Lorg/osmdroid/tileprovider/BitmapPool;->obtainSizedBitmapFromPool(II)Landroid/graphics/Bitmap;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    invoke-virtual {v0, p0}, Landroid/graphics/Bitmap;->setHasAlpha(Z)V

    .line 13
    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    invoke-virtual {v0, p0}, Landroid/graphics/Bitmap;->eraseColor(I)V

    .line 17
    .line 18
    .line 19
    return-object v0

    .line 20
    :cond_0
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 21
    .line 22
    invoke-static {p0, p0, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
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


# virtual methods
.method public addProvider(Lorg/osmdroid/tileprovider/modules/MapTileModuleProviderBase;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/osmdroid/tileprovider/modules/MapTileApproximater;->mProviders:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lorg/osmdroid/tileprovider/modules/MapTileApproximater;->computeZoomLevels()V

    .line 7
    .line 8
    .line 9
    return-void
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

.method public approximateTileFromLowerZoom(J)Landroid/graphics/Bitmap;
    .locals 2

    const/4 v0, 0x1

    .line 1
    :goto_0
    invoke-static {p1, p2}, Lorg/osmdroid/util/MapTileIndex;->getZoom(J)I

    move-result v1

    sub-int/2addr v1, v0

    if-ltz v1, :cond_1

    .line 2
    invoke-virtual {p0, p1, p2, v0}, Lorg/osmdroid/tileprovider/modules/MapTileApproximater;->approximateTileFromLowerZoom(JI)Landroid/graphics/Bitmap;

    move-result-object v1

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public approximateTileFromLowerZoom(JI)Landroid/graphics/Bitmap;
    .locals 2

    .line 3
    iget-object v0, p0, Lorg/osmdroid/tileprovider/modules/MapTileApproximater;->mProviders:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/osmdroid/tileprovider/modules/MapTileModuleProviderBase;

    .line 4
    invoke-static {v1, p1, p2, p3}, Lorg/osmdroid/tileprovider/modules/MapTileApproximater;->approximateTileFromLowerZoom(Lorg/osmdroid/tileprovider/modules/MapTileModuleProviderBase;JI)Landroid/graphics/Bitmap;

    move-result-object v1

    if-eqz v1, :cond_0

    return-object v1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public detach()V
    .locals 1

    .line 1
    invoke-super {p0}, Lorg/osmdroid/tileprovider/modules/MapTileModuleProviderBase;->detach()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/osmdroid/tileprovider/modules/MapTileApproximater;->mProviders:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 7
    .line 8
    .line 9
    return-void
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

.method public getMaximumZoomLevel()I
    .locals 1

    invoke-static {}, Lorg/osmdroid/util/TileSystem;->getMaximumZoomLevel()I

    move-result v0

    return v0
.end method

.method public getMinimumZoomLevel()I
    .locals 1

    iget v0, p0, Lorg/osmdroid/tileprovider/modules/MapTileApproximater;->minZoomLevel:I

    return v0
.end method

.method protected getName()Ljava/lang/String;
    .locals 1

    const-string v0, "Offline Tile Approximation Provider"

    return-object v0
.end method

.method protected getThreadGroupName()Ljava/lang/String;
    .locals 1

    const-string v0, "approximater"

    return-object v0
.end method

.method public getTileLoader()Lorg/osmdroid/tileprovider/modules/MapTileApproximater$TileLoader;
    .locals 1

    .line 2
    new-instance v0, Lorg/osmdroid/tileprovider/modules/MapTileApproximater$TileLoader;

    invoke-direct {v0, p0}, Lorg/osmdroid/tileprovider/modules/MapTileApproximater$TileLoader;-><init>(Lorg/osmdroid/tileprovider/modules/MapTileApproximater;)V

    return-object v0
.end method

.method public bridge synthetic getTileLoader()Lorg/osmdroid/tileprovider/modules/MapTileModuleProviderBase$TileLoader;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/osmdroid/tileprovider/modules/MapTileApproximater;->getTileLoader()Lorg/osmdroid/tileprovider/modules/MapTileApproximater$TileLoader;

    move-result-object v0

    return-object v0
.end method

.method public getUsesDataConnection()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public setTileSource(Lorg/osmdroid/tileprovider/tilesource/e;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method
