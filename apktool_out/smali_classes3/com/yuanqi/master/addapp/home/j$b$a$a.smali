.class final Lcom/yuanqi/master/addapp/home/j$b$a$a;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/addapp/home/j$b$a;->invoke(Landroidx/compose/foundation/lazy/LazyListScope;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/a<",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
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


# instance fields
.field final synthetic $context:Landroid/content/Context;

.field final synthetic $it:Ljava/lang/String;

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
.method constructor <init>(Ljava/util/Map;Ljava/lang/String;Landroid/content/Context;Landroidx/compose/runtime/MutableState;Lcom/yuanqi/master/tools/x0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/Locale;",
            ">;",
            "Ljava/lang/String;",
            "Landroid/content/Context;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/Locale;",
            ">;",
            "Lcom/yuanqi/master/tools/x0<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/yuanqi/master/addapp/home/j$b$a$a;->$languageMap:Ljava/util/Map;

    iput-object p2, p0, Lcom/yuanqi/master/addapp/home/j$b$a$a;->$it:Ljava/lang/String;

    iput-object p3, p0, Lcom/yuanqi/master/addapp/home/j$b$a$a;->$context:Landroid/content/Context;

    iput-object p4, p0, Lcom/yuanqi/master/addapp/home/j$b$a$a;->$selectedLanguage$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p5, p0, Lcom/yuanqi/master/addapp/home/j$b$a$a;->$localValue$delegate:Lcom/yuanqi/master/tools/x0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/yuanqi/master/addapp/home/j$b$a$a;->invoke()V

    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    return-object v0
.end method

.method public final invoke()V
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/yuanqi/master/addapp/home/j$b$a$a;->$selectedLanguage$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v1, p0, Lcom/yuanqi/master/addapp/home/j$b$a$a;->$languageMap:Ljava/util/Map;

    iget-object v2, p0, Lcom/yuanqi/master/addapp/home/j$b$a$a;->$it:Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Locale;

    invoke-static {v0, v1}, Lcom/yuanqi/master/addapp/home/j;->h(Landroidx/compose/runtime/MutableState;Ljava/util/Locale;)V

    .line 3
    iget-object v0, p0, Lcom/yuanqi/master/addapp/home/j$b$a$a;->$localValue$delegate:Lcom/yuanqi/master/tools/x0;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/yuanqi/master/addapp/home/j$b$a$a;->$selectedLanguage$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v2}, Lcom/yuanqi/master/addapp/home/j;->g(Landroidx/compose/runtime/MutableState;)Ljava/util/Locale;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x26

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/yuanqi/master/addapp/home/j$b$a$a;->$selectedLanguage$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v2}, Lcom/yuanqi/master/addapp/home/j;->g(Landroidx/compose/runtime/MutableState;)Ljava/util/Locale;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/yuanqi/master/addapp/home/j;->i(Lcom/yuanqi/master/tools/x0;Ljava/lang/String;)V

    .line 4
    sget-object v0, Lcom/yuanqi/master/tools/q0;->a:Lcom/yuanqi/master/tools/q0$b;

    invoke-virtual {v0}, Lcom/yuanqi/master/tools/q0$b;->a()Lcom/yuanqi/master/tools/q0;

    move-result-object v0

    iget-object v1, p0, Lcom/yuanqi/master/addapp/home/j$b$a$a;->$context:Landroid/content/Context;

    iget-object v2, p0, Lcom/yuanqi/master/addapp/home/j$b$a$a;->$selectedLanguage$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v2}, Lcom/yuanqi/master/addapp/home/j;->g(Landroidx/compose/runtime/MutableState;)Ljava/util/Locale;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v2

    const-string v3, "getLanguage(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Lcom/yuanqi/master/tools/q0;->d(Landroid/content/Context;Ljava/lang/String;)V

    .line 5
    sget-object v0, Lcom/yuanqi/master/addapp/AddAppActivity;->e:Lcom/yuanqi/master/addapp/AddAppActivity$a;

    invoke-virtual {v0}, Lcom/yuanqi/master/addapp/AddAppActivity$a;->a()Lcom/yuanqi/master/addapp/AddAppActivity;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    const/4 v2, -0x1

    invoke-virtual {v1, v2}, Landroid/app/Activity;->setResult(I)V

    .line 6
    invoke-virtual {v0}, Lcom/yuanqi/master/addapp/AddAppActivity$a;->a()Lcom/yuanqi/master/addapp/AddAppActivity;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    return-void
.end method
