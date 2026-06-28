.class abstract Landroidx/compose/foundation/BaseAndroidExternalSurfaceState;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/foundation/AndroidExternalSurfaceScope;
.implements Landroidx/compose/foundation/SurfaceScope;


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\"\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u00a2\u0006\u0004\u0008&\u0010\'Jw\u0010\u0010\u001a\u00020\r2f\u0010\u0010\u001ab\u0008\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\u000c\u0008\u0006\u0012\u0008\u0008\u0007\u0012\u0004\u0008\u0008(\u0008\u0012\u0013\u0012\u00110\t\u00a2\u0006\u000c\u0008\u0006\u0012\u0008\u0008\u0007\u0012\u0004\u0008\u0008(\n\u0012\u0013\u0012\u00110\t\u00a2\u0006\u000c\u0008\u0006\u0012\u0008\u0008\u0007\u0012\u0004\u0008\u0008(\u000b\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\r0\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0003\u00a2\u0006\u0002\u0008\u000fH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011JO\u0010\u0013\u001a\u00020\r*\u00020\u00052A\u0010\u0013\u001a=\u0012\u0004\u0012\u00020\u0005\u0012\u0013\u0012\u00110\t\u00a2\u0006\u000c\u0008\u0006\u0012\u0008\u0008\u0007\u0012\u0004\u0008\u0008(\n\u0012\u0013\u0012\u00110\t\u00a2\u0006\u000c\u0008\u0006\u0012\u0008\u0008\u0007\u0012\u0004\u0008\u0008(\u000b\u0012\u0004\u0012\u00020\r0\u0012\u00a2\u0006\u0002\u0008\u000fH\u0016J%\u0010\u0015\u001a\u00020\r*\u00020\u00052\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\u0014\u00a2\u0006\u0002\u0008\u000fH\u0016J\u001e\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0008\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tJ\u001e\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0008\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tJ\u000e\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0008\u001a\u00020\u0005R\u0017\u0010\u001a\u001a\u00020\u00198\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001dRx\u0010\u0010\u001ad\u0008\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\u000c\u0008\u0006\u0012\u0008\u0008\u0007\u0012\u0004\u0008\u0008(\u0008\u0012\u0013\u0012\u00110\t\u00a2\u0006\u000c\u0008\u0006\u0012\u0008\u0008\u0007\u0012\u0004\u0008\u0008(\n\u0012\u0013\u0012\u00110\t\u00a2\u0006\u000c\u0008\u0006\u0012\u0008\u0008\u0007\u0012\u0004\u0008\u0008(\u000b\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\r0\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\u0003\u00a2\u0006\u0002\u0008\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u001eRS\u0010\u001f\u001a?\u0012\u0004\u0012\u00020\u0005\u0012\u0013\u0012\u00110\t\u00a2\u0006\u000c\u0008\u0006\u0012\u0008\u0008\u0007\u0012\u0004\u0008\u0008(\n\u0012\u0013\u0012\u00110\t\u00a2\u0006\u000c\u0008\u0006\u0012\u0008\u0008\u0007\u0012\u0004\u0008\u0008(\u000b\u0012\u0004\u0012\u00020\r\u0018\u00010\u0012\u00a2\u0006\u0002\u0008\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R)\u0010!\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r\u0018\u00010\u0014\u00a2\u0006\u0002\u0008\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008$\u0010%\u00a8\u0006("
    }
    d2 = {
        "Landroidx/compose/foundation/BaseAndroidExternalSurfaceState;",
        "Landroidx/compose/foundation/AndroidExternalSurfaceScope;",
        "Landroidx/compose/foundation/SurfaceScope;",
        "Lkotlin/Function5;",
        "Landroidx/compose/foundation/SurfaceCoroutineScope;",
        "Landroid/view/Surface;",
        "Lkotlin/v0;",
        "name",
        "surface",
        "",
        "width",
        "height",
        "Lkotlin/coroutines/d;",
        "Lkotlin/r2;",
        "",
        "Lkotlin/u;",
        "onSurface",
        "(Lv3/s;)V",
        "Lkotlin/Function3;",
        "onChanged",
        "Lkotlin/Function1;",
        "onDestroyed",
        "dispatchSurfaceCreated",
        "dispatchSurfaceChanged",
        "dispatchSurfaceDestroyed",
        "Lkotlinx/coroutines/s0;",
        "scope",
        "Lkotlinx/coroutines/s0;",
        "getScope",
        "()Lkotlinx/coroutines/s0;",
        "Lv3/s;",
        "onSurfaceChanged",
        "Lv3/q;",
        "onSurfaceDestroyed",
        "Lv3/l;",
        "Lkotlinx/coroutines/l2;",
        "job",
        "Lkotlinx/coroutines/l2;",
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
.field private job:Lkotlinx/coroutines/l2;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private onSurface:Lv3/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/s<",
            "-",
            "Landroidx/compose/foundation/SurfaceCoroutineScope;",
            "-",
            "Landroid/view/Surface;",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;+",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation
.end field

.field private onSurfaceChanged:Lv3/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/q<",
            "-",
            "Landroid/view/Surface;",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation
.end field

.field private onSurfaceDestroyed:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "-",
            "Landroid/view/Surface;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation
.end field

.field private final scope:Lkotlinx/coroutines/s0;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/s0;)V
    .locals 0
    .param p1    # Lkotlinx/coroutines/s0;
        .annotation build Lp4/l;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/BaseAndroidExternalSurfaceState;->scope:Lkotlinx/coroutines/s0;

    return-void
.end method

.method public static final synthetic access$getJob$p(Landroidx/compose/foundation/BaseAndroidExternalSurfaceState;)Lkotlinx/coroutines/l2;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/BaseAndroidExternalSurfaceState;->job:Lkotlinx/coroutines/l2;

    return-object p0
.end method

.method public static final synthetic access$getOnSurface$p(Landroidx/compose/foundation/BaseAndroidExternalSurfaceState;)Lv3/s;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/BaseAndroidExternalSurfaceState;->onSurface:Lv3/s;

    return-object p0
.end method


# virtual methods
.method public final dispatchSurfaceChanged(Landroid/view/Surface;II)V
    .locals 1
    .param p1    # Landroid/view/Surface;
        .annotation build Lp4/l;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/compose/foundation/BaseAndroidExternalSurfaceState;->onSurfaceChanged:Lv3/q;

    if-eqz v0, :cond_0

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {v0, p1, p2, p3}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final dispatchSurfaceCreated(Landroid/view/Surface;II)V
    .locals 10
    .param p1    # Landroid/view/Surface;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/BaseAndroidExternalSurfaceState;->onSurface:Lv3/s;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/compose/foundation/BaseAndroidExternalSurfaceState;->scope:Lkotlinx/coroutines/s0;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    sget-object v3, Lkotlinx/coroutines/u0;->UNDISPATCHED:Lkotlinx/coroutines/u0;

    .line 9
    .line 10
    new-instance v0, Landroidx/compose/foundation/BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1;

    .line 11
    .line 12
    const/4 v9, 0x0

    .line 13
    move-object v4, v0

    .line 14
    move-object v5, p0

    .line 15
    move-object v6, p1

    .line 16
    move v7, p2

    .line 17
    move v8, p3

    .line 18
    invoke-direct/range {v4 .. v9}, Landroidx/compose/foundation/BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1;-><init>(Landroidx/compose/foundation/BaseAndroidExternalSurfaceState;Landroid/view/Surface;IILkotlin/coroutines/d;)V

    .line 19
    .line 20
    .line 21
    const/4 v5, 0x1

    .line 22
    const/4 v6, 0x0

    .line 23
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/i;->e(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;Lkotlinx/coroutines/u0;Lv3/p;ILjava/lang/Object;)Lkotlinx/coroutines/l2;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Landroidx/compose/foundation/BaseAndroidExternalSurfaceState;->job:Lkotlinx/coroutines/l2;

    .line 28
    .line 29
    :cond_0
    return-void
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
.end method

.method public final dispatchSurfaceDestroyed(Landroid/view/Surface;)V
    .locals 2
    .param p1    # Landroid/view/Surface;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/BaseAndroidExternalSurfaceState;->onSurfaceDestroyed:Lv3/l;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object p1, p0, Landroidx/compose/foundation/BaseAndroidExternalSurfaceState;->job:Lkotlinx/coroutines/l2;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-static {p1, v0, v1, v0}, Lkotlinx/coroutines/l2$a;->b(Lkotlinx/coroutines/l2;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    :cond_1
    iput-object v0, p0, Landroidx/compose/foundation/BaseAndroidExternalSurfaceState;->job:Lkotlinx/coroutines/l2;

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

.method public final getScope()Lkotlinx/coroutines/s0;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/BaseAndroidExternalSurfaceState;->scope:Lkotlinx/coroutines/s0;

    return-object v0
.end method

.method public onChanged(Landroid/view/Surface;Lv3/q;)V
    .locals 0
    .param p1    # Landroid/view/Surface;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lv3/q;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/Surface;",
            "Lv3/q<",
            "-",
            "Landroid/view/Surface;",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    iput-object p2, p0, Landroidx/compose/foundation/BaseAndroidExternalSurfaceState;->onSurfaceChanged:Lv3/q;

    return-void
.end method

.method public onDestroyed(Landroid/view/Surface;Lv3/l;)V
    .locals 0
    .param p1    # Landroid/view/Surface;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/Surface;",
            "Lv3/l<",
            "-",
            "Landroid/view/Surface;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    iput-object p2, p0, Landroidx/compose/foundation/BaseAndroidExternalSurfaceState;->onSurfaceDestroyed:Lv3/l;

    return-void
.end method

.method public onSurface(Lv3/s;)V
    .locals 0
    .param p1    # Lv3/s;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/s<",
            "-",
            "Landroidx/compose/foundation/SurfaceCoroutineScope;",
            "-",
            "Landroid/view/Surface;",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/foundation/BaseAndroidExternalSurfaceState;->onSurface:Lv3/s;

    return-void
.end method
