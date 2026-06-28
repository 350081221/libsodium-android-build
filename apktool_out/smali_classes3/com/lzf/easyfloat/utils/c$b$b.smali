.class final Lcom/lzf/easyfloat/utils/c$b$b;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/lzf/easyfloat/utils/c$b;->invoke(Lcom/lzf/easyfloat/interfaces/a$a;)V
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
        "\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"
    }
    d2 = {
        "Lkotlin/r2;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/lzf/easyfloat/utils/c$b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/lzf/easyfloat/utils/c$b$b;

    invoke-direct {v0}, Lcom/lzf/easyfloat/utils/c$b$b;-><init>()V

    sput-object v0, Lcom/lzf/easyfloat/utils/c$b$b;->INSTANCE:Lcom/lzf/easyfloat/utils/c$b$b;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/lzf/easyfloat/utils/c$b$b;->invoke()V

    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    return-object v0
.end method

.method public final invoke()V
    .locals 1

    .line 2
    sget-object v0, Lcom/lzf/easyfloat/utils/c;->a:Lcom/lzf/easyfloat/utils/c;

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/lzf/easyfloat/utils/c;->b(Lcom/lzf/easyfloat/widget/BaseSwitchView;)V

    return-void
.end method
