.class public final Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;
.super Landroidx/compose/ui/Modifier$Node;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/node/LayoutModifierNode;
.implements Landroidx/compose/ui/node/DrawModifierNode;
.implements Landroidx/compose/ui/node/SemanticsModifierNode;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode$TextSubstitutionValue;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u00ac\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0008\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001YBS\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u001c\u0012\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u000b\u0012\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u0016\u0012\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u0016\u0012\n\u0008\u0002\u0010?\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008W\u0010XJ\u0010\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0008\u0010\u000e\u001a\u00020\rH\u0002J\u0018\u0010\u0013\u001a\u00020\u000b2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\tJ@\u0010 \u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u001e\u0010$\u001a\u00020\r2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000bJ\u000c\u0010&\u001a\u00020\r*\u00020%H\u0016J&\u0010/\u001a\u00020,*\u00020\'2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*H\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008-\u0010.J\u001c\u00103\u001a\u00020\u0016*\u0002002\u0006\u0010)\u001a\u0002012\u0006\u00102\u001a\u00020\u0016H\u0016J\u001c\u00105\u001a\u00020\u0016*\u0002002\u0006\u0010)\u001a\u0002012\u0006\u00104\u001a\u00020\u0016H\u0016J\u001c\u00106\u001a\u00020\u0016*\u0002002\u0006\u0010)\u001a\u0002012\u0006\u00102\u001a\u00020\u0016H\u0016J\u001c\u00107\u001a\u00020\u0016*\u0002002\u0006\u0010)\u001a\u0002012\u0006\u00104\u001a\u00020\u0016H\u0016J\u000c\u00109\u001a\u00020\r*\u000208H\u0016R\u0016\u0010\u0014\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010:R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010;R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010<R\u001c\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010=R\u0016\u0010\u0019\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010>R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010=R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010=R\u0018\u0010?\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008?\u0010@R$\u0010C\u001a\u0010\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\u0016\u0018\u00010A8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008C\u0010DR\u0018\u0010E\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008E\u0010FR*\u0010J\u001a\u0016\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020I0H\u0012\u0004\u0012\u00020\u000b\u0018\u00010G8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008J\u0010KR/\u0010T\u001a\u0004\u0018\u00010L2\u0008\u0010M\u001a\u0004\u0018\u00010L8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008N\u0010O\u001a\u0004\u0008P\u0010Q\"\u0004\u0008R\u0010SR\u0014\u0010V\u001a\u00020\u00078BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010U\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006Z"
    }
    d2 = {
        "Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;",
        "Landroidx/compose/ui/Modifier$Node;",
        "Landroidx/compose/ui/node/LayoutModifierNode;",
        "Landroidx/compose/ui/node/DrawModifierNode;",
        "Landroidx/compose/ui/node/SemanticsModifierNode;",
        "Landroidx/compose/ui/unit/Density;",
        "density",
        "Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;",
        "getLayoutCache",
        "",
        "updatedText",
        "",
        "setSubstitution",
        "Lkotlin/r2;",
        "clearSubstitution",
        "Landroidx/compose/ui/graphics/ColorProducer;",
        "color",
        "Landroidx/compose/ui/text/TextStyle;",
        "style",
        "updateDraw",
        "text",
        "updateText",
        "",
        "minLines",
        "maxLines",
        "softWrap",
        "Landroidx/compose/ui/text/font/FontFamily$Resolver;",
        "fontFamilyResolver",
        "Landroidx/compose/ui/text/style/TextOverflow;",
        "overflow",
        "updateLayoutRelatedArgs-HuAbxIM",
        "(Landroidx/compose/ui/text/TextStyle;IIZLandroidx/compose/ui/text/font/FontFamily$Resolver;I)Z",
        "updateLayoutRelatedArgs",
        "drawChanged",
        "textChanged",
        "layoutChanged",
        "doInvalidations",
        "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;",
        "applySemantics",
        "Landroidx/compose/ui/layout/MeasureScope;",
        "Landroidx/compose/ui/layout/Measurable;",
        "measurable",
        "Landroidx/compose/ui/unit/Constraints;",
        "constraints",
        "Landroidx/compose/ui/layout/MeasureResult;",
        "measure-3p2s80s",
        "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;",
        "measure",
        "Landroidx/compose/ui/layout/IntrinsicMeasureScope;",
        "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
        "height",
        "minIntrinsicWidth",
        "width",
        "minIntrinsicHeight",
        "maxIntrinsicWidth",
        "maxIntrinsicHeight",
        "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;",
        "draw",
        "Ljava/lang/String;",
        "Landroidx/compose/ui/text/TextStyle;",
        "Landroidx/compose/ui/text/font/FontFamily$Resolver;",
        "I",
        "Z",
        "overrideColor",
        "Landroidx/compose/ui/graphics/ColorProducer;",
        "",
        "Landroidx/compose/ui/layout/AlignmentLine;",
        "baselineCache",
        "Ljava/util/Map;",
        "_layoutCache",
        "Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;",
        "Lkotlin/Function1;",
        "",
        "Landroidx/compose/ui/text/TextLayoutResult;",
        "semanticsTextLayoutResult",
        "Lv3/l;",
        "Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode$TextSubstitutionValue;",
        "<set-?>",
        "textSubstitution$delegate",
        "Landroidx/compose/runtime/MutableState;",
        "getTextSubstitution",
        "()Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode$TextSubstitutionValue;",
        "setTextSubstitution",
        "(Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode$TextSubstitutionValue;)V",
        "textSubstitution",
        "()Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;",
        "layoutCache",
        "<init>",
        "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;IZIILandroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/internal/w;)V",
        "TextSubstitutionValue",
        "foundation_release"
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
        "SMAP\nTextStringSimpleNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextStringSimpleNode.kt\nandroidx/compose/foundation/text/modifiers/TextStringSimpleNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 5 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,440:1\n1#2:441\n81#3:442\n107#3,2:443\n246#4:445\n646#5:446\n646#5:447\n*S KotlinDebug\n*F\n+ 1 TextStringSimpleNode.kt\nandroidx/compose/foundation/text/modifiers/TextStringSimpleNode\n*L\n222#1:442\n222#1:443,2\n391#1:445\n417#1:446\n419#1:447\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private _layoutCache:Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private baselineCache:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroidx/compose/ui/layout/AlignmentLine;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation
.end field

.field private fontFamilyResolver:Landroidx/compose/ui/text/font/FontFamily$Resolver;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private maxLines:I

.field private minLines:I

.field private overflow:I

.field private overrideColor:Landroidx/compose/ui/graphics/ColorProducer;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private semanticsTextLayoutResult:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "-",
            "Ljava/util/List<",
            "Landroidx/compose/ui/text/TextLayoutResult;",
            ">;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation
.end field

.field private softWrap:Z

.field private style:Landroidx/compose/ui/text/TextStyle;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private text:Ljava/lang/String;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final textSubstitution$delegate:Landroidx/compose/runtime/MutableState;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;IZIILandroidx/compose/ui/graphics/ColorProducer;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Landroidx/compose/ui/Modifier$Node;-><init>()V

    .line 4
    iput-object p1, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->text:Ljava/lang/String;

    .line 5
    iput-object p2, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->style:Landroidx/compose/ui/text/TextStyle;

    .line 6
    iput-object p3, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->fontFamilyResolver:Landroidx/compose/ui/text/font/FontFamily$Resolver;

    .line 7
    iput p4, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->overflow:I

    .line 8
    iput-boolean p5, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->softWrap:Z

    .line 9
    iput p6, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->maxLines:I

    .line 10
    iput p7, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->minLines:I

    .line 11
    iput-object p8, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->overrideColor:Landroidx/compose/ui/graphics/ColorProducer;

    const/4 p1, 0x0

    const/4 p2, 0x2

    .line 12
    invoke-static {p1, p1, p2, p1}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->textSubstitution$delegate:Landroidx/compose/runtime/MutableState;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;IZIILandroidx/compose/ui/graphics/ColorProducer;ILkotlin/jvm/internal/w;)V
    .locals 12

    move/from16 v0, p9

    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_0

    .line 1
    sget-object v1, Landroidx/compose/ui/text/style/TextOverflow;->Companion:Landroidx/compose/ui/text/style/TextOverflow$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/text/style/TextOverflow$Companion;->getClip-gIe3tQ8()I

    move-result v1

    move v6, v1

    goto :goto_0

    :cond_0
    move/from16 v6, p4

    :goto_0
    and-int/lit8 v1, v0, 0x10

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    move v7, v2

    goto :goto_1

    :cond_1
    move/from16 v7, p5

    :goto_1
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_2

    const v1, 0x7fffffff

    move v8, v1

    goto :goto_2

    :cond_2
    move/from16 v8, p6

    :goto_2
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_3

    move v9, v2

    goto :goto_3

    :cond_3
    move/from16 v9, p7

    :goto_3
    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_4

    const/4 v0, 0x0

    move-object v10, v0

    goto :goto_4

    :cond_4
    move-object/from16 v10, p8

    :goto_4
    const/4 v11, 0x0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    .line 2
    invoke-direct/range {v2 .. v11}, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;-><init>(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;IZIILandroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/internal/w;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;IZIILandroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/internal/w;)V
    .locals 0

    invoke-direct/range {p0 .. p8}, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;-><init>(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;IZIILandroidx/compose/ui/graphics/ColorProducer;)V

    return-void
.end method

.method public static final synthetic access$clearSubstitution(Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->clearSubstitution()V

    return-void
.end method

.method public static final synthetic access$getLayoutCache(Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;)Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;
    .locals 0

    invoke-direct {p0}, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->getLayoutCache()Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getOverrideColor$p(Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;)Landroidx/compose/ui/graphics/ColorProducer;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->overrideColor:Landroidx/compose/ui/graphics/ColorProducer;

    return-object p0
.end method

.method public static final synthetic access$getStyle$p(Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;)Landroidx/compose/ui/text/TextStyle;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->style:Landroidx/compose/ui/text/TextStyle;

    return-object p0
.end method

.method public static final synthetic access$getTextSubstitution(Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;)Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode$TextSubstitutionValue;
    .locals 0

    invoke-direct {p0}, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->getTextSubstitution()Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode$TextSubstitutionValue;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$setSubstitution(Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;Ljava/lang/String;)Z
    .locals 0

    invoke-direct {p0, p1}, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->setSubstitution(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method private final clearSubstitution()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->setTextSubstitution(Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode$TextSubstitutionValue;)V

    return-void
.end method

.method private final getLayoutCache()Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;
    .locals 10

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->_layoutCache:Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;

    .line 3
    iget-object v2, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->text:Ljava/lang/String;

    .line 4
    iget-object v3, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->style:Landroidx/compose/ui/text/TextStyle;

    .line 5
    iget-object v4, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->fontFamilyResolver:Landroidx/compose/ui/text/font/FontFamily$Resolver;

    .line 6
    iget v5, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->overflow:I

    .line 7
    iget-boolean v6, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->softWrap:Z

    .line 8
    iget v7, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->maxLines:I

    .line 9
    iget v8, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->minLines:I

    const/4 v9, 0x0

    move-object v1, v0

    .line 10
    invoke-direct/range {v1 .. v9}, Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;-><init>(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;IZIILkotlin/jvm/internal/w;)V

    iput-object v0, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->_layoutCache:Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;

    .line 11
    :cond_0
    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->_layoutCache:Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    return-object v0
.end method

.method private final getLayoutCache(Landroidx/compose/ui/unit/Density;)Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;
    .locals 2

    .line 12
    invoke-direct {p0}, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->getTextSubstitution()Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode$TextSubstitutionValue;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 13
    invoke-virtual {v0}, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode$TextSubstitutionValue;->isShowingSubstitution()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 14
    invoke-virtual {v0}, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode$TextSubstitutionValue;->getLayoutCache()Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 15
    invoke-virtual {v0, p1}, Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;->setDensity$foundation_release(Landroidx/compose/ui/unit/Density;)V

    return-object v0

    .line 16
    :cond_0
    invoke-direct {p0}, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->getLayoutCache()Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;->setDensity$foundation_release(Landroidx/compose/ui/unit/Density;)V

    return-object v0
.end method

.method private final getTextSubstitution()Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode$TextSubstitutionValue;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->textSubstitution$delegate:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode$TextSubstitutionValue;

    .line 8
    .line 9
    return-object v0
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

.method private final setSubstitution(Ljava/lang/String;)Z
    .locals 12

    .line 1
    invoke-direct {p0}, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->getTextSubstitution()Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode$TextSubstitutionValue;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode$TextSubstitutionValue;->getSubstitution()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {p1, v1}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v8, 0x0

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    return v8

    .line 19
    :cond_0
    invoke-virtual {v0, p1}, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode$TextSubstitutionValue;->setSubstitution(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode$TextSubstitutionValue;->getLayoutCache()Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iget-object v2, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->style:Landroidx/compose/ui/text/TextStyle;

    .line 29
    .line 30
    iget-object v3, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->fontFamilyResolver:Landroidx/compose/ui/text/font/FontFamily$Resolver;

    .line 31
    .line 32
    iget v4, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->overflow:I

    .line 33
    .line 34
    iget-boolean v5, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->softWrap:Z

    .line 35
    .line 36
    iget v6, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->maxLines:I

    .line 37
    .line 38
    iget v9, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->minLines:I

    .line 39
    .line 40
    move-object v1, p1

    .line 41
    move v7, v9

    .line 42
    invoke-virtual/range {v0 .. v7}, Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;->update-L6sJoHM(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;IZII)V

    .line 43
    .line 44
    .line 45
    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    const/4 v0, 0x0

    .line 49
    :goto_0
    if-nez v0, :cond_3

    .line 50
    .line 51
    return v8

    .line 52
    :cond_2
    new-instance v9, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode$TextSubstitutionValue;

    .line 53
    .line 54
    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->text:Ljava/lang/String;

    .line 55
    .line 56
    const/4 v3, 0x0

    .line 57
    const/4 v4, 0x0

    .line 58
    const/16 v5, 0xc

    .line 59
    .line 60
    const/4 v6, 0x0

    .line 61
    move-object v0, v9

    .line 62
    move-object v2, p1

    .line 63
    invoke-direct/range {v0 .. v6}, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode$TextSubstitutionValue;-><init>(Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;ILkotlin/jvm/internal/w;)V

    .line 64
    .line 65
    .line 66
    new-instance v10, Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;

    .line 67
    .line 68
    iget-object v2, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->style:Landroidx/compose/ui/text/TextStyle;

    .line 69
    .line 70
    iget-object v3, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->fontFamilyResolver:Landroidx/compose/ui/text/font/FontFamily$Resolver;

    .line 71
    .line 72
    iget v4, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->overflow:I

    .line 73
    .line 74
    iget-boolean v5, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->softWrap:Z

    .line 75
    .line 76
    iget v6, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->maxLines:I

    .line 77
    .line 78
    iget v8, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->minLines:I

    .line 79
    .line 80
    const/4 v11, 0x0

    .line 81
    move-object v0, v10

    .line 82
    move-object v1, p1

    .line 83
    move v7, v8

    .line 84
    move-object v8, v11

    .line 85
    invoke-direct/range {v0 .. v8}, Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;-><init>(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;IZIILkotlin/jvm/internal/w;)V

    .line 86
    .line 87
    .line 88
    invoke-direct {p0}, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->getLayoutCache()Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-virtual {v0}, Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;->getDensity$foundation_release()Landroidx/compose/ui/unit/Density;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-virtual {v10, v0}, Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;->setDensity$foundation_release(Landroidx/compose/ui/unit/Density;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v9, v10}, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode$TextSubstitutionValue;->setLayoutCache(Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;)V

    .line 100
    .line 101
    .line 102
    invoke-direct {p0, v9}, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->setTextSubstitution(Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode$TextSubstitutionValue;)V

    .line 103
    .line 104
    .line 105
    :cond_3
    const/4 v0, 0x1

    .line 106
    return v0
.end method

.method private final setTextSubstitution(Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode$TextSubstitutionValue;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->textSubstitution$delegate:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

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
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method


# virtual methods
.method public applySemantics(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V
    .locals 9
    .param p1    # Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->semanticsTextLayoutResult:Lv3/l;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode$applySemantics$1;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode$applySemantics$1;-><init>(Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->semanticsTextLayoutResult:Lv3/l;

    .line 11
    .line 12
    :cond_0
    new-instance v7, Landroidx/compose/ui/text/AnnotatedString;

    .line 13
    .line 14
    iget-object v2, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->text:Ljava/lang/String;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v5, 0x6

    .line 19
    const/4 v6, 0x0

    .line 20
    move-object v1, v7

    .line 21
    invoke-direct/range {v1 .. v6}, Landroidx/compose/ui/text/AnnotatedString;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/w;)V

    .line 22
    .line 23
    .line 24
    invoke-static {p1, v7}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->setText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/text/AnnotatedString;)V

    .line 25
    .line 26
    .line 27
    invoke-direct {p0}, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->getTextSubstitution()Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode$TextSubstitutionValue;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    invoke-virtual {v1}, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode$TextSubstitutionValue;->isShowingSubstitution()Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    invoke-static {p1, v2}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->setShowingTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Z)V

    .line 38
    .line 39
    .line 40
    new-instance v2, Landroidx/compose/ui/text/AnnotatedString;

    .line 41
    .line 42
    invoke-virtual {v1}, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode$TextSubstitutionValue;->getSubstitution()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    const/4 v5, 0x0

    .line 47
    const/4 v6, 0x0

    .line 48
    const/4 v7, 0x6

    .line 49
    const/4 v8, 0x0

    .line 50
    move-object v3, v2

    .line 51
    invoke-direct/range {v3 .. v8}, Landroidx/compose/ui/text/AnnotatedString;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/w;)V

    .line 52
    .line 53
    .line 54
    invoke-static {p1, v2}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->setTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/text/AnnotatedString;)V

    .line 55
    .line 56
    .line 57
    :cond_1
    new-instance v1, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode$applySemantics$2;

    .line 58
    .line 59
    invoke-direct {v1, p0}, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode$applySemantics$2;-><init>(Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;)V

    .line 60
    .line 61
    .line 62
    const/4 v2, 0x0

    .line 63
    const/4 v3, 0x1

    .line 64
    invoke-static {p1, v2, v1, v3, v2}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->setTextSubstitution$default(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;Lv3/l;ILjava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    new-instance v1, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode$applySemantics$3;

    .line 68
    .line 69
    invoke-direct {v1, p0}, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode$applySemantics$3;-><init>(Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;)V

    .line 70
    .line 71
    .line 72
    invoke-static {p1, v2, v1, v3, v2}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->showTextSubstitution$default(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;Lv3/l;ILjava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    new-instance v1, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode$applySemantics$4;

    .line 76
    .line 77
    invoke-direct {v1, p0}, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode$applySemantics$4;-><init>(Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;)V

    .line 78
    .line 79
    .line 80
    invoke-static {p1, v2, v1, v3, v2}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->clearTextSubstitution$default(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;Lv3/a;ILjava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    invoke-static {p1, v2, v0, v3, v2}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->getTextLayoutResult$default(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;Lv3/l;ILjava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    return-void
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

.method public final doInvalidations(ZZZ)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    if-nez p2, :cond_1

    .line 9
    .line 10
    if-eqz p1, :cond_2

    .line 11
    .line 12
    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->semanticsTextLayoutResult:Lv3/l;

    .line 13
    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    :cond_1
    invoke-static {p0}, Landroidx/compose/ui/node/SemanticsModifierNodeKt;->invalidateSemantics(Landroidx/compose/ui/node/SemanticsModifierNode;)V

    .line 17
    .line 18
    .line 19
    :cond_2
    if-nez p2, :cond_3

    .line 20
    .line 21
    if-eqz p3, :cond_4

    .line 22
    .line 23
    :cond_3
    invoke-direct {p0}, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->getLayoutCache()Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    iget-object v2, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->text:Ljava/lang/String;

    .line 28
    .line 29
    iget-object v3, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->style:Landroidx/compose/ui/text/TextStyle;

    .line 30
    .line 31
    iget-object v4, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->fontFamilyResolver:Landroidx/compose/ui/text/font/FontFamily$Resolver;

    .line 32
    .line 33
    iget v5, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->overflow:I

    .line 34
    .line 35
    iget-boolean v6, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->softWrap:Z

    .line 36
    .line 37
    iget v7, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->maxLines:I

    .line 38
    .line 39
    iget v8, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->minLines:I

    .line 40
    .line 41
    invoke-virtual/range {v1 .. v8}, Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;->update-L6sJoHM(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;IZII)V

    .line 42
    .line 43
    .line 44
    invoke-static {p0}, Landroidx/compose/ui/node/LayoutModifierNodeKt;->invalidateMeasurement(Landroidx/compose/ui/node/LayoutModifierNode;)V

    .line 45
    .line 46
    .line 47
    invoke-static {p0}, Landroidx/compose/ui/node/DrawModifierNodeKt;->invalidateDraw(Landroidx/compose/ui/node/DrawModifierNode;)V

    .line 48
    .line 49
    .line 50
    :cond_4
    if-eqz p1, :cond_5

    .line 51
    .line 52
    invoke-static {p0}, Landroidx/compose/ui/node/DrawModifierNodeKt;->invalidateDraw(Landroidx/compose/ui/node/DrawModifierNode;)V

    .line 53
    .line 54
    .line 55
    :cond_5
    return-void
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

.method public draw(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V
    .locals 13
    .param p1    # Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-direct {p0}, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->getLayoutCache()Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;->getParagraph$foundation_release()Landroidx/compose/ui/text/Paragraph;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-eqz v1, :cond_d

    .line 17
    .line 18
    invoke-interface {p1}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getDrawContext()Landroidx/compose/ui/graphics/drawscope/DrawContext;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-interface {p1}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getCanvas()Landroidx/compose/ui/graphics/Canvas;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-direct {p0}, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->getLayoutCache()Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;->getDidOverflow$foundation_release()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    const/4 v2, 0x0

    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    invoke-direct {p0}, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->getLayoutCache()Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-virtual {v3}, Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;->getLayoutSize-YbymL2g$foundation_release()J

    .line 42
    .line 43
    .line 44
    move-result-wide v3

    .line 45
    invoke-static {v3, v4}, Landroidx/compose/ui/unit/IntSize;->getWidth-impl(J)I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    int-to-float v3, v3

    .line 50
    invoke-direct {p0}, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->getLayoutCache()Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    invoke-virtual {v4}, Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;->getLayoutSize-YbymL2g$foundation_release()J

    .line 55
    .line 56
    .line 57
    move-result-wide v4

    .line 58
    invoke-static {v4, v5}, Landroidx/compose/ui/unit/IntSize;->getHeight-impl(J)I

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    int-to-float v4, v4

    .line 63
    sget-object v5, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 64
    .line 65
    invoke-virtual {v5}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    .line 66
    .line 67
    .line 68
    move-result-wide v5

    .line 69
    invoke-static {v3, v4}, Landroidx/compose/ui/geometry/SizeKt;->Size(FF)J

    .line 70
    .line 71
    .line 72
    move-result-wide v3

    .line 73
    invoke-static {v5, v6, v3, v4}, Landroidx/compose/ui/geometry/RectKt;->Rect-tz77jQw(JJ)Landroidx/compose/ui/geometry/Rect;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    invoke-interface {p1}, Landroidx/compose/ui/graphics/Canvas;->save()V

    .line 78
    .line 79
    .line 80
    const/4 v4, 0x2

    .line 81
    const/4 v5, 0x0

    .line 82
    invoke-static {p1, v3, v2, v4, v5}, Landroidx/compose/ui/graphics/Canvas;->clipRect-mtrdD-E$default(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/geometry/Rect;IILjava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    :cond_1
    :try_start_0
    iget-object v3, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->style:Landroidx/compose/ui/text/TextStyle;

    .line 86
    .line 87
    invoke-virtual {v3}, Landroidx/compose/ui/text/TextStyle;->getTextDecoration()Landroidx/compose/ui/text/style/TextDecoration;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    if-nez v3, :cond_2

    .line 92
    .line 93
    sget-object v3, Landroidx/compose/ui/text/style/TextDecoration;->Companion:Landroidx/compose/ui/text/style/TextDecoration$Companion;

    .line 94
    .line 95
    invoke-virtual {v3}, Landroidx/compose/ui/text/style/TextDecoration$Companion;->getNone()Landroidx/compose/ui/text/style/TextDecoration;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    :cond_2
    move-object v6, v3

    .line 100
    iget-object v3, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->style:Landroidx/compose/ui/text/TextStyle;

    .line 101
    .line 102
    invoke-virtual {v3}, Landroidx/compose/ui/text/TextStyle;->getShadow()Landroidx/compose/ui/graphics/Shadow;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    if-nez v3, :cond_3

    .line 107
    .line 108
    sget-object v3, Landroidx/compose/ui/graphics/Shadow;->Companion:Landroidx/compose/ui/graphics/Shadow$Companion;

    .line 109
    .line 110
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/Shadow$Companion;->getNone()Landroidx/compose/ui/graphics/Shadow;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    :cond_3
    move-object v5, v3

    .line 115
    iget-object v3, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->style:Landroidx/compose/ui/text/TextStyle;

    .line 116
    .line 117
    invoke-virtual {v3}, Landroidx/compose/ui/text/TextStyle;->getDrawStyle()Landroidx/compose/ui/graphics/drawscope/DrawStyle;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    if-nez v3, :cond_4

    .line 122
    .line 123
    sget-object v3, Landroidx/compose/ui/graphics/drawscope/Fill;->INSTANCE:Landroidx/compose/ui/graphics/drawscope/Fill;

    .line 124
    .line 125
    :cond_4
    move-object v7, v3

    .line 126
    iget-object v3, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->style:Landroidx/compose/ui/text/TextStyle;

    .line 127
    .line 128
    invoke-virtual {v3}, Landroidx/compose/ui/text/TextStyle;->getBrush()Landroidx/compose/ui/graphics/Brush;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    if-eqz v3, :cond_5

    .line 133
    .line 134
    iget-object v2, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->style:Landroidx/compose/ui/text/TextStyle;

    .line 135
    .line 136
    invoke-virtual {v2}, Landroidx/compose/ui/text/TextStyle;->getAlpha()F

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    const/4 v8, 0x0

    .line 141
    const/16 v9, 0x40

    .line 142
    .line 143
    const/4 v10, 0x0

    .line 144
    move-object v2, p1

    .line 145
    invoke-static/range {v1 .. v10}, Landroidx/compose/ui/text/Paragraph;->paint-hn5TExg$default(Landroidx/compose/ui/text/Paragraph;Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IILjava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    goto :goto_4

    .line 149
    :cond_5
    iget-object v3, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->overrideColor:Landroidx/compose/ui/graphics/ColorProducer;

    .line 150
    .line 151
    if-eqz v3, :cond_6

    .line 152
    .line 153
    invoke-interface {v3}, Landroidx/compose/ui/graphics/ColorProducer;->invoke-0d7_KjU()J

    .line 154
    .line 155
    .line 156
    move-result-wide v3

    .line 157
    goto :goto_0

    .line 158
    :cond_6
    sget-object v3, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 159
    .line 160
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    .line 161
    .line 162
    .line 163
    move-result-wide v3

    .line 164
    :goto_0
    sget-object v8, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 165
    .line 166
    invoke-virtual {v8}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    .line 167
    .line 168
    .line 169
    move-result-wide v9

    .line 170
    cmp-long v9, v3, v9

    .line 171
    .line 172
    const/4 v10, 0x1

    .line 173
    if-eqz v9, :cond_7

    .line 174
    .line 175
    move v9, v10

    .line 176
    goto :goto_1

    .line 177
    :cond_7
    move v9, v2

    .line 178
    :goto_1
    if-eqz v9, :cond_8

    .line 179
    .line 180
    goto :goto_3

    .line 181
    :cond_8
    iget-object v3, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->style:Landroidx/compose/ui/text/TextStyle;

    .line 182
    .line 183
    invoke-virtual {v3}, Landroidx/compose/ui/text/TextStyle;->getColor-0d7_KjU()J

    .line 184
    .line 185
    .line 186
    move-result-wide v3

    .line 187
    invoke-virtual {v8}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    .line 188
    .line 189
    .line 190
    move-result-wide v11

    .line 191
    cmp-long v3, v3, v11

    .line 192
    .line 193
    if-eqz v3, :cond_9

    .line 194
    .line 195
    move v2, v10

    .line 196
    :cond_9
    if-eqz v2, :cond_a

    .line 197
    .line 198
    iget-object v2, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->style:Landroidx/compose/ui/text/TextStyle;

    .line 199
    .line 200
    invoke-virtual {v2}, Landroidx/compose/ui/text/TextStyle;->getColor-0d7_KjU()J

    .line 201
    .line 202
    .line 203
    move-result-wide v2

    .line 204
    goto :goto_2

    .line 205
    :cond_a
    invoke-virtual {v8}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 206
    .line 207
    .line 208
    move-result-wide v2

    .line 209
    :goto_2
    move-wide v3, v2

    .line 210
    :goto_3
    const/4 v8, 0x0

    .line 211
    const/16 v9, 0x20

    .line 212
    .line 213
    const/4 v10, 0x0

    .line 214
    move-object v2, p1

    .line 215
    invoke-static/range {v1 .. v10}, Landroidx/compose/ui/text/Paragraph;->paint-LG529CI$default(Landroidx/compose/ui/text/Paragraph;Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 216
    .line 217
    .line 218
    :goto_4
    if-eqz v0, :cond_b

    .line 219
    .line 220
    invoke-interface {p1}, Landroidx/compose/ui/graphics/Canvas;->restore()V

    .line 221
    .line 222
    .line 223
    :cond_b
    return-void

    .line 224
    :catchall_0
    move-exception v1

    .line 225
    if-eqz v0, :cond_c

    .line 226
    .line 227
    invoke-interface {p1}, Landroidx/compose/ui/graphics/Canvas;->restore()V

    .line 228
    .line 229
    .line 230
    :cond_c
    throw v1

    .line 231
    :cond_d
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 232
    .line 233
    const-string v0, "no paragraph"

    .line 234
    .line 235
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    throw p1
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

.method public maxIntrinsicHeight(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I
    .locals 0
    .param p1    # Landroidx/compose/ui/layout/IntrinsicMeasureScope;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/ui/layout/IntrinsicMeasurable;
        .annotation build Lp4/l;
        .end annotation
    .end param

    invoke-direct {p0, p1}, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->getLayoutCache(Landroidx/compose/ui/unit/Density;)Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;

    move-result-object p2

    invoke-interface {p1}, Landroidx/compose/ui/layout/IntrinsicMeasureScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    move-result-object p1

    invoke-virtual {p2, p3, p1}, Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;->intrinsicHeight(ILandroidx/compose/ui/unit/LayoutDirection;)I

    move-result p1

    return p1
.end method

.method public maxIntrinsicWidth(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I
    .locals 0
    .param p1    # Landroidx/compose/ui/layout/IntrinsicMeasureScope;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/ui/layout/IntrinsicMeasurable;
        .annotation build Lp4/l;
        .end annotation
    .end param

    invoke-direct {p0, p1}, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->getLayoutCache(Landroidx/compose/ui/unit/Density;)Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;

    move-result-object p2

    invoke-interface {p1}, Landroidx/compose/ui/layout/IntrinsicMeasureScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;->maxIntrinsicWidth(Landroidx/compose/ui/unit/LayoutDirection;)I

    move-result p1

    return p1
.end method

.method public measure-3p2s80s(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;
    .locals 4
    .param p1    # Landroidx/compose/ui/layout/MeasureScope;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/ui/layout/Measurable;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->getLayoutCache(Landroidx/compose/ui/unit/Density;)Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p1}, Landroidx/compose/ui/layout/IntrinsicMeasureScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, p3, p4, v1}, Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;->layoutWithConstraints-K40F9xA(JLandroidx/compose/ui/unit/LayoutDirection;)Z

    .line 10
    .line 11
    .line 12
    move-result p3

    .line 13
    invoke-virtual {v0}, Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;->getObserveFontChanges$foundation_release()Lkotlin/r2;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;->getParagraph$foundation_release()Landroidx/compose/ui/text/Paragraph;

    .line 17
    .line 18
    .line 19
    move-result-object p4

    .line 20
    invoke-static {p4}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;->getLayoutSize-YbymL2g$foundation_release()J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    if-eqz p3, :cond_1

    .line 28
    .line 29
    invoke-static {p0}, Landroidx/compose/ui/node/LayoutModifierNodeKt;->invalidateLayer(Landroidx/compose/ui/node/LayoutModifierNode;)V

    .line 30
    .line 31
    .line 32
    iget-object p3, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->baselineCache:Ljava/util/Map;

    .line 33
    .line 34
    if-nez p3, :cond_0

    .line 35
    .line 36
    new-instance p3, Ljava/util/LinkedHashMap;

    .line 37
    .line 38
    const/4 v2, 0x2

    .line 39
    invoke-direct {p3, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 40
    .line 41
    .line 42
    :cond_0
    invoke-static {}, Landroidx/compose/ui/layout/AlignmentLineKt;->getFirstBaseline()Landroidx/compose/ui/layout/HorizontalAlignmentLine;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-interface {p4}, Landroidx/compose/ui/text/Paragraph;->getFirstBaseline()F

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    invoke-static {v3}, Lkotlin/math/b;->L0(F)I

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-interface {p3, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    invoke-static {}, Landroidx/compose/ui/layout/AlignmentLineKt;->getLastBaseline()Landroidx/compose/ui/layout/HorizontalAlignmentLine;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-interface {p4}, Landroidx/compose/ui/text/Paragraph;->getLastBaseline()F

    .line 66
    .line 67
    .line 68
    move-result p4

    .line 69
    invoke-static {p4}, Lkotlin/math/b;->L0(F)I

    .line 70
    .line 71
    .line 72
    move-result p4

    .line 73
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 74
    .line 75
    .line 76
    move-result-object p4

    .line 77
    invoke-interface {p3, v2, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    iput-object p3, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->baselineCache:Ljava/util/Map;

    .line 81
    .line 82
    :cond_1
    sget-object p3, Landroidx/compose/ui/unit/Constraints;->Companion:Landroidx/compose/ui/unit/Constraints$Companion;

    .line 83
    .line 84
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/IntSize;->getWidth-impl(J)I

    .line 85
    .line 86
    .line 87
    move-result p4

    .line 88
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/IntSize;->getHeight-impl(J)I

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    invoke-static {p3, p4, v2}, Landroidx/compose/foundation/text/modifiers/LayoutUtilsKt;->fixedCoerceHeightAndWidthForBits(Landroidx/compose/ui/unit/Constraints$Companion;II)J

    .line 93
    .line 94
    .line 95
    move-result-wide p3

    .line 96
    invoke-interface {p2, p3, p4}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/IntSize;->getWidth-impl(J)I

    .line 101
    .line 102
    .line 103
    move-result p3

    .line 104
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/IntSize;->getHeight-impl(J)I

    .line 105
    .line 106
    .line 107
    move-result p4

    .line 108
    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->baselineCache:Ljava/util/Map;

    .line 109
    .line 110
    invoke-static {v0}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    new-instance v1, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode$measure$1;

    .line 114
    .line 115
    invoke-direct {v1, p2}, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode$measure$1;-><init>(Landroidx/compose/ui/layout/Placeable;)V

    .line 116
    .line 117
    .line 118
    invoke-interface {p1, p3, p4, v0, v1}, Landroidx/compose/ui/layout/MeasureScope;->layout(IILjava/util/Map;Lv3/l;)Landroidx/compose/ui/layout/MeasureResult;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    return-object p1
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
.end method

.method public minIntrinsicHeight(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I
    .locals 0
    .param p1    # Landroidx/compose/ui/layout/IntrinsicMeasureScope;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/ui/layout/IntrinsicMeasurable;
        .annotation build Lp4/l;
        .end annotation
    .end param

    invoke-direct {p0, p1}, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->getLayoutCache(Landroidx/compose/ui/unit/Density;)Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;

    move-result-object p2

    invoke-interface {p1}, Landroidx/compose/ui/layout/IntrinsicMeasureScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    move-result-object p1

    invoke-virtual {p2, p3, p1}, Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;->intrinsicHeight(ILandroidx/compose/ui/unit/LayoutDirection;)I

    move-result p1

    return p1
.end method

.method public minIntrinsicWidth(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I
    .locals 0
    .param p1    # Landroidx/compose/ui/layout/IntrinsicMeasureScope;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/ui/layout/IntrinsicMeasurable;
        .annotation build Lp4/l;
        .end annotation
    .end param

    invoke-direct {p0, p1}, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->getLayoutCache(Landroidx/compose/ui/unit/Density;)Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;

    move-result-object p2

    invoke-interface {p1}, Landroidx/compose/ui/layout/IntrinsicMeasureScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;->minIntrinsicWidth(Landroidx/compose/ui/unit/LayoutDirection;)I

    move-result p1

    return p1
.end method

.method public final updateDraw(Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/ui/text/TextStyle;)Z
    .locals 2
    .param p1    # Landroidx/compose/ui/graphics/ColorProducer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/ui/text/TextStyle;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->overrideColor:Landroidx/compose/ui/graphics/ColorProducer;

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    xor-int/2addr v0, v1

    .line 9
    iput-object p1, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->overrideColor:Landroidx/compose/ui/graphics/ColorProducer;

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    iget-object p1, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->style:Landroidx/compose/ui/text/TextStyle;

    .line 14
    .line 15
    invoke-virtual {p2, p1}, Landroidx/compose/ui/text/TextStyle;->hasSameDrawAffectingAttributes(Landroidx/compose/ui/text/TextStyle;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v1, 0x0

    .line 23
    :cond_1
    :goto_0
    return v1
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
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
.end method

.method public final updateLayoutRelatedArgs-HuAbxIM(Landroidx/compose/ui/text/TextStyle;IIZLandroidx/compose/ui/text/font/FontFamily$Resolver;I)Z
    .locals 2
    .param p1    # Landroidx/compose/ui/text/TextStyle;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p5    # Landroidx/compose/ui/text/font/FontFamily$Resolver;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->style:Landroidx/compose/ui/text/TextStyle;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/compose/ui/text/TextStyle;->hasSameLayoutAffectingAttributes(Landroidx/compose/ui/text/TextStyle;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    xor-int/2addr v0, v1

    .line 9
    iput-object p1, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->style:Landroidx/compose/ui/text/TextStyle;

    .line 10
    .line 11
    iget p1, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->minLines:I

    .line 12
    .line 13
    if-eq p1, p2, :cond_0

    .line 14
    .line 15
    iput p2, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->minLines:I

    .line 16
    .line 17
    move v0, v1

    .line 18
    :cond_0
    iget p1, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->maxLines:I

    .line 19
    .line 20
    if-eq p1, p3, :cond_1

    .line 21
    .line 22
    iput p3, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->maxLines:I

    .line 23
    .line 24
    move v0, v1

    .line 25
    :cond_1
    iget-boolean p1, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->softWrap:Z

    .line 26
    .line 27
    if-eq p1, p4, :cond_2

    .line 28
    .line 29
    iput-boolean p4, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->softWrap:Z

    .line 30
    .line 31
    move v0, v1

    .line 32
    :cond_2
    iget-object p1, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->fontFamilyResolver:Landroidx/compose/ui/text/font/FontFamily$Resolver;

    .line 33
    .line 34
    invoke-static {p1, p5}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-nez p1, :cond_3

    .line 39
    .line 40
    iput-object p5, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->fontFamilyResolver:Landroidx/compose/ui/text/font/FontFamily$Resolver;

    .line 41
    .line 42
    move v0, v1

    .line 43
    :cond_3
    iget p1, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->overflow:I

    .line 44
    .line 45
    invoke-static {p1, p6}, Landroidx/compose/ui/text/style/TextOverflow;->equals-impl0(II)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-nez p1, :cond_4

    .line 50
    .line 51
    iput p6, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->overflow:I

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_4
    move v1, v0

    .line 55
    :goto_0
    return v1
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

.method public final updateText(Ljava/lang/String;)Z
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->text:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :cond_0
    iput-object p1, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->text:Ljava/lang/String;

    .line 12
    .line 13
    invoke-direct {p0}, Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;->clearSubstitution()V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    return p1
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
