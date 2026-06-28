.class public abstract Lorg/osmdroid/tileprovider/MapTileProviderBase;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/osmdroid/tileprovider/IMapTileProviderCallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/osmdroid/tileprovider/MapTileProviderBase$ZoomInTileLooper;,
        Lorg/osmdroid/tileprovider/MapTileProviderBase$ZoomOutTileLooper;,
        Lorg/osmdroid/tileprovider/MapTileProviderBase$ScaleTileLooper;
    }
.end annotation


# static fields
.field public static final MAPTILE_FAIL_ID:I = 0x1

.field public static final MAPTILE_SUCCESS_ID:I = 0x0

.field private static sApproximationBackgroundColor:I = -0x333334


# instance fields
.field protected final mTileCache:Lorg/osmdroid/tileprovider/MapTileCache;

.field protected mTileNotFoundImage:Landroid/graphics/drawable/Drawable;

.field private final mTileRequestCompleteHandlers:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Landroid/os/Handler;",
            ">;"
        }
    .end annotation
.end field

.field private mTileSource:Lorg/osmdroid/tileprovider/tilesource/e;

.field protected mUseDataConnection:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lorg/osmdroid/tileprovider/tilesource/e;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lorg/osmdroid/tileprovider/MapTileProviderBase;-><init>(Lorg/osmdroid/tileprovider/tilesource/e;Landroid/os/Handler;)V

    return-void
.end method

.method public constructor <init>(Lorg/osmdroid/tileprovider/tilesource/e;Landroid/os/Handler;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lorg/osmdroid/tileprovider/MapTileProviderBase;->mTileRequestCompleteHandlers:Ljava/util/Collection;

    const/4 v1, 0x1

    .line 4
    iput-boolean v1, p0, Lorg/osmdroid/tileprovider/MapTileProviderBase;->mUseDataConnection:Z

    const/4 v1, 0x0

    .line 5
    iput-object v1, p0, Lorg/osmdroid/tileprovider/MapTileProviderBase;->mTileNotFoundImage:Landroid/graphics/drawable/Drawable;

    .line 6
    invoke-virtual {p0}, Lorg/osmdroid/tileprovider/MapTileProviderBase;->createTileCache()Lorg/osmdroid/tileprovider/MapTileCache;

    move-result-object v1

    iput-object v1, p0, Lorg/osmdroid/tileprovider/MapTileProviderBase;->mTileCache:Lorg/osmdroid/tileprovider/MapTileCache;

    .line 7
    invoke-interface {v0, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 8
    iput-object p1, p0, Lorg/osmdroid/tileprovider/MapTileProviderBase;->mTileSource:Lorg/osmdroid/tileprovider/tilesource/e;

    return-void
.end method

.method static synthetic access$300()I
    .locals 1

    sget v0, Lorg/osmdroid/tileprovider/MapTileProviderBase;->sApproximationBackgroundColor:I

    return v0
.end method

.method private sendMessage(I)V
    .locals 2

    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x3

    if-ge v0, v1, :cond_1

    invoke-direct {p0, p1}, Lorg/osmdroid/tileprovider/MapTileProviderBase;->sendMessageFailFast(I)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private sendMessageFailFast(I)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/osmdroid/tileprovider/MapTileProviderBase;->mTileRequestCompleteHandlers:Ljava/util/Collection;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    :try_start_0
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Landroid/os/Handler;
    :try_end_0
    .catch Ljava/util/ConcurrentModificationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {v1, p1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catch_0
    const/4 p1, 0x0

    .line 26
    return p1

    .line 27
    :cond_1
    const/4 p1, 0x1

    .line 28
    return p1
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

.method public static setApproximationBackgroundColor(I)V
    .locals 0

    sput p0, Lorg/osmdroid/tileprovider/MapTileProviderBase;->sApproximationBackgroundColor:I

    return-void
.end method


# virtual methods
.method public clearTileCache()V
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/tileprovider/MapTileProviderBase;->mTileCache:Lorg/osmdroid/tileprovider/MapTileCache;

    invoke-virtual {v0}, Lorg/osmdroid/tileprovider/MapTileCache;->clear()V

    return-void
.end method

.method public createTileCache()Lorg/osmdroid/tileprovider/MapTileCache;
    .locals 1

    new-instance v0, Lorg/osmdroid/tileprovider/MapTileCache;

    invoke-direct {v0}, Lorg/osmdroid/tileprovider/MapTileCache;-><init>()V

    return-object v0
.end method

.method public detach()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lorg/osmdroid/tileprovider/MapTileProviderBase;->clearTileCache()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/osmdroid/tileprovider/MapTileProviderBase;->mTileNotFoundImage:Landroid/graphics/drawable/Drawable;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    instance-of v0, v0, Lorg/osmdroid/tileprovider/ReusableBitmapDrawable;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-static {}, Lorg/osmdroid/tileprovider/BitmapPool;->getInstance()Lorg/osmdroid/tileprovider/BitmapPool;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v1, p0, Lorg/osmdroid/tileprovider/MapTileProviderBase;->mTileNotFoundImage:Landroid/graphics/drawable/Drawable;

    .line 17
    .line 18
    check-cast v1, Lorg/osmdroid/tileprovider/ReusableBitmapDrawable;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lorg/osmdroid/tileprovider/BitmapPool;->returnDrawableToPool(Lorg/osmdroid/tileprovider/ReusableBitmapDrawable;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    iput-object v0, p0, Lorg/osmdroid/tileprovider/MapTileProviderBase;->mTileNotFoundImage:Landroid/graphics/drawable/Drawable;

    .line 25
    .line 26
    invoke-virtual {p0}, Lorg/osmdroid/tileprovider/MapTileProviderBase;->clearTileCache()V

    .line 27
    .line 28
    .line 29
    return-void
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

.method public ensureCapacity(I)V
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/tileprovider/MapTileProviderBase;->mTileCache:Lorg/osmdroid/tileprovider/MapTileCache;

    invoke-virtual {v0, p1}, Lorg/osmdroid/tileprovider/MapTileCache;->ensureCapacity(I)Z

    return-void
.end method

.method public expireInMemoryCache(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/osmdroid/tileprovider/MapTileProviderBase;->mTileCache:Lorg/osmdroid/tileprovider/MapTileCache;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lorg/osmdroid/tileprovider/MapTileCache;->getMapTile(J)Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 p2, -0x2

    .line 10
    invoke-static {p1, p2}, Lorg/osmdroid/tileprovider/ExpirableBitmapDrawable;->setState(Landroid/graphics/drawable/Drawable;I)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
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

.method public abstract getMapTile(J)Landroid/graphics/drawable/Drawable;
.end method

.method public abstract getMaximumZoomLevel()I
.end method

.method public abstract getMinimumZoomLevel()I
.end method

.method public abstract getQueueSize()J
.end method

.method public getTileCache()Lorg/osmdroid/tileprovider/MapTileCache;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/tileprovider/MapTileProviderBase;->mTileCache:Lorg/osmdroid/tileprovider/MapTileCache;

    return-object v0
.end method

.method public getTileRequestCompleteHandlers()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Landroid/os/Handler;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lorg/osmdroid/tileprovider/MapTileProviderBase;->mTileRequestCompleteHandlers:Ljava/util/Collection;

    return-object v0
.end method

.method public getTileSource()Lorg/osmdroid/tileprovider/tilesource/e;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/tileprovider/MapTileProviderBase;->mTileSource:Lorg/osmdroid/tileprovider/tilesource/e;

    return-object v0
.end method

.method public abstract getTileWriter()Lorg/osmdroid/tileprovider/modules/IFilesystemCache;
.end method

.method public mapTileRequestCompleted(Lorg/osmdroid/tileprovider/MapTileRequestState;Landroid/graphics/drawable/Drawable;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lorg/osmdroid/tileprovider/MapTileRequestState;->getMapTile()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const/4 v2, -0x1

    .line 6
    invoke-virtual {p0, v0, v1, p2, v2}, Lorg/osmdroid/tileprovider/MapTileProviderBase;->putTileIntoCache(JLandroid/graphics/drawable/Drawable;I)V

    .line 7
    .line 8
    .line 9
    const/4 p2, 0x0

    .line 10
    invoke-direct {p0, p2}, Lorg/osmdroid/tileprovider/MapTileProviderBase;->sendMessage(I)V

    .line 11
    .line 12
    .line 13
    invoke-static {}, Lorg/osmdroid/config/a;->a()Lorg/osmdroid/config/c;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-interface {p2}, Lorg/osmdroid/config/c;->k()Z

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    if-eqz p2, :cond_0

    .line 22
    .line 23
    new-instance p2, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    const-string v0, "MapTileProviderBase.mapTileRequestCompleted(): "

    .line 29
    .line 30
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Lorg/osmdroid/tileprovider/MapTileRequestState;->getMapTile()J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    invoke-static {v0, v1}, Lorg/osmdroid/util/MapTileIndex;->toString(J)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    const-string p2, "OsmDroid"

    .line 49
    .line 50
    invoke-static {p2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 51
    .line 52
    .line 53
    :cond_0
    return-void
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
.end method

.method public mapTileRequestExpiredTile(Lorg/osmdroid/tileprovider/MapTileRequestState;Landroid/graphics/drawable/Drawable;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lorg/osmdroid/tileprovider/MapTileRequestState;->getMapTile()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {p2}, Lorg/osmdroid/tileprovider/ExpirableBitmapDrawable;->getState(Landroid/graphics/drawable/Drawable;)I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    invoke-virtual {p0, v0, v1, p2, v2}, Lorg/osmdroid/tileprovider/MapTileProviderBase;->putTileIntoCache(JLandroid/graphics/drawable/Drawable;I)V

    .line 10
    .line 11
    .line 12
    const/4 p2, 0x0

    .line 13
    invoke-direct {p0, p2}, Lorg/osmdroid/tileprovider/MapTileProviderBase;->sendMessage(I)V

    .line 14
    .line 15
    .line 16
    invoke-static {}, Lorg/osmdroid/config/a;->a()Lorg/osmdroid/config/c;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-interface {p2}, Lorg/osmdroid/config/c;->k()Z

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    if-eqz p2, :cond_0

    .line 25
    .line 26
    new-instance p2, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    const-string v0, "MapTileProviderBase.mapTileRequestExpiredTile(): "

    .line 32
    .line 33
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Lorg/osmdroid/tileprovider/MapTileRequestState;->getMapTile()J

    .line 37
    .line 38
    .line 39
    move-result-wide v0

    .line 40
    invoke-static {v0, v1}, Lorg/osmdroid/util/MapTileIndex;->toString(J)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    const-string p2, "OsmDroid"

    .line 52
    .line 53
    invoke-static {p2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    :cond_0
    return-void
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
.end method

.method public mapTileRequestFailed(Lorg/osmdroid/tileprovider/MapTileRequestState;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lorg/osmdroid/tileprovider/MapTileProviderBase;->mTileNotFoundImage:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Lorg/osmdroid/tileprovider/MapTileRequestState;->getMapTile()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    iget-object v2, p0, Lorg/osmdroid/tileprovider/MapTileProviderBase;->mTileNotFoundImage:Landroid/graphics/drawable/Drawable;

    .line 10
    .line 11
    const/4 v3, -0x4

    .line 12
    invoke-virtual {p0, v0, v1, v2, v3}, Lorg/osmdroid/tileprovider/MapTileProviderBase;->putTileIntoCache(JLandroid/graphics/drawable/Drawable;I)V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-direct {p0, v0}, Lorg/osmdroid/tileprovider/MapTileProviderBase;->sendMessage(I)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x1

    .line 21
    invoke-direct {p0, v0}, Lorg/osmdroid/tileprovider/MapTileProviderBase;->sendMessage(I)V

    .line 22
    .line 23
    .line 24
    :goto_0
    invoke-static {}, Lorg/osmdroid/config/a;->a()Lorg/osmdroid/config/c;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-interface {v0}, Lorg/osmdroid/config/c;->k()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    new-instance v0, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    .line 39
    const-string v1, "MapTileProviderBase.mapTileRequestFailed(): "

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Lorg/osmdroid/tileprovider/MapTileRequestState;->getMapTile()J

    .line 45
    .line 46
    .line 47
    move-result-wide v1

    .line 48
    invoke-static {v1, v2}, Lorg/osmdroid/util/MapTileIndex;->toString(J)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    const-string v0, "OsmDroid"

    .line 60
    .line 61
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 62
    .line 63
    .line 64
    :cond_1
    return-void
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
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
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
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
.end method

.method public mapTileRequestFailedExceedsMaxQueueSize(Lorg/osmdroid/tileprovider/MapTileRequestState;)V
    .locals 0

    invoke-virtual {p0, p1}, Lorg/osmdroid/tileprovider/MapTileProviderBase;->mapTileRequestFailed(Lorg/osmdroid/tileprovider/MapTileRequestState;)V

    return-void
.end method

.method protected putExpiredTileIntoCache(Lorg/osmdroid/tileprovider/MapTileRequestState;Landroid/graphics/drawable/Drawable;)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p1}, Lorg/osmdroid/tileprovider/MapTileRequestState;->getMapTile()J

    move-result-wide v0

    const/4 p1, -0x2

    invoke-virtual {p0, v0, v1, p2, p1}, Lorg/osmdroid/tileprovider/MapTileProviderBase;->putTileIntoCache(JLandroid/graphics/drawable/Drawable;I)V

    return-void
.end method

.method protected putTileIntoCache(JLandroid/graphics/drawable/Drawable;I)V
    .locals 1

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lorg/osmdroid/tileprovider/MapTileProviderBase;->mTileCache:Lorg/osmdroid/tileprovider/MapTileCache;

    .line 5
    .line 6
    invoke-virtual {v0, p1, p2}, Lorg/osmdroid/tileprovider/MapTileCache;->getMapTile(J)Landroid/graphics/drawable/Drawable;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-static {v0}, Lorg/osmdroid/tileprovider/ExpirableBitmapDrawable;->getState(Landroid/graphics/drawable/Drawable;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-le v0, p4, :cond_1

    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    invoke-static {p3, p4}, Lorg/osmdroid/tileprovider/ExpirableBitmapDrawable;->setState(Landroid/graphics/drawable/Drawable;I)V

    .line 20
    .line 21
    .line 22
    iget-object p4, p0, Lorg/osmdroid/tileprovider/MapTileProviderBase;->mTileCache:Lorg/osmdroid/tileprovider/MapTileCache;

    .line 23
    .line 24
    invoke-virtual {p4, p1, p2, p3}, Lorg/osmdroid/tileprovider/MapTileCache;->putTile(JLandroid/graphics/drawable/Drawable;)V

    .line 25
    .line 26
    .line 27
    return-void
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
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
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
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
.end method

.method public rescaleCache(Lorg/osmdroid/views/Projection;DDLandroid/graphics/Rect;)V
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-wide/from16 v2, p2

    .line 6
    .line 7
    move-wide/from16 v5, p4

    .line 8
    .line 9
    move-object/from16 v4, p6

    .line 10
    .line 11
    invoke-static/range {p2 .. p3}, Lorg/osmdroid/util/TileSystem;->getInputTileZoomLevel(D)I

    .line 12
    .line 13
    .line 14
    move-result v7

    .line 15
    invoke-static/range {p4 .. p5}, Lorg/osmdroid/util/TileSystem;->getInputTileZoomLevel(D)I

    .line 16
    .line 17
    .line 18
    move-result v8

    .line 19
    if-ne v7, v8, :cond_0

    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 23
    .line 24
    .line 25
    move-result-wide v8

    .line 26
    invoke-static {}, Lorg/osmdroid/config/a;->a()Lorg/osmdroid/config/c;

    .line 27
    .line 28
    .line 29
    move-result-object v7

    .line 30
    invoke-interface {v7}, Lorg/osmdroid/config/c;->k()Z

    .line 31
    .line 32
    .line 33
    move-result v7

    .line 34
    const-string v10, "OsmDroid"

    .line 35
    .line 36
    if-eqz v7, :cond_1

    .line 37
    .line 38
    new-instance v7, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 41
    .line 42
    .line 43
    const-string v11, "rescale tile cache from "

    .line 44
    .line 45
    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v7, v5, v6}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v11, " to "

    .line 52
    .line 53
    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v7, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v7

    .line 63
    invoke-static {v10, v7}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 64
    .line 65
    .line 66
    :cond_1
    iget v7, v4, Landroid/graphics/Rect;->left:I

    .line 67
    .line 68
    iget v11, v4, Landroid/graphics/Rect;->top:I

    .line 69
    .line 70
    const/4 v12, 0x0

    .line 71
    invoke-virtual {v1, v7, v11, v12}, Lorg/osmdroid/views/Projection;->toMercatorPixels(IILorg/osmdroid/util/PointL;)Lorg/osmdroid/util/PointL;

    .line 72
    .line 73
    .line 74
    move-result-object v7

    .line 75
    iget v11, v4, Landroid/graphics/Rect;->right:I

    .line 76
    .line 77
    iget v4, v4, Landroid/graphics/Rect;->bottom:I

    .line 78
    .line 79
    invoke-virtual {v1, v11, v4, v12}, Lorg/osmdroid/views/Projection;->toMercatorPixels(IILorg/osmdroid/util/PointL;)Lorg/osmdroid/util/PointL;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    new-instance v4, Lorg/osmdroid/util/RectL;

    .line 84
    .line 85
    iget-wide v14, v7, Lorg/osmdroid/util/PointL;->x:J

    .line 86
    .line 87
    iget-wide v12, v7, Lorg/osmdroid/util/PointL;->y:J

    .line 88
    .line 89
    move-wide/from16 v16, v12

    .line 90
    .line 91
    iget-wide v11, v1, Lorg/osmdroid/util/PointL;->x:J

    .line 92
    .line 93
    move-wide/from16 v22, v8

    .line 94
    .line 95
    iget-wide v7, v1, Lorg/osmdroid/util/PointL;->y:J

    .line 96
    .line 97
    move-object v13, v4

    .line 98
    move-wide/from16 v18, v11

    .line 99
    .line 100
    move-wide/from16 v20, v7

    .line 101
    .line 102
    invoke-direct/range {v13 .. v21}, Lorg/osmdroid/util/RectL;-><init>(JJJJ)V

    .line 103
    .line 104
    .line 105
    cmpl-double v1, v2, v5

    .line 106
    .line 107
    if-lez v1, :cond_2

    .line 108
    .line 109
    new-instance v1, Lorg/osmdroid/tileprovider/MapTileProviderBase$ZoomInTileLooper;

    .line 110
    .line 111
    const/4 v7, 0x0

    .line 112
    invoke-direct {v1, v0, v7}, Lorg/osmdroid/tileprovider/MapTileProviderBase$ZoomInTileLooper;-><init>(Lorg/osmdroid/tileprovider/MapTileProviderBase;Lorg/osmdroid/tileprovider/MapTileProviderBase$1;)V

    .line 113
    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_2
    const/4 v7, 0x0

    .line 117
    new-instance v1, Lorg/osmdroid/tileprovider/MapTileProviderBase$ZoomOutTileLooper;

    .line 118
    .line 119
    invoke-direct {v1, v0, v7}, Lorg/osmdroid/tileprovider/MapTileProviderBase$ZoomOutTileLooper;-><init>(Lorg/osmdroid/tileprovider/MapTileProviderBase;Lorg/osmdroid/tileprovider/MapTileProviderBase$1;)V

    .line 120
    .line 121
    .line 122
    :goto_0
    invoke-virtual/range {p0 .. p0}, Lorg/osmdroid/tileprovider/MapTileProviderBase;->getTileSource()Lorg/osmdroid/tileprovider/tilesource/e;

    .line 123
    .line 124
    .line 125
    move-result-object v7

    .line 126
    invoke-interface {v7}, Lorg/osmdroid/tileprovider/tilesource/e;->getTileSizePixels()I

    .line 127
    .line 128
    .line 129
    move-result v7

    .line 130
    move-wide/from16 v2, p2

    .line 131
    .line 132
    move-wide/from16 v5, p4

    .line 133
    .line 134
    invoke-virtual/range {v1 .. v7}, Lorg/osmdroid/tileprovider/MapTileProviderBase$ScaleTileLooper;->loop(DLorg/osmdroid/util/RectL;DI)V

    .line 135
    .line 136
    .line 137
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 138
    .line 139
    .line 140
    move-result-wide v1

    .line 141
    invoke-static {}, Lorg/osmdroid/config/a;->a()Lorg/osmdroid/config/c;

    .line 142
    .line 143
    .line 144
    move-result-object v3

    .line 145
    invoke-interface {v3}, Lorg/osmdroid/config/c;->k()Z

    .line 146
    .line 147
    .line 148
    move-result v3

    .line 149
    if-eqz v3, :cond_3

    .line 150
    .line 151
    new-instance v3, Ljava/lang/StringBuilder;

    .line 152
    .line 153
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 154
    .line 155
    .line 156
    const-string v4, "Finished rescale in "

    .line 157
    .line 158
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    sub-long v1, v1, v22

    .line 162
    .line 163
    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    const-string v1, "ms"

    .line 167
    .line 168
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    invoke-static {v10, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 176
    .line 177
    .line 178
    :cond_3
    return-void
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
.end method

.method public setTileLoadFailureImage(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    iput-object p1, p0, Lorg/osmdroid/tileprovider/MapTileProviderBase;->mTileNotFoundImage:Landroid/graphics/drawable/Drawable;

    return-void
.end method

.method public setTileRequestCompleteHandler(Landroid/os/Handler;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/osmdroid/tileprovider/MapTileProviderBase;->mTileRequestCompleteHandlers:Ljava/util/Collection;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Collection;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lorg/osmdroid/tileprovider/MapTileProviderBase;->mTileRequestCompleteHandlers:Ljava/util/Collection;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 9
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

.method public setTileSource(Lorg/osmdroid/tileprovider/tilesource/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/osmdroid/tileprovider/MapTileProviderBase;->mTileSource:Lorg/osmdroid/tileprovider/tilesource/e;

    .line 2
    .line 3
    invoke-virtual {p0}, Lorg/osmdroid/tileprovider/MapTileProviderBase;->clearTileCache()V

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

.method public setUseDataConnection(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/osmdroid/tileprovider/MapTileProviderBase;->mUseDataConnection:Z

    return-void
.end method

.method public useDataConnection()Z
    .locals 1

    iget-boolean v0, p0, Lorg/osmdroid/tileprovider/MapTileProviderBase;->mUseDataConnection:Z

    return v0
.end method
