.class final Lorg/burnoutcrew/reorderable/f$d;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/burnoutcrew/reorderable/f;->c(Lorg/burnoutcrew/reorderable/l;Ljava/lang/Object;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;ZLjava/lang/Integer;Lv3/r;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Landroidx/compose/ui/graphics/GraphicsLayerScope;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $orientationLocked:Z

.field final synthetic $state:Lorg/burnoutcrew/reorderable/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/burnoutcrew/reorderable/l<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(ZLorg/burnoutcrew/reorderable/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lorg/burnoutcrew/reorderable/l<",
            "*>;)V"
        }
    .end annotation

    iput-boolean p1, p0, Lorg/burnoutcrew/reorderable/f$d;->$orientationLocked:Z

    iput-object p2, p0, Lorg/burnoutcrew/reorderable/f$d;->$state:Lorg/burnoutcrew/reorderable/l;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/graphics/GraphicsLayerScope;

    invoke-virtual {p0, p1}, Lorg/burnoutcrew/reorderable/f$d;->invoke(Landroidx/compose/ui/graphics/GraphicsLayerScope;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/ui/graphics/GraphicsLayerScope;)V
    .locals 2
    .param p1    # Landroidx/compose/ui/graphics/GraphicsLayerScope;
        .annotation build Lp4/l;
        .end annotation
    .end param

    const-string v0, "$this$graphicsLayer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-boolean v0, p0, Lorg/burnoutcrew/reorderable/f$d;->$orientationLocked:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lorg/burnoutcrew/reorderable/f$d;->$state:Lorg/burnoutcrew/reorderable/l;

    invoke-virtual {v0}, Lorg/burnoutcrew/reorderable/l;->I()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move v0, v1

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lorg/burnoutcrew/reorderable/f$d;->$state:Lorg/burnoutcrew/reorderable/l;

    invoke-virtual {v0}, Lorg/burnoutcrew/reorderable/l;->q()F

    move-result v0

    :goto_1
    invoke-interface {p1, v0}, Landroidx/compose/ui/graphics/GraphicsLayerScope;->setTranslationX(F)V

    .line 3
    iget-boolean v0, p0, Lorg/burnoutcrew/reorderable/f$d;->$orientationLocked:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lorg/burnoutcrew/reorderable/f$d;->$state:Lorg/burnoutcrew/reorderable/l;

    invoke-virtual {v0}, Lorg/burnoutcrew/reorderable/l;->I()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    iget-object v0, p0, Lorg/burnoutcrew/reorderable/f$d;->$state:Lorg/burnoutcrew/reorderable/l;

    invoke-virtual {v0}, Lorg/burnoutcrew/reorderable/l;->r()F

    move-result v1

    :cond_3
    invoke-interface {p1, v1}, Landroidx/compose/ui/graphics/GraphicsLayerScope;->setTranslationY(F)V

    return-void
.end method
