.class public Lorg/osmdroid/views/overlay/mylocation/f;
.super Lorg/osmdroid/views/overlay/Overlay;
.source "SourceFile"


# instance fields
.field protected final a:Landroid/graphics/Paint;

.field protected b:Landroid/graphics/Bitmap;

.field protected c:Landroid/graphics/Point;

.field protected d:Lorg/osmdroid/util/GeoPoint;

.field private final e:Landroid/graphics/Point;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v0, Lorg/osmdroid/library/R$drawable;->r:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    check-cast p1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/osmdroid/views/overlay/mylocation/f;-><init>(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public constructor <init>(Landroid/graphics/Bitmap;)V
    .locals 3

    .line 2
    invoke-direct {p0}, Lorg/osmdroid/views/overlay/Overlay;-><init>()V

    .line 3
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lorg/osmdroid/views/overlay/mylocation/f;->a:Landroid/graphics/Paint;

    .line 4
    new-instance v0, Landroid/graphics/Point;

    const/16 v1, 0x18

    const/16 v2, 0x27

    invoke-direct {v0, v1, v2}, Landroid/graphics/Point;-><init>(II)V

    iput-object v0, p0, Lorg/osmdroid/views/overlay/mylocation/f;->c:Landroid/graphics/Point;

    .line 5
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    iput-object v0, p0, Lorg/osmdroid/views/overlay/mylocation/f;->e:Landroid/graphics/Point;

    .line 6
    iput-object p1, p0, Lorg/osmdroid/views/overlay/mylocation/f;->b:Landroid/graphics/Bitmap;

    return-void
.end method


# virtual methods
.method public c()Lorg/osmdroid/util/GeoPoint;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/mylocation/f;->d:Lorg/osmdroid/util/GeoPoint;

    return-object v0
.end method

.method public d(Lorg/osmdroid/util/GeoPoint;)V
    .locals 0

    iput-object p1, p0, Lorg/osmdroid/views/overlay/mylocation/f;->d:Lorg/osmdroid/util/GeoPoint;

    return-void
.end method

.method public draw(Landroid/graphics/Canvas;Lorg/osmdroid/views/Projection;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/overlay/mylocation/f;->d:Lorg/osmdroid/util/GeoPoint;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lorg/osmdroid/views/overlay/mylocation/f;->e:Landroid/graphics/Point;

    .line 6
    .line 7
    invoke-virtual {p2, v0, v1}, Lorg/osmdroid/views/Projection;->toPixels(Lorg/osmdroid/api/IGeoPoint;Landroid/graphics/Point;)Landroid/graphics/Point;

    .line 8
    .line 9
    .line 10
    iget-object p2, p0, Lorg/osmdroid/views/overlay/mylocation/f;->b:Landroid/graphics/Bitmap;

    .line 11
    .line 12
    iget-object v0, p0, Lorg/osmdroid/views/overlay/mylocation/f;->e:Landroid/graphics/Point;

    .line 13
    .line 14
    iget v1, v0, Landroid/graphics/Point;->x:I

    .line 15
    .line 16
    iget-object v2, p0, Lorg/osmdroid/views/overlay/mylocation/f;->c:Landroid/graphics/Point;

    .line 17
    .line 18
    iget v3, v2, Landroid/graphics/Point;->x:I

    .line 19
    .line 20
    sub-int/2addr v1, v3

    .line 21
    int-to-float v1, v1

    .line 22
    iget v0, v0, Landroid/graphics/Point;->y:I

    .line 23
    .line 24
    iget v2, v2, Landroid/graphics/Point;->y:I

    .line 25
    .line 26
    sub-int/2addr v0, v2

    .line 27
    int-to-float v0, v0

    .line 28
    iget-object v2, p0, Lorg/osmdroid/views/overlay/mylocation/f;->a:Landroid/graphics/Paint;

    .line 29
    .line 30
    invoke-virtual {p1, p2, v1, v0, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 31
    .line 32
    .line 33
    :cond_0
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

.method public e(Landroid/graphics/Bitmap;Landroid/graphics/Point;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/osmdroid/views/overlay/mylocation/f;->b:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    iput-object p2, p0, Lorg/osmdroid/views/overlay/mylocation/f;->c:Landroid/graphics/Point;

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

.method public onDetach(Lorg/osmdroid/views/MapView;)V
    .locals 0

    return-void
.end method
