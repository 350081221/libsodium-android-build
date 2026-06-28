.class final Landroidx/compose/ui/text/font/NamedFontLoader;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/text/font/AndroidFont$TypefaceLoader;


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u00c2\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\"\u0010\u0008\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000c"
    }
    d2 = {
        "Landroidx/compose/ui/text/font/NamedFontLoader;",
        "Landroidx/compose/ui/text/font/AndroidFont$TypefaceLoader;",
        "Landroid/content/Context;",
        "context",
        "Landroidx/compose/ui/text/font/AndroidFont;",
        "font",
        "Landroid/graphics/Typeface;",
        "loadBlocking",
        "awaitLoad",
        "(Landroid/content/Context;Landroidx/compose/ui/text/font/AndroidFont;Lkotlin/coroutines/d;)Ljava/lang/Object;",
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


# static fields
.field public static final INSTANCE:Landroidx/compose/ui/text/font/NamedFontLoader;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/ui/text/font/NamedFontLoader;

    invoke-direct {v0}, Landroidx/compose/ui/text/font/NamedFontLoader;-><init>()V

    sput-object v0, Landroidx/compose/ui/text/font/NamedFontLoader;->INSTANCE:Landroidx/compose/ui/text/font/NamedFontLoader;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public awaitLoad(Landroid/content/Context;Landroidx/compose/ui/text/font/AndroidFont;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/ui/text/font/AndroidFont;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroidx/compose/ui/text/font/AndroidFont;",
            "Lkotlin/coroutines/d<",
            "-",
            "Landroid/graphics/Typeface;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "All preloaded fonts are optional local."

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public loadBlocking(Landroid/content/Context;Landroidx/compose/ui/text/font/AndroidFont;)Landroid/graphics/Typeface;
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/ui/text/font/AndroidFont;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/m;
    .end annotation

    instance-of v0, p2, Landroidx/compose/ui/text/font/DeviceFontFamilyNameFont;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p2, Landroidx/compose/ui/text/font/DeviceFontFamilyNameFont;

    goto :goto_0

    :cond_0
    move-object p2, v1

    :goto_0
    if-eqz p2, :cond_1

    invoke-virtual {p2, p1}, Landroidx/compose/ui/text/font/DeviceFontFamilyNameFont;->loadCached(Landroid/content/Context;)Landroid/graphics/Typeface;

    move-result-object v1

    :cond_1
    return-object v1
.end method
