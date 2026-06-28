.class final synthetic Lkotlinx/coroutines/channels/k$a;
.super Lkotlin/jvm/internal/h0;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlinx/coroutines/channels/k;->y()Lkotlin/reflect/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/h0;",
        "Lv3/p<",
        "Ljava/lang/Long;",
        "Lkotlinx/coroutines/channels/r<",
        "TE;>;",
        "Lkotlinx/coroutines/channels/r<",
        "TE;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lkotlinx/coroutines/channels/k$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkotlinx/coroutines/channels/k$a;

    invoke-direct {v0}, Lkotlinx/coroutines/channels/k$a;-><init>()V

    sput-object v0, Lkotlinx/coroutines/channels/k$a;->INSTANCE:Lkotlinx/coroutines/channels/k$a;

    return-void
.end method

.method constructor <init>()V
    .locals 6

    const/4 v1, 0x2

    const-class v2, Lkotlinx/coroutines/channels/k;

    const-string v3, "createSegment"

    const-string v4, "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;"

    const/4 v5, 0x1

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/h0;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    check-cast p2, Lkotlinx/coroutines/channels/r;

    invoke-virtual {p0, v0, v1, p2}, Lkotlinx/coroutines/channels/k$a;->invoke(JLkotlinx/coroutines/channels/r;)Lkotlinx/coroutines/channels/r;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(JLkotlinx/coroutines/channels/r;)Lkotlinx/coroutines/channels/r;
    .locals 0
    .param p3    # Lkotlinx/coroutines/channels/r;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lkotlinx/coroutines/channels/r<",
            "TE;>;)",
            "Lkotlinx/coroutines/channels/r<",
            "TE;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 2
    invoke-static {p1, p2, p3}, Lkotlinx/coroutines/channels/k;->c(JLkotlinx/coroutines/channels/r;)Lkotlinx/coroutines/channels/r;

    move-result-object p1

    return-object p1
.end method
