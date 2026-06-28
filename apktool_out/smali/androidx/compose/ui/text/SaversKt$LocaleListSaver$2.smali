.class final Landroidx/compose/ui/text/SaversKt$LocaleListSaver$2;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/ui/text/SaversKt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Ljava/lang/Object;",
        "Landroidx/compose/ui/text/intl/LocaleList;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "Landroidx/compose/ui/text/intl/LocaleList;",
        "it",
        "",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$LocaleListSaver$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,454:1\n151#2,3:455\n33#2,4:458\n154#2:462\n155#2:466\n38#2:467\n156#2:468\n60#3,2:463\n1#4:465\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$LocaleListSaver$2\n*L\n443#1:455,3\n443#1:458,4\n443#1:462\n443#1:466\n443#1:467\n443#1:468\n443#1:463,2\n443#1:465\n*E\n"
    }
.end annotation


# static fields
.field public static final INSTANCE:Landroidx/compose/ui/text/SaversKt$LocaleListSaver$2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/ui/text/SaversKt$LocaleListSaver$2;

    invoke-direct {v0}, Landroidx/compose/ui/text/SaversKt$LocaleListSaver$2;-><init>()V

    sput-object v0, Landroidx/compose/ui/text/SaversKt$LocaleListSaver$2;->INSTANCE:Landroidx/compose/ui/text/SaversKt$LocaleListSaver$2;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Landroidx/compose/ui/text/intl/LocaleList;
    .locals 7
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/m;
    .end annotation

    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>"

    .line 2
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->n(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/util/List;

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 4
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    .line 5
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    .line 6
    sget-object v4, Landroidx/compose/ui/text/intl/Locale;->Companion:Landroidx/compose/ui/text/intl/Locale$Companion;

    invoke-static {v4}, Landroidx/compose/ui/text/SaversKt;->getSaver(Landroidx/compose/ui/text/intl/Locale$Companion;)Landroidx/compose/runtime/saveable/Saver;

    move-result-object v4

    .line 7
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v3, v5}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_0

    instance-of v5, v4, Landroidx/compose/ui/text/NonNullValueClassSaver;

    if-nez v5, :cond_0

    goto :goto_1

    :cond_0
    if-eqz v3, :cond_1

    .line 8
    invoke-interface {v4, v3}, Landroidx/compose/runtime/saveable/Saver;->restore(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Landroidx/compose/ui/text/intl/Locale;

    :cond_1
    :goto_1
    invoke-static {v6}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 9
    invoke-interface {v0, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 10
    :cond_2
    new-instance p1, Landroidx/compose/ui/text/intl/LocaleList;

    invoke-direct {p1, v0}, Landroidx/compose/ui/text/intl/LocaleList;-><init>(Ljava/util/List;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/compose/ui/text/SaversKt$LocaleListSaver$2;->invoke(Ljava/lang/Object;)Landroidx/compose/ui/text/intl/LocaleList;

    move-result-object p1

    return-object p1
.end method
