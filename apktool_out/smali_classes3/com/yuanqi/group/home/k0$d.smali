.class final Lcom/yuanqi/group/home/k0$d;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/group/home/k0;->j(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Lcom/yuanqi/master/config/e;",
        "Ljava/lang/CharSequence;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Lcom/yuanqi/master/config/SortApp;",
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


# static fields
.field public static final INSTANCE:Lcom/yuanqi/group/home/k0$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/yuanqi/group/home/k0$d;

    invoke-direct {v0}, Lcom/yuanqi/group/home/k0$d;-><init>()V

    sput-object v0, Lcom/yuanqi/group/home/k0$d;->INSTANCE:Lcom/yuanqi/group/home/k0$d;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Lcom/yuanqi/master/config/e;)Ljava/lang/CharSequence;
    .locals 1
    .param p1    # Lcom/yuanqi/master/config/e;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p1}, Lcom/yuanqi/master/config/e;->a()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/yuanqi/master/config/e;

    invoke-virtual {p0, p1}, Lcom/yuanqi/group/home/k0$d;->invoke(Lcom/yuanqi/master/config/e;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
