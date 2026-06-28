.class public Lorg/osmdroid/views/overlay/OverlayItem;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/osmdroid/views/overlay/OverlayItem$HotspotPlace;
    }
.end annotation


# static fields
.field protected static final DEFAULT_MARKER_SIZE:Landroid/graphics/Point;

.field public static final ITEM_STATE_FOCUSED_MASK:I = 0x4

.field public static final ITEM_STATE_PRESSED_MASK:I = 0x1

.field public static final ITEM_STATE_SELECTED_MASK:I = 0x2


# instance fields
.field protected final mGeoPoint:Lorg/osmdroid/api/IGeoPoint;

.field protected mHotspotPlace:Lorg/osmdroid/views/overlay/OverlayItem$HotspotPlace;

.field protected mMarker:Landroid/graphics/drawable/Drawable;

.field protected final mSnippet:Ljava/lang/String;

.field protected final mTitle:Ljava/lang/String;

.field protected final mUid:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Landroid/graphics/Point;

    const/16 v1, 0x1a

    const/16 v2, 0x5e

    invoke-direct {v0, v1, v2}, Landroid/graphics/Point;-><init>(II)V

    sput-object v0, Lorg/osmdroid/views/overlay/OverlayItem;->DEFAULT_MARKER_SIZE:Landroid/graphics/Point;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/osmdroid/api/IGeoPoint;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p2, p0, Lorg/osmdroid/views/overlay/OverlayItem;->mTitle:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lorg/osmdroid/views/overlay/OverlayItem;->mSnippet:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lorg/osmdroid/views/overlay/OverlayItem;->mGeoPoint:Lorg/osmdroid/api/IGeoPoint;

    .line 6
    iput-object p1, p0, Lorg/osmdroid/views/overlay/OverlayItem;->mUid:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lorg/osmdroid/api/IGeoPoint;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0, p1, p2, p3}, Lorg/osmdroid/views/overlay/OverlayItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/osmdroid/api/IGeoPoint;)V

    return-void
.end method

.method public static setState(Landroid/graphics/drawable/Drawable;I)V
    .locals 4

    .line 1
    const/4 v0, 0x3

    .line 2
    new-array v0, v0, [I

    .line 3
    .line 4
    and-int/lit8 v1, p1, 0x1

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    if-lez v1, :cond_0

    .line 8
    .line 9
    const v1, 0x10100a7

    .line 10
    .line 11
    .line 12
    aput v1, v0, v2

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    :cond_0
    and-int/lit8 v1, p1, 0x2

    .line 16
    .line 17
    if-lez v1, :cond_1

    .line 18
    .line 19
    add-int/lit8 v1, v2, 0x1

    .line 20
    .line 21
    const v3, 0x10100a1

    .line 22
    .line 23
    .line 24
    aput v3, v0, v2

    .line 25
    .line 26
    move v2, v1

    .line 27
    :cond_1
    and-int/lit8 p1, p1, 0x4

    .line 28
    .line 29
    if-lez p1, :cond_2

    .line 30
    .line 31
    const p1, 0x101009c

    .line 32
    .line 33
    .line 34
    aput p1, v0, v2

    .line 35
    .line 36
    :cond_2
    invoke-virtual {p0, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 37
    .line 38
    .line 39
    return-void
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
.method public getDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/OverlayItem;->mMarker:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public getHeight()I
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/OverlayItem;->mMarker:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    return v0
.end method

.method public getMarker(I)Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/overlay/OverlayItem;->mMarker:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return-object p1

    .line 7
    :cond_0
    invoke-static {v0, p1}, Lorg/osmdroid/views/overlay/OverlayItem;->setState(Landroid/graphics/drawable/Drawable;I)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lorg/osmdroid/views/overlay/OverlayItem;->mMarker:Landroid/graphics/drawable/Drawable;

    .line 11
    .line 12
    return-object p1
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

.method public getMarkerHotspot()Lorg/osmdroid/views/overlay/OverlayItem$HotspotPlace;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/OverlayItem;->mHotspotPlace:Lorg/osmdroid/views/overlay/OverlayItem$HotspotPlace;

    return-object v0
.end method

.method public getPoint()Lorg/osmdroid/api/IGeoPoint;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/OverlayItem;->mGeoPoint:Lorg/osmdroid/api/IGeoPoint;

    return-object v0
.end method

.method public getSnippet()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/OverlayItem;->mSnippet:Ljava/lang/String;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/OverlayItem;->mTitle:Ljava/lang/String;

    return-object v0
.end method

.method public getUid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/OverlayItem;->mUid:Ljava/lang/String;

    return-object v0
.end method

.method public getWidth()I
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/OverlayItem;->mMarker:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    return v0
.end method

.method public setMarker(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    iput-object p1, p0, Lorg/osmdroid/views/overlay/OverlayItem;->mMarker:Landroid/graphics/drawable/Drawable;

    return-void
.end method

.method public setMarkerHotspot(Lorg/osmdroid/views/overlay/OverlayItem$HotspotPlace;)V
    .locals 0

    if-nez p1, :cond_0

    sget-object p1, Lorg/osmdroid/views/overlay/OverlayItem$HotspotPlace;->BOTTOM_CENTER:Lorg/osmdroid/views/overlay/OverlayItem$HotspotPlace;

    :cond_0
    iput-object p1, p0, Lorg/osmdroid/views/overlay/OverlayItem;->mHotspotPlace:Lorg/osmdroid/views/overlay/OverlayItem$HotspotPlace;

    return-void
.end method
