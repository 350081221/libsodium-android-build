.class public Lorg/osmdroid/views/overlay/infowindow/c;
.super Lorg/osmdroid/views/overlay/infowindow/a;
.source "SourceFile"


# instance fields
.field protected m:Lorg/osmdroid/views/overlay/Marker;


# direct methods
.method public constructor <init>(ILorg/osmdroid/views/MapView;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lorg/osmdroid/views/overlay/infowindow/a;-><init>(ILorg/osmdroid/views/MapView;)V

    return-void
.end method


# virtual methods
.method public i()V
    .locals 1

    .line 1
    invoke-super {p0}, Lorg/osmdroid/views/overlay/infowindow/a;->i()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lorg/osmdroid/views/overlay/infowindow/c;->m:Lorg/osmdroid/views/overlay/Marker;

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
.end method

.method public k(Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lorg/osmdroid/views/overlay/infowindow/a;->k(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    check-cast p1, Lorg/osmdroid/views/overlay/Marker;

    .line 5
    .line 6
    iput-object p1, p0, Lorg/osmdroid/views/overlay/infowindow/c;->m:Lorg/osmdroid/views/overlay/Marker;

    .line 7
    .line 8
    iget-object p1, p0, Lorg/osmdroid/views/overlay/infowindow/b;->a:Landroid/view/View;

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    const-string p1, "OsmDroid"

    .line 13
    .line 14
    const-string v0, "Error trapped, MarkerInfoWindow.open, mView is null!"

    .line 15
    .line 16
    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    sget v0, Lorg/osmdroid/views/overlay/infowindow/a;->l:I

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Landroid/widget/ImageView;

    .line 27
    .line 28
    iget-object v0, p0, Lorg/osmdroid/views/overlay/infowindow/c;->m:Lorg/osmdroid/views/overlay/Marker;

    .line 29
    .line 30
    invoke-virtual {v0}, Lorg/osmdroid/views/overlay/Marker;->getImage()Landroid/graphics/drawable/Drawable;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 37
    .line 38
    .line 39
    sget-object v0, Landroid/widget/ImageView$ScaleType;->CENTER_INSIDE:Landroid/widget/ImageView$ScaleType;

    .line 40
    .line 41
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 42
    .line 43
    .line 44
    const/4 v0, 0x0

    .line 45
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    const/16 v0, 0x8

    .line 50
    .line 51
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 52
    .line 53
    .line 54
    :goto_0
    return-void
    .line 55
    .line 56
    .line 57
    .line 58
.end method

.method public o()Lorg/osmdroid/views/overlay/Marker;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/infowindow/c;->m:Lorg/osmdroid/views/overlay/Marker;

    return-object v0
.end method
