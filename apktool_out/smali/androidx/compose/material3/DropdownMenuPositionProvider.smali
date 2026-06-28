.class public final Landroidx/compose/material3/DropdownMenuPositionProvider;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/window/PopupPositionProvider;


# annotations
.annotation build Landroidx/compose/runtime/Immutable;
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0081\u0008\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u001b\u001a\u00020\r\u0012\u0006\u0010\u001c\u001a\u00020\u0011\u0012\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u0013\u00128\u0008\u0002\u0010\u001e\u001a2\u0012\u0013\u0012\u00110\u0002\u00a2\u0006\u000c\u0008\u0016\u0012\u0008\u0008\u0017\u0012\u0004\u0008\u0008(\u0003\u0012\u0013\u0012\u00110\u0002\u00a2\u0006\u000c\u0008\u0016\u0012\u0008\u0008\u0017\u0012\u0004\u0008\u0008(\u0018\u0012\u0004\u0012\u00020\u00190\u0015\u00a2\u0006\u0004\u0008A\u0010BJ2\u0010\u000c\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0004H\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0016\u0010\u0010\u001a\u00020\rH\u00c6\u0003\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\t\u0010\u0012\u001a\u00020\u0011H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0013H\u00c6\u0003J9\u0010\u001a\u001a2\u0012\u0013\u0012\u00110\u0002\u00a2\u0006\u000c\u0008\u0016\u0012\u0008\u0008\u0017\u0012\u0004\u0008\u0008(\u0003\u0012\u0013\u0012\u00110\u0002\u00a2\u0006\u000c\u0008\u0016\u0012\u0008\u0008\u0017\u0012\u0004\u0008\u0008(\u0018\u0012\u0004\u0012\u00020\u00190\u0015H\u00c6\u0003Jk\u0010!\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u001b\u001a\u00020\r2\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u001328\u0008\u0002\u0010\u001e\u001a2\u0012\u0013\u0012\u00110\u0002\u00a2\u0006\u000c\u0008\u0016\u0012\u0008\u0008\u0017\u0012\u0004\u0008\u0008(\u0003\u0012\u0013\u0012\u00110\u0002\u00a2\u0006\u000c\u0008\u0016\u0012\u0008\u0008\u0017\u0012\u0004\u0008\u0008(\u0018\u0012\u0004\u0012\u00020\u00190\u0015H\u00c6\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001f\u0010 J\t\u0010#\u001a\u00020\"H\u00d6\u0001J\t\u0010$\u001a\u00020\u0013H\u00d6\u0001J\u0013\u0010(\u001a\u00020\'2\u0008\u0010&\u001a\u0004\u0018\u00010%H\u00d6\u0003R\u001d\u0010\u001b\u001a\u00020\r8\u0006\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010)\u001a\u0004\u0008*\u0010\u000fR\u0017\u0010\u001c\u001a\u00020\u00118\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010+\u001a\u0004\u0008,\u0010-R\u0017\u0010\u001d\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010.\u001a\u0004\u0008/\u00100RG\u0010\u001e\u001a2\u0012\u0013\u0012\u00110\u0002\u00a2\u0006\u000c\u0008\u0016\u0012\u0008\u0008\u0017\u0012\u0004\u0008\u0008(\u0003\u0012\u0013\u0012\u00110\u0002\u00a2\u0006\u000c\u0008\u0016\u0012\u0008\u0008\u0017\u0012\u0004\u0008\u0008(\u0018\u0012\u0004\u0012\u00020\u00190\u00158\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u00101\u001a\u0004\u00082\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00085\u00106R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00087\u00106R\u0014\u00108\u001a\u0002048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00088\u00106R\u0014\u00109\u001a\u0002048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00089\u00106R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008;\u0010<R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008=\u0010<R\u0014\u0010>\u001a\u00020:8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008>\u0010<R\u0014\u0010?\u001a\u00020:8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008?\u0010<R\u0014\u0010@\u001a\u00020:8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008@\u0010<\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006C"
    }
    d2 = {
        "Landroidx/compose/material3/DropdownMenuPositionProvider;",
        "Landroidx/compose/ui/window/PopupPositionProvider;",
        "Landroidx/compose/ui/unit/IntRect;",
        "anchorBounds",
        "Landroidx/compose/ui/unit/IntSize;",
        "windowSize",
        "Landroidx/compose/ui/unit/LayoutDirection;",
        "layoutDirection",
        "popupContentSize",
        "Landroidx/compose/ui/unit/IntOffset;",
        "calculatePosition-llwVHH4",
        "(Landroidx/compose/ui/unit/IntRect;JLandroidx/compose/ui/unit/LayoutDirection;J)J",
        "calculatePosition",
        "Landroidx/compose/ui/unit/DpOffset;",
        "component1-RKDOV3M",
        "()J",
        "component1",
        "Landroidx/compose/ui/unit/Density;",
        "component2",
        "",
        "component3",
        "Lkotlin/Function2;",
        "Lkotlin/v0;",
        "name",
        "menuBounds",
        "Lkotlin/r2;",
        "component4",
        "contentOffset",
        "density",
        "verticalMargin",
        "onPositionCalculated",
        "copy-uVxBXkw",
        "(JLandroidx/compose/ui/unit/Density;ILv3/p;)Landroidx/compose/material3/DropdownMenuPositionProvider;",
        "copy",
        "",
        "toString",
        "hashCode",
        "",
        "other",
        "",
        "equals",
        "J",
        "getContentOffset-RKDOV3M",
        "Landroidx/compose/ui/unit/Density;",
        "getDensity",
        "()Landroidx/compose/ui/unit/Density;",
        "I",
        "getVerticalMargin",
        "()I",
        "Lv3/p;",
        "getOnPositionCalculated",
        "()Lv3/p;",
        "Landroidx/compose/material3/MenuPosition$Horizontal;",
        "startToAnchorStart",
        "Landroidx/compose/material3/MenuPosition$Horizontal;",
        "endToAnchorEnd",
        "leftToWindowLeft",
        "rightToWindowRight",
        "Landroidx/compose/material3/MenuPosition$Vertical;",
        "topToAnchorBottom",
        "Landroidx/compose/material3/MenuPosition$Vertical;",
        "bottomToAnchorTop",
        "centerToAnchorTop",
        "topToWindowTop",
        "bottomToWindowBottom",
        "<init>",
        "(JLandroidx/compose/ui/unit/Density;ILv3/p;Lkotlin/jvm/internal/w;)V",
        "material3_release"
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
        "SMAP\nMenuPosition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuPosition.kt\nandroidx/compose/material3/DropdownMenuPositionProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,412:1\n1#2:413\n151#3,3:414\n33#3,4:417\n154#3,2:421\n38#3:423\n156#3:424\n116#3,2:425\n33#3,6:427\n118#3:433\n151#3,3:434\n33#3,4:437\n154#3,2:441\n38#3:443\n156#3:444\n116#3,2:445\n33#3,6:447\n118#3:453\n*S KotlinDebug\n*F\n+ 1 MenuPosition.kt\nandroidx/compose/material3/DropdownMenuPositionProvider\n*L\n371#1:414,3\n371#1:417,4\n371#1:421,2\n371#1:423\n371#1:424\n379#1:425,2\n379#1:427,6\n379#1:433\n392#1:434,3\n392#1:437,4\n392#1:441,2\n392#1:443\n392#1:444\n399#1:445,2\n399#1:447,6\n399#1:453\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final bottomToAnchorTop:Landroidx/compose/material3/MenuPosition$Vertical;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final bottomToWindowBottom:Landroidx/compose/material3/MenuPosition$Vertical;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final centerToAnchorTop:Landroidx/compose/material3/MenuPosition$Vertical;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final contentOffset:J

.field private final density:Landroidx/compose/ui/unit/Density;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final endToAnchorEnd:Landroidx/compose/material3/MenuPosition$Horizontal;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final leftToWindowLeft:Landroidx/compose/material3/MenuPosition$Horizontal;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final onPositionCalculated:Lv3/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/p<",
            "Landroidx/compose/ui/unit/IntRect;",
            "Landroidx/compose/ui/unit/IntRect;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private final rightToWindowRight:Landroidx/compose/material3/MenuPosition$Horizontal;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final startToAnchorStart:Landroidx/compose/material3/MenuPosition$Horizontal;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final topToAnchorBottom:Landroidx/compose/material3/MenuPosition$Vertical;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final topToWindowTop:Landroidx/compose/material3/MenuPosition$Vertical;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final verticalMargin:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(JLandroidx/compose/ui/unit/Density;ILv3/p;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Landroidx/compose/ui/unit/Density;",
            "I",
            "Lv3/p<",
            "-",
            "Landroidx/compose/ui/unit/IntRect;",
            "-",
            "Landroidx/compose/ui/unit/IntRect;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-wide p1, p0, Landroidx/compose/material3/DropdownMenuPositionProvider;->contentOffset:J

    .line 3
    iput-object p3, p0, Landroidx/compose/material3/DropdownMenuPositionProvider;->density:Landroidx/compose/ui/unit/Density;

    .line 4
    iput p4, p0, Landroidx/compose/material3/DropdownMenuPositionProvider;->verticalMargin:I

    .line 5
    iput-object p5, p0, Landroidx/compose/material3/DropdownMenuPositionProvider;->onPositionCalculated:Lv3/p;

    .line 6
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/DpOffset;->getX-D9Ej5fM(J)F

    move-result p5

    invoke-interface {p3, p5}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    move-result p5

    .line 7
    sget-object v0, Landroidx/compose/material3/MenuPosition;->INSTANCE:Landroidx/compose/material3/MenuPosition;

    invoke-virtual {v0, p5}, Landroidx/compose/material3/MenuPosition;->startToAnchorStart(I)Landroidx/compose/material3/MenuPosition$Horizontal;

    move-result-object v1

    iput-object v1, p0, Landroidx/compose/material3/DropdownMenuPositionProvider;->startToAnchorStart:Landroidx/compose/material3/MenuPosition$Horizontal;

    .line 8
    invoke-virtual {v0, p5}, Landroidx/compose/material3/MenuPosition;->endToAnchorEnd(I)Landroidx/compose/material3/MenuPosition$Horizontal;

    move-result-object p5

    iput-object p5, p0, Landroidx/compose/material3/DropdownMenuPositionProvider;->endToAnchorEnd:Landroidx/compose/material3/MenuPosition$Horizontal;

    const/4 p5, 0x0

    .line 9
    invoke-virtual {v0, p5}, Landroidx/compose/material3/MenuPosition;->leftToWindowLeft(I)Landroidx/compose/material3/MenuPosition$Horizontal;

    move-result-object v1

    iput-object v1, p0, Landroidx/compose/material3/DropdownMenuPositionProvider;->leftToWindowLeft:Landroidx/compose/material3/MenuPosition$Horizontal;

    .line 10
    invoke-virtual {v0, p5}, Landroidx/compose/material3/MenuPosition;->rightToWindowRight(I)Landroidx/compose/material3/MenuPosition$Horizontal;

    move-result-object p5

    iput-object p5, p0, Landroidx/compose/material3/DropdownMenuPositionProvider;->rightToWindowRight:Landroidx/compose/material3/MenuPosition$Horizontal;

    .line 11
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/DpOffset;->getY-D9Ej5fM(J)F

    move-result p1

    invoke-interface {p3, p1}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    move-result p1

    .line 12
    invoke-virtual {v0, p1}, Landroidx/compose/material3/MenuPosition;->topToAnchorBottom(I)Landroidx/compose/material3/MenuPosition$Vertical;

    move-result-object p2

    iput-object p2, p0, Landroidx/compose/material3/DropdownMenuPositionProvider;->topToAnchorBottom:Landroidx/compose/material3/MenuPosition$Vertical;

    .line 13
    invoke-virtual {v0, p1}, Landroidx/compose/material3/MenuPosition;->bottomToAnchorTop(I)Landroidx/compose/material3/MenuPosition$Vertical;

    move-result-object p2

    iput-object p2, p0, Landroidx/compose/material3/DropdownMenuPositionProvider;->bottomToAnchorTop:Landroidx/compose/material3/MenuPosition$Vertical;

    .line 14
    invoke-virtual {v0, p1}, Landroidx/compose/material3/MenuPosition;->centerToAnchorTop(I)Landroidx/compose/material3/MenuPosition$Vertical;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/material3/DropdownMenuPositionProvider;->centerToAnchorTop:Landroidx/compose/material3/MenuPosition$Vertical;

    .line 15
    invoke-virtual {v0, p4}, Landroidx/compose/material3/MenuPosition;->topToWindowTop(I)Landroidx/compose/material3/MenuPosition$Vertical;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/material3/DropdownMenuPositionProvider;->topToWindowTop:Landroidx/compose/material3/MenuPosition$Vertical;

    .line 16
    invoke-virtual {v0, p4}, Landroidx/compose/material3/MenuPosition;->bottomToWindowBottom(I)Landroidx/compose/material3/MenuPosition$Vertical;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/material3/DropdownMenuPositionProvider;->bottomToWindowBottom:Landroidx/compose/material3/MenuPosition$Vertical;

    return-void
.end method

.method public synthetic constructor <init>(JLandroidx/compose/ui/unit/Density;ILv3/p;ILkotlin/jvm/internal/w;)V
    .locals 7

    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_0

    .line 17
    invoke-static {}, Landroidx/compose/material3/MenuKt;->getMenuVerticalMargin()F

    move-result p4

    invoke-interface {p3, p4}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    move-result p4

    :cond_0
    move v4, p4

    and-int/lit8 p4, p6, 0x8

    if-eqz p4, :cond_1

    .line 18
    sget-object p5, Landroidx/compose/material3/DropdownMenuPositionProvider$2;->INSTANCE:Landroidx/compose/material3/DropdownMenuPositionProvider$2;

    :cond_1
    move-object v5, p5

    const/4 v6, 0x0

    move-object v0, p0

    move-wide v1, p1

    move-object v3, p3

    .line 19
    invoke-direct/range {v0 .. v6}, Landroidx/compose/material3/DropdownMenuPositionProvider;-><init>(JLandroidx/compose/ui/unit/Density;ILv3/p;Lkotlin/jvm/internal/w;)V

    return-void
.end method

.method public synthetic constructor <init>(JLandroidx/compose/ui/unit/Density;ILv3/p;Lkotlin/jvm/internal/w;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Landroidx/compose/material3/DropdownMenuPositionProvider;-><init>(JLandroidx/compose/ui/unit/Density;ILv3/p;)V

    return-void
.end method

.method public static synthetic copy-uVxBXkw$default(Landroidx/compose/material3/DropdownMenuPositionProvider;JLandroidx/compose/ui/unit/Density;ILv3/p;ILjava/lang/Object;)Landroidx/compose/material3/DropdownMenuPositionProvider;
    .locals 6

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-wide p1, p0, Landroidx/compose/material3/DropdownMenuPositionProvider;->contentOffset:J

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p6, 0x2

    if-eqz p1, :cond_1

    iget-object p3, p0, Landroidx/compose/material3/DropdownMenuPositionProvider;->density:Landroidx/compose/ui/unit/Density;

    :cond_1
    move-object v3, p3

    and-int/lit8 p1, p6, 0x4

    if-eqz p1, :cond_2

    iget p4, p0, Landroidx/compose/material3/DropdownMenuPositionProvider;->verticalMargin:I

    :cond_2
    move v4, p4

    and-int/lit8 p1, p6, 0x8

    if-eqz p1, :cond_3

    iget-object p5, p0, Landroidx/compose/material3/DropdownMenuPositionProvider;->onPositionCalculated:Lv3/p;

    :cond_3
    move-object v5, p5

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Landroidx/compose/material3/DropdownMenuPositionProvider;->copy-uVxBXkw(JLandroidx/compose/ui/unit/Density;ILv3/p;)Landroidx/compose/material3/DropdownMenuPositionProvider;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public calculatePosition-llwVHH4(Landroidx/compose/ui/unit/IntRect;JLandroidx/compose/ui/unit/LayoutDirection;J)J
    .locals 16
    .param p1    # Landroidx/compose/ui/unit/IntRect;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Landroidx/compose/ui/unit/LayoutDirection;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    const/4 v8, 0x3

    .line 6
    new-array v1, v8, [Landroidx/compose/material3/MenuPosition$Horizontal;

    .line 7
    .line 8
    iget-object v2, v0, Landroidx/compose/material3/DropdownMenuPositionProvider;->startToAnchorStart:Landroidx/compose/material3/MenuPosition$Horizontal;

    .line 9
    .line 10
    const/4 v9, 0x0

    .line 11
    aput-object v2, v1, v9

    .line 12
    .line 13
    iget-object v2, v0, Landroidx/compose/material3/DropdownMenuPositionProvider;->endToAnchorEnd:Landroidx/compose/material3/MenuPosition$Horizontal;

    .line 14
    .line 15
    const/4 v10, 0x1

    .line 16
    aput-object v2, v1, v10

    .line 17
    .line 18
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/unit/IntRect;->getCenter-nOcc-ac()J

    .line 19
    .line 20
    .line 21
    move-result-wide v2

    .line 22
    invoke-static {v2, v3}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    invoke-static/range {p2 .. p3}, Landroidx/compose/ui/unit/IntSize;->getWidth-impl(J)I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    const/4 v11, 0x2

    .line 31
    div-int/2addr v3, v11

    .line 32
    if-ge v2, v3, :cond_0

    .line 33
    .line 34
    iget-object v2, v0, Landroidx/compose/material3/DropdownMenuPositionProvider;->leftToWindowLeft:Landroidx/compose/material3/MenuPosition$Horizontal;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    iget-object v2, v0, Landroidx/compose/material3/DropdownMenuPositionProvider;->rightToWindowRight:Landroidx/compose/material3/MenuPosition$Horizontal;

    .line 38
    .line 39
    :goto_0
    aput-object v2, v1, v11

    .line 40
    .line 41
    invoke-static {v1}, Lkotlin/collections/u;->L([Ljava/lang/Object;)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v12

    .line 45
    new-instance v13, Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    invoke-direct {v13, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 52
    .line 53
    .line 54
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 55
    .line 56
    .line 57
    move-result v14

    .line 58
    move v15, v9

    .line 59
    :goto_1
    if-ge v15, v14, :cond_1

    .line 60
    .line 61
    invoke-interface {v12, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    check-cast v1, Landroidx/compose/material3/MenuPosition$Horizontal;

    .line 66
    .line 67
    invoke-static/range {p5 .. p6}, Landroidx/compose/ui/unit/IntSize;->getWidth-impl(J)I

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    move-object/from16 v2, p1

    .line 72
    .line 73
    move-wide/from16 v3, p2

    .line 74
    .line 75
    move-object/from16 v6, p4

    .line 76
    .line 77
    invoke-interface/range {v1 .. v6}, Landroidx/compose/material3/MenuPosition$Horizontal;->position-95KtPRI(Landroidx/compose/ui/unit/IntRect;JILandroidx/compose/ui/unit/LayoutDirection;)I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-interface {v13, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    add-int/lit8 v15, v15, 0x1

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_1
    invoke-interface {v13}, Ljava/util/List;->size()I

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    move v2, v9

    .line 96
    :goto_2
    const/4 v3, 0x0

    .line 97
    if-ge v2, v1, :cond_4

    .line 98
    .line 99
    invoke-interface {v13, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    move-object v5, v4

    .line 104
    check-cast v5, Ljava/lang/Number;

    .line 105
    .line 106
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 107
    .line 108
    .line 109
    move-result v5

    .line 110
    if-ltz v5, :cond_2

    .line 111
    .line 112
    invoke-static/range {p5 .. p6}, Landroidx/compose/ui/unit/IntSize;->getWidth-impl(J)I

    .line 113
    .line 114
    .line 115
    move-result v6

    .line 116
    add-int/2addr v5, v6

    .line 117
    invoke-static/range {p2 .. p3}, Landroidx/compose/ui/unit/IntSize;->getWidth-impl(J)I

    .line 118
    .line 119
    .line 120
    move-result v6

    .line 121
    if-gt v5, v6, :cond_2

    .line 122
    .line 123
    move v5, v10

    .line 124
    goto :goto_3

    .line 125
    :cond_2
    move v5, v9

    .line 126
    :goto_3
    if-eqz v5, :cond_3

    .line 127
    .line 128
    goto :goto_4

    .line 129
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_4
    move-object v4, v3

    .line 133
    :goto_4
    check-cast v4, Ljava/lang/Integer;

    .line 134
    .line 135
    if-eqz v4, :cond_5

    .line 136
    .line 137
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    goto :goto_5

    .line 142
    :cond_5
    invoke-static {v13}, Lkotlin/collections/u;->m3(Ljava/util/List;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    check-cast v1, Ljava/lang/Number;

    .line 147
    .line 148
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    :goto_5
    const/4 v2, 0x4

    .line 153
    new-array v2, v2, [Landroidx/compose/material3/MenuPosition$Vertical;

    .line 154
    .line 155
    iget-object v4, v0, Landroidx/compose/material3/DropdownMenuPositionProvider;->topToAnchorBottom:Landroidx/compose/material3/MenuPosition$Vertical;

    .line 156
    .line 157
    aput-object v4, v2, v9

    .line 158
    .line 159
    iget-object v4, v0, Landroidx/compose/material3/DropdownMenuPositionProvider;->bottomToAnchorTop:Landroidx/compose/material3/MenuPosition$Vertical;

    .line 160
    .line 161
    aput-object v4, v2, v10

    .line 162
    .line 163
    iget-object v4, v0, Landroidx/compose/material3/DropdownMenuPositionProvider;->centerToAnchorTop:Landroidx/compose/material3/MenuPosition$Vertical;

    .line 164
    .line 165
    aput-object v4, v2, v11

    .line 166
    .line 167
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/unit/IntRect;->getCenter-nOcc-ac()J

    .line 168
    .line 169
    .line 170
    move-result-wide v4

    .line 171
    invoke-static {v4, v5}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    .line 172
    .line 173
    .line 174
    move-result v4

    .line 175
    invoke-static/range {p2 .. p3}, Landroidx/compose/ui/unit/IntSize;->getHeight-impl(J)I

    .line 176
    .line 177
    .line 178
    move-result v5

    .line 179
    div-int/2addr v5, v11

    .line 180
    if-ge v4, v5, :cond_6

    .line 181
    .line 182
    iget-object v4, v0, Landroidx/compose/material3/DropdownMenuPositionProvider;->topToWindowTop:Landroidx/compose/material3/MenuPosition$Vertical;

    .line 183
    .line 184
    goto :goto_6

    .line 185
    :cond_6
    iget-object v4, v0, Landroidx/compose/material3/DropdownMenuPositionProvider;->bottomToWindowBottom:Landroidx/compose/material3/MenuPosition$Vertical;

    .line 186
    .line 187
    :goto_6
    aput-object v4, v2, v8

    .line 188
    .line 189
    invoke-static {v2}, Lkotlin/collections/u;->L([Ljava/lang/Object;)Ljava/util/List;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    new-instance v4, Ljava/util/ArrayList;

    .line 194
    .line 195
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 196
    .line 197
    .line 198
    move-result v5

    .line 199
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 200
    .line 201
    .line 202
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 203
    .line 204
    .line 205
    move-result v5

    .line 206
    move v6, v9

    .line 207
    :goto_7
    if-ge v6, v5, :cond_7

    .line 208
    .line 209
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v8

    .line 213
    check-cast v8, Landroidx/compose/material3/MenuPosition$Vertical;

    .line 214
    .line 215
    invoke-static/range {p5 .. p6}, Landroidx/compose/ui/unit/IntSize;->getHeight-impl(J)I

    .line 216
    .line 217
    .line 218
    move-result v11

    .line 219
    move-wide/from16 v12, p2

    .line 220
    .line 221
    invoke-interface {v8, v7, v12, v13, v11}, Landroidx/compose/material3/MenuPosition$Vertical;->position-JVtK1S4(Landroidx/compose/ui/unit/IntRect;JI)I

    .line 222
    .line 223
    .line 224
    move-result v8

    .line 225
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 226
    .line 227
    .line 228
    move-result-object v8

    .line 229
    invoke-interface {v4, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    add-int/lit8 v6, v6, 0x1

    .line 233
    .line 234
    goto :goto_7

    .line 235
    :cond_7
    move-wide/from16 v12, p2

    .line 236
    .line 237
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 238
    .line 239
    .line 240
    move-result v2

    .line 241
    move v5, v9

    .line 242
    :goto_8
    if-ge v5, v2, :cond_a

    .line 243
    .line 244
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v6

    .line 248
    move-object v8, v6

    .line 249
    check-cast v8, Ljava/lang/Number;

    .line 250
    .line 251
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 252
    .line 253
    .line 254
    move-result v8

    .line 255
    iget v11, v0, Landroidx/compose/material3/DropdownMenuPositionProvider;->verticalMargin:I

    .line 256
    .line 257
    if-lt v8, v11, :cond_8

    .line 258
    .line 259
    invoke-static/range {p5 .. p6}, Landroidx/compose/ui/unit/IntSize;->getHeight-impl(J)I

    .line 260
    .line 261
    .line 262
    move-result v11

    .line 263
    add-int/2addr v8, v11

    .line 264
    invoke-static/range {p2 .. p3}, Landroidx/compose/ui/unit/IntSize;->getHeight-impl(J)I

    .line 265
    .line 266
    .line 267
    move-result v11

    .line 268
    iget v14, v0, Landroidx/compose/material3/DropdownMenuPositionProvider;->verticalMargin:I

    .line 269
    .line 270
    sub-int/2addr v11, v14

    .line 271
    if-gt v8, v11, :cond_8

    .line 272
    .line 273
    move v8, v10

    .line 274
    goto :goto_9

    .line 275
    :cond_8
    move v8, v9

    .line 276
    :goto_9
    if-eqz v8, :cond_9

    .line 277
    .line 278
    move-object v3, v6

    .line 279
    goto :goto_a

    .line 280
    :cond_9
    add-int/lit8 v5, v5, 0x1

    .line 281
    .line 282
    goto :goto_8

    .line 283
    :cond_a
    :goto_a
    check-cast v3, Ljava/lang/Integer;

    .line 284
    .line 285
    if-eqz v3, :cond_b

    .line 286
    .line 287
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 288
    .line 289
    .line 290
    move-result v2

    .line 291
    goto :goto_b

    .line 292
    :cond_b
    invoke-static {v4}, Lkotlin/collections/u;->m3(Ljava/util/List;)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v2

    .line 296
    check-cast v2, Ljava/lang/Number;

    .line 297
    .line 298
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 299
    .line 300
    .line 301
    move-result v2

    .line 302
    :goto_b
    invoke-static {v1, v2}, Landroidx/compose/ui/unit/IntOffsetKt;->IntOffset(II)J

    .line 303
    .line 304
    .line 305
    move-result-wide v1

    .line 306
    iget-object v3, v0, Landroidx/compose/material3/DropdownMenuPositionProvider;->onPositionCalculated:Lv3/p;

    .line 307
    .line 308
    move-wide/from16 v4, p5

    .line 309
    .line 310
    invoke-static {v1, v2, v4, v5}, Landroidx/compose/ui/unit/IntRectKt;->IntRect-VbeCjmY(JJ)Landroidx/compose/ui/unit/IntRect;

    .line 311
    .line 312
    .line 313
    move-result-object v4

    .line 314
    invoke-interface {v3, v7, v4}, Lv3/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    return-wide v1
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
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
.end method

.method public final component1-RKDOV3M()J
    .locals 2

    iget-wide v0, p0, Landroidx/compose/material3/DropdownMenuPositionProvider;->contentOffset:J

    return-wide v0
.end method

.method public final component2()Landroidx/compose/ui/unit/Density;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/material3/DropdownMenuPositionProvider;->density:Landroidx/compose/ui/unit/Density;

    return-object v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Landroidx/compose/material3/DropdownMenuPositionProvider;->verticalMargin:I

    return v0
.end method

.method public final component4()Lv3/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lv3/p<",
            "Landroidx/compose/ui/unit/IntRect;",
            "Landroidx/compose/ui/unit/IntRect;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/material3/DropdownMenuPositionProvider;->onPositionCalculated:Lv3/p;

    return-object v0
.end method

.method public final copy-uVxBXkw(JLandroidx/compose/ui/unit/Density;ILv3/p;)Landroidx/compose/material3/DropdownMenuPositionProvider;
    .locals 8
    .param p3    # Landroidx/compose/ui/unit/Density;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p5    # Lv3/p;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Landroidx/compose/ui/unit/Density;",
            "I",
            "Lv3/p<",
            "-",
            "Landroidx/compose/ui/unit/IntRect;",
            "-",
            "Landroidx/compose/ui/unit/IntRect;",
            "Lkotlin/r2;",
            ">;)",
            "Landroidx/compose/material3/DropdownMenuPositionProvider;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    new-instance v7, Landroidx/compose/material3/DropdownMenuPositionProvider;

    const/4 v6, 0x0

    move-object v0, v7

    move-wide v1, p1

    move-object v3, p3

    move v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v6}, Landroidx/compose/material3/DropdownMenuPositionProvider;-><init>(JLandroidx/compose/ui/unit/Density;ILv3/p;Lkotlin/jvm/internal/w;)V

    return-object v7
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/compose/material3/DropdownMenuPositionProvider;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Landroidx/compose/material3/DropdownMenuPositionProvider;

    iget-wide v3, p0, Landroidx/compose/material3/DropdownMenuPositionProvider;->contentOffset:J

    iget-wide v5, p1, Landroidx/compose/material3/DropdownMenuPositionProvider;->contentOffset:J

    invoke-static {v3, v4, v5, v6}, Landroidx/compose/ui/unit/DpOffset;->equals-impl0(JJ)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Landroidx/compose/material3/DropdownMenuPositionProvider;->density:Landroidx/compose/ui/unit/Density;

    iget-object v3, p1, Landroidx/compose/material3/DropdownMenuPositionProvider;->density:Landroidx/compose/ui/unit/Density;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Landroidx/compose/material3/DropdownMenuPositionProvider;->verticalMargin:I

    iget v3, p1, Landroidx/compose/material3/DropdownMenuPositionProvider;->verticalMargin:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Landroidx/compose/material3/DropdownMenuPositionProvider;->onPositionCalculated:Lv3/p;

    iget-object p1, p1, Landroidx/compose/material3/DropdownMenuPositionProvider;->onPositionCalculated:Lv3/p;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getContentOffset-RKDOV3M()J
    .locals 2

    iget-wide v0, p0, Landroidx/compose/material3/DropdownMenuPositionProvider;->contentOffset:J

    return-wide v0
.end method

.method public final getDensity()Landroidx/compose/ui/unit/Density;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/material3/DropdownMenuPositionProvider;->density:Landroidx/compose/ui/unit/Density;

    return-object v0
.end method

.method public final getOnPositionCalculated()Lv3/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lv3/p<",
            "Landroidx/compose/ui/unit/IntRect;",
            "Landroidx/compose/ui/unit/IntRect;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/material3/DropdownMenuPositionProvider;->onPositionCalculated:Lv3/p;

    return-object v0
.end method

.method public final getVerticalMargin()I
    .locals 1

    iget v0, p0, Landroidx/compose/material3/DropdownMenuPositionProvider;->verticalMargin:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-wide v0, p0, Landroidx/compose/material3/DropdownMenuPositionProvider;->contentOffset:J

    invoke-static {v0, v1}, Landroidx/compose/ui/unit/DpOffset;->hashCode-impl(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/compose/material3/DropdownMenuPositionProvider;->density:Landroidx/compose/ui/unit/Density;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Landroidx/compose/material3/DropdownMenuPositionProvider;->verticalMargin:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/compose/material3/DropdownMenuPositionProvider;->onPositionCalculated:Lv3/p;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DropdownMenuPositionProvider(contentOffset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Landroidx/compose/material3/DropdownMenuPositionProvider;->contentOffset:J

    invoke-static {v1, v2}, Landroidx/compose/ui/unit/DpOffset;->toString-impl(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", density="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/material3/DropdownMenuPositionProvider;->density:Landroidx/compose/ui/unit/Density;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", verticalMargin="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/compose/material3/DropdownMenuPositionProvider;->verticalMargin:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", onPositionCalculated="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/material3/DropdownMenuPositionProvider;->onPositionCalculated:Lv3/p;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
