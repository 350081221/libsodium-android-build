.class final Lcom/yuanqi/master/addapp/home/j$b$a;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/addapp/home/j$b;->invoke(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Landroidx/compose/foundation/lazy/LazyListScope;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n\u00a2\u0006\u0002\u0008\u0003"
    }
    d2 = {
        "<anonymous>",
        "",
        "Landroidx/compose/foundation/lazy/LazyListScope;",
        "invoke"
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
        "SMAP\nLanguageSwitchScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LanguageSwitchScreen.kt\ncom/yuanqi/master/addapp/home/LanguageSwitchScreenKt$LanguageSwitchScreen$2$1\n+ 2 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,176:1\n139#2,12:177\n*S KotlinDebug\n*F\n+ 1 LanguageSwitchScreen.kt\ncom/yuanqi/master/addapp/home/LanguageSwitchScreenKt$LanguageSwitchScreen$2$1\n*L\n119#1:177,12\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $context:Landroid/content/Context;

.field final synthetic $languageMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/Locale;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $localValue$delegate:Lcom/yuanqi/master/tools/x0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/yuanqi/master/tools/x0<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $selectedLanguage$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/Locale;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/util/Map;Landroidx/compose/runtime/MutableState;Landroid/content/Context;Lcom/yuanqi/master/tools/x0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/Locale;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/Locale;",
            ">;",
            "Landroid/content/Context;",
            "Lcom/yuanqi/master/tools/x0<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/yuanqi/master/addapp/home/j$b$a;->$languageMap:Ljava/util/Map;

    iput-object p2, p0, Lcom/yuanqi/master/addapp/home/j$b$a;->$selectedLanguage$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p3, p0, Lcom/yuanqi/master/addapp/home/j$b$a;->$context:Landroid/content/Context;

    iput-object p4, p0, Lcom/yuanqi/master/addapp/home/j$b$a;->$localValue$delegate:Lcom/yuanqi/master/tools/x0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/foundation/lazy/LazyListScope;

    invoke-virtual {p0, p1}, Lcom/yuanqi/master/addapp/home/j$b$a;->invoke(Landroidx/compose/foundation/lazy/LazyListScope;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/lazy/LazyListScope;)V
    .locals 9
    .param p1    # Landroidx/compose/foundation/lazy/LazyListScope;
        .annotation build Lp4/l;
        .end annotation
    .end param

    const-string v0, "$this$LazyColumn"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/yuanqi/master/addapp/home/j$b$a;->$languageMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lkotlin/collections/u;->S5(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, Lcom/yuanqi/master/addapp/home/j$b$a;->$languageMap:Ljava/util/Map;

    iget-object v4, p0, Lcom/yuanqi/master/addapp/home/j$b$a;->$selectedLanguage$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v5, p0, Lcom/yuanqi/master/addapp/home/j$b$a;->$context:Landroid/content/Context;

    iget-object v6, p0, Lcom/yuanqi/master/addapp/home/j$b$a;->$localValue$delegate:Lcom/yuanqi/master/tools/x0;

    .line 3
    sget-object v0, Lcom/yuanqi/master/addapp/home/j$b$a$b;->INSTANCE:Lcom/yuanqi/master/addapp/home/j$b$a$b;

    .line 4
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v7

    .line 5
    new-instance v8, Lcom/yuanqi/master/addapp/home/j$b$a$d;

    invoke-direct {v8, v0, v2}, Lcom/yuanqi/master/addapp/home/j$b$a$d;-><init>(Lv3/l;Ljava/util/List;)V

    .line 6
    new-instance v0, Lcom/yuanqi/master/addapp/home/j$b$a$e;

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/yuanqi/master/addapp/home/j$b$a$e;-><init>(Ljava/util/List;Ljava/util/Map;Landroidx/compose/runtime/MutableState;Landroid/content/Context;Lcom/yuanqi/master/tools/x0;)V

    const v1, -0x25b7f321

    const/4 v2, 0x1

    invoke-static {v1, v2, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    const/4 v1, 0x0

    .line 7
    invoke-interface {p1, v7, v1, v8, v0}, Landroidx/compose/foundation/lazy/LazyListScope;->items(ILv3/l;Lv3/l;Lv3/r;)V

    return-void
.end method
