.class Lcom/google/android/material/textfield/CutoutDrawable$ImplApi18;
.super Lcom/google/android/material/textfield/CutoutDrawable;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x12
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/material/textfield/CutoutDrawable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "ImplApi18"
.end annotation


# direct methods
.method constructor <init>(Lcom/google/android/material/textfield/CutoutDrawable$CutoutDrawableState;)V
    .locals 1
    .param p1    # Lcom/google/android/material/textfield/CutoutDrawable$CutoutDrawableState;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/android/material/textfield/CutoutDrawable;-><init>(Lcom/google/android/material/textfield/CutoutDrawable$CutoutDrawableState;Lcom/google/android/material/textfield/CutoutDrawable$1;)V

    return-void
.end method


# virtual methods
.method protected drawStrokeShape(Landroid/graphics/Canvas;)V
    .locals 2
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/CutoutDrawable;->drawableState:Lcom/google/android/material/textfield/CutoutDrawable$CutoutDrawableState;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/google/android/material/textfield/CutoutDrawable$CutoutDrawableState;->access$200(Lcom/google/android/material/textfield/CutoutDrawable$CutoutDrawableState;)Landroid/graphics/RectF;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/graphics/RectF;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-super {p0, p1}, Lcom/google/android/material/shape/MaterialShapeDrawable;->drawStrokeShape(Landroid/graphics/Canvas;)V

    .line 14
    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 18
    .line 19
    .line 20
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 21
    .line 22
    const/16 v1, 0x1a

    .line 23
    .line 24
    if-lt v0, v1, :cond_1

    .line 25
    .line 26
    iget-object v0, p0, Lcom/google/android/material/textfield/CutoutDrawable;->drawableState:Lcom/google/android/material/textfield/CutoutDrawable$CutoutDrawableState;

    .line 27
    .line 28
    invoke-static {v0}, Lcom/google/android/material/textfield/CutoutDrawable$CutoutDrawableState;->access$200(Lcom/google/android/material/textfield/CutoutDrawable$CutoutDrawableState;)Landroid/graphics/RectF;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {p1, v0}, Landroidx/compose/ui/text/android/m;->a(Landroid/graphics/Canvas;Landroid/graphics/RectF;)Z

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    iget-object v0, p0, Lcom/google/android/material/textfield/CutoutDrawable;->drawableState:Lcom/google/android/material/textfield/CutoutDrawable$CutoutDrawableState;

    .line 37
    .line 38
    invoke-static {v0}, Lcom/google/android/material/textfield/CutoutDrawable$CutoutDrawableState;->access$200(Lcom/google/android/material/textfield/CutoutDrawable$CutoutDrawableState;)Landroid/graphics/RectF;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    sget-object v1, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    .line 43
    .line 44
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/RectF;Landroid/graphics/Region$Op;)Z

    .line 45
    .line 46
    .line 47
    :goto_0
    invoke-super {p0, p1}, Lcom/google/android/material/shape/MaterialShapeDrawable;->drawStrokeShape(Landroid/graphics/Canvas;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 51
    .line 52
    .line 53
    :goto_1
    return-void
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
.end method
