.class public abstract Lorg/osmdroid/views/overlay/OverlayWithIW;
.super Lorg/osmdroid/views/overlay/Overlay;
.source "SourceFile"


# instance fields
.field protected mId:Ljava/lang/String;

.field protected mInfoWindow:Lorg/osmdroid/views/overlay/infowindow/b;

.field protected mRelatedObject:Ljava/lang/Object;

.field protected mSnippet:Ljava/lang/String;

.field protected mSubDescription:Ljava/lang/String;

.field protected mTitle:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Lorg/osmdroid/views/overlay/Overlay;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-direct {p0}, Lorg/osmdroid/views/overlay/OverlayWithIW;-><init>()V

    return-void
.end method


# virtual methods
.method public closeInfoWindow()V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/overlay/OverlayWithIW;->mInfoWindow:Lorg/osmdroid/views/overlay/infowindow/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lorg/osmdroid/views/overlay/infowindow/b;->a()V

    .line 6
    .line 7
    .line 8
    :cond_0
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
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/OverlayWithIW;->mId:Ljava/lang/String;

    return-object v0
.end method

.method public getInfoWindow()Lorg/osmdroid/views/overlay/infowindow/b;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/OverlayWithIW;->mInfoWindow:Lorg/osmdroid/views/overlay/infowindow/b;

    return-object v0
.end method

.method public getRelatedObject()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/OverlayWithIW;->mRelatedObject:Ljava/lang/Object;

    return-object v0
.end method

.method public getSnippet()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/OverlayWithIW;->mSnippet:Ljava/lang/String;

    return-object v0
.end method

.method public getSubDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/OverlayWithIW;->mSubDescription:Ljava/lang/String;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/OverlayWithIW;->mTitle:Ljava/lang/String;

    return-object v0
.end method

.method public isInfoWindowOpen()Z
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/OverlayWithIW;->mInfoWindow:Lorg/osmdroid/views/overlay/infowindow/b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lorg/osmdroid/views/overlay/infowindow/b;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public onDestroy()V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/overlay/OverlayWithIW;->mInfoWindow:Lorg/osmdroid/views/overlay/infowindow/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lorg/osmdroid/views/overlay/infowindow/b;->a()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lorg/osmdroid/views/overlay/OverlayWithIW;->mInfoWindow:Lorg/osmdroid/views/overlay/infowindow/b;

    .line 9
    .line 10
    invoke-virtual {v0}, Lorg/osmdroid/views/overlay/infowindow/b;->j()V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput-object v0, p0, Lorg/osmdroid/views/overlay/OverlayWithIW;->mInfoWindow:Lorg/osmdroid/views/overlay/infowindow/b;

    .line 15
    .line 16
    iput-object v0, p0, Lorg/osmdroid/views/overlay/OverlayWithIW;->mRelatedObject:Ljava/lang/Object;

    .line 17
    .line 18
    :cond_0
    return-void
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

.method public setId(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lorg/osmdroid/views/overlay/OverlayWithIW;->mId:Ljava/lang/String;

    return-void
.end method

.method public setInfoWindow(Lorg/osmdroid/views/overlay/infowindow/b;)V
    .locals 0

    iput-object p1, p0, Lorg/osmdroid/views/overlay/OverlayWithIW;->mInfoWindow:Lorg/osmdroid/views/overlay/infowindow/b;

    return-void
.end method

.method public setRelatedObject(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lorg/osmdroid/views/overlay/OverlayWithIW;->mRelatedObject:Ljava/lang/Object;

    return-void
.end method

.method public setSnippet(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lorg/osmdroid/views/overlay/OverlayWithIW;->mSnippet:Ljava/lang/String;

    return-void
.end method

.method public setSubDescription(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lorg/osmdroid/views/overlay/OverlayWithIW;->mSubDescription:Ljava/lang/String;

    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lorg/osmdroid/views/overlay/OverlayWithIW;->mTitle:Ljava/lang/String;

    return-void
.end method
