.class public Lorg/osmdroid/views/drawing/d;
.super Landroid/graphics/Path;
.source "SourceFile"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field private static final c:Lorg/osmdroid/util/GeoPoint;


# instance fields
.field protected final a:Landroid/graphics/Point;

.field private b:D


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/osmdroid/util/GeoPoint;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Lorg/osmdroid/util/GeoPoint;-><init>(II)V

    sput-object v0, Lorg/osmdroid/views/drawing/d;->c:Lorg/osmdroid/util/GeoPoint;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/graphics/Path;-><init>()V

    .line 2
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    iput-object v0, p0, Lorg/osmdroid/views/drawing/d;->a:Landroid/graphics/Point;

    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    .line 3
    iput-wide v0, p0, Lorg/osmdroid/views/drawing/d;->b:D

    return-void
.end method

.method public constructor <init>(Landroid/graphics/Path;)V
    .locals 2

    .line 4
    invoke-direct {p0, p1}, Landroid/graphics/Path;-><init>(Landroid/graphics/Path;)V

    .line 5
    new-instance p1, Landroid/graphics/Point;

    invoke-direct {p1}, Landroid/graphics/Point;-><init>()V

    iput-object p1, p0, Lorg/osmdroid/views/drawing/d;->a:Landroid/graphics/Point;

    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    .line 6
    iput-wide v0, p0, Lorg/osmdroid/views/drawing/d;->b:D

    return-void
.end method


# virtual methods
.method public a(Lorg/osmdroid/views/Projection;)V
    .locals 4

    .line 1
    iget-wide v0, p0, Lorg/osmdroid/views/drawing/d;->b:D

    .line 2
    .line 3
    invoke-virtual {p1}, Lorg/osmdroid/views/Projection;->getZoomLevel()D

    .line 4
    .line 5
    .line 6
    move-result-wide v2

    .line 7
    cmpl-double v0, v0, v2

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object v0, Lorg/osmdroid/views/drawing/d;->c:Lorg/osmdroid/util/GeoPoint;

    .line 12
    .line 13
    iget-object v1, p0, Lorg/osmdroid/views/drawing/d;->a:Landroid/graphics/Point;

    .line 14
    .line 15
    invoke-virtual {p1, v0, v1}, Lorg/osmdroid/views/Projection;->toPixels(Lorg/osmdroid/api/IGeoPoint;Landroid/graphics/Point;)Landroid/graphics/Point;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Lorg/osmdroid/views/Projection;->getZoomLevel()D

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    iput-wide v0, p0, Lorg/osmdroid/views/drawing/d;->b:D

    .line 23
    .line 24
    :cond_0
    iget-object v0, p0, Lorg/osmdroid/views/drawing/d;->a:Landroid/graphics/Point;

    .line 25
    .line 26
    iget v1, v0, Landroid/graphics/Point;->x:I

    .line 27
    .line 28
    iget v2, v0, Landroid/graphics/Point;->y:I

    .line 29
    .line 30
    sget-object v3, Lorg/osmdroid/views/drawing/d;->c:Lorg/osmdroid/util/GeoPoint;

    .line 31
    .line 32
    invoke-virtual {p1, v3, v0}, Lorg/osmdroid/views/Projection;->toPixels(Lorg/osmdroid/api/IGeoPoint;Landroid/graphics/Point;)Landroid/graphics/Point;

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lorg/osmdroid/views/drawing/d;->a:Landroid/graphics/Point;

    .line 36
    .line 37
    iget v0, p1, Landroid/graphics/Point;->x:I

    .line 38
    .line 39
    sub-int/2addr v0, v1

    .line 40
    iget p1, p1, Landroid/graphics/Point;->y:I

    .line 41
    .line 42
    sub-int/2addr p1, v2

    .line 43
    int-to-float v0, v0

    .line 44
    int-to-float p1, p1

    .line 45
    invoke-virtual {p0, v0, p1}, Landroid/graphics/Path;->offset(FF)V

    .line 46
    .line 47
    .line 48
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
.end method
