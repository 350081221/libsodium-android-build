.class public Lorg/osmdroid/views/overlay/mylocation/e;
.super Lorg/osmdroid/views/overlay/Overlay;
.source "SourceFile"

# interfaces
.implements Lorg/osmdroid/views/overlay/mylocation/c;
.implements Lorg/osmdroid/views/overlay/IOverlayMenuProvider;
.implements Lorg/osmdroid/views/overlay/Overlay$Snappable;


# static fields
.field public static final x:I


# instance fields
.field protected a:Landroid/graphics/Paint;

.field protected b:Landroid/graphics/Paint;

.field protected c:Landroid/graphics/Bitmap;

.field protected d:Landroid/graphics/Bitmap;

.field protected e:Lorg/osmdroid/views/MapView;

.field private f:Lorg/osmdroid/api/IMapController;

.field public g:Lorg/osmdroid/views/overlay/mylocation/d;

.field private final h:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field private final i:Landroid/graphics/Point;

.field private final j:Landroid/graphics/Point;

.field private k:Landroid/os/Handler;

.field private l:Ljava/lang/Object;

.field protected m:Z

.field private n:Landroid/location/Location;

.field private final o:Lorg/osmdroid/util/GeoPoint;

.field private p:Z

.field protected q:Z

.field protected r:Z

.field protected final s:Landroid/graphics/PointF;

.field protected t:F

.field protected u:F

.field private v:Z

.field private w:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lorg/osmdroid/views/overlay/Overlay;->getSafeMenuId()I

    move-result v0

    sput v0, Lorg/osmdroid/views/overlay/mylocation/e;->x:I

    return-void
.end method

.method public constructor <init>(Lorg/osmdroid/views/MapView;)V
    .locals 2

    .line 1
    new-instance v0, Lorg/osmdroid/views/overlay/mylocation/b;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/osmdroid/views/overlay/mylocation/b;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, v0, p1}, Lorg/osmdroid/views/overlay/mylocation/e;-><init>(Lorg/osmdroid/views/overlay/mylocation/d;Lorg/osmdroid/views/MapView;)V

    return-void
.end method

.method public constructor <init>(Lorg/osmdroid/views/overlay/mylocation/d;Lorg/osmdroid/views/MapView;)V
    .locals 5

    .line 2
    invoke-direct {p0}, Lorg/osmdroid/views/overlay/Overlay;-><init>()V

    .line 3
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lorg/osmdroid/views/overlay/mylocation/e;->a:Landroid/graphics/Paint;

    .line 4
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lorg/osmdroid/views/overlay/mylocation/e;->b:Landroid/graphics/Paint;

    .line 5
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lorg/osmdroid/views/overlay/mylocation/e;->h:Ljava/util/LinkedList;

    .line 6
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    iput-object v0, p0, Lorg/osmdroid/views/overlay/mylocation/e;->i:Landroid/graphics/Point;

    .line 7
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    iput-object v0, p0, Lorg/osmdroid/views/overlay/mylocation/e;->j:Landroid/graphics/Point;

    .line 8
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lorg/osmdroid/views/overlay/mylocation/e;->l:Ljava/lang/Object;

    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Lorg/osmdroid/views/overlay/mylocation/e;->m:Z

    .line 10
    new-instance v1, Lorg/osmdroid/util/GeoPoint;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v2}, Lorg/osmdroid/util/GeoPoint;-><init>(II)V

    iput-object v1, p0, Lorg/osmdroid/views/overlay/mylocation/e;->o:Lorg/osmdroid/util/GeoPoint;

    .line 11
    iput-boolean v2, p0, Lorg/osmdroid/views/overlay/mylocation/e;->p:Z

    .line 12
    iput-boolean v2, p0, Lorg/osmdroid/views/overlay/mylocation/e;->q:Z

    .line 13
    iput-boolean v0, p0, Lorg/osmdroid/views/overlay/mylocation/e;->r:Z

    .line 14
    iput-boolean v0, p0, Lorg/osmdroid/views/overlay/mylocation/e;->v:Z

    .line 15
    iput-boolean v2, p0, Lorg/osmdroid/views/overlay/mylocation/e;->w:Z

    .line 16
    iput-object p2, p0, Lorg/osmdroid/views/overlay/mylocation/e;->e:Lorg/osmdroid/views/MapView;

    .line 17
    invoke-virtual {p2}, Lorg/osmdroid/views/MapView;->getController()Lorg/osmdroid/api/IMapController;

    move-result-object v1

    iput-object v1, p0, Lorg/osmdroid/views/overlay/mylocation/e;->f:Lorg/osmdroid/api/IMapController;

    .line 18
    iget-object v1, p0, Lorg/osmdroid/views/overlay/mylocation/e;->b:Landroid/graphics/Paint;

    const/16 v3, 0x64

    const/16 v4, 0xff

    invoke-virtual {v1, v2, v3, v3, v4}, Landroid/graphics/Paint;->setARGB(IIII)V

    .line 19
    iget-object v1, p0, Lorg/osmdroid/views/overlay/mylocation/e;->b:Landroid/graphics/Paint;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 20
    iget-object v1, p0, Lorg/osmdroid/views/overlay/mylocation/e;->a:Landroid/graphics/Paint;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 21
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lorg/osmdroid/library/R$drawable;->r:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/osmdroid/views/overlay/mylocation/e;->A(Landroid/graphics/Bitmap;)V

    .line 22
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    sget v0, Lorg/osmdroid/library/R$drawable;->t:I

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    check-cast p2, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p2}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object p2

    invoke-virtual {p0, p2}, Lorg/osmdroid/views/overlay/mylocation/e;->t(Landroid/graphics/Bitmap;)V

    .line 23
    new-instance p2, Landroid/graphics/PointF;

    invoke-direct {p2}, Landroid/graphics/PointF;-><init>()V

    iput-object p2, p0, Lorg/osmdroid/views/overlay/mylocation/e;->s:Landroid/graphics/PointF;

    const/high16 p2, 0x3f500000    # 0.8125f

    const/high16 v0, 0x3f000000    # 0.5f

    .line 24
    invoke-virtual {p0, v0, p2}, Lorg/osmdroid/views/overlay/mylocation/e;->y(FF)V

    .line 25
    invoke-virtual {p0, v0, v0}, Lorg/osmdroid/views/overlay/mylocation/e;->r(FF)V

    .line 26
    new-instance p2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p2, p0, Lorg/osmdroid/views/overlay/mylocation/e;->k:Landroid/os/Handler;

    .line 27
    invoke-virtual {p0, p1}, Lorg/osmdroid/views/overlay/mylocation/e;->x(Lorg/osmdroid/views/overlay/mylocation/d;)V

    return-void
.end method

.method static synthetic c(Lorg/osmdroid/views/overlay/mylocation/e;)Ljava/util/LinkedList;
    .locals 0

    iget-object p0, p0, Lorg/osmdroid/views/overlay/mylocation/e;->h:Ljava/util/LinkedList;

    return-object p0
.end method


# virtual methods
.method public A(Landroid/graphics/Bitmap;)V
    .locals 0

    iput-object p1, p0, Lorg/osmdroid/views/overlay/mylocation/e;->c:Landroid/graphics/Bitmap;

    return-void
.end method

.method protected B()V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/overlay/mylocation/e;->g:Lorg/osmdroid/views/overlay/mylocation/d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lorg/osmdroid/views/overlay/mylocation/d;->b()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lorg/osmdroid/views/overlay/mylocation/e;->k:Landroid/os/Handler;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v1, p0, Lorg/osmdroid/views/overlay/mylocation/e;->l:Ljava/lang/Object;

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    :cond_1
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

.method public b(Landroid/location/Location;Lorg/osmdroid/views/overlay/mylocation/d;)V
    .locals 3

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p2, p0, Lorg/osmdroid/views/overlay/mylocation/e;->k:Landroid/os/Handler;

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    new-instance v0, Lorg/osmdroid/views/overlay/mylocation/e$a;

    .line 8
    .line 9
    invoke-direct {v0, p0, p1}, Lorg/osmdroid/views/overlay/mylocation/e$a;-><init>(Lorg/osmdroid/views/overlay/mylocation/e;Landroid/location/Location;)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lorg/osmdroid/views/overlay/mylocation/e;->l:Ljava/lang/Object;

    .line 13
    .line 14
    const-wide/16 v1, 0x0

    .line 15
    .line 16
    invoke-virtual {p2, v0, p1, v1, v2}, Landroid/os/Handler;->postAtTime(Ljava/lang/Runnable;Ljava/lang/Object;J)Z

    .line 17
    .line 18
    .line 19
    :cond_0
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

.method public d()V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/overlay/mylocation/e;->f:Lorg/osmdroid/api/IMapController;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0, v1}, Lorg/osmdroid/api/IMapController;->stopAnimation(Z)V

    .line 7
    .line 8
    .line 9
    :cond_0
    iput-boolean v1, p0, Lorg/osmdroid/views/overlay/mylocation/e;->q:Z

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

.method public draw(Landroid/graphics/Canvas;Lorg/osmdroid/views/Projection;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/overlay/mylocation/e;->n:Landroid/location/Location;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lorg/osmdroid/views/overlay/mylocation/e;->p()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lorg/osmdroid/views/overlay/mylocation/e;->n:Landroid/location/Location;

    .line 12
    .line 13
    invoke-virtual {p0, p1, p2, v0}, Lorg/osmdroid/views/overlay/mylocation/e;->f(Landroid/graphics/Canvas;Lorg/osmdroid/views/Projection;Landroid/location/Location;)V

    .line 14
    .line 15
    .line 16
    :cond_0
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

.method public e()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lorg/osmdroid/views/overlay/mylocation/e;->p:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Lorg/osmdroid/views/overlay/mylocation/e;->B()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lorg/osmdroid/views/overlay/mylocation/e;->e:Lorg/osmdroid/views/MapView;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/view/View;->postInvalidate()V

    .line 12
    .line 13
    .line 14
    :cond_0
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
.end method

.method protected f(Landroid/graphics/Canvas;Lorg/osmdroid/views/Projection;Landroid/location/Location;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/overlay/mylocation/e;->o:Lorg/osmdroid/util/GeoPoint;

    .line 2
    .line 3
    iget-object v1, p0, Lorg/osmdroid/views/overlay/mylocation/e;->i:Landroid/graphics/Point;

    .line 4
    .line 5
    invoke-virtual {p2, v0, v1}, Lorg/osmdroid/views/Projection;->toPixels(Lorg/osmdroid/api/IGeoPoint;Landroid/graphics/Point;)Landroid/graphics/Point;

    .line 6
    .line 7
    .line 8
    iget-boolean v0, p0, Lorg/osmdroid/views/overlay/mylocation/e;->r:Z

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p3}, Landroid/location/Location;->getAccuracy()F

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-virtual {p3}, Landroid/location/Location;->getLatitude()D

    .line 17
    .line 18
    .line 19
    move-result-wide v1

    .line 20
    invoke-virtual {p2}, Lorg/osmdroid/views/Projection;->getZoomLevel()D

    .line 21
    .line 22
    .line 23
    move-result-wide v3

    .line 24
    invoke-static {v1, v2, v3, v4}, Lorg/osmdroid/util/TileSystem;->GroundResolution(DD)D

    .line 25
    .line 26
    .line 27
    move-result-wide v1

    .line 28
    double-to-float p2, v1

    .line 29
    div-float/2addr v0, p2

    .line 30
    iget-object p2, p0, Lorg/osmdroid/views/overlay/mylocation/e;->b:Landroid/graphics/Paint;

    .line 31
    .line 32
    const/16 v1, 0x32

    .line 33
    .line 34
    invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 35
    .line 36
    .line 37
    iget-object p2, p0, Lorg/osmdroid/views/overlay/mylocation/e;->b:Landroid/graphics/Paint;

    .line 38
    .line 39
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 40
    .line 41
    invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 42
    .line 43
    .line 44
    iget-object p2, p0, Lorg/osmdroid/views/overlay/mylocation/e;->i:Landroid/graphics/Point;

    .line 45
    .line 46
    iget v1, p2, Landroid/graphics/Point;->x:I

    .line 47
    .line 48
    int-to-float v1, v1

    .line 49
    iget p2, p2, Landroid/graphics/Point;->y:I

    .line 50
    .line 51
    int-to-float p2, p2

    .line 52
    iget-object v2, p0, Lorg/osmdroid/views/overlay/mylocation/e;->b:Landroid/graphics/Paint;

    .line 53
    .line 54
    invoke-virtual {p1, v1, p2, v0, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 55
    .line 56
    .line 57
    iget-object p2, p0, Lorg/osmdroid/views/overlay/mylocation/e;->b:Landroid/graphics/Paint;

    .line 58
    .line 59
    const/16 v1, 0x96

    .line 60
    .line 61
    invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 62
    .line 63
    .line 64
    iget-object p2, p0, Lorg/osmdroid/views/overlay/mylocation/e;->b:Landroid/graphics/Paint;

    .line 65
    .line 66
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 67
    .line 68
    invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 69
    .line 70
    .line 71
    iget-object p2, p0, Lorg/osmdroid/views/overlay/mylocation/e;->i:Landroid/graphics/Point;

    .line 72
    .line 73
    iget v1, p2, Landroid/graphics/Point;->x:I

    .line 74
    .line 75
    int-to-float v1, v1

    .line 76
    iget p2, p2, Landroid/graphics/Point;->y:I

    .line 77
    .line 78
    int-to-float p2, p2

    .line 79
    iget-object v2, p0, Lorg/osmdroid/views/overlay/mylocation/e;->b:Landroid/graphics/Paint;

    .line 80
    .line 81
    invoke-virtual {p1, v1, p2, v0, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 82
    .line 83
    .line 84
    :cond_0
    invoke-virtual {p3}, Landroid/location/Location;->hasBearing()Z

    .line 85
    .line 86
    .line 87
    move-result p2

    .line 88
    if-eqz p2, :cond_2

    .line 89
    .line 90
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 91
    .line 92
    .line 93
    invoke-virtual {p3}, Landroid/location/Location;->getBearing()F

    .line 94
    .line 95
    .line 96
    move-result p2

    .line 97
    const/high16 p3, 0x43b40000    # 360.0f

    .line 98
    .line 99
    cmpl-float v0, p2, p3

    .line 100
    .line 101
    if-ltz v0, :cond_1

    .line 102
    .line 103
    sub-float/2addr p2, p3

    .line 104
    :cond_1
    iget-object p3, p0, Lorg/osmdroid/views/overlay/mylocation/e;->i:Landroid/graphics/Point;

    .line 105
    .line 106
    iget v0, p3, Landroid/graphics/Point;->x:I

    .line 107
    .line 108
    int-to-float v0, v0

    .line 109
    iget p3, p3, Landroid/graphics/Point;->y:I

    .line 110
    .line 111
    int-to-float p3, p3

    .line 112
    invoke-virtual {p1, p2, v0, p3}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 113
    .line 114
    .line 115
    iget-object p2, p0, Lorg/osmdroid/views/overlay/mylocation/e;->d:Landroid/graphics/Bitmap;

    .line 116
    .line 117
    iget-object p3, p0, Lorg/osmdroid/views/overlay/mylocation/e;->i:Landroid/graphics/Point;

    .line 118
    .line 119
    iget v0, p3, Landroid/graphics/Point;->x:I

    .line 120
    .line 121
    int-to-float v0, v0

    .line 122
    iget v1, p0, Lorg/osmdroid/views/overlay/mylocation/e;->t:F

    .line 123
    .line 124
    sub-float/2addr v0, v1

    .line 125
    iget p3, p3, Landroid/graphics/Point;->y:I

    .line 126
    .line 127
    int-to-float p3, p3

    .line 128
    iget v1, p0, Lorg/osmdroid/views/overlay/mylocation/e;->u:F

    .line 129
    .line 130
    sub-float/2addr p3, v1

    .line 131
    iget-object v1, p0, Lorg/osmdroid/views/overlay/mylocation/e;->a:Landroid/graphics/Paint;

    .line 132
    .line 133
    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 137
    .line 138
    .line 139
    goto :goto_0

    .line 140
    :cond_2
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 141
    .line 142
    .line 143
    iget-object p2, p0, Lorg/osmdroid/views/overlay/mylocation/e;->e:Lorg/osmdroid/views/MapView;

    .line 144
    .line 145
    invoke-virtual {p2}, Lorg/osmdroid/views/MapView;->getMapOrientation()F

    .line 146
    .line 147
    .line 148
    move-result p2

    .line 149
    neg-float p2, p2

    .line 150
    iget-object p3, p0, Lorg/osmdroid/views/overlay/mylocation/e;->i:Landroid/graphics/Point;

    .line 151
    .line 152
    iget v0, p3, Landroid/graphics/Point;->x:I

    .line 153
    .line 154
    int-to-float v0, v0

    .line 155
    iget p3, p3, Landroid/graphics/Point;->y:I

    .line 156
    .line 157
    int-to-float p3, p3

    .line 158
    invoke-virtual {p1, p2, v0, p3}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 159
    .line 160
    .line 161
    iget-object p2, p0, Lorg/osmdroid/views/overlay/mylocation/e;->c:Landroid/graphics/Bitmap;

    .line 162
    .line 163
    iget-object p3, p0, Lorg/osmdroid/views/overlay/mylocation/e;->i:Landroid/graphics/Point;

    .line 164
    .line 165
    iget v0, p3, Landroid/graphics/Point;->x:I

    .line 166
    .line 167
    int-to-float v0, v0

    .line 168
    iget-object v1, p0, Lorg/osmdroid/views/overlay/mylocation/e;->s:Landroid/graphics/PointF;

    .line 169
    .line 170
    iget v2, v1, Landroid/graphics/PointF;->x:F

    .line 171
    .line 172
    sub-float/2addr v0, v2

    .line 173
    iget p3, p3, Landroid/graphics/Point;->y:I

    .line 174
    .line 175
    int-to-float p3, p3

    .line 176
    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 177
    .line 178
    sub-float/2addr p3, v1

    .line 179
    iget-object v1, p0, Lorg/osmdroid/views/overlay/mylocation/e;->a:Landroid/graphics/Paint;

    .line 180
    .line 181
    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 185
    .line 186
    .line 187
    :goto_0
    return-void
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

.method public g()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lorg/osmdroid/views/overlay/mylocation/e;->q:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Lorg/osmdroid/views/overlay/mylocation/e;->p()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lorg/osmdroid/views/overlay/mylocation/e;->g:Lorg/osmdroid/views/overlay/mylocation/d;

    .line 11
    .line 12
    invoke-interface {v0}, Lorg/osmdroid/views/overlay/mylocation/d;->a()Landroid/location/Location;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Lorg/osmdroid/views/overlay/mylocation/e;->w(Landroid/location/Location;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    iget-object v0, p0, Lorg/osmdroid/views/overlay/mylocation/e;->e:Lorg/osmdroid/views/MapView;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/view/View;->postInvalidate()V

    .line 26
    .line 27
    .line 28
    :cond_1
    return-void
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

.method public h()Z
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/mylocation/e;->g:Lorg/osmdroid/views/overlay/mylocation/d;

    invoke-virtual {p0, v0}, Lorg/osmdroid/views/overlay/mylocation/e;->i(Lorg/osmdroid/views/overlay/mylocation/d;)Z

    move-result v0

    return v0
.end method

.method public i(Lorg/osmdroid/views/overlay/mylocation/d;)Z
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lorg/osmdroid/views/overlay/mylocation/e;->x(Lorg/osmdroid/views/overlay/mylocation/d;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lorg/osmdroid/views/overlay/mylocation/e;->g:Lorg/osmdroid/views/overlay/mylocation/d;

    .line 5
    .line 6
    invoke-interface {p1, p0}, Lorg/osmdroid/views/overlay/mylocation/d;->c(Lorg/osmdroid/views/overlay/mylocation/c;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iput-boolean p1, p0, Lorg/osmdroid/views/overlay/mylocation/e;->p:Z

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lorg/osmdroid/views/overlay/mylocation/e;->g:Lorg/osmdroid/views/overlay/mylocation/d;

    .line 15
    .line 16
    invoke-interface {v0}, Lorg/osmdroid/views/overlay/mylocation/d;->a()Landroid/location/Location;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Lorg/osmdroid/views/overlay/mylocation/e;->w(Landroid/location/Location;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    iget-object v0, p0, Lorg/osmdroid/views/overlay/mylocation/e;->e:Lorg/osmdroid/views/MapView;

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/view/View;->postInvalidate()V

    .line 30
    .line 31
    .line 32
    :cond_1
    return p1
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

.method public isOptionsMenuEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lorg/osmdroid/views/overlay/mylocation/e;->v:Z

    return v0
.end method

.method public j()Z
    .locals 1

    iget-boolean v0, p0, Lorg/osmdroid/views/overlay/mylocation/e;->m:Z

    return v0
.end method

.method public k()Landroid/location/Location;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/mylocation/e;->n:Landroid/location/Location;

    return-object v0
.end method

.method public l()Lorg/osmdroid/util/GeoPoint;
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/overlay/mylocation/e;->n:Landroid/location/Location;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    new-instance v0, Lorg/osmdroid/util/GeoPoint;

    .line 8
    .line 9
    iget-object v1, p0, Lorg/osmdroid/views/overlay/mylocation/e;->n:Landroid/location/Location;

    .line 10
    .line 11
    invoke-direct {v0, v1}, Lorg/osmdroid/util/GeoPoint;-><init>(Landroid/location/Location;)V

    .line 12
    .line 13
    .line 14
    return-object v0
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

.method public m()Lorg/osmdroid/views/overlay/mylocation/d;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/mylocation/e;->g:Lorg/osmdroid/views/overlay/mylocation/d;

    return-object v0
.end method

.method public n()Z
    .locals 1

    iget-boolean v0, p0, Lorg/osmdroid/views/overlay/mylocation/e;->r:Z

    return v0
.end method

.method public o()Z
    .locals 1

    iget-boolean v0, p0, Lorg/osmdroid/views/overlay/mylocation/e;->q:Z

    return v0
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;ILorg/osmdroid/views/MapView;)Z
    .locals 2

    .line 1
    sget v0, Lorg/osmdroid/views/overlay/mylocation/e;->x:I

    .line 2
    .line 3
    add-int/2addr v0, p2

    .line 4
    invoke-virtual {p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    sget v1, Lorg/osmdroid/library/R$string;->K:I

    .line 13
    .line 14
    invoke-virtual {p2, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-interface {p1, v1, v0, v1, p2}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    sget p3, Lorg/osmdroid/library/R$drawable;->f:I

    .line 32
    .line 33
    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    invoke-interface {p1, p2}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    const/4 p2, 0x1

    .line 42
    invoke-interface {p1, p2}, Landroid/view/MenuItem;->setCheckable(Z)Landroid/view/MenuItem;

    .line 43
    .line 44
    .line 45
    return p2
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

.method public onDetach(Lorg/osmdroid/views/MapView;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lorg/osmdroid/views/overlay/mylocation/e;->e()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lorg/osmdroid/views/overlay/mylocation/e;->e:Lorg/osmdroid/views/MapView;

    .line 6
    .line 7
    iput-object v0, p0, Lorg/osmdroid/views/overlay/mylocation/e;->k:Landroid/os/Handler;

    .line 8
    .line 9
    iput-object v0, p0, Lorg/osmdroid/views/overlay/mylocation/e;->b:Landroid/graphics/Paint;

    .line 10
    .line 11
    iput-object v0, p0, Lorg/osmdroid/views/overlay/mylocation/e;->l:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object v0, p0, Lorg/osmdroid/views/overlay/mylocation/e;->n:Landroid/location/Location;

    .line 14
    .line 15
    iput-object v0, p0, Lorg/osmdroid/views/overlay/mylocation/e;->f:Lorg/osmdroid/api/IMapController;

    .line 16
    .line 17
    iget-object v1, p0, Lorg/osmdroid/views/overlay/mylocation/e;->g:Lorg/osmdroid/views/overlay/mylocation/d;

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-interface {v1}, Lorg/osmdroid/views/overlay/mylocation/d;->destroy()V

    .line 22
    .line 23
    .line 24
    :cond_0
    iput-object v0, p0, Lorg/osmdroid/views/overlay/mylocation/e;->g:Lorg/osmdroid/views/overlay/mylocation/d;

    .line 25
    .line 26
    invoke-super {p0, p1}, Lorg/osmdroid/views/overlay/Overlay;->onDetach(Lorg/osmdroid/views/MapView;)V

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

.method public onOptionsItemSelected(Landroid/view/MenuItem;ILorg/osmdroid/views/MapView;)Z
    .locals 0

    .line 1
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    sub-int/2addr p1, p2

    .line 6
    sget p2, Lorg/osmdroid/views/overlay/mylocation/e;->x:I

    .line 7
    .line 8
    if-ne p1, p2, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0}, Lorg/osmdroid/views/overlay/mylocation/e;->p()Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Lorg/osmdroid/views/overlay/mylocation/e;->d()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lorg/osmdroid/views/overlay/mylocation/e;->e()V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {p0}, Lorg/osmdroid/views/overlay/mylocation/e;->g()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lorg/osmdroid/views/overlay/mylocation/e;->h()Z

    .line 27
    .line 28
    .line 29
    :goto_0
    const/4 p1, 0x1

    .line 30
    return p1

    .line 31
    :cond_1
    const/4 p1, 0x0

    .line 32
    return p1
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

.method public onPause()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/osmdroid/views/overlay/mylocation/e;->q:Z

    .line 2
    .line 3
    iput-boolean v0, p0, Lorg/osmdroid/views/overlay/mylocation/e;->w:Z

    .line 4
    .line 5
    invoke-virtual {p0}, Lorg/osmdroid/views/overlay/mylocation/e;->e()V

    .line 6
    .line 7
    .line 8
    invoke-super {p0}, Lorg/osmdroid/views/overlay/Overlay;->onPause()V

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

.method public onPrepareOptionsMenu(Landroid/view/Menu;ILorg/osmdroid/views/MapView;)Z
    .locals 0

    sget p3, Lorg/osmdroid/views/overlay/mylocation/e;->x:I

    add-int/2addr p3, p2

    invoke-interface {p1, p3}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    invoke-virtual {p0}, Lorg/osmdroid/views/overlay/mylocation/e;->p()Z

    move-result p2

    invoke-interface {p1, p2}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    const/4 p1, 0x0

    return p1
.end method

.method public onResume()V
    .locals 1

    .line 1
    invoke-super {p0}, Lorg/osmdroid/views/overlay/Overlay;->onResume()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lorg/osmdroid/views/overlay/mylocation/e;->w:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lorg/osmdroid/views/overlay/mylocation/e;->g()V

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-virtual {p0}, Lorg/osmdroid/views/overlay/mylocation/e;->h()Z

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
.end method

.method public onSnapToItem(IILandroid/graphics/Point;Lorg/osmdroid/api/IMapView;)Z
    .locals 3

    .line 1
    iget-object p4, p0, Lorg/osmdroid/views/overlay/mylocation/e;->n:Landroid/location/Location;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p4, :cond_1

    .line 5
    .line 6
    iget-object p4, p0, Lorg/osmdroid/views/overlay/mylocation/e;->e:Lorg/osmdroid/views/MapView;

    .line 7
    .line 8
    invoke-virtual {p4}, Lorg/osmdroid/views/MapView;->getProjection()Lorg/osmdroid/views/Projection;

    .line 9
    .line 10
    .line 11
    move-result-object p4

    .line 12
    iget-object v1, p0, Lorg/osmdroid/views/overlay/mylocation/e;->o:Lorg/osmdroid/util/GeoPoint;

    .line 13
    .line 14
    iget-object v2, p0, Lorg/osmdroid/views/overlay/mylocation/e;->j:Landroid/graphics/Point;

    .line 15
    .line 16
    invoke-virtual {p4, v1, v2}, Lorg/osmdroid/views/Projection;->toPixels(Lorg/osmdroid/api/IGeoPoint;Landroid/graphics/Point;)Landroid/graphics/Point;

    .line 17
    .line 18
    .line 19
    iget-object p4, p0, Lorg/osmdroid/views/overlay/mylocation/e;->j:Landroid/graphics/Point;

    .line 20
    .line 21
    iget v1, p4, Landroid/graphics/Point;->x:I

    .line 22
    .line 23
    iput v1, p3, Landroid/graphics/Point;->x:I

    .line 24
    .line 25
    iget v1, p4, Landroid/graphics/Point;->y:I

    .line 26
    .line 27
    iput v1, p3, Landroid/graphics/Point;->y:I

    .line 28
    .line 29
    iget p3, p4, Landroid/graphics/Point;->x:I

    .line 30
    .line 31
    sub-int/2addr p1, p3

    .line 32
    int-to-double v1, p1

    .line 33
    iget p1, p4, Landroid/graphics/Point;->y:I

    .line 34
    .line 35
    sub-int/2addr p2, p1

    .line 36
    int-to-double p1, p2

    .line 37
    mul-double/2addr v1, v1

    .line 38
    mul-double/2addr p1, p1

    .line 39
    add-double/2addr v1, p1

    .line 40
    const-wide/high16 p1, 0x4050000000000000L    # 64.0

    .line 41
    .line 42
    cmpg-double p1, v1, p1

    .line 43
    .line 44
    if-gez p1, :cond_0

    .line 45
    .line 46
    const/4 v0, 0x1

    .line 47
    :cond_0
    invoke-static {}, Lorg/osmdroid/config/a;->a()Lorg/osmdroid/config/c;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-interface {p1}, Lorg/osmdroid/config/c;->M()Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-eqz p1, :cond_1

    .line 56
    .line 57
    new-instance p1, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 60
    .line 61
    .line 62
    const-string p2, "snap="

    .line 63
    .line 64
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    const-string p2, "OsmDroid"

    .line 75
    .line 76
    invoke-static {p2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 77
    .line 78
    .line 79
    :cond_1
    return v0
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
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;Lorg/osmdroid/views/MapView;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    const/4 v2, 0x1

    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-ne v0, v2, :cond_0

    .line 14
    .line 15
    move v0, v2

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    :goto_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-nez v1, :cond_1

    .line 23
    .line 24
    iget-boolean v1, p0, Lorg/osmdroid/views/overlay/mylocation/e;->m:Z

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, Lorg/osmdroid/views/overlay/mylocation/e;->d()V

    .line 29
    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    if-eqz v0, :cond_2

    .line 33
    .line 34
    invoke-virtual {p0}, Lorg/osmdroid/views/overlay/mylocation/e;->o()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    return v2

    .line 41
    :cond_2
    :goto_1
    invoke-super {p0, p1, p2}, Lorg/osmdroid/views/overlay/Overlay;->onTouchEvent(Landroid/view/MotionEvent;Lorg/osmdroid/views/MapView;)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    return p1
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

.method public p()Z
    .locals 1

    iget-boolean v0, p0, Lorg/osmdroid/views/overlay/mylocation/e;->p:Z

    return v0
.end method

.method public q(Ljava/lang/Runnable;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/overlay/mylocation/e;->g:Lorg/osmdroid/views/overlay/mylocation/d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lorg/osmdroid/views/overlay/mylocation/e;->n:Landroid/location/Location;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Ljava/lang/Thread;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 12
    .line 13
    .line 14
    new-instance p1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, "#runOnFirstFix"

    .line 31
    .line 32
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {v0, p1}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 43
    .line 44
    .line 45
    const/4 p1, 0x1

    .line 46
    return p1

    .line 47
    :cond_0
    iget-object v0, p0, Lorg/osmdroid/views/overlay/mylocation/e;->h:Ljava/util/LinkedList;

    .line 48
    .line 49
    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->addLast(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    const/4 p1, 0x0

    .line 53
    return p1
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
.end method

.method public r(FF)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/overlay/mylocation/e;->d:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    int-to-float v0, v0

    .line 8
    mul-float/2addr v0, p1

    .line 9
    iput v0, p0, Lorg/osmdroid/views/overlay/mylocation/e;->t:F

    .line 10
    .line 11
    iget-object p1, p0, Lorg/osmdroid/views/overlay/mylocation/e;->d:Landroid/graphics/Bitmap;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    int-to-float p1, p1

    .line 18
    mul-float/2addr p1, p2

    .line 19
    iput p1, p0, Lorg/osmdroid/views/overlay/mylocation/e;->u:F

    .line 20
    .line 21
    return-void
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

.method public s(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lorg/osmdroid/views/overlay/mylocation/e;->A(Landroid/graphics/Bitmap;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p2}, Lorg/osmdroid/views/overlay/mylocation/e;->t(Landroid/graphics/Bitmap;)V

    .line 5
    .line 6
    .line 7
    const/high16 p1, 0x3f000000    # 0.5f

    .line 8
    .line 9
    invoke-virtual {p0, p1, p1}, Lorg/osmdroid/views/overlay/mylocation/e;->r(FF)V

    .line 10
    .line 11
    .line 12
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

.method public setOptionsMenuEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/osmdroid/views/overlay/mylocation/e;->v:Z

    return-void
.end method

.method public t(Landroid/graphics/Bitmap;)V
    .locals 0

    iput-object p1, p0, Lorg/osmdroid/views/overlay/mylocation/e;->d:Landroid/graphics/Bitmap;

    return-void
.end method

.method public u(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/osmdroid/views/overlay/mylocation/e;->r:Z

    return-void
.end method

.method public v(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/osmdroid/views/overlay/mylocation/e;->m:Z

    return-void
.end method

.method protected w(Landroid/location/Location;)V
    .locals 5

    .line 1
    iput-object p1, p0, Lorg/osmdroid/views/overlay/mylocation/e;->n:Landroid/location/Location;

    .line 2
    .line 3
    iget-object v0, p0, Lorg/osmdroid/views/overlay/mylocation/e;->o:Lorg/osmdroid/util/GeoPoint;

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    iget-object p1, p0, Lorg/osmdroid/views/overlay/mylocation/e;->n:Landroid/location/Location;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    .line 12
    .line 13
    .line 14
    move-result-wide v3

    .line 15
    invoke-virtual {v0, v1, v2, v3, v4}, Lorg/osmdroid/util/GeoPoint;->setCoords(DD)V

    .line 16
    .line 17
    .line 18
    iget-boolean p1, p0, Lorg/osmdroid/views/overlay/mylocation/e;->q:Z

    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    iget-object p1, p0, Lorg/osmdroid/views/overlay/mylocation/e;->f:Lorg/osmdroid/api/IMapController;

    .line 23
    .line 24
    iget-object v0, p0, Lorg/osmdroid/views/overlay/mylocation/e;->o:Lorg/osmdroid/util/GeoPoint;

    .line 25
    .line 26
    invoke-interface {p1, v0}, Lorg/osmdroid/api/IMapController;->animateTo(Lorg/osmdroid/api/IGeoPoint;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iget-object p1, p0, Lorg/osmdroid/views/overlay/mylocation/e;->e:Lorg/osmdroid/views/MapView;

    .line 31
    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    invoke-virtual {p1}, Landroid/view/View;->postInvalidate()V

    .line 35
    .line 36
    .line 37
    :cond_1
    :goto_0
    return-void
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

.method protected x(Lorg/osmdroid/views/overlay/mylocation/d;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, Lorg/osmdroid/views/overlay/mylocation/e;->p()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lorg/osmdroid/views/overlay/mylocation/e;->B()V

    .line 10
    .line 11
    .line 12
    :cond_0
    iput-object p1, p0, Lorg/osmdroid/views/overlay/mylocation/e;->g:Lorg/osmdroid/views/overlay/mylocation/d;

    .line 13
    .line 14
    return-void

    .line 15
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    .line 16
    .line 17
    const-string v0, "You must pass an IMyLocationProvider to setMyLocationProvider()"

    .line 18
    .line 19
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p1
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

.method public y(FF)V
    .locals 2

    iget-object v0, p0, Lorg/osmdroid/views/overlay/mylocation/e;->s:Landroid/graphics/PointF;

    iget-object v1, p0, Lorg/osmdroid/views/overlay/mylocation/e;->c:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v1, p1

    iget-object p1, p0, Lorg/osmdroid/views/overlay/mylocation/e;->c:Landroid/graphics/Bitmap;

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p1

    int-to-float p1, p1

    mul-float/2addr p1, p2

    invoke-virtual {v0, v1, p1}, Landroid/graphics/PointF;->set(FF)V

    return-void
.end method

.method public z(FF)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lorg/osmdroid/views/overlay/mylocation/e;->s:Landroid/graphics/PointF;

    invoke-virtual {v0, p1, p2}, Landroid/graphics/PointF;->set(FF)V

    return-void
.end method
