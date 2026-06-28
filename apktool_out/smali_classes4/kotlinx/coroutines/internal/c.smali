.class final Lkotlinx/coroutines/internal/c;
.super Lkotlinx/coroutines/internal/j;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0008\u0007*\u0001\u0008\u0008\u00c3\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ*\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005j\u0002`\u00062\u000e\u0010\u0004\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00030\u0002H\u0016R\u0014\u0010\u000b\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\n\u00a8\u0006\u000e"
    }
    d2 = {
        "Lkotlinx/coroutines/internal/c;",
        "Lkotlinx/coroutines/internal/j;",
        "Ljava/lang/Class;",
        "",
        "key",
        "Lkotlin/Function1;",
        "Lkotlinx/coroutines/internal/Ctor;",
        "a",
        "kotlinx/coroutines/internal/c$a",
        "b",
        "Lkotlinx/coroutines/internal/c$a;",
        "cache",
        "<init>",
        "()V",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lorg/codehaus/mojo/animal_sniffer/IgnoreJRERequirement;
.end annotation


# static fields
.field public static final a:Lkotlinx/coroutines/internal/c;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final b:Lkotlinx/coroutines/internal/c$a;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lkotlinx/coroutines/internal/c;

    .line 2
    .line 3
    invoke-direct {v0}, Lkotlinx/coroutines/internal/c;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lkotlinx/coroutines/internal/c;->a:Lkotlinx/coroutines/internal/c;

    .line 7
    .line 8
    new-instance v0, Lkotlinx/coroutines/internal/c$a;

    .line 9
    .line 10
    invoke-direct {v0}, Lkotlinx/coroutines/internal/c$a;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lkotlinx/coroutines/internal/c;->b:Lkotlinx/coroutines/internal/c$a;

    .line 14
    .line 15
    return-void
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
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lkotlinx/coroutines/internal/j;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Class;)Lv3/l;
    .locals 1
    .param p1    # Ljava/lang/Class;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Ljava/lang/Throwable;",
            ">;)",
            "Lv3/l<",
            "Ljava/lang/Throwable;",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Lkotlinx/coroutines/internal/c;->b:Lkotlinx/coroutines/internal/c$a;

    invoke-virtual {v0, p1}, Ljava/lang/ClassValue;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lv3/l;

    return-object p1
.end method
