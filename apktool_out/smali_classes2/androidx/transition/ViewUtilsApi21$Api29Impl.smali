.class Landroidx/transition/ViewUtilsApi21$Api29Impl;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/RequiresApi;
    value = 0x1d
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/transition/ViewUtilsApi21;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "Api29Impl"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static setAnimationMatrix(Landroid/view/View;Landroid/graphics/Matrix;)V
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    invoke-static {p0, p1}, Landroidx/transition/p;->a(Landroid/view/View;Landroid/graphics/Matrix;)V

    return-void
.end method

.method static transformMatrixToGlobal(Landroid/view/View;Landroid/graphics/Matrix;)V
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    invoke-static {p0, p1}, Landroidx/compose/ui/platform/y;->a(Landroid/view/View;Landroid/graphics/Matrix;)V

    return-void
.end method

.method static transformMatrixToLocal(Landroid/view/View;Landroid/graphics/Matrix;)V
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    invoke-static {p0, p1}, Landroidx/transition/o;->a(Landroid/view/View;Landroid/graphics/Matrix;)V

    return-void
.end method
