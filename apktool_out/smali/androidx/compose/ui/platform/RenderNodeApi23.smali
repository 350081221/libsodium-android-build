.class public final Landroidx/compose/ui/platform/RenderNodeApi23;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/platform/DeviceRenderNode;


# annotations
.annotation build Landroidx/annotation/RequiresApi;
    value = 0x17
.end annotation

.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/platform/RenderNodeApi23$Companion;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\t\n\u0002\u0008\u0007\n\u0002\u0010\u0007\n\u0002\u00088\u0008\u0001\u0018\u0000 \u008b\u00012\u00020\u0001:\u0002\u008b\u0001B\u0011\u0012\u0006\u0010.\u001a\u00020-\u00a2\u0006\u0006\u0008\u0089\u0001\u0010\u008a\u0001J\u0008\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000f\u0010\n\u001a\u00020\u0007H\u0000\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0000\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0012\u0010\u0011\u001a\u00020\u00022\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J(\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0007H\u0016J\u0010\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0007H\u0016J\u0010\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0007H\u0016J.\u0010!\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00020\u001eH\u0016J\u0010\u0010$\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"H\u0016J\u0010\u0010%\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"H\u0016J\u0010\u0010(\u001a\u00020\u00022\u0006\u0010\'\u001a\u00020&H\u0016J\u0010\u0010)\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\u0008\u0010+\u001a\u00020*H\u0016J\u0008\u0010,\u001a\u00020\u0002H\u0016R\u0017\u0010.\u001a\u00020-8\u0006\u00a2\u0006\u000c\n\u0004\u0008.\u0010/\u001a\u0004\u00080\u00101R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u00102R\u001c\u00104\u001a\u0002038\u0002@\u0002X\u0082\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0006\n\u0004\u00084\u00105R\"\u0010\u0012\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0012\u00105\u001a\u0004\u00086\u0010\t\"\u0004\u00087\u00108R\"\u0010\u0013\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0013\u00105\u001a\u0004\u00089\u0010\t\"\u0004\u0008:\u00108R\"\u0010\u0014\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0014\u00105\u001a\u0004\u0008;\u0010\t\"\u0004\u0008<\u00108R\"\u0010\u0015\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0015\u00105\u001a\u0004\u0008=\u0010\t\"\u0004\u0008>\u00108R$\u0010@\u001a\u0004\u0018\u00010?8\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008@\u0010A\u001a\u0004\u0008B\u0010C\"\u0004\u0008D\u0010ER*\u0010G\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020\u000b8\u0016@VX\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008G\u0010H\u001a\u0004\u0008I\u0010\r\"\u0004\u0008J\u0010KR\u0014\u0010O\u001a\u00020L8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008M\u0010NR\u0014\u0010Q\u001a\u00020\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008P\u0010\tR\u0014\u0010S\u001a\u00020\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008R\u0010\tR$\u0010Y\u001a\u00020T2\u0006\u0010F\u001a\u00020T8V@VX\u0096\u000e\u00a2\u0006\u000c\u001a\u0004\u0008U\u0010V\"\u0004\u0008W\u0010XR$\u0010\\\u001a\u00020T2\u0006\u0010F\u001a\u00020T8V@VX\u0096\u000e\u00a2\u0006\u000c\u001a\u0004\u0008Z\u0010V\"\u0004\u0008[\u0010XR$\u0010_\u001a\u00020T2\u0006\u0010F\u001a\u00020T8V@VX\u0096\u000e\u00a2\u0006\u000c\u001a\u0004\u0008]\u0010V\"\u0004\u0008^\u0010XR$\u0010b\u001a\u00020T2\u0006\u0010F\u001a\u00020T8V@VX\u0096\u000e\u00a2\u0006\u000c\u001a\u0004\u0008`\u0010V\"\u0004\u0008a\u0010XR$\u0010e\u001a\u00020T2\u0006\u0010F\u001a\u00020T8V@VX\u0096\u000e\u00a2\u0006\u000c\u001a\u0004\u0008c\u0010V\"\u0004\u0008d\u0010XR$\u0010h\u001a\u00020\u00072\u0006\u0010F\u001a\u00020\u00078V@VX\u0096\u000e\u00a2\u0006\u000c\u001a\u0004\u0008f\u0010\t\"\u0004\u0008g\u00108R$\u0010k\u001a\u00020\u00072\u0006\u0010F\u001a\u00020\u00078V@VX\u0096\u000e\u00a2\u0006\u000c\u001a\u0004\u0008i\u0010\t\"\u0004\u0008j\u00108R$\u0010n\u001a\u00020T2\u0006\u0010F\u001a\u00020T8V@VX\u0096\u000e\u00a2\u0006\u000c\u001a\u0004\u0008l\u0010V\"\u0004\u0008m\u0010XR$\u0010q\u001a\u00020T2\u0006\u0010F\u001a\u00020T8V@VX\u0096\u000e\u00a2\u0006\u000c\u001a\u0004\u0008o\u0010V\"\u0004\u0008p\u0010XR$\u0010t\u001a\u00020T2\u0006\u0010F\u001a\u00020T8V@VX\u0096\u000e\u00a2\u0006\u000c\u001a\u0004\u0008r\u0010V\"\u0004\u0008s\u0010XR$\u0010w\u001a\u00020T2\u0006\u0010F\u001a\u00020T8V@VX\u0096\u000e\u00a2\u0006\u000c\u001a\u0004\u0008u\u0010V\"\u0004\u0008v\u0010XR$\u0010z\u001a\u00020T2\u0006\u0010F\u001a\u00020T8V@VX\u0096\u000e\u00a2\u0006\u000c\u001a\u0004\u0008x\u0010V\"\u0004\u0008y\u0010XR$\u0010}\u001a\u00020T2\u0006\u0010F\u001a\u00020T8V@VX\u0096\u000e\u00a2\u0006\u000c\u001a\u0004\u0008{\u0010V\"\u0004\u0008|\u0010XR%\u0010\u0080\u0001\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020\u000b8V@VX\u0096\u000e\u00a2\u0006\u000c\u001a\u0004\u0008~\u0010\r\"\u0004\u0008\u007f\u0010KR\'\u0010\u0083\u0001\u001a\u00020T2\u0006\u0010F\u001a\u00020T8V@VX\u0096\u000e\u00a2\u0006\u000e\u001a\u0005\u0008\u0081\u0001\u0010V\"\u0005\u0008\u0082\u0001\u0010XR-\u0010\u0086\u0001\u001a\u0002032\u0006\u0010F\u001a\u0002038V@VX\u0096\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u000e\u001a\u0005\u0008\u0084\u0001\u0010\t\"\u0005\u0008\u0085\u0001\u00108R\u0016\u0010\u0088\u0001\u001a\u00020\u000b8VX\u0096\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u0087\u0001\u0010\r\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006\u008c\u0001"
    }
    d2 = {
        "Landroidx/compose/ui/platform/RenderNodeApi23;",
        "Landroidx/compose/ui/platform/DeviceRenderNode;",
        "Lkotlin/r2;",
        "discardDisplayListInternal",
        "Landroid/view/RenderNode;",
        "renderNode",
        "verifyShadowColorProperties",
        "",
        "getLayerType$ui_release",
        "()I",
        "getLayerType",
        "",
        "hasOverlappingRendering$ui_release",
        "()Z",
        "hasOverlappingRendering",
        "Landroid/graphics/Outline;",
        "outline",
        "setOutline",
        "left",
        "top",
        "right",
        "bottom",
        "setPosition",
        "offset",
        "offsetLeftAndRight",
        "offsetTopAndBottom",
        "Landroidx/compose/ui/graphics/CanvasHolder;",
        "canvasHolder",
        "Landroidx/compose/ui/graphics/Path;",
        "clipPath",
        "Lkotlin/Function1;",
        "Landroidx/compose/ui/graphics/Canvas;",
        "drawBlock",
        "record",
        "Landroid/graphics/Matrix;",
        "matrix",
        "getMatrix",
        "getInverseMatrix",
        "Landroid/graphics/Canvas;",
        "canvas",
        "drawInto",
        "setHasOverlappingRendering",
        "Landroidx/compose/ui/platform/DeviceRenderNodeData;",
        "dumpRenderNodeData",
        "discardDisplayList",
        "Landroidx/compose/ui/platform/AndroidComposeView;",
        "ownerView",
        "Landroidx/compose/ui/platform/AndroidComposeView;",
        "getOwnerView",
        "()Landroidx/compose/ui/platform/AndroidComposeView;",
        "Landroid/view/RenderNode;",
        "Landroidx/compose/ui/graphics/CompositingStrategy;",
        "internalCompositingStrategy",
        "I",
        "getLeft",
        "setLeft",
        "(I)V",
        "getTop",
        "setTop",
        "getRight",
        "setRight",
        "getBottom",
        "setBottom",
        "Landroidx/compose/ui/graphics/RenderEffect;",
        "renderEffect",
        "Landroidx/compose/ui/graphics/RenderEffect;",
        "getRenderEffect",
        "()Landroidx/compose/ui/graphics/RenderEffect;",
        "setRenderEffect",
        "(Landroidx/compose/ui/graphics/RenderEffect;)V",
        "value",
        "clipToBounds",
        "Z",
        "getClipToBounds",
        "setClipToBounds",
        "(Z)V",
        "",
        "getUniqueId",
        "()J",
        "uniqueId",
        "getWidth",
        "width",
        "getHeight",
        "height",
        "",
        "getScaleX",
        "()F",
        "setScaleX",
        "(F)V",
        "scaleX",
        "getScaleY",
        "setScaleY",
        "scaleY",
        "getTranslationX",
        "setTranslationX",
        "translationX",
        "getTranslationY",
        "setTranslationY",
        "translationY",
        "getElevation",
        "setElevation",
        "elevation",
        "getAmbientShadowColor",
        "setAmbientShadowColor",
        "ambientShadowColor",
        "getSpotShadowColor",
        "setSpotShadowColor",
        "spotShadowColor",
        "getRotationZ",
        "setRotationZ",
        "rotationZ",
        "getRotationX",
        "setRotationX",
        "rotationX",
        "getRotationY",
        "setRotationY",
        "rotationY",
        "getCameraDistance",
        "setCameraDistance",
        "cameraDistance",
        "getPivotX",
        "setPivotX",
        "pivotX",
        "getPivotY",
        "setPivotY",
        "pivotY",
        "getClipToOutline",
        "setClipToOutline",
        "clipToOutline",
        "getAlpha",
        "setAlpha",
        "alpha",
        "getCompositingStrategy--NrFUSI",
        "setCompositingStrategy-aDBOjCE",
        "compositingStrategy",
        "getHasDisplayList",
        "hasDisplayList",
        "<init>",
        "(Landroidx/compose/ui/platform/AndroidComposeView;)V",
        "Companion",
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
        "SMAP\nRenderNodeApi23.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderNodeApi23.android.kt\nandroidx/compose/ui/platform/RenderNodeApi23\n+ 2 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n*L\n1#1,417:1\n47#2,5:418\n*S KotlinDebug\n*F\n+ 1 RenderNodeApi23.android.kt\nandroidx/compose/ui/platform/RenderNodeApi23\n*L\n275#1:418,5\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Landroidx/compose/ui/platform/RenderNodeApi23$Companion;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static needToValidateAccess:Z

.field private static testFailCreateRenderNode:Z


# instance fields
.field private bottom:I

.field private clipToBounds:Z

.field private internalCompositingStrategy:I

.field private left:I

.field private final ownerView:Landroidx/compose/ui/platform/AndroidComposeView;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private renderEffect:Landroidx/compose/ui/graphics/RenderEffect;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private final renderNode:Landroid/view/RenderNode;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private right:I

.field private top:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/compose/ui/platform/RenderNodeApi23$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Landroidx/compose/ui/platform/RenderNodeApi23$Companion;-><init>(Lkotlin/jvm/internal/w;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/compose/ui/platform/RenderNodeApi23;->Companion:Landroidx/compose/ui/platform/RenderNodeApi23$Companion;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    sput v0, Landroidx/compose/ui/platform/RenderNodeApi23;->$stable:I

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    sput-boolean v0, Landroidx/compose/ui/platform/RenderNodeApi23;->needToValidateAccess:Z

    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
.end method

.method public constructor <init>(Landroidx/compose/ui/platform/AndroidComposeView;)V
    .locals 2
    .param p1    # Landroidx/compose/ui/platform/AndroidComposeView;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->ownerView:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 5
    .line 6
    const-string v0, "Compose"

    .line 7
    .line 8
    invoke-static {v0, p1}, Landroid/view/RenderNode;->create(Ljava/lang/String;Landroid/view/View;)Landroid/view/RenderNode;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->renderNode:Landroid/view/RenderNode;

    .line 13
    .line 14
    sget-object v0, Landroidx/compose/ui/graphics/CompositingStrategy;->Companion:Landroidx/compose/ui/graphics/CompositingStrategy$Companion;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/CompositingStrategy$Companion;->getAuto--NrFUSI()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iput v0, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->internalCompositingStrategy:I

    .line 21
    .line 22
    sget-boolean v0, Landroidx/compose/ui/platform/RenderNodeApi23;->needToValidateAccess:Z

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/view/RenderNode;->getScaleX()F

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    invoke-virtual {p1, v0}, Landroid/view/RenderNode;->setScaleX(F)Z

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Landroid/view/RenderNode;->getScaleY()F

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-virtual {p1, v0}, Landroid/view/RenderNode;->setScaleY(F)Z

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Landroid/view/RenderNode;->getTranslationX()F

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    invoke-virtual {p1, v0}, Landroid/view/RenderNode;->setTranslationX(F)Z

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Landroid/view/RenderNode;->getTranslationY()F

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    invoke-virtual {p1, v0}, Landroid/view/RenderNode;->setTranslationY(F)Z

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1}, Landroid/view/RenderNode;->getElevation()F

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    invoke-virtual {p1, v0}, Landroid/view/RenderNode;->setElevation(F)Z

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Landroid/view/RenderNode;->getRotation()F

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    invoke-virtual {p1, v0}, Landroid/view/RenderNode;->setRotation(F)Z

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1}, Landroid/view/RenderNode;->getRotationX()F

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    invoke-virtual {p1, v0}, Landroid/view/RenderNode;->setRotationX(F)Z

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1}, Landroid/view/RenderNode;->getRotationY()F

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    invoke-virtual {p1, v0}, Landroid/view/RenderNode;->setRotationY(F)Z

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1}, Landroid/view/RenderNode;->getCameraDistance()F

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    invoke-virtual {p1, v0}, Landroid/view/RenderNode;->setCameraDistance(F)Z

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1}, Landroid/view/RenderNode;->getPivotX()F

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    invoke-virtual {p1, v0}, Landroid/view/RenderNode;->setPivotX(F)Z

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1}, Landroid/view/RenderNode;->getPivotY()F

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    invoke-virtual {p1, v0}, Landroid/view/RenderNode;->setPivotY(F)Z

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1}, Landroid/view/RenderNode;->getClipToOutline()Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    invoke-virtual {p1, v0}, Landroid/view/RenderNode;->setClipToOutline(Z)Z

    .line 108
    .line 109
    .line 110
    const/4 v0, 0x0

    .line 111
    invoke-virtual {p1, v0}, Landroid/view/RenderNode;->setClipToBounds(Z)Z

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1}, Landroid/view/RenderNode;->getAlpha()F

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    invoke-virtual {p1, v1}, Landroid/view/RenderNode;->setAlpha(F)Z

    .line 119
    .line 120
    .line 121
    invoke-virtual {p1}, Landroid/view/RenderNode;->isValid()Z

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1, v0, v0, v0, v0}, Landroid/view/RenderNode;->setLeftTopRightBottom(IIII)Z

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1, v0}, Landroid/view/RenderNode;->offsetLeftAndRight(I)Z

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1, v0}, Landroid/view/RenderNode;->offsetTopAndBottom(I)Z

    .line 131
    .line 132
    .line 133
    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/RenderNodeApi23;->verifyShadowColorProperties(Landroid/view/RenderNode;)V

    .line 134
    .line 135
    .line 136
    invoke-direct {p0}, Landroidx/compose/ui/platform/RenderNodeApi23;->discardDisplayListInternal()V

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1, v0}, Landroid/view/RenderNode;->setLayerType(I)Z

    .line 140
    .line 141
    .line 142
    invoke-virtual {p1}, Landroid/view/RenderNode;->hasOverlappingRendering()Z

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    invoke-virtual {p1, v1}, Landroid/view/RenderNode;->setHasOverlappingRendering(Z)Z

    .line 147
    .line 148
    .line 149
    sput-boolean v0, Landroidx/compose/ui/platform/RenderNodeApi23;->needToValidateAccess:Z

    .line 150
    .line 151
    :cond_0
    sget-boolean p1, Landroidx/compose/ui/platform/RenderNodeApi23;->testFailCreateRenderNode:Z

    .line 152
    .line 153
    if-nez p1, :cond_1

    .line 154
    .line 155
    return-void

    .line 156
    :cond_1
    new-instance p1, Ljava/lang/NoClassDefFoundError;

    .line 157
    .line 158
    invoke-direct {p1}, Ljava/lang/NoClassDefFoundError;-><init>()V

    .line 159
    .line 160
    .line 161
    throw p1
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
.end method

.method public static final synthetic access$getTestFailCreateRenderNode$cp()Z
    .locals 1

    sget-boolean v0, Landroidx/compose/ui/platform/RenderNodeApi23;->testFailCreateRenderNode:Z

    return v0
.end method

.method public static final synthetic access$setTestFailCreateRenderNode$cp(Z)V
    .locals 0

    sput-boolean p0, Landroidx/compose/ui/platform/RenderNodeApi23;->testFailCreateRenderNode:Z

    return-void
.end method

.method private final discardDisplayListInternal()V
    .locals 2

    sget-object v0, Landroidx/compose/ui/platform/RenderNodeVerificationHelper24;->INSTANCE:Landroidx/compose/ui/platform/RenderNodeVerificationHelper24;

    iget-object v1, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->renderNode:Landroid/view/RenderNode;

    invoke-virtual {v0, v1}, Landroidx/compose/ui/platform/RenderNodeVerificationHelper24;->discardDisplayList(Landroid/view/RenderNode;)V

    return-void
.end method

.method private final verifyShadowColorProperties(Landroid/view/RenderNode;)V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    sget-object v0, Landroidx/compose/ui/platform/RenderNodeVerificationHelper28;->INSTANCE:Landroidx/compose/ui/platform/RenderNodeVerificationHelper28;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Landroidx/compose/ui/platform/RenderNodeVerificationHelper28;->getAmbientShadowColor(Landroid/view/RenderNode;)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-virtual {v0, p1, v1}, Landroidx/compose/ui/platform/RenderNodeVerificationHelper28;->setAmbientShadowColor(Landroid/view/RenderNode;I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Landroidx/compose/ui/platform/RenderNodeVerificationHelper28;->getSpotShadowColor(Landroid/view/RenderNode;)I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {v0, p1, v1}, Landroidx/compose/ui/platform/RenderNodeVerificationHelper28;->setSpotShadowColor(Landroid/view/RenderNode;I)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
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
.method public discardDisplayList()V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/platform/RenderNodeApi23;->discardDisplayListInternal()V

    return-void
.end method

.method public drawInto(Landroid/graphics/Canvas;)V
    .locals 1
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "null cannot be cast to non-null type android.view.DisplayListCanvas"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->n(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    check-cast p1, Landroid/view/DisplayListCanvas;

    .line 7
    .line 8
    iget-object v0, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->renderNode:Landroid/view/RenderNode;

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Landroid/view/DisplayListCanvas;->drawRenderNode(Landroid/view/RenderNode;)V

    .line 11
    .line 12
    .line 13
    return-void
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

.method public dumpRenderNodeData()Landroidx/compose/ui/platform/DeviceRenderNodeData;
    .locals 30
    .annotation build Lp4/l;
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v29, Landroidx/compose/ui/platform/DeviceRenderNodeData;

    .line 4
    .line 5
    move-object/from16 v1, v29

    .line 6
    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v6, 0x0

    .line 12
    const/4 v7, 0x0

    .line 13
    const/4 v8, 0x0

    .line 14
    const/4 v9, 0x0

    .line 15
    iget-object v10, v0, Landroidx/compose/ui/platform/RenderNodeApi23;->renderNode:Landroid/view/RenderNode;

    .line 16
    .line 17
    invoke-virtual {v10}, Landroid/view/RenderNode;->getScaleX()F

    .line 18
    .line 19
    .line 20
    move-result v10

    .line 21
    iget-object v11, v0, Landroidx/compose/ui/platform/RenderNodeApi23;->renderNode:Landroid/view/RenderNode;

    .line 22
    .line 23
    invoke-virtual {v11}, Landroid/view/RenderNode;->getScaleY()F

    .line 24
    .line 25
    .line 26
    move-result v11

    .line 27
    iget-object v12, v0, Landroidx/compose/ui/platform/RenderNodeApi23;->renderNode:Landroid/view/RenderNode;

    .line 28
    .line 29
    invoke-virtual {v12}, Landroid/view/RenderNode;->getTranslationX()F

    .line 30
    .line 31
    .line 32
    move-result v12

    .line 33
    iget-object v13, v0, Landroidx/compose/ui/platform/RenderNodeApi23;->renderNode:Landroid/view/RenderNode;

    .line 34
    .line 35
    invoke-virtual {v13}, Landroid/view/RenderNode;->getTranslationY()F

    .line 36
    .line 37
    .line 38
    move-result v13

    .line 39
    iget-object v14, v0, Landroidx/compose/ui/platform/RenderNodeApi23;->renderNode:Landroid/view/RenderNode;

    .line 40
    .line 41
    invoke-virtual {v14}, Landroid/view/RenderNode;->getElevation()F

    .line 42
    .line 43
    .line 44
    move-result v14

    .line 45
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/platform/RenderNodeApi23;->getAmbientShadowColor()I

    .line 46
    .line 47
    .line 48
    move-result v15

    .line 49
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/platform/RenderNodeApi23;->getSpotShadowColor()I

    .line 50
    .line 51
    .line 52
    move-result v16

    .line 53
    iget-object v2, v0, Landroidx/compose/ui/platform/RenderNodeApi23;->renderNode:Landroid/view/RenderNode;

    .line 54
    .line 55
    invoke-virtual {v2}, Landroid/view/RenderNode;->getRotation()F

    .line 56
    .line 57
    .line 58
    move-result v17

    .line 59
    iget-object v2, v0, Landroidx/compose/ui/platform/RenderNodeApi23;->renderNode:Landroid/view/RenderNode;

    .line 60
    .line 61
    invoke-virtual {v2}, Landroid/view/RenderNode;->getRotationX()F

    .line 62
    .line 63
    .line 64
    move-result v18

    .line 65
    iget-object v2, v0, Landroidx/compose/ui/platform/RenderNodeApi23;->renderNode:Landroid/view/RenderNode;

    .line 66
    .line 67
    invoke-virtual {v2}, Landroid/view/RenderNode;->getRotationY()F

    .line 68
    .line 69
    .line 70
    move-result v19

    .line 71
    iget-object v2, v0, Landroidx/compose/ui/platform/RenderNodeApi23;->renderNode:Landroid/view/RenderNode;

    .line 72
    .line 73
    invoke-virtual {v2}, Landroid/view/RenderNode;->getCameraDistance()F

    .line 74
    .line 75
    .line 76
    move-result v20

    .line 77
    iget-object v2, v0, Landroidx/compose/ui/platform/RenderNodeApi23;->renderNode:Landroid/view/RenderNode;

    .line 78
    .line 79
    invoke-virtual {v2}, Landroid/view/RenderNode;->getPivotX()F

    .line 80
    .line 81
    .line 82
    move-result v21

    .line 83
    iget-object v2, v0, Landroidx/compose/ui/platform/RenderNodeApi23;->renderNode:Landroid/view/RenderNode;

    .line 84
    .line 85
    invoke-virtual {v2}, Landroid/view/RenderNode;->getPivotY()F

    .line 86
    .line 87
    .line 88
    move-result v22

    .line 89
    iget-object v2, v0, Landroidx/compose/ui/platform/RenderNodeApi23;->renderNode:Landroid/view/RenderNode;

    .line 90
    .line 91
    invoke-virtual {v2}, Landroid/view/RenderNode;->getClipToOutline()Z

    .line 92
    .line 93
    .line 94
    move-result v23

    .line 95
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/platform/RenderNodeApi23;->getClipToBounds()Z

    .line 96
    .line 97
    .line 98
    move-result v24

    .line 99
    iget-object v2, v0, Landroidx/compose/ui/platform/RenderNodeApi23;->renderNode:Landroid/view/RenderNode;

    .line 100
    .line 101
    invoke-virtual {v2}, Landroid/view/RenderNode;->getAlpha()F

    .line 102
    .line 103
    .line 104
    move-result v25

    .line 105
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/platform/RenderNodeApi23;->getRenderEffect()Landroidx/compose/ui/graphics/RenderEffect;

    .line 106
    .line 107
    .line 108
    move-result-object v26

    .line 109
    iget v2, v0, Landroidx/compose/ui/platform/RenderNodeApi23;->internalCompositingStrategy:I

    .line 110
    .line 111
    move/from16 v27, v2

    .line 112
    .line 113
    const/16 v28, 0x0

    .line 114
    .line 115
    const-wide/16 v2, 0x0

    .line 116
    .line 117
    invoke-direct/range {v1 .. v28}, Landroidx/compose/ui/platform/DeviceRenderNodeData;-><init>(JIIIIIIFFFFFIIFFFFFFZZFLandroidx/compose/ui/graphics/RenderEffect;ILkotlin/jvm/internal/w;)V

    .line 118
    .line 119
    .line 120
    return-object v29
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

.method public getAlpha()F
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->renderNode:Landroid/view/RenderNode;

    invoke-virtual {v0}, Landroid/view/RenderNode;->getAlpha()F

    move-result v0

    return v0
.end method

.method public getAmbientShadowColor()I
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    sget-object v0, Landroidx/compose/ui/platform/RenderNodeVerificationHelper28;->INSTANCE:Landroidx/compose/ui/platform/RenderNodeVerificationHelper28;

    .line 8
    .line 9
    iget-object v1, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->renderNode:Landroid/view/RenderNode;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroidx/compose/ui/platform/RenderNodeVerificationHelper28;->getAmbientShadowColor(Landroid/view/RenderNode;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/high16 v0, -0x1000000

    .line 17
    .line 18
    :goto_0
    return v0
    .line 19
.end method

.method public getBottom()I
    .locals 1

    iget v0, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->bottom:I

    return v0
.end method

.method public getCameraDistance()F
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->renderNode:Landroid/view/RenderNode;

    invoke-virtual {v0}, Landroid/view/RenderNode;->getCameraDistance()F

    move-result v0

    neg-float v0, v0

    return v0
.end method

.method public getClipToBounds()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->clipToBounds:Z

    return v0
.end method

.method public getClipToOutline()Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->renderNode:Landroid/view/RenderNode;

    invoke-virtual {v0}, Landroid/view/RenderNode;->getClipToOutline()Z

    move-result v0

    return v0
.end method

.method public getCompositingStrategy--NrFUSI()I
    .locals 1

    iget v0, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->internalCompositingStrategy:I

    return v0
.end method

.method public getElevation()F
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->renderNode:Landroid/view/RenderNode;

    invoke-virtual {v0}, Landroid/view/RenderNode;->getElevation()F

    move-result v0

    return v0
.end method

.method public getHasDisplayList()Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->renderNode:Landroid/view/RenderNode;

    invoke-virtual {v0}, Landroid/view/RenderNode;->isValid()Z

    move-result v0

    return v0
.end method

.method public getHeight()I
    .locals 2

    invoke-virtual {p0}, Landroidx/compose/ui/platform/RenderNodeApi23;->getBottom()I

    move-result v0

    invoke-virtual {p0}, Landroidx/compose/ui/platform/RenderNodeApi23;->getTop()I

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method

.method public getInverseMatrix(Landroid/graphics/Matrix;)V
    .locals 1
    .param p1    # Landroid/graphics/Matrix;
        .annotation build Lp4/l;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->renderNode:Landroid/view/RenderNode;

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->getInverseMatrix(Landroid/graphics/Matrix;)V

    return-void
.end method

.method public final getLayerType$ui_release()I
    .locals 2

    .line 1
    iget v0, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->internalCompositingStrategy:I

    .line 2
    .line 3
    sget-object v1, Landroidx/compose/ui/graphics/CompositingStrategy;->Companion:Landroidx/compose/ui/graphics/CompositingStrategy$Companion;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/CompositingStrategy$Companion;->getOffscreen--NrFUSI()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/CompositingStrategy;->equals-impl0(II)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x2

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    :goto_0
    return v0
    .line 19
.end method

.method public getLeft()I
    .locals 1

    iget v0, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->left:I

    return v0
.end method

.method public getMatrix(Landroid/graphics/Matrix;)V
    .locals 1
    .param p1    # Landroid/graphics/Matrix;
        .annotation build Lp4/l;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->renderNode:Landroid/view/RenderNode;

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->getMatrix(Landroid/graphics/Matrix;)V

    return-void
.end method

.method public final getOwnerView()Landroidx/compose/ui/platform/AndroidComposeView;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->ownerView:Landroidx/compose/ui/platform/AndroidComposeView;

    return-object v0
.end method

.method public getPivotX()F
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->renderNode:Landroid/view/RenderNode;

    invoke-virtual {v0}, Landroid/view/RenderNode;->getPivotX()F

    move-result v0

    return v0
.end method

.method public getPivotY()F
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->renderNode:Landroid/view/RenderNode;

    invoke-virtual {v0}, Landroid/view/RenderNode;->getPivotY()F

    move-result v0

    return v0
.end method

.method public getRenderEffect()Landroidx/compose/ui/graphics/RenderEffect;
    .locals 1
    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->renderEffect:Landroidx/compose/ui/graphics/RenderEffect;

    return-object v0
.end method

.method public getRight()I
    .locals 1

    iget v0, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->right:I

    return v0
.end method

.method public getRotationX()F
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->renderNode:Landroid/view/RenderNode;

    invoke-virtual {v0}, Landroid/view/RenderNode;->getRotationX()F

    move-result v0

    return v0
.end method

.method public getRotationY()F
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->renderNode:Landroid/view/RenderNode;

    invoke-virtual {v0}, Landroid/view/RenderNode;->getRotationY()F

    move-result v0

    return v0
.end method

.method public getRotationZ()F
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->renderNode:Landroid/view/RenderNode;

    invoke-virtual {v0}, Landroid/view/RenderNode;->getRotation()F

    move-result v0

    return v0
.end method

.method public getScaleX()F
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->renderNode:Landroid/view/RenderNode;

    invoke-virtual {v0}, Landroid/view/RenderNode;->getScaleX()F

    move-result v0

    return v0
.end method

.method public getScaleY()F
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->renderNode:Landroid/view/RenderNode;

    invoke-virtual {v0}, Landroid/view/RenderNode;->getScaleY()F

    move-result v0

    return v0
.end method

.method public getSpotShadowColor()I
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    sget-object v0, Landroidx/compose/ui/platform/RenderNodeVerificationHelper28;->INSTANCE:Landroidx/compose/ui/platform/RenderNodeVerificationHelper28;

    .line 8
    .line 9
    iget-object v1, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->renderNode:Landroid/view/RenderNode;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroidx/compose/ui/platform/RenderNodeVerificationHelper28;->getSpotShadowColor(Landroid/view/RenderNode;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/high16 v0, -0x1000000

    .line 17
    .line 18
    :goto_0
    return v0
    .line 19
.end method

.method public getTop()I
    .locals 1

    iget v0, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->top:I

    return v0
.end method

.method public getTranslationX()F
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->renderNode:Landroid/view/RenderNode;

    invoke-virtual {v0}, Landroid/view/RenderNode;->getTranslationX()F

    move-result v0

    return v0
.end method

.method public getTranslationY()F
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->renderNode:Landroid/view/RenderNode;

    invoke-virtual {v0}, Landroid/view/RenderNode;->getTranslationY()F

    move-result v0

    return v0
.end method

.method public getUniqueId()J
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public getWidth()I
    .locals 2

    invoke-virtual {p0}, Landroidx/compose/ui/platform/RenderNodeApi23;->getRight()I

    move-result v0

    invoke-virtual {p0}, Landroidx/compose/ui/platform/RenderNodeApi23;->getLeft()I

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method

.method public final hasOverlappingRendering$ui_release()Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->renderNode:Landroid/view/RenderNode;

    invoke-virtual {v0}, Landroid/view/RenderNode;->hasOverlappingRendering()Z

    move-result v0

    return v0
.end method

.method public offsetLeftAndRight(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/platform/RenderNodeApi23;->getLeft()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/2addr v0, p1

    .line 6
    invoke-virtual {p0, v0}, Landroidx/compose/ui/platform/RenderNodeApi23;->setLeft(I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/compose/ui/platform/RenderNodeApi23;->getRight()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    add-int/2addr v0, p1

    .line 14
    invoke-virtual {p0, v0}, Landroidx/compose/ui/platform/RenderNodeApi23;->setRight(I)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->renderNode:Landroid/view/RenderNode;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->offsetLeftAndRight(I)Z

    .line 20
    .line 21
    .line 22
    return-void
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

.method public offsetTopAndBottom(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/platform/RenderNodeApi23;->getTop()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/2addr v0, p1

    .line 6
    invoke-virtual {p0, v0}, Landroidx/compose/ui/platform/RenderNodeApi23;->setTop(I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/compose/ui/platform/RenderNodeApi23;->getBottom()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    add-int/2addr v0, p1

    .line 14
    invoke-virtual {p0, v0}, Landroidx/compose/ui/platform/RenderNodeApi23;->setBottom(I)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->renderNode:Landroid/view/RenderNode;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->offsetTopAndBottom(I)Z

    .line 20
    .line 21
    .line 22
    return-void
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

.method public record(Landroidx/compose/ui/graphics/CanvasHolder;Landroidx/compose/ui/graphics/Path;Lv3/l;)V
    .locals 6
    .param p1    # Landroidx/compose/ui/graphics/CanvasHolder;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/ui/graphics/Path;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p3    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/graphics/CanvasHolder;",
            "Landroidx/compose/ui/graphics/Path;",
            "Lv3/l<",
            "-",
            "Landroidx/compose/ui/graphics/Canvas;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->renderNode:Landroid/view/RenderNode;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/compose/ui/platform/RenderNodeApi23;->getWidth()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {p0}, Landroidx/compose/ui/platform/RenderNodeApi23;->getHeight()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-virtual {v0, v1, v2}, Landroid/view/RenderNode;->start(II)Landroid/view/DisplayListCanvas;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p1}, Landroidx/compose/ui/graphics/CanvasHolder;->getAndroidCanvas()Landroidx/compose/ui/graphics/AndroidCanvas;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/AndroidCanvas;->getInternalCanvas()Landroid/graphics/Canvas;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {p1}, Landroidx/compose/ui/graphics/CanvasHolder;->getAndroidCanvas()Landroidx/compose/ui/graphics/AndroidCanvas;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    move-object v3, v0

    .line 28
    check-cast v3, Landroid/graphics/Canvas;

    .line 29
    .line 30
    invoke-virtual {v2, v3}, Landroidx/compose/ui/graphics/AndroidCanvas;->setInternalCanvas(Landroid/graphics/Canvas;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Landroidx/compose/ui/graphics/CanvasHolder;->getAndroidCanvas()Landroidx/compose/ui/graphics/AndroidCanvas;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    if-eqz p2, :cond_0

    .line 38
    .line 39
    invoke-interface {v2}, Landroidx/compose/ui/graphics/Canvas;->save()V

    .line 40
    .line 41
    .line 42
    const/4 v3, 0x2

    .line 43
    const/4 v4, 0x0

    .line 44
    const/4 v5, 0x0

    .line 45
    invoke-static {v2, p2, v5, v3, v4}, Landroidx/compose/ui/graphics/Canvas;->clipPath-mtrdD-E$default(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/Path;IILjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    :cond_0
    invoke-interface {p3, v2}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    if-eqz p2, :cond_1

    .line 52
    .line 53
    invoke-interface {v2}, Landroidx/compose/ui/graphics/Canvas;->restore()V

    .line 54
    .line 55
    .line 56
    :cond_1
    invoke-virtual {p1}, Landroidx/compose/ui/graphics/CanvasHolder;->getAndroidCanvas()Landroidx/compose/ui/graphics/AndroidCanvas;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {p1, v1}, Landroidx/compose/ui/graphics/AndroidCanvas;->setInternalCanvas(Landroid/graphics/Canvas;)V

    .line 61
    .line 62
    .line 63
    iget-object p1, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->renderNode:Landroid/view/RenderNode;

    .line 64
    .line 65
    invoke-virtual {p1, v0}, Landroid/view/RenderNode;->end(Landroid/view/DisplayListCanvas;)V

    .line 66
    .line 67
    .line 68
    return-void
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

.method public setAlpha(F)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->renderNode:Landroid/view/RenderNode;

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setAlpha(F)Z

    return-void
.end method

.method public setAmbientShadowColor(I)V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    sget-object v0, Landroidx/compose/ui/platform/RenderNodeVerificationHelper28;->INSTANCE:Landroidx/compose/ui/platform/RenderNodeVerificationHelper28;

    .line 8
    .line 9
    iget-object v1, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->renderNode:Landroid/view/RenderNode;

    .line 10
    .line 11
    invoke-virtual {v0, v1, p1}, Landroidx/compose/ui/platform/RenderNodeVerificationHelper28;->setAmbientShadowColor(Landroid/view/RenderNode;I)V

    .line 12
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

.method public setBottom(I)V
    .locals 0

    iput p1, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->bottom:I

    return-void
.end method

.method public setCameraDistance(F)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->renderNode:Landroid/view/RenderNode;

    neg-float p1, p1

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setCameraDistance(F)Z

    return-void
.end method

.method public setClipToBounds(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->clipToBounds:Z

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->renderNode:Landroid/view/RenderNode;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setClipToBounds(Z)Z

    .line 6
    .line 7
    .line 8
    return-void
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

.method public setClipToOutline(Z)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->renderNode:Landroid/view/RenderNode;

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setClipToOutline(Z)Z

    return-void
.end method

.method public setCompositingStrategy-aDBOjCE(I)V
    .locals 3

    .line 1
    sget-object v0, Landroidx/compose/ui/graphics/CompositingStrategy;->Companion:Landroidx/compose/ui/graphics/CompositingStrategy$Companion;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/CompositingStrategy$Companion;->getOffscreen--NrFUSI()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {p1, v1}, Landroidx/compose/ui/graphics/CompositingStrategy;->equals-impl0(II)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->renderNode:Landroid/view/RenderNode;

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    invoke-virtual {v0, v1}, Landroid/view/RenderNode;->setLayerType(I)Z

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->renderNode:Landroid/view/RenderNode;

    .line 21
    .line 22
    invoke-virtual {v0, v2}, Landroid/view/RenderNode;->setHasOverlappingRendering(Z)Z

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/CompositingStrategy$Companion;->getModulateAlpha--NrFUSI()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    invoke-static {p1, v0}, Landroidx/compose/ui/graphics/CompositingStrategy;->equals-impl0(II)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    const/4 v1, 0x0

    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    iget-object v0, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->renderNode:Landroid/view/RenderNode;

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Landroid/view/RenderNode;->setLayerType(I)Z

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->renderNode:Landroid/view/RenderNode;

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Landroid/view/RenderNode;->setHasOverlappingRendering(Z)Z

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    iget-object v0, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->renderNode:Landroid/view/RenderNode;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Landroid/view/RenderNode;->setLayerType(I)Z

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->renderNode:Landroid/view/RenderNode;

    .line 54
    .line 55
    invoke-virtual {v0, v2}, Landroid/view/RenderNode;->setHasOverlappingRendering(Z)Z

    .line 56
    .line 57
    .line 58
    :goto_0
    iput p1, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->internalCompositingStrategy:I

    .line 59
    .line 60
    return-void
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

.method public setElevation(F)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->renderNode:Landroid/view/RenderNode;

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setElevation(F)Z

    return-void
.end method

.method public setHasOverlappingRendering(Z)Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->renderNode:Landroid/view/RenderNode;

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setHasOverlappingRendering(Z)Z

    move-result p1

    return p1
.end method

.method public setLeft(I)V
    .locals 0

    iput p1, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->left:I

    return-void
.end method

.method public setOutline(Landroid/graphics/Outline;)V
    .locals 1
    .param p1    # Landroid/graphics/Outline;
        .annotation build Lp4/m;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->renderNode:Landroid/view/RenderNode;

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setOutline(Landroid/graphics/Outline;)Z

    return-void
.end method

.method public setPivotX(F)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->renderNode:Landroid/view/RenderNode;

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setPivotX(F)Z

    return-void
.end method

.method public setPivotY(F)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->renderNode:Landroid/view/RenderNode;

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setPivotY(F)Z

    return-void
.end method

.method public setPosition(IIII)Z
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/RenderNodeApi23;->setLeft(I)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p2}, Landroidx/compose/ui/platform/RenderNodeApi23;->setTop(I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p3}, Landroidx/compose/ui/platform/RenderNodeApi23;->setRight(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p4}, Landroidx/compose/ui/platform/RenderNodeApi23;->setBottom(I)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->renderNode:Landroid/view/RenderNode;

    .line 14
    .line 15
    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/view/RenderNode;->setLeftTopRightBottom(IIII)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    return p1
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

.method public setRenderEffect(Landroidx/compose/ui/graphics/RenderEffect;)V
    .locals 0
    .param p1    # Landroidx/compose/ui/graphics/RenderEffect;
        .annotation build Lp4/m;
        .end annotation
    .end param

    iput-object p1, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->renderEffect:Landroidx/compose/ui/graphics/RenderEffect;

    return-void
.end method

.method public setRight(I)V
    .locals 0

    iput p1, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->right:I

    return-void
.end method

.method public setRotationX(F)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->renderNode:Landroid/view/RenderNode;

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setRotationX(F)Z

    return-void
.end method

.method public setRotationY(F)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->renderNode:Landroid/view/RenderNode;

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setRotationY(F)Z

    return-void
.end method

.method public setRotationZ(F)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->renderNode:Landroid/view/RenderNode;

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setRotation(F)Z

    return-void
.end method

.method public setScaleX(F)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->renderNode:Landroid/view/RenderNode;

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setScaleX(F)Z

    return-void
.end method

.method public setScaleY(F)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->renderNode:Landroid/view/RenderNode;

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setScaleY(F)Z

    return-void
.end method

.method public setSpotShadowColor(I)V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    sget-object v0, Landroidx/compose/ui/platform/RenderNodeVerificationHelper28;->INSTANCE:Landroidx/compose/ui/platform/RenderNodeVerificationHelper28;

    .line 8
    .line 9
    iget-object v1, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->renderNode:Landroid/view/RenderNode;

    .line 10
    .line 11
    invoke-virtual {v0, v1, p1}, Landroidx/compose/ui/platform/RenderNodeVerificationHelper28;->setSpotShadowColor(Landroid/view/RenderNode;I)V

    .line 12
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

.method public setTop(I)V
    .locals 0

    iput p1, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->top:I

    return-void
.end method

.method public setTranslationX(F)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->renderNode:Landroid/view/RenderNode;

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setTranslationX(F)Z

    return-void
.end method

.method public setTranslationY(F)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/RenderNodeApi23;->renderNode:Landroid/view/RenderNode;

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setTranslationY(F)Z

    return-void
.end method
