.class public Lorg/osmdroid/views/overlay/gestures/RotationGestureOverlay;
.super Lorg/osmdroid/views/overlay/Overlay;
.source "SourceFile"

# interfaces
.implements Lorg/osmdroid/views/overlay/gestures/RotationGestureDetector$RotationListener;
.implements Lorg/osmdroid/views/overlay/IOverlayMenuProvider;


# static fields
.field private static final MENU_ENABLED:I

.field private static final MENU_ROTATE_CCW:I

.field private static final MENU_ROTATE_CW:I

.field private static final SHOW_ROTATE_MENU_ITEMS:Z = false


# instance fields
.field currentAngle:F

.field final deltaTime:J

.field private mMapView:Lorg/osmdroid/views/MapView;

.field private mOptionsMenuEnabled:Z

.field private final mRotationDetector:Lorg/osmdroid/views/overlay/gestures/RotationGestureDetector;

.field timeLastSet:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, Lorg/osmdroid/views/overlay/Overlay;->getSafeMenuId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sput v0, Lorg/osmdroid/views/overlay/gestures/RotationGestureOverlay;->MENU_ENABLED:I

    .line 6
    .line 7
    invoke-static {}, Lorg/osmdroid/views/overlay/Overlay;->getSafeMenuId()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    sput v0, Lorg/osmdroid/views/overlay/gestures/RotationGestureOverlay;->MENU_ROTATE_CCW:I

    .line 12
    .line 13
    invoke-static {}, Lorg/osmdroid/views/overlay/Overlay;->getSafeMenuId()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    sput v0, Lorg/osmdroid/views/overlay/gestures/RotationGestureOverlay;->MENU_ROTATE_CW:I

    .line 18
    .line 19
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

.method public constructor <init>(Landroid/content/Context;Lorg/osmdroid/views/MapView;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-direct {p0, p2}, Lorg/osmdroid/views/overlay/gestures/RotationGestureOverlay;-><init>(Lorg/osmdroid/views/MapView;)V

    return-void
.end method

.method public constructor <init>(Lorg/osmdroid/views/MapView;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Lorg/osmdroid/views/overlay/Overlay;-><init>()V

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lorg/osmdroid/views/overlay/gestures/RotationGestureOverlay;->mOptionsMenuEnabled:Z

    const-wide/16 v0, 0x0

    .line 4
    iput-wide v0, p0, Lorg/osmdroid/views/overlay/gestures/RotationGestureOverlay;->timeLastSet:J

    const-wide/16 v0, 0x19

    .line 5
    iput-wide v0, p0, Lorg/osmdroid/views/overlay/gestures/RotationGestureOverlay;->deltaTime:J

    const/4 v0, 0x0

    .line 6
    iput v0, p0, Lorg/osmdroid/views/overlay/gestures/RotationGestureOverlay;->currentAngle:F

    .line 7
    iput-object p1, p0, Lorg/osmdroid/views/overlay/gestures/RotationGestureOverlay;->mMapView:Lorg/osmdroid/views/MapView;

    .line 8
    new-instance p1, Lorg/osmdroid/views/overlay/gestures/RotationGestureDetector;

    invoke-direct {p1, p0}, Lorg/osmdroid/views/overlay/gestures/RotationGestureDetector;-><init>(Lorg/osmdroid/views/overlay/gestures/RotationGestureDetector$RotationListener;)V

    iput-object p1, p0, Lorg/osmdroid/views/overlay/gestures/RotationGestureOverlay;->mRotationDetector:Lorg/osmdroid/views/overlay/gestures/RotationGestureDetector;

    return-void
.end method


# virtual methods
.method public isOptionsMenuEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lorg/osmdroid/views/overlay/gestures/RotationGestureOverlay;->mOptionsMenuEnabled:Z

    return v0
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;ILorg/osmdroid/views/MapView;)Z
    .locals 1

    sget p3, Lorg/osmdroid/views/overlay/gestures/RotationGestureOverlay;->MENU_ENABLED:I

    add-int/2addr p3, p2

    const-string p2, "Enable rotation"

    const/4 v0, 0x0

    invoke-interface {p1, v0, p3, v0, p2}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object p1

    const p2, 0x1080041

    invoke-interface {p1, p2}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    const/4 p1, 0x1

    return p1
.end method

.method public onDetach(Lorg/osmdroid/views/MapView;)V
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Lorg/osmdroid/views/overlay/gestures/RotationGestureOverlay;->mMapView:Lorg/osmdroid/views/MapView;

    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;ILorg/osmdroid/views/MapView;)Z
    .locals 3

    .line 1
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 2
    .line 3
    .line 4
    move-result p3

    .line 5
    sget v0, Lorg/osmdroid/views/overlay/gestures/RotationGestureOverlay;->MENU_ENABLED:I

    .line 6
    .line 7
    add-int/2addr v0, p2

    .line 8
    const/4 v1, 0x0

    .line 9
    if-ne p3, v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, Lorg/osmdroid/views/overlay/Overlay;->isEnabled()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    iget-object p1, p0, Lorg/osmdroid/views/overlay/gestures/RotationGestureOverlay;->mMapView:Lorg/osmdroid/views/MapView;

    .line 18
    .line 19
    const/4 p2, 0x0

    .line 20
    invoke-virtual {p1, p2}, Lorg/osmdroid/views/MapView;->setMapOrientation(F)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v1}, Lorg/osmdroid/views/overlay/gestures/RotationGestureOverlay;->setEnabled(Z)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 p1, 0x1

    .line 28
    invoke-virtual {p0, p1}, Lorg/osmdroid/views/overlay/gestures/RotationGestureOverlay;->setEnabled(Z)V

    .line 29
    .line 30
    .line 31
    return p1

    .line 32
    :cond_1
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 33
    .line 34
    .line 35
    move-result p3

    .line 36
    sget v0, Lorg/osmdroid/views/overlay/gestures/RotationGestureOverlay;->MENU_ROTATE_CCW:I

    .line 37
    .line 38
    add-int/2addr v0, p2

    .line 39
    const/high16 v2, 0x41200000    # 10.0f

    .line 40
    .line 41
    if-ne p3, v0, :cond_2

    .line 42
    .line 43
    iget-object p1, p0, Lorg/osmdroid/views/overlay/gestures/RotationGestureOverlay;->mMapView:Lorg/osmdroid/views/MapView;

    .line 44
    .line 45
    invoke-virtual {p1}, Lorg/osmdroid/views/MapView;->getMapOrientation()F

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    sub-float/2addr p2, v2

    .line 50
    invoke-virtual {p1, p2}, Lorg/osmdroid/views/MapView;->setMapOrientation(F)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    sget p3, Lorg/osmdroid/views/overlay/gestures/RotationGestureOverlay;->MENU_ROTATE_CW:I

    .line 59
    .line 60
    add-int/2addr p3, p2

    .line 61
    if-ne p1, p3, :cond_3

    .line 62
    .line 63
    iget-object p1, p0, Lorg/osmdroid/views/overlay/gestures/RotationGestureOverlay;->mMapView:Lorg/osmdroid/views/MapView;

    .line 64
    .line 65
    invoke-virtual {p1}, Lorg/osmdroid/views/MapView;->getMapOrientation()F

    .line 66
    .line 67
    .line 68
    move-result p2

    .line 69
    add-float/2addr p2, v2

    .line 70
    invoke-virtual {p1, p2}, Lorg/osmdroid/views/MapView;->setMapOrientation(F)V

    .line 71
    .line 72
    .line 73
    :cond_3
    :goto_0
    return v1
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

.method public onPrepareOptionsMenu(Landroid/view/Menu;ILorg/osmdroid/views/MapView;)Z
    .locals 0

    .line 1
    sget p3, Lorg/osmdroid/views/overlay/gestures/RotationGestureOverlay;->MENU_ENABLED:I

    .line 2
    .line 3
    add-int/2addr p3, p2

    .line 4
    invoke-interface {p1, p3}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p0}, Lorg/osmdroid/views/overlay/Overlay;->isEnabled()Z

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    if-eqz p2, :cond_0

    .line 13
    .line 14
    const-string p2, "Disable rotation"

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const-string p2, "Enable rotation"

    .line 18
    .line 19
    :goto_0
    invoke-interface {p1, p2}, Landroid/view/MenuItem;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x0

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

.method public onRotate(F)V
    .locals 4

    .line 1
    iget v0, p0, Lorg/osmdroid/views/overlay/gestures/RotationGestureOverlay;->currentAngle:F

    .line 2
    .line 3
    add-float/2addr v0, p1

    .line 4
    iput v0, p0, Lorg/osmdroid/views/overlay/gestures/RotationGestureOverlay;->currentAngle:F

    .line 5
    .line 6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    const-wide/16 v2, 0x19

    .line 11
    .line 12
    sub-long/2addr v0, v2

    .line 13
    iget-wide v2, p0, Lorg/osmdroid/views/overlay/gestures/RotationGestureOverlay;->timeLastSet:J

    .line 14
    .line 15
    cmp-long p1, v0, v2

    .line 16
    .line 17
    if-lez p1, :cond_0

    .line 18
    .line 19
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    iput-wide v0, p0, Lorg/osmdroid/views/overlay/gestures/RotationGestureOverlay;->timeLastSet:J

    .line 24
    .line 25
    iget-object p1, p0, Lorg/osmdroid/views/overlay/gestures/RotationGestureOverlay;->mMapView:Lorg/osmdroid/views/MapView;

    .line 26
    .line 27
    invoke-virtual {p1}, Lorg/osmdroid/views/MapView;->getMapOrientation()F

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    iget v1, p0, Lorg/osmdroid/views/overlay/gestures/RotationGestureOverlay;->currentAngle:F

    .line 32
    .line 33
    add-float/2addr v0, v1

    .line 34
    invoke-virtual {p1, v0}, Lorg/osmdroid/views/MapView;->setMapOrientation(F)V

    .line 35
    .line 36
    .line 37
    :cond_0
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

.method public onTouchEvent(Landroid/view/MotionEvent;Lorg/osmdroid/views/MapView;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/overlay/gestures/RotationGestureOverlay;->mRotationDetector:Lorg/osmdroid/views/overlay/gestures/RotationGestureDetector;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lorg/osmdroid/views/overlay/gestures/RotationGestureDetector;->onTouch(Landroid/view/MotionEvent;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Lorg/osmdroid/views/overlay/Overlay;->onTouchEvent(Landroid/view/MotionEvent;Lorg/osmdroid/views/MapView;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1
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

.method public setEnabled(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/overlay/gestures/RotationGestureOverlay;->mRotationDetector:Lorg/osmdroid/views/overlay/gestures/RotationGestureDetector;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lorg/osmdroid/views/overlay/gestures/RotationGestureDetector;->setEnabled(Z)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lorg/osmdroid/views/overlay/Overlay;->setEnabled(Z)V

    .line 7
    .line 8
    .line 9
    return-void
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

.method public setOptionsMenuEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/osmdroid/views/overlay/gestures/RotationGestureOverlay;->mOptionsMenuEnabled:Z

    return-void
.end method
