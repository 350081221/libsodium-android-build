.class final Landroidx/compose/foundation/AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$3;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/AndroidExternalSurface_androidKt;->AndroidEmbeddedExternalSurface-sv6N_fY(Landroidx/compose/ui/Modifier;ZJ[FLv3/l;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Landroid/view/TextureView;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Landroid/view/TextureView;",
        "view",
        "Lkotlin/r2;",
        "invoke",
        "(Landroid/view/TextureView;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nAndroidExternalSurface.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidExternalSurface.android.kt\nandroidx/compose/foundation/AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,480:1\n1#2:481\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $isOpaque:Z

.field final synthetic $state:Landroidx/compose/foundation/AndroidEmbeddedExternalSurfaceState;

.field final synthetic $surfaceSize:J

.field final synthetic $transform:[F


# direct methods
.method constructor <init>(JLandroidx/compose/foundation/AndroidEmbeddedExternalSurfaceState;Z[F)V
    .locals 0

    iput-wide p1, p0, Landroidx/compose/foundation/AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$3;->$surfaceSize:J

    iput-object p3, p0, Landroidx/compose/foundation/AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$3;->$state:Landroidx/compose/foundation/AndroidEmbeddedExternalSurfaceState;

    iput-boolean p4, p0, Landroidx/compose/foundation/AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$3;->$isOpaque:Z

    iput-object p5, p0, Landroidx/compose/foundation/AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$3;->$transform:[F

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroid/view/TextureView;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$3;->invoke(Landroid/view/TextureView;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroid/view/TextureView;)V
    .locals 4
    .param p1    # Landroid/view/TextureView;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 2
    iget-wide v0, p0, Landroidx/compose/foundation/AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$3;->$surfaceSize:J

    sget-object v2, Landroidx/compose/ui/unit/IntSize;->Companion:Landroidx/compose/ui/unit/IntSize$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/unit/IntSize$Companion;->getZero-YbymL2g()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Landroidx/compose/ui/unit/IntSize;->equals-impl0(JJ)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    invoke-virtual {p1}, Landroid/view/TextureView;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-wide v1, p0, Landroidx/compose/foundation/AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$3;->$surfaceSize:J

    invoke-static {v1, v2}, Landroidx/compose/ui/unit/IntSize;->getWidth-impl(J)I

    move-result v1

    iget-wide v2, p0, Landroidx/compose/foundation/AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$3;->$surfaceSize:J

    invoke-static {v2, v3}, Landroidx/compose/ui/unit/IntSize;->getHeight-impl(J)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    .line 4
    :cond_0
    iget-object v0, p0, Landroidx/compose/foundation/AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$3;->$state:Landroidx/compose/foundation/AndroidEmbeddedExternalSurfaceState;

    iget-wide v1, p0, Landroidx/compose/foundation/AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$3;->$surfaceSize:J

    invoke-virtual {v0, v1, v2}, Landroidx/compose/foundation/AndroidEmbeddedExternalSurfaceState;->setSurfaceSize-ozmzZPI(J)V

    .line 5
    iget-boolean v0, p0, Landroidx/compose/foundation/AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$3;->$isOpaque:Z

    invoke-virtual {p1, v0}, Landroid/view/TextureView;->setOpaque(Z)V

    .line 6
    iget-object v0, p0, Landroidx/compose/foundation/AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$3;->$transform:[F

    if-eqz v0, :cond_1

    iget-object v1, p0, Landroidx/compose/foundation/AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$3;->$state:Landroidx/compose/foundation/AndroidEmbeddedExternalSurfaceState;

    invoke-virtual {v1}, Landroidx/compose/foundation/AndroidEmbeddedExternalSurfaceState;->getMatrix()Landroid/graphics/Matrix;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/compose/ui/graphics/AndroidMatrixConversions_androidKt;->setFrom-EL8BTi8(Landroid/graphics/Matrix;[F)V

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p1, v1}, Landroid/view/TextureView;->setTransform(Landroid/graphics/Matrix;)V

    return-void
.end method
