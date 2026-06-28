.class public final Lkotlin/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a2\u0010\u0006\u001a\u0002H\u0007\"\u0004\u0008\u0000\u0010\u0008\"\u0004\u0008\u0001\u0010\u0007*\u000e\u0012\u0004\u0012\u0002H\u0008\u0012\u0004\u0012\u0002H\u00070\t2\u0006\u0010\n\u001a\u0002H\u0008H\u0087\u0002\u00a2\u0006\u0002\u0010\u000b\"!\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00018\u0002X\u0083\u0004\u00f8\u0001\u0000\u00a2\u0006\n\n\u0002\u0010\u0005\u0012\u0004\u0008\u0003\u0010\u0004*r\u0008\u0002\u0010\u000c\"5\u0008\u0001\u0012\u000c\u0012\n\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u00030\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00020\r\u00a2\u0006\u0002\u0008\u001025\u0008\u0001\u0012\u000c\u0012\n\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u00030\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00020\r\u00a2\u0006\u0002\u0008\u0010\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0011"
    }
    d2 = {
        "UNDEFINED_RESULT",
        "Lkotlin/Result;",
        "",
        "getUNDEFINED_RESULT$annotations",
        "()V",
        "Ljava/lang/Object;",
        "invoke",
        "R",
        "T",
        "Lkotlin/DeepRecursiveFunction;",
        "value",
        "(Lkotlin/DeepRecursiveFunction;Ljava/lang/Object;)Ljava/lang/Object;",
        "DeepRecursiveFunctionBlock",
        "Lkotlin/Function3;",
        "Lkotlin/DeepRecursiveScope;",
        "Lkotlin/coroutines/Continuation;",
        "Lkotlin/ExtensionFunctionType;",
        "kotlin-stdlib"
    }
    k = 0x2
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Ljava/lang/Object;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lkotlin/d1;->Companion:Lkotlin/d1$a;

    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/d1;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sput-object v0, Lkotlin/h;->a:Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic a()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lkotlin/h;->a:Ljava/lang/Object;

    return-object v0
.end method

.method private static synthetic b()V
    .locals 0

    return-void
.end method

.method public static final c(Lkotlin/g;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p0    # Lkotlin/g;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/g<",
            "TT;TR;>;TT;)TR;"
        }
    .end annotation

    .annotation build Lkotlin/g1;
        version = "1.7"
    .end annotation

    .annotation build Lkotlin/v2;
        markerClass = {
            Lkotlin/r;
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lkotlin/j;

    .line 7
    .line 8
    invoke-virtual {p0}, Lkotlin/g;->a()Lv3/q;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-direct {v0, p0, p1}, Lkotlin/j;-><init>(Lv3/q;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lkotlin/j;->n()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
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
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method
