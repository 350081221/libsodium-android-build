.class public Lorg/osmdroid/views/overlay/CopyrightOverlay;
.super Lorg/osmdroid/views/overlay/Overlay;
.source "SourceFile"


# instance fields
.field protected alignBottom:Z

.field protected alignRight:Z

.field final dm:Landroid/util/DisplayMetrics;

.field private mCopyrightNotice:Ljava/lang/String;

.field private paint:Landroid/graphics/Paint;

.field xOffset:I

.field yOffset:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lorg/osmdroid/views/overlay/Overlay;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0xa

    .line 5
    .line 6
    iput v0, p0, Lorg/osmdroid/views/overlay/CopyrightOverlay;->xOffset:I

    .line 7
    .line 8
    iput v0, p0, Lorg/osmdroid/views/overlay/CopyrightOverlay;->yOffset:I

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Lorg/osmdroid/views/overlay/CopyrightOverlay;->alignBottom:Z

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    iput-boolean v1, p0, Lorg/osmdroid/views/overlay/CopyrightOverlay;->alignRight:Z

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, Lorg/osmdroid/views/overlay/CopyrightOverlay;->dm:Landroid/util/DisplayMetrics;

    .line 25
    .line 26
    new-instance v1, Landroid/graphics/Paint;

    .line 27
    .line 28
    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v1, p0, Lorg/osmdroid/views/overlay/CopyrightOverlay;->paint:Landroid/graphics/Paint;

    .line 32
    .line 33
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lorg/osmdroid/views/overlay/CopyrightOverlay;->paint:Landroid/graphics/Paint;

    .line 37
    .line 38
    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    .line 39
    .line 40
    const/high16 v1, 0x41400000    # 12.0f

    .line 41
    .line 42
    mul-float/2addr p1, v1

    .line 43
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 44
    .line 45
    .line 46
    return-void
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


# virtual methods
.method public draw(Landroid/graphics/Canvas;Lorg/osmdroid/views/MapView;Z)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Lorg/osmdroid/views/MapView;->getTileProvider()Lorg/osmdroid/tileprovider/MapTileProviderBase;

    move-result-object p3

    invoke-virtual {p3}, Lorg/osmdroid/tileprovider/MapTileProviderBase;->getTileSource()Lorg/osmdroid/tileprovider/tilesource/e;

    move-result-object p3

    invoke-interface {p3}, Lorg/osmdroid/tileprovider/tilesource/e;->getCopyrightNotice()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0, p3}, Lorg/osmdroid/views/overlay/CopyrightOverlay;->setCopyrightNotice(Ljava/lang/String;)V

    .line 2
    invoke-virtual {p2}, Lorg/osmdroid/views/MapView;->getProjection()Lorg/osmdroid/views/Projection;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lorg/osmdroid/views/overlay/CopyrightOverlay;->draw(Landroid/graphics/Canvas;Lorg/osmdroid/views/Projection;)V

    return-void
.end method

.method public draw(Landroid/graphics/Canvas;Lorg/osmdroid/views/Projection;)V
    .locals 5

    .line 3
    iget-object v0, p0, Lorg/osmdroid/views/overlay/CopyrightOverlay;->mCopyrightNotice:Ljava/lang/String;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_2

    .line 4
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v0

    .line 5
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getHeight()I

    move-result v1

    .line 6
    iget-boolean v2, p0, Lorg/osmdroid/views/overlay/CopyrightOverlay;->alignRight:Z

    if-eqz v2, :cond_1

    .line 7
    iget v2, p0, Lorg/osmdroid/views/overlay/CopyrightOverlay;->xOffset:I

    sub-int/2addr v0, v2

    int-to-float v0, v0

    .line 8
    iget-object v2, p0, Lorg/osmdroid/views/overlay/CopyrightOverlay;->paint:Landroid/graphics/Paint;

    sget-object v3, Landroid/graphics/Paint$Align;->RIGHT:Landroid/graphics/Paint$Align;

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    goto :goto_0

    .line 9
    :cond_1
    iget v0, p0, Lorg/osmdroid/views/overlay/CopyrightOverlay;->xOffset:I

    int-to-float v0, v0

    .line 10
    iget-object v2, p0, Lorg/osmdroid/views/overlay/CopyrightOverlay;->paint:Landroid/graphics/Paint;

    sget-object v3, Landroid/graphics/Paint$Align;->LEFT:Landroid/graphics/Paint$Align;

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 11
    :goto_0
    iget-boolean v2, p0, Lorg/osmdroid/views/overlay/CopyrightOverlay;->alignBottom:Z

    if-eqz v2, :cond_2

    .line 12
    iget v2, p0, Lorg/osmdroid/views/overlay/CopyrightOverlay;->yOffset:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    goto :goto_1

    .line 13
    :cond_2
    iget-object v1, p0, Lorg/osmdroid/views/overlay/CopyrightOverlay;->paint:Landroid/graphics/Paint;

    invoke-virtual {v1}, Landroid/graphics/Paint;->getTextSize()F

    move-result v1

    iget v2, p0, Lorg/osmdroid/views/overlay/CopyrightOverlay;->yOffset:I

    int-to-float v2, v2

    add-float/2addr v1, v2

    :goto_1
    const/4 v2, 0x0

    .line 14
    invoke-virtual {p2, p1, v2, v2}, Lorg/osmdroid/views/Projection;->save(Landroid/graphics/Canvas;ZZ)V

    .line 15
    iget-object v3, p0, Lorg/osmdroid/views/overlay/CopyrightOverlay;->mCopyrightNotice:Ljava/lang/String;

    iget-object v4, p0, Lorg/osmdroid/views/overlay/CopyrightOverlay;->paint:Landroid/graphics/Paint;

    invoke-virtual {p1, v3, v0, v1, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 16
    invoke-virtual {p2, p1, v2}, Lorg/osmdroid/views/Projection;->restore(Landroid/graphics/Canvas;Z)V

    :cond_3
    :goto_2
    return-void
.end method

.method public setAlignBottom(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/osmdroid/views/overlay/CopyrightOverlay;->alignBottom:Z

    return-void
.end method

.method public setAlignRight(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/osmdroid/views/overlay/CopyrightOverlay;->alignRight:Z

    return-void
.end method

.method public setCopyrightNotice(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lorg/osmdroid/views/overlay/CopyrightOverlay;->mCopyrightNotice:Ljava/lang/String;

    return-void
.end method

.method public setOffset(II)V
    .locals 0

    .line 1
    iput p1, p0, Lorg/osmdroid/views/overlay/CopyrightOverlay;->xOffset:I

    .line 2
    .line 3
    iput p2, p0, Lorg/osmdroid/views/overlay/CopyrightOverlay;->yOffset:I

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

.method public setTextColor(I)V
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/CopyrightOverlay;->paint:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method

.method public setTextSize(I)V
    .locals 2

    iget-object v0, p0, Lorg/osmdroid/views/overlay/CopyrightOverlay;->paint:Landroid/graphics/Paint;

    iget-object v1, p0, Lorg/osmdroid/views/overlay/CopyrightOverlay;->dm:Landroid/util/DisplayMetrics;

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    int-to-float p1, p1

    mul-float/2addr v1, p1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    return-void
.end method
