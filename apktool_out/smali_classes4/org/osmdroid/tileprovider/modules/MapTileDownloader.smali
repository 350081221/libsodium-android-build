.class public Lorg/osmdroid/tileprovider/modules/MapTileDownloader;
.super Lorg/osmdroid/tileprovider/modules/MapTileModuleProviderBase;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/osmdroid/tileprovider/modules/MapTileDownloader$TileLoader;
    }
.end annotation


# instance fields
.field private final mFilesystemCache:Lorg/osmdroid/tileprovider/modules/IFilesystemCache;

.field private final mNetworkAvailablityCheck:Lorg/osmdroid/tileprovider/modules/INetworkAvailablityCheck;

.field private mTileDownloader:Lorg/osmdroid/tileprovider/modules/TileDownloader;

.field private final mTileLoader:Lorg/osmdroid/tileprovider/modules/MapTileDownloader$TileLoader;

.field private final mTileSource:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;",
            ">;"
        }
    .end annotation
.end field

.field private final mUrlBackoff:Lorg/osmdroid/util/UrlBackoff;


# direct methods
.method public constructor <init>(Lorg/osmdroid/tileprovider/tilesource/e;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0, v0}, Lorg/osmdroid/tileprovider/modules/MapTileDownloader;-><init>(Lorg/osmdroid/tileprovider/tilesource/e;Lorg/osmdroid/tileprovider/modules/IFilesystemCache;Lorg/osmdroid/tileprovider/modules/INetworkAvailablityCheck;)V

    return-void
.end method

.method public constructor <init>(Lorg/osmdroid/tileprovider/tilesource/e;Lorg/osmdroid/tileprovider/modules/IFilesystemCache;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lorg/osmdroid/tileprovider/modules/MapTileDownloader;-><init>(Lorg/osmdroid/tileprovider/tilesource/e;Lorg/osmdroid/tileprovider/modules/IFilesystemCache;Lorg/osmdroid/tileprovider/modules/INetworkAvailablityCheck;)V

    return-void
.end method

.method public constructor <init>(Lorg/osmdroid/tileprovider/tilesource/e;Lorg/osmdroid/tileprovider/modules/IFilesystemCache;Lorg/osmdroid/tileprovider/modules/INetworkAvailablityCheck;)V
    .locals 7

    .line 3
    invoke-static {}, Lorg/osmdroid/config/a;->a()Lorg/osmdroid/config/c;

    move-result-object v0

    invoke-interface {v0}, Lorg/osmdroid/config/c;->J()S

    move-result v5

    .line 4
    invoke-static {}, Lorg/osmdroid/config/a;->a()Lorg/osmdroid/config/c;

    move-result-object v0

    invoke-interface {v0}, Lorg/osmdroid/config/c;->c()S

    move-result v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    .line 5
    invoke-direct/range {v1 .. v6}, Lorg/osmdroid/tileprovider/modules/MapTileDownloader;-><init>(Lorg/osmdroid/tileprovider/tilesource/e;Lorg/osmdroid/tileprovider/modules/IFilesystemCache;Lorg/osmdroid/tileprovider/modules/INetworkAvailablityCheck;II)V

    return-void
.end method

.method public constructor <init>(Lorg/osmdroid/tileprovider/tilesource/e;Lorg/osmdroid/tileprovider/modules/IFilesystemCache;Lorg/osmdroid/tileprovider/modules/INetworkAvailablityCheck;II)V
    .locals 0

    .line 6
    invoke-direct {p0, p4, p5}, Lorg/osmdroid/tileprovider/modules/MapTileModuleProviderBase;-><init>(II)V

    .line 7
    new-instance p4, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p4}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p4, p0, Lorg/osmdroid/tileprovider/modules/MapTileDownloader;->mTileSource:Ljava/util/concurrent/atomic/AtomicReference;

    .line 8
    new-instance p4, Lorg/osmdroid/tileprovider/modules/MapTileDownloader$TileLoader;

    invoke-direct {p4, p0}, Lorg/osmdroid/tileprovider/modules/MapTileDownloader$TileLoader;-><init>(Lorg/osmdroid/tileprovider/modules/MapTileDownloader;)V

    iput-object p4, p0, Lorg/osmdroid/tileprovider/modules/MapTileDownloader;->mTileLoader:Lorg/osmdroid/tileprovider/modules/MapTileDownloader$TileLoader;

    .line 9
    new-instance p4, Lorg/osmdroid/util/UrlBackoff;

    invoke-direct {p4}, Lorg/osmdroid/util/UrlBackoff;-><init>()V

    iput-object p4, p0, Lorg/osmdroid/tileprovider/modules/MapTileDownloader;->mUrlBackoff:Lorg/osmdroid/util/UrlBackoff;

    .line 10
    new-instance p4, Lorg/osmdroid/tileprovider/modules/TileDownloader;

    invoke-direct {p4}, Lorg/osmdroid/tileprovider/modules/TileDownloader;-><init>()V

    iput-object p4, p0, Lorg/osmdroid/tileprovider/modules/MapTileDownloader;->mTileDownloader:Lorg/osmdroid/tileprovider/modules/TileDownloader;

    .line 11
    iput-object p2, p0, Lorg/osmdroid/tileprovider/modules/MapTileDownloader;->mFilesystemCache:Lorg/osmdroid/tileprovider/modules/IFilesystemCache;

    .line 12
    iput-object p3, p0, Lorg/osmdroid/tileprovider/modules/MapTileDownloader;->mNetworkAvailablityCheck:Lorg/osmdroid/tileprovider/modules/INetworkAvailablityCheck;

    .line 13
    invoke-virtual {p0, p1}, Lorg/osmdroid/tileprovider/modules/MapTileDownloader;->setTileSource(Lorg/osmdroid/tileprovider/tilesource/e;)V

    return-void
.end method

.method static synthetic access$000(Lorg/osmdroid/tileprovider/modules/MapTileDownloader;)Ljava/util/concurrent/atomic/AtomicReference;
    .locals 0

    iget-object p0, p0, Lorg/osmdroid/tileprovider/modules/MapTileDownloader;->mTileSource:Ljava/util/concurrent/atomic/AtomicReference;

    return-object p0
.end method

.method static synthetic access$100(Lorg/osmdroid/tileprovider/modules/MapTileDownloader;)Lorg/osmdroid/tileprovider/modules/IFilesystemCache;
    .locals 0

    iget-object p0, p0, Lorg/osmdroid/tileprovider/modules/MapTileDownloader;->mFilesystemCache:Lorg/osmdroid/tileprovider/modules/IFilesystemCache;

    return-object p0
.end method

.method static synthetic access$200(Lorg/osmdroid/tileprovider/modules/MapTileDownloader;)Lorg/osmdroid/tileprovider/modules/TileDownloader;
    .locals 0

    iget-object p0, p0, Lorg/osmdroid/tileprovider/modules/MapTileDownloader;->mTileDownloader:Lorg/osmdroid/tileprovider/modules/TileDownloader;

    return-object p0
.end method

.method static synthetic access$300(Lorg/osmdroid/tileprovider/modules/MapTileDownloader;)Lorg/osmdroid/tileprovider/modules/INetworkAvailablityCheck;
    .locals 0

    iget-object p0, p0, Lorg/osmdroid/tileprovider/modules/MapTileDownloader;->mNetworkAvailablityCheck:Lorg/osmdroid/tileprovider/modules/INetworkAvailablityCheck;

    return-object p0
.end method

.method static synthetic access$400(Lorg/osmdroid/tileprovider/modules/MapTileDownloader;)Lorg/osmdroid/util/UrlBackoff;
    .locals 0

    iget-object p0, p0, Lorg/osmdroid/tileprovider/modules/MapTileDownloader;->mUrlBackoff:Lorg/osmdroid/util/UrlBackoff;

    return-object p0
.end method


# virtual methods
.method public detach()V
    .locals 1

    .line 1
    invoke-super {p0}, Lorg/osmdroid/tileprovider/modules/MapTileModuleProviderBase;->detach()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/osmdroid/tileprovider/modules/MapTileDownloader;->mFilesystemCache:Lorg/osmdroid/tileprovider/modules/IFilesystemCache;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-interface {v0}, Lorg/osmdroid/tileprovider/modules/IFilesystemCache;->onDetach()V

    .line 9
    .line 10
    .line 11
    :cond_0
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
.end method

.method public getMaximumZoomLevel()I
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/osmdroid/tileprovider/modules/MapTileDownloader;->mTileSource:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Lorg/osmdroid/tileprovider/tilesource/a;->getMaximumZoomLevel()I

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
    iget-object v0, p0, Lorg/osmdroid/tileprovider/modules/MapTileDownloader;->mTileSource:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Lorg/osmdroid/tileprovider/tilesource/a;->getMinimumZoomLevel()I

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

    const-string v0, "Online Tile Download Provider"

    return-object v0
.end method

.method protected getThreadGroupName()Ljava/lang/String;
    .locals 1

    const-string v0, "downloader"

    return-object v0
.end method

.method public getTileLoader()Lorg/osmdroid/tileprovider/modules/MapTileDownloader$TileLoader;
    .locals 1

    .line 2
    iget-object v0, p0, Lorg/osmdroid/tileprovider/modules/MapTileDownloader;->mTileLoader:Lorg/osmdroid/tileprovider/modules/MapTileDownloader$TileLoader;

    return-object v0
.end method

.method public bridge synthetic getTileLoader()Lorg/osmdroid/tileprovider/modules/MapTileModuleProviderBase$TileLoader;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/osmdroid/tileprovider/modules/MapTileDownloader;->getTileLoader()Lorg/osmdroid/tileprovider/modules/MapTileDownloader$TileLoader;

    move-result-object v0

    return-object v0
.end method

.method public getTileSource()Lorg/osmdroid/tileprovider/tilesource/e;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/tileprovider/modules/MapTileDownloader;->mTileSource:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/osmdroid/tileprovider/tilesource/e;

    return-object v0
.end method

.method public getUsesDataConnection()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public setTileDownloader(Lorg/osmdroid/tileprovider/modules/TileDownloader;)V
    .locals 0

    iput-object p1, p0, Lorg/osmdroid/tileprovider/modules/MapTileDownloader;->mTileDownloader:Lorg/osmdroid/tileprovider/modules/TileDownloader;

    return-void
.end method

.method public setTileSource(Lorg/osmdroid/tileprovider/tilesource/e;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lorg/osmdroid/tileprovider/modules/MapTileDownloader;->mTileSource:Ljava/util/concurrent/atomic/AtomicReference;

    .line 6
    .line 7
    check-cast p1, Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object p1, p0, Lorg/osmdroid/tileprovider/modules/MapTileDownloader;->mTileSource:Ljava/util/concurrent/atomic/AtomicReference;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    :goto_0
    return-void
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
