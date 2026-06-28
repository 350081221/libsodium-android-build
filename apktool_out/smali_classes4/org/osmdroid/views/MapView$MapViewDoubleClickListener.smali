.class Lorg/osmdroid/views/MapView$MapViewDoubleClickListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/GestureDetector$OnDoubleTapListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/osmdroid/views/MapView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "MapViewDoubleClickListener"
.end annotation


# instance fields
.field final synthetic this$0:Lorg/osmdroid/views/MapView;


# direct methods
.method private constructor <init>(Lorg/osmdroid/views/MapView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/osmdroid/views/MapView$MapViewDoubleClickListener;->this$0:Lorg/osmdroid/views/MapView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lorg/osmdroid/views/MapView;Lorg/osmdroid/views/MapView$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lorg/osmdroid/views/MapView$MapViewDoubleClickListener;-><init>(Lorg/osmdroid/views/MapView;)V

    return-void
.end method


# virtual methods
.method public onDoubleTap(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/MapView$MapViewDoubleClickListener;->this$0:Lorg/osmdroid/views/MapView;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/osmdroid/views/MapView;->getOverlayManager()Lorg/osmdroid/views/overlay/OverlayManager;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lorg/osmdroid/views/MapView$MapViewDoubleClickListener;->this$0:Lorg/osmdroid/views/MapView;

    .line 8
    .line 9
    invoke-interface {v0, p1, v1}, Lorg/osmdroid/views/overlay/OverlayManager;->onDoubleTap(Landroid/view/MotionEvent;Lorg/osmdroid/views/MapView;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    return p1

    .line 17
    :cond_0
    iget-object v0, p0, Lorg/osmdroid/views/MapView$MapViewDoubleClickListener;->this$0:Lorg/osmdroid/views/MapView;

    .line 18
    .line 19
    invoke-virtual {v0}, Lorg/osmdroid/views/MapView;->getProjection()Lorg/osmdroid/views/Projection;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    float-to-int v1, v1

    .line 28
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    float-to-int p1, p1

    .line 33
    iget-object v2, p0, Lorg/osmdroid/views/MapView$MapViewDoubleClickListener;->this$0:Lorg/osmdroid/views/MapView;

    .line 34
    .line 35
    iget-object v2, v2, Lorg/osmdroid/views/MapView;->mRotateScalePoint:Landroid/graphics/Point;

    .line 36
    .line 37
    invoke-virtual {v0, v1, p1, v2}, Lorg/osmdroid/views/Projection;->rotateAndScalePoint(IILandroid/graphics/Point;)Landroid/graphics/Point;

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lorg/osmdroid/views/MapView$MapViewDoubleClickListener;->this$0:Lorg/osmdroid/views/MapView;

    .line 41
    .line 42
    invoke-virtual {p1}, Lorg/osmdroid/views/MapView;->getController()Lorg/osmdroid/api/IMapController;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iget-object v0, p0, Lorg/osmdroid/views/MapView$MapViewDoubleClickListener;->this$0:Lorg/osmdroid/views/MapView;

    .line 47
    .line 48
    iget-object v0, v0, Lorg/osmdroid/views/MapView;->mRotateScalePoint:Landroid/graphics/Point;

    .line 49
    .line 50
    iget v1, v0, Landroid/graphics/Point;->x:I

    .line 51
    .line 52
    iget v0, v0, Landroid/graphics/Point;->y:I

    .line 53
    .line 54
    invoke-interface {p1, v1, v0}, Lorg/osmdroid/api/IMapController;->zoomInFixing(II)Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    return p1
.end method

.method public onDoubleTapEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    iget-object v0, p0, Lorg/osmdroid/views/MapView$MapViewDoubleClickListener;->this$0:Lorg/osmdroid/views/MapView;

    invoke-virtual {v0}, Lorg/osmdroid/views/MapView;->getOverlayManager()Lorg/osmdroid/views/overlay/OverlayManager;

    move-result-object v0

    iget-object v1, p0, Lorg/osmdroid/views/MapView$MapViewDoubleClickListener;->this$0:Lorg/osmdroid/views/MapView;

    invoke-interface {v0, p1, v1}, Lorg/osmdroid/views/overlay/OverlayManager;->onDoubleTapEvent(Landroid/view/MotionEvent;Lorg/osmdroid/views/MapView;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public onSingleTapConfirmed(Landroid/view/MotionEvent;)Z
    .locals 2

    iget-object v0, p0, Lorg/osmdroid/views/MapView$MapViewDoubleClickListener;->this$0:Lorg/osmdroid/views/MapView;

    invoke-virtual {v0}, Lorg/osmdroid/views/MapView;->getOverlayManager()Lorg/osmdroid/views/overlay/OverlayManager;

    move-result-object v0

    iget-object v1, p0, Lorg/osmdroid/views/MapView$MapViewDoubleClickListener;->this$0:Lorg/osmdroid/views/MapView;

    invoke-interface {v0, p1, v1}, Lorg/osmdroid/views/overlay/OverlayManager;->onSingleTapConfirmed(Landroid/view/MotionEvent;Lorg/osmdroid/views/MapView;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
