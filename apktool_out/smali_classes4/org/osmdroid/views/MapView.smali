.class public Lorg/osmdroid/views/MapView;
.super Landroid/view/ViewGroup;
.source "SourceFile"

# interfaces
.implements Lorg/osmdroid/api/IMapView;
.implements Lorg/metalev/multitouch/controller/MultiTouchController$MultiTouchObjectCanvas;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/osmdroid/views/MapView$MapViewZoomListener;,
        Lorg/osmdroid/views/MapView$MapViewGestureDetectorListener;,
        Lorg/osmdroid/views/MapView$MapViewDoubleClickListener;,
        Lorg/osmdroid/views/MapView$LayoutParams;,
        Lorg/osmdroid/views/MapView$OnFirstLayoutListener;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/view/ViewGroup;",
        "Lorg/osmdroid/api/IMapView;",
        "Lorg/metalev/multitouch/controller/MultiTouchController$MultiTouchObjectCanvas<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field private static mTileSystem:Lorg/osmdroid/util/TileSystem;


# instance fields
.field private enableFling:Z

.field private horizontalMapRepetitionEnabled:Z

.field private mCenter:Lorg/osmdroid/util/GeoPoint;

.field private final mController:Lorg/osmdroid/views/MapController;

.field private mDestroyModeOnDetach:Z

.field private final mGestureDetector:Landroid/view/GestureDetector;

.field private mImpossibleFlinging:Z

.field private final mInvalidateRect:Landroid/graphics/Rect;

.field protected final mIsAnimating:Ljava/util/concurrent/atomic/AtomicBoolean;

.field protected mIsFlinging:Z

.field private mLayoutOccurred:Z

.field private final mLayoutPoint:Landroid/graphics/Point;

.field protected mListners:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/osmdroid/events/MapListener;",
            ">;"
        }
    .end annotation
.end field

.field private mMapCenterOffsetX:I

.field private mMapCenterOffsetY:I

.field private mMapOverlay:Lorg/osmdroid/views/overlay/TilesOverlay;

.field private mMapScrollX:J

.field private mMapScrollY:J

.field protected mMaximumZoomLevel:Ljava/lang/Double;

.field protected mMinimumZoomLevel:Ljava/lang/Double;

.field private mMultiTouchController:Lorg/metalev/multitouch/controller/MultiTouchController;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/metalev/multitouch/controller/MultiTouchController<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private mMultiTouchScaleCurrentPoint:Landroid/graphics/PointF;

.field private final mMultiTouchScaleGeoPoint:Lorg/osmdroid/util/GeoPoint;

.field private final mMultiTouchScaleInitPoint:Landroid/graphics/PointF;

.field private final mOnFirstLayoutListeners:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Lorg/osmdroid/views/MapView$OnFirstLayoutListener;",
            ">;"
        }
    .end annotation
.end field

.field private mOverlayManager:Lorg/osmdroid/views/overlay/OverlayManager;

.field protected mProjection:Lorg/osmdroid/views/Projection;

.field private final mRepository:Lorg/osmdroid/views/MapViewRepository;

.field private final mRescaleScreenRect:Landroid/graphics/Rect;

.field final mRotateScalePoint:Landroid/graphics/Point;

.field private mScrollableAreaLimitEast:D

.field private mScrollableAreaLimitExtraPixelHeight:I

.field private mScrollableAreaLimitExtraPixelWidth:I

.field private mScrollableAreaLimitLatitude:Z

.field private mScrollableAreaLimitLongitude:Z

.field private mScrollableAreaLimitNorth:D

.field private mScrollableAreaLimitSouth:D

.field private mScrollableAreaLimitWest:D

.field private final mScroller:Landroid/widget/Scroller;

.field private mStartAnimationZoom:D

.field private mTileProvider:Lorg/osmdroid/tileprovider/MapTileProviderBase;

.field private mTileRequestCompleteHandler:Landroid/os/Handler;

.field private mTilesScaleFactor:F

.field private mTilesScaledToDpi:Z

.field private final mZoomController:Lorg/osmdroid/views/CustomZoomButtonsController;

.field private mZoomLevel:D

.field private mZoomRounding:Z

.field private mapOrientation:F

.field private pauseFling:Z

.field private verticalMapRepetitionEnabled:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lorg/osmdroid/util/TileSystemWebMercator;

    invoke-direct {v0}, Lorg/osmdroid/util/TileSystemWebMercator;-><init>()V

    sput-object v0, Lorg/osmdroid/views/MapView;->mTileSystem:Lorg/osmdroid/util/TileSystem;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 51
    invoke-direct {p0, p1, v0, v0, v0}, Lorg/osmdroid/views/MapView;-><init>(Landroid/content/Context;Lorg/osmdroid/tileprovider/MapTileProviderBase;Landroid/os/Handler;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 50
    invoke-direct {p0, p1, v0, v0, p2}, Lorg/osmdroid/views/MapView;-><init>(Landroid/content/Context;Lorg/osmdroid/tileprovider/MapTileProviderBase;Landroid/os/Handler;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lorg/osmdroid/tileprovider/MapTileProviderBase;)V
    .locals 1

    const/4 v0, 0x0

    .line 52
    invoke-direct {p0, p1, p2, v0}, Lorg/osmdroid/views/MapView;-><init>(Landroid/content/Context;Lorg/osmdroid/tileprovider/MapTileProviderBase;Landroid/os/Handler;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lorg/osmdroid/tileprovider/MapTileProviderBase;Landroid/os/Handler;)V
    .locals 1

    const/4 v0, 0x0

    .line 53
    invoke-direct {p0, p1, p2, p3, v0}, Lorg/osmdroid/views/MapView;-><init>(Landroid/content/Context;Lorg/osmdroid/tileprovider/MapTileProviderBase;Landroid/os/Handler;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lorg/osmdroid/tileprovider/MapTileProviderBase;Landroid/os/Handler;Landroid/util/AttributeSet;)V
    .locals 7

    .line 1
    invoke-static {}, Lorg/osmdroid/config/a;->a()Lorg/osmdroid/config/c;

    move-result-object v0

    invoke-interface {v0}, Lorg/osmdroid/config/c;->B()Z

    move-result v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v1 .. v6}, Lorg/osmdroid/views/MapView;-><init>(Landroid/content/Context;Lorg/osmdroid/tileprovider/MapTileProviderBase;Landroid/os/Handler;Landroid/util/AttributeSet;Z)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lorg/osmdroid/tileprovider/MapTileProviderBase;Landroid/os/Handler;Landroid/util/AttributeSet;Z)V
    .locals 4

    .line 2
    invoke-direct {p0, p1, p4}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const-wide/16 v0, 0x0

    .line 3
    iput-wide v0, p0, Lorg/osmdroid/views/MapView;->mZoomLevel:D

    .line 4
    new-instance v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v2, p0, Lorg/osmdroid/views/MapView;->mIsAnimating:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    new-instance v2, Landroid/graphics/PointF;

    invoke-direct {v2}, Landroid/graphics/PointF;-><init>()V

    iput-object v2, p0, Lorg/osmdroid/views/MapView;->mMultiTouchScaleInitPoint:Landroid/graphics/PointF;

    .line 6
    new-instance v2, Lorg/osmdroid/util/GeoPoint;

    invoke-direct {v2, v0, v1, v0, v1}, Lorg/osmdroid/util/GeoPoint;-><init>(DD)V

    iput-object v2, p0, Lorg/osmdroid/views/MapView;->mMultiTouchScaleGeoPoint:Lorg/osmdroid/util/GeoPoint;

    const/4 v0, 0x0

    .line 7
    iput v0, p0, Lorg/osmdroid/views/MapView;->mapOrientation:F

    .line 8
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lorg/osmdroid/views/MapView;->mInvalidateRect:Landroid/graphics/Rect;

    .line 9
    iput-boolean v3, p0, Lorg/osmdroid/views/MapView;->mTilesScaledToDpi:Z

    const/high16 v0, 0x3f800000    # 1.0f

    .line 10
    iput v0, p0, Lorg/osmdroid/views/MapView;->mTilesScaleFactor:F

    .line 11
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    iput-object v0, p0, Lorg/osmdroid/views/MapView;->mRotateScalePoint:Landroid/graphics/Point;

    .line 12
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    iput-object v0, p0, Lorg/osmdroid/views/MapView;->mLayoutPoint:Landroid/graphics/Point;

    .line 13
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lorg/osmdroid/views/MapView;->mOnFirstLayoutListeners:Ljava/util/LinkedList;

    .line 14
    iput-boolean v3, p0, Lorg/osmdroid/views/MapView;->mLayoutOccurred:Z

    const/4 v0, 0x1

    .line 15
    iput-boolean v0, p0, Lorg/osmdroid/views/MapView;->horizontalMapRepetitionEnabled:Z

    .line 16
    iput-boolean v0, p0, Lorg/osmdroid/views/MapView;->verticalMapRepetitionEnabled:Z

    .line 17
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lorg/osmdroid/views/MapView;->mListners:Ljava/util/List;

    .line 18
    new-instance v1, Lorg/osmdroid/views/MapViewRepository;

    invoke-direct {v1, p0}, Lorg/osmdroid/views/MapViewRepository;-><init>(Lorg/osmdroid/views/MapView;)V

    iput-object v1, p0, Lorg/osmdroid/views/MapView;->mRepository:Lorg/osmdroid/views/MapViewRepository;

    .line 19
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    iput-object v1, p0, Lorg/osmdroid/views/MapView;->mRescaleScreenRect:Landroid/graphics/Rect;

    .line 20
    iput-boolean v0, p0, Lorg/osmdroid/views/MapView;->mDestroyModeOnDetach:Z

    .line 21
    iput-boolean v0, p0, Lorg/osmdroid/views/MapView;->enableFling:Z

    .line 22
    iput-boolean v3, p0, Lorg/osmdroid/views/MapView;->pauseFling:Z

    .line 23
    invoke-static {}, Lorg/osmdroid/config/a;->a()Lorg/osmdroid/config/c;

    move-result-object v1

    invoke-interface {v1, p1}, Lorg/osmdroid/config/c;->H(Landroid/content/Context;)Ljava/io/File;

    .line 24
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 25
    iput-object v2, p0, Lorg/osmdroid/views/MapView;->mTileRequestCompleteHandler:Landroid/os/Handler;

    .line 26
    iput-object v2, p0, Lorg/osmdroid/views/MapView;->mController:Lorg/osmdroid/views/MapController;

    .line 27
    iput-object v2, p0, Lorg/osmdroid/views/MapView;->mZoomController:Lorg/osmdroid/views/CustomZoomButtonsController;

    .line 28
    iput-object v2, p0, Lorg/osmdroid/views/MapView;->mScroller:Landroid/widget/Scroller;

    .line 29
    iput-object v2, p0, Lorg/osmdroid/views/MapView;->mGestureDetector:Landroid/view/GestureDetector;

    return-void

    :cond_0
    if-nez p5, :cond_1

    .line 30
    invoke-virtual {p0, v0, v2}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    .line 31
    :cond_1
    new-instance p5, Lorg/osmdroid/views/MapController;

    invoke-direct {p5, p0}, Lorg/osmdroid/views/MapController;-><init>(Lorg/osmdroid/views/MapView;)V

    iput-object p5, p0, Lorg/osmdroid/views/MapView;->mController:Lorg/osmdroid/views/MapController;

    .line 32
    new-instance p5, Landroid/widget/Scroller;

    invoke-direct {p5, p1}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;)V

    iput-object p5, p0, Lorg/osmdroid/views/MapView;->mScroller:Landroid/widget/Scroller;

    if-nez p2, :cond_2

    .line 33
    invoke-direct {p0, p4}, Lorg/osmdroid/views/MapView;->getTileSourceFromAttributes(Landroid/util/AttributeSet;)Lorg/osmdroid/tileprovider/tilesource/e;

    move-result-object p2

    .line 34
    new-instance p4, Lorg/osmdroid/tileprovider/MapTileProviderBasic;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p5

    invoke-direct {p4, p5, p2}, Lorg/osmdroid/tileprovider/MapTileProviderBasic;-><init>(Landroid/content/Context;Lorg/osmdroid/tileprovider/tilesource/e;)V

    move-object p2, p4

    :cond_2
    if-nez p3, :cond_3

    .line 35
    new-instance p3, Lorg/osmdroid/tileprovider/util/SimpleInvalidationHandler;

    invoke-direct {p3, p0}, Lorg/osmdroid/tileprovider/util/SimpleInvalidationHandler;-><init>(Landroid/view/View;)V

    .line 36
    :cond_3
    iput-object p3, p0, Lorg/osmdroid/views/MapView;->mTileRequestCompleteHandler:Landroid/os/Handler;

    .line 37
    iput-object p2, p0, Lorg/osmdroid/views/MapView;->mTileProvider:Lorg/osmdroid/tileprovider/MapTileProviderBase;

    .line 38
    invoke-virtual {p2}, Lorg/osmdroid/tileprovider/MapTileProviderBase;->getTileRequestCompleteHandlers()Ljava/util/Collection;

    move-result-object p2

    iget-object p3, p0, Lorg/osmdroid/views/MapView;->mTileRequestCompleteHandler:Landroid/os/Handler;

    invoke-interface {p2, p3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 39
    iget-object p2, p0, Lorg/osmdroid/views/MapView;->mTileProvider:Lorg/osmdroid/tileprovider/MapTileProviderBase;

    invoke-virtual {p2}, Lorg/osmdroid/tileprovider/MapTileProviderBase;->getTileSource()Lorg/osmdroid/tileprovider/tilesource/e;

    move-result-object p2

    invoke-direct {p0, p2}, Lorg/osmdroid/views/MapView;->updateTileSizeForDensity(Lorg/osmdroid/tileprovider/tilesource/e;)V

    .line 40
    new-instance p2, Lorg/osmdroid/views/overlay/TilesOverlay;

    iget-object p3, p0, Lorg/osmdroid/views/MapView;->mTileProvider:Lorg/osmdroid/tileprovider/MapTileProviderBase;

    iget-boolean p4, p0, Lorg/osmdroid/views/MapView;->horizontalMapRepetitionEnabled:Z

    iget-boolean p5, p0, Lorg/osmdroid/views/MapView;->verticalMapRepetitionEnabled:Z

    invoke-direct {p2, p3, p1, p4, p5}, Lorg/osmdroid/views/overlay/TilesOverlay;-><init>(Lorg/osmdroid/tileprovider/MapTileProviderBase;Landroid/content/Context;ZZ)V

    iput-object p2, p0, Lorg/osmdroid/views/MapView;->mMapOverlay:Lorg/osmdroid/views/overlay/TilesOverlay;

    .line 41
    new-instance p2, Lorg/osmdroid/views/overlay/DefaultOverlayManager;

    iget-object p3, p0, Lorg/osmdroid/views/MapView;->mMapOverlay:Lorg/osmdroid/views/overlay/TilesOverlay;

    invoke-direct {p2, p3}, Lorg/osmdroid/views/overlay/DefaultOverlayManager;-><init>(Lorg/osmdroid/views/overlay/TilesOverlay;)V

    iput-object p2, p0, Lorg/osmdroid/views/MapView;->mOverlayManager:Lorg/osmdroid/views/overlay/OverlayManager;

    .line 42
    new-instance p2, Lorg/osmdroid/views/CustomZoomButtonsController;

    invoke-direct {p2, p0}, Lorg/osmdroid/views/CustomZoomButtonsController;-><init>(Lorg/osmdroid/views/MapView;)V

    iput-object p2, p0, Lorg/osmdroid/views/MapView;->mZoomController:Lorg/osmdroid/views/CustomZoomButtonsController;

    .line 43
    new-instance p3, Lorg/osmdroid/views/MapView$MapViewZoomListener;

    invoke-direct {p3, p0, v2}, Lorg/osmdroid/views/MapView$MapViewZoomListener;-><init>(Lorg/osmdroid/views/MapView;Lorg/osmdroid/views/MapView$1;)V

    invoke-virtual {p2, p3}, Lorg/osmdroid/views/CustomZoomButtonsController;->setOnZoomListener(Lorg/osmdroid/views/CustomZoomButtonsController$OnZoomListener;)V

    .line 44
    invoke-direct {p0}, Lorg/osmdroid/views/MapView;->checkZoomButtons()V

    .line 45
    new-instance p3, Landroid/view/GestureDetector;

    new-instance p4, Lorg/osmdroid/views/MapView$MapViewGestureDetectorListener;

    invoke-direct {p4, p0, v2}, Lorg/osmdroid/views/MapView$MapViewGestureDetectorListener;-><init>(Lorg/osmdroid/views/MapView;Lorg/osmdroid/views/MapView$1;)V

    invoke-direct {p3, p1, p4}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object p3, p0, Lorg/osmdroid/views/MapView;->mGestureDetector:Landroid/view/GestureDetector;

    .line 46
    new-instance p1, Lorg/osmdroid/views/MapView$MapViewDoubleClickListener;

    invoke-direct {p1, p0, v2}, Lorg/osmdroid/views/MapView$MapViewDoubleClickListener;-><init>(Lorg/osmdroid/views/MapView;Lorg/osmdroid/views/MapView$1;)V

    invoke-virtual {p3, p1}, Landroid/view/GestureDetector;->setOnDoubleTapListener(Landroid/view/GestureDetector$OnDoubleTapListener;)V

    .line 47
    invoke-static {}, Lorg/osmdroid/config/a;->a()Lorg/osmdroid/config/c;

    move-result-object p1

    invoke-interface {p1}, Lorg/osmdroid/config/c;->a()Z

    move-result p1

    if-eqz p1, :cond_4

    .line 48
    invoke-virtual {p0, v0}, Landroid/view/View;->setHasTransientState(Z)V

    .line 49
    :cond_4
    sget-object p1, Lorg/osmdroid/views/CustomZoomButtonsController$Visibility;->SHOW_AND_FADEOUT:Lorg/osmdroid/views/CustomZoomButtonsController$Visibility;

    invoke-virtual {p2, p1}, Lorg/osmdroid/views/CustomZoomButtonsController;->setVisibility(Lorg/osmdroid/views/CustomZoomButtonsController$Visibility;)V

    return-void
.end method

.method static synthetic access$300(Lorg/osmdroid/views/MapView;)Landroid/widget/Scroller;
    .locals 0

    iget-object p0, p0, Lorg/osmdroid/views/MapView;->mScroller:Landroid/widget/Scroller;

    return-object p0
.end method

.method static synthetic access$400(Lorg/osmdroid/views/MapView;)Lorg/osmdroid/views/CustomZoomButtonsController;
    .locals 0

    iget-object p0, p0, Lorg/osmdroid/views/MapView;->mZoomController:Lorg/osmdroid/views/CustomZoomButtonsController;

    return-object p0
.end method

.method static synthetic access$500(Lorg/osmdroid/views/MapView;)Z
    .locals 0

    iget-boolean p0, p0, Lorg/osmdroid/views/MapView;->enableFling:Z

    return p0
.end method

.method static synthetic access$600(Lorg/osmdroid/views/MapView;)Z
    .locals 0

    iget-boolean p0, p0, Lorg/osmdroid/views/MapView;->pauseFling:Z

    return p0
.end method

.method static synthetic access$602(Lorg/osmdroid/views/MapView;Z)Z
    .locals 0

    iput-boolean p1, p0, Lorg/osmdroid/views/MapView;->pauseFling:Z

    return p1
.end method

.method static synthetic access$700(Lorg/osmdroid/views/MapView;)Z
    .locals 0

    iget-boolean p0, p0, Lorg/osmdroid/views/MapView;->mImpossibleFlinging:Z

    return p0
.end method

.method static synthetic access$702(Lorg/osmdroid/views/MapView;Z)Z
    .locals 0

    iput-boolean p1, p0, Lorg/osmdroid/views/MapView;->mImpossibleFlinging:Z

    return p1
.end method

.method static synthetic access$800(Lorg/osmdroid/views/MapView;)Lorg/metalev/multitouch/controller/MultiTouchController;
    .locals 0

    iget-object p0, p0, Lorg/osmdroid/views/MapView;->mMultiTouchController:Lorg/metalev/multitouch/controller/MultiTouchController;

    return-object p0
.end method

.method private checkZoomButtons()V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/MapView;->mZoomController:Lorg/osmdroid/views/CustomZoomButtonsController;

    .line 2
    .line 3
    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->canZoomIn()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {v0, v1}, Lorg/osmdroid/views/CustomZoomButtonsController;->setZoomInEnabled(Z)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lorg/osmdroid/views/MapView;->mZoomController:Lorg/osmdroid/views/CustomZoomButtonsController;

    .line 11
    .line 12
    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->canZoomOut()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-virtual {v0, v1}, Lorg/osmdroid/views/CustomZoomButtonsController;->setZoomOutEnabled(Z)V

    .line 17
    .line 18
    .line 19
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
.end method

.method private getTileSourceFromAttributes(Landroid/util/AttributeSet;)Lorg/osmdroid/tileprovider/tilesource/e;
    .locals 6

    .line 1
    sget-object v0, Lorg/osmdroid/tileprovider/tilesource/TileSourceFactory;->DEFAULT_TILE_SOURCE:Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "OsmDroid"

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    const-string v3, "tilesource"

    .line 9
    .line 10
    invoke-interface {p1, v1, v3}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    :try_start_0
    invoke-static {v3}, Lorg/osmdroid/tileprovider/tilesource/TileSourceFactory;->getTileSource(Ljava/lang/String;)Lorg/osmdroid/tileprovider/tilesource/e;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    new-instance v4, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    const-string v5, "Using tile source specified in layout attributes: "

    .line 26
    .line 27
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-static {v2, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    .line 39
    .line 40
    move-object v0, v3

    .line 41
    goto :goto_0

    .line 42
    :catch_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 45
    .line 46
    .line 47
    const-string v4, "Invalid tile source specified in layout attributes: "

    .line 48
    .line 49
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-static {v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 60
    .line 61
    .line 62
    :cond_0
    :goto_0
    if-eqz p1, :cond_2

    .line 63
    .line 64
    instance-of v3, v0, Lorg/osmdroid/tileprovider/tilesource/d;

    .line 65
    .line 66
    if-eqz v3, :cond_2

    .line 67
    .line 68
    const-string v3, "style"

    .line 69
    .line 70
    invoke-interface {p1, v1, v3}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    if-nez p1, :cond_1

    .line 75
    .line 76
    const-string p1, "Using default style: 1"

    .line 77
    .line 78
    invoke-static {v2, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 85
    .line 86
    .line 87
    const-string v3, "Using style specified in layout attributes: "

    .line 88
    .line 89
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-static {v2, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 100
    .line 101
    .line 102
    move-object v1, v0

    .line 103
    check-cast v1, Lorg/osmdroid/tileprovider/tilesource/d;

    .line 104
    .line 105
    invoke-interface {v1, p1}, Lorg/osmdroid/tileprovider/tilesource/d;->b(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    :cond_2
    :goto_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 111
    .line 112
    .line 113
    const-string v1, "Using tile source: "

    .line 114
    .line 115
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-interface {v0}, Lorg/osmdroid/tileprovider/tilesource/e;->name()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-static {v2, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 130
    .line 131
    .line 132
    return-object v0
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

.method public static getTileSystem()Lorg/osmdroid/util/TileSystem;
    .locals 1

    sget-object v0, Lorg/osmdroid/views/MapView;->mTileSystem:Lorg/osmdroid/util/TileSystem;

    return-object v0
.end method

.method private invalidateMapCoordinates(IIIIZ)V
    .locals 1

    .line 3
    iget-object v0, p0, Lorg/osmdroid/views/MapView;->mInvalidateRect:Landroid/graphics/Rect;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/Rect;->set(IIII)V

    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p1

    div-int/lit8 p1, p1, 0x2

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p2

    div-int/lit8 p2, p2, 0x2

    .line 6
    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->getMapOrientation()F

    move-result p3

    const/4 p4, 0x0

    cmpl-float p3, p3, p4

    if-eqz p3, :cond_0

    .line 7
    iget-object p3, p0, Lorg/osmdroid/views/MapView;->mInvalidateRect:Landroid/graphics/Rect;

    .line 8
    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->getMapOrientation()F

    move-result p4

    const/high16 v0, 0x43340000    # 180.0f

    add-float/2addr p4, v0

    iget-object v0, p0, Lorg/osmdroid/views/MapView;->mInvalidateRect:Landroid/graphics/Rect;

    .line 9
    invoke-static {p3, p1, p2, p4, v0}, Lorg/osmdroid/util/GeometryMath;->getBoundingBoxForRotatatedRectangle(Landroid/graphics/Rect;IIFLandroid/graphics/Rect;)Landroid/graphics/Rect;

    :cond_0
    if-eqz p5, :cond_1

    .line 10
    iget-object p1, p0, Lorg/osmdroid/views/MapView;->mInvalidateRect:Landroid/graphics/Rect;

    iget p2, p1, Landroid/graphics/Rect;->left:I

    iget p3, p1, Landroid/graphics/Rect;->top:I

    iget p4, p1, Landroid/graphics/Rect;->right:I

    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    invoke-super {p0, p2, p3, p4, p1}, Landroid/view/View;->postInvalidate(IIII)V

    goto :goto_0

    .line 11
    :cond_1
    iget-object p1, p0, Lorg/osmdroid/views/MapView;->mInvalidateRect:Landroid/graphics/Rect;

    invoke-super {p0, p1}, Landroid/view/View;->invalidate(Landroid/graphics/Rect;)V

    :goto_0
    return-void
.end method

.method private resetProjection()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/osmdroid/views/MapView;->mProjection:Lorg/osmdroid/views/Projection;

    return-void
.end method

.method private rotateTouchEvent(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->getMapOrientation()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    cmpl-float v0, v0, v1

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return-object p1

    .line 11
    :cond_0
    invoke-static {p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->getProjection()Lorg/osmdroid/views/Projection;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Lorg/osmdroid/views/Projection;->getInvertedScaleRotateCanvasMatrix()Landroid/graphics/Matrix;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->transform(Landroid/graphics/Matrix;)V

    .line 24
    .line 25
    .line 26
    return-object p1
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

.method public static setTileSystem(Lorg/osmdroid/util/TileSystem;)V
    .locals 0

    sput-object p0, Lorg/osmdroid/views/MapView;->mTileSystem:Lorg/osmdroid/util/TileSystem;

    return-void
.end method

.method private updateTileSizeForDensity(Lorg/osmdroid/tileprovider/tilesource/e;)V
    .locals 2

    .line 1
    invoke-interface {p1}, Lorg/osmdroid/tileprovider/tilesource/e;->getTileSizePixels()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 14
    .line 15
    const/high16 v1, 0x43800000    # 256.0f

    .line 16
    .line 17
    mul-float/2addr v0, v1

    .line 18
    int-to-float p1, p1

    .line 19
    div-float/2addr v0, p1

    .line 20
    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->isTilesScaledToDpi()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    iget v1, p0, Lorg/osmdroid/views/MapView;->mTilesScaleFactor:F

    .line 27
    .line 28
    mul-float/2addr v0, v1

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iget v0, p0, Lorg/osmdroid/views/MapView;->mTilesScaleFactor:F

    .line 31
    .line 32
    :goto_0
    mul-float/2addr p1, v0

    .line 33
    float-to-int p1, p1

    .line 34
    invoke-static {}, Lorg/osmdroid/config/a;->a()Lorg/osmdroid/config/c;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-interface {v0}, Lorg/osmdroid/config/c;->U()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    new-instance v0, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 47
    .line 48
    .line 49
    const-string v1, "Scaling tiles to "

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    const-string v1, "OsmDroid"

    .line 62
    .line 63
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 64
    .line 65
    .line 66
    :cond_1
    invoke-static {p1}, Lorg/osmdroid/util/TileSystem;->setTileSize(I)V

    .line 67
    .line 68
    .line 69
    return-void
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


# virtual methods
.method public addMapListener(Lorg/osmdroid/events/MapListener;)V
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/MapView;->mListners:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public addOnFirstLayoutListener(Lorg/osmdroid/views/MapView$OnFirstLayoutListener;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->isLayoutOccurred()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lorg/osmdroid/views/MapView;->mOnFirstLayoutListeners:Ljava/util/LinkedList;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
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

.method public canZoomIn()Z
    .locals 4

    iget-wide v0, p0, Lorg/osmdroid/views/MapView;->mZoomLevel:D

    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->getMaxZoomLevel()D

    move-result-wide v2

    cmpg-double v0, v0, v2

    if-gez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public canZoomOut()Z
    .locals 4

    iget-wide v0, p0, Lorg/osmdroid/views/MapView;->mZoomLevel:D

    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->getMinZoomLevel()D

    move-result-wide v2

    cmpl-double v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 0

    instance-of p1, p1, Lorg/osmdroid/views/MapView$LayoutParams;

    return p1
.end method

.method public computeScroll()V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/MapView;->mScroller:Landroid/widget/Scroller;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-boolean v1, p0, Lorg/osmdroid/views/MapView;->mIsFlinging:Z

    .line 7
    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return-void

    .line 11
    :cond_1
    invoke-virtual {v0}, Landroid/widget/Scroller;->computeScrollOffset()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_2

    .line 16
    .line 17
    return-void

    .line 18
    :cond_2
    iget-object v0, p0, Lorg/osmdroid/views/MapView;->mScroller:Landroid/widget/Scroller;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/widget/Scroller;->isFinished()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_3

    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    iput-boolean v0, p0, Lorg/osmdroid/views/MapView;->mIsFlinging:Z

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_3
    iget-object v0, p0, Lorg/osmdroid/views/MapView;->mScroller:Landroid/widget/Scroller;

    .line 31
    .line 32
    invoke-virtual {v0}, Landroid/widget/Scroller;->getCurrX()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget-object v1, p0, Lorg/osmdroid/views/MapView;->mScroller:Landroid/widget/Scroller;

    .line 37
    .line 38
    invoke-virtual {v1}, Landroid/widget/Scroller;->getCurrY()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    invoke-virtual {p0, v0, v1}, Lorg/osmdroid/views/MapView;->scrollTo(II)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 46
    .line 47
    .line 48
    :goto_0
    return-void
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
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
.end method

.method protected dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 6

    .line 1
    const-string v0, "OsmDroid"

    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    invoke-direct {p0}, Lorg/osmdroid/views/MapView;->resetProjection()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->getProjection()Lorg/osmdroid/views/Projection;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    const/4 v4, 0x1

    .line 15
    const/4 v5, 0x0

    .line 16
    invoke-virtual {v3, p1, v4, v5}, Lorg/osmdroid/views/Projection;->save(Landroid/graphics/Canvas;ZZ)V

    .line 17
    .line 18
    .line 19
    :try_start_0
    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->getOverlayManager()Lorg/osmdroid/views/overlay/OverlayManager;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-interface {v3, p1, p0}, Lorg/osmdroid/views/overlay/OverlayManager;->onDraw(Landroid/graphics/Canvas;Lorg/osmdroid/views/MapView;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->getProjection()Lorg/osmdroid/views/Projection;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {v3, p1, v5}, Lorg/osmdroid/views/Projection;->restore(Landroid/graphics/Canvas;Z)V

    .line 31
    .line 32
    .line 33
    iget-object v3, p0, Lorg/osmdroid/views/MapView;->mZoomController:Lorg/osmdroid/views/CustomZoomButtonsController;

    .line 34
    .line 35
    if-eqz v3, :cond_0

    .line 36
    .line 37
    invoke-virtual {v3, p1}, Lorg/osmdroid/views/CustomZoomButtonsController;->draw(Landroid/graphics/Canvas;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchDraw(Landroid/graphics/Canvas;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catch_0
    move-exception p1

    .line 45
    const-string v3, "error dispatchDraw, probably in edit mode"

    .line 46
    .line 47
    invoke-static {v0, v3, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 48
    .line 49
    .line 50
    :goto_0
    invoke-static {}, Lorg/osmdroid/config/a;->a()Lorg/osmdroid/config/c;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-interface {p1}, Lorg/osmdroid/config/c;->U()Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-eqz p1, :cond_1

    .line 59
    .line 60
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 61
    .line 62
    .line 63
    move-result-wide v3

    .line 64
    new-instance p1, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 67
    .line 68
    .line 69
    const-string v5, "Rendering overall: "

    .line 70
    .line 71
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    sub-long/2addr v3, v1

    .line 75
    invoke-virtual {p1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const-string v1, "ms"

    .line 79
    .line 80
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 88
    .line 89
    .line 90
    :cond_1
    return-void
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

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 6

    .line 1
    invoke-static {}, Lorg/osmdroid/config/a;->a()Lorg/osmdroid/config/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Lorg/osmdroid/config/c;->U()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const-string v1, "OsmDroid"

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    const-string v2, "dispatchTouchEvent("

    .line 19
    .line 20
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v2, ")"

    .line 27
    .line 28
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    :cond_0
    iget-object v0, p0, Lorg/osmdroid/views/MapView;->mZoomController:Lorg/osmdroid/views/CustomZoomButtonsController;

    .line 39
    .line 40
    invoke-virtual {v0, p1}, Lorg/osmdroid/views/CustomZoomButtonsController;->isTouched(Landroid/view/MotionEvent;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    const/4 v2, 0x1

    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    iget-object p1, p0, Lorg/osmdroid/views/MapView;->mZoomController:Lorg/osmdroid/views/CustomZoomButtonsController;

    .line 48
    .line 49
    invoke-virtual {p1}, Lorg/osmdroid/views/CustomZoomButtonsController;->activate()V

    .line 50
    .line 51
    .line 52
    return v2

    .line 53
    :cond_1
    invoke-direct {p0, p1}, Lorg/osmdroid/views/MapView;->rotateTouchEvent(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    :try_start_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-eqz v3, :cond_4

    .line 62
    .line 63
    invoke-static {}, Lorg/osmdroid/config/a;->a()Lorg/osmdroid/config/c;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-interface {v3}, Lorg/osmdroid/config/c;->U()Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-eqz v3, :cond_2

    .line 72
    .line 73
    const-string v3, "super handled onTouchEvent"

    .line 74
    .line 75
    invoke-static {v1, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    .line 77
    .line 78
    :cond_2
    if-eq v0, p1, :cond_3

    .line 79
    .line 80
    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    .line 81
    .line 82
    .line 83
    :cond_3
    return v2

    .line 84
    :cond_4
    :try_start_1
    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->getOverlayManager()Lorg/osmdroid/views/overlay/OverlayManager;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    invoke-interface {v3, v0, p0}, Lorg/osmdroid/views/overlay/OverlayManager;->onTouchEvent(Landroid/view/MotionEvent;Lorg/osmdroid/views/MapView;)Z

    .line 89
    .line 90
    .line 91
    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 92
    if-eqz v3, :cond_6

    .line 93
    .line 94
    if-eq v0, p1, :cond_5

    .line 95
    .line 96
    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    .line 97
    .line 98
    .line 99
    :cond_5
    return v2

    .line 100
    :cond_6
    :try_start_2
    iget-object v3, p0, Lorg/osmdroid/views/MapView;->mMultiTouchController:Lorg/metalev/multitouch/controller/MultiTouchController;

    .line 101
    .line 102
    const/4 v4, 0x0

    .line 103
    if-eqz v3, :cond_8

    .line 104
    .line 105
    invoke-virtual {v3, p1}, Lorg/metalev/multitouch/controller/MultiTouchController;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    if-eqz v3, :cond_8

    .line 110
    .line 111
    invoke-static {}, Lorg/osmdroid/config/a;->a()Lorg/osmdroid/config/c;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    invoke-interface {v3}, Lorg/osmdroid/config/c;->U()Z

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    if-eqz v3, :cond_7

    .line 120
    .line 121
    const-string v3, "mMultiTouchController handled onTouchEvent"

    .line 122
    .line 123
    invoke-static {v1, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 124
    .line 125
    .line 126
    :cond_7
    move v3, v2

    .line 127
    goto :goto_0

    .line 128
    :cond_8
    move v3, v4

    .line 129
    :goto_0
    iget-object v5, p0, Lorg/osmdroid/views/MapView;->mGestureDetector:Landroid/view/GestureDetector;

    .line 130
    .line 131
    invoke-virtual {v5, v0}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 132
    .line 133
    .line 134
    move-result v5

    .line 135
    if-eqz v5, :cond_a

    .line 136
    .line 137
    invoke-static {}, Lorg/osmdroid/config/a;->a()Lorg/osmdroid/config/c;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    invoke-interface {v3}, Lorg/osmdroid/config/c;->U()Z

    .line 142
    .line 143
    .line 144
    move-result v3

    .line 145
    if-eqz v3, :cond_9

    .line 146
    .line 147
    const-string v3, "mGestureDetector handled onTouchEvent"

    .line 148
    .line 149
    invoke-static {v1, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 150
    .line 151
    .line 152
    :cond_9
    move v3, v2

    .line 153
    :cond_a
    if-eqz v3, :cond_c

    .line 154
    .line 155
    if-eq v0, p1, :cond_b

    .line 156
    .line 157
    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    .line 158
    .line 159
    .line 160
    :cond_b
    return v2

    .line 161
    :cond_c
    if-eq v0, p1, :cond_d

    .line 162
    .line 163
    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    .line 164
    .line 165
    .line 166
    :cond_d
    invoke-static {}, Lorg/osmdroid/config/a;->a()Lorg/osmdroid/config/c;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    invoke-interface {p1}, Lorg/osmdroid/config/c;->U()Z

    .line 171
    .line 172
    .line 173
    move-result p1

    .line 174
    if-eqz p1, :cond_e

    .line 175
    .line 176
    const-string p1, "no-one handled onTouchEvent"

    .line 177
    .line 178
    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 179
    .line 180
    .line 181
    :cond_e
    return v4

    .line 182
    :catchall_0
    move-exception v1

    .line 183
    if-eq v0, p1, :cond_f

    .line 184
    .line 185
    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    .line 186
    .line 187
    .line 188
    :cond_f
    throw v1
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

.method protected generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 8

    new-instance v7, Lorg/osmdroid/views/MapView$LayoutParams;

    const/4 v1, -0x2

    const/4 v2, -0x2

    const/4 v3, 0x0

    const/16 v4, 0x8

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lorg/osmdroid/views/MapView$LayoutParams;-><init>(IILorg/osmdroid/api/IGeoPoint;III)V

    return-object v7
.end method

.method public generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .line 1
    new-instance v0, Lorg/osmdroid/views/MapView$LayoutParams;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lorg/osmdroid/views/MapView$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method protected generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .line 2
    new-instance v0, Lorg/osmdroid/views/MapView$LayoutParams;

    invoke-direct {v0, p1}, Lorg/osmdroid/views/MapView$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method public getBoundingBox()Lorg/osmdroid/util/BoundingBox;
    .locals 1

    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->getProjection()Lorg/osmdroid/views/Projection;

    move-result-object v0

    invoke-virtual {v0}, Lorg/osmdroid/views/Projection;->getBoundingBox()Lorg/osmdroid/util/BoundingBox;

    move-result-object v0

    return-object v0
.end method

.method public getController()Lorg/osmdroid/api/IMapController;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/MapView;->mController:Lorg/osmdroid/views/MapController;

    return-object v0
.end method

.method public getDraggableObjectAtPoint(Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->isAnimating()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return-object p1

    .line 9
    :cond_0
    invoke-virtual {p1}, Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;->getX()F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {p1}, Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;->getY()F

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-virtual {p0, v0, p1}, Lorg/osmdroid/views/MapView;->setMultiTouchScaleInitPoint(FF)V

    .line 18
    .line 19
    .line 20
    return-object p0
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

.method getExpectedCenter()Lorg/osmdroid/util/GeoPoint;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/MapView;->mCenter:Lorg/osmdroid/util/GeoPoint;

    return-object v0
.end method

.method public getIntrinsicScreenRect(Landroid/graphics/Rect;)Landroid/graphics/Rect;
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    new-instance p1, Landroid/graphics/Rect;

    .line 4
    .line 5
    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-virtual {p1, v2, v2, v0, v1}, Landroid/graphics/Rect;->set(IIII)V

    .line 18
    .line 19
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

.method public getLatitudeSpanDouble()D
    .locals 2

    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->getBoundingBox()Lorg/osmdroid/util/BoundingBox;

    move-result-object v0

    invoke-virtual {v0}, Lorg/osmdroid/util/BoundingBox;->getLatitudeSpan()D

    move-result-wide v0

    return-wide v0
.end method

.method public getLongitudeSpanDouble()D
    .locals 2

    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->getBoundingBox()Lorg/osmdroid/util/BoundingBox;

    move-result-object v0

    invoke-virtual {v0}, Lorg/osmdroid/util/BoundingBox;->getLongitudeSpan()D

    move-result-wide v0

    return-wide v0
.end method

.method public getMapCenter()Lorg/osmdroid/api/IGeoPoint;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, Lorg/osmdroid/views/MapView;->getMapCenter(Lorg/osmdroid/util/GeoPoint;)Lorg/osmdroid/api/IGeoPoint;

    move-result-object v0

    return-object v0
.end method

.method public getMapCenter(Lorg/osmdroid/util/GeoPoint;)Lorg/osmdroid/api/IGeoPoint;
    .locals 4

    .line 2
    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->getProjection()Lorg/osmdroid/views/Projection;

    move-result-object v0

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, p1, v3}, Lorg/osmdroid/views/Projection;->fromPixels(IILorg/osmdroid/util/GeoPoint;Z)Lorg/osmdroid/api/IGeoPoint;

    move-result-object p1

    return-object p1
.end method

.method public getMapCenterOffsetX()I
    .locals 1

    iget v0, p0, Lorg/osmdroid/views/MapView;->mMapCenterOffsetX:I

    return v0
.end method

.method public getMapCenterOffsetY()I
    .locals 1

    iget v0, p0, Lorg/osmdroid/views/MapView;->mMapCenterOffsetY:I

    return v0
.end method

.method public getMapOrientation()F
    .locals 1

    iget v0, p0, Lorg/osmdroid/views/MapView;->mapOrientation:F

    return v0
.end method

.method public getMapOverlay()Lorg/osmdroid/views/overlay/TilesOverlay;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/MapView;->mMapOverlay:Lorg/osmdroid/views/overlay/TilesOverlay;

    return-object v0
.end method

.method public getMapScale()F
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/high16 v0, 0x3f800000    # 1.0f

    return v0
.end method

.method public getMapScrollX()J
    .locals 2

    iget-wide v0, p0, Lorg/osmdroid/views/MapView;->mMapScrollX:J

    return-wide v0
.end method

.method public getMapScrollY()J
    .locals 2

    iget-wide v0, p0, Lorg/osmdroid/views/MapView;->mMapScrollY:J

    return-wide v0
.end method

.method public getMaxZoomLevel()D
    .locals 2

    iget-object v0, p0, Lorg/osmdroid/views/MapView;->mMaximumZoomLevel:Ljava/lang/Double;

    if-nez v0, :cond_0

    iget-object v0, p0, Lorg/osmdroid/views/MapView;->mMapOverlay:Lorg/osmdroid/views/overlay/TilesOverlay;

    invoke-virtual {v0}, Lorg/osmdroid/views/overlay/TilesOverlay;->getMaximumZoomLevel()I

    move-result v0

    int-to-double v0, v0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method public getMinZoomLevel()D
    .locals 2

    iget-object v0, p0, Lorg/osmdroid/views/MapView;->mMinimumZoomLevel:Ljava/lang/Double;

    if-nez v0, :cond_0

    iget-object v0, p0, Lorg/osmdroid/views/MapView;->mMapOverlay:Lorg/osmdroid/views/overlay/TilesOverlay;

    invoke-virtual {v0}, Lorg/osmdroid/views/overlay/TilesOverlay;->getMinimumZoomLevel()I

    move-result v0

    int-to-double v0, v0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method public getOverlayManager()Lorg/osmdroid/views/overlay/OverlayManager;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/MapView;->mOverlayManager:Lorg/osmdroid/views/overlay/OverlayManager;

    return-object v0
.end method

.method public getOverlays()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/osmdroid/views/overlay/Overlay;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->getOverlayManager()Lorg/osmdroid/views/overlay/OverlayManager;

    move-result-object v0

    invoke-interface {v0}, Lorg/osmdroid/views/overlay/OverlayManager;->overlays()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getPositionAndScale(Ljava/lang/Object;Lorg/metalev/multitouch/controller/MultiTouchController$PositionAndScale;)V
    .locals 10

    .line 1
    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->startAnimation()V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lorg/osmdroid/views/MapView;->mMultiTouchScaleInitPoint:Landroid/graphics/PointF;

    .line 5
    .line 6
    iget v1, p1, Landroid/graphics/PointF;->x:F

    .line 7
    .line 8
    iget v2, p1, Landroid/graphics/PointF;->y:F

    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    const/high16 v4, 0x3f800000    # 1.0f

    .line 12
    .line 13
    const/4 v5, 0x0

    .line 14
    const/4 v6, 0x0

    .line 15
    const/4 v7, 0x0

    .line 16
    const/4 v8, 0x0

    .line 17
    const/4 v9, 0x0

    .line 18
    move-object v0, p2

    .line 19
    invoke-virtual/range {v0 .. v9}, Lorg/metalev/multitouch/controller/MultiTouchController$PositionAndScale;->set(FFZFZFFZF)V

    .line 20
    .line 21
    .line 22
    return-void
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

.method public bridge synthetic getProjection()Lorg/osmdroid/api/IProjection;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->getProjection()Lorg/osmdroid/views/Projection;

    move-result-object v0

    return-object v0
.end method

.method public getProjection()Lorg/osmdroid/views/Projection;
    .locals 8

    .line 2
    iget-object v0, p0, Lorg/osmdroid/views/MapView;->mProjection:Lorg/osmdroid/views/Projection;

    if-nez v0, :cond_2

    .line 3
    new-instance v0, Lorg/osmdroid/views/Projection;

    invoke-direct {v0, p0}, Lorg/osmdroid/views/Projection;-><init>(Lorg/osmdroid/views/MapView;)V

    .line 4
    iput-object v0, p0, Lorg/osmdroid/views/MapView;->mProjection:Lorg/osmdroid/views/Projection;

    .line 5
    iget-object v1, p0, Lorg/osmdroid/views/MapView;->mMultiTouchScaleGeoPoint:Lorg/osmdroid/util/GeoPoint;

    iget-object v2, p0, Lorg/osmdroid/views/MapView;->mMultiTouchScaleCurrentPoint:Landroid/graphics/PointF;

    invoke-virtual {v0, v1, v2}, Lorg/osmdroid/views/Projection;->adjustOffsets(Lorg/osmdroid/api/IGeoPoint;Landroid/graphics/PointF;)V

    .line 6
    iget-boolean v1, p0, Lorg/osmdroid/views/MapView;->mScrollableAreaLimitLatitude:Z

    if-eqz v1, :cond_0

    .line 7
    iget-wide v2, p0, Lorg/osmdroid/views/MapView;->mScrollableAreaLimitNorth:D

    iget-wide v4, p0, Lorg/osmdroid/views/MapView;->mScrollableAreaLimitSouth:D

    const/4 v6, 0x1

    iget v7, p0, Lorg/osmdroid/views/MapView;->mScrollableAreaLimitExtraPixelHeight:I

    move-object v1, v0

    invoke-virtual/range {v1 .. v7}, Lorg/osmdroid/views/Projection;->adjustOffsets(DDZI)V

    .line 8
    :cond_0
    iget-boolean v1, p0, Lorg/osmdroid/views/MapView;->mScrollableAreaLimitLongitude:Z

    if-eqz v1, :cond_1

    .line 9
    iget-wide v2, p0, Lorg/osmdroid/views/MapView;->mScrollableAreaLimitWest:D

    iget-wide v4, p0, Lorg/osmdroid/views/MapView;->mScrollableAreaLimitEast:D

    const/4 v6, 0x0

    iget v7, p0, Lorg/osmdroid/views/MapView;->mScrollableAreaLimitExtraPixelWidth:I

    move-object v1, v0

    invoke-virtual/range {v1 .. v7}, Lorg/osmdroid/views/Projection;->adjustOffsets(DDZI)V

    .line 10
    :cond_1
    invoke-virtual {v0, p0}, Lorg/osmdroid/views/Projection;->setMapScroll(Lorg/osmdroid/views/MapView;)Z

    move-result v0

    iput-boolean v0, p0, Lorg/osmdroid/views/MapView;->mImpossibleFlinging:Z

    .line 11
    :cond_2
    iget-object v0, p0, Lorg/osmdroid/views/MapView;->mProjection:Lorg/osmdroid/views/Projection;

    return-object v0
.end method

.method public getRepository()Lorg/osmdroid/views/MapViewRepository;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/MapView;->mRepository:Lorg/osmdroid/views/MapViewRepository;

    return-object v0
.end method

.method public getScreenRect(Landroid/graphics/Rect;)Landroid/graphics/Rect;
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Lorg/osmdroid/views/MapView;->getIntrinsicScreenRect(Landroid/graphics/Rect;)Landroid/graphics/Rect;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->getMapOrientation()F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    cmpl-float v0, v0, v1

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->getMapOrientation()F

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/high16 v1, 0x43340000    # 180.0f

    .line 19
    .line 20
    cmpl-float v0, v0, v1

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/graphics/Rect;->centerX()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    invoke-virtual {p1}, Landroid/graphics/Rect;->centerY()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->getMapOrientation()F

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    invoke-static {p1, v0, v1, v2, p1}, Lorg/osmdroid/util/GeometryMath;->getBoundingBoxForRotatatedRectangle(Landroid/graphics/Rect;IIFLandroid/graphics/Rect;)Landroid/graphics/Rect;

    .line 37
    .line 38
    .line 39
    :cond_0
    return-object p1
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

.method public getScroller()Landroid/widget/Scroller;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/MapView;->mScroller:Landroid/widget/Scroller;

    return-object v0
.end method

.method public getTileProvider()Lorg/osmdroid/tileprovider/MapTileProviderBase;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/MapView;->mTileProvider:Lorg/osmdroid/tileprovider/MapTileProviderBase;

    return-object v0
.end method

.method public getTileRequestCompleteHandler()Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/MapView;->mTileRequestCompleteHandler:Landroid/os/Handler;

    return-object v0
.end method

.method public getTilesScaleFactor()F
    .locals 1

    iget v0, p0, Lorg/osmdroid/views/MapView;->mTilesScaleFactor:F

    return v0
.end method

.method public getZoomController()Lorg/osmdroid/views/CustomZoomButtonsController;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/MapView;->mZoomController:Lorg/osmdroid/views/CustomZoomButtonsController;

    return-object v0
.end method

.method public getZoomLevel(Z)D
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2
    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->getZoomLevelDouble()D

    move-result-wide v0

    return-wide v0
.end method

.method public getZoomLevel()I
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->getZoomLevelDouble()D

    move-result-wide v0

    double-to-int v0, v0

    return v0
.end method

.method public getZoomLevelDouble()D
    .locals 2

    iget-wide v0, p0, Lorg/osmdroid/views/MapView;->mZoomLevel:D

    return-wide v0
.end method

.method public invalidateMapCoordinates(IIII)V
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    .line 2
    invoke-direct/range {v0 .. v5}, Lorg/osmdroid/views/MapView;->invalidateMapCoordinates(IIIIZ)V

    return-void
.end method

.method public invalidateMapCoordinates(Landroid/graphics/Rect;)V
    .locals 6

    .line 1
    iget v1, p1, Landroid/graphics/Rect;->left:I

    iget v2, p1, Landroid/graphics/Rect;->top:I

    iget v3, p1, Landroid/graphics/Rect;->right:I

    iget v4, p1, Landroid/graphics/Rect;->bottom:I

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lorg/osmdroid/views/MapView;->invalidateMapCoordinates(IIIIZ)V

    return-void
.end method

.method public isAnimating()Z
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/MapView;->mIsAnimating:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method

.method public isFlingEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lorg/osmdroid/views/MapView;->enableFling:Z

    return v0
.end method

.method public isHorizontalMapRepetitionEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lorg/osmdroid/views/MapView;->horizontalMapRepetitionEnabled:Z

    return v0
.end method

.method public isLayoutOccurred()Z
    .locals 1

    iget-boolean v0, p0, Lorg/osmdroid/views/MapView;->mLayoutOccurred:Z

    return v0
.end method

.method public isScrollableAreaLimitLatitude()Z
    .locals 1

    iget-boolean v0, p0, Lorg/osmdroid/views/MapView;->mScrollableAreaLimitLatitude:Z

    return v0
.end method

.method public isScrollableAreaLimitLongitude()Z
    .locals 1

    iget-boolean v0, p0, Lorg/osmdroid/views/MapView;->mScrollableAreaLimitLongitude:Z

    return v0
.end method

.method public isTilesScaledToDpi()Z
    .locals 1

    iget-boolean v0, p0, Lorg/osmdroid/views/MapView;->mTilesScaledToDpi:Z

    return v0
.end method

.method public isVerticalMapRepetitionEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lorg/osmdroid/views/MapView;->verticalMapRepetitionEnabled:Z

    return v0
.end method

.method protected myOnLayout(ZIIII)V
    .locals 14

    .line 1
    move-object v6, p0

    .line 2
    invoke-direct {p0}, Lorg/osmdroid/views/MapView;->resetProjection()V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    :goto_0
    if-ge v1, v0, :cond_2

    .line 11
    .line 12
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    const/16 v4, 0x8

    .line 21
    .line 22
    if-eq v3, v4, :cond_1

    .line 23
    .line 24
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, Lorg/osmdroid/views/MapView$LayoutParams;

    .line 29
    .line 30
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->getProjection()Lorg/osmdroid/views/Projection;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    iget-object v8, v3, Lorg/osmdroid/views/MapView$LayoutParams;->geoPoint:Lorg/osmdroid/api/IGeoPoint;

    .line 43
    .line 44
    iget-object v9, v6, Lorg/osmdroid/views/MapView;->mLayoutPoint:Landroid/graphics/Point;

    .line 45
    .line 46
    invoke-virtual {v7, v8, v9}, Lorg/osmdroid/views/Projection;->toPixels(Lorg/osmdroid/api/IGeoPoint;Landroid/graphics/Point;)Landroid/graphics/Point;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->getMapOrientation()F

    .line 50
    .line 51
    .line 52
    move-result v7

    .line 53
    const/4 v8, 0x0

    .line 54
    cmpl-float v7, v7, v8

    .line 55
    .line 56
    if-eqz v7, :cond_0

    .line 57
    .line 58
    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->getProjection()Lorg/osmdroid/views/Projection;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    iget-object v8, v6, Lorg/osmdroid/views/MapView;->mLayoutPoint:Landroid/graphics/Point;

    .line 63
    .line 64
    iget v9, v8, Landroid/graphics/Point;->x:I

    .line 65
    .line 66
    iget v8, v8, Landroid/graphics/Point;->y:I

    .line 67
    .line 68
    const/4 v10, 0x0

    .line 69
    invoke-virtual {v7, v9, v8, v10}, Lorg/osmdroid/views/Projection;->rotateAndScalePoint(IILandroid/graphics/Point;)Landroid/graphics/Point;

    .line 70
    .line 71
    .line 72
    move-result-object v7

    .line 73
    iget-object v8, v6, Lorg/osmdroid/views/MapView;->mLayoutPoint:Landroid/graphics/Point;

    .line 74
    .line 75
    iget v9, v7, Landroid/graphics/Point;->x:I

    .line 76
    .line 77
    iput v9, v8, Landroid/graphics/Point;->x:I

    .line 78
    .line 79
    iget v7, v7, Landroid/graphics/Point;->y:I

    .line 80
    .line 81
    iput v7, v8, Landroid/graphics/Point;->y:I

    .line 82
    .line 83
    :cond_0
    iget-object v7, v6, Lorg/osmdroid/views/MapView;->mLayoutPoint:Landroid/graphics/Point;

    .line 84
    .line 85
    iget v8, v7, Landroid/graphics/Point;->x:I

    .line 86
    .line 87
    int-to-long v8, v8

    .line 88
    iget v7, v7, Landroid/graphics/Point;->y:I

    .line 89
    .line 90
    int-to-long v10, v7

    .line 91
    iget v7, v3, Lorg/osmdroid/views/MapView$LayoutParams;->alignment:I

    .line 92
    .line 93
    packed-switch v7, :pswitch_data_0

    .line 94
    .line 95
    .line 96
    goto/16 :goto_5

    .line 97
    .line 98
    :pswitch_0
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 99
    .line 100
    .line 101
    move-result v7

    .line 102
    int-to-long v12, v7

    .line 103
    add-long/2addr v12, v8

    .line 104
    int-to-long v7, v5

    .line 105
    sub-long v8, v12, v7

    .line 106
    .line 107
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 108
    .line 109
    .line 110
    move-result v7

    .line 111
    goto :goto_1

    .line 112
    :pswitch_1
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 113
    .line 114
    .line 115
    move-result v7

    .line 116
    int-to-long v12, v7

    .line 117
    add-long/2addr v12, v8

    .line 118
    div-int/lit8 v7, v5, 0x2

    .line 119
    .line 120
    int-to-long v7, v7

    .line 121
    sub-long v8, v12, v7

    .line 122
    .line 123
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 124
    .line 125
    .line 126
    move-result v7

    .line 127
    goto :goto_1

    .line 128
    :pswitch_2
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 129
    .line 130
    .line 131
    move-result v7

    .line 132
    int-to-long v12, v7

    .line 133
    add-long/2addr v8, v12

    .line 134
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 135
    .line 136
    .line 137
    move-result v7

    .line 138
    :goto_1
    int-to-long v12, v7

    .line 139
    add-long/2addr v12, v10

    .line 140
    int-to-long v10, v4

    .line 141
    goto :goto_3

    .line 142
    :pswitch_3
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 143
    .line 144
    .line 145
    move-result v7

    .line 146
    int-to-long v12, v7

    .line 147
    add-long/2addr v12, v8

    .line 148
    int-to-long v7, v5

    .line 149
    sub-long v8, v12, v7

    .line 150
    .line 151
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 152
    .line 153
    .line 154
    move-result v7

    .line 155
    int-to-long v12, v7

    .line 156
    add-long/2addr v12, v10

    .line 157
    div-int/lit8 v7, v4, 0x2

    .line 158
    .line 159
    goto :goto_2

    .line 160
    :pswitch_4
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 161
    .line 162
    .line 163
    move-result v7

    .line 164
    int-to-long v12, v7

    .line 165
    add-long/2addr v12, v8

    .line 166
    div-int/lit8 v7, v5, 0x2

    .line 167
    .line 168
    int-to-long v7, v7

    .line 169
    sub-long v8, v12, v7

    .line 170
    .line 171
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 172
    .line 173
    .line 174
    move-result v7

    .line 175
    int-to-long v12, v7

    .line 176
    add-long/2addr v12, v10

    .line 177
    div-int/lit8 v7, v4, 0x2

    .line 178
    .line 179
    goto :goto_2

    .line 180
    :pswitch_5
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 181
    .line 182
    .line 183
    move-result v7

    .line 184
    int-to-long v12, v7

    .line 185
    add-long/2addr v8, v12

    .line 186
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 187
    .line 188
    .line 189
    move-result v7

    .line 190
    int-to-long v12, v7

    .line 191
    add-long/2addr v12, v10

    .line 192
    div-int/lit8 v7, v4, 0x2

    .line 193
    .line 194
    :goto_2
    int-to-long v10, v7

    .line 195
    :goto_3
    sub-long v10, v12, v10

    .line 196
    .line 197
    goto :goto_5

    .line 198
    :pswitch_6
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 199
    .line 200
    .line 201
    move-result v7

    .line 202
    int-to-long v12, v7

    .line 203
    add-long/2addr v12, v8

    .line 204
    int-to-long v7, v5

    .line 205
    sub-long v8, v12, v7

    .line 206
    .line 207
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 208
    .line 209
    .line 210
    move-result v7

    .line 211
    goto :goto_4

    .line 212
    :pswitch_7
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 213
    .line 214
    .line 215
    move-result v7

    .line 216
    int-to-long v12, v7

    .line 217
    add-long/2addr v12, v8

    .line 218
    div-int/lit8 v7, v5, 0x2

    .line 219
    .line 220
    int-to-long v7, v7

    .line 221
    sub-long v8, v12, v7

    .line 222
    .line 223
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 224
    .line 225
    .line 226
    move-result v7

    .line 227
    goto :goto_4

    .line 228
    :pswitch_8
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 229
    .line 230
    .line 231
    move-result v7

    .line 232
    int-to-long v12, v7

    .line 233
    add-long/2addr v8, v12

    .line 234
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 235
    .line 236
    .line 237
    move-result v7

    .line 238
    :goto_4
    int-to-long v12, v7

    .line 239
    add-long/2addr v10, v12

    .line 240
    :goto_5
    iget v7, v3, Lorg/osmdroid/views/MapView$LayoutParams;->offsetX:I

    .line 241
    .line 242
    int-to-long v12, v7

    .line 243
    add-long/2addr v8, v12

    .line 244
    iget v3, v3, Lorg/osmdroid/views/MapView$LayoutParams;->offsetY:I

    .line 245
    .line 246
    int-to-long v12, v3

    .line 247
    add-long/2addr v10, v12

    .line 248
    invoke-static {v8, v9}, Lorg/osmdroid/util/TileSystem;->truncateToInt(J)I

    .line 249
    .line 250
    .line 251
    move-result v3

    .line 252
    invoke-static {v10, v11}, Lorg/osmdroid/util/TileSystem;->truncateToInt(J)I

    .line 253
    .line 254
    .line 255
    move-result v7

    .line 256
    int-to-long v12, v5

    .line 257
    add-long/2addr v8, v12

    .line 258
    invoke-static {v8, v9}, Lorg/osmdroid/util/TileSystem;->truncateToInt(J)I

    .line 259
    .line 260
    .line 261
    move-result v5

    .line 262
    int-to-long v8, v4

    .line 263
    add-long/2addr v10, v8

    .line 264
    invoke-static {v10, v11}, Lorg/osmdroid/util/TileSystem;->truncateToInt(J)I

    .line 265
    .line 266
    .line 267
    move-result v4

    .line 268
    invoke-virtual {v2, v3, v7, v5, v4}, Landroid/view/View;->layout(IIII)V

    .line 269
    .line 270
    .line 271
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 272
    .line 273
    goto/16 :goto_0

    .line 274
    .line 275
    :cond_2
    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->isLayoutOccurred()Z

    .line 276
    .line 277
    .line 278
    move-result v0

    .line 279
    if-nez v0, :cond_4

    .line 280
    .line 281
    const/4 v0, 0x1

    .line 282
    iput-boolean v0, v6, Lorg/osmdroid/views/MapView;->mLayoutOccurred:Z

    .line 283
    .line 284
    iget-object v0, v6, Lorg/osmdroid/views/MapView;->mOnFirstLayoutListeners:Ljava/util/LinkedList;

    .line 285
    .line 286
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 287
    .line 288
    .line 289
    move-result-object v7

    .line 290
    :goto_6
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 291
    .line 292
    .line 293
    move-result v0

    .line 294
    if-eqz v0, :cond_3

    .line 295
    .line 296
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    check-cast v0, Lorg/osmdroid/views/MapView$OnFirstLayoutListener;

    .line 301
    .line 302
    move-object v1, p0

    .line 303
    move/from16 v2, p2

    .line 304
    .line 305
    move/from16 v3, p3

    .line 306
    .line 307
    move/from16 v4, p4

    .line 308
    .line 309
    move/from16 v5, p5

    .line 310
    .line 311
    invoke-interface/range {v0 .. v5}, Lorg/osmdroid/views/MapView$OnFirstLayoutListener;->onFirstLayout(Landroid/view/View;IIII)V

    .line 312
    .line 313
    .line 314
    goto :goto_6

    .line 315
    :cond_3
    iget-object v0, v6, Lorg/osmdroid/views/MapView;->mOnFirstLayoutListeners:Ljava/util/LinkedList;

    .line 316
    .line 317
    invoke-virtual {v0}, Ljava/util/LinkedList;->clear()V

    .line 318
    .line 319
    .line 320
    :cond_4
    invoke-direct {p0}, Lorg/osmdroid/views/MapView;->resetProjection()V

    .line 321
    .line 322
    .line 323
    return-void

    .line 324
    nop

    .line 325
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method

.method public onAttachedToWindow()V
    .locals 0

    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    return-void
.end method

.method public onDetach()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->getOverlayManager()Lorg/osmdroid/views/overlay/OverlayManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p0}, Lorg/osmdroid/views/overlay/OverlayManager;->onDetach(Lorg/osmdroid/views/MapView;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lorg/osmdroid/views/MapView;->mTileProvider:Lorg/osmdroid/tileprovider/MapTileProviderBase;

    .line 9
    .line 10
    invoke-virtual {v0}, Lorg/osmdroid/tileprovider/MapTileProviderBase;->detach()V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lorg/osmdroid/views/MapView;->mZoomController:Lorg/osmdroid/views/CustomZoomButtonsController;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Lorg/osmdroid/views/CustomZoomButtonsController;->onDetach()V

    .line 18
    .line 19
    .line 20
    :cond_0
    iget-object v0, p0, Lorg/osmdroid/views/MapView;->mTileRequestCompleteHandler:Landroid/os/Handler;

    .line 21
    .line 22
    instance-of v1, v0, Lorg/osmdroid/tileprovider/util/SimpleInvalidationHandler;

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    check-cast v0, Lorg/osmdroid/tileprovider/util/SimpleInvalidationHandler;

    .line 27
    .line 28
    invoke-virtual {v0}, Lorg/osmdroid/tileprovider/util/SimpleInvalidationHandler;->destroy()V

    .line 29
    .line 30
    .line 31
    :cond_1
    const/4 v0, 0x0

    .line 32
    iput-object v0, p0, Lorg/osmdroid/views/MapView;->mTileRequestCompleteHandler:Landroid/os/Handler;

    .line 33
    .line 34
    iget-object v1, p0, Lorg/osmdroid/views/MapView;->mProjection:Lorg/osmdroid/views/Projection;

    .line 35
    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    invoke-virtual {v1}, Lorg/osmdroid/views/Projection;->detach()V

    .line 39
    .line 40
    .line 41
    :cond_2
    iput-object v0, p0, Lorg/osmdroid/views/MapView;->mProjection:Lorg/osmdroid/views/Projection;

    .line 42
    .line 43
    iget-object v0, p0, Lorg/osmdroid/views/MapView;->mRepository:Lorg/osmdroid/views/MapViewRepository;

    .line 44
    .line 45
    invoke-virtual {v0}, Lorg/osmdroid/views/MapViewRepository;->onDetach()V

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, Lorg/osmdroid/views/MapView;->mListners:Ljava/util/List;

    .line 49
    .line 50
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 51
    .line 52
    .line 53
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
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/osmdroid/views/MapView;->mDestroyModeOnDetach:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->onDetach()V

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

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
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->getOverlayManager()Lorg/osmdroid/views/overlay/OverlayManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1, p2, p0}, Lorg/osmdroid/views/overlay/OverlayManager;->onKeyDown(ILandroid/view/KeyEvent;Lorg/osmdroid/views/MapView;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    invoke-super {p0, p1, p2}, Landroid/view/View;->onKeyDown(ILandroid/view/KeyEvent;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 21
    :goto_1
    return p1
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

.method public onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->getOverlayManager()Lorg/osmdroid/views/overlay/OverlayManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1, p2, p0}, Lorg/osmdroid/views/overlay/OverlayManager;->onKeyUp(ILandroid/view/KeyEvent;Lorg/osmdroid/views/MapView;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    invoke-super {p0, p1, p2}, Landroid/view/View;->onKeyUp(ILandroid/view/KeyEvent;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 21
    :goto_1
    return p1
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

.method protected onLayout(ZIIII)V
    .locals 0

    invoke-virtual/range {p0 .. p5}, Lorg/osmdroid/views/MapView;->myOnLayout(ZIIII)V

    return-void
.end method

.method protected onMeasure(II)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Landroid/view/ViewGroup;->measureChildren(II)V

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 5
    .line 6
    .line 7
    return-void
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

.method public onPause()V
    .locals 1

    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->getOverlayManager()Lorg/osmdroid/views/overlay/OverlayManager;

    move-result-object v0

    invoke-interface {v0}, Lorg/osmdroid/views/overlay/OverlayManager;->onPause()V

    return-void
.end method

.method public onResume()V
    .locals 1

    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->getOverlayManager()Lorg/osmdroid/views/overlay/OverlayManager;

    move-result-object v0

    invoke-interface {v0}, Lorg/osmdroid/views/overlay/OverlayManager;->onResume()V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public onTrackballEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->getOverlayManager()Lorg/osmdroid/views/overlay/OverlayManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1, p0}, Lorg/osmdroid/views/overlay/OverlayManager;->onTrackballEvent(Landroid/view/MotionEvent;Lorg/osmdroid/views/MapView;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    return p1

    .line 13
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/high16 v1, 0x41c80000    # 25.0f

    .line 18
    .line 19
    mul-float/2addr v0, v1

    .line 20
    float-to-int v0, v0

    .line 21
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    mul-float/2addr v2, v1

    .line 26
    float-to-int v1, v2

    .line 27
    invoke-virtual {p0, v0, v1}, Lorg/osmdroid/views/MapView;->scrollBy(II)V

    .line 28
    .line 29
    .line 30
    invoke-super {p0, p1}, Landroid/view/View;->onTrackballEvent(Landroid/view/MotionEvent;)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    return p1
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

.method public postInvalidateMapCoordinates(IIII)V
    .locals 6

    const/4 v5, 0x1

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lorg/osmdroid/views/MapView;->invalidateMapCoordinates(IIIIZ)V

    return-void
.end method

.method public removeMapListener(Lorg/osmdroid/events/MapListener;)V
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/MapView;->mListners:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public removeOnFirstLayoutListener(Lorg/osmdroid/views/MapView$OnFirstLayoutListener;)V
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/MapView;->mOnFirstLayoutListeners:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public resetMultiTouchScale()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/osmdroid/views/MapView;->mMultiTouchScaleCurrentPoint:Landroid/graphics/PointF;

    return-void
.end method

.method public resetScrollableAreaLimitLatitude()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/osmdroid/views/MapView;->mScrollableAreaLimitLatitude:Z

    return-void
.end method

.method public resetScrollableAreaLimitLongitude()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/osmdroid/views/MapView;->mScrollableAreaLimitLongitude:Z

    return-void
.end method

.method public resetTilesScaleFactor()V
    .locals 1

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    iput v0, p0, Lorg/osmdroid/views/MapView;->mTilesScaleFactor:F

    .line 4
    .line 5
    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->getTileProvider()Lorg/osmdroid/tileprovider/MapTileProviderBase;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lorg/osmdroid/tileprovider/MapTileProviderBase;->getTileSource()Lorg/osmdroid/tileprovider/tilesource/e;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-direct {p0, v0}, Lorg/osmdroid/views/MapView;->updateTileSizeForDensity(Lorg/osmdroid/tileprovider/tilesource/e;)V

    .line 14
    .line 15
    .line 16
    return-void
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

.method public scrollBy(II)V
    .locals 4

    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->getMapScrollX()J

    move-result-wide v0

    int-to-long v2, p1

    add-long/2addr v0, v2

    long-to-int p1, v0

    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->getMapScrollY()J

    move-result-wide v0

    int-to-long v2, p2

    add-long/2addr v0, v2

    long-to-int p2, v0

    invoke-virtual {p0, p1, p2}, Lorg/osmdroid/views/MapView;->scrollTo(II)V

    return-void
.end method

.method public scrollTo(II)V
    .locals 7

    .line 1
    int-to-long v0, p1

    .line 2
    int-to-long v2, p2

    .line 3
    invoke-virtual {p0, v0, v1, v2, v3}, Lorg/osmdroid/views/MapView;->setMapScroll(JJ)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lorg/osmdroid/views/MapView;->resetProjection()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->getMapOrientation()F

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x0

    .line 17
    cmpl-float v0, v0, v1

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getRight()I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    invoke-virtual {p0}, Landroid/view/View;->getBottom()I

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    move-object v1, p0

    .line 39
    invoke-virtual/range {v1 .. v6}, Lorg/osmdroid/views/MapView;->myOnLayout(ZIIII)V

    .line 40
    .line 41
    .line 42
    :cond_0
    iget-object v0, p0, Lorg/osmdroid/views/MapView;->mListners:Ljava/util/List;

    .line 43
    .line 44
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    const/4 v1, 0x0

    .line 49
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz v2, :cond_2

    .line 54
    .line 55
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    check-cast v2, Lorg/osmdroid/events/MapListener;

    .line 60
    .line 61
    if-eqz v1, :cond_1

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_1
    new-instance v1, Lorg/osmdroid/events/ScrollEvent;

    .line 65
    .line 66
    invoke-direct {v1, p0, p1, p2}, Lorg/osmdroid/events/ScrollEvent;-><init>(Lorg/osmdroid/views/MapView;II)V

    .line 67
    .line 68
    .line 69
    :goto_1
    invoke-interface {v2, v1}, Lorg/osmdroid/events/MapListener;->onScroll(Lorg/osmdroid/events/ScrollEvent;)Z

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_2
    return-void
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

.method public selectObject(Ljava/lang/Object;Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;)V
    .locals 0

    .line 1
    iget-boolean p1, p0, Lorg/osmdroid/views/MapView;->mZoomRounding:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-wide p1, p0, Lorg/osmdroid/views/MapView;->mZoomLevel:D

    .line 6
    .line 7
    invoke-static {p1, p2}, Ljava/lang/Math;->round(D)J

    .line 8
    .line 9
    .line 10
    move-result-wide p1

    .line 11
    long-to-double p1, p1

    .line 12
    iput-wide p1, p0, Lorg/osmdroid/views/MapView;->mZoomLevel:D

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->resetMultiTouchScale()V

    .line 18
    .line 19
    .line 20
    return-void
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

.method public setBackgroundColor(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/MapView;->mMapOverlay:Lorg/osmdroid/views/overlay/TilesOverlay;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lorg/osmdroid/views/overlay/TilesOverlay;->setLoadingBackgroundColor(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

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

.method public setBuiltInZoomControls(Z)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/MapView;->mZoomController:Lorg/osmdroid/views/CustomZoomButtonsController;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    sget-object p1, Lorg/osmdroid/views/CustomZoomButtonsController$Visibility;->SHOW_AND_FADEOUT:Lorg/osmdroid/views/CustomZoomButtonsController$Visibility;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    sget-object p1, Lorg/osmdroid/views/CustomZoomButtonsController$Visibility;->NEVER:Lorg/osmdroid/views/CustomZoomButtonsController$Visibility;

    .line 9
    .line 10
    :goto_0
    invoke-virtual {v0, p1}, Lorg/osmdroid/views/CustomZoomButtonsController;->setVisibility(Lorg/osmdroid/views/CustomZoomButtonsController$Visibility;)V

    .line 11
    .line 12
    .line 13
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

.method public setDestroyMode(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/osmdroid/views/MapView;->mDestroyModeOnDetach:Z

    return-void
.end method

.method public setExpectedCenter(Lorg/osmdroid/api/IGeoPoint;)V
    .locals 6

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    .line 10
    invoke-virtual/range {v0 .. v5}, Lorg/osmdroid/views/MapView;->setExpectedCenter(Lorg/osmdroid/api/IGeoPoint;JJ)V

    return-void
.end method

.method public setExpectedCenter(Lorg/osmdroid/api/IGeoPoint;JJ)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->getProjection()Lorg/osmdroid/views/Projection;

    move-result-object v0

    invoke-virtual {v0}, Lorg/osmdroid/views/Projection;->getCurrentCenter()Lorg/osmdroid/util/GeoPoint;

    move-result-object v0

    .line 2
    check-cast p1, Lorg/osmdroid/util/GeoPoint;

    iput-object p1, p0, Lorg/osmdroid/views/MapView;->mCenter:Lorg/osmdroid/util/GeoPoint;

    neg-long p1, p2

    neg-long p3, p4

    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Lorg/osmdroid/views/MapView;->setMapScroll(JJ)V

    .line 4
    invoke-direct {p0}, Lorg/osmdroid/views/MapView;->resetProjection()V

    .line 5
    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->getProjection()Lorg/osmdroid/views/Projection;

    move-result-object p1

    invoke-virtual {p1}, Lorg/osmdroid/views/Projection;->getCurrentCenter()Lorg/osmdroid/util/GeoPoint;

    move-result-object p1

    .line 6
    invoke-virtual {p1, v0}, Lorg/osmdroid/util/GeoPoint;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 7
    iget-object p1, p0, Lorg/osmdroid/views/MapView;->mListners:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 p2, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lorg/osmdroid/events/MapListener;

    if-eqz p2, :cond_0

    goto :goto_1

    .line 8
    :cond_0
    new-instance p2, Lorg/osmdroid/events/ScrollEvent;

    const/4 p4, 0x0

    invoke-direct {p2, p0, p4, p4}, Lorg/osmdroid/events/ScrollEvent;-><init>(Lorg/osmdroid/views/MapView;II)V

    :goto_1
    invoke-interface {p3, p2}, Lorg/osmdroid/events/MapListener;->onScroll(Lorg/osmdroid/events/ScrollEvent;)Z

    goto :goto_0

    .line 9
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setFlingEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/osmdroid/views/MapView;->enableFling:Z

    return-void
.end method

.method public setHorizontalMapRepetitionEnabled(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Lorg/osmdroid/views/MapView;->horizontalMapRepetitionEnabled:Z

    .line 2
    .line 3
    iget-object v0, p0, Lorg/osmdroid/views/MapView;->mMapOverlay:Lorg/osmdroid/views/overlay/TilesOverlay;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lorg/osmdroid/views/overlay/TilesOverlay;->setHorizontalWrapEnabled(Z)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lorg/osmdroid/views/MapView;->resetProjection()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 12
    .line 13
    .line 14
    return-void
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

.method public setInitCenter(Lorg/osmdroid/api/IGeoPoint;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0, p1}, Lorg/osmdroid/views/MapView;->setExpectedCenter(Lorg/osmdroid/api/IGeoPoint;)V

    return-void
.end method

.method setMapCenter(DD)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 3
    new-instance v0, Lorg/osmdroid/util/GeoPoint;

    invoke-direct {v0, p1, p2, p3, p4}, Lorg/osmdroid/util/GeoPoint;-><init>(DD)V

    invoke-virtual {p0, v0}, Lorg/osmdroid/views/MapView;->setMapCenter(Lorg/osmdroid/api/IGeoPoint;)V

    return-void
.end method

.method setMapCenter(II)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2
    new-instance v0, Lorg/osmdroid/util/GeoPoint;

    invoke-direct {v0, p1, p2}, Lorg/osmdroid/util/GeoPoint;-><init>(II)V

    invoke-virtual {p0, v0}, Lorg/osmdroid/views/MapView;->setMapCenter(Lorg/osmdroid/api/IGeoPoint;)V

    return-void
.end method

.method setMapCenter(Lorg/osmdroid/api/IGeoPoint;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->getController()Lorg/osmdroid/api/IMapController;

    move-result-object v0

    invoke-interface {v0, p1}, Lorg/osmdroid/api/IMapController;->animateTo(Lorg/osmdroid/api/IGeoPoint;)V

    return-void
.end method

.method public setMapCenterOffset(II)V
    .locals 0

    .line 1
    iput p1, p0, Lorg/osmdroid/views/MapView;->mMapCenterOffsetX:I

    .line 2
    .line 3
    iput p2, p0, Lorg/osmdroid/views/MapView;->mMapCenterOffsetY:I

    .line 4
    .line 5
    return-void
    .line 6
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

.method public setMapListener(Lorg/osmdroid/events/MapListener;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lorg/osmdroid/views/MapView;->mListners:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public setMapOrientation(F)V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, p1, v0}, Lorg/osmdroid/views/MapView;->setMapOrientation(FZ)V

    return-void
.end method

.method public setMapOrientation(FZ)V
    .locals 1

    const/high16 v0, 0x43b40000    # 360.0f

    rem-float/2addr p1, v0

    .line 2
    iput p1, p0, Lorg/osmdroid/views/MapView;->mapOrientation:F

    if-eqz p2, :cond_0

    .line 3
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 4
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_0
    return-void
.end method

.method setMapScroll(JJ)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lorg/osmdroid/views/MapView;->mMapScrollX:J

    .line 2
    .line 3
    iput-wide p3, p0, Lorg/osmdroid/views/MapView;->mMapScrollY:J

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 6
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

.method public setMaxZoomLevel(Ljava/lang/Double;)V
    .locals 0

    iput-object p1, p0, Lorg/osmdroid/views/MapView;->mMaximumZoomLevel:Ljava/lang/Double;

    return-void
.end method

.method public setMinZoomLevel(Ljava/lang/Double;)V
    .locals 0

    iput-object p1, p0, Lorg/osmdroid/views/MapView;->mMinimumZoomLevel:Ljava/lang/Double;

    return-void
.end method

.method public setMultiTouchControls(Z)V
    .locals 1

    if-eqz p1, :cond_0

    new-instance p1, Lorg/metalev/multitouch/controller/MultiTouchController;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Lorg/metalev/multitouch/controller/MultiTouchController;-><init>(Lorg/metalev/multitouch/controller/MultiTouchController$MultiTouchObjectCanvas;Z)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lorg/osmdroid/views/MapView;->mMultiTouchController:Lorg/metalev/multitouch/controller/MultiTouchController;

    return-void
.end method

.method protected setMultiTouchScale(F)V
    .locals 4

    float-to-double v0, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->log(D)D

    move-result-wide v0

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    invoke-static {v2, v3}, Ljava/lang/Math;->log(D)D

    move-result-wide v2

    div-double/2addr v0, v2

    iget-wide v2, p0, Lorg/osmdroid/views/MapView;->mStartAnimationZoom:D

    add-double/2addr v0, v2

    invoke-virtual {p0, v0, v1}, Lorg/osmdroid/views/MapView;->setZoomLevel(D)D

    return-void
.end method

.method protected setMultiTouchScaleCurrentPoint(FF)V
    .locals 1

    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0, p1, p2}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object v0, p0, Lorg/osmdroid/views/MapView;->mMultiTouchScaleCurrentPoint:Landroid/graphics/PointF;

    return-void
.end method

.method protected setMultiTouchScaleInitPoint(FF)V
    .locals 4

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/MapView;->mMultiTouchScaleInitPoint:Landroid/graphics/PointF;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Landroid/graphics/PointF;->set(FF)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->getProjection()Lorg/osmdroid/views/Projection;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    float-to-int v1, p1

    .line 11
    float-to-int v2, p2

    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-virtual {v0, v1, v2, v3}, Lorg/osmdroid/views/Projection;->unrotateAndScalePoint(IILandroid/graphics/Point;)Landroid/graphics/Point;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->getProjection()Lorg/osmdroid/views/Projection;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget v2, v0, Landroid/graphics/Point;->x:I

    .line 22
    .line 23
    iget v0, v0, Landroid/graphics/Point;->y:I

    .line 24
    .line 25
    iget-object v3, p0, Lorg/osmdroid/views/MapView;->mMultiTouchScaleGeoPoint:Lorg/osmdroid/util/GeoPoint;

    .line 26
    .line 27
    invoke-virtual {v1, v2, v0, v3}, Lorg/osmdroid/views/Projection;->fromPixels(IILorg/osmdroid/util/GeoPoint;)Lorg/osmdroid/api/IGeoPoint;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, p1, p2}, Lorg/osmdroid/views/MapView;->setMultiTouchScaleCurrentPoint(FF)V

    .line 31
    .line 32
    .line 33
    return-void
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

.method public setOverlayManager(Lorg/osmdroid/views/overlay/OverlayManager;)V
    .locals 0

    iput-object p1, p0, Lorg/osmdroid/views/MapView;->mOverlayManager:Lorg/osmdroid/views/overlay/OverlayManager;

    return-void
.end method

.method public setPositionAndScale(Ljava/lang/Object;Lorg/metalev/multitouch/controller/MultiTouchController$PositionAndScale;Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;)Z
    .locals 0

    .line 1
    invoke-virtual {p2}, Lorg/metalev/multitouch/controller/MultiTouchController$PositionAndScale;->getXOff()F

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p2}, Lorg/metalev/multitouch/controller/MultiTouchController$PositionAndScale;->getYOff()F

    .line 6
    .line 7
    .line 8
    move-result p3

    .line 9
    invoke-virtual {p0, p1, p3}, Lorg/osmdroid/views/MapView;->setMultiTouchScaleCurrentPoint(FF)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p2}, Lorg/metalev/multitouch/controller/MultiTouchController$PositionAndScale;->getScale()F

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    invoke-virtual {p0, p1}, Lorg/osmdroid/views/MapView;->setMultiTouchScale(F)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 23
    .line 24
    .line 25
    const/4 p1, 0x1

    .line 26
    return p1
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

.method protected setProjection(Lorg/osmdroid/views/Projection;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iput-object p1, p0, Lorg/osmdroid/views/MapView;->mProjection:Lorg/osmdroid/views/Projection;

    return-void
.end method

.method public setScrollableAreaLimitDouble(Lorg/osmdroid/util/BoundingBox;)V
    .locals 12

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->resetScrollableAreaLimitLatitude()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->resetScrollableAreaLimitLongitude()V

    .line 7
    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p1}, Lorg/osmdroid/util/BoundingBox;->getActualNorth()D

    .line 11
    .line 12
    .line 13
    move-result-wide v1

    .line 14
    invoke-virtual {p1}, Lorg/osmdroid/util/BoundingBox;->getActualSouth()D

    .line 15
    .line 16
    .line 17
    move-result-wide v3

    .line 18
    const/4 v5, 0x0

    .line 19
    move-object v0, p0

    .line 20
    invoke-virtual/range {v0 .. v5}, Lorg/osmdroid/views/MapView;->setScrollableAreaLimitLatitude(DDI)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Lorg/osmdroid/util/BoundingBox;->getLonWest()D

    .line 24
    .line 25
    .line 26
    move-result-wide v7

    .line 27
    invoke-virtual {p1}, Lorg/osmdroid/util/BoundingBox;->getLonEast()D

    .line 28
    .line 29
    .line 30
    move-result-wide v9

    .line 31
    const/4 v11, 0x0

    .line 32
    move-object v6, p0

    .line 33
    invoke-virtual/range {v6 .. v11}, Lorg/osmdroid/views/MapView;->setScrollableAreaLimitLongitude(DDI)V

    .line 34
    .line 35
    .line 36
    :goto_0
    return-void
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

.method public setScrollableAreaLimitLatitude(DDI)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lorg/osmdroid/views/MapView;->mScrollableAreaLimitLatitude:Z

    .line 3
    .line 4
    iput-wide p1, p0, Lorg/osmdroid/views/MapView;->mScrollableAreaLimitNorth:D

    .line 5
    .line 6
    iput-wide p3, p0, Lorg/osmdroid/views/MapView;->mScrollableAreaLimitSouth:D

    .line 7
    .line 8
    iput p5, p0, Lorg/osmdroid/views/MapView;->mScrollableAreaLimitExtraPixelHeight:I

    .line 9
    .line 10
    return-void
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

.method public setScrollableAreaLimitLongitude(DDI)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lorg/osmdroid/views/MapView;->mScrollableAreaLimitLongitude:Z

    .line 3
    .line 4
    iput-wide p1, p0, Lorg/osmdroid/views/MapView;->mScrollableAreaLimitWest:D

    .line 5
    .line 6
    iput-wide p3, p0, Lorg/osmdroid/views/MapView;->mScrollableAreaLimitEast:D

    .line 7
    .line 8
    iput p5, p0, Lorg/osmdroid/views/MapView;->mScrollableAreaLimitExtraPixelWidth:I

    .line 9
    .line 10
    return-void
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

.method public setTileProvider(Lorg/osmdroid/tileprovider/MapTileProviderBase;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/MapView;->mTileProvider:Lorg/osmdroid/tileprovider/MapTileProviderBase;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/osmdroid/tileprovider/MapTileProviderBase;->detach()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lorg/osmdroid/views/MapView;->mTileProvider:Lorg/osmdroid/tileprovider/MapTileProviderBase;

    .line 7
    .line 8
    invoke-virtual {v0}, Lorg/osmdroid/tileprovider/MapTileProviderBase;->clearTileCache()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lorg/osmdroid/views/MapView;->mTileProvider:Lorg/osmdroid/tileprovider/MapTileProviderBase;

    .line 12
    .line 13
    invoke-virtual {p1}, Lorg/osmdroid/tileprovider/MapTileProviderBase;->getTileRequestCompleteHandlers()Ljava/util/Collection;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget-object v0, p0, Lorg/osmdroid/views/MapView;->mTileRequestCompleteHandler:Landroid/os/Handler;

    .line 18
    .line 19
    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lorg/osmdroid/views/MapView;->mTileProvider:Lorg/osmdroid/tileprovider/MapTileProviderBase;

    .line 23
    .line 24
    invoke-virtual {p1}, Lorg/osmdroid/tileprovider/MapTileProviderBase;->getTileSource()Lorg/osmdroid/tileprovider/tilesource/e;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-direct {p0, p1}, Lorg/osmdroid/views/MapView;->updateTileSizeForDensity(Lorg/osmdroid/tileprovider/tilesource/e;)V

    .line 29
    .line 30
    .line 31
    new-instance p1, Lorg/osmdroid/views/overlay/TilesOverlay;

    .line 32
    .line 33
    iget-object v0, p0, Lorg/osmdroid/views/MapView;->mTileProvider:Lorg/osmdroid/tileprovider/MapTileProviderBase;

    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    iget-boolean v2, p0, Lorg/osmdroid/views/MapView;->horizontalMapRepetitionEnabled:Z

    .line 40
    .line 41
    iget-boolean v3, p0, Lorg/osmdroid/views/MapView;->verticalMapRepetitionEnabled:Z

    .line 42
    .line 43
    invoke-direct {p1, v0, v1, v2, v3}, Lorg/osmdroid/views/overlay/TilesOverlay;-><init>(Lorg/osmdroid/tileprovider/MapTileProviderBase;Landroid/content/Context;ZZ)V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, Lorg/osmdroid/views/MapView;->mMapOverlay:Lorg/osmdroid/views/overlay/TilesOverlay;

    .line 47
    .line 48
    iget-object v0, p0, Lorg/osmdroid/views/MapView;->mOverlayManager:Lorg/osmdroid/views/overlay/OverlayManager;

    .line 49
    .line 50
    invoke-interface {v0, p1}, Lorg/osmdroid/views/overlay/OverlayManager;->setTilesOverlay(Lorg/osmdroid/views/overlay/TilesOverlay;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 54
    .line 55
    .line 56
    return-void
    .line 57
    .line 58
.end method

.method public setTileSource(Lorg/osmdroid/tileprovider/tilesource/e;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/MapView;->mTileProvider:Lorg/osmdroid/tileprovider/MapTileProviderBase;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lorg/osmdroid/tileprovider/MapTileProviderBase;->setTileSource(Lorg/osmdroid/tileprovider/tilesource/e;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lorg/osmdroid/views/MapView;->updateTileSizeForDensity(Lorg/osmdroid/tileprovider/tilesource/e;)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Lorg/osmdroid/views/MapView;->checkZoomButtons()V

    .line 10
    .line 11
    .line 12
    iget-wide v0, p0, Lorg/osmdroid/views/MapView;->mZoomLevel:D

    .line 13
    .line 14
    invoke-virtual {p0, v0, v1}, Lorg/osmdroid/views/MapView;->setZoomLevel(D)D

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 18
    .line 19
    .line 20
    return-void
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

.method public setTilesScaleFactor(F)V
    .locals 0

    .line 1
    iput p1, p0, Lorg/osmdroid/views/MapView;->mTilesScaleFactor:F

    .line 2
    .line 3
    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->getTileProvider()Lorg/osmdroid/tileprovider/MapTileProviderBase;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Lorg/osmdroid/tileprovider/MapTileProviderBase;->getTileSource()Lorg/osmdroid/tileprovider/tilesource/e;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-direct {p0, p1}, Lorg/osmdroid/views/MapView;->updateTileSizeForDensity(Lorg/osmdroid/tileprovider/tilesource/e;)V

    .line 12
    .line 13
    .line 14
    return-void
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

.method public setTilesScaledToDpi(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/osmdroid/views/MapView;->mTilesScaledToDpi:Z

    .line 2
    .line 3
    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->getTileProvider()Lorg/osmdroid/tileprovider/MapTileProviderBase;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Lorg/osmdroid/tileprovider/MapTileProviderBase;->getTileSource()Lorg/osmdroid/tileprovider/tilesource/e;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-direct {p0, p1}, Lorg/osmdroid/views/MapView;->updateTileSizeForDensity(Lorg/osmdroid/tileprovider/tilesource/e;)V

    .line 12
    .line 13
    .line 14
    return-void
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
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/MapView;->mMapOverlay:Lorg/osmdroid/views/overlay/TilesOverlay;

    invoke-virtual {v0, p1}, Lorg/osmdroid/views/overlay/TilesOverlay;->setUseDataConnection(Z)V

    return-void
.end method

.method public setVerticalMapRepetitionEnabled(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Lorg/osmdroid/views/MapView;->verticalMapRepetitionEnabled:Z

    .line 2
    .line 3
    iget-object v0, p0, Lorg/osmdroid/views/MapView;->mMapOverlay:Lorg/osmdroid/views/overlay/TilesOverlay;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lorg/osmdroid/views/overlay/TilesOverlay;->setVerticalWrapEnabled(Z)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lorg/osmdroid/views/MapView;->resetProjection()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 12
    .line 13
    .line 14
    return-void
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

.method public setZoomLevel(D)D
    .locals 11

    .line 1
    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->getMinZoomLevel()D

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->getMaxZoomLevel()D

    .line 6
    .line 7
    .line 8
    move-result-wide v2

    .line 9
    invoke-static {v2, v3, p1, p2}, Ljava/lang/Math;->min(DD)D

    .line 10
    .line 11
    .line 12
    move-result-wide p1

    .line 13
    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->max(DD)D

    .line 14
    .line 15
    .line 16
    move-result-wide p1

    .line 17
    iget-wide v6, p0, Lorg/osmdroid/views/MapView;->mZoomLevel:D

    .line 18
    .line 19
    cmpl-double v0, p1, v6

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    const/4 v2, 0x0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    iget-object v3, p0, Lorg/osmdroid/views/MapView;->mScroller:Landroid/widget/Scroller;

    .line 26
    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    invoke-virtual {v3, v1}, Landroid/widget/Scroller;->forceFinished(Z)V

    .line 30
    .line 31
    .line 32
    :cond_0
    iput-boolean v2, p0, Lorg/osmdroid/views/MapView;->mIsFlinging:Z

    .line 33
    .line 34
    :cond_1
    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->getProjection()Lorg/osmdroid/views/Projection;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-virtual {v3}, Lorg/osmdroid/views/Projection;->getCurrentCenter()Lorg/osmdroid/util/GeoPoint;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    iput-wide p1, p0, Lorg/osmdroid/views/MapView;->mZoomLevel:D

    .line 43
    .line 44
    invoke-virtual {p0, v3}, Lorg/osmdroid/views/MapView;->setExpectedCenter(Lorg/osmdroid/api/IGeoPoint;)V

    .line 45
    .line 46
    .line 47
    invoke-direct {p0}, Lorg/osmdroid/views/MapView;->checkZoomButtons()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->isLayoutOccurred()Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    const/4 v9, 0x0

    .line 55
    if-eqz v4, :cond_3

    .line 56
    .line 57
    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->getController()Lorg/osmdroid/api/IMapController;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    invoke-interface {v4, v3}, Lorg/osmdroid/api/IMapController;->setCenter(Lorg/osmdroid/api/IGeoPoint;)V

    .line 62
    .line 63
    .line 64
    new-instance v3, Landroid/graphics/Point;

    .line 65
    .line 66
    invoke-direct {v3}, Landroid/graphics/Point;-><init>()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->getProjection()Lorg/osmdroid/views/Projection;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->getOverlayManager()Lorg/osmdroid/views/overlay/OverlayManager;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    iget-object v8, p0, Lorg/osmdroid/views/MapView;->mMultiTouchScaleInitPoint:Landroid/graphics/PointF;

    .line 78
    .line 79
    iget v10, v8, Landroid/graphics/PointF;->x:F

    .line 80
    .line 81
    float-to-int v10, v10

    .line 82
    iget v8, v8, Landroid/graphics/PointF;->y:F

    .line 83
    .line 84
    float-to-int v8, v8

    .line 85
    invoke-interface {v5, v10, v8, v3, p0}, Lorg/osmdroid/views/overlay/OverlayManager;->onSnapToItem(IILandroid/graphics/Point;Lorg/osmdroid/api/IMapView;)Z

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    if-eqz v5, :cond_2

    .line 90
    .line 91
    iget v5, v3, Landroid/graphics/Point;->x:I

    .line 92
    .line 93
    iget v3, v3, Landroid/graphics/Point;->y:I

    .line 94
    .line 95
    invoke-virtual {v4, v5, v3, v9, v2}, Lorg/osmdroid/views/Projection;->fromPixels(IILorg/osmdroid/util/GeoPoint;Z)Lorg/osmdroid/api/IGeoPoint;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->getController()Lorg/osmdroid/api/IMapController;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    invoke-interface {v3, v2}, Lorg/osmdroid/api/IMapController;->animateTo(Lorg/osmdroid/api/IGeoPoint;)V

    .line 104
    .line 105
    .line 106
    :cond_2
    iget-object v2, p0, Lorg/osmdroid/views/MapView;->mTileProvider:Lorg/osmdroid/tileprovider/MapTileProviderBase;

    .line 107
    .line 108
    iget-object v3, p0, Lorg/osmdroid/views/MapView;->mRescaleScreenRect:Landroid/graphics/Rect;

    .line 109
    .line 110
    invoke-virtual {p0, v3}, Lorg/osmdroid/views/MapView;->getScreenRect(Landroid/graphics/Rect;)Landroid/graphics/Rect;

    .line 111
    .line 112
    .line 113
    move-result-object v8

    .line 114
    move-object v3, v4

    .line 115
    move-wide v4, p1

    .line 116
    invoke-virtual/range {v2 .. v8}, Lorg/osmdroid/tileprovider/MapTileProviderBase;->rescaleCache(Lorg/osmdroid/views/Projection;DDLandroid/graphics/Rect;)V

    .line 117
    .line 118
    .line 119
    iput-boolean v1, p0, Lorg/osmdroid/views/MapView;->pauseFling:Z

    .line 120
    .line 121
    :cond_3
    if-eqz v0, :cond_5

    .line 122
    .line 123
    iget-object v0, p0, Lorg/osmdroid/views/MapView;->mListners:Ljava/util/List;

    .line 124
    .line 125
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    if-eqz v1, :cond_5

    .line 134
    .line 135
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    check-cast v1, Lorg/osmdroid/events/MapListener;

    .line 140
    .line 141
    if-eqz v9, :cond_4

    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_4
    new-instance v2, Lorg/osmdroid/events/ZoomEvent;

    .line 145
    .line 146
    invoke-direct {v2, p0, p1, p2}, Lorg/osmdroid/events/ZoomEvent;-><init>(Lorg/osmdroid/views/MapView;D)V

    .line 147
    .line 148
    .line 149
    move-object v9, v2

    .line 150
    :goto_1
    invoke-interface {v1, v9}, Lorg/osmdroid/events/MapListener;->onZoom(Lorg/osmdroid/events/ZoomEvent;)Z

    .line 151
    .line 152
    .line 153
    goto :goto_0

    .line 154
    :cond_5
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 155
    .line 156
    .line 157
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 158
    .line 159
    .line 160
    iget-wide p1, p0, Lorg/osmdroid/views/MapView;->mZoomLevel:D

    .line 161
    .line 162
    return-wide p1
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

.method public setZoomRounding(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/osmdroid/views/MapView;->mZoomRounding:Z

    return-void
.end method

.method protected startAnimation()V
    .locals 2

    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->getZoomLevelDouble()D

    move-result-wide v0

    iput-wide v0, p0, Lorg/osmdroid/views/MapView;->mStartAnimationZoom:D

    return-void
.end method

.method public useDataConnection()Z
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/MapView;->mMapOverlay:Lorg/osmdroid/views/overlay/TilesOverlay;

    invoke-virtual {v0}, Lorg/osmdroid/views/overlay/TilesOverlay;->useDataConnection()Z

    move-result v0

    return v0
.end method

.method zoomIn()Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->getController()Lorg/osmdroid/api/IMapController;

    move-result-object v0

    invoke-interface {v0}, Lorg/osmdroid/api/IMapController;->zoomIn()Z

    move-result v0

    return v0
.end method

.method zoomInFixing(II)Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 3
    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->getController()Lorg/osmdroid/api/IMapController;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lorg/osmdroid/api/IMapController;->zoomInFixing(II)Z

    move-result p1

    return p1
.end method

.method zoomInFixing(Lorg/osmdroid/api/IGeoPoint;)Z
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->getProjection()Lorg/osmdroid/views/Projection;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lorg/osmdroid/views/Projection;->toPixels(Lorg/osmdroid/api/IGeoPoint;Landroid/graphics/Point;)Landroid/graphics/Point;

    move-result-object p1

    .line 2
    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->getController()Lorg/osmdroid/api/IMapController;

    move-result-object v0

    iget v1, p1, Landroid/graphics/Point;->x:I

    iget p1, p1, Landroid/graphics/Point;->y:I

    invoke-interface {v0, v1, p1}, Lorg/osmdroid/api/IMapController;->zoomInFixing(II)Z

    move-result p1

    return p1
.end method

.method zoomOut()Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->getController()Lorg/osmdroid/api/IMapController;

    move-result-object v0

    invoke-interface {v0}, Lorg/osmdroid/api/IMapController;->zoomOut()Z

    move-result v0

    return v0
.end method

.method zoomOutFixing(II)Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 3
    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->getController()Lorg/osmdroid/api/IMapController;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lorg/osmdroid/api/IMapController;->zoomOutFixing(II)Z

    move-result p1

    return p1
.end method

.method zoomOutFixing(Lorg/osmdroid/api/IGeoPoint;)Z
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->getProjection()Lorg/osmdroid/views/Projection;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lorg/osmdroid/views/Projection;->toPixels(Lorg/osmdroid/api/IGeoPoint;Landroid/graphics/Point;)Landroid/graphics/Point;

    move-result-object p1

    .line 2
    iget v0, p1, Landroid/graphics/Point;->x:I

    iget p1, p1, Landroid/graphics/Point;->y:I

    invoke-virtual {p0, v0, p1}, Lorg/osmdroid/views/MapView;->zoomOutFixing(II)Z

    move-result p1

    return p1
.end method

.method public zoomToBoundingBox(Lorg/osmdroid/util/BoundingBox;ZIDLjava/lang/Long;)D
    .locals 16

    .line 2
    sget-object v0, Lorg/osmdroid/views/MapView;->mTileSystem:Lorg/osmdroid/util/TileSystem;

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v1

    mul-int/lit8 v2, p3, 0x2

    sub-int/2addr v1, v2

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v3

    sub-int/2addr v3, v2

    move-object/from16 v2, p1

    invoke-virtual {v0, v2, v1, v3}, Lorg/osmdroid/util/TileSystem;->getBoundingBoxZoom(Lorg/osmdroid/util/BoundingBox;II)D

    move-result-wide v0

    const-wide/16 v3, 0x1

    cmpl-double v3, v0, v3

    if-eqz v3, :cond_0

    cmpl-double v3, v0, p4

    if-lez v3, :cond_1

    :cond_0
    move-wide/from16 v0, p4

    .line 3
    :cond_1
    invoke-virtual/range {p0 .. p0}, Lorg/osmdroid/views/MapView;->getMaxZoomLevel()D

    move-result-wide v3

    invoke-virtual/range {p0 .. p0}, Lorg/osmdroid/views/MapView;->getMinZoomLevel()D

    move-result-wide v5

    invoke-static {v0, v1, v5, v6}, Ljava/lang/Math;->max(DD)D

    move-result-wide v0

    invoke-static {v3, v4, v0, v1}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    .line 4
    invoke-virtual/range {p1 .. p1}, Lorg/osmdroid/util/BoundingBox;->getCenterWithDateLine()Lorg/osmdroid/util/GeoPoint;

    move-result-object v3

    .line 5
    new-instance v4, Lorg/osmdroid/views/Projection;

    .line 6
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v8

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v9

    .line 7
    invoke-virtual/range {p0 .. p0}, Lorg/osmdroid/views/MapView;->getMapOrientation()F

    move-result v11

    .line 8
    invoke-virtual/range {p0 .. p0}, Lorg/osmdroid/views/MapView;->isHorizontalMapRepetitionEnabled()Z

    move-result v12

    invoke-virtual/range {p0 .. p0}, Lorg/osmdroid/views/MapView;->isVerticalMapRepetitionEnabled()Z

    move-result v13

    .line 9
    invoke-virtual/range {p0 .. p0}, Lorg/osmdroid/views/MapView;->getMapCenterOffsetX()I

    move-result v14

    invoke-virtual/range {p0 .. p0}, Lorg/osmdroid/views/MapView;->getMapCenterOffsetY()I

    move-result v15

    move-object v5, v4

    move-wide v6, v0

    move-object v10, v3

    invoke-direct/range {v5 .. v15}, Lorg/osmdroid/views/Projection;-><init>(DIILorg/osmdroid/util/GeoPoint;FZZII)V

    .line 10
    new-instance v5, Landroid/graphics/Point;

    invoke-direct {v5}, Landroid/graphics/Point;-><init>()V

    .line 11
    invoke-virtual/range {p1 .. p1}, Lorg/osmdroid/util/BoundingBox;->getCenterLongitude()D

    move-result-wide v6

    .line 12
    new-instance v8, Lorg/osmdroid/util/GeoPoint;

    invoke-virtual/range {p1 .. p1}, Lorg/osmdroid/util/BoundingBox;->getActualNorth()D

    move-result-wide v9

    invoke-direct {v8, v9, v10, v6, v7}, Lorg/osmdroid/util/GeoPoint;-><init>(DD)V

    invoke-virtual {v4, v8, v5}, Lorg/osmdroid/views/Projection;->toPixels(Lorg/osmdroid/api/IGeoPoint;Landroid/graphics/Point;)Landroid/graphics/Point;

    .line 13
    iget v8, v5, Landroid/graphics/Point;->y:I

    .line 14
    new-instance v9, Lorg/osmdroid/util/GeoPoint;

    invoke-virtual/range {p1 .. p1}, Lorg/osmdroid/util/BoundingBox;->getActualSouth()D

    move-result-wide v10

    invoke-direct {v9, v10, v11, v6, v7}, Lorg/osmdroid/util/GeoPoint;-><init>(DD)V

    invoke-virtual {v4, v9, v5}, Lorg/osmdroid/views/Projection;->toPixels(Lorg/osmdroid/api/IGeoPoint;Landroid/graphics/Point;)Landroid/graphics/Point;

    .line 15
    iget v2, v5, Landroid/graphics/Point;->y:I

    .line 16
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v5

    sub-int/2addr v5, v2

    sub-int/2addr v5, v8

    div-int/lit8 v5, v5, 0x2

    if-eqz v5, :cond_2

    const-wide/16 v6, 0x0

    int-to-long v8, v5

    .line 17
    invoke-virtual {v4, v6, v7, v8, v9}, Lorg/osmdroid/views/Projection;->adjustOffsets(JJ)V

    .line 18
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v5

    div-int/lit8 v5, v5, 0x2

    invoke-virtual {v4, v2, v5, v3}, Lorg/osmdroid/views/Projection;->fromPixels(IILorg/osmdroid/util/GeoPoint;)Lorg/osmdroid/api/IGeoPoint;

    :cond_2
    if-eqz p2, :cond_3

    .line 19
    invoke-virtual/range {p0 .. p0}, Lorg/osmdroid/views/MapView;->getController()Lorg/osmdroid/api/IMapController;

    move-result-object v2

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    move-object/from16 v5, p6

    invoke-interface {v2, v3, v4, v5}, Lorg/osmdroid/api/IMapController;->animateTo(Lorg/osmdroid/api/IGeoPoint;Ljava/lang/Double;Ljava/lang/Long;)V

    goto :goto_0

    .line 20
    :cond_3
    invoke-virtual/range {p0 .. p0}, Lorg/osmdroid/views/MapView;->getController()Lorg/osmdroid/api/IMapController;

    move-result-object v2

    invoke-interface {v2, v0, v1}, Lorg/osmdroid/api/IMapController;->setZoom(D)D

    .line 21
    invoke-virtual/range {p0 .. p0}, Lorg/osmdroid/views/MapView;->getController()Lorg/osmdroid/api/IMapController;

    move-result-object v2

    invoke-interface {v2, v3}, Lorg/osmdroid/api/IMapController;->setCenter(Lorg/osmdroid/api/IGeoPoint;)V

    :goto_0
    return-wide v0
.end method

.method public zoomToBoundingBox(Lorg/osmdroid/util/BoundingBox;Z)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, p2, v0}, Lorg/osmdroid/views/MapView;->zoomToBoundingBox(Lorg/osmdroid/util/BoundingBox;ZI)V

    return-void
.end method

.method public zoomToBoundingBox(Lorg/osmdroid/util/BoundingBox;ZI)V
    .locals 7

    .line 22
    invoke-virtual {p0}, Lorg/osmdroid/views/MapView;->getMaxZoomLevel()D

    move-result-wide v4

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    invoke-virtual/range {v0 .. v6}, Lorg/osmdroid/views/MapView;->zoomToBoundingBox(Lorg/osmdroid/util/BoundingBox;ZIDLjava/lang/Long;)D

    return-void
.end method
