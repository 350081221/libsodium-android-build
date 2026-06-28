.class public final Landroidx/activity/SystemBarStyle;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/activity/SystemBarStyle$Companion;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B5\u0008\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000c\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00020\u0011\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008\u0008\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000bR\u001a\u0010\u000c\u001a\u00020\u00048\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\u000b\u001a\u0004\u0008\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u00048\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u000b\u001a\u0004\u0008\u0010\u0010\u000eR&\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00020\u00118\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u001a"
    }
    d2 = {
        "Landroidx/activity/SystemBarStyle;",
        "",
        "",
        "isDark",
        "",
        "getScrim$activity_release",
        "(Z)I",
        "getScrim",
        "getScrimWithEnforcedContrast$activity_release",
        "getScrimWithEnforcedContrast",
        "lightScrim",
        "I",
        "darkScrim",
        "getDarkScrim$activity_release",
        "()I",
        "nightMode",
        "getNightMode$activity_release",
        "Lkotlin/Function1;",
        "Landroid/content/res/Resources;",
        "detectDarkMode",
        "Lv3/l;",
        "getDetectDarkMode$activity_release",
        "()Lv3/l;",
        "<init>",
        "(IIILv3/l;)V",
        "Companion",
        "activity_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final Companion:Landroidx/activity/SystemBarStyle$Companion;
    .annotation build Lp4/l;
    .end annotation
.end field


# instance fields
.field private final darkScrim:I

.field private final detectDarkMode:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "Landroid/content/res/Resources;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private final lightScrim:I

.field private final nightMode:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/activity/SystemBarStyle$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/activity/SystemBarStyle$Companion;-><init>(Lkotlin/jvm/internal/w;)V

    sput-object v0, Landroidx/activity/SystemBarStyle;->Companion:Landroidx/activity/SystemBarStyle$Companion;

    return-void
.end method

.method private constructor <init>(IIILv3/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(III",
            "Lv3/l<",
            "-",
            "Landroid/content/res/Resources;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Landroidx/activity/SystemBarStyle;->lightScrim:I

    .line 3
    iput p2, p0, Landroidx/activity/SystemBarStyle;->darkScrim:I

    .line 4
    iput p3, p0, Landroidx/activity/SystemBarStyle;->nightMode:I

    .line 5
    iput-object p4, p0, Landroidx/activity/SystemBarStyle;->detectDarkMode:Lv3/l;

    return-void
.end method

.method public synthetic constructor <init>(IIILv3/l;Lkotlin/jvm/internal/w;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/activity/SystemBarStyle;-><init>(IIILv3/l;)V

    return-void
.end method

.method public static final auto(II)Landroidx/activity/SystemBarStyle;
    .locals 1
    .param p0    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .annotation build Lu3/i;
    .end annotation

    .annotation runtime Lu3/m;
    .end annotation

    sget-object v0, Landroidx/activity/SystemBarStyle;->Companion:Landroidx/activity/SystemBarStyle$Companion;

    invoke-virtual {v0, p0, p1}, Landroidx/activity/SystemBarStyle$Companion;->auto(II)Landroidx/activity/SystemBarStyle;

    move-result-object p0

    return-object p0
.end method

.method public static final auto(IILv3/l;)Landroidx/activity/SystemBarStyle;
    .locals 1
    .param p0    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param
    .param p2    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Lv3/l<",
            "-",
            "Landroid/content/res/Resources;",
            "Ljava/lang/Boolean;",
            ">;)",
            "Landroidx/activity/SystemBarStyle;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .annotation build Lu3/i;
    .end annotation

    .annotation runtime Lu3/m;
    .end annotation

    sget-object v0, Landroidx/activity/SystemBarStyle;->Companion:Landroidx/activity/SystemBarStyle$Companion;

    invoke-virtual {v0, p0, p1, p2}, Landroidx/activity/SystemBarStyle$Companion;->auto(IILv3/l;)Landroidx/activity/SystemBarStyle;

    move-result-object p0

    return-object p0
.end method

.method public static final dark(I)Landroidx/activity/SystemBarStyle;
    .locals 1
    .param p0    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .annotation runtime Lu3/m;
    .end annotation

    sget-object v0, Landroidx/activity/SystemBarStyle;->Companion:Landroidx/activity/SystemBarStyle$Companion;

    invoke-virtual {v0, p0}, Landroidx/activity/SystemBarStyle$Companion;->dark(I)Landroidx/activity/SystemBarStyle;

    move-result-object p0

    return-object p0
.end method

.method public static final light(II)Landroidx/activity/SystemBarStyle;
    .locals 1
    .param p0    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .annotation runtime Lu3/m;
    .end annotation

    sget-object v0, Landroidx/activity/SystemBarStyle;->Companion:Landroidx/activity/SystemBarStyle$Companion;

    invoke-virtual {v0, p0, p1}, Landroidx/activity/SystemBarStyle$Companion;->light(II)Landroidx/activity/SystemBarStyle;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final getDarkScrim$activity_release()I
    .locals 1

    iget v0, p0, Landroidx/activity/SystemBarStyle;->darkScrim:I

    return v0
.end method

.method public final getDetectDarkMode$activity_release()Lv3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lv3/l<",
            "Landroid/content/res/Resources;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/activity/SystemBarStyle;->detectDarkMode:Lv3/l;

    return-object v0
.end method

.method public final getNightMode$activity_release()I
    .locals 1

    iget v0, p0, Landroidx/activity/SystemBarStyle;->nightMode:I

    return v0
.end method

.method public final getScrim$activity_release(Z)I
    .locals 0

    if-eqz p1, :cond_0

    iget p1, p0, Landroidx/activity/SystemBarStyle;->darkScrim:I

    goto :goto_0

    :cond_0
    iget p1, p0, Landroidx/activity/SystemBarStyle;->lightScrim:I

    :goto_0
    return p1
.end method

.method public final getScrimWithEnforcedContrast$activity_release(Z)I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/activity/SystemBarStyle;->nightMode:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    if-eqz p1, :cond_1

    .line 8
    .line 9
    iget p1, p0, Landroidx/activity/SystemBarStyle;->darkScrim:I

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_1
    iget p1, p0, Landroidx/activity/SystemBarStyle;->lightScrim:I

    .line 13
    .line 14
    :goto_0
    return p1
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
