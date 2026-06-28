.class public final Landroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006R\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000e"
    }
    d2 = {
        "Landroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter$Companion;",
        "",
        "Landroidx/compose/ui/text/font/FontMatcher;",
        "fontMatcher",
        "Landroidx/compose/ui/text/font/FontMatcher;",
        "getFontMatcher",
        "()Landroidx/compose/ui/text/font/FontMatcher;",
        "Lkotlinx/coroutines/o0;",
        "DropExceptionHandler",
        "Lkotlinx/coroutines/o0;",
        "getDropExceptionHandler",
        "()Lkotlinx/coroutines/o0;",
        "<init>",
        "()V",
        "ui-text_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/w;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final getDropExceptionHandler()Lkotlinx/coroutines/o0;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    invoke-static {}, Landroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter;->access$getDropExceptionHandler$cp()Lkotlinx/coroutines/o0;

    move-result-object v0

    return-object v0
.end method

.method public final getFontMatcher()Landroidx/compose/ui/text/font/FontMatcher;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    invoke-static {}, Landroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter;->access$getFontMatcher$cp()Landroidx/compose/ui/text/font/FontMatcher;

    move-result-object v0

    return-object v0
.end method
