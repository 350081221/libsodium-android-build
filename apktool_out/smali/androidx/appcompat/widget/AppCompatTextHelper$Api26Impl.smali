.class Landroidx/appcompat/widget/AppCompatTextHelper$Api26Impl;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/RequiresApi;
    value = 0x1a
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/AppCompatTextHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "Api26Impl"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static getAutoSizeStepGranularity(Landroid/widget/TextView;)I
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    invoke-static {p0}, Landroidx/appcompat/widget/e;->a(Landroid/widget/TextView;)I

    move-result p0

    return p0
.end method

.method static setAutoSizeTextTypeUniformWithConfiguration(Landroid/widget/TextView;IIII)V
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    invoke-static {p0, p1, p2, p3, p4}, Landroidx/appcompat/widget/d;->a(Landroid/widget/TextView;IIII)V

    return-void
.end method

.method static setAutoSizeTextTypeUniformWithPresetSizes(Landroid/widget/TextView;[II)V
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    invoke-static {p0, p1, p2}, Landroidx/appcompat/widget/f;->a(Landroid/widget/TextView;[II)V

    return-void
.end method

.method static setFontVariationSettings(Landroid/widget/TextView;Ljava/lang/String;)Z
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    invoke-static {p0, p1}, Landroidx/appcompat/widget/c;->a(Landroid/widget/TextView;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method
