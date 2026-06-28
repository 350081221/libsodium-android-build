.class public abstract Lorg/osmdroid/views/overlay/ItemizedOverlay;
.super Lorg/osmdroid/views/overlay/Overlay;
.source "SourceFile"

# interfaces
.implements Lorg/osmdroid/views/overlay/Overlay$Snappable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/osmdroid/views/overlay/ItemizedOverlay$OnFocusChangeListener;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Item:",
        "Lorg/osmdroid/views/overlay/OverlayItem;",
        ">",
        "Lorg/osmdroid/views/overlay/Overlay;",
        "Lorg/osmdroid/views/overlay/Overlay$Snappable;"
    }
.end annotation


# instance fields
.field private itemRect:Landroid/graphics/Rect;

.field private final mCurScreenCoords:Landroid/graphics/Point;

.field protected final mDefaultMarker:Landroid/graphics/drawable/Drawable;

.field protected mDrawFocusedItem:Z

.field protected mDrawnItemsLimit:I

.field private mFocusedItem:Lorg/osmdroid/views/overlay/OverlayItem;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TItem;"
        }
    .end annotation
.end field

.field private mInternalItemDisplayedList:[Z

.field private final mInternalItemList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "TItem;>;"
        }
    .end annotation
.end field

.field private final mMarkerRect:Landroid/graphics/Rect;

.field private mOnFocusChangeListener:Lorg/osmdroid/views/overlay/ItemizedOverlay$OnFocusChangeListener;

.field private final mOrientedMarkerRect:Landroid/graphics/Rect;

.field private mPendingFocusChangedEvent:Z

.field private final mRect:Landroid/graphics/Rect;

.field private screenRect:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/graphics/drawable/Drawable;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-direct {p0, p2}, Lorg/osmdroid/views/overlay/ItemizedOverlay;-><init>(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public constructor <init>(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Lorg/osmdroid/views/overlay/Overlay;-><init>()V

    const v0, 0x7fffffff

    .line 3
    iput v0, p0, Lorg/osmdroid/views/overlay/ItemizedOverlay;->mDrawnItemsLimit:I

    .line 4
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lorg/osmdroid/views/overlay/ItemizedOverlay;->mRect:Landroid/graphics/Rect;

    .line 5
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lorg/osmdroid/views/overlay/ItemizedOverlay;->mMarkerRect:Landroid/graphics/Rect;

    .line 6
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lorg/osmdroid/views/overlay/ItemizedOverlay;->mOrientedMarkerRect:Landroid/graphics/Rect;

    .line 7
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    iput-object v0, p0, Lorg/osmdroid/views/overlay/ItemizedOverlay;->mCurScreenCoords:Landroid/graphics/Point;

    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Lorg/osmdroid/views/overlay/ItemizedOverlay;->mDrawFocusedItem:Z

    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Lorg/osmdroid/views/overlay/ItemizedOverlay;->mPendingFocusChangedEvent:Z

    .line 10
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lorg/osmdroid/views/overlay/ItemizedOverlay;->itemRect:Landroid/graphics/Rect;

    .line 11
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lorg/osmdroid/views/overlay/ItemizedOverlay;->screenRect:Landroid/graphics/Rect;

    if-eqz p1, :cond_0

    .line 12
    iput-object p1, p0, Lorg/osmdroid/views/overlay/ItemizedOverlay;->mDefaultMarker:Landroid/graphics/drawable/Drawable;

    .line 13
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lorg/osmdroid/views/overlay/ItemizedOverlay;->mInternalItemList:Ljava/util/ArrayList;

    return-void

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "You must pass a default marker to ItemizedOverlay."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method protected boundToHotspot(Landroid/graphics/drawable/Drawable;Lorg/osmdroid/views/overlay/OverlayItem$HotspotPlace;)Landroid/graphics/drawable/Drawable;
    .locals 6

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    sget-object p2, Lorg/osmdroid/views/overlay/OverlayItem$HotspotPlace;->BOTTOM_CENTER:Lorg/osmdroid/views/overlay/OverlayItem$HotspotPlace;

    .line 4
    .line 5
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    sget-object v2, Lorg/osmdroid/views/overlay/ItemizedOverlay$1;->$SwitchMap$org$osmdroid$views$overlay$OverlayItem$HotspotPlace:[I

    .line 14
    .line 15
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    aget v3, v2, v3

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    const/4 v5, 0x2

    .line 23
    packed-switch v3, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    move v3, v4

    .line 27
    goto :goto_0

    .line 28
    :pswitch_0
    neg-int v3, v0

    .line 29
    goto :goto_0

    .line 30
    :pswitch_1
    neg-int v3, v0

    .line 31
    div-int/2addr v3, v5

    .line 32
    :goto_0
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    aget p2, v2, p2

    .line 37
    .line 38
    if-eq p2, v5, :cond_2

    .line 39
    .line 40
    const/16 v2, 0x8

    .line 41
    .line 42
    if-eq p2, v2, :cond_2

    .line 43
    .line 44
    const/16 v2, 0xa

    .line 45
    .line 46
    if-eq p2, v2, :cond_1

    .line 47
    .line 48
    const/4 v2, 0x4

    .line 49
    if-eq p2, v2, :cond_1

    .line 50
    .line 51
    const/4 v2, 0x5

    .line 52
    if-eq p2, v2, :cond_2

    .line 53
    .line 54
    const/4 v2, 0x6

    .line 55
    if-eq p2, v2, :cond_1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    neg-int v4, v1

    .line 59
    goto :goto_1

    .line 60
    :cond_2
    neg-int p2, v1

    .line 61
    div-int/lit8 v4, p2, 0x2

    .line 62
    .line 63
    :goto_1
    add-int/2addr v0, v3

    .line 64
    add-int/2addr v1, v4

    .line 65
    invoke-virtual {p1, v3, v4, v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 66
    .line 67
    .line 68
    return-object p1

    .line 69
    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
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

.method protected calculateItemRect(Lorg/osmdroid/views/overlay/OverlayItem;Landroid/graphics/Point;Landroid/graphics/Rect;)Landroid/graphics/Rect;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TItem;",
            "Landroid/graphics/Point;",
            "Landroid/graphics/Rect;",
            ")",
            "Landroid/graphics/Rect;"
        }
    .end annotation

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    new-instance p3, Landroid/graphics/Rect;

    .line 5
    .line 6
    invoke-direct {p3}, Landroid/graphics/Rect;-><init>()V

    .line 7
    .line 8
    .line 9
    :goto_0
    invoke-virtual {p1}, Lorg/osmdroid/views/overlay/OverlayItem;->getMarkerHotspot()Lorg/osmdroid/views/overlay/OverlayItem$HotspotPlace;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    sget-object v0, Lorg/osmdroid/views/overlay/OverlayItem$HotspotPlace;->BOTTOM_CENTER:Lorg/osmdroid/views/overlay/OverlayItem$HotspotPlace;

    .line 16
    .line 17
    :cond_1
    iget-boolean v1, p0, Lorg/osmdroid/views/overlay/ItemizedOverlay;->mDrawFocusedItem:Z

    .line 18
    .line 19
    if-eqz v1, :cond_2

    .line 20
    .line 21
    iget-object v1, p0, Lorg/osmdroid/views/overlay/ItemizedOverlay;->mFocusedItem:Lorg/osmdroid/views/overlay/OverlayItem;

    .line 22
    .line 23
    if-ne v1, p1, :cond_2

    .line 24
    .line 25
    const/4 v1, 0x4

    .line 26
    goto :goto_1

    .line 27
    :cond_2
    const/4 v1, 0x0

    .line 28
    :goto_1
    invoke-virtual {p1, v1}, Lorg/osmdroid/views/overlay/OverlayItem;->getMarker(I)Landroid/graphics/drawable/Drawable;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    if-nez v2, :cond_3

    .line 33
    .line 34
    invoke-virtual {p0, v1}, Lorg/osmdroid/views/overlay/ItemizedOverlay;->getDefaultMarker(I)Landroid/graphics/drawable/Drawable;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    goto :goto_2

    .line 39
    :cond_3
    invoke-virtual {p1, v1}, Lorg/osmdroid/views/overlay/OverlayItem;->getMarker(I)Landroid/graphics/drawable/Drawable;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    :goto_2
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    sget-object v2, Lorg/osmdroid/views/overlay/ItemizedOverlay$1;->$SwitchMap$org$osmdroid$views$overlay$OverlayItem$HotspotPlace:[I

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    aget v0, v2, v0

    .line 58
    .line 59
    packed-switch v0, :pswitch_data_0

    .line 60
    .line 61
    .line 62
    goto/16 :goto_3

    .line 63
    .line 64
    :pswitch_0
    iget v0, p2, Landroid/graphics/Point;->x:I

    .line 65
    .line 66
    sub-int v1, v0, v1

    .line 67
    .line 68
    iget p2, p2, Landroid/graphics/Point;->y:I

    .line 69
    .line 70
    sub-int p1, p2, p1

    .line 71
    .line 72
    invoke-virtual {p3, v1, p1, v0, p2}, Landroid/graphics/Rect;->set(IIII)V

    .line 73
    .line 74
    .line 75
    goto/16 :goto_3

    .line 76
    .line 77
    :pswitch_1
    iget v0, p2, Landroid/graphics/Point;->x:I

    .line 78
    .line 79
    sub-int v1, v0, v1

    .line 80
    .line 81
    iget p2, p2, Landroid/graphics/Point;->y:I

    .line 82
    .line 83
    add-int/2addr p1, p2

    .line 84
    invoke-virtual {p3, v1, p2, v0, p1}, Landroid/graphics/Rect;->set(IIII)V

    .line 85
    .line 86
    .line 87
    goto/16 :goto_3

    .line 88
    .line 89
    :pswitch_2
    iget v0, p2, Landroid/graphics/Point;->x:I

    .line 90
    .line 91
    sub-int v1, v0, v1

    .line 92
    .line 93
    iget p2, p2, Landroid/graphics/Point;->y:I

    .line 94
    .line 95
    div-int/lit8 p1, p1, 0x2

    .line 96
    .line 97
    sub-int v2, p2, p1

    .line 98
    .line 99
    add-int/2addr p2, p1

    .line 100
    invoke-virtual {p3, v1, v2, v0, p2}, Landroid/graphics/Rect;->set(IIII)V

    .line 101
    .line 102
    .line 103
    goto :goto_3

    .line 104
    :pswitch_3
    iget v0, p2, Landroid/graphics/Point;->x:I

    .line 105
    .line 106
    div-int/lit8 v1, v1, 0x2

    .line 107
    .line 108
    sub-int v2, v0, v1

    .line 109
    .line 110
    iget p2, p2, Landroid/graphics/Point;->y:I

    .line 111
    .line 112
    add-int/2addr v0, v1

    .line 113
    add-int/2addr p1, p2

    .line 114
    invoke-virtual {p3, v2, p2, v0, p1}, Landroid/graphics/Rect;->set(IIII)V

    .line 115
    .line 116
    .line 117
    goto :goto_3

    .line 118
    :pswitch_4
    iget v0, p2, Landroid/graphics/Point;->x:I

    .line 119
    .line 120
    div-int/lit8 v1, v1, 0x2

    .line 121
    .line 122
    sub-int v2, v0, v1

    .line 123
    .line 124
    iget p2, p2, Landroid/graphics/Point;->y:I

    .line 125
    .line 126
    sub-int p1, p2, p1

    .line 127
    .line 128
    add-int/2addr v0, v1

    .line 129
    invoke-virtual {p3, v2, p1, v0, p2}, Landroid/graphics/Rect;->set(IIII)V

    .line 130
    .line 131
    .line 132
    goto :goto_3

    .line 133
    :pswitch_5
    iget v0, p2, Landroid/graphics/Point;->x:I

    .line 134
    .line 135
    div-int/lit8 v1, v1, 0x2

    .line 136
    .line 137
    sub-int v2, v0, v1

    .line 138
    .line 139
    iget p2, p2, Landroid/graphics/Point;->y:I

    .line 140
    .line 141
    div-int/lit8 p1, p1, 0x2

    .line 142
    .line 143
    sub-int v3, p2, p1

    .line 144
    .line 145
    add-int/2addr v0, v1

    .line 146
    add-int/2addr p2, p1

    .line 147
    invoke-virtual {p3, v2, v3, v0, p2}, Landroid/graphics/Rect;->set(IIII)V

    .line 148
    .line 149
    .line 150
    goto :goto_3

    .line 151
    :pswitch_6
    iget v0, p2, Landroid/graphics/Point;->x:I

    .line 152
    .line 153
    iget p2, p2, Landroid/graphics/Point;->y:I

    .line 154
    .line 155
    sub-int p1, p2, p1

    .line 156
    .line 157
    add-int/2addr v1, v0

    .line 158
    invoke-virtual {p3, v0, p1, v1, p2}, Landroid/graphics/Rect;->set(IIII)V

    .line 159
    .line 160
    .line 161
    goto :goto_3

    .line 162
    :pswitch_7
    iget v0, p2, Landroid/graphics/Point;->x:I

    .line 163
    .line 164
    iget p2, p2, Landroid/graphics/Point;->y:I

    .line 165
    .line 166
    add-int/2addr v1, v0

    .line 167
    add-int/2addr p1, p2

    .line 168
    invoke-virtual {p3, v0, p2, v1, p1}, Landroid/graphics/Rect;->set(IIII)V

    .line 169
    .line 170
    .line 171
    goto :goto_3

    .line 172
    :pswitch_8
    iget v0, p2, Landroid/graphics/Point;->x:I

    .line 173
    .line 174
    iget p2, p2, Landroid/graphics/Point;->y:I

    .line 175
    .line 176
    div-int/lit8 p1, p1, 0x2

    .line 177
    .line 178
    sub-int v2, p2, p1

    .line 179
    .line 180
    add-int/2addr v1, v0

    .line 181
    add-int/2addr p2, p1

    .line 182
    invoke-virtual {p3, v0, v2, v1, p2}, Landroid/graphics/Rect;->set(IIII)V

    .line 183
    .line 184
    .line 185
    goto :goto_3

    .line 186
    :pswitch_9
    iget v0, p2, Landroid/graphics/Point;->x:I

    .line 187
    .line 188
    div-int/lit8 v1, v1, 0x2

    .line 189
    .line 190
    sub-int v2, v0, v1

    .line 191
    .line 192
    iget p2, p2, Landroid/graphics/Point;->y:I

    .line 193
    .line 194
    div-int/lit8 p1, p1, 0x2

    .line 195
    .line 196
    sub-int v3, p2, p1

    .line 197
    .line 198
    add-int/2addr v0, v1

    .line 199
    add-int/2addr p2, p1

    .line 200
    invoke-virtual {p3, v2, v3, v0, p2}, Landroid/graphics/Rect;->set(IIII)V

    .line 201
    .line 202
    .line 203
    :goto_3
    return-object p3

    .line 204
    nop

    .line 205
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_9
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

.method protected abstract createItem(I)Lorg/osmdroid/views/overlay/OverlayItem;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TItem;"
        }
    .end annotation
.end method

.method public draw(Landroid/graphics/Canvas;Lorg/osmdroid/views/Projection;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lorg/osmdroid/views/overlay/ItemizedOverlay;->mPendingFocusChangedEvent:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lorg/osmdroid/views/overlay/ItemizedOverlay;->mOnFocusChangeListener:Lorg/osmdroid/views/overlay/ItemizedOverlay$OnFocusChangeListener;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lorg/osmdroid/views/overlay/ItemizedOverlay;->mFocusedItem:Lorg/osmdroid/views/overlay/OverlayItem;

    .line 10
    .line 11
    invoke-interface {v0, p0, v1}, Lorg/osmdroid/views/overlay/ItemizedOverlay$OnFocusChangeListener;->onFocusChanged(Lorg/osmdroid/views/overlay/ItemizedOverlay;Lorg/osmdroid/views/overlay/OverlayItem;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    iput-boolean v0, p0, Lorg/osmdroid/views/overlay/ItemizedOverlay;->mPendingFocusChangedEvent:Z

    .line 16
    .line 17
    iget-object v0, p0, Lorg/osmdroid/views/overlay/ItemizedOverlay;->mInternalItemList:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iget v1, p0, Lorg/osmdroid/views/overlay/ItemizedOverlay;->mDrawnItemsLimit:I

    .line 24
    .line 25
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iget-object v1, p0, Lorg/osmdroid/views/overlay/ItemizedOverlay;->mInternalItemDisplayedList:[Z

    .line 30
    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    array-length v1, v1

    .line 34
    if-eq v1, v0, :cond_2

    .line 35
    .line 36
    :cond_1
    new-array v1, v0, [Z

    .line 37
    .line 38
    iput-object v1, p0, Lorg/osmdroid/views/overlay/ItemizedOverlay;->mInternalItemDisplayedList:[Z

    .line 39
    .line 40
    :cond_2
    add-int/lit8 v0, v0, -0x1

    .line 41
    .line 42
    :goto_0
    if-ltz v0, :cond_4

    .line 43
    .line 44
    invoke-virtual {p0, v0}, Lorg/osmdroid/views/overlay/ItemizedOverlay;->getItem(I)Lorg/osmdroid/views/overlay/OverlayItem;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    if-nez v1, :cond_3

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_3
    invoke-virtual {v1}, Lorg/osmdroid/views/overlay/OverlayItem;->getPoint()Lorg/osmdroid/api/IGeoPoint;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    iget-object v3, p0, Lorg/osmdroid/views/overlay/ItemizedOverlay;->mCurScreenCoords:Landroid/graphics/Point;

    .line 56
    .line 57
    invoke-virtual {p2, v2, v3}, Lorg/osmdroid/views/Projection;->toPixels(Lorg/osmdroid/api/IGeoPoint;Landroid/graphics/Point;)Landroid/graphics/Point;

    .line 58
    .line 59
    .line 60
    iget-object v2, p0, Lorg/osmdroid/views/overlay/ItemizedOverlay;->mCurScreenCoords:Landroid/graphics/Point;

    .line 61
    .line 62
    iget-object v3, p0, Lorg/osmdroid/views/overlay/ItemizedOverlay;->itemRect:Landroid/graphics/Rect;

    .line 63
    .line 64
    invoke-virtual {p0, v1, v2, v3}, Lorg/osmdroid/views/overlay/ItemizedOverlay;->calculateItemRect(Lorg/osmdroid/views/overlay/OverlayItem;Landroid/graphics/Point;Landroid/graphics/Rect;)Landroid/graphics/Rect;

    .line 65
    .line 66
    .line 67
    iget-object v2, p0, Lorg/osmdroid/views/overlay/ItemizedOverlay;->mInternalItemDisplayedList:[Z

    .line 68
    .line 69
    iget-object v3, p0, Lorg/osmdroid/views/overlay/ItemizedOverlay;->mCurScreenCoords:Landroid/graphics/Point;

    .line 70
    .line 71
    invoke-virtual {p0, p1, v1, v3, p2}, Lorg/osmdroid/views/overlay/ItemizedOverlay;->onDrawItem(Landroid/graphics/Canvas;Lorg/osmdroid/views/overlay/OverlayItem;Landroid/graphics/Point;Lorg/osmdroid/views/Projection;)Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    aput-boolean v1, v2, v0

    .line 76
    .line 77
    :goto_1
    add-int/lit8 v0, v0, -0x1

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_4
    return-void
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method

.method protected getDefaultMarker(I)Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/overlay/ItemizedOverlay;->mDefaultMarker:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lorg/osmdroid/views/overlay/OverlayItem;->setState(Landroid/graphics/drawable/Drawable;I)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lorg/osmdroid/views/overlay/ItemizedOverlay;->mDefaultMarker:Landroid/graphics/drawable/Drawable;

    .line 7
    .line 8
    return-object p1
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
.end method

.method public getDisplayedItems()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "TItem;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lorg/osmdroid/views/overlay/ItemizedOverlay;->mInternalItemDisplayedList:[Z

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_0
    const/4 v1, 0x0

    .line 12
    :goto_0
    iget-object v2, p0, Lorg/osmdroid/views/overlay/ItemizedOverlay;->mInternalItemDisplayedList:[Z

    .line 13
    .line 14
    array-length v3, v2

    .line 15
    if-ge v1, v3, :cond_2

    .line 16
    .line 17
    aget-boolean v2, v2, v1

    .line 18
    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0, v1}, Lorg/osmdroid/views/overlay/ItemizedOverlay;->getItem(I)Lorg/osmdroid/views/overlay/OverlayItem;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    return-object v0
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

.method public getDrawnItemsLimit()I
    .locals 1

    iget v0, p0, Lorg/osmdroid/views/overlay/ItemizedOverlay;->mDrawnItemsLimit:I

    return v0
.end method

.method public getFocus()Lorg/osmdroid/views/overlay/OverlayItem;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TItem;"
        }
    .end annotation

    iget-object v0, p0, Lorg/osmdroid/views/overlay/ItemizedOverlay;->mFocusedItem:Lorg/osmdroid/views/overlay/OverlayItem;

    return-object v0
.end method

.method public final getItem(I)Lorg/osmdroid/views/overlay/OverlayItem;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TItem;"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lorg/osmdroid/views/overlay/ItemizedOverlay;->mInternalItemList:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/osmdroid/views/overlay/OverlayItem;
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const/4 p1, 0x0

    return-object p1
.end method

.method protected hitTest(Lorg/osmdroid/views/overlay/OverlayItem;Landroid/graphics/drawable/Drawable;II)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TItem;",
            "Landroid/graphics/drawable/Drawable;",
            "II)Z"
        }
    .end annotation

    invoke-virtual {p2}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object p1

    invoke-virtual {p1, p3, p4}, Landroid/graphics/Rect;->contains(II)Z

    move-result p1

    return p1
.end method

.method protected isEventOnItem(Lorg/osmdroid/views/overlay/OverlayItem;IILorg/osmdroid/views/MapView;)Z
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TItem;II",
            "Lorg/osmdroid/views/MapView;",
            ")Z"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-virtual {p4}, Lorg/osmdroid/views/MapView;->getProjection()Lorg/osmdroid/views/Projection;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p1}, Lorg/osmdroid/views/overlay/OverlayItem;->getPoint()Lorg/osmdroid/api/IGeoPoint;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iget-object v3, p0, Lorg/osmdroid/views/overlay/ItemizedOverlay;->mCurScreenCoords:Landroid/graphics/Point;

    .line 14
    .line 15
    invoke-virtual {v1, v2, v3}, Lorg/osmdroid/views/Projection;->toPixels(Lorg/osmdroid/api/IGeoPoint;Landroid/graphics/Point;)Landroid/graphics/Point;

    .line 16
    .line 17
    .line 18
    iget-boolean v1, p0, Lorg/osmdroid/views/overlay/ItemizedOverlay;->mDrawFocusedItem:Z

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    iget-object v1, p0, Lorg/osmdroid/views/overlay/ItemizedOverlay;->mFocusedItem:Lorg/osmdroid/views/overlay/OverlayItem;

    .line 23
    .line 24
    if-ne v1, p1, :cond_1

    .line 25
    .line 26
    const/4 v0, 0x4

    .line 27
    :cond_1
    invoke-virtual {p1, v0}, Lorg/osmdroid/views/overlay/OverlayItem;->getMarker(I)Landroid/graphics/drawable/Drawable;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    if-nez v1, :cond_2

    .line 32
    .line 33
    invoke-virtual {p0, v0}, Lorg/osmdroid/views/overlay/ItemizedOverlay;->getDefaultMarker(I)Landroid/graphics/drawable/Drawable;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    :cond_2
    invoke-virtual {p1}, Lorg/osmdroid/views/overlay/OverlayItem;->getMarkerHotspot()Lorg/osmdroid/views/overlay/OverlayItem$HotspotPlace;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p0, v1, p1}, Lorg/osmdroid/views/overlay/ItemizedOverlay;->boundToHotspot(Landroid/graphics/drawable/Drawable;Lorg/osmdroid/views/overlay/OverlayItem$HotspotPlace;)Landroid/graphics/drawable/Drawable;

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lorg/osmdroid/views/overlay/ItemizedOverlay;->mRect:Landroid/graphics/Rect;

    .line 45
    .line 46
    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->copyBounds(Landroid/graphics/Rect;)V

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Lorg/osmdroid/views/overlay/ItemizedOverlay;->mRect:Landroid/graphics/Rect;

    .line 50
    .line 51
    iget-object v0, p0, Lorg/osmdroid/views/overlay/ItemizedOverlay;->mCurScreenCoords:Landroid/graphics/Point;

    .line 52
    .line 53
    iget v1, v0, Landroid/graphics/Point;->x:I

    .line 54
    .line 55
    iget v0, v0, Landroid/graphics/Point;->y:I

    .line 56
    .line 57
    invoke-virtual {p1, v1, v0}, Landroid/graphics/Rect;->offset(II)V

    .line 58
    .line 59
    .line 60
    iget-object v2, p0, Lorg/osmdroid/views/overlay/ItemizedOverlay;->mRect:Landroid/graphics/Rect;

    .line 61
    .line 62
    iget-object p1, p0, Lorg/osmdroid/views/overlay/ItemizedOverlay;->mCurScreenCoords:Landroid/graphics/Point;

    .line 63
    .line 64
    iget v3, p1, Landroid/graphics/Point;->x:I

    .line 65
    .line 66
    iget v4, p1, Landroid/graphics/Point;->y:I

    .line 67
    .line 68
    invoke-virtual {p4}, Lorg/osmdroid/views/MapView;->getMapOrientation()F

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    neg-float p1, p1

    .line 73
    float-to-double v5, p1

    .line 74
    iget-object v7, p0, Lorg/osmdroid/views/overlay/ItemizedOverlay;->mOrientedMarkerRect:Landroid/graphics/Rect;

    .line 75
    .line 76
    invoke-static/range {v2 .. v7}, Lorg/osmdroid/util/RectL;->getBounds(Landroid/graphics/Rect;IIDLandroid/graphics/Rect;)Landroid/graphics/Rect;

    .line 77
    .line 78
    .line 79
    iget-object p1, p0, Lorg/osmdroid/views/overlay/ItemizedOverlay;->mOrientedMarkerRect:Landroid/graphics/Rect;

    .line 80
    .line 81
    invoke-virtual {p1, p2, p3}, Landroid/graphics/Rect;->contains(II)Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    return p1
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

.method public onDetach(Lorg/osmdroid/views/MapView;)V
    .locals 0

    return-void
.end method

.method protected onDrawItem(Landroid/graphics/Canvas;Lorg/osmdroid/views/overlay/OverlayItem;Landroid/graphics/Point;Lorg/osmdroid/views/Projection;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Canvas;",
            "TItem;",
            "Landroid/graphics/Point;",
            "Lorg/osmdroid/views/Projection;",
            ")Z"
        }
    .end annotation

    .line 1
    iget-boolean p3, p0, Lorg/osmdroid/views/overlay/ItemizedOverlay;->mDrawFocusedItem:Z

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    iget-object p3, p0, Lorg/osmdroid/views/overlay/ItemizedOverlay;->mFocusedItem:Lorg/osmdroid/views/overlay/OverlayItem;

    .line 6
    .line 7
    if-ne p3, p2, :cond_0

    .line 8
    .line 9
    const/4 p3, 0x4

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p3, 0x0

    .line 12
    :goto_0
    invoke-virtual {p2, p3}, Lorg/osmdroid/views/overlay/OverlayItem;->getMarker(I)Landroid/graphics/drawable/Drawable;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0, p3}, Lorg/osmdroid/views/overlay/ItemizedOverlay;->getDefaultMarker(I)Landroid/graphics/drawable/Drawable;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    invoke-virtual {p2, p3}, Lorg/osmdroid/views/overlay/OverlayItem;->getMarker(I)Landroid/graphics/drawable/Drawable;

    .line 24
    .line 25
    .line 26
    move-result-object p3

    .line 27
    :goto_1
    invoke-virtual {p2}, Lorg/osmdroid/views/overlay/OverlayItem;->getMarkerHotspot()Lorg/osmdroid/views/overlay/OverlayItem$HotspotPlace;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-virtual {p0, p3, p2}, Lorg/osmdroid/views/overlay/ItemizedOverlay;->boundToHotspot(Landroid/graphics/drawable/Drawable;Lorg/osmdroid/views/overlay/OverlayItem$HotspotPlace;)Landroid/graphics/drawable/Drawable;

    .line 32
    .line 33
    .line 34
    iget-object p2, p0, Lorg/osmdroid/views/overlay/ItemizedOverlay;->mCurScreenCoords:Landroid/graphics/Point;

    .line 35
    .line 36
    iget v6, p2, Landroid/graphics/Point;->x:I

    .line 37
    .line 38
    iget p2, p2, Landroid/graphics/Point;->y:I

    .line 39
    .line 40
    iget-object v0, p0, Lorg/osmdroid/views/overlay/ItemizedOverlay;->mRect:Landroid/graphics/Rect;

    .line 41
    .line 42
    invoke-virtual {p3, v0}, Landroid/graphics/drawable/Drawable;->copyBounds(Landroid/graphics/Rect;)V

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, Lorg/osmdroid/views/overlay/ItemizedOverlay;->mMarkerRect:Landroid/graphics/Rect;

    .line 46
    .line 47
    iget-object v1, p0, Lorg/osmdroid/views/overlay/ItemizedOverlay;->mRect:Landroid/graphics/Rect;

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, Lorg/osmdroid/views/overlay/ItemizedOverlay;->mRect:Landroid/graphics/Rect;

    .line 53
    .line 54
    invoke-virtual {v0, v6, p2}, Landroid/graphics/Rect;->offset(II)V

    .line 55
    .line 56
    .line 57
    iget-object v0, p0, Lorg/osmdroid/views/overlay/ItemizedOverlay;->mRect:Landroid/graphics/Rect;

    .line 58
    .line 59
    invoke-virtual {p4}, Lorg/osmdroid/views/Projection;->getOrientation()F

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    float-to-double v3, v1

    .line 64
    iget-object v5, p0, Lorg/osmdroid/views/overlay/ItemizedOverlay;->mOrientedMarkerRect:Landroid/graphics/Rect;

    .line 65
    .line 66
    move v1, v6

    .line 67
    move v2, p2

    .line 68
    invoke-static/range {v0 .. v5}, Lorg/osmdroid/util/RectL;->getBounds(Landroid/graphics/Rect;IIDLandroid/graphics/Rect;)Landroid/graphics/Rect;

    .line 69
    .line 70
    .line 71
    iget-object v0, p0, Lorg/osmdroid/views/overlay/ItemizedOverlay;->mOrientedMarkerRect:Landroid/graphics/Rect;

    .line 72
    .line 73
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getClipBounds()Landroid/graphics/Rect;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-static {v0, v1}, Landroid/graphics/Rect;->intersects(Landroid/graphics/Rect;Landroid/graphics/Rect;)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_4

    .line 82
    .line 83
    invoke-virtual {p4}, Lorg/osmdroid/views/Projection;->getOrientation()F

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    const/4 v2, 0x0

    .line 88
    cmpl-float v1, v1, v2

    .line 89
    .line 90
    if-eqz v1, :cond_2

    .line 91
    .line 92
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 93
    .line 94
    .line 95
    invoke-virtual {p4}, Lorg/osmdroid/views/Projection;->getOrientation()F

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    neg-float v1, v1

    .line 100
    int-to-float v3, v6

    .line 101
    int-to-float p2, p2

    .line 102
    invoke-virtual {p1, v1, v3, p2}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 103
    .line 104
    .line 105
    :cond_2
    iget-object p2, p0, Lorg/osmdroid/views/overlay/ItemizedOverlay;->mRect:Landroid/graphics/Rect;

    .line 106
    .line 107
    invoke-virtual {p3, p2}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p3, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p4}, Lorg/osmdroid/views/Projection;->getOrientation()F

    .line 114
    .line 115
    .line 116
    move-result p2

    .line 117
    cmpl-float p2, p2, v2

    .line 118
    .line 119
    if-eqz p2, :cond_3

    .line 120
    .line 121
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 122
    .line 123
    .line 124
    :cond_3
    iget-object p1, p0, Lorg/osmdroid/views/overlay/ItemizedOverlay;->mMarkerRect:Landroid/graphics/Rect;

    .line 125
    .line 126
    invoke-virtual {p3, p1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 127
    .line 128
    .line 129
    :cond_4
    return v0
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

.method public onSingleTapConfirmed(Landroid/view/MotionEvent;Lorg/osmdroid/views/MapView;)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Lorg/osmdroid/views/overlay/ItemizedOverlay;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/4 v3, 0x0

    .line 22
    :goto_0
    if-ge v3, v0, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0, v3}, Lorg/osmdroid/views/overlay/ItemizedOverlay;->getItem(I)Lorg/osmdroid/views/overlay/OverlayItem;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-virtual {p0, v4, v1, v2, p2}, Lorg/osmdroid/views/overlay/ItemizedOverlay;->isEventOnItem(Lorg/osmdroid/views/overlay/OverlayItem;IILorg/osmdroid/views/MapView;)Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-eqz v4, :cond_0

    .line 33
    .line 34
    invoke-virtual {p0, v3}, Lorg/osmdroid/views/overlay/ItemizedOverlay;->onTap(I)Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-eqz v4, :cond_0

    .line 39
    .line 40
    const/4 p1, 0x1

    .line 41
    return p1

    .line 42
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    invoke-super {p0, p1, p2}, Lorg/osmdroid/views/overlay/Overlay;->onSingleTapConfirmed(Landroid/view/MotionEvent;Lorg/osmdroid/views/MapView;)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    return p1
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

.method protected onTap(I)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method protected final populate()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lorg/osmdroid/views/overlay/ItemizedOverlay;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lorg/osmdroid/views/overlay/ItemizedOverlay;->mInternalItemList:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Lorg/osmdroid/views/overlay/ItemizedOverlay;->mInternalItemList:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->ensureCapacity(I)V

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    :goto_0
    if-ge v1, v0, :cond_0

    .line 17
    .line 18
    iget-object v2, p0, Lorg/osmdroid/views/overlay/ItemizedOverlay;->mInternalItemList:Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {p0, v1}, Lorg/osmdroid/views/overlay/ItemizedOverlay;->createItem(I)Lorg/osmdroid/views/overlay/OverlayItem;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    add-int/lit8 v1, v1, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v0, 0x0

    .line 31
    iput-object v0, p0, Lorg/osmdroid/views/overlay/ItemizedOverlay;->mInternalItemDisplayedList:[Z

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
.end method

.method public setDrawFocusedItem(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/osmdroid/views/overlay/ItemizedOverlay;->mDrawFocusedItem:Z

    return-void
.end method

.method public setDrawnItemsLimit(I)V
    .locals 0

    iput p1, p0, Lorg/osmdroid/views/overlay/ItemizedOverlay;->mDrawnItemsLimit:I

    return-void
.end method

.method public setFocus(Lorg/osmdroid/views/overlay/OverlayItem;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TItem;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/overlay/ItemizedOverlay;->mFocusedItem:Lorg/osmdroid/views/overlay/OverlayItem;

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    iput-boolean v0, p0, Lorg/osmdroid/views/overlay/ItemizedOverlay;->mPendingFocusChangedEvent:Z

    .line 9
    .line 10
    iput-object p1, p0, Lorg/osmdroid/views/overlay/ItemizedOverlay;->mFocusedItem:Lorg/osmdroid/views/overlay/OverlayItem;

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
.end method

.method public setOnFocusChangeListener(Lorg/osmdroid/views/overlay/ItemizedOverlay$OnFocusChangeListener;)V
    .locals 0

    iput-object p1, p0, Lorg/osmdroid/views/overlay/ItemizedOverlay;->mOnFocusChangeListener:Lorg/osmdroid/views/overlay/ItemizedOverlay$OnFocusChangeListener;

    return-void
.end method

.method public abstract size()I
.end method
