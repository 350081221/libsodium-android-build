.class Lorg/osmdroid/views/overlay/ItemizedIconOverlay$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/osmdroid/views/overlay/ItemizedIconOverlay$ActiveItem;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/osmdroid/views/overlay/ItemizedIconOverlay;->onSingleTapConfirmed(Landroid/view/MotionEvent;Lorg/osmdroid/views/MapView;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/osmdroid/views/overlay/ItemizedIconOverlay;

.field final synthetic val$mapView:Lorg/osmdroid/views/MapView;


# direct methods
.method constructor <init>(Lorg/osmdroid/views/overlay/ItemizedIconOverlay;Lorg/osmdroid/views/MapView;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lorg/osmdroid/views/overlay/ItemizedIconOverlay$1;->this$0:Lorg/osmdroid/views/overlay/ItemizedIconOverlay;

    iput-object p2, p0, Lorg/osmdroid/views/overlay/ItemizedIconOverlay$1;->val$mapView:Lorg/osmdroid/views/MapView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run(I)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/overlay/ItemizedIconOverlay$1;->this$0:Lorg/osmdroid/views/overlay/ItemizedIconOverlay;

    .line 2
    .line 3
    iget-object v1, v0, Lorg/osmdroid/views/overlay/ItemizedIconOverlay;->mOnItemGestureListener:Lorg/osmdroid/views/overlay/ItemizedIconOverlay$OnItemGestureListener;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    :cond_0
    iget-object v1, v0, Lorg/osmdroid/views/overlay/ItemizedIconOverlay;->mItemList:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Lorg/osmdroid/views/overlay/OverlayItem;

    .line 16
    .line 17
    iget-object v2, p0, Lorg/osmdroid/views/overlay/ItemizedIconOverlay$1;->val$mapView:Lorg/osmdroid/views/MapView;

    .line 18
    .line 19
    invoke-virtual {v0, p1, v1, v2}, Lorg/osmdroid/views/overlay/ItemizedIconOverlay;->onSingleTapUpHelper(ILorg/osmdroid/views/overlay/OverlayItem;Lorg/osmdroid/views/MapView;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    return p1
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
