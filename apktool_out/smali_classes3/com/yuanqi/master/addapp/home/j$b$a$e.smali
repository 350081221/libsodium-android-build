.class public final Lcom/yuanqi/master/addapp/home/j$b$a$e;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/addapp/home/j$b$a;->invoke(Landroidx/compose/foundation/lazy/LazyListScope;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/r<",
        "Landroidx/compose/foundation/lazy/LazyItemScope;",
        "Ljava/lang/Integer;",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\u0008\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "<anonymous>",
        "",
        "T",
        "Landroidx/compose/foundation/lazy/LazyItemScope;",
        "it",
        "",
        "invoke",
        "(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V",
        "androidx/compose/foundation/lazy/LazyDslKt$items$4"
    }
    k = 0x3
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$4\n+ 2 LanguageSwitchScreen.kt\ncom/yuanqi/master/addapp/home/LanguageSwitchScreenKt$LanguageSwitchScreen$2$1\n*L\n1#1,426:1\n120#2,14:427\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $context$inlined:Landroid/content/Context;

.field final synthetic $items:Ljava/util/List;

.field final synthetic $languageMap$inlined:Ljava/util/Map;

.field final synthetic $localValue$delegate$inlined:Lcom/yuanqi/master/tools/x0;

.field final synthetic $selectedLanguage$delegate$inlined:Landroidx/compose/runtime/MutableState;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/util/Map;Landroidx/compose/runtime/MutableState;Landroid/content/Context;Lcom/yuanqi/master/tools/x0;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/master/addapp/home/j$b$a$e;->$items:Ljava/util/List;

    iput-object p2, p0, Lcom/yuanqi/master/addapp/home/j$b$a$e;->$languageMap$inlined:Ljava/util/Map;

    iput-object p3, p0, Lcom/yuanqi/master/addapp/home/j$b$a$e;->$selectedLanguage$delegate$inlined:Landroidx/compose/runtime/MutableState;

    iput-object p4, p0, Lcom/yuanqi/master/addapp/home/j$b$a$e;->$context$inlined:Landroid/content/Context;

    iput-object p5, p0, Lcom/yuanqi/master/addapp/home/j$b$a$e;->$localValue$delegate$inlined:Lcom/yuanqi/master/tools/x0;

    const/4 p1, 0x4

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/foundation/lazy/LazyItemScope;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/yuanqi/master/addapp/home/j$b$a$e;->invoke(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V
    .locals 7
    .param p1    # Landroidx/compose/foundation/lazy/LazyItemScope;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    and-int/lit8 v0, p4, 0xe

    if-nez v0, :cond_1

    invoke-interface {p3, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    const/4 p1, 0x2

    :goto_0
    or-int/2addr p1, p4

    goto :goto_1

    :cond_1
    move p1, p4

    :goto_1
    and-int/lit8 p4, p4, 0x70

    if-nez p4, :cond_3

    invoke-interface {p3, p2}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result p4

    if-eqz p4, :cond_2

    const/16 p4, 0x20

    goto :goto_2

    :cond_2
    const/16 p4, 0x10

    :goto_2
    or-int/2addr p1, p4

    :cond_3
    and-int/lit16 p4, p1, 0x2db

    const/16 v0, 0x92

    if-ne p4, v0, :cond_5

    .line 2
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result p4

    if-nez p4, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto/16 :goto_5

    :cond_5
    :goto_3
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p4

    if-eqz p4, :cond_6

    const/4 p4, -0x1

    const-string v0, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:148)"

    const v1, -0x25b7f321

    invoke-static {v1, p1, p4, v0}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_6
    iget-object p4, p0, Lcom/yuanqi/master/addapp/home/j$b$a$e;->$items:Ljava/util/List;

    invoke-interface {p4, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    and-int/lit8 p1, p1, 0xe

    check-cast p2, Ljava/lang/String;

    .line 3
    iget-object p4, p0, Lcom/yuanqi/master/addapp/home/j$b$a$e;->$selectedLanguage$delegate$inlined:Landroidx/compose/runtime/MutableState;

    invoke-static {p4}, Lcom/yuanqi/master/addapp/home/j;->g(Landroidx/compose/runtime/MutableState;)Ljava/util/Locale;

    move-result-object p4

    invoke-virtual {p4}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object p4

    const-string v0, "zh"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p4

    const/4 v0, 0x0

    if-eqz p4, :cond_8

    .line 4
    iget-object p4, p0, Lcom/yuanqi/master/addapp/home/j$b$a$e;->$selectedLanguage$delegate$inlined:Landroidx/compose/runtime/MutableState;

    invoke-static {p4}, Lcom/yuanqi/master/addapp/home/j;->g(Landroidx/compose/runtime/MutableState;)Ljava/util/Locale;

    move-result-object p4

    invoke-virtual {p4}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object p4

    iget-object v1, p0, Lcom/yuanqi/master/addapp/home/j$b$a$e;->$languageMap$inlined:Ljava/util/Map;

    invoke-interface {v1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Locale;

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v0

    :cond_7
    invoke-static {p4, v0}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p4

    goto :goto_4

    .line 5
    :cond_8
    iget-object p4, p0, Lcom/yuanqi/master/addapp/home/j$b$a$e;->$selectedLanguage$delegate$inlined:Landroidx/compose/runtime/MutableState;

    invoke-static {p4}, Lcom/yuanqi/master/addapp/home/j;->g(Landroidx/compose/runtime/MutableState;)Ljava/util/Locale;

    move-result-object p4

    invoke-virtual {p4}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object p4

    iget-object v1, p0, Lcom/yuanqi/master/addapp/home/j$b$a$e;->$languageMap$inlined:Ljava/util/Map;

    invoke-interface {v1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Locale;

    if-eqz v1, :cond_9

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    :cond_9
    invoke-static {p4, v0}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p4

    .line 6
    :goto_4
    new-instance v6, Lcom/yuanqi/master/addapp/home/j$b$a$a;

    iget-object v1, p0, Lcom/yuanqi/master/addapp/home/j$b$a$e;->$languageMap$inlined:Ljava/util/Map;

    iget-object v3, p0, Lcom/yuanqi/master/addapp/home/j$b$a$e;->$context$inlined:Landroid/content/Context;

    iget-object v4, p0, Lcom/yuanqi/master/addapp/home/j$b$a$e;->$selectedLanguage$delegate$inlined:Landroidx/compose/runtime/MutableState;

    iget-object v5, p0, Lcom/yuanqi/master/addapp/home/j$b$a$e;->$localValue$delegate$inlined:Lcom/yuanqi/master/tools/x0;

    move-object v0, v6

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Lcom/yuanqi/master/addapp/home/j$b$a$a;-><init>(Ljava/util/Map;Ljava/lang/String;Landroid/content/Context;Landroidx/compose/runtime/MutableState;Lcom/yuanqi/master/tools/x0;)V

    shr-int/lit8 p1, p1, 0x3

    and-int/lit8 p1, p1, 0xe

    invoke-static {p2, p4, v6, p3, p1}, Lcom/yuanqi/master/addapp/home/j;->f(Ljava/lang/String;ZLv3/a;Landroidx/compose/runtime/Composer;I)V

    .line 7
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_a

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_a
    :goto_5
    return-void
.end method
