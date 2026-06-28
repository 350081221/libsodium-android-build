.class public Lorg/osmdroid/tileprovider/modules/MapTileApproximater$TileLoader;
.super Lorg/osmdroid/tileprovider/modules/MapTileModuleProviderBase$TileLoader;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/osmdroid/tileprovider/modules/MapTileApproximater;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4
    name = "TileLoader"
.end annotation


# instance fields
.field final synthetic this$0:Lorg/osmdroid/tileprovider/modules/MapTileApproximater;


# direct methods
.method protected constructor <init>(Lorg/osmdroid/tileprovider/modules/MapTileApproximater;)V
    .locals 0

    iput-object p1, p0, Lorg/osmdroid/tileprovider/modules/MapTileApproximater$TileLoader;->this$0:Lorg/osmdroid/tileprovider/modules/MapTileApproximater;

    invoke-direct {p0, p1}, Lorg/osmdroid/tileprovider/modules/MapTileModuleProviderBase$TileLoader;-><init>(Lorg/osmdroid/tileprovider/modules/MapTileModuleProviderBase;)V

    return-void
.end method


# virtual methods
.method public loadTile(J)Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/osmdroid/tileprovider/modules/MapTileApproximater$TileLoader;->this$0:Lorg/osmdroid/tileprovider/modules/MapTileApproximater;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lorg/osmdroid/tileprovider/modules/MapTileApproximater;->approximateTileFromLowerZoom(J)Landroid/graphics/Bitmap;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    new-instance p2, Landroid/graphics/drawable/BitmapDrawable;

    .line 10
    .line 11
    invoke-direct {p2, p1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/graphics/Bitmap;)V

    .line 12
    .line 13
    .line 14
    const/4 p1, -0x3

    .line 15
    invoke-static {p2, p1}, Lorg/osmdroid/tileprovider/ExpirableBitmapDrawable;->setState(Landroid/graphics/drawable/Drawable;I)V

    .line 16
    .line 17
    .line 18
    return-object p2

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    return-object p1
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
