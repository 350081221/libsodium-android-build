.class public final Landroidx/compose/ui/platform/OutlineResolver;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u00a2\u0006\u0004\u0008O\u0010PJ\u0008\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u0007H\u0002J\u0010\u0010\u000c\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002J0\u0010\u0016\u001a\u00020\u0013*\u0004\u0018\u00010\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J6\u0010 \u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eJ\u0018\u0010$\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\r\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\"\u0010#J\u000e\u0010\u001a\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%J\u0018\u0010 \u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\'\u0010(R\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010)R\u0016\u0010*\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008-\u0010.R\u001c\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010/R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0018\u00100R\u0018\u00101\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00081\u00102R\u0018\u00103\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00083\u00102R$\u00105\u001a\u00020\u00132\u0006\u00104\u001a\u00020\u00138\u0000@BX\u0080\u000e\u00a2\u0006\u000c\n\u0004\u00085\u0010+\u001a\u0004\u00086\u00107R\u0016\u00108\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00088\u0010+R\u0018\u00109\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00089\u00102R\u0018\u0010:\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008:\u0010;R\u0016\u0010<\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008<\u0010=R\u001c\u0010>\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0006\n\u0004\u0008>\u0010/R\u001c\u0010?\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0006\n\u0004\u0008?\u0010/R\u0016\u0010@\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008@\u0010+R\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010AR\u0018\u0010B\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008B\u00102R\u0018\u0010C\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008C\u00102R\u0018\u0010E\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008E\u0010FR\u0013\u0010I\u001a\u0004\u0018\u00010,8F\u00a2\u0006\u0006\u001a\u0004\u0008G\u0010HR\u0011\u0010K\u001a\u00020\u00138F\u00a2\u0006\u0006\u001a\u0004\u0008J\u00107R\u0013\u0010N\u001a\u0004\u0018\u00010\n8F\u00a2\u0006\u0006\u001a\u0004\u0008L\u0010M\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006Q"
    }
    d2 = {
        "Landroidx/compose/ui/platform/OutlineResolver;",
        "",
        "Lkotlin/r2;",
        "updateCache",
        "Landroidx/compose/ui/geometry/Rect;",
        "rect",
        "updateCacheWithRect",
        "Landroidx/compose/ui/geometry/RoundRect;",
        "roundRect",
        "updateCacheWithRoundRect",
        "Landroidx/compose/ui/graphics/Path;",
        "composePath",
        "updateCacheWithPath",
        "Landroidx/compose/ui/geometry/Offset;",
        "offset",
        "Landroidx/compose/ui/geometry/Size;",
        "size",
        "",
        "radius",
        "",
        "isSameBounds-4L21HEs",
        "(Landroidx/compose/ui/geometry/RoundRect;JJF)Z",
        "isSameBounds",
        "Landroidx/compose/ui/graphics/Shape;",
        "shape",
        "alpha",
        "clipToOutline",
        "elevation",
        "Landroidx/compose/ui/unit/LayoutDirection;",
        "layoutDirection",
        "Landroidx/compose/ui/unit/Density;",
        "density",
        "update",
        "position",
        "isInOutline-k-4lQ0M",
        "(J)Z",
        "isInOutline",
        "Landroidx/compose/ui/graphics/Canvas;",
        "canvas",
        "update-uvyYCjk",
        "(J)V",
        "Landroidx/compose/ui/unit/Density;",
        "isSupportedOutline",
        "Z",
        "Landroid/graphics/Outline;",
        "cachedOutline",
        "Landroid/graphics/Outline;",
        "J",
        "Landroidx/compose/ui/graphics/Shape;",
        "cachedRrectPath",
        "Landroidx/compose/ui/graphics/Path;",
        "outlinePath",
        "<set-?>",
        "cacheIsDirty",
        "getCacheIsDirty$ui_release",
        "()Z",
        "usePathForClip",
        "tmpPath",
        "tmpRoundRect",
        "Landroidx/compose/ui/geometry/RoundRect;",
        "roundedCornerRadius",
        "F",
        "rectTopLeft",
        "rectSize",
        "outlineNeeded",
        "Landroidx/compose/ui/unit/LayoutDirection;",
        "tmpTouchPointPath",
        "tmpOpPath",
        "Landroidx/compose/ui/graphics/Outline;",
        "calculatedOutline",
        "Landroidx/compose/ui/graphics/Outline;",
        "getOutline",
        "()Landroid/graphics/Outline;",
        "outline",
        "getOutlineClipSupported",
        "outlineClipSupported",
        "getClipPath",
        "()Landroidx/compose/ui/graphics/Path;",
        "clipPath",
        "<init>",
        "(Landroidx/compose/ui/unit/Density;)V",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nOutlineResolver.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlineResolver.android.kt\nandroidx/compose/ui/platform/OutlineResolver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n*L\n1#1,357:1\n1#2:358\n35#3,5:359\n*S KotlinDebug\n*F\n+ 1 OutlineResolver.android.kt\nandroidx/compose/ui/platform/OutlineResolver\n*L\n331#1:359,5\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private cacheIsDirty:Z

.field private final cachedOutline:Landroid/graphics/Outline;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private cachedRrectPath:Landroidx/compose/ui/graphics/Path;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private calculatedOutline:Landroidx/compose/ui/graphics/Outline;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private density:Landroidx/compose/ui/unit/Density;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private isSupportedOutline:Z

.field private layoutDirection:Landroidx/compose/ui/unit/LayoutDirection;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private outlineNeeded:Z

.field private outlinePath:Landroidx/compose/ui/graphics/Path;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private rectSize:J

.field private rectTopLeft:J

.field private roundedCornerRadius:F

.field private shape:Landroidx/compose/ui/graphics/Shape;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private size:J

.field private tmpOpPath:Landroidx/compose/ui/graphics/Path;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private tmpPath:Landroidx/compose/ui/graphics/Path;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private tmpRoundRect:Landroidx/compose/ui/geometry/RoundRect;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private tmpTouchPointPath:Landroidx/compose/ui/graphics/Path;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private usePathForClip:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/compose/ui/unit/Density;)V
    .locals 2
    .param p1    # Landroidx/compose/ui/unit/Density;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/platform/OutlineResolver;->density:Landroidx/compose/ui/unit/Density;

    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    iput-boolean p1, p0, Landroidx/compose/ui/platform/OutlineResolver;->isSupportedOutline:Z

    .line 8
    .line 9
    new-instance p1, Landroid/graphics/Outline;

    .line 10
    .line 11
    invoke-direct {p1}, Landroid/graphics/Outline;-><init>()V

    .line 12
    .line 13
    .line 14
    const/high16 v0, 0x3f800000    # 1.0f

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Landroid/graphics/Outline;->setAlpha(F)V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Landroidx/compose/ui/platform/OutlineResolver;->cachedOutline:Landroid/graphics/Outline;

    .line 20
    .line 21
    sget-object p1, Landroidx/compose/ui/geometry/Size;->Companion:Landroidx/compose/ui/geometry/Size$Companion;

    .line 22
    .line 23
    invoke-virtual {p1}, Landroidx/compose/ui/geometry/Size$Companion;->getZero-NH-jbRc()J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    iput-wide v0, p0, Landroidx/compose/ui/platform/OutlineResolver;->size:J

    .line 28
    .line 29
    invoke-static {}, Landroidx/compose/ui/graphics/RectangleShapeKt;->getRectangleShape()Landroidx/compose/ui/graphics/Shape;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iput-object v0, p0, Landroidx/compose/ui/platform/OutlineResolver;->shape:Landroidx/compose/ui/graphics/Shape;

    .line 34
    .line 35
    sget-object v0, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 36
    .line 37
    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    .line 38
    .line 39
    .line 40
    move-result-wide v0

    .line 41
    iput-wide v0, p0, Landroidx/compose/ui/platform/OutlineResolver;->rectTopLeft:J

    .line 42
    .line 43
    invoke-virtual {p1}, Landroidx/compose/ui/geometry/Size$Companion;->getZero-NH-jbRc()J

    .line 44
    .line 45
    .line 46
    move-result-wide v0

    .line 47
    iput-wide v0, p0, Landroidx/compose/ui/platform/OutlineResolver;->rectSize:J

    .line 48
    .line 49
    sget-object p1, Landroidx/compose/ui/unit/LayoutDirection;->Ltr:Landroidx/compose/ui/unit/LayoutDirection;

    .line 50
    .line 51
    iput-object p1, p0, Landroidx/compose/ui/platform/OutlineResolver;->layoutDirection:Landroidx/compose/ui/unit/LayoutDirection;

    .line 52
    .line 53
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
.end method

.method private final isSameBounds-4L21HEs(Landroidx/compose/ui/geometry/RoundRect;JJF)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_6

    .line 3
    .line 4
    invoke-static {p1}, Landroidx/compose/ui/geometry/RoundRectKt;->isSimple(Landroidx/compose/ui/geometry/RoundRect;)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    goto/16 :goto_5

    .line 11
    .line 12
    :cond_0
    invoke-virtual {p1}, Landroidx/compose/ui/geometry/RoundRect;->getLeft()F

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-static {p2, p3}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    cmpg-float v1, v1, v2

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    if-nez v1, :cond_1

    .line 24
    .line 25
    move v1, v2

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    move v1, v0

    .line 28
    :goto_0
    if-eqz v1, :cond_6

    .line 29
    .line 30
    invoke-virtual {p1}, Landroidx/compose/ui/geometry/RoundRect;->getTop()F

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    invoke-static {p2, p3}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    cmpg-float v1, v1, v3

    .line 39
    .line 40
    if-nez v1, :cond_2

    .line 41
    .line 42
    move v1, v2

    .line 43
    goto :goto_1

    .line 44
    :cond_2
    move v1, v0

    .line 45
    :goto_1
    if-eqz v1, :cond_6

    .line 46
    .line 47
    invoke-virtual {p1}, Landroidx/compose/ui/geometry/RoundRect;->getRight()F

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    invoke-static {p2, p3}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    invoke-static {p4, p5}, Landroidx/compose/ui/geometry/Size;->getWidth-impl(J)F

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    add-float/2addr v3, v4

    .line 60
    cmpg-float v1, v1, v3

    .line 61
    .line 62
    if-nez v1, :cond_3

    .line 63
    .line 64
    move v1, v2

    .line 65
    goto :goto_2

    .line 66
    :cond_3
    move v1, v0

    .line 67
    :goto_2
    if-eqz v1, :cond_6

    .line 68
    .line 69
    invoke-virtual {p1}, Landroidx/compose/ui/geometry/RoundRect;->getBottom()F

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    invoke-static {p2, p3}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    invoke-static {p4, p5}, Landroidx/compose/ui/geometry/Size;->getHeight-impl(J)F

    .line 78
    .line 79
    .line 80
    move-result p3

    .line 81
    add-float/2addr p2, p3

    .line 82
    cmpg-float p2, v1, p2

    .line 83
    .line 84
    if-nez p2, :cond_4

    .line 85
    .line 86
    move p2, v2

    .line 87
    goto :goto_3

    .line 88
    :cond_4
    move p2, v0

    .line 89
    :goto_3
    if-eqz p2, :cond_6

    .line 90
    .line 91
    invoke-virtual {p1}, Landroidx/compose/ui/geometry/RoundRect;->getTopLeftCornerRadius-kKHJgLs()J

    .line 92
    .line 93
    .line 94
    move-result-wide p1

    .line 95
    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/CornerRadius;->getX-impl(J)F

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    cmpg-float p1, p1, p6

    .line 100
    .line 101
    if-nez p1, :cond_5

    .line 102
    .line 103
    move p1, v2

    .line 104
    goto :goto_4

    .line 105
    :cond_5
    move p1, v0

    .line 106
    :goto_4
    if-eqz p1, :cond_6

    .line 107
    .line 108
    move v0, v2

    .line 109
    :cond_6
    :goto_5
    return v0
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
.end method

.method private final updateCache()V
    .locals 5

    .line 1
    iget-boolean v0, p0, Landroidx/compose/ui/platform/OutlineResolver;->cacheIsDirty:Z

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    sget-object v0, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    iput-wide v0, p0, Landroidx/compose/ui/platform/OutlineResolver;->rectTopLeft:J

    .line 12
    .line 13
    iget-wide v0, p0, Landroidx/compose/ui/platform/OutlineResolver;->size:J

    .line 14
    .line 15
    iput-wide v0, p0, Landroidx/compose/ui/platform/OutlineResolver;->rectSize:J

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    iput v2, p0, Landroidx/compose/ui/platform/OutlineResolver;->roundedCornerRadius:F

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    iput-object v3, p0, Landroidx/compose/ui/platform/OutlineResolver;->outlinePath:Landroidx/compose/ui/graphics/Path;

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    iput-boolean v3, p0, Landroidx/compose/ui/platform/OutlineResolver;->cacheIsDirty:Z

    .line 25
    .line 26
    iput-boolean v3, p0, Landroidx/compose/ui/platform/OutlineResolver;->usePathForClip:Z

    .line 27
    .line 28
    iget-boolean v3, p0, Landroidx/compose/ui/platform/OutlineResolver;->outlineNeeded:Z

    .line 29
    .line 30
    if-eqz v3, :cond_2

    .line 31
    .line 32
    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/Size;->getWidth-impl(J)F

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    cmpl-float v0, v0, v2

    .line 37
    .line 38
    if-lez v0, :cond_2

    .line 39
    .line 40
    iget-wide v0, p0, Landroidx/compose/ui/platform/OutlineResolver;->size:J

    .line 41
    .line 42
    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/Size;->getHeight-impl(J)F

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    cmpl-float v0, v0, v2

    .line 47
    .line 48
    if-lez v0, :cond_2

    .line 49
    .line 50
    const/4 v0, 0x1

    .line 51
    iput-boolean v0, p0, Landroidx/compose/ui/platform/OutlineResolver;->isSupportedOutline:Z

    .line 52
    .line 53
    iget-object v0, p0, Landroidx/compose/ui/platform/OutlineResolver;->shape:Landroidx/compose/ui/graphics/Shape;

    .line 54
    .line 55
    iget-wide v1, p0, Landroidx/compose/ui/platform/OutlineResolver;->size:J

    .line 56
    .line 57
    iget-object v3, p0, Landroidx/compose/ui/platform/OutlineResolver;->layoutDirection:Landroidx/compose/ui/unit/LayoutDirection;

    .line 58
    .line 59
    iget-object v4, p0, Landroidx/compose/ui/platform/OutlineResolver;->density:Landroidx/compose/ui/unit/Density;

    .line 60
    .line 61
    invoke-interface {v0, v1, v2, v3, v4}, Landroidx/compose/ui/graphics/Shape;->createOutline-Pq9zytI(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Landroidx/compose/ui/graphics/Outline;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iput-object v0, p0, Landroidx/compose/ui/platform/OutlineResolver;->calculatedOutline:Landroidx/compose/ui/graphics/Outline;

    .line 66
    .line 67
    instance-of v1, v0, Landroidx/compose/ui/graphics/Outline$Rectangle;

    .line 68
    .line 69
    if-eqz v1, :cond_0

    .line 70
    .line 71
    check-cast v0, Landroidx/compose/ui/graphics/Outline$Rectangle;

    .line 72
    .line 73
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Outline$Rectangle;->getRect()Landroidx/compose/ui/geometry/Rect;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/OutlineResolver;->updateCacheWithRect(Landroidx/compose/ui/geometry/Rect;)V

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_0
    instance-of v1, v0, Landroidx/compose/ui/graphics/Outline$Rounded;

    .line 82
    .line 83
    if-eqz v1, :cond_1

    .line 84
    .line 85
    check-cast v0, Landroidx/compose/ui/graphics/Outline$Rounded;

    .line 86
    .line 87
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Outline$Rounded;->getRoundRect()Landroidx/compose/ui/geometry/RoundRect;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/OutlineResolver;->updateCacheWithRoundRect(Landroidx/compose/ui/geometry/RoundRect;)V

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_1
    instance-of v1, v0, Landroidx/compose/ui/graphics/Outline$Generic;

    .line 96
    .line 97
    if-eqz v1, :cond_3

    .line 98
    .line 99
    check-cast v0, Landroidx/compose/ui/graphics/Outline$Generic;

    .line 100
    .line 101
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Outline$Generic;->getPath()Landroidx/compose/ui/graphics/Path;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/OutlineResolver;->updateCacheWithPath(Landroidx/compose/ui/graphics/Path;)V

    .line 106
    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_2
    iget-object v0, p0, Landroidx/compose/ui/platform/OutlineResolver;->cachedOutline:Landroid/graphics/Outline;

    .line 110
    .line 111
    invoke-virtual {v0}, Landroid/graphics/Outline;->setEmpty()V

    .line 112
    .line 113
    .line 114
    :cond_3
    :goto_0
    return-void
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
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
.end method

.method private final updateCacheWithPath(Landroidx/compose/ui/graphics/Path;)V
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-gt v0, v1, :cond_1

    .line 7
    .line 8
    invoke-interface {p1}, Landroidx/compose/ui/graphics/Path;->isConvex()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    iput-boolean v0, p0, Landroidx/compose/ui/platform/OutlineResolver;->isSupportedOutline:Z

    .line 17
    .line 18
    iget-object v0, p0, Landroidx/compose/ui/platform/OutlineResolver;->cachedOutline:Landroid/graphics/Outline;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/graphics/Outline;->setEmpty()V

    .line 21
    .line 22
    .line 23
    iput-boolean v2, p0, Landroidx/compose/ui/platform/OutlineResolver;->usePathForClip:Z

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/compose/ui/platform/OutlineResolver;->cachedOutline:Landroid/graphics/Outline;

    .line 27
    .line 28
    instance-of v1, p1, Landroidx/compose/ui/graphics/AndroidPath;

    .line 29
    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    move-object v1, p1

    .line 33
    check-cast v1, Landroidx/compose/ui/graphics/AndroidPath;

    .line 34
    .line 35
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/AndroidPath;->getInternalPath()Landroid/graphics/Path;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v0, v1}, Landroid/graphics/Outline;->setConvexPath(Landroid/graphics/Path;)V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Landroidx/compose/ui/platform/OutlineResolver;->cachedOutline:Landroid/graphics/Outline;

    .line 43
    .line 44
    invoke-virtual {v0}, Landroid/graphics/Outline;->canClip()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    xor-int/2addr v0, v2

    .line 49
    iput-boolean v0, p0, Landroidx/compose/ui/platform/OutlineResolver;->usePathForClip:Z

    .line 50
    .line 51
    :goto_1
    iput-object p1, p0, Landroidx/compose/ui/platform/OutlineResolver;->outlinePath:Landroidx/compose/ui/graphics/Path;

    .line 52
    .line 53
    return-void

    .line 54
    :cond_2
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 55
    .line 56
    const-string v0, "Unable to obtain android.graphics.Path"

    .line 57
    .line 58
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw p1
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
.end method

.method private final updateCacheWithRect(Landroidx/compose/ui/geometry/Rect;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroidx/compose/ui/geometry/Rect;->getLeft()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Landroidx/compose/ui/geometry/Rect;->getTop()F

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    iput-wide v0, p0, Landroidx/compose/ui/platform/OutlineResolver;->rectTopLeft:J

    .line 14
    .line 15
    invoke-virtual {p1}, Landroidx/compose/ui/geometry/Rect;->getWidth()F

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-virtual {p1}, Landroidx/compose/ui/geometry/Rect;->getHeight()F

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/SizeKt;->Size(FF)J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    iput-wide v0, p0, Landroidx/compose/ui/platform/OutlineResolver;->rectSize:J

    .line 28
    .line 29
    iget-object v0, p0, Landroidx/compose/ui/platform/OutlineResolver;->cachedOutline:Landroid/graphics/Outline;

    .line 30
    .line 31
    invoke-virtual {p1}, Landroidx/compose/ui/geometry/Rect;->getLeft()F

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    invoke-static {v1}, Lkotlin/math/b;->L0(F)I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    invoke-virtual {p1}, Landroidx/compose/ui/geometry/Rect;->getTop()F

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    invoke-static {v2}, Lkotlin/math/b;->L0(F)I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    invoke-virtual {p1}, Landroidx/compose/ui/geometry/Rect;->getRight()F

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    invoke-static {v3}, Lkotlin/math/b;->L0(F)I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    invoke-virtual {p1}, Landroidx/compose/ui/geometry/Rect;->getBottom()F

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    invoke-static {p1}, Lkotlin/math/b;->L0(F)I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    invoke-virtual {v0, v1, v2, v3, p1}, Landroid/graphics/Outline;->setRect(IIII)V

    .line 64
    .line 65
    .line 66
    return-void
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
.end method

.method private final updateCacheWithRoundRect(Landroidx/compose/ui/geometry/RoundRect;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Landroidx/compose/ui/geometry/RoundRect;->getTopLeftCornerRadius-kKHJgLs()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/CornerRadius;->getX-impl(J)F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p1}, Landroidx/compose/ui/geometry/RoundRect;->getLeft()F

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-virtual {p1}, Landroidx/compose/ui/geometry/RoundRect;->getTop()F

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-static {v1, v2}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    .line 18
    .line 19
    .line 20
    move-result-wide v1

    .line 21
    iput-wide v1, p0, Landroidx/compose/ui/platform/OutlineResolver;->rectTopLeft:J

    .line 22
    .line 23
    invoke-virtual {p1}, Landroidx/compose/ui/geometry/RoundRect;->getWidth()F

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-virtual {p1}, Landroidx/compose/ui/geometry/RoundRect;->getHeight()F

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    invoke-static {v1, v2}, Landroidx/compose/ui/geometry/SizeKt;->Size(FF)J

    .line 32
    .line 33
    .line 34
    move-result-wide v1

    .line 35
    iput-wide v1, p0, Landroidx/compose/ui/platform/OutlineResolver;->rectSize:J

    .line 36
    .line 37
    invoke-static {p1}, Landroidx/compose/ui/geometry/RoundRectKt;->isSimple(Landroidx/compose/ui/geometry/RoundRect;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_0

    .line 42
    .line 43
    iget-object v2, p0, Landroidx/compose/ui/platform/OutlineResolver;->cachedOutline:Landroid/graphics/Outline;

    .line 44
    .line 45
    invoke-virtual {p1}, Landroidx/compose/ui/geometry/RoundRect;->getLeft()F

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    invoke-static {v1}, Lkotlin/math/b;->L0(F)I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    invoke-virtual {p1}, Landroidx/compose/ui/geometry/RoundRect;->getTop()F

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    invoke-static {v1}, Lkotlin/math/b;->L0(F)I

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    invoke-virtual {p1}, Landroidx/compose/ui/geometry/RoundRect;->getRight()F

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    invoke-static {v1}, Lkotlin/math/b;->L0(F)I

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    invoke-virtual {p1}, Landroidx/compose/ui/geometry/RoundRect;->getBottom()F

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    invoke-static {p1}, Lkotlin/math/b;->L0(F)I

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    move v7, v0

    .line 78
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    .line 79
    .line 80
    .line 81
    iput v0, p0, Landroidx/compose/ui/platform/OutlineResolver;->roundedCornerRadius:F

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/OutlineResolver;->cachedRrectPath:Landroidx/compose/ui/graphics/Path;

    .line 85
    .line 86
    if-nez v0, :cond_1

    .line 87
    .line 88
    invoke-static {}, Landroidx/compose/ui/graphics/AndroidPath_androidKt;->Path()Landroidx/compose/ui/graphics/Path;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    iput-object v0, p0, Landroidx/compose/ui/platform/OutlineResolver;->cachedRrectPath:Landroidx/compose/ui/graphics/Path;

    .line 93
    .line 94
    :cond_1
    invoke-interface {v0}, Landroidx/compose/ui/graphics/Path;->reset()V

    .line 95
    .line 96
    .line 97
    invoke-interface {v0, p1}, Landroidx/compose/ui/graphics/Path;->addRoundRect(Landroidx/compose/ui/geometry/RoundRect;)V

    .line 98
    .line 99
    .line 100
    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/OutlineResolver;->updateCacheWithPath(Landroidx/compose/ui/graphics/Path;)V

    .line 101
    .line 102
    .line 103
    :goto_0
    return-void
    .line 104
    .line 105
    .line 106
.end method


# virtual methods
.method public final clipToOutline(Landroidx/compose/ui/graphics/Canvas;)V
    .locals 20
    .param p1    # Landroidx/compose/ui/graphics/Canvas;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    move-object/from16 v7, p0

    .line 2
    .line 3
    move-object/from16 v8, p1

    .line 4
    .line 5
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/platform/OutlineResolver;->getClipPath()Landroidx/compose/ui/graphics/Path;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v9, 0x0

    .line 10
    const/4 v10, 0x0

    .line 11
    const/4 v11, 0x2

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-static {v8, v0, v9, v11, v10}, Landroidx/compose/ui/graphics/Canvas;->clipPath-mtrdD-E$default(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/Path;IILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    goto/16 :goto_1

    .line 18
    .line 19
    :cond_0
    iget v6, v7, Landroidx/compose/ui/platform/OutlineResolver;->roundedCornerRadius:F

    .line 20
    .line 21
    const/4 v12, 0x0

    .line 22
    cmpl-float v0, v6, v12

    .line 23
    .line 24
    if-lez v0, :cond_4

    .line 25
    .line 26
    iget-object v13, v7, Landroidx/compose/ui/platform/OutlineResolver;->tmpPath:Landroidx/compose/ui/graphics/Path;

    .line 27
    .line 28
    iget-object v1, v7, Landroidx/compose/ui/platform/OutlineResolver;->tmpRoundRect:Landroidx/compose/ui/geometry/RoundRect;

    .line 29
    .line 30
    if-eqz v13, :cond_1

    .line 31
    .line 32
    iget-wide v2, v7, Landroidx/compose/ui/platform/OutlineResolver;->rectTopLeft:J

    .line 33
    .line 34
    iget-wide v4, v7, Landroidx/compose/ui/platform/OutlineResolver;->rectSize:J

    .line 35
    .line 36
    move-object/from16 v0, p0

    .line 37
    .line 38
    invoke-direct/range {v0 .. v6}, Landroidx/compose/ui/platform/OutlineResolver;->isSameBounds-4L21HEs(Landroidx/compose/ui/geometry/RoundRect;JJF)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-nez v0, :cond_3

    .line 43
    .line 44
    :cond_1
    iget-wide v0, v7, Landroidx/compose/ui/platform/OutlineResolver;->rectTopLeft:J

    .line 45
    .line 46
    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    .line 47
    .line 48
    .line 49
    move-result v14

    .line 50
    iget-wide v0, v7, Landroidx/compose/ui/platform/OutlineResolver;->rectTopLeft:J

    .line 51
    .line 52
    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    .line 53
    .line 54
    .line 55
    move-result v15

    .line 56
    iget-wide v0, v7, Landroidx/compose/ui/platform/OutlineResolver;->rectTopLeft:J

    .line 57
    .line 58
    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    iget-wide v1, v7, Landroidx/compose/ui/platform/OutlineResolver;->rectSize:J

    .line 63
    .line 64
    invoke-static {v1, v2}, Landroidx/compose/ui/geometry/Size;->getWidth-impl(J)F

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    add-float v16, v0, v1

    .line 69
    .line 70
    iget-wide v0, v7, Landroidx/compose/ui/platform/OutlineResolver;->rectTopLeft:J

    .line 71
    .line 72
    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    iget-wide v1, v7, Landroidx/compose/ui/platform/OutlineResolver;->rectSize:J

    .line 77
    .line 78
    invoke-static {v1, v2}, Landroidx/compose/ui/geometry/Size;->getHeight-impl(J)F

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    add-float v17, v0, v1

    .line 83
    .line 84
    iget v0, v7, Landroidx/compose/ui/platform/OutlineResolver;->roundedCornerRadius:F

    .line 85
    .line 86
    invoke-static {v0, v12, v11, v10}, Landroidx/compose/ui/geometry/CornerRadiusKt;->CornerRadius$default(FFILjava/lang/Object;)J

    .line 87
    .line 88
    .line 89
    move-result-wide v18

    .line 90
    invoke-static/range {v14 .. v19}, Landroidx/compose/ui/geometry/RoundRectKt;->RoundRect-gG7oq9Y(FFFFJ)Landroidx/compose/ui/geometry/RoundRect;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    if-nez v13, :cond_2

    .line 95
    .line 96
    invoke-static {}, Landroidx/compose/ui/graphics/AndroidPath_androidKt;->Path()Landroidx/compose/ui/graphics/Path;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    move-object v13, v1

    .line 101
    goto :goto_0

    .line 102
    :cond_2
    invoke-interface {v13}, Landroidx/compose/ui/graphics/Path;->reset()V

    .line 103
    .line 104
    .line 105
    :goto_0
    invoke-interface {v13, v0}, Landroidx/compose/ui/graphics/Path;->addRoundRect(Landroidx/compose/ui/geometry/RoundRect;)V

    .line 106
    .line 107
    .line 108
    iput-object v0, v7, Landroidx/compose/ui/platform/OutlineResolver;->tmpRoundRect:Landroidx/compose/ui/geometry/RoundRect;

    .line 109
    .line 110
    iput-object v13, v7, Landroidx/compose/ui/platform/OutlineResolver;->tmpPath:Landroidx/compose/ui/graphics/Path;

    .line 111
    .line 112
    :cond_3
    invoke-static {v8, v13, v9, v11, v10}, Landroidx/compose/ui/graphics/Canvas;->clipPath-mtrdD-E$default(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/Path;IILjava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_4
    iget-wide v0, v7, Landroidx/compose/ui/platform/OutlineResolver;->rectTopLeft:J

    .line 117
    .line 118
    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    .line 119
    .line 120
    .line 121
    move-result v9

    .line 122
    iget-wide v0, v7, Landroidx/compose/ui/platform/OutlineResolver;->rectTopLeft:J

    .line 123
    .line 124
    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    .line 125
    .line 126
    .line 127
    move-result v10

    .line 128
    iget-wide v0, v7, Landroidx/compose/ui/platform/OutlineResolver;->rectTopLeft:J

    .line 129
    .line 130
    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    iget-wide v1, v7, Landroidx/compose/ui/platform/OutlineResolver;->rectSize:J

    .line 135
    .line 136
    invoke-static {v1, v2}, Landroidx/compose/ui/geometry/Size;->getWidth-impl(J)F

    .line 137
    .line 138
    .line 139
    move-result v1

    .line 140
    add-float v11, v0, v1

    .line 141
    .line 142
    iget-wide v0, v7, Landroidx/compose/ui/platform/OutlineResolver;->rectTopLeft:J

    .line 143
    .line 144
    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    iget-wide v1, v7, Landroidx/compose/ui/platform/OutlineResolver;->rectSize:J

    .line 149
    .line 150
    invoke-static {v1, v2}, Landroidx/compose/ui/geometry/Size;->getHeight-impl(J)F

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    add-float v12, v0, v1

    .line 155
    .line 156
    const/4 v13, 0x0

    .line 157
    const/16 v14, 0x10

    .line 158
    .line 159
    const/4 v15, 0x0

    .line 160
    move-object/from16 v8, p1

    .line 161
    .line 162
    invoke-static/range {v8 .. v15}, Landroidx/compose/ui/graphics/Canvas;->clipRect-N_I0leg$default(Landroidx/compose/ui/graphics/Canvas;FFFFIILjava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    :goto_1
    return-void
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
.end method

.method public final getCacheIsDirty$ui_release()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/ui/platform/OutlineResolver;->cacheIsDirty:Z

    return v0
.end method

.method public final getClipPath()Landroidx/compose/ui/graphics/Path;
    .locals 1
    .annotation build Lp4/m;
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/platform/OutlineResolver;->updateCache()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/compose/ui/platform/OutlineResolver;->outlinePath:Landroidx/compose/ui/graphics/Path;

    .line 5
    .line 6
    return-object v0
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
.end method

.method public final getOutline()Landroid/graphics/Outline;
    .locals 1
    .annotation build Lp4/m;
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/platform/OutlineResolver;->updateCache()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Landroidx/compose/ui/platform/OutlineResolver;->outlineNeeded:Z

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-boolean v0, p0, Landroidx/compose/ui/platform/OutlineResolver;->isSupportedOutline:Z

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/OutlineResolver;->cachedOutline:Landroid/graphics/Outline;

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 17
    :goto_1
    return-object v0
    .line 18
    .line 19
.end method

.method public final getOutlineClipSupported()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/ui/platform/OutlineResolver;->usePathForClip:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final isInOutline-k-4lQ0M(J)Z
    .locals 3

    .line 1
    iget-boolean v0, p0, Landroidx/compose/ui/platform/OutlineResolver;->outlineNeeded:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/OutlineResolver;->calculatedOutline:Landroidx/compose/ui/graphics/Outline;

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    return v1

    .line 12
    :cond_1
    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    iget-object p2, p0, Landroidx/compose/ui/platform/OutlineResolver;->tmpTouchPointPath:Landroidx/compose/ui/graphics/Path;

    .line 21
    .line 22
    iget-object v2, p0, Landroidx/compose/ui/platform/OutlineResolver;->tmpOpPath:Landroidx/compose/ui/graphics/Path;

    .line 23
    .line 24
    invoke-static {v0, v1, p1, p2, v2}, Landroidx/compose/ui/platform/ShapeContainingUtilKt;->isInOutline(Landroidx/compose/ui/graphics/Outline;FFLandroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Path;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    return p1
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public final update(Landroidx/compose/ui/graphics/Shape;FZFLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Z
    .locals 1
    .param p1    # Landroidx/compose/ui/graphics/Shape;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p5    # Landroidx/compose/ui/unit/LayoutDirection;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p6    # Landroidx/compose/ui/unit/Density;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/OutlineResolver;->cachedOutline:Landroid/graphics/Outline;

    .line 2
    .line 3
    invoke-virtual {v0, p2}, Landroid/graphics/Outline;->setAlpha(F)V

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, Landroidx/compose/ui/platform/OutlineResolver;->shape:Landroidx/compose/ui/graphics/Shape;

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    const/4 v0, 0x1

    .line 13
    xor-int/2addr p2, v0

    .line 14
    if-eqz p2, :cond_0

    .line 15
    .line 16
    iput-object p1, p0, Landroidx/compose/ui/platform/OutlineResolver;->shape:Landroidx/compose/ui/graphics/Shape;

    .line 17
    .line 18
    iput-boolean v0, p0, Landroidx/compose/ui/platform/OutlineResolver;->cacheIsDirty:Z

    .line 19
    .line 20
    :cond_0
    if-nez p3, :cond_2

    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    cmpl-float p1, p4, p1

    .line 24
    .line 25
    if-lez p1, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const/4 p1, 0x0

    .line 29
    goto :goto_1

    .line 30
    :cond_2
    :goto_0
    move p1, v0

    .line 31
    :goto_1
    iget-boolean p3, p0, Landroidx/compose/ui/platform/OutlineResolver;->outlineNeeded:Z

    .line 32
    .line 33
    if-eq p3, p1, :cond_3

    .line 34
    .line 35
    iput-boolean p1, p0, Landroidx/compose/ui/platform/OutlineResolver;->outlineNeeded:Z

    .line 36
    .line 37
    iput-boolean v0, p0, Landroidx/compose/ui/platform/OutlineResolver;->cacheIsDirty:Z

    .line 38
    .line 39
    :cond_3
    iget-object p1, p0, Landroidx/compose/ui/platform/OutlineResolver;->layoutDirection:Landroidx/compose/ui/unit/LayoutDirection;

    .line 40
    .line 41
    if-eq p1, p5, :cond_4

    .line 42
    .line 43
    iput-object p5, p0, Landroidx/compose/ui/platform/OutlineResolver;->layoutDirection:Landroidx/compose/ui/unit/LayoutDirection;

    .line 44
    .line 45
    iput-boolean v0, p0, Landroidx/compose/ui/platform/OutlineResolver;->cacheIsDirty:Z

    .line 46
    .line 47
    :cond_4
    iget-object p1, p0, Landroidx/compose/ui/platform/OutlineResolver;->density:Landroidx/compose/ui/unit/Density;

    .line 48
    .line 49
    invoke-static {p1, p6}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-nez p1, :cond_5

    .line 54
    .line 55
    iput-object p6, p0, Landroidx/compose/ui/platform/OutlineResolver;->density:Landroidx/compose/ui/unit/Density;

    .line 56
    .line 57
    iput-boolean v0, p0, Landroidx/compose/ui/platform/OutlineResolver;->cacheIsDirty:Z

    .line 58
    .line 59
    :cond_5
    return p2
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
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
.end method

.method public final update-uvyYCjk(J)V
    .locals 2

    .line 1
    iget-wide v0, p0, Landroidx/compose/ui/platform/OutlineResolver;->size:J

    .line 2
    .line 3
    invoke-static {v0, v1, p1, p2}, Landroidx/compose/ui/geometry/Size;->equals-impl0(JJ)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iput-wide p1, p0, Landroidx/compose/ui/platform/OutlineResolver;->size:J

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    iput-boolean p1, p0, Landroidx/compose/ui/platform/OutlineResolver;->cacheIsDirty:Z

    .line 13
    .line 14
    :cond_0
    return-void
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
