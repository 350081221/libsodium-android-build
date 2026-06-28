.class Lorg/osmdroid/views/overlay/ItemizedIconOverlay$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/osmdroid/views/overlay/ItemizedIconOverlay$ActiveItem;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/osmdroid/views/overlay/ItemizedIconOverlay;->onLongPress(Landroid/view/MotionEvent;Lorg/osmdroid/views/MapView;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/osmdroid/views/overlay/ItemizedIconOverlay;


# direct methods
.method constructor <init>(Lorg/osmdroid/views/overlay/ItemizedIconOverlay;)V
    .locals 0

    iput-object p1, p0, Lorg/osmdroid/views/overlay/ItemizedIconOverlay$2;->this$0:Lorg/osmdroid/views/overlay/ItemizedIconOverlay;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run(I)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/overlay/ItemizedIconOverlay$2;->this$0:Lorg/osmdroid/views/overlay/ItemizedIconOverlay;

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
    invoke-virtual {v0, p1}, Lorg/osmdroid/views/overlay/ItemizedOverlay;->getItem(I)Lorg/osmdroid/views/overlay/OverlayItem;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0, p1, v1}, Lorg/osmdroid/views/overlay/ItemizedIconOverlay;->onLongPressHelper(ILorg/osmdroid/views/overlay/OverlayItem;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
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
