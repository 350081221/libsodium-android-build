.class public interface abstract Landroidx/compose/ui/graphics/Path;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/graphics/Path$Companion;,
        Landroidx/compose/ui/graphics/Path$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0016\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008f\u0018\u0000 P2\u00020\u0001:\u0001PJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u0002H&J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u0002H&J(\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000c\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H&J(\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0002H&J8\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u000c\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H&J8\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H&J(\u0010\"\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 H\u0016J(\u0010%\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 H&J\u0010\u0010&\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001cH&J\u0010\u0010(\u001a\u00020\u00052\u0006\u0010\'\u001a\u00020\u001cH&J \u0010)\u001a\u00020\u00052\u0006\u0010\'\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0002H&J \u0010*\u001a\u00020\u00052\u0006\u0010\'\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u0002H&J\u0010\u0010-\u001a\u00020\u00052\u0006\u0010,\u001a\u00020+H&J$\u00103\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u00002\u0008\u0008\u0002\u00100\u001a\u00020/H&\u00f8\u0001\u0000\u00a2\u0006\u0004\u00081\u00102J\u0008\u00104\u001a\u00020\u0005H&J\u0008\u00105\u001a\u00020\u0005H&J\u0008\u00106\u001a\u00020\u0005H\u0016J\u001a\u00109\u001a\u00020\u00052\u0006\u00100\u001a\u00020/H&\u00f8\u0001\u0000\u00a2\u0006\u0004\u00087\u00108J\u001a\u0010>\u001a\u00020\u00052\u0006\u0010;\u001a\u00020:H\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008<\u0010=J\u0008\u0010?\u001a\u00020\u001cH&J*\u0010F\u001a\u00020 2\u0006\u0010@\u001a\u00020\u00002\u0006\u0010A\u001a\u00020\u00002\u0006\u0010C\u001a\u00020BH&\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008D\u0010ER\"\u0010L\u001a\u00020G8&@&X\u00a6\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u000c\u001a\u0004\u0008H\u0010I\"\u0004\u0008J\u0010KR\u0014\u0010M\u001a\u00020 8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008M\u0010NR\u0014\u0010O\u001a\u00020 8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008O\u0010N\u00f8\u0001\u0002\u0082\u0002\u0011\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\n\u0004\u0008!0\u0001\u00a8\u0006Q\u00c0\u0006\u0003"
    }
    d2 = {
        "Landroidx/compose/ui/graphics/Path;",
        "",
        "",
        "x",
        "y",
        "Lkotlin/r2;",
        "moveTo",
        "dx",
        "dy",
        "relativeMoveTo",
        "lineTo",
        "relativeLineTo",
        "x1",
        "y1",
        "x2",
        "y2",
        "quadraticBezierTo",
        "dx1",
        "dy1",
        "dx2",
        "dy2",
        "relativeQuadraticBezierTo",
        "x3",
        "y3",
        "cubicTo",
        "dx3",
        "dy3",
        "relativeCubicTo",
        "Landroidx/compose/ui/geometry/Rect;",
        "rect",
        "startAngleRadians",
        "sweepAngleRadians",
        "",
        "forceMoveTo",
        "arcToRad",
        "startAngleDegrees",
        "sweepAngleDegrees",
        "arcTo",
        "addRect",
        "oval",
        "addOval",
        "addArcRad",
        "addArc",
        "Landroidx/compose/ui/geometry/RoundRect;",
        "roundRect",
        "addRoundRect",
        "path",
        "Landroidx/compose/ui/geometry/Offset;",
        "offset",
        "addPath-Uv8p0NA",
        "(Landroidx/compose/ui/graphics/Path;J)V",
        "addPath",
        "close",
        "reset",
        "rewind",
        "translate-k-4lQ0M",
        "(J)V",
        "translate",
        "Landroidx/compose/ui/graphics/Matrix;",
        "matrix",
        "transform-58bKbWc",
        "([F)V",
        "transform",
        "getBounds",
        "path1",
        "path2",
        "Landroidx/compose/ui/graphics/PathOperation;",
        "operation",
        "op-N5in7k0",
        "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Path;I)Z",
        "op",
        "Landroidx/compose/ui/graphics/PathFillType;",
        "getFillType-Rg-k1Os",
        "()I",
        "setFillType-oQ8Xj4U",
        "(I)V",
        "fillType",
        "isConvex",
        "()Z",
        "isEmpty",
        "Companion",
        "ui-graphics_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final Companion:Landroidx/compose/ui/graphics/Path$Companion;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Landroidx/compose/ui/graphics/Path$Companion;->$$INSTANCE:Landroidx/compose/ui/graphics/Path$Companion;

    sput-object v0, Landroidx/compose/ui/graphics/Path;->Companion:Landroidx/compose/ui/graphics/Path$Companion;

    return-void
.end method

.method public static synthetic access$arcToRad$jd(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/geometry/Rect;FFZ)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroidx/compose/ui/graphics/Path;->arcToRad(Landroidx/compose/ui/geometry/Rect;FFZ)V

    return-void
.end method

.method public static synthetic access$rewind$jd(Landroidx/compose/ui/graphics/Path;)V
    .locals 0

    invoke-super {p0}, Landroidx/compose/ui/graphics/Path;->rewind()V

    return-void
.end method

.method public static synthetic access$transform-58bKbWc$jd(Landroidx/compose/ui/graphics/Path;[F)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/compose/ui/graphics/Path;->transform-58bKbWc([F)V

    return-void
.end method

.method public static synthetic addPath-Uv8p0NA$default(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Path;JILjava/lang/Object;)V
    .locals 0

    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    sget-object p2, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    invoke-virtual {p2}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    move-result-wide p2

    :cond_0
    invoke-interface {p0, p1, p2, p3}, Landroidx/compose/ui/graphics/Path;->addPath-Uv8p0NA(Landroidx/compose/ui/graphics/Path;J)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: addPath-Uv8p0NA"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public abstract addArc(Landroidx/compose/ui/geometry/Rect;FF)V
    .param p1    # Landroidx/compose/ui/geometry/Rect;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method

.method public abstract addArcRad(Landroidx/compose/ui/geometry/Rect;FF)V
    .param p1    # Landroidx/compose/ui/geometry/Rect;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method

.method public abstract addOval(Landroidx/compose/ui/geometry/Rect;)V
    .param p1    # Landroidx/compose/ui/geometry/Rect;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method

.method public abstract addPath-Uv8p0NA(Landroidx/compose/ui/graphics/Path;J)V
    .param p1    # Landroidx/compose/ui/graphics/Path;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method

.method public abstract addRect(Landroidx/compose/ui/geometry/Rect;)V
    .param p1    # Landroidx/compose/ui/geometry/Rect;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method

.method public abstract addRoundRect(Landroidx/compose/ui/geometry/RoundRect;)V
    .param p1    # Landroidx/compose/ui/geometry/RoundRect;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method

.method public abstract arcTo(Landroidx/compose/ui/geometry/Rect;FFZ)V
    .param p1    # Landroidx/compose/ui/geometry/Rect;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method

.method public arcToRad(Landroidx/compose/ui/geometry/Rect;FFZ)V
    .locals 0
    .param p1    # Landroidx/compose/ui/geometry/Rect;
        .annotation build Lp4/l;
        .end annotation
    .end param

    invoke-static {p2}, Landroidx/compose/ui/graphics/DegreesKt;->degrees(F)F

    move-result p2

    invoke-static {p3}, Landroidx/compose/ui/graphics/DegreesKt;->degrees(F)F

    move-result p3

    invoke-interface {p0, p1, p2, p3, p4}, Landroidx/compose/ui/graphics/Path;->arcTo(Landroidx/compose/ui/geometry/Rect;FFZ)V

    return-void
.end method

.method public abstract close()V
.end method

.method public abstract cubicTo(FFFFFF)V
.end method

.method public abstract getBounds()Landroidx/compose/ui/geometry/Rect;
    .annotation build Lp4/l;
    .end annotation
.end method

.method public abstract getFillType-Rg-k1Os()I
.end method

.method public abstract isConvex()Z
.end method

.method public abstract isEmpty()Z
.end method

.method public abstract lineTo(FF)V
.end method

.method public abstract moveTo(FF)V
.end method

.method public abstract op-N5in7k0(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Path;I)Z
    .param p1    # Landroidx/compose/ui/graphics/Path;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/ui/graphics/Path;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method

.method public abstract quadraticBezierTo(FFFF)V
.end method

.method public abstract relativeCubicTo(FFFFFF)V
.end method

.method public abstract relativeLineTo(FF)V
.end method

.method public abstract relativeMoveTo(FF)V
.end method

.method public abstract relativeQuadraticBezierTo(FFFF)V
.end method

.method public abstract reset()V
.end method

.method public rewind()V
    .locals 0

    invoke-interface {p0}, Landroidx/compose/ui/graphics/Path;->reset()V

    return-void
.end method

.method public abstract setFillType-oQ8Xj4U(I)V
.end method

.method public transform-58bKbWc([F)V
    .locals 0
    .param p1    # [F
        .annotation build Lp4/l;
        .end annotation
    .end param

    return-void
.end method

.method public abstract translate-k-4lQ0M(J)V
.end method
