.class public Lorg/osmdroid/tileprovider/modules/MapTileAssetsProvider;
.super Lorg/osmdroid/tileprovider/modules/MapTileFileStorageProviderBase;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/osmdroid/tileprovider/modules/MapTileAssetsProvider$TileLoader;
    }
.end annotation


# instance fields
.field private final mAssets:Landroid/content/res/AssetManager;

.field private final mTileSource:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lorg/osmdroid/tileprovider/tilesource/e;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lorg/osmdroid/tileprovider/IRegisterReceiver;Landroid/content/res/AssetManager;)V
    .locals 1

    .line 1
    sget-object v0, Lorg/osmdroid/tileprovider/tilesource/TileSourceFactory;->DEFAULT_TILE_SOURCE:Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;

    invoke-direct {p0, p1, p2, v0}, Lorg/osmdroid/tileprovider/modules/MapTileAssetsProvider;-><init>(Lorg/osmdroid/tileprovider/IRegisterReceiver;Landroid/content/res/AssetManager;Lorg/osmdroid/tileprovider/tilesource/e;)V

    return-void
.end method

.method public constructor <init>(Lorg/osmdroid/tileprovider/IRegisterReceiver;Landroid/content/res/AssetManager;Lorg/osmdroid/tileprovider/tilesource/e;)V
    .locals 7

    .line 2
    invoke-static {}, Lorg/osmdroid/config/a;->a()Lorg/osmdroid/config/c;

    move-result-object v0

    invoke-interface {v0}, Lorg/osmdroid/config/c;->J()S

    move-result v5

    .line 3
    invoke-static {}, Lorg/osmdroid/config/a;->a()Lorg/osmdroid/config/c;

    move-result-object v0

    invoke-interface {v0}, Lorg/osmdroid/config/c;->c()S

    move-result v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    .line 4
    invoke-direct/range {v1 .. v6}, Lorg/osmdroid/tileprovider/modules/MapTileAssetsProvider;-><init>(Lorg/osmdroid/tileprovider/IRegisterReceiver;Landroid/content/res/AssetManager;Lorg/osmdroid/tileprovider/tilesource/e;II)V

    return-void
.end method

.method public constructor <init>(Lorg/osmdroid/tileprovider/IRegisterReceiver;Landroid/content/res/AssetManager;Lorg/osmdroid/tileprovider/tilesource/e;II)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p4, p5}, Lorg/osmdroid/tileprovider/modules/MapTileFileStorageProviderBase;-><init>(Lorg/osmdroid/tileprovider/IRegisterReceiver;II)V

    .line 6
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Lorg/osmdroid/tileprovider/modules/MapTileAssetsProvider;->mTileSource:Ljava/util/concurrent/atomic/AtomicReference;

    .line 7
    invoke-virtual {p0, p3}, Lorg/osmdroid/tileprovider/modules/MapTileAssetsProvider;->setTileSource(Lorg/osmdroid/tileprovider/tilesource/e;)V

    .line 8
    iput-object p2, p0, Lorg/osmdroid/tileprovider/modules/MapTileAssetsProvider;->mAssets:Landroid/content/res/AssetManager;

    return-void
.end method

.method static synthetic access$000(Lorg/osmdroid/tileprovider/modules/MapTileAssetsProvider;)Ljava/util/concurrent/atomic/AtomicReference;
    .locals 0

    iget-object p0, p0, Lorg/osmdroid/tileprovider/modules/MapTileAssetsProvider;->mTileSource:Ljava/util/concurrent/atomic/AtomicReference;

    return-object p0
.end method


# virtual methods
.method public getMaximumZoomLevel()I
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/osmdroid/tileprovider/modules/MapTileAssetsProvider;->mTileSource:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lorg/osmdroid/tileprovider/tilesource/e;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {v0}, Lorg/osmdroid/tileprovider/tilesource/e;->getMaximumZoomLevel()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-static {}, Lorg/osmdroid/util/TileSystem;->getMaximumZoomLevel()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    :goto_0
    return v0
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

.method public getMinimumZoomLevel()I
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/osmdroid/tileprovider/modules/MapTileAssetsProvider;->mTileSource:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lorg/osmdroid/tileprovider/tilesource/e;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {v0}, Lorg/osmdroid/tileprovider/tilesource/e;->getMinimumZoomLevel()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    :goto_0
    return v0
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

.method protected getName()Ljava/lang/String;
    .locals 1

    const-string v0, "Assets Cache Provider"

    return-object v0
.end method

.method protected getThreadGroupName()Ljava/lang/String;
    .locals 1

    const-string v0, "assets"

    return-object v0
.end method

.method public getTileLoader()Lorg/osmdroid/tileprovider/modules/MapTileAssetsProvider$TileLoader;
    .locals 2

    .line 2
    new-instance v0, Lorg/osmdroid/tileprovider/modules/MapTileAssetsProvider$TileLoader;

    iget-object v1, p0, Lorg/osmdroid/tileprovider/modules/MapTileAssetsProvider;->mAssets:Landroid/content/res/AssetManager;

    invoke-direct {v0, p0, v1}, Lorg/osmdroid/tileprovider/modules/MapTileAssetsProvider$TileLoader;-><init>(Lorg/osmdroid/tileprovider/modules/MapTileAssetsProvider;Landroid/content/res/AssetManager;)V

    return-object v0
.end method

.method public bridge synthetic getTileLoader()Lorg/osmdroid/tileprovider/modules/MapTileModuleProviderBase$TileLoader;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/osmdroid/tileprovider/modules/MapTileAssetsProvider;->getTileLoader()Lorg/osmdroid/tileprovider/modules/MapTileAssetsProvider$TileLoader;

    move-result-object v0

    return-object v0
.end method

.method public getUsesDataConnection()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public setTileSource(Lorg/osmdroid/tileprovider/tilesource/e;)V
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/tileprovider/modules/MapTileAssetsProvider;->mTileSource:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method
