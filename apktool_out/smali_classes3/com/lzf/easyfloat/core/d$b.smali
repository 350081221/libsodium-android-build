.class public final Lcom/lzf/easyfloat/core/d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/lzf/easyfloat/interfaces/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/lzf/easyfloat/core/d;->j()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "com/lzf/easyfloat/core/d$b",
        "Lcom/lzf/easyfloat/interfaces/e;",
        "Landroid/view/MotionEvent;",
        "event",
        "Lkotlin/r2;",
        "a",
        "easyfloat_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/lzf/easyfloat/core/d;


# direct methods
.method constructor <init>(Lcom/lzf/easyfloat/core/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lzf/easyfloat/core/d$b;->a:Lcom/lzf/easyfloat/core/d;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
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
.end method


# virtual methods
.method public a(Landroid/view/MotionEvent;)V
    .locals 4
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/lzf/easyfloat/core/d$b;->a:Lcom/lzf/easyfloat/core/d;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/lzf/easyfloat/core/d;->e(Lcom/lzf/easyfloat/core/d;)Lcom/lzf/easyfloat/core/g;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    const-string v0, "touchUtils"

    .line 15
    .line 16
    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    :cond_0
    iget-object v1, p0, Lcom/lzf/easyfloat/core/d$b;->a:Lcom/lzf/easyfloat/core/d;

    .line 21
    .line 22
    invoke-virtual {v1}, Lcom/lzf/easyfloat/core/d;->t()Lcom/lzf/easyfloat/widget/ParentFrameLayout;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-static {v1}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object v2, p0, Lcom/lzf/easyfloat/core/d$b;->a:Lcom/lzf/easyfloat/core/d;

    .line 30
    .line 31
    invoke-virtual {v2}, Lcom/lzf/easyfloat/core/d;->w()Landroid/view/WindowManager;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    iget-object v3, p0, Lcom/lzf/easyfloat/core/d$b;->a:Lcom/lzf/easyfloat/core/d;

    .line 36
    .line 37
    invoke-virtual {v3}, Lcom/lzf/easyfloat/core/d;->u()Landroid/view/WindowManager$LayoutParams;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-virtual {v0, v1, p1, v2, v3}, Lcom/lzf/easyfloat/core/g;->k(Landroid/view/View;Landroid/view/MotionEvent;Landroid/view/WindowManager;Landroid/view/WindowManager$LayoutParams;)V

    .line 42
    .line 43
    .line 44
    return-void
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
.end method
