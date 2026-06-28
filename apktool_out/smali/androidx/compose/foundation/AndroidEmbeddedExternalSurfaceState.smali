.class final Landroidx/compose/foundation/AndroidEmbeddedExternalSurfaceState;
.super Landroidx/compose/foundation/BaseAndroidExternalSurfaceState;
.source "SourceFile"

# interfaces
.implements Landroid/view/TextureView$SurfaceTextureListener;


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u00a2\u0006\u0004\u0008 \u0010!J \u0010\t\u001a\u00020\u00082\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J \u0010\n\u001a\u00020\u00082\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\u0010\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u000e\u001a\u00020\u00082\u0006\u0010\r\u001a\u00020\u0003H\u0016R(\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0012\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013\"\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\u0017\u001a\u00020\u00168\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001d\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006\""
    }
    d2 = {
        "Landroidx/compose/foundation/AndroidEmbeddedExternalSurfaceState;",
        "Landroidx/compose/foundation/BaseAndroidExternalSurfaceState;",
        "Landroid/view/TextureView$SurfaceTextureListener;",
        "Landroid/graphics/SurfaceTexture;",
        "surfaceTexture",
        "",
        "width",
        "height",
        "Lkotlin/r2;",
        "onSurfaceTextureAvailable",
        "onSurfaceTextureSizeChanged",
        "",
        "onSurfaceTextureDestroyed",
        "surface",
        "onSurfaceTextureUpdated",
        "Landroidx/compose/ui/unit/IntSize;",
        "surfaceSize",
        "J",
        "getSurfaceSize-YbymL2g",
        "()J",
        "setSurfaceSize-ozmzZPI",
        "(J)V",
        "Landroid/graphics/Matrix;",
        "matrix",
        "Landroid/graphics/Matrix;",
        "getMatrix",
        "()Landroid/graphics/Matrix;",
        "Landroid/view/Surface;",
        "surfaceTextureSurface",
        "Landroid/view/Surface;",
        "Lkotlinx/coroutines/s0;",
        "scope",
        "<init>",
        "(Lkotlinx/coroutines/s0;)V",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final matrix:Landroid/graphics/Matrix;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private surfaceSize:J

.field private surfaceTextureSurface:Landroid/view/Surface;
    .annotation build Lp4/m;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/s0;)V
    .locals 2
    .param p1    # Lkotlinx/coroutines/s0;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p1}, Landroidx/compose/foundation/BaseAndroidExternalSurfaceState;-><init>(Lkotlinx/coroutines/s0;)V

    .line 2
    .line 3
    .line 4
    sget-object p1, Landroidx/compose/ui/unit/IntSize;->Companion:Landroidx/compose/ui/unit/IntSize$Companion;

    .line 5
    .line 6
    invoke-virtual {p1}, Landroidx/compose/ui/unit/IntSize$Companion;->getZero-YbymL2g()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    iput-wide v0, p0, Landroidx/compose/foundation/AndroidEmbeddedExternalSurfaceState;->surfaceSize:J

    .line 11
    .line 12
    new-instance p1, Landroid/graphics/Matrix;

    .line 13
    .line 14
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Landroidx/compose/foundation/AndroidEmbeddedExternalSurfaceState;->matrix:Landroid/graphics/Matrix;

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
.end method


# virtual methods
.method public final getMatrix()Landroid/graphics/Matrix;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/AndroidEmbeddedExternalSurfaceState;->matrix:Landroid/graphics/Matrix;

    return-object v0
.end method

.method public final getSurfaceSize-YbymL2g()J
    .locals 2

    iget-wide v0, p0, Landroidx/compose/foundation/AndroidEmbeddedExternalSurfaceState;->surfaceSize:J

    return-wide v0
.end method

.method public onSurfaceTextureAvailable(Landroid/graphics/SurfaceTexture;II)V
    .locals 4
    .param p1    # Landroid/graphics/SurfaceTexture;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    iget-wide v0, p0, Landroidx/compose/foundation/AndroidEmbeddedExternalSurfaceState;->surfaceSize:J

    .line 2
    .line 3
    sget-object v2, Landroidx/compose/ui/unit/IntSize;->Companion:Landroidx/compose/ui/unit/IntSize$Companion;

    .line 4
    .line 5
    invoke-virtual {v2}, Landroidx/compose/ui/unit/IntSize$Companion;->getZero-YbymL2g()J

    .line 6
    .line 7
    .line 8
    move-result-wide v2

    .line 9
    invoke-static {v0, v1, v2, v3}, Landroidx/compose/ui/unit/IntSize;->equals-impl0(JJ)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget-wide p2, p0, Landroidx/compose/foundation/AndroidEmbeddedExternalSurfaceState;->surfaceSize:J

    .line 16
    .line 17
    invoke-static {p2, p3}, Landroidx/compose/ui/unit/IntSize;->getWidth-impl(J)I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    iget-wide v0, p0, Landroidx/compose/foundation/AndroidEmbeddedExternalSurfaceState;->surfaceSize:J

    .line 22
    .line 23
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/IntSize;->getHeight-impl(J)I

    .line 24
    .line 25
    .line 26
    move-result p3

    .line 27
    invoke-virtual {p1, p2, p3}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    .line 28
    .line 29
    .line 30
    :cond_0
    new-instance v0, Landroid/view/Surface;

    .line 31
    .line 32
    invoke-direct {v0, p1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Landroidx/compose/foundation/AndroidEmbeddedExternalSurfaceState;->surfaceTextureSurface:Landroid/view/Surface;

    .line 36
    .line 37
    invoke-virtual {p0, v0, p2, p3}, Landroidx/compose/foundation/BaseAndroidExternalSurfaceState;->dispatchSurfaceCreated(Landroid/view/Surface;II)V

    .line 38
    .line 39
    .line 40
    return-void
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
.end method

.method public onSurfaceTextureDestroyed(Landroid/graphics/SurfaceTexture;)Z
    .locals 0
    .param p1    # Landroid/graphics/SurfaceTexture;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    iget-object p1, p0, Landroidx/compose/foundation/AndroidEmbeddedExternalSurfaceState;->surfaceTextureSurface:Landroid/view/Surface;

    .line 2
    .line 3
    invoke-static {p1}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/BaseAndroidExternalSurfaceState;->dispatchSurfaceDestroyed(Landroid/view/Surface;)V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    iput-object p1, p0, Landroidx/compose/foundation/AndroidEmbeddedExternalSurfaceState;->surfaceTextureSurface:Landroid/view/Surface;

    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    return p1
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
.end method

.method public onSurfaceTextureSizeChanged(Landroid/graphics/SurfaceTexture;II)V
    .locals 4
    .param p1    # Landroid/graphics/SurfaceTexture;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    iget-wide v0, p0, Landroidx/compose/foundation/AndroidEmbeddedExternalSurfaceState;->surfaceSize:J

    .line 2
    .line 3
    sget-object v2, Landroidx/compose/ui/unit/IntSize;->Companion:Landroidx/compose/ui/unit/IntSize$Companion;

    .line 4
    .line 5
    invoke-virtual {v2}, Landroidx/compose/ui/unit/IntSize$Companion;->getZero-YbymL2g()J

    .line 6
    .line 7
    .line 8
    move-result-wide v2

    .line 9
    invoke-static {v0, v1, v2, v3}, Landroidx/compose/ui/unit/IntSize;->equals-impl0(JJ)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget-wide p2, p0, Landroidx/compose/foundation/AndroidEmbeddedExternalSurfaceState;->surfaceSize:J

    .line 16
    .line 17
    invoke-static {p2, p3}, Landroidx/compose/ui/unit/IntSize;->getWidth-impl(J)I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    iget-wide v0, p0, Landroidx/compose/foundation/AndroidEmbeddedExternalSurfaceState;->surfaceSize:J

    .line 22
    .line 23
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/IntSize;->getHeight-impl(J)I

    .line 24
    .line 25
    .line 26
    move-result p3

    .line 27
    invoke-virtual {p1, p2, p3}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    .line 28
    .line 29
    .line 30
    :cond_0
    iget-object p1, p0, Landroidx/compose/foundation/AndroidEmbeddedExternalSurfaceState;->surfaceTextureSurface:Landroid/view/Surface;

    .line 31
    .line 32
    invoke-static {p1}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/foundation/BaseAndroidExternalSurfaceState;->dispatchSurfaceChanged(Landroid/view/Surface;II)V

    .line 36
    .line 37
    .line 38
    return-void
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
.end method

.method public onSurfaceTextureUpdated(Landroid/graphics/SurfaceTexture;)V
    .locals 0
    .param p1    # Landroid/graphics/SurfaceTexture;
        .annotation build Lp4/l;
        .end annotation
    .end param

    return-void
.end method

.method public final setSurfaceSize-ozmzZPI(J)V
    .locals 0

    iput-wide p1, p0, Landroidx/compose/foundation/AndroidEmbeddedExternalSurfaceState;->surfaceSize:J

    return-void
.end method
