.class public Lorg/osmdroid/tileprovider/modules/MapTileAssetsProvider$TileLoader;
.super Lorg/osmdroid/tileprovider/modules/MapTileModuleProviderBase$TileLoader;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/osmdroid/tileprovider/modules/MapTileAssetsProvider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4
    name = "TileLoader"
.end annotation


# instance fields
.field private mAssets:Landroid/content/res/AssetManager;

.field final synthetic this$0:Lorg/osmdroid/tileprovider/modules/MapTileAssetsProvider;


# direct methods
.method public constructor <init>(Lorg/osmdroid/tileprovider/modules/MapTileAssetsProvider;Landroid/content/res/AssetManager;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/osmdroid/tileprovider/modules/MapTileAssetsProvider$TileLoader;->this$0:Lorg/osmdroid/tileprovider/modules/MapTileAssetsProvider;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lorg/osmdroid/tileprovider/modules/MapTileModuleProviderBase$TileLoader;-><init>(Lorg/osmdroid/tileprovider/modules/MapTileModuleProviderBase;)V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lorg/osmdroid/tileprovider/modules/MapTileAssetsProvider$TileLoader;->mAssets:Landroid/content/res/AssetManager;

    .line 7
    .line 8
    return-void
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


# virtual methods
.method public loadTile(J)Landroid/graphics/drawable/Drawable;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/osmdroid/tileprovider/modules/CantContinueException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/osmdroid/tileprovider/modules/MapTileAssetsProvider$TileLoader;->this$0:Lorg/osmdroid/tileprovider/modules/MapTileAssetsProvider;

    .line 2
    .line 3
    invoke-static {v0}, Lorg/osmdroid/tileprovider/modules/MapTileAssetsProvider;->access$000(Lorg/osmdroid/tileprovider/modules/MapTileAssetsProvider;)Ljava/util/concurrent/atomic/AtomicReference;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lorg/osmdroid/tileprovider/tilesource/e;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    return-object v1

    .line 17
    :cond_0
    :try_start_0
    iget-object v2, p0, Lorg/osmdroid/tileprovider/modules/MapTileAssetsProvider$TileLoader;->mAssets:Landroid/content/res/AssetManager;

    .line 18
    .line 19
    invoke-interface {v0, p1, p2}, Lorg/osmdroid/tileprovider/tilesource/e;->getTileRelativeFilenameString(J)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {v2, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-interface {v0, p1}, Lorg/osmdroid/tileprovider/tilesource/e;->getDrawable(Ljava/io/InputStream;)Landroid/graphics/drawable/Drawable;

    .line 28
    .line 29
    .line 30
    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lorg/osmdroid/tileprovider/tilesource/a$a; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    return-object p1

    .line 32
    :catch_0
    move-exception p1

    .line 33
    new-instance p2, Lorg/osmdroid/tileprovider/modules/CantContinueException;

    .line 34
    .line 35
    invoke-direct {p2, p1}, Lorg/osmdroid/tileprovider/modules/CantContinueException;-><init>(Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    throw p2

    .line 39
    :catch_1
    return-object v1
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
