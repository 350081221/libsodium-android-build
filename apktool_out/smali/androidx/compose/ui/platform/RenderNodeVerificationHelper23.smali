.class final Landroidx/compose/ui/platform/RenderNodeVerificationHelper23;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/RequiresApi;
    value = 0x17
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c3\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Landroidx/compose/ui/platform/RenderNodeVerificationHelper23;",
        "",
        "Landroid/view/RenderNode;",
        "renderNode",
        "Lkotlin/r2;",
        "destroyDisplayListData",
        "<init>",
        "()V",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final INSTANCE:Landroidx/compose/ui/platform/RenderNodeVerificationHelper23;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/ui/platform/RenderNodeVerificationHelper23;

    invoke-direct {v0}, Landroidx/compose/ui/platform/RenderNodeVerificationHelper23;-><init>()V

    sput-object v0, Landroidx/compose/ui/platform/RenderNodeVerificationHelper23;->INSTANCE:Landroidx/compose/ui/platform/RenderNodeVerificationHelper23;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final destroyDisplayListData(Landroid/view/RenderNode;)V
    .locals 0
    .param p1    # Landroid/view/RenderNode;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    invoke-virtual {p1}, Landroid/view/RenderNode;->destroyDisplayListData()V

    return-void
.end method
