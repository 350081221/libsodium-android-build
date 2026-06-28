.class public final Landroidx/compose/ui/text/font/AndroidTypeface_androidKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a6\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u001c\u0008\u0002\u0010\u0008\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0018\u00010\u0004H\u0007\u001a\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\u000b\u001a\u000e\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a8\u0006\u000e"
    }
    d2 = {
        "Landroid/content/Context;",
        "context",
        "Landroidx/compose/ui/text/font/FontFamily;",
        "fontFamily",
        "",
        "Lkotlin/u0;",
        "Landroidx/compose/ui/text/font/FontWeight;",
        "Landroidx/compose/ui/text/font/FontStyle;",
        "styles",
        "Landroidx/compose/ui/text/font/Typeface;",
        "Typeface",
        "Landroid/graphics/Typeface;",
        "typeface",
        "FontFamily",
        "ui-text_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final FontFamily(Landroid/graphics/Typeface;)Landroidx/compose/ui/text/font/FontFamily;
    .locals 0
    .param p0    # Landroid/graphics/Typeface;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0}, Landroidx/compose/ui/text/font/AndroidTypeface_androidKt;->Typeface(Landroid/graphics/Typeface;)Landroidx/compose/ui/text/font/Typeface;

    move-result-object p0

    invoke-static {p0}, Landroidx/compose/ui/text/font/FontFamilyKt;->FontFamily(Landroidx/compose/ui/text/font/Typeface;)Landroidx/compose/ui/text/font/FontFamily;

    move-result-object p0

    return-object p0
.end method

.method public static final Typeface(Landroid/content/Context;Landroidx/compose/ui/text/font/FontFamily;Ljava/util/List;)Landroidx/compose/ui/text/font/Typeface;
    .locals 8
    .param p0    # Landroid/content/Context;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/ui/text/font/FontFamily;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroidx/compose/ui/text/font/FontFamily;",
            "Ljava/util/List<",
            "Lkotlin/u0<",
            "Landroidx/compose/ui/text/font/FontWeight;",
            "Landroidx/compose/ui/text/font/FontStyle;",
            ">;>;)",
            "Landroidx/compose/ui/text/font/Typeface;"
        }
    .end annotation

    .annotation runtime Lkotlin/k;
        level = .enum Lkotlin/m;->WARNING:Lkotlin/m;
        message = "This API is deprecated with the introduction of async fonts which cannot resolve in this context. To preload fonts, use FontFamily.Resolver."
        replaceWith = .subannotation Lkotlin/b1;
            expression = "FontFamily.Resolver.preload(fontFamily, Font.AndroidResourceLoader(context))"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    instance-of v0, p1, Landroidx/compose/ui/text/font/FontListFontFamily;

    if-eqz v0, :cond_0

    new-instance v0, Landroidx/compose/ui/text/platform/AndroidFontListTypeface;

    move-object v2, p1

    check-cast v2, Landroidx/compose/ui/text/font/FontListFontFamily;

    const/4 v5, 0x0

    const/16 v6, 0x8

    const/4 v7, 0x0

    move-object v1, v0

    move-object v3, p0

    move-object v4, p2

    invoke-direct/range {v1 .. v7}, Landroidx/compose/ui/text/platform/AndroidFontListTypeface;-><init>(Landroidx/compose/ui/text/font/FontListFontFamily;Landroid/content/Context;Ljava/util/List;Landroidx/compose/ui/text/font/FontMatcher;ILkotlin/jvm/internal/w;)V

    goto :goto_0

    .line 2
    :cond_0
    instance-of p0, p1, Landroidx/compose/ui/text/font/GenericFontFamily;

    if-eqz p0, :cond_1

    new-instance v0, Landroidx/compose/ui/text/platform/AndroidGenericFontFamilyTypeface;

    check-cast p1, Landroidx/compose/ui/text/font/GenericFontFamily;

    invoke-direct {v0, p1}, Landroidx/compose/ui/text/platform/AndroidGenericFontFamilyTypeface;-><init>(Landroidx/compose/ui/text/font/GenericFontFamily;)V

    goto :goto_0

    .line 3
    :cond_1
    instance-of p0, p1, Landroidx/compose/ui/text/font/DefaultFontFamily;

    if-eqz p0, :cond_2

    new-instance v0, Landroidx/compose/ui/text/platform/AndroidDefaultTypeface;

    invoke-direct {v0}, Landroidx/compose/ui/text/platform/AndroidDefaultTypeface;-><init>()V

    goto :goto_0

    .line 4
    :cond_2
    instance-of p0, p1, Landroidx/compose/ui/text/font/LoadedFontFamily;

    if-eqz p0, :cond_3

    check-cast p1, Landroidx/compose/ui/text/font/LoadedFontFamily;

    invoke-virtual {p1}, Landroidx/compose/ui/text/font/LoadedFontFamily;->getTypeface()Landroidx/compose/ui/text/font/Typeface;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_3
    new-instance p0, Lkotlin/j0;

    invoke-direct {p0}, Lkotlin/j0;-><init>()V

    throw p0
.end method

.method public static final Typeface(Landroid/graphics/Typeface;)Landroidx/compose/ui/text/font/Typeface;
    .locals 1
    .param p0    # Landroid/graphics/Typeface;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 5
    new-instance v0, Landroidx/compose/ui/text/platform/AndroidTypefaceWrapper;

    invoke-direct {v0, p0}, Landroidx/compose/ui/text/platform/AndroidTypefaceWrapper;-><init>(Landroid/graphics/Typeface;)V

    return-object v0
.end method

.method public static synthetic Typeface$default(Landroid/content/Context;Landroidx/compose/ui/text/font/FontFamily;Ljava/util/List;ILjava/lang/Object;)Landroidx/compose/ui/text/font/Typeface;
    .locals 0

    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-static {p0, p1, p2}, Landroidx/compose/ui/text/font/AndroidTypeface_androidKt;->Typeface(Landroid/content/Context;Landroidx/compose/ui/text/font/FontFamily;Ljava/util/List;)Landroidx/compose/ui/text/font/Typeface;

    move-result-object p0

    return-object p0
.end method
